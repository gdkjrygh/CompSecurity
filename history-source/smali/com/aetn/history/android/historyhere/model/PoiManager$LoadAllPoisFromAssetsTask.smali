.class Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;
.super Landroid/os/AsyncTask;
.source "PoiManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LoadAllPoisFromAssetsTask"
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
    .line 347
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 10
    .param p1, "data"    # [Ljava/lang/String;

    .prologue
    const/4 v9, 0x0

    .line 350
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "LoadAllPoisFromAssetsTask(): running"

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$300()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 352
    .local v0, "assetManager":Landroid/content/res/AssetManager;
    const-string v4, ""

    .line 354
    .local v4, "jsonFile":Ljava/lang/String;
    :try_start_0
    const-string v7, "fulldata_2015_01_22.json"

    invoke-virtual {v0, v7}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 355
    .local v3, "ims":Ljava/io/InputStream;
    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->getStringFromInputStream(Ljava/io/InputStream;)Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$500(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 360
    .end local v3    # "ims":Ljava/io/InputStream;
    :goto_0
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 365
    :goto_1
    return-object v7

    .line 356
    :catch_0
    move-exception v1

    .line 357
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 361
    .end local v1    # "e":Ljava/io/IOException;
    :cond_0
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    .line 362
    .local v2, "gson":Lcom/google/gson/Gson;
    const-class v7, [Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2, v4, v7}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 363
    .local v5, "mPois":[Lcom/aetn/history/android/historyhere/model/POIDetail;
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 364
    .local v6, "poiList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$300()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiDbManager;

    move-result-object v7

    invoke-virtual {v7, v6, v9}, Lcom/aetn/history/android/historyhere/model/PoiDbManager;->addPois(Ljava/util/ArrayList;Z)Z

    .line 365
    const/4 v7, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 347
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 2
    .param p1, "success"    # Ljava/lang/Boolean;

    .prologue
    .line 376
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # invokes: Lcom/aetn/history/android/historyhere/model/PoiManager;->notifyInitialDataListener()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$600(Lcom/aetn/history/android/historyhere/model/PoiManager;)V

    .line 381
    :goto_0
    return-void

    .line 379
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->this$0:Lcom/aetn/history/android/historyhere/model/PoiManager;

    # getter for: Lcom/aetn/history/android/historyhere/model/PoiManager;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PoiManager;->access$200(Lcom/aetn/history/android/historyhere/model/PoiManager;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getFullPoiList(): FAILED"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 347
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 370
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 372
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 347
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/model/PoiManager$LoadAllPoisFromAssetsTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
