.class public Lcom/bricolsoftconsulting/geocoderplus/Geocoder;
.super Ljava/lang/Object;
.source "Geocoder.java"


# static fields
.field public static final HTTP_ERROR:Ljava/lang/String; = "Failed to retrieve JSON data over HTTP!"

.field public static final INVALID_REQUEST_ERROR:Ljava/lang/String; = "The HTTP request was invalid!"

.field public static final JSON_PARSE_ERROR:Ljava/lang/String; = "Failed to parse JSON data!"

.field public static final PARAMETER_ERROR:Ljava/lang/String; = "Location name cannot be null!"

.field public static final PARAM_ADDRESS:Ljava/lang/String; = "address"

.field public static final PARAM_BOUNDS:Ljava/lang/String; = "bounds"

.field public static final PARAM_LANGUAGE:Ljava/lang/String; = "language"

.field public static final PARAM_REGION:Ljava/lang/String; = "region"

.field public static final PARAM_SENSOR:Ljava/lang/String; = "sensor"

.field public static final QUERY_LIMIT_ERROR:Ljava/lang/String; = "You exceeded the number of queries that the Google Maps API allows in a 24 hour period!"

.field public static final REQUEST_DENIED_ERROR:Ljava/lang/String; = "The HTTP request was denied!"

.field public static final URL_MAPS_GEOCODE:Ljava/lang/String; = "http://maps.googleapis.com/maps/api/geocode/json"


# instance fields
.field mLocale:Ljava/util/Locale;

.field mNortheastLatitude:D

.field mNortheastLongitude:D

.field mSouthWestLatitude:D

.field mSouthWestLongitude:D

.field mUseBounds:Z

.field mUseRegionBias:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-boolean v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseRegionBias:Z

    .line 57
    iput-boolean v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseBounds:Z

    .line 61
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iput-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mLocale:Ljava/util/Locale;

    .line 62
    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 1
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    const/4 v0, 0x0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-boolean v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseRegionBias:Z

    .line 57
    iput-boolean v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseBounds:Z

    .line 65
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mLocale:Ljava/util/Locale;

    .line 66
    return-void
.end method

.method private getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6
    .param p1, "componentArray"    # Lorg/json/JSONArray;
    .param p2, "componentType"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 485
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 491
    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 494
    .local v0, "component":Lorg/json/JSONObject;
    const-string v4, "types"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 497
    .local v1, "componentTypes":Lorg/json/JSONArray;
    invoke-direct {p0, p2, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->isTypeInTypeArray(Ljava/lang/String;Lorg/json/JSONArray;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    if-eqz v4, :cond_0

    .line 507
    .end local v0    # "component":Lorg/json/JSONObject;
    .end local v1    # "componentTypes":Lorg/json/JSONArray;
    :goto_1
    return-object v0

    .line 500
    :catch_0
    move-exception v2

    .line 502
    .local v2, "e":Lorg/json/JSONException;
    new-instance v4, Ljava/io/IOException;

    const-string v5, "Failed to parse JSON data!"

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 485
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v0    # "component":Lorg/json/JSONObject;
    .restart local v1    # "componentTypes":Lorg/json/JSONArray;
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 507
    .end local v0    # "component":Lorg/json/JSONObject;
    .end local v1    # "componentTypes":Lorg/json/JSONArray;
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private getAddressFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Address;
    .locals 1
    .param p1, "address"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 248
    new-instance v0, Lcom/bricolsoftconsulting/geocoderplus/Address;

    invoke-direct {v0}, Lcom/bricolsoftconsulting/geocoderplus/Address;-><init>()V

    .line 251
    .local v0, "result":Lcom/bricolsoftconsulting/geocoderplus/Address;
    invoke-direct {p0, v0, p1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->populateAddressComponentsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 254
    invoke-direct {p0, v0, p1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->populateAddressGeometryFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 257
    return-object v0
.end method

.method private getAddressesFromJSON(Ljava/lang/String;I)Ljava/util/List;
    .locals 12
    .param p1, "jsonString"    # Ljava/lang/String;
    .param p2, "maxResults"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List",
            "<",
            "Lcom/bricolsoftconsulting/geocoderplus/Address;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 170
    const/4 v8, 0x0

    .line 173
    .local v8, "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v10

    if-lez v10, :cond_2

    .line 177
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 180
    .local v4, "json":Lorg/json/JSONObject;
    invoke-direct {p0, v4}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->isRequestSuccessful(Lorg/json/JSONObject;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 182
    const-string v10, "results"

    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 185
    .local v1, "addresses":Lorg/json/JSONArray;
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    .line 186
    .local v6, "numAddresses":I
    const/4 v10, -0x1

    if-eq p2, v10, :cond_0

    if-ge p2, v6, :cond_0

    .line 187
    move v6, p2

    .line 190
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    .line 193
    .local v5, "locale":Ljava/util/Locale;
    if-lez v6, :cond_2

    .line 195
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    .end local v8    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    .local v9, "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v6, :cond_1

    .line 200
    :try_start_1
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 203
    .local v0, "address":Lorg/json/JSONObject;
    new-instance v7, Lcom/bricolsoftconsulting/geocoderplus/Address;

    invoke-direct {v7, v5}, Lcom/bricolsoftconsulting/geocoderplus/Address;-><init>(Ljava/util/Locale;)V

    .line 204
    .local v7, "result":Lcom/bricolsoftconsulting/geocoderplus/Address;
    invoke-direct {p0, v0}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Address;

    move-result-object v7

    .line 207
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 198
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 211
    .end local v0    # "address":Lorg/json/JSONObject;
    .end local v1    # "addresses":Lorg/json/JSONArray;
    .end local v3    # "i":I
    .end local v4    # "json":Lorg/json/JSONObject;
    .end local v5    # "locale":Ljava/util/Locale;
    .end local v6    # "numAddresses":I
    .end local v7    # "result":Lcom/bricolsoftconsulting/geocoderplus/Address;
    .end local v9    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    .restart local v8    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    :catch_0
    move-exception v2

    .line 213
    .local v2, "e":Lorg/json/JSONException;
    :goto_1
    new-instance v10, Ljava/io/IOException;

    const-string v11, "Failed to parse JSON data!"

    invoke-direct {v10, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v10

    .end local v2    # "e":Lorg/json/JSONException;
    .end local v8    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    .restart local v1    # "addresses":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    .restart local v4    # "json":Lorg/json/JSONObject;
    .restart local v5    # "locale":Ljava/util/Locale;
    .restart local v6    # "numAddresses":I
    .restart local v9    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    :cond_1
    move-object v8, v9

    .line 218
    .end local v1    # "addresses":Lorg/json/JSONArray;
    .end local v3    # "i":I
    .end local v4    # "json":Lorg/json/JSONObject;
    .end local v5    # "locale":Ljava/util/Locale;
    .end local v6    # "numAddresses":I
    .end local v9    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    .restart local v8    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    :cond_2
    return-object v8

    .line 211
    .end local v8    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    .restart local v1    # "addresses":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    .restart local v4    # "json":Lorg/json/JSONObject;
    .restart local v5    # "locale":Ljava/util/Locale;
    .restart local v6    # "numAddresses":I
    .restart local v9    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    :catch_1
    move-exception v2

    move-object v8, v9

    .end local v9    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    .restart local v8    # "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    goto :goto_1
.end method

.method private getAreaFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Area;
    .locals 8
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 424
    const/4 v0, 0x0

    .line 429
    .local v0, "area":Lcom/bricolsoftconsulting/geocoderplus/Area;
    :try_start_0
    const-string v6, "northeast"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 430
    .local v2, "ne":Lorg/json/JSONObject;
    const-string v6, "southwest"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 433
    .local v5, "sw":Lorg/json/JSONObject;
    invoke-direct {p0, v2}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v3

    .line 434
    .local v3, "northEast":Lcom/bricolsoftconsulting/geocoderplus/Position;
    invoke-direct {p0, v5}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v4

    .line 437
    .local v4, "southWest":Lcom/bricolsoftconsulting/geocoderplus/Position;
    new-instance v0, Lcom/bricolsoftconsulting/geocoderplus/Area;

    .end local v0    # "area":Lcom/bricolsoftconsulting/geocoderplus/Area;
    invoke-direct {v0, v3, v4}, Lcom/bricolsoftconsulting/geocoderplus/Area;-><init>(Lcom/bricolsoftconsulting/geocoderplus/Position;Lcom/bricolsoftconsulting/geocoderplus/Position;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 444
    .restart local v0    # "area":Lcom/bricolsoftconsulting/geocoderplus/Area;
    return-object v0

    .line 438
    .end local v0    # "area":Lcom/bricolsoftconsulting/geocoderplus/Area;
    .end local v2    # "ne":Lorg/json/JSONObject;
    .end local v3    # "northEast":Lcom/bricolsoftconsulting/geocoderplus/Position;
    .end local v4    # "southWest":Lcom/bricolsoftconsulting/geocoderplus/Position;
    .end local v5    # "sw":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 440
    .local v1, "e":Lorg/json/JSONException;
    new-instance v6, Ljava/io/IOException;

    const-string v7, "Failed to parse JSON data!"

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6
.end method

.method private getGeocodingUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p1, "locationName"    # Ljava/lang/String;

    .prologue
    .line 138
    iget-object v6, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mLocale:Ljava/util/Locale;

    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    .line 141
    .local v2, "language":Ljava/lang/String;
    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    .line 142
    .local v3, "params":Ljava/util/Vector;, "Ljava/util/Vector<Lorg/apache/http/message/BasicNameValuePair;>;"
    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    const-string v7, "sensor"

    const-string v8, "true"

    invoke-direct {v6, v7, v8}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 143
    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    const-string v7, "address"

    invoke-direct {v6, v7, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 144
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_0

    .line 145
    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    const-string v7, "language"

    invoke-direct {v6, v7, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 147
    :cond_0
    iget-boolean v6, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseRegionBias:Z

    if-eqz v6, :cond_1

    .line 148
    iget-object v6, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mLocale:Ljava/util/Locale;

    invoke-virtual {v6}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 149
    .local v4, "region":Ljava/lang/String;
    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    const-string v7, "region"

    invoke-direct {v6, v7, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 152
    .end local v4    # "region":Ljava/lang/String;
    :cond_1
    iget-boolean v6, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseBounds:Z

    if-eqz v6, :cond_2

    .line 153
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v7, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mNortheastLatitude:D

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-wide v7, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mNortheastLongitude:D

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "|"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-wide v7, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mSouthWestLatitude:D

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-wide v7, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mSouthWestLongitude:D

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 155
    .local v0, "bounds":Ljava/lang/String;
    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    const-string v7, "bounds"

    invoke-direct {v6, v7, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 159
    .end local v0    # "bounds":Ljava/lang/String;
    :cond_2
    const-string v6, "UTF-8"

    invoke-static {v3, v6}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 160
    .local v1, "encodedParams":Ljava/lang/String;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "http://maps.googleapis.com/maps/api/geocode/json?"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 162
    .local v5, "url":Ljava/lang/String;
    const-string v6, "Geocoder"

    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    return-object v5
.end method

.method private getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "json"    # Lorg/json/JSONObject;
    .param p2, "field"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 472
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 479
    :cond_0
    :goto_0
    return-object v1

    .line 477
    :cond_1
    :try_start_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 478
    :catch_0
    move-exception v0

    .line 479
    .local v0, "e":Lorg/json/JSONException;
    goto :goto_0
.end method

.method private getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;
    .locals 8
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 449
    const-wide/16 v1, 0x0

    .line 450
    .local v1, "latitude":D
    const-wide/16 v3, 0x0

    .line 451
    .local v3, "longitude":D
    const/4 v5, 0x0

    .line 456
    .local v5, "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    :try_start_0
    const-string v6, "lat"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 457
    const-string v6, "lng"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    .line 460
    new-instance v5, Lcom/bricolsoftconsulting/geocoderplus/Position;

    .end local v5    # "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    invoke-direct {v5, v1, v2, v3, v4}, Lcom/bricolsoftconsulting/geocoderplus/Position;-><init>(DD)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 467
    .restart local v5    # "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    return-object v5

    .line 461
    .end local v5    # "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    :catch_0
    move-exception v0

    .line 463
    .local v0, "e":Lorg/json/JSONException;
    new-instance v6, Ljava/io/IOException;

    const-string v7, "Failed to parse JSON data!"

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6
.end method

.method private isRequestSuccessful(Lorg/json/JSONObject;)Z
    .locals 3
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 223
    const-string v2, "status"

    invoke-direct {p0, p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 225
    .local v0, "status":Ljava/lang/String;
    const-string v2, "OK"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 227
    const/4 v1, 0x1

    .line 243
    :cond_0
    return v1

    .line 228
    :cond_1
    const-string v2, "ZERO_RESULTS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 231
    const-string v2, "OVER_QUERY_LIMIT"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 233
    new-instance v1, Ljava/io/IOException;

    const-string v2, "You exceeded the number of queries that the Google Maps API allows in a 24 hour period!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 234
    :cond_2
    const-string v2, "REQUEST_DENIED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 236
    new-instance v1, Ljava/io/IOException;

    const-string v2, "The HTTP request was denied!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 237
    :cond_3
    const-string v2, "INVALID_REQUEST"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 239
    new-instance v1, Ljava/io/IOException;

    const-string v2, "The HTTP request was invalid!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private isTypeInTypeArray(Ljava/lang/String;Lorg/json/JSONArray;)Z
    .locals 4
    .param p1, "type"    # Ljava/lang/String;
    .param p2, "typeArray"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 512
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 528
    :cond_0
    :goto_0
    return v2

    .line 516
    :cond_1
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 518
    :try_start_0
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eqz v3, :cond_2

    .line 519
    const/4 v2, 0x1

    goto :goto_0

    .line 521
    :catch_0
    move-exception v0

    .line 523
    .local v0, "e":Lorg/json/JSONException;
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Failed to parse JSON data!"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 516
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method private populateAddressBoundsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 3
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "geometry"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 412
    :try_start_0
    const-string v2, "bounds"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 415
    .local v0, "addressBounds":Lorg/json/JSONObject;
    invoke-direct {p0, v0}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAreaFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Area;

    move-result-object v1

    .line 416
    .local v1, "bounds":Lcom/bricolsoftconsulting/geocoderplus/Area;
    invoke-virtual {p1, v1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setBounds(Lcom/bricolsoftconsulting/geocoderplus/Area;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 420
    .end local v0    # "addressBounds":Lorg/json/JSONObject;
    .end local v1    # "bounds":Lcom/bricolsoftconsulting/geocoderplus/Area;
    :goto_0
    return-void

    .line 417
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private populateAddressComponentsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 24
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "address"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 268
    :try_start_0
    const-string v22, "address_components"

    move-object/from16 v0, p2

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 271
    .local v4, "addressComponents":Lorg/json/JSONArray;
    const-string v22, "formatted_address"

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, v22

    invoke-direct {v0, v1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 272
    .local v10, "formattedAddress":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v10}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setFormattedAddress(Ljava/lang/String;)V

    .line 275
    const-string v22, "street_number"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 276
    .local v3, "addressComponent":Lorg/json/JSONObject;
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 277
    .local v17, "streetNumber":Ljava/lang/String;
    move-object/from16 v0, p1

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setStreetNumber(Ljava/lang/String;)V

    .line 280
    const-string v22, "premise"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 281
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 282
    .local v14, "premise":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v14}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setPremise(Ljava/lang/String;)V

    .line 285
    const-string v22, "subpremise"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 286
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 287
    .local v20, "subPremise":Ljava/lang/String;
    move-object/from16 v0, p1

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubPremise(Ljava/lang/String;)V

    .line 290
    const-string v22, "floor"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 291
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 292
    .local v9, "floor":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v9}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setFloor(Ljava/lang/String;)V

    .line 295
    const-string v22, "room"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 296
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 297
    .local v15, "room":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setRoom(Ljava/lang/String;)V

    .line 300
    const-string v22, "route"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 301
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 302
    .local v16, "route":Ljava/lang/String;
    move-object/from16 v0, p1

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setRoute(Ljava/lang/String;)V

    .line 305
    const-string v22, "neighborhood"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 306
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 307
    .local v12, "neighborhood":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setNeighborhood(Ljava/lang/String;)V

    .line 310
    const-string v22, "locality"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 311
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 312
    .local v11, "locality":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLocality(Ljava/lang/String;)V

    .line 315
    const-string v22, "sublocality"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 316
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 317
    .local v21, "sublocality":Ljava/lang/String;
    move-object/from16 v0, p1

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubLocality(Ljava/lang/String;)V

    .line 320
    const-string v22, "postal_code"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 321
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 322
    .local v13, "postalCode":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setPostalCode(Ljava/lang/String;)V

    .line 325
    const-string v22, "administrative_area_level_1"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 326
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 327
    .local v5, "adminArea":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setAdminArea(Ljava/lang/String;)V

    .line 330
    const-string v22, "administrative_area_level_2"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 331
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 332
    .local v18, "subAdminArea":Ljava/lang/String;
    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubAdminArea(Ljava/lang/String;)V

    .line 335
    const-string v22, "administrative_area_level_3"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 336
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 337
    .local v19, "subAdminArea2":Ljava/lang/String;
    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setSubAdminArea2(Ljava/lang/String;)V

    .line 340
    const-string v22, "country"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 341
    const-string v22, "short_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 342
    .local v6, "countryCode":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setCountryCode(Ljava/lang/String;)V

    .line 345
    const-string v22, "country"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v4, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressComponent(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 346
    const-string v22, "long_name"

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v3, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getJSONStringField(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 347
    .local v7, "countryName":Ljava/lang/String;
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setCountryName(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 353
    return-void

    .line 349
    .end local v3    # "addressComponent":Lorg/json/JSONObject;
    .end local v4    # "addressComponents":Lorg/json/JSONArray;
    .end local v5    # "adminArea":Ljava/lang/String;
    .end local v6    # "countryCode":Ljava/lang/String;
    .end local v7    # "countryName":Ljava/lang/String;
    .end local v9    # "floor":Ljava/lang/String;
    .end local v10    # "formattedAddress":Ljava/lang/String;
    .end local v11    # "locality":Ljava/lang/String;
    .end local v12    # "neighborhood":Ljava/lang/String;
    .end local v13    # "postalCode":Ljava/lang/String;
    .end local v14    # "premise":Ljava/lang/String;
    .end local v15    # "room":Ljava/lang/String;
    .end local v16    # "route":Ljava/lang/String;
    .end local v17    # "streetNumber":Ljava/lang/String;
    .end local v18    # "subAdminArea":Ljava/lang/String;
    .end local v19    # "subAdminArea2":Ljava/lang/String;
    .end local v20    # "subPremise":Ljava/lang/String;
    .end local v21    # "sublocality":Ljava/lang/String;
    :catch_0
    move-exception v8

    .line 351
    .local v8, "e":Lorg/json/JSONException;
    new-instance v22, Ljava/io/IOException;

    const-string v23, "Failed to parse JSON data!"

    invoke-direct/range {v22 .. v23}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v22
.end method

.method private populateAddressGeometryFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "address"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 359
    :try_start_0
    const-string v2, "geometry"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 362
    .local v1, "geometry":Lorg/json/JSONObject;
    invoke-direct {p0, p1, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->populateAddressLocationFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 365
    invoke-direct {p0, p1, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->populateAddressViewPortFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V

    .line 368
    invoke-direct {p0, p1, v1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->populateAddressBoundsFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    return-void

    .line 369
    .end local v1    # "geometry":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 371
    .local v0, "e":Lorg/json/JSONException;
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Failed to parse JSON data!"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private populateAddressLocationFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 5
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "geometry"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 378
    :try_start_0
    const-string v3, "location"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 381
    .local v0, "addressLocation":Lorg/json/JSONObject;
    invoke-direct {p0, v0}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getPositionFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v2

    .line 382
    .local v2, "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    if-eqz v2, :cond_0

    .line 383
    invoke-virtual {v2}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLatitude(D)V

    .line 384
    invoke-virtual {v2}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLongitude()D

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setLongitude(D)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 391
    :cond_0
    return-void

    .line 387
    .end local v0    # "addressLocation":Lorg/json/JSONObject;
    .end local v2    # "position":Lcom/bricolsoftconsulting/geocoderplus/Position;
    :catch_0
    move-exception v1

    .line 389
    .local v1, "e":Lorg/json/JSONException;
    new-instance v3, Ljava/io/IOException;

    const-string v4, "Failed to parse JSON data!"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method private populateAddressViewPortFromJSON(Lcom/bricolsoftconsulting/geocoderplus/Address;Lorg/json/JSONObject;)V
    .locals 5
    .param p1, "result"    # Lcom/bricolsoftconsulting/geocoderplus/Address;
    .param p2, "geometry"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 397
    :try_start_0
    const-string v3, "viewport"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 400
    .local v0, "addressViewPort":Lorg/json/JSONObject;
    invoke-direct {p0, v0}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAreaFromJSON(Lorg/json/JSONObject;)Lcom/bricolsoftconsulting/geocoderplus/Area;

    move-result-object v2

    .line 401
    .local v2, "viewPort":Lcom/bricolsoftconsulting/geocoderplus/Area;
    invoke-virtual {p1, v2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->setViewPort(Lcom/bricolsoftconsulting/geocoderplus/Area;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 406
    return-void

    .line 402
    .end local v0    # "addressViewPort":Lorg/json/JSONObject;
    .end local v2    # "viewPort":Lcom/bricolsoftconsulting/geocoderplus/Area;
    :catch_0
    move-exception v1

    .line 404
    .local v1, "e":Lorg/json/JSONException;
    new-instance v3, Ljava/io/IOException;

    const-string v4, "Failed to parse JSON data!"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
.end method


# virtual methods
.method public clearBounds()V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseBounds:Z

    .line 96
    return-void
.end method

.method public getFromLocationName(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .param p1, "locationName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/bricolsoftconsulting/geocoderplus/Address;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 100
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getFromLocationName(Ljava/lang/String;I)Ljava/util/List;
    .locals 7
    .param p1, "locationName"    # Ljava/lang/String;
    .param p2, "maxResults"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List",
            "<",
            "Lcom/bricolsoftconsulting/geocoderplus/Address;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 106
    const/4 v2, 0x0

    .line 107
    .local v2, "results":Ljava/util/List;, "Ljava/util/List<Lcom/bricolsoftconsulting/geocoderplus/Address;>;"
    const/4 v1, 0x0

    .line 110
    .local v1, "jsonString":Ljava/lang/String;
    if-nez p1, :cond_0

    .line 111
    new-instance v5, Ljava/lang/IllegalArgumentException;

    const-string v6, "Location name cannot be null!"

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 115
    :cond_0
    invoke-direct {p0, p1}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getGeocodingUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 118
    .local v4, "url":Ljava/lang/String;
    new-instance v3, Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;

    invoke-direct {v3}, Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;-><init>()V

    .line 120
    .local v3, "retriever":Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;
    :try_start_0
    invoke-virtual {v3, v4}, Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;->retrieve(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 126
    invoke-direct {p0, v1, p2}, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->getAddressesFromJSON(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    .line 129
    return-object v2

    .line 121
    :catch_0
    move-exception v0

    .line 122
    .local v0, "e":Ljava/io/IOException;
    new-instance v5, Ljava/io/IOException;

    const-string v6, "Failed to retrieve JSON data over HTTP!"

    invoke-direct {v5, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mLocale:Ljava/util/Locale;

    return-object v0
.end method

.method public getUseRegionBias()Z
    .locals 1

    .prologue
    .line 78
    iget-boolean v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseRegionBias:Z

    return v0
.end method

.method public setBounds(DDDD)V
    .locals 1
    .param p1, "northeastLatitude"    # D
    .param p3, "northeastLongitude"    # D
    .param p5, "southWestLatitude"    # D
    .param p7, "southWestLongitude"    # D

    .prologue
    .line 87
    iput-wide p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mNortheastLatitude:D

    .line 88
    iput-wide p3, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mNortheastLongitude:D

    .line 89
    iput-wide p5, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mSouthWestLatitude:D

    .line 90
    iput-wide p7, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mSouthWestLongitude:D

    .line 91
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseBounds:Z

    .line 92
    return-void
.end method

.method public setLocale(Ljava/util/Locale;)V
    .locals 0
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    .line 74
    iput-object p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mLocale:Ljava/util/Locale;

    .line 75
    return-void
.end method

.method public setUseRegionBias(Z)V
    .locals 0
    .param p1, "useRegionBias"    # Z

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/bricolsoftconsulting/geocoderplus/Geocoder;->mUseRegionBias:Z

    .line 83
    return-void
.end method
