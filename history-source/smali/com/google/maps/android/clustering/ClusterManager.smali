.class public Lcom/google/maps/android/clustering/ClusterManager;
.super Ljava/lang/Object;
.source "ClusterManager.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;
.implements Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;
.implements Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/maps/android/clustering/ClusterManager$1;,
        Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;,
        Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;,
        Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;,
        Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;,
        Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/maps/android/clustering/ClusterItem;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;",
        "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;",
        "Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;"
    }
.end annotation


# instance fields
.field private mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/algo/Algorithm",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

.field private final mClusterMarkers:Lcom/google/maps/android/MarkerManager$Collection;

.field private mClusterTask:Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager",
            "<TT;>.ClusterTask;"
        }
    .end annotation
.end field

.field private final mClusterTaskLock:Ljava/util/concurrent/locks/ReadWriteLock;

.field private mMap:Lcom/google/android/gms/maps/GoogleMap;

.field private final mMarkerManager:Lcom/google/maps/android/MarkerManager;

.field private final mMarkers:Lcom/google/maps/android/MarkerManager$Collection;

.field private mOnClusterClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mOnClusterInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mOnClusterItemClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mOnClusterItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field private mPreviousCameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

.field private mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/clustering/view/ClusterRenderer",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "map"    # Lcom/google/android/gms/maps/GoogleMap;

    .prologue
    .line 48
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    new-instance v0, Lcom/google/maps/android/MarkerManager;

    invoke-direct {v0, p2}, Lcom/google/maps/android/MarkerManager;-><init>(Lcom/google/android/gms/maps/GoogleMap;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/maps/android/clustering/ClusterManager;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/MarkerManager;)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/MarkerManager;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "map"    # Lcom/google/android/gms/maps/GoogleMap;
    .param p3, "markerManager"    # Lcom/google/maps/android/MarkerManager;

    .prologue
    .line 51
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    .line 40
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTaskLock:Ljava/util/concurrent/locks/ReadWriteLock;

    .line 52
    iput-object p2, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    .line 53
    iput-object p3, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMarkerManager:Lcom/google/maps/android/MarkerManager;

    .line 54
    invoke-virtual {p3}, Lcom/google/maps/android/MarkerManager;->newCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterMarkers:Lcom/google/maps/android/MarkerManager$Collection;

    .line 55
    invoke-virtual {p3}, Lcom/google/maps/android/MarkerManager;->newCollection()Lcom/google/maps/android/MarkerManager$Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMarkers:Lcom/google/maps/android/MarkerManager$Collection;

    .line 56
    new-instance v0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    .line 57
    new-instance v0, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;

    new-instance v1, Lcom/google/maps/android/clustering/algo/NonHierarchicalDistanceBasedAlgorithm;

    invoke-direct {v1}, Lcom/google/maps/android/clustering/algo/NonHierarchicalDistanceBasedAlgorithm;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;-><init>(Lcom/google/maps/android/clustering/algo/Algorithm;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    .line 58
    new-instance v0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;-><init>(Lcom/google/maps/android/clustering/ClusterManager;Lcom/google/maps/android/clustering/ClusterManager$1;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTask:Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;

    .line 59
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->onAdd()V

    .line 60
    return-void
.end method

.method static synthetic access$100(Lcom/google/maps/android/clustering/ClusterManager;)Ljava/util/concurrent/locks/ReadWriteLock;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/ClusterManager;

    .prologue
    .line 28
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    return-object v0
.end method

.method static synthetic access$200(Lcom/google/maps/android/clustering/ClusterManager;)Lcom/google/maps/android/clustering/algo/Algorithm;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/ClusterManager;

    .prologue
    .line 28
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    return-object v0
.end method

.method static synthetic access$300(Lcom/google/maps/android/clustering/ClusterManager;)Lcom/google/maps/android/clustering/view/ClusterRenderer;
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/clustering/ClusterManager;

    .prologue
    .line 28
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    return-object v0
.end method


# virtual methods
.method public addItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 122
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "myItem":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/algo/Algorithm;->addItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 128
    return-void

    .line 126
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public addItems(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 112
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "items":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 114
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/algo/Algorithm;->addItems(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 119
    return-void

    .line 116
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public clearItems()V
    .locals 2

    .prologue
    .line 103
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 105
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    invoke-interface {v0}, Lcom/google/maps/android/clustering/algo/Algorithm;->clearItems()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 109
    return-void

    .line 107
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public cluster()V
    .locals 5

    .prologue
    .line 143
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTaskLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTask:Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->cancel(Z)Z

    .line 147
    new-instance v0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;-><init>(Lcom/google/maps/android/clustering/ClusterManager;Lcom/google/maps/android/clustering/ClusterManager$1;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTask:Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;

    .line 148
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 149
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTask:Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Float;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    :goto_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTaskLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 156
    return-void

    .line 151
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTask:Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Float;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v4

    iget v4, v4, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 154
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterTaskLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getClusterMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;
    .locals 1

    .prologue
    .line 67
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterMarkers:Lcom/google/maps/android/MarkerManager$Collection;

    return-object v0
.end method

.method public getMarkerCollection()Lcom/google/maps/android/MarkerManager$Collection;
    .locals 1

    .prologue
    .line 63
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMarkers:Lcom/google/maps/android/MarkerManager$Collection;

    return-object v0
.end method

.method public getMarkerManager()Lcom/google/maps/android/MarkerManager;
    .locals 1

    .prologue
    .line 71
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMarkerManager:Lcom/google/maps/android/MarkerManager;

    return-object v0
.end method

.method public onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 3
    .param p1, "cameraPosition"    # Lcom/google/android/gms/maps/model/CameraPosition;

    .prologue
    .line 165
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    instance-of v1, v1, Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;

    if-eqz v1, :cond_0

    .line 166
    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    check-cast v1, Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;

    invoke-interface {v1, p1}, Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;->onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V

    .line 170
    :cond_0
    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    .line 171
    .local v0, "position":Lcom/google/android/gms/maps/model/CameraPosition;
    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mPreviousCameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mPreviousCameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    iget v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    iget v2, v0, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    .line 177
    :goto_0
    return-void

    .line 174
    :cond_1
    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMap:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iput-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mPreviousCameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    .line 176
    invoke-virtual {p0}, Lcom/google/maps/android/clustering/ClusterManager;->cluster()V

    goto :goto_0
.end method

.method public onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 1
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 186
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    invoke-virtual {p0}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerManager()Lcom/google/maps/android/MarkerManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/maps/android/MarkerManager;->onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V

    .line 187
    return-void
.end method

.method public onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z
    .locals 1
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 181
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    invoke-virtual {p0}, Lcom/google/maps/android/clustering/ClusterManager;->getMarkerManager()Lcom/google/maps/android/MarkerManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/maps/android/MarkerManager;->onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z

    move-result v0

    return v0
.end method

.method public removeItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 131
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "item":Lcom/google/maps/android/clustering/ClusterItem;, "TT;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 133
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/algo/Algorithm;->removeItem(Lcom/google/maps/android/clustering/ClusterItem;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 137
    return-void

    .line 135
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public setAlgorithm(Lcom/google/maps/android/clustering/algo/Algorithm;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/algo/Algorithm",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 90
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "algorithm":Lcom/google/maps/android/clustering/algo/Algorithm;, "Lcom/google/maps/android/clustering/algo/Algorithm<TT;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 92
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;

    invoke-interface {v0}, Lcom/google/maps/android/clustering/algo/Algorithm;->getItems()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/maps/android/clustering/algo/Algorithm;->addItems(Ljava/util/Collection;)V

    .line 95
    :cond_0
    new-instance v0, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;

    invoke-direct {v0, p1}, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;-><init>(Lcom/google/maps/android/clustering/algo/Algorithm;)V

    iput-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 99
    invoke-virtual {p0}, Lcom/google/maps/android/clustering/ClusterManager;->cluster()V

    .line 100
    return-void

    .line 97
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public setOnClusterClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 214
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;

    .line 215
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;)V

    .line 216
    return-void
.end method

.method public setOnClusterInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 223
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;

    .line 224
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;)V

    .line 225
    return-void
.end method

.method public setOnClusterItemClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 232
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterItemClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;

    .line 233
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterItemClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;)V

    .line 234
    return-void
.end method

.method public setOnClusterItemInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 241
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "listener":Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;, "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener<TT;>;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;

    .line 242
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterItemInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;)V

    .line 243
    return-void
.end method

.method public setRenderer(Lcom/google/maps/android/clustering/view/ClusterRenderer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/view/ClusterRenderer",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>;"
    .local p1, "view":Lcom/google/maps/android/clustering/view/ClusterRenderer;, "Lcom/google/maps/android/clustering/view/ClusterRenderer<TT;>;"
    const/4 v1, 0x0

    .line 75
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0, v1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;)V

    .line 76
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0, v1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterItemClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;)V

    .line 77
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mClusterMarkers:Lcom/google/maps/android/MarkerManager$Collection;

    invoke-virtual {v0}, Lcom/google/maps/android/MarkerManager$Collection;->clear()V

    .line 78
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mMarkers:Lcom/google/maps/android/MarkerManager$Collection;

    invoke-virtual {v0}, Lcom/google/maps/android/MarkerManager$Collection;->clear()V

    .line 79
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->onRemove()V

    .line 80
    iput-object p1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    .line 81
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    invoke-interface {v0}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->onAdd()V

    .line 82
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;

    invoke-interface {v0, v1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;)V

    .line 83
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;

    invoke-interface {v0, v1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterInfoWindowClickListener;)V

    .line 84
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterItemClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;

    invoke-interface {v0, v1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterItemClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;)V

    .line 85
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager;->mOnClusterItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;

    invoke-interface {v0, v1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->setOnClusterItemInfoWindowClickListener(Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;)V

    .line 86
    invoke-virtual {p0}, Lcom/google/maps/android/clustering/ClusterManager;->cluster()V

    .line 87
    return-void
.end method
