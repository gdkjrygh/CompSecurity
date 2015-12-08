.class public Lcom/mopub/nativeads/MoPubStreamAdPlacer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONTENT_VIEW_TYPE:I

.field private static final a:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private final d:Ljava/lang/Runnable;

.field private final e:Lcom/mopub/nativeads/PositioningSource;

.field private final f:Lcom/mopub/nativeads/ae;

.field private final g:Lcom/mopub/nativeads/h;

.field private final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/mopub/nativeads/NativeResponse;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Lcom/mopub/nativeads/aq;

.field private l:Z

.field private m:Z

.field private n:Lcom/mopub/nativeads/aq;

.field private o:Lcom/mopub/nativeads/MoPubAdRenderer;

.field private p:Ljava/lang/String;

.field private q:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

.field private r:I

.field private s:I

.field private t:I

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    new-instance v0, Lcom/mopub/nativeads/y;

    invoke-direct {v0}, Lcom/mopub/nativeads/y;-><init>()V

    sput-object v0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 98
    invoke-static {}, Lcom/mopub/nativeads/MoPubNativeAdPositioning;->serverPositioning()Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;-><init>(Landroid/content/Context;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;)V

    .line 99
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V
    .locals 3

    .prologue
    .line 127
    new-instance v0, Lcom/mopub/nativeads/ae;

    invoke-direct {v0}, Lcom/mopub/nativeads/ae;-><init>()V

    new-instance v1, Lcom/mopub/nativeads/h;

    invoke-direct {v1, p1}, Lcom/mopub/nativeads/h;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/mopub/nativeads/e;

    invoke-direct {v2, p2}, Lcom/mopub/nativeads/e;-><init>(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;-><init>(Landroid/content/Context;Lcom/mopub/nativeads/ae;Lcom/mopub/nativeads/h;Lcom/mopub/nativeads/PositioningSource;)V

    .line 131
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;)V
    .locals 3

    .prologue
    .line 110
    new-instance v0, Lcom/mopub/nativeads/ae;

    invoke-direct {v0}, Lcom/mopub/nativeads/ae;-><init>()V

    new-instance v1, Lcom/mopub/nativeads/h;

    invoke-direct {v1, p1}, Lcom/mopub/nativeads/h;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/mopub/nativeads/as;

    invoke-direct {v2, p1}, Lcom/mopub/nativeads/as;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;-><init>(Landroid/content/Context;Lcom/mopub/nativeads/ae;Lcom/mopub/nativeads/h;Lcom/mopub/nativeads/PositioningSource;)V

    .line 114
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/mopub/nativeads/ae;Lcom/mopub/nativeads/h;Lcom/mopub/nativeads/PositioningSource;)V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    sget-object v0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->q:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    .line 138
    const-string v0, "context is not allowed to be null"

    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    const-string v0, "adSource is not allowed to be null"

    invoke-static {p2, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    const-string v0, "impressionTracker is not allowed to be null"

    invoke-static {p3, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    const-string v0, "positioningSource is not allowed to be null"

    invoke-static {p4, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->b:Landroid/content/Context;

    .line 146
    iput-object p3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->g:Lcom/mopub/nativeads/h;

    .line 147
    iput-object p4, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->e:Lcom/mopub/nativeads/PositioningSource;

    .line 148
    iput-object p2, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->f:Lcom/mopub/nativeads/ae;

    .line 149
    invoke-static {}, Lcom/mopub/nativeads/aq;->a()Lcom/mopub/nativeads/aq;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    .line 151
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->i:Ljava/util/WeakHashMap;

    .line 152
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->h:Ljava/util/HashMap;

    .line 154
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->c:Landroid/os/Handler;

    .line 155
    new-instance v0, Lcom/mopub/nativeads/z;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/z;-><init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->d:Ljava/lang/Runnable;

    .line 166
    iput v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->r:I

    .line 167
    iput v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->s:I

    .line 168
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 710
    if-nez p1, :cond_1

    .line 720
    :cond_0
    :goto_0
    return-void

    .line 713
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->g:Lcom/mopub/nativeads/h;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/h;->a(Landroid/view/View;)V

    .line 714
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->i:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/NativeResponse;

    .line 715
    if-eqz v0, :cond_0

    .line 716
    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/NativeResponse;->clear(Landroid/view/View;)V

    .line 717
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->i:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->h:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private a(Lcom/mopub/nativeads/aq;)V
    .locals 2

    .prologue
    .line 298
    const/4 v0, 0x0

    iget v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    invoke-virtual {p0, v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->removeAdsInRange(II)I

    .line 300
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    .line 301
    invoke-direct {p0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->c()V

    .line 302
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->m:Z

    .line 303
    return-void
.end method

.method private a(II)Z
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 663
    add-int/lit8 v0, p2, -0x1

    .line 664
    :goto_0
    if-gt p1, v0, :cond_3

    const/4 v3, -0x1

    if-eq p1, v3, :cond_3

    .line 665
    iget v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    if-ge p1, v3, :cond_3

    .line 668
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v3, p1}, Lcom/mopub/nativeads/aq;->a(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 2687
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->f:Lcom/mopub/nativeads/ae;

    invoke-virtual {v3}, Lcom/mopub/nativeads/ae;->b()Lcom/mopub/nativeads/NativeResponse;

    move-result-object v3

    .line 2688
    if-nez v3, :cond_0

    move v3, v1

    .line 669
    :goto_1
    if-nez v3, :cond_1

    move v0, v1

    .line 676
    :goto_2
    return v0

    .line 2702
    :cond_0
    iget-object v4, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->p:Ljava/lang/String;

    invoke-static {v4}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 2703
    iget-object v4, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->o:Lcom/mopub/nativeads/MoPubAdRenderer;

    invoke-static {v4}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 2706
    new-instance v4, Lcom/mopub/nativeads/ac;

    iget-object v5, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->p:Ljava/lang/String;

    iget-object v6, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->o:Lcom/mopub/nativeads/MoPubAdRenderer;

    invoke-direct {v4, v5, v6, v3}, Lcom/mopub/nativeads/ac;-><init>(Ljava/lang/String;Lcom/mopub/nativeads/MoPubAdRenderer;Lcom/mopub/nativeads/NativeResponse;)V

    .line 2693
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v3, p1, v4}, Lcom/mopub/nativeads/aq;->a(ILcom/mopub/nativeads/ac;)V

    .line 2694
    iget v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    .line 2696
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->q:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    invoke-interface {v3, p1}, Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;->onAdLoaded(I)V

    move v3, v2

    .line 2697
    goto :goto_1

    .line 672
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 674
    :cond_2
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v3, p1}, Lcom/mopub/nativeads/aq;->b(I)I

    move-result p1

    goto :goto_0

    :cond_3
    move v0, v2

    .line 676
    goto :goto_2
.end method

.method static synthetic a(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->u:Z

    return v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 629
    iget-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->u:Z

    if-eqz v0, :cond_0

    .line 636
    :goto_0
    return-void

    .line 632
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->u:Z

    .line 635
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method static synthetic b(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->c()V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 643
    iget v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->r:I

    iget v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->s:I

    invoke-direct {p0, v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 651
    :goto_0
    return-void

    .line 650
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->s:I

    iget v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->s:I

    add-int/lit8 v1, v1, 0xa

    invoke-direct {p0, v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a(II)Z

    goto :goto_0
.end method

.method static synthetic c(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)Z
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->u:Z

    return v0
.end method


# virtual methods
.method final a()V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 283
    iget-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->m:Z

    if-eqz v0, :cond_0

    .line 284
    invoke-direct {p0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->b()V

    .line 293
    :goto_0
    return-void

    .line 289
    :cond_0
    iget-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->j:Z

    if-eqz v0, :cond_1

    .line 290
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->k:Lcom/mopub/nativeads/aq;

    invoke-direct {p0, v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a(Lcom/mopub/nativeads/aq;)V

    .line 292
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->l:Z

    goto :goto_0
.end method

.method final a(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 271
    invoke-static {p1}, Lcom/mopub/nativeads/aq;->a(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)Lcom/mopub/nativeads/aq;

    move-result-object v0

    .line 272
    iget-boolean v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->l:Z

    if-eqz v1, :cond_0

    .line 273
    invoke-direct {p0, v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a(Lcom/mopub/nativeads/aq;)V

    .line 277
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->j:Z

    .line 278
    return-void

    .line 275
    :cond_0
    iput-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->k:Lcom/mopub/nativeads/aq;

    goto :goto_0
.end method

.method public clearAds()V
    .locals 2

    .prologue
    .line 355
    const/4 v0, 0x0

    iget v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    invoke-virtual {p0, v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->removeAdsInRange(II)I

    .line 356
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->f:Lcom/mopub/nativeads/ae;

    invoke-virtual {v0}, Lcom/mopub/nativeads/ae;->a()V

    .line 357
    return-void
.end method

.method public destroy()V
    .locals 2

    .prologue
    .line 369
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 370
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->f:Lcom/mopub/nativeads/ae;

    invoke-virtual {v0}, Lcom/mopub/nativeads/ae;->a()V

    .line 371
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->g:Lcom/mopub/nativeads/h;

    invoke-virtual {v0}, Lcom/mopub/nativeads/h;->a()V

    .line 372
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0}, Lcom/mopub/nativeads/aq;->c()V

    .line 373
    return-void
.end method

.method public getAdData(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->d(I)Lcom/mopub/nativeads/ac;

    move-result-object v0

    return-object v0
.end method

.method public getAdView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 404
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->d(I)Lcom/mopub/nativeads/ac;

    move-result-object v0

    .line 405
    if-nez v0, :cond_0

    .line 427
    :goto_0
    return-object v1

    .line 409
    :cond_0
    invoke-virtual {v0}, Lcom/mopub/nativeads/ac;->a()Lcom/mopub/nativeads/MoPubAdRenderer;

    move-result-object v2

    .line 410
    if-eqz p2, :cond_3

    .line 413
    :goto_1
    invoke-virtual {v0}, Lcom/mopub/nativeads/ac;->b()Lcom/mopub/nativeads/NativeResponse;

    move-result-object v3

    .line 414
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->h:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 416
    if-eqz v0, :cond_4

    .line 417
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 419
    :goto_2
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 420
    invoke-direct {p0, v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a(Landroid/view/View;)V

    .line 421
    invoke-direct {p0, p2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a(Landroid/view/View;)V

    .line 1723
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->h:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1724
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->i:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1725
    invoke-virtual {v3}, Lcom/mopub/nativeads/NativeResponse;->isOverridingImpressionTracker()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1726
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->g:Lcom/mopub/nativeads/h;

    invoke-virtual {v0, p2, v3}, Lcom/mopub/nativeads/h;->a(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;)V

    .line 1728
    :cond_1
    invoke-virtual {v3, p2}, Lcom/mopub/nativeads/NativeResponse;->prepare(Landroid/view/View;)V

    .line 424
    invoke-interface {v2, p2, v3}, Lcom/mopub/nativeads/MoPubAdRenderer;->renderAdView(Landroid/view/View;Ljava/lang/Object;)V

    :cond_2
    move-object v1, p2

    .line 427
    goto :goto_0

    .line 410
    :cond_3
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->b:Landroid/content/Context;

    invoke-interface {v2, v3, p3}, Lcom/mopub/nativeads/MoPubAdRenderer;->createAdView(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_2
.end method

.method public getAdViewType(I)I
    .locals 1

    .prologue
    .line 496
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->isAd(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAdViewTypeCount()I
    .locals 1

    .prologue
    .line 479
    const/4 v0, 0x1

    return v0
.end method

.method public getAdjustedCount(I)I
    .locals 1

    .prologue
    .line 542
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->g(I)I

    move-result v0

    return v0
.end method

.method public getAdjustedPosition(I)I
    .locals 1

    .prologue
    .line 522
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->f(I)I

    move-result v0

    return v0
.end method

.method public getOriginalCount(I)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 532
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    .line 2321
    if-nez p1, :cond_1

    .line 2322
    const/4 v0, 0x0

    .line 2327
    :cond_0
    :goto_0
    return v0

    .line 2326
    :cond_1
    add-int/lit8 v2, p1, -0x1

    invoke-virtual {v1, v2}, Lcom/mopub/nativeads/aq;->e(I)I

    move-result v1

    .line 2327
    if-eq v1, v0, :cond_0

    add-int/lit8 v0, v1, 0x1

    .line 532
    goto :goto_0
.end method

.method public getOriginalPosition(I)I
    .locals 1

    .prologue
    .line 512
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->e(I)I

    move-result v0

    return v0
.end method

.method public insertItem(I)V
    .locals 1

    .prologue
    .line 581
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->h(I)V

    .line 582
    return-void
.end method

.method public isAd(I)Z
    .locals 1

    .prologue
    .line 342
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->c(I)Z

    move-result v0

    return v0
.end method

.method public loadAds(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 211
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->loadAds(Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V

    .line 212
    return-void
.end method

.method public loadAds(Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 230
    const-string v0, "Cannot load ads with a null ad unit ID"

    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    :goto_0
    return-void

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->o:Lcom/mopub/nativeads/MoPubAdRenderer;

    if-nez v0, :cond_1

    .line 235
    const-string v0, "You must call registerAdRenderer before loading ads"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 239
    :cond_1
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->p:Ljava/lang/String;

    .line 241
    iput-boolean v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->m:Z

    .line 242
    iput-boolean v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->j:Z

    .line 243
    iput-boolean v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->l:Z

    .line 245
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->e:Lcom/mopub/nativeads/PositioningSource;

    new-instance v1, Lcom/mopub/nativeads/aa;

    invoke-direct {v1, p0}, Lcom/mopub/nativeads/aa;-><init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)V

    invoke-interface {v0, p1, v1}, Lcom/mopub/nativeads/PositioningSource;->loadPositions(Ljava/lang/String;Lcom/mopub/nativeads/PositioningSource$PositioningListener;)V

    .line 259
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->f:Lcom/mopub/nativeads/ae;

    new-instance v1, Lcom/mopub/nativeads/ab;

    invoke-direct {v1, p0}, Lcom/mopub/nativeads/ab;-><init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;)V

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/ae;->a(Lcom/mopub/nativeads/ah;)V

    .line 266
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->f:Lcom/mopub/nativeads/ae;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Lcom/mopub/nativeads/ae;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V

    goto :goto_0
.end method

.method public moveItem(II)V
    .locals 1

    .prologue
    .line 624
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    .line 2468
    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->i(I)V

    .line 2469
    invoke-virtual {v0, p2}, Lcom/mopub/nativeads/aq;->h(I)V

    .line 625
    return-void
.end method

.method public placeAdsInRange(II)V
    .locals 1

    .prologue
    .line 326
    iput p1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->r:I

    .line 327
    add-int/lit8 v0, p1, 0x64

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->s:I

    .line 328
    invoke-direct {p0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->b()V

    .line 329
    return-void
.end method

.method public registerAdRenderer(Lcom/mopub/nativeads/MoPubAdRenderer;)V
    .locals 1

    .prologue
    .line 180
    const-string v0, "Cannot register a null adRenderer"

    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    :goto_0
    return-void

    .line 183
    :cond_0
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->o:Lcom/mopub/nativeads/MoPubAdRenderer;

    goto :goto_0
.end method

.method public removeAdsInRange(II)I
    .locals 7

    .prologue
    .line 440
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0}, Lcom/mopub/nativeads/aq;->b()[I

    move-result-object v1

    .line 442
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->f(I)I

    move-result v2

    .line 443
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p2}, Lcom/mopub/nativeads/aq;->f(I)I

    move-result v3

    .line 445
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 448
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 449
    aget v5, v1, v0

    .line 450
    if-lt v5, v2, :cond_1

    if-ge v5, v3, :cond_1

    .line 454
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    iget v6, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->r:I

    if-ge v5, v6, :cond_0

    .line 459
    iget v5, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->r:I

    add-int/lit8 v5, v5, -0x1

    iput v5, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->r:I

    .line 461
    :cond_0
    iget v5, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    add-int/lit8 v5, v5, -0x1

    iput v5, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    .line 448
    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 464
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, v2, v3}, Lcom/mopub/nativeads/aq;->a(II)I

    move-result v1

    .line 465
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 466
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->q:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    invoke-interface {v3, v0}, Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;->onAdRemoved(I)V

    goto :goto_1

    .line 468
    :cond_3
    return v1
.end method

.method public removeItem(I)V
    .locals 1

    .prologue
    .line 602
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->i(I)V

    .line 603
    return-void
.end method

.method public setAdLoadedListener(Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;)V
    .locals 0

    .prologue
    .line 199
    if-nez p1, :cond_0

    sget-object p1, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->a:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    :cond_0
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->q:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    .line 200
    return-void
.end method

.method public setItemCount(I)V
    .locals 1

    .prologue
    .line 555
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->n:Lcom/mopub/nativeads/aq;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/aq;->g(I)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->t:I

    .line 558
    iget-boolean v0, p0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->m:Z

    if-eqz v0, :cond_0

    .line 559
    invoke-direct {p0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->b()V

    .line 561
    :cond_0
    return-void
.end method
