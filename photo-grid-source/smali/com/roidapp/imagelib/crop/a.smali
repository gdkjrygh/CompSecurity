.class public final Lcom/roidapp/imagelib/crop/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Lcom/roidapp/imagelib/crop/h;

.field e:Ljava/lang/Runnable;

.field private final f:Ljava/lang/String;

.field private g:Landroid/content/Context;

.field private h:Landroid/os/Handler;

.field private i:Lcom/roidapp/imagelib/crop/CropImageView;

.field private j:Landroid/graphics/Bitmap;

.field private k:I

.field private l:I

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:F

.field private q:Z

.field private r:Landroid/graphics/Rect;

.field private s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/imagelib/crop/CropImageView;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const-string v0, "CropImage"

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/a;->f:Ljava/lang/String;

    .line 36
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/a;->h:Landroid/os/Handler;

    .line 42
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/a;->m:Z

    .line 44
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/a;->n:Z

    .line 45
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/a;->o:Z

    .line 47
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/a;->q:Z

    .line 49
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/a;->s:Z

    .line 357
    new-instance v0, Lcom/roidapp/imagelib/crop/d;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/crop/d;-><init>(Lcom/roidapp/imagelib/crop/a;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/a;->e:Ljava/lang/Runnable;

    .line 53
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/a;->g:Landroid/content/Context;

    .line 54
    iput-object p2, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    .line 55
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-virtual {v0, p0}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Lcom/roidapp/imagelib/crop/a;)V

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/crop/a;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/crop/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/crop/a;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/a;->r:Landroid/graphics/Rect;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/imagelib/crop/a;)Lcom/roidapp/imagelib/crop/CropImageView;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/crop/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->h:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/crop/a;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->q:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/imagelib/crop/a;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->n:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/crop/a;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->p:F

    return v0
.end method

.method static synthetic g(Lcom/roidapp/imagelib/crop/a;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/imagelib/crop/a;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    return v0
.end method

.method static synthetic i(Lcom/roidapp/imagelib/crop/a;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->s:Z

    return v0
.end method

.method static synthetic j(Lcom/roidapp/imagelib/crop/a;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->o:Z

    return v0
.end method

.method static synthetic k(Lcom/roidapp/imagelib/crop/a;)Z
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->m:Z

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->s:Z

    .line 73
    return-void
.end method

.method public final a(F)V
    .locals 10

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 122
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CropImage/changeAspect"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    :cond_0
    :goto_0
    return-void

    .line 126
    :cond_1
    iput p1, p0, Lcom/roidapp/imagelib/crop/a;->p:F

    .line 128
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 129
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 131
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v5, v5, v3, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 132
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 135
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->n:Z

    if-eqz v0, :cond_3

    .line 137
    int-to-float v0, v3

    iget v4, p0, Lcom/roidapp/imagelib/crop/a;->p:F

    div-float/2addr v0, v4

    float-to-int v0, v0

    .line 138
    if-le v0, v1, :cond_5

    .line 141
    int-to-float v0, v1

    iget v4, p0, Lcom/roidapp/imagelib/crop/a;->p:F

    mul-float/2addr v0, v4

    float-to-int v0, v0

    move v4, v0

    move v0, v1

    .line 153
    :goto_1
    sub-int/2addr v3, v4

    div-int/lit8 v7, v3, 0x2

    .line 154
    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    .line 155
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v8, v7

    int-to-float v9, v1

    add-int/2addr v4, v7

    int-to-float v4, v4

    add-int/2addr v0, v1

    int-to-float v0, v0

    invoke-direct {v3, v8, v9, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 156
    new-instance v0, Landroid/graphics/Rect;

    iget v1, v3, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iget v4, v3, Landroid/graphics/RectF;->top:F

    float-to-int v4, v4

    iget v7, v3, Landroid/graphics/RectF;->right:F

    float-to-int v7, v7

    iget v8, v3, Landroid/graphics/RectF;->bottom:F

    float-to-int v8, v8

    invoke-direct {v0, v1, v4, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/a;->r:Landroid/graphics/Rect;

    .line 162
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    .line 167
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v4}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Landroid/graphics/Bitmap;)V

    .line 168
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    iget-boolean v4, p0, Lcom/roidapp/imagelib/crop/a;->s:Z

    iget-boolean v7, p0, Lcom/roidapp/imagelib/crop/a;->o:Z

    if-nez v7, :cond_2

    move v5, v6

    :cond_2
    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/crop/h;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZ)V

    .line 169
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->invalidate()V

    .line 170
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->b()V

    .line 171
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    .line 2046
    iput-boolean v6, v0, Lcom/roidapp/imagelib/crop/h;->b:Z

    goto :goto_0

    .line 145
    :cond_3
    int-to-float v0, v1

    iget v4, p0, Lcom/roidapp/imagelib/crop/a;->p:F

    mul-float/2addr v0, v4

    float-to-int v0, v0

    .line 146
    if-le v0, v3, :cond_4

    .line 149
    int-to-float v0, v3

    iget v4, p0, Lcom/roidapp/imagelib/crop/a;->p:F

    div-float/2addr v0, v4

    float-to-int v0, v0

    move v4, v3

    goto :goto_1

    :cond_4
    move v4, v0

    move v0, v1

    goto :goto_1

    :cond_5
    move v4, v3

    goto :goto_1
.end method

.method public final a(II)V
    .locals 10

    .prologue
    const/4 v6, 0x1

    const/4 v8, -0x1

    const/4 v7, 0x0

    .line 175
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CropImage/changeAspect"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    :cond_0
    :goto_0
    return-void

    .line 185
    :cond_1
    iput p1, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    .line 186
    iput p2, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    .line 188
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 189
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 191
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v7, v7, v4, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 192
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 195
    iget v3, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    if-eqz v3, :cond_8

    iget v3, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    if-eqz v3, :cond_8

    .line 196
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    iget v3, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    if-le v0, v3, :cond_3

    .line 198
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    mul-int/2addr v0, v4

    iget v3, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    div-int/2addr v0, v3

    .line 200
    if-le v0, v1, :cond_7

    .line 203
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    mul-int/2addr v0, v1

    iget v3, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    div-int/2addr v0, v3

    move v3, v0

    move v0, v1

    .line 219
    :goto_1
    iget v5, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    if-nez v5, :cond_2

    iget v5, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    if-nez v5, :cond_2

    .line 221
    mul-int/lit8 v0, v3, 0x4

    div-int/lit8 v0, v0, 0x5

    move v3, v0

    .line 225
    :cond_2
    iget v5, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    if-ne v5, v8, :cond_5

    iget v5, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    if-ne v5, v8, :cond_5

    move v0, v1

    move v5, v4

    .line 231
    :goto_2
    sub-int v3, v4, v5

    div-int/lit8 v4, v3, 0x2

    .line 232
    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    .line 233
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v8, v4

    int-to-float v9, v1

    add-int/2addr v4, v5

    int-to-float v4, v4

    add-int/2addr v0, v1

    int-to-float v0, v0

    invoke-direct {v3, v8, v9, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 234
    new-instance v0, Landroid/graphics/Rect;

    iget v1, v3, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iget v4, v3, Landroid/graphics/RectF;->top:F

    float-to-int v4, v4

    iget v5, v3, Landroid/graphics/RectF;->right:F

    float-to-int v5, v5

    iget v8, v3, Landroid/graphics/RectF;->bottom:F

    float-to-int v8, v8

    invoke-direct {v0, v1, v4, v5, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/a;->r:Landroid/graphics/Rect;

    .line 240
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    .line 245
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v4}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Landroid/graphics/Bitmap;)V

    .line 246
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    iget-boolean v4, p0, Lcom/roidapp/imagelib/crop/a;->s:Z

    iget v5, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    if-eqz v5, :cond_4

    iget v5, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    if-eqz v5, :cond_4

    move v5, v6

    :goto_3
    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/crop/h;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZ)V

    .line 248
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->invalidate()V

    .line 249
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->b()V

    .line 250
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    .line 3046
    iput-boolean v6, v0, Lcom/roidapp/imagelib/crop/h;->b:Z

    goto/16 :goto_0

    .line 208
    :cond_3
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    mul-int/2addr v0, v1

    iget v3, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    div-int/2addr v0, v3

    .line 210
    if-le v0, v4, :cond_6

    .line 213
    iget v0, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    mul-int/2addr v0, v4

    iget v3, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    div-int/2addr v0, v3

    move v3, v4

    goto :goto_1

    :cond_4
    move v5, v7

    .line 246
    goto :goto_3

    :cond_5
    move v5, v3

    goto :goto_2

    :cond_6
    move v3, v0

    move v0, v1

    goto :goto_1

    :cond_7
    move v3, v4

    goto/16 :goto_1

    :cond_8
    move v3, v0

    goto/16 :goto_1
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    .line 68
    :cond_0
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    .line 69
    return-void
.end method

.method public final a(ZFZ)V
    .locals 1

    .prologue
    .line 585
    iput-boolean p1, p0, Lcom/roidapp/imagelib/crop/a;->n:Z

    .line 586
    iput p2, p0, Lcom/roidapp/imagelib/crop/a;->p:F

    .line 587
    iput-boolean p3, p0, Lcom/roidapp/imagelib/crop/a;->o:Z

    .line 588
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->q:Z

    .line 589
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 272
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    .line 273
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->invalidate()V

    .line 274
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->b:Z

    .line 275
    return-void
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 580
    iput p1, p0, Lcom/roidapp/imagelib/crop/a;->k:I

    .line 581
    iput p2, p0, Lcom/roidapp/imagelib/crop/a;->l:I

    .line 582
    return-void
.end method

.method public final b(Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 80
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CropImage/crop"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 81
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->m:Z

    if-eq v0, v2, :cond_0

    if-nez p1, :cond_1

    .line 87
    :cond_0
    :goto_0
    return-void

    .line 84
    :cond_1
    iput-boolean v2, p0, Lcom/roidapp/imagelib/crop/a;->m:Z

    .line 85
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    .line 1090
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->g:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1094
    new-instance v0, Lcom/roidapp/imagelib/crop/b;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/crop/b;-><init>(Lcom/roidapp/imagelib/crop/a;)V

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/a;->h:Landroid/os/Handler;

    .line 1354
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/imagelib/crop/f;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/imagelib/crop/f;-><init>(Lcom/roidapp/imagelib/crop/a;Ljava/lang/Runnable;Landroid/os/Handler;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public final c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 260
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CropImage/cropAndSave"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 3282
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CropImage/onSaveClicked"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 3283
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/a;->b:Z

    if-eqz v0, :cond_1

    .line 262
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->i:Lcom/roidapp/imagelib/crop/CropImageView;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 263
    return-object p1

    .line 3286
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-eqz v0, :cond_0

    .line 3290
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 3293
    iput-boolean v8, p0, Lcom/roidapp/imagelib/crop/a;->b:Z

    .line 3295
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->a()Landroid/graphics/Rect;

    move-result-object v1

    .line 3297
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v4

    .line 3298
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v5

    .line 3300
    if-gtz v4, :cond_2

    if-lez v5, :cond_0

    .line 3304
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 3306
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 3307
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 3308
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3309
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 3311
    new-instance v7, Landroid/graphics/Rect;

    invoke-direct {v7, v9, v9, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 3312
    invoke-virtual {v6, p1, v1, v7, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 3314
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 3316
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 3317
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "=============resized crop time:"

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long v2, v4, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "============="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3319
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_3

    .line 3321
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 3322
    iput-object v10, p0, Lcom/roidapp/imagelib/crop/a;->j:Landroid/graphics/Bitmap;

    .line 3325
    :cond_3
    invoke-static {}, Ljava/lang/System;->gc()V

    move-object p1, v0

    .line 3326
    goto :goto_0
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 592
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->a()Landroid/graphics/Rect;

    move-result-object v0

    .line 593
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/a;->r:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 594
    const/4 v0, 0x1

    .line 596
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
