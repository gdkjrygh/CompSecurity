.class Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 119
    iget-object v2, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 158
    :cond_0
    :goto_0
    return v0

    .line 124
    :cond_1
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 125
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    .line 126
    sget-object v4, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 127
    iget-object v3, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v3}, Lcom/roidapp/cloudlib/common/a;->h(Landroid/content/Context;)Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v3

    .line 129
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getUser()Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v3

    if-nez v3, :cond_3

    .line 130
    :cond_2
    invoke-virtual {v2}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v2

    .line 132
    const-string v3, "&"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 133
    if-eqz v2, :cond_3

    array-length v3, v2

    if-ne v3, v8, :cond_3

    .line 134
    aget-object v3, v2, v1

    aget-object v4, v2, v1

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 136
    aget-object v4, v2, v0

    aget-object v2, v2, v0

    const-string v5, "="

    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 138
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "OAuth Token: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "; OAuth Verifier: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    iget-object v4, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v4}, Lcom/roidapp/cloudlib/common/a;->h(Landroid/content/Context;)Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v4

    .line 143
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v5

    invoke-virtual {v5}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 146
    iget-object v5, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    new-instance v6, Lcom/roidapp/cloudlib/flickr/h;

    iget-object v7, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {v6, v7}, Lcom/roidapp/cloudlib/flickr/h;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    invoke-static {v5, v6}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;Lcom/roidapp/cloudlib/flickr/h;)Lcom/roidapp/cloudlib/flickr/h;

    .line 147
    iget-object v5, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v5}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Lcom/roidapp/cloudlib/flickr/h;

    move-result-object v5

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    aput-object v3, v6, v1

    invoke-virtual {v4}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v0

    aput-object v2, v6, v8

    invoke-virtual {v5, v6}, Lcom/roidapp/cloudlib/flickr/h;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto/16 :goto_0

    .line 156
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 157
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;->a:Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    :cond_4
    move v0, v1

    .line 158
    goto/16 :goto_0
.end method
