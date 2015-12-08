.class public final Lcom/roidapp/cloudlib/flickr/x;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Lcom/googlecode/flickrjandroid/oauth/OAuth;",
        "Ljava/lang/Void;",
        "Lcom/googlecode/flickrjandroid/photos/PhotoList;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 26
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/x;->a:Ljava/lang/ref/WeakReference;

    .line 27
    return-void
.end method

.method private varargs a([Lcom/googlecode/flickrjandroid/oauth/OAuth;)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 42
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/x;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 43
    if-nez v0, :cond_0

    move-object v0, v1

    .line 63
    :goto_0
    return-object v0

    .line 45
    :cond_0
    aget-object v2, p1, v5

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v2

    .line 46
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/roidapp/cloudlib/flickr/k;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/Flickr;

    move-result-object v2

    .line 48
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 49
    const-string v4, "url_sq"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    const-string v4, "url_l"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 51
    const-string v4, "views"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    aget-object v4, p1, v5

    invoke-virtual {v4}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getUser()Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v4

    .line 53
    iget v5, v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    .line 56
    :try_start_0
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/Flickr;->getPeopleInterface()Lcom/googlecode/flickrjandroid/people/PeopleInterface;

    move-result-object v2

    invoke-virtual {v4}, Lcom/googlecode/flickrjandroid/people/User;->getId()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x64

    invoke-virtual {v2, v4, v3, v6, v5}, Lcom/googlecode/flickrjandroid/people/PeopleInterface;->getPhotos(Ljava/lang/String;Ljava/util/Set;II)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 59
    :catch_0
    move-exception v2

    .line 60
    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Ljava/lang/Exception;)V

    .line 61
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    .line 63
    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    check-cast p1, [Lcom/googlecode/flickrjandroid/oauth/OAuth;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/flickr/x;->a([Lcom/googlecode/flickrjandroid/oauth/OAuth;)Lcom/googlecode/flickrjandroid/photos/PhotoList;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 17
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/PhotoList;

    .line 1072
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/x;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 1073
    if-eqz v0, :cond_0

    .line 1074
    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V

    .line 17
    :cond_0
    return-void
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 32
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 33
    return-void
.end method
