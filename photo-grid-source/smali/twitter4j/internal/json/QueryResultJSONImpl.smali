.class final Ltwitter4j/internal/json/QueryResultJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/QueryResult;


# static fields
.field static queryFactoryMethod:Ljava/lang/reflect/Method; = null

.field private static final serialVersionUID:J = -0x5e1d46bedbea26d6L


# instance fields
.field private completedIn:D

.field private count:I

.field private maxId:J

.field private nextResults:Ljava/lang/String;

.field private query:Ljava/lang/String;

.field private refreshUrl:Ljava/lang/String;

.field private sinceId:J

.field private tweets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ltwitter4j/Status;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    .line 55
    const-class v0, Ltwitter4j/Query;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    .line 56
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 57
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "createWithNextPageQuery"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 59
    sput-object v3, Ltwitter4j/internal/json/QueryResultJSONImpl;->queryFactoryMethod:Ljava/lang/reflect/Method;

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 63
    :cond_0
    sget-object v0, Ltwitter4j/internal/json/QueryResultJSONImpl;->queryFactoryMethod:Ljava/lang/reflect/Method;

    if-nez v0, :cond_2

    .line 64
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    new-instance v1, Ljava/lang/NoSuchMethodException;

    const-string v2, "twitter4j.Query.createWithNextPageQuery(java.lang.String)"

    invoke-direct {v1, v2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 56
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 66
    :cond_2
    return-void
.end method

.method constructor <init>(Ltwitter4j/Query;)V
    .locals 2

    .prologue
    .line 96
    invoke-direct {p0}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>()V

    .line 97
    invoke-virtual {p1}, Ltwitter4j/Query;->getSinceId()J

    move-result-wide v0

    iput-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    .line 98
    invoke-virtual {p1}, Ltwitter4j/Query;->getCount()I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->count:I

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    .line 100
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 6

    .prologue
    .line 69
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 70
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v1

    .line 72
    :try_start_0
    const-string v0, "search_metadata"

    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v2

    .line 73
    const-string v0, "completed_in"

    invoke-static {v0, v2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getDouble(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)D

    move-result-wide v4

    iput-wide v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    .line 74
    const-string v0, "count"

    invoke-static {v0, v2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->count:I

    .line 75
    const-string v0, "max_id"

    invoke-static {v0, v2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v4

    iput-wide v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    .line 76
    const-string v0, "next_results"

    invoke-virtual {v2, v0}, Ltwitter4j/internal/org/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "next_results"

    invoke-virtual {v2, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->nextResults:Ljava/lang/String;

    .line 77
    const-string v0, "query"

    invoke-static {v0, v2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getURLDecodedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    .line 78
    const-string v0, "refresh_url"

    invoke-static {v0, v2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    .line 79
    const-string v0, "since_id"

    invoke-static {v0, v2}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v2

    iput-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    .line 81
    const-string v0, "statuses"

    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v2

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    .line 83
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 86
    :cond_0
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 87
    invoke-virtual {v2, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v3

    .line 88
    iget-object v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    new-instance v5, Ltwitter4j/internal/json/StatusJSONImpl;

    invoke-direct {v5, v3, p2}, Ltwitter4j/internal/json/StatusJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;Ltwitter4j/conf/Configuration;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 76
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 90
    :catch_0
    move-exception v0

    .line 91
    new-instance v2, Ltwitter4j/TwitterException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 92
    :cond_2
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 190
    if-ne p0, p1, :cond_1

    .line 206
    :cond_0
    :goto_0
    return v0

    .line 191
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 193
    :cond_3
    check-cast p1, Ltwitter4j/QueryResult;

    .line 195
    invoke-interface {p1}, Ltwitter4j/QueryResult;->getCompletedIn()D

    move-result-wide v2

    iget-wide v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_4

    move v0, v1

    .line 196
    goto :goto_0

    .line 197
    :cond_4
    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    invoke-interface {p1}, Ltwitter4j/QueryResult;->getMaxId()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_5

    move v0, v1

    goto :goto_0

    .line 198
    :cond_5
    iget v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->count:I

    invoke-interface {p1}, Ltwitter4j/QueryResult;->getCount()I

    move-result v3

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    .line 199
    :cond_6
    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    invoke-interface {p1}, Ltwitter4j/QueryResult;->getSinceId()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_7

    move v0, v1

    goto :goto_0

    .line 200
    :cond_7
    iget-object v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    invoke-interface {p1}, Ltwitter4j/QueryResult;->getQuery()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    move v0, v1

    goto :goto_0

    .line 201
    :cond_8
    iget-object v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    invoke-interface {p1}, Ltwitter4j/QueryResult;->getRefreshUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_9
    move v0, v1

    .line 202
    goto :goto_0

    .line 201
    :cond_a
    invoke-interface {p1}, Ltwitter4j/QueryResult;->getRefreshUrl()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    .line 203
    :cond_b
    iget-object v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    if-eqz v2, :cond_c

    iget-object v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    invoke-interface {p1}, Ltwitter4j/QueryResult;->getTweets()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 204
    goto :goto_0

    .line 203
    :cond_c
    invoke-interface {p1}, Ltwitter4j/QueryResult;->getTweets()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public final getCompletedIn()D
    .locals 2

    .prologue
    .line 144
    iget-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    return-wide v0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 136
    iget v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->count:I

    return v0
.end method

.method public final getMaxId()J
    .locals 2

    .prologue
    .line 115
    iget-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    return-wide v0
.end method

.method public final getQuery()Ljava/lang/String;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    return-object v0
.end method

.method public final getRefreshURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRefreshUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 123
    invoke-virtual {p0}, Ltwitter4j/internal/json/QueryResultJSONImpl;->getRefreshURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSinceId()J
    .locals 2

    .prologue
    .line 107
    iget-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    return-wide v0
.end method

.method public final getTweets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/Status;",
            ">;"
        }
    .end annotation

    .prologue
    .line 160
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->nextResults:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/16 v6, 0x20

    .line 213
    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    iget-wide v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v0, v2

    .line 214
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    iget-wide v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    .line 215
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v2

    .line 216
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->count:I

    add-int/2addr v0, v2

    .line 217
    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-eqz v2, :cond_2

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 218
    :goto_1
    mul-int/lit8 v0, v0, 0x1f

    ushr-long v4, v2, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    .line 219
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    .line 220
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 221
    return v0

    :cond_1
    move v0, v1

    .line 215
    goto :goto_0

    .line 217
    :cond_2
    const-wide/16 v2, 0x0

    goto :goto_1
.end method

.method public final nextQuery()Ltwitter4j/Query;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 168
    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->nextResults:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 172
    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    sget-object v0, Ltwitter4j/internal/json/QueryResultJSONImpl;->queryFactoryMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->nextResults:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltwitter4j/Query;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 173
    :catch_0
    move-exception v0

    .line 174
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 175
    :catch_1
    move-exception v0

    .line 176
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x27

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "QueryResultJSONImpl{sinceId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", refreshUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", completedIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", query=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tweets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
