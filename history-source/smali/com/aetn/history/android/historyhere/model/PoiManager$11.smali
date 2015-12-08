.class Lcom/aetn/history/android/historyhere/model/PoiManager$11;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;->getPOIDetailFromService(Landroid/content/Context;Ljava/lang/String;)V
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
    .line 771
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$11;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 771
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$11;->onResponse(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 5
    .param p1, "response"    # Ljava/lang/String;

    .prologue
    .line 775
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$11;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setPOIDetailFromService: the response was: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 776
    const-string v2, "OK"

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_0

    .line 778
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$11;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyDetailFailedListener()V
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1500(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    .line 786
    :goto_0
    return-void

    .line 781
    :cond_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 782
    .local v0, "gson":Lcom/google/gson/Gson;
    const-class v2, Lcom/aetn/history/android/historyhere/model/PoiDetailResponse;

    invoke-virtual {v0, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/PoiDetailResponse;

    .line 783
    .local v1, "mPoiDetailResponse":Lcom/aetn/history/android/historyhere/model/PoiDetailResponse;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$11;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setPOIDetailFromService: mPoiDetailResponse.results.size():"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v1, Lcom/aetn/history/android/historyhere/model/PoiDetailResponse;->results:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 784
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$11;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    iget-object v2, v1, Lcom/aetn/history/android/historyhere/model/PoiDetailResponse;->results:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v3, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->setCurrentPOIDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 785
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$11;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyDetailLoadedListener()V
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$1600(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    goto :goto_0
.end method
