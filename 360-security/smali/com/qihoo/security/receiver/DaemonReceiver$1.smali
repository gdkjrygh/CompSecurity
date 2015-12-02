.class Lcom/qihoo/security/receiver/DaemonReceiver$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/receiver/DaemonReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/receiver/DaemonReceiver;


# direct methods
.method constructor <init>(Lcom/qihoo/security/receiver/DaemonReceiver;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/qihoo/security/receiver/DaemonReceiver$1;->a:Lcom/qihoo/security/receiver/DaemonReceiver;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 61
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 81
    :cond_0
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 67
    invoke-static {}, Lcom/qihoo/security/app/DaemonMain;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/receiver/DaemonReceiver$1;->a:Lcom/qihoo/security/receiver/DaemonReceiver;

    invoke-static {v0}, Lcom/qihoo/security/receiver/DaemonReceiver;->a(Lcom/qihoo/security/receiver/DaemonReceiver;)V

    goto :goto_0

    .line 72
    :cond_1
    if-lez v0, :cond_0

    .line 73
    iget-object v1, p0, Lcom/qihoo/security/receiver/DaemonReceiver$1;->a:Lcom/qihoo/security/receiver/DaemonReceiver;

    invoke-static {v1}, Lcom/qihoo/security/receiver/DaemonReceiver;->b(Lcom/qihoo/security/receiver/DaemonReceiver;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 74
    add-int/lit8 v0, v0, -0x1

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/receiver/DaemonReceiver$1;->a:Lcom/qihoo/security/receiver/DaemonReceiver;

    invoke-static {v0}, Lcom/qihoo/security/receiver/DaemonReceiver;->b(Lcom/qihoo/security/receiver/DaemonReceiver;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 61
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
