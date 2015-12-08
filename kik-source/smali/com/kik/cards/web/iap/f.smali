.class final Lcom/kik/cards/web/iap/f;
.super Lkik/android/util/bf;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/iap/b;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/iap/b;)V
    .locals 0

    .prologue
    .line 195
    iput-object p1, p0, Lcom/kik/cards/web/iap/f;->a:Lcom/kik/cards/web/iap/b;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/lang/Void;
    .locals 6

    .prologue
    .line 199
    iget-object v0, p0, Lcom/kik/cards/web/iap/f;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {v0}, Lcom/kik/cards/web/iap/b;->f(Lcom/kik/cards/web/iap/b;)Lcom/android/a/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/iap/f;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {v0}, Lcom/kik/cards/web/iap/b;->b(Lcom/kik/cards/web/iap/b;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->a:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 203
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 206
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 207
    const-string v2, "ITEM_ID_LIST"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 210
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/iap/f;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {v0}, Lcom/kik/cards/web/iap/b;->f(Lcom/kik/cards/web/iap/b;)Lcom/android/a/a/a;

    move-result-object v0

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/kik/cards/web/iap/f;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {v3}, Lcom/kik/cards/web/iap/b;->b(Lcom/kik/cards/web/iap/b;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "inapp"

    invoke-interface {v0, v2, v3, v4, v1}, Lcom/android/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 211
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 212
    const-string v1, "RESPONSE_CODE"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 213
    if-nez v1, :cond_0

    .line 215
    const-string v1, "DETAILS_LIST"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 216
    if-eqz v0, :cond_0

    .line 217
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 219
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 220
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 222
    new-instance v0, Lkik/a/d/i;

    const-string v4, "productId"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "price"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v4, v3}, Lkik/a/d/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 241
    :catch_0
    move-exception v0

    .line 244
    :cond_0
    :goto_1
    const/4 v0, 0x0

    return-object v0

    .line 225
    :cond_1
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/kik/cards/web/iap/f;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {v0}, Lcom/kik/cards/web/iap/b;->c(Lcom/kik/cards/web/iap/b;)Lkik/a/e/v;

    move-result-object v0

    invoke-interface {v0, v1}, Lkik/a/e/v;->a(Ljava/util/Vector;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    .line 236
    :catch_1
    move-exception v0

    :goto_2
    invoke-static {v0}, Lkik/android/util/bx;->c(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 195
    invoke-direct {p0}, Lcom/kik/cards/web/iap/f;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lcom/kik/cards/web/iap/f;->a:Lcom/kik/cards/web/iap/b;

    invoke-static {v0}, Lcom/kik/cards/web/iap/b;->d(Lcom/kik/cards/web/iap/b;)V

    return-void
.end method
