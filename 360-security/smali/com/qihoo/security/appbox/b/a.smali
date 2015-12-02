.class public Lcom/qihoo/security/appbox/b/a;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method private static a(Ljava/lang/String;)F
    .locals 1

    .prologue
    .line 119
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 121
    :goto_0
    return v0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/c;
    .locals 4

    .prologue
    .line 86
    new-instance v0, Lcom/qihoo/security/appbox/core/c;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/c;-><init>()V

    .line 88
    const-string/jumbo v1, "picks_pic_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    .line 90
    const-string/jumbo v1, "banner_pic_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->d:Ljava/lang/String;

    .line 92
    const-string/jumbo v1, "googleplay_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->f:Ljava/lang/String;

    .line 94
    const-string/jumbo v1, "gp_url_type"

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/c;->g:I

    .line 96
    const-string/jumbo v1, "icon_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    .line 98
    const-string/jumbo v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->i:Ljava/lang/String;

    .line 100
    const-string/jumbo v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    .line 102
    const-string/jumbo v1, "pkg_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    .line 104
    const-string/jumbo v1, "size"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    int-to-long v2, v1

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/c;->l:J

    .line 106
    const-string/jumbo v1, "star_level"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/appbox/b/a;->a(Ljava/lang/String;)F

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/core/c;->m:F

    .line 108
    const-string/jumbo v1, "summary"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    .line 110
    const-string/jumbo v1, "type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->n:Ljava/lang/String;

    .line 112
    iget-object v1, v0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    invoke-static {p0, v1}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/qihoo/security/appbox/core/c;->c:Z

    .line 114
    return-object v0
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 48
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 50
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 51
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    .line 52
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 53
    invoke-static {p0, v4}, Lcom/qihoo/security/appbox/b/a;->a(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/c;

    move-result-object v4

    .line 54
    add-int v5, p3, v0

    iput v5, v4, Lcom/qihoo/security/appbox/core/c;->a:I

    .line 55
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 57
    :cond_0
    const-string/jumbo v0, "banner"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 58
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 60
    :cond_1
    return-object v1
.end method

.method public static a(Lcom/qihoo/security/appbox/core/c;)Lorg/json/JSONObject;
    .locals 4

    .prologue
    .line 64
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 66
    :try_start_0
    const-string/jumbo v0, "picks_pic_url"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    const-string/jumbo v0, "banner_pic_url"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->d:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    const-string/jumbo v0, "googleplay_url"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->f:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    const-string/jumbo v0, "gp_url_type"

    iget v2, p0, Lcom/qihoo/security/appbox/core/c;->g:I

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 70
    const-string/jumbo v0, "icon_url"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    const-string/jumbo v0, "id"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->i:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    const-string/jumbo v0, "name"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    const-string/jumbo v0, "pkg_name"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    const-string/jumbo v0, "size"

    iget-wide v2, p0, Lcom/qihoo/security/appbox/core/c;->l:J

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 75
    const-string/jumbo v0, "star_level"

    iget v2, p0, Lcom/qihoo/security/appbox/core/c;->m:F

    float-to-double v2, v2

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 76
    const-string/jumbo v0, "summary"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    const-string/jumbo v0, "type"

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/c;->n:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :goto_0
    return-object v1

    .line 78
    :catch_0
    move-exception v0

    .line 79
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
