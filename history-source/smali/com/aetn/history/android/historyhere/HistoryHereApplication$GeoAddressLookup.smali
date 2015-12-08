.class Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;
.super Landroid/os/AsyncTask;
.source "HistoryHereApplication.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/HistoryHereApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "GeoAddressLookup"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/HistoryHereApplication;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .prologue
    .line 328
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 328
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->doInBackground([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 7
    .param p1, "searchString"    # [Ljava/lang/String;

    .prologue
    .line 331
    const/4 v2, 0x0

    .line 333
    .local v2, "geoLocObj":Lorg/json/JSONObject;
    :try_start_0
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v4

    const-string v5, "DoGeoAddressLookup:doInBackground()"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const/4 v4, 0x0

    aget-object v4, p1, v4

    const/16 v5, 0x20

    const/16 v6, 0x2b

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 335
    .local v1, "formattedSearchString":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "http://maps.google.com/maps/api/geocode/json?address="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "&sensor=true"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 336
    .local v3, "geoLookupString":Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/utils/Json;->getJSONfromURL(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 337
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Geoloc returned:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 343
    .end local v1    # "formattedSearchString":Ljava/lang/String;
    .end local v3    # "geoLookupString":Ljava/lang/String;
    :goto_0
    return-object v2

    .line 338
    :catch_0
    move-exception v0

    .line 339
    .local v0, "e":Ljava/lang/Exception;
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Geoloc returned error"

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    const/4 v2, 0x0

    .line 341
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 328
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->onPostExecute(Lorg/json/JSONObject;)V

    return-void
.end method

.method protected onPostExecute(Lorg/json/JSONObject;)V
    .locals 12
    .param p1, "result"    # Lorg/json/JSONObject;

    .prologue
    .line 355
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v7

    const-string v8, "DoGeoAddressLookup:onPostExecute()"

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    if-eqz p1, :cond_2

    .line 362
    :try_start_0
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/utils/Utils;->getFormattedAddressFromGeolocationData(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    .line 363
    .local v1, "formattedAddress":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 364
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v7, v1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setCurrentSearchFormattedAddress(Ljava/lang/String;)V

    .line 366
    :cond_0
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/utils/Utils;->getLocationFromGeolocationData(Lorg/json/JSONObject;)Ljava/util/HashMap;

    move-result-object v4

    .line 368
    .local v4, "loc":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz v4, :cond_1

    .line 369
    const-string v7, "latitude"

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    .line 370
    .local v2, "latitude":D
    const-string v7, "longitude"

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    .line 371
    .local v5, "longitude":D
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v7, v2, v3, v5, v6}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->setCurrentSearchLocation(DD)V

    .line 372
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->hideMessageBox()V

    .line 374
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getCurrentSearchLatitude()D

    move-result-wide v8

    iget-object v10, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v10}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getCurrentSearchLongitude()D

    move-result-wide v10

    invoke-virtual {v7, v8, v9, v10, v11}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->doPoiSearch(DD)V

    .line 389
    .end local v1    # "formattedAddress":Ljava/lang/String;
    .end local v2    # "latitude":D
    .end local v4    # "loc":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v5    # "longitude":D
    :goto_0
    return-void

    .line 376
    .restart local v1    # "formattedAddress":Ljava/lang/String;
    .restart local v4    # "loc":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_1
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v7

    const-string v8, "There was no result from the lookup"

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->hideMessageBox()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 380
    .end local v1    # "formattedAddress":Ljava/lang/String;
    .end local v4    # "loc":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_0
    move-exception v0

    .line 381
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 384
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_2
    # getter for: Lcom/aetn/history/android/historyhere/HistoryHereApplication;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->access$100()Ljava/lang/String;

    move-result-object v7

    const-string v8, "DoGeoAddressLookup:onPostExecute()-- result is NULL so show error"

    invoke-static {v7, v8}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->hideMessageBox()V

    .line 386
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->this$0:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0d0040

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    invoke-virtual {v7, v8, v9}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->showToast(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 348
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 349
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 328
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/HistoryHereApplication$GeoAddressLookup;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
