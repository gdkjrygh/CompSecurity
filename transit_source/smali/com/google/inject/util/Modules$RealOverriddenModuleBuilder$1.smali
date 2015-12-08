.class Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;
.super Lcom/google/inject/AbstractModule;
.source "Modules.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;->with(Ljava/lang/Iterable;)Lcom/google/inject/Module;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;

.field final synthetic val$overrides:Ljava/lang/Iterable;


# direct methods
.method constructor <init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;Ljava/lang/Iterable;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->this$0:Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;

    iput-object p2, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->val$overrides:Ljava/lang/Iterable;

    invoke-direct {p0}, Lcom/google/inject/AbstractModule;-><init>()V

    return-void
.end method

.method static synthetic access$200(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;Lcom/google/inject/Binding;)Lcom/google/inject/Scope;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;
    .param p1, "x1"    # Lcom/google/inject/Binding;

    .prologue
    .line 148
    invoke-direct {p0, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->getScopeInstanceOrNull(Lcom/google/inject/Binding;)Lcom/google/inject/Scope;

    move-result-object v0

    return-object v0
.end method

.method private getScopeInstanceOrNull(Lcom/google/inject/Binding;)Lcom/google/inject/Scope;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Binding",
            "<*>;)",
            "Lcom/google/inject/Scope;"
        }
    .end annotation

    .prologue
    .line 275
    .local p1, "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<*>;"
    new-instance v0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$4;

    invoke-direct {v0, p0}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$4;-><init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;)V

    invoke-interface {p1, v0}, Lcom/google/inject/Binding;->acceptScopingVisitor(Lcom/google/inject/spi/BindingScopingVisitor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Scope;

    return-object v0
.end method


# virtual methods
.method public configure()V
    .locals 17

    .prologue
    .line 151
    invoke-virtual/range {p0 .. p0}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->binder()Lcom/google/inject/Binder;

    move-result-object v7

    .line 152
    .local v7, "baseBinder":Lcom/google/inject/Binder;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->this$0:Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;

    # getter for: Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;->baseModules:Lcom/google/inject/internal/util/$ImmutableSet;
    invoke-static {v1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;->access$100(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/spi/Elements;->getElements(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    .line 157
    .local v8, "baseElements":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Element;>;"
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 158
    invoke-static {v8}, Lcom/google/inject/internal/util/$Iterables;->getOnlyElement(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/inject/spi/Element;

    .line 159
    .local v9, "element":Lcom/google/inject/spi/Element;
    instance-of v1, v9, Lcom/google/inject/spi/PrivateElements;

    if-eqz v1, :cond_1

    move-object/from16 v16, v9

    .line 160
    check-cast v16, Lcom/google/inject/spi/PrivateElements;

    .line 161
    .local v16, "privateElements":Lcom/google/inject/spi/PrivateElements;
    invoke-interface {v7}, Lcom/google/inject/Binder;->newPrivateBinder()Lcom/google/inject/PrivateBinder;

    move-result-object v1

    invoke-interface/range {v16 .. v16}, Lcom/google/inject/spi/PrivateElements;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/inject/PrivateBinder;->withSource(Ljava/lang/Object;)Lcom/google/inject/PrivateBinder;

    move-result-object v15

    .line 162
    .local v15, "privateBinder":Lcom/google/inject/PrivateBinder;
    invoke-interface/range {v16 .. v16}, Lcom/google/inject/spi/PrivateElements;->getExposedKeys()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .local v12, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/inject/Key;

    .line 163
    .local v11, "exposed":Lcom/google/inject/Key;
    move-object/from16 v0, v16

    invoke-interface {v0, v11}, Lcom/google/inject/spi/PrivateElements;->getExposedSource(Lcom/google/inject/Key;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v15, v1}, Lcom/google/inject/PrivateBinder;->withSource(Ljava/lang/Object;)Lcom/google/inject/PrivateBinder;

    move-result-object v1

    invoke-interface {v1, v11}, Lcom/google/inject/PrivateBinder;->expose(Lcom/google/inject/Key;)V

    goto :goto_0

    .line 165
    .end local v11    # "exposed":Lcom/google/inject/Key;
    :cond_0
    move-object v7, v15

    .line 166
    invoke-interface/range {v16 .. v16}, Lcom/google/inject/spi/PrivateElements;->getElements()Ljava/util/List;

    move-result-object v8

    .line 170
    .end local v9    # "element":Lcom/google/inject/spi/Element;
    .end local v12    # "i$":Ljava/util/Iterator;
    .end local v15    # "privateBinder":Lcom/google/inject/PrivateBinder;
    .end local v16    # "privateElements":Lcom/google/inject/spi/PrivateElements;
    :cond_1
    move-object v3, v7

    .line 171
    .local v3, "binder":Lcom/google/inject/Binder;
    new-instance v10, Ljava/util/LinkedHashSet;

    invoke-direct {v10, v8}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 172
    .local v10, "elements":Ljava/util/LinkedHashSet;, "Ljava/util/LinkedHashSet<Lcom/google/inject/spi/Element;>;"
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;->val$overrides:Ljava/lang/Iterable;

    invoke-static {v1}, Lcom/google/inject/spi/Elements;->getElements(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v13

    .line 174
    .local v13, "overrideElements":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Element;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$Sets;->newHashSet()Ljava/util/HashSet;

    move-result-object v4

    .line 175
    .local v4, "overriddenKeys":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/Key<*>;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$Sets;->newHashSet()Ljava/util/HashSet;

    move-result-object v14

    .line 178
    .local v14, "overridesScopeAnnotations":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;>;"
    new-instance v1, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$1;

    move-object/from16 v0, p0

    invoke-direct {v1, v0, v3, v4, v14}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$1;-><init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;Lcom/google/inject/Binder;Ljava/util/Set;Ljava/util/Set;)V

    invoke-virtual {v1, v13}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$1;->writeAll(Ljava/lang/Iterable;)V

    .line 198
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newHashMap()Ljava/util/HashMap;

    move-result-object v5

    .line 199
    .local v5, "scopeInstancesInUse":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Scope;Ljava/lang/Object;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v6

    .line 200
    .local v6, "scopeBindings":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/ScopeBinding;>;"
    new-instance v1, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;-><init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;Lcom/google/inject/Binder;Ljava/util/Set;Ljava/util/Map;Ljava/util/List;)V

    invoke-virtual {v1, v10}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2;->writeAll(Ljava/lang/Iterable;)V

    .line 255
    new-instance v1, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;

    move-object/from16 v0, p0

    invoke-direct {v1, v0, v3, v14, v5}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;-><init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;Lcom/google/inject/Binder;Ljava/util/Set;Ljava/util/Map;)V

    invoke-virtual {v1, v6}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1$3;->writeAll(Ljava/lang/Iterable;)V

    .line 272
    return-void
.end method
