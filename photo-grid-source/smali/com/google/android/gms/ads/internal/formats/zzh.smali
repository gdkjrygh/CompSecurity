.class public Lcom/google/android/gms/ads/internal/formats/zzh;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/google/android/gms/ads/internal/zzn;

.field private final c:Landroid/content/Context;

.field private final d:Lorg/json/JSONObject;

.field private final e:Lcom/google/android/gms/internal/bg;

.field private final f:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

.field private final g:Lcom/google/android/gms/internal/ad;

.field private final h:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private i:Z

.field private j:Lcom/google/android/gms/internal/ry;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/internal/bg;Lcom/google/android/gms/internal/ad;Lorg/json/JSONObject;Lcom/google/android/gms/ads/internal/formats/zzh$zza;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->a:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->b:Lcom/google/android/gms/ads/internal/zzn;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->e:Lcom/google/android/gms/internal/bg;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->g:Lcom/google/android/gms/internal/ad;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->d:Lorg/json/JSONObject;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->f:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->h:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/formats/zzh;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/formats/zzh;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/ads/internal/formats/zzh;)Lcom/google/android/gms/internal/bg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->e:Lcom/google/android/gms/internal/bg;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/internal/formats/zzh;)Lcom/google/android/gms/internal/ry;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->j:Lcom/google/android/gms/internal/ry;

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->i:Z

    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->c:Landroid/content/Context;

    return-object v0
.end method

.method public recordImpression()V
    .locals 3

    .prologue
    .line 0
    const-string v0, "recordImpression must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    .line 1000
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->i:Z

    .line 0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "ad"

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->e:Lcom/google/android/gms/internal/bg;

    const-string v2, "google.afma.nativeAds.handleImpressionPing"

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unable to create impression JSON."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public zza(Landroid/view/View$OnClickListener;)Lcom/google/android/gms/ads/internal/formats/a;
    .locals 4

    const/4 v3, -0x1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->f:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/formats/zzh$zza;->zzdz()Lcom/google/android/gms/ads/internal/formats/zza;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/ads/internal/formats/a;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->c:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/ads/internal/formats/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/formats/zza;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/formats/a;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/formats/a;->a()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/formats/a;->a()Landroid/view/ViewGroup;

    move-result-object v1

    const-string v2, "Ad attribution icon"

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public zza(Landroid/view/View;Ljava/util/Map;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ")V"
        }
    .end annotation

    const-string v0, "performClick must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0, p3, p4}, Lcom/google/android/gms/ads/internal/formats/zzh;->zza(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public zza(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 4

    const-string v0, "performClick must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->b(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "asset"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "template"

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->f:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    invoke-interface {v2}, Lcom/google/android/gms/ads/internal/formats/zzh$zza;->zzdy()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "ad"

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->d:Lorg/json/JSONObject;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "click"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "has_custom_click_handler"

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->b:Lcom/google/android/gms/ads/internal/zzn;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->f:Lcom/google/android/gms/ads/internal/formats/zzh$zza;

    invoke-interface {v3}, Lcom/google/android/gms/ads/internal/formats/zzh$zza;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/internal/zzn;->zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/ey;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v0, "view_rectangles"

    invoke-virtual {v1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    if-eqz p3, :cond_1

    const-string v0, "click_point"

    invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->e:Lcom/google/android/gms/internal/bg;

    const-string v2, "google.afma.nativeAds.handleClickGmsg"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to create click JSON."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public zzb(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->g:Lcom/google/android/gms/internal/ad;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ad;->a(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public zzdC()Lcom/google/android/gms/internal/ry;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 0
    .line 2000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbw()Lcom/google/android/gms/internal/sf;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzs(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->g:Lcom/google/android/gms/internal/ad;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->h:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/sf;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/ry;

    move-result-object v0

    .line 0
    iput-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->j:Lcom/google/android/gms/internal/ry;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->j:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->e:Lcom/google/android/gms/internal/bg;

    const-string v1, "/loadHtml"

    new-instance v2, Lcom/google/android/gms/ads/internal/formats/b;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/internal/formats/b;-><init>(Lcom/google/android/gms/ads/internal/formats/zzh;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->e:Lcom/google/android/gms/internal/bg;

    const-string v1, "/showOverlay"

    new-instance v2, Lcom/google/android/gms/ads/internal/formats/d;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/internal/formats/d;-><init>(Lcom/google/android/gms/ads/internal/formats/zzh;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->e:Lcom/google/android/gms/internal/bg;

    const-string v1, "/hideOverlay"

    new-instance v2, Lcom/google/android/gms/ads/internal/formats/e;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/internal/formats/e;-><init>(Lcom/google/android/gms/ads/internal/formats/zzh;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->j:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    const-string v1, "/hideOverlay"

    new-instance v2, Lcom/google/android/gms/ads/internal/formats/f;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/internal/formats/f;-><init>(Lcom/google/android/gms/ads/internal/formats/zzh;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->j:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    const-string v1, "/sendMessageToSdk"

    new-instance v2, Lcom/google/android/gms/ads/internal/formats/g;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/internal/formats/g;-><init>(Lcom/google/android/gms/ads/internal/formats/zzh;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->j:Lcom/google/android/gms/internal/ry;

    return-object v0
.end method

.method public zzh(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public zzi(Landroid/view/View;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/formats/zzh;->i:Z

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_1

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result v0

    if-nez v0, :cond_2

    monitor-exit v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/formats/zzh;->recordImpression()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
