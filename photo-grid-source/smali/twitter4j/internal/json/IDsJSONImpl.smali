.class final Ltwitter4j/internal/json/IDsJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/IDs;


# static fields
.field private static final serialVersionUID:J = -0x5b62b6c47b2132b9L


# instance fields
.field private ids:[J

.field private nextCursor:J

.field private previousCursor:J


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const-wide/16 v0, -0x1

    .line 51
    invoke-direct {p0}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>()V

    .line 37
    iput-wide v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->previousCursor:J

    .line 38
    iput-wide v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->nextCursor:J

    .line 52
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/IDsJSONImpl;->init(Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 2

    .prologue
    const-wide/16 v0, -0x1

    .line 42
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 37
    iput-wide v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->previousCursor:J

    .line 38
    iput-wide v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->nextCursor:J

    .line 43
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asString()Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-direct {p0, v0}, Ltwitter4j/internal/json/IDsJSONImpl;->init(Ljava/lang/String;)V

    .line 45
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 46
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 47
    invoke-static {p0, v0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    :cond_0
    return-void
.end method

.method private init(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 58
    :try_start_0
    const-string v1, "{"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 59
    new-instance v1, Ltwitter4j/internal/org/json/JSONObject;

    invoke-direct {v1, p1}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 60
    const-string v2, "ids"

    invoke-virtual {v1, v2}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v3

    new-array v3, v3, [J

    iput-object v3, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    .line 62
    :goto_0
    invoke-virtual {v2}, Ltwitter4j/internal/org/json/JSONArray;->length()I
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    if-ge v0, v3, :cond_0

    .line 64
    :try_start_1
    iget-object v3, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    invoke-virtual {v2, v0}, Ltwitter4j/internal/org/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    aput-wide v4, v3, v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    :try_start_2
    new-instance v2, Ltwitter4j/TwitterException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Twitter API returned malformed response: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 82
    :catch_1
    move-exception v0

    .line 83
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 69
    :cond_0
    :try_start_3
    const-string v0, "previous_cursor"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v2

    iput-wide v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->previousCursor:J

    .line 70
    const-string v0, "next_cursor"

    invoke-static {v0, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v0

    iput-wide v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->nextCursor:J

    .line 84
    :cond_1
    return-void

    .line 72
    :cond_2
    new-instance v1, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v1, p1}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v2

    new-array v2, v2, [J

    iput-object v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    .line 74
    :goto_1
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I
    :try_end_3
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    move-result v2

    if-ge v0, v2, :cond_1

    .line 76
    :try_start_4
    iget-object v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    aput-wide v4, v2, v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 74
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 77
    :catch_2
    move-exception v0

    .line 78
    :try_start_5
    new-instance v2, Ltwitter4j/TwitterException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Twitter API returned malformed response: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 129
    if-ne p0, p1, :cond_1

    .line 136
    :cond_0
    :goto_0
    return v0

    .line 130
    :cond_1
    instance-of v2, p1, Ltwitter4j/IDs;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 132
    :cond_2
    check-cast p1, Ltwitter4j/IDs;

    .line 134
    iget-object v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    invoke-interface {p1}, Ltwitter4j/IDs;->getIDs()[J

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final getIDs()[J
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    return-object v0
.end method

.method public final getNextCursor()J
    .locals 2

    .prologue
    .line 124
    iget-wide v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->nextCursor:J

    return-wide v0
.end method

.method public final getPreviousCursor()J
    .locals 2

    .prologue
    .line 108
    iget-wide v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->previousCursor:J

    return-wide v0
.end method

.method public final hasNext()Z
    .locals 4

    .prologue
    .line 116
    const-wide/16 v0, 0x0

    iget-wide v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->nextCursor:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hasPrevious()Z
    .locals 4

    .prologue
    .line 100
    const-wide/16 v0, 0x0

    iget-wide v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->previousCursor:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IDsJSONImpl{ids="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/internal/json/IDsJSONImpl;->ids:[J

    invoke-static {v1}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", previousCursor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->previousCursor:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nextCursor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/internal/json/IDsJSONImpl;->nextCursor:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
