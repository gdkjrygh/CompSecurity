.class public Lcom/roidapp/photogrid/release/GridImageView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/graphics/Matrix;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Landroid/content/Context;

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 21
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->h:I

    .line 30
    iput-object p1, p0, Lcom/roidapp/photogrid/release/GridImageView;->g:Landroid/content/Context;

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->h:I

    .line 36
    iput-object p1, p0, Lcom/roidapp/photogrid/release/GridImageView;->g:Landroid/content/Context;

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->h:I

    .line 42
    iput-object p1, p0, Lcom/roidapp/photogrid/release/GridImageView;->g:Landroid/content/Context;

    .line 44
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lcom/roidapp/photogrid/release/GridImageView;->h:I

    .line 48
    return-void
.end method

.method public final a(II)V
    .locals 0

    .prologue
    .line 51
    iput p1, p0, Lcom/roidapp/photogrid/release/GridImageView;->c:I

    .line 52
    iput p2, p0, Lcom/roidapp/photogrid/release/GridImageView;->d:I

    .line 53
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 107
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 108
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    .line 60
    .line 1146
    iget-object v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 1147
    iget-object v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 1148
    iget-object v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/GridImageView;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1150
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    .line 1152
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 1153
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1154
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/GridImageView;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 1156
    :cond_1
    invoke-virtual {p1, v5}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 61
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    .line 62
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    .line 63
    iget-object v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    iget v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    invoke-virtual {v1, v5, v5, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 67
    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->h:I

    packed-switch v1, :pswitch_data_0

    .line 104
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/GridImageView;->invalidate()V

    .line 105
    return-void

    .line 72
    :pswitch_0
    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->d:I

    mul-int/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->c:I

    iget v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    mul-int/2addr v2, v3

    if-le v1, v2, :cond_2

    .line 73
    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->d:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 74
    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->c:I

    int-to-float v1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sub-float/2addr v1, v3

    mul-float/2addr v1, v4

    .line 80
    :goto_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 81
    iget-object v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 82
    iget-object v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    add-float/2addr v1, v4

    float-to-int v1, v1

    int-to-float v1, v1

    add-float/2addr v0, v4

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_0

    .line 76
    :cond_2
    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->c:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 77
    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->d:I

    int-to-float v1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sub-float/2addr v1, v3

    mul-float/2addr v1, v4

    move v6, v1

    move v1, v0

    move v0, v6

    goto :goto_1

    .line 87
    :pswitch_1
    iget v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->c:I

    if-gt v0, v1, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->d:I

    if-gt v0, v1, :cond_3

    .line 88
    const/high16 v0, 0x3f800000    # 1.0f

    .line 94
    :goto_2
    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->c:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    int-to-float v2, v2

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    mul-float/2addr v1, v4

    add-float/2addr v1, v4

    float-to-int v1, v1

    int-to-float v1, v1

    .line 95
    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->d:I

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    int-to-float v3, v3

    mul-float/2addr v3, v0

    sub-float/2addr v2, v3

    mul-float/2addr v2, v4

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-float v2, v2

    .line 97
    iget-object v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 98
    iget-object v3, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v3, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto/16 :goto_0

    .line 90
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->c:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->a:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/GridImageView;->d:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->b:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto :goto_2

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onAttachedToWindow()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 130
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 131
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 132
    iget-object v2, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/GridImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 134
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 132
    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 138
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 142
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 113
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/GridImageView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 126
    :cond_1
    return-void
.end method
