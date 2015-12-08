.class Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;
.super Landroid/os/AsyncTask;
.source "SuggestActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/view/SuggestActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AddressLookupTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ljava/util/List",
        "<",
        "Landroid/location/Address;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 317
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 317
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->doInBackground([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .param p1, "searchString"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Landroid/location/Address;",
            ">;"
        }
    .end annotation

    .prologue
    .line 320
    const/4 v0, 0x0

    .line 322
    .local v0, "addressFromSearch":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    const/4 v3, 0x0

    .line 323
    .local v3, "requestNumber":I
    :try_start_0
    new-instance v2, Landroid/location/Geocoder;

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mContext:Landroid/content/Context;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$000(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    .line 324
    .local v2, "geocoder":Landroid/location/Geocoder;
    const-string v4, "SuggestActivity"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "the geocoder: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const/4 v4, 0x0

    aget-object v4, p1, v4

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    .line 326
    const-string v4, "SuggestActivity"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AddressLookupTask: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    :cond_0
    if-nez v0, :cond_1

    .line 328
    const/4 v4, 0x0

    aget-object v4, p1, v4

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    .line 329
    add-int/lit8 v3, v3, 0x1

    .line 331
    const/16 v4, 0xa

    if-ne v3, v4, :cond_0

    .line 333
    :cond_1
    const-string v4, "SuggestActivity"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AddressLookupTask -- the address is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x0

    aget-object v6, p1, v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const-string v4, "SuggestActivity"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AddressLookupTask -- request #: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 343
    .end local v2    # "geocoder":Landroid/location/Geocoder;
    :goto_0
    return-object v0

    .line 335
    :catch_0
    move-exception v1

    .line 336
    .local v1, "e":Ljava/io/IOException;
    const-string v4, "SuggestActivity"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AddressLookupTask: IOException: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 338
    const/4 v0, 0x0

    .line 342
    goto :goto_0

    .line 339
    .end local v1    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v1

    .line 340
    .local v1, "e":Ljava/lang/Exception;
    const-string v4, "SuggestActivity"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AddressLookupTask: Exception: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 317
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->onPostExecute(Ljava/util/List;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/location/Address;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "addressFromSearch":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    const-wide/16 v8, 0x0

    .line 356
    const-string v5, "SuggestActivity"

    const-string v6, "AddressLookupTask:onPostExecute()"

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ge v5, v6, :cond_1

    .line 358
    :cond_0
    const-string v5, "SuggestActivity"

    const-string v6, "AddressLookupTask:onPostExecute: geocoderError: so set the location to 0.0|0.0 "

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v5

    iput-wide v8, v5, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lat:D

    .line 360
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v5

    iput-wide v8, v5, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lng:D

    .line 387
    :goto_0
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # invokes: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->doPostSuggestion()V
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$1600(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    .line 388
    return-void

    .line 363
    :cond_1
    const/4 v5, 0x0

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Address;

    .line 364
    .local v1, "firstAddress":Landroid/location/Address;
    const-string v5, "SuggestActivity"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AddressLookupTask:onPostExecute: firstAddress: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    invoke-virtual {v1}, Landroid/location/Address;->getLatitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    .line 367
    .local v2, "lat":Ljava/lang/Double;
    invoke-virtual {v1}, Landroid/location/Address;->getLongitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    .line 368
    .local v3, "lng":Ljava/lang/Double;
    const/4 v4, 0x0

    .line 369
    .local v4, "searchError":Z
    invoke-virtual {v1}, Landroid/location/Address;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    .line 370
    .local v0, "country":Ljava/lang/String;
    if-nez v0, :cond_3

    .line 371
    const/4 v4, 0x1

    .line 375
    :cond_2
    :goto_1
    if-eqz v4, :cond_4

    .line 376
    const-string v5, "SuggestActivity"

    const-string v6, "AddressLookupTask:onPostExecute: searchError: so set the location to 0.0|0.0 "

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v5

    iput-wide v8, v5, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lat:D

    .line 378
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v5

    iput-wide v8, v5, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lng:D

    goto :goto_0

    .line 372
    :cond_3
    const-string v5, "US"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 373
    const/4 v4, 0x1

    goto :goto_1

    .line 380
    :cond_4
    const-string v5, "SuggestActivity"

    const-string v6, "AddressLookupTask:onPostExecute: success: "

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    iput-wide v6, v5, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lat:D

    .line 382
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v5}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    iput-wide v6, v5, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lng:D

    .line 383
    const-string v5, "SuggestActivity"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AddressLookupTask:onPostExecute: lat: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    const-string v5, "SuggestActivity"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AddressLookupTask:onPostExecute: lng:: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Integer;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Integer;

    .prologue
    .line 348
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    .line 350
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 317
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->onProgressUpdate([Ljava/lang/Integer;)V

    return-void
.end method
