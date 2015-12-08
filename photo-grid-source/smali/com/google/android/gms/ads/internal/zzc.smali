.class public abstract Lcom/google/android/gms/ads/internal/zzc;
.super Lcom/google/android/gms/ads/internal/zzb;

# interfaces
.implements Lcom/google/android/gms/ads/internal/zzg;
.implements Lcom/google/android/gms/internal/kq;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/zzd;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/ads/internal/zzb;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/zzd;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/ads/internal/zze;)Lcom/google/android/gms/internal/ry;
    .locals 13

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq$zza;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ry;

    if-eqz v1, :cond_1

    const-string v1, "Reusing webview..."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/internal/ry;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzc;->a:Lcom/google/android/gms/internal/dm;

    invoke-interface {v0, v1, v3, v4}, Lcom/google/android/gms/internal/ry;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/dm;)V

    :cond_0
    :goto_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v3

    const/4 v10, 0x0

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    move v8, v2

    move-object v9, p0

    move-object v11, p2

    move-object v12, p0

    invoke-virtual/range {v3 .. v12}, Lcom/google/android/gms/internal/zzja;->zzb(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/ads/internal/overlay/zzn;ZLcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/gj;Lcom/google/android/gms/ads/internal/zze;Lcom/google/android/gms/internal/kq;)V

    iget-object v1, p1, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEC:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ry;->b(Ljava/lang/String;)V

    return-object v0

    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzq$zza;->removeView(Landroid/view/View;)V

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbw()Lcom/google/android/gms/internal/sf;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/zzq;->b:Lcom/google/android/gms/internal/ad;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v5, v3, Lcom/google/android/gms/ads/internal/zzq;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/zzc;->a:Lcom/google/android/gms/internal/dm;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/zzc;->i:Lcom/google/android/gms/ads/internal/zzd;

    move v3, v2

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/sf;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/ads/internal/zzd;)Lcom/google/android/gms/internal/ry;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztg:[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/ads/internal/zzc;->a(Landroid/view/View;)V

    goto :goto_0
.end method

.method public recordClick()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzc;->onAdClicked()V

    return-void
.end method

.method public recordImpression()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/zzc;->a(Lcom/google/android/gms/internal/pa;Z)V

    return-void
.end method

.method public zza(IIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzc;->b()Z

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/ds;)V
    .locals 1

    const-string v0, "setOnCustomRenderedAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->o:Lcom/google/android/gms/internal/ds;

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/dm;)V
    .locals 9

    iget v0, p1, Lcom/google/android/gms/internal/pb;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/b;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/b;-><init>(Lcom/google/android/gms/ads/internal/zzc;Lcom/google/android/gms/internal/pb;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/pb;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, p1, Lcom/google/android/gms/internal/pb;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/pb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzEK:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqH:I

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbu()Lcom/google/android/gms/internal/mn;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/zzq;->b:Lcom/google/android/gms/internal/ad;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzc;->j:Lcom/google/android/gms/internal/ip;

    move-object v1, p0

    move-object v2, p1

    move-object v6, p0

    move-object v7, p2

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/mn;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ad;Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/internal/mo;Lcom/google/android/gms/internal/dm;)Lcom/google/android/gms/internal/mp;

    move-result-object v0

    iput-object v0, v8, Lcom/google/android/gms/ads/internal/zzq;->zzqm:Lcom/google/android/gms/internal/mp;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/c;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/ads/internal/c;-><init>(Lcom/google/android/gms/ads/internal/zzc;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/dm;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method protected zza(Lcom/google/android/gms/internal/pa;Lcom/google/android/gms/internal/pa;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq;->zzbN()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->c:Lcom/google/android/gms/ads/internal/zzq$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq$zza;->zzbT()Lcom/google/android/gms/internal/ql;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/internal/pa;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ql;->a(Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/internal/pa;Lcom/google/android/gms/internal/pa;)Z

    move-result v0

    return v0
.end method

.method public zzbc()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzc;->a()Z

    return-void
.end method

.method public zzc(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzq;->r:Landroid/view/View;

    new-instance v0, Lcom/google/android/gms/internal/pa;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqp:Lcom/google/android/gms/internal/pb;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/pa;-><init>(Lcom/google/android/gms/internal/pb;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzc;->zzb(Lcom/google/android/gms/internal/pa;)V

    return-void
.end method
