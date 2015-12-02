.class public Lcom/qihoo/security/receiver/DaemonReceiver;
.super Lcom/qihoo/security/receiver/BootReceiver;
.source "360Security"


# instance fields
.field private final a:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/qihoo/security/receiver/BootReceiver;-><init>()V

    .line 58
    new-instance v0, Lcom/qihoo/security/receiver/DaemonReceiver$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/receiver/DaemonReceiver$1;-><init>(Lcom/qihoo/security/receiver/DaemonReceiver;)V

    iput-object v0, p0, Lcom/qihoo/security/receiver/DaemonReceiver;->a:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 85
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    .line 89
    if-eqz v0, :cond_0

    .line 91
    const/16 v0, 0x7149

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 93
    invoke-static {}, Lcom/qihoo/security/support/b;->b()V

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/receiver/DaemonReceiver;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 96
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/receiver/DaemonReceiver;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/qihoo/security/receiver/DaemonReceiver;->a()V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/receiver/DaemonReceiver;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/receiver/DaemonReceiver;->a:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 34
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/receiver/BootReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 35
    if-nez p2, :cond_1

    .line 56
    :cond_0
    :goto_0
    return-void

    .line 38
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 39
    const-string/jumbo v1, "com.qihoo.security.action.DAEMON"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/b/a;->f(Landroid/content/Context;)V

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/receiver/DaemonReceiver;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/receiver/DaemonReceiver;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 53
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 54
    iget-object v1, p0, Lcom/qihoo/security/receiver/DaemonReceiver;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method
