.class final Lcom/roidapp/cloudlib/facebook/g;
.super Lcom/bumptech/glide/g/b/d;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 440
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/g;->b:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-direct {p0, p2}, Lcom/bumptech/glide/g/b/d;-><init>(Landroid/widget/ImageView;)V

    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 450
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/g;->e()Lcom/bumptech/glide/g/c;

    move-result-object v0

    .line 451
    if-eqz v0, :cond_0

    .line 452
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/g;->b:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 454
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/g;->b:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->c(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    .line 455
    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/a/b;",
            "Lcom/bumptech/glide/g/a/d",
            "<-",
            "Lcom/bumptech/glide/load/resource/a/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 477
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    .line 478
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/g;->g()V

    .line 479
    return-void
.end method

.method public final a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 465
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V

    .line 466
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/g;->g()V

    .line 467
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 0

    .prologue
    .line 440
    check-cast p1, Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/facebook/g;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    return-void
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 471
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/d;->b(Landroid/graphics/drawable/Drawable;)V

    .line 472
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/g;->g()V

    .line 473
    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 459
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 1442
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/g;->e()Lcom/bumptech/glide/g/c;

    move-result-object v0

    .line 1443
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/g;->b:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1444
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/g;->b:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1446
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/g;->b:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->b(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    .line 461
    return-void
.end method
