.class public final Lcom/google/android/gms/internal/ih;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ik;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/gms/internal/ip;

.field private final c:J

.field private final d:Lcom/google/android/gms/internal/id;

.field private final e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

.field private final f:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

.field private final g:Landroid/content/Context;

.field private final h:Ljava/lang/Object;

.field private final i:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final j:Z

.field private final k:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field private final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/google/android/gms/internal/is;

.field private n:I

.field private o:Lcom/google/android/gms/internal/iy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/internal/id;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;ZLcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ip;",
            "Lcom/google/android/gms/internal/ie;",
            "Lcom/google/android/gms/internal/id;",
            "Lcom/google/android/gms/ads/internal/client/AdRequestParcel;",
            "Lcom/google/android/gms/ads/internal/client/AdSizeParcel;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Z",
            "Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    const/4 v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/ih;->n:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ih;->g:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ih;->b:Lcom/google/android/gms/internal/ip;

    iput-object p5, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    const-string v0, "com.google.ads.mediation.customevent.CustomEventAdapter"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ih;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    :goto_0
    iget-wide v0, p4, Lcom/google/android/gms/internal/ie;->b:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p4, Lcom/google/android/gms/internal/ie;->b:J

    :goto_1
    iput-wide v0, p0, Lcom/google/android/gms/internal/ih;->c:J

    iput-object p6, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iput-object p7, p0, Lcom/google/android/gms/internal/ih;->f:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object p8, p0, Lcom/google/android/gms/internal/ih;->i:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ih;->j:Z

    iput-object p10, p0, Lcom/google/android/gms/internal/ih;->k:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iput-object p11, p0, Lcom/google/android/gms/internal/ih;->l:Ljava/util/List;

    return-void

    :cond_0
    iput-object p2, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x2710

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ih;Lcom/google/android/gms/internal/is;)Lcom/google/android/gms/internal/is;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ih;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ih;Lcom/google/android/gms/internal/ig;)V
    .locals 8

    .prologue
    .line 4000
    const-string v0, "com.google.ads.mediation.AdUrlAdapter"

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsL:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    const-string v1, "sdk_less_network_id"

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v2, v2, Lcom/google/android/gms/internal/id;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->zzsL:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->i:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJw:I

    const v1, 0x3e8fa0

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->f:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/b/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v3, v3, Lcom/google/android/gms/internal/id;->h:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/b/a;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;Lcom/google/android/gms/internal/iv;)V

    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/b/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->f:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v4, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v4, v4, Lcom/google/android/gms/internal/id;->h:Ljava/lang/String;

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/b/a;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;Lcom/google/android/gms/internal/iv;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not request ad from mediation adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ih;->a(I)V

    goto :goto_0

    :cond_3
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ih;->j:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/b/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v3, v3, Lcom/google/android/gms/internal/id;->h:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v4, v4, Lcom/google/android/gms/internal/id;->a:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ih;->k:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget-object v7, p0, Lcom/google/android/gms/internal/ih;->l:Ljava/util/List;

    move-object v5, p1

    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/b/a;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;Ljava/util/List;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->f:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/b/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v3, v3, Lcom/google/android/gms/internal/id;->h:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v4, v4, Lcom/google/android/gms/internal/id;->a:Ljava/lang/String;

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/b/a;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/iv;)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/b/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/b/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->f:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/ih;->e:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v4, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v4, v4, Lcom/google/android/gms/internal/id;->h:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v5, v5, Lcom/google/android/gms/internal/id;->a:Ljava/lang/String;

    move-object v6, p1

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/b/a;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/iv;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ih;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ih;->n:I

    return v0
.end method

.method private b()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v0, v0, Lcom/google/android/gms/internal/id;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->b:Lcom/google/android/gms/internal/ip;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v1, v1, Lcom/google/android/gms/internal/id;->e:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.ads.mediation.customevent.CustomEventAdapter"
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Fail to determine the custom event\'s version, assuming the old one."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    :cond_1
    const-string v0, "com.google.ads.mediation.customevent.CustomEventAdapter"

    goto :goto_0
.end method

.method private c()Lcom/google/android/gms/internal/is;
    .locals 3

    .prologue
    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Instantiating mediation adapter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/cy;->ak:Lcom/google/android/gms/internal/cq;

    .line 3000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "com.google.ads.mediation.admob.AdMobAdapter"

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ji;

    new-instance v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-direct {v1}, Lcom/google/ads/mediation/admob/AdMobAdapter;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ji;-><init>(Lcom/google/android/gms/ads/mediation/MediationAdapter;)V

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.ads.mediation.AdUrlAdapter"

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ji;

    new-instance v1, Lcom/google/ads/mediation/AdUrlAdapter;

    invoke-direct {v1}, Lcom/google/ads/mediation/AdUrlAdapter;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ji;-><init>(Lcom/google/android/gms/ads/mediation/MediationAdapter;)V

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->b:Lcom/google/android/gms/internal/ip;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ip;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/is;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not instantiate mediation adapter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zza(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ih;)Lcom/google/android/gms/internal/is;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ih;->c()Lcom/google/android/gms/internal/is;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ih;)Lcom/google/android/gms/internal/is;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    return-object v0
.end method


# virtual methods
.method public final a(JJ)Lcom/google/android/gms/internal/ij;
    .locals 15

    .prologue
    .line 0
    iget-object v7, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    new-instance v4, Lcom/google/android/gms/internal/ig;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ig;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/ii;

    invoke-direct {v3, p0, v4}, Lcom/google/android/gms/internal/ii;-><init>(Lcom/google/android/gms/internal/ih;Lcom/google/android/gms/internal/ig;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/ih;->c:J

    .line 1000
    :goto_0
    iget v5, p0, Lcom/google/android/gms/internal/ih;->n:I

    const/4 v6, -0x2

    if-ne v5, v6, :cond_2

    .line 2000
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    sub-long v10, v8, v0

    sub-long v10, v2, v10

    sub-long v8, v8, p1

    sub-long v8, p3, v8

    const-wide/16 v12, 0x0

    cmp-long v5, v10, v12

    if-lez v5, :cond_0

    const-wide/16 v12, 0x0

    cmp-long v5, v8, v12

    if-gtz v5, :cond_1

    :cond_0
    const-string v5, "Timed out waiting for adapter."

    invoke-static {v5}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaG(Ljava/lang/String;)V

    const/4 v5, 0x3

    iput v5, p0, Lcom/google/android/gms/internal/ih;->n:I

    goto :goto_0

    .line 0
    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 2000
    :cond_1
    :try_start_1
    iget-object v5, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v5

    const/4 v5, -0x1

    :try_start_2
    iput v5, p0, Lcom/google/android/gms/internal/ih;->n:I

    goto :goto_0

    .line 0
    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ij;

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->d:Lcom/google/android/gms/internal/id;

    iget-object v2, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    iget-object v3, p0, Lcom/google/android/gms/internal/ih;->a:Ljava/lang/String;

    iget v5, p0, Lcom/google/android/gms/internal/ih;->n:I

    iget-object v6, p0, Lcom/google/android/gms/internal/ih;->o:Lcom/google/android/gms/internal/iy;

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ij;-><init>(Lcom/google/android/gms/internal/id;Lcom/google/android/gms/internal/is;Ljava/lang/String;Lcom/google/android/gms/internal/ig;ILcom/google/android/gms/internal/iy;)V

    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v0
.end method

.method public final a()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->m:Lcom/google/android/gms/internal/is;

    invoke-interface {v0}, Lcom/google/android/gms/internal/is;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :try_start_1
    iput v0, p0, Lcom/google/android/gms/internal/ih;->n:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v2, "Could not destroy mediation adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(I)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ih;->n:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/iy;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/google/android/gms/internal/ih;->n:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ih;->o:Lcom/google/android/gms/internal/iy;

    iget-object v0, p0, Lcom/google/android/gms/internal/ih;->h:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
