.class Lcom/facebook/inject/bf;
.super Ljava/lang/ThreadLocal;
.source "ThreadLocalProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal",
        "<",
        "Lcom/facebook/inject/bg",
        "<TT;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/inject/be;


# direct methods
.method constructor <init>(Lcom/facebook/inject/be;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/inject/bf;->a:Lcom/facebook/inject/be;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Lcom/facebook/inject/bg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/inject/bg",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 31
    new-instance v0, Lcom/facebook/inject/bg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/inject/bg;-><init>(Lcom/facebook/inject/bf;)V

    return-object v0
.end method

.method protected synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/facebook/inject/bf;->a()Lcom/facebook/inject/bg;

    move-result-object v0

    return-object v0
.end method
