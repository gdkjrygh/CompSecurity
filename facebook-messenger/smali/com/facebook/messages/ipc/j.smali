.class Lcom/facebook/messages/ipc/j;
.super Lcom/facebook/inject/d;
.source "MessagesIpcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/messages/ipc/e;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/messages/ipc/g;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/facebook/messages/ipc/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/ipc/e;
    .locals 5

    .prologue
    .line 45
    new-instance v2, Lcom/facebook/messages/ipc/e;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Ljava/lang/String;

    const-class v3, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/messages/ipc/j;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v1, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v1}, Lcom/facebook/messages/ipc/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->j()Lcom/facebook/base/j;

    move-result-object v4

    const-class v1, Lcom/facebook/c/l;

    invoke-virtual {p0, v1}, Lcom/facebook/messages/ipc/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/l;

    invoke-direct {v2, v0, v3, v4, v1}, Lcom/facebook/messages/ipc/e;-><init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/base/j;Lcom/facebook/c/l;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/j;->a()Lcom/facebook/messages/ipc/e;

    move-result-object v0

    return-object v0
.end method
