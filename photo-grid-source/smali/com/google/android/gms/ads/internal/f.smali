.class final Lcom/google/android/gms/ads/internal/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/sc;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/pa;

.field final synthetic b:Lcom/google/android/gms/ads/internal/zzf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzf;Lcom/google/android/gms/internal/pa;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/f;->b:Lcom/google/android/gms/ads/internal/zzf;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/f;->a:Lcom/google/android/gms/internal/pa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/f;->b:Lcom/google/android/gms/ads/internal/zzf;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzf;->h:Lcom/google/android/gms/internal/as;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/f;->b:Lcom/google/android/gms/ads/internal/zzf;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzf;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/f;->a:Lcom/google/android/gms/internal/pa;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/as;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/pa;)Lcom/google/android/gms/internal/at;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/f;->a:Lcom/google/android/gms/internal/pa;

    iget-object v1, v1, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/at;->a(Lcom/google/android/gms/internal/aq;)V

    return-void
.end method
