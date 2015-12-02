.class public Lcom/qihoo/security/widget/MaterialRippleLayout;
.super Landroid/widget/FrameLayout;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/widget/MaterialRippleLayout$b;,
        Lcom/qihoo/security/widget/MaterialRippleLayout$a;
    }
.end annotation


# instance fields
.field private A:Landroid/view/GestureDetector;

.field private B:Lcom/qihoo/security/widget/MaterialRippleLayout$a;

.field private C:Lcom/qihoo/security/widget/MaterialRippleLayout$b;

.field private final D:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private final E:Lcom/nineoldandroids/util/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/c",
            "<",
            "Lcom/qihoo/security/widget/MaterialRippleLayout;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final F:Lcom/nineoldandroids/util/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/c",
            "<",
            "Lcom/qihoo/security/widget/MaterialRippleLayout;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Rect;

.field private c:I

.field private d:Z

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:I

.field private k:Z

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:F

.field private r:Landroid/widget/AdapterView;

.field private s:Landroid/view/View;

.field private t:Lcom/nineoldandroids/a/c;

.field private u:Lcom/nineoldandroids/a/k;

.field private final v:Landroid/graphics/Point;

.field private w:Landroid/graphics/Point;

.field private x:Z

.field private y:Z

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 121
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 122
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 126
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 129
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 73
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v5}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 74
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    .line 105
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    .line 106
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->w:Landroid/graphics/Point;

    .line 307
    new-instance v0, Lcom/qihoo/security/widget/MaterialRippleLayout$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/widget/MaterialRippleLayout$2;-><init>(Lcom/qihoo/security/widget/MaterialRippleLayout;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->D:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 491
    new-instance v0, Lcom/qihoo/security/widget/MaterialRippleLayout$4;

    const-class v1, Ljava/lang/Float;

    const-string/jumbo v2, "radius"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/widget/MaterialRippleLayout$4;-><init>(Lcom/qihoo/security/widget/MaterialRippleLayout;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->E:Lcom/nineoldandroids/util/c;

    .line 513
    new-instance v0, Lcom/qihoo/security/widget/MaterialRippleLayout$5;

    const-class v1, Ljava/lang/Integer;

    const-string/jumbo v2, "rippleAlpha"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/widget/MaterialRippleLayout$5;-><init>(Lcom/qihoo/security/widget/MaterialRippleLayout;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->F:Lcom/nineoldandroids/util/c;

    .line 131
    invoke-virtual {p0, v4}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setWillNotDraw(Z)V

    .line 134
    sget-object v0, Lcom/qihoo/security/lite/a$a;->MaterialRippleLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 135
    const/high16 v1, -0x1000000

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->c:I

    .line 136
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x420c0000    # 35.0f

    invoke-static {v1, v2}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Landroid/content/res/Resources;F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->f:I

    .line 138
    const/4 v1, 0x2

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->d:Z

    .line 139
    const/4 v1, 0x6

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->e:Z

    .line 140
    const/4 v1, 0x4

    const/16 v2, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->g:I

    .line 141
    const/high16 v1, 0x437f0000    # 255.0f

    const/4 v2, 0x3

    const v3, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->h:I

    .line 142
    const/16 v1, 0x8

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->i:Z

    .line 143
    const/4 v1, 0x5

    const/16 v2, 0x32

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->j:I

    .line 144
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    .line 146
    const/16 v1, 0x9

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->k:Z

    .line 149
    const/16 v1, 0xb

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->n:Z

    .line 151
    const/16 v1, 0xc

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->o:Z

    .line 153
    const/16 v1, 0xd

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->p:Z

    .line 156
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 160
    return-void
.end method

.method static a(Landroid/content/res/Resources;F)F
    .locals 2

    .prologue
    .line 649
    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/view/View;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    return-object v0
.end method

.method private a()V
    .locals 3

    .prologue
    .line 197
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->A:Landroid/view/GestureDetector;

    if-nez v0, :cond_0

    .line 198
    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->D:Landroid/view/GestureDetector$SimpleOnGestureListener;

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->A:Landroid/view/GestureDetector;

    .line 200
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 330
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->x:Z

    if-eqz v0, :cond_0

    .line 370
    :goto_0
    return-void

    .line 334
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getEndRadius()F

    move-result v0

    .line 336
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->d()V

    .line 338
    new-instance v1, Lcom/nineoldandroids/a/c;

    invoke-direct {v1}, Lcom/nineoldandroids/a/c;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    .line 339
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    new-instance v2, Lcom/qihoo/security/widget/MaterialRippleLayout$3;

    invoke-direct {v2, p0, p1}, Lcom/qihoo/security/widget/MaterialRippleLayout$3;-><init>(Lcom/qihoo/security/widget/MaterialRippleLayout;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 353
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->E:Lcom/nineoldandroids/util/c;

    new-array v2, v8, [F

    iget v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->q:F

    aput v3, v2, v6

    aput v0, v2, v7

    invoke-static {p0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 354
    iget v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->g:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 355
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 356
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->F:Lcom/nineoldandroids/util/c;

    new-array v3, v8, [I

    iget v4, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->h:I

    aput v4, v3, v6

    aput v6, v3, v7

    invoke-static {p0, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[I)Lcom/nineoldandroids/a/k;

    move-result-object v2

    .line 357
    iget v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->j:I

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 358
    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 359
    iget v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->g:I

    iget v4, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->j:I

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x32

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 361
    iget-boolean v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->k:Z

    if-eqz v3, :cond_1

    .line 362
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 369
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->a()V

    goto :goto_0

    .line 363
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getRadius()F

    move-result v3

    cmpl-float v0, v3, v0

    if-lez v0, :cond_2

    .line 364
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 365
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0, v2}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    goto :goto_1

    .line 367
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    new-array v3, v8, [Lcom/nineoldandroids/a/a;

    aput-object v1, v3, v6

    aput-object v2, v3, v7

    invoke-virtual {v0, v3}, Lcom/nineoldandroids/a/c;->a([Lcom/nineoldandroids/a/a;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/qihoo/security/widget/MaterialRippleLayout;Z)Z
    .locals 0

    .prologue
    .line 53
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->y:Z

    return p1
.end method

.method private b()V
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->C:Lcom/qihoo/security/widget/MaterialRippleLayout$b;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->C:Lcom/qihoo/security/widget/MaterialRippleLayout$b;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 303
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->y:Z

    .line 305
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->k:Z

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/widget/MaterialRippleLayout;)I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->h:I

    return v0
.end method

.method private c()V
    .locals 6

    .prologue
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 315
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->x:Z

    if-eqz v0, :cond_0

    .line 327
    :goto_0
    return-void

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    .line 320
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 322
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getHeight()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v2, 0x3ff3333340000000L    # 1.2000000476837158

    mul-double/2addr v0, v2

    double-to-float v0, v0

    .line 323
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->E:Lcom/nineoldandroids/util/c;

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    iget v4, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->f:I

    int-to-float v4, v4

    aput v4, v2, v3

    const/4 v3, 0x1

    aput v0, v2, v3

    invoke-static {p0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    .line 325
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 326
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    goto :goto_0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 373
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->b()V

    .line 375
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->g()V

    .line 378
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    .line 379
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 381
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->i:Z

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/widget/MaterialRippleLayout;)F
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getRadius()F

    move-result v0

    return v0
.end method

.method private e()Landroid/widget/AdapterView;
    .locals 2

    .prologue
    .line 413
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->r:Landroid/widget/AdapterView;

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->r:Landroid/widget/AdapterView;

    .line 420
    :goto_0
    return-object v0

    .line 416
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 418
    :goto_1
    instance-of v1, v0, Landroid/widget/AdapterView;

    if-eqz v1, :cond_1

    .line 419
    check-cast v0, Landroid/widget/AdapterView;

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->r:Landroid/widget/AdapterView;

    .line 420
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->r:Landroid/widget/AdapterView;

    goto :goto_0

    .line 423
    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 424
    :catch_0
    move-exception v0

    .line 425
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Could not find a parent AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 432
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->m:Z

    if-eqz v0, :cond_0

    .line 433
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->e()Landroid/widget/AdapterView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->z:I

    .line 435
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->m:Z

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/widget/AdapterView;
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->e()Landroid/widget/AdapterView;

    move-result-object v0

    return-object v0
.end method

.method private g()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 438
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->m:Z

    if-eqz v0, :cond_2

    .line 439
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->e()Landroid/widget/AdapterView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v2

    .line 440
    iget v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->z:I

    if-eq v2, v0, :cond_1

    const/4 v0, 0x1

    .line 441
    :goto_0
    iput v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->z:I

    .line 442
    if-eqz v0, :cond_0

    .line 443
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->b()V

    .line 444
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->d()V

    .line 445
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    .line 446
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setRadius(F)V

    .line 450
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v0, v1

    .line 440
    goto :goto_0

    :cond_2
    move v0, v1

    .line 450
    goto :goto_1
.end method

.method private getEndRadius()F
    .locals 8

    .prologue
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 384
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getWidth()I

    move-result v0

    .line 385
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getHeight()I

    move-result v1

    .line 387
    div-int/lit8 v2, v0, 0x2

    .line 388
    div-int/lit8 v3, v1, 0x2

    .line 390
    iget-object v4, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    if-le v2, v4, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    .line 391
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    if-le v3, v2, :cond_1

    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    .line 393
    :goto_1
    float-to-double v2, v0

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    float-to-double v0, v1

    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const v1, 0x3f99999a    # 1.2f

    mul-float/2addr v0, v1

    return v0

    .line 390
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    goto :goto_0

    .line 391
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    goto :goto_1
.end method

.method private getRadius()F
    .locals 1

    .prologue
    .line 505
    iget v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->q:F

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->p:Z

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->e:Z

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/widget/MaterialRippleLayout;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->c()V

    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 169
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 170
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "MaterialRippleLayout can host only one child"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 173
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    .line 174
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 175
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 470
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->g()Z

    move-result v0

    .line 471
    iget-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->d:Z

    if-eqz v1, :cond_2

    .line 472
    if-nez v0, :cond_0

    .line 473
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 475
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 476
    if-nez v0, :cond_1

    .line 477
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->q:F

    iget-object v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 486
    :cond_1
    :goto_0
    return-void

    .line 480
    :cond_2
    if-nez v0, :cond_3

    .line 481
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 482
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->q:F

    iget-object v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 484
    :cond_3
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method public getChildView()Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 164
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    return-object v0
.end method

.method public getRippleAlpha()I
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    return v0
.end method

.method public isInEditMode()Z
    .locals 1

    .prologue
    .line 462
    const/4 v0, 0x1

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 187
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->n:Z

    if-nez v0, :cond_0

    .line 188
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->o:Z

    if-eqz v0, :cond_1

    .line 189
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 194
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->n:Z

    return v0

    .line 191
    :cond_1
    invoke-virtual {p0, p1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 455
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 456
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 457
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 458
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x1

    .line 203
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 205
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    .line 296
    :cond_1
    :goto_0
    return v0

    .line 209
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    .line 211
    if-eqz v1, :cond_3

    .line 212
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->w:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    iget-object v4, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Point;->set(II)V

    .line 213
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Point;->set(II)V

    .line 215
    :cond_3
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a()V

    .line 216
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->A:Landroid/view/GestureDetector;

    invoke-virtual {v2, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    .line 217
    if-nez v2, :cond_1

    .line 220
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 221
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 246
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->f()V

    .line 247
    iput-boolean v6, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->x:Z

    .line 254
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 255
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 256
    iget-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->e:Z

    if-eqz v1, :cond_1

    .line 257
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->c()V

    goto :goto_0

    .line 223
    :pswitch_1
    new-instance v2, Lcom/qihoo/security/widget/MaterialRippleLayout$a;

    invoke-direct {v2, p0, v5}, Lcom/qihoo/security/widget/MaterialRippleLayout$a;-><init>(Lcom/qihoo/security/widget/MaterialRippleLayout;Lcom/qihoo/security/widget/MaterialRippleLayout$1;)V

    iput-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->B:Lcom/qihoo/security/widget/MaterialRippleLayout$a;

    .line 225
    iget-boolean v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->y:Z

    if-eqz v2, :cond_4

    .line 226
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setPressed(Z)V

    .line 227
    new-instance v2, Lcom/qihoo/security/widget/MaterialRippleLayout$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/widget/MaterialRippleLayout$1;-><init>(Lcom/qihoo/security/widget/MaterialRippleLayout;)V

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {p0, v2, v4, v5}, Lcom/qihoo/security/widget/MaterialRippleLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 235
    :cond_4
    if-eqz v1, :cond_7

    .line 236
    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->B:Lcom/qihoo/security/widget/MaterialRippleLayout$a;

    invoke-direct {p0, v2}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Ljava/lang/Runnable;)V

    .line 240
    :cond_5
    :goto_1
    iget-boolean v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->i:Z

    if-nez v2, :cond_6

    if-eqz v1, :cond_6

    .line 241
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->B:Lcom/qihoo/security/widget/MaterialRippleLayout$a;

    invoke-virtual {v1}, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->run()V

    .line 243
    :cond_6
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->b()V

    goto/16 :goto_0

    .line 237
    :cond_7
    iget-boolean v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->e:Z

    if-nez v2, :cond_5

    .line 238
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setRadius(F)V

    goto :goto_1

    .line 262
    :pswitch_2
    iget-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->m:Z

    if-eqz v1, :cond_8

    .line 264
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->v:Landroid/graphics/Point;

    iget-object v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->w:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    iget-object v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->w:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Point;->set(II)V

    .line 265
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->w:Landroid/graphics/Point;

    .line 267
    :cond_8
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 268
    iget-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->e:Z

    if-eqz v1, :cond_a

    .line 269
    iget-boolean v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->y:Z

    if-nez v1, :cond_9

    .line 270
    invoke-direct {p0, v5}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Ljava/lang/Runnable;)V

    .line 275
    :cond_9
    :goto_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->b()V

    goto/16 :goto_0

    .line 273
    :cond_a
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v1, v6}, Landroid/view/View;->setPressed(Z)V

    goto :goto_2

    .line 278
    :pswitch_3
    iget-boolean v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->e:Z

    if-eqz v2, :cond_b

    .line 279
    if-eqz v1, :cond_d

    iget-boolean v2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->x:Z

    if-nez v2, :cond_d

    .line 280
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->invalidate()V

    .line 286
    :cond_b
    :goto_3
    if-nez v1, :cond_1

    .line 287
    invoke-direct {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->b()V

    .line 288
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    if-eqz v1, :cond_c

    .line 289
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v1}, Lcom/nineoldandroids/a/k;->b()V

    .line 291
    :cond_c
    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 292
    iput-boolean v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->x:Z

    goto/16 :goto_0

    .line 281
    :cond_d
    if-nez v1, :cond_b

    .line 282
    invoke-direct {p0, v5}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Ljava/lang/Runnable;)V

    goto :goto_3

    .line 221
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public setAvoidTwiceTouch(Z)V
    .locals 0

    .prologue
    .line 576
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->p:Z

    .line 577
    return-void
.end method

.method public setDefaultRippleAlpha(I)V
    .locals 1

    .prologue
    .line 596
    iput p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->h:I

    .line 597
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 598
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->invalidate()V

    .line 599
    return-void
.end method

.method public setInterceptTouchEvent(Z)V
    .locals 0

    .prologue
    .line 568
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->n:Z

    .line 569
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    if-nez v0, :cond_0

    .line 180
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "MaterialRippleLayout must have a child view to handle clicks"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 182
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->s:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    return-void
.end method

.method public setRadius(F)V
    .locals 0

    .prologue
    .line 509
    iput p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->q:F

    .line 510
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->invalidate()V

    .line 511
    return-void
.end method

.method public setRippleAlpha(Ljava/lang/Integer;)V
    .locals 2

    .prologue
    .line 531
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 532
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->invalidate()V

    .line 533
    return-void
.end method

.method public setRippleBackground(I)V
    .locals 2

    .prologue
    .line 558
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    .line 559
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 560
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->invalidate()V

    .line 561
    return-void
.end method

.method public setRippleColor(I)V
    .locals 2

    .prologue
    .line 539
    iput p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->c:I

    .line 540
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 541
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 542
    invoke-virtual {p0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->invalidate()V

    .line 543
    return-void
.end method

.method public setRippleDelayClick(Z)V
    .locals 0

    .prologue
    .line 580
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->i:Z

    .line 581
    return-void
.end method

.method public setRippleDiameter(I)V
    .locals 0

    .prologue
    .line 550
    iput p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->f:I

    .line 551
    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    .prologue
    .line 554
    iput p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->g:I

    .line 555
    return-void
.end method

.method public setRippleFadeDuration(I)V
    .locals 0

    .prologue
    .line 584
    iput p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->j:I

    .line 585
    return-void
.end method

.method public setRippleHover(Z)V
    .locals 0

    .prologue
    .line 564
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->e:Z

    .line 565
    return-void
.end method

.method public setRippleInAdapter(Z)V
    .locals 0

    .prologue
    .line 592
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->m:Z

    .line 593
    return-void
.end method

.method public setRippleOverlay(Z)V
    .locals 0

    .prologue
    .line 546
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->d:Z

    .line 547
    return-void
.end method

.method public setRipplePersistent(Z)V
    .locals 0

    .prologue
    .line 588
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->k:Z

    .line 589
    return-void
.end method

.method public setSuperTouchEvent(Z)V
    .locals 0

    .prologue
    .line 572
    iput-boolean p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout;->o:Z

    .line 573
    return-void
.end method
