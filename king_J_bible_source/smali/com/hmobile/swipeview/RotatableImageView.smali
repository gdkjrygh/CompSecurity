.class public Lcom/hmobile/swipeview/RotatableImageView;
.super Landroid/widget/ImageView;
.source "RotatableImageView.java"


# instance fields
.field private mRotation:I

.field private mXPivot:F

.field private mYPivot:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v1, 0x0

    .line 17
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/swipeview/RotatableImageView;->mRotation:I

    .line 12
    iput v1, p0, Lcom/hmobile/swipeview/RotatableImageView;->mXPivot:F

    .line 13
    iput v1, p0, Lcom/hmobile/swipeview/RotatableImageView;->mYPivot:F

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/swipeview/RotatableImageView;->mRotation:I

    .line 12
    iput v1, p0, Lcom/hmobile/swipeview/RotatableImageView;->mXPivot:F

    .line 13
    iput v1, p0, Lcom/hmobile/swipeview/RotatableImageView;->mYPivot:F

    .line 23
    return-void
.end method


# virtual methods
.method public getRotation()F
    .locals 1

    .prologue
    .line 46
    iget v0, p0, Lcom/hmobile/swipeview/RotatableImageView;->mRotation:I

    int-to-float v0, v0

    return v0
.end method

.method public getXPivot()F
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/hmobile/swipeview/RotatableImageView;->mXPivot:F

    return v0
.end method

.method public getYPivot()F
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/hmobile/swipeview/RotatableImageView;->mYPivot:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 62
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 63
    iget v0, p0, Lcom/hmobile/swipeview/RotatableImageView;->mRotation:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/hmobile/swipeview/RotatableImageView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/hmobile/swipeview/RotatableImageView;->mXPivot:F

    mul-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/hmobile/swipeview/RotatableImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/hmobile/swipeview/RotatableImageView;->mYPivot:F

    mul-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 64
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 65
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 66
    return-void
.end method

.method public setRotation(I)V
    .locals 1
    .param p1, "rotation"    # I

    .prologue
    const/high16 v0, 0x3f000000    # 0.5f

    .line 27
    invoke-virtual {p0, p1, v0, v0}, Lcom/hmobile/swipeview/RotatableImageView;->setRotation(IFF)V

    .line 28
    return-void
.end method

.method public setRotation(IFF)V
    .locals 0
    .param p1, "rotation"    # I
    .param p2, "xPivot"    # F
    .param p3, "yPivot"    # F

    .prologue
    .line 39
    iput p1, p0, Lcom/hmobile/swipeview/RotatableImageView;->mRotation:I

    .line 40
    iput p2, p0, Lcom/hmobile/swipeview/RotatableImageView;->mXPivot:F

    .line 41
    iput p3, p0, Lcom/hmobile/swipeview/RotatableImageView;->mYPivot:F

    .line 42
    return-void
.end method
