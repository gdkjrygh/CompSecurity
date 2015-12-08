.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$11;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/maps/android/clustering/ClusterManager$OnClusterClickListener",
        "<",
        "Lcom/aetn/history/android/historyhere/model/POIDetail;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 366
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClusterClick(Lcom/google/maps/android/clustering/Cluster;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/maps/android/clustering/Cluster",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 369
    .local p1, "cluster":Lcom/google/maps/android/clustering/Cluster;, "Lcom/google/maps/android/clustering/Cluster<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onClusterClick():cluster:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    new-instance v1, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 372
    .local v1, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    invoke-interface {p1}, Lcom/google/maps/android/clustering/Cluster;->getItems()Ljava/util/Collection;

    move-result-object v2

    .line 373
    .local v2, "col":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 374
    .local v3, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 375
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 376
    .local v4, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    goto :goto_0

    .line 378
    .end local v4    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    .line 379
    .local v0, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$11;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->map:Lcom/google/android/gms/maps/GoogleMap;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v5

    const/16 v6, 0x64

    invoke-static {v0, v6}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 380
    const/4 v5, 0x1

    return v5
.end method
