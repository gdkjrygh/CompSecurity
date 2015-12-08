.class public Lcom/cleanmaster/ui/app/market/data/MarketResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ads:Ljava/util/List;

.field private mHeader:Lcom/cleanmaster/ui/app/market/data/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/a;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 86
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 115
    :goto_0
    return-object v0

    .line 92
    :cond_0
    :try_start_0
    new-instance v1, Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-direct {v1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 94
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/a;-><init>()V

    invoke-virtual {v0, v2}, Lcom/cleanmaster/ui/app/market/data/a;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/data/a;

    .line 95
    invoke-virtual {v1, v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->setHeader(Lcom/cleanmaster/ui/app/market/data/a;)V

    .line 97
    const-string v0, "ads"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 100
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 101
    if-eqz v3, :cond_1

    .line 104
    invoke-static {p0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->newAd(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/cleanmaster/ui/app/market/Ad;->fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->addAd(Lcom/cleanmaster/ui/app/market/Ad;)V

    .line 99
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 108
    :cond_2
    invoke-static {p0}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient$MarketRequestBuilder;->isAppRequest(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 109
    invoke-virtual {v1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads()Ljava/util/List;

    move-result-object v0

    .line 110
    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_3
    move-object v0, v1

    .line 114
    goto :goto_0

    .line 113
    :catch_0
    move-exception v1

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_2
.end method

.method public static fromJson2(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 123
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 145
    :goto_0
    return-object v0

    .line 130
    :cond_0
    :try_start_0
    new-instance v1, Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-direct {v1}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 132
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/a;-><init>()V

    invoke-virtual {v0, v2}, Lcom/cleanmaster/ui/app/market/data/a;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/data/a;

    .line 133
    invoke-virtual {v1, v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->setHeader(Lcom/cleanmaster/ui/app/market/data/a;)V

    .line 135
    const-string v0, "ads"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 136
    if-eqz v2, :cond_1

    .line 137
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 138
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 139
    new-instance v4, Lcom/cleanmaster/ui/app/market/Ad;

    invoke-direct {v4}, Lcom/cleanmaster/ui/app/market/Ad;-><init>()V

    invoke-virtual {v4, v3}, Lcom/cleanmaster/ui/app/market/Ad;->fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->addAd(Lcom/cleanmaster/ui/app/market/Ad;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 137
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 144
    goto :goto_0

    .line 143
    :catch_0
    move-exception v1

    :goto_2
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_2
.end method

.method private static newAd(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;
    .locals 1

    .prologue
    .line 167
    const-string v0, "15001"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    new-instance v0, Lcom/cleanmaster/ui/app/market/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/a;-><init>()V

    .line 170
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/cleanmaster/ui/app/market/Ad;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/Ad;-><init>()V

    goto :goto_0
.end method


# virtual methods
.method public addAd(Lcom/cleanmaster/ui/app/market/Ad;)V
    .locals 1

    .prologue
    .line 64
    if-nez p1, :cond_0

    .line 69
    :goto_0
    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public addAds(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 149
    if-eqz p1, :cond_0

    .line 150
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 152
    :cond_0
    return-void
.end method

.method public adn()I
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    iget v0, v0, Lcom/cleanmaster/ui/app/market/data/a;->b:I

    return v0
.end method

.method public ads()Ljava/util/List;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    return-object v0
.end method

.method public code()I
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    iget v0, v0, Lcom/cleanmaster/ui/app/market/data/a;->a:I

    return v0
.end method

.method public extAds()Ljava/util/List;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    return-object v0
.end method

.method public filter(Lcom/cleanmaster/ui/app/market/data/filter/a;)V
    .locals 4

    .prologue
    .line 175
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 177
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 178
    invoke-virtual {v0, p1}, Lcom/cleanmaster/ui/app/market/Ad;->match(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 179
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 183
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 184
    iget-object v2, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 188
    :cond_2
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 189
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 190
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 191
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->isDeepLink()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/cleanmaster/common/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 194
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    .line 197
    :cond_4
    return-void
.end method

.method public getHeader()Lcom/cleanmaster/ui/app/market/data/a;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    return-object v0
.end method

.method public getShowRating()I
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    iget v0, v0, Lcom/cleanmaster/ui/app/market/data/a;->d:I

    return v0
.end method

.method public getShowType()I
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    iget v0, v0, Lcom/cleanmaster/ui/app/market/data/a;->e:I

    return v0
.end method

.method public offset()I
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    iget v0, v0, Lcom/cleanmaster/ui/app/market/data/a;->c:I

    return v0
.end method

.method public setHeader(Lcom/cleanmaster/ui/app/market/data/a;)V
    .locals 0

    .prologue
    .line 119
    if-nez p1, :cond_0

    new-instance p1, Lcom/cleanmaster/ui/app/market/data/a;

    invoke-direct {p1}, Lcom/cleanmaster/ui/app/market/data/a;-><init>()V

    :cond_0
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    .line 120
    return-void
.end method

.method public success()Z
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    iget v0, v0, Lcom/cleanmaster/ui/app/market/data/a;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    const-string v0, "(MarketResponse %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->mHeader:Lcom/cleanmaster/ui/app/market/data/a;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    const-string v0, ":ads\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->ads:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/b;

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 81
    :cond_0
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
