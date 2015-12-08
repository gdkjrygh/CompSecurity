.class final Lcom/google/android/gms/ads/internal/request/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/request/zzb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/request/zzb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/b;->a:Lcom/google/android/gms/ads/internal/request/zzb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/b;->a:Lcom/google/android/gms/ads/internal/request/zzb;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzb;->a(Lcom/google/android/gms/ads/internal/request/zzb;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/b;->a:Lcom/google/android/gms/ads/internal/request/zzb;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/zzb;->a:Lcom/google/android/gms/internal/pj;

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/b;->a:Lcom/google/android/gms/ads/internal/request/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/request/zzb;->onStop()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/b;->a:Lcom/google/android/gms/ads/internal/request/zzb;

    const-string v2, "Timed out waiting for ad response."

    invoke-static {v0, v2}, Lcom/google/android/gms/ads/internal/request/zzb;->a(Lcom/google/android/gms/ads/internal/request/zzb;Ljava/lang/String;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
