.class public final Lcom/googlecode/flickrjandroid/stats/StatsUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method

.method public static createDomain(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/stats/Domain;
    .locals 2

    .prologue
    .line 77
    new-instance v0, Lcom/googlecode/flickrjandroid/stats/Domain;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/stats/Domain;-><init>()V

    .line 78
    const-string v1, "name"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/stats/Domain;->setName(Ljava/lang/String;)V

    .line 79
    const-string v1, "views"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/stats/Domain;->setViews(I)V

    .line 80
    return-object v0
.end method

.method public static createDomainList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/stats/DomainList;
    .locals 4

    .prologue
    .line 64
    new-instance v1, Lcom/googlecode/flickrjandroid/stats/DomainList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/stats/DomainList;-><init>()V

    .line 65
    const-string v0, "perpage"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/DomainList;->setPerPage(I)V

    .line 66
    const-string v0, "pages"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/DomainList;->setPages(I)V

    .line 67
    const-string v0, "page"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/DomainList;->setPage(I)V

    .line 68
    const-string v0, "total"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/DomainList;->setTotal(I)V

    .line 69
    const-string v0, "domain"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 70
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_1

    .line 73
    :cond_0
    return-object v1

    .line 71
    :cond_1
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/googlecode/flickrjandroid/stats/StatsUtils;->createDomain(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/stats/Domain;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/stats/DomainList;->add(Ljava/lang/Object;)Z

    .line 70
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static createReferrer(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/stats/Referrer;
    .locals 3

    .prologue
    .line 50
    new-instance v0, Lcom/googlecode/flickrjandroid/stats/Referrer;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/stats/Referrer;-><init>()V

    .line 51
    const-string v1, "url"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 52
    if-eqz v1, :cond_0

    .line 54
    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/googlecode/flickrjandroid/stats/Referrer;->setUrl(Ljava/net/URL;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    :cond_0
    :goto_0
    const-string v1, "views"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/stats/Referrer;->setViews(I)V

    .line 59
    const-string v1, "searchterm"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/stats/Referrer;->setSearchterm(Ljava/lang/String;)V

    .line 60
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static createReferrerList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/stats/ReferrerList;
    .locals 4

    .prologue
    .line 36
    new-instance v1, Lcom/googlecode/flickrjandroid/stats/ReferrerList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/stats/ReferrerList;-><init>()V

    .line 37
    const-string v0, "perpage"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->setPerPage(I)V

    .line 38
    const-string v0, "pages"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->setPages(I)V

    .line 39
    const-string v0, "page"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->setPage(I)V

    .line 40
    const-string v0, "total"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->setTotal(I)V

    .line 41
    const-string v0, "name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->setName(Ljava/lang/String;)V

    .line 42
    const-string v0, "referrer"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 43
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_1

    .line 46
    :cond_0
    return-object v1

    .line 44
    :cond_1
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/googlecode/flickrjandroid/stats/StatsUtils;->createReferrer(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/stats/Referrer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->add(Ljava/lang/Object;)Z

    .line 43
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static createStats(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/stats/Stats;
    .locals 3

    .prologue
    .line 27
    const-string v0, "stats"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 28
    new-instance v1, Lcom/googlecode/flickrjandroid/stats/Stats;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/stats/Stats;-><init>()V

    .line 29
    const-string v2, "comments"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/stats/Stats;->setComments(I)V

    .line 30
    const-string v2, "views"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/stats/Stats;->setViews(I)V

    .line 31
    const-string v2, "favorites"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/stats/Stats;->setFavorites(I)V

    .line 32
    return-object v1
.end method
