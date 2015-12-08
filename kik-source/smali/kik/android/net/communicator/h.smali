.class final Lkik/android/net/communicator/h;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/net/communicator/CommunicatorService;


# direct methods
.method constructor <init>(Lkik/android/net/communicator/CommunicatorService;)V
    .locals 0

    .prologue
    .line 483
    iput-object p1, p0, Lkik/android/net/communicator/h;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    .line 488
    const-string v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/NetworkInfo;

    .line 490
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    .line 491
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Connectivity changed: info= "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->toString()Ljava/lang/String;

    .line 493
    :cond_0
    if-eqz v1, :cond_2

    .line 494
    iget-object v0, p0, Lkik/android/net/communicator/h;->a:Lkik/android/net/communicator/CommunicatorService;

    const-wide/16 v4, 0x1

    const-string v1, "Connectivity change"

    invoke-static {v0, v4, v5, v2, v1}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;JZLjava/lang/String;)V

    .line 503
    :goto_1
    return-void

    .line 490
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 499
    :cond_2
    :try_start_0
    iget-object v0, p0, Lkik/android/net/communicator/h;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {v0}, Lkik/android/net/communicator/CommunicatorService;->e(Lkik/android/net/communicator/CommunicatorService;)V
    :try_end_0
    .catch Lkik/a/e/f$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 502
    :catch_0
    move-exception v0

    goto :goto_1
.end method
