.class public Lcom/thetransitapp/droid/service/ReverseGeocoderTask;
.super Landroid/os/AsyncTask;
.source "ReverseGeocoderTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private callback:Lcom/thetransitapp/droid/service/ServiceCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 19
    .local p2, "callback":Lcom/thetransitapp/droid/service/ServiceCallback;, "Lcom/thetransitapp/droid/service/ServiceCallback<Ljava/lang/String;>;"
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->context:Landroid/content/Context;

    .line 21
    iput-object p2, p0, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    .line 22
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->doInBackground([Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;
    .locals 12
    .param p1, "params"    # [Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    const/4 v11, 0x0

    .line 26
    const/4 v10, 0x0

    .line 28
    .local v10, "locationString":Ljava/lang/String;
    array-length v1, p1

    if-lez v1, :cond_1

    .line 29
    invoke-static {}, Landroid/location/Geocoder;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    new-instance v0, Landroid/location/Geocoder;

    iget-object v1, p0, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->context:Landroid/content/Context;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    .line 32
    .local v0, "coder":Landroid/location/Geocoder;
    const/4 v1, 0x0

    :try_start_0
    aget-object v1, p1, v1

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    const/4 v3, 0x0

    aget-object v3, p1, v3

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v7

    .line 34
    .local v7, "addresses":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 35
    const/4 v1, 0x0

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/location/Address;

    .line 37
    .local v6, "address":Landroid/location/Address;
    invoke-virtual {v6}, Landroid/location/Address;->getMaxAddressLineIndex()I

    move-result v1

    if-lez v1, :cond_0

    .line 38
    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Landroid/location/Address;->getAddressLine(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 46
    .end local v0    # "coder":Landroid/location/Geocoder;
    .end local v6    # "address":Landroid/location/Address;
    .end local v7    # "addresses":Ljava/util/List;, "Ljava/util/List<Landroid/location/Address;>;"
    :cond_0
    :goto_0
    if-nez v10, :cond_1

    .line 47
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v9

    .line 48
    .local v9, "formater":Ljava/text/NumberFormat;
    const/4 v1, 0x4

    invoke-virtual {v9, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 50
    aget-object v1, p1, v11

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v9, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v10

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v2, p1, v11

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v9, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 56
    .end local v9    # "formater":Ljava/text/NumberFormat;
    :cond_1
    return-object v10

    .line 41
    .restart local v0    # "coder":Landroid/location/Geocoder;
    :catch_0
    move-exception v8

    .line 42
    .local v8, "e":Ljava/io/IOException;
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 61
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    invoke-interface {v0, p1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 64
    return-void
.end method
