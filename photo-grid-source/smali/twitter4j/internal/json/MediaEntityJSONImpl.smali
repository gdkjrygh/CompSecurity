.class public Ltwitter4j/internal/json/MediaEntityJSONImpl;
.super Ltwitter4j/internal/json/EntityIndex;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/MediaEntity;


# static fields
.field private static final serialVersionUID:J = 0x31d89d002c82b87L


# instance fields
.field private displayURL:Ljava/lang/String;

.field private expandedURL:Ljava/lang/String;

.field private id:J

.field private mediaURL:Ljava/lang/String;

.field private mediaURLHttps:Ljava/lang/String;

.field private sizes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ltwitter4j/MediaEntity$Size;",
            ">;"
        }
    .end annotation
.end field

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Ltwitter4j/internal/json/EntityIndex;-><init>()V

    .line 81
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 4

    .prologue
    .line 44
    invoke-direct {p0}, Ltwitter4j/internal/json/EntityIndex;-><init>()V

    .line 46
    :try_start_0
    const-string v0, "indices"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    .line 47
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONArray;->getInt(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ltwitter4j/internal/json/MediaEntityJSONImpl;->setStart(I)V

    .line 48
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ltwitter4j/internal/org/json/JSONArray;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ltwitter4j/internal/json/MediaEntityJSONImpl;->setEnd(I)V

    .line 49
    const-string v0, "id"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getLong(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)J

    move-result-wide v0

    iput-wide v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->id:J

    .line 51
    const-string v0, "url"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->url:Ljava/lang/String;

    .line 52
    const-string v0, "expanded_url"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->expandedURL:Ljava/lang/String;

    .line 53
    const-string v0, "media_url"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->mediaURL:Ljava/lang/String;

    .line 54
    const-string v0, "media_url_https"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->mediaURLHttps:Ljava/lang/String;

    .line 55
    const-string v0, "display_url"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->displayURL:Ljava/lang/String;

    .line 57
    const-string v0, "sizes"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 58
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->sizes:Ljava/util/Map;

    .line 60
    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->sizes:Ljava/util/Map;

    sget-object v2, Ltwitter4j/MediaEntity$Size;->LARGE:Ljava/lang/Integer;

    const-string v3, "large"

    invoke-direct {p0, v1, v0, v2, v3}, Ltwitter4j/internal/json/MediaEntityJSONImpl;->addMediaEntitySizeIfNotNull(Ljava/util/Map;Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 61
    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->sizes:Ljava/util/Map;

    sget-object v2, Ltwitter4j/MediaEntity$Size;->MEDIUM:Ljava/lang/Integer;

    const-string v3, "medium"

    invoke-direct {p0, v1, v0, v2, v3}, Ltwitter4j/internal/json/MediaEntityJSONImpl;->addMediaEntitySizeIfNotNull(Ljava/util/Map;Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 62
    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->sizes:Ljava/util/Map;

    sget-object v2, Ltwitter4j/MediaEntity$Size;->SMALL:Ljava/lang/Integer;

    const-string v3, "small"

    invoke-direct {p0, v1, v0, v2, v3}, Ltwitter4j/internal/json/MediaEntityJSONImpl;->addMediaEntitySizeIfNotNull(Ljava/util/Map;Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 63
    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->sizes:Ljava/util/Map;

    sget-object v2, Ltwitter4j/MediaEntity$Size;->THUMB:Ljava/lang/Integer;

    const-string v3, "thumb"

    invoke-direct {p0, v1, v0, v2, v3}, Ltwitter4j/internal/json/MediaEntityJSONImpl;->addMediaEntitySizeIfNotNull(Ljava/util/Map;Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 64
    const-string v0, "type"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    const-string v0, "type"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->type:Ljava/lang/String;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :cond_0
    return-void

    .line 67
    :catch_0
    move-exception v0

    .line 68
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method private addMediaEntitySizeIfNotNull(Ljava/util/Map;Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ltwitter4j/MediaEntity$Size;",
            ">;",
            "Ltwitter4j/internal/org/json/JSONObject;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 73
    invoke-virtual {p2, p4}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    new-instance v0, Ltwitter4j/internal/json/MediaEntityJSONImpl$Size;

    invoke-virtual {p2, p4}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/json/MediaEntityJSONImpl$Size;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    invoke-interface {p1, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ltwitter4j/internal/json/EntityIndex;)I
    .locals 1

    .prologue
    .line 33
    invoke-super {p0, p1}, Ltwitter4j/internal/json/EntityIndex;->compareTo(Ltwitter4j/internal/json/EntityIndex;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 229
    if-ne p0, p1, :cond_1

    .line 236
    :cond_0
    :goto_0
    return v0

    .line 230
    :cond_1
    instance-of v2, p1, Ltwitter4j/internal/json/MediaEntityJSONImpl;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 232
    :cond_2
    check-cast p1, Ltwitter4j/internal/json/MediaEntityJSONImpl;

    .line 234
    iget-wide v2, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->id:J

    iget-wide v4, p1, Ltwitter4j/internal/json/MediaEntityJSONImpl;->id:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public getDisplayURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->displayURL:Ljava/lang/String;

    return-object v0
.end method

.method public getEnd()I
    .locals 1

    .prologue
    .line 165
    invoke-super {p0}, Ltwitter4j/internal/json/EntityIndex;->getEnd()I

    move-result v0

    return v0
.end method

.method public getExpandedURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->expandedURL:Ljava/lang/String;

    return-object v0
.end method

.method public getId()J
    .locals 2

    .prologue
    .line 88
    iget-wide v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->id:J

    return-wide v0
.end method

.method public getMediaURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->mediaURL:Ljava/lang/String;

    return-object v0
.end method

.method public getMediaURLHttps()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->mediaURLHttps:Ljava/lang/String;

    return-object v0
.end method

.method public getSizes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ltwitter4j/MediaEntity$Size;",
            ">;"
        }
    .end annotation

    .prologue
    .line 141
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->sizes:Ljava/util/Map;

    return-object v0
.end method

.method public getStart()I
    .locals 1

    .prologue
    .line 157
    invoke-super {p0}, Ltwitter4j/internal/json/EntityIndex;->getStart()I

    move-result v0

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    .line 241
    iget-wide v0, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->id:J

    iget-wide v2, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->id:J

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaEntityJSONImpl{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->id:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->mediaURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaURLHttps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->mediaURLHttps:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expandedURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->expandedURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayURL=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->displayURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sizes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->sizes:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/MediaEntityJSONImpl;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
