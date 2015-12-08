.class public Lcom/googlecode/flickrjandroid/places/PlacesInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final METHOD_FIND:Ljava/lang/String; = "flickr.places.find"

.field private static final METHOD_FIND_BY_LATLON:Ljava/lang/String; = "flickr.places.findByLatLon"

.field private static final METHOD_GET_CHILDREN_WITH_PHOTOS_PUBLIC:Ljava/lang/String; = "flickr.places.getChildrenWithPhotosPublic"

.field private static final METHOD_GET_INFO:Ljava/lang/String; = "flickr.places.getInfo"

.field private static final METHOD_GET_INFO_BY_URL:Ljava/lang/String; = "flickr.places.getInfoByUrl"

.field private static final METHOD_GET_PLACETYPES:Ljava/lang/String; = "flickr.places.getPlaceTypes"

.field private static final METHOD_GET_SHAPEHISTORY:Ljava/lang/String; = "flickr.places.getShapeHistory"

.field private static final METHOD_GET_TOP_PLACES_LIST:Ljava/lang/String; = "flickr.places.getTopPlacesList"

.field private static final METHOD_PLACES_FOR_BOUNDINGBOX:Ljava/lang/String; = "flickr.places.placesForBoundingBox"

.field private static final METHOD_PLACES_FOR_CONTACTS:Ljava/lang/String; = "flickr.places.placesForContacts"

.field private static final METHOD_PLACES_FOR_TAGS:Ljava/lang/String; = "flickr.places.placesForTags"

.field private static final METHOD_PLACES_FOR_USER:Ljava/lang/String; = "flickr.places.placesForUser"

.field private static final METHOD_RESOLVE_PLACE_ID:Ljava/lang/String; = "flickr.places.resolvePlaceId"

.field private static final METHOD_RESOLVE_PLACE_URL:Ljava/lang/String; = "flickr.places.resolvePlaceURL"

.field private static final METHOD_TAGS_FOR_PLACE:Ljava/lang/String; = "flickr.places.tagsForPlace"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    .line 122
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->sharedSecret:Ljava/lang/String;

    .line 123
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 124
    return-void
.end method

.method private parseLocation(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/Location;
    .locals 6

    .prologue
    .line 752
    new-instance v0, Lcom/googlecode/flickrjandroid/places/Location;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/places/Location;-><init>()V

    .line 753
    const-string v1, "locality"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 754
    const-string v2, "county"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 755
    const-string v3, "region"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 756
    const-string v4, "country"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 758
    const-string v5, "place_id"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/googlecode/flickrjandroid/places/Location;->setPlaceId(Ljava/lang/String;)V

    .line 760
    const-string v5, "place_url"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/googlecode/flickrjandroid/places/Location;->setPlaceUrl(Ljava/lang/String;)V

    .line 761
    const-string v5, "woeid"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/googlecode/flickrjandroid/places/Location;->setWoeId(Ljava/lang/String;)V

    .line 762
    const-string v5, "latitude"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/googlecode/flickrjandroid/places/Location;->setLatitude(Ljava/lang/String;)V

    .line 763
    const-string v5, "longitude"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/googlecode/flickrjandroid/places/Location;->setLongitude(Ljava/lang/String;)V

    .line 764
    const-string v5, "place_type"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->stringPlaceTypeToInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/googlecode/flickrjandroid/places/Location;->setPlaceType(I)V

    .line 767
    const/4 v5, 0x7

    invoke-direct {p0, v1, v5}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parseLocationPlace(Lorg/json/JSONObject;I)Lcom/googlecode/flickrjandroid/places/Place;

    move-result-object v1

    .line 766
    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Location;->setLocality(Lcom/googlecode/flickrjandroid/places/Place;)V

    .line 770
    const/16 v1, 0x9

    invoke-direct {p0, v2, v1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parseLocationPlace(Lorg/json/JSONObject;I)Lcom/googlecode/flickrjandroid/places/Place;

    move-result-object v1

    .line 769
    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Location;->setCounty(Lcom/googlecode/flickrjandroid/places/Place;)V

    .line 773
    const/16 v1, 0x8

    invoke-direct {p0, v3, v1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parseLocationPlace(Lorg/json/JSONObject;I)Lcom/googlecode/flickrjandroid/places/Place;

    move-result-object v1

    .line 772
    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Location;->setRegion(Lcom/googlecode/flickrjandroid/places/Place;)V

    .line 776
    const/16 v1, 0xc

    invoke-direct {p0, v4, v1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parseLocationPlace(Lorg/json/JSONObject;I)Lcom/googlecode/flickrjandroid/places/Place;

    move-result-object v1

    .line 775
    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Location;->setCountry(Lcom/googlecode/flickrjandroid/places/Place;)V

    .line 778
    return-object v0
.end method

.method private parseLocationPlace(Lorg/json/JSONObject;I)Lcom/googlecode/flickrjandroid/places/Place;
    .locals 2

    .prologue
    .line 782
    new-instance v0, Lcom/googlecode/flickrjandroid/places/Place;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/places/Place;-><init>()V

    .line 783
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 784
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setName(Ljava/lang/String;)V

    .line 788
    :goto_0
    const-string v1, "place_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceId(Ljava/lang/String;)V

    .line 789
    const-string v1, "place_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceUrl(Ljava/lang/String;)V

    .line 790
    const-string v1, "woeid"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setWoeId(Ljava/lang/String;)V

    .line 791
    const-string v1, "latitude"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setLatitude(Ljava/lang/String;)V

    .line 792
    const-string v1, "longitude"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setLongitude(Ljava/lang/String;)V

    .line 793
    invoke-virtual {v0, p2}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceType(I)V

    .line 794
    return-object v0

    .line 786
    :cond_0
    const-string v1, "_content"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setName(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private parsePlace(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/Place;
    .locals 2

    .prologue
    .line 798
    new-instance v0, Lcom/googlecode/flickrjandroid/places/Place;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/places/Place;-><init>()V

    .line 799
    const-string v1, "place_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceId(Ljava/lang/String;)V

    .line 800
    const-string v1, "place_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceUrl(Ljava/lang/String;)V

    .line 801
    const-string v1, "woeid"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setWoeId(Ljava/lang/String;)V

    .line 802
    const-string v1, "latitude"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setLatitude(Ljava/lang/String;)V

    .line 803
    const-string v1, "longitude"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setLongitude(Ljava/lang/String;)V

    .line 804
    const-string v1, "photo_count"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setPhotoCount(Ljava/lang/String;)V

    .line 805
    const-string v1, "place_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 806
    const-string v1, "place_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceType(Ljava/lang/String;)V

    .line 817
    :goto_0
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 818
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setName(Ljava/lang/String;)V

    .line 823
    :goto_1
    return-object v0

    .line 809
    :cond_0
    const-string v1, "place_type_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 811
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->intPlaceTypeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceType(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    .line 820
    :cond_1
    const-string v1, "_content"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setName(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-wide v6, -0x3f70c80000000000L    # -999.0

    .line 672
    new-instance v2, Lcom/googlecode/flickrjandroid/places/PlacesList;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/places/PlacesList;-><init>()V

    .line 673
    const-string v0, "places"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 674
    const-string v3, "place"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 675
    const-string v4, "1"

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/places/PlacesList;->setPage(Ljava/lang/String;)V

    .line 676
    const-string v4, "1"

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/places/PlacesList;->setPages(Ljava/lang/String;)V

    .line 677
    const-string v4, "latitude"

    invoke-virtual {v0, v4, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/googlecode/flickrjandroid/places/PlacesList;->setLatitude(D)V

    .line 678
    const-string v4, "longitude"

    invoke-virtual {v0, v4, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/googlecode/flickrjandroid/places/PlacesList;->setLongitude(D)V

    .line 679
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    :goto_0
    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/places/PlacesList;->setPerPage(I)V

    .line 680
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/places/PlacesList;->getPerPage()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/places/PlacesList;->setTotal(I)V

    .line 681
    :goto_1
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lt v1, v0, :cond_2

    .line 685
    :cond_0
    return-object v2

    :cond_1
    move v0, v1

    .line 679
    goto :goto_0

    .line 682
    :cond_2
    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 683
    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlace(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/Place;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/places/PlacesList;->add(Ljava/lang/Object;)Z

    .line 681
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method private stringPlaceTypeToInt(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 827
    const/4 v0, 0x0

    .line 828
    const-string v1, "locality"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 829
    const/4 v0, 0x7

    .line 841
    :cond_0
    :goto_0
    return v0

    .line 830
    :cond_1
    const-string v1, "county"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 831
    const/16 v0, 0x9

    .line 832
    goto :goto_0

    :cond_2
    const-string v1, "region"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 833
    const/16 v0, 0x8

    .line 834
    goto :goto_0

    :cond_3
    const-string v1, "country"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 835
    const/16 v0, 0xc

    .line 836
    goto :goto_0

    :cond_4
    const-string v1, "continent"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 837
    const/16 v0, 0x1d

    .line 838
    goto :goto_0

    :cond_5
    const-string v1, "neighbourhood"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 839
    const/16 v0, 0x16

    goto :goto_0
.end method


# virtual methods
.method public find(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 4

    .prologue
    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.find"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "query"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 153
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 154
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 156
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v0

    return-object v0
.end method

.method public findByLatLon(DDI)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 5

    .prologue
    .line 220
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 221
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.findByLatLon"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "lat"

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "lon"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "accuracy"

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 229
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 230
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 232
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v0

    return-object v0
.end method

.method public getChildrenWithPhotosPublic(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 4

    .prologue
    .line 250
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 251
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.getChildrenWithPhotosPublic"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    if-eqz p1, :cond_0

    .line 255
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "place_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    :cond_0
    if-eqz p2, :cond_1

    .line 258
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "woe_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    :cond_1
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 262
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 263
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 265
    :cond_2
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v0

    return-object v0
.end method

.method public getInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/places/Location;
    .locals 4

    .prologue
    .line 282
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 283
    new-instance v1, Lcom/googlecode/flickrjandroid/places/Location;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/places/Location;-><init>()V

    .line 284
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.getInfo"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 287
    if-eqz p1, :cond_0

    .line 288
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "place_id"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    :cond_0
    if-eqz p2, :cond_1

    .line 291
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "woe_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    :cond_1
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 295
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 296
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 298
    :cond_2
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "place"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 299
    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parseLocation(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/Location;

    move-result-object v0

    return-object v0
.end method

.method public getInfoByUrl(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/places/Location;
    .locals 4

    .prologue
    .line 315
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 316
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.getInfoByUrl"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "url"

    invoke-direct {v1, v2, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 322
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 323
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 325
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "place"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 326
    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parseLocation(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/Location;

    move-result-object v0

    return-object v0
.end method

.method public getPlaceTypes()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/places/PlaceType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 341
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 342
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.getPlaceTypes"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 345
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 346
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 347
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 349
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 350
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "place_types"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 351
    const-string v2, "place_type"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 352
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_2

    .line 359
    :cond_1
    return-object v1

    .line 353
    :cond_2
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 354
    new-instance v4, Lcom/googlecode/flickrjandroid/places/PlaceType;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/places/PlaceType;-><init>()V

    .line 355
    const-string v5, "id"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/places/PlaceType;->setPlaceTypeId(Ljava/lang/String;)V

    .line 356
    const-string v5, "_content"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/places/PlaceType;->setPlaceTypeName(Ljava/lang/String;)V

    .line 357
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getShapeHistory(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 380
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 381
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 382
    new-instance v2, Lcom/googlecode/flickrjandroid/places/Location;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/places/Location;-><init>()V

    .line 383
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.places.getShapeHistory"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 384
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    if-eqz p1, :cond_0

    .line 387
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "place_id"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    :cond_0
    if-eqz p2, :cond_1

    .line 390
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "woe_id"

    invoke-direct {v2, v3, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 393
    :cond_1
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v1

    .line 394
    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 395
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 397
    :cond_2
    invoke-interface {v1}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    .line 398
    return-object v0
.end method

.method public getTopPlacesList(ILjava/util/Date;Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 4

    .prologue
    .line 421
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 422
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.getTopPlacesList"

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 425
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "place_type"

    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->intPlaceTypeToString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 426
    if-eqz p3, :cond_0

    .line 427
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "place_id"

    invoke-direct {v0, v2, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 429
    :cond_0
    if-eqz p4, :cond_1

    .line 430
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "woe_id"

    invoke-direct {v0, v2, p4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 432
    :cond_1
    if-eqz p2, :cond_2

    .line 433
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "date"

    sget-object v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 436
    :cond_2
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 437
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 438
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 440
    :cond_3
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v0

    return-object v0
.end method

.method public intPlaceTypeToString(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 846
    const/16 v0, 0xc

    if-ne p1, v0, :cond_0

    .line 847
    const-string v0, "country"

    .line 859
    :goto_0
    return-object v0

    .line 848
    :cond_0
    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    .line 849
    const-string v0, "region"

    goto :goto_0

    .line 850
    :cond_1
    const/4 v0, 0x7

    if-ne p1, v0, :cond_2

    .line 851
    const-string v0, "locality"

    goto :goto_0

    .line 852
    :cond_2
    const/16 v0, 0x1d

    if-ne p1, v0, :cond_3

    .line 853
    const-string v0, "continent"

    goto :goto_0

    .line 854
    :cond_3
    const/16 v0, 0x16

    if-ne p1, v0, :cond_4

    .line 855
    const-string v0, "neighbourhood"

    goto :goto_0

    .line 857
    :cond_4
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    const-string v1, "33"

    const-string v2, "Not a valid place type"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public placesForBoundingBox(ILjava/lang/String;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 4

    .prologue
    .line 469
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 470
    new-instance v1, Lcom/googlecode/flickrjandroid/places/PlacesList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/places/PlacesList;-><init>()V

    .line 471
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.placesForBoundingBox"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 472
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "api_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 474
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "place_type"

    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->intPlaceTypeToString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 475
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "bbox"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 477
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 478
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 479
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 481
    :cond_0
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v0

    return-object v0
.end method

.method public placesForContacts(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 4

    .prologue
    .line 504
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 505
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "method"

    const-string v3, "flickr.places.placesForContacts"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 508
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "place_type"

    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->intPlaceTypeToString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 509
    if-eqz p2, :cond_0

    .line 510
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "place_id"

    invoke-direct {v1, v2, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 512
    :cond_0
    if-eqz p3, :cond_1

    .line 513
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "woe_id"

    invoke-direct {v1, v2, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 515
    :cond_1
    if-eqz p4, :cond_2

    .line 516
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "threshold"

    invoke-direct {v1, v2, p4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 518
    :cond_2
    if-eqz p5, :cond_3

    .line 519
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "contacts"

    invoke-direct {v1, v2, p5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 522
    :cond_3
    invoke-static {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 523
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 524
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 525
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 527
    :cond_4
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v0

    return-object v0
.end method

.method public placesForTags(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 10

    .prologue
    .line 565
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 566
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "method"

    const-string v5, "flickr.places.placesForTags"

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 567
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "api_key"

    iget-object v5, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 569
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "place_type_id"

    int-to-long v6, p1

    invoke-direct {v2, v4, v6, v7}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;J)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 570
    if-eqz p2, :cond_0

    .line 571
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "woe_id"

    invoke-direct {v2, v4, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 573
    :cond_0
    if-eqz p3, :cond_1

    .line 574
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "place_id"

    invoke-direct {v2, v4, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 576
    :cond_1
    if-eqz p4, :cond_2

    .line 577
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "threshold"

    invoke-direct {v2, v4, p4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 579
    :cond_2
    if-eqz p5, :cond_3

    .line 580
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "tags"

    const-string v5, ","

    invoke-static {p5, v5}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 582
    :cond_3
    if-eqz p6, :cond_4

    .line 583
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "tag_mode"

    move-object/from16 v0, p6

    invoke-direct {v2, v4, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 585
    :cond_4
    if-eqz p7, :cond_5

    .line 586
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "machine_tags"

    move-object/from16 v0, p7

    invoke-direct {v2, v4, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 588
    :cond_5
    if-eqz p8, :cond_6

    .line 589
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "machine_tag_mode"

    move-object/from16 v0, p8

    invoke-direct {v2, v4, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 591
    :cond_6
    if-eqz p9, :cond_7

    .line 592
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "min_upload_date"

    new-instance v5, Ljava/lang/Long;

    invoke-virtual/range {p9 .. p9}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-direct {v5, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 594
    :cond_7
    if-eqz p10, :cond_8

    .line 595
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "max_upload_date"

    new-instance v5, Ljava/lang/Long;

    invoke-virtual/range {p10 .. p10}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-direct {v5, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 597
    :cond_8
    if-eqz p11, :cond_9

    .line 598
    new-instance v4, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "min_taken_date"

    sget-object v2, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/DateFormat;

    move-object/from16 v0, p11

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 600
    :cond_9
    if-eqz p12, :cond_a

    .line 601
    new-instance v4, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "max_taken_date"

    sget-object v2, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/DateFormat;

    move-object/from16 v0, p12

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 604
    :cond_a
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v4}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v2

    .line 605
    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 606
    new-instance v3, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v3

    .line 608
    :cond_b
    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v2

    return-object v2
.end method

.method public placesForUser(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lcom/googlecode/flickrjandroid/places/PlacesList;
    .locals 10

    .prologue
    .line 635
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 637
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "method"

    const-string v5, "flickr.places.placesForUser"

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 638
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "oauth_consumer_key"

    iget-object v5, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 640
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "place_type"

    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->intPlaceTypeToString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 641
    if-eqz p3, :cond_0

    .line 642
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "place_id"

    invoke-direct {v2, v4, p3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 644
    :cond_0
    if-eqz p2, :cond_1

    .line 645
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "woe_id"

    invoke-direct {v2, v4, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 647
    :cond_1
    if-eqz p4, :cond_2

    .line 648
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "threshold"

    invoke-direct {v2, v4, p4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 650
    :cond_2
    if-eqz p5, :cond_3

    .line 651
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "min_upload_date"

    new-instance v5, Ljava/lang/Long;

    invoke-virtual {p5}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-direct {v5, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 653
    :cond_3
    if-eqz p6, :cond_4

    .line 654
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "max_upload_date"

    new-instance v5, Ljava/lang/Long;

    invoke-virtual/range {p6 .. p6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-direct {v5, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 656
    :cond_4
    if-eqz p7, :cond_5

    .line 657
    new-instance v4, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "min_taken_date"

    sget-object v2, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/DateFormat;

    move-object/from16 v0, p7

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 659
    :cond_5
    if-eqz p8, :cond_6

    .line 660
    new-instance v4, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "max_taken_date"

    sget-object v2, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/DateFormat;

    move-object/from16 v0, p8

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 663
    :cond_6
    invoke-static {v3}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthToken(Ljava/util/List;)V

    .line 664
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->sharedSecret:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Lcom/googlecode/flickrjandroid/Transport;->postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v2

    .line 665
    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 666
    new-instance v3, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v3

    .line 668
    :cond_7
    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->parsePlacesList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/places/PlacesList;

    move-result-object v2

    return-object v2
.end method

.method public tagsForPlace(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 711
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 712
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 713
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "method"

    const-string v6, "flickr.places.tagsForPlace"

    invoke-direct {v2, v5, v6}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 714
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "api_key"

    iget-object v6, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v5, v6}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 716
    if-eqz p1, :cond_0

    .line 717
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "woe_id"

    invoke-direct {v2, v5, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 719
    :cond_0
    if-eqz p2, :cond_1

    .line 720
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "place_id"

    invoke-direct {v2, v5, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 722
    :cond_1
    if-eqz p3, :cond_2

    .line 723
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "min_upload_date"

    new-instance v6, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    invoke-direct {v6, v8, v9}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v5, v6}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 725
    :cond_2
    if-eqz p4, :cond_3

    .line 726
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v5, "max_upload_date"

    new-instance v6, Ljava/lang/Long;

    invoke-virtual/range {p4 .. p4}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    invoke-direct {v6, v8, v9}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v5, v6}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 728
    :cond_3
    if-eqz p5, :cond_4

    .line 729
    new-instance v5, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v6, "min_taken_date"

    sget-object v2, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/DateFormat;

    move-object/from16 v0, p5

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v6, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 731
    :cond_4
    if-eqz p6, :cond_5

    .line 732
    new-instance v5, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v6, "max_taken_date"

    sget-object v2, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/DateFormat;

    move-object/from16 v0, p6

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v6, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 735
    :cond_5
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v5, p0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v5}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v3}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v2

    .line 736
    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 737
    new-instance v3, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v3

    .line 739
    :cond_6
    invoke-interface {v2}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "tags"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 740
    const-string v3, "tag"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 741
    const/4 v2, 0x0

    :goto_0
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-lt v2, v5, :cond_8

    .line 748
    :cond_7
    return-object v4

    .line 742
    :cond_8
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 743
    new-instance v6, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v6}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 744
    const-string v7, "count"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/googlecode/flickrjandroid/tags/Tag;->setCount(Ljava/lang/String;)V

    .line 745
    const-string v7, "_content"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 746
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 741
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method
