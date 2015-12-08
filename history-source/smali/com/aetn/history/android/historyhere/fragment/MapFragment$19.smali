.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->addTourMarkers(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

.field final synthetic val$id:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 874
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->val$id:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 877
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 879
    .local v1, "targetPOI":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->val$id:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 881
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->newPoiList:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 882
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->val$id:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 883
    move-object v1, v0

    .line 888
    .end local v0    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_1
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v2, v1, v5}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setSelectedToursMarkerByPoi(Lcom/aetn/history/android/historyhere/model/POIDetail;Z)V

    .line 889
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$19;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showDetailPager(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    invoke-static {v2, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2600(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 890
    return-void
.end method
