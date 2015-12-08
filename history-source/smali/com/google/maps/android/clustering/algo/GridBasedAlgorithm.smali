.class public Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;
.super Ljava/lang/Object;
.source "GridBasedAlgorithm.java"

# interfaces
.implements Lcom/google/maps/android/clustering/algo/Algorithm;


# annotations
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
.field private static final GRID_SIZE:I = 0x64


# instance fields
.field private final mItems:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    .local p0, "this":Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;, "Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    return-void
.end method

.method private static getCoord(JDD)J
    .locals 4
    .param p0, "numCells"    # J
    .param p2, "x"    # D
    .param p4, "y"    # D

    .prologue
    .line 76
    long-to-double v0, p0

    invoke-static {p2, p3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    invoke-static {p4, p5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-long v0, v0

    return-wide v0
.end method


# virtual methods
.method public addItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 25
    .local p0, "this":Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;, "Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm<TT;>;"
    .local p1, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    return-void
.end method

.method public addItems(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 30
    .local p0, "this":Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;, "Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm<TT;>;"
    .local p1, "items":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 31
    return-void
.end method

.method public clearItems()V
    .locals 1

    .prologue
    .line 35
    .local p0, "this":Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;, "Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 36
    return-void
.end method

.method public getClusters(D)Ljava/util/Set;
    .locals 22
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
    .line 45
    .local p0, "this":Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;, "Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm<TT;>;"
    const-wide/high16 v4, 0x4070000000000000L    # 256.0

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    move-wide/from16 v0, p1

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-long v2, v4

    .line 46
    .local v2, "numCells":J
    new-instance v15, Lcom/google/maps/android/projection/SphericalMercatorProjection;

    long-to-double v4, v2

    invoke-direct {v15, v4, v5}, Lcom/google/maps/android/projection/SphericalMercatorProjection;-><init>(D)V

    .line 48
    .local v15, "proj":Lcom/google/maps/android/projection/SphericalMercatorProjection;
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 49
    .local v9, "clusters":Ljava/util/HashSet;, "Ljava/util/HashSet<Lcom/google/maps/android/clustering/Cluster<TT;>;>;"
    new-instance v16, Landroid/support/v4/util/LongSparseArray;

    invoke-direct/range {v16 .. v16}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 51
    .local v16, "sparseArray":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    move-object/from16 v17, v0

    monitor-enter v17

    .line 52
    :try_start_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .local v12, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/maps/android/clustering/ClusterItem;

    .line 53
    .local v13, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    invoke-interface {v13}, Lcom/google/maps/android/clustering/ClusterItem;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v15, v4}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toPoint(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/projection/Point;

    move-result-object v14

    .line 55
    .local v14, "p":Lcom/google/maps/android/geometry/Point;
    iget-wide v4, v14, Lcom/google/maps/android/geometry/Point;->x:D

    iget-wide v6, v14, Lcom/google/maps/android/geometry/Point;->y:D

    invoke-static/range {v2 .. v7}, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->getCoord(JDD)J

    move-result-wide v10

    .line 57
    .local v10, "coord":J
    move-object/from16 v0, v16

    invoke-virtual {v0, v10, v11}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/maps/android/clustering/algo/StaticCluster;

    .line 58
    .local v8, "cluster":Lcom/google/maps/android/clustering/algo/StaticCluster;, "Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;"
    if-nez v8, :cond_0

    .line 59
    new-instance v8, Lcom/google/maps/android/clustering/algo/StaticCluster;

    .end local v8    # "cluster":Lcom/google/maps/android/clustering/algo/StaticCluster;, "Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;"
    new-instance v4, Lcom/google/maps/android/geometry/Point;

    iget-wide v5, v14, Lcom/google/maps/android/geometry/Point;->x:D

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    add-double v5, v5, v18

    iget-wide v0, v14, Lcom/google/maps/android/geometry/Point;->y:D

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->floor(D)D

    move-result-wide v18

    const-wide/high16 v20, 0x3fe0000000000000L    # 0.5

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    invoke-direct {v4, v5, v6, v0, v1}, Lcom/google/maps/android/geometry/Point;-><init>(DD)V

    invoke-virtual {v15, v4}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toLatLng(Lcom/google/maps/android/geometry/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-direct {v8, v4}, Lcom/google/maps/android/clustering/algo/StaticCluster;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 60
    .restart local v8    # "cluster":Lcom/google/maps/android/clustering/algo/StaticCluster;, "Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;"
    move-object/from16 v0, v16

    invoke-virtual {v0, v10, v11, v8}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 61
    invoke-virtual {v9, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_0
    invoke-virtual {v8, v13}, Lcom/google/maps/android/clustering/algo/StaticCluster;->add(Lcom/google/maps/android/clustering/ClusterItem;)Z

    goto :goto_0

    .line 65
    .end local v8    # "cluster":Lcom/google/maps/android/clustering/algo/StaticCluster;, "Lcom/google/maps/android/clustering/algo/StaticCluster<TT;>;"
    .end local v10    # "coord":J
    .end local v12    # "i$":Ljava/util/Iterator;
    .end local v13    # "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    .end local v14    # "p":Lcom/google/maps/android/geometry/Point;
    :catchall_0
    move-exception v4

    monitor-exit v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4

    .restart local v12    # "i$":Ljava/util/Iterator;
    :cond_1
    :try_start_1
    monitor-exit v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    return-object v9
.end method

.method public getItems()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 72
    .local p0, "this":Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;, "Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    return-object v0
.end method

.method public removeItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 40
    .local p0, "this":Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;, "Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm<TT;>;"
    .local p1, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/algo/GridBasedAlgorithm;->mItems:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 41
    return-void
.end method
