.class public Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;
.super Ljava/lang/Object;
.source "CustomMapClusteringAlgorithm.java"

# interfaces
.implements Lcom/google/maps/android/clustering/algo/Algorithm;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/maps/android/clustering/ClusterItem;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/maps/android/clustering/algo/Algorithm",
        "<TT;>;"
    }
.end annotation


# static fields
.field public static final MAX_DISTANCE_AT_ZOOM:I = 0x1e

.field private static final PROJECTION:Lcom/google/maps/android/projection/SphericalMercatorProjection;


# instance fields
.field private final mItems:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private final mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/quadtree/PointQuadTree",
            "<",
            "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem",
            "<TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 55
    new-instance v0, Lcom/google/maps/android/projection/SphericalMercatorProjection;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-direct {v0, v1, v2}, Lcom/google/maps/android/projection/SphericalMercatorProjection;-><init>(D)V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->PROJECTION:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .prologue
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/16 v1, 0x0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mItems:Ljava/util/Collection;

    .line 53
    new-instance v0, Lcom/google/maps/android/quadtree/PointQuadTree;

    move-wide v5, v1

    move-wide v7, v3

    invoke-direct/range {v0 .. v8}, Lcom/google/maps/android/quadtree/PointQuadTree;-><init>(DDDD)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    .line 163
    return-void
.end method

.method static synthetic access$200()Lcom/google/maps/android/projection/SphericalMercatorProjection;
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->PROJECTION:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    return-object v0
.end method

.method private createBoundsFromSpan(Lcom/google/maps/android/geometry/Point;D)Lcom/google/maps/android/geometry/Bounds;
    .locals 11
    .param p1, "p"    # Lcom/google/maps/android/geometry/Point;
    .param p2, "span"    # D

    .prologue
    .line 157
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double v9, p2, v0

    .line 158
    .local v9, "halfSpan":D
    new-instance v0, Lcom/google/maps/android/geometry/Bounds;

    iget-wide v1, p1, Lcom/google/maps/android/geometry/Point;->x:D

    sub-double/2addr v1, v9

    iget-wide v3, p1, Lcom/google/maps/android/geometry/Point;->x:D

    add-double/2addr v3, v9

    iget-wide v5, p1, Lcom/google/maps/android/geometry/Point;->y:D

    sub-double/2addr v5, v9

    iget-wide v7, p1, Lcom/google/maps/android/geometry/Point;->y:D

    add-double/2addr v7, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/maps/android/geometry/Bounds;-><init>(DDDD)V

    return-object v0
.end method

.method private distanceSquared(Lcom/google/maps/android/geometry/Point;Lcom/google/maps/android/geometry/Point;)D
    .locals 8
    .param p1, "a"    # Lcom/google/maps/android/geometry/Point;
    .param p2, "b"    # Lcom/google/maps/android/geometry/Point;

    .prologue
    .line 151
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    iget-wide v0, p1, Lcom/google/maps/android/geometry/Point;->x:D

    iget-wide v2, p2, Lcom/google/maps/android/geometry/Point;->x:D

    sub-double/2addr v0, v2

    iget-wide v2, p1, Lcom/google/maps/android/geometry/Point;->x:D

    iget-wide v4, p2, Lcom/google/maps/android/geometry/Point;->x:D

    sub-double/2addr v2, v4

    mul-double/2addr v0, v2

    iget-wide v2, p1, Lcom/google/maps/android/geometry/Point;->y:D

    iget-wide v4, p2, Lcom/google/maps/android/geometry/Point;->y:D

    sub-double/2addr v2, v4

    iget-wide v4, p1, Lcom/google/maps/android/geometry/Point;->y:D

    iget-wide v6, p2, Lcom/google/maps/android/geometry/Point;->y:D

    sub-double/2addr v4, v6

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public addItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 59
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    .local p1, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    new-instance v0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;-><init>(Lcom/google/maps/android/clustering/ClusterItem;Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$1;)V

    .line 60
    .local v0, "quadItem":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    monitor-enter v2

    .line 61
    :try_start_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mItems:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 62
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    invoke-virtual {v1, v0}, Lcom/google/maps/android/quadtree/PointQuadTree;->add(Lcom/google/maps/android/quadtree/PointQuadTree$Item;)V

    .line 63
    monitor-exit v2

    .line 64
    return-void

    .line 63
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public addItems(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 68
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    .local p1, "items":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/clustering/ClusterItem;

    .line 69
    .local v0, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->addItem(Lcom/google/maps/android/clustering/ClusterItem;)V

    goto :goto_0

    .line 71
    .end local v0    # "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    :cond_0
    return-void
.end method

.method public clearItems()V
    .locals 2

    .prologue
    .line 75
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    monitor-enter v1

    .line 76
    :try_start_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mItems:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 77
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    invoke-virtual {v0}, Lcom/google/maps/android/quadtree/PointQuadTree;->clear()V

    .line 78
    monitor-exit v1

    .line 79
    return-void

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getClusters(D)Ljava/util/Set;
    .locals 25
    .param p1, "zoom"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Ljava/util/Set",
            "<+",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 89
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    move-wide/from16 v0, p1

    double-to-int v8, v0

    .line 91
    .local v8, "discreteZoom":I
    const-wide/high16 v19, 0x403e000000000000L    # 30.0

    const-wide/high16 v21, 0x4000000000000000L    # 2.0

    int-to-double v0, v8

    move-wide/from16 v23, v0

    invoke-static/range {v21 .. v24}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v21

    div-double v19, v19, v21

    const-wide/high16 v21, 0x4070000000000000L    # 256.0

    div-double v17, v19, v21

    .line 93
    .local v17, "zoomSpecificSpan":D
    new-instance v16, Ljava/util/HashSet;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashSet;-><init>()V

    .line 94
    .local v16, "visitedCandidates":Ljava/util/Set;, "Ljava/util/Set<Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;>;"
    new-instance v14, Ljava/util/HashSet;

    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 95
    .local v14, "results":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/maps/android/clustering/Cluster<TT;>;>;"
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 96
    .local v11, "distanceToCluster":Ljava/util/Map;, "Ljava/util/Map<Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;Ljava/lang/Double;>;"
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 98
    .local v13, "itemToCluster":Ljava/util/Map;, "Ljava/util/Map<Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    move-object/from16 v20, v0

    monitor-enter v20

    .line 99
    :try_start_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mItems:Ljava/util/Collection;

    move-object/from16 v19, v0

    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :cond_0
    :goto_0
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_5

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;

    .line 100
    .local v4, "candidate":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    move-object/from16 v0, v16

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_0

    .line 105
    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v19

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-wide/from16 v2, v17

    invoke-direct {v0, v1, v2, v3}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->createBoundsFromSpan(Lcom/google/maps/android/geometry/Point;D)Lcom/google/maps/android/geometry/Bounds;

    move-result-object v15

    .line 107
    .local v15, "searchBounds":Lcom/google/maps/android/geometry/Bounds;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Lcom/google/maps/android/quadtree/PointQuadTree;->search(Lcom/google/maps/android/geometry/Bounds;)Ljava/util/Collection;

    move-result-object v7

    .line 108
    .local v7, "clusterItems":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;>;"
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v19

    const/16 v22, 0x1

    move/from16 v0, v19

    move/from16 v1, v22

    if-ne v0, v1, :cond_1

    .line 110
    invoke-interface {v14, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 111
    move-object/from16 v0, v16

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 112
    const-wide/16 v22, 0x0

    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-interface {v11, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 135
    .end local v4    # "candidate":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    .end local v7    # "clusterItems":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;>;"
    .end local v15    # "searchBounds":Lcom/google/maps/android/geometry/Bounds;
    :catchall_0
    move-exception v19

    monitor-exit v20
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v19

    .line 115
    .restart local v4    # "candidate":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    .restart local v7    # "clusterItems":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;>;"
    .restart local v15    # "searchBounds":Lcom/google/maps/android/geometry/Bounds;
    :cond_1
    :try_start_1
    new-instance v5, Lcom/google/maps/android/clustering/algo/StaticCluster;

    # getter for: Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->mClusterItem:Lcom/google/maps/android/clustering/ClusterItem;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->access$100(Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;)Lcom/google/maps/android/clustering/ClusterItem;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Lcom/google/maps/android/clustering/ClusterItem;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-direct {v5, v0}, Lcom/google/maps/android/clustering/algo/StaticCluster;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 116
    .local v5, "cluster":Lcom/google/maps/android/clustering/algo/StaticCluster;, "Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;"
    invoke-interface {v14, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 118
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :cond_2
    :goto_1
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_4

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;

    .line 119
    .local v6, "clusterItem":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    invoke-interface {v11, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Double;

    .line 120
    .local v12, "existingDistance":Ljava/lang/Double;
    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v19

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v23

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v23

    invoke-direct {v0, v1, v2}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->distanceSquared(Lcom/google/maps/android/geometry/Point;Lcom/google/maps/android/geometry/Point;)D

    move-result-wide v9

    .line 121
    .local v9, "distance":D
    if-eqz v12, :cond_3

    .line 123
    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v23

    cmpg-double v19, v23, v9

    if-ltz v19, :cond_2

    .line 127
    invoke-interface {v13, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/google/maps/android/clustering/algo/StaticCluster;

    # getter for: Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->mClusterItem:Lcom/google/maps/android/clustering/ClusterItem;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->access$100(Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;)Lcom/google/maps/android/clustering/ClusterItem;

    move-result-object v23

    move-object/from16 v0, v19

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/algo/StaticCluster;->remove(Lcom/google/maps/android/clustering/ClusterItem;)Z

    .line 129
    :cond_3
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-interface {v11, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    # getter for: Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->mClusterItem:Lcom/google/maps/android/clustering/ClusterItem;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->access$100(Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;)Lcom/google/maps/android/clustering/ClusterItem;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v5, v0}, Lcom/google/maps/android/clustering/algo/StaticCluster;->add(Lcom/google/maps/android/clustering/ClusterItem;)Z

    .line 131
    invoke-interface {v13, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 133
    .end local v6    # "clusterItem":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    .end local v9    # "distance":D
    .end local v12    # "existingDistance":Ljava/lang/Double;
    :cond_4
    move-object/from16 v0, v16

    invoke-interface {v0, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    .line 135
    .end local v4    # "candidate":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    .end local v5    # "cluster":Lcom/google/maps/android/clustering/algo/StaticCluster;, "Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;"
    .end local v7    # "clusterItems":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;>;"
    .end local v15    # "searchBounds":Lcom/google/maps/android/geometry/Bounds;
    :cond_5
    monitor-exit v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    return-object v14
.end method

.method public getItems()Ljava/util/Collection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 141
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .local v0, "items":Ljava/util/List;, "Ljava/util/List<TT;>;"
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mQuadTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    monitor-enter v3

    .line 143
    :try_start_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;->mItems:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;

    .line 144
    .local v1, "quadItem":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    # getter for: Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->mClusterItem:Lcom/google/maps/android/clustering/ClusterItem;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;->access$100(Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;)Lcom/google/maps/android/clustering/ClusterItem;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 146
    .end local v1    # "quadItem":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm$QuadItem<TT;>;"
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_0
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    return-object v0
.end method

.method public removeItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 84
    .local p0, "this":Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm;, "Lcom/aetn/history/android/historyhere/model/CustomMapClusteringAlgorithm<TT;>;"
    .local p1, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "NonHierarchicalDistanceBasedAlgorithm.remove not implemented"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
