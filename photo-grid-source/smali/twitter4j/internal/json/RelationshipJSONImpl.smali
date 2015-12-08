.class Ltwitter4j/internal/json/RelationshipJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/Relationship;


# static fields
.field private static final serialVersionUID:J = 0x6b34ca39712b59e8L


# instance fields
.field private final sourceBlockingTarget:Z

.field private final sourceCanDm:Z

.field private final sourceFollowedByTarget:Z

.field private final sourceFollowingTarget:Z

.field private final sourceNotificationsEnabled:Z

.field private final sourceUserId:J

.field private final sourceUserScreenName:Ljava/lang/String;

.field private final targetUserId:J

.field private final targetUserScreenName:Ljava/lang/String;

.field private wantRetweets:Z


# direct methods
.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ltwitter4j/internal/json/RelationshipJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/internal/org/json/JSONObject;)V

    .line 53
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 55
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    invoke-static {p0, v0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_0
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 4

    .prologue
    .line 64
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 66
    :try_start_0
    const-string v0, "relationship"

    invoke-virtual {p2, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 67
    const-string v1, "source"

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v1

    .line 68
    const-string v2, "target"

    invoke-virtual {v0, v2}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 69
    const-string v2, "id"

    invoke-static {v2, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v2

    iput-wide v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserId:J

    .line 70
    const-string v2, "id"

    invoke-static {v2, v0}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v2

    iput-wide v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserId:J

    .line 71
    const-string v2, "screen_name"

    invoke-static {v2, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserScreenName:Ljava/lang/String;

    .line 72
    const-string v2, "screen_name"

    invoke-static {v2, v0}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserScreenName:Ljava/lang/String;

    .line 73
    const-string v0, "blocking"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceBlockingTarget:Z

    .line 74
    const-string v0, "following"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowingTarget:Z

    .line 75
    const-string v0, "followed_by"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowedByTarget:Z

    .line 76
    const-string v0, "can_dm"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceCanDm:Z

    .line 77
    const-string v0, "notifications_enabled"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceNotificationsEnabled:Z

    .line 78
    const-string v0, "want_retweets"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getBoolean(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Z

    move-result v0

    iput-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->wantRetweets:Z
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    return-void

    .line 79
    :catch_0
    move-exception v0

    .line 80
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

    invoke-virtual {p2}, Ltwitter4j/internal/org/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Ltwitter4j/internal/json/RelationshipJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/internal/org/json/JSONObject;)V

    .line 61
    return-void
.end method

.method static createRelationshipList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Relationship;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    :try_start_0
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 90
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asJSONArray()Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v2

    .line 92
    new-instance v3, Ltwitter4j/internal/json/ResponseListImpl;

    invoke-direct {v3, v2, p0}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    .line 93
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    .line 94
    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v4

    .line 95
    new-instance v5, Ltwitter4j/internal/json/RelationshipJSONImpl;

    invoke-direct {v5, v4}, Ltwitter4j/internal/json/RelationshipJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 96
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 97
    invoke-static {v5, v4}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    :cond_1
    invoke-interface {v3, v5}, Ltwitter4j/ResponseList;->add(Ljava/lang/Object;)Z

    .line 93
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 101
    :cond_2
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 102
    invoke-static {v3, v1}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_1

    .line 104
    :cond_3
    return-object v3

    .line 105
    :catch_0
    move-exception v0

    .line 106
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 108
    :catch_1
    move-exception v0

    throw v0
.end method


# virtual methods
.method public canSourceDm()Z
    .locals 1

    .prologue
    .line 190
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceCanDm:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 211
    if-ne p0, p1, :cond_1

    .line 223
    :cond_0
    :goto_0
    return v0

    .line 212
    :cond_1
    instance-of v2, p1, Ltwitter4j/Relationship;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 214
    :cond_2
    check-cast p1, Ltwitter4j/Relationship;

    .line 216
    iget-wide v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserId:J

    invoke-interface {p1}, Ltwitter4j/Relationship;->getSourceUserId()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    move v0, v1

    goto :goto_0

    .line 217
    :cond_3
    iget-wide v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserId:J

    invoke-interface {p1}, Ltwitter4j/Relationship;->getTargetUserId()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    .line 218
    :cond_4
    iget-object v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserScreenName:Ljava/lang/String;

    invoke-interface {p1}, Ltwitter4j/Relationship;->getSourceUserScreenName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 219
    goto :goto_0

    .line 220
    :cond_5
    iget-object v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserScreenName:Ljava/lang/String;

    invoke-interface {p1}, Ltwitter4j/Relationship;->getTargetUserScreenName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 221
    goto :goto_0
.end method

.method public getSourceUserId()J
    .locals 2

    .prologue
    .line 118
    iget-wide v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserId:J

    return-wide v0
.end method

.method public getSourceUserScreenName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public getTargetUserId()J
    .locals 2

    .prologue
    .line 126
    iget-wide v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserId:J

    return-wide v0
.end method

.method public getTargetUserScreenName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 9

    .prologue
    const/16 v8, 0x20

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 228
    iget-wide v4, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserId:J

    iget-wide v6, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserId:J

    ushr-long/2addr v6, v8

    xor-long/2addr v4, v6

    long-to-int v0, v4

    .line 229
    mul-int/lit8 v3, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserScreenName:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserScreenName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v3

    .line 230
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceBlockingTarget:Z

    if-eqz v0, :cond_2

    move v0, v2

    :goto_1
    add-int/2addr v0, v3

    .line 231
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceNotificationsEnabled:Z

    if-eqz v0, :cond_3

    move v0, v2

    :goto_2
    add-int/2addr v0, v3

    .line 232
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowingTarget:Z

    if-eqz v0, :cond_4

    move v0, v2

    :goto_3
    add-int/2addr v0, v3

    .line 233
    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowedByTarget:Z

    if-eqz v0, :cond_5

    move v0, v2

    :goto_4
    add-int/2addr v0, v3

    .line 234
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceCanDm:Z

    if-eqz v3, :cond_6

    :goto_5
    add-int/2addr v0, v2

    .line 235
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserId:J

    iget-wide v4, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserId:J

    ushr-long/2addr v4, v8

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    .line 236
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserScreenName:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserScreenName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 237
    return v0

    :cond_1
    move v0, v1

    .line 229
    goto :goto_0

    :cond_2
    move v0, v1

    .line 230
    goto :goto_1

    :cond_3
    move v0, v1

    .line 231
    goto :goto_2

    :cond_4
    move v0, v1

    .line 232
    goto :goto_3

    :cond_5
    move v0, v1

    .line 233
    goto :goto_4

    :cond_6
    move v2, v1

    .line 234
    goto :goto_5
.end method

.method public isSourceBlockingTarget()Z
    .locals 1

    .prologue
    .line 134
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceBlockingTarget:Z

    return v0
.end method

.method public isSourceFollowedByTarget()Z
    .locals 1

    .prologue
    .line 174
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowedByTarget:Z

    return v0
.end method

.method public isSourceFollowingTarget()Z
    .locals 1

    .prologue
    .line 158
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowingTarget:Z

    return v0
.end method

.method public isSourceNotificationsEnabled()Z
    .locals 1

    .prologue
    .line 198
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceNotificationsEnabled:Z

    return v0
.end method

.method public isSourceWantRetweets()Z
    .locals 1

    .prologue
    .line 206
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->wantRetweets:Z

    return v0
.end method

.method public isTargetFollowedBySource()Z
    .locals 1

    .prologue
    .line 182
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowingTarget:Z

    return v0
.end method

.method public isTargetFollowingSource()Z
    .locals 1

    .prologue
    .line 166
    iget-boolean v0, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowedByTarget:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x27

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RelationshipJSONImpl{sourceUserId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", targetUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sourceUserScreenName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceUserScreenName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", targetUserScreenName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->targetUserScreenName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sourceFollowingTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowingTarget:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sourceFollowedByTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceFollowedByTarget:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sourceCanDm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceCanDm:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sourceNotificationsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/json/RelationshipJSONImpl;->sourceNotificationsEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
