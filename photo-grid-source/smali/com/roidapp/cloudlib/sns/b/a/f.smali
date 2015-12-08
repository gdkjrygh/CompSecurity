.class public Lcom/roidapp/cloudlib/sns/b/a/f;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/u;",
        ">;",
        "Lcom/roidapp/cloudlib/sns/b/v;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 6

    .prologue
    .line 43
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 45
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 46
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 47
    if-eqz v3, :cond_0

    .line 1023
    if-nez v3, :cond_1

    .line 1024
    const/4 v1, 0x0

    .line 49
    :goto_1
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/b/a/f;->add(Ljava/lang/Object;)Z

    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1027
    :cond_1
    new-instance v1, Lcom/roidapp/cloudlib/sns/b/u;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/b/u;-><init>()V

    .line 1030
    const-string v4, "tagname"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    .line 1031
    const-string v4, "picUrl"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/roidapp/cloudlib/sns/b/u;->b:Ljava/lang/String;

    .line 1032
    const-string v4, "position"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v1, Lcom/roidapp/cloudlib/sns/b/u;->c:I

    .line 1033
    const-string v4, "createTime"

    invoke-static {v3, v4}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lcom/roidapp/cloudlib/sns/b/u;->d:J

    .line 1034
    const-string v4, "startTime"

    invoke-static {v3, v4}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lcom/roidapp/cloudlib/sns/b/u;->e:J

    .line 1035
    const-string v4, "endTime"

    invoke-static {v3, v4}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v1, Lcom/roidapp/cloudlib/sns/b/u;->f:J

    .line 1036
    const-string v4, "tagColor"

    const-string v5, "#ff0000"

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    iput v3, v1, Lcom/roidapp/cloudlib/sns/b/u;->g:I

    goto :goto_1

    .line 53
    :cond_2
    return-void
.end method
