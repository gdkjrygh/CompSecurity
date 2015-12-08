.class Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;
.super Landroid/os/AsyncTask;
.source "PoiManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "UpdateLimitedDataFromDataDumpTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/util/ArrayList",
        "<",
        "Lcom/aetn/history/android/historyhere/model/POIDetail;",
        ">;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
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
    .line 504
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/util/ArrayList;)Ljava/lang/Boolean;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .local p1, "data":[Ljava/util/ArrayList;, "[Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    const/4 v10, 0x0

    .line 506
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "UpdateLimitedDataFromDataDumpTask(): running"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    aget-object v0, p1, v10

    .line 508
    .local v0, "fullList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 509
    .local v4, "updateList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 512
    .local v1, "insertList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$300()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getRowsForUpdate(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v5

    .line 513
    .local v5, "updatePOIs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "UpdateLimitedDataFromDataDumpTask(): this is how many need to be updated:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 516
    .local v3, "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 517
    .local v2, "o":Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 519
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "UpdateLimitedDataFromDataDumpTask(): FOUND ONE: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 521
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 526
    .end local v2    # "o":Lcom/aetn/history/android/historyhere/model/POIDetail;
    .end local v3    # "p":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_2
    move-object v1, v0

    .line 527
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "UpdateLimitedDataFromDataDumpTask(): updateList.size():"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "UpdateLimitedDataFromDataDumpTask(): insertList.size():"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_3

    .line 530
    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$300()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->updatePois(Ljava/util/ArrayList;)Z

    .line 532
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_4

    .line 533
    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$300()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v6

    invoke-virtual {v6, v1, v10}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->addPois(Ljava/util/ArrayList;Z)Z

    .line 535
    :cond_4
    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    return-object v6
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 504
    check-cast p1, [Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->doInBackground([Ljava/util/ArrayList;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 2
    .param p1, "success"    # Ljava/lang/Boolean;

    .prologue
    .line 543
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UpdateLimitedDataFromDataDumpTask(): onPostExecute: success"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyLimitedDataUpdatedListener()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$800(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    .line 545
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 504
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 539
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 540
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 504
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$UpdateLimitedDataFromDataDumpTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
