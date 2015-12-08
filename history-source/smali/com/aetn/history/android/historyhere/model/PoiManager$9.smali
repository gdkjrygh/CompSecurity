.class Lcom/aetn/history/android/historyhere/model/PoiManager$9;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;->getTourPOIDetailFromService(Landroid/content/Context;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
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
    .line 670
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$9;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 670
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$9;->onResponse(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 6
    .param p1, "response"    # Ljava/lang/String;

    .prologue
    .line 674
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$9;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getTourPOIDetailFromService: the response was: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 676
    const-string v3, "OK"

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-gez v3, :cond_0

    .line 678
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$9;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyTourDetailFailedListener()V
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1200(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    .line 686
    :goto_0
    return-void

    .line 681
    :cond_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 682
    .local v0, "gson":Lcom/google/gson/Gson;
    const-class v3, Lcom/aetn/history/android/historyhere/model/PoiResponse;

    invoke-virtual {v0, p1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/PoiResponse;

    .line 683
    .local v1, "mResponse":Lcom/aetn/history/android/historyhere/model/PoiResponse;
    iget-object v2, v1, Lcom/aetn/history/android/historyhere/model/PoiResponse;->results:Ljava/util/ArrayList;

    .line 684
    .local v2, "tourDetails":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$9;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # setter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentTourPoiList:Ljava/util/ArrayList;
    invoke-static {v3, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1302(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 685
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$9;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyTourDetailLoadedListeners()V
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1400(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    goto :goto_0
.end method
