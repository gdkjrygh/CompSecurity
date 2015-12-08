.class public Lcom/arist/model/skin/ColorImageView;
.super Landroid/widget/ImageView;

# interfaces
.implements Lcom/arist/model/skin/m;


# instance fields
.field private a:I

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorImageView;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorImageView;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorImageView;->b:Z

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget v0, p0, Lcom/arist/model/skin/ColorImageView;->a:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/arist/model/skin/ColorImageView;->a:I

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorImageView;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/LightingColorFilter;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 3

    iput-boolean p1, p0, Lcom/arist/model/skin/ColorImageView;->b:Z

    if-eqz p1, :cond_0

    new-instance v0, Landroid/graphics/LightingColorFilter;

    iget v1, p0, Lcom/arist/model/skin/ColorImageView;->a:I

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->b(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    return-void
.end method
