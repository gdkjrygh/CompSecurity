.class final Ltwitter4j/internal/json/QueryResultJSONImpl;
.super Ljava/lang/Object;
.source "QueryResultJSONImpl.java"

# interfaces
.implements Ltwitter4j/QueryResult;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x7db884b56e8fbc26L


# instance fields
.field private completedIn:D

.field private maxId:J

.field private page:I

.field private query:Ljava/lang/String;

.field private refreshUrl:Ljava/lang/String;

.field private resultsPerPage:I

.field private sinceId:J

.field private tweets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ltwitter4j/Tweet;",
            ">;"
        }
    .end annotation
.end field

.field private warning:Ljava/lang/String;


# direct methods
.method constructor <init>(Ltwitter4j/Query;)V
    .locals 2
    .param p1, "query"    # Ltwitter4j/Query;

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    invoke-virtual {p1}, Ltwitter4j/Query;->getSinceId()J

    move-result-wide v0

    iput-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    .line 86
    invoke-virtual {p1}, Ltwitter4j/Query;->getRpp()I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->resultsPerPage:I

    .line 87
    invoke-virtual {p1}, Ltwitter4j/Query;->getPage()I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->page:I

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    .line 89
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 8
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .param p2, "conf"    # Ltwitter4j/conf/Configuration;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Lorg/json/JSONObject;

    move-result-object v2

    .line 60
    .local v2, "json":Lorg/json/JSONObject;
    :try_start_0
    const-string v5, "since_id"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v6

    iput-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    .line 61
    const-string v5, "max_id"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v6

    iput-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    .line 62
    const-string v5, "refresh_url"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    .line 64
    const-string v5, "results_per_page"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v5

    iput v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->resultsPerPage:I

    .line 65
    const-string v5, "warning"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getRawString(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->warning:Ljava/lang/String;

    .line 66
    const-string v5, "completed_in"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getDouble(Ljava/lang/String;Lorg/json/JSONObject;)D

    move-result-wide v6

    iput-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    .line 67
    const-string v5, "page"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v5

    iput v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->page:I

    .line 68
    const-string v5, "query"

    invoke-static {v5, v2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getURLDecodedString(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    .line 69
    const-string v5, "results"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 70
    .local v0, "array":Lorg/json/JSONArray;
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    .line 71
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 72
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 74
    :cond_0
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v1, v5, :cond_1

    .line 75
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 76
    .local v4, "tweet":Lorg/json/JSONObject;
    iget-object v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    new-instance v6, Ltwitter4j/internal/json/TweetJSONImpl;

    invoke-direct {v6, v4, p2}, Ltwitter4j/internal/json/TweetJSONImpl;-><init>(Lorg/json/JSONObject;Ltwitter4j/conf/Configuration;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 78
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v1    # "i":I
    .end local v4    # "tweet":Lorg/json/JSONObject;
    :catch_0
    move-exception v3

    .line 79
    .local v3, "jsone":Lorg/json/JSONException;
    new-instance v5, Ltwitter4j/TwitterException;

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v3}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5

    .line 81
    .end local v3    # "jsone":Lorg/json/JSONException;
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v1    # "i":I
    :cond_1
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 156
    if-ne p0, p1, :cond_1

    .line 175
    :cond_0
    :goto_0
    return v1

    .line 157
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 159
    check-cast v0, Ltwitter4j/QueryResult;

    .line 161
    .local v0, "that":Ltwitter4j/QueryResult;
    invoke-interface {v0}, Ltwitter4j/QueryResult;->getCompletedIn()D

    move-result-wide v4

    iget-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_4

    move v1, v2

    .line 162
    goto :goto_0

    .line 163
    :cond_4
    iget-wide v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getMaxId()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_5

    move v1, v2

    goto :goto_0

    .line 164
    :cond_5
    iget v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->page:I

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getPage()I

    move-result v4

    if-eq v3, v4, :cond_6

    move v1, v2

    goto :goto_0

    .line 165
    :cond_6
    iget v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->resultsPerPage:I

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getResultsPerPage()I

    move-result v4

    if-eq v3, v4, :cond_7

    move v1, v2

    goto :goto_0

    .line 166
    :cond_7
    iget-wide v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getSinceId()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_8

    move v1, v2

    goto :goto_0

    .line 167
    :cond_8
    iget-object v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getQuery()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    move v1, v2

    goto :goto_0

    .line 168
    :cond_9
    iget-object v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    if-eqz v3, :cond_b

    iget-object v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getRefreshUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_a
    move v1, v2

    .line 169
    goto :goto_0

    .line 168
    :cond_b
    invoke-interface {v0}, Ltwitter4j/QueryResult;->getRefreshUrl()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_a

    .line 170
    :cond_c
    iget-object v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    if-eqz v3, :cond_e

    iget-object v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getTweets()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_d
    move v1, v2

    .line 171
    goto/16 :goto_0

    .line 170
    :cond_e
    invoke-interface {v0}, Ltwitter4j/QueryResult;->getTweets()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_d

    .line 172
    :cond_f
    iget-object v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->warning:Ljava/lang/String;

    if-eqz v3, :cond_10

    iget-object v3, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->warning:Ljava/lang/String;

    invoke-interface {v0}, Ltwitter4j/QueryResult;->getWarning()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :goto_1
    move v1, v2

    .line 173
    goto/16 :goto_0

    .line 172
    :cond_10
    invoke-interface {v0}, Ltwitter4j/QueryResult;->getWarning()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_1
.end method

.method public getCompletedIn()D
    .locals 2

    .prologue
    .line 130
    iget-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    return-wide v0
.end method

.method public getMaxId()J
    .locals 2

    .prologue
    .line 102
    iget-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    return-wide v0
.end method

.method public getPage()I
    .locals 1

    .prologue
    .line 137
    iget v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->page:I

    return v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    return-object v0
.end method

.method public getRefreshUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getResultsPerPage()I
    .locals 1

    .prologue
    .line 116
    iget v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->resultsPerPage:I

    return v0
.end method

.method public getSinceId()J
    .locals 2

    .prologue
    .line 95
    iget-wide v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    return-wide v0
.end method

.method public getTweets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/Tweet;",
            ">;"
        }
    .end annotation

    .prologue
    .line 151
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    return-object v0
.end method

.method public getWarning()Ljava/lang/String;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->warning:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 11

    .prologue
    const/16 v10, 0x20

    const/4 v4, 0x0

    .line 182
    iget-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    iget-wide v8, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    ushr-long/2addr v8, v10

    xor-long/2addr v6, v8

    long-to-int v0, v6

    .line 183
    .local v0, "result":I
    mul-int/lit8 v1, v0, 0x1f

    iget-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    iget-wide v8, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    ushr-long/2addr v8, v10

    xor-long/2addr v6, v8

    long-to-int v5, v6

    add-int v0, v1, v5

    .line 184
    mul-int/lit8 v5, v0, 0x1f

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int v0, v5, v1

    .line 185
    mul-int/lit8 v1, v0, 0x1f

    iget v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->resultsPerPage:I

    add-int v0, v1, v5

    .line 186
    mul-int/lit8 v5, v0, 0x1f

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->warning:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->warning:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int v0, v5, v1

    .line 187
    iget-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    const-wide/16 v8, 0x0

    cmpl-double v1, v6, v8

    if-eqz v1, :cond_3

    iget-wide v6, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .line 188
    .local v2, "temp":J
    :goto_2
    mul-int/lit8 v1, v0, 0x1f

    ushr-long v6, v2, v10

    xor-long/2addr v6, v2

    long-to-int v5, v6

    add-int v0, v1, v5

    .line 189
    mul-int/lit8 v1, v0, 0x1f

    iget v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->page:I

    add-int v0, v1, v5

    .line 190
    mul-int/lit8 v1, v0, 0x1f

    iget-object v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    add-int v0, v1, v5

    .line 191
    mul-int/lit8 v1, v0, 0x1f

    iget-object v5, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    if-eqz v5, :cond_0

    iget-object v4, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :cond_0
    add-int v0, v1, v4

    .line 192
    return v0

    .end local v2    # "temp":J
    :cond_1
    move v1, v4

    .line 184
    goto :goto_0

    :cond_2
    move v1, v4

    .line 186
    goto :goto_1

    .line 187
    :cond_3
    const-wide/16 v2, 0x0

    goto :goto_2
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x27

    .line 197
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "QueryResultJSONImpl{sinceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->sinceId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", maxId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->maxId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", refreshUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->refreshUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", resultsPerPage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->resultsPerPage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", warning=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->warning:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", completedIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->completedIn:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", page="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->page:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", query=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->query:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", tweets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/QueryResultJSONImpl;->tweets:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
