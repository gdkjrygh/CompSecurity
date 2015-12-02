.class Lcom/facebook/b/a/i;
.super Lcom/facebook/inject/d;
.source "ChatHeadsIpcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/b/a/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/b/a/h;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/b/a/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/b/a/b;
    .locals 5

    .prologue
    .line 38
    new-instance v3, Lcom/facebook/b/a/b;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/b/a/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/b/a/i;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v1, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/b/a/i;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v2}, Lcom/facebook/b/a/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/config/a/a;

    invoke-virtual {v2}, Lcom/facebook/config/a/a;->j()Lcom/facebook/base/j;

    move-result-object v2

    invoke-direct {v3, v0, v4, v1, v2}, Lcom/facebook/b/a/b;-><init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/i/a/a/f;Lcom/facebook/base/j;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 34
    invoke-virtual {p0}, Lcom/facebook/b/a/i;->a()Lcom/facebook/b/a/b;

    move-result-object v0

    return-object v0
.end method
