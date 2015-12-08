.class final Lcom/cleanmaster/gaid/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cleanmaster/gaid/AdvertisingIdHelper;


# direct methods
.method constructor <init>(Lcom/cleanmaster/gaid/AdvertisingIdHelper;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/cleanmaster/gaid/a;->a:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 134
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 137
    invoke-static {v3}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->connection(Landroid/content/Context;)Lcom/cleanmaster/gaid/GooglePlayServiceConnection;

    move-result-object v4

    .line 139
    if-nez v4, :cond_1

    .line 169
    :cond_0
    :goto_0
    return-void

    .line 141
    :cond_1
    const/4 v2, 0x0

    .line 144
    :try_start_0
    invoke-virtual {v4}, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;->getConnectedBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getIdInterface(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/gaid/AdvertisingIdInterface;

    .line 147
    invoke-interface {v0}, Lcom/cleanmaster/gaid/AdvertisingIdInterface;->getId()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    .line 148
    const/4 v5, 0x0

    :try_start_1
    invoke-interface {v0, v5}, Lcom/cleanmaster/gaid/AdvertisingIdInterface;->isLimitAdTrackingEnabled(Z)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 153
    if-eqz v4, :cond_2

    .line 154
    :try_start_2
    invoke-virtual {v3, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    move-object v1, v2

    .line 162
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 164
    iget-object v2, p0, Lcom/cleanmaster/gaid/a;->a:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    # getter for: Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mGAId:Ljava/lang/String;
    invoke-static {v2}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->access$000(Lcom/cleanmaster/gaid/AdvertisingIdHelper;)Ljava/lang/String;

    move-result-object v2

    monitor-enter v2

    .line 165
    :try_start_3
    iget-object v3, p0, Lcom/cleanmaster/gaid/a;->a:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    # setter for: Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mGAId:Ljava/lang/String;
    invoke-static {v3, v1}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->access$002(Lcom/cleanmaster/gaid/AdvertisingIdHelper;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    iget-object v1, p0, Lcom/cleanmaster/gaid/a;->a:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    # setter for: Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mTrackFlag:Z
    invoke-static {v1, v0}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->access$102(Lcom/cleanmaster/gaid/AdvertisingIdHelper;Z)Z

    .line 167
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 161
    :catch_0
    move-exception v1

    move-object v1, v2

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v0, v2

    .line 153
    :goto_2
    if-eqz v4, :cond_3

    .line 154
    :try_start_4
    invoke-virtual {v3, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_3
    move v6, v1

    move-object v1, v0

    move v0, v6

    .line 160
    goto :goto_1

    .line 161
    :catch_2
    move-exception v2

    move v6, v1

    move-object v1, v0

    move v0, v6

    goto :goto_1

    :catch_3
    move-exception v0

    move-object v0, v2

    .line 153
    :goto_3
    if-eqz v4, :cond_4

    .line 154
    :try_start_5
    invoke-virtual {v3, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_4

    :cond_4
    move v6, v1

    move-object v1, v0

    move v0, v6

    .line 160
    goto :goto_1

    .line 161
    :catch_4
    move-exception v2

    move v6, v1

    move-object v1, v0

    move v0, v6

    goto :goto_1

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    if-eqz v4, :cond_5

    .line 154
    :try_start_6
    invoke-virtual {v3, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_5

    .line 160
    :cond_5
    :goto_4
    throw v0

    :catch_5
    move-exception v1

    goto :goto_4

    :catch_6
    move-exception v0

    move-object v0, v2

    goto :goto_3

    :catch_7
    move-exception v0

    move-object v0, v2

    goto :goto_2
.end method
