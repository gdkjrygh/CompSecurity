.class public final Lcom/mobvista/sdk/m/core/loader/a;
.super Lcom/mobvista/sdk/m/a/a/c/a;
.source "360Security"


# instance fields
.field private c:I

.field private d:Lcom/mobvista/sdk/m/core/c/f;

.field private e:Ljava/util/List;

.field private f:Landroid/content/Context;

.field private g:I

.field private h:I

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 41
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/a/c/a;-><init>()V

    .line 33
    const/4 v0, 0x5

    iput v0, p0, Lcom/mobvista/sdk/m/core/loader/a;->c:I

    .line 34
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/loader/a;->d:Lcom/mobvista/sdk/m/core/c/f;

    .line 35
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/loader/a;->e:Ljava/util/List;

    .line 36
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/loader/a;->f:Landroid/content/Context;

    .line 37
    iput v2, p0, Lcom/mobvista/sdk/m/core/loader/a;->g:I

    .line 38
    iput v2, p0, Lcom/mobvista/sdk/m/core/loader/a;->h:I

    .line 42
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/util/List;
    .locals 16

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 115
    const-string/jumbo v2, "APILoader"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "RESPONSE: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/core/loader/a;->d:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/c/c;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/c;

    move-result-object v7

    .line 119
    invoke-virtual {v7}, Lcom/mobvista/sdk/m/core/c/c;->a()V

    .line 121
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 124
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    move-object/from16 v0, p1

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 126
    const-string/jumbo v3, "status"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    .line 127
    const-string/jumbo v4, "msg"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 128
    const-string/jumbo v9, "only_impression_url"

    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 130
    if-ne v3, v6, :cond_4

    .line 132
    const-string/jumbo v3, "data"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    move v4, v5

    .line 134
    :goto_0
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v4, v2, :cond_3

    .line 135
    invoke-virtual {v10, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lorg/json/JSONObject;

    move-object v3, v0

    .line 137
    new-instance v11, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-direct {v11}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;-><init>()V

    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v12, "id"

    const-wide/16 v14, 0x0

    invoke-virtual {v3, v12, v14, v15}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setId(Ljava/lang/String;)V

    .line 139
    const-string/jumbo v2, "title"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setAppName(Ljava/lang/String;)V

    .line 140
    const-string/jumbo v2, "package_name"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setPackageName(Ljava/lang/String;)V

    .line 141
    const-string/jumbo v2, "desc"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setAppDesc(Ljava/lang/String;)V

    .line 142
    const-string/jumbo v2, "size"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setSize(Ljava/lang/String;)V

    .line 144
    const-string/jumbo v2, "icon_url"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setIconUrl(Ljava/lang/String;)V

    .line 145
    const-string/jumbo v2, "image_url"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setImageUrl(Ljava/lang/String;)V

    .line 147
    const-string/jumbo v2, "impression_url"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setImpressionURL(Ljava/lang/String;)V

    .line 149
    const-string/jumbo v2, "click_url"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setClickURL(Ljava/lang/String;)V

    .line 150
    const-string/jumbo v2, "notice_url"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setNoticeUrl(Ljava/lang/String;)V

    .line 152
    const-string/jumbo v2, "pre_click"

    const/4 v12, 0x0

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setPreClick(Z)V

    .line 153
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setTimestamp(J)V

    .line 155
    invoke-virtual {v11, v9}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setOnlyImpressionURL(Ljava/lang/String;)V

    .line 156
    const-string/jumbo v2, "bg_image"

    const-string/jumbo v12, ""

    invoke-virtual {v3, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setBgImage(Ljava/lang/String;)V

    .line 158
    move-object/from16 v0, p0

    iget v2, v0, Lcom/mobvista/sdk/m/core/loader/a;->g:I

    invoke-virtual {v11, v2}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->setTab(I)V

    .line 162
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/core/loader/a;->e:Ljava/util/List;

    if-eqz v2, :cond_5

    .line 163
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/core/loader/a;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 164
    invoke-virtual {v11}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v6

    .line 171
    :goto_1
    if-nez v2, :cond_2

    .line 172
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    invoke-virtual {v11}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/mobvista/sdk/m/core/loader/a;->i:Ljava/lang/String;

    invoke-virtual {v7, v2, v12}, Lcom/mobvista/sdk/m/core/c/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 176
    new-instance v2, Lcom/mobvista/sdk/m/core/entity/a;

    invoke-direct {v2}, Lcom/mobvista/sdk/m/core/entity/a;-><init>()V

    .line 177
    invoke-virtual {v11}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Lcom/mobvista/sdk/m/core/entity/a;->a(Ljava/lang/String;)V

    .line 178
    const-string/jumbo v11, "fca"

    const/16 v12, 0xa

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v11

    invoke-virtual {v2, v11}, Lcom/mobvista/sdk/m/core/entity/a;->a(I)V

    .line 179
    const-string/jumbo v11, "fcb"

    const/16 v12, 0xa

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/mobvista/sdk/m/core/entity/a;->b(I)V

    .line 180
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/mobvista/sdk/m/core/entity/a;->d(I)V

    .line 181
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/mobvista/sdk/m/core/entity/a;->c(I)V

    .line 182
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Lcom/mobvista/sdk/m/core/entity/a;->a(J)V

    .line 183
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/mobvista/sdk/m/core/loader/a;->i:Ljava/lang/String;

    invoke-virtual {v7, v2, v3}, Lcom/mobvista/sdk/m/core/c/c;->a(Lcom/mobvista/sdk/m/core/entity/a;Ljava/lang/String;)V

    .line 134
    :cond_1
    :goto_2
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto/16 :goto_0

    .line 191
    :cond_2
    new-instance v2, Lcom/mobvista/sdk/m/core/entity/a;

    invoke-direct {v2}, Lcom/mobvista/sdk/m/core/entity/a;-><init>()V

    .line 192
    invoke-virtual {v11}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/mobvista/sdk/m/core/entity/a;->a(Ljava/lang/String;)V

    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Lcom/mobvista/sdk/m/core/entity/a;->a(J)V

    .line 194
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/mobvista/sdk/m/core/loader/a;->i:Ljava/lang/String;

    invoke-virtual {v7, v2, v3}, Lcom/mobvista/sdk/m/core/c/c;->a(Lcom/mobvista/sdk/m/core/entity/a;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 206
    :catch_0
    move-exception v2

    .line 207
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 210
    :goto_3
    return-object v8

    .line 200
    :cond_3
    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/core/loader/a;->d:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v2

    .line 201
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/mobvista/sdk/m/core/loader/a;->i:Ljava/lang/String;

    invoke-virtual {v2, v8, v3}, Lcom/mobvista/sdk/m/core/c/b;->a(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_3

    .line 204
    :cond_4
    const-string/jumbo v2, "APILoader"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "APILoader error: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :cond_5
    move v2, v5

    goto/16 :goto_1
.end method

.method private a([B)Ljava/util/List;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 96
    if-eqz p1, :cond_0

    array-length v1, p1

    if-lez v1, :cond_0

    .line 97
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    .line 98
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 103
    :cond_0
    :goto_0
    return-object v0

    .line 101
    :cond_1
    invoke-direct {p0, v1}, Lcom/mobvista/sdk/m/core/loader/a;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method private b()Ljava/lang/String;
    .locals 8

    .prologue
    .line 219
    const-string/jumbo v0, ""

    .line 220
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/a;->d:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v1}, Lcom/mobvista/sdk/m/core/c/c;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/c;

    move-result-object v1

    .line 221
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/a;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/core/c/c;->a(Ljava/lang/String;)[J

    move-result-object v2

    .line 222
    if-eqz v2, :cond_1

    .line 223
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 224
    array-length v4, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-wide v6, v2, v1

    .line 225
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 224
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 227
    :cond_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 228
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    .line 232
    :cond_1
    new-instance v1, Lcom/mobvista/sdk/m/a/f/e;

    invoke-direct {v1}, Lcom/mobvista/sdk/m/a/f/e;-><init>()V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/a;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/a/f/e;->a(Ljava/lang/String;)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v1

    iget v2, p0, Lcom/mobvista/sdk/m/core/loader/a;->c:I

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/a/f/e;->b(I)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v1

    iget v2, p0, Lcom/mobvista/sdk/m/core/loader/a;->g:I

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/a/f/e;->a(I)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v1

    iget v2, p0, Lcom/mobvista/sdk/m/core/loader/a;->h:I

    invoke-virtual {v1, v2}, Lcom/mobvista/sdk/m/a/f/e;->c(I)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/a/f/e;->b(Ljava/lang/String;)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/f/e;->b()Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/f/e;->a()Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/f/e;->d(I)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/a;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/f/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/util/Map;[B)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0, p2}, Lcom/mobvista/sdk/m/core/loader/a;->a([B)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "http://net.rayjump.com/openapi/ad/v2?"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 72
    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Lcom/mobvista/sdk/m/core/loader/a;->g:I

    .line 55
    return-void
.end method

.method public final a(ILjava/util/List;Lcom/mobvista/sdk/m/core/c/f;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    iput p1, p0, Lcom/mobvista/sdk/m/core/loader/a;->c:I

    .line 47
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/loader/a;->d:Lcom/mobvista/sdk/m/core/c/f;

    .line 48
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/a;->e:Ljava/util/List;

    .line 49
    iput-object p4, p0, Lcom/mobvista/sdk/m/core/loader/a;->f:Landroid/content/Context;

    .line 50
    iput-object p5, p0, Lcom/mobvista/sdk/m/core/loader/a;->i:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x2

    iput v0, p0, Lcom/mobvista/sdk/m/core/loader/a;->h:I

    .line 59
    return-void
.end method
