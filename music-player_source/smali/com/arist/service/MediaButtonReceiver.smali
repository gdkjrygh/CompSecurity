.class public Lcom/arist/service/MediaButtonReceiver;
.super Landroid/content/BroadcastReceiver;


# static fields
.field private static a:Lcom/arist/service/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    const-wide/16 v8, 0x190

    const/4 v6, 0x1

    const/4 v5, 0x0

    new-instance v0, Lcom/arist/c/f;

    invoke-direct {v0, p1}, Lcom/arist/c/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/arist/c/f;->k()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p2, :cond_0

    const-string v0, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/view/KeyEvent;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :cond_2
    :goto_1
    const-string v2, "MediaButtonReceiver"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "action : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_4

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/arist/service/MediaButtonReceiver;->isOrderedBroadcast()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/arist/service/MediaButtonReceiver;->abortBroadcast()V

    goto :goto_0

    :pswitch_0
    sget-object v1, Lcom/arist/c/a;->g:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    sget-object v1, Lcom/arist/c/a;->f:Ljava/lang/String;

    goto :goto_1

    :cond_4
    sget-object v1, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    if-nez v1, :cond_5

    new-instance v1, Lcom/arist/service/d;

    invoke-direct {v1, p0, p1}, Lcom/arist/service/d;-><init>(Lcom/arist/service/MediaButtonReceiver;Landroid/content/Context;)V

    sput-object v1, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    :cond_5
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    invoke-virtual {v0, v6}, Lcom/arist/service/d;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "MediaButtonReceiver"

    const-string v1, "event : ACTION_DOWN1"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    invoke-virtual {v0, v6}, Lcom/arist/service/d;->removeMessages(I)V

    sget-object v0, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/arist/service/d;->sendEmptyMessage(I)Z

    goto :goto_2

    :cond_6
    sget-object v0, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    invoke-virtual {v0, v5}, Lcom/arist/service/d;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "MediaButtonReceiver"

    const-string v1, "event : ACTION_DOWN2"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    invoke-virtual {v0, v5}, Lcom/arist/service/d;->removeMessages(I)V

    sget-object v0, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    invoke-virtual {v0, v6, v8, v9}, Lcom/arist/service/d;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_2

    :cond_7
    const-string v0, "MediaButtonReceiver"

    const-string v1, "event : ACTION_DOWN3"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/service/MediaButtonReceiver;->a:Lcom/arist/service/d;

    invoke-virtual {v0, v5, v8, v9}, Lcom/arist/service/d;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
