.class final Ltwitter4j/internal/json/CategoryJSONImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/Category;


# static fields
.field private static final serialVersionUID:J = -0x5d0808d20eabf6f6L


# instance fields
.field private name:Ljava/lang/String;

.field private size:I

.field private slug:Ljava/lang/String;


# direct methods
.method constructor <init>(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p0, p1}, Ltwitter4j/internal/json/CategoryJSONImpl;->init(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 41
    return-void
.end method

.method static createCategoriesList(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Category;",
            ">;"
        }
    .end annotation

    .prologue
    .line 50
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asJSONArray()Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    invoke-static {v0, p0, p1}, Ltwitter4j/internal/json/CategoryJSONImpl;->createCategoriesList(Ltwitter4j/internal/org/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;

    move-result-object v0

    return-object v0
.end method

.method static createCategoriesList(Ltwitter4j/internal/org/json/JSONArray;Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/conf/Configuration;)Ltwitter4j/ResponseList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltwitter4j/internal/org/json/JSONArray;",
            "Ltwitter4j/internal/http/HttpResponse;",
            "Ltwitter4j/conf/Configuration;",
            ")",
            "Ltwitter4j/ResponseList",
            "<",
            "Ltwitter4j/Category;",
            ">;"
        }
    .end annotation

    .prologue
    .line 55
    :try_start_0
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-static {}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->clearThreadLocalMap()V

    .line 58
    :cond_0
    new-instance v1, Ltwitter4j/internal/json/ResponseListImpl;

    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v0

    invoke-direct {v1, v0, p1}, Ltwitter4j/internal/json/ResponseListImpl;-><init>(ILtwitter4j/internal/http/HttpResponse;)V

    .line 60
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 61
    invoke-virtual {p0, v0}, Ltwitter4j/internal/org/json/JSONArray;->getJSONObject(I)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v2

    .line 62
    new-instance v3, Ltwitter4j/internal/json/CategoryJSONImpl;

    invoke-direct {v3, v2}, Ltwitter4j/internal/json/CategoryJSONImpl;-><init>(Ltwitter4j/internal/org/json/JSONObject;)V

    .line 63
    invoke-interface {v1, v3}, Ltwitter4j/ResponseList;->add(Ljava/lang/Object;)Z

    .line 64
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 65
    invoke-static {v3, v2}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 68
    :cond_2
    invoke-interface {p2}, Ltwitter4j/conf/Configuration;->isJSONStoreEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 69
    invoke-static {v1, p0}, Ltwitter4j/internal/json/DataObjectFactoryUtil;->registerJSONObject(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :cond_3
    return-object v1

    .line 72
    :catch_0
    move-exception v0

    .line 73
    new-instance v1, Ltwitter4j/TwitterException;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 98
    if-ne p0, p1, :cond_1

    .line 109
    :cond_0
    :goto_0
    return v0

    .line 99
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

    .line 101
    :cond_3
    check-cast p1, Ltwitter4j/internal/json/CategoryJSONImpl;

    .line 103
    iget v2, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->size:I

    iget v3, p1, Ltwitter4j/internal/json/CategoryJSONImpl;->size:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 104
    :cond_4
    iget-object v2, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v2, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_5
    move v0, v1

    .line 105
    goto :goto_0

    .line 104
    :cond_6
    iget-object v2, p1, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 106
    :cond_7
    iget-object v2, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v2, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 107
    goto :goto_0

    .line 106
    :cond_8
    iget-object v2, p1, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->size:I

    return v0
.end method

.method public final getSlug()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 114
    iget-object v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 115
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 116
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->size:I

    add-int/2addr v0, v1

    .line 117
    return v0

    :cond_1
    move v0, v1

    .line 114
    goto :goto_0
.end method

.method final init(Ltwitter4j/internal/org/json/JSONObject;)V
    .locals 1

    .prologue
    .line 44
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    .line 45
    const-string v0, "slug"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    .line 46
    const-string v0, "size"

    invoke-static {v0, p1}, Ltwitter4j/internal/json/z_T4JInternalParseUtil;->getInt(Ljava/lang/String;Ltwitter4j/internal/org/json/JSONObject;)I

    move-result v0

    iput v0, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->size:I

    .line 47
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v2, 0x27

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CategoryJSONImpl{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", slug=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->slug:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/internal/json/CategoryJSONImpl;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
