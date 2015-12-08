.class public Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;
.super Ljava/lang/Object;
.source "z_T4JInternalJSONImplFactory.java"

# interfaces
.implements Ltwitter4j/internal/json/z_T4JInternalFactory;


# instance fields
.field private conf:Ltwitter4j/conf/Configuration;


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;)V
    .locals 0
    .param p1, "conf"    # Ltwitter4j/conf/Configuration;

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    .line 37
    return-void
.end method

.method static coordinatesAsGeoLocationArray(Lorg/json/JSONArray;)[[Ltwitter4j/GeoLocation;
    .locals 12
    .param p0, "coordinates"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 94
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v6

    new-array v1, v6, [[Ltwitter4j/GeoLocation;

    .line 95
    .local v1, "boundingBox":[[Ltwitter4j/GeoLocation;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v3, v6, :cond_1

    .line 96
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v0

    .line 97
    .local v0, "array":Lorg/json/JSONArray;
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v6

    new-array v6, v6, [Ltwitter4j/GeoLocation;

    aput-object v6, v1, v3

    .line 98
    const/4 v4, 0x0

    .local v4, "j":I
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v4, v6, :cond_0

    .line 99
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v2

    .line 100
    .local v2, "coordinate":Lorg/json/JSONArray;
    aget-object v6, v1, v3

    new-instance v7, Ltwitter4j/GeoLocation;

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v8

    const/4 v10, 0x0

    invoke-virtual {v2, v10}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v10

    invoke-direct {v7, v8, v9, v10, v11}, Ltwitter4j/GeoLocation;-><init>(DD)V

    aput-object v7, v6, v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 95
    .end local v2    # "coordinate":Lorg/json/JSONArray;
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 104
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v1    # "boundingBox":[[Ltwitter4j/GeoLocation;
    .end local v3    # "i":I
    .end local v4    # "j":I
    :catch_0
    move-exception v5

    .line 105
    .local v5, "jsone":Lorg/json/JSONException;
    new-instance v6, Ltwitter4j/TwitterException;

    invoke-direct {v6, v5}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v6

    .line 103
    .end local v5    # "jsone":Lorg/json/JSONException;
    .restart local v1    # "boundingBox":[[Ltwitter4j/GeoLocation;
    .restart local v3    # "i":I
    :cond_1
    return-object v1
.end method

.method public static createFeatureSpecificRateLimitStatusFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;
    .locals 1
    .param p0, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    .line 114
    invoke-static {p0}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->createFeatureSpecificRateLimitStatusFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;

    move-result-object v0

    return-object v0
.end method

.method static createGeoLocation(Lorg/json/JSONObject;)Ltwitter4j/GeoLocation;
    .locals 8
    .param p0, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 77
    :try_start_0
    const-string v3, "geo"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 78
    const-string v3, "geo"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "coordinates"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    .local v0, "coordinates":Ljava/lang/String;
    const/4 v3, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 81
    const-string v3, ","

    invoke-static {v0, v3}, Ltwitter4j/internal/util/z_T4JInternalStringUtil;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 82
    .local v2, "point":[Ljava/lang/String;
    new-instance v3, Ltwitter4j/GeoLocation;

    const/4 v4, 0x0

    aget-object v4, v2, v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    const/4 v6, 0x1

    aget-object v6, v2, v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Ltwitter4j/GeoLocation;-><init>(DD)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .end local v0    # "coordinates":Ljava/lang/String;
    .end local v2    # "point":[Ljava/lang/String;
    :goto_0
    return-object v3

    .line 85
    :catch_0
    move-exception v1

    .line 86
    .local v1, "jsone":Lorg/json/JSONException;
    new-instance v3, Ltwitter4j/TwitterException;

    invoke-direct {v3, v1}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v3

    .line 88
    .end local v1    # "jsone":Lorg/json/JSONException;
    :cond_0
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public static createRateLimitStatusFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;
    .locals 1
    .param p0, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    .line 110
    invoke-static {p0}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->createFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public createAUserList(Lorg/json/JSONObject;)Ltwitter4j/UserList;
    .locals 1
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 48
    new-instance v0, Ltwitter4j/internal/json/UserListJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/UserListJSONImpl;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public createAUserList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/UserList;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 166
    new-instance v0, Ltwitter4j/internal/json/UserListJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/UserListJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createAccountSettings(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/AccountSettings;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 206
    new-instance v0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/AccountSettingsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createAccountTotals(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/AccountTotals;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 202
    new-instance v0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/AccountTotalsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createCategoryList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Category;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 178
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/CategoryJSONImpl;->createCategoriesList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createDirectMessage(Lorg/json/JSONObject;)Ltwitter4j/DirectMessage;
    .locals 1
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 52
    new-instance v0, Ltwitter4j/internal/json/DirectMessageJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/DirectMessageJSONImpl;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public createDirectMessage(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/DirectMessage;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 186
    new-instance v0, Ltwitter4j/internal/json/DirectMessageJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/DirectMessageJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createDirectMessageList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/DirectMessage;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 190
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/DirectMessageJSONImpl;->createDirectMessageList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createEmptyResponseList()Ltwitter4j/ResponseList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ltwitter4j/ResponseList",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 254
    new-instance v0, Ltwitter4j/internal/json/ResponseListImpl;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    return-object v0
.end method

.method public createFriendshipList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Friendship;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 198
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/FriendshipJSONImpl;->createFriendshipList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createIDs(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/IDs;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 158
    new-instance v0, Ltwitter4j/internal/json/IDsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/IDsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createLanguageList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/api/HelpMethods$Language;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 250
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/LanguageJSONImpl;->createLanguageList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createLocationList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Location;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 218
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/LocationJSONImpl;->createLocationList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createPagableUserList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/PagableResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/PagableResponseList",
            "<",
            "Ltwitter4j/User;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 162
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserJSONImpl;->createPagableUserList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/PagableResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createPagableUserListList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/PagableResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/PagableResponseList",
            "<",
            "Ltwitter4j/UserList;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 170
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserListJSONImpl;->createPagableUserListList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/PagableResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createPlace(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Place;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 222
    new-instance v0, Ltwitter4j/internal/json/PlaceJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/PlaceJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createPlaceList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 4
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Place;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 227
    :try_start_0
    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v1}, Ltwitter4j/internal/json/PlaceJSONImpl;->createPlaceList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    :try_end_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 230
    :goto_0
    return-object v1

    .line 228
    :catch_0
    move-exception v0

    .line 229
    .local v0, "te":Ltwitter4j/TwitterException;
    invoke-virtual {v0}, Ltwitter4j/TwitterException;->getStatusCode()I

    move-result v1

    const/16 v2, 0x194

    if-ne v1, v2, :cond_0

    .line 230
    new-instance v1, Ltwitter4j/internal/json/ResponseListImpl;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    goto :goto_0

    .line 232
    :cond_0
    throw v0
.end method

.method public createProfileImage(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ProfileImage;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 182
    new-instance v0, Ltwitter4j/internal/json/ProfileImageImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/ProfileImageImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    return-object v0
.end method

.method public createQueryResult(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/Query;)Ltwitter4j/QueryResult;
    .locals 3
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .param p2, "query"    # Ltwitter4j/Query;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 147
    :try_start_0
    new-instance v1, Ltwitter4j/internal/json/QueryResultJSONImpl;

    iget-object v2, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v1, p1, v2}, Ltwitter4j/internal/json/QueryResultJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    :try_end_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :goto_0
    return-object v1

    .line 148
    :catch_0
    move-exception v0

    .line 149
    .local v0, "te":Ltwitter4j/TwitterException;
    const/16 v1, 0x194

    invoke-virtual {v0}, Ltwitter4j/TwitterException;->getStatusCode()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 150
    new-instance v1, Ltwitter4j/internal/json/QueryResultJSONImpl;

    invoke-direct {v1, p2}, Ltwitter4j/internal/json/QueryResultJSONImpl;-><init>(Ltwitter4j/Query;)V

    goto :goto_0

    .line 152
    :cond_0
    throw v0
.end method

.method public createRateLimitStatus(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 56
    new-instance v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createRelatedResults(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RelatedResults;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 242
    new-instance v0, Ltwitter4j/internal/json/RelatedResultsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/RelatedResultsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createRelationship(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Relationship;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 194
    new-instance v0, Ltwitter4j/internal/json/RelationshipJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/RelationshipJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createSavedSearch(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/SavedSearch;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 210
    new-instance v0, Ltwitter4j/internal/json/SavedSearchJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/SavedSearchJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createSavedSearchList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/SavedSearch;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 214
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/SavedSearchJSONImpl;->createSavedSearchList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createSimilarPlaces(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/SimilarPlaces;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 238
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/SimilarPlacesImpl;->createSimilarPlaces(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/SimilarPlaces;

    move-result-object v0

    return-object v0
.end method

.method public createStatus(Lorg/json/JSONObject;)Ltwitter4j/Status;
    .locals 1
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 40
    new-instance v0, Ltwitter4j/internal/json/StatusJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/StatusJSONImpl;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public createStatus(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Status;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 60
    new-instance v0, Ltwitter4j/internal/json/StatusJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/StatusJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createStatusList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Status;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 64
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/StatusJSONImpl;->createStatusList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createTrends(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Trends;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 118
    new-instance v0, Ltwitter4j/internal/json/TrendsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/TrendsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createTrendsList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Trends;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 122
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v0}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    invoke-static {p1, v0}, Ltwitter4j/internal/json/TrendsJSONImpl;->createTrendsList(Ltwitter4j/internal/http/HttpResponse;Z)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createTwitterAPIConfiguration(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/TwitterAPIConfiguration;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 246
    new-instance v0, Ltwitter4j/internal/json/TwitterAPIConfigurationJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/TwitterAPIConfigurationJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createUser(Lorg/json/JSONObject;)Ltwitter4j/User;
    .locals 1
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 44
    new-instance v0, Ltwitter4j/internal/json/UserJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public createUser(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/User;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 126
    new-instance v0, Ltwitter4j/internal/json/UserJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createUserList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/User;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 130
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserJSONImpl;->createUserList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createUserListFromJSONArray(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/User;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 134
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONArray()Lorg/json/JSONArray;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {v0, p1, v1}, Ltwitter4j/internal/json/UserJSONImpl;->createUserList(Lorg/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createUserListFromJSONArray_Users(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 3
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/User;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 139
    :try_start_0
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "users"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    iget-object v2, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {v1, p1, v2}, Ltwitter4j/internal/json/UserJSONImpl;->createUserList(Lorg/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 140
    :catch_0
    move-exception v0

    .line 141
    .local v0, "jsone":Lorg/json/JSONException;
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method public createUserListList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/UserList;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 174
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserListJSONImpl;->createUserListList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 259
    if-ne p0, p1, :cond_1

    .line 267
    :cond_0
    :goto_0
    return v1

    .line 260
    :cond_1
    instance-of v3, p1, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;

    if-nez v3, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move-object v0, p1

    .line 262
    check-cast v0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;

    .line 264
    .local v0, "that":Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;
    iget-object v3, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    if-eqz v3, :cond_3

    iget-object v3, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    iget-object v4, v0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :goto_1
    move v1, v2

    .line 265
    goto :goto_0

    .line 264
    :cond_3
    iget-object v3, v0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    if-eqz v3, :cond_0

    goto :goto_1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 277
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "JSONImplFactory{conf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
