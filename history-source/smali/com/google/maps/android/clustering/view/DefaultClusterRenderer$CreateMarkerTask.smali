.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;
.super Ljava/lang/Object;
.source "DefaultClusterRenderer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CreateMarkerTask"
.end annotation


# instance fields
.field private final animateFrom:Lcom/google/android/gms/maps/model/LatLng;

.field private final cluster:Lcom/google/maps/android/clustering/Cluster;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final newMarkers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;


# direct methods
.method public constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/Cluster;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0
    .param p4, "animateFrom"    # Lcom/google/android/gms/maps/model/LatLng;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;",
            ">;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")V"
        }
    .end annotation

    .prologue
    .line 780
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.CreateMarkerTask;"
    .local p2, "c":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    .local p3, "markersAdded":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    iput-object p2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    .line 782
    iput-object p3, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->newMarkers:Ljava/util/Set;

    .line 783
    iput-object p4, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    .line 784
    return-void
.end method

.method static synthetic access$2000(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;)V
    .locals 0
    .param p0, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;
    .param p1, "x1"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;

    .prologue
    .line 769
    invoke-direct {p0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->perform(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;)V

    return-void
.end method

.method private perform(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer",
            "<TT;>.MarkerModifier;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.CreateMarkerTask;"
    .local p1, "markerModifier":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.MarkerModifier;"
    const/4 v7, 0x0

    .line 788
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    iget-object v6, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-virtual {v5, v6}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->shouldRenderAsCluster(Lcom/google/maps/android/clustering/Cluster;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 789
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-interface {v5}, Lcom/google/maps/android/clustering/Cluster;->getItems()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/maps/android/clustering/ClusterItem;

    .line 790
    .local v1, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;
    invoke-static {v5}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$300(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->get(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    .line 792
    .local v2, "marker":Lcom/google/android/gms/maps/model/Marker;
    if-nez v2, :cond_2

    .line 793
    new-instance v3, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 794
    .local v3, "markerOptions":Lcom/google/android/gms/maps/model/MarkerOptions;
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v5, :cond_1

    .line 795
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 799
    :goto_1
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-virtual {v5, v1, v3}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->onBeforeClusterItemRendered(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    .line 800
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    invoke-static {v5}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1900(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/maps/android/MarkerManager$Collection;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    .line 801
    new-instance v4, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;

    invoke-direct {v4, v2, v7}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;-><init>(Lcom/google/android/gms/maps/model/Marker;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V

    .line 802
    .local v4, "markerWithPosition":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;
    invoke-static {v5}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$300(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->put(Ljava/lang/Object;Lcom/google/android/gms/maps/model/Marker;)V

    .line 803
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v5, :cond_0

    .line 804
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    invoke-interface {v1}, Lcom/google/maps/android/clustering/ClusterItem;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-virtual {p1, v4, v5, v6}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->animate(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .line 809
    .end local v3    # "markerOptions":Lcom/google/android/gms/maps/model/MarkerOptions;
    :cond_0
    :goto_2
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-virtual {v5, v1, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->onClusterItemRendered(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/Marker;)V

    .line 810
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->newMarkers:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 797
    .end local v4    # "markerWithPosition":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    .restart local v3    # "markerOptions":Lcom/google/android/gms/maps/model/MarkerOptions;
    :cond_1
    invoke-interface {v1}, Lcom/google/maps/android/clustering/ClusterItem;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    goto :goto_1

    .line 807
    .end local v3    # "markerOptions":Lcom/google/android/gms/maps/model/MarkerOptions;
    :cond_2
    new-instance v4, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;

    invoke-direct {v4, v2, v7}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;-><init>(Lcom/google/android/gms/maps/model/Marker;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V

    .restart local v4    # "markerWithPosition":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    goto :goto_2

    .line 815
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    .end local v2    # "marker":Lcom/google/android/gms/maps/model/Marker;
    .end local v4    # "markerWithPosition":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    :cond_3
    new-instance v6, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v6}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v5, :cond_6

    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-interface {v5}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    :goto_3
    invoke-virtual {v6, v5}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    .line 818
    .restart local v3    # "markerOptions":Lcom/google/android/gms/maps/model/MarkerOptions;
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    iget-object v6, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-virtual {v5, v6, v3}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->onBeforeClusterRendered(Lcom/google/maps/android/clustering/Cluster;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    .line 820
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterManager:Lcom/google/maps/android/clustering/ClusterManager;
    invoke-static {v5}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1900(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/maps/android/clustering/ClusterManager;->getClusterMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/maps/android/MarkerManager$Collection;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    .line 821
    .restart local v2    # "marker":Lcom/google/android/gms/maps/model/Marker;
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerToCluster:Ljava/util/Map;
    invoke-static {v5}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;

    move-result-object v5

    iget-object v6, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-interface {v5, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterToMarker:Ljava/util/Map;
    invoke-static {v5}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$2100(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;

    move-result-object v5

    iget-object v6, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-interface {v5, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    new-instance v4, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;

    invoke-direct {v4, v2, v7}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;-><init>(Lcom/google/android/gms/maps/model/Marker;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V

    .line 824
    .restart local v4    # "markerWithPosition":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v5, :cond_4

    .line 825
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v6, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-interface {v6}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-virtual {p1, v4, v5, v6}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->animate(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .line 827
    :cond_4
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    iget-object v6, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->cluster:Lcom/google/maps/android/clustering/Cluster;

    invoke-virtual {v5, v6, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->onClusterRendered(Lcom/google/maps/android/clustering/Cluster;Lcom/google/android/gms/maps/model/Marker;)V

    .line 828
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->newMarkers:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 829
    .end local v2    # "marker":Lcom/google/android/gms/maps/model/Marker;
    .end local v3    # "markerOptions":Lcom/google/android/gms/maps/model/MarkerOptions;
    .end local v4    # "markerWithPosition":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    :cond_5
    return-void

    .line 815
    :cond_6
    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;->animateFrom:Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_3
.end method
