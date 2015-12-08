.class public final Lcom/roidapp/cloudlib/sns/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:J

.field public f:J

.field public g:Z

.field public h:Lcom/roidapp/cloudlib/sns/b/e;

.field public i:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/roidapp/cloudlib/sns/b/d;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 52
    if-nez p0, :cond_0

    .line 89
    :goto_0
    return-object v0

    .line 57
    :cond_0
    new-instance v1, Lcom/roidapp/cloudlib/sns/b/d;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/b/d;-><init>()V

    .line 60
    const-string v3, "id"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/roidapp/cloudlib/sns/b/d;->a:I

    .line 61
    const-string v3, "banner_url"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/roidapp/cloudlib/sns/b/d;->b:Ljava/lang/String;

    .line 62
    const-string v3, "tag"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/roidapp/cloudlib/sns/b/d;->c:Ljava/lang/String;

    .line 63
    const-string v3, "description"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/roidapp/cloudlib/sns/b/d;->d:Ljava/lang/String;

    .line 64
    const-string v3, "create_at"

    invoke-static {p0, v3}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lcom/roidapp/cloudlib/sns/b/d;->e:J

    .line 65
    const-string v3, "update_at"

    invoke-static {p0, v3}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lcom/roidapp/cloudlib/sns/b/d;->f:J

    .line 66
    const-string v3, "is_valid"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v1, Lcom/roidapp/cloudlib/sns/b/d;->g:Z

    .line 67
    const-string v3, "bg_color"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 68
    if-eqz v3, :cond_1

    .line 70
    :try_start_0
    const-string v4, "type"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 71
    sget-object v5, Lcom/roidapp/cloudlib/sns/b/e;->b:Lcom/roidapp/cloudlib/sns/b/e;

    invoke-virtual {v5}, Lcom/roidapp/cloudlib/sns/b/e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 72
    sget-object v2, Lcom/roidapp/cloudlib/sns/b/e;->b:Lcom/roidapp/cloudlib/sns/b/e;

    iput-object v2, v1, Lcom/roidapp/cloudlib/sns/b/d;->h:Lcom/roidapp/cloudlib/sns/b/e;

    .line 73
    const/4 v2, 0x1

    new-array v2, v2, [I

    const/4 v4, 0x0

    const-string v5, "color"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v2, v4

    iput-object v2, v1, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    :cond_1
    :goto_1
    move-object v0, v1

    .line 89
    goto :goto_0

    .line 74
    :cond_2
    sget-object v5, Lcom/roidapp/cloudlib/sns/b/e;->a:Lcom/roidapp/cloudlib/sns/b/e;

    invoke-virtual {v5}, Lcom/roidapp/cloudlib/sns/b/e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 75
    sget-object v4, Lcom/roidapp/cloudlib/sns/b/e;->a:Lcom/roidapp/cloudlib/sns/b/e;

    iput-object v4, v1, Lcom/roidapp/cloudlib/sns/b/d;->h:Lcom/roidapp/cloudlib/sns/b/e;

    .line 76
    const-string v4, "color"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 77
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lez v4, :cond_1

    .line 78
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    new-array v4, v4, [I

    iput-object v4, v1, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    .line 79
    :goto_2
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v2, v4, :cond_1

    .line 80
    iget-object v4, v1, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    aput v5, v4, v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 85
    :catch_0
    move-exception v2

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/b/d;->h:Lcom/roidapp/cloudlib/sns/b/e;

    .line 86
    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/b/d;->i:[I

    goto :goto_1
.end method
