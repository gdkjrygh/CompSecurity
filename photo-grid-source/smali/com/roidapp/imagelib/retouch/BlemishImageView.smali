.class public Lcom/roidapp/imagelib/retouch/BlemishImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Lcom/roidapp/imagelib/retouch/w;


# instance fields
.field private A:Lcom/roidapp/imagelib/retouch/x;

.field private B:Landroid/animation/ObjectAnimator;

.field private C:Landroid/animation/ObjectAnimator;

.field private D:Lcom/roidapp/imagelib/retouch/k;

.field private final E:Ljava/lang/Object;

.field private final F:Landroid/graphics/DrawFilter;

.field private G:Landroid/os/Handler;

.field private H:[F

.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:F

.field private i:F

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Landroid/graphics/Bitmap;

.field private p:Landroid/graphics/Matrix;

.field private q:Landroid/graphics/Matrix;

.field private r:Lcom/roidapp/imagelib/retouch/Inpaint;

.field private s:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private x:Lcom/roidapp/imagelib/retouch/t;

.field private y:Lcom/roidapp/imagelib/retouch/Magnifier;

.field private z:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 95
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 63
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    .line 65
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    .line 66
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    .line 67
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    .line 68
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    .line 69
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    .line 76
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->E:Ljava/lang/Object;

    .line 78
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->F:Landroid/graphics/DrawFilter;

    .line 83
    new-instance v0, Lcom/roidapp/imagelib/retouch/h;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/retouch/h;-><init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->G:Landroid/os/Handler;

    .line 143
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->H:[F

    .line 96
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->h()V

    .line 97
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 100
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    .line 65
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    .line 66
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    .line 67
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    .line 68
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    .line 69
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    .line 76
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->E:Ljava/lang/Object;

    .line 78
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->F:Landroid/graphics/DrawFilter;

    .line 83
    new-instance v0, Lcom/roidapp/imagelib/retouch/h;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/retouch/h;-><init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->G:Landroid/os/Handler;

    .line 143
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->H:[F

    .line 101
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->h()V

    .line 102
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 105
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 63
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    .line 65
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    .line 66
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    .line 67
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    .line 68
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    .line 69
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    .line 76
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->E:Ljava/lang/Object;

    .line 78
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->F:Landroid/graphics/DrawFilter;

    .line 83
    new-instance v0, Lcom/roidapp/imagelib/retouch/h;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/retouch/h;-><init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->G:Landroid/os/Handler;

    .line 143
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->H:[F

    .line 106
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->h()V

    .line 107
    return-void
.end method

.method private a(F)F
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 232
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    .line 234
    aget v1, v0, v2

    sub-float/2addr v1, p1

    .line 235
    aget v2, v0, v2

    add-float/2addr v2, p1

    .line 236
    aget v3, v0, v4

    sub-float/2addr v3, p1

    .line 237
    aget v0, v0, v4

    add-float/2addr v0, p1

    .line 238
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v1, v3, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 239
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 240
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 241
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float v0, v1, v0

    return v0

    .line 232
    :array_0
    .array-data 4
        0x42c80000    # 100.0f
        0x42c80000    # 100.0f
    .end array-data
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private a(FF)V
    .locals 7

    .prologue
    const/16 v6, 0xa

    const/4 v5, 0x0

    const/4 v4, 0x1

    const/4 v3, -0x1

    .line 464
    invoke-direct {p0, v4}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c(Z)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->y:Lcom/roidapp/imagelib/retouch/Magnifier;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/Magnifier;->a()I

    move-result v0

    .line 467
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 469
    int-to-float v2, v0

    cmpg-float v2, p1, v2

    if-gez v2, :cond_0

    int-to-float v2, v0

    cmpg-float v2, p2, v2

    if-gez v2, :cond_0

    .line 470
    const/16 v2, 0xb

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 471
    invoke-virtual {v1, v6, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 472
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 474
    :cond_0
    iget v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a:I

    sub-int/2addr v2, v0

    int-to-float v2, v2

    cmpl-float v2, p1, v2

    if-lez v2, :cond_1

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    .line 475
    const/16 v0, 0x9

    invoke-virtual {v1, v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 476
    invoke-virtual {v1, v6, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 477
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 480
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    .line 1458
    const/4 v1, 0x2

    new-array v1, v1, [F

    aput p1, v1, v5

    aput p2, v1, v4

    .line 1459
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 1460
    new-instance v0, Landroid/graphics/PointF;

    aget v2, v1, v5

    aget v1, v1, v4

    invoke-direct {v0, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 483
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->y:Lcom/roidapp/imagelib/retouch/Magnifier;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/retouch/Magnifier;->a(Landroid/graphics/PointF;)V

    .line 485
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->y:Lcom/roidapp/imagelib/retouch/Magnifier;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/Magnifier;->invalidate()V

    .line 486
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)V
    .locals 6

    .prologue
    .line 274
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 275
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 276
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 277
    iget v0, p2, Landroid/graphics/Rect;->left:I

    :goto_0
    iget v1, p2, Landroid/graphics/Rect;->right:I

    if-gt v0, v1, :cond_1

    .line 278
    iget v1, p2, Landroid/graphics/Rect;->top:I

    :goto_1
    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    if-gt v1, v3, :cond_0

    .line 279
    iget v3, p2, Landroid/graphics/Rect;->left:I

    sub-int v3, v0, v3

    iget v4, p2, Landroid/graphics/Rect;->top:I

    sub-int v4, v1, v4

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/graphics/Bitmap;->setPixel(III)V

    .line 278
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 277
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 282
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 283
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 285
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_2

    .line 286
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollLast()Ljava/lang/Object;

    .line 287
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollLast()Ljava/lang/Object;

    .line 288
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 289
    if-eqz v0, :cond_2

    .line 290
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 293
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    invoke-virtual {v0, p2}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 295
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    invoke-virtual {v0, p2}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 296
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->x:Lcom/roidapp/imagelib/retouch/t;

    if-eqz v0, :cond_3

    .line 297
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->x:Lcom/roidapp/imagelib/retouch/t;

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/t;->q_()V

    .line 298
    :cond_3
    return-void
.end method

.method static synthetic b(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/t;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->x:Lcom/roidapp/imagelib/retouch/t;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->E:Ljava/lang/Object;

    return-object v0
.end method

.method private c(Z)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 196
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->m:Z

    if-eq v0, p1, :cond_0

    .line 197
    iput-boolean p1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->m:Z

    .line 198
    if-eqz p1, :cond_2

    .line 199
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->B:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    .line 200
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->B:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 215
    :cond_0
    :goto_0
    return-void

    .line 203
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 207
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->C:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_3

    .line 208
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->C:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    .line 211
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Lcom/roidapp/imagelib/retouch/Inpaint;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->r:Lcom/roidapp/imagelib/retouch/Inpaint;

    return-object v0
.end method

.method private h()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 110
    const/4 v0, 0x0

    invoke-static {p0, v1, v0}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 111
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 112
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a:I

    .line 113
    new-instance v0, Lcom/roidapp/imagelib/retouch/Inpaint;

    invoke-direct {v0}, Lcom/roidapp/imagelib/retouch/Inpaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->r:Lcom/roidapp/imagelib/retouch/Inpaint;

    .line 114
    new-instance v0, Lcom/roidapp/imagelib/retouch/x;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/retouch/x;-><init>(Landroid/widget/ImageView;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->A:Lcom/roidapp/imagelib/retouch/x;

    .line 115
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->setClickable(Z)V

    .line 116
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->setLongClickable(Z)V

    .line 117
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->A:Lcom/roidapp/imagelib/retouch/x;

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 118
    invoke-virtual {p0, p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 119
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 226
    div-int/lit8 v0, p1, 0x2

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b:I

    .line 228
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->y:Lcom/roidapp/imagelib/retouch/Magnifier;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/Magnifier;->a(F)V

    .line 229
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/retouch/Magnifier;Landroid/widget/RelativeLayout;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x190

    const/4 v4, 0x2

    .line 218
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->y:Lcom/roidapp/imagelib/retouch/Magnifier;

    .line 219
    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    .line 220
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1172
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 1173
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    const-string v2, "alpha"

    new-array v3, v4, [F

    fill-array-data v3, :array_0

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->B:Landroid/animation/ObjectAnimator;

    .line 1174
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->B:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1175
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->B:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1176
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->B:Landroid/animation/ObjectAnimator;

    new-instance v2, Lcom/roidapp/imagelib/retouch/i;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/retouch/i;-><init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V

    invoke-virtual {v1, v2}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1183
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->z:Landroid/widget/RelativeLayout;

    const-string v2, "alpha"

    new-array v3, v4, [F

    fill-array-data v3, :array_1

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->C:Landroid/animation/ObjectAnimator;

    .line 1184
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->C:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1185
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->B:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1186
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->C:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/roidapp/imagelib/retouch/j;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/retouch/j;-><init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 223
    :cond_0
    return-void

    .line 1173
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 1183
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final a(Lcom/roidapp/imagelib/retouch/t;)V
    .locals 3

    .prologue
    .line 444
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->x:Lcom/roidapp/imagelib/retouch/t;

    .line 445
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->x:Lcom/roidapp/imagelib/retouch/t;

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/t;->q_()V

    .line 446
    sget-boolean v0, Lcom/roidapp/imagelib/retouch/Inpaint;->a:Z

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->x:Lcom/roidapp/imagelib/retouch/t;

    new-instance v1, Ljava/lang/UnsatisfiedLinkError;

    const-string v2, "JNI ERROR"

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/t;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 449
    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 136
    iput-boolean p1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->n:Z

    .line 137
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 140
    iput-boolean p1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->k:Z

    .line 141
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()V
    .locals 8

    .prologue
    .line 384
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    .line 385
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 386
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 388
    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->E:Ljava/lang/Object;

    monitor-enter v4

    .line 390
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 391
    iget v1, v0, Landroid/graphics/Rect;->left:I

    move v2, v1

    :goto_0
    iget v1, v0, Landroid/graphics/Rect;->right:I

    if-gt v2, v1, :cond_2

    .line 392
    iget v1, v0, Landroid/graphics/Rect;->top:I

    :goto_1
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    if-gt v1, v5, :cond_1

    .line 393
    iget v5, v0, Landroid/graphics/Rect;->left:I

    sub-int v5, v2, v5

    iget v6, v0, Landroid/graphics/Rect;->top:I

    sub-int v6, v1, v6

    iget-object v7, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v7, v2, v1}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v7

    invoke-virtual {v3, v5, v6, v7}, Landroid/graphics/Bitmap;->setPixel(III)V

    .line 392
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 391
    :cond_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 396
    :cond_2
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 398
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 399
    iget v2, v0, Landroid/graphics/Rect;->left:I

    :goto_2
    iget v3, v0, Landroid/graphics/Rect;->right:I

    if-gt v2, v3, :cond_4

    .line 400
    iget v3, v0, Landroid/graphics/Rect;->top:I

    :goto_3
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    if-gt v3, v5, :cond_3

    .line 401
    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    iget v6, v0, Landroid/graphics/Rect;->left:I

    sub-int v6, v2, v6

    iget v7, v0, Landroid/graphics/Rect;->top:I

    sub-int v7, v3, v7

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v6

    invoke-virtual {v5, v2, v3, v6}, Landroid/graphics/Bitmap;->setPixel(III)V

    .line 400
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 399
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 405
    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 406
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 407
    :cond_5
    iget v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g:I

    .line 408
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 410
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->invalidate()V

    .line 411
    return-void

    .line 408
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 316
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->n:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()V
    .locals 8

    .prologue
    .line 415
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 416
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 417
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 419
    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->E:Ljava/lang/Object;

    monitor-enter v4

    .line 420
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 421
    iget v1, v0, Landroid/graphics/Rect;->left:I

    move v2, v1

    :goto_0
    iget v1, v0, Landroid/graphics/Rect;->right:I

    if-gt v2, v1, :cond_1

    .line 422
    iget v1, v0, Landroid/graphics/Rect;->top:I

    :goto_1
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    if-gt v1, v5, :cond_0

    .line 423
    iget v5, v0, Landroid/graphics/Rect;->left:I

    sub-int v5, v2, v5

    iget v6, v0, Landroid/graphics/Rect;->top:I

    sub-int v6, v1, v6

    iget-object v7, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v7, v2, v1}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v7

    invoke-virtual {v3, v5, v6, v7}, Landroid/graphics/Bitmap;->setPixel(III)V

    .line 422
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 421
    :cond_0
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 426
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 428
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 429
    iget v2, v0, Landroid/graphics/Rect;->left:I

    :goto_2
    iget v3, v0, Landroid/graphics/Rect;->right:I

    if-gt v2, v3, :cond_3

    .line 430
    iget v3, v0, Landroid/graphics/Rect;->top:I

    :goto_3
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    if-gt v3, v5, :cond_2

    .line 431
    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    iget v6, v0, Landroid/graphics/Rect;->left:I

    sub-int v6, v2, v6

    iget v7, v0, Landroid/graphics/Rect;->top:I

    sub-int v7, v3, v7

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v6

    invoke-virtual {v5, v2, v3, v6}, Landroid/graphics/Bitmap;->setPixel(III)V

    .line 430
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 429
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 434
    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 435
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 436
    :cond_4
    iget v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g:I

    .line 437
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 439
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->invalidate()V

    .line 440
    return-void

    .line 437
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 453
    iget v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g:I

    return v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 489
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/k;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    .prologue
    .line 503
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 504
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->s:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 505
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 506
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    .line 509
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 511
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 512
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_2

    .line 513
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_1

    .line 516
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->u:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 518
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 519
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->v:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 520
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->w:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 522
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    if-eqz v0, :cond_4

    .line 523
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/k;->cancel(Z)Z

    .line 524
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    .line 526
    :cond_4
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 302
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->F:Landroid/graphics/DrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 303
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->k:Z

    if-eqz v0, :cond_1

    .line 304
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 311
    :cond_0
    :goto_0
    return-void

    .line 307
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->p:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 494
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->n:Z

    if-eqz v0, :cond_0

    .line 498
    :goto_0
    return v2

    .line 496
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->j:Z

    .line 497
    iget v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->h:F

    iget v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->i:F

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(FF)V

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/4 v5, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 321
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 323
    packed-switch v2, :pswitch_data_0

    .line 369
    :cond_0
    :goto_0
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 326
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->h:F

    .line 327
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->i:F

    goto :goto_0

    .line 330
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->h:F

    .line 331
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->i:F

    .line 332
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->j:Z

    if-eqz v0, :cond_0

    .line 333
    iget v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->h:F

    iget v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->i:F

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(FF)V

    goto :goto_0

    .line 338
    :pswitch_3
    iput-boolean v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->j:Z

    .line 339
    iget-boolean v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->l:Z

    if-nez v2, :cond_2

    .line 340
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 341
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 342
    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c(Z)V

    .line 343
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->cancelLongPress()V

    .line 1258
    new-array v4, v5, [F

    aput v2, v4, v1

    aput v3, v4, v0

    .line 1259
    new-array v2, v5, [F

    .line 1261
    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    invoke-virtual {v3, v2, v4}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 1262
    iget v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b:I

    int-to-float v3, v3

    iget v4, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b:I

    int-to-float v4, v4

    invoke-direct {p0, v4}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(F)F

    move-result v4

    div-float/2addr v3, v4

    .line 1264
    aget v4, v2, v1

    sub-float/2addr v4, v3

    float-to-int v4, v4

    iput v4, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c:I

    .line 1265
    aget v4, v2, v1

    add-float/2addr v4, v3

    float-to-int v4, v4

    iput v4, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->d:I

    .line 1266
    aget v4, v2, v0

    sub-float/2addr v4, v3

    float-to-int v4, v4

    iput v4, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->e:I

    .line 1267
    aget v2, v2, v0

    add-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->f:I

    .line 1269
    iget v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->d:I

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-ge v2, v3, :cond_3

    iget v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->f:I

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-ge v2, v3, :cond_3

    iget v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c:I

    if-ltz v2, :cond_3

    iget v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->e:I

    if-ltz v2, :cond_3

    .line 344
    :goto_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/k;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 345
    :cond_1
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->E:Ljava/lang/Object;

    monitor-enter v2

    .line 346
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    new-instance v3, Landroid/graphics/Rect;

    iget v4, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c:I

    iget v5, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->e:I

    iget v6, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->d:I

    iget v7, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->f:I

    invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {p0, v0, v3}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)V

    .line 347
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 348
    iget v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c:I

    iput v3, v0, Landroid/graphics/Rect;->left:I

    .line 349
    iget v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->e:I

    iput v3, v0, Landroid/graphics/Rect;->top:I

    .line 350
    iget v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->d:I

    iput v3, v0, Landroid/graphics/Rect;->right:I

    .line 351
    iget v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->f:I

    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 352
    new-instance v3, Lcom/roidapp/imagelib/retouch/k;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/roidapp/imagelib/retouch/k;-><init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;B)V

    iput-object v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    .line 353
    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->D:Lcom/roidapp/imagelib/retouch/k;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v0, v4, v5

    invoke-virtual {v3, v4}, Lcom/roidapp/imagelib/retouch/k;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 354
    iget v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g:I

    .line 355
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 358
    :cond_2
    iput-boolean v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->l:Z

    goto/16 :goto_0

    :cond_3
    move v0, v1

    .line 1269
    goto :goto_1

    .line 355
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 362
    :pswitch_4
    iput-boolean v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->l:Z

    .line 363
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->cancelLongPress()V

    .line 364
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->j:Z

    if-eqz v0, :cond_0

    .line 365
    iput-boolean v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->j:Z

    .line 366
    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->c(Z)V

    goto/16 :goto_0

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 161
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 163
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    .line 164
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->p:Landroid/graphics/Matrix;

    .line 165
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 166
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->y:Lcom/roidapp/imagelib/retouch/Magnifier;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/Magnifier;->a(Landroid/graphics/Bitmap;)V

    .line 167
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->A:Lcom/roidapp/imagelib/retouch/x;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/x;->a()V

    .line 168
    return-void
.end method

.method public setImageMatrix(Landroid/graphics/Matrix;)V
    .locals 4

    .prologue
    .line 152
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 153
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->p:Landroid/graphics/Matrix;

    .line 154
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->p:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->q:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 155
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->y:Lcom/roidapp/imagelib/retouch/Magnifier;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b:I

    int-to-float v1, v1

    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/Magnifier;->b(F)V

    .line 156
    const-string v0, "BlemishImageView"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ImageToScreen scale: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->p:Landroid/graphics/Matrix;

    .line 1146
    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->H:[F

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->getValues([F)V

    .line 1147
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->H:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " dst: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b:I

    int-to-float v2, v2

    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(F)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    return-void
.end method
