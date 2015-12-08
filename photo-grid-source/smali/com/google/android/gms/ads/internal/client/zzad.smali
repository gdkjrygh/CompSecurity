.class public Lcom/google/android/gms/ads/internal/client/zzad;
.super Lcom/google/android/gms/b/e;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/e",
        "<",
        "Lcom/google/android/gms/ads/internal/client/zzx;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl"

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/e;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private b(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/zzw;
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/b/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/a;

    move-result-object v2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/client/zzad;->a(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/client/zzx;

    const v3, 0x7bd338

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/ads/internal/client/zzx;->zza(Lcom/google/android/gms/b/a;I)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzw$zza;->zzo(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/client/zzw;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/b/f; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "Could not get remote MobileAdsSettingManager."

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v2, "Could not get remote MobileAdsSettingManager."

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 0
    .line 1000
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/client/zzx$zza;->zzp(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/client/zzx;

    move-result-object v0

    .line 0
    return-object v0
.end method

.method public zzt(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/zzw;
    .locals 3

    const v2, 0x7bd338

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzl;->zzcF()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzR(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/client/zzad;->b(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/zzw;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "Using MobileAdsSettingManager from the client jar."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    const/4 v1, 0x1

    invoke-direct {v0, v2, v2, v1}, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;-><init>(IIZ)V

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/zzm;->zzq(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/zzm;

    move-result-object v0

    :cond_1
    return-object v0
.end method
