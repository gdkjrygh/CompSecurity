.class public Lcom/facebook/b/a/g;
.super Lcom/facebook/inject/c;
.source "ChatHeadsIpcModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 47
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 21
    const-class v0, Lcom/facebook/messages/ipc/peer/f;

    invoke-virtual {p0, v0}, Lcom/facebook/b/a/g;->e(Ljava/lang/Class;)V

    .line 23
    const-class v0, Lcom/facebook/b/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/b/a/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/b/a/i;

    invoke-direct {v1, v2}, Lcom/facebook/b/a/i;-><init>(Lcom/facebook/b/a/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 27
    const-class v0, Lcom/facebook/b/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/b/a/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/b/a/j;

    invoke-direct {v1, v2}, Lcom/facebook/b/a/j;-><init>(Lcom/facebook/b/a/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 30
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/b/a/g;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/b/a/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 32
    return-void
.end method
