.class public Lcom/thetransitapp/droid/service/GeocoderTask;
.super Landroid/os/AsyncTask;
.source "GeocoderTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/bricolsoftconsulting/geocoderplus/Address;",
        ">;"
    }
.end annotation


# static fields
.field private static final API_KEY_1:Ljava/lang/String; = "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE"

.field private static final API_KEY_2:Ljava/lang/String; = "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY"

.field private static final LOG_TAG:Ljava/lang/String;

.field private static final OUT_JSON:Ljava/lang/String; = "/json"

.field private static final PLACES_API_BASE:Ljava/lang/String; = "https://maps.googleapis.com/maps/api/place"

.field private static final TYPE_DETAILS:Ljava/lang/String; = "/details"


# instance fields
.field private final callback:Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;

.field private dialog:Landroid/app/ProgressDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/thetransitapp/droid/service/GeocoderTask;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/thetransitapp/droid/service/GeocoderTask;->LOG_TAG:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "callback"    # Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->dialog:Landroid/app/ProgressDialog;

    .line 41
    iput-object p2, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->callback:Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;

    .line 43
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->dialog:Landroid/app/ProgressDialog;

    .line 44
    iget-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->dialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 45
    iget-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->dialog:Landroid/app/ProgressDialog;

    const v1, 0x7f0a0058

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 46
    return-void
.end method

.method private getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "componentArray"    # Lorg/json/JSONArray;
    .param p2, "componentType"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 230
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v2, v4, :cond_0

    .line 242
    :goto_1
    return-object v3

    .line 232
    :cond_0
    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 234
    .local v0, "component":Lorg/json/JSONObject;
    const-string v4, "types"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-direct {p0, p2, v4}, Lcom/thetransitapp/droid/service/GeocoderTask;->isTypeInTypeArray(Ljava/lang/String;Lorg/json/JSONArray;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 235
    const-string v4, "long_name"

    const/4 v5, 0x0

    invoke-static {v0, v4, v5}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_1

    .line 237
    .end local v0    # "component":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 238
    .local v1, "e":Lorg/json/JSONException;
    const-string v4, "Geocoder"

    const-string v5, "ParceExpcetion"

    invoke-static {v4, v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 230
    .end local v1    # "e":Lorg/json/JSONException;
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private getAddressFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Address;
    .locals 1
    .param p1, "address"    # Lorg/json/JSONObject;

    .prologue
    .line 130
    new-instance v0, Lcom/bricolsoftconsulting/geocoderplus/Address;

    invoke-direct {v0}, Lcom/bricolsoftconsulting/geocoderplus/Address;-><init>()V

    .line 131
    .local v0, "result":Lcom/bricolsoftconsulting/geocoderplus/Address;
    invoke-direct {p0, v0, p1}, Lcom/thetransitapp/droid/service/GeocoderTask;->populateAddressComponentsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 132
    invoke-direct {p0, v0, p1}, Lcom/thetransitapp/droid/service/GeocoderTask;->populateAddressGeometryFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 134
    return-object v0
.end method

.method private getAreaFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Area;
    .locals 5
    .param p1, "json"    # Lorg/json/JSONObject;

    .prologue
    .line 206
    :try_start_0
    const-string v3, "northeast"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/service/GeocoderTask;->getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v1

    .line 207
    .local v1, "northEast":Lcom/bricolsoftconsulting/geocoderplus/Position;
    const-string v3, "southwest"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/service/GeocoderTask;->getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v2

    .line 209
    .local v2, "southWest":Lcom/bricolsoftconsulting/geocoderplus/Position;
    new-instance v3, Lcom/bricolsoftconsulting/geocoderplus/Area;

    invoke-direct {v3, v1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Area;-><init>(Lcom/bricolsoftconsulting/geocoderplus/Position;Lcom/bricolsoftconsulting/geocoderplus/Position;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 214
    .end local v1    # "northEast":Lcom/bricolsoftconsulting/geocoderplus/Position;
    .end local v2    # "southWest":Lcom/bricolsoftconsulting/geocoderplus/Position;
    :goto_0
    return-object v3

    .line 210
    :catch_0
    move-exception v0

    .line 211
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "Geocoder"

    const-string v4, "ParceExpcetion"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 214
    const/4 v3, 0x0

    goto :goto_0
.end method

.method private getPlaceDetail(Ljava/lang/String;)Lcom/bricolsoftconsulting/geocoderplus/Address;
    .locals 11
    .param p1, "reference"    # Ljava/lang/String;

    .prologue
    .line 82
    const/4 v1, 0x0

    .line 85
    .local v1, "conn":Ljava/net/HttpURLConnection;
    :try_start_0
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "https://maps.googleapis.com/maps/api/place/details/json"

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .local v7, "sb":Ljava/lang/StringBuilder;
    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    .line 88
    .local v5, "r":Ljava/util/Random;
    invoke-virtual {v5}, Ljava/util/Random;->nextBoolean()Z

    move-result v9

    if-eqz v9, :cond_1

    const-string v4, "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE"

    .line 90
    .local v4, "key":Ljava/lang/String;
    :goto_0
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "?sensor=false&key="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    const-string v9, "&reference="

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    const-string v9, "Place URL"

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    new-instance v8, Ljava/net/URL;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 97
    .local v8, "url":Ljava/net/URL;
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v9

    move-object v0, v9

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v1, v0

    .line 98
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v9

    invoke-static {v9}, Lcom/thetransitapp/droid/util/ServiceUtility;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v6

    .line 100
    .local v6, "response":Ljava/lang/String;
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v10, "result"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 102
    .local v3, "jsonObj":Lorg/json/JSONObject;
    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Address;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v9

    .line 106
    if-eqz v1, :cond_0

    .line 107
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 111
    .end local v3    # "jsonObj":Lorg/json/JSONObject;
    .end local v4    # "key":Ljava/lang/String;
    .end local v5    # "r":Ljava/util/Random;
    .end local v6    # "response":Ljava/lang/String;
    .end local v7    # "sb":Ljava/lang/StringBuilder;
    .end local v8    # "url":Ljava/net/URL;
    :cond_0
    :goto_1
    return-object v9

    .line 88
    .restart local v5    # "r":Ljava/util/Random;
    .restart local v7    # "sb":Ljava/lang/StringBuilder;
    :cond_1
    :try_start_1
    const-string v4, "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 103
    .end local v5    # "r":Ljava/util/Random;
    .end local v7    # "sb":Ljava/lang/StringBuilder;
    :catch_0
    move-exception v2

    .line 104
    .local v2, "e":Ljava/lang/Exception;
    :try_start_2
    sget-object v9, Lcom/thetransitapp/droid/service/GeocoderTask;->LOG_TAG:Ljava/lang/String;

    const-string v10, "Error with Places API"

    invoke-static {v9, v10, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    if-eqz v1, :cond_2

    .line 107
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 111
    :cond_2
    const/4 v9, 0x0

    goto :goto_1

    .line 105
    .end local v2    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v9

    .line 106
    if-eqz v1, :cond_3

    .line 107
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 109
    :cond_3
    throw v9
.end method

.method private getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;
    .locals 6
    .param p1, "json"    # Lorg/json/JSONObject;

    .prologue
    .line 219
    :try_start_0
    new-instance v1, Lcom/bricolsoftconsulting/geocoderplus/Position;

    const-string v2, "lat"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-string v4, "lng"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/bricolsoftconsulting/geocoderplus/Position;-><init>(DD)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    :goto_0
    return-object v1

    .line 220
    :catch_0
    move-exception v0

    .line 221
    .local v0, "e":Lorg/json/JSONException;
    const-string v1, "Geocoder"

    const-string v2, "ParceExpcetion"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 224
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private isTypeInTypeArray(Ljava/lang/String;Lorg/json/JSONArray;)Z
    .locals 5
    .param p1, "type"    # Ljava/lang/String;
    .param p2, "typeArray"    # Lorg/json/JSONArray;

    .prologue
    const/4 v2, 0x0

    .line 246
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 259
    :cond_0
    :goto_0
    return v2

    .line 249
    :cond_1
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 251
    :try_start_0
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eqz v3, :cond_2

    .line 252
    const/4 v2, 0x1

    goto :goto_0

    .line 254
    :catch_0
    move-exception v0

    .line 255
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "Geocoder"

    const-string v4, "ParceExpcetion"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 249
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method private populateAddressBoundsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "geometry"    # Lorg/json/JSONObject;

    .prologue
    .line 197
    :try_start_0
    const-string v1, "bounds"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAreaFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Area;

    move-result-object v0

    .line 198
    .local v0, "bounds":Lcom/bricolsoftconsulting/geocoderplus/Area;
    invoke-virtual {p1, v0}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setBounds(Lcom/bricolsoftconsulting/geocoderplus/Area;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    .end local v0    # "bounds":Lcom/bricolsoftconsulting/geocoderplus/Area;
    :goto_0
    return-void

    .line 199
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private populateAddressComponentsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "address"    # Lorg/json/JSONObject;

    .prologue
    .line 139
    :try_start_0
    const-string v2, "formatted_address"

    const/4 v3, 0x0

    invoke-static {p2, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setFormattedAddress(Ljava/lang/String;)V

    .line 141
    const-string v2, "address_components"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 142
    .local v0, "addressComponents":Lorg/json/JSONArray;
    const-string v2, "street_number"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setStreetNumber(Ljava/lang/String;)V

    .line 143
    const-string v2, "premise"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setPremise(Ljava/lang/String;)V

    .line 144
    const-string v2, "subpremise"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubPremise(Ljava/lang/String;)V

    .line 145
    const-string v2, "floor"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setFloor(Ljava/lang/String;)V

    .line 146
    const-string v2, "room"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setRoom(Ljava/lang/String;)V

    .line 147
    const-string v2, "route"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setRoute(Ljava/lang/String;)V

    .line 148
    const-string v2, "neighborhood"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setNeighborhood(Ljava/lang/String;)V

    .line 149
    const-string v2, "locality"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLocality(Ljava/lang/String;)V

    .line 150
    const-string v2, "sublocality"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubLocality(Ljava/lang/String;)V

    .line 151
    const-string v2, "postal_code"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setPostalCode(Ljava/lang/String;)V

    .line 152
    const-string v2, "administrative_area_level_1"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setAdminArea(Ljava/lang/String;)V

    .line 153
    const-string v2, "administrative_area_level_2"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubAdminArea(Ljava/lang/String;)V

    .line 154
    const-string v2, "administrative_area_level_3"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubAdminArea2(Ljava/lang/String;)V

    .line 155
    const-string v2, "country"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setCountryCode(Ljava/lang/String;)V

    .line 156
    const-string v2, "country"

    invoke-direct {p0, v0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setCountryName(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .end local v0    # "addressComponents":Lorg/json/JSONArray;
    :goto_0
    return-void

    .line 157
    :catch_0
    move-exception v1

    .line 158
    .local v1, "e":Lorg/json/JSONException;
    const-string v2, "Geocoder"

    const-string v3, "ParceExpcetion"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private populateAddressGeometryFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "address"    # Lorg/json/JSONObject;

    .prologue
    .line 164
    :try_start_0
    const-string v2, "geometry"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 165
    .local v1, "geometry":Lorg/json/JSONObject;
    invoke-direct {p0, p1, v1}, Lcom/thetransitapp/droid/service/GeocoderTask;->populateAddressLocationFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 166
    invoke-direct {p0, p1, v1}, Lcom/thetransitapp/droid/service/GeocoderTask;->populateAddressViewPortFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 167
    invoke-direct {p0, p1, v1}, Lcom/thetransitapp/droid/service/GeocoderTask;->populateAddressBoundsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .end local v1    # "geometry":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 168
    :catch_0
    move-exception v0

    .line 169
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "Geocoder"

    const-string v3, "ParceExpcetion"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private populateAddressLocationFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "geometry"    # Lorg/json/JSONObject;

    .prologue
    .line 175
    :try_start_0
    const-string v2, "location"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/thetransitapp/droid/service/GeocoderTask;->getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v1

    .line 177
    .local v1, "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    if-eqz v1, :cond_0

    .line 178
    invoke-virtual {v1}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLatitude(D)V

    .line 179
    invoke-virtual {v1}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLongitude()D

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLongitude(D)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    .end local v1    # "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    :cond_0
    :goto_0
    return-void

    .line 181
    :catch_0
    move-exception v0

    .line 182
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "Geocoder"

    const-string v3, "ParceExpcetion"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private populateAddressViewPortFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "geometry"    # Lorg/json/JSONObject;

    .prologue
    .line 188
    :try_start_0
    const-string v1, "viewport"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/service/GeocoderTask;->getAreaFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Area;

    move-result-object v0

    .line 189
    .local v0, "viewPort":Lcom/bricolsoftconsulting/geocoderplus/Area;
    invoke-virtual {p1, v0}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setViewPort(Lcom/bricolsoftconsulting/geocoderplus/Area;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    .end local v0    # "viewPort":Lcom/bricolsoftconsulting/geocoderplus/Area;
    :goto_0
    return-void

    .line 190
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Lcom/bricolsoftconsulting/geocoderplus/Address;
    .locals 6
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 58
    const/4 v2, 0x0

    .line 60
    .local v2, "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    const/4 v4, 0x0

    :try_start_0
    aget-object v4, p1, v4

    const-string v5, "my_loc"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 61
    const/4 v4, 0x0

    aget-object v4, p1, v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 63
    .local v1, "parts":[Ljava/lang/String;
    new-instance v3, Lcom/bricolsoftconsulting/geocoderplus/Address;

    invoke-direct {v3}, Lcom/bricolsoftconsulting/geocoderplus/Address;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .end local v2    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    .local v3, "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    const/4 v4, 0x1

    :try_start_1
    aget-object v4, v1, v4

    invoke-virtual {v3, v4}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setFormattedAddress(Ljava/lang/String;)V

    .line 65
    const/4 v4, 0x2

    aget-object v4, v1, v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLatitude(D)V

    .line 66
    const/4 v4, 0x3

    aget-object v4, v1, v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLongitude(D)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v2, v3

    .line 71
    .end local v1    # "parts":[Ljava/lang/String;
    .end local v3    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    .restart local v2    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    :goto_0
    if-eqz v2, :cond_1

    .line 78
    .end local v2    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    :goto_1
    return-object v2

    .line 68
    .restart local v2    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    :cond_0
    const/4 v4, 0x0

    :try_start_2
    aget-object v4, p1, v4

    invoke-direct {p0, v4}, Lcom/thetransitapp/droid/service/GeocoderTask;->getPlaceDetail(Ljava/lang/String;)Lcom/bricolsoftconsulting/geocoderplus/Address;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v2

    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    .local v0, "e":Ljava/lang/Exception;
    :goto_2
    const-string v4, "Geocoder"

    const-string v5, "Error with places API"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 74
    .end local v2    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    .restart local v1    # "parts":[Ljava/lang/String;
    .restart local v3    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    :catch_1
    move-exception v0

    move-object v2, v3

    .end local v3    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    .restart local v2    # "placemark":Lcom/bricolsoftconsulting/geocoderplus/Address;
    goto :goto_2
.end method

.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/GeocoderTask;->doInBackground([Ljava/lang/String;)Lcom/bricolsoftconsulting/geocoderplus/Address;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Lcom/bricolsoftconsulting/geocoderplus/Address;)V
    .locals 1
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;

    .prologue
    .line 116
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    :try_start_0
    iget-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->callback:Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;

    invoke-interface {v0, p1}, Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;->onAddressReceived(Lcom/bricolsoftconsulting/geocoderplus/Address;)V

    .line 127
    return-void

    .line 121
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/bricolsoftconsulting/geocoderplus/Address;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/GeocoderTask;->onPostExecute(Lcom/bricolsoftconsulting/geocoderplus/Address;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 52
    iget-object v0, p0, Lcom/thetransitapp/droid/service/GeocoderTask;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 53
    return-void
.end method
