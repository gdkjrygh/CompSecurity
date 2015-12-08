.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;
.super Ljava/lang/Object;
.source "DefaultClusterRenderer.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->onAdd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;


# direct methods
.method constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)V
    .locals 0

    .prologue
    .line 142
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer.3;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 145
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer.3;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;
    invoke-static {v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$500(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;
    invoke-static {v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$500(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;

    move-result-object v1

    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$3;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerToCluster:Ljava/util/Map;
    invoke-static {v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$600(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/clustering/Cluster;

    invoke-interface {v1, v0}, Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;->onClusterClick(Lcom/google/maps/android/clustering/Cluster;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
