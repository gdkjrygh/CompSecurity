.class Lcom/aetn/history/android/historyhere/model/PoiManager$7;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;->loadAllToursList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/volley/Response$Listener",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 581
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 581
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->onResponse(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 10
    .param p1, "response"    # Ljava/lang/String;

    .prologue
    .line 585
    const-string v6, "OK"

    invoke-virtual {p1, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-gez v6, :cond_0

    .line 587
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "loadAllToursList: not loaded properly"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyAllToursLoadFailedListener()V
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$900(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    .line 628
    :goto_0
    return-void

    .line 591
    :cond_0
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 592
    .local v1, "gson":Lcom/google/gson/Gson;
    const-class v6, Lcom/aetn/history/android/historyhere/model/PoiResponse;

    invoke-virtual {v1, p1, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/PoiResponse;

    .line 594
    .local v2, "mPoiResponse":Lcom/aetn/history/android/historyhere/model/PoiResponse;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    iget-object v7, v2, Lcom/aetn/history/android/historyhere/model/PoiResponse;->results:Ljava/util/ArrayList;

    # setter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;
    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1002(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 595
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 596
    .local v4, "sortedList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v6

    iget-object v5, v6, Lcom/aetn/history/android/historyhere/model/Configuration;->tourSponsorData:Ljava/util/ArrayList;

    .line 599
    .local v5, "sponsorData":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;>;"
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;

    .line 601
    .local v0, "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 602
    .local v3, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v8, v0, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->id:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 603
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 611
    .end local v0    # "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    .end local v3    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_3
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v6

    new-instance v7, Lcom/aetn/history/android/historyhere/model/PoiManager$7$1;

    invoke-direct {v7, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$7$1;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager$7;)V

    invoke-static {v6, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 618
    new-instance v6, Lcom/aetn/history/android/historyhere/model/PoiManager$7$2;

    invoke-direct {v6, p0}, Lcom/aetn/history/android/historyhere/model/PoiManager$7$2;-><init>(Lcom/aetn/history/android/historyhere/model/PoiManager$7;)V

    invoke-static {v4, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 625
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 626
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # setter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mAllToursList:Ljava/util/ArrayList;
    invoke-static {v6, v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1002(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 627
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyAllToursLoadedListeners()V
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1100(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    goto/16 :goto_0
.end method
