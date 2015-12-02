.class public Lcom/qihoo/security/widget/ImageView/a;
.super Landroid/graphics/drawable/LevelListDrawable;
.source "360Security"


# instance fields
.field a:Landroid/graphics/Paint;

.field b:Landroid/graphics/Bitmap;

.field c:Landroid/graphics/Canvas;

.field d:[I

.field private e:I

.field private f:I

.field private g:Landroid/graphics/Bitmap;

.field private h:F

.field private i:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/graphics/drawable/LevelListDrawable;-><init>()V

    .line 12
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->a:Landroid/graphics/Paint;

    .line 19
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->d:[I

    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/widget/ImageView/a;->h:F

    .line 25
    const/4 v0, 0x5

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->i:[I

    .line 29
    return-void
.end method

.method private d()Z
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 92
    const/4 v0, 0x5

    new-array v3, v0, [I

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    iget v4, p0, Lcom/qihoo/security/widget/ImageView/a;->e:I

    div-int/lit8 v4, v4, 0x4

    iget v5, p0, Lcom/qihoo/security/widget/ImageView/a;->f:I

    div-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v4, v5}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v0

    aput v0, v3, v1

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    iget v4, p0, Lcom/qihoo/security/widget/ImageView/a;->e:I

    div-int/lit8 v4, v4, 0x4

    iget v5, p0, Lcom/qihoo/security/widget/ImageView/a;->f:I

    mul-int/lit8 v5, v5, 0x3

    div-int/lit8 v5, v5, 0x4

    invoke-virtual {v0, v4, v5}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v0

    aput v0, v3, v2

    .line 95
    const/4 v0, 0x2

    iget-object v4, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/qihoo/security/widget/ImageView/a;->e:I

    mul-int/lit8 v5, v5, 0x3

    div-int/lit8 v5, v5, 0x4

    iget v6, p0, Lcom/qihoo/security/widget/ImageView/a;->f:I

    div-int/lit8 v6, v6, 0x4

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v4

    aput v4, v3, v0

    .line 96
    const/4 v0, 0x3

    iget-object v4, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/qihoo/security/widget/ImageView/a;->e:I

    mul-int/lit8 v5, v5, 0x3

    div-int/lit8 v5, v5, 0x4

    iget v6, p0, Lcom/qihoo/security/widget/ImageView/a;->f:I

    mul-int/lit8 v6, v6, 0x3

    div-int/lit8 v6, v6, 0x4

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v4

    aput v4, v3, v0

    .line 97
    const/4 v0, 0x4

    iget-object v4, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/qihoo/security/widget/ImageView/a;->e:I

    div-int/lit8 v5, v5, 0x2

    iget v6, p0, Lcom/qihoo/security/widget/ImageView/a;->f:I

    div-int/lit8 v6, v6, 0x2

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v4

    aput v4, v3, v0

    move v0, v1

    .line 98
    :goto_0
    iget-object v4, p0, Lcom/qihoo/security/widget/ImageView/a;->i:[I

    array-length v4, v4

    if-ge v0, v4, :cond_1

    .line 99
    aget v4, v3, v0

    iget-object v5, p0, Lcom/qihoo/security/widget/ImageView/a;->i:[I

    aget v5, v5, v0

    if-eq v4, v5, :cond_0

    .line 100
    iput-object v3, p0, Lcom/qihoo/security/widget/ImageView/a;->i:[I

    .line 104
    :goto_1
    return v1

    .line 98
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    .line 104
    goto :goto_1
.end method

.method private e()V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 109
    invoke-direct {p0}, Lcom/qihoo/security/widget/ImageView/a;->f()V

    .line 117
    :goto_0
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    .line 115
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/ImageView/a;->f()V

    goto :goto_0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 120
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 121
    new-instance v1, Landroid/graphics/BlurMaskFilter;

    const/high16 v2, 0x41a00000    # 20.0f

    sget-object v3, Landroid/graphics/BlurMaskFilter$Blur;->OUTER:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v1, v2, v3}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 122
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 124
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/qihoo/security/widget/ImageView/a;->d:[I

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Bitmap;->extractAlpha(Landroid/graphics/Paint;[I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :goto_0
    return-void

    .line 125
    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/graphics/Canvas;
    .locals 3

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->c:Landroid/graphics/Canvas;

    if-nez v0, :cond_0

    .line 68
    const/4 v0, 0x5

    :try_start_0
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->i:[I

    .line 69
    iget v0, p0, Lcom/qihoo/security/widget/ImageView/a;->e:I

    iget v1, p0, Lcom/qihoo/security/widget/ImageView/a;->f:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    .line 70
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->c:Landroid/graphics/Canvas;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->c:Landroid/graphics/Canvas;

    return-object v0

    .line 71
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(F)V
    .locals 0

    .prologue
    .line 42
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/a;->h:F

    .line 43
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 47
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 81
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/ImageView/a;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/ImageView/a;->f()V

    goto :goto_0

    .line 86
    :cond_3
    invoke-direct {p0}, Lcom/qihoo/security/widget/ImageView/a;->e()V

    goto :goto_0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/a;->e:I

    .line 55
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 142
    iput-object v1, p0, Lcom/qihoo/security/widget/ImageView/a;->b:Landroid/graphics/Bitmap;

    .line 143
    iput-object v1, p0, Lcom/qihoo/security/widget/ImageView/a;->c:Landroid/graphics/Canvas;

    .line 144
    iput-object v1, p0, Lcom/qihoo/security/widget/ImageView/a;->i:[I

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 148
    iput-object v1, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    .line 150
    :cond_1
    return-void
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 62
    iput p1, p0, Lcom/qihoo/security/widget/ImageView/a;->f:I

    .line 63
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ImageView/a;->b()V

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    :cond_0
    :goto_0
    return-void

    .line 135
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->a:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ImageView/a;->getLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/a;->g:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/qihoo/security/widget/ImageView/a;->d:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/qihoo/security/widget/ImageView/a;->d:[I

    const/4 v3, 0x1

    aget v2, v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/widget/ImageView/a;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0
.end method
