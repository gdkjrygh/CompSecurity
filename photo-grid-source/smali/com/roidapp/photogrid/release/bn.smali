.class final Lcom/roidapp/photogrid/release/bn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/roidapp/photogrid/release/bj;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/bj;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bn;->b:Lcom/roidapp/photogrid/release/bj;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/bn;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 251
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bn;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 253
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 254
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bn;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bj;->d(Lcom/roidapp/photogrid/release/bj;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/m;->a(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v4

    move v1, v0

    .line 256
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v1, v5, :cond_1

    .line 257
    invoke-virtual {v4, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "folder"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 258
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 259
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 260
    const-string v7, "folder"

    invoke-virtual {v6, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 261
    invoke-virtual {v3, v0, v6}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 262
    add-int/lit8 v0, v0, 0x1

    .line 256
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 265
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 266
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bn;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bj;->d(Lcom/roidapp/photogrid/release/bj;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/m;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bn;->b:Lcom/roidapp/photogrid/release/bj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bj;->d(Lcom/roidapp/photogrid/release/bj;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 273
    :goto_1
    return-void

    .line 271
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method
