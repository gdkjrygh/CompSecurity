.class public final Lcom/roidapp/cloudlib/flickr/h;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Throwable;",
        "Lcom/googlecode/flickrjandroid/oauth/OAuth;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V
    .locals 0

    .prologue
    .line 339
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    return-void
.end method

.method private varargs a([Ljava/lang/String;)Lcom/googlecode/flickrjandroid/oauth/OAuth;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 348
    aget-object v0, p1, v4

    .line 349
    aget-object v1, p1, v5

    .line 350
    const/4 v2, 0x2

    aget-object v2, p1, v2

    .line 352
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->b()Lcom/googlecode/flickrjandroid/Flickr;

    move-result-object v3

    .line 353
    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Flickr;->getOAuthInterface()Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

    move-result-object v3

    .line 355
    :try_start_0
    invoke-virtual {v3, v0, v1, v2}, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->getAccessToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/oauth/OAuth;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 361
    :goto_0
    return-object v0

    .line 357
    :catch_0
    move-exception v0

    .line 358
    const-string v1, "AuthenticationActivity"

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 359
    new-array v1, v5, [Ljava/lang/Throwable;

    aput-object v0, v1, v4

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/h;->publishProgress([Ljava/lang/Object;)V

    .line 361
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 339
    check-cast p1, [Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/flickr/h;->a([Ljava/lang/String;)Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 339
    check-cast p1, Lcom/googlecode/flickrjandroid/oauth/OAuth;

    .line 1373
    if-eqz p1, :cond_2

    .line 1374
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getUser()Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v0

    .line 1375
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v1

    .line 1376
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/people/User;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthToken()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    .line 1379
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    sget v1, Lcom/roidapp/cloudlib/at;->i:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1381
    :goto_0
    return-void

    .line 1383
    :cond_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/people/User;->getUsername()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/people/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v4, v5, v1}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1385
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/people/User;->getBuddyIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1386
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1387
    const-string v1, "oauth"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1388
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->setResult(ILandroid/content/Intent;)V

    .line 1393
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->finish()V

    goto :goto_0

    .line 1390
    :cond_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1391
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->setResult(ILandroid/content/Intent;)V

    goto :goto_1
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 343
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 344
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 339
    check-cast p1, [Ljava/lang/Throwable;

    .line 1366
    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    .line 1367
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/h;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;Ljava/lang/String;)V

    .line 339
    :cond_0
    return-void
.end method
