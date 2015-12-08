.class public Lcom/aetn/history/android/historyhere/fragment/MapFragment;
.super Landroid/support/v4/app/Fragment;
.source "MapFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;,
        Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private currentPoiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private enableMenuRefresh:Ljava/lang/Boolean;

.field private isMapViewSatellite:Z

.field private latLngChangeAllowance:D

.field private mCancelSearchBtn:Landroid/view/View;

.field private mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mCurrentlySelectedPoi:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field private mCurrentlySelectedPoiIndex:I

.field private mDoSearchBtn:Landroid/view/View;

.field private mFavoritesString:Ljava/lang/String;

.field public mMapContainer:Landroid/view/ViewGroup;

.field private mMapInited:Z

.field private mMapMarkers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private mMapZoomError:Landroid/widget/TextView;

.field private mPoiRenderer:Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

.field private mProgressBar:Landroid/widget/ProgressBar;

.field private mSearchEditText:Landroid/widget/EditText;

.field private mSearchView:Landroid/view/ViewGroup;

.field private map:Lcom/google/android/gms/maps/GoogleMap;

.field private mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

.field private mapUpdateHandler:Landroid/os/Handler;

.field private mapUpdateRunnable:Ljava/lang/Runnable;

.field private newPoiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private poiLoading:Ljava/lang/Boolean;

.field private selectedMarker:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 104
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    .line 65
    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->isMapViewSatellite:Z

    .line 66
    const-wide v0, 0x3f947ae147ae147bL    # 0.02

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->latLngChangeAllowance:D

    .line 78
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->poiLoading:Ljava/lang/Boolean;

    .line 79
    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z

    .line 85
    iput v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mCurrentlySelectedPoiIndex:I

    .line 95
    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mFavoritesString:Ljava/lang/String;

    .line 107
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateHandler:Landroid/os/Handler;

    .line 108
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$1;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateRunnable:Ljava/lang/Runnable;

    .line 105
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)D
    .locals 2
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->latLngChangeAllowance:D

    return-wide v0
.end method

.method static synthetic access$102(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/google/android/gms/maps/GoogleMap;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Lcom/google/android/gms/maps/GoogleMap;

    .prologue
    .line 63
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/Boolean;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->poiLoading:Ljava/lang/Boolean;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z

    return v0
.end method

.method static synthetic access$1202(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z

    return p1
.end method

.method static synthetic access$1300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/Runnable;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateRunnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Landroid/os/Handler;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->checkRelocationButton()V

    return-void
.end method

.method static synthetic access$1600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getPoiById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1700(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mFavoritesString:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1702(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 63
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mFavoritesString:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1800(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V

    return-void
.end method

.method static synthetic access$1900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideSearch()V

    return-void
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setInitialMapLocation()V

    return-void
.end method

.method static synthetic access$2000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$2100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->doSearch(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$2200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    return-void
.end method

.method static synthetic access$2300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)I
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mCurrentlySelectedPoiIndex:I

    return v0
.end method

.method static synthetic access$2400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2500(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Z)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedMarkerIcon(Z)V

    return-void
.end method

.method static synthetic access$2600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    return-void
.end method

.method static synthetic access$2700(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setPlacesMapListeners()V

    return-void
.end method

.method static synthetic access$2900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/maps/android/clustering/ClusterManager;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    return-object v0
.end method

.method static synthetic access$3000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$302(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/google/maps/android/clustering/ClusterManager;)Lcom/google/maps/android/clustering/ClusterManager;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Lcom/google/maps/android/clustering/ClusterManager;

    .prologue
    .line 63
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    return-object p1
.end method

.method static synthetic access$3100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$3200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$3300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$3400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/util/ArrayList;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Ljava/util/ArrayList;

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->fireOnClustersDone(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mPoiRenderer:Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    return-object v0
.end method

.method static synthetic access$402(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;)Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    .prologue
    .line 63
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mPoiRenderer:Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    return-object p1
.end method

.method static synthetic access$500(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setListeners()V

    return-void
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->cancelPOIRequest()V

    return-void
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z

    return v0
.end method

.method static synthetic access$702(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    .param p1, "x1"    # Z

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z

    return p1
.end method

.method static synthetic access$800(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Z
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->isCameraZoomedOutToMax()Z

    move-result v0

    return v0
.end method

.method static synthetic access$900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/HistoryHereApplication;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 63
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    return-object v0
.end method

.method private addFavoritesMarkers()V
    .locals 12

    .prologue
    const/4 v11, 0x0

    .line 787
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v5, "addFavoritesMarkers()"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 788
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mContext:Landroid/content/Context;

    invoke-static {v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v4

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentFavoritesListFromDB(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    .line 789
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapMarkers:Ljava/util/ArrayList;

    .line 790
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v4}, Lcom/google/maps/android/clustering/ClusterManager;->clearItems()V

    .line 791
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/GoogleMap;->clear()V

    .line 792
    new-instance v1, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 794
    .local v1, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_1

    .line 795
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "addFavoritesMarkers(): POIs number:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 797
    .local v3, "thisPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v6, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v6}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 798
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v6

    .line 799
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v6

    .line 797
    invoke-virtual {v5, v6}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    .line 801
    .local v2, "m":Lcom/google/android/gms/maps/model/Marker;
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/google/android/gms/maps/model/Marker;->setIcon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)V

    .line 804
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 805
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapMarkers:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 807
    .end local v2    # "m":Lcom/google/android/gms/maps/model/Marker;
    .end local v3    # "thisPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->currentPoiList:Ljava/util/ArrayList;

    .line 809
    :cond_1
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_2

    .line 810
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    .line 811
    .local v0, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/16 v5, 0x64

    invoke-static {v0, v5}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 817
    .end local v0    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    :goto_1
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->poiLoading:Ljava/lang/Boolean;

    .line 818
    return-void

    .line 813
    :cond_2
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v6, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    .line 814
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v7

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v9

    invoke-direct {v6, v7, v8, v9, v10}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v4, 0x41200000    # 10.0f

    .line 813
    invoke-static {v6, v4}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto :goto_1
.end method

.method private addMarkers()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 776
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 777
    invoke-direct {p0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addPlacesMarkers(Ljava/util/ArrayList;)V

    .line 783
    :goto_0
    return-void

    .line 778
    :cond_0
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 779
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addFavoritesMarkers()V

    goto :goto_0

    .line 781
    :cond_1
    invoke-direct {p0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addTourMarkers(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private addPlacesMarkers(Ljava/util/ArrayList;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 822
    .local p1, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v1, "addPlacesMarkers()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 824
    if-eqz p1, :cond_0

    .line 825
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    .line 833
    :goto_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->clearItems()V

    .line 834
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 835
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addPlacesMarkers(): POIs number:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 836
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 837
    .local v12, "thisPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v1, v12}, Lcom/google/maps/android/clustering/ClusterManager;->addItem(Lcom/google/maps/android/clustering/ClusterItem;)V

    goto :goto_1

    .line 827
    .end local v12    # "thisPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v9

    .line 828
    .local v9, "mProjection":Lcom/google/android/gms/maps/Projection;
    invoke-virtual {v9}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v10, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;

    .line 829
    .local v10, "ne":Lcom/google/android/gms/maps/model/LatLng;
    invoke-virtual {v9}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v11, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;

    .line 830
    .local v11, "sw":Lcom/google/android/gms/maps/model/LatLng;
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    iget-wide v1, v10, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v3, v11, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v5, v11, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iget-wide v7, v10, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual/range {v0 .. v8}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getPoiListWithinBounds(DDDD)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    goto :goto_0

    .line 839
    .end local v9    # "mProjection":Lcom/google/android/gms/maps/Projection;
    .end local v10    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    .end local v11    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    :cond_1
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->currentPoiList:Ljava/util/ArrayList;

    .line 840
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v0}, Lcom/google/maps/android/clustering/ClusterManager;->cluster()V

    .line 843
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->poiLoading:Ljava/lang/Boolean;

    .line 844
    return-void
.end method

.method private addTourMarkers(Ljava/lang/String;)V
    .locals 8
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 852
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v5, "addTourMarkers()"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 853
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapMarkers:Ljava/util/ArrayList;

    .line 854
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v4}, Lcom/google/maps/android/clustering/ClusterManager;->clearItems()V

    .line 855
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/GoogleMap;->clear()V

    .line 856
    new-instance v1, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 858
    .local v1, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_1

    .line 859
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "addTourMarkers(): POIs number:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 860
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 861
    .local v3, "thisPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v6, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v6}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 862
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v6

    .line 863
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v6

    .line 861
    invoke-virtual {v5, v6}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    .line 864
    .local v2, "m":Lcom/google/android/gms/maps/model/Marker;
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/google/android/gms/maps/model/Marker;->setIcon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)V

    .line 865
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 866
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapMarkers:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 868
    .end local v2    # "m":Lcom/google/android/gms/maps/model/Marker;
    .end local v3    # "thisPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->currentPoiList:Ljava/util/ArrayList;

    .line 870
    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    .line 871
    .local v0, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/16 v5, 0x64

    invoke-static {v0, v5}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 874
    new-instance v4, Landroid/os/Handler;

    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    new-instance v5, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;

    invoke-direct {v5, p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)V

    const-wide/16 v6, 0x1f4

    invoke-virtual {v4, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 893
    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->poiLoading:Ljava/lang/Boolean;

    .line 894
    return-void
.end method

.method private cancelPOIRequest()V
    .locals 2

    .prologue
    .line 424
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v1, "cancelPOIRequest():"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapUpdateRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 426
    return-void
.end method

.method private checkRelocationButton()V
    .locals 11

    .prologue
    .line 1196
    :try_start_0
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v6}, Lcom/google/android/gms/maps/GoogleMap;->getMyLocation()Landroid/location/Location;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 1198
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v6}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v6

    iget-object v1, v6, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    .line 1199
    .local v1, "ll":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v6}, Lcom/google/android/gms/maps/GoogleMap;->getMyLocation()Landroid/location/Location;

    move-result-object v6

    invoke-virtual {v6}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v8}, Lcom/google/android/gms/maps/GoogleMap;->getMyLocation()Landroid/location/Location;

    move-result-object v8

    invoke-virtual {v8}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    invoke-direct {v2, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 1200
    .local v2, "ll2":Lcom/google/android/gms/maps/model/LatLng;
    const-string v6, "%.2f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    iget-wide v9, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1201
    .local v3, "loc1lat":Ljava/lang/String;
    const-string v6, "%.2f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    iget-wide v9, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1202
    .local v5, "loc2lat":Ljava/lang/String;
    const-string v6, "%.2f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    iget-wide v9, v1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1203
    .local v4, "loc1lng":Ljava/lang/String;
    const-string v6, "%.2f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    iget-wide v9, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1210
    .end local v1    # "ll":Lcom/google/android/gms/maps/model/LatLng;
    .end local v2    # "ll2":Lcom/google/android/gms/maps/model/LatLng;
    .end local v3    # "loc1lat":Ljava/lang/String;
    .end local v4    # "loc1lng":Ljava/lang/String;
    .end local v5    # "loc2lat":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 1206
    :catch_0
    move-exception v0

    .line 1208
    .local v0, "e":Ljava/lang/IllegalStateException;
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_0
.end method

.method private doSearch(Ljava/lang/String;)V
    .locals 4
    .param p1, "currentSearchString"    # Ljava/lang/String;

    .prologue
    .line 1328
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    .line 1329
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v2, "setOnEditorActionListener:NG"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1330
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0062

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1339
    :goto_0
    return-void

    .line 1332
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1333
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "Search Term"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1334
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v2, "Internal Search"

    invoke-virtual {v1, v2, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 1335
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1, p1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->doMapSearch(Ljava/lang/String;)V

    .line 1336
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideSearch()V

    .line 1337
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private fireOnClustersDone(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1500
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fireOnClustersDone: data.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1501
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v1}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    .line 1502
    .local v0, "m":Lcom/google/maps/android/MarkerManager$Collection;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fireOnClustersDone: getMarkerCollection() size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/maps/android/MarkerManager$Collection;->getMarkers()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1504
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setUnclusteredPois(Ljava/util/ArrayList;)V

    .line 1505
    return-void
.end method

.method private getCurrentPoiList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1309
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIList()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 1

    .prologue
    .line 1081
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mCurrentlySelectedPoi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    return-object v0
.end method

.method private getDefaultMapCenter()Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    .prologue
    .line 769
    const-wide v0, 0x4043416bb98c7e28L    # 38.5111

    .line 770
    .local v0, "kansasLat":D
    const-wide v2, -0x3fa7ccc49ba5e354L    # -96.8005

    .line 771
    .local v2, "kansasLng":D
    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v4
.end method

.method private getFavoriteMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1

    .prologue
    .line 1355
    const v0, 0x7f0200f1

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method private getFavoriteSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1

    .prologue
    .line 1360
    const v0, 0x7f0200f2

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method private getMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;
    .locals 2
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 905
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v1, "getMarkerById(): call the one based on if ths is tours or places:"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 906
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 907
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getPlacesMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    .line 909
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getTourMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    goto :goto_0
.end method

.method private getMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1

    .prologue
    .line 1347
    const v0, 0x7f0200f0

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method private getPlacesMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;
    .locals 12
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 921
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 923
    .local v8, "unclusteredList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POI;>;"
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentPoiList()Ljava/util/ArrayList;

    move-result-object v0

    .line 924
    .local v0, "currentList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v9}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v4

    .line 925
    .local v4, "m":Lcom/google/maps/android/MarkerManager$Collection;
    invoke-virtual {v4}, Lcom/google/maps/android/MarkerManager$Collection;->getMarkers()Ljava/util/Collection;

    move-result-object v5

    .line 926
    .local v5, "m2":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/android/gms/maps/model/Marker;>;"
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 927
    .local v3, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/google/android/gms/maps/model/Marker;>;"
    const/4 v1, 0x0

    .line 928
    .local v1, "i":I
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 929
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "getPlacesMarkerById(): iterator:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    add-int/lit8 v2, v1, 0x1

    .end local v1    # "i":I
    .local v2, "i":I
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 930
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/maps/model/Marker;

    .line 932
    .local v7, "mm":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v7}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v6

    .line 933
    .local v6, "markerTitle":Ljava/lang/String;
    invoke-virtual {v6, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 934
    iget-object v9, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "getPlacesMarkerById(): found it:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    add-int/lit8 v1, v2, 0x1

    .end local v2    # "i":I
    .restart local v1    # "i":I
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 938
    .end local v6    # "markerTitle":Ljava/lang/String;
    .end local v7    # "mm":Lcom/google/android/gms/maps/model/Marker;
    :goto_1
    return-object v7

    .end local v1    # "i":I
    .restart local v2    # "i":I
    .restart local v6    # "markerTitle":Ljava/lang/String;
    .restart local v7    # "mm":Lcom/google/android/gms/maps/model/Marker;
    :cond_0
    move v1, v2

    .line 937
    .end local v2    # "i":I
    .restart local v1    # "i":I
    goto :goto_0

    .line 938
    .end local v6    # "markerTitle":Ljava/lang/String;
    .end local v7    # "mm":Lcom/google/android/gms/maps/model/Marker;
    :cond_1
    const/4 v7, 0x0

    goto :goto_1
.end method

.method private getPoiById(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 1320
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->currentPoiList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 1321
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1323
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private getSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1

    .prologue
    .line 1351
    const v0, 0x7f0200f3

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    return-object v0
.end method

.method private getTourMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;
    .locals 5
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 949
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapMarkers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    .line 950
    .local v0, "m":Lcom/google/android/gms/maps/model/Marker;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getTourMarkerById(): m.getTitle():"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 951
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getTourMarkerById(): id:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 952
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 956
    .end local v0    # "m":Lcom/google/android/gms/maps/model/Marker;
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hideDetailPager()V
    .locals 1

    .prologue
    .line 1238
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hideDetailPager()V

    .line 1239
    return-void
.end method

.method private hideLoading()V
    .locals 1

    .prologue
    .line 1168
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->hideMessageBox()V

    .line 1169
    return-void
.end method

.method private hideMapOverlay()V
    .locals 1

    .prologue
    .line 1242
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hideMapOverlay()V

    .line 1243
    return-void
.end method

.method private hideMapSettings()V
    .locals 0

    .prologue
    .line 1222
    return-void
.end method

.method private hideSearch()V
    .locals 3

    .prologue
    .line 1284
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showMapOverlay()V

    .line 1285
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchView:Landroid/view/ViewGroup;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1287
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 1289
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1290
    return-void
.end method

.method private hideZoomError()V
    .locals 2

    .prologue
    .line 1230
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapZoomError:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1231
    return-void
.end method

.method private isCameraZoomedOutToMax()Z
    .locals 2

    .prologue
    .line 416
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    const/high16 v1, 0x40d00000    # 6.5f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 417
    const/4 v0, 0x1

    .line 419
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "p"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 1077
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mCurrentlySelectedPoi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 1078
    return-void
.end method

.method private setFavoritesMapListeners()V
    .locals 1

    .prologue
    .line 288
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z

    .line 289
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setTourMapListeners()V

    .line 290
    return-void
.end method

.method private setInitialMapLocation()V
    .locals 5

    .prologue
    .line 701
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v2, :cond_0

    .line 703
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->isUsersLocationKnown()Z

    move-result v1

    .line 704
    .local v1, "isknown":Z
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->isUserInUs()Z

    move-result v0

    .line 705
    .local v0, "isInUS":Z
    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 706
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->moveToUsersLocation()V

    .line 714
    .end local v0    # "isInUS":Z
    .end local v1    # "isknown":Z
    :cond_0
    :goto_0
    return-void

    .line 708
    .restart local v0    # "isInUS":Z
    .restart local v1    # "isknown":Z
    :cond_1
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v3, "setInitialMapLocation: latitude is null"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 710
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getDefaultMapCenter()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    const/high16 v4, 0x40400000    # 3.0f

    .line 709
    invoke-static {v3, v4}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto :goto_0
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 318
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setPreferencesChangedListener(Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;)V

    .line 336
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mCancelSearchBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$8;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$8;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 343
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mDoSearchBtn:Landroid/view/View;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$9;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$9;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 350
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$10;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$10;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 366
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$11;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$11;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/ClusterManager;->setOnClusterClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;)V

    .line 385
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/ClusterManager;->setOnClusterItemClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;)V

    .line 401
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$13;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnMapClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V

    .line 413
    return-void
.end method

.method private setPlacesMapListeners()V
    .locals 3

    .prologue
    .line 229
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/GoogleMap;->setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V

    .line 230
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 231
    .local v0, "mccl":Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$4;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$MultiCameraChangedListener;->addListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V

    .line 279
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/GoogleMap;->setOnCameraChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V

    .line 280
    return-void
.end method

.method private setSelectedMarkerIcon(Z)V
    .locals 8
    .param p1, "moveCamera"    # Z

    .prologue
    .line 1110
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "setSelectedMarkerIcon(): move:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1112
    :try_start_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 1113
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    .line 1114
    .local v0, "bd":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1115
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    .line 1117
    :cond_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/maps/model/Marker;->setIcon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)V

    .line 1118
    if-eqz p1, :cond_1

    .line 1119
    new-instance v1, Lcom/google/android/gms/maps/model/CameraPosition;

    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v4

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 1120
    invoke-virtual {v4}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v4

    iget v4, v4, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 1121
    invoke-virtual {v5}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v5

    iget v5, v5, Lcom/google/android/gms/maps/model/CameraPosition;->tilt:F

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 1122
    invoke-virtual {v6}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v6

    iget v6, v6, Lcom/google/android/gms/maps/model/CameraPosition;->bearing:F

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    .line 1123
    .local v1, "cp":Lcom/google/android/gms/maps/model/CameraPosition;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {v1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newCameraPosition(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1130
    .end local v0    # "bd":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .end local v1    # "cp":Lcom/google/android/gms/maps/model/CameraPosition;
    :cond_1
    :goto_0
    return-void

    .line 1126
    :catch_0
    move-exception v2

    .line 1128
    .local v2, "e":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private setTourMapListeners()V
    .locals 2

    .prologue
    .line 293
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$5;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnMarkerClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V

    .line 305
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$6;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$6;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnCameraChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V

    .line 313
    return-void
.end method

.method private showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 1
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 1234
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0, p1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 1235
    return-void
.end method

.method private showLoading()V
    .locals 0

    .prologue
    .line 1165
    return-void
.end method

.method private showMapOverlay()V
    .locals 1

    .prologue
    .line 1246
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMapOverlay()V

    .line 1247
    return-void
.end method

.method private showMapSettings()V
    .locals 1

    .prologue
    .line 1215
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1216
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->handleOnTourHeaderShow()V

    .line 1218
    :cond_0
    return-void
.end method

.method private showNormalMapView()V
    .locals 2

    .prologue
    .line 1300
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    .line 1301
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->isMapViewSatellite:Z

    .line 1302
    return-void
.end method

.method private showOverlayByDetail(Lcom/aetn/history/android/historyhere/model/POI;)I
    .locals 1
    .param p1, "detail"    # Lcom/aetn/history/android/historyhere/model/POI;

    .prologue
    .line 1136
    const/4 v0, -0x1

    .line 1150
    .local v0, "itemPosition":I
    return v0
.end method

.method private showSatelliteMapView()V
    .locals 2

    .prologue
    .line 1295
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    .line 1296
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->isMapViewSatellite:Z

    .line 1297
    return-void
.end method

.method private showZoomError()V
    .locals 0

    .prologue
    .line 1227
    return-void
.end method


# virtual methods
.method public clearSelectedMarkerIcon()V
    .locals 5

    .prologue
    .line 1085
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v4, "clearSelectedMarkerIcon()"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1087
    :try_start_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 1088
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    .line 1089
    .local v2, "m":Lcom/google/android/gms/maps/model/Marker;
    if-eqz v2, :cond_1

    .line 1090
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    .line 1091
    .local v0, "bd":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1092
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    .line 1094
    :cond_0
    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/model/Marker;->setIcon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1100
    .end local v0    # "bd":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .end local v2    # "m":Lcom/google/android/gms/maps/model/Marker;
    :cond_1
    :goto_0
    const/4 v3, 0x0

    invoke-direct {p0, v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 1101
    return-void

    .line 1097
    :catch_0
    move-exception v1

    .line 1098
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public displayPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 6
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 594
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V

    .line 595
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z

    .line 597
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    .line 598
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v2, 0x41880000    # 17.0f

    .line 597
    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 600
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$16;

    invoke-direct {v1, p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$16;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 607
    return-void
.end method

.method public displayTargetedPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 6
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 617
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V

    .line 619
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    .line 620
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v2, 0x41880000    # 17.0f

    .line 619
    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 621
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->refreshPlacesMap()V

    .line 623
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;

    invoke-direct {v1, p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$17;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 631
    return-void
.end method

.method public getMapLatLng()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public handleOnDetailHide()V
    .locals 0

    .prologue
    .line 1256
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->clearSelectedMarkerIcon()V

    .line 1257
    return-void
.end method

.method public handleOnDetailShow()V
    .locals 0

    .prologue
    .line 1252
    return-void
.end method

.method public handleOnTourHeaderShow()V
    .locals 0

    .prologue
    .line 1261
    return-void
.end method

.method public hideUI()V
    .locals 0

    .prologue
    .line 1173
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideZoomError()V

    .line 1174
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V

    .line 1175
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideMapSettings()V

    .line 1176
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideSearch()V

    .line 1177
    return-void
.end method

.method public initMap()V
    .locals 4

    .prologue
    .line 194
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$3;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 215
    return-void
.end method

.method public initToUsersLocation(Landroid/location/Location;)V
    .locals 21
    .param p1, "loc"    # Landroid/location/Location;

    .prologue
    .line 519
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    .line 520
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v3, 0x41000000    # 8.0f

    .line 519
    invoke-static {v2, v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 523
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v15

    .line 524
    .local v15, "mProjection":Lcom/google/android/gms/maps/Projection;
    invoke-virtual {v15}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v0, v1, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v16, v0

    .line 525
    .local v16, "ne":Lcom/google/android/gms/maps/model/LatLng;
    invoke-virtual {v15}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v0, v1, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v19, v0

    .line 527
    .local v19, "sw":Lcom/google/android/gms/maps/model/LatLng;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    move-object/from16 v0, v16

    iget-wide v2, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-object/from16 v0, v19

    iget-wide v6, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-object/from16 v0, v16

    iget-wide v8, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getPoiListWithinBounds(DDDD)Ljava/util/ArrayList;

    move-result-object v14

    .line 528
    .local v14, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zoomToMapLocation(): list.size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 532
    .local v17, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v5

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v7

    const-string v9, "M"

    invoke-static/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDistanceBetweenLocations(DDDDLjava/lang/String;)D

    move-result-wide v12

    .line 534
    .local v12, "distanceFromUserLocation":D
    double-to-long v1, v12

    move-object/from16 v0, v17

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setDistance(J)V

    goto :goto_0

    .line 538
    .end local v12    # "distanceFromUserLocation":D
    .end local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$15;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$15;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-static {v14, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 546
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_1
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 547
    .restart local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v5

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v7

    const-string v9, "M"

    invoke-static/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDistanceBetweenLocations(DDDDLjava/lang/String;)D

    move-result-wide v12

    .line 549
    .restart local v12    # "distanceFromUserLocation":D
    double-to-long v1, v12

    move-object/from16 v0, v17

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setDistance(J)V

    goto :goto_1

    .line 552
    .end local v12    # "distanceFromUserLocation":D
    .end local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v18

    .line 553
    .local v18, "size":I
    const/16 v1, 0x14

    move/from16 v0, v18

    if-le v0, v1, :cond_2

    .line 554
    const/16 v1, 0x14

    move/from16 v0, v18

    invoke-virtual {v14, v1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 557
    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zoomToMapLocation(): IT IS NOW list.size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    new-instance v11, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v11}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 560
    .local v11, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 561
    .restart local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    goto :goto_2

    .line 563
    .end local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_3
    invoke-virtual {v11}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v10

    .line 564
    .local v10, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v2, 0x0

    invoke-static {v10, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 566
    const/4 v1, 0x0

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 567
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    invoke-virtual {v1, v14}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setCurrentPOIList(Ljava/util/ArrayList;)V

    .line 569
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIList()Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addPlacesMarkers(Ljava/util/ArrayList;)V

    .line 570
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z

    .line 572
    invoke-direct/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setPlacesMapListeners()V

    .line 573
    return-void
.end method

.method public moveToUsersLocation()V
    .locals 8

    .prologue
    .line 749
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->isUsersLocationKnown()Z

    move-result v0

    .line 750
    .local v0, "isknown":Z
    if-eqz v0, :cond_0

    .line 751
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v1

    .line 752
    .local v1, "l":Landroid/location/Location;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

    .line 753
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v4, 0x41200000    # 10.0f

    .line 752
    invoke-static {v3, v4}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 756
    .end local v1    # "l":Landroid/location/Location;
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "arg0"    # Landroid/os/Bundle;

    .prologue
    .line 127
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 128
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setRetainInstance(Z)V

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->currentPoiList:Ljava/util/ArrayList;

    .line 130
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "vg"    # Landroid/view/ViewGroup;
    .param p3, "data"    # Landroid/os/Bundle;

    .prologue
    .line 135
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v3, "onCreateView()"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 137
    const v2, 0x7f030041

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 138
    .local v1, "view":Landroid/view/View;
    const v2, 0x7f0a00b3

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapZoomError:Landroid/widget/TextView;

    .line 162
    const v2, 0x7f0a00b1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapContainer:Landroid/view/ViewGroup;

    .line 164
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mContext:Landroid/content/Context;

    .line 166
    const v2, 0x7f0a0077

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mDoSearchBtn:Landroid/view/View;

    .line 167
    const v2, 0x7f0a0078

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    .line 168
    const v2, 0x7f0a00b5

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchView:Landroid/view/ViewGroup;

    .line 169
    const v2, 0x7f0a00b6

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mCancelSearchBtn:Landroid/view/View;

    .line 171
    const v2, 0x7f0a00b4

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mProgressBar:Landroid/widget/ProgressBar;

    .line 173
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    const/4 v3, 0x6

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 174
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFavoritesString(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mFavoritesString:Ljava/lang/String;

    .line 175
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideUI()V

    .line 177
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 178
    .local v0, "myFM":Landroid/support/v4/app/FragmentManager;
    const v2, 0x7f0a00b2

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/SupportMapFragment;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    .line 179
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mapFragment:Lcom/google/android/gms/maps/SupportMapFragment;

    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/MapFragment$2;

    invoke-direct {v3, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/SupportMapFragment;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    .line 186
    return-object v1
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 446
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v1, "onPause()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 448
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 440
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 441
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v0, 0x0

    .line 430
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 431
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->enableMenuRefresh:Ljava/lang/Boolean;

    .line 433
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v1, :cond_1

    .line 434
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getMapType()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->isMapViewSatellite:Z

    .line 435
    :cond_1
    return-void
.end method

.method public refreshPlacesMap()V
    .locals 2

    .prologue
    .line 760
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v1, "refreshPlacesMap()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z

    if-eqz v0, :cond_0

    .line 762
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mPoiRenderer:Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->resetClustering()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->access$2800(Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;)V

    .line 763
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addMarkers()V

    .line 765
    :cond_0
    return-void
.end method

.method public setMapType()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 722
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 724
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setPlacesMapListeners()V

    .line 731
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 735
    invoke-direct {p0, v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 737
    :goto_1
    return-void

    .line 725
    :cond_0
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 726
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setFavoritesMapListeners()V

    goto :goto_0

    .line 728
    :cond_1
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setTourMapListeners()V

    goto :goto_0

    .line 732
    :catch_0
    move-exception v0

    .line 733
    .local v0, "e":Ljava/lang/Exception;
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 735
    invoke-direct {p0, v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    goto :goto_1

    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v1

    invoke-direct {p0, v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    throw v1
.end method

.method public setMapTypeNormal()V
    .locals 2

    .prologue
    .line 740
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    .line 741
    return-void
.end method

.method public setMapTypeSatellite()V
    .locals 2

    .prologue
    .line 744
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    .line 745
    return-void
.end method

.method public setSelectedMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 3
    .param p1, "p"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 966
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setSelectedMarkerByPoi():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 967
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 968
    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedPlacesMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 972
    :goto_0
    return-void

    .line 970
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedToursMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;Z)V

    goto :goto_0
.end method

.method public setSelectedPlacesMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 10
    .param p1, "p"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    const/4 v9, 0x1

    .line 1020
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "setSelectedPlacesMarkerByPoi():"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1021
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->clearSelectedMarkerIcon()V

    .line 1022
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 1024
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-virtual {v6}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v2

    .line 1025
    .local v2, "m":Lcom/google/maps/android/MarkerManager$Collection;
    invoke-virtual {v2}, Lcom/google/maps/android/MarkerManager$Collection;->getMarkers()Ljava/util/Collection;

    move-result-object v3

    .line 1026
    .local v3, "m2":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/android/gms/maps/model/Marker;>;"
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "setSelectedMarkerByPoi(): m2.size():"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1027
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1028
    .local v1, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/google/android/gms/maps/model/Marker;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v6

    if-ge v0, v6, :cond_0

    .line 1029
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/maps/model/Marker;

    .line 1030
    .local v4, "mm":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v4}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v5

    .line 1031
    .local v5, "mo":Ljava/lang/String;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "setSelectedMarkerByPoi(): this marker title:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1032
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "setSelectedMarkerByPoi(): we are lookig for:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1033
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 1034
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    const-string v7, "setSelectedMarkerByPoiclear(): found it!!:"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1035
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 1036
    iput-boolean v9, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z

    .line 1037
    invoke-direct {p0, v9}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedMarkerIcon(Z)V

    .line 1041
    .end local v4    # "mm":Lcom/google/android/gms/maps/model/Marker;
    .end local v5    # "mo":Ljava/lang/String;
    :cond_0
    return-void

    .line 1028
    .restart local v4    # "mm":Lcom/google/android/gms/maps/model/Marker;
    .restart local v5    # "mo":Ljava/lang/String;
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public setSelectedToursMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;Z)V
    .locals 10
    .param p1, "p"    # Lcom/aetn/history/android/historyhere/model/POIDetail;
    .param p2, "moveMap"    # Z

    .prologue
    .line 980
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "setSelectedToursMarkerByPoi():"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 981
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 982
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v5

    .line 983
    .local v5, "markerIcon":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    .line 986
    .local v2, "favoriteMarkerIcon":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    :try_start_0
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapMarkers:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/maps/model/Marker;

    .line 988
    .local v4, "m":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-virtual {v4}, Lcom/google/android/gms/maps/model/Marker;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 989
    invoke-virtual {v4, v2}, Lcom/google/android/gms/maps/model/Marker;->setIcon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 994
    .end local v4    # "m":Lcom/google/android/gms/maps/model/Marker;
    :catch_0
    move-exception v1

    .line 995
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 998
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_0
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v3

    .line 999
    .local v3, "icon":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v7

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->isFavorite(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 1000
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v3

    .line 1003
    :cond_1
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v6}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerById(Ljava/lang/String;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/android/gms/maps/model/Marker;->setIcon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)V

    .line 1004
    if-eqz p2, :cond_2

    .line 1005
    new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v6

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 1006
    invoke-virtual {v7}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v7

    iget v7, v7, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 1007
    invoke-virtual {v8}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v8

    iget v8, v8, Lcom/google/android/gms/maps/model/CameraPosition;->tilt:F

    iget-object v9, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 1008
    invoke-virtual {v9}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v9

    iget v9, v9, Lcom/google/android/gms/maps/model/CameraPosition;->bearing:F

    invoke-direct {v0, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    .line 1009
    .local v0, "cp":Lcom/google/android/gms/maps/model/CameraPosition;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newCameraPosition(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 1011
    .end local v0    # "cp":Lcom/google/android/gms/maps/model/CameraPosition;
    :cond_2
    return-void

    .line 991
    .end local v3    # "icon":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .restart local v4    # "m":Lcom/google/android/gms/maps/model/Marker;
    :cond_3
    :try_start_1
    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/model/Marker;->setIcon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public showCurrentTourInMap(Ljava/lang/String;)V
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 580
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showUI()V

    .line 582
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentTourList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;

    .line 583
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addTourMarkers(Ljava/lang/String;)V

    .line 584
    return-void
.end method

.method public showSearch()V
    .locals 4

    .prologue
    .line 1264
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideMapOverlay()V

    .line 1265
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V

    .line 1266
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideZoomError()V

    .line 1267
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->clearSelectedMarkerIcon()V

    .line 1268
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchView:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1269
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 1271
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$20;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$20;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/EditText;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1281
    return-void
.end method

.method public showSurpriseMePoi(Lcom/aetn/history/android/historyhere/model/POIDetail;ZZ)V
    .locals 6
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;
    .param p2, "openDetail"    # Z
    .param p3, "startFromWideZoom"    # Z

    .prologue
    .line 642
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/GoogleMap;->setOnCameraChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V

    .line 643
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showUI()V

    .line 644
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V

    .line 645
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 646
    .local v1, "ll":Lcom/google/android/gms/maps/model/LatLng;
    if-eqz p3, :cond_0

    .line 647
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z

    .line 648
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v1, v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 651
    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z

    .line 652
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 653
    .local v0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 654
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setCurrentPOIList(Ljava/util/ArrayList;)V

    .line 655
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addPlacesMarkers(Ljava/util/ArrayList;)V

    .line 657
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;

    invoke-direct {v3, p0, v1, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$18;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/google/android/gms/maps/model/LatLng;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 676
    return-void
.end method

.method public showUI()V
    .locals 1

    .prologue
    .line 1180
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showMapSettings()V

    .line 1181
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->isCameraZoomedOutToMax()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1182
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showZoomError()V

    .line 1184
    :cond_0
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1185
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapOverlayFragment()Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->showRightMenu()V

    .line 1191
    :goto_0
    return-void

    .line 1187
    :cond_1
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapOverlayFragment()Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->hideRightMenu()V

    goto :goto_0
.end method

.method public zoomCloseupToMapLocation(Landroid/location/Location;)V
    .locals 7
    .param p1, "loc"    # Landroid/location/Location;

    .prologue
    .line 685
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showUI()V

    .line 686
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "zoomCloseupToMapLocation():currentZoom: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v4

    iget v4, v4, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 687
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    const/high16 v3, 0x3fa00000    # 1.25f

    mul-float v1, v2, v3

    .line 688
    .local v1, "newZoom":F
    new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 690
    invoke-virtual {v3}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/maps/model/CameraPosition;->tilt:F

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 691
    invoke-virtual {v4}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v4

    iget v4, v4, Lcom/google/android/gms/maps/model/CameraPosition;->bearing:F

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    .line 692
    .local v0, "cp":Lcom/google/android/gms/maps/model/CameraPosition;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-static {v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newCameraPosition(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 693
    return-void
.end method

.method public zoomToMapLocation(Landroid/location/Location;)V
    .locals 21
    .param p1, "loc"    # Landroid/location/Location;

    .prologue
    .line 461
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mMapInited:Z

    .line 462
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    .line 463
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v3, 0x41000000    # 8.0f

    .line 462
    invoke-static {v2, v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 466
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v15

    .line 467
    .local v15, "mProjection":Lcom/google/android/gms/maps/Projection;
    invoke-virtual {v15}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v0, v1, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v16, v0

    .line 468
    .local v16, "ne":Lcom/google/android/gms/maps/model/LatLng;
    invoke-virtual {v15}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v0, v1, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v19, v0

    .line 470
    .local v19, "sw":Lcom/google/android/gms/maps/model/LatLng;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    move-object/from16 v0, v16

    iget-wide v2, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-object/from16 v0, v19

    iget-wide v6, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-object/from16 v0, v16

    iget-wide v8, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getPoiListWithinBounds(DDDD)Ljava/util/ArrayList;

    move-result-object v14

    .line 471
    .local v14, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zoomToMapLocation(): list.size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 475
    .local v17, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v5

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v7

    const-string v9, "M"

    invoke-static/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDistanceBetweenLocations(DDDDLjava/lang/String;)D

    move-result-wide v12

    .line 477
    .local v12, "distanceFromUserLocation":D
    double-to-long v1, v12

    move-object/from16 v0, v17

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setDistance(J)V

    goto :goto_0

    .line 481
    .end local v12    # "distanceFromUserLocation":D
    .end local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapFragment$14;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$14;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    invoke-static {v14, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 489
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_1
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 490
    .restart local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v5

    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v7

    const-string v9, "M"

    invoke-static/range {v1 .. v9}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDistanceBetweenLocations(DDDDLjava/lang/String;)D

    move-result-wide v12

    .line 492
    .restart local v12    # "distanceFromUserLocation":D
    double-to-long v1, v12

    move-object/from16 v0, v17

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->setDistance(J)V

    goto :goto_1

    .line 495
    .end local v12    # "distanceFromUserLocation":D
    .end local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v18

    .line 496
    .local v18, "size":I
    const/16 v1, 0x14

    move/from16 v0, v18

    if-le v0, v1, :cond_2

    .line 497
    const/16 v1, 0x14

    move/from16 v0, v18

    invoke-virtual {v14, v1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 500
    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zoomToMapLocation(): IT IS NOW list.size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    new-instance v11, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v11}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 503
    .local v11, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 504
    .restart local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual/range {v17 .. v17}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    goto :goto_2

    .line 506
    .end local v17    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_3
    invoke-virtual {v11}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v10

    .line 507
    .local v10, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v2, 0x0

    invoke-static {v10, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 509
    const/4 v1, 0x0

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 510
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addPlacesMarkers(Ljava/util/ArrayList;)V

    .line 511
    return-void
.end method
