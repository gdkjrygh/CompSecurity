.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;
.super Ljava/lang/Object;
.source "DefaultClusterRenderer.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;


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
    .line 133
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer.2;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V
    .locals 2
    .param p1, "marker"    # Lcom/google/android/gms/maps/model/Marker;

    .prologue
    .line 136
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer.2;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;
    invoke-static {v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$400(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mItemInfoWindowClickListener:Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;
    invoke-static {v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$400(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;

    move-result-object v1

    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$2;->this$0:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;

    # getter for: Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->mMarkerCache:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;
    invoke-static {v0}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;->access$300(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;)Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$MarkerCache;->get(Lcom/google/android/gms/maps/model/Marker;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/clustering/ClusterItem;

    invoke-interface {v1, v0}, Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemInfoWindowClickListener;->onClusterItemInfoWindowClick(Lcom/google/maps/android/clustering/ClusterItem;)V

    .line 139
    :cond_0
    return-void
.end method
