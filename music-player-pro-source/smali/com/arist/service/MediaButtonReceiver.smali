.class public Lcom/arist/service/MediaButtonReceiver;
.super Landroid/content/BroadcastReceiver;
.source "MediaButtonReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v4, 0x1

    .line 16
    invoke-virtual {p0}, Lcom/arist/service/MediaButtonReceiver;->abortBroadcast()V

    .line 17
    const-string v6, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 18
    .local v1, "isActionMediaButton":Z
    if-nez v1, :cond_1

    .line 42
    :cond_0
    :goto_0
    return-void

    .line 23
    :cond_1
    const-string v6, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p2, v6}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/view/KeyEvent;

    .line 24
    .local v0, "event":Landroid/view/KeyEvent;
    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    move-result v6

    if-ne v6, v4, :cond_2

    .line 31
    .local v4, "isActionUp":Z
    :goto_1
    if-eqz v4, :cond_0

    .line 36
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v6

    invoke-virtual {v0}, Landroid/view/KeyEvent;->getDownTime()J

    move-result-wide v8

    sub-long v2, v6, v8

    .line 38
    .local v2, "eventTime":J
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 39
    .local v5, "it":Landroid/content/Intent;
    const-string v6, "event_time"

    invoke-virtual {v5, v6, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 40
    const-string v6, "com.MediaPlayer.action.MEDIA_BUTTON_PRESSED"

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    invoke-virtual {p1, v5}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 30
    .end local v2    # "eventTime":J
    .end local v4    # "isActionUp":Z
    .end local v5    # "it":Landroid/content/Intent;
    :cond_2
    const/4 v4, 0x0

    goto :goto_1
.end method
