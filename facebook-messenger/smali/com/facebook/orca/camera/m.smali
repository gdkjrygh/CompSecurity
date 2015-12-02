.class Lcom/facebook/orca/camera/m;
.super Ljava/lang/Object;
.source "HighlightView.java"


# static fields
.field private static final g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field a:Landroid/view/View;

.field b:Z

.field c:Z

.field d:Landroid/graphics/Rect;

.field e:Landroid/graphics/RectF;

.field f:Landroid/graphics/Matrix;

.field private h:Lcom/facebook/orca/camera/n;

.field private i:Landroid/graphics/RectF;

.field private j:Z

.field private k:F

.field private l:Z

.field private m:Landroid/graphics/drawable/Drawable;

.field private n:Landroid/graphics/drawable/Drawable;

.field private o:Landroid/graphics/drawable/Drawable;

.field private final p:Landroid/graphics/Paint;

.field private final q:Landroid/graphics/Paint;

.field private final r:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/facebook/orca/camera/m;

    sput-object v0, Lcom/facebook/orca/camera/m;->g:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 402
    sget-object v0, Lcom/facebook/orca/camera/n;->None:Lcom/facebook/orca/camera/n;

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->h:Lcom/facebook/orca/camera/n;

    .line 409
    iput-boolean v1, p0, Lcom/facebook/orca/camera/m;->j:Z

    .line 411
    iput-boolean v1, p0, Lcom/facebook/orca/camera/m;->l:Z

    .line 417
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->p:Landroid/graphics/Paint;

    .line 418
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->q:Landroid/graphics/Paint;

    .line 419
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    .line 51
    iput-object p1, p0, Lcom/facebook/orca/camera/m;->a:Landroid/view/View;

    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 56
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->a:Landroid/view/View;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 58
    :cond_0
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 62
    sget v1, Lcom/facebook/h;->orca_camera_crop_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/camera/m;->m:Landroid/graphics/drawable/Drawable;

    .line 64
    sget v1, Lcom/facebook/h;->orca_camera_crop_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/camera/m;->n:Landroid/graphics/drawable/Drawable;

    .line 66
    sget v1, Lcom/facebook/h;->orca_indicator_autocrop:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->o:Landroid/graphics/drawable/Drawable;

    .line 68
    return-void
.end method

.method private e()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 364
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 366
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->f:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 367
    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method


# virtual methods
.method public a(FF)I
    .locals 9

    .prologue
    const/16 v0, 0x20

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/high16 v7, 0x41a00000    # 20.0f

    .line 188
    invoke-direct {p0}, Lcom/facebook/orca/camera/m;->e()Landroid/graphics/Rect;

    move-result-object v5

    .line 192
    iget-boolean v2, p0, Lcom/facebook/orca/camera/m;->l:Z

    if-eqz v2, :cond_5

    .line 193
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerX()I

    move-result v2

    int-to-float v2, v2

    sub-float v2, p1, v2

    .line 194
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerY()I

    move-result v3

    int-to-float v3, v3

    sub-float v3, p2, v3

    .line 195
    mul-float v4, v2, v2

    mul-float v5, v3, v3

    add-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-int v4, v4

    .line 197
    iget-object v5, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    .line 198
    sub-int v6, v4, v5

    .line 199
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-float v6, v6

    cmpg-float v6, v6, v7

    if-gtz v6, :cond_4

    .line 200
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 201
    cmpg-float v0, v3, v8

    if-gez v0, :cond_1

    .line 202
    const/16 v0, 0x8

    .line 245
    :cond_0
    :goto_0
    return v0

    .line 204
    :cond_1
    const/16 v0, 0x10

    goto :goto_0

    .line 207
    :cond_2
    cmpg-float v0, v2, v8

    if-gez v0, :cond_3

    .line 208
    const/4 v0, 0x2

    goto :goto_0

    .line 210
    :cond_3
    const/4 v0, 0x4

    goto :goto_0

    .line 213
    :cond_4
    if-lt v4, v5, :cond_0

    move v0, v1

    .line 216
    goto :goto_0

    .line 221
    :cond_5
    iget v2, v5, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    sub-float/2addr v2, v7

    cmpl-float v2, p2, v2

    if-ltz v2, :cond_a

    iget v2, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    add-float/2addr v2, v7

    cmpg-float v2, p2, v2

    if-gez v2, :cond_a

    move v2, v1

    .line 223
    :goto_1
    iget v4, v5, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    sub-float/2addr v4, v7

    cmpl-float v4, p1, v4

    if-ltz v4, :cond_6

    iget v4, v5, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    add-float/2addr v4, v7

    cmpg-float v4, p1, v4

    if-gez v4, :cond_6

    move v3, v1

    .line 227
    :cond_6
    iget v4, v5, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    sub-float/2addr v4, p1

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v7

    if-gez v4, :cond_c

    if-eqz v2, :cond_c

    .line 228
    const/4 v4, 0x3

    .line 230
    :goto_2
    iget v6, v5, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    sub-float/2addr v6, p1

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v7

    if-gez v6, :cond_7

    if-eqz v2, :cond_7

    .line 231
    or-int/lit8 v4, v4, 0x4

    .line 233
    :cond_7
    iget v2, v5, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    sub-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v7

    if-gez v2, :cond_8

    if-eqz v3, :cond_8

    .line 234
    or-int/lit8 v4, v4, 0x8

    .line 236
    :cond_8
    iget v2, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    sub-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v7

    if-gez v2, :cond_b

    if-eqz v3, :cond_b

    .line 237
    or-int/lit8 v4, v4, 0x10

    move v2, v4

    .line 241
    :goto_3
    if-ne v2, v1, :cond_9

    float-to-int v1, p1

    float-to-int v3, p2

    invoke-virtual {v5, v1, v3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_9
    move v0, v2

    goto :goto_0

    :cond_a
    move v2, v3

    .line 221
    goto :goto_1

    :cond_b
    move v2, v4

    goto :goto_3

    :cond_c
    move v4, v1

    goto :goto_2
.end method

.method a(IFF)V
    .locals 5

    .prologue
    const/4 v1, -0x1

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 251
    invoke-direct {p0}, Lcom/facebook/orca/camera/m;->e()Landroid/graphics/Rect;

    move-result-object v3

    .line 252
    if-ne p1, v2, :cond_0

    .line 273
    :goto_0
    return-void

    .line 254
    :cond_0
    const/16 v4, 0x20

    if-ne p1, v4, :cond_1

    .line 256
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    mul-float/2addr v0, p2

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    mul-float/2addr v1, p3

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/camera/m;->b(FF)V

    goto :goto_0

    .line 259
    :cond_1
    and-int/lit8 v4, p1, 0x6

    if-nez v4, :cond_2

    move p2, v0

    .line 263
    :cond_2
    and-int/lit8 v4, p1, 0x18

    if-nez v4, :cond_3

    move p3, v0

    .line 268
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v0, v4

    mul-float v4, p2, v0

    .line 269
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    mul-float v3, p3, v0

    .line 270
    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_4

    move v0, v1

    :goto_1
    int-to-float v0, v0

    mul-float/2addr v4, v0

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_5

    move v0, v1

    :goto_2
    int-to-float v0, v0

    mul-float/2addr v0, v3

    invoke-virtual {p0, v4, v0}, Lcom/facebook/orca/camera/m;->c(FF)V

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_1

    :cond_5
    move v0, v2

    goto :goto_2
.end method

.method protected a(Landroid/graphics/Canvas;)V
    .locals 14

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 86
    iget-boolean v0, p0, Lcom/facebook/orca/camera/m;->c:Z

    if-eqz v0, :cond_1

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 89
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 90
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 91
    invoke-virtual {p0}, Lcom/facebook/orca/camera/m;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 95
    :cond_2
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 97
    iget-boolean v0, p0, Lcom/facebook/orca/camera/m;->l:Z

    if-eqz v0, :cond_3

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    .line 99
    iget-object v3, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    .line 100
    iget-object v4, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    div-float v5, v0, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    div-float/2addr v3, v6

    add-float/2addr v3, v5

    div-float/2addr v0, v6

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v4, v3, v0, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    const v3, -0x10fb2a

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 109
    :goto_1
    sget-object v0, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 110
    invoke-virtual {p0}, Lcom/facebook/orca/camera/m;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/camera/m;->p:Landroid/graphics/Paint;

    :goto_2
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 113
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->h:Lcom/facebook/orca/camera/n;

    sget-object v1, Lcom/facebook/orca/camera/n;->Grow:Lcom/facebook/orca/camera/n;

    if-ne v0, v1, :cond_0

    .line 117
    iget-boolean v0, p0, Lcom/facebook/orca/camera/m;->l:Z

    if-eqz v0, :cond_5

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 119
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 121
    const-wide v2, 0x3fe921fb54442d18L    # 0.7853981633974483

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-double v4, v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    .line 123
    iget-object v3, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v3, v0

    .line 125
    iget-object v3, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    sub-int v2, v3, v2

    div-int/lit8 v1, v1, 0x2

    sub-int v1, v2, v1

    .line 127
    iget-object v2, p0, Lcom/facebook/orca/camera/m;->o:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v3, v0

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 130
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 106
    :cond_3
    new-instance v0, Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-direct {v0, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    const/16 v3, -0x7600

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    goto/16 :goto_1

    .line 110
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->q:Landroid/graphics/Paint;

    goto/16 :goto_2

    .line 132
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    add-int/lit8 v0, v0, 0x1

    .line 133
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/lit8 v1, v1, 0x1

    .line 134
    iget-object v2, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/lit8 v2, v2, 0x4

    .line 135
    iget-object v3, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v3, v3, 0x3

    .line 137
    iget-object v4, p0, Lcom/facebook/orca/camera/m;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    .line 139
    iget-object v5, p0, Lcom/facebook/orca/camera/m;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    .line 141
    iget-object v6, p0, Lcom/facebook/orca/camera/m;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    .line 143
    iget-object v7, p0, Lcom/facebook/orca/camera/m;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    .line 146
    iget-object v8, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->left:I

    iget-object v9, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->right:I

    iget-object v10, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->left:I

    sub-int/2addr v9, v10

    div-int/lit8 v9, v9, 0x2

    add-int/2addr v8, v9

    .line 148
    iget-object v9, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    iget-object v10, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    iget-object v11, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    iget v11, v11, Landroid/graphics/Rect;->top:I

    sub-int/2addr v10, v11

    div-int/lit8 v10, v10, 0x2

    add-int/2addr v9, v10

    .line 151
    iget-object v10, p0, Lcom/facebook/orca/camera/m;->m:Landroid/graphics/drawable/Drawable;

    sub-int v11, v0, v4

    sub-int v12, v9, v5

    add-int/2addr v0, v4

    add-int v13, v9, v5

    invoke-virtual {v10, v11, v12, v0, v13}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->m:Landroid/graphics/drawable/Drawable;

    sub-int v10, v1, v4

    sub-int v11, v9, v5

    add-int/2addr v1, v4

    add-int v4, v9, v5

    invoke-virtual {v0, v10, v11, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->n:Landroid/graphics/drawable/Drawable;

    sub-int v1, v8, v7

    sub-int v4, v2, v6

    add-int v5, v8, v7

    add-int/2addr v2, v6

    invoke-virtual {v0, v1, v4, v5, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 169
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->n:Landroid/graphics/drawable/Drawable;

    sub-int v1, v8, v7

    sub-int v2, v3, v6

    add-int v4, v8, v7

    add-int/2addr v3, v6

    invoke-virtual {v0, v1, v2, v4, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 173
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0
.end method

.method public a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZ)V
    .locals 5

    .prologue
    const/16 v4, 0x7d

    const/4 v0, 0x1

    const/16 v3, 0x32

    .line 377
    if-eqz p4, :cond_0

    move p5, v0

    .line 380
    :cond_0
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v1, p0, Lcom/facebook/orca/camera/m;->f:Landroid/graphics/Matrix;

    .line 382
    iput-object p3, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    .line 383
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, p2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iput-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    .line 384
    iput-boolean p5, p0, Lcom/facebook/orca/camera/m;->j:Z

    .line 385
    iput-boolean p4, p0, Lcom/facebook/orca/camera/m;->l:Z

    .line 387
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget-object v2, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v1, v2

    iput v1, p0, Lcom/facebook/orca/camera/m;->k:F

    .line 388
    invoke-direct {p0}, Lcom/facebook/orca/camera/m;->e()Landroid/graphics/Rect;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    .line 390
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 391
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->q:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 392
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 393
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 394
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->r:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 396
    sget-object v0, Lcom/facebook/orca/camera/n;->None:Lcom/facebook/orca/camera/n;

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->h:Lcom/facebook/orca/camera/n;

    .line 397
    invoke-direct {p0}, Lcom/facebook/orca/camera/m;->d()V

    .line 398
    return-void
.end method

.method public a(Lcom/facebook/orca/camera/n;)V
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->h:Lcom/facebook/orca/camera/n;

    if-eq p1, v0, :cond_0

    .line 181
    iput-object p1, p0, Lcom/facebook/orca/camera/m;->h:Lcom/facebook/orca/camera/n;

    .line 182
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 184
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 78
    iput-boolean p1, p0, Lcom/facebook/orca/camera/m;->b:Z

    .line 79
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/facebook/orca/camera/m;->b:Z

    return v0
.end method

.method public b()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 358
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iget-object v2, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    float-to-int v2, v2

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    float-to-int v3, v3

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method b(FF)V
    .locals 7

    .prologue
    const/16 v6, -0xa

    const/4 v5, 0x0

    .line 277
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-direct {v0, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 279
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 282
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v3

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v3, v4

    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 286
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v3

    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget-object v3, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    iget-object v4, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v3, v4

    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 290
    invoke-direct {p0}, Lcom/facebook/orca/camera/m;->e()Landroid/graphics/Rect;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    .line 291
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->union(Landroid/graphics/Rect;)V

    .line 292
    invoke-virtual {v0, v6, v6}, Landroid/graphics/Rect;->inset(II)V

    .line 293
    iget-object v1, p0, Lcom/facebook/orca/camera/m;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 294
    return-void
.end method

.method public b(Z)V
    .locals 0

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/facebook/orca/camera/m;->c:Z

    .line 83
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 372
    invoke-direct {p0}, Lcom/facebook/orca/camera/m;->e()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    .line 373
    return-void
.end method

.method c(FF)V
    .locals 8

    .prologue
    const/high16 v2, 0x41c80000    # 25.0f

    const/high16 v7, 0x40000000    # 2.0f

    const/4 v6, 0x0

    .line 298
    iget-boolean v0, p0, Lcom/facebook/orca/camera/m;->j:Z

    if-eqz v0, :cond_0

    .line 299
    cmpl-float v0, p1, v6

    if-eqz v0, :cond_6

    .line 300
    iget v0, p0, Lcom/facebook/orca/camera/m;->k:F

    div-float p2, p1, v0

    .line 309
    :cond_0
    :goto_0
    new-instance v3, Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-direct {v3, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 310
    cmpl-float v0, p1, v6

    if-lez v0, :cond_a

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v0

    mul-float v1, v7, p1

    add-float/2addr v0, v1

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    .line 311
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v1

    sub-float/2addr v0, v1

    div-float p1, v0, v7

    .line 313
    iget-boolean v0, p0, Lcom/facebook/orca/camera/m;->j:Z

    if-eqz v0, :cond_a

    .line 314
    iget v0, p0, Lcom/facebook/orca/camera/m;->k:F

    div-float p2, p1, v0

    move v0, p2

    move v1, p1

    .line 317
    :goto_1
    cmpl-float v4, v0, v6

    if-lez v4, :cond_1

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v4

    mul-float v5, v7, v0

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_1

    .line 318
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v4

    sub-float/2addr v0, v4

    div-float/2addr v0, v7

    .line 320
    iget-boolean v4, p0, Lcom/facebook/orca/camera/m;->j:Z

    if-eqz v4, :cond_1

    .line 321
    iget v1, p0, Lcom/facebook/orca/camera/m;->k:F

    mul-float/2addr v1, v0

    .line 325
    :cond_1
    neg-float v1, v1

    neg-float v0, v0

    invoke-virtual {v3, v1, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 329
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2

    .line 330
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v0

    sub-float v0, v2, v0

    neg-float v0, v0

    div-float/2addr v0, v7

    invoke-virtual {v3, v0, v6}, Landroid/graphics/RectF;->inset(FF)V

    .line 332
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/orca/camera/m;->j:Z

    if-eqz v0, :cond_7

    iget v0, p0, Lcom/facebook/orca/camera/m;->k:F

    div-float v0, v2, v0

    .line 335
    :goto_2
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpg-float v1, v1, v0

    if-gez v1, :cond_3

    .line 336
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v1

    sub-float/2addr v0, v1

    neg-float v0, v0

    div-float/2addr v0, v7

    invoke-virtual {v3, v6, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 340
    :cond_3
    iget v0, v3, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_8

    .line 341
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget v1, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    invoke-virtual {v3, v0, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 345
    :cond_4
    :goto_3
    iget v0, v3, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 346
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget v1, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v1

    invoke-virtual {v3, v6, v0}, Landroid/graphics/RectF;->offset(FF)V

    .line 351
    :cond_5
    :goto_4
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v0, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 352
    invoke-direct {p0}, Lcom/facebook/orca/camera/m;->e()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    .line 353
    iget-object v0, p0, Lcom/facebook/orca/camera/m;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 354
    return-void

    .line 301
    :cond_6
    cmpl-float v0, p2, v6

    if-eqz v0, :cond_0

    .line 302
    iget v0, p0, Lcom/facebook/orca/camera/m;->k:F

    mul-float p1, p2, v0

    goto/16 :goto_0

    :cond_7
    move v0, v2

    .line 332
    goto :goto_2

    .line 342
    :cond_8
    iget v0, v3, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 343
    iget v0, v3, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v1

    neg-float v0, v0

    invoke-virtual {v3, v0, v6}, Landroid/graphics/RectF;->offset(FF)V

    goto :goto_3

    .line 347
    :cond_9
    iget v0, v3, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 348
    iget v0, v3, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/facebook/orca/camera/m;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    neg-float v0, v0

    invoke-virtual {v3, v6, v0}, Landroid/graphics/RectF;->offset(FF)V

    goto :goto_4

    :cond_a
    move v0, p2

    move v1, p1

    goto/16 :goto_1
.end method
