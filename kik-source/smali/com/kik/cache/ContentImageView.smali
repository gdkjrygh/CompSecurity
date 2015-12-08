.class public Lcom/kik/cache/ContentImageView;
.super Lkik/android/widget/KikNetworkedImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cache/ContentImageView$a;
    }
.end annotation


# instance fields
.field private A:Lcom/kik/g/k;

.field private final B:Lcom/android/volley/r$a;

.field private final C:Lcom/android/volley/r$b;

.field private D:Landroid/content/Context;

.field private a:Lkik/a/d/a/a;

.field private b:Landroid/graphics/Bitmap;

.field private c:Landroid/graphics/Matrix;

.field private d:I

.field private h:Landroid/graphics/PointF;

.field private i:Landroid/graphics/PointF;

.field private j:F

.field private k:F

.field private l:[F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field private v:F

.field private w:F

.field private x:Landroid/view/ScaleGestureDetector;

.field private y:Landroid/view/View$OnTouchListener;

.field private z:Lcom/kik/g/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 90
    invoke-direct {p0, p1}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;)V

    .line 33
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->d:I

    .line 42
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->h:Landroid/graphics/PointF;

    .line 43
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->i:Landroid/graphics/PointF;

    .line 44
    iput v1, p0, Lcom/kik/cache/ContentImageView;->j:F

    .line 45
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lcom/kik/cache/ContentImageView;->k:F

    .line 52
    iput v1, p0, Lcom/kik/cache/ContentImageView;->q:F

    .line 57
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->z:Lcom/kik/g/k;

    .line 58
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->A:Lcom/kik/g/k;

    .line 60
    new-instance v0, Lcom/kik/cache/p;

    invoke-direct {v0, p0}, Lcom/kik/cache/p;-><init>(Lcom/kik/cache/ContentImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->B:Lcom/android/volley/r$a;

    .line 68
    new-instance v0, Lcom/kik/cache/q;

    invoke-direct {v0, p0}, Lcom/kik/cache/q;-><init>(Lcom/kik/cache/ContentImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->C:Lcom/android/volley/r$b;

    .line 91
    invoke-direct {p0, p1}, Lcom/kik/cache/ContentImageView;->a(Landroid/content/Context;)V

    .line 92
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 96
    invoke-direct {p0, p1, p2}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->d:I

    .line 42
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->h:Landroid/graphics/PointF;

    .line 43
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->i:Landroid/graphics/PointF;

    .line 44
    iput v1, p0, Lcom/kik/cache/ContentImageView;->j:F

    .line 45
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lcom/kik/cache/ContentImageView;->k:F

    .line 52
    iput v1, p0, Lcom/kik/cache/ContentImageView;->q:F

    .line 57
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->z:Lcom/kik/g/k;

    .line 58
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->A:Lcom/kik/g/k;

    .line 60
    new-instance v0, Lcom/kik/cache/p;

    invoke-direct {v0, p0}, Lcom/kik/cache/p;-><init>(Lcom/kik/cache/ContentImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->B:Lcom/android/volley/r$a;

    .line 68
    new-instance v0, Lcom/kik/cache/q;

    invoke-direct {v0, p0}, Lcom/kik/cache/q;-><init>(Lcom/kik/cache/ContentImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->C:Lcom/android/volley/r$b;

    .line 97
    invoke-direct {p0, p1}, Lcom/kik/cache/ContentImageView;->a(Landroid/content/Context;)V

    .line 98
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 102
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->d:I

    .line 42
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->h:Landroid/graphics/PointF;

    .line 43
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->i:Landroid/graphics/PointF;

    .line 44
    iput v1, p0, Lcom/kik/cache/ContentImageView;->j:F

    .line 45
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lcom/kik/cache/ContentImageView;->k:F

    .line 52
    iput v1, p0, Lcom/kik/cache/ContentImageView;->q:F

    .line 57
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->z:Lcom/kik/g/k;

    .line 58
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->A:Lcom/kik/g/k;

    .line 60
    new-instance v0, Lcom/kik/cache/p;

    invoke-direct {v0, p0}, Lcom/kik/cache/p;-><init>(Lcom/kik/cache/ContentImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->B:Lcom/android/volley/r$a;

    .line 68
    new-instance v0, Lcom/kik/cache/q;

    invoke-direct {v0, p0}, Lcom/kik/cache/q;-><init>(Lcom/kik/cache/ContentImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->C:Lcom/android/volley/r$b;

    .line 103
    invoke-direct {p0, p1}, Lcom/kik/cache/ContentImageView;->a(Landroid/content/Context;)V

    .line 104
    return-void
.end method

.method static synthetic a(Lcom/kik/cache/ContentImageView;F)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->q:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/kik/cache/ContentImageView;->q:F

    return v0
.end method

.method static synthetic a(Lcom/kik/cache/ContentImageView;I)I
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/kik/cache/ContentImageView;->d:I

    return p1
.end method

.method static synthetic a(Lcom/kik/cache/ContentImageView;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->A:Lcom/kik/g/k;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    .line 149
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->setClickable(Z)V

    .line 150
    iput-object p1, p0, Lcom/kik/cache/ContentImageView;->D:Landroid/content/Context;

    .line 151
    new-instance v0, Landroid/view/ScaleGestureDetector;

    new-instance v1, Lcom/kik/cache/ContentImageView$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/kik/cache/ContentImageView$a;-><init>(Lcom/kik/cache/ContentImageView;B)V

    invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->x:Landroid/view/ScaleGestureDetector;

    .line 152
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 153
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->l:[F

    .line 154
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/kik/cache/ContentImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 155
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/kik/cache/ContentImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 157
    new-instance v0, Lcom/kik/cache/r;

    invoke-direct {v0, p0}, Lcom/kik/cache/r;-><init>(Lcom/kik/cache/ContentImageView;)V

    invoke-virtual {p0, v0}, Lcom/kik/cache/ContentImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 241
    return-void
.end method

.method static synthetic b(Lcom/kik/cache/ContentImageView;F)F
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/kik/cache/ContentImageView;->q:F

    return p1
.end method

.method static synthetic b(Lcom/kik/cache/ContentImageView;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->z:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cache/ContentImageView;F)F
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/kik/cache/ContentImageView;->r:F

    return p1
.end method

.method static synthetic c(Lcom/kik/cache/ContentImageView;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->y:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cache/ContentImageView;F)F
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/kik/cache/ContentImageView;->s:F

    return p1
.end method

.method static synthetic d(Lcom/kik/cache/ContentImageView;)Landroid/view/ScaleGestureDetector;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->x:Landroid/view/ScaleGestureDetector;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/cache/ContentImageView;)[F
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->l:[F

    return-object v0
.end method

.method static synthetic f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    return-object v0
.end method

.method static synthetic g(Lcom/kik/cache/ContentImageView;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->h:Landroid/graphics/PointF;

    return-object v0
.end method

.method static synthetic h(Lcom/kik/cache/ContentImageView;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->i:Landroid/graphics/PointF;

    return-object v0
.end method

.method static synthetic i(Lcom/kik/cache/ContentImageView;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->d:I

    return v0
.end method

.method static synthetic j(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->t:F

    return v0
.end method

.method static synthetic k(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->q:F

    return v0
.end method

.method static synthetic l(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->u:F

    return v0
.end method

.method static synthetic m(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->o:F

    return v0
.end method

.method static synthetic n(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->s:F

    return v0
.end method

.method static synthetic o(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->p:F

    return v0
.end method

.method static synthetic p(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->r:F

    return v0
.end method

.method static synthetic q(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->k:F

    return v0
.end method

.method static synthetic r(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->j:F

    return v0
.end method

.method static synthetic s(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->m:F

    return v0
.end method

.method static synthetic t(Lcom/kik/cache/ContentImageView;)F
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/kik/cache/ContentImageView;->n:F

    return v0
.end method


# virtual methods
.method protected final a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 1

    .prologue
    .line 135
    new-instance v0, Lkik/android/widget/cs;

    invoke-direct {v0, p1, p2}, Lkik/android/widget/cs;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 120
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->b:Landroid/graphics/Bitmap;

    if-eq p1, v0, :cond_1

    .line 122
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cache/ContentImageView;->b:Landroid/graphics/Bitmap;

    .line 124
    :cond_1
    invoke-super {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/Bitmap;)V

    .line 125
    return-void
.end method

.method public final a(Lkik/a/d/a/a;[BLcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/f/k;Lkik/a/z;Lcom/kik/cache/ad$d;)V
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v3, 0x0

    .line 108
    iput-object p1, p0, Lcom/kik/cache/ContentImageView;->a:Lkik/a/d/a/a;

    .line 110
    invoke-static {p1, p2, p4, p5, p6}, Lcom/kik/cache/o;->a(Lkik/a/d/a/a;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/z;)Lcom/kik/cache/z;

    move-result-object v1

    move-object v0, p0

    move-object v2, p3

    move v4, v3

    move v6, v5

    .line 113
    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/ContentImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    move-object v0, p3

    move-object v2, p7

    move v4, v3

    .line 114
    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZ)Lcom/kik/cache/ad$c;

    .line 115
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    .line 350
    invoke-super {p0, p1, p2}, Lkik/android/widget/KikNetworkedImageView;->onMeasure(II)V

    .line 351
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->o:F

    .line 352
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->p:F

    .line 355
    iget v0, p0, Lcom/kik/cache/ContentImageView;->o:F

    iget v1, p0, Lcom/kik/cache/ContentImageView;->v:F

    div-float/2addr v0, v1

    .line 356
    iget v1, p0, Lcom/kik/cache/ContentImageView;->p:F

    iget v2, p0, Lcom/kik/cache/ContentImageView;->w:F

    div-float/2addr v1, v2

    .line 357
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 358
    iget-object v1, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 359
    iget-object v1, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v1}, Lcom/kik/cache/ContentImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 360
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/kik/cache/ContentImageView;->q:F

    .line 363
    iget v1, p0, Lcom/kik/cache/ContentImageView;->p:F

    iget v2, p0, Lcom/kik/cache/ContentImageView;->w:F

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/kik/cache/ContentImageView;->n:F

    .line 364
    iget v1, p0, Lcom/kik/cache/ContentImageView;->o:F

    iget v2, p0, Lcom/kik/cache/ContentImageView;->v:F

    mul-float/2addr v0, v2

    sub-float v0, v1, v0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->m:F

    .line 365
    iget v0, p0, Lcom/kik/cache/ContentImageView;->n:F

    div-float/2addr v0, v3

    iput v0, p0, Lcom/kik/cache/ContentImageView;->n:F

    .line 366
    iget v0, p0, Lcom/kik/cache/ContentImageView;->m:F

    div-float/2addr v0, v3

    iput v0, p0, Lcom/kik/cache/ContentImageView;->m:F

    .line 368
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/kik/cache/ContentImageView;->m:F

    iget v2, p0, Lcom/kik/cache/ContentImageView;->n:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 370
    iget v0, p0, Lcom/kik/cache/ContentImageView;->o:F

    iget v1, p0, Lcom/kik/cache/ContentImageView;->m:F

    mul-float/2addr v1, v3

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ContentImageView;->t:F

    .line 371
    iget v0, p0, Lcom/kik/cache/ContentImageView;->p:F

    iget v1, p0, Lcom/kik/cache/ContentImageView;->n:F

    mul-float/2addr v1, v3

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ContentImageView;->u:F

    .line 372
    iget v0, p0, Lcom/kik/cache/ContentImageView;->o:F

    iget v1, p0, Lcom/kik/cache/ContentImageView;->q:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ContentImageView;->o:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ContentImageView;->m:F

    mul-float/2addr v1, v3

    iget v2, p0, Lcom/kik/cache/ContentImageView;->q:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ContentImageView;->r:F

    .line 373
    iget v0, p0, Lcom/kik/cache/ContentImageView;->p:F

    iget v1, p0, Lcom/kik/cache/ContentImageView;->q:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ContentImageView;->p:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ContentImageView;->n:F

    mul-float/2addr v1, v3

    iget v2, p0, Lcom/kik/cache/ContentImageView;->q:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ContentImageView;->s:F

    .line 374
    iget-object v0, p0, Lcom/kik/cache/ContentImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/kik/cache/ContentImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 375
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 246
    invoke-super {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 247
    if-eqz p1, :cond_0

    .line 248
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->v:F

    .line 249
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->w:F

    .line 251
    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 256
    invoke-super {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 258
    if-eqz p1, :cond_0

    .line 259
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->v:F

    .line 260
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ContentImageView;->w:F

    .line 262
    :cond_0
    return-void
.end method
