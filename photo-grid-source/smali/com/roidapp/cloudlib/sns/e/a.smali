.class public final Lcom/roidapp/cloudlib/sns/e/a;
.super Lcom/bumptech/glide/g/b/b;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/g/b/h;


# instance fields
.field private b:Lcom/roidapp/baselib/view/v;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/bumptech/glide/g/b/b;-><init>(Landroid/widget/ImageView;)V

    .line 27
    invoke-virtual {p0, p0}, Lcom/roidapp/cloudlib/sns/e/a;->a(Lcom/bumptech/glide/g/b/h;)V

    .line 28
    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 4

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/e/a;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/aq;->w:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 67
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 68
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 69
    cmpl-float v3, v0, v2

    if-lez v3, :cond_0

    int-to-float v2, p1

    div-float v0, v2, v0

    .line 70
    :goto_0
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-static {v1, v0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 71
    new-instance v2, Lcom/roidapp/baselib/view/v;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lcom/roidapp/baselib/view/v;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/v;->a(F)V

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/v;->a()V

    .line 74
    return-void

    .line 69
    :cond_0
    int-to-float v0, p2

    div-float/2addr v0, v2

    goto :goto_0
.end method

.method protected final a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/e/a;->a()Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/baselib/view/RoundImageView;

    if-eqz v0, :cond_0

    .line 33
    invoke-super {p0, p1}, Lcom/bumptech/glide/g/b/b;->a(Landroid/graphics/Bitmap;)V

    .line 41
    :goto_0
    return-void

    .line 36
    :cond_0
    new-instance v1, Lcom/roidapp/baselib/view/v;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/e/a;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/roidapp/baselib/view/v;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 37
    invoke-virtual {v1}, Lcom/roidapp/baselib/view/v;->a()V

    .line 38
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/v;->a(F)V

    .line 39
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/e/a;->a(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    invoke-super {p0, p1, v0}, Lcom/bumptech/glide/g/b/b;->a(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V

    .line 55
    :cond_0
    return-void
.end method

.method protected final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 18
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/e/a;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    invoke-super {p0, v0}, Lcom/bumptech/glide/g/b/b;->b(Landroid/graphics/drawable/Drawable;)V

    .line 62
    :cond_0
    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e/a;->b:Lcom/roidapp/baselib/view/v;

    invoke-super {p0, v0}, Lcom/bumptech/glide/g/b/b;->c(Landroid/graphics/drawable/Drawable;)V

    .line 48
    :cond_0
    return-void
.end method
