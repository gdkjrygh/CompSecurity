.class final Lcom/roidapp/cloudlib/twitter/f;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Landroid/net/Uri;",
        "Ljava/lang/Throwable;",
        "Ltwitter4j/auth/AccessToken;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 155
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;B)V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/twitter/f;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V

    return-void
.end method

.method private varargs a([Landroid/net/Uri;)Ltwitter4j/auth/AccessToken;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 165
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, p1, v0

    const-string v1, "oauth_verifier"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->c(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/Twitter;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v2}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->b(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/auth/RequestToken;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ltwitter4j/Twitter;->getOAuthAccessToken(Ltwitter4j/auth/RequestToken;Ljava/lang/String;)Ltwitter4j/auth/AccessToken;

    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->c(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/Twitter;

    move-result-object v1

    invoke-interface {v1, v0}, Ltwitter4j/Twitter;->setOAuthAccessToken(Ltwitter4j/auth/AccessToken;)V

    .line 169
    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->c(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/Twitter;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v2}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->c(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Ltwitter4j/Twitter;

    move-result-object v2

    invoke-interface {v2}, Ltwitter4j/Twitter;->getId()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Ltwitter4j/Twitter;->showUser(J)Ltwitter4j/User;

    move-result-object v1

    invoke-interface {v1}, Ltwitter4j/User;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/twitter/f;->b:Ljava/lang/String;

    .line 170
    if-eqz v0, :cond_0

    .line 171
    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    iget-object v2, p0, Lcom/roidapp/cloudlib/twitter/f;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ltwitter4j/auth/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ltwitter4j/auth/AccessToken;->getTokenSecret()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    :cond_0
    :goto_0
    return-object v0

    .line 175
    :catch_0
    move-exception v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 177
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Throwable;

    aput-object v0, v1, v5

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/twitter/f;->publishProgress([Ljava/lang/Object;)V

    .line 179
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    check-cast p1, [Landroid/net/Uri;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/twitter/f;->a([Landroid/net/Uri;)Ltwitter4j/auth/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 150
    check-cast p1, Ltwitter4j/auth/AccessToken;

    .line 2183
    if-eqz p1, :cond_0

    .line 2184
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->setResult(I)V

    .line 2188
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->finish()V

    .line 150
    return-void

    .line 2186
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->setResult(I)V

    goto :goto_0
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 159
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 160
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 150
    check-cast p1, [Ljava/lang/Throwable;

    .line 1192
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1193
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/f;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    sget v2, Lcom/roidapp/cloudlib/at;->h:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 150
    :cond_0
    return-void
.end method
