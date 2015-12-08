.class final Lcom/kik/cards/web/iap/i;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lorg/json/JSONObject;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/kik/cards/web/iap/h;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/iap/h;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 377
    iput-object p1, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iput-object p2, p0, Lcom/kik/cards/web/iap/i;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/iap/i;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/kik/cards/web/iap/i;->c:Lorg/json/JSONObject;

    iput-object p5, p0, Lcom/kik/cards/web/iap/i;->d:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 377
    check-cast p1, Landroid/content/Intent;

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->f(Lcom/kik/cards/web/plugin/a;)V

    :goto_0
    return-void

    :cond_0
    const-string v1, "retry"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v0, "INAPP_PURCHASE_DATA"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "INAPP_DATA_SIGNATURE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v2, :cond_1

    if-nez v1, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->g(Lcom/kik/cards/web/plugin/a;)V

    goto :goto_0

    :cond_2
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    iget-object v3, p0, Lcom/kik/cards/web/iap/i;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v4, v4, Lcom/kik/cards/web/iap/h;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/kik/cards/web/iap/i;->b:Ljava/lang/String;

    iget-object v6, p0, Lcom/kik/cards/web/iap/i;->c:Lorg/json/JSONObject;

    invoke-static/range {v0 .. v6}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/cards/web/iap/InAppPurchasePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->h(Lcom/kik/cards/web/plugin/a;)V

    goto :goto_0

    :cond_3
    :try_start_0
    const-string v1, "transaction"

    invoke-virtual {v7, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/kik/d/b/a$k;->z:Lcom/kik/d/b/a$k;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/d/b/a$k;)V

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0, v7}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)V

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->i(Lcom/kik/cards/web/plugin/a;)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v1, v1, Lcom/kik/cards/web/iap/h;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/kik/cards/web/bf;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_1
    iget-object v2, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v2, v2, Lcom/kik/cards/web/iap/h;->d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    invoke-static {v2}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->b(Lcom/kik/cards/web/iap/InAppPurchasePlugin;)Lcom/android/a/a/a;

    move-result-object v2

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v4, v4, Lcom/kik/cards/web/iap/h;->d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    invoke-static {v4}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/cards/web/iap/InAppPurchasePlugin;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "inapp"

    const/4 v6, 0x0

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/android/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    if-nez v2, :cond_5

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->k(Lcom/kik/cards/web/plugin/a;)V

    goto/16 :goto_0

    :catch_1
    move-exception v0

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->j(Lcom/kik/cards/web/plugin/a;)V

    goto/16 :goto_0

    :cond_5
    const-string v3, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    const-string v3, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    move v2, v0

    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "productId"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/kik/cards/web/iap/i;->d:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lorg/json/JSONObject;

    const-string v3, "developerPayload"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "data"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v3, "username"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "host"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    const-string v1, "productId"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/cards/web/iap/InAppPurchasePlugin;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v4, v4, Lcom/kik/cards/web/iap/h;->b:Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/cards/web/iap/InAppPurchasePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "transaction"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v0, Lcom/kik/d/b/a$k;->z:Lcom/kik/d/b/a$k;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/d/b/a$k;)V

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0, v1}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->b(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    :catch_2
    move-exception v0

    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->l(Lcom/kik/cards/web/plugin/a;)V

    goto/16 :goto_0

    :cond_6
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1

    :cond_7
    :try_start_3
    sget-object v0, Lcom/kik/d/b/a$k;->A:Lcom/kik/d/b/a$k;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/d/b/a$k;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v1, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v1, v1, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v1, v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->c(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 490
    sget-object v0, Lcom/kik/d/b/a$k;->A:Lcom/kik/d/b/a$k;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/d/b/a$k;)V

    .line 491
    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->n(Lcom/kik/cards/web/plugin/a;)V

    .line 492
    invoke-super {p0}, Lcom/kik/g/r;->b()V

    .line 493
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 481
    sget-object v0, Lcom/kik/d/b/a$k;->B:Lcom/kik/d/b/a$k;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a(Lcom/kik/d/b/a$k;)V

    .line 482
    iget-object v0, p0, Lcom/kik/cards/web/iap/i;->e:Lcom/kik/cards/web/iap/h;

    iget-object v0, v0, Lcom/kik/cards/web/iap/h;->c:Lcom/kik/cards/web/plugin/a;

    invoke-static {v0}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->m(Lcom/kik/cards/web/plugin/a;)V

    .line 483
    invoke-super {p0, p1}, Lcom/kik/g/r;->b(Ljava/lang/Throwable;)V

    .line 484
    return-void
.end method
