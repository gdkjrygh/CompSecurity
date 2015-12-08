.class final Lcom/roidapp/cloudlib/x;
.super Lcom/bumptech/glide/g/b/d;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    invoke-direct {p0, p2}, Lcom/bumptech/glide/g/b/d;-><init>(Landroid/widget/ImageView;)V

    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 201
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/x;->e()Lcom/bumptech/glide/g/c;

    move-result-object v0

    .line 202
    if-eqz v0, :cond_0

    .line 203
    iget-object v1, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    iget-object v1, v1, Lcom/roidapp/cloudlib/t;->n:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    if-eqz v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2121

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->sendEmptyMessage(I)Z

    .line 208
    :cond_1
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
    .line 230
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    .line 231
    invoke-direct {p0}, Lcom/roidapp/cloudlib/x;->g()V

    .line 232
    return-void
.end method

.method public final a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 218
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V

    .line 219
    invoke-direct {p0}, Lcom/roidapp/cloudlib/x;->g()V

    .line 220
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 0

    .prologue
    .line 189
    check-cast p1, Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/x;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    return-void
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 224
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/d;->b(Landroid/graphics/drawable/Drawable;)V

    .line 225
    invoke-direct {p0}, Lcom/roidapp/cloudlib/x;->g()V

    .line 226
    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 212
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 1191
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/x;->e()Lcom/bumptech/glide/g/c;

    move-result-object v0

    .line 1192
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    iget-object v1, v1, Lcom/roidapp/cloudlib/t;->n:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1193
    iget-object v1, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    iget-object v1, v1, Lcom/roidapp/cloudlib/t;->n:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1195
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    if-eqz v0, :cond_1

    .line 1196
    iget-object v0, p0, Lcom/roidapp/cloudlib/x;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2120

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->sendEmptyMessage(I)Z

    .line 214
    :cond_1
    return-void
.end method
