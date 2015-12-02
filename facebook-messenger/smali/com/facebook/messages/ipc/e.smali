.class public Lcom/facebook/messages/ipc/e;
.super Ljava/lang/Object;
.source "MessagesCrossProcessContract.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/base/j;Lcom/facebook/c/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/base/j;",
            "Lcom/facebook/c/l;",
            ")V"
        }
    .end annotation

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/facebook/messages/ipc/e;->a:Landroid/content/Context;

    .line 57
    iput-object p2, p0, Lcom/facebook/messages/ipc/e;->b:Ljavax/inject/a;

    .line 58
    invoke-virtual {p3}, Lcom/facebook/base/j;->getPermission()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/ipc/e;->c:Ljava/lang/String;

    .line 60
    const-string v0, "messages.ACTION_NEW_MESSAGE"

    invoke-virtual {p4, v0}, Lcom/facebook/c/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/ipc/e;->d:Ljava/lang/String;

    .line 62
    const-string v0, "messages.ACTION_CLEAR_ALL_MESSAGES"

    invoke-virtual {p4, v0}, Lcom/facebook/c/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/ipc/e;->e:Ljava/lang/String;

    .line 64
    const-string v0, "messages.ACTION_CLEAR_MESSAGE"

    invoke-virtual {p4, v0}, Lcom/facebook/c/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/ipc/e;->f:Ljava/lang/String;

    .line 66
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/ipc/FrozenNewMessageNotification;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 128
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/messages/ipc/e;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 129
    const-string v1, "message"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 130
    const-string v1, "userId"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    iget-object v1, p0, Lcom/facebook/messages/ipc/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/messages/ipc/e;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 132
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 140
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/messages/ipc/e;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 141
    const-string v1, "userId"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    iget-object v1, p0, Lcom/facebook/messages/ipc/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/messages/ipc/e;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 143
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 152
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/messages/ipc/e;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 153
    const-string v1, "threadId"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    const-string v1, "userId"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 155
    iget-object v1, p0, Lcom/facebook/messages/ipc/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/messages/ipc/e;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 156
    return-void
.end method
