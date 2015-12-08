.class public Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;

.field private static final y:[I


# instance fields
.field private A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

.field private B:I

.field private C:F

.field private D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

.field private E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

.field private F:Landroid/view/animation/Animation;

.field private G:Landroid/view/animation/Animation;

.field private H:Landroid/view/animation/Animation;

.field private I:Landroid/view/animation/Animation;

.field private J:Landroid/view/animation/Animation;

.field private K:Landroid/view/animation/Animation;

.field private L:Landroid/view/animation/Animation;

.field private M:Landroid/view/animation/Animation;

.field private N:Landroid/view/animation/Animation;

.field private O:F

.field private P:Z

.field private Q:Z

.field private R:I

.field private S:I

.field private T:Z

.field private U:Landroid/view/animation/Animation$AnimationListener;

.field private V:Landroid/view/animation/Animation$AnimationListener;

.field private W:Z

.field protected a:I

.field private aa:Z

.field private ab:Z

.field private ac:Z

.field private final ad:Landroid/view/animation/Animation;

.field private final ae:Landroid/view/animation/Animation;

.field private final af:Landroid/view/animation/Animation;

.field private final ag:Landroid/view/animation/Animation;

.field protected b:I

.field protected c:I

.field protected d:I

.field private f:Landroid/view/View;

.field private g:Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;

.field private h:Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;

.field private i:Z

.field private j:Z

.field private k:I

.field private l:F

.field private m:I

.field private n:I

.field private o:I

.field private p:Z

.field private q:F

.field private r:F

.field private s:Z

.field private t:I

.field private u:Z

.field private v:Z

.field private final w:Landroid/view/animation/DecelerateInterpolator;

.field private final x:Landroid/view/animation/DecelerateInterpolator;

.field private z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 66
    const-class v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e:Ljava/lang/String;

    .line 120
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x101000e

    aput v2, v0, v1

    sput-object v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->y:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 328
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 329
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, -0x1

    const/high16 v4, 0x42200000    # 40.0f

    const/high16 v3, 0x40000000    # 2.0f

    const/4 v2, 0x0

    .line 338
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 98
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    .line 99
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    .line 101
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    .line 106
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->p:Z

    .line 111
    iput v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    .line 126
    iput v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->B:I

    .line 168
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/h;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->U:Landroid/view/animation/Animation$AnimationListener;

    .line 205
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/p;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->V:Landroid/view/animation/Animation$AnimationListener;

    .line 1391
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/j;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/j;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ad:Landroid/view/animation/Animation;

    .line 1408
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/k;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ae:Landroid/view/animation/Animation;

    .line 1441
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/l;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/l;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->af:Landroid/view/animation/Animation;

    .line 1448
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/m;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/m;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ag:Landroid/view/animation/Animation;

    .line 340
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k:I

    .line 342
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x10e0001

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->m:I

    .line 345
    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setWillNotDraw(Z)V

    .line 346
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->w:Landroid/view/animation/DecelerateInterpolator;

    .line 347
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->x:Landroid/view/animation/DecelerateInterpolator;

    .line 349
    sget-object v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->y:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 350
    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 351
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 353
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 354
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->R:I

    .line 355
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->S:I

    .line 2381
    new-instance v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    .line 2382
    new-instance v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    .line 2385
    new-instance v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    .line 2386
    new-instance v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    .line 2387
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a()V

    .line 2388
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a()V

    .line 2389
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2390
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 2391
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2392
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 2393
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->addView(Landroid/view/View;)V

    .line 2394
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->addView(Landroid/view/View;)V

    .line 358
    invoke-static {p0, v5}, Landroid/support/v4/view/ViewCompat;->setChildrenDrawingOrderEnabled(Landroid/view/ViewGroup;Z)V

    .line 360
    const/high16 v1, 0x42800000    # 64.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    .line 361
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    .line 363
    return-void
.end method

.method private static a(Landroid/view/MotionEvent;I)F
    .locals 1

    .prologue
    .line 1013
    invoke-static {p0, p1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 1014
    if-gez v0, :cond_0

    .line 1015
    const/high16 v0, -0x40800000    # -1.0f

    .line 1017
    :goto_0
    return v0

    :cond_0
    invoke-static {p0, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;I)I
    .locals 0

    .prologue
    .line 60
    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    return p1
.end method

.method private a(F)V
    .locals 1

    .prologue
    .line 509
    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(I)V

    .line 515
    :goto_0
    return-void

    .line 512
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-static {v0, p1}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 513
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-static {v0, p1}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    goto :goto_0
.end method

.method private a(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 1333
    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a:I

    .line 1334
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ad:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V

    .line 1335
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ad:Landroid/view/animation/Animation;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1336
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ad:Landroid/view/animation/Animation;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->w:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1337
    if-eqz p2, :cond_0

    .line 1338
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1340
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 1341
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ad:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1342
    return-void
.end method

.method private a(IZ)V
    .locals 2

    .prologue
    .line 1504
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->bringToFront()V

    .line 1505
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ac:Z

    if-eqz v0, :cond_0

    .line 1506
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 1508
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->offsetTopAndBottom(I)V

    .line 1509
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    .line 1510
    if-eqz p2, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_1

    .line 1511
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->invalidate()V

    .line 1513
    :cond_1
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    .line 1533
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v0

    .line 1534
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    .line 1535
    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    if-ne v1, v2, :cond_0

    .line 1538
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 1539
    :goto_0
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    .line 1541
    :cond_0
    return-void

    .line 1538
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 554
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/r;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/r;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->G:Landroid/view/animation/Animation;

    .line 560
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->G:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 561
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 562
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 563
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->G:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    .line 564
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(F)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;IZ)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(IZ)V

    return-void
.end method

.method private a(ZZ)V
    .locals 2

    .prologue
    .line 527
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-eq v0, p1, :cond_0

    .line 528
    iput-boolean p2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->P:Z

    .line 529
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f()V

    .line 530
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    .line 531
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-eqz v0, :cond_1

    .line 532
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->U:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(ILandroid/view/animation/Animation$AnimationListener;)V

    .line 537
    :cond_0
    :goto_0
    return-void

    .line 534
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->U:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0
.end method

.method private static a(Landroid/view/animation/Animation;)Z
    .locals 1

    .prologue
    .line 1026
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;I)I
    .locals 0

    .prologue
    .line 60
    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    return p1
.end method

.method private b(II)Landroid/view/animation/Animation;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 601
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 617
    :goto_0
    return-object v0

    .line 604
    :cond_0
    new-instance v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/t;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/t;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;II)V

    .line 612
    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 614
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 615
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 616
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    move-object v0, v1

    .line 617
    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    return-object v0
.end method

.method private b(F)V
    .locals 1

    .prologue
    .line 518
    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 519
    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c(I)V

    .line 524
    :goto_0
    return-void

    .line 521
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-static {v0, p1}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 522
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-static {v0, p1}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    goto :goto_0
.end method

.method private b(I)V
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 244
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    .line 245
    return-void
.end method

.method private b(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 1345
    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b:I

    .line 1346
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ae:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V

    .line 1347
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ae:Landroid/view/animation/Animation;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1348
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ae:Landroid/view/animation/Animation;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->x:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1349
    if-eqz p2, :cond_0

    .line 1350
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1352
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 1353
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ae:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1354
    return-void
.end method

.method private b(IZ)V
    .locals 2

    .prologue
    .line 1516
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->bringToFront()V

    .line 1517
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 1518
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->offsetTopAndBottom(I)V

    .line 1521
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    .line 1522
    if-eqz p2, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 1523
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->invalidate()V

    .line 1525
    :cond_0
    return-void
.end method

.method private b(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 4

    .prologue
    .line 568
    new-instance v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/s;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/s;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->H:Landroid/view/animation/Animation;

    .line 574
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->H:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 575
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 576
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 577
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->H:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    .line 580
    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(F)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;IZ)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(IZ)V

    return-void
.end method

.method private b(ZZ)V
    .locals 2

    .prologue
    .line 540
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    if-eq v0, p1, :cond_0

    .line 541
    iput-boolean p2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->Q:Z

    .line 542
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f()V

    .line 543
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    .line 544
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    if-eqz v0, :cond_1

    .line 545
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->V:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(ILandroid/view/animation/Animation$AnimationListener;)V

    .line 551
    :cond_0
    :goto_0
    return-void

    .line 547
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->V:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0
.end method

.method private c(II)Landroid/view/animation/Animation;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 623
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 639
    :goto_0
    return-object v0

    .line 626
    :cond_0
    new-instance v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/u;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;II)V

    .line 634
    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 636
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 637
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 638
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    move-object v0, v1

    .line 639
    goto :goto_0
.end method

.method private c(I)V
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 249
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    .line 250
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V
    .locals 3

    .prologue
    .line 60
    .line 5428
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a:I

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v0, v1

    .line 5429
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    .line 5430
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(IZ)V

    .line 60
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->P:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;F)V
    .locals 3

    .prologue
    .line 60
    .line 5435
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b:I

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v0, v1

    .line 5436
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 5437
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(IZ)V

    .line 60
    return-void
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->P:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->g:Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;

    return-object v0
.end method

.method private static e()Z
    .locals 2

    .prologue
    .line 413
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    return-object v0
.end method

.method private f()V
    .locals 3

    .prologue
    .line 724
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    if-nez v0, :cond_0

    .line 725
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 726
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 727
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 728
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    .line 733
    :cond_0
    return-void

    .line 725
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 1

    .prologue
    .line 60
    const/16 v0, 0xff

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(I)V

    return-void
.end method

.method private g()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v4, -0x1

    const/4 v2, 0x0

    .line 825
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-ge v0, v3, :cond_5

    .line 826
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    instance-of v0, v0, Landroid/widget/AbsListView;

    if-eqz v0, :cond_2

    .line 827
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    check-cast v0, Landroid/widget/AbsListView;

    .line 828
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v3

    if-gtz v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getPaddingTop()I

    move-result v0

    if-ge v3, v0, :cond_1

    :cond_0
    move v0, v1

    .line 835
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 828
    goto :goto_0

    .line 832
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-static {v0, v4}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-lez v0, :cond_4

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0

    .line 835
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-static {v0, v4}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    goto :goto_0
.end method

.method private h()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 841
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-ge v0, v3, :cond_5

    .line 842
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    instance-of v0, v0, Landroid/widget/AbsListView;

    if-eqz v0, :cond_2

    .line 843
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    check-cast v0, Landroid/widget/AbsListView;

    .line 844
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getCount()I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getPaddingBottom()I

    move-result v0

    if-ge v3, v0, :cond_1

    :cond_0
    move v0, v1

    .line 852
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 844
    goto :goto_0

    .line 849
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-gez v0, :cond_4

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0

    .line 852
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    return v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    return v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->Q:Z

    return v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->Q:Z

    return v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->h:Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 1

    .prologue
    .line 60
    const/16 v0, 0xff

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c(I)V

    return-void
.end method

.method static synthetic q(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method static synthetic r(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method static synthetic s(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->T:Z

    return v0
.end method

.method static synthetic t(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)F
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    return v0
.end method

.method static synthetic u(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)F
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->C:F

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 456
    invoke-direct {p0, v0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(ZZ)V

    .line 458
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 280
    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    .line 281
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 267
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    .line 268
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 269
    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    iput p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    .line 270
    int-to-float v0, p2

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    .line 273
    int-to-float v0, p2

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    .line 275
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->T:Z

    .line 276
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->invalidate()V

    .line 277
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;)V
    .locals 0

    .prologue
    .line 406
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->h:Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;

    .line 407
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V
    .locals 0

    .prologue
    .line 402
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->g:Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;

    .line 403
    return-void
.end method

.method public final a(Z)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 423
    if-eqz p1, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-eq v0, p1, :cond_3

    .line 425
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    .line 427
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->T:Z

    if-nez v0, :cond_2

    .line 428
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 432
    :goto_0
    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(IZ)V

    .line 434
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->P:Z

    .line 435
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->U:Landroid/view/animation/Animation$AnimationListener;

    .line 2461
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 2462
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    .line 2466
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/16 v2, 0xff

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    .line 2468
    :cond_0
    new-instance v1, Lcom/roidapp/cloudlib/sns/modifiedrefresh/q;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/q;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->F:Landroid/view/animation/Animation;

    .line 2474
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->F:Landroid/view/animation/Animation;

    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->m:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 2475
    if-eqz v0, :cond_1

    .line 2476
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 2478
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 2479
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->F:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    .line 439
    :goto_1
    return-void

    .line 430
    :cond_2
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    float-to-int v0, v0

    goto :goto_0

    .line 437
    :cond_3
    invoke-direct {p0, p1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(ZZ)V

    goto :goto_1
.end method

.method public final varargs a([I)V
    .locals 1

    .prologue
    .line 704
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f()V

    .line 705
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a([I)V

    .line 706
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a([I)V

    .line 707
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 864
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ab:Z

    .line 865
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 714
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    return v0
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 868
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ac:Z

    .line 869
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 718
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    return v0
.end method

.method public final d()I
    .locals 2

    .prologue
    .line 1528
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    sub-int/2addr v0, v1

    return v0
.end method

.method protected getChildDrawingOrder(II)I
    .locals 1

    .prologue
    .line 366
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->B:I

    if-gez v0, :cond_1

    .line 376
    :cond_0
    :goto_0
    return p2

    .line 368
    :cond_1
    add-int/lit8 v0, p1, -0x1

    if-ne p2, v0, :cond_2

    .line 370
    iget p2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->B:I

    goto :goto_0

    .line 371
    :cond_2
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->B:I

    if-lt p2, v0, :cond_0

    .line 373
    add-int/lit8 p2, p2, 0x1

    goto :goto_0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .prologue
    const/16 v8, 0x4c

    const/4 v7, -0x1

    const/high16 v6, -0x40800000    # -1.0f

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 874
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1009
    :cond_0
    :goto_0
    return v1

    .line 878
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f()V

    .line 880
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v4

    .line 882
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->v:Z

    if-eqz v0, :cond_2

    if-nez v4, :cond_2

    .line 883
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->v:Z

    .line 897
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ac:Z

    if-eqz v0, :cond_4

    :cond_3
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->g()Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_4
    move v0, v2

    .line 901
    :goto_1
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-eqz v3, :cond_5

    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ac:Z

    if-eqz v3, :cond_6

    :cond_5
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ab:Z

    if-eqz v3, :cond_6

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->h()Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_6
    move v3, v2

    .line 905
    :goto_2
    iget-boolean v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->v:Z

    if-nez v5, :cond_0

    if-eqz v3, :cond_7

    if-nez v0, :cond_0

    .line 910
    :cond_7
    packed-switch v4, :pswitch_data_0

    .line 1009
    :cond_8
    :goto_3
    :pswitch_0
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    goto :goto_0

    :cond_9
    move v0, v1

    .line 897
    goto :goto_1

    :cond_a
    move v3, v1

    .line 901
    goto :goto_2

    .line 913
    :pswitch_1
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    .line 914
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    .line 915
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    invoke-static {p1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 916
    cmpl-float v3, v0, v6

    if-eqz v3, :cond_0

    .line 920
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-nez v1, :cond_b

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    if-eqz v1, :cond_c

    .line 921
    :cond_b
    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    .line 926
    :goto_4
    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->r:F

    goto :goto_3

    .line 923
    :cond_c
    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-direct {p0, v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(IZ)V

    .line 924
    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getHeight()I

    move-result v3

    add-int/2addr v1, v3

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-direct {p0, v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(IZ)V

    goto :goto_4

    .line 930
    :pswitch_2
    iget v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    if-ne v4, v7, :cond_d

    .line 931
    sget-object v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e:Ljava/lang/String;

    const-string v2, "Got ACTION_MOVE event but don\'t have an active pointer id."

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 935
    :cond_d
    iget v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    invoke-static {p1, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/MotionEvent;I)F

    move-result v4

    .line 936
    cmpl-float v5, v4, v6

    if-eqz v5, :cond_0

    .line 949
    if-nez v0, :cond_e

    .line 950
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->r:F

    sub-float v0, v4, v0

    .line 951
    iget v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k:I

    int-to-float v5, v5

    cmpl-float v0, v0, v5

    if-lez v0, :cond_f

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    if-nez v0, :cond_f

    .line 952
    iput v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    .line 953
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->W:Z

    .line 954
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    .line 955
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v0, v8}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    .line 973
    :cond_e
    :goto_5
    if-nez v3, :cond_8

    .line 974
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->r:F

    sub-float/2addr v0, v4

    .line 975
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->k:I

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_11

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    if-nez v0, :cond_11

    .line 976
    iput v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    .line 977
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->aa:Z

    .line 978
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    .line 979
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v0, v8}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->setAlpha(I)V

    goto/16 :goto_3

    .line 957
    :cond_f
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-eqz v0, :cond_e

    .line 958
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    iget v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    if-le v0, v5, :cond_10

    .line 959
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    sub-float v0, v4, v0

    float-to-int v0, v0

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(IZ)V

    .line 961
    iput v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    goto/16 :goto_0

    .line 965
    :cond_10
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v5}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v5

    sub-int/2addr v0, v5

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(IZ)V

    goto :goto_5

    .line 981
    :cond_11
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    if-eqz v0, :cond_8

    .line 982
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    if-ge v0, v3, :cond_12

    .line 983
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    sub-float v0, v4, v0

    float-to-int v0, v0

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(IZ)V

    .line 985
    iput v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    goto/16 :goto_0

    .line 988
    :cond_12
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(IZ)V

    goto/16 :goto_3

    .line 997
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 1002
    :pswitch_4
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->W:Z

    .line 1003
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->aa:Z

    .line 1004
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    .line 1005
    iput v7, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    goto/16 :goto_3

    .line 910
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 746
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getMeasuredWidth()I

    move-result v2

    .line 747
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getMeasuredHeight()I

    move-result v0

    .line 748
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getChildCount()I

    move-result v3

    if-nez v3, :cond_1

    .line 778
    :cond_0
    :goto_0
    return-void

    .line 751
    :cond_1
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    if-nez v3, :cond_2

    .line 752
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f()V

    .line 754
    :cond_2
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    if-eqz v3, :cond_0

    .line 757
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    .line 758
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingLeft()I

    move-result v4

    .line 759
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingTop()I

    move-result v5

    .line 760
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingLeft()I

    move-result v6

    sub-int v6, v2, v6

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingRight()I

    move-result v7

    sub-int/2addr v6, v7

    .line 761
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingTop()I

    move-result v7

    sub-int/2addr v0, v7

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingBottom()I

    move-result v7

    sub-int v7, v0, v7

    .line 763
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ac:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    .line 764
    :goto_1
    iget-boolean v8, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ac:Z

    if-eqz v8, :cond_3

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    .line 766
    :cond_3
    add-int v8, v5, v0

    sub-int/2addr v8, v1

    iget v9, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    add-int/2addr v8, v9

    iget v9, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    sub-int/2addr v8, v9

    add-int/2addr v6, v4

    add-int/2addr v5, v7

    add-int/2addr v0, v5

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    sub-int/2addr v0, v1

    invoke-virtual {v3, v4, v8, v6, v0}, Landroid/view/View;->layout(IIII)V

    .line 770
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getMeasuredWidth()I

    move-result v0

    .line 771
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getMeasuredHeight()I

    move-result v1

    .line 772
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    div-int/lit8 v4, v2, 0x2

    div-int/lit8 v5, v0, 0x2

    sub-int/2addr v4, v5

    iget v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    div-int/lit8 v6, v2, 0x2

    div-int/lit8 v8, v0, 0x2

    add-int/2addr v6, v8

    iget v8, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    add-int/2addr v8, v1

    invoke-virtual {v3, v4, v5, v6, v8}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->layout(IIII)V

    .line 775
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    div-int/lit8 v4, v2, 0x2

    div-int/lit8 v5, v0, 0x2

    sub-int/2addr v4, v5

    iget v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    add-int/2addr v5, v7

    div-int/lit8 v2, v2, 0x2

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v2

    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    add-int/2addr v2, v7

    add-int/2addr v1, v2

    invoke-virtual {v3, v4, v5, v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->layout(IIII)V

    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 763
    goto :goto_1
.end method

.method public onMeasure(II)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    .line 782
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 783
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    if-nez v0, :cond_0

    .line 784
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f()V

    .line 786
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    if-nez v0, :cond_2

    .line 807
    :cond_1
    :goto_0
    return-void

    .line 789
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->f:Landroid/view/View;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    .line 793
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->R:I

    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->S:I

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->measure(II)V

    .line 795
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->T:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->p:Z

    if-nez v0, :cond_3

    .line 796
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->p:Z

    .line 797
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getMeasuredHeight()I

    move-result v0

    neg-int v0, v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    .line 799
    :cond_3
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->B:I

    .line 801
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 802
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    if-ne v1, v2, :cond_4

    .line 803
    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->B:I

    goto :goto_0

    .line 801
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .prologue
    const/4 v6, 0x0

    const/high16 v12, 0x40000000    # 2.0f

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1033
    :try_start_0
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v2

    .line 1035
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->v:Z

    if-eqz v3, :cond_0

    if-nez v2, :cond_0

    .line 1036
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->v:Z

    .line 1044
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->g()Z

    move-result v3

    .line 1045
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->h()Z

    move-result v4

    .line 1047
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-boolean v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->v:Z

    if-nez v5, :cond_1

    if-eqz v4, :cond_2

    if-eqz v3, :cond_2

    .line 1325
    :cond_1
    :goto_0
    return v0

    .line 1052
    :cond_2
    packed-switch v2, :pswitch_data_0

    :cond_3
    :goto_1
    :pswitch_0
    move v0, v1

    .line 1321
    goto :goto_0

    .line 1054
    :pswitch_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    .line 1055
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 1324
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    move v0, v1

    .line 1325
    goto :goto_0

    .line 1060
    :pswitch_2
    :try_start_1
    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v2

    .line 1061
    if-gez v2, :cond_4

    .line 1062
    sget-object v2, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e:Ljava/lang/String;

    const-string v3, "Got ACTION_MOVE event but have an invalid active pointer id."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1066
    :cond_4
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 1067
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    .line 1069
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    if-eqz v3, :cond_3

    .line 1070
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->W:Z

    if-eqz v3, :cond_f

    .line 1071
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Z)V

    .line 1072
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    div-float v3, v2, v3

    .line 1073
    cmpg-float v4, v3, v6

    if-ltz v4, :cond_1

    .line 1076
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 1077
    float-to-double v4, v3

    const-wide v6, 0x3fd999999999999aL    # 0.4

    sub-double/2addr v4, v6

    const-wide/16 v6, 0x0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    double-to-float v0, v4

    const/high16 v4, 0x40a00000    # 5.0f

    mul-float/2addr v0, v4

    const/high16 v4, 0x40400000    # 3.0f

    div-float v4, v0, v4

    .line 1078
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    sub-float v5, v0, v5

    .line 1079
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->T:Z

    if-eqz v0, :cond_b

    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    iget v6, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    int-to-float v6, v6

    sub-float/2addr v0, v6

    .line 1081
    :goto_2
    const/4 v6, 0x0

    mul-float v7, v0, v12

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    div-float/2addr v5, v0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    .line 1083
    const/high16 v6, 0x40800000    # 4.0f

    div-float v6, v5, v6

    float-to-double v6, v6

    const/high16 v8, 0x40800000    # 4.0f

    div-float/2addr v5, v8

    float-to-double v8, v5

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    sub-double/2addr v6, v8

    double-to-float v5, v6

    mul-float/2addr v5, v12

    .line 1085
    mul-float v6, v0, v5

    mul-float/2addr v6, v12

    .line 1087
    iget v7, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    mul-float/2addr v0, v3

    add-float/2addr v0, v6

    float-to-int v0, v0

    add-int/2addr v0, v7

    .line 1090
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-nez v3, :cond_d

    .line 1093
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_5

    .line 1094
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 1096
    :cond_5
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-nez v3, :cond_6

    .line 1097
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 1098
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    .line 1100
    :cond_6
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    cmpg-float v3, v2, v3

    if-gez v3, :cond_c

    .line 1101
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-eqz v3, :cond_7

    .line 1102
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    div-float/2addr v2, v3

    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(F)V

    .line 1104
    :cond_7
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0x4c

    if-le v2, v3, :cond_8

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->I:Landroid/view/animation/Animation;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/animation/Animation;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 2583
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0x4c

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(II)Landroid/view/animation/Animation;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->I:Landroid/view/animation/Animation;

    .line 1109
    :cond_8
    const v2, 0x3f4ccccd    # 0.8f

    mul-float/2addr v2, v4

    .line 1110
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const v6, 0x3f4ccccd    # 0.8f

    invoke-static {v6, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b(F)V

    .line 1111
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(F)V

    .line 1119
    :cond_9
    :goto_3
    const/high16 v2, -0x41800000    # -0.25f

    const v3, 0x3ecccccd    # 0.4f

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    mul-float v3, v5, v12

    add-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    .line 1120
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->c(F)V

    .line 1132
    :cond_a
    :goto_4
    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    sub-int/2addr v0, v2

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(IZ)V

    goto/16 :goto_1

    .line 1079
    :cond_b
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    goto/16 :goto_2

    .line 1113
    :cond_c
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0xff

    if-ge v2, v3, :cond_9

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->K:Landroid/view/animation/Animation;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/animation/Animation;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 2587
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0xff

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(II)Landroid/view/animation/Animation;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->K:Landroid/view/animation/Animation;

    goto :goto_3

    .line 1123
    :cond_d
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_e

    .line 1124
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 1126
    :cond_e
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-nez v2, :cond_a

    .line 1127
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 1128
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    goto :goto_4

    .line 1134
    :cond_f
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->aa:Z

    if-eqz v3, :cond_3

    .line 1135
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Z)V

    .line 1136
    neg-float v2, v2

    .line 1138
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    div-float v3, v2, v3

    .line 1139
    cmpg-float v4, v3, v6

    if-ltz v4, :cond_1

    .line 1142
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 1143
    float-to-double v4, v3

    const-wide v6, 0x3fd999999999999aL    # 0.4

    sub-double/2addr v4, v6

    const-wide/16 v6, 0x0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    double-to-float v0, v4

    const/high16 v4, 0x40a00000    # 5.0f

    mul-float/2addr v0, v4

    const/high16 v4, 0x40400000    # 3.0f

    div-float v4, v0, v4

    .line 1144
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v5, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    sub-float v5, v0, v5

    .line 1147
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->T:Z

    if-eqz v0, :cond_16

    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    iget v6, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c:I

    int-to-float v6, v6

    sub-float/2addr v0, v6

    .line 1149
    :goto_5
    const/4 v6, 0x0

    mul-float v7, v0, v12

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    div-float/2addr v5, v0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    .line 1151
    const/high16 v6, 0x40800000    # 4.0f

    div-float v6, v5, v6

    float-to-double v6, v6

    const/high16 v8, 0x40800000    # 4.0f

    div-float/2addr v5, v8

    float-to-double v8, v5

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    sub-double/2addr v6, v8

    double-to-float v5, v6

    mul-float/2addr v5, v12

    .line 1153
    mul-float v6, v0, v5

    mul-float/2addr v6, v12

    .line 1156
    iget v7, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d:I

    mul-float/2addr v0, v3

    add-float/2addr v0, v6

    float-to-int v0, v0

    sub-int v0, v7, v0

    .line 1160
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    if-nez v3, :cond_18

    .line 1164
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_10

    .line 1165
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 1168
    :cond_10
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-nez v3, :cond_11

    .line 1169
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 1170
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    .line 1172
    :cond_11
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    cmpg-float v3, v2, v3

    if-gez v3, :cond_17

    .line 1173
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-eqz v3, :cond_12

    .line 1174
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    div-float/2addr v2, v3

    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(F)V

    .line 1176
    :cond_12
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0x4c

    if-le v2, v3, :cond_13

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->J:Landroid/view/animation/Animation;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/animation/Animation;)Z

    move-result v2

    if-nez v2, :cond_13

    .line 2591
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0x4c

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c(II)Landroid/view/animation/Animation;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->J:Landroid/view/animation/Animation;

    .line 1181
    :cond_13
    const v2, 0x3f4ccccd    # 0.8f

    mul-float/2addr v2, v4

    .line 1182
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const v6, 0x3f4ccccd    # 0.8f

    invoke-static {v6, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b(F)V

    .line 1183
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(F)V

    .line 1191
    :cond_14
    :goto_6
    const/high16 v2, -0x41800000    # -0.25f

    const v3, 0x3ecccccd    # 0.4f

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    mul-float v3, v5, v12

    add-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    .line 1192
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->c(F)V

    .line 1205
    :cond_15
    :goto_7
    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    sub-int/2addr v0, v2

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(IZ)V

    goto/16 :goto_1

    .line 1147
    :cond_16
    iget v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->O:F

    goto/16 :goto_5

    .line 1185
    :cond_17
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0xff

    if-ge v2, v3, :cond_14

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->L:Landroid/view/animation/Animation;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/animation/Animation;)Z

    move-result v2

    if-nez v2, :cond_14

    .line 2595
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v2

    const/16 v3, 0xff

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c(II)Landroid/view/animation/Animation;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->L:Landroid/view/animation/Animation;

    goto :goto_6

    .line 1195
    :cond_18
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_19

    .line 1196
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->setVisibility(I)V

    .line 1199
    :cond_19
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-nez v2, :cond_15

    .line 1200
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V

    .line 1201
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V

    goto :goto_7

    .line 1218
    :pswitch_3
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v0

    .line 1219
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    goto/16 :goto_1

    .line 1224
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1229
    :pswitch_5
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1a

    .line 1230
    if-ne v2, v1, :cond_1

    .line 1231
    sget-object v2, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e:Ljava/lang/String;

    const-string v3, "Got ACTION_UP event but don\'t have an active pointer id."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 1235
    :cond_1a
    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v2

    .line 1236
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 1237
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->q:F

    sub-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    .line 1238
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->s:Z

    .line 1240
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    cmpl-float v3, v2, v3

    if-gtz v3, :cond_1b

    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->l:F

    neg-float v3, v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_20

    .line 1242
    :cond_1b
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->W:Z

    if-eqz v2, :cond_1e

    .line 1243
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->i:Z

    if-eqz v2, :cond_1d

    .line 1244
    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(ILandroid/view/animation/Animation$AnimationListener;)V

    .line 1314
    :cond_1c
    :goto_8
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->W:Z

    .line 1315
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->aa:Z

    .line 1316
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->t:I

    goto/16 :goto_0

    .line 1246
    :cond_1d
    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(ZZ)V

    goto :goto_8

    .line 1248
    :cond_1e
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->aa:Z

    if-eqz v2, :cond_1c

    .line 1249
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->j:Z

    if-eqz v2, :cond_1f

    .line 1250
    iget v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(ILandroid/view/animation/Animation$AnimationListener;)V

    goto :goto_8

    .line 1252
    :cond_1f
    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {p0, v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(ZZ)V

    goto :goto_8

    .line 1258
    :cond_20
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->W:Z

    if-eqz v2, :cond_26

    .line 1259
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b(F)V

    .line 1260
    const/4 v2, 0x0

    .line 1261
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-nez v3, :cond_21

    .line 1262
    new-instance v2, Lcom/roidapp/cloudlib/sns/modifiedrefresh/v;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/v;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    .line 1281
    :cond_21
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->n:I

    .line 3357
    iget-boolean v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-eqz v4, :cond_24

    .line 3457
    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a:I

    .line 3458
    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e()Z

    move-result v3

    if-eqz v3, :cond_23

    .line 3459
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v3

    int-to-float v3, v3

    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->C:F

    .line 3463
    :goto_9
    new-instance v3, Lcom/roidapp/cloudlib/sns/modifiedrefresh/n;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/n;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->M:Landroid/view/animation/Animation;

    .line 3471
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->M:Landroid/view/animation/Animation;

    const-wide/16 v4, 0x96

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 3472
    if-eqz v2, :cond_22

    .line 3473
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 3475
    :cond_22
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 3476
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->M:Landroid/view/animation/Animation;

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1282
    :goto_a
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->D:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Z)V

    goto :goto_8

    .line 3461
    :cond_23
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-static {v3}, Landroid/support/v4/view/ViewCompat;->getScaleX(Landroid/view/View;)F

    move-result v3

    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->C:F

    goto :goto_9

    .line 3361
    :cond_24
    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a:I

    .line 3362
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->af:Landroid/view/animation/Animation;

    invoke-virtual {v3}, Landroid/view/animation/Animation;->reset()V

    .line 3363
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->af:Landroid/view/animation/Animation;

    const-wide/16 v4, 0xc8

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 3364
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->af:Landroid/view/animation/Animation;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->w:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v3, v4}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 3365
    if-eqz v2, :cond_25

    .line 3366
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 3368
    :cond_25
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 3369
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->z:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->af:Landroid/view/animation/Animation;

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_a

    .line 1284
    :cond_26
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->aa:Z

    if-eqz v2, :cond_1c

    .line 1285
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b(F)V

    .line 1287
    const/4 v2, 0x0

    .line 1288
    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-nez v3, :cond_27

    .line 1289
    new-instance v2, Lcom/roidapp/cloudlib/sns/modifiedrefresh/i;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/i;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    .line 1308
    :cond_27
    iget v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->o:I

    .line 4374
    iget-boolean v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->u:Z

    if-eqz v4, :cond_2a

    .line 4481
    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b:I

    .line 4482
    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->e()Z

    move-result v3

    if-eqz v3, :cond_29

    .line 4483
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b()I

    move-result v3

    int-to-float v3, v3

    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->C:F

    .line 4487
    :goto_b
    new-instance v3, Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/o;-><init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;)V

    iput-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->N:Landroid/view/animation/Animation;

    .line 4495
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->N:Landroid/view/animation/Animation;

    const-wide/16 v4, 0x96

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 4496
    if-eqz v2, :cond_28

    .line 4497
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 4499
    :cond_28
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 4500
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->N:Landroid/view/animation/Animation;

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1309
    :goto_c
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->E:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Z)V

    goto/16 :goto_8

    .line 4485
    :cond_29
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-static {v3}, Landroid/support/v4/view/ViewCompat;->getScaleX(Landroid/view/View;)F

    move-result v3

    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->C:F

    goto :goto_b

    .line 4378
    :cond_2a
    iput v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b:I

    .line 4379
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ag:Landroid/view/animation/Animation;

    invoke-virtual {v3}, Landroid/view/animation/Animation;->reset()V

    .line 4380
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ag:Landroid/view/animation/Animation;

    const-wide/16 v4, 0xc8

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 4381
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ag:Landroid/view/animation/Animation;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->x:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v3, v4}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 4382
    if-eqz v2, :cond_2b

    .line 4383
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->a(Landroid/view/animation/Animation$AnimationListener;)V

    .line 4385
    :cond_2b
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->clearAnimation()V

    .line 4386
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->A:Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->ag:Landroid/view/animation/Animation;

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/a;->startAnimation(Landroid/view/animation/Animation;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_c

    .line 1052
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .prologue
    .line 1023
    return-void
.end method
