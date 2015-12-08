.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;
.super Landroid/os/Handler;
.source "DefaultClusterRenderer.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewModifier"
.end annotation


# static fields
.field private static final RUN_TASK:I = 0x0

.field private static final TASK_FINISHED:I = 0x1


# instance fields
.field private mNextClusters:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer",
            "<TT;>.RenderTask;"
        }
    .end annotation
.end field

.field private mViewModificationInProgress:Z

.field final synthetic this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;


# direct methods
.method private constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)V
    .locals 1

    .prologue
    .line 224
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.ViewModifier;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 227
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mViewModificationInProgress:Z

    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mNextClusters:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;
    .param p2, "x1"    # Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;

    .prologue
    .line 224
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.ViewModifier;"
    invoke-direct {p0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.ViewModifier;"
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 232
    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v1, v3, :cond_1

    .line 233
    iput-boolean v2, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mViewModificationInProgress:Z

    .line 234
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mNextClusters:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;

    if-eqz v1, :cond_0

    .line 236
    invoke-virtual {p0, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->sendEmptyMessage(I)Z

    .line 268
    :cond_0
    :goto_0
    return-void

    .line 240
    :cond_1
    invoke-virtual {p0, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->removeMessages(I)V

    .line 242
    iget-boolean v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mViewModificationInProgress:Z

    if-nez v1, :cond_0

    .line 247
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mNextClusters:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;

    if-eqz v1, :cond_0

    .line 253
    monitor-enter p0

    .line 254
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mNextClusters:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;

    .line 255
    .local v0, "renderTask":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mNextClusters:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;

    .line 256
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mViewModificationInProgress:Z

    .line 257
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    new-instance v1, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier$1;

    invoke-direct {v1, p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier$1;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;)V

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->setCallback(Ljava/lang/Runnable;)V

    .line 265
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMap:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$800(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->setProjection(Lcom/google/android/gms/maps/Projection;)V

    .line 266
    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMap:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$800(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;->setMapZoom(F)V

    .line 267
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 257
    .end local v0    # "renderTask":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.RenderTask;"
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public queue(Ljava/util/Set;)V
    .locals 3
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
    .line 271
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer<TT;>.ViewModifier;"
    .local p1, "clusters":Ljava/util/Set;, "Ljava/util/Set<+Lcom/google/maps/android/clustering/Cluster<TT;>;>;"
    monitor-enter p0

    .line 273
    :try_start_0
    new-instance v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;

    iget-object v1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;-><init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;Ljava/util/Set;Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$1;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->mNextClusters:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$RenderTask;

    .line 274
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->sendEmptyMessage(I)Z

    .line 276
    return-void

    .line 274
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
