.class public final Lcom/roidapp/photogrid/cloud/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/ads/l;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroid/widget/LinearLayout;

.field private c:Lcom/google/android/gms/ads/AdView;

.field private d:Lcom/mopub/mobileads/MoPubView;

.field private e:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Lcom/roidapp/cloudlib/ads/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    return-void
.end method

.method public static a(Landroid/app/Activity;II)V
    .locals 4

    .prologue
    .line 359
    instance-of v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 360
    check-cast p0, Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->c()Ljava/lang/String;

    move-result-object v0

    .line 361
    if-eqz v0, :cond_0

    .line 362
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_View"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2285
    const-string v1, "page_name=%s&action_type=%s&ads_type=%s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2286
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 2289
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_banner_ads"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/a;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a;->e()V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/a;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    return-object v0
.end method

.method private e()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    .line 94
    :cond_1
    :goto_0
    return-void

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->e:Ljava/util/Queue;

    if-nez v0, :cond_3

    .line 73
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v3, "ad"

    const-string v4, "sort_banner"

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/cloudlib/a/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Queue;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->e:Ljava/util/Queue;

    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->e:Ljava/util/Queue;

    if-nez v0, :cond_3

    .line 75
    new-instance v0, Ljava/util/LinkedList;

    new-array v3, v7, [Ljava/lang/Integer;

    const/4 v4, 0x5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v4, 0x2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->e:Ljava/util/Queue;

    .line 77
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->e:Ljava/util/Queue;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->e:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 78
    :goto_1
    if-eqz v0, :cond_1

    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move v0, v2

    .line 92
    :goto_2
    if-eqz v0, :cond_0

    goto :goto_0

    .line 77
    :cond_4
    const/4 v0, 0x0

    goto :goto_1

    .line 1248
    :pswitch_1
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1252
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    if-nez v0, :cond_5

    .line 1253
    new-instance v0, Lcom/mopub/mobileads/MoPubView;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    invoke-direct {v0, v3}, Lcom/mopub/mobileads/MoPubView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    .line 1254
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    const-string v3, "51dade5b672d44b2a947e031083cec8f"

    invoke-virtual {v0, v3}, Lcom/mopub/mobileads/MoPubView;->setAdUnitId(Ljava/lang/String;)V

    .line 1255
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    new-instance v3, Lcom/roidapp/photogrid/cloud/c;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/cloud/c;-><init>(Lcom/roidapp/photogrid/cloud/a;)V

    invoke-virtual {v0, v3}, Lcom/mopub/mobileads/MoPubView;->setBannerAdListener(Lcom/mopub/mobileads/MoPubView$BannerAdListener;)V

    .line 1289
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    const/4 v4, -0x1

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    const/high16 v6, 0x42480000    # 50.0f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v0, v3, v4, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 1290
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->loadAd()V

    move v0, v1

    .line 1292
    goto :goto_2

    :cond_5
    move v0, v2

    .line 1294
    goto :goto_2

    .line 2150
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/common/a;->b:Z

    if-eqz v0, :cond_6

    move v0, v2

    .line 2151
    goto :goto_2

    .line 2153
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    if-nez v0, :cond_7

    .line 2154
    new-instance v0, Lcom/roidapp/cloudlib/ads/e;

    new-instance v3, Lcom/roidapp/photogrid/cloud/d;

    invoke-direct {v3, p0, v2}, Lcom/roidapp/photogrid/cloud/d;-><init>(Lcom/roidapp/photogrid/cloud/a;B)V

    invoke-direct {v0, p0, v3}, Lcom/roidapp/cloudlib/ads/e;-><init>(Ljava/lang/Object;Lcom/roidapp/cloudlib/ads/g;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    .line 2156
    :cond_7
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    const v4, 0x9c45

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/cloudlib/ads/f;->a(Landroid/content/Context;I)Lcom/cmcm/adsdk/f;

    move-result-object v0

    .line 2157
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    invoke-virtual {v0, v3}, Lcom/cmcm/adsdk/f;->a(Lcom/cmcm/a/a/d;)V

    .line 2159
    invoke-virtual {v0}, Lcom/cmcm/adsdk/f;->a()V

    move v0, v1

    .line 2160
    goto :goto_2

    .line 89
    :pswitch_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a;->f()Z

    move-result v0

    goto :goto_2

    .line 81
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/a;)Lcom/mopub/mobileads/MoPubView;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    return-object v0
.end method

.method private f()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 101
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v1

    iget-boolean v1, v1, Lcom/roidapp/photogrid/common/a;->a:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->f:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 146
    :cond_0
    :goto_0
    return v0

    .line 106
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    if-nez v1, :cond_0

    .line 107
    new-instance v1, Lcom/google/android/gms/ads/AdView;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    .line 108
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    sget-object v2, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 109
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdUnitId(Ljava/lang/String;)V

    .line 110
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    new-instance v2, Lcom/roidapp/photogrid/cloud/b;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/b;-><init>(Lcom/roidapp/photogrid/cloud/a;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 137
    new-instance v1, Lcom/roidapp/photogrid/release/lp;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lp;-><init>()V

    .line 138
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    invoke-static {v1, v2, v3}, Lcom/roidapp/photogrid/release/lp;->a(Landroid/app/Activity;Lcom/google/android/gms/ads/AdView;Landroid/widget/LinearLayout;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 139
    const/4 v0, 0x1

    goto :goto_0

    .line 142
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Error;->printStackTrace()V

    goto :goto_0

    .line 144
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/cloud/a;)Lcom/mopub/mobileads/MoPubView;
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/e;->b()V

    .line 307
    :cond_0
    return-void
.end method

.method public final a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    .line 64
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    .line 65
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/a;->f:Ljava/lang/String;

    .line 66
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a;->e()V

    .line 67
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/e;->c()V

    .line 319
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 325
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 327
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    .line 330
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 331
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->destroy()V

    .line 332
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->c:Lcom/google/android/gms/ads/AdView;

    .line 334
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    if-eqz v0, :cond_2

    .line 335
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->destroy()V

    .line 336
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->d:Lcom/mopub/mobileads/MoPubView;

    .line 338
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    if-eqz v0, :cond_3

    .line 339
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/e;->e()V

    .line 340
    :cond_3
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->g:Lcom/roidapp/cloudlib/ads/e;

    .line 341
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a;->a:Landroid/app/Activity;

    .line 342
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 348
    :cond_0
    return-void
.end method
