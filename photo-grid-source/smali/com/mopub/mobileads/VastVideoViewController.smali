.class public Lcom/mopub/mobileads/VastVideoViewController;
.super Lcom/mopub/mobileads/BaseVideoViewController;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/common/DownloadTask$DownloadTaskListener;


# instance fields
.field private final a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

.field private final b:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

.field private final c:Lcom/mopub/mobileads/aq;

.field private final d:Landroid/widget/VideoView;

.field private final e:Landroid/widget/ImageView;

.field private final f:Landroid/view/View$OnTouchListener;

.field private final g:Landroid/os/Handler;

.field private final h:Ljava/lang/Runnable;

.field private i:Z

.field private j:I

.field private k:Z

.field private l:I

.field private m:Z

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Bundle;JLcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;)V
    .locals 9

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, -0x1

    const/4 v4, 0x0

    .line 101
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, p1, v0, p5}, Lcom/mopub/mobileads/BaseVideoViewController;-><init>(Landroid/content/Context;Ljava/lang/Long;Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;)V

    .line 83
    const/16 v0, 0x1388

    iput v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->j:I

    .line 94
    iput-boolean v4, p0, Lcom/mopub/mobileads/VastVideoViewController;->q:Z

    .line 102
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->g:Landroid/os/Handler;

    .line 103
    iput-boolean v4, p0, Lcom/mopub/mobileads/VastVideoViewController;->i:Z

    .line 104
    iput v5, p0, Lcom/mopub/mobileads/VastVideoViewController;->l:I

    .line 105
    iput v4, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    .line 107
    const-string v0, "vast_video_configuration"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    .line 108
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    if-eqz v1, :cond_0

    .line 109
    check-cast v0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    .line 114
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getDiskMediaFileUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 115
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "VastVideoConfiguration does not have a video disk path"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 111
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "VastVideoConfiguration is invalid"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getVastCompanionAd()Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->b:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    .line 120
    new-instance v0, Lcom/mopub/mobileads/as;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/as;-><init>(Lcom/mopub/mobileads/VastVideoViewController;)V

    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->f:Landroid/view/View$OnTouchListener;

    .line 1388
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    new-array v2, v7, [I

    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    aput v3, v2, v4

    const/16 v3, 0xff

    invoke-static {v3, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    aput v3, v2, v6

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 1392
    new-array v1, v7, [Landroid/graphics/drawable/Drawable;

    .line 1393
    sget-object v2, Lcom/mopub/common/util/Drawables;->THATCHED_BACKGROUND:Lcom/mopub/common/util/Drawables;

    invoke-virtual {v2, p1}, Lcom/mopub/common/util/Drawables;->createDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v1, v4

    .line 1394
    aput-object v0, v1, v6

    .line 1395
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 1396
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->getLayout()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1438
    new-instance v0, Landroid/widget/VideoView;

    invoke-direct {v0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    .line 1439
    new-instance v1, Lcom/mopub/mobileads/aw;

    invoke-direct {v1, p0}, Lcom/mopub/mobileads/aw;-><init>(Lcom/mopub/mobileads/VastVideoViewController;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 1446
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->f:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1448
    new-instance v1, Lcom/mopub/mobileads/ax;

    invoke-direct {v1, p0, p1, v0}, Lcom/mopub/mobileads/ax;-><init>(Lcom/mopub/mobileads/VastVideoViewController;Landroid/content/Context;Landroid/widget/VideoView;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 1472
    new-instance v1, Lcom/mopub/mobileads/ay;

    invoke-direct {v1, p0}, Lcom/mopub/mobileads/ay;-><init>(Lcom/mopub/mobileads/VastVideoViewController;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 1487
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getDiskMediaFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V

    .line 135
    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    .line 136
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->requestFocus()Z

    .line 2400
    new-instance v0, Lcom/mopub/mobileads/aq;

    invoke-direct {v0, p1}, Lcom/mopub/mobileads/aq;-><init>(Landroid/content/Context;)V

    .line 2401
    new-instance v1, Lcom/mopub/mobileads/av;

    invoke-direct {v1, p0, p1}, Lcom/mopub/mobileads/av;-><init>(Lcom/mopub/mobileads/VastVideoViewController;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/aq;->a(Landroid/view/View$OnTouchListener;)V

    .line 2414
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->f:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/aq;->b(Landroid/view/View$OnTouchListener;)V

    .line 2417
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getCustomCtaText()Ljava/lang/String;

    move-result-object v1

    .line 2418
    if-eqz v1, :cond_2

    .line 2419
    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/aq;->a(Ljava/lang/String;)V

    .line 2423
    :cond_2
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getCustomSkipText()Ljava/lang/String;

    move-result-object v1

    .line 2424
    if-eqz v1, :cond_3

    .line 2425
    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/aq;->b(Ljava/lang/String;)V

    .line 2429
    :cond_3
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getCustomCloseIconUrl()Ljava/lang/String;

    move-result-object v1

    .line 2430
    if-eqz v1, :cond_4

    .line 2431
    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/aq;->c(Ljava/lang/String;)V

    .line 138
    :cond_4
    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->c:Lcom/mopub/mobileads/aq;

    .line 139
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->getLayout()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->c:Lcom/mopub/mobileads/aq;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2576
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2577
    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 2578
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 2582
    const/4 v2, 0x3

    iget-object v3, p0, Lcom/mopub/mobileads/VastVideoViewController;->c:Lcom/mopub/mobileads/aq;

    invoke-virtual {v3}, Lcom/mopub/mobileads/aq;->getId()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 2583
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->getLayout()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2585
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2587
    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2589
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 2594
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    iput-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    .line 3299
    new-instance v0, Lcom/mopub/mobileads/au;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/au;-><init>(Lcom/mopub/mobileads/VastVideoViewController;)V

    .line 142
    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->h:Ljava/lang/Runnable;

    .line 143
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/VastVideoViewController;II)Ljava/util/List;
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Lcom/mopub/mobileads/VastVideoViewController;->b(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(I)Z
    .locals 1

    .prologue
    .line 62
    .line 6599
    const/16 v0, 0x3e80

    if-lt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 62
    goto :goto_0
.end method

.method static synthetic a(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    .line 5612
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->k:Z

    .line 62
    return v0
.end method

.method static synthetic b(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    return-object v0
.end method

.method private b(II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 347
    if-lez p2, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkArgument(Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 348
    int-to-float v0, p1

    int-to-float v2, p2

    div-float v4, v0, v2

    .line 349
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 351
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getAbsoluteTrackers()Ljava/util/ArrayList;

    move-result-object v5

    .line 352
    new-instance v6, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;

    const-string v0, ""

    invoke-direct {v6, v0, p1}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;-><init>(Ljava/lang/String;I)V

    .line 353
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v3, v1

    .line 354
    :goto_1
    if-ge v3, v7, :cond_2

    .line 355
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;

    .line 356
    invoke-virtual {v0, v6}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->compareTo(Lcom/mopub/mobileads/VastAbsoluteProgressTracker;)I

    move-result v8

    if-gtz v8, :cond_2

    .line 359
    invoke-virtual {v0}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->isTracked()Z

    move-result v8

    if-nez v8, :cond_0

    .line 360
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    :cond_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_1
    move v0, v1

    .line 347
    goto :goto_0

    .line 364
    :cond_2
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getFractionalTrackers()Ljava/util/ArrayList;

    move-result-object v3

    .line 365
    new-instance v5, Lcom/mopub/mobileads/VastFractionalProgressTracker;

    const-string v0, ""

    invoke-direct {v5, v0, v4}, Lcom/mopub/mobileads/VastFractionalProgressTracker;-><init>(Ljava/lang/String;F)V

    .line 366
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 367
    :goto_2
    if-ge v1, v4, :cond_4

    .line 368
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/VastFractionalProgressTracker;

    .line 369
    invoke-virtual {v0, v5}, Lcom/mopub/mobileads/VastFractionalProgressTracker;->compareTo(Lcom/mopub/mobileads/VastFractionalProgressTracker;)I

    move-result v6

    if-gtz v6, :cond_4

    .line 372
    invoke-virtual {v0}, Lcom/mopub/mobileads/VastFractionalProgressTracker;->isTracked()Z

    move-result v6

    if-nez v6, :cond_3

    .line 373
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 367
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    move-object v0, v2

    .line 379
    :goto_3
    return-object v0

    :cond_5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_3
.end method

.method static synthetic c(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/util/vast/VastCompanionAd;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->b:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    return-object v0
.end method

.method static synthetic d(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/VideoView;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    return-object v0
.end method

.method static synthetic e(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->q:Z

    return v0
.end method

.method static synthetic f(Lcom/mopub/mobileads/VastVideoViewController;)I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->j:I

    return v0
.end method

.method static synthetic g(Lcom/mopub/mobileads/VastVideoViewController;)Lcom/mopub/mobileads/aq;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->c:Lcom/mopub/mobileads/aq;

    return-object v0
.end method

.method static synthetic h(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 2

    .prologue
    .line 62
    .line 6608
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    iget v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->j:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 62
    goto :goto_0
.end method

.method private i()V
    .locals 2

    .prologue
    .line 623
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->i:Z

    if-eqz v0, :cond_0

    .line 624
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->i:Z

    .line 625
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 627
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/mopub/mobileads/VastVideoViewController;)V
    .locals 1

    .prologue
    .line 62
    .line 7603
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->k:Z

    .line 7604
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->c:Lcom/mopub/mobileads/aq;

    invoke-virtual {v0}, Lcom/mopub/mobileads/aq;->a()V

    .line 62
    return-void
.end method

.method static synthetic j(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->i:Z

    return v0
.end method

.method static synthetic k(Lcom/mopub/mobileads/VastVideoViewController;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->h:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic l(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic m(Lcom/mopub/mobileads/VastVideoViewController;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 62
    .line 8262
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getDuration()I

    move-result v0

    .line 8265
    const/16 v1, 0x3e80

    if-ge v0, v1, :cond_0

    .line 8266
    iput v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->j:I

    .line 8270
    :cond_0
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getSkipOffset()Ljava/lang/String;

    move-result-object v1

    .line 8271
    if-eqz v1, :cond_1

    .line 8273
    :try_start_0
    invoke-static {v1}, Lcom/mopub/common/util/Strings;->isAbsoluteTracker(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 8274
    invoke-static {v1}, Lcom/mopub/common/util/Strings;->parseAbsoluteOffset(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 8275
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ge v3, v0, :cond_1

    .line 8276
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->j:I

    .line 8277
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->q:Z

    .line 8291
    :cond_1
    :goto_0
    return-void

    .line 8279
    :cond_2
    invoke-static {v1}, Lcom/mopub/common/util/Strings;->isPercentageTracker(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 8280
    const-string v2, "%"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    .line 8281
    int-to-float v3, v0

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 8282
    if-ge v2, v0, :cond_1

    .line 8283
    iput v2, p0, Lcom/mopub/mobileads/VastVideoViewController;->j:I

    .line 8284
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->q:Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 8290
    :catch_0
    move-exception v0

    const-string v0, "Failed to parse skipoffset %s"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v5

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 8287
    :cond_3
    :try_start_1
    const-string v0, "Invalid VAST skipoffset format: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method static synthetic n(Lcom/mopub/mobileads/VastVideoViewController;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/mopub/mobileads/VastVideoViewController;->i()V

    return-void
.end method

.method static synthetic o(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->m:Z

    return v0
.end method

.method static synthetic p(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->o:Z

    return v0
.end method

.method static synthetic q(Lcom/mopub/mobileads/VastVideoViewController;)I
    .locals 1

    .prologue
    const v0, 0x7fffffff

    .line 62
    .line 8384
    invoke-direct {p0, v0, v0}, Lcom/mopub/mobileads/VastVideoViewController;->b(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 62
    return v0
.end method

.method static synthetic r(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->p:Z

    return v0
.end method

.method static synthetic s(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->p:Z

    return v0
.end method

.method static synthetic t(Lcom/mopub/mobileads/VastVideoViewController;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic u(Lcom/mopub/mobileads/VastVideoViewController;)Z
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->o:Z

    return v0
.end method


# virtual methods
.method protected final a()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 152
    invoke-super {p0}, Lcom/mopub/mobileads/BaseVideoViewController;->a()V

    .line 154
    sget-object v0, Lcom/mopub/mobileads/az;->a:[I

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getCustomForceOrientation()Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 4250
    :goto_0
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->b:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    if-eqz v0, :cond_0

    .line 4252
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->b:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastCompanionAd;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->g()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/common/HttpClient;->initializeHttpGet(Ljava/lang/String;Landroid/content/Context;)Lorg/apache/http/client/methods/HttpGet;

    move-result-object v0

    .line 4253
    new-instance v1, Lcom/mopub/common/DownloadTask;

    invoke-direct {v1, p0}, Lcom/mopub/common/DownloadTask;-><init>(Lcom/mopub/common/DownloadTask$DownloadTaskListener;)V

    .line 4254
    const/4 v2, 0x1

    new-array v2, v2, [Lorg/apache/http/client/methods/HttpUriRequest;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getImpressionTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->g()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/mopub/common/event/BaseEvent$Name;->IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {v0, v1, v2}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 176
    const-string v0, "com.mopub.action.interstitial.show"

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoViewController;->a(Ljava/lang/String;)V

    .line 177
    return-void

    .line 156
    :pswitch_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->f()Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;->onSetRequestedOrientation(I)V

    goto :goto_0

    .line 159
    :pswitch_1
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->f()Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;->onSetRequestedOrientation(I)V

    goto :goto_0

    .line 4255
    :catch_0
    move-exception v0

    .line 4256
    const-string v1, "Failed to download companion ad"

    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 154
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method final a(II)V
    .locals 1

    .prologue
    .line 213
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 214
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->f()Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;->onFinish()V

    .line 216
    :cond_0
    return-void
.end method

.method final a(Ljava/util/List;Ljava/lang/String;)V
    .locals 4
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 535
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->g()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {p1, v0, v1}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 537
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 573
    :goto_0
    return-void

    .line 541
    :cond_0
    const-string v0, "com.mopub.action.interstitial.click"

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoViewController;->a(Ljava/lang/String;)V

    .line 543
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->isAboutScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 544
    const-string v0, "Link to about page ignored."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 548
    :cond_1
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->isNativeBrowserScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 550
    :try_start_0
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->intentForNativeBrowserScheme(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 551
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->g()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/mopub/common/util/Intents;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catch Lcom/mopub/exceptions/UrlParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mopub/exceptions/IntentNotResolvableException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 554
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/mopub/exceptions/UrlParseException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 555
    :catch_1
    move-exception v0

    .line 556
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not handle intent for URI: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/mopub/exceptions/IntentNotResolvableException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 563
    :cond_2
    invoke-static {p2}, Lcom/mopub/common/util/Intents;->isHttpUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 564
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 565
    const-string v1, "URL"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->f()Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    move-result-object v1

    const-class v2, Lcom/mopub/common/MoPubBrowser;

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3, v0}, Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;->onStartActivityForResult(Ljava/lang/Class;ILandroid/os/Bundle;)V

    goto :goto_0

    .line 572
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Link ignored. Unable to handle url: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method final a(Landroid/media/MediaPlayer;II)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 499
    invoke-static {}, Lcom/mopub/common/util/VersionCode;->currentApiLevel()Lcom/mopub/common/util/VersionCode;

    move-result-object v2

    sget-object v3, Lcom/mopub/common/util/VersionCode;->JELLY_BEAN:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {v2, v3}, Lcom/mopub/common/util/VersionCode;->isBelow(Lcom/mopub/common/util/VersionCode;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-ne p2, v0, :cond_0

    const/high16 v2, -0x80000000

    if-ne p3, v2, :cond_0

    iget v2, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    if-gtz v2, :cond_0

    .line 504
    const/4 v3, 0x0

    .line 506
    :try_start_0
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    .line 507
    new-instance v4, Ljava/io/File;

    iget-object v2, p0, Lcom/mopub/mobileads/VastVideoViewController;->a:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-virtual {v2}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getDiskMediaFileUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 508
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 509
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 516
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 517
    iget-object v3, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    invoke-virtual {v3}, Landroid/widget/VideoView;->start()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 522
    invoke-static {v2}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 523
    iget v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    .line 526
    :goto_0
    return v0

    .line 522
    :catch_0
    move-exception v0

    move-object v0, v3

    :goto_1
    invoke-static {v0}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 523
    iget v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    move v0, v1

    goto :goto_0

    .line 522
    :catchall_0
    move-exception v0

    :goto_2
    invoke-static {v3}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 523
    iget v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    throw v0

    :cond_0
    move v0, v1

    .line 526
    goto :goto_0

    .line 522
    :catchall_1
    move-exception v0

    move-object v3, v2

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v0, v2

    goto :goto_1
.end method

.method protected final b()Landroid/widget/VideoView;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    return-object v0
.end method

.method public backButtonEnabled()Z
    .locals 1

    .prologue
    .line 208
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->k:Z

    return v0
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 194
    invoke-direct {p0}, Lcom/mopub/mobileads/VastVideoViewController;->i()V

    .line 195
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->l:I

    .line 196
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    .line 197
    return-void
.end method

.method protected final d()V
    .locals 2

    .prologue
    .line 183
    const/4 v0, 0x0

    iput v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->n:I

    .line 4616
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->i:Z

    if-nez v0, :cond_0

    .line 4617
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->i:Z

    .line 4618
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    iget v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->l:I

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    .line 187
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->m:Z

    if-nez v0, :cond_1

    .line 188
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->d:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 190
    :cond_1
    return-void
.end method

.method protected final e()V
    .locals 1

    .prologue
    .line 201
    invoke-direct {p0}, Lcom/mopub/mobileads/VastVideoViewController;->i()V

    .line 202
    const-string v0, "com.mopub.action.interstitial.dismiss"

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoViewController;->a(Ljava/lang/String;)V

    .line 203
    return-void
.end method

.method public onComplete(Ljava/lang/String;Lcom/mopub/common/DownloadResponse;)V
    .locals 5

    .prologue
    .line 221
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/mopub/common/DownloadResponse;->getStatusCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1

    .line 222
    invoke-static {p2}, Lcom/mopub/common/HttpResponses;->asBitmap(Lcom/mopub/common/DownloadResponse;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 223
    if-eqz v0, :cond_1

    .line 225
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->g()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v1

    .line 226
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoViewController;->g()Landroid/content/Context;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v2

    .line 227
    iget-object v3, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v3

    .line 228
    iget-object v4, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v4

    .line 229
    if-ge v1, v3, :cond_0

    if-ge v2, v4, :cond_0

    .line 230
    iget-object v3, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 231
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 233
    :cond_0
    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 234
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoViewController;->e:Landroid/widget/ImageView;

    new-instance v1, Lcom/mopub/mobileads/at;

    invoke-direct {v1, p0}, Lcom/mopub/mobileads/at;-><init>(Lcom/mopub/mobileads/VastVideoViewController;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    :cond_1
    return-void
.end method
