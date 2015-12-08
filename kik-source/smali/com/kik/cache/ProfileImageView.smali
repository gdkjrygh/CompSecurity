.class public Lcom/kik/cache/ProfileImageView;
.super Lkik/android/widget/KikNetworkedImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cache/ProfileImageView$a;
    }
.end annotation


# instance fields
.field private A:Lcom/kik/g/k;

.field private final B:Lcom/android/volley/r$a;

.field private final C:Lcom/android/volley/r$b;

.field private D:Landroid/content/Context;

.field private a:Lkik/a/d/k;

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

    .line 88
    invoke-direct {p0, p1}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;)V

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->d:I

    .line 40
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->h:Landroid/graphics/PointF;

    .line 41
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->i:Landroid/graphics/PointF;

    .line 42
    iput v1, p0, Lcom/kik/cache/ProfileImageView;->j:F

    .line 43
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->k:F

    .line 50
    iput v1, p0, Lcom/kik/cache/ProfileImageView;->q:F

    .line 55
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->z:Lcom/kik/g/k;

    .line 56
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->A:Lcom/kik/g/k;

    .line 58
    new-instance v0, Lcom/kik/cache/aq;

    invoke-direct {v0, p0}, Lcom/kik/cache/aq;-><init>(Lcom/kik/cache/ProfileImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->B:Lcom/android/volley/r$a;

    .line 66
    new-instance v0, Lcom/kik/cache/ar;

    invoke-direct {v0, p0}, Lcom/kik/cache/ar;-><init>(Lcom/kik/cache/ProfileImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->C:Lcom/android/volley/r$b;

    .line 89
    invoke-direct {p0, p1}, Lcom/kik/cache/ProfileImageView;->a(Landroid/content/Context;)V

    .line 90
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 94
    invoke-direct {p0, p1, p2}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->d:I

    .line 40
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->h:Landroid/graphics/PointF;

    .line 41
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->i:Landroid/graphics/PointF;

    .line 42
    iput v1, p0, Lcom/kik/cache/ProfileImageView;->j:F

    .line 43
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->k:F

    .line 50
    iput v1, p0, Lcom/kik/cache/ProfileImageView;->q:F

    .line 55
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->z:Lcom/kik/g/k;

    .line 56
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->A:Lcom/kik/g/k;

    .line 58
    new-instance v0, Lcom/kik/cache/aq;

    invoke-direct {v0, p0}, Lcom/kik/cache/aq;-><init>(Lcom/kik/cache/ProfileImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->B:Lcom/android/volley/r$a;

    .line 66
    new-instance v0, Lcom/kik/cache/ar;

    invoke-direct {v0, p0}, Lcom/kik/cache/ar;-><init>(Lcom/kik/cache/ProfileImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->C:Lcom/android/volley/r$b;

    .line 95
    invoke-direct {p0, p1}, Lcom/kik/cache/ProfileImageView;->a(Landroid/content/Context;)V

    .line 96
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 100
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->d:I

    .line 40
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->h:Landroid/graphics/PointF;

    .line 41
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->i:Landroid/graphics/PointF;

    .line 42
    iput v1, p0, Lcom/kik/cache/ProfileImageView;->j:F

    .line 43
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->k:F

    .line 50
    iput v1, p0, Lcom/kik/cache/ProfileImageView;->q:F

    .line 55
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->z:Lcom/kik/g/k;

    .line 56
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->A:Lcom/kik/g/k;

    .line 58
    new-instance v0, Lcom/kik/cache/aq;

    invoke-direct {v0, p0}, Lcom/kik/cache/aq;-><init>(Lcom/kik/cache/ProfileImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->B:Lcom/android/volley/r$a;

    .line 66
    new-instance v0, Lcom/kik/cache/ar;

    invoke-direct {v0, p0}, Lcom/kik/cache/ar;-><init>(Lcom/kik/cache/ProfileImageView;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->C:Lcom/android/volley/r$b;

    .line 101
    invoke-direct {p0, p1}, Lcom/kik/cache/ProfileImageView;->a(Landroid/content/Context;)V

    .line 102
    return-void
.end method

.method static synthetic a(Lcom/kik/cache/ProfileImageView;F)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->q:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->q:F

    return v0
.end method

.method static synthetic a(Lcom/kik/cache/ProfileImageView;I)I
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/kik/cache/ProfileImageView;->d:I

    return p1
.end method

.method static synthetic a(Lcom/kik/cache/ProfileImageView;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->A:Lcom/kik/g/k;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    .line 200
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lkik/android/widget/KikNetworkedImageView;->setClickable(Z)V

    .line 201
    iput-object p1, p0, Lcom/kik/cache/ProfileImageView;->D:Landroid/content/Context;

    .line 202
    new-instance v0, Landroid/view/ScaleGestureDetector;

    new-instance v1, Lcom/kik/cache/ProfileImageView$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/kik/cache/ProfileImageView$a;-><init>(Lcom/kik/cache/ProfileImageView;B)V

    invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->x:Landroid/view/ScaleGestureDetector;

    .line 203
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 204
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->l:[F

    .line 205
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/kik/cache/ProfileImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 206
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/kik/cache/ProfileImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 208
    new-instance v0, Lcom/kik/cache/at;

    invoke-direct {v0, p0}, Lcom/kik/cache/at;-><init>(Lcom/kik/cache/ProfileImageView;)V

    invoke-virtual {p0, v0}, Lcom/kik/cache/ProfileImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 292
    return-void
.end method

.method static synthetic b(Lcom/kik/cache/ProfileImageView;F)F
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/kik/cache/ProfileImageView;->q:F

    return p1
.end method

.method static synthetic b(Lcom/kik/cache/ProfileImageView;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->z:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cache/ProfileImageView;F)F
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/kik/cache/ProfileImageView;->r:F

    return p1
.end method

.method static synthetic c(Lcom/kik/cache/ProfileImageView;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->y:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cache/ProfileImageView;F)F
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/kik/cache/ProfileImageView;->s:F

    return p1
.end method

.method static synthetic d(Lcom/kik/cache/ProfileImageView;)Landroid/view/ScaleGestureDetector;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->x:Landroid/view/ScaleGestureDetector;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/cache/ProfileImageView;)[F
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->l:[F

    return-object v0
.end method

.method static synthetic f(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    return-object v0
.end method

.method static synthetic g(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->h:Landroid/graphics/PointF;

    return-object v0
.end method

.method static synthetic h(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->i:Landroid/graphics/PointF;

    return-object v0
.end method

.method static synthetic i(Lcom/kik/cache/ProfileImageView;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->d:I

    return v0
.end method

.method static synthetic j(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->t:F

    return v0
.end method

.method static synthetic k(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->q:F

    return v0
.end method

.method static synthetic l(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->u:F

    return v0
.end method

.method static synthetic m(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->o:F

    return v0
.end method

.method static synthetic n(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->s:F

    return v0
.end method

.method static synthetic o(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->p:F

    return v0
.end method

.method static synthetic p(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->r:F

    return v0
.end method

.method static synthetic q(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->k:F

    return v0
.end method

.method static synthetic r(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->j:F

    return v0
.end method

.method static synthetic s(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->m:F

    return v0
.end method

.method static synthetic t(Lcom/kik/cache/ProfileImageView;)F
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->n:F

    return v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->z:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 1

    .prologue
    .line 186
    new-instance v0, Lkik/android/widget/cs;

    invoke-direct {v0, p1, p2}, Lkik/android/widget/cs;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 171
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->b:Landroid/graphics/Bitmap;

    if-eq p1, v0, :cond_1

    .line 173
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cache/ProfileImageView;->b:Landroid/graphics/Bitmap;

    .line 175
    :cond_1
    invoke-super {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/Bitmap;)V

    .line 176
    return-void
.end method

.method public final a(Lkik/a/d/aa;Lcom/kik/cache/ad;Lcom/android/volley/r$b;Lcom/kik/cache/ad$d;)V
    .locals 7

    .prologue
    .line 116
    const/4 v2, 0x0

    iget-object v3, p0, Lcom/kik/cache/ProfileImageView;->B:Lcom/android/volley/r$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p3

    invoke-static/range {v0 .. v5}, Lcom/kik/cache/ak;->a(Lkik/a/d/aa;Lcom/android/volley/r$b;ZLcom/android/volley/r$a;ZZ)Lcom/kik/cache/ak;

    move-result-object v1

    .line 117
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/ProfileImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    .line 118
    invoke-virtual {p2, v1, p4}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;)Lcom/kik/cache/ad$c;

    .line 137
    return-void
.end method

.method public final a(Lkik/a/d/k;Lcom/kik/cache/ad;)V
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v3, 0x0

    .line 141
    iput-object p1, p0, Lcom/kik/cache/ProfileImageView;->a:Lkik/a/d/k;

    .line 143
    const/4 v1, 0x0

    .line 145
    if-eqz p1, :cond_0

    .line 146
    iget-object v1, p0, Lcom/kik/cache/ProfileImageView;->C:Lcom/android/volley/r$b;

    iget-object v2, p0, Lcom/kik/cache/ProfileImageView;->B:Lcom/android/volley/r$a;

    const/4 v4, 0x4

    move-object v0, p1

    move v6, v3

    invoke-static/range {v0 .. v6}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZIZZ)Lcom/kik/cache/k;

    move-result-object v1

    :cond_0
    move-object v0, p0

    move-object v2, p2

    move v4, v3

    move v6, v5

    .line 148
    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/ProfileImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    .line 150
    new-instance v0, Lcom/kik/cache/as;

    invoke-direct {v0, p0}, Lcom/kik/cache/as;-><init>(Lcom/kik/cache/ProfileImageView;)V

    invoke-virtual {p2, v1, v0}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;)Lcom/kik/cache/ad$c;

    .line 166
    return-void
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->A:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method protected onMeasure(II)V
    .locals 4

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    .line 395
    invoke-super {p0, p1, p2}, Lkik/android/widget/KikNetworkedImageView;->onMeasure(II)V

    .line 396
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->o:F

    .line 397
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->p:F

    .line 400
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->o:F

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->v:F

    div-float/2addr v0, v1

    .line 401
    iget v1, p0, Lcom/kik/cache/ProfileImageView;->p:F

    iget v2, p0, Lcom/kik/cache/ProfileImageView;->w:F

    div-float/2addr v1, v2

    .line 402
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 403
    iget-object v1, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 404
    iget-object v1, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v1}, Lcom/kik/cache/ProfileImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 405
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/kik/cache/ProfileImageView;->q:F

    .line 408
    iget v1, p0, Lcom/kik/cache/ProfileImageView;->p:F

    iget v2, p0, Lcom/kik/cache/ProfileImageView;->w:F

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/kik/cache/ProfileImageView;->n:F

    .line 409
    iget v1, p0, Lcom/kik/cache/ProfileImageView;->o:F

    iget v2, p0, Lcom/kik/cache/ProfileImageView;->v:F

    mul-float/2addr v0, v2

    sub-float v0, v1, v0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->m:F

    .line 410
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->n:F

    div-float/2addr v0, v3

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->n:F

    .line 411
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->m:F

    div-float/2addr v0, v3

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->m:F

    .line 413
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->m:F

    iget v2, p0, Lcom/kik/cache/ProfileImageView;->n:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 415
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->o:F

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->m:F

    mul-float/2addr v1, v3

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->t:F

    .line 416
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->p:F

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->n:F

    mul-float/2addr v1, v3

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->u:F

    .line 417
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->o:F

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->q:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->o:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->m:F

    mul-float/2addr v1, v3

    iget v2, p0, Lcom/kik/cache/ProfileImageView;->q:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->r:F

    .line 418
    iget v0, p0, Lcom/kik/cache/ProfileImageView;->p:F

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->q:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->p:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/kik/cache/ProfileImageView;->n:F

    mul-float/2addr v1, v3

    iget v2, p0, Lcom/kik/cache/ProfileImageView;->q:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->s:F

    .line 419
    iget-object v0, p0, Lcom/kik/cache/ProfileImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/kik/cache/ProfileImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 420
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 297
    invoke-super {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 298
    if-eqz p1, :cond_0

    .line 299
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->v:F

    .line 300
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->w:F

    .line 302
    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 307
    invoke-super {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 309
    if-eqz p1, :cond_0

    .line 310
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->v:F

    .line 311
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/kik/cache/ProfileImageView;->w:F

    .line 313
    :cond_0
    return-void
.end method
