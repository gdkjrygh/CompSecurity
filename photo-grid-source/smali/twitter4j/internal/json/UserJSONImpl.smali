.class final Ltwitter4j/internal/json/UserJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/User;


# static fields
.field private static final serialVersionUID:J = -0x581124472812f726L


# instance fields
.field private createdAt:Ljava/util/Date;

.field private description:Ljava/lang/String;

.field private descriptionURLEntities:[Ltwitter4j/URLEntity;

.field private favouritesCount:I

.field private followersCount:I

.field private friendsCount:I

.field private id:J

.field private isContributorsEnabled:Z

.field private isFollowRequestSent:Z

.field private isGeoEnabled:Z

.field private isProtected:Z

.field private isVerified:Z

.field private lang:Ljava/lang/String;

.field private listedCount:I

.field private location:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private profileBackgroundColor:Ljava/lang/String;

.field private profileBackgroundImageUrl:Ljava/lang/String;

.field private profileBackgroundImageUrlHttps:Ljava/lang/String;

.field private profileBackgroundTiled:Z

.field private profileBannerImageUrl:Ljava/lang/String;

.field private profileImageUrl:Ljava/lang/String;

.field private profileImageUrlHttps:Ljava/lang/String;

.field private profileLinkColor:Ljava/lang/String;

.field private profileSidebarBorderColor:Ljava/lang/String;

.field private profileSidebarFillColor:Ljava/lang/String;

.field private profileTextColor:Ljava/lang/String;

.field private profileUseBackgroundImage:Z

.field private screenName:Ljava/lang/String;

.field private showAllInlineMedia:Z

.field private status:Ltwitter4j/Status;

.field private statusesCount:I

.field private timeZone:Ljava/lang/String;

.field private translator:Z

.field private url:Ljava/lang/String;

.field private urlEntity:Ltwitter4j/URLEntity;

.field private utcOffset:I


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 98
    invoke-direct {p0}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>()V

    .line 100
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 2

    .prologue
    .line 81
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 82
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 85
    :cond_0
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 86
    invoke-direct {p0, v0}, Ltwitter4j/internal/json/UserJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 87
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 88
    invoke-static {p0, v0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :cond_1
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>()V

    .line 94
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/UserJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 95
    return-void
.end method

.method static createPagableUserList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/PagableResponseList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/PagableResponseList",
            "<",
            "Ltwitter4j/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 584
    :try_start_0
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 585
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 587
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v1

    .line 588
    const-string v0, "users"

    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v2

    .line 589
    invoke-virtual {v2}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v3

    .line 590
    new-instance v4, Ltwitter4j/internal/json/PagableResponseListImpl;

    invoke-direct {v4, v3, v1, p0}, Ltwitter4j/internal/json/PagableResponseListImpl;-><init>(ILtwitter4j/internal/org/json/JSONObject;Ltwitter4j/internal/http/HttpResponse;)V

    .line 592
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_2

    .line 593
    invoke-virtual {v2, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v5

    .line 594
    new-instance v6, Ltwitter4j/internal/json/UserJSONImpl;

    invoke-direct {v6, v5}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 595
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 596
    invoke-static {v6, v5}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    :cond_1
    invoke-interface {v4, v6}, Ltwitter4j/PagableResponseList;->add(Ljava/lang/Object;)Z

    .line 592
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 600
    :cond_2
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 601
    invoke-static {v4, v1}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_1

    .line 603
    :cond_3
    return-object v4

    .line 604
    :catch_0
    move-exception v0

    .line 605
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 607
    :catch_1
    move-exception v0

    throw v0
.end method

.method static createUserList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 613
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asJSONArray()Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    invoke-static {v0, p0, p1}, Ltwitter4j/internal/json/UserJSONImpl;->createUserList(Ltwitter4j/internal/org/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method static createUserList(Ltwitter4j/internal/org/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/org/json/JSONArray;",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 619
    :try_start_0
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 620
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 622
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v1

    .line 623
    new-instance v2, Ltwitter4j/internal/json/ResponseListImpl;

    invoke-direct {v2, v1, p1}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    .line 625
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_2

    .line 626
    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v3

    .line 627
    new-instance v4, Ltwitter4j/internal/json/UserJSONImpl;

    invoke-direct {v4, v3}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 628
    invoke-interface {v2, v4}, Ltwitter4j/ResponseList;->add(Ljava/lang/Object;)Z

    .line 629
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 630
    invoke-static {v4, v3}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 633
    :cond_2
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 634
    invoke-static {v2, p0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_1

    .line 636
    :cond_3
    return-object v2

    .line 637
    :catch_0
    move-exception v0

    .line 638
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 640
    :catch_1
    move-exception v0

    throw v0
.end method

.method private static getURLEntitiesFromJSON(Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/String;)[Ltwitter4j/URLEntity;
    .locals 6

    .prologue
    .line 175
    const-string v0, "entities"

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    const-string v0, "entities"

    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 177
    invoke-virtual {v0, p1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 178
    invoke-virtual {v0, p1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 179
    const-string v1, "urls"

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 180
    const-string v1, "urls"

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v2

    .line 181
    invoke-virtual {v2}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v3

    .line 182
    new-array v0, v3, [Ltwitter4j/URLEntity;

    .line 183
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_1

    .line 184
    new-instance v4, Ltwitter4j/internal/json/URLEntityJSONImpl;

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v5

    invoke-direct {v4, v5}, Ltwitter4j/internal/json/URLEntityJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    aput-object v4, v0, v1

    .line 183
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 190
    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method private init(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 5

    .prologue
    .line 104
    :try_start_0
    const-string v0, "id"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v0

    iput-wide v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->id:J

    .line 105
    const-string v0, "name"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->name:Ljava/lang/String;

    .line 106
    const-string v0, "screen_name"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->screenName:Ljava/lang/String;

    .line 107
    const-string v0, "location"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->location:Ljava/lang/String;

    .line 110
    const-string v0, "description"

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserJSONImpl;->getURLEntitiesFromJSON(Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/String;)[Ltwitter4j/URLEntity;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->descriptionURLEntities:[Ltwitter4j/URLEntity;

    .line 111
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->descriptionURLEntities:[Ltwitter4j/URLEntity;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    new-array v0, v0, [Ltwitter4j/URLEntity;

    :goto_0
    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->descriptionURLEntities:[Ltwitter4j/URLEntity;

    .line 114
    const-string v0, "url"

    invoke-static {p1, v0}, Ltwitter4j/internal/json/UserJSONImpl;->getURLEntitiesFromJSON(Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/String;)[Ltwitter4j/URLEntity;

    move-result-object v0

    .line 115
    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    .line 116
    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->urlEntity:Ltwitter4j/URLEntity;

    .line 119
    :cond_0
    const-string v0, "description"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->description:Ljava/lang/String;

    .line 120
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->description:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 121
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->description:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Ltwitter4j/internal/json/UserJSONImpl;->descriptionURLEntities:[Ltwitter4j/URLEntity;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Ltwitter4j/internal/json/HTMLEntity;->unescapeAndSlideEntityIncdices(Ljava/lang/String;[Ltwitter4j/UserMentionEntity;[Ltwitter4j/URLEntity;[Ltwitter4j/HashtagEntity;[Ltwitter4j/MediaEntity;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->description:Ljava/lang/String;

    .line 125
    :cond_1
    const-string v0, "contributors_enabled"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isContributorsEnabled:Z

    .line 126
    const-string v0, "profile_image_url"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrl:Ljava/lang/String;

    .line 127
    const-string v0, "profile_image_url_https"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrlHttps:Ljava/lang/String;

    .line 128
    const-string v0, "url"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->url:Ljava/lang/String;

    .line 129
    const-string v0, "protected"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isProtected:Z

    .line 130
    const-string v0, "geo_enabled"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isGeoEnabled:Z

    .line 131
    const-string v0, "verified"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isVerified:Z

    .line 132
    const-string v0, "is_translator"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->translator:Z

    .line 133
    const-string v0, "followers_count"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->followersCount:I

    .line 135
    const-string v0, "profile_background_color"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundColor:Ljava/lang/String;

    .line 136
    const-string v0, "profile_text_color"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileTextColor:Ljava/lang/String;

    .line 137
    const-string v0, "profile_link_color"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileLinkColor:Ljava/lang/String;

    .line 138
    const-string v0, "profile_sidebar_fill_color"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileSidebarFillColor:Ljava/lang/String;

    .line 139
    const-string v0, "profile_sidebar_border_color"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileSidebarBorderColor:Ljava/lang/String;

    .line 140
    const-string v0, "profile_use_background_image"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileUseBackgroundImage:Z

    .line 141
    const-string v0, "show_all_inline_media"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->showAllInlineMedia:Z

    .line 142
    const-string v0, "friends_count"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->friendsCount:I

    .line 143
    const-string v0, "created_at"

    const-string v1, "EEE MMM dd HH:mm:ss z yyyy"

    invoke-static {v0, p1, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getDate(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->createdAt:Ljava/util/Date;

    .line 144
    const-string v0, "favourites_count"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->favouritesCount:I

    .line 145
    const-string v0, "utc_offset"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->utcOffset:I

    .line 146
    const-string v0, "time_zone"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->timeZone:Ljava/lang/String;

    .line 147
    const-string v0, "profile_background_image_url"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundImageUrl:Ljava/lang/String;

    .line 148
    const-string v0, "profile_background_image_url_https"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundImageUrlHttps:Ljava/lang/String;

    .line 149
    const-string v0, "profile_banner_url"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    .line 150
    const-string v0, "profile_background_tile"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundTiled:Z

    .line 151
    const-string v0, "lang"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->lang:Ljava/lang/String;

    .line 152
    const-string v0, "statuses_count"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->statusesCount:I

    .line 153
    const-string v0, "listed_count"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->listedCount:I

    .line 154
    const-string v0, "follow_request_sent"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isFollowRequestSent:Z

    .line 155
    const-string v0, "status"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 156
    const-string v0, "status"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 157
    new-instance v1, Ltwitter4j/internal/json/StatusJSONImpl;

    invoke-direct {v1, v0}, Ltwitter4j/internal/json/StatusJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    iput-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->status:Ltwitter4j/Status;

    .line 161
    :cond_2
    return-void

    .line 111
    :cond_3
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->descriptionURLEntities:[Ltwitter4j/URLEntity;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 159
    :catch_0
    move-exception v0

    .line 160
    new-instance v1, Ltwitter4j/TwitterException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private toResizedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 270
    if-eqz p1, :cond_1

    .line 271
    const-string v0, "_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 272
    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 273
    const-string v2, "/"

    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    .line 274
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 275
    if-le v1, v2, :cond_0

    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 280
    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 37
    check-cast p1, Ltwitter4j/User;

    invoke-virtual {p0, p1}, Ltwitter4j/internal/json/UserJSONImpl;->compareTo(Ltwitter4j/User;)I

    move-result v0

    return v0
.end method

.method public final compareTo(Ltwitter4j/User;)I
    .locals 4

    .prologue
    .line 195
    iget-wide v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->id:J

    invoke-interface {p1}, Ltwitter4j/User;->getId()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 651
    if-nez p1, :cond_1

    .line 657
    :cond_0
    :goto_0
    return v0

    .line 654
    :cond_1
    if-ne p0, p1, :cond_2

    move v0, v1

    .line 655
    goto :goto_0

    .line 657
    :cond_2
    instance-of v2, p1, Ltwitter4j/User;

    if-eqz v2, :cond_0

    check-cast p1, Ltwitter4j/User;

    invoke-interface {p1}, Ltwitter4j/User;->getId()J

    move-result-wide v2

    iget-wide v4, p0, Ltwitter4j/internal/json/UserJSONImpl;->id:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final getBiggerProfileImageURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 256
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrl:Ljava/lang/String;

    const-string v1, "_bigger"

    invoke-direct {p0, v0, v1}, Ltwitter4j/internal/json/UserJSONImpl;->toResizedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getBiggerProfileImageURLHttps()Ljava/lang/String;
    .locals 2

    .prologue
    .line 301
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrlHttps:Ljava/lang/String;

    const-string v1, "_bigger"

    invoke-direct {p0, v0, v1}, Ltwitter4j/internal/json/UserJSONImpl;->toResizedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionURLEntities()[Ltwitter4j/URLEntity;
    .locals 1

    .prologue
    .line 566
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->descriptionURLEntities:[Ltwitter4j/URLEntity;

    return-object v0
.end method

.method public final getFavouritesCount()I
    .locals 1

    .prologue
    .line 421
    iget v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->favouritesCount:I

    return v0
.end method

.method public final getFollowersCount()I
    .locals 1

    .prologue
    .line 335
    iget v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->followersCount:I

    return v0
.end method

.method public final getFriendsCount()I
    .locals 1

    .prologue
    .line 396
    iget v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->friendsCount:I

    return v0
.end method

.method public final getId()J
    .locals 2

    .prologue
    .line 203
    iget-wide v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->id:J

    return-wide v0
.end method

.method public final getLang()Ljava/lang/String;
    .locals 1

    .prologue
    .line 510
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->lang:Ljava/lang/String;

    return-object v0
.end method

.method public final getListedCount()I
    .locals 1

    .prologue
    .line 550
    iget v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->listedCount:I

    return v0
.end method

.method public final getLocation()Ljava/lang/String;
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->location:Ljava/lang/String;

    return-object v0
.end method

.method public final getMiniProfileImageURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 261
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrl:Ljava/lang/String;

    const-string v1, "_mini"

    invoke-direct {p0, v0, v1}, Ltwitter4j/internal/json/UserJSONImpl;->toResizedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getMiniProfileImageURLHttps()Ljava/lang/String;
    .locals 2

    .prologue
    .line 306
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrlHttps:Ljava/lang/String;

    const-string v1, "_mini"

    invoke-direct {p0, v0, v1}, Ltwitter4j/internal/json/UserJSONImpl;->toResizedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginalProfileImageURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 266
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrl:Ljava/lang/String;

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Ltwitter4j/internal/json/UserJSONImpl;->toResizedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getOriginalProfileImageURLHttps()Ljava/lang/String;
    .locals 2

    .prologue
    .line 311
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrlHttps:Ljava/lang/String;

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Ltwitter4j/internal/json/UserJSONImpl;->toResizedURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getProfileBackgroundColor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileBackgroundImageURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 445
    invoke-virtual {p0}, Ltwitter4j/internal/json/UserJSONImpl;->getProfileBackgroundImageURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getProfileBackgroundImageUrlHttps()Ljava/lang/String;
    .locals 1

    .prologue
    .line 461
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundImageUrlHttps:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileBannerIPadRetinaURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 484
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/ipad_retina"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getProfileBannerIPadURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 479
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/ipad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getProfileBannerMobileRetinaURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 494
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/mobile_retina"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getProfileBannerMobileURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 489
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/mobile"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getProfileBannerRetinaURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 474
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/web_retina"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getProfileBannerURL()Ljava/lang/String;
    .locals 2

    .prologue
    .line 469
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBannerImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/web"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getProfileImageURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileImageURLHttps()Ljava/lang/String;
    .locals 1

    .prologue
    .line 296
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrlHttps:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileImageUrlHttps()Ljava/net/URL;
    .locals 2

    .prologue
    .line 289
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrlHttps:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 291
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getProfileLinkColor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileLinkColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileSidebarBorderColor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileSidebarBorderColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileSidebarFillColor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileSidebarFillColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfileTextColor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileTextColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getScreenName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->screenName:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Ltwitter4j/Status;
    .locals 1

    .prologue
    .line 404
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->status:Ltwitter4j/Status;

    return-object v0
.end method

.method public final getStatusesCount()I
    .locals 1

    .prologue
    .line 518
    iget v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->statusesCount:I

    return v0
.end method

.method public final getTimeZone()Ljava/lang/String;
    .locals 1

    .prologue
    .line 437
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public final getURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 319
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getURLEntity()Ltwitter4j/URLEntity;
    .locals 6

    .prologue
    .line 574
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->urlEntity:Ltwitter4j/URLEntity;

    if-nez v0, :cond_0

    .line 575
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->url:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v3, ""

    .line 576
    :goto_0
    new-instance v0, Ltwitter4j/internal/json/URLEntityJSONImpl;

    const/4 v1, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    move-object v4, v3

    move-object v5, v3

    invoke-direct/range {v0 .. v5}, Ltwitter4j/internal/json/URLEntityJSONImpl;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->urlEntity:Ltwitter4j/URLEntity;

    .line 578
    :cond_0
    iget-object v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->urlEntity:Ltwitter4j/URLEntity;

    return-object v0

    .line 575
    :cond_1
    iget-object v3, p0, Ltwitter4j/internal/json/UserJSONImpl;->url:Ljava/lang/String;

    goto :goto_0
.end method

.method public final getUtcOffset()I
    .locals 1

    .prologue
    .line 429
    iget v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->utcOffset:I

    return v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 646
    iget-wide v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->id:J

    long-to-int v0, v0

    return v0
.end method

.method public final isContributorsEnabled()Z
    .locals 1

    .prologue
    .line 243
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isContributorsEnabled:Z

    return v0
.end method

.method public final isFollowRequestSent()Z
    .locals 1

    .prologue
    .line 558
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isFollowRequestSent:Z

    return v0
.end method

.method public final isGeoEnabled()Z
    .locals 1

    .prologue
    .line 526
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isGeoEnabled:Z

    return v0
.end method

.method public final isProfileBackgroundTiled()Z
    .locals 1

    .prologue
    .line 502
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundTiled:Z

    return v0
.end method

.method public final isProfileUseBackgroundImage()Z
    .locals 1

    .prologue
    .line 380
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileUseBackgroundImage:Z

    return v0
.end method

.method public final isProtected()Z
    .locals 1

    .prologue
    .line 327
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isProtected:Z

    return v0
.end method

.method public final isShowAllInlineMedia()Z
    .locals 1

    .prologue
    .line 388
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->showAllInlineMedia:Z

    return v0
.end method

.method public final isTranslator()Z
    .locals 1

    .prologue
    .line 542
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->translator:Z

    return v0
.end method

.method public final isVerified()Z
    .locals 1

    .prologue
    .line 534
    iget-boolean v0, p0, Ltwitter4j/internal/json/UserJSONImpl;->isVerified:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x27

    .line 662
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UserJSONImpl{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ltwitter4j/internal/json/UserJSONImpl;->id:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", screenName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->screenName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", location=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->location:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isContributorsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->isContributorsEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileImageUrlHttps=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileImageUrlHttps:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isProtected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->isProtected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", followersCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->followersCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->status:Ltwitter4j/Status;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileBackgroundColor=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundColor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileTextColor=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileTextColor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileLinkColor=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileLinkColor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileSidebarFillColor=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileSidebarFillColor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileSidebarBorderColor=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileSidebarBorderColor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileUseBackgroundImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileUseBackgroundImage:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showAllInlineMedia="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->showAllInlineMedia:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", friendsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->friendsCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->createdAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", favouritesCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->favouritesCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", utcOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->utcOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->timeZone:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileBackgroundImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileBackgroundImageUrlHttps=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundImageUrlHttps:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", profileBackgroundTiled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->profileBackgroundTiled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lang=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->lang:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", statusesCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->statusesCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isGeoEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->isGeoEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isVerified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->isVerified:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", translator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->translator:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", listedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->listedCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isFollowRequestSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/UserJSONImpl;->isFollowRequestSent:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
