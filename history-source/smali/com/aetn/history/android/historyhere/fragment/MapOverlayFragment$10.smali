.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


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
    .line 250
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 2
    .param p1, "arg0"    # I

    .prologue
    .line 281
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mWaitToReloadAdapter:Z
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNewPOIList:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onPageScrollStateChanged:mNewPOIList:"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNewPOIList:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v1

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$302(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->reloadAdapter()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$800(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    .line 288
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setPoiInList()V

    .line 290
    :cond_1
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0
    .param p1, "arg0"    # I
    .param p2, "arg1"    # F
    .param p3, "arg2"    # I

    .prologue
    .line 277
    return-void
.end method

.method public onPageSelected(I)V
    .locals 5
    .param p1, "pageIndex"    # I

    .prologue
    .line 254
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onPageSelected:mExternalSelectedAction:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mFromExternallySelectedAction:Z
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->getMapFragment()Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    move-result-object v1

    .line 258
    .local v1, "frag":Lcom/aetn/history/android/historyhere/fragment/MapFragment;
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 259
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 265
    .local v0, "currentPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :goto_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailPager:Landroid/view/ViewGroup;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    .line 266
    invoke-virtual {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 268
    :cond_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    const/4 v3, 0x0

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mFromExternallySelectedAction:Z
    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1102(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Z)Z

    .line 269
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setNextPreviousIcons(I)V
    invoke-static {v2, p1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;I)V

    .line 271
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 272
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsIncrementTourPoiSelectCount()V

    .line 274
    :cond_1
    return-void

    .line 260
    .end local v0    # "currentPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_2
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeTours()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 261
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .restart local v0    # "currentPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    goto :goto_0

    .line 263
    .end local v0    # "currentPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_3
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mCurrentPOIList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .restart local v0    # "currentPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    goto :goto_0
.end method
