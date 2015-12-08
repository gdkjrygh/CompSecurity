.class public final Lcom/roidapp/cloudlib/flickr/z;
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
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/ref/WeakReference;
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
.method public constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/z;->a:Ljava/lang/String;

    .line 28
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/z;->b:Ljava/lang/ref/WeakReference;

    .line 29
    iput-object p2, p0, Lcom/roidapp/cloudlib/flickr/z;->a:Ljava/lang/String;

    .line 30
    return-void
.end method

.method private varargs a()Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/z;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 41
    if-nez v0, :cond_0

    .line 59
    :goto_0
    return-object v2

    .line 43
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    .line 1069
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->b()Lcom/googlecode/flickrjandroid/Flickr;

    move-result-object v1

    .line 1070
    if-eqz v1, :cond_1

    .line 1071
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/Flickr;->getPhotosInterface()Lcom/googlecode/flickrjandroid/photos/PhotosInterface;

    move-result-object v1

    .line 44
    :goto_1
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 45
    const-string v4, "url_sq"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    const-string v4, "url_l"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 47
    const-string v4, "views"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    new-instance v4, Lcom/googlecode/flickrjandroid/photos/SearchParameters;

    invoke-direct {v4}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;-><init>()V

    .line 49
    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->setExtras(Ljava/util/Set;)V

    .line 50
    iget-object v3, p0, Lcom/roidapp/cloudlib/flickr/z;->a:Ljava/lang/String;

    invoke-virtual {v4, v3}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->setText(Ljava/lang/String;)V

    .line 51
    iget v3, v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    .line 53
    :try_start_0
    const-string v5, "photos"

    invoke-virtual {v4, v5}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->setMedia(Ljava/lang/String;)V

    .line 54
    const/16 v5, 0x64

    invoke-virtual {v1, v4, v5, v3}, Lcom/googlecode/flickrjandroid/photos/PhotosInterface;->search(Lcom/googlecode/flickrjandroid/photos/SearchParameters;II)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 1073
    goto :goto_1

    .line 55
    :catch_0
    move-exception v1

    .line 56
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Ljava/lang/Exception;)V

    .line 57
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/z;->a()Lcom/googlecode/flickrjandroid/photos/PhotoList;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 15
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/PhotoList;

    .line 2064
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/z;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 2065
    if-eqz v0, :cond_0

    .line 2066
    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V

    .line 15
    :cond_0
    return-void
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 35
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 36
    return-void
.end method
