.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;
.super Landroid/animation/AnimatorListenerAdapter;
.source "DefaultClusterRenderer.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xc
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AnimationTask"
.end annotation


# instance fields
.field private final from:Lcom/google/android/gms/maps/model/LatLng;

.field private mMarkerManager:Lcom/google/maps/android/MarkerManager;

.field private mRemoveOnComplete:Z

.field private final marker:Lcom/google/android/gms/maps/model/Marker;

.field private final markerWithPosition:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;

.field final synthetic this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

.field private final to:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method private constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1
    .param p2, "markerWithPosition"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    .param p3, "from"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p4, "to"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 874
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.AnimationTask;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 875
    iput-object p2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->markerWithPosition:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;

    .line 876
    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->marker:Lcom/google/android/gms/maps/model/Marker;
    invoke-static {p2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->access$1700(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->marker:Lcom/google/android/gms/maps/model/Marker;

    .line 877
    iput-object p3, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->from:Lcom/google/android/gms/maps/model/LatLng;

    .line 878
    iput-object p4, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->to:Lcom/google/android/gms/maps/model/LatLng;

    .line 879
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
    .param p2, "x1"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;
    .param p3, "x2"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p4, "x3"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p5, "x4"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;

    .prologue
    .line 866
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.AnimationTask;"
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 891
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.AnimationTask;"
    iget-boolean v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->mRemoveOnComplete:Z

    if-eqz v1, :cond_0

    .line 892
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerToCluster:Ljava/util/Map;
    invoke-static {v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->marker:Lcom/google/android/gms/maps/model/Marker;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/clustering/Cluster;

    .line 893
    .local v0, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClusterToMarker:Ljava/util/Map;
    invoke-static {v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$2100(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;
    invoke-static {v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$300(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    move-result-object v1

    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->marker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v1, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->remove(Lcom/google/android/gms/maps/model/Marker;)V

    .line 895
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerToCluster:Ljava/util/Map;
    invoke-static {v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->marker:Lcom/google/android/gms/maps/model/Marker;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 896
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->mMarkerManager:Lcom/google/maps/android/MarkerManager;

    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->marker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v1, v2}, Lcom/google/maps/android/MarkerManager;->remove(Lcom/google/android/gms/maps/model/Marker;)Z

    .line 898
    .end local v0    # "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<TT;>;"
    :cond_0
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->markerWithPosition:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;

    iget-object v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->to:Lcom/google/android/gms/maps/model/LatLng;

    # setter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->position:Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {v1, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;->access$1602(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerWithPosition;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;

    .line 899
    return-void
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 12
    .param p1, "valueAnimator"    # Landroid/animation/ValueAnimator;

    .prologue
    .line 908
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.AnimationTask;"
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v0

    .line 909
    .local v0, "fraction":F
    iget-object v8, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->to:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v8, v8, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-object v10, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->from:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v10, v10, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    sub-double/2addr v8, v10

    float-to-double v10, v0

    mul-double/2addr v8, v10

    iget-object v10, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->from:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v10, v10, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    add-double v1, v8, v10

    .line 910
    .local v1, "lat":D
    iget-object v8, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->to:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v8, v8, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iget-object v10, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->from:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v10, v10, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    sub-double v5, v8, v10

    .line 913
    .local v5, "lngDelta":D
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    const-wide v10, 0x4066800000000000L    # 180.0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_0

    .line 914
    invoke-static {v5, v6}, Ljava/lang/Math;->signum(D)D

    move-result-wide v8

    const-wide v10, 0x4076800000000000L    # 360.0

    mul-double/2addr v8, v10

    sub-double/2addr v5, v8

    .line 916
    :cond_0
    float-to-double v8, v0

    mul-double/2addr v8, v5

    iget-object v10, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->from:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v10, v10, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    add-double v3, v8, v10

    .line 917
    .local v3, "lng":D
    new-instance v7, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v7, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 918
    .local v7, "position":Lcom/google/android/gms/maps/model/LatLng;
    iget-object v8, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->marker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v8, v7}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 919
    return-void
.end method

.method public perform()V
    .locals 2

    .prologue
    .line 882
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.AnimationTask;"
    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 883
    .local v0, "valueAnimator":Landroid/animation/ValueAnimator;
    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->ANIMATION_INTERP:Landroid/animation/TimeInterpolator;
    invoke-static {}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$2300()Landroid/animation/TimeInterpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 884
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 885
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 886
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 887
    return-void

    .line 882
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public removeOnAnimationComplete(Lcom/google/maps/android/MarkerManager;)V
    .locals 1
    .param p1, "markerManager"    # Lcom/google/maps/android/MarkerManager;

    .prologue
    .line 902
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.AnimationTask;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->mMarkerManager:Lcom/google/maps/android/MarkerManager;

    .line 903
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$AnimationTask;->mRemoveOnComplete:Z

    .line 904
    return-void
.end method
