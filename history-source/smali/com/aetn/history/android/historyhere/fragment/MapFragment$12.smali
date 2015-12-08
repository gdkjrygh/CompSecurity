.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener;


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
        "Lcom/google/maps/android/clustering/ClusterManager$OnClusterItemClickListener",
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
    .line 385
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClusterItemClick(Lcom/aetn/history/android/historyhere/model/POIDetail;)Z
    .locals 4
    .param p1, "item"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    const/4 v3, 0x1

    .line 388
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMarkerClick():getPoiIndexById(poi.getTitle()): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->clearSelectedMarkerIcon()V

    .line 391
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setCurrentlySelectedPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2200(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 392
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMarkerClick():index:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mCurrentlySelectedPoiIndex:I
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2300(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 394
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->selectedMarker:Z
    invoke-static {v0, v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1202(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Z)Z

    .line 395
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    const/4 v1, 0x0

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedMarkerIcon(Z)V
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2500(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Z)V

    .line 396
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getCurrentlySelectedPoi()Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2400(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 397
    return v3
.end method

.method public bridge synthetic onClusterItemClick(Lcom/google/maps/android/clustering/ClusterItem;)Z
    .locals 1

    .prologue
    .line 385
    check-cast p1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$12;->onClusterItemClick(Lcom/aetn/history/android/historyhere/model/POIDetail;)Z

    move-result v0

    return v0
.end method
