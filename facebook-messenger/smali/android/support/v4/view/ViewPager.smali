.class public Landroid/support/v4/view/ViewPager;
.super Landroid/view/ViewGroup;
.source "ViewPager.java"


# static fields
.field private static final a:[I

.field private static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Landroid/support/v4/view/ax;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Landroid/view/animation/Interpolator;


# instance fields
.field private A:Z

.field private B:I

.field private C:I

.field private D:I

.field private E:F

.field private F:F

.field private G:F

.field private H:I

.field private I:Landroid/view/VelocityTracker;

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:Z

.field private O:J

.field private P:Landroid/support/v4/d/a;

.field private Q:Landroid/support/v4/d/a;

.field private R:Z

.field private S:Z

.field private T:Z

.field private U:I

.field private V:Z

.field private W:Landroid/support/v4/view/bb;

.field private Z:Landroid/support/v4/view/bb;

.field private aa:Landroid/support/v4/view/ba;

.field private final ab:Ljava/lang/Runnable;

.field private ac:I

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/view/ax;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/support/v4/view/ax;

.field private final f:Landroid/graphics/Rect;

.field private g:Landroid/support/v4/view/x;

.field private h:I

.field private i:I

.field private j:Landroid/os/Parcelable;

.field private k:Ljava/lang/ClassLoader;

.field private l:Landroid/widget/Scroller;

.field private m:Landroid/support/v4/view/bc;

.field private n:I

.field private o:Landroid/graphics/drawable/Drawable;

.field private p:I

.field private q:I

.field private r:F

.field private s:F

.field private t:I

.field private u:I

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:I

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 94
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100b3

    aput v2, v0, v1

    sput-object v0, Landroid/support/v4/view/ViewPager;->a:[I

    .line 106
    new-instance v0, Landroid/support/v4/view/at;

    invoke-direct {v0}, Landroid/support/v4/view/at;-><init>()V

    sput-object v0, Landroid/support/v4/view/ViewPager;->b:Ljava/util/Comparator;

    .line 113
    new-instance v0, Landroid/support/v4/view/au;

    invoke-direct {v0}, Landroid/support/v4/view/au;-><init>()V

    sput-object v0, Landroid/support/v4/view/ViewPager;->c:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, -0x1

    const/4 v1, 0x1

    .line 306
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 120
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    .line 121
    new-instance v0, Landroid/support/v4/view/ax;

    invoke-direct {v0}, Landroid/support/v4/view/ax;-><init>()V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->e:Landroid/support/v4/view/ax;

    .line 123
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->f:Landroid/graphics/Rect;

    .line 127
    iput v2, p0, Landroid/support/v4/view/ViewPager;->i:I

    .line 128
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->j:Landroid/os/Parcelable;

    .line 129
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->k:Ljava/lang/ClassLoader;

    .line 141
    const v0, -0x800001

    iput v0, p0, Landroid/support/v4/view/ViewPager;->r:F

    .line 142
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Landroid/support/v4/view/ViewPager;->s:F

    .line 151
    iput v1, p0, Landroid/support/v4/view/ViewPager;->y:I

    .line 169
    iput v2, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 196
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->R:Z

    .line 197
    iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->S:Z

    .line 202
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->V:Z

    .line 224
    new-instance v0, Landroid/support/v4/view/av;

    invoke-direct {v0, p0}, Landroid/support/v4/view/av;-><init>(Landroid/support/v4/view/ViewPager;)V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->ab:Ljava/lang/Runnable;

    .line 231
    iput v3, p0, Landroid/support/v4/view/ViewPager;->ac:I

    .line 307
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->a()V

    .line 308
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, -0x1

    const/4 v1, 0x1

    .line 311
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 120
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    .line 121
    new-instance v0, Landroid/support/v4/view/ax;

    invoke-direct {v0}, Landroid/support/v4/view/ax;-><init>()V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->e:Landroid/support/v4/view/ax;

    .line 123
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->f:Landroid/graphics/Rect;

    .line 127
    iput v2, p0, Landroid/support/v4/view/ViewPager;->i:I

    .line 128
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->j:Landroid/os/Parcelable;

    .line 129
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->k:Ljava/lang/ClassLoader;

    .line 141
    const v0, -0x800001

    iput v0, p0, Landroid/support/v4/view/ViewPager;->r:F

    .line 142
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Landroid/support/v4/view/ViewPager;->s:F

    .line 151
    iput v1, p0, Landroid/support/v4/view/ViewPager;->y:I

    .line 169
    iput v2, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 196
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->R:Z

    .line 197
    iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->S:Z

    .line 202
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->V:Z

    .line 224
    new-instance v0, Landroid/support/v4/view/av;

    invoke-direct {v0, p0}, Landroid/support/v4/view/av;-><init>(Landroid/support/v4/view/ViewPager;)V

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->ab:Ljava/lang/Runnable;

    .line 231
    iput v3, p0, Landroid/support/v4/view/ViewPager;->ac:I

    .line 312
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->a()V

    .line 313
    return-void
.end method

.method private a(IFII)I
    .locals 3

    .prologue
    .line 1933
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->L:I

    if-le v0, v1, :cond_2

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->J:I

    if-le v0, v1, :cond_2

    .line 1934
    if-lez p3, :cond_1

    .line 1939
    :goto_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1940
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 1941
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ax;

    .line 1944
    iget v0, v0, Landroid/support/v4/view/ax;->b:I

    iget v1, v1, Landroid/support/v4/view/ax;->b:I

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 1947
    :cond_0
    return p1

    .line 1934
    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 1936
    :cond_2
    int-to-float v0, p1

    add-float/2addr v0, p2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int p1, v0

    goto :goto_0
.end method

.method private a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 2322
    if-nez p1, :cond_2

    .line 2323
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 2325
    :goto_0
    if-nez p2, :cond_0

    .line 2326
    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    move-object v0, v1

    .line 2344
    :goto_1
    return-object v0

    .line 2329
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, v1, Landroid/graphics/Rect;->left:I

    .line 2330
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v0

    iput v0, v1, Landroid/graphics/Rect;->right:I

    .line 2331
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, v1, Landroid/graphics/Rect;->top:I

    .line 2332
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v0

    iput v0, v1, Landroid/graphics/Rect;->bottom:I

    .line 2334
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2335
    :goto_2
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    if-eq v0, p0, :cond_1

    .line 2336
    check-cast v0, Landroid/view/ViewGroup;

    .line 2337
    iget v2, v1, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->left:I

    .line 2338
    iget v2, v1, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getRight()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->right:I

    .line 2339
    iget v2, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 2340
    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getBottom()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 2342
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_2

    :cond_1
    move-object v0, v1

    .line 2344
    goto :goto_1

    :cond_2
    move-object v1, p1

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    return-object v0
.end method

.method private a(IIII)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 1290
    if-lez p2, :cond_1

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1291
    add-int v0, p1, p3

    .line 1292
    add-int v1, p2, p4

    .line 1293
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v3

    .line 1294
    int-to-float v3, v3

    int-to-float v1, v1

    div-float v1, v3, v1

    .line 1295
    int-to-float v0, v0

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 1297
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1298
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1300
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I

    move-result v0

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->timePassed()I

    move-result v3

    sub-int v5, v0, v3

    .line 1301
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->b(I)Landroid/support/v4/view/ax;

    move-result-object v3

    .line 1302
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    iget v3, v3, Landroid/support/v4/view/ax;->e:F

    int-to-float v4, p1

    mul-float/2addr v3, v4

    float-to-int v3, v3

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 1314
    :cond_0
    :goto_0
    return-void

    .line 1306
    :cond_1
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->b(I)Landroid/support/v4/view/ax;

    move-result-object v0

    .line 1307
    if-eqz v0, :cond_2

    iget v0, v0, Landroid/support/v4/view/ax;->e:F

    iget v1, p0, Landroid/support/v4/view/ViewPager;->s:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 1308
    :goto_1
    int-to-float v1, p1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 1309
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1310
    invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->a(Z)V

    .line 1311
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    goto :goto_0

    .line 1307
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic a(Landroid/support/v4/view/ViewPager;I)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    return-void
.end method

.method private a(Landroid/support/v4/view/ax;ILandroid/support/v4/view/ax;)V
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    .line 953
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0}, Landroid/support/v4/view/x;->a()I

    move-result v7

    .line 954
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v0

    .line 955
    if-lez v0, :cond_0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->n:I

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    move v6, v0

    .line 957
    :goto_0
    if-eqz p3, :cond_6

    .line 958
    iget v0, p3, Landroid/support/v4/view/ax;->b:I

    .line 960
    iget v1, p1, Landroid/support/v4/view/ax;->b:I

    if-ge v0, v1, :cond_3

    .line 963
    iget v1, p3, Landroid/support/v4/view/ax;->e:F

    iget v2, p3, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v1, v2

    add-float v3, v1, v6

    .line 964
    add-int/lit8 v2, v0, 0x1

    move v1, v4

    .line 965
    :goto_1
    iget v0, p1, Landroid/support/v4/view/ax;->b:I

    if-gt v2, v0, :cond_6

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 966
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 967
    :goto_2
    iget v5, v0, Landroid/support/v4/view/ax;->b:I

    if-le v2, v5, :cond_1

    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ge v1, v5, :cond_1

    .line 968
    add-int/lit8 v1, v1, 0x1

    .line 969
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    goto :goto_2

    .line 955
    :cond_0
    const/4 v0, 0x0

    move v6, v0

    goto :goto_0

    .line 971
    :cond_1
    :goto_3
    iget v5, v0, Landroid/support/v4/view/ax;->b:I

    if-ge v2, v5, :cond_2

    .line 974
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v5, v2}, Landroid/support/v4/view/x;->a(I)F

    move-result v5

    add-float/2addr v5, v6

    add-float/2addr v3, v5

    .line 975
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 977
    :cond_2
    iput v3, v0, Landroid/support/v4/view/ax;->e:F

    .line 978
    iget v0, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v0, v6

    add-float/2addr v3, v0

    .line 965
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 980
    :cond_3
    iget v1, p1, Landroid/support/v4/view/ax;->b:I

    if-le v0, v1, :cond_6

    .line 981
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 983
    iget v3, p3, Landroid/support/v4/view/ax;->e:F

    .line 984
    add-int/lit8 v2, v0, -0x1

    .line 985
    :goto_4
    iget v0, p1, Landroid/support/v4/view/ax;->b:I

    if-lt v2, v0, :cond_6

    if-ltz v1, :cond_6

    .line 986
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 987
    :goto_5
    iget v5, v0, Landroid/support/v4/view/ax;->b:I

    if-ge v2, v5, :cond_4

    if-lez v1, :cond_4

    .line 988
    add-int/lit8 v1, v1, -0x1

    .line 989
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    goto :goto_5

    .line 991
    :cond_4
    :goto_6
    iget v5, v0, Landroid/support/v4/view/ax;->b:I

    if-le v2, v5, :cond_5

    .line 994
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v5, v2}, Landroid/support/v4/view/x;->a(I)F

    move-result v5

    add-float/2addr v5, v6

    sub-float/2addr v3, v5

    .line 995
    add-int/lit8 v2, v2, -0x1

    goto :goto_6

    .line 997
    :cond_5
    iget v5, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v5, v6

    sub-float/2addr v3, v5

    .line 998
    iput v3, v0, Landroid/support/v4/view/ax;->e:F

    .line 985
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    .line 1004
    :cond_6
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 1005
    iget v2, p1, Landroid/support/v4/view/ax;->e:F

    .line 1006
    iget v0, p1, Landroid/support/v4/view/ax;->b:I

    add-int/lit8 v1, v0, -0x1

    .line 1007
    iget v0, p1, Landroid/support/v4/view/ax;->b:I

    if-nez v0, :cond_7

    iget v0, p1, Landroid/support/v4/view/ax;->e:F

    :goto_7
    iput v0, p0, Landroid/support/v4/view/ViewPager;->r:F

    .line 1008
    iget v0, p1, Landroid/support/v4/view/ax;->b:I

    add-int/lit8 v3, v7, -0x1

    if-ne v0, v3, :cond_8

    iget v0, p1, Landroid/support/v4/view/ax;->e:F

    iget v3, p1, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v0, v3

    sub-float/2addr v0, v10

    :goto_8
    iput v0, p0, Landroid/support/v4/view/ViewPager;->s:F

    .line 1011
    add-int/lit8 v0, p2, -0x1

    move v5, v0

    :goto_9
    if-ltz v5, :cond_b

    .line 1012
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    move v3, v2

    .line 1013
    :goto_a
    iget v2, v0, Landroid/support/v4/view/ax;->b:I

    if-le v1, v2, :cond_9

    .line 1014
    iget-object v9, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    add-int/lit8 v2, v1, -0x1

    invoke-virtual {v9, v1}, Landroid/support/v4/view/x;->a(I)F

    move-result v1

    add-float/2addr v1, v6

    sub-float v1, v3, v1

    move v3, v1

    move v1, v2

    goto :goto_a

    .line 1007
    :cond_7
    const v0, -0x800001

    goto :goto_7

    .line 1008
    :cond_8
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_8

    .line 1016
    :cond_9
    iget v2, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v2, v6

    sub-float v2, v3, v2

    .line 1017
    iput v2, v0, Landroid/support/v4/view/ax;->e:F

    .line 1018
    iget v0, v0, Landroid/support/v4/view/ax;->b:I

    if-nez v0, :cond_a

    iput v2, p0, Landroid/support/v4/view/ViewPager;->r:F

    .line 1011
    :cond_a
    add-int/lit8 v0, v5, -0x1

    add-int/lit8 v1, v1, -0x1

    move v5, v0

    goto :goto_9

    .line 1020
    :cond_b
    iget v0, p1, Landroid/support/v4/view/ax;->e:F

    iget v1, p1, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v0, v1

    add-float v2, v0, v6

    .line 1021
    iget v0, p1, Landroid/support/v4/view/ax;->b:I

    add-int/lit8 v1, v0, 0x1

    .line 1023
    add-int/lit8 v0, p2, 0x1

    move v5, v0

    :goto_b
    if-ge v5, v8, :cond_e

    .line 1024
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    move v3, v2

    .line 1025
    :goto_c
    iget v2, v0, Landroid/support/v4/view/ax;->b:I

    if-ge v1, v2, :cond_c

    .line 1026
    iget-object v9, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v9, v1}, Landroid/support/v4/view/x;->a(I)F

    move-result v1

    add-float/2addr v1, v6

    add-float/2addr v1, v3

    move v3, v1

    move v1, v2

    goto :goto_c

    .line 1028
    :cond_c
    iget v2, v0, Landroid/support/v4/view/ax;->b:I

    add-int/lit8 v9, v7, -0x1

    if-ne v2, v9, :cond_d

    .line 1029
    iget v2, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v2, v3

    sub-float/2addr v2, v10

    iput v2, p0, Landroid/support/v4/view/ViewPager;->s:F

    .line 1031
    :cond_d
    iput v3, v0, Landroid/support/v4/view/ax;->e:F

    .line 1032
    iget v0, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v0, v6

    add-float v2, v3, v0

    .line 1023
    add-int/lit8 v0, v5, 0x1

    add-int/lit8 v1, v1, 0x1

    move v5, v0

    goto :goto_b

    .line 1035
    :cond_e
    iput-boolean v4, p0, Landroid/support/v4/view/ViewPager;->S:Z

    .line 1036
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    .line 2165
    invoke-static {p1}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2166
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v1

    .line 2167
    iget v2, p0, Landroid/support/v4/view/ViewPager;->H:I

    if-ne v1, v2, :cond_0

    .line 2170
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2171
    :goto_0
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v1

    iput v1, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 2172
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 2173
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2174
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2177
    :cond_0
    return-void

    .line 2170
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Z)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 1540
    iget v0, p0, Landroid/support/v4/view/ViewPager;->ac:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    move v0, v4

    .line 1541
    :goto_0
    if-eqz v0, :cond_1

    .line 1543
    invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 1544
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1545
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v1

    .line 1546
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v3

    .line 1547
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v5}, Landroid/widget/Scroller;->getCurrX()I

    move-result v5

    .line 1548
    iget-object v6, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v6}, Landroid/widget/Scroller;->getCurrY()I

    move-result v6

    .line 1549
    if-ne v1, v5, :cond_0

    if-eq v3, v6, :cond_1

    .line 1550
    :cond_0
    invoke-virtual {p0, v5, v6}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1553
    :cond_1
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->x:Z

    move v1, v2

    move v3, v0

    .line 1554
    :goto_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 1555
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 1556
    iget-boolean v5, v0, Landroid/support/v4/view/ax;->c:Z

    if-eqz v5, :cond_2

    .line 1558
    iput-boolean v2, v0, Landroid/support/v4/view/ax;->c:Z

    move v3, v4

    .line 1554
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    move v0, v2

    .line 1540
    goto :goto_0

    .line 1561
    :cond_4
    if-eqz v3, :cond_5

    .line 1562
    if-eqz p1, :cond_6

    .line 1563
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->ab:Ljava/lang/Runnable;

    invoke-static {p0, v0}, Landroid/support/v4/view/ad;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1568
    :cond_5
    :goto_2
    return-void

    .line 1565
    :cond_6
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->ab:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_2
.end method

.method private a(FF)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1571
    iget v0, p0, Landroid/support/v4/view/ViewPager;->C:I

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    cmpl-float v0, p2, v2

    if-gtz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->C:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_2

    cmpg-float v0, p2, v2

    if-gez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Landroid/support/v4/view/ViewPager;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    return v0
.end method

.method private c(F)Z
    .locals 10

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1839
    .line 1841
    iget v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    sub-float/2addr v0, p1

    .line 1842
    iput p1, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 1844
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    .line 1845
    add-float v5, v1, v0

    .line 1846
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v7

    .line 1848
    int-to-float v0, v7

    iget v1, p0, Landroid/support/v4/view/ViewPager;->r:F

    mul-float v4, v0, v1

    .line 1849
    int-to-float v0, v7

    iget v1, p0, Landroid/support/v4/view/ViewPager;->s:F

    mul-float v6, v0, v1

    .line 1853
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 1854
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    iget-object v8, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ax;

    .line 1855
    iget v8, v0, Landroid/support/v4/view/ax;->b:I

    if-eqz v8, :cond_5

    .line 1857
    iget v0, v0, Landroid/support/v4/view/ax;->e:F

    int-to-float v4, v7

    mul-float/2addr v0, v4

    move v4, v0

    move v0, v2

    .line 1859
    :goto_0
    iget v8, v1, Landroid/support/v4/view/ax;->b:I

    iget-object v9, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v9}, Landroid/support/v4/view/x;->a()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    if-eq v8, v9, :cond_4

    .line 1861
    iget v1, v1, Landroid/support/v4/view/ax;->e:F

    int-to-float v3, v7

    mul-float/2addr v1, v3

    move v3, v2

    .line 1864
    :goto_1
    cmpg-float v6, v5, v4

    if-gez v6, :cond_1

    .line 1865
    if-eqz v0, :cond_0

    .line 1866
    sub-float v0, v4, v5

    .line 1867
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    int-to-float v2, v7

    div-float/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/support/v4/d/a;->a(F)Z

    move-result v2

    .line 1878
    :cond_0
    :goto_2
    iget v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    float-to-int v1, v4

    int-to-float v1, v1

    sub-float v1, v4, v1

    add-float/2addr v0, v1

    iput v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 1879
    float-to-int v0, v4

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1880
    float-to-int v0, v4

    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->d(I)Z

    .line 1882
    return v2

    .line 1870
    :cond_1
    cmpl-float v0, v5, v1

    if-lez v0, :cond_3

    .line 1871
    if-eqz v3, :cond_2

    .line 1872
    sub-float v0, v5, v1

    .line 1873
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    int-to-float v3, v7

    div-float/2addr v0, v3

    invoke-virtual {v2, v0}, Landroid/support/v4/d/a;->a(F)Z

    move-result v2

    :cond_2
    move v4, v1

    .line 1875
    goto :goto_2

    :cond_3
    move v4, v5

    goto :goto_2

    :cond_4
    move v1, v6

    goto :goto_1

    :cond_5
    move v0, v3

    goto :goto_0
.end method

.method private d(I)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 1450
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 1451
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->T:Z

    .line 1452
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Landroid/support/v4/view/ViewPager;->a(IFI)V

    .line 1453
    iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->T:Z

    if-nez v1, :cond_2

    .line 1454
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "onPageScrolled did not call superclass implementation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1459
    :cond_0
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->k()Landroid/support/v4/view/ax;

    move-result-object v1

    .line 1460
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v2

    .line 1461
    iget v3, p0, Landroid/support/v4/view/ViewPager;->n:I

    add-int/2addr v3, v2

    .line 1462
    iget v4, p0, Landroid/support/v4/view/ViewPager;->n:I

    int-to-float v4, v4

    int-to-float v5, v2

    div-float/2addr v4, v5

    .line 1463
    iget v5, v1, Landroid/support/v4/view/ax;->b:I

    .line 1464
    int-to-float v6, p1

    int-to-float v2, v2

    div-float v2, v6, v2

    iget v6, v1, Landroid/support/v4/view/ax;->e:F

    sub-float/2addr v2, v6

    iget v1, v1, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v1, v4

    div-float v1, v2, v1

    .line 1466
    int-to-float v2, v3

    mul-float/2addr v2, v1

    float-to-int v2, v2

    .line 1468
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->T:Z

    .line 1469
    invoke-virtual {p0, v5, v1, v2}, Landroid/support/v4/view/ViewPager;->a(IFI)V

    .line 1470
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->T:Z

    if-nez v0, :cond_1

    .line 1471
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "onPageScrolled did not call superclass implementation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1474
    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method static synthetic i()[I
    .locals 1

    .prologue
    .line 82
    sget-object v0, Landroid/support/v4/view/ViewPager;->a:[I

    return-object v0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 414
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 415
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 416
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ay;

    .line 417
    iget-boolean v0, v0, Landroid/support/v4/view/ay;->a:Z

    if-nez v0, :cond_0

    .line 418
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->removeViewAt(I)V

    .line 419
    add-int/lit8 v1, v1, -0x1

    .line 414
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 422
    :cond_1
    return-void
.end method

.method private k()Landroid/support/v4/view/ax;
    .locals 13

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 1890
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v1

    .line 1891
    if-lez v1, :cond_3

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    int-to-float v4, v1

    div-float/2addr v0, v4

    move v9, v0

    .line 1892
    :goto_0
    if-lez v1, :cond_4

    iget v0, p0, Landroid/support/v4/view/ViewPager;->n:I

    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    move v1, v0

    .line 1893
    :goto_1
    const/4 v5, -0x1

    .line 1896
    const/4 v4, 0x1

    .line 1898
    const/4 v0, 0x0

    move v6, v2

    move v7, v2

    move v8, v5

    move v2, v3

    move v5, v4

    move-object v4, v0

    .line 1899
    :goto_2
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 1900
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 1902
    if-nez v5, :cond_6

    iget v10, v0, Landroid/support/v4/view/ax;->b:I

    add-int/lit8 v11, v8, 0x1

    if-eq v10, v11, :cond_6

    .line 1904
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->e:Landroid/support/v4/view/ax;

    .line 1905
    add-float/2addr v6, v7

    add-float/2addr v6, v1

    iput v6, v0, Landroid/support/v4/view/ax;->e:F

    .line 1906
    add-int/lit8 v6, v8, 0x1

    iput v6, v0, Landroid/support/v4/view/ax;->b:I

    .line 1907
    iget-object v6, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget v7, v0, Landroid/support/v4/view/ax;->b:I

    invoke-virtual {v6, v7}, Landroid/support/v4/view/x;->a(I)F

    move-result v6

    iput v6, v0, Landroid/support/v4/view/ax;->d:F

    .line 1908
    add-int/lit8 v2, v2, -0x1

    move-object v12, v0

    move v0, v2

    move-object v2, v12

    .line 1910
    :goto_3
    iget v6, v2, Landroid/support/v4/view/ax;->e:F

    .line 1913
    iget v7, v2, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v7, v6

    add-float/2addr v7, v1

    .line 1914
    if-nez v5, :cond_0

    cmpl-float v5, v9, v6

    if-ltz v5, :cond_2

    .line 1915
    :cond_0
    cmpg-float v4, v9, v7

    if-ltz v4, :cond_1

    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v0, v4, :cond_5

    :cond_1
    move-object v4, v2

    .line 1928
    :cond_2
    return-object v4

    :cond_3
    move v9, v2

    .line 1891
    goto :goto_0

    :cond_4
    move v1, v2

    .line 1892
    goto :goto_1

    .line 1922
    :cond_5
    iget v5, v2, Landroid/support/v4/view/ax;->b:I

    .line 1924
    iget v4, v2, Landroid/support/v4/view/ax;->d:F

    .line 1899
    add-int/lit8 v0, v0, 0x1

    move v7, v6

    move v8, v5

    move v5, v3

    move v6, v4

    move-object v4, v2

    move v2, v0

    goto :goto_2

    :cond_6
    move-object v12, v0

    move v0, v2

    move-object v2, v12

    goto :goto_3
.end method

.method private l()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 2180
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->z:Z

    .line 2181
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->A:Z

    .line 2183
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2184
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 2185
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    .line 2187
    :cond_0
    return-void
.end method

.method private setScrollState(I)V
    .locals 1

    .prologue
    .line 357
    iget v0, p0, Landroid/support/v4/view/ViewPager;->ac:I

    if-ne v0, p1, :cond_1

    .line 365
    :cond_0
    :goto_0
    return-void

    .line 361
    :cond_1
    iput p1, p0, Landroid/support/v4/view/ViewPager;->ac:I

    .line 362
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_0

    .line 363
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1}, Landroid/support/v4/view/bb;->b(I)V

    goto :goto_0
.end method

.method private setScrollingCacheEnabled(Z)V
    .locals 1

    .prologue
    .line 2190
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->w:Z

    if-eq v0, p1, :cond_0

    .line 2191
    iput-boolean p1, p0, Landroid/support/v4/view/ViewPager;->w:Z

    .line 2202
    :cond_0
    return-void
.end method


# virtual methods
.method a(F)F
    .locals 4

    .prologue
    .line 650
    const/high16 v0, 0x3f000000    # 0.5f

    sub-float v0, p1, v0

    .line 651
    float-to-double v0, v0

    const-wide v2, 0x3fde28c7460698c7L    # 0.4712389167638204

    mul-double/2addr v0, v2

    double-to-float v0, v0

    .line 652
    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method a(II)Landroid/support/v4/view/ax;
    .locals 2

    .prologue
    .line 714
    new-instance v0, Landroid/support/v4/view/ax;

    invoke-direct {v0}, Landroid/support/v4/view/ax;-><init>()V

    .line 715
    iput p1, v0, Landroid/support/v4/view/ax;->b:I

    .line 716
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v1, p0, p1}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    .line 717
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v1, p1}, Landroid/support/v4/view/x;->a(I)F

    move-result v1

    iput v1, v0, Landroid/support/v4/view/ax;->d:F

    .line 718
    if-ltz p2, :cond_0

    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p2, v1, :cond_1

    .line 719
    :cond_0
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    :goto_0
    return-object v0

    .line 721
    :cond_1
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0
.end method

.method a(Landroid/view/View;)Landroid/support/v4/view/ax;
    .locals 4

    .prologue
    .line 1148
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1149
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 1150
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v3, v0, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    invoke-virtual {v2, p1, v3}, Landroid/support/v4/view/x;->a(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1154
    :goto_1
    return-object v0

    .line 1148
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1154
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method a()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 316
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V

    .line 317
    const/high16 v0, 0x40000

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setDescendantFocusability(I)V

    .line 318
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->setFocusable(Z)V

    .line 319
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 320
    new-instance v1, Landroid/widget/Scroller;

    sget-object v2, Landroid/support/v4/view/ViewPager;->c:Landroid/view/animation/Interpolator;

    invoke-direct {v1, v0, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    .line 321
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    .line 322
    invoke-static {v1}, Landroid/support/v4/view/ao;->a(Landroid/view/ViewConfiguration;)I

    move-result v2

    iput v2, p0, Landroid/support/v4/view/ViewPager;->D:I

    .line 323
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v2

    iput v2, p0, Landroid/support/v4/view/ViewPager;->J:I

    .line 324
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v1

    iput v1, p0, Landroid/support/v4/view/ViewPager;->K:I

    .line 325
    new-instance v1, Landroid/support/v4/d/a;

    invoke-direct {v1, v0}, Landroid/support/v4/d/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    .line 326
    new-instance v1, Landroid/support/v4/d/a;

    invoke-direct {v1, v0}, Landroid/support/v4/d/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    .line 328
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 329
    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v4/view/ViewPager;->L:I

    .line 330
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v4/view/ViewPager;->M:I

    .line 331
    const/high16 v1, 0x41800000    # 16.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->B:I

    .line 333
    new-instance v0, Landroid/support/v4/view/az;

    invoke-direct {v0, p0}, Landroid/support/v4/view/az;-><init>(Landroid/support/v4/view/ViewPager;)V

    invoke-static {p0, v0}, Landroid/support/v4/view/ad;->a(Landroid/view/View;Landroid/support/v4/view/a;)V

    .line 335
    invoke-static {p0}, Landroid/support/v4/view/ad;->c(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    .line 337
    invoke-static {p0, v3}, Landroid/support/v4/view/ad;->b(Landroid/view/View;I)V

    .line 340
    :cond_0
    return-void
.end method

.method a(I)V
    .locals 14

    .prologue
    .line 800
    const/4 v0, 0x0

    .line 801
    iget v1, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-eq v1, p1, :cond_1e

    .line 802
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->b(I)Landroid/support/v4/view/ax;

    move-result-object v0

    .line 803
    iput p1, p0, Landroid/support/v4/view/ViewPager;->h:I

    move-object v1, v0

    .line 806
    :goto_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-nez v0, :cond_1

    .line 950
    :cond_0
    return-void

    .line 814
    :cond_1
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->x:Z

    if-nez v0, :cond_0

    .line 822
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 826
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;)V

    .line 828
    iget v0, p0, Landroid/support/v4/view/ViewPager;->y:I

    .line 829
    const/4 v2, 0x0

    iget v3, p0, Landroid/support/v4/view/ViewPager;->h:I

    sub-int/2addr v3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 830
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v2}, Landroid/support/v4/view/x;->a()I

    move-result v8

    .line 831
    add-int/lit8 v2, v8, -0x1

    iget v3, p0, Landroid/support/v4/view/ViewPager;->h:I

    add-int/2addr v0, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 835
    const/4 v3, 0x0

    .line 836
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1d

    .line 837
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 838
    iget v4, v0, Landroid/support/v4/view/ax;->b:I

    iget v5, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-lt v4, v5, :cond_6

    .line 839
    iget v4, v0, Landroid/support/v4/view/ax;->b:I

    iget v5, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v4, v5, :cond_1d

    .line 844
    :goto_2
    if-nez v0, :cond_1c

    if-lez v8, :cond_1c

    .line 845
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    invoke-virtual {p0, v0, v2}, Landroid/support/v4/view/ViewPager;->a(II)Landroid/support/v4/view/ax;

    move-result-object v0

    move-object v6, v0

    .line 851
    :goto_3
    if-eqz v6, :cond_4

    .line 852
    const/4 v5, 0x0

    .line 853
    add-int/lit8 v4, v2, -0x1

    .line 854
    if-ltz v4, :cond_7

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 855
    :goto_4
    const/high16 v3, 0x40000000    # 2.0f

    iget v10, v6, Landroid/support/v4/view/ax;->d:F

    sub-float v10, v3, v10

    .line 856
    iget v3, p0, Landroid/support/v4/view/ViewPager;->h:I

    add-int/lit8 v3, v3, -0x1

    move v12, v3

    move v3, v5

    move v5, v12

    move v13, v4

    move v4, v2

    move v2, v13

    :goto_5
    if-ltz v5, :cond_2

    .line 857
    cmpl-float v11, v3, v10

    if-ltz v11, :cond_b

    if-ge v5, v7, :cond_b

    .line 858
    if-nez v0, :cond_8

    .line 880
    :cond_2
    iget v3, v6, Landroid/support/v4/view/ax;->d:F

    .line 881
    add-int/lit8 v5, v4, 0x1

    .line 882
    const/high16 v0, 0x40000000    # 2.0f

    cmpg-float v0, v3, v0

    if-gez v0, :cond_3

    .line 883
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_f

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 884
    :goto_6
    iget v2, p0, Landroid/support/v4/view/ViewPager;->h:I

    add-int/lit8 v2, v2, 0x1

    move v12, v2

    move v2, v3

    move v3, v5

    move v5, v12

    :goto_7
    if-ge v5, v8, :cond_3

    .line 885
    const/high16 v7, 0x40000000    # 2.0f

    cmpl-float v7, v2, v7

    if-ltz v7, :cond_12

    if-le v5, v9, :cond_12

    .line 886
    if-nez v0, :cond_10

    .line 907
    :cond_3
    invoke-direct {p0, v6, v4, v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ax;ILandroid/support/v4/view/ax;)V

    .line 917
    :cond_4
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget v2, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-eqz v6, :cond_16

    iget-object v0, v6, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    :goto_8
    invoke-virtual {v1, p0, v2, v0}, Landroid/support/v4/view/x;->b(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 919
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/x;->b(Landroid/view/ViewGroup;)V

    .line 922
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v2

    .line 923
    const/4 v0, 0x0

    move v1, v0

    :goto_9
    if-ge v1, v2, :cond_17

    .line 924
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 925
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ay;

    .line 926
    iget-boolean v4, v0, Landroid/support/v4/view/ay;->a:Z

    if-nez v4, :cond_5

    iget v4, v0, Landroid/support/v4/view/ay;->c:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-nez v4, :cond_5

    .line 928
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v3

    .line 929
    if-eqz v3, :cond_5

    .line 930
    iget v3, v3, Landroid/support/v4/view/ax;->d:F

    iput v3, v0, Landroid/support/v4/view/ay;->c:F

    .line 923
    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_9

    .line 836
    :cond_6
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1

    .line 854
    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_4

    .line 861
    :cond_8
    iget v11, v0, Landroid/support/v4/view/ax;->b:I

    if-ne v5, v11, :cond_9

    iget-boolean v11, v0, Landroid/support/v4/view/ax;->c:Z

    if-nez v11, :cond_9

    .line 862
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 863
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v0, v0, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    invoke-virtual {v11, p0, v5, v0}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 864
    add-int/lit8 v2, v2, -0x1

    .line 865
    add-int/lit8 v4, v4, -0x1

    .line 866
    if-ltz v2, :cond_a

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 856
    :cond_9
    :goto_a
    add-int/lit8 v5, v5, -0x1

    goto/16 :goto_5

    .line 866
    :cond_a
    const/4 v0, 0x0

    goto :goto_a

    .line 868
    :cond_b
    if-eqz v0, :cond_d

    iget v11, v0, Landroid/support/v4/view/ax;->b:I

    if-ne v5, v11, :cond_d

    .line 869
    iget v0, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v3, v0

    .line 870
    add-int/lit8 v2, v2, -0x1

    .line 871
    if-ltz v2, :cond_c

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    goto :goto_a

    :cond_c
    const/4 v0, 0x0

    goto :goto_a

    .line 873
    :cond_d
    add-int/lit8 v0, v2, 0x1

    invoke-virtual {p0, v5, v0}, Landroid/support/v4/view/ViewPager;->a(II)Landroid/support/v4/view/ax;

    move-result-object v0

    .line 874
    iget v0, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v3, v0

    .line 875
    add-int/lit8 v4, v4, 0x1

    .line 876
    if-ltz v2, :cond_e

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    goto :goto_a

    :cond_e
    const/4 v0, 0x0

    goto :goto_a

    .line 883
    :cond_f
    const/4 v0, 0x0

    goto/16 :goto_6

    .line 889
    :cond_10
    iget v7, v0, Landroid/support/v4/view/ax;->b:I

    if-ne v5, v7, :cond_1b

    iget-boolean v7, v0, Landroid/support/v4/view/ax;->c:Z

    if-nez v7, :cond_1b

    .line 890
    iget-object v7, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 891
    iget-object v7, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v0, v0, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    invoke-virtual {v7, p0, v5, v0}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 892
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_11

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    :goto_b
    move v12, v2

    move-object v2, v0

    move v0, v12

    .line 884
    :goto_c
    add-int/lit8 v5, v5, 0x1

    move v12, v0

    move-object v0, v2

    move v2, v12

    goto/16 :goto_7

    .line 892
    :cond_11
    const/4 v0, 0x0

    goto :goto_b

    .line 894
    :cond_12
    if-eqz v0, :cond_14

    iget v7, v0, Landroid/support/v4/view/ax;->b:I

    if-ne v5, v7, :cond_14

    .line 895
    iget v0, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v2, v0

    .line 896
    add-int/lit8 v3, v3, 0x1

    .line 897
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_13

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    :goto_d
    move v12, v2

    move-object v2, v0

    move v0, v12

    goto :goto_c

    :cond_13
    const/4 v0, 0x0

    goto :goto_d

    .line 899
    :cond_14
    invoke-virtual {p0, v5, v3}, Landroid/support/v4/view/ViewPager;->a(II)Landroid/support/v4/view/ax;

    move-result-object v0

    .line 900
    add-int/lit8 v3, v3, 0x1

    .line 901
    iget v0, v0, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v2, v0

    .line 902
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_15

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    :goto_e
    move v12, v2

    move-object v2, v0

    move v0, v12

    goto :goto_c

    :cond_15
    const/4 v0, 0x0

    goto :goto_e

    .line 917
    :cond_16
    const/4 v0, 0x0

    goto/16 :goto_8

    .line 935
    :cond_17
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 936
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;

    move-result-object v0

    .line 937
    if-eqz v0, :cond_1a

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->b(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v0

    .line 938
    :goto_f
    if-eqz v0, :cond_18

    iget v0, v0, Landroid/support/v4/view/ax;->b:I

    iget v1, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-eq v0, v1, :cond_0

    .line 939
    :cond_18
    const/4 v0, 0x0

    :goto_10
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 940
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 941
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v2

    .line 942
    if-eqz v2, :cond_19

    iget v2, v2, Landroid/support/v4/view/ax;->b:I

    iget v3, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v2, v3, :cond_19

    .line 943
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/view/View;->requestFocus(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 939
    :cond_19
    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    .line 937
    :cond_1a
    const/4 v0, 0x0

    goto :goto_f

    :cond_1b
    move v12, v2

    move-object v2, v0

    move v0, v12

    goto/16 :goto_c

    :cond_1c
    move-object v6, v0

    goto/16 :goto_3

    :cond_1d
    move-object v0, v3

    goto/16 :goto_2

    :cond_1e
    move-object v1, v0

    goto/16 :goto_0
.end method

.method protected a(IFI)V
    .locals 10

    .prologue
    .line 1491
    iget v0, p0, Landroid/support/v4/view/ViewPager;->U:I

    if-lez v0, :cond_2

    .line 1492
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v4

    .line 1493
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I

    move-result v1

    .line 1494
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I

    move-result v2

    .line 1495
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v5

    .line 1496
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v6

    .line 1497
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v6, :cond_2

    .line 1498
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 1499
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ay;

    .line 1500
    iget-boolean v8, v0, Landroid/support/v4/view/ay;->a:Z

    if-nez v8, :cond_1

    move v9, v2

    move v2, v1

    move v1, v9

    .line 1497
    :cond_0
    :goto_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    move v9, v1

    move v1, v2

    move v2, v9

    goto :goto_0

    .line 1502
    :cond_1
    iget v0, v0, Landroid/support/v4/view/ay;->b:I

    and-int/lit8 v0, v0, 0x7

    .line 1504
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move v0, v1

    move v9, v2

    move v2, v1

    move v1, v9

    .line 1521
    :goto_2
    add-int/2addr v0, v4

    .line 1523
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    sub-int/2addr v0, v8

    .line 1524
    if-eqz v0, :cond_0

    .line 1525
    invoke-virtual {v7, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_1

    .line 1510
    :pswitch_1
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v0

    add-int/2addr v0, v1

    move v9, v1

    move v1, v2

    move v2, v0

    move v0, v9

    .line 1511
    goto :goto_2

    .line 1513
    :pswitch_2
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int v0, v5, v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v9, v2

    move v2, v1

    move v1, v9

    .line 1515
    goto :goto_2

    .line 1517
    :pswitch_3
    sub-int v0, v5, v2

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    sub-int/2addr v0, v8

    .line 1518
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v2, v8

    move v9, v2

    move v2, v1

    move v1, v9

    goto :goto_2

    .line 1530
    :cond_2
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_3

    .line 1531
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/bb;->a(IFI)V

    .line 1533
    :cond_3
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->Z:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_4

    .line 1534
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->Z:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/bb;->a(IFI)V

    .line 1536
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->T:Z

    .line 1537
    return-void

    .line 1504
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method a(III)V
    .locals 9

    .prologue
    const/4 v5, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    .line 673
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 675
    invoke-direct {p0, v5}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 711
    :goto_0
    return-void

    .line 678
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v1

    .line 679
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v2

    .line 680
    sub-int v3, p1, v1

    .line 681
    sub-int v4, p2, v2

    .line 682
    if-nez v3, :cond_1

    if-nez v4, :cond_1

    .line 683
    invoke-direct {p0, v5}, Landroid/support/v4/view/ViewPager;->a(Z)V

    .line 684
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->c()V

    .line 685
    invoke-direct {p0, v5}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    goto :goto_0

    .line 689
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 690
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 692
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v0

    .line 693
    div-int/lit8 v5, v0, 0x2

    .line 694
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v8

    int-to-float v7, v0

    div-float/2addr v6, v7

    invoke-static {v8, v6}, Ljava/lang/Math;->min(FF)F

    move-result v6

    .line 695
    int-to-float v7, v5

    int-to-float v5, v5

    invoke-virtual {p0, v6}, Landroid/support/v4/view/ViewPager;->a(F)F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v5, v7

    .line 699
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 700
    if-lez v6, :cond_2

    .line 701
    const/high16 v0, 0x447a0000    # 1000.0f

    int-to-float v6, v6

    div-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    mul-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    .line 707
    :goto_1
    const/16 v5, 0x258

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 709
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 710
    invoke-static {p0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;)V

    goto :goto_0

    .line 703
    :cond_2
    int-to-float v0, v0

    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget v6, p0, Landroid/support/v4/view/ViewPager;->h:I

    invoke-virtual {v5, v6}, Landroid/support/v4/view/x;->a(I)F

    move-result v5

    mul-float/2addr v0, v5

    .line 704
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Landroid/support/v4/view/ViewPager;->n:I

    int-to-float v6, v6

    add-float/2addr v0, v6

    div-float v0, v5, v0

    .line 705
    add-float/2addr v0, v8

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float/2addr v0, v5

    float-to-int v0, v0

    goto :goto_1
.end method

.method public a(IZ)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 456
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->x:Z

    .line 457
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->a(IZZ)V

    .line 458
    return-void
.end method

.method a(IZZ)V
    .locals 1

    .prologue
    .line 465
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v4/view/ViewPager;->a(IZZI)V

    .line 466
    return-void
.end method

.method a(IZZI)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 469
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0}, Landroid/support/v4/view/x;->a()I

    move-result v0

    if-gtz v0, :cond_2

    .line 470
    :cond_0
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 519
    :cond_1
    :goto_0
    return-void

    .line 473
    :cond_2
    if-nez p3, :cond_3

    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v0, p1, :cond_3

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_3

    .line 474
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    goto :goto_0

    .line 478
    :cond_3
    if-gez p1, :cond_6

    move p1, v1

    .line 483
    :cond_4
    :goto_1
    iget v0, p0, Landroid/support/v4/view/ViewPager;->y:I

    .line 484
    iget v2, p0, Landroid/support/v4/view/ViewPager;->h:I

    add-int/2addr v2, v0

    if-gt p1, v2, :cond_5

    iget v2, p0, Landroid/support/v4/view/ViewPager;->h:I

    sub-int v0, v2, v0

    if-ge p1, v0, :cond_7

    :cond_5
    move v2, v1

    .line 488
    :goto_2
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    .line 489
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    iput-boolean v3, v0, Landroid/support/v4/view/ax;->c:Z

    .line 488
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 480
    :cond_6
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0}, Landroid/support/v4/view/x;->a()I

    move-result v0

    if-lt p1, v0, :cond_4

    .line 481
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0}, Landroid/support/v4/view/x;->a()I

    move-result v0

    add-int/lit8 p1, v0, -0x1

    goto :goto_1

    .line 492
    :cond_7
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-eq v0, p1, :cond_9

    move v0, v3

    .line 493
    :goto_3
    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->a(I)V

    .line 494
    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->b(I)Landroid/support/v4/view/ax;

    move-result-object v2

    .line 496
    if-eqz v2, :cond_d

    .line 497
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v3

    .line 498
    int-to-float v3, v3

    iget v4, p0, Landroid/support/v4/view/ViewPager;->r:F

    iget v2, v2, Landroid/support/v4/view/ax;->e:F

    iget v5, p0, Landroid/support/v4/view/ViewPager;->s:F

    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 501
    :goto_4
    if-eqz p2, :cond_a

    .line 502
    invoke-virtual {p0, v2, v1, p4}, Landroid/support/v4/view/ViewPager;->a(III)V

    .line 503
    if-eqz v0, :cond_8

    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    if-eqz v1, :cond_8

    .line 504
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    invoke-interface {v1, p1}, Landroid/support/v4/view/bb;->a(I)V

    .line 506
    :cond_8
    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->Z:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_1

    .line 507
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->Z:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1}, Landroid/support/v4/view/bb;->a(I)V

    goto/16 :goto_0

    :cond_9
    move v0, v1

    .line 492
    goto :goto_3

    .line 510
    :cond_a
    if-eqz v0, :cond_b

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    if-eqz v3, :cond_b

    .line 511
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    invoke-interface {v3, p1}, Landroid/support/v4/view/bb;->a(I)V

    .line 513
    :cond_b
    if-eqz v0, :cond_c

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->Z:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_c

    .line 514
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->Z:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1}, Landroid/support/v4/view/bb;->a(I)V

    .line 516
    :cond_c
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->a(Z)V

    .line 517
    invoke-virtual {p0, v2, v1}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    goto/16 :goto_0

    :cond_d
    move v2, v1

    goto :goto_4
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 2253
    const/4 v0, 0x0

    .line 2254
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    .line 2255
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 2275
    :cond_0
    :goto_0
    return v0

    .line 2257
    :sswitch_0
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->c(I)Z

    move-result v0

    goto :goto_0

    .line 2260
    :sswitch_1
    const/16 v0, 0x42

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->c(I)Z

    move-result v0

    goto :goto_0

    .line 2263
    :sswitch_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    .line 2266
    invoke-static {p1}, Landroid/support/v4/view/n;->a(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2267
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->c(I)Z

    move-result v0

    goto :goto_0

    .line 2268
    :cond_1
    invoke-static {p1, v3}, Landroid/support/v4/view/n;->a(Landroid/view/KeyEvent;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2269
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->c(I)Z

    move-result v0

    goto :goto_0

    .line 2255
    nop

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_0
        0x16 -> :sswitch_1
        0x3d -> :sswitch_2
    .end sparse-switch
.end method

.method protected a(Landroid/view/View;ZIII)Z
    .locals 10

    .prologue
    const/4 v2, 0x1

    .line 2216
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v6, p1

    .line 2217
    check-cast v6, Landroid/view/ViewGroup;

    .line 2218
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v8

    .line 2219
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v9

    .line 2220
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 2222
    add-int/lit8 v0, v0, -0x1

    move v7, v0

    :goto_0
    if-ltz v7, :cond_2

    .line 2225
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2226
    add-int v0, p4, v8

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    if-lt v0, v3, :cond_1

    add-int v0, p4, v8

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v3

    if-ge v0, v3, :cond_1

    add-int v0, p5, v9

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    if-lt v0, v3, :cond_1

    add-int v0, p5, v9

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v3

    if-ge v0, v3, :cond_1

    add-int v0, p4, v8

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    sub-int v4, v0, v3

    add-int v0, p5, v9

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int v5, v0, v3

    move-object v0, p0

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;ZIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2235
    :cond_0
    :goto_1
    return v2

    .line 2222
    :cond_1
    add-int/lit8 v0, v7, -0x1

    move v7, v0

    goto :goto_0

    .line 2235
    :cond_2
    if-eqz p2, :cond_3

    neg-int v0, p3

    invoke-static {p1, v0}, Landroid/support/v4/view/ad;->a(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_3
    const/4 v2, 0x0

    goto :goto_1
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;II)V"
        }
    .end annotation

    .prologue
    .line 2368
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 2370
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDescendantFocusability()I

    move-result v2

    .line 2372
    const/high16 v0, 0x60000

    if-eq v2, v0, :cond_1

    .line 2373
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 2374
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2375
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    .line 2376
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v4

    .line 2377
    if-eqz v4, :cond_0

    iget v4, v4, Landroid/support/v4/view/ax;->b:I

    iget v5, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v4, v5, :cond_0

    .line 2378
    invoke-virtual {v3, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 2373
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2388
    :cond_1
    const/high16 v0, 0x40000

    if-ne v2, v0, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v1, v0, :cond_3

    .line 2394
    :cond_2
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusable()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2405
    :cond_3
    :goto_1
    return-void

    .line 2397
    :cond_4
    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusableInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2401
    :cond_5
    if-eqz p1, :cond_3

    .line 2402
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public addTouchables(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2415
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2416
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2417
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    .line 2418
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v2

    .line 2419
    if-eqz v2, :cond_0

    iget v2, v2, Landroid/support/v4/view/ax;->b:I

    iget v3, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v2, v3, :cond_0

    .line 2420
    invoke-virtual {v1, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V

    .line 2415
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2424
    :cond_1
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 4

    .prologue
    .line 1123
    invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1124
    invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    :goto_0
    move-object v0, v1

    .line 1126
    check-cast v0, Landroid/support/v4/view/ay;

    .line 1127
    iget-boolean v2, v0, Landroid/support/v4/view/ay;->a:Z

    instance-of v3, p1, Landroid/support/v4/view/aw;

    or-int/2addr v2, v3

    iput-boolean v2, v0, Landroid/support/v4/view/ay;->a:Z

    .line 1128
    iget-boolean v2, p0, Landroid/support/v4/view/ViewPager;->v:Z

    if-eqz v2, :cond_1

    .line 1129
    if-eqz v0, :cond_0

    iget-boolean v2, v0, Landroid/support/v4/view/ay;->a:Z

    if-eqz v2, :cond_0

    .line 1130
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot add pager decor view during layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1132
    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/support/v4/view/ay;->d:Z

    .line 1133
    invoke-virtual {p0, p1, p2, v1}, Landroid/support/v4/view/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 1145
    :goto_1
    return-void

    .line 1135
    :cond_1
    invoke-super {p0, p1, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_2
    move-object v1, p3

    goto :goto_0
.end method

.method b(I)Landroid/support/v4/view/ax;
    .locals 3

    .prologue
    .line 1169
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1170
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 1171
    iget v2, v0, Landroid/support/v4/view/ax;->b:I

    if-ne v2, p1, :cond_0

    .line 1175
    :goto_1
    return-object v0

    .line 1169
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1175
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method b(Landroid/view/View;)Landroid/support/v4/view/ax;
    .locals 2

    .prologue
    .line 1159
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_2

    .line 1160
    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_1

    .line 1161
    :cond_0
    const/4 v0, 0x0

    .line 1165
    :goto_1
    return-object v0

    .line 1163
    :cond_1
    check-cast v0, Landroid/view/View;

    move-object p1, v0

    goto :goto_0

    .line 1165
    :cond_2
    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v0

    goto :goto_1
.end method

.method b()V
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 729
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v3, p0, Landroid/support/v4/view/ViewPager;->y:I

    mul-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x1

    if-ge v0, v3, :cond_0

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v3}, Landroid/support/v4/view/x;->a()I

    move-result v3

    if-ge v0, v3, :cond_0

    move v0, v1

    .line 731
    :goto_0
    iget v3, p0, Landroid/support/v4/view/ViewPager;->h:I

    move v4, v2

    move v5, v3

    move v6, v0

    move v3, v2

    .line 734
    :goto_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 735
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 736
    iget-object v7, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v8, v0, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    invoke-virtual {v7, v8}, Landroid/support/v4/view/x;->a(Ljava/lang/Object;)I

    move-result v7

    .line 738
    const/4 v8, -0x1

    if-ne v7, v8, :cond_1

    move v0, v3

    move v3, v4

    move v4, v5

    move v5, v6

    .line 734
    :goto_2
    add-int/lit8 v0, v0, 0x1

    move v6, v5

    move v5, v4

    move v4, v3

    move v3, v0

    goto :goto_1

    :cond_0
    move v0, v2

    .line 729
    goto :goto_0

    .line 742
    :cond_1
    const/4 v8, -0x2

    if-ne v7, v8, :cond_3

    .line 743
    iget-object v6, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 744
    add-int/lit8 v3, v3, -0x1

    .line 746
    if-nez v4, :cond_2

    .line 747
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v4, p0}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;)V

    move v4, v1

    .line 751
    :cond_2
    iget-object v6, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget v7, v0, Landroid/support/v4/view/ax;->b:I

    iget-object v8, v0, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    invoke-virtual {v6, p0, v7, v8}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 754
    iget v6, p0, Landroid/support/v4/view/ViewPager;->h:I

    iget v0, v0, Landroid/support/v4/view/ax;->b:I

    if-ne v6, v0, :cond_b

    .line 756
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v5}, Landroid/support/v4/view/x;->a()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v0, v3

    move v3, v4

    move v4, v5

    move v5, v1

    .line 757
    goto :goto_2

    .line 762
    :cond_3
    iget v8, v0, Landroid/support/v4/view/ax;->b:I

    if-eq v8, v7, :cond_a

    .line 763
    iget v6, v0, Landroid/support/v4/view/ax;->b:I

    iget v8, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v6, v8, :cond_4

    move v5, v7

    .line 768
    :cond_4
    iput v7, v0, Landroid/support/v4/view/ax;->b:I

    move v0, v3

    move v3, v4

    move v4, v5

    move v5, v1

    .line 769
    goto :goto_2

    .line 773
    :cond_5
    if-eqz v4, :cond_6

    .line 774
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/x;->b(Landroid/view/ViewGroup;)V

    .line 777
    :cond_6
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    sget-object v3, Landroid/support/v4/view/ViewPager;->b:Ljava/util/Comparator;

    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 779
    if-eqz v6, :cond_9

    .line 781
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v4

    move v3, v2

    .line 782
    :goto_3
    if-ge v3, v4, :cond_8

    .line 783
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 784
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ay;

    .line 785
    iget-boolean v6, v0, Landroid/support/v4/view/ay;->a:Z

    if-nez v6, :cond_7

    .line 786
    const/4 v6, 0x0

    iput v6, v0, Landroid/support/v4/view/ay;->c:F

    .line 782
    :cond_7
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_3

    .line 790
    :cond_8
    invoke-virtual {p0, v5, v2, v1}, Landroid/support/v4/view/ViewPager;->a(IZZ)V

    .line 791
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V

    .line 793
    :cond_9
    return-void

    :cond_a
    move v0, v3

    move v3, v4

    move v4, v5

    move v5, v6

    goto/16 :goto_2

    :cond_b
    move v0, v3

    move v3, v4

    move v4, v5

    move v5, v1

    goto/16 :goto_2
.end method

.method public b(F)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 2111
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->N:Z

    if-nez v0, :cond_0

    .line 2112
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No fake drag in progress. Call beginFakeDrag first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2115
    :cond_0
    iget v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    add-float/2addr v0, p1

    iput v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 2117
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    .line 2118
    sub-float v3, v0, p1

    .line 2119
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v5

    .line 2121
    int-to-float v0, v5

    iget v1, p0, Landroid/support/v4/view/ViewPager;->r:F

    mul-float v2, v0, v1

    .line 2122
    int-to-float v0, v5

    iget v1, p0, Landroid/support/v4/view/ViewPager;->s:F

    mul-float v4, v0, v1

    .line 2124
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 2125
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    iget-object v6, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ax;

    .line 2126
    iget v6, v0, Landroid/support/v4/view/ax;->b:I

    if-eqz v6, :cond_4

    .line 2127
    iget v0, v0, Landroid/support/v4/view/ax;->e:F

    int-to-float v2, v5

    mul-float/2addr v0, v2

    .line 2129
    :goto_0
    iget v2, v1, Landroid/support/v4/view/ax;->b:I

    iget-object v6, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v6}, Landroid/support/v4/view/x;->a()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-eq v2, v6, :cond_3

    .line 2130
    iget v1, v1, Landroid/support/v4/view/ax;->e:F

    int-to-float v2, v5

    mul-float/2addr v1, v2

    .line 2133
    :goto_1
    cmpg-float v2, v3, v0

    if-gez v2, :cond_1

    .line 2139
    :goto_2
    iget v1, p0, Landroid/support/v4/view/ViewPager;->F:F

    float-to-int v2, v0

    int-to-float v2, v2

    sub-float v2, v0, v2

    add-float/2addr v1, v2

    iput v1, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 2140
    float-to-int v1, v0

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 2141
    float-to-int v0, v0

    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->d(I)Z

    .line 2144
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 2145
    iget-wide v0, p0, Landroid/support/v4/view/ViewPager;->O:J

    const/4 v4, 0x2

    iget v5, p0, Landroid/support/v4/view/ViewPager;->F:F

    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 2147
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v1, v0}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2148
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 2149
    return-void

    .line 2135
    :cond_1
    cmpl-float v0, v3, v1

    if-lez v0, :cond_2

    move v0, v1

    .line 2136
    goto :goto_2

    :cond_2
    move v0, v3

    goto :goto_2

    :cond_3
    move v1, v4

    goto :goto_1

    :cond_4
    move v0, v2

    goto :goto_0
.end method

.method c()V
    .locals 1

    .prologue
    .line 796
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->a(I)V

    .line 797
    return-void
.end method

.method public c(I)Z
    .locals 5

    .prologue
    const/16 v4, 0x42

    const/16 v3, 0x11

    .line 2279
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;

    move-result-object v0

    .line 2280
    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    .line 2282
    :cond_0
    const/4 v1, 0x0

    .line 2284
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v2

    invoke-virtual {v2, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    .line 2286
    if-eqz v2, :cond_5

    if-eq v2, v0, :cond_5

    .line 2287
    if-ne p1, v3, :cond_3

    .line 2290
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->f:Landroid/graphics/Rect;

    invoke-direct {p0, v1, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 2291
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->f:Landroid/graphics/Rect;

    invoke-direct {p0, v3, v0}, Landroid/support/v4/view/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 2292
    if-eqz v0, :cond_2

    if-lt v1, v3, :cond_2

    .line 2293
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->g()Z

    move-result v0

    .line 2315
    :goto_0
    if-eqz v0, :cond_1

    .line 2316
    invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->playSoundEffect(I)V

    .line 2318
    :cond_1
    return v0

    .line 2295
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    move-result v0

    goto :goto_0

    .line 2297
    :cond_3
    if-ne p1, v4, :cond_9

    .line 2300
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->f:Landroid/graphics/Rect;

    invoke-direct {p0, v1, v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 2301
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->f:Landroid/graphics/Rect;

    invoke-direct {p0, v3, v0}, Landroid/support/v4/view/ViewPager;->a(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 2302
    if-eqz v0, :cond_4

    if-gt v1, v3, :cond_4

    .line 2303
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->h()Z

    move-result v0

    goto :goto_0

    .line 2305
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    move-result v0

    goto :goto_0

    .line 2308
    :cond_5
    if-eq p1, v3, :cond_6

    const/4 v0, 0x1

    if-ne p1, v0, :cond_7

    .line 2310
    :cond_6
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->g()Z

    move-result v0

    goto :goto_0

    .line 2311
    :cond_7
    if-eq p1, v4, :cond_8

    const/4 v0, 0x2

    if-ne p1, v0, :cond_9

    .line 2313
    :cond_8
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->h()Z

    move-result v0

    goto :goto_0

    :cond_9
    move v0, v1

    goto :goto_0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 2493
    instance-of v0, p1, Landroid/support/v4/view/ay;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeScroll()V
    .locals 4

    .prologue
    .line 1426
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1427
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v0

    .line 1428
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v1

    .line 1429
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrX()I

    move-result v2

    .line 1430
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrY()I

    move-result v3

    .line 1432
    if-ne v0, v2, :cond_0

    if-eq v1, v3, :cond_1

    .line 1433
    :cond_0
    invoke-virtual {p0, v2, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1434
    invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1435
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1436
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1441
    :cond_1
    invoke-static {p0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;)V

    .line 1447
    :goto_0
    return-void

    .line 1446
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->a(Z)V

    goto :goto_0
.end method

.method public d()Z
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 2054
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->z:Z

    if-eqz v0, :cond_0

    .line 2070
    :goto_0
    return v4

    .line 2057
    :cond_0
    iput-boolean v8, p0, Landroid/support/v4/view/ViewPager;->N:Z

    .line 2058
    invoke-direct {p0, v8}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 2059
    iput v5, p0, Landroid/support/v4/view/ViewPager;->F:F

    iput v5, p0, Landroid/support/v4/view/ViewPager;->E:F

    .line 2060
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    if-nez v0, :cond_1

    .line 2061
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    .line 2065
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    move-wide v2, v0

    move v6, v5

    move v7, v4

    .line 2066
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    .line 2067
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v3, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2068
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 2069
    iput-wide v0, p0, Landroid/support/v4/view/ViewPager;->O:J

    move v4, v8

    .line 2070
    goto :goto_0

    .line 2063
    :cond_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 2241
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/KeyEvent;)Z

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

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 2466
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v2

    move v1, v0

    .line 2467
    :goto_0
    if-ge v1, v2, :cond_0

    .line 2468
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2469
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_1

    .line 2470
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v4

    .line 2471
    if-eqz v4, :cond_1

    iget v4, v4, Landroid/support/v4/view/ax;->b:I

    iget v5, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v4, v5, :cond_1

    invoke-virtual {v3, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2473
    const/4 v0, 0x1

    .line 2478
    :cond_0
    return v0

    .line 2467
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    .line 1952
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 1953
    const/4 v0, 0x0

    .line 1955
    invoke-static {p0}, Landroid/support/v4/view/ad;->a(Landroid/view/View;)I

    move-result v1

    .line 1956
    if-eqz v1, :cond_0

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v1, :cond_4

    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v1}, Landroid/support/v4/view/x;->a()I

    move-result v1

    if-le v1, v2, :cond_4

    .line 1959
    :cond_0
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    invoke-virtual {v1}, Landroid/support/v4/d/a;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1960
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 1961
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    .line 1962
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v3

    .line 1964
    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 1965
    neg-int v4, v2

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget v5, p0, Landroid/support/v4/view/ViewPager;->r:F

    int-to-float v6, v3

    mul-float/2addr v5, v6

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1966
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    invoke-virtual {v4, v2, v3}, Landroid/support/v4/d/a;->a(II)V

    .line 1967
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    invoke-virtual {v2, p1}, Landroid/support/v4/d/a;->a(Landroid/graphics/Canvas;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 1968
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1970
    :cond_1
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    invoke-virtual {v1}, Landroid/support/v4/d/a;->a()Z

    move-result v1

    if-nez v1, :cond_2

    .line 1971
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 1972
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v2

    .line 1973
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 1975
    const/high16 v4, 0x42b40000    # 90.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 1976
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    iget v5, p0, Landroid/support/v4/view/ViewPager;->s:F

    const/high16 v6, 0x3f800000    # 1.0f

    add-float/2addr v5, v6

    neg-float v5, v5

    int-to-float v6, v2

    mul-float/2addr v5, v6

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1977
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    invoke-virtual {v4, v3, v2}, Landroid/support/v4/d/a;->a(II)V

    .line 1978
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    invoke-virtual {v2, p1}, Landroid/support/v4/d/a;->a(Landroid/graphics/Canvas;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 1979
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1986
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 1988
    invoke-static {p0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;)V

    .line 1990
    :cond_3
    return-void

    .line 1982
    :cond_4
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    invoke-virtual {v1}, Landroid/support/v4/d/a;->b()V

    .line 1983
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    invoke-virtual {v1}, Landroid/support/v4/d/a;->b()V

    goto :goto_0
.end method

.method protected drawableStateChanged()V
    .locals 2

    .prologue
    .line 638
    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    .line 639
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->o:Landroid/graphics/drawable/Drawable;

    .line 640
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 641
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 643
    :cond_0
    return-void
.end method

.method public e()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 2080
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->N:Z

    if-nez v0, :cond_0

    .line 2081
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No fake drag in progress. Call beginFakeDrag first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2084
    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    .line 2085
    const/16 v1, 0x3e8

    iget v2, p0, Landroid/support/v4/view/ViewPager;->K:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 2086
    iget v1, p0, Landroid/support/v4/view/ViewPager;->H:I

    invoke-static {v0, v1}, Landroid/support/v4/view/y;->a(Landroid/view/VelocityTracker;I)F

    move-result v0

    float-to-int v0, v0

    .line 2088
    iput-boolean v5, p0, Landroid/support/v4/view/ViewPager;->x:Z

    .line 2089
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v1

    .line 2090
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v2

    .line 2091
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->k()Landroid/support/v4/view/ax;

    move-result-object v3

    .line 2092
    iget v4, v3, Landroid/support/v4/view/ax;->b:I

    .line 2093
    int-to-float v2, v2

    int-to-float v1, v1

    div-float v1, v2, v1

    iget v2, v3, Landroid/support/v4/view/ax;->e:F

    sub-float/2addr v1, v2

    iget v2, v3, Landroid/support/v4/view/ax;->d:F

    div-float/2addr v1, v2

    .line 2094
    iget v2, p0, Landroid/support/v4/view/ViewPager;->F:F

    iget v3, p0, Landroid/support/v4/view/ViewPager;->E:F

    sub-float/2addr v2, v3

    float-to-int v2, v2

    .line 2095
    invoke-direct {p0, v4, v1, v0, v2}, Landroid/support/v4/view/ViewPager;->a(IFII)I

    move-result v1

    .line 2097
    invoke-virtual {p0, v1, v5, v5, v0}, Landroid/support/v4/view/ViewPager;->a(IZZI)V

    .line 2098
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->l()V

    .line 2100
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->N:Z

    .line 2101
    return-void
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 2161
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->N:Z

    return v0
.end method

.method g()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2348
    iget v1, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-lez v1, :cond_0

    .line 2349
    iget v1, p0, Landroid/support/v4/view/ViewPager;->h:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 2352
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 2483
    new-instance v0, Landroid/support/v4/view/ay;

    invoke-direct {v0}, Landroid/support/v4/view/ay;-><init>()V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 2498
    new-instance v0, Landroid/support/v4/view/ay;

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/support/v4/view/ay;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 2488
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public getAdapter()Landroid/support/v4/view/x;
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    return-object v0
.end method

.method public getCurrentItem()I
    .locals 1

    .prologue
    .line 461
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    return v0
.end method

.method public getOffscreenPageLimit()I
    .locals 1

    .prologue
    .line 551
    iget v0, p0, Landroid/support/v4/view/ViewPager;->y:I

    return v0
.end method

.method public getPageMargin()I
    .locals 1

    .prologue
    .line 607
    iget v0, p0, Landroid/support/v4/view/ViewPager;->n:I

    return v0
.end method

.method h()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 2356
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v1, :cond_0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->h:I

    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v2}, Landroid/support/v4/view/x;->a()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    .line 2357
    iget v1, p0, Landroid/support/v4/view/ViewPager;->h:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 2360
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 1180
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 1181
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->R:Z

    .line 1182
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->ab:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 353
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 354
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    .prologue
    .line 1994
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 1997
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v4/view/ViewPager;->n:I

    if-lez v1, :cond_2

    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v1, :cond_2

    .line 1998
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v6

    .line 1999
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v7

    .line 2001
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v4/view/ViewPager;->n:I

    int-to-float v1, v1

    int-to-float v2, v7

    div-float v8, v1, v2

    .line 2002
    const/4 v5, 0x0

    .line 2003
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ax;

    .line 2004
    iget v4, v1, Landroid/support/v4/view/ax;->e:F

    .line 2005
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 2006
    iget v3, v1, Landroid/support/v4/view/ax;->b:I

    .line 2007
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    add-int/lit8 v10, v9, -0x1

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/view/ax;

    iget v10, v2, Landroid/support/v4/view/ax;->b:I

    move v2, v5

    move v5, v3

    .line 2008
    :goto_0
    if-ge v5, v10, :cond_2

    .line 2009
    :goto_1
    iget v3, v1, Landroid/support/v4/view/ax;->b:I

    if-le v5, v3, :cond_0

    if-ge v2, v9, :cond_0

    .line 2010
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ax;

    goto :goto_1

    .line 2014
    :cond_0
    iget v3, v1, Landroid/support/v4/view/ax;->b:I

    if-ne v5, v3, :cond_3

    .line 2015
    iget v3, v1, Landroid/support/v4/view/ax;->e:F

    iget v4, v1, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v3, v4

    int-to-float v4, v7

    mul-float/2addr v3, v4

    .line 2016
    iget v4, v1, Landroid/support/v4/view/ax;->e:F

    iget v11, v1, Landroid/support/v4/view/ax;->d:F

    add-float/2addr v4, v11

    add-float/2addr v4, v8

    .line 2023
    :goto_2
    move-object/from16 v0, p0

    iget v11, v0, Landroid/support/v4/view/ViewPager;->n:I

    int-to-float v11, v11

    add-float/2addr v11, v3

    int-to-float v12, v6

    cmpl-float v11, v11, v12

    if-lez v11, :cond_1

    .line 2024
    move-object/from16 v0, p0

    iget-object v11, v0, Landroid/support/v4/view/ViewPager;->o:Landroid/graphics/drawable/Drawable;

    float-to-int v12, v3

    move-object/from16 v0, p0

    iget v13, v0, Landroid/support/v4/view/ViewPager;->p:I

    move-object/from16 v0, p0

    iget v14, v0, Landroid/support/v4/view/ViewPager;->n:I

    int-to-float v14, v14

    add-float/2addr v14, v3

    const/high16 v15, 0x3f000000    # 0.5f

    add-float/2addr v14, v15

    float-to-int v14, v14

    move-object/from16 v0, p0

    iget v15, v0, Landroid/support/v4/view/ViewPager;->q:I

    invoke-virtual {v11, v12, v13, v14, v15}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2026
    move-object/from16 v0, p0

    iget-object v11, v0, Landroid/support/v4/view/ViewPager;->o:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 2029
    :cond_1
    add-int v11, v6, v7

    int-to-float v11, v11

    cmpl-float v3, v3, v11

    if-lez v3, :cond_4

    .line 2034
    :cond_2
    return-void

    .line 2018
    :cond_3
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v3, v5}, Landroid/support/v4/view/x;->a(I)F

    move-result v11

    .line 2019
    add-float v3, v4, v11

    int-to-float v12, v7

    mul-float/2addr v3, v12

    .line 2020
    add-float/2addr v11, v8

    add-float/2addr v4, v11

    goto :goto_2

    .line 2008
    :cond_4
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    goto :goto_0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .prologue
    const/4 v3, -0x1

    const/4 v12, 0x0

    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 1582
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 1585
    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    if-ne v0, v6, :cond_2

    .line 1588
    :cond_0
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->z:Z

    .line 1589
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->A:Z

    .line 1590
    iput v3, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 1591
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_1

    .line 1592
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 1593
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    .line 1714
    :cond_1
    :goto_0
    return v2

    .line 1600
    :cond_2
    if-eqz v0, :cond_4

    .line 1601
    iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->z:Z

    if-eqz v1, :cond_3

    move v2, v6

    .line 1603
    goto :goto_0

    .line 1605
    :cond_3
    iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->A:Z

    if-nez v1, :cond_1

    .line 1611
    :cond_4
    sparse-switch v0, :sswitch_data_0

    .line 1705
    :cond_5
    :goto_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    if-nez v0, :cond_6

    .line 1706
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    .line 1708
    :cond_6
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1714
    iget-boolean v2, p0, Landroid/support/v4/view/ViewPager;->z:Z

    goto :goto_0

    .line 1622
    :sswitch_0
    iget v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 1623
    if-eq v0, v3, :cond_5

    .line 1628
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 1629
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v7

    .line 1630
    iget v1, p0, Landroid/support/v4/view/ViewPager;->F:F

    sub-float v8, v7, v1

    .line 1631
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 1632
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F

    move-result v10

    .line 1633
    iget v0, p0, Landroid/support/v4/view/ViewPager;->G:F

    sub-float v0, v10, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v11

    .line 1636
    cmpl-float v0, v8, v12

    if-eqz v0, :cond_7

    iget v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    invoke-direct {p0, v0, v8}, Landroid/support/v4/view/ViewPager;->a(FF)Z

    move-result v0

    if-nez v0, :cond_7

    float-to-int v3, v8

    float-to-int v4, v7

    float-to-int v5, v10

    move-object v0, p0

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;ZIII)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1639
    iput v7, p0, Landroid/support/v4/view/ViewPager;->F:F

    iput v7, p0, Landroid/support/v4/view/ViewPager;->E:F

    .line 1640
    iput v10, p0, Landroid/support/v4/view/ViewPager;->G:F

    .line 1641
    iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->A:Z

    goto :goto_0

    .line 1644
    :cond_7
    iget v0, p0, Landroid/support/v4/view/ViewPager;->D:I

    int-to-float v0, v0

    cmpl-float v0, v9, v0

    if-lez v0, :cond_a

    cmpl-float v0, v9, v11

    if-lez v0, :cond_a

    .line 1646
    iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->z:Z

    .line 1647
    invoke-direct {p0, v6}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 1648
    cmpl-float v0, v8, v12

    if-lez v0, :cond_9

    iget v0, p0, Landroid/support/v4/view/ViewPager;->E:F

    iget v1, p0, Landroid/support/v4/view/ViewPager;->D:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    :goto_2
    iput v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 1650
    invoke-direct {p0, v6}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 1661
    :cond_8
    :goto_3
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->z:Z

    if-eqz v0, :cond_5

    .line 1663
    invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->c(F)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1664
    invoke-static {p0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;)V

    goto :goto_1

    .line 1648
    :cond_9
    iget v0, p0, Landroid/support/v4/view/ViewPager;->E:F

    iget v1, p0, Landroid/support/v4/view/ViewPager;->D:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    goto :goto_2

    .line 1652
    :cond_a
    iget v0, p0, Landroid/support/v4/view/ViewPager;->D:I

    int-to-float v0, v0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_8

    .line 1658
    iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->A:Z

    goto :goto_3

    .line 1675
    :sswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->E:F

    iput v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 1676
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->G:F

    .line 1677
    invoke-static {p1, v2}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 1678
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->A:Z

    .line 1680
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 1681
    iget v0, p0, Landroid/support/v4/view/ViewPager;->ac:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_b

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I

    move-result v0

    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->M:I

    if-le v0, v1, :cond_b

    .line 1684
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1685
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->x:Z

    .line 1686
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->c()V

    .line 1687
    iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->z:Z

    .line 1688
    invoke-direct {p0, v6}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    goto/16 :goto_1

    .line 1690
    :cond_b
    invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->a(Z)V

    .line 1691
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->z:Z

    goto/16 :goto_1

    .line 1701
    :sswitch_2
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1611
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x2 -> :sswitch_0
        0x6 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 17

    .prologue
    .line 1318
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput-boolean v1, v0, Landroid/support/v4/view/ViewPager;->v:Z

    .line 1319
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->c()V

    .line 1320
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput-boolean v1, v0, Landroid/support/v4/view/ViewPager;->v:Z

    .line 1322
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v9

    .line 1323
    sub-int v10, p4, p2

    .line 1324
    sub-int v11, p5, p3

    .line 1325
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I

    move-result v6

    .line 1326
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v2

    .line 1327
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I

    move-result v5

    .line 1328
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v3

    .line 1329
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v12

    .line 1331
    const/4 v4, 0x0

    .line 1335
    const/4 v1, 0x0

    move v8, v1

    :goto_0
    if-ge v8, v9, :cond_0

    .line 1336
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 1337
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v7, 0x8

    if-eq v1, v7, :cond_4

    .line 1338
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ay;

    .line 1341
    iget-boolean v7, v1, Landroid/support/v4/view/ay;->a:Z

    if-eqz v7, :cond_4

    .line 1342
    iget v7, v1, Landroid/support/v4/view/ay;->b:I

    and-int/lit8 v7, v7, 0x7

    .line 1343
    iget v1, v1, Landroid/support/v4/view/ay;->b:I

    and-int/lit8 v14, v1, 0x70

    .line 1344
    packed-switch v7, :pswitch_data_0

    :pswitch_0
    move v7, v6

    .line 1361
    :goto_1
    sparse-switch v14, :sswitch_data_0

    move v1, v2

    move/from16 v16, v3

    move v3, v2

    move/from16 v2, v16

    .line 1378
    :goto_2
    add-int/2addr v7, v12

    .line 1379
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    add-int/2addr v14, v7

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v1

    invoke-virtual {v13, v7, v1, v14, v15}, Landroid/view/View;->layout(IIII)V

    .line 1382
    add-int/lit8 v1, v4, 0x1

    move v4, v3

    move v3, v2

    move v2, v5

    move v5, v6

    .line 1335
    :goto_3
    add-int/lit8 v6, v8, 0x1

    move v8, v6

    move v6, v5

    move v5, v2

    move v2, v4

    move v4, v1

    goto :goto_0

    .line 1350
    :pswitch_1
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v1, v6

    move v7, v6

    move v6, v1

    .line 1351
    goto :goto_1

    .line 1353
    :pswitch_2
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int v1, v10, v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v7, v1

    .line 1355
    goto :goto_1

    .line 1357
    :pswitch_3
    sub-int v1, v10, v5

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    sub-int/2addr v1, v7

    .line 1358
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v5, v7

    move v7, v1

    goto :goto_1

    .line 1367
    :sswitch_0
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, v2

    move/from16 v16, v2

    move v2, v3

    move v3, v1

    move/from16 v1, v16

    .line 1368
    goto :goto_2

    .line 1370
    :sswitch_1
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int v1, v11, v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    move/from16 v16, v3

    move v3, v2

    move/from16 v2, v16

    .line 1372
    goto :goto_2

    .line 1374
    :sswitch_2
    sub-int v1, v11, v3

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    sub-int/2addr v1, v14

    .line 1375
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    add-int/2addr v3, v14

    move/from16 v16, v3

    move v3, v2

    move/from16 v2, v16

    goto :goto_2

    .line 1388
    :cond_0
    const/4 v1, 0x0

    move v7, v1

    :goto_4
    if-ge v7, v9, :cond_3

    .line 1389
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 1390
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v12, 0x8

    if-eq v1, v12, :cond_2

    .line 1391
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v4/view/ay;

    .line 1393
    iget-boolean v12, v1, Landroid/support/v4/view/ay;->a:Z

    if-nez v12, :cond_2

    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v12

    if-eqz v12, :cond_2

    .line 1394
    int-to-float v13, v10

    iget v12, v12, Landroid/support/v4/view/ax;->e:F

    mul-float/2addr v12, v13

    float-to-int v12, v12

    .line 1395
    add-int/2addr v12, v6

    .line 1397
    iget-boolean v13, v1, Landroid/support/v4/view/ay;->d:Z

    if-eqz v13, :cond_1

    .line 1400
    const/4 v13, 0x0

    iput-boolean v13, v1, Landroid/support/v4/view/ay;->d:Z

    .line 1401
    sub-int v13, v10, v6

    sub-int/2addr v13, v5

    int-to-float v13, v13

    iget v1, v1, Landroid/support/v4/view/ay;->c:F

    mul-float/2addr v1, v13

    float-to-int v1, v1

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v1, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 1404
    sub-int v13, v11, v2

    sub-int/2addr v13, v3

    const/high16 v14, 0x40000000    # 2.0f

    invoke-static {v13, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    .line 1407
    invoke-virtual {v8, v1, v13}, Landroid/view/View;->measure(II)V

    .line 1412
    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v1, v12

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v13, v2

    invoke-virtual {v8, v12, v2, v1, v13}, Landroid/view/View;->layout(IIII)V

    .line 1388
    :cond_2
    add-int/lit8 v1, v7, 0x1

    move v7, v1

    goto :goto_4

    .line 1418
    :cond_3
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v4/view/ViewPager;->p:I

    .line 1419
    sub-int v1, v11, v3

    move-object/from16 v0, p0

    iput v1, v0, Landroid/support/v4/view/ViewPager;->q:I

    .line 1420
    move-object/from16 v0, p0

    iput v4, v0, Landroid/support/v4/view/ViewPager;->U:I

    .line 1421
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput-boolean v1, v0, Landroid/support/v4/view/ViewPager;->R:Z

    .line 1422
    return-void

    :cond_4
    move v1, v4

    move v4, v2

    move v2, v5

    move v5, v6

    goto/16 :goto_3

    .line 1344
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 1361
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x30 -> :sswitch_0
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 13

    .prologue
    .line 1191
    const/4 v0, 0x0

    invoke-static {v0, p1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, p2}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/ViewPager;->setMeasuredDimension(II)V

    .line 1194
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getMeasuredWidth()I

    move-result v0

    .line 1195
    div-int/lit8 v1, v0, 0xa

    .line 1196
    iget v2, p0, Landroid/support/v4/view/ViewPager;->B:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Landroid/support/v4/view/ViewPager;->C:I

    .line 1199
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I

    move-result v1

    sub-int v3, v0, v1

    .line 1200
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v1

    sub-int v5, v0, v1

    .line 1207
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v9

    .line 1208
    const/4 v0, 0x0

    move v8, v0

    :goto_0
    if-ge v8, v9, :cond_8

    .line 1209
    invoke-virtual {p0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 1210
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_3

    .line 1211
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ay;

    .line 1212
    if-eqz v0, :cond_3

    iget-boolean v1, v0, Landroid/support/v4/view/ay;->a:Z

    if-eqz v1, :cond_3

    .line 1213
    iget v1, v0, Landroid/support/v4/view/ay;->b:I

    and-int/lit8 v6, v1, 0x7

    .line 1214
    iget v1, v0, Landroid/support/v4/view/ay;->b:I

    and-int/lit8 v4, v1, 0x70

    .line 1215
    const/high16 v2, -0x80000000

    .line 1216
    const/high16 v1, -0x80000000

    .line 1217
    const/16 v7, 0x30

    if-eq v4, v7, :cond_0

    const/16 v7, 0x50

    if-ne v4, v7, :cond_4

    :cond_0
    const/4 v4, 0x1

    move v7, v4

    .line 1218
    :goto_1
    const/4 v4, 0x3

    if-eq v6, v4, :cond_1

    const/4 v4, 0x5

    if-ne v6, v4, :cond_5

    :cond_1
    const/4 v4, 0x1

    move v6, v4

    .line 1220
    :goto_2
    if-eqz v7, :cond_6

    .line 1221
    const/high16 v2, 0x40000000    # 2.0f

    .line 1228
    :cond_2
    :goto_3
    iget v4, v0, Landroid/support/v4/view/ay;->width:I

    const/4 v11, -0x2

    if-eq v4, v11, :cond_e

    .line 1229
    const/high16 v4, 0x40000000    # 2.0f

    .line 1230
    iget v2, v0, Landroid/support/v4/view/ay;->width:I

    const/4 v11, -0x1

    if-eq v2, v11, :cond_d

    .line 1231
    iget v2, v0, Landroid/support/v4/view/ay;->width:I

    .line 1234
    :goto_4
    iget v11, v0, Landroid/support/v4/view/ay;->height:I

    const/4 v12, -0x2

    if-eq v11, v12, :cond_c

    .line 1235
    const/high16 v1, 0x40000000    # 2.0f

    .line 1236
    iget v11, v0, Landroid/support/v4/view/ay;->height:I

    const/4 v12, -0x1

    if-eq v11, v12, :cond_c

    .line 1237
    iget v0, v0, Landroid/support/v4/view/ay;->height:I

    .line 1240
    :goto_5
    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1241
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 1242
    invoke-virtual {v10, v2, v0}, Landroid/view/View;->measure(II)V

    .line 1244
    if-eqz v7, :cond_7

    .line 1245
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    sub-int/2addr v5, v0

    .line 1208
    :cond_3
    :goto_6
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    .line 1217
    :cond_4
    const/4 v4, 0x0

    move v7, v4

    goto :goto_1

    .line 1218
    :cond_5
    const/4 v4, 0x0

    move v6, v4

    goto :goto_2

    .line 1222
    :cond_6
    if-eqz v6, :cond_2

    .line 1223
    const/high16 v1, 0x40000000    # 2.0f

    goto :goto_3

    .line 1246
    :cond_7
    if-eqz v6, :cond_3

    .line 1247
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr v3, v0

    goto :goto_6

    .line 1253
    :cond_8
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v3, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->t:I

    .line 1254
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->u:I

    .line 1257
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->v:Z

    .line 1258
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->c()V

    .line 1259
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->v:Z

    .line 1262
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v2

    .line 1263
    const/4 v0, 0x0

    move v1, v0

    :goto_7
    if-ge v1, v2, :cond_b

    .line 1264
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1265
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v5, 0x8

    if-eq v0, v5, :cond_a

    .line 1269
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ay;

    .line 1270
    if-eqz v0, :cond_9

    iget-boolean v5, v0, Landroid/support/v4/view/ay;->a:Z

    if-nez v5, :cond_a

    .line 1271
    :cond_9
    int-to-float v5, v3

    iget v0, v0, Landroid/support/v4/view/ay;->c:F

    mul-float/2addr v0, v5

    float-to-int v0, v0

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 1273
    iget v5, p0, Landroid/support/v4/view/ViewPager;->u:I

    invoke-virtual {v4, v0, v5}, Landroid/view/View;->measure(II)V

    .line 1263
    :cond_a
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_7

    .line 1277
    :cond_b
    return-void

    :cond_c
    move v0, v5

    goto :goto_5

    :cond_d
    move v2, v3

    goto/16 :goto_4

    :cond_e
    move v4, v2

    move v2, v3

    goto/16 :goto_4
.end method

.method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v1, -0x1

    .line 2435
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v0

    .line 2436
    and-int/lit8 v3, p1, 0x2

    if-eqz v3, :cond_0

    move v1, v2

    move v3, v4

    .line 2445
    :goto_0
    if-eq v3, v0, :cond_2

    .line 2446
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2447
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_1

    .line 2448
    invoke-virtual {p0, v5}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/View;)Landroid/support/v4/view/ax;

    move-result-object v6

    .line 2449
    if-eqz v6, :cond_1

    iget v6, v6, Landroid/support/v4/view/ax;->b:I

    iget v7, p0, Landroid/support/v4/view/ViewPager;->h:I

    if-ne v6, v7, :cond_1

    .line 2450
    invoke-virtual {v5, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 2456
    :goto_1
    return v2

    .line 2441
    :cond_0
    add-int/lit8 v0, v0, -0x1

    move v3, v0

    move v0, v1

    .line 2443
    goto :goto_0

    .line 2445
    :cond_1
    add-int/2addr v3, v1

    goto :goto_0

    :cond_2
    move v2, v4

    .line 2456
    goto :goto_1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    .prologue
    .line 1103
    instance-of v0, p1, Landroid/support/v4/view/ViewPager$SavedState;

    if-nez v0, :cond_0

    .line 1104
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1119
    :goto_0
    return-void

    .line 1108
    :cond_0
    check-cast p1, Landroid/support/v4/view/ViewPager$SavedState;

    .line 1109
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1111
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v0, :cond_1

    .line 1112
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v1, p1, Landroid/support/v4/view/ViewPager$SavedState;->b:Landroid/os/Parcelable;

    iget-object v2, p1, Landroid/support/v4/view/ViewPager$SavedState;->c:Ljava/lang/ClassLoader;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/x;->a(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V

    .line 1113
    iget v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/view/ViewPager;->a(IZZ)V

    goto :goto_0

    .line 1115
    :cond_1
    iget v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->a:I

    iput v0, p0, Landroid/support/v4/view/ViewPager;->i:I

    .line 1116
    iget-object v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->b:Landroid/os/Parcelable;

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->j:Landroid/os/Parcelable;

    .line 1117
    iget-object v0, p1, Landroid/support/v4/view/ViewPager$SavedState;->c:Ljava/lang/ClassLoader;

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->k:Ljava/lang/ClassLoader;

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 1092
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1093
    new-instance v1, Landroid/support/v4/view/ViewPager$SavedState;

    invoke-direct {v1, v0}, Landroid/support/v4/view/ViewPager$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1094
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    iput v0, v1, Landroid/support/v4/view/ViewPager$SavedState;->a:I

    .line 1095
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v0, :cond_0

    .line 1096
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0}, Landroid/support/v4/view/x;->b()Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, v1, Landroid/support/v4/view/ViewPager$SavedState;->b:Landroid/os/Parcelable;

    .line 1098
    :cond_0
    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .prologue
    .line 1281
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 1284
    if-eq p1, p3, :cond_0

    .line 1285
    iget v0, p0, Landroid/support/v4/view/ViewPager;->n:I

    iget v1, p0, Landroid/support/v4/view/ViewPager;->n:I

    invoke-direct {p0, p1, p3, v0, v1}, Landroid/support/v4/view/ViewPager;->a(IIII)V

    .line 1287
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v6, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1719
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->N:Z

    if-eqz v0, :cond_0

    move v0, v1

    .line 1835
    :goto_0
    return v0

    .line 1726
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    .line 1729
    goto :goto_0

    .line 1732
    :cond_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0}, Landroid/support/v4/view/x;->a()I

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    move v0, v2

    .line 1734
    goto :goto_0

    .line 1737
    :cond_3
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    if-nez v0, :cond_4

    .line 1738
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    .line 1740
    :cond_4
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1742
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 1745
    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    .line 1832
    :cond_5
    :goto_1
    :pswitch_0
    if-eqz v2, :cond_6

    .line 1833
    invoke-static {p0}, Landroid/support/v4/view/ad;->b(Landroid/view/View;)V

    :cond_6
    move v0, v1

    .line 1835
    goto :goto_0

    .line 1747
    :pswitch_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->l:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1748
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->x:Z

    .line 1749
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->c()V

    .line 1750
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->V:Z

    if-eqz v0, :cond_7

    .line 1751
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->z:Z

    .line 1752
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 1756
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->E:F

    iput v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 1757
    invoke-static {p1, v2}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    goto :goto_1

    .line 1761
    :pswitch_2
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->z:Z

    if-nez v0, :cond_8

    .line 1762
    iget v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    invoke-static {p1, v0}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 1763
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 1764
    iget v4, p0, Landroid/support/v4/view/ViewPager;->F:F

    sub-float v4, v3, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 1765
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 1766
    iget v5, p0, Landroid/support/v4/view/ViewPager;->G:F

    sub-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 1768
    iget v5, p0, Landroid/support/v4/view/ViewPager;->D:I

    int-to-float v5, v5

    cmpl-float v5, v4, v5

    if-lez v5, :cond_8

    cmpl-float v0, v4, v0

    if-lez v0, :cond_8

    .line 1770
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->z:Z

    .line 1771
    iget v0, p0, Landroid/support/v4/view/ViewPager;->E:F

    sub-float v0, v3, v0

    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_9

    iget v0, p0, Landroid/support/v4/view/ViewPager;->E:F

    iget v3, p0, Landroid/support/v4/view/ViewPager;->D:I

    int-to-float v3, v3

    add-float/2addr v0, v3

    :goto_2
    iput v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 1773
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 1774
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 1778
    :cond_8
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->z:Z

    if-eqz v0, :cond_5

    .line 1780
    iget v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    invoke-static {p1, v0}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 1782
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 1783
    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->c(F)Z

    move-result v0

    or-int/2addr v2, v0

    .line 1784
    goto/16 :goto_1

    .line 1771
    :cond_9
    iget v0, p0, Landroid/support/v4/view/ViewPager;->E:F

    iget v3, p0, Landroid/support/v4/view/ViewPager;->D:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    goto :goto_2

    .line 1787
    :pswitch_3
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->z:Z

    if-eqz v0, :cond_5

    .line 1788
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->I:Landroid/view/VelocityTracker;

    .line 1789
    const/16 v2, 0x3e8

    iget v3, p0, Landroid/support/v4/view/ViewPager;->K:I

    int-to-float v3, v3

    invoke-virtual {v0, v2, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 1790
    iget v2, p0, Landroid/support/v4/view/ViewPager;->H:I

    invoke-static {v0, v2}, Landroid/support/v4/view/y;->a(Landroid/view/VelocityTracker;I)F

    move-result v0

    float-to-int v0, v0

    .line 1792
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->x:Z

    .line 1793
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v2

    .line 1794
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v3

    .line 1795
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->k()Landroid/support/v4/view/ax;

    move-result-object v4

    .line 1796
    iget v5, v4, Landroid/support/v4/view/ax;->b:I

    .line 1797
    int-to-float v3, v3

    int-to-float v2, v2

    div-float v2, v3, v2

    iget v3, v4, Landroid/support/v4/view/ax;->e:F

    sub-float/2addr v2, v3

    iget v3, v4, Landroid/support/v4/view/ax;->d:F

    div-float/2addr v2, v3

    .line 1798
    iget v3, p0, Landroid/support/v4/view/ViewPager;->H:I

    invoke-static {p1, v3}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I

    move-result v3

    .line 1800
    invoke-static {p1, v3}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 1801
    iget v4, p0, Landroid/support/v4/view/ViewPager;->E:F

    sub-float/2addr v3, v4

    float-to-int v3, v3

    .line 1802
    invoke-direct {p0, v5, v2, v0, v3}, Landroid/support/v4/view/ViewPager;->a(IFII)I

    move-result v2

    .line 1804
    invoke-virtual {p0, v2, v1, v1, v0}, Landroid/support/v4/view/ViewPager;->a(IZZI)V

    .line 1806
    iput v6, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 1807
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->l()V

    .line 1808
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    invoke-virtual {v0}, Landroid/support/v4/d/a;->c()Z

    move-result v0

    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    invoke-virtual {v2}, Landroid/support/v4/d/a;->c()Z

    move-result v2

    or-int/2addr v2, v0

    .line 1809
    goto/16 :goto_1

    .line 1812
    :pswitch_4
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->z:Z

    if-eqz v0, :cond_5

    .line 1813
    iget v0, p0, Landroid/support/v4/view/ViewPager;->h:I

    invoke-virtual {p0, v0, v1, v1}, Landroid/support/v4/view/ViewPager;->a(IZZ)V

    .line 1814
    iput v6, p0, Landroid/support/v4/view/ViewPager;->H:I

    .line 1815
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->l()V

    .line 1816
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->P:Landroid/support/v4/d/a;

    invoke-virtual {v0}, Landroid/support/v4/d/a;->c()Z

    move-result v0

    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->Q:Landroid/support/v4/d/a;

    invoke-virtual {v2}, Landroid/support/v4/d/a;->c()Z

    move-result v2

    or-int/2addr v2, v0

    goto/16 :goto_1

    .line 1820
    :pswitch_5
    invoke-static {p1}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;)I

    move-result v0

    .line 1821
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 1822
    iput v3, p0, Landroid/support/v4/view/ViewPager;->F:F

    .line 1823
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    goto/16 :goto_1

    .line 1827
    :pswitch_6
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->a(Landroid/view/MotionEvent;)V

    .line 1828
    iget v0, p0, Landroid/support/v4/view/ViewPager;->H:I

    invoke-static {p1, v0}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->F:F

    goto/16 :goto_1

    .line 1745
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public setAdapter(Landroid/support/v4/view/x;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 373
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v0, :cond_1

    .line 374
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->m:Landroid/support/v4/view/bc;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/x;->b(Landroid/database/DataSetObserver;)V

    .line 375
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;)V

    move v1, v2

    .line 376
    :goto_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 377
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ax;

    .line 378
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget v4, v0, Landroid/support/v4/view/ax;->b:I

    iget-object v0, v0, Landroid/support/v4/view/ax;->a:Ljava/lang/Object;

    invoke-virtual {v3, p0, v4, v0}, Landroid/support/v4/view/x;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 376
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 380
    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/x;->b(Landroid/view/ViewGroup;)V

    .line 381
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 382
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->j()V

    .line 383
    iput v2, p0, Landroid/support/v4/view/ViewPager;->h:I

    .line 384
    invoke-virtual {p0, v2, v2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 387
    :cond_1
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    .line 388
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    .line 390
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    if-eqz v1, :cond_3

    .line 391
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->m:Landroid/support/v4/view/bc;

    if-nez v1, :cond_2

    .line 392
    new-instance v1, Landroid/support/v4/view/bc;

    invoke-direct {v1, p0, v5}, Landroid/support/v4/view/bc;-><init>(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/at;)V

    iput-object v1, p0, Landroid/support/v4/view/ViewPager;->m:Landroid/support/v4/view/bc;

    .line 394
    :cond_2
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->m:Landroid/support/v4/view/bc;

    invoke-virtual {v1, v3}, Landroid/support/v4/view/x;->a(Landroid/database/DataSetObserver;)V

    .line 395
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->x:Z

    .line 396
    iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->R:Z

    .line 397
    iget v1, p0, Landroid/support/v4/view/ViewPager;->i:I

    if-ltz v1, :cond_5

    .line 398
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->g:Landroid/support/v4/view/x;

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->j:Landroid/os/Parcelable;

    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->k:Ljava/lang/ClassLoader;

    invoke-virtual {v1, v3, v4}, Landroid/support/v4/view/x;->a(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V

    .line 399
    iget v1, p0, Landroid/support/v4/view/ViewPager;->i:I

    invoke-virtual {p0, v1, v2, v6}, Landroid/support/v4/view/ViewPager;->a(IZZ)V

    .line 400
    const/4 v1, -0x1

    iput v1, p0, Landroid/support/v4/view/ViewPager;->i:I

    .line 401
    iput-object v5, p0, Landroid/support/v4/view/ViewPager;->j:Landroid/os/Parcelable;

    .line 402
    iput-object v5, p0, Landroid/support/v4/view/ViewPager;->k:Ljava/lang/ClassLoader;

    .line 408
    :cond_3
    :goto_1
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->aa:Landroid/support/v4/view/ba;

    if-eqz v1, :cond_4

    if-eq v0, p1, :cond_4

    .line 409
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->aa:Landroid/support/v4/view/ba;

    invoke-interface {v1, v0, p1}, Landroid/support/v4/view/ba;->a(Landroid/support/v4/view/x;Landroid/support/v4/view/x;)V

    .line 411
    :cond_4
    return-void

    .line 404
    :cond_5
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->c()V

    goto :goto_1
.end method

.method public setCurrentItem(I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 445
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->x:Z

    .line 446
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->R:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/view/ViewPager;->a(IZZ)V

    .line 447
    return-void

    :cond_0
    move v0, v1

    .line 446
    goto :goto_0
.end method

.method protected setIgnoreTouchSlop(Z)V
    .locals 0

    .prologue
    .line 347
    iput-boolean p1, p0, Landroid/support/v4/view/ViewPager;->V:Z

    .line 348
    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 572
    if-ge p1, v0, :cond_0

    .line 573
    const-string v1, "ViewPager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Requested offscreen page limit "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " too small; defaulting to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v0

    .line 577
    :cond_0
    iget v0, p0, Landroid/support/v4/view/ViewPager;->y:I

    if-eq p1, v0, :cond_1

    .line 578
    iput p1, p0, Landroid/support/v4/view/ViewPager;->y:I

    .line 579
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->c()V

    .line 581
    :cond_1
    return-void
.end method

.method setOnAdapterChangeListener(Landroid/support/v4/view/ba;)V
    .locals 0

    .prologue
    .line 434
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->aa:Landroid/support/v4/view/ba;

    .line 435
    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/bb;)V
    .locals 0

    .prologue
    .line 528
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->W:Landroid/support/v4/view/bb;

    .line 529
    return-void
.end method

.method public setPageMargin(I)V
    .locals 2

    .prologue
    .line 592
    iget v0, p0, Landroid/support/v4/view/ViewPager;->n:I

    .line 593
    iput p1, p0, Landroid/support/v4/view/ViewPager;->n:I

    .line 595
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v1

    .line 596
    invoke-direct {p0, v1, v1, p1, v0}, Landroid/support/v4/view/ViewPager;->a(IIII)V

    .line 598
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V

    .line 599
    return-void
.end method

.method public setPageMarginDrawable(I)V
    .locals 1

    .prologue
    .line 628
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 629
    return-void
.end method

.method public setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 616
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->o:Landroid/graphics/drawable/Drawable;

    .line 617
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->refreshDrawableState()V

    .line 618
    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V

    .line 619
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->invalidate()V

    .line 620
    return-void

    .line 618
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 633
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->o:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
