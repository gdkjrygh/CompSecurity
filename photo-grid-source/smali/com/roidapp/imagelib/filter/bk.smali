.class public final Lcom/roidapp/imagelib/filter/bk;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:I

.field private final b:Landroid/graphics/Paint;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Integer;

.field private e:D

.field private f:D

.field private final g:Landroid/graphics/Bitmap;

.field private final h:Landroid/graphics/Bitmap;

.field private final i:Landroid/graphics/drawable/Drawable;

.field private final j:Landroid/graphics/drawable/Drawable;

.field private final k:F

.field private final l:F

.field private final m:F

.field private final n:F

.field private final o:F

.field private final p:F

.field private q:I

.field private r:Z

.field private final s:Lcom/roidapp/imagelib/filter/bm;

.field private t:Z

.field private u:D

.field private v:F

.field private w:Z

.field private x:Lcom/roidapp/imagelib/filter/bn;

.field private y:F

.field private z:I


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Context;)V
    .locals 6

    .prologue
    const/16 v5, 0xff

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    .line 115
    invoke-direct {p0, p3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 54
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->b:Landroid/graphics/Paint;

    .line 76
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    .line 77
    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->v:F

    .line 78
    iput-boolean v3, p0, Lcom/roidapp/imagelib/filter/bk;->w:Z

    .line 82
    const/16 v0, 0x33

    const/16 v1, 0xb5

    const/16 v2, 0xe5

    invoke-static {v5, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->a:I

    .line 112
    iput v5, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    .line 116
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->p:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->g:Landroid/graphics/Bitmap;

    .line 118
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->q:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->h:Landroid/graphics/Bitmap;

    .line 121
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->i:Landroid/graphics/drawable/Drawable;

    .line 122
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->j:Landroid/graphics/drawable/Drawable;

    .line 124
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bk;->c:Ljava/lang/Integer;

    .line 125
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/bk;->d:Ljava/lang/Integer;

    .line 126
    invoke-virtual {p1}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    .line 127
    invoke-virtual {p2}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->f:D

    .line 128
    invoke-static {p1}, Lcom/roidapp/imagelib/filter/bm;->a(Ljava/lang/Number;)Lcom/roidapp/imagelib/filter/bm;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->s:Lcom/roidapp/imagelib/filter/bm;

    .line 129
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->k:F

    .line 130
    iget v0, p0, Lcom/roidapp/imagelib/filter/bk;->k:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->l:F

    .line 131
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->m:F

    .line 132
    const v0, 0x3e99999a    # 0.3f

    iget v1, p0, Lcom/roidapp/imagelib/filter/bk;->m:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->n:F

    .line 133
    iget v0, p0, Lcom/roidapp/imagelib/filter/bk;->l:F

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    .line 134
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->p:F

    .line 135
    iget v0, p0, Lcom/roidapp/imagelib/filter/bk;->v:F

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->v:F

    .line 136
    invoke-virtual {p0, v3}, Lcom/roidapp/imagelib/filter/bk;->setFocusable(Z)V

    .line 137
    invoke-virtual {p0, v3}, Lcom/roidapp/imagelib/filter/bk;->setFocusableInTouchMode(Z)V

    .line 1142
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->q:I

    .line 139
    return-void
.end method

.method private a(D)Ljava/lang/Integer;
    .locals 9

    .prologue
    .line 329
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->s:Lcom/roidapp/imagelib/filter/bm;

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    iget-wide v4, p0, Lcom/roidapp/imagelib/filter/bk;->f:D

    iget-wide v6, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    sub-double/2addr v4, v6

    mul-double/2addr v4, p1

    add-double/2addr v2, v4

    .line 2524
    sget-object v1, Lcom/roidapp/imagelib/filter/bl;->a:[I

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bm;->ordinal()I

    move-result v4

    aget v1, v1, v4

    packed-switch v1, :pswitch_data_0

    .line 2540
    new-instance v1, Ljava/lang/InstantiationError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "can\'t convert "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " to a Number object"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/InstantiationError;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2526
    :pswitch_0
    new-instance v0, Ljava/lang/Long;

    double-to-long v2, v2

    invoke-direct {v0, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 329
    :goto_0
    check-cast v0, Ljava/lang/Integer;

    return-object v0

    .line 2528
    :pswitch_1
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    .line 2530
    :pswitch_2
    new-instance v0, Ljava/lang/Integer;

    double-to-int v1, v2

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_0

    .line 2532
    :pswitch_3
    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, v2, v3}, Ljava/lang/Float;-><init>(D)V

    goto :goto_0

    .line 2534
    :pswitch_4
    new-instance v0, Ljava/lang/Short;

    double-to-int v1, v2

    int-to-short v1, v1

    invoke-direct {v0, v1}, Ljava/lang/Short;-><init>(S)V

    goto :goto_0

    .line 2536
    :pswitch_5
    new-instance v0, Ljava/lang/Byte;

    double-to-int v1, v2

    int-to-byte v1, v1

    invoke-direct {v0, v1}, Ljava/lang/Byte;-><init>(B)V

    goto :goto_0

    .line 2538
    :pswitch_6
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    goto :goto_0

    .line 2524
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private a()V
    .locals 2

    .prologue
    .line 289
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 290
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 292
    :cond_0
    return-void
.end method

.method private final a(Landroid/view/MotionEvent;)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const-wide/16 v2, 0x0

    .line 295
    iget v0, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 296
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    .line 2310
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getWidth()I

    move-result v1

    .line 2311
    int-to-float v4, v1

    iget v5, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    mul-float/2addr v5, v6

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_0

    move-wide v0, v2

    .line 2367
    :goto_0
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    .line 2368
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->invalidate()V

    .line 300
    return-void

    .line 2315
    :cond_0
    iget v4, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    sub-float/2addr v0, v4

    int-to-float v1, v1

    iget v4, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    mul-float/2addr v4, v6

    sub-float/2addr v1, v4

    div-float/2addr v0, v1

    float-to-double v0, v0

    .line 2316
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    goto :goto_0
.end method

.method private b()D
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    .line 350
    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->f:D

    iget-wide v4, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    sub-double/2addr v2, v4

    cmpl-double v2, v0, v2

    if-nez v2, :cond_0

    .line 354
    :goto_0
    return-wide v0

    :cond_0
    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    sub-double/2addr v0, v2

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->f:D

    iget-wide v4, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    sub-double/2addr v2, v4

    div-double/2addr v0, v2

    goto :goto_0
.end method

.method private b(D)F
    .locals 5

    .prologue
    .line 424
    iget v0, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    float-to-double v0, v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    iget v4, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    float-to-double v2, v2

    mul-double/2addr v2, p1

    add-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 375
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->r:Z

    .line 376
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/bn;->a()V

    .line 378
    :cond_0
    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 385
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->r:Z

    .line 386
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/bn;->b()V

    .line 388
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/bn;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    .line 96
    return-void
.end method

.method public final a(Ljava/lang/Integer;)V
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    .line 154
    .line 1341
    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->f:D

    iget-wide v4, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    sub-double/2addr v2, v4

    cmpl-double v2, v0, v2

    if-nez v2, :cond_0

    .line 154
    :goto_0
    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    .line 155
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->invalidate()V

    .line 156
    return-void

    .line 1345
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    sub-double/2addr v0, v2

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->f:D

    iget-wide v4, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    sub-double/2addr v2, v4

    div-double/2addr v0, v2

    goto :goto_0
.end method

.method public final a(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .prologue
    .line 147
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bk;->c:Ljava/lang/Integer;

    .line 148
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/bk;->d:Ljava/lang/Integer;

    .line 149
    invoke-virtual {p1}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->e:D

    .line 150
    invoke-virtual {p2}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->f:D

    .line 151
    return-void
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v7, 0x3f000000    # 0.5f

    .line 431
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 434
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/imagelib/filter/bk;->n:F

    sub-float/2addr v2, v3

    mul-float/2addr v2, v7

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/imagelib/filter/bk;->o:F

    sub-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getHeight()I

    move-result v4

    int-to-float v4, v4

    iget v5, p0, Lcom/roidapp/imagelib/filter/bk;->n:F

    add-float/2addr v4, v5

    mul-float/2addr v4, v7

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 437
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bk;->i:Landroid/graphics/drawable/Drawable;

    new-instance v2, Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    float-to-int v3, v3

    iget v4, v0, Landroid/graphics/RectF;->top:F

    float-to-int v4, v4

    iget v5, v0, Landroid/graphics/RectF;->right:F

    float-to-int v5, v5

    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v6, v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 438
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bk;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 442
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->b()D

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v1

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    .line 444
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->b()D

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 445
    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 452
    :goto_0
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bk;->j:Landroid/graphics/drawable/Drawable;

    new-instance v2, Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    float-to-int v3, v3

    iget v4, v0, Landroid/graphics/RectF;->top:F

    float-to-int v4, v4

    iget v5, v0, Landroid/graphics/RectF;->right:F

    float-to-int v5, v5

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v0, v0

    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 453
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 3462
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v0

    iget v1, p0, Lcom/roidapp/imagelib/filter/bk;->v:F

    div-float/2addr v1, v8

    sub-float/2addr v0, v1

    .line 3463
    iget v1, p0, Lcom/roidapp/imagelib/filter/bk;->v:F

    add-float/2addr v1, v0

    .line 3464
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v7

    iget v3, p0, Lcom/roidapp/imagelib/filter/bk;->p:F

    div-float/2addr v3, v8

    sub-float/2addr v2, v3

    .line 3465
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getHeight()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v7

    iget v4, p0, Lcom/roidapp/imagelib/filter/bk;->p:F

    div-float/2addr v4, v8

    add-float/2addr v3, v4

    .line 3466
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v0, v2, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 3467
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->b:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3468
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 456
    iget-wide v0, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v1

    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->t:Z

    .line 3482
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->h:Landroid/graphics/Bitmap;

    :goto_1
    iget v2, p0, Lcom/roidapp/imagelib/filter/bk;->l:F

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v7

    iget v3, p0, Lcom/roidapp/imagelib/filter/bk;->m:F

    sub-float/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 459
    return-void

    .line 448
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->b()D

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 449
    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    goto :goto_0

    .line 3482
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->g:Landroid/graphics/Bitmap;

    goto :goto_1
.end method

.method protected final declared-synchronized onMeasure(II)V
    .locals 3

    .prologue
    .line 161
    monitor-enter p0

    const/16 v0, 0xc8

    .line 162
    :try_start_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eqz v1, :cond_1

    .line 163
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    move v1, v0

    .line 165
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    .line 166
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    if-eqz v2, :cond_0

    .line 167
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 169
    :cond_0
    invoke-virtual {p0, v1, v0}, Lcom/roidapp/imagelib/filter/bk;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    monitor-exit p0

    return-void

    .line 161
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    move v1, v0

    goto :goto_0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 175
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 267
    :goto_0
    return v0

    .line 180
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 181
    and-int/lit16 v2, v2, 0xff

    packed-switch v2, :pswitch_data_0

    :cond_1
    :goto_1
    :pswitch_0
    move v0, v1

    .line 267
    goto :goto_0

    .line 185
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    .line 186
    iget v2, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    .line 187
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, p0, Lcom/roidapp/imagelib/filter/bk;->y:F

    .line 189
    iget v2, p0, Lcom/roidapp/imagelib/filter/bk;->y:F

    .line 1398
    iget-wide v4, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    .line 1413
    invoke-direct {p0, v4, v5}, Lcom/roidapp/imagelib/filter/bk;->b(D)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v3, p0, Lcom/roidapp/imagelib/filter/bk;->l:F

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_2

    move v0, v1

    .line 189
    :cond_2
    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->t:Z

    .line 195
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/filter/bk;->setPressed(Z)V

    .line 196
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->invalidate()V

    .line 197
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->c()V

    .line 198
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/bk;->a(Landroid/view/MotionEvent;)V

    .line 199
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->a()V

    .line 200
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    if-eqz v0, :cond_1

    .line 201
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->a(D)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, p0, v2}, Lcom/roidapp/imagelib/filter/bn;->a(Lcom/roidapp/imagelib/filter/bk;I)V

    goto :goto_1

    .line 205
    :pswitch_2
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->t:Z

    if-eqz v0, :cond_1

    .line 207
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->r:Z

    if-eqz v0, :cond_4

    .line 208
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/bk;->a(Landroid/view/MotionEvent;)V

    .line 223
    :cond_3
    :goto_2
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    if-eqz v0, :cond_1

    .line 224
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->a(D)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, p0, v2}, Lcom/roidapp/imagelib/filter/bn;->a(Lcom/roidapp/imagelib/filter/bk;I)V

    goto :goto_1

    .line 211
    :cond_4
    iget v0, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 212
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    .line 214
    iget v2, p0, Lcom/roidapp/imagelib/filter/bk;->y:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/roidapp/imagelib/filter/bk;->q:I

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    .line 215
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/filter/bk;->setPressed(Z)V

    .line 216
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->invalidate()V

    .line 217
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->c()V

    .line 218
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/bk;->a(Landroid/view/MotionEvent;)V

    .line 219
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->a()V

    goto :goto_2

    .line 229
    :pswitch_3
    iget-boolean v2, p0, Lcom/roidapp/imagelib/filter/bk;->r:Z

    if-eqz v2, :cond_5

    .line 230
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/bk;->a(Landroid/view/MotionEvent;)V

    .line 231
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->d()V

    .line 232
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/bk;->setPressed(Z)V

    .line 241
    :goto_3
    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/bk;->t:Z

    .line 242
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->invalidate()V

    .line 243
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    if-eqz v0, :cond_1

    .line 244
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bk;->x:Lcom/roidapp/imagelib/filter/bn;

    iget-wide v2, p0, Lcom/roidapp/imagelib/filter/bk;->u:D

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->a(D)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, p0, v2}, Lcom/roidapp/imagelib/filter/bn;->a(Lcom/roidapp/imagelib/filter/bk;I)V

    goto/16 :goto_1

    .line 236
    :cond_5
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->c()V

    .line 237
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/bk;->a(Landroid/view/MotionEvent;)V

    .line 238
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->d()V

    goto :goto_3

    .line 248
    :pswitch_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 250
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, p0, Lcom/roidapp/imagelib/filter/bk;->y:F

    .line 251
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    .line 264
    :cond_6
    :goto_4
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->invalidate()V

    goto/16 :goto_1

    .line 2271
    :pswitch_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const v3, 0xff00

    and-int/2addr v2, v3

    shr-int/lit8 v2, v2, 0x8

    .line 2273
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 2274
    iget v4, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    if-ne v3, v4, :cond_8

    .line 2278
    if-nez v2, :cond_7

    move v0, v1

    .line 2279
    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, p0, Lcom/roidapp/imagelib/filter/bk;->y:F

    .line 2280
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/bk;->z:I

    .line 257
    :cond_8
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bk;->invalidate()V

    goto/16 :goto_1

    .line 260
    :pswitch_6
    iget-boolean v2, p0, Lcom/roidapp/imagelib/filter/bk;->r:Z

    if-eqz v2, :cond_6

    .line 261
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/bk;->d()V

    .line 262
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/bk;->setPressed(Z)V

    goto :goto_4

    .line 181
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_6
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
