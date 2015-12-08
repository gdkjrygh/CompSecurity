.class public Lcom/google/android/gms/ads/internal/zzk;
.super Lcom/google/android/gms/ads/internal/zzc;

# interfaces
.implements Lcom/google/android/gms/internal/gj;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field protected transient l:Z

.field private m:Z

.field private n:F

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/zzd;)V
    .locals 2

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/ads/internal/zzc;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/zzd;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzk;->l:Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "background"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->o:Ljava/lang/String;

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJu:Ljava/lang/String;

    const-string v2, "gmob-apps"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/qa;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/zzk;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzk;->m:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/ads/internal/zzk;)F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzk;->n:F

    return v0
.end method

.method private f()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/ads/internal/i;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->o:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/internal/i;-><init>(Lcom/google/android/gms/ads/internal/zzk;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/i;->zzgz()Ljava/util/concurrent/Future;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq;->zzbN()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq;->zzbK()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-boolean v2, v0, Lcom/google/android/gms/ads/internal/zzq;->t:Z

    iput-boolean v2, p0, Lcom/google/android/gms/ads/internal/zzk;->l:Z

    :cond_0
    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/ads/internal/zze;)Lcom/google/android/gms/internal/ry;
    .locals 12

    .prologue
    const/4 v11, 0x0

    const/4 v2, 0x0

    .line 0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbw()Lcom/google/android/gms/internal/sf;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/zzq;->b:Lcom/google/android/gms/internal/ad;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v5, v3, Lcom/google/android/gms/ads/internal/zzq;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/zzk;->a:Lcom/google/android/gms/internal/dm;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/zzk;->i:Lcom/google/android/gms/ads/internal/zzd;

    move v3, v2

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/sf;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/ads/internal/zzd;)Lcom/google/android/gms/internal/ry;

    move-result-object v10

    invoke-interface {v10}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/cy;->S:Lcom/google/android/gms/internal/cq;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v1

    .line 0
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v1, p0

    move-object v2, v11

    move-object v3, p0

    move-object v4, p0

    move-object v6, p0

    move-object v7, p0

    move-object v8, p2

    move-object v9, v11

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/gms/internal/zzja;->zzb(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/ads/internal/overlay/zzn;ZLcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/gj;Lcom/google/android/gms/ads/internal/zze;Lcom/google/android/gms/internal/kq;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEC:Ljava/lang/String;

    invoke-interface {v10, v0}, Lcom/google/android/gms/internal/ry;->b(Ljava/lang/String;)V

    return-object v10
.end method

.method protected final a()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzk;->f()V

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzc;->a()Z

    move-result v0

    return v0
.end method

.method protected final a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/pa;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq;->zzbN()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbx()Lcom/google/android/gms/internal/qd;

    iget-object v0, p2, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->a()Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/qd;->a(Landroid/webkit/WebView;)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->e:Lcom/google/android/gms/ads/internal/zzo;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzo;->zzbp()Z

    move-result v0

    return v0
.end method

.method protected final c()Z
    .locals 2

    const/4 v0, 0x1

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzc;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzk;->l:Z

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final e()Z
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_3

    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_3

    iget v0, v2, Landroid/graphics/Rect;->top:I

    iget v2, v3, Landroid/graphics/Rect;->top:I

    if-ne v0, v2, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public showInterstitial()V
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 0
    const-string v0, "showInterstitial must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    if-nez v0, :cond_1

    const-string v0, "The interstitial has not loaded."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/cy;->ae:Lcom/google/android/gms/internal/cq;

    .line 2000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzk;->l:Z

    if-nez v1, :cond_2

    const-string v1, "It is not recommended to show an interstitial before onAdLoaded completes."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "appid"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "action"

    const-string v4, "show_interstitial_before_load_finish"

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/ads/internal/zzk;->a(Landroid/os/Bundle;)V

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->f(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "It is not recommended to show an interstitial when app is not in foreground."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "appid"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "action"

    const-string v2, "show_interstitial_app_not_in_foreground"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/ads/internal/zzk;->a(Landroid/os/Bundle;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq;->zzbO()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/pa;->k:Z

    if-eqz v0, :cond_5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->m:Lcom/google/android/gms/internal/is;

    invoke-interface {v0}, Lcom/google/android/gms/internal/is;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzk;->f()V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    if-nez v0, :cond_6

    const-string v0, "The interstitial failed to load."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "The interstitial is already showing."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ry;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v0, v0, Lcom/google/android/gms/internal/pa;->j:Lorg/json/JSONObject;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->h:Lcom/google/android/gms/internal/as;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/as;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/pa;)Lcom/google/android/gms/internal/at;

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/zzq;->t:Z

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->g(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v1, v0

    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/cy;->ap:Lcom/google/android/gms/internal/cq;

    .line 3000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    if-eqz v1, :cond_a

    new-instance v0, Lcom/google/android/gms/ads/internal/j;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzk;->o:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/ads/internal/j;-><init>(Lcom/google/android/gms/ads/internal/zzk;Landroid/graphics/Bitmap;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/j;->zzgz()Ljava/util/concurrent/Future;

    goto/16 :goto_0

    :cond_9
    move-object v1, v3

    goto :goto_2

    :cond_a
    new-instance v0, Lcom/google/android/gms/ads/internal/InterstitialAdParameterParcel;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/zzq;->t:Z

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzk;->e()Z

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/InterstitialAdParameterParcel;-><init>(ZZLjava/lang/String;ZF)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v1, v1, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->p()I

    move-result v6

    const/4 v1, -0x1

    if-ne v6, v1, :cond_b

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget v6, v1, Lcom/google/android/gms/internal/pa;->g:I

    :cond_b
    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v5, v2, Lcom/google/android/gms/internal/pa;->b:Lcom/google/android/gms/internal/ry;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v7, v2, Lcom/google/android/gms/ads/internal/zzq;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    iget-object v8, v2, Lcom/google/android/gms/internal/pa;->v:Ljava/lang/String;

    move-object v2, p0

    move-object v3, p0

    move-object v4, p0

    move-object v9, v0

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/internal/ry;ILcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/InterstitialAdParameterParcel;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbt()Lcom/google/android/gms/ads/internal/overlay/zze;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzq;->context:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/ads/internal/overlay/zze;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    goto/16 :goto_0
.end method

.method public zza(ZF)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzk;->m:Z

    iput p2, p0, Lcom/google/android/gms/ads/internal/zzk;->n:F

    return-void
.end method

.method public zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/dm;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->zzqo:Lcom/google/android/gms/internal/pa;

    if-eqz v0, :cond_0

    const-string v0, "An interstitial is already loading. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzc;->zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/dm;)Z

    move-result v0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/pa;Lcom/google/android/gms/internal/pa;)Z
    .locals 3

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzc;->zza(Lcom/google/android/gms/internal/pa;Lcom/google/android/gms/internal/pa;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzq;->zzbN()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzq;->r:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/google/android/gms/internal/pa;->j:Lorg/json/JSONObject;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->h:Lcom/google/android/gms/internal/as;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzq;->zzqn:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzq;->r:Landroid/view/View;

    invoke-virtual {v0, v1, p2, v2}, Lcom/google/android/gms/internal/as;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/pa;Landroid/view/View;)Lcom/google/android/gms/internal/at;

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public zzaW()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzk;->recordImpression()V

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzc;->zzaW()V

    return-void
.end method

.method public zzd(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzk;->f:Lcom/google/android/gms/ads/internal/zzq;

    iput-boolean p1, v0, Lcom/google/android/gms/ads/internal/zzq;->t:Z

    return-void
.end method
