.class Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;
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

.field final synthetic val$overridesScopeAnnotations:Ljava/util/Set;

.field final synthetic val$scopeInstancesInUse:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;Lcom/google/inject/Binder;Ljava/util/Set;Ljava/util/Map;)V
    .locals 0
    .param p2, "x0"    # Lcom/google/inject/Binder;

    .prologue
    .line 255
    iput-object p1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->this$1:Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;

    iput-object p3, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->val$overridesScopeAnnotations:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->val$scopeInstancesInUse:Ljava/util/Map;

    invoke-direct {p0, p2}, Lcom/google/inject/util/Modules$ModuleWriter;-><init>(Lcom/google/inject/Binder;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ScopeBinding;

    .prologue
    .line 255
    invoke-virtual {p0, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Void;
    .locals 6
    .param p1, "scopeBinding"    # Lcom/google/inject/spi/ScopeBinding;

    .prologue
    .line 257
    iget-object v1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->val$overridesScopeAnnotations:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/google/inject/spi/ScopeBinding;->getAnnotationType()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 258
    invoke-super {p0, p1}, Lcom/google/inject/util/Modules$ModuleWriter;->visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Object;

    .line 267
    :cond_0
    :goto_0
    const/4 v1, 0x0

    return-object v1

    .line 260
    :cond_1
    iget-object v1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->val$scopeInstancesInUse:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/inject/spi/ScopeBinding;->getScope()Lcom/google/inject/Scope;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 261
    .local v0, "source":Ljava/lang/Object;
    if-eqz v0, :cond_0

    .line 262
    iget-object v1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->binder:Lcom/google/inject/Binder;

    invoke-interface {v1, v0}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v1

    const-string v2, "The scope for @%s is bound directly and cannot be overridden."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/google/inject/spi/ScopeBinding;->getAnnotationType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-interface {v1, v2, v3}, Lcom/google/inject/Binder;->addError(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
