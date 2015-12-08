.class final Lcom/roidapp/cloudlib/dropbox/l;
.super Lcom/roidapp/cloudlib/ad;
.source "SourceFile"


# instance fields
.field final synthetic e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

.field private f:Lcom/roidapp/cloudlib/dropbox/c;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 350
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    .line 351
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/ad;-><init>(Lcom/roidapp/cloudlib/t;Landroid/app/Activity;)V

    .line 348
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/c;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/dropbox/c;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    .line 352
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/dropbox/l;)Lcom/roidapp/cloudlib/dropbox/c;
    .locals 1

    .prologue
    .line 347
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    return-object v0
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 417
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    if-eqz v0, :cond_0

    .line 418
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 419
    iget-boolean v1, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-nez v1, :cond_0

    .line 420
    iget-object v0, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    .line 423
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/dropbox/c;)V
    .locals 2

    .prologue
    .line 355
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 356
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    .line 1029
    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    iget-object v1, p1, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 357
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/l;->notifyDataSetChanged()V

    .line 359
    :cond_0
    return-void
.end method

.method public final b(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 428
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    if-eqz v0, :cond_0

    .line 430
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 431
    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->i(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/dropbox/client2/DropboxAPI;

    move-result-object v1

    iget-object v0, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/dropbox/client2/DropboxAPI;->media(Ljava/lang/String;Z)Lcom/dropbox/client2/DropboxAPI$DropboxLink;

    move-result-object v0

    iget-object v0, v0, Lcom/dropbox/client2/DropboxAPI$DropboxLink;->url:Ljava/lang/String;
    :try_end_0
    .catch Lcom/dropbox/client2/exception/DropboxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 445
    :goto_0
    return-object v0

    .line 433
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/dropbox/client2/exception/DropboxException;->printStackTrace()V

    .line 434
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->l(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ah;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/dropbox/m;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/dropbox/m;-><init>(Lcom/roidapp/cloudlib/dropbox/l;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->post(Ljava/lang/Runnable;)Z

    .line 445
    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 371
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 377
    if-nez p2, :cond_1

    .line 378
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/roidapp/cloudlib/as;->E:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 379
    new-instance v1, Lcom/roidapp/cloudlib/ag;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/ag;-><init>()V

    .line 380
    sget v0, Lcom/roidapp/cloudlib/ar;->be:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/ag;->b:Landroid/widget/TextView;

    .line 381
    sget v0, Lcom/roidapp/cloudlib/ar;->aY:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/ag;->a:Landroid/widget/ImageView;

    .line 382
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->c:Landroid/widget/AbsListView$LayoutParams;

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget v2, p0, Lcom/roidapp/cloudlib/dropbox/l;->a:I

    if-eq v0, v2, :cond_0

    .line 389
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->c:Landroid/widget/AbsListView$LayoutParams;

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->f:Lcom/roidapp/cloudlib/dropbox/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 396
    iget-boolean v2, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-eqz v2, :cond_2

    .line 397
    iget-object v2, v1, Lcom/roidapp/cloudlib/ag;->b:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 398
    iget-object v2, v1, Lcom/roidapp/cloudlib/ag;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI$Entry;->fileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 399
    iget-object v0, v1, Lcom/roidapp/cloudlib/ag;->a:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/cloudlib/aq;->x:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 412
    :goto_1
    return-object p2

    .line 385
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ag;

    move-object v1, v0

    goto :goto_0

    .line 401
    :cond_2
    iget-object v0, v1, Lcom/roidapp/cloudlib/ag;->b:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 402
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    new-instance v2, Lcom/roidapp/cloudlib/dropbox/d;

    iget-object v3, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v3}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->i(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/dropbox/client2/DropboxAPI;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/roidapp/cloudlib/dropbox/d;-><init>(Lcom/dropbox/client2/DropboxAPI;)V

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/p;->a(Lcom/bumptech/glide/load/c/b/g;)Lcom/bumptech/glide/t;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/dropbox/l;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/t;->a(Ljava/lang/Object;)Lcom/bumptech/glide/d;

    move-result-object v0

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v2}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->j(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-static {v3}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->k(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/l;->e:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    iget-object v1, v1, Lcom/roidapp/cloudlib/ag;->a:Landroid/widget/ImageView;

    invoke-static {v2, v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto :goto_1
.end method
