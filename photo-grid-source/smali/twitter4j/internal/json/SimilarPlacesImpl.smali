.class public Ltwitter4j/internal/json/SimilarPlacesImpl;
.super Ltwitter4j/internal/json/ResponseListImpl;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/SimilarPlaces;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltwitter4j/internal/json/ResponseListImpl",
        "<",
        "Ltwitter4j/Place;",
        ">;",
        "Ltwitter4j/SimilarPlaces;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6d9aa5641015e03bL


# instance fields
.field private final token:Ljava/lang/String;


# direct methods
.method constructor <init>(Ltwitter4j/ResponseList;Ltwitter4j/internal/http/HttpResponse;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Place;",
            ">;",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-interface {p1}, Ltwitter4j/ResponseList;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    .line 38
    invoke-virtual {p0, p1}, Ltwitter4j/internal/json/SimilarPlacesImpl;->addAll(Ljava/util/Collection;)Z

    .line 39
    iput-object p3, p0, Ltwitter4j/internal/json/SimilarPlacesImpl;->token:Ljava/lang/String;

    .line 40
    return-void
.end method

.method static createSimilarPlaces(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/SimilarPlaces;
    .locals 5

    .prologue
    .line 52
    const/4 v1, 0x0

    .line 54
    :try_start_0
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v1

    .line 55
    const-string v0, "result"

    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 56
    new-instance v2, Ltwitter4j/internal/json/SimilarPlacesImpl;

    const-string v3, "places"

    invoke-virtual {v0, v3}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v3

    invoke-static {v3, p0, p1}, Ltwitter4j/internal/json/PlaceJSONImpl;->createPlaceList(Ltwitter4j/internal/org/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v3

    const-string v4, "token"

    invoke-virtual {v0, v4}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, p0, v0}, Ltwitter4j/internal/json/SimilarPlacesImpl;-><init>(Ltwitter4j/ResponseList;Ltwitter4j/internal/http/HttpResponse;Ljava/lang/String;)V
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 58
    :catch_0
    move-exception v0

    .line 59
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
.end method


# virtual methods
.method public bridge synthetic getAccessLevel()I
    .locals 1

    .prologue
    .line 32
    invoke-super {p0}, Ltwitter4j/internal/json/ResponseListImpl;->getAccessLevel()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getRateLimitStatus()Ltwitter4j/RateLimitStatus;
    .locals 1

    .prologue
    .line 32
    invoke-super {p0}, Ltwitter4j/internal/json/ResponseListImpl;->getRateLimitStatus()Ltwitter4j/RateLimitStatus;

    move-result-object v0

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Ltwitter4j/internal/json/SimilarPlacesImpl;->token:Ljava/lang/String;

    return-object v0
.end method
