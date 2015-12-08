.class public final Lcom/google/android/gms/ads/internal/request/zzd$zza;
.super Lcom/google/android/gms/ads/internal/request/zzd;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/zzc$zza;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/ads/internal/request/zzd;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/zzc$zza;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzd$zza;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zzfH()V
    .locals 0

    return-void
.end method

.method public final zzfI()Lcom/google/android/gms/ads/internal/request/zzj;
    .locals 3

    .prologue
    .line 0
    new-instance v1, Lcom/google/android/gms/internal/cn;

    sget-object v0, Lcom/google/android/gms/internal/cy;->b:Lcom/google/android/gms/internal/cq;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/cn;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzd$zza;->a:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ni;->a()Lcom/google/android/gms/internal/ni;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/nj;->a(Landroid/content/Context;Lcom/google/android/gms/internal/cn;Lcom/google/android/gms/internal/ni;)Lcom/google/android/gms/internal/nj;

    move-result-object v0

    return-object v0
.end method
