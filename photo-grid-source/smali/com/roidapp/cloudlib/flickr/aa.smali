.class public final Lcom/roidapp/cloudlib/flickr/aa;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Lcom/googlecode/flickrjandroid/oauth/OAuth;",
        "Ljava/lang/Void;",
        "Lcom/googlecode/flickrjandroid/people/User;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/aa;->a:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 19
    return-void
.end method

.method private static varargs a([Lcom/googlecode/flickrjandroid/oauth/OAuth;)Lcom/googlecode/flickrjandroid/people/User;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 38
    const/4 v1, 0x0

    aget-object v1, p0, v1

    .line 39
    if-nez v1, :cond_0

    .line 56
    :goto_0
    return-object v0

    .line 43
    :cond_0
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getUser()Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v2

    .line 44
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v1

    .line 46
    :try_start_0
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/roidapp/cloudlib/flickr/k;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/Flickr;

    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/Flickr;->getPeopleInterface()Lcom/googlecode/flickrjandroid/people/PeopleInterface;

    move-result-object v1

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/people/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/people/PeopleInterface;->getInfo(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/people/User;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 53
    :catch_0
    move-exception v1

    invoke-static {}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->h()V

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11
    check-cast p1, [Lcom/googlecode/flickrjandroid/oauth/OAuth;

    invoke-static {p1}, Lcom/roidapp/cloudlib/flickr/aa;->a([Lcom/googlecode/flickrjandroid/oauth/OAuth;)Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 11
    check-cast p1, Lcom/googlecode/flickrjandroid/people/User;

    .line 1069
    if-eqz p1, :cond_1

    .line 1074
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/aa;->a:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 1306
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/people/User;->getUsername()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1307
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/people/User;->getUsername()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1310
    :cond_0
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/people/User;->getBuddyIconUrl()Ljava/lang/String;

    move-result-object v1

    .line 1311
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/cloudlib/common/a;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1312
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 11
    :cond_1
    return-void
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 28
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 29
    return-void
.end method
