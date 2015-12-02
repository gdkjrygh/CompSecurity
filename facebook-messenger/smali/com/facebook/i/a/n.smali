.class public Lcom/facebook/i/a/n;
.super Lcom/facebook/inject/c;
.source "PeerProcessManagerModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 30
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 25
    const-class v0, Lcom/facebook/i/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/i/a/n;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/i/a/p;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/i/a/p;-><init>(Lcom/facebook/i/a/o;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 28
    return-void
.end method
