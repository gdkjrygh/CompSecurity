.class public Lcom/bumptech/glide/g/b/d;
.super Lcom/bumptech/glide/g/b/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/g/b/e",
        "<",
        "Lcom/bumptech/glide/load/resource/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field private b:I

.field private c:Lcom/bumptech/glide/load/resource/a/b;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/g/b/d;-><init>(Landroid/widget/ImageView;B)V

    .line 25
    return-void
.end method

.method private constructor <init>(Landroid/widget/ImageView;B)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/bumptech/glide/g/b/e;-><init>(Landroid/widget/ImageView;)V

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lcom/bumptech/glide/g/b/d;->b:I

    .line 39
    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V
    .locals 5
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
    const/high16 v4, 0x3f800000    # 1.0f

    const v3, 0x3d4ccccd    # 0.05f

    .line 52
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/a/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v1, v0

    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float v0, v1, v0

    .line 60
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/a/b;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/a/b;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 61
    sub-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    sub-float v0, v1, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    .line 63
    new-instance v1, Lcom/bumptech/glide/g/b/i;

    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-direct {v1, p1, v0}, Lcom/bumptech/glide/g/b/i;-><init>(Lcom/bumptech/glide/load/resource/a/b;I)V

    move-object p1, v1

    .line 66
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/g/b/e;->a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V

    .line 67
    iput-object p1, p0, Lcom/bumptech/glide/g/b/d;->c:Lcom/bumptech/glide/load/resource/a/b;

    .line 68
    iget v0, p0, Lcom/bumptech/glide/g/b/d;->b:I

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/load/resource/a/b;->a(I)V

    .line 69
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/a/b;->start()V

    .line 70
    return-void
.end method

.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 12
    check-cast p1, Lcom/bumptech/glide/load/resource/a/b;

    .line 1080
    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->a:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 12
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 0

    .prologue
    .line 12
    check-cast p1, Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/g/b/d;->a(Lcom/bumptech/glide/load/resource/a/b;Lcom/bumptech/glide/g/a/d;)V

    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->c:Lcom/bumptech/glide/load/resource/a/b;

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->c:Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/a/b;->start()V

    .line 88
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->c:Lcom/bumptech/glide/load/resource/a/b;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/bumptech/glide/g/b/d;->c:Lcom/bumptech/glide/load/resource/a/b;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/a/b;->stop()V

    .line 95
    :cond_0
    return-void
.end method
