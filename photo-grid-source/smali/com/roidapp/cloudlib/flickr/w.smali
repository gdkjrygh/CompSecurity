.class final Lcom/roidapp/cloudlib/flickr/w;
.super Lcom/roidapp/cloudlib/ad;
.source "SourceFile"


# instance fields
.field final synthetic e:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

.field private f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

.field private g:I


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 325
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/w;->e:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 326
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/ad;-><init>(Lcom/roidapp/cloudlib/t;Landroid/app/Activity;)V

    .line 322
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    .line 323
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/w;->g:I

    .line 327
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    if-eqz v0, :cond_0

    .line 364
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-virtual {v0, p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/photos/Photo;

    .line 365
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getSmallSquareUrl()Ljava/lang/String;

    move-result-object v0

    .line 367
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final a(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V
    .locals 2

    .prologue
    .line 336
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 337
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->getPages()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/w;->g:I

    .line 338
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-virtual {v0, p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->addAll(Ljava/util/Collection;)Z

    .line 339
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->e:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;I)I

    .line 340
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/w;->notifyDataSetChanged()V

    .line 342
    :cond_0
    return-void
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    if-eqz v0, :cond_0

    .line 373
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-virtual {v0, p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/photos/Photo;

    .line 374
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getLargeUrl()Ljava/lang/String;

    move-result-object v0

    .line 376
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 330
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/w;->g:I

    .line 331
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->clear()V

    .line 332
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->e:Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;I)I

    .line 333
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 358
    iget v0, p0, Lcom/roidapp/cloudlib/flickr/w;->g:I

    return v0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 350
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/w;->f:Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-virtual {v0, p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 354
    int-to-long v0, p1

    return-wide v0
.end method
