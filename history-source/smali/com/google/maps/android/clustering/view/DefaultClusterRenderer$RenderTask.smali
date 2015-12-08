.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;
.super Ljava/lang/Object;
.source "DefaultClusterRenderer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RenderTask"
.end annotation


# instance fields
.field final clusters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<+",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private mCallback:Ljava/lang/Runnable;

.field private mMapZoom:F

.field private mProjection:Lcom/google/android/gms/maps/Projection;

.field private mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

.field final synthetic this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;


# direct methods
.method private constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<+",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;)V"
        }
    .end annotation

    .prologue
    .line 311
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    .local p2, "clusters":Ljava/util/Set;, "Ljava/util/Set<+Lcom/google/maps/android/clustering/Cluster<TT;>;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    iput-object p2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->clusters:Ljava/util/Set;

    .line 313
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
    .param p2, "x1"    # Ljava/util/Set;
    .param p3, "x2"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;

    .prologue
    .line 304
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    invoke-direct {p0, p1, p2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 335
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->clusters:Ljava/util/Set;

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v21, v0

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusters:Ljava/util/Set;
    invoke-static/range {v21 .. v21}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1100(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Set;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_0

    .line 336
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mCallback:Ljava/lang/Runnable;

    move-object/from16 v20, v0

    invoke-interface/range {v20 .. v20}, Ljava/lang/Runnable;->run()V

    .line 428
    :goto_0
    return-void

    .line 340
    :cond_0
    new-instance v9, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-direct {v9, v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V

    .line 342
    .local v9, "markerModifier":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.MarkerModifier;"
    move-object/from16 v0, p0

    iget v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mMapZoom:F

    move/from16 v17, v0

    .line 343
    .local v17, "zoom":F
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mZoom:F
    invoke-static/range {v20 .. v20}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1000(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)F

    move-result v20

    cmpl-float v20, v17, v20

    if-lez v20, :cond_2

    const/16 v19, 0x1

    .line 344
    .local v19, "zoomingIn":Z
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mZoom:F
    invoke-static/range {v20 .. v20}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1000(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)F

    move-result v20

    sub-float v18, v17, v20

    .line 346
    .local v18, "zoomDelta":F
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkers:Ljava/util/Set;
    invoke-static/range {v20 .. v20}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1300(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Set;

    move-result-object v10

    .line 347
    .local v10, "markersToRemove":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mProjection:Lcom/google/android/gms/maps/Projection;

    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v20

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    move-object/from16 v16, v0

    .line 352
    .local v16, "visibleBounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    const/4 v6, 0x0

    .line 353
    .local v6, "existingClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusters:Ljava/util/Set;
    invoke-static/range {v20 .. v20}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1100(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Set;

    move-result-object v20

    if-eqz v20, :cond_3

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->SHOULD_ANIMATE:Z
    invoke-static {}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1400()Z

    move-result v20

    if-eqz v20, :cond_3

    .line 354
    new-instance v6, Ljava/util/ArrayList;

    .end local v6    # "existingClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 355
    .restart local v6    # "existingClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusters:Ljava/util/Set;
    invoke-static/range {v20 .. v20}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1100(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Set;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .local v7, "i$":Ljava/util/Iterator;
    :cond_1
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/maps/android/clustering/Cluster;

    .line 356
    .local v4, "c":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->shouldRenderAsCluster(Lcom/google/maps/android/clustering/Cluster;)Z

    move-result v20

    if-eqz v20, :cond_1

    invoke-interface {v4}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v20

    move-object/from16 v0, v16

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->contains(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v20

    if-eqz v20, :cond_1

    .line 357
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    move-object/from16 v20, v0

    invoke-interface {v4}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toPoint(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/projection/Point;

    move-result-object v15

    .line 358
    .local v15, "point":Lcom/google/maps/android/geometry/Point;
    invoke-interface {v6, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 343
    .end local v4    # "c":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    .end local v6    # "existingClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v10    # "markersToRemove":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;>;"
    .end local v15    # "point":Lcom/google/maps/android/geometry/Point;
    .end local v16    # "visibleBounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    .end local v18    # "zoomDelta":F
    .end local v19    # "zoomingIn":Z
    :cond_2
    const/16 v19, 0x0

    goto/16 :goto_1

    .line 364
    .restart local v6    # "existingClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    .restart local v10    # "markersToRemove":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;>;"
    .restart local v16    # "visibleBounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    .restart local v18    # "zoomDelta":F
    .restart local v19    # "zoomingIn":Z
    :cond_3
    new-instance v20, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static/range {v20 .. v20}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v12

    .line 366
    .local v12, "newMarkers":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->clusters:Ljava/util/Set;

    move-object/from16 v20, v0

    invoke-interface/range {v20 .. v20}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .restart local v7    # "i$":Ljava/util/Iterator;
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/maps/android/clustering/Cluster;

    .line 367
    .restart local v4    # "c":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    invoke-interface {v4}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v20

    move-object/from16 v0, v16

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->contains(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v13

    .line 368
    .local v13, "onScreen":Z
    if-eqz v19, :cond_5

    if-eqz v13, :cond_5

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->SHOULD_ANIMATE:Z
    invoke-static {}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1400()Z

    move-result v20

    if-eqz v20, :cond_5

    .line 369
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    move-object/from16 v20, v0

    invoke-interface {v4}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toPoint(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/projection/Point;

    move-result-object v15

    .line 370
    .restart local v15    # "point":Lcom/google/maps/android/geometry/Point;
    # invokes: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->findClosestCluster(Ljava/util/List;Lcom/google/maps/android/geometry/Point;)Lcom/google/maps/android/geometry/Point;
    invoke-static {v6, v15}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1500(Ljava/util/List;Lcom/google/maps/android/geometry/Point;)Lcom/google/maps/android/geometry/Point;

    move-result-object v5

    .line 371
    .local v5, "closest":Lcom/google/maps/android/geometry/Point;
    if-eqz v5, :cond_4

    .line 372
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toLatLng(Lcom/google/maps/android/geometry/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    .line 373
    .local v3, "animateTo":Lcom/google/android/gms/maps/model/LatLng;
    const/16 v20, 0x1

    new-instance v21, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v22, v0

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-direct {v0, v1, v4, v12, v3}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/Cluster;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    move/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v9, v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->add(ZLcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;)V

    goto :goto_3

    .line 375
    .end local v3    # "animateTo":Lcom/google/android/gms/maps/model/LatLng;
    :cond_4
    const/16 v20, 0x1

    new-instance v21, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-direct {v0, v1, v4, v12, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/Cluster;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    move/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v9, v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->add(ZLcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;)V

    goto :goto_3

    .line 378
    .end local v5    # "closest":Lcom/google/maps/android/geometry/Point;
    .end local v15    # "point":Lcom/google/maps/android/geometry/Point;
    :cond_5
    new-instance v20, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    invoke-direct {v0, v1, v4, v12, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/Cluster;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    move-object/from16 v0, v20

    invoke-virtual {v9, v13, v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->add(ZLcom/google/maps/android/clustering/view/DefaultClusterRenderer$CreateMarkerTask;)V

    goto/16 :goto_3

    .line 383
    .end local v4    # "c":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    .end local v13    # "onScreen":Z
    :cond_6
    invoke-virtual {v9}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->waitUntilFree()V

    .line 387
    invoke-interface {v10, v12}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 391
    const/4 v11, 0x0

    .line 392
    .local v11, "newClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->SHOULD_ANIMATE:Z
    invoke-static {}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1400()Z

    move-result v20

    if-eqz v20, :cond_8

    .line 393
    new-instance v11, Ljava/util/ArrayList;

    .end local v11    # "newClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 394
    .restart local v11    # "newClustersOnScreen":Ljava/util/List;, "Ljava/util/List<Lcom/google/maps/android/geometry/Point;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->clusters:Ljava/util/Set;

    move-object/from16 v20, v0

    invoke-interface/range {v20 .. v20}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_7
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/maps/android/clustering/Cluster;

    .line 395
    .restart local v4    # "c":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->shouldRenderAsCluster(Lcom/google/maps/android/clustering/Cluster;)Z

    move-result v20

    if-eqz v20, :cond_7

    invoke-interface {v4}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v20

    move-object/from16 v0, v16

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->contains(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v20

    if-eqz v20, :cond_7

    .line 396
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    move-object/from16 v20, v0

    invoke-interface {v4}, Lcom/google/maps/android/clustering/Cluster;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toPoint(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/projection/Point;

    move-result-object v14

    .line 397
    .local v14, "p":Lcom/google/maps/android/geometry/Point;
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 403
    .end local v4    # "c":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    .end local v14    # "p":Lcom/google/maps/android/geometry/Point;
    :cond_8
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;

    .line 404
    .local v8, "marker":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->position:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v8}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->access$1600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v20

    move-object/from16 v0, v16

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->contains(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v13

    .line 407
    .restart local v13    # "onScreen":Z
    if-nez v19, :cond_a

    const/high16 v20, -0x3fc00000    # -3.0f

    cmpl-float v20, v18, v20

    if-lez v20, :cond_a

    if-eqz v13, :cond_a

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->SHOULD_ANIMATE:Z
    invoke-static {}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1400()Z

    move-result v20

    if-eqz v20, :cond_a

    .line 408
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    move-object/from16 v20, v0

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->position:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v8}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->access$1600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toPoint(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/projection/Point;

    move-result-object v15

    .line 409
    .restart local v15    # "point":Lcom/google/maps/android/geometry/Point;
    # invokes: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->findClosestCluster(Ljava/util/List;Lcom/google/maps/android/geometry/Point;)Lcom/google/maps/android/geometry/Point;
    invoke-static {v11, v15}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1500(Ljava/util/List;Lcom/google/maps/android/geometry/Point;)Lcom/google/maps/android/geometry/Point;

    move-result-object v5

    .line 410
    .restart local v5    # "closest":Lcom/google/maps/android/geometry/Point;
    if-eqz v5, :cond_9

    .line 411
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Lcom/google/maps/android/projection/SphericalMercatorProjection;->toLatLng(Lcom/google/maps/android/geometry/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    .line 412
    .restart local v3    # "animateTo":Lcom/google/android/gms/maps/model/LatLng;
    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->position:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v8}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->access$1600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v9, v8, v0, v3}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->animateThenRemove(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_5

    .line 414
    .end local v3    # "animateTo":Lcom/google/android/gms/maps/model/LatLng;
    :cond_9
    const/16 v20, 0x1

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->marker:Lcom/google/android/gms/maps/model/Marker;
    invoke-static {v8}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->access$1700(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v21

    move/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v9, v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->remove(ZLcom/google/android/gms/maps/model/Marker;)V

    goto :goto_5

    .line 417
    .end local v5    # "closest":Lcom/google/maps/android/geometry/Point;
    .end local v15    # "point":Lcom/google/maps/android/geometry/Point;
    :cond_a
    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->marker:Lcom/google/android/gms/maps/model/Marker;
    invoke-static {v8}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->access$1700(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v9, v13, v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->remove(ZLcom/google/android/gms/maps/model/Marker;)V

    goto :goto_5

    .line 421
    .end local v8    # "marker":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    .end local v13    # "onScreen":Z
    :cond_b
    invoke-virtual {v9}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerModifier;->waitUntilFree()V

    .line 423
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    # setter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkers:Ljava/util/Set;
    invoke-static {v0, v12}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1302(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;)Ljava/util/Set;

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->clusters:Ljava/util/Set;

    move-object/from16 v21, v0

    # setter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusters:Ljava/util/Set;
    invoke-static/range {v20 .. v21}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1102(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;)Ljava/util/Set;

    .line 425
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    move/from16 v1, v17

    # setter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mZoom:F
    invoke-static {v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1002(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;F)F

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mCallback:Ljava/lang/Runnable;

    move-object/from16 v20, v0

    invoke-interface/range {v20 .. v20}, Ljava/lang/Runnable;->run()V

    goto/16 :goto_0
.end method

.method public setCallback(Ljava/lang/Runnable;)V
    .locals 0
    .param p1, "callback"    # Ljava/lang/Runnable;

    .prologue
    .line 321
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mCallback:Ljava/lang/Runnable;

    .line 322
    return-void
.end method

.method public setMapZoom(F)V
    .locals 7
    .param p1, "zoom"    # F

    .prologue
    .line 329
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    iput p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mMapZoom:F

    .line 330
    new-instance v0, Lcom/google/maps/android/projection/SphericalMercatorProjection;

    const-wide/high16 v1, 0x4070000000000000L    # 256.0

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    iget-object v5, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mZoom:F
    invoke-static {v5}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$1000(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)F

    move-result v5

    invoke-static {p1, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    float-to-double v5, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    mul-double/2addr v1, v3

    invoke-direct {v0, v1, v2}, Lcom/google/maps/android/projection/SphericalMercatorProjection;-><init>(D)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mSphericalMercatorProjection:Lcom/google/maps/android/projection/SphericalMercatorProjection;

    .line 331
    return-void
.end method

.method public setProjection(Lcom/google/android/gms/maps/Projection;)V
    .locals 0
    .param p1, "projection"    # Lcom/google/android/gms/maps/Projection;

    .prologue
    .line 325
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->mProjection:Lcom/google/android/gms/maps/Projection;

    .line 326
    return-void
.end method
