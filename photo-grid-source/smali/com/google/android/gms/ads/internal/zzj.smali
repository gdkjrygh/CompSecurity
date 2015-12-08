.class public Lcom/google/android/gms/ads/internal/zzj;
.super Lcom/google/android/gms/ads/internal/client/zzq$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/ads/internal/client/zzo;

.field private b:Lcom/google/android/gms/internal/es;

.field private c:Lcom/google/android/gms/internal/ev;

.field private d:Lcom/google/android/gms/internal/wb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ey;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/internal/wb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/fb;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field private final g:Landroid/content/Context;

.field private final h:Lcom/google/android/gms/internal/ip;

.field private final i:Ljava/lang/String;

.field private final j:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzq$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzj;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzj;->i:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzj;->h:Lcom/google/android/gms/internal/ip;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzj;->j:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    new-instance v0, Lcom/google/android/gms/internal/wb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzj;->e:Lcom/google/android/gms/internal/wb;

    new-instance v0, Lcom/google/android/gms/internal/wb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzj;->d:Lcom/google/android/gms/internal/wb;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzj;->f:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/es;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzj;->b:Lcom/google/android/gms/internal/es;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/ev;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzj;->c:Lcom/google/android/gms/internal/ev;

    return-void
.end method

.method public zza(Ljava/lang/String;Lcom/google/android/gms/internal/fb;Lcom/google/android/gms/internal/ey;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Custom template ID for native custom template ad is empty. Please provide a valid template id."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzj;->e:Lcom/google/android/gms/internal/wb;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/wb;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzj;->d:Lcom/google/android/gms/internal/wb;

    invoke-virtual {v0, p1, p3}, Lcom/google/android/gms/internal/wb;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/client/zzo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzj;->a:Lcom/google/android/gms/ads/internal/client/zzo;

    return-void
.end method

.method public zzbk()Lcom/google/android/gms/ads/internal/client/zzp;
    .locals 11

    new-instance v0, Lcom/google/android/gms/ads/internal/zzi;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzj;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzj;->i:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzj;->h:Lcom/google/android/gms/internal/ip;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzj;->j:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzj;->a:Lcom/google/android/gms/ads/internal/client/zzo;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/zzj;->b:Lcom/google/android/gms/internal/es;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/zzj;->c:Lcom/google/android/gms/internal/ev;

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/zzj;->e:Lcom/google/android/gms/internal/wb;

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/zzj;->d:Lcom/google/android/gms/internal/wb;

    iget-object v10, p0, Lcom/google/android/gms/ads/internal/zzj;->f:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/ads/internal/zzi;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/client/zzo;Lcom/google/android/gms/internal/es;Lcom/google/android/gms/internal/ev;Lcom/google/android/gms/internal/wb;Lcom/google/android/gms/internal/wb;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V

    return-object v0
.end method
