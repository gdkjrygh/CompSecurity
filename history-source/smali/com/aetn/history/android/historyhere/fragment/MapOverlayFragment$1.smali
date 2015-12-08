.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$OnUnclusteredMapMarkersListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 138
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onUnclusteredPoisChanged()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 142
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "onUnclusteredPoisChanged"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mUnclusteredMapMarkersChanged:Z
    invoke-static {v3, v5}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$102(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z

    .line 145
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    iget-boolean v3, v3, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mIsDetailVisible:Z

    if-eqz v3, :cond_0

    .line 147
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z
    invoke-static {v3, v5}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$202(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z

    .line 149
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 150
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPager:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->getCurrentItem()I

    move-result v1

    .line 152
    .local v1, "pos":I
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 154
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->isInUnclusteredMapMarkers(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 155
    .local v2, "tf":Ljava/lang/Boolean;
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    .line 156
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "onUnclusteredPoisChanged: it is not in the list close the details"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateHideDetailPager()V

    .line 158
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    const/4 v4, 0x0

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mTargetedPOI:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$502(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 160
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->clearSelectedMarkerIcon()V

    .line 166
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    .end local v1    # "pos":I
    .end local v2    # "tf":Ljava/lang/Boolean;
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->loadUnclusteredMapPois()V

    .line 167
    return-void

    .line 162
    .restart local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    .restart local v1    # "pos":I
    .restart local v2    # "tf":Ljava/lang/Boolean;
    :cond_1
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "onUnclusteredPoisChanged: don\'t do anything right now"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onUnclusteredPoisLoaded(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 170
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUnclusteredPoisLoaded: mWaitToReloadAdapter"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNewPOIList:Ljava/util/ArrayList;
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$702(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 173
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->reloadAdapter()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$800(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    .line 175
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPoiInList()V

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    const/4 v1, 0x0

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mUnclusteredMapMarkersChanged:Z
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$102(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z

    .line 178
    return-void
.end method
