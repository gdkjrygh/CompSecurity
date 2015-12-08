.class final Lcom/google/inject/internal/DefaultConstructionProxyFactory;
.super Ljava/lang/Object;
.source "DefaultConstructionProxyFactory.java"

# interfaces
.implements Lcom/google/inject/internal/ConstructionProxyFactory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/ConstructionProxyFactory",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final injectionPoint:Lcom/google/inject/spi/InjectionPoint;


# direct methods
.method constructor <init>(Lcom/google/inject/spi/InjectionPoint;)V
    .locals 0
    .param p1, "injectionPoint"    # Lcom/google/inject/spi/InjectionPoint;

    .prologue
    .line 40
    .local p0, "this":Lcom/google/inject/internal/DefaultConstructionProxyFactory;, "Lcom/google/inject/internal/DefaultConstructionProxyFactory<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    .line 42
    return-void
.end method

.method static synthetic access$000(Lcom/google/inject/internal/DefaultConstructionProxyFactory;)Lcom/google/inject/spi/InjectionPoint;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/DefaultConstructionProxyFactory;

    .prologue
    .line 33
    iget-object v0, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    return-object v0
.end method


# virtual methods
.method public create()Lcom/google/inject/internal/ConstructionProxy;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/ConstructionProxy",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/inject/internal/DefaultConstructionProxyFactory;, "Lcom/google/inject/internal/DefaultConstructionProxyFactory<TT;>;"
    const/4 v3, 0x1

    .line 46
    iget-object v2, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {v2}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 49
    .local v1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 50
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    .line 75
    .local v0, "classToConstruct":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 76
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 82
    .end local v0    # "classToConstruct":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    :cond_0
    :goto_0
    new-instance v2, Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;

    invoke-direct {v2, p0, v1}, Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;-><init>(Lcom/google/inject/internal/DefaultConstructionProxyFactory;Ljava/lang/reflect/Constructor;)V

    return-object v2

    .line 79
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    goto :goto_0
.end method
