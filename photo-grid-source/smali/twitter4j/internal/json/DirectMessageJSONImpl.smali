.class final Ltwitter4j/internal/json/DirectMessageJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/DirectMessage;


# static fields
.field private static final serialVersionUID:J = -0x62974ee09dd34a09L


# instance fields
.field private createdAt:Ljava/util/Date;

.field private hashtagEntities:[Ltwitter4j/HashtagEntity;

.field private id:J

.field private mediaEntities:[Ltwitter4j/MediaEntity;

.field private recipient:Ltwitter4j/User;

.field private recipientId:J

.field private recipientScreenName:Ljava/lang/String;

.field private sender:Ltwitter4j/User;

.field private senderId:J

.field private senderScreenName:Ljava/lang/String;

.field private symbolEntities:[Ltwitter4j/SymbolEntity;

.field private text:Ljava/lang/String;

.field private urlEntities:[Ltwitter4j/URLEntity;

.field private userMentionEntities:[Ltwitter4j/UserMentionEntity;


# direct methods
.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 2

    .prologue
    .line 53
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 54
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 55
    invoke-direct {p0, v0}, Ltwitter4j/internal/json/DirectMessageJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 56
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 57
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 58
    invoke-static {p0, v0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    :cond_0
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>()V

    .line 63
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/DirectMessageJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 64
    return-void
.end method

.method static createDirectMessageList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/DirectMessage;",
            ">;"
        }
    .end annotation

    .prologue
    .line 256
    :try_start_0
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 259
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asJSONArray()Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v1

    .line 260
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v2

    .line 261
    new-instance v3, Ltwitter4j/internal/json/ResponseListImpl;

    invoke-direct {v3, v2, p0}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    .line 262
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    .line 263
    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v4

    .line 264
    new-instance v5, Ltwitter4j/internal/json/DirectMessageJSONImpl;

    invoke-direct {v5, v4}, Ltwitter4j/internal/json/DirectMessageJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 265
    invoke-interface {v3, v5}, Ltwitter4j/ResponseList;->add(Ljava/lang/Object;)Z

    .line 266
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 267
    invoke-static {v5, v4}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 270
    :cond_2
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 271
    invoke-static {v3, v1}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_1

    .line 273
    :cond_3
    return-object v3

    .line 274
    :catch_0
    move-exception v0

    .line 275
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 277
    :catch_1
    move-exception v0

    throw v0
.end method

.method private init(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 67
    const-string v1, "id"

    invoke-static {v1, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v2

    iput-wide v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->id:J

    .line 68
    const-string v1, "sender_id"

    invoke-static {v1, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v2

    iput-wide v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->senderId:J

    .line 69
    const-string v1, "recipient_id"

    invoke-static {v1, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v2

    iput-wide v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipientId:J

    .line 70
    const-string v1, "created_at"

    invoke-static {v1, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getDate(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/util/Date;

    move-result-object v1

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->createdAt:Ljava/util/Date;

    .line 71
    const-string v1, "sender_screen_name"

    invoke-static {v1, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->senderScreenName:Ljava/lang/String;

    .line 72
    const-string v1, "recipient_screen_name"

    invoke-static {v1, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipientScreenName:Ljava/lang/String;

    .line 74
    :try_start_0
    new-instance v1, Ltwitter4j/internal/json/UserJSONImpl;

    const-string v2, "sender"

    invoke-virtual {p1, v2}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v2

    invoke-direct {v1, v2}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->sender:Ltwitter4j/User;

    .line 75
    new-instance v1, Ltwitter4j/internal/json/UserJSONImpl;

    const-string v2, "recipient"

    invoke-virtual {p1, v2}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v2

    invoke-direct {v1, v2}, Ltwitter4j/internal/json/UserJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipient:Ltwitter4j/User;

    .line 76
    const-string v1, "entities"

    invoke-virtual {p1, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 77
    const-string v1, "entities"

    invoke-virtual {p1, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v2

    .line 79
    const-string v1, "user_mentions"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 80
    const-string v1, "user_mentions"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v3

    .line 81
    invoke-virtual {v3}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v4

    .line 82
    new-array v1, v4, [Ltwitter4j/UserMentionEntity;

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    move v1, v0

    .line 83
    :goto_0
    if-ge v1, v4, :cond_0

    .line 84
    iget-object v5, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    new-instance v6, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;

    invoke-virtual {v3, v1}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v7

    invoke-direct {v6, v7}, Ltwitter4j/internal/json/UserMentionEntityJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    aput-object v6, v5, v1

    .line 83
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 88
    :cond_0
    const-string v1, "urls"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 89
    const-string v1, "urls"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v4

    .line 91
    new-array v1, v4, [Ltwitter4j/URLEntity;

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    move v1, v0

    .line 92
    :goto_1
    if-ge v1, v4, :cond_1

    .line 93
    iget-object v5, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    new-instance v6, Ltwitter4j/internal/json/URLEntityJSONImpl;

    invoke-virtual {v3, v1}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v7

    invoke-direct {v6, v7}, Ltwitter4j/internal/json/URLEntityJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    aput-object v6, v5, v1

    .line 92
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 97
    :cond_1
    const-string v1, "hashtags"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 98
    const-string v1, "hashtags"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v4

    .line 100
    new-array v1, v4, [Ltwitter4j/HashtagEntity;

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    move v1, v0

    .line 101
    :goto_2
    if-ge v1, v4, :cond_2

    .line 102
    iget-object v5, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    new-instance v6, Ltwitter4j/internal/json/HashtagEntityJSONImpl;

    invoke-virtual {v3, v1}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v7

    invoke-direct {v6, v7}, Ltwitter4j/internal/json/HashtagEntityJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    aput-object v6, v5, v1

    .line 101
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 106
    :cond_2
    const-string v1, "symbols"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 107
    const-string v1, "symbols"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v4

    .line 109
    new-array v1, v4, [Ltwitter4j/SymbolEntity;

    iput-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->symbolEntities:[Ltwitter4j/SymbolEntity;

    move v1, v0

    .line 110
    :goto_3
    if-ge v1, v4, :cond_3

    .line 112
    iget-object v5, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->symbolEntities:[Ltwitter4j/SymbolEntity;

    new-instance v6, Ltwitter4j/internal/json/HashtagEntityJSONImpl;

    invoke-virtual {v3, v1}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v7

    invoke-direct {v6, v7}, Ltwitter4j/internal/json/HashtagEntityJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    aput-object v6, v5, v1

    .line 110
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 116
    :cond_3
    const-string v1, "media"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 117
    const-string v1, "media"

    invoke-virtual {v2, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v2

    .line 119
    new-array v3, v2, [Ltwitter4j/MediaEntity;

    iput-object v3, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->mediaEntities:[Ltwitter4j/MediaEntity;

    .line 120
    :goto_4
    if-ge v0, v2, :cond_4

    .line 121
    iget-object v3, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->mediaEntities:[Ltwitter4j/MediaEntity;

    new-instance v4, Ltwitter4j/internal/json/MediaEntityJSONImpl;

    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v5

    invoke-direct {v4, v5}, Ltwitter4j/internal/json/MediaEntityJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    aput-object v4, v3, v0

    .line 120
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 125
    :cond_4
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    if-nez v0, :cond_5

    const/4 v0, 0x0

    new-array v0, v0, [Ltwitter4j/UserMentionEntity;

    :goto_5
    iput-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    .line 126
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    new-array v0, v0, [Ltwitter4j/URLEntity;

    :goto_6
    iput-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    .line 127
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    if-nez v0, :cond_7

    const/4 v0, 0x0

    new-array v0, v0, [Ltwitter4j/HashtagEntity;

    :goto_7
    iput-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    .line 128
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->symbolEntities:[Ltwitter4j/SymbolEntity;

    if-nez v0, :cond_8

    const/4 v0, 0x0

    new-array v0, v0, [Ltwitter4j/SymbolEntity;

    :goto_8
    iput-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->symbolEntities:[Ltwitter4j/SymbolEntity;

    .line 129
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->mediaEntities:[Ltwitter4j/MediaEntity;

    if-nez v0, :cond_9

    const/4 v0, 0x0

    new-array v0, v0, [Ltwitter4j/MediaEntity;

    :goto_9
    iput-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->mediaEntities:[Ltwitter4j/MediaEntity;

    .line 130
    const-string v0, "text"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    iget-object v3, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    iget-object v4, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->mediaEntities:[Ltwitter4j/MediaEntity;

    invoke-static {v0, v1, v2, v3, v4}, Ltwitter4j/internal/json/HTMLEntity;->unescapeAndSlideEntityIncdices(Ljava/lang/String;[Ltwitter4j/UserMentionEntity;[Ltwitter4j/URLEntity;[Ltwitter4j/HashtagEntity;[Ltwitter4j/MediaEntity;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->text:Ljava/lang/String;

    .line 134
    return-void

    .line 125
    :cond_5
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    goto :goto_5

    .line 126
    :cond_6
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    goto :goto_6

    .line 127
    :cond_7
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    goto :goto_7

    .line 128
    :cond_8
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->symbolEntities:[Ltwitter4j/SymbolEntity;

    goto :goto_8

    .line 129
    :cond_9
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->mediaEntities:[Ltwitter4j/MediaEntity;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    .line 132
    :catch_0
    move-exception v0

    .line 133
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 288
    if-nez p1, :cond_1

    .line 294
    :cond_0
    :goto_0
    return v0

    .line 291
    :cond_1
    if-ne p0, p1, :cond_2

    move v0, v1

    .line 292
    goto :goto_0

    .line 294
    :cond_2
    instance-of v2, p1, Ltwitter4j/DirectMessage;

    if-eqz v2, :cond_0

    check-cast p1, Ltwitter4j/DirectMessage;

    invoke-interface {p1}, Ltwitter4j/DirectMessage;->getId()J

    move-result-wide v2

    iget-wide v4, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->id:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getHashtagEntities()[Ltwitter4j/HashtagEntity;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    return-object v0
.end method

.method public final getId()J
    .locals 2

    .prologue
    .line 142
    iget-wide v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->id:J

    return-wide v0
.end method

.method public final getMediaEntities()[Ltwitter4j/MediaEntity;
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->mediaEntities:[Ltwitter4j/MediaEntity;

    return-object v0
.end method

.method public final getRecipient()Ltwitter4j/User;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipient:Ltwitter4j/User;

    return-object v0
.end method

.method public final getRecipientId()J
    .locals 2

    .prologue
    .line 166
    iget-wide v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipientId:J

    return-wide v0
.end method

.method public final getRecipientScreenName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipientScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public final getSender()Ltwitter4j/User;
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->sender:Ltwitter4j/User;

    return-object v0
.end method

.method public final getSenderId()J
    .locals 2

    .prologue
    .line 158
    iget-wide v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->senderId:J

    return-wide v0
.end method

.method public final getSenderScreenName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->senderScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public final getSymbolEntities()[Ltwitter4j/SymbolEntity;
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->symbolEntities:[Ltwitter4j/SymbolEntity;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getURLEntities()[Ltwitter4j/URLEntity;
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    return-object v0
.end method

.method public final getUserMentionEntities()[Ltwitter4j/UserMentionEntity;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 283
    iget-wide v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->id:J

    long-to-int v0, v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x27

    const/4 v1, 0x0

    .line 299
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "DirectMessageJSONImpl{id="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->id:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", text=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->text:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", sender_id="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->senderId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", recipient_id="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipientId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", created_at="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->createdAt:Ljava/util/Date;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", userMentionEntities="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", urlEntities="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    if-nez v0, :cond_1

    move-object v0, v1

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", hashtagEntities="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    if-nez v0, :cond_2

    move-object v0, v1

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", sender_screen_name=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->senderScreenName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", recipient_screen_name=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipientScreenName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", sender="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->sender:Ltwitter4j/User;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", recipient="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->recipient:Ltwitter4j/User;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", userMentionEntities="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    if-nez v0, :cond_3

    move-object v0, v1

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", urlEntities="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    if-nez v0, :cond_4

    move-object v0, v1

    :goto_4
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", hashtagEntities="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    if-nez v2, :cond_5

    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_1

    :cond_2
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_2

    :cond_3
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->userMentionEntities:[Ltwitter4j/UserMentionEntity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_3

    :cond_4
    iget-object v0, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->urlEntities:[Ltwitter4j/URLEntity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_4

    :cond_5
    iget-object v1, p0, Ltwitter4j/internal/json/DirectMessageJSONImpl;->hashtagEntities:[Ltwitter4j/HashtagEntity;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_5
.end method
