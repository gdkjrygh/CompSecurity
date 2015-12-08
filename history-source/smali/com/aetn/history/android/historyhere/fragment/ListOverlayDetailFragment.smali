.class public Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "ListOverlayDetailFragment.java"


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

.field private static final TAG:Ljava/lang/String; = "ListOverlayDetailFragment"

.field private static appContext:Landroid/content/Context;

.field private static mContext:Landroid/content/Context;


# instance fields
.field private address:Landroid/widget/TextView;

.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private bg:Landroid/view/View;

.field private closeButton:Landroid/widget/ImageView;

.field private description:Landroid/widget/TextView;

.field private detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private detailBottomNav:Landroid/view/View;

.field private detailView:Landroid/view/ViewGroup;

.field private downY:F

.field private favoriteButton:Landroid/widget/ImageView;

.field private isFavorite:Z

.field private mBeginningAnimationFinished:Z

.field private mDataLoaded:Z

.field private mDeviceHeight:I

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

.field private mScrollPositionSmall:I

.field private mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

.field private mSmallAddress:Landroid/widget/TextView;

.field private mSmallDetailsView:Landroid/view/ViewGroup;

.field private mSmallMileage:Landroid/widget/TextView;

.field private mSmallTitle:Landroid/widget/TextView;

.field private mThisView:Landroid/view/View;

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

.field private upY:F

.field private websiteButton:Landroid/widget/ImageView;

.field private websiteButtonOnClickListener:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 122
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 109
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z

    .line 110
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isFavorite:Z

    .line 127
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->downY:F

    .line 128
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->upY:F

    .line 130
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mDataLoaded:Z

    .line 131
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mBeginningAnimationFinished:Z

    .line 856
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$14;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$14;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->phoneButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 867
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$15;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$15;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->websiteButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 880
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$16;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$16;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->routeButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 123
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animatePartialHidePhotoNumber()V

    return-void
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setPhotoNumber()V

    return-void
.end method

.method static synthetic access$1100(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z

    return v0
.end method

.method static synthetic access$1200(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    return-object v0
.end method

.method static synthetic access$1302(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 52
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mBeginningAnimationFinished:Z

    return p1
.end method

.method static synthetic access$1400(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setScrollerPosition()V

    return-void
.end method

.method static synthetic access$1600(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->toggleFavorite()V

    return-void
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    return-object v0
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Landroid/widget/TextView;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$500(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateShowHidePhotoNumber()V

    return-void
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)I
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mImageWidth:I

    return v0
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Landroid/widget/ImageView;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$800(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mDataLoaded:Z

    return v0
.end method

.method static synthetic access$900(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateInNavItems()V

    return-void
.end method

.method private animateInNavItems()V
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, 0x0

    const/4 v11, 0x2

    const/4 v10, 0x0

    .line 701
    iget-boolean v5, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z

    if-eqz v5, :cond_0

    .line 702
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    .line 703
    :cond_0
    const/16 v3, 0x1f4

    .line 704
    .local v3, "fastSpeed":I
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->description:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 706
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->description:Landroid/widget/TextView;

    const-string v6, "alpha"

    new-array v7, v11, [F

    fill-array-data v7, :array_0

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 707
    .local v1, "animDescription":Landroid/animation/ObjectAnimator;
    int-to-long v5, v3

    invoke-virtual {v1, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 709
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    const-string v6, "translationY"

    new-array v7, v11, [F

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x43480000    # 200.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v10

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-static {v8, v12}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v13

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 710
    .local v0, "animBottomNav":Landroid/animation/ObjectAnimator;
    int-to-long v5, v3

    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 712
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const-string v6, "translationX"

    new-array v7, v11, [F

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x43c80000    # 400.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v10

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-static {v8, v12}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    aput v8, v7, v13

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 713
    .local v2, "animPhotosNumber":Landroid/animation/ObjectAnimator;
    int-to-long v5, v3

    invoke-virtual {v2, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 715
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 717
    .local v4, "set":Landroid/animation/AnimatorSet;
    new-instance v5, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$8;

    invoke-direct {v5, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$8;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 733
    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 734
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 735
    return-void

    .line 706
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

    .line 756
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const-string v3, "translationX"

    const/4 v4, 0x1

    new-array v4, v4, [F

    sget-object v5, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mContext:Landroid/content/Context;

    const/high16 v6, 0x42700000    # 60.0f

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    aput v5, v4, v7

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 757
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v7}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 758
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 760
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 761
    .local v1, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 762
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 763
    return-void
.end method

.method private animateShowHidePhotoNumber()V
    .locals 4

    .prologue
    .line 739
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateShowPhotoNumber()V

    .line 741
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mHidePhotoNumberHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mHidePhotoNumberRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 742
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mHidePhotoNumberHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mHidePhotoNumberRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 743
    return-void
.end method

.method private animateShowPhotoNumber()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 746
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const-string v3, "translationX"

    const/4 v4, 0x1

    new-array v4, v4, [F

    sget-object v5, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mContext:Landroid/content/Context;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    aput v5, v4, v7

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 747
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v7}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 748
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 750
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 751
    .local v1, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 752
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 753
    return-void
.end method

.method private createShareEmailContent()Ljava/lang/String;
    .locals 4

    .prologue
    .line 930
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 931
    .local v1, "sb":Ljava/lang/StringBuilder;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

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

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' width=\'200\' height=\'200\' /><br />"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 932
    .local v0, "photoImage":Ljava/lang/String;
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Check out what I found on <b>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

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

    .line 933
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<b>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "</b><br /><i>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

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

    .line 934
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 935
    const-string v2, "ListOverlayDetailFragment"

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 936
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 931
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
    .line 795
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 796
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "poi_id"

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 797
    const-string v1, "poi_title"

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    return-object v0
.end method

.method private initMainLayout()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/high16 v4, 0x3e800000    # 0.25f

    const/4 v3, 0x4

    .line 453
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v1

    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mIconStartTop:F

    .line 454
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v1

    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mIconStartLeft:F

    .line 455
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x447a0000    # 1000.0f

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v0

    .line 457
    .local v0, "endpointMain":F
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->description:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 458
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 459
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v1, v5}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setAlpha(F)V

    .line 460
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 461
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->bg:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 462
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 463
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 465
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setTranslationY(F)V

    .line 466
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->bg:Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, -0x3b860000    # -1000.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 467
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, 0x43480000    # 200.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 468
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 470
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v1, v4}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setScaleX(F)V

    .line 471
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v1, v4}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setScaleY(F)V

    .line 472
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setScaleX(F)V

    .line 473
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setScaleY(F)V

    .line 475
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setVisibility(I)V

    .line 476
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateInMainLayout()V

    .line 478
    return-void
.end method

.method private makeDetailRequest()V
    .locals 3

    .prologue
    .line 269
    const-string v0, "ListOverlayDetailFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showMainDetail():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mDataLoaded:Z

    if-eqz v0, :cond_0

    .line 292
    :goto_0
    return-void

    .line 272
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 273
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d003c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->manageDetailNotLoaded(Ljava/lang/String;)V

    .line 274
    const-string v0, "ListOverlayDetailFragment"

    const-string v1, "Fragment click - no network connection"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->animateCloseListDetail()V

    goto :goto_0

    .line 277
    :cond_1
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setOnDetailLoadedListener(Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;)V

    .line 290
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getPOIDetailFromService(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static newInstance(Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;
    .locals 5
    .param p0, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 134
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;-><init>()V

    .line 135
    .local v1, "f":Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 136
    .local v0, "args":Landroid/os/Bundle;
    const-string v2, "id"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v2, "title"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v2, "image_url"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v2, "address1"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v2, "address2"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getAddress2()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v2, "city"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getCity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v2, "state"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string v2, "zip"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getZip()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v2, "lat"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 145
    const-string v2, "lng"

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 146
    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 147
    return-object v1
.end method

.method private sendShareEmail()V
    .locals 4

    .prologue
    .line 916
    const-string v2, "ListOverlayDetailFragment"

    const-string v3, "sendShareEmail"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 918
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v2

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/model/Configuration;->shareTemplates:Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;->email:Lcom/aetn/history/android/historyhere/model/Configuration$Email;

    iget-object v1, v2, Lcom/aetn/history/android/historyhere/model/Configuration$Email;->subject:Ljava/lang/String;

    .line 920
    .local v1, "shareEmailSubject":Ljava/lang/String;
    const-string v2, "[title]"

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 921
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 922
    .local v0, "emailIntent":Landroid/content/Intent;
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 923
    const-string v2, "text/html"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 924
    const-string v2, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 925
    const-string v2, "android.intent.extra.TEXT"

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->createShareEmailContent()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 926
    sget-object v2, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->appContext:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 927
    return-void
.end method

.method private setDetailImageDimens()V
    .locals 4

    .prologue
    .line 240
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 241
    .local v0, "dm":Landroid/util/DisplayMetrics;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 242
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mImageWidth:I

    .line 243
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mDeviceHeight:I

    .line 244
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mImageWidth:I

    iget v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mImageWidth:I

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 245
    .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v2, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 247
    return-void
.end method

.method private setFavoriteButton()V
    .locals 2

    .prologue
    .line 787
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isFavorite:Z

    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    const v1, 0x7f0200b3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 792
    :goto_0
    return-void

    .line 790
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    const v1, 0x7f0200b2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 808
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$9;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$9;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 818
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->phoneButton:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->phoneButtonOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 819
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->websiteButtonOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 820
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shareButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$10;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$10;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 830
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->routeButton:Landroid/view/View;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->routeButtonOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 831
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$11;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$11;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 838
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->closeButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$12;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$12;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 846
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->showPoiInMapButton:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$13;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$13;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 853
    return-void
.end method

.method private setPhotoNumber()V
    .locals 1

    .prologue
    .line 768
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z

    if-eqz v0, :cond_0

    .line 769
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateShowHidePhotoNumber()V

    .line 770
    :cond_0
    return-void
.end method

.method private setScrollerPosition()V
    .locals 3

    .prologue
    .line 773
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 774
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    const/4 v1, 0x0

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScrollPositionSmall:I

    invoke-virtual {v0, v1, v2}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->smoothScrollTo(II)V

    .line 776
    :cond_0
    return-void
.end method

.method private toggleFavorite()V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 897
    const-string v2, "ListOverlayDetailFragment"

    const-string v4, "toggleFavorite()"

    invoke-static {v2, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 898
    const-string v1, ""

    .line 899
    .local v1, "toastMsg":Ljava/lang/String;
    iget-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isFavorite:Z

    if-eqz v2, :cond_0

    .line 900
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->removeFavorite(Landroid/content/Context;Ljava/lang/String;)V

    .line 901
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0d0061

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 909
    :goto_0
    iget-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isFavorite:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    :goto_1
    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isFavorite:Z

    .line 910
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setFavoriteButton()V

    .line 911
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v2, v1, v3}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showToast(Ljava/lang/String;I)V

    .line 912
    return-void

    .line 903
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->addFavorite(Landroid/content/Context;Ljava/lang/String;)V

    .line 904
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 905
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v2, "Content Favorited"

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 906
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v4, "Favorite"

    invoke-virtual {v2, v4, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 907
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

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

    .line 909
    goto :goto_1
.end method


# virtual methods
.method public animateInMainLayout()V
    .locals 30

    .prologue
    .line 485
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 486
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 487
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 488
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->bg:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 492
    const/16 v12, 0x1f4

    .line 493
    .local v12, "fastSpeed":I
    const/16 v13, 0x1f4

    .line 495
    .local v13, "mainSpeed":I
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, -0x3b860000    # -1000.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v25

    .line 496
    .local v25, "startpointBG":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v10

    .line 497
    .local v10, "endpointBG":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/high16 v3, 0x447a0000    # 1000.0f

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v26

    .line 498
    .local v26, "startpointMain":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v11

    .line 500
    .local v11, "endpointMain":F
    new-instance v24, Landroid/animation/AnimatorSet;

    invoke-direct/range {v24 .. v24}, Landroid/animation/AnimatorSet;-><init>()V

    .line 501
    .local v24, "set":Landroid/animation/AnimatorSet;
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 503
    .local v4, "set2":Landroid/animation/AnimatorSet;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    const-string v3, "translationY"

    const/16 v27, 0x2

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    aput v26, v27, v28

    const/16 v28, 0x1

    aput v11, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 504
    .local v7, "animator2":Landroid/animation/ObjectAnimator;
    int-to-long v2, v12

    invoke-virtual {v7, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 506
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "alpha"

    const/16 v27, 0x2

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    fill-array-data v27, :array_0

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    .line 507
    .local v9, "animator3":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    invoke-virtual {v9, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 509
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->bg:Landroid/view/View;

    const-string v3, "translationY"

    const/16 v27, 0x2

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    aput v25, v27, v28

    const/16 v28, 0x1

    aput v10, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 510
    .local v8, "animBG":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    invoke-virtual {v8, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 512
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "alpha"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v15

    .line 513
    .local v15, "photoAlpha":Landroid/animation/ObjectAnimator;
    const-wide/16 v2, 0x64

    invoke-virtual {v15, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 514
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "alpha"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    .line 515
    .local v14, "maskAlpha":Landroid/animation/ObjectAnimator;
    const-wide/16 v2, 0x64

    invoke-virtual {v14, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 517
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "scaleX"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v20

    .line 518
    .local v20, "photoScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v20

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 519
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "scaleY"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v21

    .line 520
    .local v21, "photoScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v21

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 522
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "translationX"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/16 v29, 0x0

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v22

    .line 523
    .local v22, "photoX":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v22

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 524
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const-string v3, "translationY"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/16 v29, 0x0

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v23

    .line 525
    .local v23, "photoY":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v23

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 528
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleX"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v16

    .line 529
    .local v16, "photoMaskScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v16

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 530
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleY"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3f800000    # 1.0f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v17

    .line 531
    .local v17, "photoMaskScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v17

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 532
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "translationX"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/16 v29, 0x0

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v18

    .line 533
    .local v18, "photoMaskX":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 534
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "translationY"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/16 v29, 0x0

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v19

    .line 535
    .local v19, "photoMaskY":Landroid/animation/ObjectAnimator;
    int-to-long v2, v13

    move-object/from16 v0, v19

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 538
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleX"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3fe00000    # 1.75f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 539
    .local v5, "photoMaskScaleXEnd":Landroid/animation/ObjectAnimator;
    int-to-long v2, v12

    invoke-virtual {v5, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 540
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    const-string v3, "scaleY"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [F

    move-object/from16 v27, v0

    const/16 v28, 0x0

    const/high16 v29, 0x3fe00000    # 1.75f

    aput v29, v27, v28

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    .line 541
    .local v6, "photoMaskScaleYEnd":Landroid/animation/ObjectAnimator;
    int-to-long v2, v12

    invoke-virtual {v6, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 543
    move-object/from16 v0, v24

    invoke-virtual {v0, v8}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 544
    move-object/from16 v0, v24

    invoke-virtual {v0, v14}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 545
    move-object/from16 v0, v24

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    move-object/from16 v0, v21

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    .line 546
    move-object/from16 v0, v22

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    move-object/from16 v0, v23

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    .line 547
    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    .line 548
    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    .line 549
    invoke-virtual {v2, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    .line 550
    invoke-virtual {v2, v14}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 552
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$4;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$4;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;Landroid/animation/AnimatorSet;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    move-object/from16 v0, v24

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 571
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$5;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v4, v2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 595
    invoke-virtual/range {v24 .. v24}, Landroid/animation/AnimatorSet;->start()V

    .line 597
    return-void

    .line 506
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public animateOutMainLayout()V
    .locals 28

    .prologue
    .line 603
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-virtual/range {v22 .. v24}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->smoothScrollTo(II)V

    .line 604
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    invoke-virtual/range {v22 .. v23}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 605
    const/16 v7, 0xc8

    .line 606
    .local v7, "fastSpeed":I
    const/16 v8, 0xc8

    .line 607
    .local v8, "mainSpeed":I
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v22

    const/16 v23, 0x0

    invoke-static/range {v22 .. v23}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v21

    .line 608
    .local v21, "startpointMain":F
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v22

    const/high16 v23, 0x447a0000    # 1000.0f

    invoke-static/range {v22 .. v23}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v6

    .line 611
    .local v6, "endpointMain":F
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    move-object/from16 v22, v0

    const-string v23, "translationY"

    const/16 v24, 0x2

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    aput v21, v24, v25

    const/16 v25, 0x1

    aput v6, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 612
    .local v3, "animator2":Landroid/animation/ObjectAnimator;
    const/16 v22, 0x0

    move/from16 v0, v22

    invoke-virtual {v3, v0}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 613
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v3, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 615
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-object/from16 v22, v0

    const-string v23, "alpha"

    const/16 v24, 0x2

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    fill-array-data v24, :array_0

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 616
    .local v4, "animator3":Landroid/animation/ObjectAnimator;
    const/16 v22, 0x0

    move/from16 v0, v22

    invoke-virtual {v4, v0}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 617
    int-to-long v0, v7

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v4, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 619
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    move-object/from16 v22, v0

    const-string v23, "translationY"

    const/16 v24, 0x2

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v26

    const/16 v27, 0x0

    invoke-static/range {v26 .. v27}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v26

    aput v26, v24, v25

    const/16 v25, 0x1

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v26

    const/high16 v27, 0x43480000    # 200.0f

    invoke-static/range {v26 .. v27}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v26

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 620
    .local v5, "animator4":Landroid/animation/ObjectAnimator;
    const/16 v22, 0x0

    move/from16 v0, v22

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 621
    int-to-long v0, v7

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v5, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 624
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-object/from16 v22, v0

    const-string v23, "scaleX"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/high16 v26, 0x3e800000    # 0.25f

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v15

    .line 625
    .local v15, "photoScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v15, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 626
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-object/from16 v22, v0

    const-string v23, "scaleY"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/high16 v26, 0x3e800000    # 0.25f

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v16

    .line 627
    .local v16, "photoScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-object/from16 v0, v16

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 629
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-object/from16 v22, v0

    const-string v23, "translationX"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mIconStartLeft:F

    move/from16 v26, v0

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v17

    .line 630
    .local v17, "photoX":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-object/from16 v0, v17

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 631
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-object/from16 v22, v0

    const-string v23, "translationY"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mIconStartTop:F

    move/from16 v26, v0

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v18

    .line 632
    .local v18, "photoY":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-object/from16 v0, v18

    move-wide/from16 v1, v22

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 634
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    move-object/from16 v22, v0

    const-string v23, "scaleX"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/high16 v26, 0x3e800000    # 0.25f

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    .line 635
    .local v9, "photoMaskScaleX":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v9, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 636
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    move-object/from16 v22, v0

    const-string v23, "scaleY"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/high16 v26, 0x3e800000    # 0.25f

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v11

    .line 637
    .local v11, "photoMaskScaleY":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v11, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 638
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    move-object/from16 v22, v0

    const-string v23, "translationX"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mIconStartLeft:F

    move/from16 v26, v0

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v13

    .line 639
    .local v13, "photoMaskX":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v13, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 640
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    move-object/from16 v22, v0

    const-string v23, "translationY"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mIconStartTop:F

    move/from16 v26, v0

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    .line 641
    .local v14, "photoMaskY":Landroid/animation/ObjectAnimator;
    int-to-long v0, v8

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v14, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 643
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    move-object/from16 v22, v0

    const-string v23, "scaleX"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/high16 v26, 0x3f800000    # 1.0f

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 644
    .local v10, "photoMaskScaleXEnd":Landroid/animation/ObjectAnimator;
    int-to-long v0, v7

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v10, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 645
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    move-object/from16 v22, v0

    const-string v23, "scaleY"

    const/16 v24, 0x1

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    const/high16 v26, 0x3f800000    # 1.0f

    aput v26, v24, v25

    invoke-static/range {v22 .. v24}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v12

    .line 646
    .local v12, "photoMaskScaleYEnd":Landroid/animation/ObjectAnimator;
    int-to-long v0, v7

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    invoke-virtual {v12, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 648
    new-instance v19, Landroid/animation/AnimatorSet;

    invoke-direct/range {v19 .. v19}, Landroid/animation/AnimatorSet;-><init>()V

    .line 649
    .local v19, "set":Landroid/animation/AnimatorSet;
    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    .line 650
    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v11}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v13}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v14}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 652
    new-instance v20, Landroid/animation/AnimatorSet;

    invoke-direct/range {v20 .. v20}, Landroid/animation/AnimatorSet;-><init>()V

    .line 653
    .local v20, "set2":Landroid/animation/AnimatorSet;
    move-object/from16 v0, v20

    invoke-virtual {v0, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v12}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v5}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 656
    new-instance v22, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$6;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v0, v1, v2}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$6;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;Landroid/animation/AnimatorSet;)V

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 674
    new-instance v22, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$7;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$7;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 691
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    move-object/from16 v22, v0

    const/16 v23, 0x4

    invoke-virtual/range {v22 .. v23}, Landroid/view/View;->setVisibility(I)V

    .line 692
    invoke-virtual/range {v20 .. v20}, Landroid/animation/AnimatorSet;->start()V

    .line 695
    return-void

    .line 615
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 152
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 153
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v6

    .line 154
    .local v6, "args":Landroid/os/Bundle;
    if-eqz v6, :cond_0

    .line 155
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 156
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "title"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setTitle(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "image_url"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setImage(Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "id"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setId(Ljava/lang/String;)V

    .line 159
    const-string v0, "address1"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 160
    .local v1, "address1":Ljava/lang/String;
    const-string v0, "address2"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 161
    .local v2, "address2":Ljava/lang/String;
    const-string v0, "city"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 162
    .local v3, "city":Ljava/lang/String;
    const-string v0, "state"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 163
    .local v4, "state":Ljava/lang/String;
    const-string v0, "zip"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 164
    .local v5, "zip":Ljava/lang/String;
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual/range {v0 .. v5}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    const-string v7, "lat"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    const-string v9, "lng"

    invoke-virtual {v6, v9}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    invoke-virtual {v0, v7, v8, v9, v10}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setLocation(DD)V

    .line 167
    .end local v1    # "address1":Ljava/lang/String;
    .end local v2    # "address2":Ljava/lang/String;
    .end local v3    # "city":Ljava/lang/String;
    .end local v4    # "state":Ljava/lang/String;
    .end local v5    # "zip":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v3, 0x0

    .line 173
    const v1, 0x7f030039

    invoke-virtual {p1, v1, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 174
    .local v0, "view":Landroid/view/View;
    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mThisView:Landroid/view/View;

    .line 176
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sput-object v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mContext:Landroid/content/Context;

    .line 177
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 178
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .line 179
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sput-object v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->appContext:Landroid/content/Context;

    .line 181
    const v1, 0x7f0a005a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    .line 182
    const v1, 0x7f0a005b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailView:Landroid/view/ViewGroup;

    .line 185
    const v1, 0x7f0a0041

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->title:Landroid/widget/TextView;

    .line 186
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->title:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypefaceSemibold(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 188
    const v1, 0x7f0a0099

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->smallDetailHolder:Landroid/view/ViewGroup;

    .line 189
    const v1, 0x7f0a0064

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->address:Landroid/widget/TextView;

    .line 190
    sget-object v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->address:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/TextUtils;->setTypefaceLight(Landroid/content/Context;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 191
    const v1, 0x7f0a0065

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->description:Landroid/widget/TextView;

    .line 193
    const v1, 0x7f0a005f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mainLayout:Landroid/view/ViewGroup;

    .line 194
    const v1, 0x7f0a0082

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuLeft:Landroid/view/ViewGroup;

    .line 195
    const v1, 0x7f0a0086

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    .line 196
    const v1, 0x7f0a0087

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->phoneButton:Landroid/widget/ImageView;

    .line 197
    const v1, 0x7f0a0089

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    .line 198
    const v1, 0x7f0a0083

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    .line 199
    const v1, 0x7f0a0062

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->routeButton:Landroid/view/View;

    .line 200
    const v1, 0x7f0a008b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->showPoiInMapButton:Landroid/widget/ImageView;

    .line 201
    const v1, 0x7f0a0063

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mileage:Landroid/widget/TextView;

    .line 202
    const v1, 0x7f0a0085

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shareButton:Landroid/widget/ImageView;

    .line 203
    const v1, 0x7f0a0060

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->closeButton:Landroid/widget/ImageView;

    .line 204
    const v1, 0x7f0a0066

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailBottomNav:Landroid/view/View;

    .line 205
    const v1, 0x7f0a005c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    .line 206
    const v1, 0x7f0a009a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryMask:Landroid/widget/ImageView;

    .line 207
    const v1, 0x7f0a005e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    .line 208
    const v1, 0x7f0a005d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    .line 209
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumberLayout:Landroid/view/View;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 210
    const v1, 0x7f0a0059

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->bg:Landroid/view/View;

    .line 211
    const v1, 0x7f0a009f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mProgressBar:Landroid/view/View;

    .line 214
    const v1, 0x7f0a009b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallDetailsView:Landroid/view/ViewGroup;

    .line 215
    const v1, 0x7f0a009c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallTitle:Landroid/widget/TextView;

    .line 216
    const v1, 0x7f0a009d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallAddress:Landroid/widget/TextView;

    .line 217
    const v1, 0x7f0a009e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallMileage:Landroid/widget/TextView;

    .line 219
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mHidePhotoNumberHandler:Landroid/os/Handler;

    .line 220
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mHidePhotoNumberRunnable:Ljava/lang/Runnable;

    .line 227
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    invoke-virtual {v1, v3}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping(Z)V

    .line 228
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v1, v3}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 229
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/16 v2, 0xc8

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentPixels(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScrollPositionSmall:I

    .line 231
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setDetailImageDimens()V

    .line 232
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->initMainLayout()V

    .line 233
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setListeners()V

    .line 234
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setLimitedData()V

    .line 236
    return-object v0
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 260
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 261
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 252
    const-string v0, "ListOverlayDetailFragment"

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 254
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->makeDetailRequest()V

    .line 256
    return-void
.end method

.method public setLimitedData()V
    .locals 17

    .prologue
    .line 298
    const-string v1, "ListOverlayDetailFragment"

    const-string v2, "setLimitedData()"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v13

    .line 300
    .local v13, "imageUrl":Ljava/lang/String;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    .line 301
    new-instance v1, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-direct {v1, v2, v3}, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    .line 302
    const-string v1, ""

    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 303
    new-instance v16, Lcom/aetn/history/android/historyhere/model/PhotoData;

    const-string v1, ""

    move-object/from16 v0, v16

    invoke-direct {v0, v13, v1}, Lcom/aetn/history/android/historyhere/model/PhotoData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .local v16, "p":Lcom/aetn/history/android/historyhere/model/PhotoData;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    :goto_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 311
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z

    .line 312
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->notifyDataSetChanged()V

    .line 313
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 314
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setCurrentItem(I)V

    .line 315
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->title:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->address:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 318
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallTitle:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallAddress:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v10

    .line 323
    .local v10, "currentUserLocation":Landroid/location/Location;
    if-eqz v10, :cond_0

    .line 324
    const-string v14, ""

    .line 325
    .local v14, "mileageFromUserLocation":Ljava/lang/String;
    const-string v15, ""

    .line 326
    .local v15, "mileageFromUserLocation2":Ljava/lang/String;
    invoke-virtual {v10}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v10}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v5

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shortDetail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v7

    const-string v9, "M"

    invoke-static/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDistanceBetweenLocations(DDDDLjava/lang/String;)D

    move-result-wide v11

    .line 327
    .local v11, "distanceFromUserLocation":D
    const-string v1, "ListOverlayDetailFragment"

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

    .line 328
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    mul-double/2addr v1, v11

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-double v1, v1

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    div-double v11, v1, v3

    .line 329
    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    cmpl-double v1, v11, v1

    if-lez v1, :cond_2

    .line 330
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-double v11, v1

    .line 331
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

    .line 332
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

    .line 337
    :goto_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mileage:Landroid/widget/TextView;

    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mSmallMileage:Landroid/widget/TextView;

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    .end local v11    # "distanceFromUserLocation":D
    .end local v14    # "mileageFromUserLocation":Ljava/lang/String;
    .end local v15    # "mileageFromUserLocation2":Ljava/lang/String;
    :cond_0
    return-void

    .line 307
    .end local v10    # "currentUserLocation":Landroid/location/Location;
    .end local v16    # "p":Lcom/aetn/history/android/historyhere/model/PhotoData;
    :cond_1
    new-instance v16, Lcom/aetn/history/android/historyhere/model/PhotoData;

    const-string v1, ""

    const-string v2, ""

    move-object/from16 v0, v16

    invoke-direct {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/PhotoData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .restart local v16    # "p":Lcom/aetn/history/android/historyhere/model/PhotoData;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 334
    .restart local v10    # "currentUserLocation":Landroid/location/Location;
    .restart local v11    # "distanceFromUserLocation":D
    .restart local v14    # "mileageFromUserLocation":Ljava/lang/String;
    .restart local v15    # "mileageFromUserLocation2":Ljava/lang/String;
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " miles"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 335
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
.end method

.method public setRemainingData()V
    .locals 14

    .prologue
    const v13, 0x7f02010a

    const/4 v12, 0x0

    const/16 v11, 0x8

    const/4 v10, 0x5

    const/4 v9, 0x1

    .line 346
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mProgressBar:Landroid/view/View;

    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 347
    const-string v6, "ListOverlayDetailFragment"

    const-string v7, "setRemainingData()"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    iput-boolean v9, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mDataLoaded:Z

    .line 349
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIDetail()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v6

    iput-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 350
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isFavorite:Z

    .line 351
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setFavoriteButton()V

    .line 352
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getAssets()Ljava/util/ArrayList;

    move-result-object v1

    .line 354
    .local v1, "assets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;>;"
    if-eqz v1, :cond_1

    .line 355
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

    .line 356
    .local v0, "a":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->isAssetTypeImage()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 357
    new-instance v3, Lcom/aetn/history/android/historyhere/model/PhotoData;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->getImageURL()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->getImageCredit()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v3, v7, v8}, Lcom/aetn/history/android/historyhere/model/PhotoData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .local v3, "pd":Lcom/aetn/history/android/historyhere/model/PhotoData;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 363
    .end local v0    # "a":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    .end local v3    # "pd":Lcom/aetn/history/android/historyhere/model/PhotoData;
    :cond_1
    const-string v6, "ListOverlayDetailFragment"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "setData(): there are # of photos:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-le v6, v9, :cond_9

    .line 365
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/adapters/DetailPhotoPagerAdapter;->notifyDataSetChanged()V

    .line 366
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    new-instance v7, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$3;

    invoke-direct {v7, p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$3;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    invoke-virtual {v6, v7}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 382
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 383
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->getCurrentItem()I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " of "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 384
    iput-boolean v9, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z

    .line 391
    :goto_1
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 392
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuLeft:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->favoriteButton:Landroid/widget/ImageView;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 393
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->shareButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v13}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 394
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuLeft:Landroid/view/ViewGroup;

    const v7, 0x7f0a0084

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 396
    :cond_2
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->description:Landroid/widget/TextView;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 397
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedPhoneNumber()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_3

    .line 398
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->phoneButton:Landroid/widget/ImageView;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 399
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mThisView:Landroid/view/View;

    const v8, 0x7f0a0088

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 401
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f020105

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 403
    :cond_3
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getWebsite()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_4

    .line 404
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->websiteButton:Landroid/widget/ImageView;

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 405
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->menuRight:Landroid/view/ViewGroup;

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mThisView:Landroid/view/View;

    const v8, 0x7f0a008a

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 408
    :cond_4
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getWebsite()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_5

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedPhoneNumber()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v10, :cond_5

    .line 409
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->showPoiInMapButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v13}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 413
    :cond_5
    new-instance v4, Landroid/view/View;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v4, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 414
    .local v4, "spacer":Landroid/view/View;
    const/16 v6, 0xa

    invoke-virtual {v4, v6}, Landroid/view/View;->setMinimumHeight(I)V

    .line 415
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detailView:Landroid/view/ViewGroup;

    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 418
    const-string v6, "HH:Places:*"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 419
    .local v5, "tag":Ljava/lang/String;
    iget-boolean v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->isFavorite:Z

    if-eqz v6, :cond_a

    .line 420
    const-string v6, "HH:Favorites:*"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 427
    :cond_6
    :goto_2
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v6, v5}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsScreen(Ljava/lang/String;)V

    .line 428
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 429
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsIncrementTourPoiViewedCount()V

    .line 434
    :cond_7
    iget-boolean v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mBeginningAnimationFinished:Z

    if-eqz v6, :cond_8

    .line 435
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateInNavItems()V

    .line 436
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setPhotoNumber()V

    .line 437
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mScroller:Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;

    invoke-virtual {v6, v9}, Lcom/nirhart/parallaxscroll/views/ParallaxScrollView;->allowSwiping(Z)V

    .line 438
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v6, v9}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 442
    :cond_8
    return-void

    .line 386
    .end local v4    # "spacer":Landroid/view/View;
    .end local v5    # "tag":Ljava/lang/String;
    :cond_9
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;

    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setVisibility(I)V

    .line 387
    iput-boolean v12, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mPhotoGalleryActive:Z

    goto/16 :goto_1

    .line 421
    .restart local v4    # "spacer":Landroid/view/View;
    .restart local v5    # "tag":Ljava/lang/String;
    :cond_a
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 423
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v2

    .line 424
    .local v2, "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    const-string v6, "HH:Tours:*"

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedLocalyticsTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 425
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

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
