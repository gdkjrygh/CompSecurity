.class Landroid_src/mms/g/m;
.super Landroid/content/BroadcastReceiver;
.source "RateController.java"


# instance fields
.field final synthetic a:Landroid_src/mms/g/l;


# direct methods
.method constructor <init>(Landroid_src/mms/g/l;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Landroid_src/mms/g/m;->a:Landroid_src/mms/g/l;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 62
    const-string v0, "com.android.mms.RATE_LIMIT_CONFIRMED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    monitor-enter p0

    .line 64
    :try_start_0
    iget-object v1, p0, Landroid_src/mms/g/m;->a:Landroid_src/mms/g/l;

    const-string v0, "answer"

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Landroid_src/mms/g/l;->a(Landroid_src/mms/g/l;I)I

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 67
    monitor-exit p0

    .line 69
    :cond_0
    return-void

    .line 64
    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
