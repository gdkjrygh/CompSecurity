.class Lcom/google/inject/internal/DelegatingInvocationHandler;
.super Ljava/lang/Object;
.source "DelegatingInvocationHandler.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/reflect/InvocationHandler;"
    }
.end annotation


# instance fields
.field private delegate:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 23
    .local p0, "this":Lcom/google/inject/internal/DelegatingInvocationHandler;, "Lcom/google/inject/internal/DelegatingInvocationHandler<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDelegate()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 48
    .local p0, "this":Lcom/google/inject/internal/DelegatingInvocationHandler;, "Lcom/google/inject/internal/DelegatingInvocationHandler<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/DelegatingInvocationHandler;->delegate:Ljava/lang/Object;

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "proxy"    # Ljava/lang/Object;
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .param p3, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    .line 29
    .local p0, "this":Lcom/google/inject/internal/DelegatingInvocationHandler;, "Lcom/google/inject/internal/DelegatingInvocationHandler<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/DelegatingInvocationHandler;->delegate:Ljava/lang/Object;

    if-nez v1, :cond_0

    .line 30
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "This is a proxy used to support circular references involving constructors. The object we\'re proxying is not constructed yet. Please wait until after injection has completed to use this object."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 37
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/DelegatingInvocationHandler;->delegate:Ljava/lang/Object;

    invoke-virtual {p2, v1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v1

    return-object v1

    .line 38
    :catch_0
    move-exception v0

    .line 39
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 40
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v0

    .line 41
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 42
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :catch_2
    move-exception v0

    .line 43
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    throw v1
.end method

.method setDelegate(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 52
    .local p0, "this":Lcom/google/inject/internal/DelegatingInvocationHandler;, "Lcom/google/inject/internal/DelegatingInvocationHandler<TT;>;"
    .local p1, "delegate":Ljava/lang/Object;, "TT;"
    iput-object p1, p0, Lcom/google/inject/internal/DelegatingInvocationHandler;->delegate:Ljava/lang/Object;

    .line 53
    return-void
.end method
