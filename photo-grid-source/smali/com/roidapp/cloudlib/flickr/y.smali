.class public final Lcom/roidapp/cloudlib/flickr/y;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Void;",
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

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/y;->a:Ljava/lang/ref/WeakReference;

    .line 27
    return-void
.end method

.method private varargs a()Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 37
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/y;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 38
    if-nez v0, :cond_0

    .line 81
    :goto_0
    return-object v2

    .line 41
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    .line 1060
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->b()Lcom/googlecode/flickrjandroid/Flickr;

    move-result-object v1

    .line 1061
    if-eqz v1, :cond_1

    .line 1062
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/Flickr;->getInterestingnessInterface()Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;

    move-result-object v1

    .line 43
    :goto_1
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 44
    const-string v4, "tags"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 45
    const-string v4, "geo"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    const-string v4, "owner_name"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 47
    const-string v4, "views"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    iget v4, v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    .line 51
    const/4 v5, 0x0

    const/16 v6, 0x64

    :try_start_0
    invoke-virtual {v1, v5, v3, v6, v4}, Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;->getList(Ljava/lang/String;Ljava/util/Set;II)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 1064
    goto :goto_1

    .line 69
    :catch_0
    move-exception v1

    .line 78
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Ljava/lang/Exception;)V

    .line 79
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/y;->a()Lcom/googlecode/flickrjandroid/photos/PhotoList;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 14
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/PhotoList;

    .line 1086
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/y;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 1087
    if-eqz v0, :cond_0

    .line 1088
    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V

    .line 14
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
