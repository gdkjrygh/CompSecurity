.class Ltwitter4j/internal/json/AccountTotalsJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "AccountTotalsJSONImpl.java"

# interfaces
.implements Ltwitter4j/AccountTotals;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x1fccc1c12dc755f3L


# instance fields
.field private final favorites:I

.field private final followers:I

.field private final friends:I

.field private final updates:I


# direct methods
.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "json"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Ltwitter4j/internal/json/AccountTotalsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Lorg/json/JSONObject;)V

    .line 57
    return-void
.end method

.method private constructor <init>(Ltwitter4j/internal/http/HttpResponse;Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .param p2, "json"    # Lorg/json/JSONObject;

    .prologue
    .line 40
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 41
    const-string v0, "updates"

    invoke-static {v0, p2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->updates:I

    .line 42
    const-string v0, "followers"

    invoke-static {v0, p2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->followers:I

    .line 43
    const-string v0, "favorites"

    invoke-static {v0, p2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->favorites:I

    .line 44
    const-string v0, "friends"

    invoke-static {v0, p2}, Ltwitter4j/internal/util/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->friends:I

    .line 45
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;
    .param p2, "conf"    # Ltwitter4j/conf/Configuration;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ltwitter4j/TwitterException;
        }
    .end annotation

    .prologue
    .line 48
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ltwitter4j/internal/json/AccountTotalsJSONImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;Lorg/json/JSONObject;)V

    .line 49
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 51
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {p0, v0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :cond_0
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 77
    if-ne p0, p1, :cond_1

    .line 87
    :cond_0
    :goto_0
    return v1

    .line 78
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

    .line 80
    check-cast v0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;

    .line 82
    .local v0, "that":Ltwitter4j/internal/json/AccountTotalsJSONImpl;
    iget v3, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->favorites:I

    iget v4, v0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->favorites:I

    if-eq v3, v4, :cond_4

    move v1, v2

    goto :goto_0

    .line 83
    :cond_4
    iget v3, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->followers:I

    iget v4, v0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->followers:I

    if-eq v3, v4, :cond_5

    move v1, v2

    goto :goto_0

    .line 84
    :cond_5
    iget v3, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->friends:I

    iget v4, v0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->friends:I

    if-eq v3, v4, :cond_6

    move v1, v2

    goto :goto_0

    .line 85
    :cond_6
    iget v3, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->updates:I

    iget v4, v0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->updates:I

    if-eq v3, v4, :cond_0

    move v1, v2

    goto :goto_0
.end method

.method public getFavorites()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->favorites:I

    return v0
.end method

.method public getFollowers()I
    .locals 1

    .prologue
    .line 64
    iget v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->followers:I

    return v0
.end method

.method public getFriends()I
    .locals 1

    .prologue
    .line 72
    iget v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->friends:I

    return v0
.end method

.method public getUpdates()I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->updates:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 92
    iget v0, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->updates:I

    .line 93
    .local v0, "result":I
    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->followers:I

    add-int v0, v1, v2

    .line 94
    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->favorites:I

    add-int v0, v1, v2

    .line 95
    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->friends:I

    add-int v0, v1, v2

    .line 96
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 101
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "AccountTotalsJSONImpl{updates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->updates:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", followers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->followers:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", favorites="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->favorites:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", friends="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/AccountTotalsJSONImpl;->friends:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
