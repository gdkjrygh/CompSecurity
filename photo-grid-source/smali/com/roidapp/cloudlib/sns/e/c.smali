.class public final Lcom/roidapp/cloudlib/sns/e/c;
.super Lcom/bumptech/glide/g/b/d;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private b:Landroid/view/View;

.field private c:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/bumptech/glide/g/b/d;-><init>(Landroid/widget/ImageView;)V

    .line 20
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/e/c;->b:Landroid/view/View;

    .line 21
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/e/c;->c:Landroid/view/View;

    .line 22
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/c;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
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
    const/16 v1, 0x8

    .line 41
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    .line 42
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/c;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/c;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    return-void
.end method

.method public final a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 34
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V

    .line 35
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/c;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/c;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 0

    .prologue
    .line 14
    check-cast p1, Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/e/c;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 27
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/d;->c(Landroid/graphics/drawable/Drawable;)V

    .line 28
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/c;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/c;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 48
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/e/c;->e()Lcom/bumptech/glide/g/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/bumptech/glide/g/c;->b()V

    .line 49
    return-void
.end method
