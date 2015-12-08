.class final Lcom/google/android/gms/ads/internal/i;
.super Lcom/google/android/gms/internal/pj;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/zzk;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzk;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/i;->a:Lcom/google/android/gms/ads/internal/zzk;

    invoke-direct {p0}, Lcom/google/android/gms/internal/pj;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/i;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onStop()V
    .locals 0

    return-void
.end method

.method public final zzbn()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/i;->a:Lcom/google/android/gms/ads/internal/zzk;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/i;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/qa;->c(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
