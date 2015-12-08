.class Lcom/google/inject/internal/InjectorImpl$BindingsMultimap;
.super Ljava/lang/Object;
.source "InjectorImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BindingsMultimap"
.end annotation


# instance fields
.field final multimap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/Binding",
            "<*>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 877
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 878
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newHashMap()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InjectorImpl$BindingsMultimap;->multimap:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/internal/InjectorImpl$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/internal/InjectorImpl$1;

    .prologue
    .line 877
    invoke-direct {p0}, Lcom/google/inject/internal/InjectorImpl$BindingsMultimap;-><init>()V

    return-void
.end method


# virtual methods
.method getAll(Lcom/google/inject/TypeLiteral;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/Binding",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 892
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/InjectorImpl$BindingsMultimap;->multimap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 893
    .local v0, "bindings":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/Binding<*>;>;"
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/inject/internal/InjectorImpl$BindingsMultimap;->multimap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v1

    goto :goto_0
.end method

.method put(Lcom/google/inject/TypeLiteral;Lcom/google/inject/Binding;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;",
            "Lcom/google/inject/Binding",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 881
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    .local p2, "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/InjectorImpl$BindingsMultimap;->multimap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 882
    .local v0, "bindingsForType":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/Binding<*>;>;"
    if-nez v0, :cond_0

    .line 883
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    .line 884
    iget-object v1, p0, Lcom/google/inject/internal/InjectorImpl$BindingsMultimap;->multimap:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 887
    return-void
.end method
