.class public Lcom/facebook/orca/notify/e;
.super Lcom/facebook/orca/notify/a;
.source "DashMessagingNotificationHandler.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/messages/ipc/e;

.field private final c:Lcom/facebook/messages/ipc/c;

.field private final d:Lcom/facebook/messages/ipc/k;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/i/a/a/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/messages/ipc/e;Lcom/facebook/messages/ipc/c;Lcom/facebook/messages/ipc/k;Ljavax/inject/a;Lcom/facebook/i/a/a/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/messages/ipc/e;",
            "Lcom/facebook/messages/ipc/c;",
            "Lcom/facebook/messages/ipc/k;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/i/a/a/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/orca/notify/a;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/orca/notify/e;->a:Landroid/content/Context;

    .line 47
    iput-object p2, p0, Lcom/facebook/orca/notify/e;->b:Lcom/facebook/messages/ipc/e;

    .line 48
    iput-object p3, p0, Lcom/facebook/orca/notify/e;->c:Lcom/facebook/messages/ipc/c;

    .line 49
    iput-object p4, p0, Lcom/facebook/orca/notify/e;->d:Lcom/facebook/messages/ipc/k;

    .line 50
    iput-object p5, p0, Lcom/facebook/orca/notify/e;->e:Ljavax/inject/a;

    .line 51
    iput-object p6, p0, Lcom/facebook/orca/notify/e;->f:Lcom/facebook/i/a/a/f;

    .line 52
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)Landroid/app/PendingIntent;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/notify/e;->d:Lcom/facebook/messages/ipc/k;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/messages/ipc/k;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 81
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 82
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 83
    const-string v0, "from_notification"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 84
    const-string v0, "trigger"

    const-string v2, "notification"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/notify/e;->a:Landroid/content/Context;

    invoke-static {v0, v3, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 109
    iget-object v1, p0, Lcom/facebook/orca/notify/e;->b:Lcom/facebook/messages/ipc/e;

    iget-object v0, p0, Lcom/facebook/orca/notify/e;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/facebook/messages/ipc/e;->a(Ljava/lang/String;)V

    .line 110
    return-void
.end method

.method protected a(Lcom/facebook/orca/notify/ap;)V
    .locals 3

    .prologue
    .line 56
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 58
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/facebook/orca/notify/e;->f:Lcom/facebook/i/a/a/f;

    invoke-static {v0}, Lcom/facebook/messages/ipc/peer/d;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 61
    if-nez v0, :cond_0

    .line 62
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/c;->b(Z)V

    .line 65
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 114
    iget-object v1, p0, Lcom/facebook/orca/notify/e;->b:Lcom/facebook/messages/ipc/e;

    iget-object v0, p0, Lcom/facebook/orca/notify/e;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/messages/ipc/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/ap;)V
    .locals 3

    .prologue
    .line 69
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    :goto_0
    return-void

    .line 72
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 73
    iget-object v1, p0, Lcom/facebook/orca/notify/e;->c:Lcom/facebook/messages/ipc/c;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/e;->a(Lcom/facebook/messages/model/threads/Message;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/messages/ipc/c;->a(Lcom/facebook/messages/model/threads/Message;Landroid/app/PendingIntent;)Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    move-result-object v1

    .line 76
    iget-object v2, p0, Lcom/facebook/orca/notify/e;->b:Lcom/facebook/messages/ipc/e;

    iget-object v0, p0, Lcom/facebook/orca/notify/e;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/messages/ipc/e;->a(Lcom/facebook/messages/ipc/FrozenNewMessageNotification;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected b(Lcom/facebook/orca/notify/bi;)V
    .locals 2

    .prologue
    .line 102
    invoke-virtual {p1}, Lcom/facebook/orca/notify/bi;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 103
    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/e;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 105
    :cond_0
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/i;)V
    .locals 0

    .prologue
    .line 98
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/w;)V
    .locals 0

    .prologue
    .line 90
    return-void
.end method

.method protected b(Lcom/facebook/orca/push/a;)V
    .locals 0

    .prologue
    .line 94
    return-void
.end method
