.class final Lcom/google/android/gms/internal/sg;
.super Landroid/widget/FrameLayout;

# interfaces
.implements Lcom/google/android/gms/internal/ry;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ry;

.field private final b:Lcom/google/android/gms/internal/rx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ry;)V
    .locals 2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ry;->f()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    new-instance v0, Lcom/google/android/gms/internal/rx;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ry;->f()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p0}, Lcom/google/android/gms/internal/rx;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ry;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/sg;->b:Lcom/google/android/gms/internal/rx;

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzja;->zze(Lcom/google/android/gms/internal/ry;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->b()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/sg;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->a()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->a(I)V

    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->a(Landroid/content/Context;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/dm;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ry;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/dm;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/overlay/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->a(Lcom/google/android/gms/ads/internal/overlay/zzd;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/at;Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ry;->a(Lcom/google/android/gms/internal/at;Z)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->a(Z)V

    return-void
.end method

.method public final b()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->b(I)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/ads/internal/overlay/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->b(Lcom/google/android/gms/ads/internal/overlay/zzd;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ry;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->b(Z)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->c()V

    return-void
.end method

.method public final c(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->c(Z)V

    return-void
.end method

.method public final clearCache(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->clearCache(Z)V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->d()V

    return-void
.end method

.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->destroy()V

    return-void
.end method

.method public final e()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->e()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public final f()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->f()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/ads/internal/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->g()Lcom/google/android/gms/ads/internal/zzd;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/ads/internal/overlay/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->h()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/ads/internal/overlay/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->i()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lcom/google/android/gms/internal/zzja;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v0

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->l()Z

    move-result v0

    return v0
.end method

.method public final loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ry;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ry;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final loadUrl(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final m()Lcom/google/android/gms/internal/ad;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->m()Lcom/google/android/gms/internal/ad;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v0

    return-object v0
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->o()Z

    move-result v0

    return v0
.end method

.method public final p()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->p()I

    move-result v0

    return v0
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->q()Z

    move-result v0

    return v0
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->b:Lcom/google/android/gms/internal/rx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/rx;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->r()V

    return-void
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->s()Z

    move-result v0

    return v0
.end method

.method public final setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->setBackgroundColor(I)V

    return-void
.end method

.method public final setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public final setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ry;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method public final stopLoading()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->stopLoading()V

    return-void
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/google/android/gms/internal/rx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->b:Lcom/google/android/gms/internal/rx;

    return-object v0
.end method

.method public final v()Lcom/google/android/gms/internal/dk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->v()Lcom/google/android/gms/internal/dk;

    move-result-object v0

    return-object v0
.end method

.method public final w()Lcom/google/android/gms/internal/dl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->w()Lcom/google/android/gms/internal/dl;

    move-result-object v0

    return-object v0
.end method

.method public final x()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->x()V

    return-void
.end method

.method public final y()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sg;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->y()V

    return-void
.end method
