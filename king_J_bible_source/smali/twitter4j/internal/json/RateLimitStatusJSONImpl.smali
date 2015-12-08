.class final Ltwitter4j/internal/json/RateLimitStatusJSONImpl;
.super Ljava/lang/Object;
.source "RateLimitStatusJSONImpl.java"

# interfaces
.implements Ltwitter4j/RateLimitStatus;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0xb8d1e8292f717f6L


# instance fields
.field private hourlyLimit:I

.field private remainingHits:I

.field private resetTime:Ljava/util/Date;

.field private resetTimeInSeconds:I

.field private secondsUntilReset:I


# direct methods
.method private constructor <init>(IIILjava/util/Date;)V
    .locals 4
    .param p1, "hourlyLimit"    # I
    .param p2, "remainingHits"    # I
    .param p3, "resetTimeInSeconds"    # I
    .param p4, "resetTime"    # Ljava/util/Date;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput p1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->hourlyLimit:I

    .line 47
    iput p2, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->remainingHits:I

    .line 48
    iput-object p4, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    .line 49
    iput p3, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTimeInSeconds:I

    .line 50
    invoke-virtual {p4}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->secondsUntilReset:I

    .line 51
    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 0
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-virtual {p0, p1}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->init(Lorg/json/JSONObject;)V

    .line 64
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 2
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .param p2, "conf"    # Ltwitter4j/conf/Configuration;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 55
    .local v0, "json":Lorg/json/JSONObject;
    invoke-virtual {p0, v0}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->init(Lorg/json/JSONObject;)V

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

.method static createFeatureSpecificRateLimitStatusFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;
    .locals 14
    .param p0, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    const-wide/16 v12, 0x3e8

    const/4 v9, 0x0

    .line 107
    if-nez p0, :cond_1

    .line 135
    :cond_0
    :goto_0
    return-object v9

    .line 115
    :cond_1
    const-string v10, "X-FeatureRateLimit-Limit"

    invoke-virtual {p0, v10}, Ltwitter4j/internal/http/HttpResponse;->getResponseHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 116
    .local v1, "limit":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 117
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 121
    .local v0, "hourlyLimit":I
    const-string v10, "X-FeatureRateLimit-Remaining"

    invoke-virtual {p0, v10}, Ltwitter4j/internal/http/HttpResponse;->getResponseHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 122
    .local v4, "remaining":Ljava/lang/String;
    if-eqz v4, :cond_0

    .line 123
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 127
    .local v5, "remainingHits":I
    const-string v10, "X-FeatureRateLimit-Reset"

    invoke-virtual {p0, v10}, Ltwitter4j/internal/http/HttpResponse;->getResponseHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 128
    .local v6, "reset":Ljava/lang/String;
    if-eqz v6, :cond_0

    .line 129
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 130
    .local v2, "longReset":J
    div-long v10, v2, v12

    long-to-int v8, v10

    .line 131
    .local v8, "resetTimeInSeconds":I
    new-instance v7, Ljava/util/Date;

    mul-long v10, v2, v12

    invoke-direct {v7, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 135
    .local v7, "resetTime":Ljava/util/Date;
    new-instance v9, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;

    invoke-direct {v9, v0, v5, v8, v7}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;-><init>(IIILjava/util/Date;)V

    goto :goto_0
.end method

.method static createFromResponseHeader(Ltwitter4j/internal/http/HttpResponse;)Ltwitter4j/RateLimitStatus;
    .locals 14
    .param p0, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    const-wide/16 v12, 0x3e8

    const/4 v9, 0x0

    .line 75
    if-nez p0, :cond_1

    .line 103
    :cond_0
    :goto_0
    return-object v9

    .line 83
    :cond_1
    const-string v10, "X-RateLimit-Limit"

    invoke-virtual {p0, v10}, Ltwitter4j/internal/http/HttpResponse;->getResponseHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 84
    .local v1, "limit":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 89
    .local v0, "hourlyLimit":I
    const-string v10, "X-RateLimit-Remaining"

    invoke-virtual {p0, v10}, Ltwitter4j/internal/http/HttpResponse;->getResponseHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 90
    .local v4, "remaining":Ljava/lang/String;
    if-eqz v4, :cond_0

    .line 91
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 95
    .local v5, "remainingHits":I
    const-string v10, "X-RateLimit-Reset"

    invoke-virtual {p0, v10}, Ltwitter4j/internal/http/HttpResponse;->getResponseHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 96
    .local v6, "reset":Ljava/lang/String;
    if-eqz v6, :cond_0

    .line 97
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 98
    .local v2, "longReset":J
    div-long v10, v2, v12

    long-to-int v8, v10

    .line 99
    .local v8, "resetTimeInSeconds":I
    new-instance v7, Ljava/util/Date;

    mul-long v10, v2, v12

    invoke-direct {v7, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 103
    .local v7, "resetTime":Ljava/util/Date;
    new-instance v9, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;

    invoke-direct {v9, v0, v5, v8, v7}, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;-><init>(IIILjava/util/Date;)V

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 175
    if-ne p0, p1, :cond_1

    .line 187
    :cond_0
    :goto_0
    return v1

    .line 176
    :cond_1
    instance-of v3, p1, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;

    if-nez v3, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move-object v0, p1

    .line 178
    check-cast v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;

    .line 180
    .local v0, "that":Ltwitter4j/internal/json/RateLimitStatusJSONImpl;
    iget v3, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->hourlyLimit:I

    iget v4, v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->hourlyLimit:I

    if-eq v3, v4, :cond_3

    move v1, v2

    goto :goto_0

    .line 181
    :cond_3
    iget v3, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->remainingHits:I

    iget v4, v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->remainingHits:I

    if-eq v3, v4, :cond_4

    move v1, v2

    goto :goto_0

    .line 182
    :cond_4
    iget v3, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTimeInSeconds:I

    iget v4, v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTimeInSeconds:I

    if-eq v3, v4, :cond_5

    move v1, v2

    goto :goto_0

    .line 183
    :cond_5
    iget v3, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->secondsUntilReset:I

    iget v4, v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->secondsUntilReset:I

    if-eq v3, v4, :cond_6

    move v1, v2

    goto :goto_0

    .line 184
    :cond_6
    iget-object v3, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    if-eqz v3, :cond_7

    iget-object v3, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    iget-object v4, v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    invoke-virtual {v3, v4}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :goto_1
    move v1, v2

    .line 185
    goto :goto_0

    .line 184
    :cond_7
    iget-object v3, v0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    if-eqz v3, :cond_0

    goto :goto_1
.end method

.method public getHourlyLimit()I
    .locals 1

    .prologue
    .line 149
    iget v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->hourlyLimit:I

    return v0
.end method

.method public getRemainingHits()I
    .locals 1

    .prologue
    .line 142
    iget v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->remainingHits:I

    return v0
.end method

.method public getResetTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    return-object v0
.end method

.method public getResetTimeInSeconds()I
    .locals 1

    .prologue
    .line 156
    iget v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTimeInSeconds:I

    return v0
.end method

.method public getSecondsUntilReset()I
    .locals 1

    .prologue
    .line 163
    iget v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->secondsUntilReset:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 192
    iget v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->remainingHits:I

    .line 193
    .local v0, "result":I
    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->hourlyLimit:I

    add-int v0, v1, v2

    .line 194
    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTimeInSeconds:I

    add-int v0, v1, v2

    .line 195
    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->secondsUntilReset:I

    add-int v0, v1, v2

    .line 196
    mul-int/lit8 v2, v0, 0x1f

    iget-object v1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_0
    add-int v0, v2, v1

    .line 197
    return v0

    .line 196
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method init(Lorg/json/JSONObject;)V
    .locals 4
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 67
    const-string v0, "hourly_limit"

    invoke-static {v0, p1}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->hourlyLimit:I

    .line 68
    const-string v0, "remaining_hits"

    invoke-static {v0, p1}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->remainingHits:I

    .line 69
    const-string v0, "reset_time"

    const-string v1, "EEE MMM d HH:mm:ss Z yyyy"

    invoke-static {v0, p1, v1}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getDate(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    .line 70
    const-string v0, "reset_time_in_seconds"

    invoke-static {v0, p1}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTimeInSeconds:I

    .line 71
    iget-object v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->secondsUntilReset:I

    .line 72
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 202
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "RateLimitStatusJSONImpl{remainingHits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->remainingHits:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", hourlyLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->hourlyLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", resetTimeInSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTimeInSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", secondsUntilReset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->secondsUntilReset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", resetTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/RateLimitStatusJSONImpl;->resetTime:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
