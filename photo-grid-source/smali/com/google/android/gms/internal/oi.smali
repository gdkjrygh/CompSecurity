.class public final Lcom/google/android/gms/internal/oi;
.super Lcom/google/android/gms/ads/internal/reward/client/zzb$zza;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final c:Lcom/google/android/gms/internal/oj;

.field private final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/reward/client/zzb$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/oi;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/oi;->b:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    new-instance v0, Lcom/google/android/gms/internal/oj;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzcC()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/google/android/gms/internal/oj;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/oj;->destroy()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final isLoaded()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/oj;->f()Z

    move-result v0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final pause()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/oj;->pause()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final resume()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/oj;->resume()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->a(Ljava/lang/String;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final show()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/oj;->e()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/reward/client/zzd;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/oi;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oi;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/ads/internal/reward/client/zzd;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
