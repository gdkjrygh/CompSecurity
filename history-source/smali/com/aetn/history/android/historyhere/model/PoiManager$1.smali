.class Lcom/aetn/history/android/historyhere/model/PoiManager$1;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;->getPoiList(DDJLjava/lang/String;I)V
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
    .line 294
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 294
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->onResponse(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 7
    .param p1, "response"    # Ljava/lang/String;

    .prologue
    .line 298
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 299
    .local v0, "gson":Lcom/google/gson/Gson;
    const-class v4, Lcom/aetn/history/android/historyhere/model/PoiResponse;

    invoke-virtual {v0, p1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/PoiResponse;

    .line 300
    .local v2, "mPoiResponse":Lcom/aetn/history/android/historyhere/model/PoiResponse;
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIList()Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_0

    .line 301
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    # setter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;
    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$002(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 303
    :cond_0
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    # setter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mLatestPoiList:Ljava/util/ArrayList;
    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$102(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 305
    iget-object v4, v2, Lcom/aetn/history/android/historyhere/model/PoiResponse;->results:Ljava/util/ArrayList;

    if-nez v4, :cond_1

    .line 306
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getPoiList(): no results:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    new-instance v1, Landroid/content/Intent;

    const-string v4, "poi_data_refreshed"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 308
    .local v1, "intent":Landroid/content/Intent;
    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$300()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 323
    .end local v1    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 311
    :cond_1
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getPoiList(): mCurrentPoiList()"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    iget-object v4, v2, Lcom/aetn/history/android/historyhere/model/PoiResponse;->results:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 316
    .local v3, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 317
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mCurrentPoiList:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$000(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mLatestPoiList:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$100(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 322
    .end local v3    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_3
    iget-object v4, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyListeners()V
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$400(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    goto :goto_0
.end method
