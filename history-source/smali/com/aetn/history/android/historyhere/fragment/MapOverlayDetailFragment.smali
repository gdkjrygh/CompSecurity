.class public Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "MapOverlayDetailFragment.java"


# static fields
.field private static final KEY_ADDRESS1:Ljava/lang/String; = "address1"

.field private static final KEY_ADDRESS2:Ljava/lang/String; = "address2"

.field private static final KEY_CITY:Ljava/lang/String; = "city"

.field private static final KEY_ID:Ljava/lang/String; = "id"

.field private static final KEY_IMAGE_URL:Ljava/lang/String; = "image_url"

.field private static final KEY_LATITUDE:Ljava/lang/String; = "lat"

.field private static final KEY_LONGITUDE:Ljava/lang/String; = "lng"

.field private static final KEY_STATE:Ljava/lang/String; = "state"

.field private static final KEY_TITLE:Ljava/lang/String; = "title"

.field private static final KEY_ZIP:Ljava/lang/String; = "zip"

.field private static final TAG:Ljava/lang/String; = "MapOverlayDetailFragment"

.field private static appContext:Landroid/content/Context;

.field private static mContext:Landroid/content/Context;


# instance fields
.field private address:Landroid/widget/TextView;

.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private closeButton:Landroid/widget/ImageView;

.field private description:Landroid/widget/TextView;

.field private detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private detailBottomNav:Landroid/view/View;

.field private detailView:Landroid/view/ViewGroup;

.field private downX:F

.field private downY:F

.field private favoriteButton:Landroid/widget/ImageView;

.field private isFavorite:Z

.field private mAnimateAtStart:Z

.field private mBeginningAnimationFinished:Z

.field private mDataLoaded:Z

.field private mGalleryScaleStart:F

.field private mHidePhotoNumberHandler:Landroid/os/Handler;

.field private mHidePhotoNumberRunnable:Ljava/lang/Runnable;

.field private mIconStartLeft:F

.field private mIconStartTop:F

.field private mImageWidth:I

.field private mMorePhotosNumber:Landroid/widget/TextView;

.field private mMorePhotosNumberLayout:Landroid/view/View;

.field private mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

.field private mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

.field private mPhotoGalleryActive:Z

.field private mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

.field private mPhotoGalleryMask:Landroid/widget/ImageView;

.field private mPhotos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/PhotoData;",
            ">;"
        }
    .end annotation
.end field

.field private mProgressBar:Landroid/view/View;

.field private mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

.field private mSmallAddress:Landroid/widget/TextView;

.field private mSmallDetailsView:Landroid/view/ViewGroup;

.field private mSmallMileage:Landroid/widget/TextView;

.field private mSmallTitle:Landroid/widget/TextView;

.field private mThisView:Landroid/view/View;

.field private mTouchLayer:Landroid/view/View;

.field private mainLayout:Landroid/view/ViewGroup;

.field private menuLeft:Landroid/view/ViewGroup;

.field private menuRight:Landroid/view/ViewGroup;

.field private mileage:Landroid/widget/TextView;

.field private phoneButton:Landroid/widget/ImageView;

.field private phoneButtonOnClickListener:Landroid/view/View$OnClickListener;

.field private routeButton:Landroid/view/View;

.field private routeButtonOnClickListener:Landroid/view/View$OnClickListener;

.field private shareButton:Landroid/widget/ImageView;

.field private shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private showPoiInMapButton:Landroid/widget/ImageView;

.field private smallDetailHolder:Landroid/view/ViewGroup;

.field private title:Landroid/widget/TextView;

.field private upX:F

.field private upY:F

.field private websiteButton:Landroid/widget/ImageView;

.field private websiteButtonOnClickListener:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 107
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryActive:Z

    .line 108
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isFavorite:Z

    .line 114
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mAnimateAtStart:Z

    .line 118
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downX:F

    .line 119
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F

    .line 120
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upX:F

    .line 121
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upY:F

    .line 123
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mDataLoaded:Z

    .line 124
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mBeginningAnimationFinished:Z

    .line 898
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$16;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$16;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->phoneButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 909
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$17;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$17;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->websiteButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 922
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$18;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$18;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->routeButtonOnClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animatePartialHidePhotoNumber()V

    return-void
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setPhotoNumber()V

    return-void
.end method

.method static synthetic access$1100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    return-object v0
.end method

.method static synthetic access$1202(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 52
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mBeginningAnimationFinished:Z

    return p1
.end method

.method static synthetic access$1300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryActive:Z

    return v0
.end method

.method static synthetic access$1400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->init()V

    return-void
.end method

.method static synthetic access$1500(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mTouchLayer:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setScrollerPosition()V

    return-void
.end method

.method static synthetic access$1802(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    .param p1, "x1"    # F

    .prologue
    .line 52
    iput p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downX:F

    return p1
.end method

.method static synthetic access$1900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F

    return v0
.end method

.method static synthetic access$1902(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    .param p1, "x1"    # F

    .prologue
    .line 52
    iput p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F

    return p1
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    return-object v0
.end method

.method static synthetic access$2002(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    .param p1, "x1"    # F

    .prologue
    .line 52
    iput p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upX:F

    return p1
.end method

.method static synthetic access$2100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upY:F

    return v0
.end method

.method static synthetic access$2102(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    .param p1, "x1"    # F

    .prologue
    .line 52
    iput p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upY:F

    return p1
.end method

.method static synthetic access$2200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object v0
.end method

.method static synthetic access$2300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->toggleFavorite()V

    return-void
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/widget/TextView;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$500(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateShowHidePhotoNumber()V

    return-void
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)I
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I

    return v0
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/widget/ImageView;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$800(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mDataLoaded:Z

    return v0
.end method

.method static synthetic access$900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateInNavItems()V

    return-void
.end method

.method private animateInNavItems()V
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, 0x0

    const/4 v11, 0x2

    const/4 v10, 0x0

    .line 699
    iget-boolean v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryActive:Z

    if-eqz v5, :cond_0

    .line 700
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    .line 701
    :cond_0
    const/16 v3, 0x1f4

    .line 702
    .local v3, "fastSpeed":I
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->description:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 704
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->description:Landroid/widget/TextView;

    const-string v6, "alpha"

    new-array v7, v11, [F

    fill-array-data v7, :array_0

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 705
    .local v1, "animDescription":Landroid/animation/ObjectAnimator;
    int-to-long v5, v3

    invoke-virtual {v1, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 707
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    const-string v6, "translationY"

    new-array v7, v11, [F

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x43480000    # 200.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v10

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-static {v8, v12}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v13

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 708
    .local v0, "animBottomNav":Landroid/animation/ObjectAnimator;
    int-to-long v5, v3

    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 710
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const-string v6, "translationX"

    new-array v7, v11, [F

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x43c80000    # 400.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v10

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-static {v8, v12}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v13

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 711
    .local v2, "animPhotosNumber":Landroid/animation/ObjectAnimator;
    int-to-long v5, v3

    invoke-virtual {v2, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 713
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 715
    .local v4, "set":Landroid/animation/AnimatorSet;
    new-instance v5, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$9;

    invoke-direct {v5, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$9;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 734
    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 735
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 736
    return-void

    .line 704
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private animatePartialHidePhotoNumber()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 757
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const-string v3, "translationX"

    const/4 v4, 0x1

    new-array v4, v4, [F

    sget-object v5, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mContext:Landroid/content/Context;

    const/high16 v6, 0x42700000    # 60.0f

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    aput v5, v4, v7

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 758
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v7}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 759
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 761
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 762
    .local v1, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 763
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 764
    return-void
.end method

.method private animateShowHidePhotoNumber()V
    .locals 4

    .prologue
    .line 740
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateShowPhotoNumber()V

    .line 742
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mHidePhotoNumberHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mHidePhotoNumberRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 743
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mHidePhotoNumberHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mHidePhotoNumberRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 744
    return-void
.end method

.method private animateShowPhotoNumber()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 747
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const-string v3, "translationX"

    const/4 v4, 0x1

    new-array v4, v4, [F

    sget-object v5, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mContext:Landroid/content/Context;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    aput v5, v4, v7

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 748
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v7}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 749
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 751
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 752
    .local v1, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 753
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 754
    return-void
.end method

.method private createShareEmailContent()Ljava/lang/String;
    .locals 4

    .prologue
    .line 972
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 973
    .local v1, "sb":Ljava/lang/StringBuilder;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<img src=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' width=\'200\' height=\'200\' /><br />"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 974
    .local v0, "photoImage":Ljava/lang/String;
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Check out what I found on <b>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "</b>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<b>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "</b><br /><i>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "</i><br />"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 976
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    const-string v2, "MapOverlayDetailFragment"

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 978
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 973
    .end local v0    # "photoImage":Ljava/lang/String;
    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method private getAnalayticsParams()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 796
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 797
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "poi_id"

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    const-string v1, "poi_title"

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    return-object v0
.end method

.method private init()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 235
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 236
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mTouchLayer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 237
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setDetailImageDimens()V

    .line 238
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->initMainLayout()V

    .line 239
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setListeners()V

    .line 240
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setLimitedData()V

    .line 241
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping(Z)V

    .line 242
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 243
    return-void
.end method

.method private makeDetailRequest()V
    .locals 4

    .prologue
    .line 265
    const-string v0, "MapOverlayDetailFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showMainDetail():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mDataLoaded:Z

    if-eqz v0, :cond_0

    .line 297
    :goto_0
    return-void

    .line 268
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 269
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d003c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->manageDetailNotLoaded(Ljava/lang/String;)V

    .line 270
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 277
    :cond_1
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setOnDetailLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;)V

    .line 295
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getPOIDetailFromService(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static newInstance(Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    .locals 5
    .param p0, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 129
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;-><init>()V

    .line 130
    .local v1, "f":Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 131
    .local v0, "args":Landroid/os/Bundle;
    const-string v2, "id"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v2, "title"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    const-string v2, "image_url"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string v2, "address1"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string v2, "address2"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress2()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v2, "city"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getCity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v2, "state"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v2, "zip"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getZip()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v2, "lat"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 140
    const-string v2, "lng"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 141
    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 142
    return-object v1
.end method

.method private sendShareEmail()V
    .locals 4

    .prologue
    .line 958
    const-string v2, "MapOverlayDetailFragment"

    const-string v3, "sendShareEmail"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 960
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v2

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/model/Configuration;->shareTemplates:Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;->email:Lcom/aetn/history/android/historyhere/model/Configuration$Email;

    iget-object v1, v2, Lcom/aetn/history/android/historyhere/model/Configuration$Email;->subject:Ljava/lang/String;

    .line 962
    .local v1, "shareEmailSubject":Ljava/lang/String;
    const-string v2, "[title]"

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 963
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 964
    .local v0, "emailIntent":Landroid/content/Intent;
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 965
    const-string v2, "text/html"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 966
    const-string v2, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 967
    const-string v2, "android.intent.extra.TEXT"

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->createShareEmailContent()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 968
    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->appContext:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 969
    return-void
.end method

.method private setDetailImageDimens()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 246
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 247
    .local v0, "dm":Landroid/util/DisplayMetrics;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 248
    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I

    .line 249
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I

    add-int/lit8 v3, v3, -0x2

    iget v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I

    add-int/lit8 v4, v4, -0x2

    invoke-direct {v1, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 250
    .local v1, "lp1":Landroid/widget/FrameLayout$LayoutParams;
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I

    iget v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mImageWidth:I

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 251
    .local v2, "lp2":Landroid/widget/FrameLayout$LayoutParams;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v3, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v3, v5}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setPivotX(F)V

    .line 253
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v3, v5}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setPivotY(F)V

    .line 254
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 255
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setPivotX(F)V

    .line 256
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setPivotY(F)V

    .line 257
    return-void
.end method

.method private setFavoriteButton()V
    .locals 2

    .prologue
    .line 788
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isFavorite:Z

    if-eqz v0, :cond_0

    .line 789
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    const v1, 0x7f0200b3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 793
    :goto_0
    return-void

    .line 791
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    const v1, 0x7f0200b2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 809
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mTouchLayer:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 850
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$11;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$11;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 860
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->phoneButton:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->phoneButtonOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 861
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->websiteButtonOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 862
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shareButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$12;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$12;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 872
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->routeButton:Landroid/view/View;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->routeButtonOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 873
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$13;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$13;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 880
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->closeButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$14;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$14;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 889
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->showPoiInMapButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$15;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$15;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 895
    return-void
.end method

.method private setPhotoNumber()V
    .locals 1

    .prologue
    .line 769
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryActive:Z

    if-eqz v0, :cond_0

    .line 770
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateShowHidePhotoNumber()V

    .line 771
    :cond_0
    return-void
.end method

.method private setScrollerPosition()V
    .locals 4

    .prologue
    .line 774
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 775
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/16 v3, 0xc8

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentPixels(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->smoothScrollTo(II)V

    .line 777
    :cond_0
    return-void
.end method

.method private toggleFavorite()V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 939
    const-string v2, "MapOverlayDetailFragment"

    const-string v4, "toggleFavorite()"

    invoke-static {v2, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 940
    const-string v1, ""

    .line 941
    .local v1, "toastMsg":Ljava/lang/String;
    iget-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isFavorite:Z

    if-eqz v2, :cond_0

    .line 942
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->removeFavorite(Landroid/content/Context;Ljava/lang/String;)V

    .line 943
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0d0061

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 951
    :goto_0
    iget-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isFavorite:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    :goto_1
    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isFavorite:Z

    .line 952
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setFavoriteButton()V

    .line 953
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v2, v1, v3}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showToast(Ljava/lang/String;I)V

    .line 954
    return-void

    .line 945
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->addFavorite(Landroid/content/Context;Ljava/lang/String;)V

    .line 946
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 947
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v2, "Content Favorited"

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v4, "Favorite"

    invoke-virtual {v2, v4, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 949
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0d000f

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .end local v0    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_1
    move v2, v3

    .line 951
    goto :goto_1
.end method


# virtual methods
.method public animateInMainLayout()V
    .locals 24

    .prologue
    .line 490
    invoke-direct/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->makeDetailRequest()V

    .line 492
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mTouchLayer:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 493
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 494
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 495
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 497
    const/16 v9, 0x1f4

    .line 498
    .local v9, "fastSpeed":I
    const/16 v10, 0x1f4

    .line 500
    .local v10, "mainSpeed":I
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x447a0000    # 1000.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v20

    .line 501
    .local v20, "startpointMain":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    .line 503
    .local v8, "endpointMain":F
    new-instance v19, Landroid/animation/AnimatorSet;

    invoke-direct/range {v19 .. v19}, Landroid/animation/AnimatorSet;-><init>()V

    .line 504
    .local v19, "set":Landroid/animation/AnimatorSet;
    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 506
    .local v3, "set2":Landroid/animation/AnimatorSet;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const-string v2, "translationY"

    const/16 v21, 0x2

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    aput v20, v21, v22

    const/16 v22, 0x1

    aput v8, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    .line 507
    .local v6, "animator2":Landroid/animation/ObjectAnimator;
    int-to-long v1, v9

    invoke-virtual {v6, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 509
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v2, "alpha"

    const/16 v21, 0x2

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    fill-array-data v21, :array_0

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 510
    .local v7, "animator3":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    invoke-virtual {v7, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 512
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v2, "scaleX"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v15

    .line 513
    .local v15, "photoScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    invoke-virtual {v15, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 514
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v2, "scaleY"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v16

    .line 515
    .local v16, "photoScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    move-object/from16 v0, v16

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 517
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v2, "translationX"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/16 v23, 0x0

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v17

    .line 518
    .local v17, "photoX":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    move-object/from16 v0, v17

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 519
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v2, "translationY"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/16 v23, 0x0

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v18

    .line 520
    .local v18, "photoY":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    move-object/from16 v0, v18

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 523
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v2, "scaleX"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v11

    .line 524
    .local v11, "photoMaskScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    invoke-virtual {v11, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 525
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v2, "scaleY"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v12

    .line 526
    .local v12, "photoMaskScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    invoke-virtual {v12, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 527
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v2, "translationX"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/16 v23, 0x0

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v13

    .line 528
    .local v13, "photoMaskX":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    invoke-virtual {v13, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 529
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v2, "translationY"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/16 v23, 0x0

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    .line 530
    .local v14, "photoMaskY":Landroid/animation/ObjectAnimator;
    int-to-long v1, v10

    invoke-virtual {v14, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 533
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v2, "scaleX"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/high16 v23, 0x3fe00000    # 1.75f

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 534
    .local v4, "photoMaskScaleXEnd":Landroid/animation/ObjectAnimator;
    int-to-long v1, v9

    invoke-virtual {v4, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 535
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v2, "scaleY"

    const/16 v21, 0x1

    move/from16 v0, v21

    new-array v0, v0, [F

    move-object/from16 v21, v0

    const/16 v22, 0x0

    const/high16 v23, 0x3fe00000    # 1.75f

    aput v23, v21, v22

    move-object/from16 v0, v21

    invoke-static {v1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 536
    .local v5, "photoMaskScaleYEnd":Landroid/animation/ObjectAnimator;
    int-to-long v1, v9

    invoke-virtual {v5, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 539
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$5;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;Landroid/animation/AnimatorSet;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 557
    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 558
    move-object/from16 v0, v17

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    move-object/from16 v0, v18

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 559
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 560
    invoke-virtual {v1, v13}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v14}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 561
    invoke-virtual/range {v19 .. v19}, Landroid/animation/AnimatorSet;->start()V

    .line 564
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$6;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$6;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 586
    return-void

    .line 509
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public animateOutMainLayout()V
    .locals 27

    .prologue
    .line 593
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    const/4 v3, 0x0

    const/16 v23, 0x0

    move/from16 v0, v23

    invoke-virtual {v2, v3, v0}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->smoothScrollTo(II)V

    .line 594
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 595
    const/16 v17, 0xc8

    .line 596
    .local v17, "fastSpeed":I
    const/16 v18, 0xc8

    .line 597
    .local v18, "mainSpeed":I
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v22

    .line 598
    .local v22, "startpointMain":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, 0x447a0000    # 1000.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v16

    .line 600
    .local v16, "endpointMain":F
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const-string v3, "translationY"

    const/16 v23, 0x2

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    aput v22, v23, v24

    const/16 v24, 0x1

    aput v16, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v13

    .line 601
    .local v13, "animator2":Landroid/animation/ObjectAnimator;
    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 602
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v13, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 604
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "alpha"

    const/16 v23, 0x2

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    fill-array-data v23, :array_0

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    .line 605
    .local v14, "animator3":Landroid/animation/ObjectAnimator;
    const/4 v2, 0x0

    invoke-virtual {v14, v2}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 606
    move/from16 v0, v17

    int-to-long v2, v0

    invoke-virtual {v14, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 608
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    const-string v3, "translationY"

    const/16 v23, 0x2

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v25

    const/16 v26, 0x0

    invoke-static/range {v25 .. v26}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v25

    aput v25, v23, v24

    const/16 v24, 0x1

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v25

    const/high16 v26, 0x43480000    # 200.0f

    invoke-static/range {v25 .. v26}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v25

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v15

    .line 609
    .local v15, "animator4":Landroid/animation/ObjectAnimator;
    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 610
    move/from16 v0, v17

    int-to-long v2, v0

    invoke-virtual {v15, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 612
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "scaleX"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 613
    .local v5, "photoScaleX":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v5, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 614
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "scaleY"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    .line 615
    .local v6, "photoScaleY":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v6, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 617
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "translationX"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartLeft:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 618
    .local v7, "photoX":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v7, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 619
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "translationY"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartTop:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 620
    .local v8, "photoY":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v8, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 622
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleX"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    .line 623
    .local v9, "photoMaskScaleX":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v9, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 624
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleY"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 625
    .local v10, "photoMaskScaleY":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v10, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 626
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "translationX"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartLeft:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v11

    .line 627
    .local v11, "photoMaskX":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v11, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 628
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "translationY"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartTop:F

    move/from16 v25, v0

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v12

    .line 629
    .local v12, "photoMaskY":Landroid/animation/ObjectAnimator;
    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual {v12, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 631
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleX"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    const/high16 v25, 0x3f800000    # 1.0f

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v19

    .line 632
    .local v19, "photoMaskScaleXEnd":Landroid/animation/ObjectAnimator;
    move/from16 v0, v17

    int-to-long v2, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 633
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleY"

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [F

    move-object/from16 v23, v0

    const/16 v24, 0x0

    const/high16 v25, 0x3f800000    # 1.0f

    aput v25, v23, v24

    move-object/from16 v0, v23

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v20

    .line 634
    .local v20, "photoMaskScaleYEnd":Landroid/animation/ObjectAnimator;
    move/from16 v0, v17

    int-to-long v2, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 636
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 639
    .local v4, "set":Landroid/animation/AnimatorSet;
    new-instance v21, Landroid/animation/AnimatorSet;

    invoke-direct/range {v21 .. v21}, Landroid/animation/AnimatorSet;-><init>()V

    .line 640
    .local v21, "set2":Landroid/animation/AnimatorSet;
    move-object/from16 v0, v21

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    move-object/from16 v0, v20

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v13}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 643
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v12}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$7;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;Landroid/animation/AnimatorSet;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 663
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$8;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$8;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v4, v2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 689
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 690
    invoke-virtual/range {v21 .. v21}, Landroid/animation/AnimatorSet;->start()V

    .line 693
    return-void

    .line 604
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public initMainLayout()V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 460
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setVisibility(I)V

    .line 461
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x447a0000    # 1000.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v0

    .line 462
    .local v0, "endpointMain":F
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v1

    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartTop:F

    .line 463
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v1

    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartLeft:F

    .line 464
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->description:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 465
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 466
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 467
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 468
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setTranslationY(F)V

    .line 469
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, 0x43480000    # 200.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 470
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 471
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setScaleX(F)V

    .line 472
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setScaleY(F)V

    .line 473
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleX(F)V

    .line 474
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleY(F)V

    .line 475
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartLeft:F

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setTranslationX(F)V

    .line 476
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartTop:F

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setTranslationY(F)V

    .line 477
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartLeft:F

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setTranslationX(F)V

    .line 478
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mIconStartTop:F

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setTranslationY(F)V

    .line 479
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 147
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 148
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v6

    .line 149
    .local v6, "args":Landroid/os/Bundle;
    if-eqz v6, :cond_0

    .line 150
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 151
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "title"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "image_url"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "id"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 154
    const-string v0, "address1"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 155
    .local v1, "address1":Ljava/lang/String;
    const-string v0, "address2"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 156
    .local v2, "address2":Ljava/lang/String;
    const-string v0, "city"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 157
    .local v3, "city":Ljava/lang/String;
    const-string v0, "state"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 158
    .local v4, "state":Ljava/lang/String;
    const-string v0, "zip"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 159
    .local v5, "zip":Ljava/lang/String;
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual/range {v0 .. v5}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "lat"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    const-string v9, "lng"

    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    invoke-virtual {v0, v7, v8, v9, v10}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 162
    .end local v1    # "address1":Ljava/lang/String;
    .end local v2    # "address2":Ljava/lang/String;
    .end local v3    # "city":Ljava/lang/String;
    .end local v4    # "state":Ljava/lang/String;
    .end local v5    # "zip":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 168
    const v2, 0x7f03003e

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 169
    .local v1, "view":Landroid/view/View;
    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mThisView:Landroid/view/View;

    .line 171
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    sput-object v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mContext:Landroid/content/Context;

    .line 172
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 173
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .line 174
    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sput-object v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->appContext:Landroid/content/Context;

    .line 176
    const v2, 0x7f0a005a

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    .line 177
    const v2, 0x7f0a005b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailView:Landroid/view/ViewGroup;

    .line 179
    const v2, 0x7f0a00a7

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mTouchLayer:Landroid/view/View;

    .line 182
    const v2, 0x7f0a0041

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->title:Landroid/widget/TextView;

    .line 183
    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->title:Landroid/widget/TextView;

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypefaceSemibold(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 185
    const v2, 0x7f0a0099

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->smallDetailHolder:Landroid/view/ViewGroup;

    .line 186
    const v2, 0x7f0a0064

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->address:Landroid/widget/TextView;

    .line 187
    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->address:Landroid/widget/TextView;

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypefaceLight(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 188
    const v2, 0x7f0a0065

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->description:Landroid/widget/TextView;

    .line 190
    const v2, 0x7f0a005f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    .line 191
    const v2, 0x7f0a0082

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuLeft:Landroid/view/ViewGroup;

    .line 192
    const v2, 0x7f0a0086

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    .line 193
    const v2, 0x7f0a0087

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->phoneButton:Landroid/widget/ImageView;

    .line 194
    const v2, 0x7f0a0089

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    .line 195
    const v2, 0x7f0a0083

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    .line 196
    const v2, 0x7f0a0062

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->routeButton:Landroid/view/View;

    .line 197
    const v2, 0x7f0a008b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->showPoiInMapButton:Landroid/widget/ImageView;

    .line 198
    const v2, 0x7f0a0063

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mileage:Landroid/widget/TextView;

    .line 199
    const v2, 0x7f0a0085

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shareButton:Landroid/widget/ImageView;

    .line 200
    const v2, 0x7f0a0060

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->closeButton:Landroid/widget/ImageView;

    .line 201
    const v2, 0x7f0a0066

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    .line 202
    const v2, 0x7f0a005c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    .line 203
    const v2, 0x7f0a009a

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    .line 204
    const v2, 0x7f0a005e

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    .line 205
    const v2, 0x7f0a005d

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    .line 206
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 209
    const v2, 0x7f0a009b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;

    .line 210
    const v2, 0x7f0a009c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallTitle:Landroid/widget/TextView;

    .line 211
    const v2, 0x7f0a009d

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallAddress:Landroid/widget/TextView;

    .line 212
    const v2, 0x7f0a009e

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallMileage:Landroid/widget/TextView;

    .line 213
    const v2, 0x7f0a009f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mProgressBar:Landroid/view/View;

    .line 215
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mHidePhotoNumberHandler:Landroid/os/Handler;

    .line 216
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$1;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mHidePhotoNumberRunnable:Ljava/lang/Runnable;

    .line 222
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 223
    .local v0, "metrics":Landroid/util/DisplayMetrics;
    const-string v2, "MapOverlayDetailFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onCreateView():metrics:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    float-to-double v2, v2

    const-wide/high16 v4, 0x400c000000000000L    # 3.5

    cmpg-double v2, v2, v4

    if-gez v2, :cond_0

    .line 226
    const/high16 v2, 0x3e800000    # 0.25f

    iput v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    .line 230
    :goto_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->init()V

    .line 231
    return-object v1

    .line 228
    :cond_0
    const v2, 0x3e6b851f    # 0.23f

    iput v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mGalleryScaleStart:F

    goto :goto_0
.end method

.method public setLimitedData()V
    .locals 17

    .prologue
    .line 303
    const-string v1, "MapOverlayDetailFragment"

    const-string v2, "setLimitedData()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v13

    .line 305
    .local v13, "imageUrl":Ljava/lang/String;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    .line 306
    new-instance v1, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-direct {v1, v2, v3}, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    .line 307
    const-string v1, ""

    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 308
    new-instance v16, Lcom/aetn/history/android/historyhere/model/PhotoData;

    const-string v1, ""

    move-object/from16 v0, v16

    invoke-direct {v0, v13, v1}, Lcom/aetn/history/android/historyhere/model/PhotoData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .local v16, "p":Lcom/aetn/history/android/historyhere/model/PhotoData;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    :goto_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 316
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryActive:Z

    .line 317
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->notifyDataSetChanged()V

    .line 318
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 319
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setCurrentItem(I)V

    .line 320
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->title:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->address:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallTitle:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallAddress:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v10

    .line 327
    .local v10, "currentUserLocation":Landroid/location/Location;
    if-eqz v10, :cond_2

    .line 328
    const-string v14, ""

    .line 329
    .local v14, "mileageFromUserLocation":Ljava/lang/String;
    const-string v15, ""

    .line 330
    .local v15, "mileageFromUserLocation2":Ljava/lang/String;
    invoke-virtual {v10}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v10}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v5

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v7

    const-string v9, "M"

    invoke-static/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDistanceBetweenLocations(DDDDLjava/lang/String;)D

    move-result-wide v11

    .line 331
    .local v11, "distanceFromUserLocation":D
    const-string v1, "MapOverlayDetailFragment"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the distance is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    mul-double/2addr v1, v11

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-double v1, v1

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    div-double v11, v1, v3

    .line 333
    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    cmpl-double v1, v11, v1

    if-lez v1, :cond_1

    .line 334
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-double v11, v1

    .line 335
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " miles"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 336
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v2, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mi"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 341
    :goto_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mileage:Landroid/widget/TextView;

    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallMileage:Landroid/widget/TextView;

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallMileage:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 348
    .end local v11    # "distanceFromUserLocation":D
    .end local v14    # "mileageFromUserLocation":Ljava/lang/String;
    .end local v15    # "mileageFromUserLocation2":Ljava/lang/String;
    :goto_2
    return-void

    .line 312
    .end local v10    # "currentUserLocation":Landroid/location/Location;
    .end local v16    # "p":Lcom/aetn/history/android/historyhere/model/PhotoData;
    :cond_0
    new-instance v16, Lcom/aetn/history/android/historyhere/model/PhotoData;

    const-string v1, ""

    const-string v2, ""

    move-object/from16 v0, v16

    invoke-direct {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/PhotoData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .restart local v16    # "p":Lcom/aetn/history/android/historyhere/model/PhotoData;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 338
    .restart local v10    # "currentUserLocation":Landroid/location/Location;
    .restart local v11    # "distanceFromUserLocation":D
    .restart local v14    # "mileageFromUserLocation":Ljava/lang/String;
    .restart local v15    # "mileageFromUserLocation2":Ljava/lang/String;
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " miles"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 339
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mi"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    .line 345
    .end local v11    # "distanceFromUserLocation":D
    .end local v14    # "mileageFromUserLocation":Ljava/lang/String;
    .end local v15    # "mileageFromUserLocation2":Ljava/lang/String;
    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mSmallMileage:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method

.method public setRemainingData()V
    .locals 14

    .prologue
    const v13, 0x7f02010a

    const/4 v12, 0x0

    const/16 v11, 0x8

    const/4 v10, 0x5

    const/4 v9, 0x1

    .line 354
    const-string v6, "MapOverlayDetailFragment"

    const-string v7, "setRemainingData()"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mProgressBar:Landroid/view/View;

    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 356
    iput-boolean v9, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mDataLoaded:Z

    .line 357
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIDetail()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v6

    iput-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 358
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isFavorite:Z

    .line 359
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setFavoriteButton()V

    .line 360
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAssets()Ljava/util/ArrayList;

    move-result-object v1

    .line 362
    .local v1, "assets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;>;"
    if-eqz v1, :cond_1

    .line 363
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;

    .line 364
    .local v0, "a":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->isAssetTypeImage()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 365
    new-instance v3, Lcom/aetn/history/android/historyhere/model/PhotoData;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->getImageURL()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->getImageCredit()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v3, v7, v8}, Lcom/aetn/history/android/historyhere/model/PhotoData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    .local v3, "pd":Lcom/aetn/history/android/historyhere/model/PhotoData;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 371
    .end local v0    # "a":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    .end local v3    # "pd":Lcom/aetn/history/android/historyhere/model/PhotoData;
    :cond_1
    const-string v6, "MapOverlayDetailFragment"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "setData(): there are # of photos:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-le v6, v9, :cond_9

    .line 373
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->notifyDataSetChanged()V

    .line 374
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    new-instance v7, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;

    invoke-direct {v7, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    invoke-virtual {v6, v7}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 390
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 391
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->getCurrentItem()I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " of "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 392
    iput-boolean v9, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryActive:Z

    .line 399
    :goto_1
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 400
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuLeft:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 401
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->shareButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v13}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 402
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuLeft:Landroid/view/ViewGroup;

    const v7, 0x7f0a0084

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 404
    :cond_2
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->description:Landroid/widget/TextView;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedPhoneNumber()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_3

    .line 406
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->phoneButton:Landroid/widget/ImageView;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 407
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mThisView:Landroid/view/View;

    const v8, 0x7f0a0088

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 409
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f020105

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 411
    :cond_3
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getWebsite()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_4

    .line 412
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 413
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mThisView:Landroid/view/View;

    const v8, 0x7f0a008a

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 416
    :cond_4
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getWebsite()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_5

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedPhoneNumber()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_5

    .line 417
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->showPoiInMapButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v13}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 421
    :cond_5
    new-instance v4, Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v4, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 422
    .local v4, "spacer":Landroid/view/View;
    const/16 v6, 0xa

    invoke-virtual {v4, v6}, Landroid/view/View;->setMinimumHeight(I)V

    .line 423
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detailView:Landroid/view/ViewGroup;

    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 426
    const-string v6, "HH:Places:*"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 427
    .local v5, "tag":Ljava/lang/String;
    iget-boolean v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->isFavorite:Z

    if-eqz v6, :cond_a

    .line 428
    const-string v6, "HH:Favorites:*"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 435
    :cond_6
    :goto_2
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v6, v5}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 436
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 437
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsIncrementTourPoiViewedCount()V

    .line 442
    :cond_7
    iget-boolean v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mBeginningAnimationFinished:Z

    if-eqz v6, :cond_8

    .line 443
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateInNavItems()V

    .line 444
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setPhotoNumber()V

    .line 445
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    invoke-virtual {v6, v9}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping(Z)V

    .line 446
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v6, v9}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 448
    :cond_8
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->checkForRateReminder()V

    .line 449
    return-void

    .line 394
    .end local v4    # "spacer":Landroid/view/View;
    .end local v5    # "tag":Ljava/lang/String;
    :cond_9
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setVisibility(I)V

    .line 395
    iput-boolean v12, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGalleryActive:Z

    goto/16 :goto_1

    .line 429
    .restart local v4    # "spacer":Landroid/view/View;
    .restart local v5    # "tag":Ljava/lang/String;
    :cond_a
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 431
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v2

    .line 432
    .local v2, "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    const-string v6, "HH:Tours:*"

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 433
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->cleanString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_2
.end method
