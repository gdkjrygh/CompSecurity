.class public final Lcom/roidapp/cloudlib/sns/e/b;
.super Lcom/bumptech/glide/g/b/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/bumptech/glide/g/b/d;-><init>(Landroid/widget/ImageView;)V

    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V
    .locals 4
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
    .line 22
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/e/b;->a()Landroid/view/View;

    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 24
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/a/b;->getIntrinsicWidth()I

    move-result v2

    .line 25
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/a/b;->getIntrinsicHeight()I

    move-result v3

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 27
    mul-int/2addr v3, v0

    div-int v2, v3, v2

    .line 28
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 29
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 30
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    .line 31
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 0

    .prologue
    .line 14
    check-cast p1, Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/e/b;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    return-void
.end method
