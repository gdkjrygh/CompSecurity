.class final Lcom/roidapp/cloudlib/facebook/u;
.super Lcom/bumptech/glide/g/b/d;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/roidapp/cloudlib/facebook/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/t;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 447
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    invoke-direct {p0, p2}, Lcom/bumptech/glide/g/b/d;-><init>(Landroid/widget/ImageView;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V
    .locals 2
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
    .line 471
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    .line 472
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/u;->e()Lcom/bumptech/glide/g/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 473
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2121

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->sendEmptyMessage(I)Z

    .line 474
    return-void
.end method

.method public final a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 457
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V

    .line 458
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/u;->e()Lcom/bumptech/glide/g/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 459
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2121

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->sendEmptyMessage(I)Z

    .line 460
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 0

    .prologue
    .line 447
    check-cast p1, Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/facebook/u;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    return-void
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 464
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/d;->b(Landroid/graphics/drawable/Drawable;)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/u;->e()Lcom/bumptech/glide/g/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 466
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2121

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->sendEmptyMessage(I)Z

    .line 467
    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 450
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 451
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/u;->e()Lcom/bumptech/glide/g/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 452
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/u;->b:Lcom/roidapp/cloudlib/facebook/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2120

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->sendEmptyMessage(I)Z

    .line 453
    return-void
.end method
