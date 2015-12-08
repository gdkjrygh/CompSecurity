.class final Ltwitter4j/internal/json/SavedSearchJSONImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/SavedSearch;


# static fields
.field private static final serialVersionUID:J = 0x2acbedd301ef9884L


# instance fields
.field private createdAt:Ljava/util/Date;

.field private id:I

.field private name:Ljava/lang/String;

.field private position:I

.field private query:Ljava/lang/String;


# direct methods
.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)V
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 49
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 52
    :cond_0
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpResponse;->asJSONObject()Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    .line 53
    invoke-direct {p0, v0}, Ltwitter4j/internal/json/SavedSearchJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 54
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 55
    invoke-static {p0, v0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_1
    return-void
.end method

.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>()V

    .line 60
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/SavedSearchJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 61
    return-void
.end method

.method static createSavedSearchList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/SavedSearch;",
            ">;"
        }
    .end annotation

    .prologue
    .line 65
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 68
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asJSONArray()Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v1

    .line 71
    :try_start_0
    new-instance v2, Ltwitter4j/internal/json/ResponseListImpl;

    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v0

    invoke-direct {v2, v0, p0}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    .line 72
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 73
    invoke-virtual {v1, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v3

    .line 74
    new-instance v4, Ltwitter4j/internal/json/SavedSearchJSONImpl;

    invoke-direct {v4, v3}, Ltwitter4j/internal/json/SavedSearchJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 75
    invoke-interface {v2, v4}, Ltwitter4j/ResponseList;->add(Ljava/lang/Object;)Z

    .line 76
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 77
    invoke-static {v4, v3}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 80
    :cond_2
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    invoke-static {v2, v1}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :cond_3
    return-object v2

    .line 84
    :catch_0
    move-exception v0

    .line 85
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

    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private init(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 2

    .prologue
    .line 90
    const-string v0, "created_at"

    const-string v1, "EEE MMM dd HH:mm:ss z yyyy"

    invoke-static {v0, p1, v1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getDate(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->createdAt:Ljava/util/Date;

    .line 91
    const-string v0, "query"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->query:Ljava/lang/String;

    .line 92
    const-string v0, "position"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->position:I

    .line 93
    const-string v0, "name"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getUnescapedString(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->name:Ljava/lang/String;

    .line 94
    const-string v0, "id"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->id:I

    .line 95
    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 38
    check-cast p1, Ltwitter4j/SavedSearch;

    invoke-virtual {p0, p1}, Ltwitter4j/internal/json/SavedSearchJSONImpl;->compareTo(Ltwitter4j/SavedSearch;)I

    move-result v0

    return v0
.end method

.method public final compareTo(Ltwitter4j/SavedSearch;)I
    .locals 2

    .prologue
    .line 99
    iget v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->id:I

    invoke-interface {p1}, Ltwitter4j/SavedSearch;->getId()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 144
    if-ne p0, p1, :cond_1

    .line 151
    :cond_0
    :goto_0
    return v0

    .line 145
    :cond_1
    instance-of v2, p1, Ltwitter4j/SavedSearch;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 147
    :cond_2
    check-cast p1, Ltwitter4j/SavedSearch;

    .line 149
    iget v2, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->id:I

    invoke-interface {p1}, Ltwitter4j/SavedSearch;->getId()I

    move-result v3

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    .prologue
    .line 139
    iget v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->id:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPosition()I
    .locals 1

    .prologue
    .line 123
    iget v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->position:I

    return v0
.end method

.method public final getQuery()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->query:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 156
    iget-object v0, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->createdAt:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    .line 157
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->query:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 158
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->position:I

    add-int/2addr v0, v1

    .line 159
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 160
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->id:I

    add-int/2addr v0, v1

    .line 161
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v2, 0x27

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SavedSearchJSONImpl{createdAt="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->createdAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", query=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->query:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->position:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/SavedSearchJSONImpl;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
