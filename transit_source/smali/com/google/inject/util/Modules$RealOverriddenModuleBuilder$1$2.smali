.class Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;
.super Lcom/google/inject/util/Modules$ModuleWriter;
.source "Modules.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->configure()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;

.field final synthetic val$overriddenKeys:Ljava/util/Set;

.field final synthetic val$scopeBindings:Ljava/util/List;

.field final synthetic val$scopeInstancesInUse:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;Lcom/google/inject/Binder;Ljava/util/Set;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .param p2, "x0"    # Lcom/google/inject/Binder;

    .prologue
    .line 200
    iput-object p1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->this$1:Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;

    iput-object p3, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->val$overriddenKeys:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->val$scopeInstancesInUse:Ljava/util/Map;

    iput-object p5, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->val$scopeBindings:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/google/inject/util/Modules$ModuleWriter;-><init>(Lcom/google/inject/Binder;)V

    return-void
.end method


# virtual methods
.method rewrite(Lcom/google/inject/Binder;Lcom/google/inject/spi/PrivateElements;Ljava/util/Set;)V
    .locals 6
    .param p1, "binder"    # Lcom/google/inject/Binder;
    .param p2, "privateElements"    # Lcom/google/inject/spi/PrivateElements;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Binder;",
            "Lcom/google/inject/spi/PrivateElements;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/Key",
            "<*>;>;)V"
        }
    .end annotation

    .prologue
    .line 216
    .local p3, "keysToSkip":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/Key<*>;>;"
    invoke-interface {p2}, Lcom/google/inject/spi/PrivateElements;->getSource()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p1, v5}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/inject/Binder;->newPrivateBinder()Lcom/google/inject/PrivateBinder;

    move-result-object v3

    .line 219
    .local v3, "privateBinder":Lcom/google/inject/PrivateBinder;
    invoke-static {}, Lcom/google/inject/internal/util/$Sets;->newHashSet()Ljava/util/HashSet;

    move-result-object v4

    .line 221
    .local v4, "skippedExposes":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/Key<*>;>;"
    invoke-interface {p2}, Lcom/google/inject/spi/PrivateElements;->getExposedKeys()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/Key;

    .line 222
    .local v2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    invoke-interface {p3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 223
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 225
    :cond_0
    invoke-interface {p2, v2}, Lcom/google/inject/spi/PrivateElements;->getExposedSource(Lcom/google/inject/Key;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Lcom/google/inject/PrivateBinder;->withSource(Ljava/lang/Object;)Lcom/google/inject/PrivateBinder;

    move-result-object v5

    invoke-interface {v5, v2}, Lcom/google/inject/PrivateBinder;->expose(Lcom/google/inject/Key;)V

    goto :goto_0

    .line 229
    .end local v2    # "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    :cond_1
    invoke-interface {p2}, Lcom/google/inject/spi/PrivateElements;->getElements()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/spi/Element;

    .line 230
    .local v0, "element":Lcom/google/inject/spi/Element;
    instance-of v5, v0, Lcom/google/inject/Binding;

    if-eqz v5, :cond_3

    move-object v5, v0

    check-cast v5, Lcom/google/inject/Binding;

    invoke-interface {v5}, Lcom/google/inject/Binding;->getKey()Lcom/google/inject/Key;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 234
    :cond_3
    instance-of v5, v0, Lcom/google/inject/spi/PrivateElements;

    if-eqz v5, :cond_4

    .line 235
    check-cast v0, Lcom/google/inject/spi/PrivateElements;

    .end local v0    # "element":Lcom/google/inject/spi/Element;
    invoke-virtual {p0, v3, v0, v4}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->rewrite(Lcom/google/inject/Binder;Lcom/google/inject/spi/PrivateElements;Ljava/util/Set;)V

    goto :goto_1

    .line 238
    .restart local v0    # "element":Lcom/google/inject/spi/Element;
    :cond_4
    invoke-interface {v0, v3}, Lcom/google/inject/spi/Element;->applyTo(Lcom/google/inject/Binder;)V

    goto :goto_1

    .line 240
    .end local v0    # "element":Lcom/google/inject/spi/Element;
    :cond_5
    return-void
.end method

.method public bridge synthetic visit(Lcom/google/inject/Binding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/Binding;

    .prologue
    .line 200
    invoke-virtual {p0, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->visit(Lcom/google/inject/Binding;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/PrivateElements;

    .prologue
    .line 200
    invoke-virtual {p0, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ScopeBinding;

    .prologue
    .line 200
    invoke-virtual {p0, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/Binding;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Binding",
            "<TT;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .prologue
    .line 202
    .local p1, "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    iget-object v1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->val$overriddenKeys:Ljava/util/Set;

    invoke-interface {p1}, Lcom/google/inject/Binding;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 203
    invoke-super {p0, p1}, Lcom/google/inject/util/Modules$ModuleWriter;->visit(Lcom/google/inject/Binding;)Ljava/lang/Object;

    .line 206
    iget-object v1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->this$1:Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;

    # invokes: Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->getScopeInstanceOrNull(Lcom/google/inject/Binding;)Lcom/google/inject/Scope;
    invoke-static {v1, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->access$200(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;Lcom/google/inject/Binding;)Lcom/google/inject/Scope;

    move-result-object v0

    .line 207
    .local v0, "scope":Lcom/google/inject/Scope;
    if-eqz v0, :cond_0

    .line 208
    iget-object v1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->val$scopeInstancesInUse:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/inject/Binding;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .end local v0    # "scope":Lcom/google/inject/Scope;
    :cond_0
    const/4 v1, 0x0

    return-object v1
.end method

.method public visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Void;
    .locals 2
    .param p1, "privateElements"    # Lcom/google/inject/spi/PrivateElements;

    .prologue
    .line 243
    iget-object v0, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->binder:Lcom/google/inject/Binder;

    iget-object v1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->val$overriddenKeys:Ljava/util/Set;

    invoke-virtual {p0, v0, p1, v1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->rewrite(Lcom/google/inject/Binder;Lcom/google/inject/spi/PrivateElements;Ljava/util/Set;)V

    .line 244
    const/4 v0, 0x0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Void;
    .locals 1
    .param p1, "scopeBinding"    # Lcom/google/inject/spi/ScopeBinding;

    .prologue
    .line 248
    iget-object v0, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->val$scopeBindings:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    const/4 v0, 0x0

    return-object v0
.end method
