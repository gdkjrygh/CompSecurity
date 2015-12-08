.class public Lcom/roidapp/cloudlib/sns/b/a/c;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/h;",
        ">;",
        "Lcom/roidapp/cloudlib/sns/b/v;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 12

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 262
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 263
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_9

    move v1, v2

    .line 264
    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_9

    .line 265
    invoke-virtual {v5, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 267
    new-instance v6, Lcom/roidapp/cloudlib/sns/b/h;

    invoke-direct {v6}, Lcom/roidapp/cloudlib/sns/b/h;-><init>()V

    .line 268
    const-string v3, "type"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 269
    sget-object v7, Lcom/roidapp/cloudlib/sns/b/i;->a:Lcom/roidapp/cloudlib/sns/b/i;

    invoke-virtual {v7}, Lcom/roidapp/cloudlib/sns/b/i;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 270
    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->a:Lcom/roidapp/cloudlib/sns/b/i;

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    .line 290
    :goto_1
    const-string v3, "time"

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v8

    iput-wide v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    .line 291
    const-string v3, "user"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v3, v7, p2}, Lcom/roidapp/cloudlib/sns/b/x;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v3

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    .line 292
    const-string v3, "post"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/b/o;->a(Lorg/json/JSONObject;)Lcom/roidapp/cloudlib/sns/b/o;

    move-result-object v3

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    .line 293
    const-string v3, "pid"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v6, Lcom/roidapp/cloudlib/sns/b/h;->e:I

    .line 1309
    iget-object v0, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v0, v3, :cond_6

    move v3, v2

    .line 1312
    :goto_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/b/a/c;->size()I

    move-result v0

    if-ge v3, v0, :cond_6

    .line 1313
    invoke-virtual {p0, v3}, Lcom/roidapp/cloudlib/sns/b/a/c;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    .line 1314
    iget-object v7, v0, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v8, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v7, v8, :cond_5

    .line 1315
    iget-object v7, v0, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v7, v7, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v8, v8, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-wide v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    iget-wide v10, v0, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    cmp-long v0, v8, v10

    if-gez v0, :cond_5

    move v0, v4

    .line 296
    :goto_3
    if-nez v0, :cond_0

    .line 1324
    iget-object v0, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->a:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v0, v3, :cond_8

    move v3, v2

    .line 1327
    :goto_4
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/b/a/c;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 1328
    invoke-virtual {p0, v3}, Lcom/roidapp/cloudlib/sns/b/a/c;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    .line 1329
    iget-object v7, v0, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v8, Lcom/roidapp/cloudlib/sns/b/i;->a:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v7, v8, :cond_7

    .line 1330
    iget-object v7, v0, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v7, v7, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v8, v8, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object v7, v6, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget v7, v7, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    iget-object v8, v0, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget v8, v8, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    if-ne v7, v8, :cond_7

    iget-wide v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    iget-wide v10, v0, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    cmp-long v0, v8, v10

    if-gez v0, :cond_7

    move v0, v4

    .line 299
    :goto_5
    if-nez v0, :cond_0

    .line 303
    invoke-virtual {p0, v6}, Lcom/roidapp/cloudlib/sns/b/a/c;->add(Ljava/lang/Object;)Z

    .line 264
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_0

    .line 272
    :cond_1
    sget-object v7, Lcom/roidapp/cloudlib/sns/b/i;->c:Lcom/roidapp/cloudlib/sns/b/i;

    invoke-virtual {v7}, Lcom/roidapp/cloudlib/sns/b/i;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 273
    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->c:Lcom/roidapp/cloudlib/sns/b/i;

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    .line 274
    const-string v3, "content"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 276
    :cond_2
    sget-object v7, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    invoke-virtual {v7}, Lcom/roidapp/cloudlib/sns/b/i;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 277
    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    goto/16 :goto_1

    .line 279
    :cond_3
    sget-object v7, Lcom/roidapp/cloudlib/sns/b/i;->d:Lcom/roidapp/cloudlib/sns/b/i;

    invoke-virtual {v7}, Lcom/roidapp/cloudlib/sns/b/i;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 280
    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->d:Lcom/roidapp/cloudlib/sns/b/i;

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    .line 281
    const-string v3, "content"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 283
    :cond_4
    sget-object v7, Lcom/roidapp/cloudlib/sns/b/i;->e:Lcom/roidapp/cloudlib/sns/b/i;

    invoke-virtual {v7}, Lcom/roidapp/cloudlib/sns/b/i;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 284
    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->e:Lcom/roidapp/cloudlib/sns/b/i;

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    .line 285
    const-string v3, "content"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 1312
    :cond_5
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_2

    :cond_6
    move v0, v2

    .line 1320
    goto/16 :goto_3

    .line 1327
    :cond_7
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_4

    :cond_8
    move v0, v2

    .line 1335
    goto :goto_5

    .line 306
    :cond_9
    return-void
.end method
