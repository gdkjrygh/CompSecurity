.class public final Lcom/roidapp/cloudlib/flickr/i;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Throwable;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

.field private b:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V
    .locals 2

    .prologue
    .line 259
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "://oauth"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->b:Landroid/net/Uri;

    return-void
.end method

.method private varargs a()Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 279
    :try_start_0
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->b()Lcom/googlecode/flickrjandroid/Flickr;

    move-result-object v1

    .line 280
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/Flickr;->getOAuthInterface()Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/flickr/i;->b:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->getRequestToken(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v2

    .line 282
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v3

    .line 1302
    iget-object v4, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7, v3}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/Flickr;->getOAuthInterface()Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

    move-result-object v1

    sget-object v3, Lcom/googlecode/flickrjandroid/auth/Permission;->READ:Lcom/googlecode/flickrjandroid/auth/Permission;

    invoke-virtual {v1, v3, v2}, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;->buildAuthenticationUrl(Lcom/googlecode/flickrjandroid/auth/Permission;Lcom/googlecode/flickrjandroid/oauth/OAuthToken;)Ljava/net/URL;

    move-result-object v1

    .line 285
    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 291
    :goto_0
    return-object v0

    .line 286
    :catch_0
    move-exception v1

    .line 287
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 288
    const-string v2, "AuthenticationActivity"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error to oauth, "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 289
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/flickr/i;->publishProgress([Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 259
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/i;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final onCancelled()V
    .locals 1

    .prologue
    .line 326
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onCancelled()V

    .line 329
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    :cond_0
    :goto_0
    return-void

    .line 333
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 259
    check-cast p1, Ljava/lang/String;

    .line 2309
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2310
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 2313
    :cond_0
    if-eqz p1, :cond_1

    .line 2314
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->c(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 259
    :cond_1
    return-void
.end method

.method protected final onPreExecute()V
    .locals 1

    .prologue
    .line 266
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 268
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 269
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 259
    check-cast p1, [Ljava/lang/Throwable;

    .line 1319
    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    .line 1320
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/i;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;Ljava/lang/String;)V

    .line 259
    :cond_0
    return-void
.end method
