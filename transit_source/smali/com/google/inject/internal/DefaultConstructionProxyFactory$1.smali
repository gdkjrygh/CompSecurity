.class Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;
.super Ljava/lang/Object;
.source "DefaultConstructionProxyFactory.java"

# interfaces
.implements Lcom/google/inject/internal/ConstructionProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/DefaultConstructionProxyFactory;->create()Lcom/google/inject/internal/ConstructionProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/ConstructionProxy",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/internal/DefaultConstructionProxyFactory;

.field final synthetic val$constructor:Ljava/lang/reflect/Constructor;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/DefaultConstructionProxyFactory;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .prologue
    .line 82
    .local p0, "this":Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;, "Lcom/google/inject/internal/DefaultConstructionProxyFactory.1;"
    iput-object p1, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;->this$0:Lcom/google/inject/internal/DefaultConstructionProxyFactory;

    iput-object p2, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;->val$constructor:Ljava/lang/reflect/Constructor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConstructor()Ljava/lang/reflect/Constructor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 96
    .local p0, "this":Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;, "Lcom/google/inject/internal/DefaultConstructionProxyFactory.1;"
    iget-object v0, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;->val$constructor:Ljava/lang/reflect/Constructor;

    return-object v0
.end method

.method public getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;
    .locals 1

    .prologue
    .line 93
    .local p0, "this":Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;, "Lcom/google/inject/internal/DefaultConstructionProxyFactory.1;"
    iget-object v0, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;->this$0:Lcom/google/inject/internal/DefaultConstructionProxyFactory;

    # getter for: Lcom/google/inject/internal/DefaultConstructionProxyFactory;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;
    invoke-static {v0}, Lcom/google/inject/internal/DefaultConstructionProxyFactory;->access$000(Lcom/google/inject/internal/DefaultConstructionProxyFactory;)Lcom/google/inject/spi/InjectionPoint;

    move-result-object v0

    return-object v0
.end method

.method public varargs newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "arguments"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .prologue
    .line 85
    .local p0, "this":Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;, "Lcom/google/inject/internal/DefaultConstructionProxyFactory.1;"
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/DefaultConstructionProxyFactory$1;->val$constructor:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    return-object v1

    .line 86
    :catch_0
    move-exception v0

    .line 87
    .local v0, "e":Ljava/lang/InstantiationException;
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 88
    .end local v0    # "e":Ljava/lang/InstantiationException;
    :catch_1
    move-exception v0

    .line 89
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method
