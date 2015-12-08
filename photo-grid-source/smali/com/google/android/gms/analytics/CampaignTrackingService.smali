.class public Lcom/google/android/gms/analytics/CampaignTrackingService;
.super Landroid/app/Service;


# static fields
.field private static b:Ljava/lang/Boolean;


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/analytics/CampaignTrackingService;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/analytics/CampaignTrackingService;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const-class v0, Lcom/google/android/gms/analytics/CampaignTrackingService;

    invoke-static {p0, v0}, Lcom/google/android/gms/analytics/internal/q;->a(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/analytics/CampaignTrackingService;->b:Ljava/lang/Boolean;

    goto :goto_0
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/analytics/internal/j;Landroid/os/Handler;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/e;

    invoke-direct {v0, p0, p3, p1}, Lcom/google/android/gms/analytics/e;-><init>(Lcom/google/android/gms/analytics/CampaignTrackingService;ILcom/google/android/gms/analytics/internal/j;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/aa;->a(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v1, "CampaignTrackingService is starting up"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/j;->b(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/aa;->a(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v1, "CampaignTrackingService is shutting down"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/j;->b(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 9

    .prologue
    const/4 v8, 0x2

    .line 1000
    :try_start_0
    sget-object v1, Lcom/google/android/gms/analytics/CampaignTrackingReceiver;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v0, Lcom/google/android/gms/analytics/CampaignTrackingReceiver;->b:Lcom/google/android/gms/internal/xl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/xl;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/xl;->b()V

    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 0
    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/aa;->a(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v3

    const/4 v0, 0x0

    .line 2000
    sget-boolean v1, Lcom/google/android/gms/common/internal/i;->a:Z

    .line 0
    if-eqz v1, :cond_3

    const-string v1, "Unexpected installation campaign (package side)"

    invoke-virtual {v3, v1}, Lcom/google/android/gms/analytics/internal/j;->f(Ljava/lang/String;)V

    .line 3000
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/analytics/CampaignTrackingService;->a:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/CampaignTrackingService;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/google/android/gms/analytics/CampaignTrackingService;->a:Landroid/os/Handler;

    .line 0
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 4000
    sget-boolean v0, Lcom/google/android/gms/common/internal/i;->a:Z

    .line 0
    if-nez v0, :cond_2

    const-string v0, "No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra"

    invoke-virtual {v3, v0}, Lcom/google/android/gms/analytics/internal/j;->e(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/aa;->g()Lcom/google/android/gms/c/f;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/analytics/c;

    invoke-direct {v2, p0, v3, v1, p3}, Lcom/google/android/gms/analytics/c;-><init>(Lcom/google/android/gms/analytics/CampaignTrackingService;Lcom/google/android/gms/analytics/internal/j;Landroid/os/Handler;I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Runnable;)V

    :goto_2
    return v8

    .line 1000
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0

    .line 0
    :cond_3
    const-string v0, "referrer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-static {}, Lcom/google/android/gms/analytics/internal/az;->c()I

    move-result v4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v4, :cond_5

    const-string v5, "Campaign data exceed the maximum supported size and will be clipped. size, limit"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v5, v6, v7}, Lcom/google/android/gms/analytics/internal/j;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_5
    const-string v4, "CampaignTrackingService called. startId, campaign"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v0}, Lcom/google/android/gms/analytics/internal/j;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/aa;->h()Lcom/google/android/gms/analytics/internal/s;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/analytics/d;

    invoke-direct {v4, p0, v3, v1, p3}, Lcom/google/android/gms/analytics/d;-><init>(Lcom/google/android/gms/analytics/CampaignTrackingService;Lcom/google/android/gms/analytics/internal/j;Landroid/os/Handler;I)V

    invoke-virtual {v2, v0, v4}, Lcom/google/android/gms/analytics/internal/s;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_2
.end method
