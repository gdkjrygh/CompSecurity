.class public final Lcom/roidapp/cloudlib/sns/b/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:J

.field public k:Z

.field public l:Z

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/roidapp/cloudlib/sns/b/o;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 66
    if-nez p0, :cond_1

    .line 67
    const/4 v0, 0x0

    .line 140
    :cond_0
    :goto_0
    return-object v0

    .line 70
    :cond_1
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/o;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/b/o;-><init>()V

    .line 102
    const-string v1, "thrumbNail"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 103
    if-eqz v1, :cond_2

    .line 104
    const-string v2, "small"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    .line 105
    const-string v2, "middle"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->f:Ljava/lang/String;

    .line 109
    :cond_2
    const-string v1, "isRecommend"

    invoke-virtual {p0, v1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 110
    const-string v1, "extraThumbnail"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 112
    if-eqz v1, :cond_0

    .line 114
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ne v2, v5, :cond_3

    .line 115
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 116
    const-string v2, "small"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->m:Ljava/lang/String;

    goto :goto_0

    .line 117
    :cond_3
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 118
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 119
    const-string v3, "small"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roidapp/cloudlib/sns/b/o;->m:Ljava/lang/String;

    .line 120
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 121
    const-string v2, "small"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->n:Ljava/lang/String;

    goto :goto_0

    .line 128
    :cond_4
    const-string v1, "pid"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    .line 129
    const-string v1, "uid"

    invoke-static {p0, v1}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/o;->b:J

    .line 130
    const-string v1, "image"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->c:Ljava/lang/String;

    .line 131
    const-string v1, "type"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->g:Ljava/lang/String;

    .line 132
    const-string v1, "likeCount"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->h:I

    .line 133
    const-string v1, "commentCount"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->i:I

    .line 134
    const-string v1, "createTime"

    invoke-static {p0, v1}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/o;->j:J

    .line 135
    const-string v1, "enable"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->k:Z

    .line 136
    const-string v1, "txturl"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->d:Ljava/lang/String;

    .line 137
    const-string v1, "isUrl"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/sns/b/o;->l:Z

    goto/16 :goto_0
.end method
