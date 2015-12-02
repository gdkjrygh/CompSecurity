.class public Lcom/facebook/messages/ipc/f;
.super Lcom/facebook/inject/c;
.source "MessagesIpcModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 54
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 18
    const-class v0, Lcom/facebook/c/d;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/f;->e(Ljava/lang/Class;)V

    .line 20
    const-class v0, Lcom/facebook/messages/ipc/c;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/messages/ipc/h;

    invoke-direct {v1, v2}, Lcom/facebook/messages/ipc/h;-><init>(Lcom/facebook/messages/ipc/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 22
    const-class v0, Lcom/facebook/messages/ipc/e;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/messages/ipc/j;

    invoke-direct {v1, v2}, Lcom/facebook/messages/ipc/j;-><init>(Lcom/facebook/messages/ipc/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 25
    const-class v0, Lcom/facebook/messages/ipc/l;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/messages/ipc/i;

    invoke-direct {v1, v2}, Lcom/facebook/messages/ipc/i;-><init>(Lcom/facebook/messages/ipc/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 27
    return-void
.end method
