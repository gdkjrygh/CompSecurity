.class public Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "TourDetailFragment.java"


# static fields
.field private static final KEY_ADDRESS1:Ljava/lang/String; = "address1"

.field private static final KEY_ADDRESS2:Ljava/lang/String; = "address2"

.field private static final KEY_CITY:Ljava/lang/String; = "city"

.field private static final KEY_DESCRIPTION:Ljava/lang/String; = "description"

.field private static final KEY_ID:Ljava/lang/String; = "id"

.field private static final KEY_IMAGE_URL:Ljava/lang/String; = "image_url"

.field private static final KEY_LATITUDE:Ljava/lang/String; = "lat"

.field private static final KEY_LONGITUDE:Ljava/lang/String; = "lng"

.field private static final KEY_SHORT_DESCRIPTION:Ljava/lang/String; = "short_description"

.field private static final KEY_STATE:Ljava/lang/String; = "state"

.field private static final KEY_TITLE:Ljava/lang/String; = "title"

.field private static final KEY_TOUR_STOPS:Ljava/lang/String; = "tour_stops"

.field private static final KEY_ZIP:Ljava/lang/String; = "zip"

.field private static final TAG:Ljava/lang/String;

.field private static appContext:Landroid/content/Context;

.field private static mContext:Landroid/content/Context;


# instance fields
.field private address:Landroid/widget/TextView;

.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private bg:Landroid/view/View;

.field private closeButton:Landroid/widget/ImageView;

.field private defaultImage:Landroid/widget/ImageView;

.field private description:Landroid/widget/TextView;

.field private detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private detailBottomNav:Landroid/view/View;

.field private detailImage:Lcom/android/volley/toolbox/NetworkImageView;

.field private detailImageHolder:Landroid/view/ViewGroup;

.field private detailPhotoCredit:Landroid/widget/TextView;

.field private detailView:Landroid/view/ViewGroup;

.field private favoritesManager:Lcom/aetn/history/android/historyhere/model/FavoritesManager;

.field private imageMask:Landroid/widget/ImageView;

.field private mBeginningAnimationFinished:Z

.field private mDataLoaded:Z

.field private mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

.field private mProgressBar:Landroid/view/View;

.field private mScrollView:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

.field private mStartTourBtn:Landroid/widget/Button;

.field private mStopTotal:Landroid/widget/TextView;

.field private mThisView:Landroid/view/View;

.field private mTourStopsView:Landroid/view/ViewGroup;

.field private mainLayout:Landroid/view/ViewGroup;

.field private mileage:Landroid/widget/TextView;

.field private shareButton:Landroid/widget/ImageView;

.field private shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

.field private title:Landroid/widget/TextView;

.field private tourList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 40
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 103
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mDataLoaded:Z

    .line 104
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mBeginningAnimationFinished:Z

    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 40
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mDataLoaded:Z

    return v0
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->animateInBottomNav()V

    return-void
.end method

.method static synthetic access$202(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 40
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mBeginningAnimationFinished:Z

    return p1
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Landroid/widget/Button;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStartTourBtn:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$500(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object v0
.end method

.method static synthetic access$502(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;
    .param p1, "x1"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 40
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object p1
.end method

.method private animateInBottomNav()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 461
    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v3, "animateInBottomNav()"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailBottomNav:Landroid/view/View;

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 463
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailBottomNav:Landroid/view/View;

    const-string v3, "translationY"

    const/4 v4, 0x2

    new-array v4, v4, [F

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    const/high16 v6, 0x43480000    # 200.0f

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    aput v5, v4, v7

    const/4 v5, 0x1

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v6

    aput v6, v4, v5

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 464
    .local v0, "animNav":Landroid/animation/ObjectAnimator;
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 465
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 466
    .local v1, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 467
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 468
    return-void
.end method

.method private animateInMainLayout()V
    .locals 19

    .prologue
    .line 346
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 347
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 348
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->bg:Landroid/view/View;

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Landroid/view/View;->setVisibility(I)V

    .line 349
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailBottomNav:Landroid/view/View;

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Landroid/view/View;->setVisibility(I)V

    .line 350
    const/16 v6, 0x1f4

    .line 352
    .local v6, "mainSpeed":I
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v14

    const/high16 v15, -0x3b860000    # -1000.0f

    invoke-static {v14, v15}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v12

    .line 353
    .local v12, "startpointBG":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v14, v15}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v4

    .line 354
    .local v4, "endpointBG":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v14

    const/high16 v15, 0x447a0000    # 1000.0f

    invoke-static {v14, v15}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v13

    .line 355
    .local v13, "startpointMain":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v14, v15}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    .line 357
    .local v5, "endpointMain":F
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->bg:Landroid/view/View;

    const-string v15, "translationY"

    const/16 v16, 0x2

    move/from16 v0, v16

    new-array v0, v0, [F

    move-object/from16 v16, v0

    const/16 v17, 0x0

    aput v12, v16, v17

    const/16 v17, 0x1

    aput v4, v16, v17

    invoke-static/range {v14 .. v16}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 358
    .local v1, "animBgY":Landroid/animation/ObjectAnimator;
    int-to-long v14, v6

    invoke-virtual {v1, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 359
    new-instance v11, Landroid/animation/AnimatorSet;

    invoke-direct {v11}, Landroid/animation/AnimatorSet;-><init>()V

    .line 361
    .local v11, "set":Landroid/animation/AnimatorSet;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const-string v15, "translationY"

    const/16 v16, 0x2

    move/from16 v0, v16

    new-array v0, v0, [F

    move-object/from16 v16, v0

    const/16 v17, 0x0

    aput v13, v16, v17

    const/16 v17, 0x1

    aput v5, v16, v17

    invoke-static/range {v14 .. v16}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 362
    .local v3, "animator2":Landroid/animation/ObjectAnimator;
    int-to-long v14, v6

    invoke-virtual {v3, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 364
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    const-string v15, "alpha"

    const/16 v16, 0x2

    move/from16 v0, v16

    new-array v0, v0, [F

    move-object/from16 v16, v0

    fill-array-data v16, :array_0

    invoke-static/range {v14 .. v16}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 365
    .local v2, "animImageHolderAlpha":Landroid/animation/ObjectAnimator;
    const-wide/16 v14, 0x64

    invoke-virtual {v2, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 367
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    const-string v15, "scaleX"

    const/16 v16, 0x1

    move/from16 v0, v16

    new-array v0, v0, [F

    move-object/from16 v16, v0

    const/16 v17, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    invoke-static/range {v14 .. v16}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    .line 368
    .local v9, "photoScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v14, v6

    invoke-virtual {v9, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 369
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    const-string v15, "scaleY"

    const/16 v16, 0x1

    move/from16 v0, v16

    new-array v0, v0, [F

    move-object/from16 v16, v0

    const/16 v17, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    invoke-static/range {v14 .. v16}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 370
    .local v10, "photoScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v14, v6

    invoke-virtual {v10, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 372
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->imageMask:Landroid/widget/ImageView;

    const-string v15, "scaleX"

    const/16 v16, 0x1

    move/from16 v0, v16

    new-array v0, v0, [F

    move-object/from16 v16, v0

    const/16 v17, 0x0

    const/high16 v18, 0x3fe00000    # 1.75f

    aput v18, v16, v17

    invoke-static/range {v14 .. v16}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 373
    .local v7, "photoMaskScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v14, v6

    invoke-virtual {v7, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 374
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->imageMask:Landroid/widget/ImageView;

    const-string v15, "scaleY"

    const/16 v16, 0x1

    move/from16 v0, v16

    new-array v0, v0, [F

    move-object/from16 v16, v0

    const/16 v17, 0x0

    const/high16 v18, 0x3fe00000    # 1.75f

    aput v18, v16, v17

    invoke-static/range {v14 .. v16}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 375
    .local v8, "photoMaskScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v14, v6

    invoke-virtual {v8, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 377
    new-instance v14, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$1;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V

    invoke-virtual {v11, v14}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 405
    invoke-virtual {v11, v9}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v14

    invoke-virtual {v14, v10}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v14

    invoke-virtual {v14, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v14

    invoke-virtual {v14, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 406
    invoke-virtual {v11, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v14

    invoke-virtual {v14, v7}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v14

    invoke-virtual {v14, v8}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v14

    invoke-virtual {v14, v9}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 407
    invoke-virtual {v11}, Landroid/animation/AnimatorSet;->start()V

    .line 408
    return-void

    .line 364
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private animateOutMainLayout(Z)V
    .locals 18
    .param p1, "showTourInMap"    # Z

    .prologue
    .line 412
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 413
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->bg:Landroid/view/View;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Landroid/view/View;->setVisibility(I)V

    .line 414
    const/16 v8, 0x1f4

    .line 416
    .local v8, "mainSpeed":I
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v10

    .line 417
    .local v10, "startpointBG":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v12

    const/high16 v13, -0x3b860000    # -1000.0f

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v6

    .line 418
    .local v6, "endpointBG":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v11

    .line 419
    .local v11, "startpointMain":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v12

    const/high16 v13, 0x447a0000    # 1000.0f

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v7

    .line 420
    .local v7, "endpointMain":F
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->bg:Landroid/view/View;

    const-string v13, "translationY"

    const/4 v14, 0x2

    new-array v14, v14, [F

    const/4 v15, 0x0

    aput v10, v14, v15

    const/4 v15, 0x1

    aput v6, v14, v15

    invoke-static {v12, v13, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 421
    .local v2, "animator1":Landroid/animation/ObjectAnimator;
    const/4 v12, 0x0

    invoke-virtual {v2, v12}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 422
    int-to-long v12, v8

    invoke-virtual {v2, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 423
    new-instance v9, Landroid/animation/AnimatorSet;

    invoke-direct {v9}, Landroid/animation/AnimatorSet;-><init>()V

    .line 425
    .local v9, "set":Landroid/animation/AnimatorSet;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const-string v13, "translationY"

    const/4 v14, 0x2

    new-array v14, v14, [F

    const/4 v15, 0x0

    aput v11, v14, v15

    const/4 v15, 0x1

    aput v7, v14, v15

    invoke-static {v12, v13, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 426
    .local v3, "animator2":Landroid/animation/ObjectAnimator;
    const/4 v12, 0x0

    invoke-virtual {v3, v12}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 427
    int-to-long v12, v8

    invoke-virtual {v3, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 429
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    const-string v13, "alpha"

    const/4 v14, 0x2

    new-array v14, v14, [F

    fill-array-data v14, :array_0

    invoke-static {v12, v13, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 430
    .local v4, "animator3":Landroid/animation/ObjectAnimator;
    const/4 v12, 0x0

    invoke-virtual {v4, v12}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 431
    int-to-long v12, v8

    invoke-virtual {v4, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 433
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailBottomNav:Landroid/view/View;

    const-string v13, "translationY"

    const/4 v14, 0x2

    new-array v14, v14, [F

    const/4 v15, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v16

    const/16 v17, 0x0

    invoke-static/range {v16 .. v17}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v16

    aput v16, v14, v15

    const/4 v15, 0x1

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v16

    const/high16 v17, 0x43480000    # 200.0f

    invoke-static/range {v16 .. v17}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v16

    aput v16, v14, v15

    invoke-static {v12, v13, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 434
    .local v5, "animator4":Landroid/animation/ObjectAnimator;
    const/4 v12, 0x0

    invoke-virtual {v5, v12}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 435
    const-wide/16 v12, 0x1f4

    invoke-virtual {v5, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 437
    new-instance v12, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$2;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v12, v0, v1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;Z)V

    invoke-virtual {v9, v12}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 455
    invoke-virtual {v9, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v12

    invoke-virtual {v12, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v12

    invoke-virtual {v12, v5}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v12

    invoke-virtual {v12, v2}, Landroid/animation/AnimatorSet$Builder;->before(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 456
    invoke-virtual {v9}, Landroid/animation/AnimatorSet;->start()V

    .line 458
    return-void

    .line 429
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private animateStartTourButtonBigger()V
    .locals 0

    .prologue
    .line 557
    return-void
.end method

.method private initMainLayout()V
    .locals 5

    .prologue
    const/4 v2, 0x4

    const/high16 v4, 0x3e800000    # 0.25f

    .line 332
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 333
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->bg:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 334
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 335
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x447a0000    # 1000.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v0

    .line 336
    .local v0, "endpointMain":F
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setTranslationY(F)V

    .line 337
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailBottomNav:Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, 0x43480000    # 200.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 338
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->bg:Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, -0x3b860000    # -1000.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 339
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->imageMask:Landroid/widget/ImageView;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleY(F)V

    .line 340
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setScaleX(F)V

    .line 341
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setScaleY(F)V

    .line 342
    return-void
.end method

.method private makeDetailRequest()V
    .locals 3

    .prologue
    .line 234
    sget-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "makeDetailRequest():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mDataLoaded:Z

    if-eqz v0, :cond_0

    .line 244
    :goto_0
    return-void

    .line 237
    :cond_0
    sget-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v1, "makeDetailRequest:request detail"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 239
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d003e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->manageDetailNotLoaded(Ljava/lang/String;)V

    .line 240
    sget-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v1, "makeDetailRequest - no network connection"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 242
    :cond_1
    sget-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getTourPOIDetailFromService(Landroid/content/Context;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    goto :goto_0
.end method

.method public static newInstance(Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;
    .locals 5
    .param p0, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 108
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;-><init>()V

    .line 109
    .local v1, "f":Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 110
    .local v0, "args":Landroid/os/Bundle;
    const-string v2, "id"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v2, "title"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v2, "image_url"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v2, "short_description"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string v2, "description"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v2, "address1"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string v2, "address2"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress2()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v2, "city"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getCity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v2, "state"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v2, "zip"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getZip()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v2, "lat"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 121
    const-string v2, "lng"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 122
    const-string v2, "tour_stops"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPoiTourList()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 124
    return-object v1
.end method

.method private setDetailImageDimens()V
    .locals 4

    .prologue
    .line 224
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 225
    .local v0, "dm":Landroid/util/DisplayMetrics;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 226
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 227
    .local v2, "width":I
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 228
    .local v1, "lp":Landroid/widget/RelativeLayout$LayoutParams;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImage:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {v3, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->defaultImage:Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->imageMask:Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    return-void
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 478
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mScrollView:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$3;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->setOnScrollListener(Lcom/nirhart/parallaxscroll/views/ParallaxScrollView$OnScrollListener;)V

    .line 504
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setOnTourDetailLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;)V

    .line 528
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->closeButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$5;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 537
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shareButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$6;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$6;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 545
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStartTourBtn:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$7;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$7;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 551
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 129
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 130
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v6

    .line 131
    .local v6, "args":Landroid/os/Bundle;
    if-eqz v6, :cond_0

    .line 132
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 133
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "title"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "image_url"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "id"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "short_description"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setShortDescription(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "description"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setDescription(Ljava/lang/String;)V

    .line 138
    const-string v0, "address1"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 139
    .local v1, "address1":Ljava/lang/String;
    const-string v0, "address2"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 140
    .local v2, "address2":Ljava/lang/String;
    const-string v0, "city"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 141
    .local v3, "city":Ljava/lang/String;
    const-string v0, "state"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 142
    .local v4, "state":Ljava/lang/String;
    const-string v0, "zip"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 143
    .local v5, "zip":Ljava/lang/String;
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual/range {v0 .. v5}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "lat"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    const-string v9, "lng"

    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    invoke-virtual {v0, v7, v8, v9, v10}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 145
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "tour_stops"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTourListString(Ljava/lang/String;)V

    .line 147
    .end local v1    # "address1":Ljava/lang/String;
    .end local v2    # "address2":Ljava/lang/String;
    .end local v3    # "city":Ljava/lang/String;
    .end local v4    # "state":Ljava/lang/String;
    .end local v5    # "zip":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 155
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v2, "onCreateView()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const v1, 0x7f030053

    const/4 v2, 0x0

    invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 157
    .local v0, "view":Landroid/view/View;
    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mThisView:Landroid/view/View;

    .line 159
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sput-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    .line 160
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 161
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sput-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->appContext:Landroid/content/Context;

    .line 162
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .line 164
    const v1, 0x7f0a005b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailView:Landroid/view/ViewGroup;

    .line 165
    const v1, 0x7f0a0096

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStartTourBtn:Landroid/widget/Button;

    .line 166
    const v1, 0x7f0a00e3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mTourStopsView:Landroid/view/ViewGroup;

    .line 168
    const v1, 0x7f0a0041

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->title:Landroid/widget/TextView;

    .line 169
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->title:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypefaceSemibold(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 171
    const v1, 0x7f0a007f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/android/volley/toolbox/NetworkImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImage:Lcom/android/volley/toolbox/NetworkImageView;

    .line 172
    const v1, 0x7f0a007e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->defaultImage:Landroid/widget/ImageView;

    .line 173
    const v1, 0x7f0a00e1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->imageMask:Landroid/widget/ImageView;

    .line 174
    const v1, 0x7f0a007d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImageHolder:Landroid/view/ViewGroup;

    .line 175
    const v1, 0x7f0a0064

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->address:Landroid/widget/TextView;

    .line 176
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->address:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypefaceLight(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 177
    const v1, 0x7f0a0080

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailPhotoCredit:Landroid/widget/TextView;

    .line 178
    const v1, 0x7f0a0065

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->description:Landroid/widget/TextView;

    .line 179
    const v1, 0x7f0a00e2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStopTotal:Landroid/widget/TextView;

    .line 181
    const v1, 0x7f0a00df

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mScrollView:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    .line 183
    const v1, 0x7f0a0063

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mileage:Landroid/widget/TextView;

    .line 184
    const v1, 0x7f0a0085

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shareButton:Landroid/widget/ImageView;

    .line 185
    const v1, 0x7f0a0060

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->closeButton:Landroid/widget/ImageView;

    .line 187
    const v1, 0x7f0a00c3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/android/volley/toolbox/NetworkImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    .line 188
    const v1, 0x7f0a00b4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mProgressBar:Landroid/view/View;

    .line 190
    const v1, 0x7f0a005f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    .line 191
    const v1, 0x7f0a0059

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->bg:Landroid/view/View;

    .line 192
    const v1, 0x7f0a0066

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailBottomNav:Landroid/view/View;

    .line 193
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setDetailImageDimens()V

    .line 195
    new-instance v1, Lcom/aetn/history/android/historyhere/model/FavoritesManager;

    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/aetn/history/android/historyhere/model/FavoritesManager;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->favoritesManager:Lcom/aetn/history/android/historyhere/model/FavoritesManager;

    .line 197
    return-object v0
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 218
    sget-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v1, "onPause()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 220
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 202
    sget-object v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 204
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setListeners()V

    .line 205
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setLimitedData()V

    .line 206
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mDataLoaded:Z

    if-nez v0, :cond_0

    .line 207
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->makeDetailRequest()V

    .line 208
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->initMainLayout()V

    .line 209
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->animateInMainLayout()V

    .line 214
    :goto_0
    return-void

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->imageMask:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 212
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setRemainingData()V

    goto :goto_0
.end method

.method public setLimitedData()V
    .locals 4

    .prologue
    .line 255
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v2, "setLimitedData()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v0

    .line 257
    .local v0, "imageUrl":Ljava/lang/String;
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setData(): imageUrl: *"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 260
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v2, "setData(): imageUrl: load the image"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImage:Lcom/android/volley/toolbox/NetworkImageView;

    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 266
    :goto_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->title:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->address:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getCityStateString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 269
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setData(): description is not null: *"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->description:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    :goto_1
    return-void

    .line 263
    :cond_0
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v2, "setData(): imageUrl: set default image"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailImage:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020085

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/volley/toolbox/NetworkImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 272
    :cond_1
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setData(): description is null: *"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->description:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method

.method public setRemainingData()V
    .locals 13

    .prologue
    const/16 v10, 0x8

    const/4 v12, 0x0

    .line 279
    sget-object v8, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    const-string v9, "setRemainingData()"

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mProgressBar:Landroid/view/View;

    invoke-virtual {v8, v10}, Landroid/view/View;->setVisibility(I)V

    .line 281
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 282
    .local v0, "app":Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mScrollView:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    invoke-virtual {v8, v12}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->setScrollY(I)V

    .line 283
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-static {v8}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v8

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourList()Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->tourList:Ljava/util/ArrayList;

    .line 284
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0, v8}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setTargetedMapPoi(Lcom/aetn/history/android/historyhere/model/POI;)V

    .line 286
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {v8, v10}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 287
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v8

    check-cast v8, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v8

    iget-object v5, v8, Lcom/aetn/history/android/historyhere/model/Configuration;->tourSponsorData:Ljava/util/ArrayList;

    .line 288
    .local v5, "sponsorData":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;>;"
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;

    .line 289
    .local v1, "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    sget-object v9, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "getView(): data.id:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, v1, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->id:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    sget-object v9, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "getView(): o.getId():"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v11}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    iget-object v9, v1, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->id:Ljava/lang/String;

    iget-object v10, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v10}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 293
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    iget-object v9, v1, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->detailImageURL:Ljava/lang/String;

    sget-object v10, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mContext:Landroid/content/Context;

    invoke-static {v10}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v10

    invoke-virtual {v10}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 294
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {v8, v12}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 299
    .end local v1    # "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    :cond_1
    new-instance v4, Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-direct {v4, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 300
    .local v4, "spacer":Landroid/view/View;
    const/16 v8, 0xa

    invoke-virtual {v4, v8}, Landroid/view/View;->setMinimumHeight(I)V

    .line 301
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detailView:Landroid/view/ViewGroup;

    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 303
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mStopTotal:Landroid/widget/TextView;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->tourList:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    invoke-virtual {v10}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f0d008e

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mTourStopsView:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 307
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-string v9, "layout_inflater"

    invoke-virtual {v8, v9}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/LayoutInflater;

    .line 308
    .local v2, "inflater":Landroid/view/LayoutInflater;
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->tourList:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/model/POI;

    .line 309
    .local v3, "p":Lcom/aetn/history/android/historyhere/model/POI;
    const v9, 0x7f030035

    const/4 v10, 0x0

    invoke-virtual {v2, v9, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 310
    .local v7, "view":Landroid/view/View;
    const v9, 0x7f0a002f

    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 311
    .local v6, "tv":Landroid/widget/TextView;
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v9

    const v10, 0x7f0e007a

    invoke-virtual {v6, v9, v10}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 313
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mTourStopsView:Landroid/view/ViewGroup;

    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 315
    .end local v3    # "p":Lcom/aetn/history/android/historyhere/model/POI;
    .end local v6    # "tv":Landroid/widget/TextView;
    .end local v7    # "view":Landroid/view/View;
    :cond_2
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v9, "HH:Tours:*"

    iget-object v10, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v10}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 319
    iget-boolean v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mBeginningAnimationFinished:Z

    if-eqz v8, :cond_3

    iget-boolean v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mDataLoaded:Z

    if-nez v8, :cond_3

    .line 320
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->animateInBottomNav()V

    .line 322
    :cond_3
    const/4 v8, 0x1

    iput-boolean v8, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->mDataLoaded:Z

    .line 323
    return-void
.end method
