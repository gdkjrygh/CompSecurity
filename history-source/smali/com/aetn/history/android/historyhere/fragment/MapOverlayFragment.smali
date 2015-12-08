.class public Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
.super Landroid/support/v4/app/Fragment;
.source "MapOverlayFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;,
        Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private isDetailOpen:Z

.field private isMapViewSatellite:Z

.field private mAnimationInited:Z

.field private mCurrentPOIList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mDetailPager:Landroid/view/ViewGroup;

.field private mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

.field private mDetailSwiperShown:Z

.field private mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

.field private mDetailViewPagerClosedHeight:I

.field private mDetailViewPagerOpenHeight:I

.field private mFromExternallySelectedAction:Z

.field public mIsDetailVisible:Z

.field private mListBtn:Landroid/view/View;

.field private mMapSettingsOpen:Z

.field private mMenuBtn:Landroid/view/View;

.field private mMenuLayout:Landroid/view/ViewGroup;

.field private mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

.field private mNewPOIList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mNextPoiIcon:Landroid/widget/ImageView;

.field private mPreviousPoiIcon:Landroid/widget/ImageView;

.field private mPullTab:Landroid/widget/ImageView;

.field private mRelocateBtn:Landroid/view/View;

.field private mRightMenu:Landroid/view/ViewGroup;

.field private mSatelliteBtn:Landroid/view/View;

.field private mSettingsBtn:Landroid/view/View;

.field private mSettingsMenu:Landroid/view/ViewGroup;

.field private mShowAllMapSettingsButtons:Z

.field private mShowSearchBtn:Landroid/view/View;

.field private mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

.field private mSuggestBtn:Landroid/view/View;

.field private mTargetedPOI:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private mThis:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

.field private mThisView:Landroid/view/View;

.field private mTourHeader:Landroid/view/ViewGroup;

.field private mUnclusteredMapMarkersChanged:Z

.field private mViewportHeight:I

.field private mWaitToReloadAdapter:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 43
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    .line 54
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mFromExternallySelectedAction:Z

    .line 69
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMapSettingsOpen:Z

    .line 70
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowAllMapSettingsButtons:Z

    .line 71
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isMapViewSatellite:Z

    .line 73
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mUnclusteredMapMarkersChanged:Z

    .line 74
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z

    .line 77
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerClosedHeight:I

    .line 78
    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerOpenHeight:I

    .line 79
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mAnimationInited:Z

    .line 81
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    .line 86
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isDetailOpen:Z

    .line 87
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailSwiperShown:Z

    .line 861
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->collapseMapSettingsMenu()V

    return-void
.end method

.method static synthetic access$102(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 43
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mUnclusteredMapMarkersChanged:Z

    return p1
.end method

.method static synthetic access$1100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mFromExternallySelectedAction:Z

    return v0
.end method

.method static synthetic access$1102(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 43
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mFromExternallySelectedAction:Z

    return p1
.end method

.method static synthetic access$1200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;I)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # I

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setNextPreviousIcons(I)V

    return-void
.end method

.method static synthetic access$1400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailSwiperShown:Z

    return v0
.end method

.method static synthetic access$1402(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 43
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailSwiperShown:Z

    return p1
.end method

.method static synthetic access$1502(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 43
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isDetailOpen:Z

    return p1
.end method

.method static synthetic access$1600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)I
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerClosedHeight:I

    return v0
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z

    return v0
.end method

.method static synthetic access$202(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 43
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z

    return p1
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$302(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 43
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    return-object v0
.end method

.method static synthetic access$502(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 43
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTargetedPOI:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object p1
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    return-object v0
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNewPOIList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$702(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 43
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNewPOIList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$800(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->reloadAdapter()V

    return-void
.end method

.method static synthetic access$900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->toggleMapSettingsMenu()V

    return-void
.end method

.method private checkRelocationButton()V
    .locals 12

    .prologue
    .line 443
    :try_start_0
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v7

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMapLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    .line 444
    .local v2, "ll":Lcom/google/android/gms/maps/model/LatLng;
    if-eqz v2, :cond_0

    .line 446
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v1

    .line 447
    .local v1, "l":Landroid/location/Location;
    const-string v7, "%.2f"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-wide v10, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 448
    .local v3, "mapLat":Ljava/lang/String;
    const-string v7, "%.2f"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 449
    .local v5, "userLat":Ljava/lang/String;
    const-string v7, "%.2f"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-wide v10, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 450
    .local v4, "mapLng":Ljava/lang/String;
    const-string v7, "%.2f"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 451
    .local v6, "userLng":Ljava/lang/String;
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 452
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    check-cast v7, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0200bf

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 460
    .end local v1    # "l":Landroid/location/Location;
    .end local v2    # "ll":Lcom/google/android/gms/maps/model/LatLng;
    .end local v3    # "mapLat":Ljava/lang/String;
    .end local v4    # "mapLng":Ljava/lang/String;
    .end local v5    # "userLat":Ljava/lang/String;
    .end local v6    # "userLng":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 454
    .restart local v1    # "l":Landroid/location/Location;
    .restart local v2    # "ll":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v3    # "mapLat":Ljava/lang/String;
    .restart local v4    # "mapLng":Ljava/lang/String;
    .restart local v5    # "userLat":Ljava/lang/String;
    .restart local v6    # "userLng":Ljava/lang/String;
    :cond_1
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    check-cast v7, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0200c0

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 457
    .end local v1    # "l":Landroid/location/Location;
    .end local v2    # "ll":Lcom/google/android/gms/maps/model/LatLng;
    .end local v3    # "mapLat":Ljava/lang/String;
    .end local v4    # "mapLng":Ljava/lang/String;
    .end local v5    # "userLat":Ljava/lang/String;
    .end local v6    # "userLng":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 458
    .local v0, "e":Ljava/lang/IllegalStateException;
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_0
.end method

.method private collapseMapSettingsMenu()V
    .locals 4

    .prologue
    const v3, 0x7f020110

    const/4 v2, 0x0

    const/16 v1, 0x8

    .line 357
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->isUsersLocationKnown()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 359
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 360
    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMapSettingsOpen:Z

    .line 361
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 362
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 378
    :goto_0
    return-void

    .line 365
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 366
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 367
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 369
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isMapViewSatellite:Z

    if-eqz v0, :cond_1

    .line 370
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 371
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020111

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 373
    :cond_1
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c3

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 374
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private expandMapSettingsMenu()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 385
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->checkRelocationButton()V

    .line 386
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 387
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 388
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMapSettingsOpen:Z

    .line 389
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020111

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 390
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c5

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 391
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isMapViewSatellite:Z

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 397
    :goto_0
    return-void

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private reloadAdapter()V
    .locals 2

    .prologue
    .line 718
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNewPOIList:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    .line 719
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->resetData(Ljava/util/ArrayList;)V

    .line 720
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z

    .line 721
    return-void
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 138
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setOnUnclusteredMapMarkersListener(Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;)V

    .line 181
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$3;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$4;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mListBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowSearchBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$6;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$6;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMenuBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$7;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$7;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSuggestBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$8;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$8;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mPullTab:Landroid/widget/ImageView;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$9;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$9;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 250
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 293
    return-void
.end method

.method private setNextPreviousIcons(I)V
    .locals 3
    .param p1, "index"    # I

    .prologue
    const/4 v2, 0x4

    const/4 v1, 0x0

    .line 489
    if-nez p1, :cond_0

    .line 490
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mPreviousPoiIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 494
    :goto_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 495
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNextPoiIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 499
    :goto_1
    return-void

    .line 492
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mPreviousPoiIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 497
    :cond_1
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNextPoiIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method private setPOIByIndex(I)V
    .locals 3
    .param p1, "i"    # I

    .prologue
    .line 724
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setPOIByIndex()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 725
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->invalidate()V

    .line 726
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setCurrentItem(IZ)V

    .line 727
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mPreviousPoiIcon:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 728
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setNextPreviousIcons(I)V

    .line 729
    return-void
.end method

.method private showNormalMapView()V
    .locals 3

    .prologue
    .line 431
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setMapTypeNormal()V

    .line 432
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowAllMapSettingsButtons:Z

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 438
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isMapViewSatellite:Z

    .line 439
    return-void

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c3

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 436
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020110

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private showSatelliteMapView()V
    .locals 3

    .prologue
    const v2, 0x7f0200c1

    .line 420
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setMapTypeSatellite()V

    .line 421
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowAllMapSettingsButtons:Z

    if-nez v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 423
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020111

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 427
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isMapViewSatellite:Z

    .line 428
    return-void

    .line 425
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private toggleMapSettingsMenu()V
    .locals 1

    .prologue
    .line 346
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMapSettingsOpen:Z

    if-eqz v0, :cond_0

    .line 347
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->collapseMapSettingsMenu()V

    .line 351
    :goto_0
    return-void

    .line 349
    :cond_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->expandMapSettingsMenu()V

    goto :goto_0
.end method


# virtual methods
.method public animateCloseDetail()V
    .locals 7

    .prologue
    const-wide/16 v5, 0x1f4

    .line 780
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 782
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iget v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerOpenHeight:I

    iget v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerClosedHeight:I

    invoke-direct {v0, p0, v2, v3, v4}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Landroid/view/View;II)V

    .line 783
    .local v0, "ani":Landroid/view/animation/Animation;
    invoke-virtual {v0, v5, v6}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 784
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v2, v0}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->startAnimation(Landroid/view/animation/Animation;)V

    .line 785
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->getCurrentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .line 786
    .local v1, "frag":Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    if-eqz v1, :cond_0

    .line 787
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateOutMainLayout()V

    .line 789
    :cond_0
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;

    invoke-direct {v3, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$13;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v2, v3, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 797
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$14;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 829
    return-void
.end method

.method public animateExpandDetail()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x1

    .line 750
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iget v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerOpenHeight:I

    invoke-direct {v0, p0, v2, v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Landroid/view/View;I)V

    .line 751
    .local v0, "ani":Landroid/view/animation/Animation;
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 752
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v2, v0}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->startAnimation(Landroid/view/animation/Animation;)V

    .line 754
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v3, "the y value of the tour header is: "

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 757
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->getCurrentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .line 758
    .local v1, "frag":Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
    if-eqz v1, :cond_0

    .line 760
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$12;

    invoke-direct {v3, p0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$12;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    const-wide/16 v4, 0xc8

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 768
    :cond_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->allowSwiping(Z)V

    .line 769
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNextPoiIcon:Landroid/widget/ImageView;

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 770
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mPreviousPoiIcon:Landroid/widget/ImageView;

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 771
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-boolean v6, v2, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mMapDetailActive:Z

    .line 772
    iput-boolean v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isDetailOpen:Z

    .line 773
    return-void
.end method

.method public animateHideDetailPager()V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/high16 v9, 0x41200000    # 10.0f

    const/4 v10, 0x0

    .line 510
    iget-boolean v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isDetailOpen:Z

    if-eqz v7, :cond_0

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateCloseDetail()V

    .line 511
    :cond_0
    const/16 v6, 0x12c

    .line 512
    .local v6, "speed":I
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 513
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    const/high16 v8, -0x3c380000    # -400.0f

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v2

    .line 514
    .local v2, "endpointPager":F
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-static {v7, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v3

    .line 516
    .local v3, "endpointSettings":F
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    .line 517
    .local v4, "heightOfHeader":I
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 518
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-static {v7, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v7

    int-to-float v8, v4

    add-float v3, v7, v8

    .line 520
    :cond_1
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    const-string v8, "translationY"

    new-array v9, v11, [F

    aput v2, v9, v10

    invoke-static {v7, v8, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 521
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v10}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 522
    int-to-long v7, v6

    invoke-virtual {v0, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 523
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    const-string v8, "translationY"

    new-array v9, v11, [F

    aput v3, v9, v10

    invoke-static {v7, v8, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 524
    .local v1, "animator2":Landroid/animation/ObjectAnimator;
    invoke-virtual {v1, v10}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 525
    int-to-long v7, v6

    invoke-virtual {v1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 527
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 528
    .local v5, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 529
    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v7

    invoke-virtual {v7, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 530
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 532
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->collapseMapSettingsMenu()V

    .line 533
    iput-boolean v10, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    .line 535
    return-void
.end method

.method public animateHideTourHeaderForOpenDetail()V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 897
    const/16 v5, 0x12c

    .line 900
    .local v5, "speed":I
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getHeight()I

    move-result v3

    .line 901
    .local v3, "heightOfHeader":I
    rsub-int/lit8 v2, v3, 0x0

    .line 903
    .local v2, "endPointOfHideTour":I
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    const-string v7, "translationY"

    new-array v8, v11, [F

    const/4 v9, 0x0

    aput v9, v8, v10

    invoke-static {v6, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 904
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    int-to-long v6, v5

    invoke-virtual {v0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 905
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    const-string v7, "translationY"

    new-array v8, v11, [F

    int-to-float v9, v2

    aput v9, v8, v10

    invoke-static {v6, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 906
    .local v1, "animator2":Landroid/animation/ObjectAnimator;
    int-to-long v6, v5

    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 908
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 909
    .local v4, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 910
    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v6

    invoke-virtual {v6, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 911
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 913
    new-instance v6, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$15;

    invoke-direct {v6, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$15;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v4, v6}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 929
    return-void
.end method

.method public animateInDetail()V
    .locals 2

    .prologue
    .line 732
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mAnimationInited:Z

    if-nez v0, :cond_0

    .line 733
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerClosedHeight:I

    .line 734
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mAnimationInited:Z

    .line 737
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mViewportHeight:I

    .line 738
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mViewportHeight:I

    iget v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerClosedHeight:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerOpenHeight:I

    .line 739
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 740
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateHideTourHeaderForOpenDetail()V

    .line 747
    :goto_0
    return-void

    .line 743
    :cond_1
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateExpandDetail()V

    goto :goto_0
.end method

.method public hideDetailPager()V
    .locals 2

    .prologue
    .line 502
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 503
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 504
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    .line 506
    :cond_0
    return-void
.end method

.method public hideMenu()V
    .locals 2

    .prologue
    .line 624
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMenuLayout:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 625
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMenuLayout:Landroid/view/ViewGroup;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 626
    :cond_0
    return-void
.end method

.method public hideRightMenu()V
    .locals 2

    .prologue
    .line 634
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRightMenu:Landroid/view/ViewGroup;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 635
    return-void
.end method

.method public hideSettingsMenu()V
    .locals 2

    .prologue
    .line 405
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 407
    :cond_0
    return-void
.end method

.method public hideTourHeader()V
    .locals 2

    .prologue
    .line 619
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 620
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 621
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 94
    iput-object p0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThis:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .line 96
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v1, "onCreateView: "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const v0, 0x7f03003f

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    .line 98
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00aa

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    .line 99
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00ac

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNextPoiIcon:Landroid/widget/ImageView;

    .line 100
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00ab

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mPreviousPoiIcon:Landroid/widget/ImageView;

    .line 101
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00ad

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mPullTab:Landroid/widget/ImageView;

    .line 102
    new-instance v0, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    .line 103
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00a9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    .line 104
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00a0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    .line 105
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00c3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/NetworkImageView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    .line 108
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a00a8

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMenuLayout:Landroid/view/ViewGroup;

    .line 109
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a008f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMenuBtn:Landroid/view/View;

    .line 110
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a008d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mListBtn:Landroid/view/View;

    .line 111
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a0091

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowSearchBtn:Landroid/view/View;

    .line 112
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a0090

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSuggestBtn:Landroid/view/View;

    .line 113
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a0086

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRightMenu:Landroid/view/ViewGroup;

    .line 115
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a0092

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    .line 116
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a0093

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    .line 117
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a0095

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    .line 118
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v1, 0x7f0a0094

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    .line 119
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .line 123
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 124
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->hideDetailPager()V

    .line 125
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->hideTourHeader()V

    .line 126
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setListeners()V

    .line 127
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v1, "onDestroy()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 134
    return-void
.end method

.method public setData()V
    .locals 2

    .prologue
    .line 463
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v1, "setData():"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 464
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 467
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mUnclusteredMapMarkersChanged:Z

    if-eqz v0, :cond_0

    .line 468
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v1, "setData():mUnclusteredMapMarkersChanged: load the new markers and let the listener hande the rest"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->loadUnclusteredMapPois()V

    .line 486
    :goto_0
    return-void

    .line 471
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v1, "setData():mUnclusteredMapMarkers has not Changed: use the current data"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->resetData(Ljava/util/ArrayList;)V

    .line 473
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPoiInList()V

    goto :goto_0

    .line 476
    :cond_1
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 477
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    .line 478
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->resetData(Ljava/util/ArrayList;)V

    .line 479
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPoiInList()V

    goto :goto_0

    .line 481
    :cond_2
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentFavoriteList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    .line 482
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPagerAdapter:Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/adapters/DetailPagerAdapter;->resetData(Ljava/util/ArrayList;)V

    .line 483
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPoiInList()V

    goto :goto_0
.end method

.method public setMapSettingsMenu()V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/high16 v10, 0x42fa0000    # 125.0f

    const/high16 v7, 0x41200000    # 10.0f

    const/16 v9, 0x8

    const/4 v8, 0x0

    .line 299
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v6, "setMapSettingsMenu()"

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-static {v5, v7}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v1

    .line 302
    .local v1, "endpointSettings":F
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    .line 303
    .local v2, "heightOfHeader":I
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 304
    iget-boolean v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    if-eqz v5, :cond_1

    .line 305
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-static {v5, v10}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    int-to-float v6, v2

    add-float v1, v5, v6

    .line 314
    :cond_0
    :goto_0
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    const-string v6, "translationY"

    new-array v7, v11, [F

    aput v1, v7, v8

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 315
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    invoke-virtual {v0, v8}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 316
    const-wide/16 v5, 0x64

    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 317
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 318
    .local v4, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 319
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 320
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/LocationManager;->isUsersLocationKnown()Z

    move-result v3

    .line 321
    .local v3, "isknown":Z
    if-eqz v3, :cond_3

    .line 322
    iput-boolean v11, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowAllMapSettingsButtons:Z

    .line 323
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    .line 324
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 325
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 332
    :goto_1
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v5

    if-nez v5, :cond_4

    .line 333
    iput-boolean v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowAllMapSettingsButtons:Z

    .line 334
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 335
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 336
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    .line 337
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v5, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0200c3

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 341
    :goto_2
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->collapseMapSettingsMenu()V

    .line 342
    return-void

    .line 307
    .end local v0    # "animator1":Landroid/animation/ObjectAnimator;
    .end local v3    # "isknown":Z
    .end local v4    # "set":Landroid/animation/AnimatorSet;
    :cond_1
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-static {v5, v7}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v5

    int-to-float v6, v2

    add-float v1, v5, v6

    goto :goto_0

    .line 310
    :cond_2
    iget-boolean v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    if-eqz v5, :cond_0

    .line 311
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-static {v5, v10}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v1

    goto/16 :goto_0

    .line 327
    .restart local v0    # "animator1":Landroid/animation/ObjectAnimator;
    .restart local v3    # "isknown":Z
    .restart local v4    # "set":Landroid/animation/AnimatorSet;
    :cond_3
    iput-boolean v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mShowAllMapSettingsButtons:Z

    .line 328
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsBtn:Landroid/view/View;

    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 329
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRelocateBtn:Landroid/view/View;

    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 330
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 339
    :cond_4
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSatelliteBtn:Landroid/view/View;

    check-cast v5, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0200c2

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2
.end method

.method public setPoiInList()V
    .locals 5

    .prologue
    .line 680
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTargetedPOI:Lcom/aetn/history/android/historyhere/model/POIDetail;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    if-eqz v2, :cond_2

    .line 681
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setPoiInList()mTargetedPOI: title"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTargetedPOI:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 682
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 683
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 684
    .local v1, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTargetedPOI:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 685
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mFromExternallySelectedAction:Z

    .line 686
    invoke-direct {p0, v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPOIByIndex(I)V

    .line 693
    .end local v0    # "i":I
    .end local v1    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    :goto_1
    return-void

    .line 682
    .restart local v0    # "i":I
    .restart local v1    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 691
    .end local v0    # "i":I
    .end local v1    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_2
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v3, "no mTargetedPOI"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public setPoiInList(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 3
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 701
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setPoiInList(poi) this title"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setTargetPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 703
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPoiInList()V

    .line 704
    return-void
.end method

.method public setTargetPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 3
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 707
    if-eqz p1, :cond_0

    .line 708
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setTargetPoi()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 710
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTargetedPOI:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 711
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z

    if-eqz v0, :cond_0

    .line 712
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->reloadAdapter()V

    .line 715
    :cond_0
    return-void
.end method

.method public setUI()V
    .locals 2

    .prologue
    .line 643
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 644
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 645
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 649
    :cond_0
    :goto_0
    return-void

    .line 647
    :cond_1
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0
.end method

.method public showDetailPager()V
    .locals 14

    .prologue
    .line 543
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setData()V

    .line 544
    const/16 v6, 0x12c

    .line 545
    .local v6, "speed":I
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 548
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    .line 549
    .local v4, "heightOfHeader":I
    const/4 v2, 0x0

    .line 550
    .local v2, "endpointPager":F
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x41200000    # 10.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v7

    .line 551
    .local v7, "startpointSettings":F
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x42fa0000    # 125.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v3

    .line 552
    .local v3, "endpointSettings":F
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 553
    int-to-float v2, v4

    .line 554
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x42fa0000    # 125.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    int-to-float v9, v4

    add-float v3, v8, v9

    .line 555
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const/high16 v9, 0x41200000    # 10.0f

    invoke-static {v8, v9}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v8

    int-to-float v9, v4

    add-float v7, v8, v9

    .line 557
    :cond_0
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;

    const-string v9, "translationY"

    const/4 v10, 0x2

    new-array v10, v10, [F

    const/4 v11, 0x0

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v12

    const/high16 v13, -0x3c380000    # -400.0f

    invoke-static {v12, v13}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentFloat(Landroid/content/Context;F)F

    move-result v12

    aput v12, v10, v11

    const/4 v11, 0x1

    aput v2, v10, v11

    invoke-static {v8, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 558
    .local v0, "animator1":Landroid/animation/ObjectAnimator;
    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 559
    int-to-long v8, v6

    invoke-virtual {v0, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 560
    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    const-string v9, "translationY"

    const/4 v10, 0x2

    new-array v10, v10, [F

    const/4 v11, 0x0

    aput v7, v10, v11

    const/4 v11, 0x1

    aput v3, v10, v11

    invoke-static {v8, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 561
    .local v1, "animator2":Landroid/animation/ObjectAnimator;
    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 562
    int-to-long v8, v6

    invoke-virtual {v1, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 564
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 565
    .local v5, "set":Landroid/animation/AnimatorSet;
    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 566
    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v8

    invoke-virtual {v8, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 567
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 569
    new-instance v8, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;

    invoke-direct {v8, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$11;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    invoke-virtual {v5, v8}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 615
    const/4 v8, 0x1

    iput-boolean v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    .line 616
    return-void
.end method

.method public showMenu()V
    .locals 2

    .prologue
    .line 629
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMenuLayout:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 630
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mMenuLayout:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 631
    :cond_0
    return-void
.end method

.method public showRightMenu()V
    .locals 2

    .prologue
    .line 639
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mRightMenu:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 640
    return-void
.end method

.method public showSettingsMenu()V
    .locals 2

    .prologue
    .line 400
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 401
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSettingsMenu:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 402
    :cond_0
    return-void
.end method

.method public showTourHeader()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 652
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    if-eqz v5, :cond_0

    .line 653
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 655
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourDetailPOI()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    .line 656
    .local v1, "currTourDetail":Lcom/aetn/history/android/historyhere/model/POI;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mThisView:Landroid/view/View;

    const v6, 0x7f0a00e5

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 657
    .local v4, "tv":Landroid/widget/TextView;
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POI;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 659
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    const v6, 0x7f0a00e6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 660
    .local v0, "city":Landroid/widget/TextView;
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POI;->getCityStateString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 662
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 663
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v5

    check-cast v5, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v5

    iget-object v3, v5, Lcom/aetn/history/android/historyhere/model/Configuration;->tourSponsorData:Ljava/util/ArrayList;

    .line 664
    .local v3, "sponsorData":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;>;"
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;

    .line 665
    .local v2, "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    iget-object v6, v2, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->id:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POI;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 667
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    iget-object v6, v2, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->stripImageURL:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 668
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mSponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {v5, v8}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 673
    .end local v2    # "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    :cond_2
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTourHeader:Landroid/view/ViewGroup;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->setTranslationY(F)V

    .line 674
    return-void
.end method

.method public toggleMapView()V
    .locals 2

    .prologue
    .line 410
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;

    const-string v1, "toggleMapView"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->isMapViewSatellite:Z

    if-eqz v0, :cond_0

    .line 412
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->showNormalMapView()V

    .line 416
    :goto_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->collapseMapSettingsMenu()V

    .line 417
    return-void

    .line 414
    :cond_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->showSatelliteMapView()V

    goto :goto_0
.end method
