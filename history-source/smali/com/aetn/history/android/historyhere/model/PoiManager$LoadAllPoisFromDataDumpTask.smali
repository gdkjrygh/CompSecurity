.class Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;
.super Landroid/os/AsyncTask;
.source "PoiManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LoadAllPoisFromDataDumpTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
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
    .line 421
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 8
    .param p1, "data"    # [Ljava/lang/String;

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 423
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "LoadAllPoisFromDataDumpTask(): running"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LoadAllPoisFromDataDumpTask: the response was this long: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    aget-object v5, p1, v6

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 426
    .local v0, "gson":Lcom/google/gson/Gson;
    aget-object v3, p1, v6

    const-class v4, [Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0, v3, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 427
    .local v1, "mPois":[Lcom/aetn/history/android/historyhere/model/POIDetail;
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 428
    .local v2, "poiList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$300()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v3

    invoke-virtual {v3, v2, v7}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->addPois(Ljava/util/ArrayList;Z)Z

    .line 429
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    return-object v3
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 421
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 1
    .param p1, "tf"    # Ljava/lang/Boolean;

    .prologue
    .line 438
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyInitialDataListener()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$600(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    .line 439
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 421
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 433
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 435
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 421
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromDataDumpTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
