.class final Lcom/google/android/gms/ads/internal/request/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/pb;

.field final synthetic b:Lcom/google/android/gms/ads/internal/request/zzm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/request/zzm;Lcom/google/android/gms/internal/pb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/h;->b:Lcom/google/android/gms/ads/internal/request/zzm;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/request/h;->a:Lcom/google/android/gms/internal/pb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/h;->b:Lcom/google/android/gms/ads/internal/request/zzm;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzm;->a(Lcom/google/android/gms/ads/internal/request/zzm;)Lcom/google/android/gms/ads/internal/request/zza$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/h;->a:Lcom/google/android/gms/internal/pb;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/request/zza$zza;->zza(Lcom/google/android/gms/internal/pb;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/h;->b:Lcom/google/android/gms/ads/internal/request/zzm;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzm;->b(Lcom/google/android/gms/ads/internal/request/zzm;)Lcom/google/android/gms/internal/ho;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/h;->b:Lcom/google/android/gms/ads/internal/request/zzm;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzm;->b(Lcom/google/android/gms/ads/internal/request/zzm;)Lcom/google/android/gms/internal/ho;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ho;->a()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/h;->b:Lcom/google/android/gms/ads/internal/request/zzm;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/request/zzm;->a(Lcom/google/android/gms/ads/internal/request/zzm;Lcom/google/android/gms/internal/ho;)Lcom/google/android/gms/internal/ho;

    :cond_0
    return-void
.end method
