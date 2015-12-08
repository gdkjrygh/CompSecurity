.class public Lcom/google/android/gms/ads/internal/zzn;
.super Lcom/google/android/gms/ads/internal/zzb;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/zzb;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/zzd;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/ads/internal/formats/zzd;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/m;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/m;-><init>(Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/ads/internal/formats/zzd;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private a(Lcom/google/android/gms/ads/internal/formats/zze;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/n;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/n;-><init>(Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/ads/internal/formats/zze;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/pa;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->e:Lcom/google/android/gms/ads/internal/zzo;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzo;->zzbp()Z

    move-result v0

    return v0
.end method

.method public pause()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support pause()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public recordImpression()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/zzn;->a(Lcom/google/android/gms/internal/pa;Z)V

    return-void
.end method

.method public resume()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support resume()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public showInterstitial()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Interstitial is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/ds;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CustomRendering is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/li;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In App Purchase is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/dm;)V
    .locals 9

    iget-object v0, p1, Lcom/google/android/gms/internal/pb;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, p1, Lcom/google/android/gms/internal/pb;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/pb;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/l;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/l;-><init>(Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/internal/pb;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqH:I

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbu()Lcom/google/android/gms/internal/mn;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/zzq;->b:Lcom/google/android/gms/internal/ad;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzn;->j:Lcom/google/android/gms/internal/ip;

    move-object v1, p0

    move-object v2, p1

    move-object v6, p0

    move-object v7, p2

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/mn;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ad;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/internal/mo;Lcom/google/android/gms/internal/dm;)Lcom/google/android/gms/internal/mp;

    move-result-object v0

    iput-object v0, v8, Lcom/google/android/gms/ads/internal/zzq;->zzqm:Lcom/google/android/gms/internal/mp;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AdRenderer: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqm:Lcom/google/android/gms/internal/mp;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/wb;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/fb;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->m:Lcom/google/android/gms/internal/wb;

    return-void
.end method

.method public zza(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setNativeTemplates must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->p:Ljava/util/List;

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/pa;Lcom/google/android/gms/internal/pa;)Z
    .locals 13

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 0
    invoke-virtual {p0, v4}, Lcom/google/android/gms/ads/internal/zzn;->zza(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq;->zzbN()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native ad DOES NOT have custom rendering mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/internal/pa;->k:Z

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p2, Lcom/google/android/gms/internal/pa;->m:Lcom/google/android/gms/internal/is;

    invoke-interface {v0}, Lcom/google/android/gms/internal/is;->h()Lcom/google/android/gms/internal/jb;

    move-result-object v12

    iget-object v0, p2, Lcom/google/android/gms/internal/pa;->m:Lcom/google/android/gms/internal/is;

    invoke-interface {v0}, Lcom/google/android/gms/internal/is;->i()Lcom/google/android/gms/internal/je;

    move-result-object v9

    if-eqz v12, :cond_2

    .line 1000
    new-instance v0, Lcom/google/android/gms/ads/internal/formats/zzd;

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->d()Lcom/google/android/gms/internal/dw;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->d()Lcom/google/android/gms/internal/dw;

    move-result-object v4

    :cond_1
    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->f()D

    move-result-wide v6

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->g()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->h()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-interface {v12}, Lcom/google/android/gms/internal/jb;->l()Landroid/os/Bundle;

    move-result-object v11

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/ads/internal/formats/zzd;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/dw;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zza;Landroid/os/Bundle;)V

    .line 0
    new-instance v1, Lcom/google/android/gms/ads/internal/formats/zzg;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzq;->b:Lcom/google/android/gms/internal/ad;

    invoke-direct {v1, v2, p0, v3, v12}, Lcom/google/android/gms/ads/internal/formats/zzg;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/internal/ad;Lcom/google/android/gms/internal/jb;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/formats/zzd;->zza(Lcom/google/android/gms/ads/internal/formats/zzh;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzn;->a(Lcom/google/android/gms/ads/internal/formats/zzd;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/internal/pa;Lcom/google/android/gms/internal/pa;)Z

    move-result v0

    :goto_1
    return v0

    :cond_2
    if-eqz v9, :cond_4

    .line 2000
    :try_start_1
    new-instance v0, Lcom/google/android/gms/ads/internal/formats/zze;

    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->d()Lcom/google/android/gms/internal/dw;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->d()Lcom/google/android/gms/internal/dw;

    move-result-object v4

    :cond_3
    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->f()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v9}, Lcom/google/android/gms/internal/je;->j()Landroid/os/Bundle;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/ads/internal/formats/zze;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/dw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zza;Landroid/os/Bundle;)V

    .line 0
    new-instance v1, Lcom/google/android/gms/ads/internal/formats/zzg;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzq;->b:Lcom/google/android/gms/internal/ad;

    invoke-direct {v1, v2, p0, v3, v9}, Lcom/google/android/gms/ads/internal/formats/zzg;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/internal/ad;Lcom/google/android/gms/internal/je;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/formats/zze;->zza(Lcom/google/android/gms/ads/internal/formats/zzh;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzn;->a(Lcom/google/android/gms/ads/internal/formats/zze;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get native ad mapper"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    :try_start_2
    const-string v0, "No matching mapper for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzn;->a(I)Z
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    move v0, v2

    goto :goto_1

    :cond_5
    iget-object v1, p2, Lcom/google/android/gms/internal/pa;->w:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/zze;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->k:Lcom/google/android/gms/internal/ev;

    if-eqz v0, :cond_6

    iget-object v0, p2, Lcom/google/android/gms/internal/pa;->w:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/zze;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzn;->a(Lcom/google/android/gms/ads/internal/formats/zze;)V

    goto :goto_0

    :cond_6
    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/zzd;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->j:Lcom/google/android/gms/internal/es;

    if-eqz v0, :cond_7

    iget-object v0, p2, Lcom/google/android/gms/internal/pa;->w:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/zzd;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzn;->a(Lcom/google/android/gms/ads/internal/formats/zzd;)V

    goto :goto_0

    :cond_7
    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/zzf;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->m:Lcom/google/android/gms/internal/wb;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzq;->m:Lcom/google/android/gms/internal/wb;

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/zzf;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/formats/zzf;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/wb;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v1, Lcom/google/android/gms/ads/internal/formats/zzf;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/formats/zzf;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v0

    .line 3000
    sget-object v1, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/ads/internal/o;

    invoke-direct {v2, p0, v0, p2}, Lcom/google/android/gms/ads/internal/o;-><init>(Lcom/google/android/gms/ads/internal/zzn;Ljava/lang/String;Lcom/google/android/gms/internal/pa;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    .line 0
    :cond_8
    const-string v0, "No matching listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/ads/internal/zzn;->a(I)Z

    move v0, v2

    goto/16 :goto_1
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V
    .locals 1

    const-string v0, "setNativeAdOptions must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->n:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/es;)V
    .locals 1

    const-string v0, "setOnAppInstallAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->j:Lcom/google/android/gms/internal/es;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/ev;)V
    .locals 1

    const-string v0, "setOnContentAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->k:Lcom/google/android/gms/internal/ev;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/wb;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ey;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->l:Lcom/google/android/gms/internal/wb;

    return-void
.end method

.method public zzbo()Lcom/google/android/gms/internal/wb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/fb;",
            ">;"
        }
    .end annotation

    const-string v0, "getOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->m:Lcom/google/android/gms/internal/wb;

    return-object v0
.end method

.method public zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/ey;
    .locals 1

    const-string v0, "getOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzn;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->l:Lcom/google/android/gms/internal/wb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/wb;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ey;

    return-object v0
.end method
