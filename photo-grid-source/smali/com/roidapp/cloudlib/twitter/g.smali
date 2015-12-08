.class final Lcom/roidapp/cloudlib/twitter/g;
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
.field final synthetic a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 204
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;B)V
    .locals 0

    .prologue
    .line 200
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/twitter/g;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V

    return-void
.end method

.method private varargs a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 214
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->c(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/Twitter;

    move-result-object v1

    sget-object v2, Lcom/roidapp/cloudlib/twitter/a;->i:Ljava/lang/String;

    invoke-interface {v1, v2}, Ltwitter4j/Twitter;->getOAuthRequestToken(Ljava/lang/String;)Ltwitter4j/auth/RequestToken;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;Ltwitter4j/auth/RequestToken;)Ltwitter4j/auth/RequestToken;

    .line 215
    const-string v0, "TwitterLoginActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getOAuthRequestToken:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/roidapp/cloudlib/twitter/a;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/auth/RequestToken;

    move-result-object v0

    invoke-virtual {v0}, Ltwitter4j/auth/RequestToken;->getAuthenticationURL()Ljava/lang/String;

    move-result-object v0

    .line 217
    const-string v1, "TwitterLoginActivity"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "getAuthenticationURL:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    :goto_0
    return-object v0

    .line 219
    :catch_0
    move-exception v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 221
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Throwable;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/twitter/g;->publishProgress([Ljava/lang/Object;)V

    .line 223
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 200
    invoke-direct {p0}, Lcom/roidapp/cloudlib/twitter/g;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 200
    check-cast p1, Ljava/lang/String;

    .line 2227
    if-eqz p1, :cond_0

    .line 2228
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->d(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 200
    :cond_0
    return-void
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 208
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 209
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 200
    check-cast p1, [Ljava/lang/Throwable;

    .line 1232
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1233
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    sget v2, Lcom/roidapp/cloudlib/at;->h:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1236
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/g;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->finish()V

    .line 200
    :cond_0
    return-void
.end method
