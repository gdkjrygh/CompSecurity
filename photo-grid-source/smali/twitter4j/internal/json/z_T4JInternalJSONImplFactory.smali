.class public Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/internal/json/z_T4JInternalFactory;


# static fields
.field private static final serialVersionUID:J = 0x4868b7d54ca3e042L


# instance fields
.field private conf:Ltwitter4j/conf/Configuration;


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    .line 40
    return-void
.end method

.method static coordinatesAsGeoLocationArray(Ltwitter4j/internal/org/json/JSONArray;)[[Ltwitter4j/GeoLocation;
    .locals 12

    .prologue
    const/4 v1, 0x0

    .line 104
    :try_start_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v0

    new-array v3, v0, [[Ltwitter4j/GeoLocation;

    move v2, v1

    .line 105
    :goto_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 106
    invoke-virtual {p0, v2}, Ltwitter4j/internal/org/json/JSONArray;->getJSONArray(I)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v0

    new-array v0, v0, [Ltwitter4j/GeoLocation;

    aput-object v0, v3, v2

    move v0, v1

    .line 108
    :goto_1
    invoke-virtual {v4}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v5

    if-ge v0, v5, :cond_0

    .line 109
    invoke-virtual {v4, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONArray(I)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v5

    .line 110
    aget-object v6, v3, v2

    new-instance v7, Ltwitter4j/GeoLocation;

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Ltwitter4j/internal/org/json/JSONArray;->getDouble(I)D

    move-result-wide v8

    const/4 v10, 0x0

    invoke-virtual {v5, v10}, Ltwitter4j/internal/org/json/JSONArray;->getDouble(I)D

    move-result-wide v10

    invoke-direct {v7, v8, v9, v10, v11}, Ltwitter4j/GeoLocation;-><init>(DD)V

    aput-object v7, v6, v0
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 105
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 114
    :catch_0
    move-exception v0

    .line 115
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 113
    :cond_1
    return-object v3
.end method

.method static createGeoLocation(Ltwitter4j/internal/org/json/JSONObject;)Ltwitter4j/GeoLocation;
    .locals 6

    .prologue
    .line 87
    :try_start_0
    const-string v0, "coordinates"

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    const-string v0, "coordinates"

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    const-string v1, "coordinates"

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    const/4 v1, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 91
    const-string v1, ","

    invoke-static {v0, v1}, Ltwitter4j/internal/util/z_T4JInternalStringUtil;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 92
    new-instance v0, Ltwitter4j/GeoLocation;

    const/4 v2, 0x1

    aget-object v2, v1, v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const/4 v4, 0x0

    aget-object v1, v1, v4

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Ltwitter4j/GeoLocation;-><init>(DD)V
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    :goto_0
    return-object v0

    .line 95
    :catch_0
    move-exception v0

    .line 96
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 98
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static createHashtagEntity(IILjava/lang/String;)Ltwitter4j/HashtagEntity;
    .locals 1

    .prologue
    .line 290
    new-instance v0, Ltwitter4j/internal/json/HashtagEntityJSONImpl;

    invoke-direct {v0, p0, p1, p2}, Ltwitter4j/internal/json/HashtagEntityJSONImpl;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public static createRateLimitStatusFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;
    .locals 1

    .prologue
    .line 120
    invoke-static {p0}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->createFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;

    move-result-object v0

    return-object v0
.end method

.method public static createUrlEntity(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltwitter4j/URLEntity;
    .locals 6

    .prologue
    .line 311
    new-instance v0, Ltwitter4j/internal/json/URLEntityJSONImpl;

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ltwitter4j/internal/json/URLEntityJSONImpl;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static createUserMentionEntity(IILjava/lang/String;Ljava/lang/String;J)Ltwitter4j/UserMentionEntity;
    .locals 8

    .prologue
    .line 301
    new-instance v1, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;

    move v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;-><init>(IILjava/lang/String;Ljava/lang/String;J)V

    return-object v1
.end method


# virtual methods
.method public createAUserList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/UserList;
    .locals 2

    .prologue
    .line 177
    new-instance v0, Ltwitter4j/internal/json/UserListJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/UserListJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createAUserList(Ltwitter4j/internal/org/json/JSONObject;)Ltwitter4j/UserList;
    .locals 1

    .prologue
    .line 54
    new-instance v0, Ltwitter4j/internal/json/UserListJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/UserListJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    return-object v0
.end method

.method public createAccountSettings(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/AccountSettings;
    .locals 2

    .prologue
    .line 222
    new-instance v0, Ltwitter4j/internal/json/AccountSettingsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/AccountSettingsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createAccountTotals(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/AccountTotals;
    .locals 2

    .prologue
    .line 217
    new-instance v0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/AccountTotalsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createCategoryList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 192
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/CategoryJSONImpl;->createCategoriesList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createDirectMessage(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/DirectMessage;
    .locals 2

    .prologue
    .line 197
    new-instance v0, Ltwitter4j/internal/json/DirectMessageJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/DirectMessageJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createDirectMessage(Ltwitter4j/internal/org/json/JSONObject;)Ltwitter4j/DirectMessage;
    .locals 1

    .prologue
    .line 59
    new-instance v0, Ltwitter4j/internal/json/DirectMessageJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/DirectMessageJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    return-object v0
.end method

.method public createDirectMessageList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 202
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
    .line 275
    new-instance v0, Ltwitter4j/internal/json/ResponseListImpl;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    return-object v0
.end method

.method public createFriendshipList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 212
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/FriendshipJSONImpl;->createFriendshipList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createIDs(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/IDs;
    .locals 2

    .prologue
    .line 167
    new-instance v0, Ltwitter4j/internal/json/IDsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/IDsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createLanguageList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/api/HelpResources$Language;",
            ">;"
        }
    .end annotation

    .prologue
    .line 270
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/LanguageJSONImpl;->createLanguageList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createLocationList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 237
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/LocationJSONImpl;->createLocationList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createOEmbed(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/OEmbed;
    .locals 2

    .prologue
    .line 280
    new-instance v0, Ltwitter4j/internal/json/OEmbedJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/OEmbedJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createPagableUserList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/PagableResponseList;
    .locals 1
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

    .prologue
    .line 172
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserJSONImpl;->createPagableUserList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/PagableResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createPagableUserListList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/PagableResponseList;
    .locals 1
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

    .prologue
    .line 182
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserListJSONImpl;->createPagableUserListList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/PagableResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createPlace(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Place;
    .locals 2

    .prologue
    .line 242
    new-instance v0, Ltwitter4j/internal/json/PlaceJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/PlaceJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createPlaceList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 3
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

    .prologue
    .line 248
    :try_start_0
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/PlaceJSONImpl;->createPlaceList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    :try_end_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 251
    :goto_0
    return-object v0

    .line 249
    :catch_0
    move-exception v0

    .line 250
    invoke-virtual {v0}, Ltwitter4j/TwitterException;->getStatusCode()I

    move-result v1

    const/16 v2, 0x194

    if-ne v1, v2, :cond_0

    .line 251
    new-instance v0, Ltwitter4j/internal/json/ResponseListImpl;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    goto :goto_0

    .line 253
    :cond_0
    throw v0
.end method

.method public createQueryResult(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/Query;)Ltwitter4j/QueryResult;
    .locals 3

    .prologue
    .line 155
    :try_start_0
    new-instance v0, Ltwitter4j/internal/json/QueryResultJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/QueryResultJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    :try_end_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    :goto_0
    return-object v0

    .line 156
    :catch_0
    move-exception v0

    .line 157
    const/16 v1, 0x194

    invoke-virtual {v0}, Ltwitter4j/TwitterException;->getStatusCode()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 158
    new-instance v0, Ltwitter4j/internal/json/QueryResultJSONImpl;

    invoke-direct {v0, p2}, Ltwitter4j/internal/json/QueryResultJSONImpl;-><init>(Ltwitter4j/Query;)V

    goto :goto_0

    .line 160
    :cond_0
    throw v0
.end method

.method public createRateLimitStatuses(Ltwitter4j/internal/http/HttpResponse;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ltwitter4j/RateLimitStatus;",
            ">;"
        }
    .end annotation

    .prologue
    .line 64
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->createRateLimitStatuses(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public createRelationship(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Relationship;
    .locals 2

    .prologue
    .line 207
    new-instance v0, Ltwitter4j/internal/json/RelationshipJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/RelationshipJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createSavedSearch(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/SavedSearch;
    .locals 2

    .prologue
    .line 227
    new-instance v0, Ltwitter4j/internal/json/SavedSearchJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/SavedSearchJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createSavedSearchList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 232
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/SavedSearchJSONImpl;->createSavedSearchList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createSimilarPlaces(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/SimilarPlaces;
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/SimilarPlacesImpl;->createSimilarPlaces(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/SimilarPlaces;

    move-result-object v0

    return-object v0
.end method

.method public createStatus(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Status;
    .locals 2

    .prologue
    .line 69
    new-instance v0, Ltwitter4j/internal/json/StatusJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/StatusJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createStatus(Ltwitter4j/internal/org/json/JSONObject;)Ltwitter4j/Status;
    .locals 1

    .prologue
    .line 44
    new-instance v0, Ltwitter4j/internal/json/StatusJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/StatusJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    return-object v0
.end method

.method public createStatusList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 74
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/StatusJSONImpl;->createStatusList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createTrends(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/Trends;
    .locals 2

    .prologue
    .line 125
    new-instance v0, Ltwitter4j/internal/json/TrendsJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/TrendsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createTwitterAPIConfiguration(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/TwitterAPIConfiguration;
    .locals 2

    .prologue
    .line 265
    new-instance v0, Ltwitter4j/internal/json/TwitterAPIConfigurationJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/TwitterAPIConfigurationJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createUser(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/User;
    .locals 2

    .prologue
    .line 130
    new-instance v0, Ltwitter4j/internal/json/UserJSONImpl;

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V

    return-object v0
.end method

.method public createUser(Ltwitter4j/internal/org/json/JSONObject;)Ltwitter4j/User;
    .locals 1

    .prologue
    .line 49
    new-instance v0, Ltwitter4j/internal/json/UserJSONImpl;

    invoke-direct {v0, p1}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    return-object v0
.end method

.method public createUserList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 135
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserJSONImpl;->createUserList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createUserListFromJSONArray(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 2
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

    .prologue
    .line 140
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONArray()Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {v0, p1, v1}, Ltwitter4j/internal/json/UserJSONImpl;->createUserList(Ltwitter4j/internal/org/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public createUserListFromJSONArray_Users(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 2
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

    .prologue
    .line 146
    :try_start_0
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    const-string v1, "users"

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {v0, p1, v1}, Ltwitter4j/internal/json/UserJSONImpl;->createUserList(Ltwitter4j/internal/org/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 147
    :catch_0
    move-exception v0

    .line 148
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method public createUserListList(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/ResponseList;
    .locals 1
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

    .prologue
    .line 187
    iget-object v0, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserListJSONImpl;->createUserListList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 316
    if-ne p0, p1, :cond_1

    .line 324
    :cond_0
    :goto_0
    return v0

    .line 317
    :cond_1
    instance-of v2, p1, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 319
    :cond_2
    check-cast p1, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;

    .line 321
    iget-object v2, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    if-eqz v2, :cond_3

    iget-object v2, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    iget-object v3, p1, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 322
    goto :goto_0

    .line 321
    :cond_3
    iget-object v2, p1, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 329
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
    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JSONImplFactory{conf="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/internal/json/z_T4JInternalJSONImplFactory;->conf:Ltwitter4j/conf/Configuration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
