.class public Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;
.super Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
.source "MapFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PoiRenderer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer",
        "<",
        "Lcom/aetn/history/android/historyhere/model/POIDetail;",
        ">;"
    }
.end annotation


# instance fields
.field final bdFavoriteIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

.field final bdIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

.field final bdSelectedFavoriteIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

.field final bdSelectedIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

.field private final mClusterIconGenerator:Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

.field private final mClusterImageView:Landroid/widget/ImageView;

.field private final mDimension:I

.field private final mIconGenerator:Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

.field private final mImageView:Landroid/widget/ImageView;

.field private mUnclusteredPois:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

.field private totalPoisRendered:I


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 6
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 1399
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 1400
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/maps/android/clustering/ClusterManager;

    move-result-object v4

    invoke-direct {p0, v2, v3, v4}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;)V

    .line 1386
    new-instance v2, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mIconGenerator:Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

    .line 1387
    new-instance v2, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mClusterIconGenerator:Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

    .line 1391
    const/4 v2, 0x0

    iput v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    .line 1393
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$3000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 1394
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$3100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdFavoriteIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 1395
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$3200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdSelectedIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 1396
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getFavoriteSelectedMarkerIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$3300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdSelectedFavoriteIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 1401
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f030036

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 1402
    .local v0, "multiProfile":Landroid/view/View;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mClusterIconGenerator:Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

    invoke-virtual {v2, v0}, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->setContentView(Landroid/view/View;)V

    .line 1403
    const v2, 0x7f0a003d

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mClusterImageView:Landroid/widget/ImageView;

    .line 1404
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mUnclusteredPois:Ljava/util/ArrayList;

    .line 1405
    new-instance v2, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mImageView:Landroid/widget/ImageView;

    .line 1406
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b0014

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mDimension:I

    .line 1407
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mImageView:Landroid/widget/ImageView;

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    iget v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mDimension:I

    iget v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mDimension:I

    invoke-direct {v3, v4, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1408
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b0015

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v1, v2

    .line 1409
    .local v1, "padding":I
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mImageView:Landroid/widget/ImageView;

    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 1410
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mIconGenerator:Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mImageView:Landroid/widget/ImageView;

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->setContentView(Landroid/view/View;)V

    .line 1411
    return-void
.end method

.method static synthetic access$2800(Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;

    .prologue
    .line 1385
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->resetClustering()V

    return-void
.end method

.method private onClusteringDone()V
    .locals 2

    .prologue
    .line 1486
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mUnclusteredPois:Ljava/util/ArrayList;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->fireOnClustersDone(Ljava/util/ArrayList;)V
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$3400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/util/ArrayList;)V

    .line 1487
    const/4 v0, 0x0

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    .line 1488
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mUnclusteredPois:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1489
    return-void
.end method

.method private resetClustering()V
    .locals 2

    .prologue
    .line 1492
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resetClustering:"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1493
    const/4 v0, 0x0

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    .line 1494
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mUnclusteredPois:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1495
    return-void
.end method


# virtual methods
.method protected onBeforeClusterItemRendered(Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 5
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;
    .param p2, "markerOptions"    # Lcom/google/android/gms/maps/model/MarkerOptions;

    .prologue
    .line 1416
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "onBeforeClusterItemRendered:"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1417
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 1418
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mFavoritesString:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1700(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-le v2, v3, :cond_1

    const/4 v1, 0x1

    .line 1421
    .local v1, "isFavorite":Z
    :goto_0
    if-eqz v1, :cond_2

    .line 1422
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdFavoriteIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 1426
    .local v0, "bd":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    :goto_1
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 1428
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addMarkers(): getCurrentlySelectedPoi:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1429
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1430
    if-eqz v1, :cond_3

    .line 1431
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdSelectedFavoriteIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 1439
    :cond_0
    :goto_2
    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 1441
    return-void

    .line 1418
    .end local v0    # "bd":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .end local v1    # "isFavorite":Z
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 1424
    .restart local v1    # "isFavorite":Z
    :cond_2
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .restart local v0    # "bd":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    goto :goto_1

    .line 1433
    :cond_3
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->bdSelectedIcon:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    goto :goto_2

    .line 1437
    :cond_4
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1800(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    goto :goto_2
.end method

.method protected bridge synthetic onBeforeClusterItemRendered(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    .prologue
    .line 1385
    check-cast p1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {p0, p1, p2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->onBeforeClusterItemRendered(Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    return-void
.end method

.method protected onBeforeClusterRendered(Lcom/google/maps/android/clustering/Cluster;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 3
    .param p2, "markerOptions"    # Lcom/google/android/gms/maps/model/MarkerOptions;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;",
            "Lcom/google/android/gms/maps/model/MarkerOptions;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1447
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mClusterIconGenerator:Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;

    invoke-interface {p1}, Lcom/google/maps/android/clustering/Cluster;->getSize()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->makeIcon(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1448
    .local v0, "icon":Landroid/graphics/Bitmap;
    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 1449
    return-void
.end method

.method protected onClusterItemRendered(Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/google/android/gms/maps/model/Marker;)V
    .locals 3
    .param p1, "clusterItem"    # Lcom/aetn/history/android/historyhere/model/POIDetail;
    .param p2, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 1476
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PoiRenderer: onClusterItemRendered(): cluster item of: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1477
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->mUnclusteredPois:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1478
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    .line 1479
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PoiRenderer: onClusterItemRendered(): newPoiList.size(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1480
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1481
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->onClusteringDone()V

    .line 1483
    :cond_0
    return-void
.end method

.method protected bridge synthetic onClusterItemRendered(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/Marker;)V
    .locals 0

    .prologue
    .line 1385
    check-cast p1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {p0, p1, p2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->onClusterItemRendered(Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/google/android/gms/maps/model/Marker;)V

    return-void
.end method

.method protected onClusterRendered(Lcom/google/maps/android/clustering/Cluster;Lcom/google/android/gms/maps/model/Marker;)V
    .locals 3
    .param p2, "marker"    # Lcom/google/android/gms/maps/model/Marker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;",
            "Lcom/google/android/gms/maps/model/Marker;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1463
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    invoke-interface {p1}, Lcom/google/maps/android/clustering/Cluster;->getSize()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    .line 1464
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PoiRenderer: onClusterRendered(): newPoiList.size(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 1465
    iget v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->totalPoisRendered:I

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1466
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$PoiRenderer;->onClusteringDone()V

    .line 1468
    :cond_0
    return-void
.end method

.method protected shouldRenderAsCluster(Lcom/google/maps/android/clustering/Cluster;)Z
    .locals 2
    .param p1, "cluster"    # Lcom/google/maps/android/clustering/Cluster;

    .prologue
    const/4 v0, 0x1

    .line 1454
    invoke-interface {p1}, Lcom/google/maps/android/clustering/Cluster;->getSize()I

    move-result v1

    if-le v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
