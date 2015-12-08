.class Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;
.super Landroid/os/AsyncTask;
.source "ClusterManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/ClusterManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ClusterTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Float;",
        "Ljava/lang/Void;",
        "Ljava/util/Set",
        "<+",
        "Lcom/google/maps/android/clustering/Cluster",
        "<TT;>;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/maps/android/clustering/ClusterManager;


# direct methods
.method private constructor <init>(Lcom/google/maps/android/clustering/ClusterManager;)V
    .locals 0

    .prologue
    .line 192
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>.ClusterTask;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->this$0:Lcom/google/maps/android/clustering/ClusterManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/maps/android/clustering/ClusterManager;Lcom/google/maps/android/clustering/ClusterManager$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/maps/android/clustering/ClusterManager;
    .param p2, "x1"    # Lcom/google/maps/android/clustering/ClusterManager$1;

    .prologue
    .line 192
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>.ClusterTask;"
    invoke-direct {p0, p1}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;-><init>(Lcom/google/maps/android/clustering/ClusterManager;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 192
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>.ClusterTask;"
    check-cast p1, [Ljava/lang/Float;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->doInBackground([Ljava/lang/Float;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Float;)Ljava/util/Set;
    .locals 3
    .param p1, "zoom"    # [Ljava/lang/Float;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Float;",
            ")",
            "Ljava/util/Set",
            "<+",
            "Lcom/google/maps/android/clustering/Cluster",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 195
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>.ClusterTask;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->this$0:Lcom/google/maps/android/clustering/ClusterManager;

    # getter for: Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;
    invoke-static {v0}, Lcom/google/maps/android/clustering/ClusterManager;->access$100(Lcom/google/maps/android/clustering/ClusterManager;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 197
    :try_start_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->this$0:Lcom/google/maps/android/clustering/ClusterManager;

    # getter for: Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithm:Lcom/google/maps/android/clustering/algo/Algorithm;
    invoke-static {v0}, Lcom/google/maps/android/clustering/ClusterManager;->access$200(Lcom/google/maps/android/clustering/ClusterManager;)Lcom/google/maps/android/clustering/algo/Algorithm;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/google/maps/android/clustering/algo/Algorithm;->getClusters(D)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 199
    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->this$0:Lcom/google/maps/android/clustering/ClusterManager;

    # getter for: Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;
    invoke-static {v1}, Lcom/google/maps/android/clustering/ClusterManager;->access$100(Lcom/google/maps/android/clustering/ClusterManager;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->this$0:Lcom/google/maps/android/clustering/ClusterManager;

    # getter for: Lcom/google/maps/android/clustering/ClusterManager;->mAlgorithmLock:Ljava/util/concurrent/locks/ReadWriteLock;
    invoke-static {v1}, Lcom/google/maps/android/clustering/ClusterManager;->access$100(Lcom/google/maps/android/clustering/ClusterManager;)Ljava/util/concurrent/locks/ReadWriteLock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 192
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>.ClusterTask;"
    check-cast p1, Ljava/util/Set;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->onPostExecute(Ljava/util/Set;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/Set;)V
    .locals 1
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
    .line 205
    .local p0, "this":Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;, "Lcom/google/maps/android/clustering/ClusterManager<TT;>.ClusterTask;"
    .local p1, "clusters":Ljava/util/Set;, "Ljava/util/Set<+Lcom/google/maps/android/clustering/Cluster<TT;>;>;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/ClusterManager$ClusterTask;->this$0:Lcom/google/maps/android/clustering/ClusterManager;

    # getter for: Lcom/google/maps/android/clustering/ClusterManager;->mRenderer:Lcom/google/maps/android/clustering/view/ClusterRenderer;
    invoke-static {v0}, Lcom/google/maps/android/clustering/ClusterManager;->access$300(Lcom/google/maps/android/clustering/ClusterManager;)Lcom/google/maps/android/clustering/view/ClusterRenderer;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/maps/android/clustering/view/ClusterRenderer;->onClustersChanged(Ljava/util/Set;)V

    .line 206
    return-void
.end method
