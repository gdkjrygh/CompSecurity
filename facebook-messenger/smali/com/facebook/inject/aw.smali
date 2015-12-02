.class final Lcom/facebook/inject/aw;
.super Ljava/lang/ThreadLocal;
.source "ScopeStack.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal",
        "<",
        "Lcom/facebook/inject/av;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Lcom/facebook/inject/av;
    .locals 2

    .prologue
    .line 25
    new-instance v0, Lcom/facebook/inject/av;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/inject/av;-><init>(Lcom/facebook/inject/aw;)V

    return-object v0
.end method

.method protected synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/facebook/inject/aw;->a()Lcom/facebook/inject/av;

    move-result-object v0

    return-object v0
.end method
