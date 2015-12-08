.class Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;
.super Landroid/os/AsyncTask;
.source "PoiManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LoadLimitedDataFromDataDumpTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ljava/util/ArrayList",
        "<",
        "Lcom/aetn/history/android/historyhere/model/POIDetail;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/PoiManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/PoiManager;

    .prologue
    .line 479
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 479
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;->doInBackground([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .param p1, "data"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 481
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "LoadLimitedDataFromDataDumpTask(): running"

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 483
    .local v0, "gson":Lcom/google/gson/Gson;
    const/4 v3, 0x0

    aget-object v3, p1, v3

    const-class v4, [Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0, v3, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 484
    .local v1, "mPois":[Lcom/aetn/history/android/historyhere/model/POIDetail;
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 485
    .local v2, "poiList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    return-object v2
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 479
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;->onPostExecute(Ljava/util/ArrayList;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/ArrayList;)V
    .locals 1
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
    .line 494
    .local p1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyLimitedDataLoadedListener(Ljava/util/ArrayList;)V
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$700(Lcom/aetn/history/android/historyhere/model/PoiManager;Ljava/util/ArrayList;)V

    .line 495
    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 489
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 491
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 479
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadLimitedDataFromDataDumpTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
