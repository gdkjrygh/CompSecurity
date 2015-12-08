.class final Lcom/roidapp/cloudlib/facebook/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$GraphJSONObjectCallback;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;B)V
    .locals 0

    .prologue
    .line 241
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/facebook/ae;-><init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lorg/json/JSONObject;Lcom/facebook/GraphResponse;)V
    .locals 6

    .prologue
    .line 243
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    :goto_0
    return-void

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->c(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 248
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->c(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 250
    :cond_1
    if-nez p1, :cond_3

    .line 251
    invoke-virtual {p2}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 252
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {p2}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;Ljava/lang/Exception;)V

    goto :goto_0

    .line 254
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    sget v2, Lcom/roidapp/cloudlib/at;->h:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 255
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(I)V

    .line 256
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    goto :goto_0

    .line 259
    :cond_3
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 260
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 262
    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-static {v2, v1, v0}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 268
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 269
    const-string v2, "email"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 270
    const-string v3, "gender"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 272
    const-string v4, "locale"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 274
    const-string v5, "email"

    invoke-virtual {v1, v5, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    if-eqz v3, :cond_4

    .line 277
    const-string v2, "male"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 278
    const-string v2, "gender"

    const-string v3, "1"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    :cond_4
    :goto_1
    const-string v2, "locale"

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v2, "signData"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 291
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(ILandroid/content/Intent;)V

    .line 292
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ae;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    goto/16 :goto_0

    .line 279
    :cond_5
    const-string v2, "female"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 280
    const-string v2, "gender"

    const-string v3, "0"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method
