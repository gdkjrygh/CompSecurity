.class final Lcom/roidapp/photogrid/release/kw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/kt;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kt;)V
    .locals 0

    .prologue
    .line 484
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 489
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/m;->a(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v3

    move v0, v1

    .line 490
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 492
    :try_start_0
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "folder"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 493
    iget-object v4, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 494
    iget-object v4, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v4, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;Ljava/lang/String;)Lcom/roidapp/photogrid/release/kz;

    move-result-object v4

    .line 495
    if-eqz v4, :cond_0

    .line 496
    iget-object v5, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v5

    invoke-virtual {v5, v2, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 490
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 500
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1

    .line 504
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/String;

    .line 505
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    new-array v4, v0, [Ljava/lang/String;

    .line 506
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    new-array v5, v0, [Ljava/lang/Integer;

    .line 508
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v1

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 509
    aput-object v0, v3, v2

    .line 510
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/kz;

    iget v1, v1, Lcom/roidapp/photogrid/release/kz;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v2

    .line 511
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->g(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kz;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    aput-object v0, v4, v2

    .line 512
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    .line 513
    goto :goto_2

    .line 514
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 515
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 516
    const-string v1, "folders_array"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    const-string v1, "first_pics"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    const-string v1, "count"

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 520
    const/16 v2, 0x16

    iput v2, v1, Landroid/os/Message;->what:I

    .line 521
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 522
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 523
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kw;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    .line 524
    return-void
.end method
