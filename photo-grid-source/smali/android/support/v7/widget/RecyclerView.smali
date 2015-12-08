.class public Landroid/support/v7/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/NestedScrollingChild;
.implements Landroid/support/v4/view/ScrollingView;


# static fields
.field private static final al:Landroid/view/animation/Interpolator;

.field private static final h:Z

.field private static final i:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Z

.field private final B:Z

.field private final C:Landroid/view/accessibility/AccessibilityManager;

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/widget/av;",
            ">;"
        }
    .end annotation
.end field

.field private E:Z

.field private F:I

.field private G:Landroid/support/v4/widget/EdgeEffectCompat;

.field private H:Landroid/support/v4/widget/EdgeEffectCompat;

.field private I:Landroid/support/v4/widget/EdgeEffectCompat;

.field private J:Landroid/support/v4/widget/EdgeEffectCompat;

.field private K:I

.field private L:I

.field private M:Landroid/view/VelocityTracker;

.field private N:I

.field private O:I

.field private P:I

.field private Q:I

.field private R:I

.field private final S:I

.field private final T:I

.field private U:F

.field private final V:Landroid/support/v7/widget/bh;

.field private W:Landroid/support/v7/widget/ax;

.field final a:Landroid/support/v7/widget/az;

.field private aa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/widget/ax;",
            ">;"
        }
    .end annotation
.end field

.field private ab:Landroid/support/v7/widget/aq;

.field private ac:Z

.field private ad:Landroid/support/v7/widget/bj;

.field private ae:Landroid/support/v7/widget/ao;

.field private final af:[I

.field private final ag:Landroid/support/v4/view/NestedScrollingChildHelper;

.field private final ah:[I

.field private final ai:[I

.field private final aj:[I

.field private ak:Ljava/lang/Runnable;

.field b:Landroid/support/v7/widget/a;

.field c:Landroid/support/v7/widget/d;

.field d:Landroid/support/v7/widget/ap;

.field final e:Landroid/support/v7/widget/bf;

.field f:Z

.field g:Z

.field private final j:Landroid/support/v7/widget/bb;

.field private k:Landroid/support/v7/widget/RecyclerView$SavedState;

.field private l:Z

.field private final m:Ljava/lang/Runnable;

.field private final n:Landroid/graphics/Rect;

.field private o:Landroid/support/v7/widget/al;

.field private p:Landroid/support/v7/widget/au;

.field private q:Landroid/support/v7/widget/ba;

.field private final r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/widget/as;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/widget/aw;",
            ">;"
        }
    .end annotation
.end field

.field private t:Landroid/support/v7/widget/aw;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 152
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x12

    if-eq v0, v3, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-eq v0, v3, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x14

    if-ne v0, v3, :cond_1

    :cond_0
    move v0, v2

    :goto_0
    sput-boolean v0, Landroid/support/v7/widget/RecyclerView;->h:Z

    .line 231
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Class;

    const-class v3, Landroid/content/Context;

    aput-object v3, v0, v1

    const-class v1, Landroid/util/AttributeSet;

    aput-object v1, v0, v2

    const/4 v1, 0x2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    sput-object v0, Landroid/support/v7/widget/RecyclerView;->i:[Ljava/lang/Class;

    .line 392
    new-instance v0, Landroid/support/v7/widget/ai;

    invoke-direct {v0}, Landroid/support/v7/widget/ai;-><init>()V

    sput-object v0, Landroid/support/v7/widget/RecyclerView;->al:Landroid/view/animation/Interpolator;

    return-void

    :cond_1
    move v0, v1

    .line 152
    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 400
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 401
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 404
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 405
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .prologue
    const/16 v5, 0x2e

    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 408
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 234
    new-instance v0, Landroid/support/v7/widget/bb;

    invoke-direct {v0, p0, v2}, Landroid/support/v7/widget/bb;-><init>(Landroid/support/v7/widget/RecyclerView;B)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->j:Landroid/support/v7/widget/bb;

    .line 236
    new-instance v0, Landroid/support/v7/widget/az;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/az;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 256
    new-instance v0, Landroid/support/v7/widget/ag;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/ag;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Ljava/lang/Runnable;

    .line 281
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    .line 285
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    .line 286
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    .line 305
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    .line 315
    iput v2, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 319
    new-instance v0, Landroid/support/v7/widget/g;

    invoke-direct {v0}, Landroid/support/v7/widget/g;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    .line 344
    iput v2, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 345
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 355
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    .line 357
    new-instance v0, Landroid/support/v7/widget/bh;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/bh;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->V:Landroid/support/v7/widget/bh;

    .line 359
    new-instance v0, Landroid/support/v7/widget/bf;

    invoke-direct {v0}, Landroid/support/v7/widget/bf;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    .line 365
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 366
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    .line 367
    new-instance v0, Landroid/support/v7/widget/ar;

    invoke-direct {v0, p0, v2}, Landroid/support/v7/widget/ar;-><init>(Landroid/support/v7/widget/RecyclerView;B)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ab:Landroid/support/v7/widget/aq;

    .line 369
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->ac:Z

    .line 375
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    .line 378
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    .line 379
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    .line 380
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    .line 382
    new-instance v0, Landroid/support/v7/widget/ah;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/ah;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ak:Ljava/lang/Runnable;

    .line 409
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 410
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 411
    const/16 v3, 0x10

    if-lt v0, v3, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->B:Z

    .line 413
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 414
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    .line 415
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    iput v3, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    .line 416
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    .line 417
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v0

    if-ne v0, v4, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setWillNotDraw(Z)V

    .line 419
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ab:Landroid/support/v7/widget/aq;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/aq;)V

    .line 10614
    new-instance v0, Landroid/support/v7/widget/a;

    new-instance v3, Landroid/support/v7/widget/ak;

    invoke-direct {v3, p0}, Landroid/support/v7/widget/ak;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    invoke-direct {v0, v3}, Landroid/support/v7/widget/a;-><init>(Landroid/support/v7/widget/b;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    .line 11530
    new-instance v0, Landroid/support/v7/widget/d;

    new-instance v3, Landroid/support/v7/widget/aj;

    invoke-direct {v3, p0}, Landroid/support/v7/widget/aj;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    invoke-direct {v0, v3}, Landroid/support/v7/widget/d;-><init>(Landroid/support/v7/widget/f;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    .line 423
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    .line 425
    invoke-static {p0, v1}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 428
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "accessibility"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Landroid/view/accessibility/AccessibilityManager;

    .line 430
    new-instance v0, Landroid/support/v7/widget/bj;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/bj;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 12459
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Landroid/support/v7/widget/bj;

    .line 12460
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Landroid/support/v7/widget/bj;

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 432
    if-eqz p2, :cond_1

    .line 434
    sget-object v0, Landroid/support/v7/a/b;->a:[I

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 436
    sget v3, Landroid/support/v7/a/b;->b:I

    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 437
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 12468
    if-eqz v3, :cond_1

    .line 12469
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 12470
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    .line 12520
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_4

    .line 12521
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 12474
    :goto_2
    :try_start_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 12476
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 12480
    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v3, Landroid/support/v7/widget/au;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v5

    .line 12483
    const/4 v3, 0x0

    .line 12485
    :try_start_1
    sget-object v0, Landroid/support/v7/widget/RecyclerView;->i:[Ljava/lang/Class;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    .line 12487
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v0, v6

    const/4 v6, 0x1

    aput-object p2, v0, v6

    const/4 v6, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v0, v6

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v0, v6
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_6

    move-object v3, v4

    .line 12497
    :goto_4
    const/4 v4, 0x1

    :try_start_2
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 12498
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/au;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/au;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_6

    .line 441
    :cond_1
    new-instance v0, Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-direct {v0, p0}, Landroid/support/v4/view/NestedScrollingChildHelper;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    .line 442
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 443
    return-void

    :cond_2
    move v0, v2

    .line 411
    goto/16 :goto_0

    :cond_3
    move v0, v2

    .line 417
    goto/16 :goto_1

    .line 12523
    :cond_4
    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, v0

    .line 12524
    goto :goto_2

    .line 12526
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v3, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v3}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto :goto_2

    .line 12478
    :cond_6
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_6

    move-result-object v0

    goto :goto_3

    .line 12488
    :catch_0
    move-exception v0

    .line 12490
    const/4 v4, 0x0

    :try_start_4
    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_6

    move-result-object v0

    move-object v8, v3

    move-object v3, v0

    move-object v0, v8

    .line 12495
    goto :goto_4

    .line 12491
    :catch_1
    move-exception v1

    .line 12492
    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/NoSuchMethodException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 12493
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Error creating LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_5 .. :try_end_5} :catch_6

    .line 12499
    :catch_2
    move-exception v0

    .line 12500
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Unable to find LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12502
    :catch_3
    move-exception v0

    .line 12503
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Could not instantiate the LayoutManager: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12505
    :catch_4
    move-exception v0

    .line 12506
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Could not instantiate the LayoutManager: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12508
    :catch_5
    move-exception v0

    .line 12509
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Cannot access non-public constructor "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 12511
    :catch_6
    move-exception v0

    .line 12512
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": Class is not a LayoutManager "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private A()V
    .locals 4

    .prologue
    .line 3122
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->b()I

    move-result v1

    .line 3123
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 3124
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v2

    .line 3125
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->b()Z

    move-result v3

    if-nez v3, :cond_0

    .line 3126
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->a()V

    .line 3123
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3129
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0}, Landroid/support/v7/widget/az;->e()V

    .line 3130
    return-void
.end method

.method private B()V
    .locals 6

    .prologue
    const/4 v5, 0x6

    const/4 v0, 0x0

    .line 3295
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v1}, Landroid/support/v7/widget/d;->b()I

    move-result v2

    move v1, v0

    .line 3296
    :goto_0
    if-ge v1, v2, :cond_1

    .line 3297
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v3

    .line 3298
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 3299
    invoke-virtual {v3, v5}, Landroid/support/v7/widget/bi;->a(I)V

    .line 3296
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3302
    :cond_1
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->z()V

    .line 3303
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 29924
    iget-object v1, v2, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    .line 30139
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    .line 29924
    if-eqz v1, :cond_3

    iget-object v1, v2, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    .line 31139
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    .line 29924
    invoke-virtual {v1}, Landroid/support/v7/widget/al;->k_()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 29925
    iget-object v1, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    .line 29926
    :goto_1
    if-ge v1, v3, :cond_4

    .line 29927
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 29928
    if-eqz v0, :cond_2

    .line 29929
    invoke-virtual {v0, v5}, Landroid/support/v7/widget/bi;->a(I)V

    .line 29926
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 29934
    :cond_3
    invoke-virtual {v2}, Landroid/support/v7/widget/az;->c()V

    .line 29932
    :cond_4
    return-void
.end method

.method private a(Landroid/support/v4/util/ArrayMap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/util/ArrayMap",
            "<",
            "Landroid/view/View;",
            "Landroid/graphics/Rect;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2860
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v7, v0, Landroid/support/v7/widget/bf;->d:Ljava/util/List;

    .line 2861
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v6, v0

    :goto_0
    if-ltz v6, :cond_3

    .line 2862
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    .line 2863
    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v1

    .line 2864
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/at;

    .line 2865
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2866
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v2, v2, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2868
    :cond_0
    invoke-virtual {p1, v5}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 2869
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0, v5, v1}, Landroid/support/v7/widget/au;->a(Landroid/view/View;Landroid/support/v7/widget/az;)V

    .line 2861
    :goto_1
    add-int/lit8 v0, v6, -0x1

    move v6, v0

    goto :goto_0

    .line 2872
    :cond_1
    if-eqz v0, :cond_2

    .line 2873
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/at;)V

    goto :goto_1

    .line 2876
    :cond_2
    new-instance v0, Landroid/support/v7/widget/at;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/at;-><init>(Landroid/support/v7/widget/bi;IIII)V

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/at;)V

    goto :goto_1

    .line 2880
    :cond_3
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 2881
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .prologue
    .line 139
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->detachViewFromParent(I)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->d(II)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 33462
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    .line 33467
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 33468
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 33469
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 33470
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/av;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/av;->a(Landroid/view/View;)V

    .line 33469
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 139
    :cond_0
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 139
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private a(Landroid/support/v7/widget/at;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 2910
    iget-object v0, p1, Landroid/support/v7/widget/at;->a:Landroid/support/v7/widget/bi;

    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 2911
    iget-object v1, p1, Landroid/support/v7/widget/at;->a:Landroid/support/v7/widget/bi;

    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/bi;)V

    .line 2912
    iget v2, p1, Landroid/support/v7/widget/at;->b:I

    .line 2913
    iget v3, p1, Landroid/support/v7/widget/at;->c:I

    .line 2914
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v4

    .line 2915
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v5

    .line 2916
    if-ne v2, v4, :cond_0

    if-eq v3, v5, :cond_2

    .line 2917
    :cond_0
    iget-object v1, p1, Landroid/support/v7/widget/at;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/bi;->a(Z)V

    .line 2918
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v5

    invoke-virtual {v0, v4, v5, v1, v6}, Landroid/view/View;->layout(IIII)V

    .line 2925
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    iget-object v1, p1, Landroid/support/v7/widget/at;->a:Landroid/support/v7/widget/bi;

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/bi;IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2927
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    .line 2939
    :cond_1
    :goto_0
    return-void

    .line 2934
    :cond_2
    iget-object v0, p1, Landroid/support/v7/widget/at;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/bi;->a(Z)V

    .line 2935
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    iget-object v1, p1, Landroid/support/v7/widget/at;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/bi;)Z

    .line 2936
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    goto :goto_0
.end method

.method private a(Landroid/support/v7/widget/bi;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 998
    iget-object v2, p1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 999
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_0

    move v0, v1

    .line 1000
    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/az;->b(Landroid/support/v7/widget/bi;)V

    .line 1001
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->p()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1003
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    const/4 v3, -0x1

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/support/v7/widget/d;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 1009
    :goto_1
    return-void

    .line 999
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 1004
    :cond_1
    if-nez v0, :cond_2

    .line 1005
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/d;->a(Landroid/view/View;)V

    goto :goto_1

    .line 1007
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    .line 15301
    iget-object v1, v0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, v2}, Landroid/support/v7/widget/f;->a(Landroid/view/View;)I

    move-result v1

    .line 15302
    if-gez v1, :cond_3

    .line 15303
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "view is not a child, cannot hide "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15308
    :cond_3
    iget-object v3, v0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/e;->a(I)V

    .line 15309
    iget-object v0, v0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 4

    .prologue
    const/high16 v3, 0x3f000000    # 0.5f

    .line 2256
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2257
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    if-ne v1, v2, :cond_0

    .line 2259
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2260
    :goto_0
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2261
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v1

    add-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2262
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 2264
    :cond_0
    return-void

    .line 2259
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(IILandroid/view/MotionEvent;)Z
    .locals 11

    .prologue
    .line 1342
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 1343
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 1345
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->j()V

    .line 1346
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    if-eqz v4, :cond_6

    .line 1347
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 1348
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()V

    .line 1349
    const-string v4, "RV Scroll"

    invoke-static {v4}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 1350
    if-eqz p1, :cond_0

    .line 1351
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v2, p1, v3, v4}, Landroid/support/v7/widget/au;->a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v2

    .line 1352
    sub-int v3, p1, v2

    .line 1354
    :cond_0
    if-eqz p2, :cond_1

    .line 1355
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, p2, v1, v4}, Landroid/support/v7/widget/au;->b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    .line 1356
    sub-int v1, p2, v0

    .line 1358
    :cond_1
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 1359
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1361
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v4}, Landroid/support/v7/widget/d;->a()I

    move-result v6

    .line 1362
    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v6, :cond_5

    .line 1363
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v4, v5}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v7

    .line 1364
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v4

    .line 1365
    if-eqz v4, :cond_3

    iget-object v8, v4, Landroid/support/v7/widget/bi;->h:Landroid/support/v7/widget/bi;

    if-eqz v8, :cond_3

    .line 1366
    iget-object v4, v4, Landroid/support/v7/widget/bi;->h:Landroid/support/v7/widget/bi;

    .line 1367
    if-eqz v4, :cond_4

    iget-object v4, v4, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 1368
    :goto_1
    if-eqz v4, :cond_3

    .line 1369
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    .line 1370
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v7

    .line 1371
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v9

    if-ne v8, v9, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v9

    if-eq v7, v9, :cond_3

    .line 1372
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v9, v8

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v10

    add-int/2addr v10, v7

    invoke-virtual {v4, v8, v7, v9, v10}, Landroid/view/View;->layout(IIII)V

    .line 1362
    :cond_3
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    goto :goto_0

    .line 1367
    :cond_4
    const/4 v4, 0x0

    goto :goto_1

    .line 1380
    :cond_5
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()V

    .line 1381
    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    :cond_6
    move v4, v1

    move v1, v2

    move v2, v0

    .line 1383
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1384
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 1387
    :cond_7
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedScroll(IIII[I)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1389
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    sub-int/2addr v0, v3

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    .line 1390
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    sub-int/2addr v0, v3

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    .line 1391
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    const/4 v3, 0x0

    aget v0, v0, v3

    int-to-float v0, v0

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    int-to-float v3, v3

    invoke-virtual {p3, v0, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 1392
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    const/4 v3, 0x0

    aget v4, v0, v3

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    add-int/2addr v4, v5

    aput v4, v0, v3

    .line 1393
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    const/4 v3, 0x1

    aget v4, v0, v3

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    const/4 v6, 0x1

    aget v5, v5, v6

    add-int/2addr v4, v5

    aput v4, v0, v3

    .line 1400
    :cond_8
    :goto_2
    if-nez v1, :cond_9

    if-eqz v2, :cond_a

    .line 1401
    :cond_9
    invoke-virtual {p0, v1, v2}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    .line 1403
    :cond_a
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    move-result v0

    if-nez v0, :cond_b

    .line 1404
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 1406
    :cond_b
    if-nez v1, :cond_c

    if-eqz v2, :cond_14

    :cond_c
    const/4 v0, 0x1

    :goto_3
    return v0

    .line 1394
    :cond_d
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v0

    const/4 v5, 0x2

    if-eq v0, v5, :cond_8

    .line 1395
    if-eqz p3, :cond_11

    .line 1396
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    int-to-float v3, v3

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    int-to-float v4, v4

    .line 16670
    const/4 v0, 0x0

    .line 16671
    const/4 v7, 0x0

    cmpg-float v7, v3, v7

    if-gez v7, :cond_12

    .line 16672
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->n()V

    .line 16673
    iget-object v7, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    neg-float v8, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v8, v9

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v6, v10

    sub-float v6, v9, v6

    invoke-virtual {v7, v8, v6}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(FF)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 16674
    const/4 v0, 0x1

    .line 16683
    :cond_e
    :goto_4
    const/4 v6, 0x0

    cmpg-float v6, v4, v6

    if-gez v6, :cond_13

    .line 16684
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    .line 16685
    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    neg-float v7, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v7, v8

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v5, v8

    invoke-virtual {v6, v7, v5}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(FF)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 16686
    const/4 v0, 0x1

    .line 16695
    :cond_f
    :goto_5
    if-nez v0, :cond_10

    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-nez v0, :cond_10

    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-eqz v0, :cond_11

    .line 16696
    :cond_10
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1398
    :cond_11
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->d(II)V

    goto :goto_2

    .line 16676
    :cond_12
    const/4 v7, 0x0

    cmpl-float v7, v3, v7

    if-lez v7, :cond_e

    .line 16677
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->o()V

    .line 16678
    iget-object v7, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float v8, v3, v8

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v6, v9

    invoke-virtual {v7, v8, v6}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(FF)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 16679
    const/4 v0, 0x1

    goto :goto_4

    .line 16688
    :cond_13
    const/4 v6, 0x0

    cmpl-float v6, v4, v6

    if-lez v6, :cond_f

    .line 16689
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    .line 16690
    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float v7, v4, v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v5, v9

    sub-float v5, v8, v5

    invoke-virtual {v6, v7, v5}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(FF)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 16691
    const/4 v0, 0x1

    goto :goto_5

    .line 1406
    :cond_14
    const/4 v0, 0x0

    goto/16 :goto_3
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    return v0
.end method

.method private b(Landroid/support/v7/widget/bi;)J
    .locals 2

    .prologue
    .line 2852
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->k_()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27099
    iget-wide v0, p1, Landroid/support/v7/widget/bi;->d:J

    .line 2852
    :goto_0
    return-wide v0

    :cond_0
    iget v0, p1, Landroid/support/v7/widget/bi;->b:I

    int-to-long v0, v0

    goto :goto_0
.end method

.method static b(Landroid/view/View;)Landroid/support/v7/widget/bi;
    .locals 1

    .prologue
    .line 3338
    if-nez p0, :cond_0

    .line 3339
    const/4 v0, 0x0

    .line 3341
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    goto :goto_0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 1103
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-ne p1, v0, :cond_1

    .line 1115
    :cond_0
    return-void

    .line 1110
    :cond_1
    iput p1, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 1111
    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    .line 1112
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->l()V

    .line 15656
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_3

    .line 15657
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/au;->f(I)V

    .line 15665
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Landroid/support/v7/widget/ax;

    if-eqz v0, :cond_4

    .line 15666
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Landroid/support/v7/widget/ax;

    invoke-virtual {v0, p0, p1}, Landroid/support/v7/widget/ax;->a(Landroid/support/v7/widget/RecyclerView;I)V

    .line 15668
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 15669
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 15670
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ax;

    invoke-virtual {v0, p0, p1}, Landroid/support/v7/widget/ax;->a(Landroid/support/v7/widget/RecyclerView;I)V

    .line 15669
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic b(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    return-void
.end method

.method static synthetic b(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/view/View;)V

    return-void
.end method

.method static synthetic b(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    return v0
.end method

.method public static c(Landroid/view/View;)I
    .locals 8

    .prologue
    const/4 v2, -0x1

    .line 3360
    invoke-static {p0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 3361
    if-eqz v0, :cond_6

    .line 32071
    iget-object v1, v0, Landroid/support/v7/widget/bi;->i:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_6

    .line 32074
    iget-object v1, v0, Landroid/support/v7/widget/bi;->i:Landroid/support/v7/widget/RecyclerView;

    .line 32268
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->o()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->m()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    move v1, v2

    .line 32271
    :cond_1
    :goto_0
    return v1

    .line 32273
    :cond_2
    iget-object v4, v1, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    iget v1, v0, Landroid/support/v7/widget/bi;->b:I

    .line 32563
    iget-object v0, v4, Landroid/support/v7/widget/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 32564
    const/4 v0, 0x0

    move v3, v0

    :goto_1
    if-ge v3, v5, :cond_1

    .line 32565
    iget-object v0, v4, Landroid/support/v7/widget/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/c;

    .line 32566
    iget v6, v0, Landroid/support/v7/widget/c;->a:I

    packed-switch v6, :pswitch_data_0

    .line 32564
    :cond_3
    :goto_2
    :pswitch_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 32568
    :pswitch_1
    iget v6, v0, Landroid/support/v7/widget/c;->b:I

    if-gt v6, v1, :cond_3

    .line 32569
    iget v0, v0, Landroid/support/v7/widget/c;->c:I

    add-int/2addr v1, v0

    goto :goto_2

    .line 32573
    :pswitch_2
    iget v6, v0, Landroid/support/v7/widget/c;->b:I

    if-gt v6, v1, :cond_3

    .line 32574
    iget v6, v0, Landroid/support/v7/widget/c;->b:I

    iget v7, v0, Landroid/support/v7/widget/c;->c:I

    add-int/2addr v6, v7

    .line 32575
    if-gt v6, v1, :cond_6

    .line 32578
    iget v0, v0, Landroid/support/v7/widget/c;->c:I

    sub-int/2addr v1, v0

    .line 32579
    goto :goto_2

    .line 32582
    :pswitch_3
    iget v6, v0, Landroid/support/v7/widget/c;->b:I

    if-ne v6, v1, :cond_4

    .line 32583
    iget v1, v0, Landroid/support/v7/widget/c;->c:I

    goto :goto_2

    .line 32585
    :cond_4
    iget v6, v0, Landroid/support/v7/widget/c;->b:I

    if-ge v6, v1, :cond_5

    .line 32586
    add-int/lit8 v1, v1, -0x1

    .line 32588
    :cond_5
    iget v0, v0, Landroid/support/v7/widget/c;->c:I

    if-gt v0, v1, :cond_3

    .line 32589
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    move v1, v2

    .line 3361
    goto :goto_0

    .line 32566
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic c(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Z

    return v0
.end method

.method static synthetic c(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 139
    .line 35018
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 35019
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    .line 35327
    iget-object v3, v2, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v3, p1}, Landroid/support/v7/widget/f;->a(Landroid/view/View;)I

    move-result v3

    .line 35328
    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 35329
    iget-object v2, v2, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 35020
    :goto_0
    if-eqz v0, :cond_0

    .line 35021
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v2

    .line 35022
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/az;->b(Landroid/support/v7/widget/bi;)V

    .line 35023
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/bi;)V

    .line 35028
    :cond_0
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 139
    return v0

    .line 35334
    :cond_1
    iget-object v4, v2, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v4, v3}, Landroid/support/v7/widget/e;->b(I)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 35335
    iget-object v4, v2, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v4, v3}, Landroid/support/v7/widget/e;->c(I)Z

    .line 35336
    iget-object v4, v2, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 35340
    iget-object v2, v2, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v2, v3}, Landroid/support/v7/widget/f;->a(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 35343
    goto :goto_0
.end method

.method public static d(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 3375
    invoke-static {p0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 3376
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private d(II)V
    .locals 2

    .prologue
    .line 1712
    const/4 v0, 0x0

    .line 1713
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_0

    if-lez p1, :cond_0

    .line 1714
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v0

    .line 1716
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_1

    if-gez p1, :cond_1

    .line 1717
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1719
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_2

    if-lez p2, :cond_2

    .line 1720
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1722
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_3

    if-gez p2, :cond_3

    .line 1723
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1725
    :cond_3
    if-eqz v0, :cond_4

    .line 1726
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1728
    :cond_4
    return-void
.end method

.method static synthetic d(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:Z

    return v0
.end method

.method static synthetic e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    return-object v0
.end method

.method private e(II)V
    .locals 4

    .prologue
    .line 2353
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 2354
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 2355
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 2356
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2361
    sparse-switch v2, :sswitch_data_0

    .line 2368
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getMinimumWidth(Landroid/view/View;)I

    move-result v1

    .line 2372
    :sswitch_0
    sparse-switch v3, :sswitch_data_1

    .line 2379
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getMinimumHeight(Landroid/view/View;)I

    move-result v0

    .line 2383
    :sswitch_1
    invoke-virtual {p0, v1, v0}, Landroid/support/v7/widget/RecyclerView;->setMeasuredDimension(II)V

    .line 2384
    return-void

    .line 2361
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_0
    .end sparse-switch

    .line 2372
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic f(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->j()V

    return-void
.end method

.method private f(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 5448
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    .line 5453
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 5454
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 5455
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 5456
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5455
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 5459
    :cond_0
    return-void
.end method

.method private f(II)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 2815
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v2}, Landroid/support/v7/widget/d;->a()I

    move-result v3

    .line 2816
    if-nez v3, :cond_2

    .line 2817
    if-nez p1, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    move v0, v1

    .line 2829
    :cond_1
    :goto_0
    return v0

    :cond_2
    move v2, v0

    .line 2819
    :goto_1
    if-ge v2, v3, :cond_1

    .line 2820
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v4, v2}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v4

    .line 2821
    invoke-virtual {v4}, Landroid/support/v7/widget/bi;->b()Z

    move-result v5

    if-nez v5, :cond_4

    .line 2824
    invoke-virtual {v4}, Landroid/support/v7/widget/bi;->c()I

    move-result v4

    .line 2825
    if-lt v4, p1, :cond_3

    if-le v4, p2, :cond_4

    :cond_3
    move v0, v1

    .line 2826
    goto :goto_0

    .line 2819
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method static synthetic g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    return-object v0
.end method

.method static synthetic h()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 139
    sget-object v0, Landroid/support/v7/widget/RecyclerView;->al:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method static synthetic h(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()V

    return-void
.end method

.method static synthetic i()Z
    .locals 1

    .prologue
    .line 139
    sget-boolean v0, Landroid/support/v7/widget/RecyclerView;->h:Z

    return v0
.end method

.method static synthetic i(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()Z

    move-result v0

    return v0
.end method

.method private j()V
    .locals 1

    .prologue
    .line 1327
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1328
    return-void
.end method

.method static synthetic j(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()V

    return-void
.end method

.method static synthetic k(Landroid/support/v7/widget/RecyclerView;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    return-object v0
.end method

.method private k()V
    .locals 1

    .prologue
    .line 1633
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 1634
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->l()V

    .line 1635
    return-void
.end method

.method private l()V
    .locals 1

    .prologue
    .line 1641
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->V:Landroid/support/v7/widget/bh;

    invoke-virtual {v0}, Landroid/support/v7/widget/bh;->b()V

    .line 1642
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_0

    .line 1643
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->z()V

    .line 1645
    :cond_0
    return-void
.end method

.method static synthetic l(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    move-result v0

    return v0
.end method

.method private m()V
    .locals 2

    .prologue
    .line 1701
    const/4 v0, 0x0

    .line 1702
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v0

    .line 1703
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1704
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1705
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1706
    :cond_3
    if-eqz v0, :cond_4

    .line 1707
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1709
    :cond_4
    return-void
.end method

.method static synthetic m(Landroid/support/v7/widget/RecyclerView;)V
    .locals 6

    .prologue
    const/16 v5, 0x200

    const/4 v0, 0x0

    .line 139
    .line 34276
    iget-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    if-nez v1, :cond_3

    .line 34279
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    .line 34280
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v1}, Landroid/support/v7/widget/d;->b()I

    move-result v2

    move v1, v0

    .line 34281
    :goto_0
    if-ge v1, v2, :cond_1

    .line 34282
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v3

    .line 34283
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 34284
    invoke-virtual {v3, v5}, Landroid/support/v7/widget/bi;->a(I)V

    .line 34281
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 34287
    :cond_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 34914
    iget-object v1, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    .line 34915
    :goto_1
    if-ge v1, v3, :cond_3

    .line 34916
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 34917
    if-eqz v0, :cond_2

    .line 34918
    invoke-virtual {v0, v5}, Landroid/support/v7/widget/bi;->a(I)V

    .line 34915
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 139
    :cond_3
    return-void
.end method

.method private n()V
    .locals 4

    .prologue
    .line 1753
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1763
    :goto_0
    return-void

    .line 1756
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1757
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1758
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0

    .line 1761
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
.end method

.method static synthetic n(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->B:Z

    return v0
.end method

.method private o()V
    .locals 4

    .prologue
    .line 1766
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1776
    :goto_0
    return-void

    .line 1769
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1770
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1771
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0

    .line 1774
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
.end method

.method static synthetic o(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    return v0
.end method

.method private p()V
    .locals 4

    .prologue
    .line 1779
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1790
    :goto_0
    return-void

    .line 1782
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1783
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1784
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0

    .line 1787
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
.end method

.method static synthetic p(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    return v0
.end method

.method static synthetic q(Landroid/support/v7/widget/RecyclerView;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Ljava/lang/Runnable;

    return-object v0
.end method

.method private q()V
    .locals 4

    .prologue
    .line 1793
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1803
    :goto_0
    return-void

    .line 1796
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1797
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1798
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0

    .line 1801
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
.end method

.method private r()V
    .locals 1

    .prologue
    .line 1806
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1807
    return-void
.end method

.method static synthetic r(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Z

    return v0
.end method

.method static synthetic s(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Landroid/view/accessibility/AccessibilityManager;

    return-object v0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 2247
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2248
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2250
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->stopNestedScroll()V

    .line 2251
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->m()V

    .line 2252
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2253
    return-void
.end method

.method static synthetic t(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/bj;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Landroid/support/v7/widget/bj;

    return-object v0
.end method

.method private t()V
    .locals 1

    .prologue
    .line 2417
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 2418
    return-void
.end method

.method static synthetic u(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/ba;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->q:Landroid/support/v7/widget/ba;

    return-object v0
.end method

.method private u()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 2421
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 2422
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    if-gtz v0, :cond_0

    .line 2427
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 24433
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->z:I

    .line 24434
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->z:I

    .line 24435
    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->C:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->C:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 24436
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    .line 24437
    const/16 v2, 0x800

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 24438
    invoke-static {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->setContentChangeTypes(Landroid/view/accessibility/AccessibilityEvent;I)V

    .line 24439
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2430
    :cond_0
    return-void
.end method

.method private v()Z
    .locals 1

    .prologue
    .line 2444
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic v(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    return v0
.end method

.method static synthetic w(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/bh;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->V:Landroid/support/v7/widget/bh;

    return-object v0
.end method

.method private w()Z
    .locals 1

    .prologue
    .line 2492
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    invoke-virtual {v0}, Landroid/support/v7/widget/ap;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private x()V
    .locals 1

    .prologue
    .line 2500
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    if-eqz v0, :cond_0

    .line 2501
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ak:Ljava/lang/Runnable;

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 2502
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:Z

    .line 2504
    :cond_0
    return-void
.end method

.method private y()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 2517
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    if-eqz v0, :cond_0

    .line 2520
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->a()V

    .line 2521
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->B()V

    .line 2522
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->a()V

    .line 2527
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2528
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->b()V

    .line 2532
    :goto_0
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->f:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-eqz v0, :cond_6

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_2
    move v0, v2

    .line 2534
    :goto_1
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v3, :cond_7

    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    if-nez v3, :cond_3

    if-nez v0, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-static {v3}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/au;)Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_3
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    invoke-virtual {v3}, Landroid/support/v7/widget/al;->k_()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_4
    move v3, v2

    :goto_2
    invoke-static {v4, v3}, Landroid/support/v7/widget/bf;->c(Landroid/support/v7/widget/bf;Z)Z

    .line 2538
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v4}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;)Z

    move-result v4

    if-eqz v4, :cond_9

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    if-nez v0, :cond_9

    .line 24507
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    .line 2538
    :goto_3
    if-eqz v0, :cond_9

    :goto_4
    invoke-static {v3, v2}, Landroid/support/v7/widget/bf;->d(Landroid/support/v7/widget/bf;Z)Z

    .line 2541
    return-void

    .line 2530
    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->e()V

    goto :goto_0

    :cond_6
    move v0, v1

    .line 2532
    goto :goto_1

    :cond_7
    move v3, v1

    .line 2534
    goto :goto_2

    :cond_8
    move v0, v1

    .line 24507
    goto :goto_3

    :cond_9
    move v2, v1

    .line 2538
    goto :goto_4
.end method

.method private z()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 2987
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->b()I

    move-result v3

    move v2, v1

    .line 2988
    :goto_0
    if-ge v2, v3, :cond_0

    .line 2989
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v0

    .line 2990
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 2988
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 2992
    :cond_0
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 27957
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 27958
    :goto_1
    if-ge v1, v3, :cond_2

    .line 27959
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 27960
    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 27961
    if-eqz v0, :cond_1

    .line 27962
    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 27958
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 2993
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()Landroid/support/v7/widget/al;
    .locals 1

    .prologue
    .line 836
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    return-object v0
.end method

.method public final a(Landroid/view/View;)Landroid/support/v7/widget/bi;
    .locals 3

    .prologue
    .line 3329
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 3330
    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    .line 3331
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a direct child of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3334
    :cond_0
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    return-object v0
.end method

.method final a(II)V
    .locals 2

    .prologue
    .line 1731
    if-gez p1, :cond_4

    .line 1732
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->n()V

    .line 1733
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    neg-int v1, p1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    .line 1739
    :cond_0
    :goto_0
    if-gez p2, :cond_5

    .line 1740
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    .line 1741
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    neg-int v1, p2

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    .line 1747
    :cond_1
    :goto_1
    if-nez p1, :cond_2

    if-eqz p2, :cond_3

    .line 1748
    :cond_2
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1750
    :cond_3
    return-void

    .line 1734
    :cond_4
    if-lez p1, :cond_0

    .line 1735
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->o()V

    .line 1736
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    goto :goto_0

    .line 1742
    :cond_5
    if-lez p2, :cond_1

    .line 1743
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    .line 1744
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0, p2}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    goto :goto_1
.end method

.method final a(IIZ)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, 0x1

    .line 3185
    add-int v1, p1, p2

    .line 3186
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->b()I

    move-result v2

    .line 3187
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    .line 3188
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v3

    .line 3189
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 3190
    iget v4, v3, Landroid/support/v7/widget/bi;->b:I

    if-lt v4, v1, :cond_1

    .line 3196
    neg-int v4, p2

    invoke-virtual {v3, v4, p3}, Landroid/support/v7/widget/bi;->a(IZ)V

    .line 3197
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v3, v6}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 3187
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3198
    :cond_1
    iget v4, v3, Landroid/support/v7/widget/bi;->b:I

    if-lt v4, p1, :cond_0

    .line 3203
    add-int/lit8 v4, p1, -0x1

    neg-int v5, p2

    .line 27973
    invoke-virtual {v3, v7}, Landroid/support/v7/widget/bi;->a(I)V

    .line 27974
    invoke-virtual {v3, v5, p3}, Landroid/support/v7/widget/bi;->a(IZ)V

    .line 27975
    iput v4, v3, Landroid/support/v7/widget/bi;->b:I

    .line 3205
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v3, v6}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    goto :goto_1

    .line 3209
    :cond_2
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 28853
    add-int v3, p1, p2

    .line 28854
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 28855
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_5

    .line 28856
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 28857
    if-eqz v0, :cond_3

    .line 28858
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v4

    if-lt v4, v3, :cond_4

    .line 28864
    neg-int v4, p2

    invoke-virtual {v0, v4, p3}, Landroid/support/v7/widget/bi;->a(IZ)V

    .line 28855
    :cond_3
    :goto_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 28865
    :cond_4
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v4

    if-lt v4, p1, :cond_3

    .line 28867
    invoke-virtual {v0, v7}, Landroid/support/v7/widget/bi;->a(I)V

    .line 28868
    invoke-virtual {v2, v1}, Landroid/support/v7/widget/az;->c(I)V

    goto :goto_3

    .line 3210
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3211
    return-void
.end method

.method public final a(Landroid/support/v7/widget/al;)V
    .locals 3

    .prologue
    .line 779
    .line 12794
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    if-eqz v0, :cond_0

    .line 12795
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Landroid/support/v7/widget/bb;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/al;->b(Landroid/support/v7/widget/an;)V

    .line 12800
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_1

    .line 12801
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    invoke-virtual {v0}, Landroid/support/v7/widget/ap;->c()V

    .line 12807
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_2

    .line 12808
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->c(Landroid/support/v7/widget/az;)V

    .line 12809
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/az;)V

    .line 12812
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0}, Landroid/support/v7/widget/az;->a()V

    .line 12814
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->a()V

    .line 12815
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    .line 12816
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    .line 12817
    if-eqz p1, :cond_3

    .line 12818
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Landroid/support/v7/widget/bb;

    invoke-virtual {p1, v1}, Landroid/support/v7/widget/al;->a(Landroid/support/v7/widget/an;)V

    .line 12824
    :cond_3
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    .line 13799
    invoke-virtual {v1}, Landroid/support/v7/widget/az;->a()V

    .line 13800
    invoke-virtual {v1}, Landroid/support/v7/widget/az;->d()Landroid/support/v7/widget/ay;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/ay;->a(Landroid/support/v7/widget/al;Landroid/support/v7/widget/al;)V

    .line 12825
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 12826
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->B()V

    .line 780
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 781
    return-void
.end method

.method public final a(Landroid/support/v7/widget/ap;)V
    .locals 2

    .prologue
    .line 2406
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_0

    .line 2407
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    invoke-virtual {v0}, Landroid/support/v7/widget/ap;->c()V

    .line 2408
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/aq;)V

    .line 2410
    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    .line 2411
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_1

    .line 2412
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->ab:Landroid/support/v7/widget/aq;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/aq;)V

    .line 2414
    :cond_1
    return-void
.end method

.method public final a(Landroid/support/v7/widget/as;)V
    .locals 2

    .prologue
    .line 1161
    .line 16132
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_0

    .line 16133
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    const-string v1, "Cannot add item decoration during a scroll  or layout"

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->a(Ljava/lang/String;)V

    .line 16136
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16137
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setWillNotDraw(Z)V

    .line 16140
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16144
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->z()V

    .line 16145
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 1162
    return-void
.end method

.method public final a(Landroid/support/v7/widget/au;)V
    .locals 4

    .prologue
    .line 923
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-ne p1, v0, :cond_0

    .line 948
    :goto_0
    return-void

    .line 928
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_2

    .line 929
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    if-eqz v0, :cond_1

    .line 930
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0, p0, v1}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V

    .line 932
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/RecyclerView;)V

    .line 934
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0}, Landroid/support/v7/widget/az;->a()V

    .line 935
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    .line 14164
    iget-object v0, v1, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    .line 14395
    :goto_1
    const-wide/16 v2, 0x0

    iput-wide v2, v0, Landroid/support/v7/widget/e;->a:J

    .line 14396
    iget-object v2, v0, Landroid/support/v7/widget/e;->b:Landroid/support/v7/widget/e;

    if-eqz v2, :cond_3

    .line 14397
    iget-object v0, v0, Landroid/support/v7/widget/e;->b:Landroid/support/v7/widget/e;

    goto :goto_1

    .line 14165
    :cond_3
    iget-object v0, v1, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 14166
    iget-object v0, v1, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0}, Landroid/support/v7/widget/f;->b()V

    .line 936
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    .line 937
    if-eqz p1, :cond_5

    .line 938
    iget-object v0, p1, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_4

    .line 939
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LayoutManager "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is already attached to a RecyclerView: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 942
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/RecyclerView;)V

    .line 943
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    if-eqz v0, :cond_5

    .line 944
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->o()V

    .line 947
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/av;)V
    .locals 1

    .prologue
    .line 882
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    if-nez v0, :cond_0

    .line 883
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    .line 885
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 886
    return-void
.end method

.method public final a(Landroid/support/v7/widget/ax;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1216
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->W:Landroid/support/v7/widget/ax;

    .line 1217
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1929
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1930
    if-nez p1, :cond_0

    .line 1931
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1934
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1936
    :cond_1
    return-void
.end method

.method final a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1547
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    if-eqz v0, :cond_1

    .line 1548
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    if-eqz v0, :cond_0

    .line 1550
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->e()V

    .line 1552
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    .line 1553
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->y:Z

    .line 1555
    :cond_1
    return-void
.end method

.method public final a_(I)V
    .locals 2

    .prologue
    .line 1264
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->k()V

    .line 1265
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_0

    .line 1266
    const-string v0, "RecyclerView"

    const-string v1, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1272
    :goto_0
    return-void

    .line 1270
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/au;->b(I)V

    .line 1271
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    goto :goto_0
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 0
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
    .line 1863
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 1865
    return-void
.end method

.method public final b()Landroid/support/v7/widget/au;
    .locals 1

    .prologue
    .line 1039
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    return-object v0
.end method

.method final b(II)V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v1, 0x0

    .line 3220
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->b()I

    move-result v3

    .line 3221
    add-int v4, p1, p2

    move v2, v1

    .line 3223
    :goto_0
    if-ge v2, v3, :cond_2

    .line 3224
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v0

    .line 3225
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v5

    .line 3226
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroid/support/v7/widget/bi;->b()Z

    move-result v6

    if-nez v6, :cond_1

    .line 3229
    iget v6, v5, Landroid/support/v7/widget/bi;->b:I

    if-lt v6, p1, :cond_1

    iget v6, v5, Landroid/support/v7/widget/bi;->b:I

    if-ge v6, v4, :cond_1

    .line 3232
    invoke-virtual {v5, v7}, Landroid/support/v7/widget/bi;->a(I)V

    .line 3233
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 3234
    const/16 v6, 0x40

    invoke-virtual {v5, v6}, Landroid/support/v7/widget/bi;->a(I)V

    .line 3237
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v5, 0x1

    iput-boolean v5, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 3223
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 3240
    :cond_2
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 28896
    add-int v3, p1, p2

    .line 28897
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 28898
    :goto_1
    if-ge v1, v4, :cond_4

    .line 28899
    iget-object v0, v2, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 28900
    if-eqz v0, :cond_3

    .line 28904
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v5

    .line 28905
    if-lt v5, p1, :cond_3

    if-ge v5, v3, :cond_3

    .line 28906
    invoke-virtual {v0, v7}, Landroid/support/v7/widget/bi;->a(I)V

    .line 28898
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 3241
    :cond_4
    return-void
.end method

.method public final b(Landroid/support/v7/widget/ax;)V
    .locals 1

    .prologue
    .line 1229
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1230
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    .line 1232
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1233
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 1290
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_0

    .line 1291
    const-string v0, "RecyclerView"

    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1296
    :goto_0
    return-void

    .line 1295
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/RecyclerView;)V

    goto :goto_0
.end method

.method final c(II)V
    .locals 2

    .prologue
    .line 3620
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getScrollX()I

    move-result v0

    .line 3621
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getScrollY()I

    move-result v1

    .line 3622
    invoke-virtual {p0, v0, v1, v0, v1}, Landroid/support/v7/widget/RecyclerView;->onScrollChanged(IIII)V

    .line 3629
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Landroid/support/v7/widget/ax;

    if-eqz v0, :cond_0

    .line 3630
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Landroid/support/v7/widget/ax;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v7/widget/ax;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 3632
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 3633
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 3634
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ax;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v7/widget/ax;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 3633
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 3637
    :cond_1
    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 3068
    instance-of v0, p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/RecyclerView$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeHorizontalScrollExtent()I
    .locals 2

    .prologue
    .line 1452
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->c(Landroid/support/v7/widget/bf;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeHorizontalScrollOffset()I
    .locals 2

    .prologue
    .line 1429
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/bf;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeHorizontalScrollRange()I
    .locals 2

    .prologue
    .line 1472
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->e(Landroid/support/v7/widget/bf;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeVerticalScrollExtent()I
    .locals 2

    .prologue
    .line 1515
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->d(Landroid/support/v7/widget/bf;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeVerticalScrollOffset()I
    .locals 2

    .prologue
    .line 1494
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/bf;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public computeVerticalScrollRange()I
    .locals 2

    .prologue
    .line 1535
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->f(Landroid/support/v7/widget/bf;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d()V
    .locals 1

    .prologue
    .line 1540
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    if-nez v0, :cond_0

    .line 1541
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    .line 1542
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Z

    .line 1544
    :cond_0
    return-void
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    .prologue
    .line 8317
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    move-result v0

    return v0
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    .prologue
    .line 8322
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    move-result v0

    return v0
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    .prologue
    .line 8312
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[I)Z

    move-result v0

    return v0
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    .prologue
    .line 8306
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[I)Z

    move-result v0

    return v0
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 986
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 987
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 978
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 979
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 2997
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 2999
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v0, v1

    .line 3000
    :goto_0
    if-ge v0, v3, :cond_0

    .line 3001
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3000
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3006
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_e

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v0

    if-nez v0, :cond_e

    .line 3007
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 3008
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v0

    .line 3009
    :goto_1
    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3010
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v4

    neg-int v4, v4

    add-int/2addr v0, v4

    int-to-float v0, v0

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3011
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    .line 3012
    :goto_2
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3014
    :goto_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v3

    if-nez v3, :cond_2

    .line 3015
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 3016
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v3, :cond_1

    .line 3017
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3019
    :cond_1
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_9

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_9

    move v3, v2

    :goto_4
    or-int/2addr v0, v3

    .line 3020
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3022
    :cond_2
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v3

    if-nez v3, :cond_3

    .line 3023
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 3024
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v5

    .line 3025
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v3, :cond_a

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v3

    .line 3026
    :goto_5
    const/high16 v6, 0x42b40000    # 90.0f

    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3027
    neg-int v3, v3

    int-to-float v3, v3

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3028
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_b

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_b

    move v3, v2

    :goto_6
    or-int/2addr v0, v3

    .line 3029
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3031
    :cond_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_5

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v3

    if-nez v3, :cond_5

    .line 3032
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 3033
    const/high16 v4, 0x43340000    # 180.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3034
    iget-boolean v4, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v4, :cond_c

    .line 3035
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v5

    neg-int v5, v5

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v6

    add-int/2addr v5, v6

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3039
    :goto_7
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v4, :cond_4

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->J:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v4, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v1, v2

    :cond_4
    or-int/2addr v0, v1

    .line 3040
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3046
    :cond_5
    if-nez v0, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v1, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    invoke-virtual {v1}, Landroid/support/v7/widget/ap;->b()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 3051
    :goto_8
    if-eqz v2, :cond_6

    .line 3052
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 3054
    :cond_6
    return-void

    :cond_7
    move v0, v1

    .line 3008
    goto/16 :goto_1

    :cond_8
    move v0, v1

    .line 3011
    goto/16 :goto_2

    :cond_9
    move v3, v1

    .line 3019
    goto/16 :goto_4

    :cond_a
    move v3, v1

    .line 3025
    goto/16 :goto_5

    :cond_b
    move v3, v1

    .line 3028
    goto :goto_6

    .line 3037
    :cond_c
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_7

    :cond_d
    move v2, v0

    goto :goto_8

    :cond_e
    move v0, v1

    goto/16 :goto_3
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 1

    .prologue
    .line 3518
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v0

    return v0
.end method

.method final e(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 3573
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 3574
    iget-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    if-nez v1, :cond_0

    .line 3575
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 3590
    :goto_0
    return-object v0

    .line 3578
    :cond_0
    iget-object v2, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 3579
    invoke-virtual {v2, v4, v4, v4, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3580
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v3, v4

    .line 3581
    :goto_1
    if-ge v3, v5, :cond_1

    .line 3582
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3583
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/as;

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {v1, v6, p1}, Landroid/support/v7/widget/as;->a(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 3584
    iget v1, v2, Landroid/graphics/Rect;->left:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->left:I

    .line 3585
    iget v1, v2, Landroid/graphics/Rect;->top:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->top:I

    .line 3586
    iget v1, v2, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->right:I

    .line 3587
    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 3581
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_1

    .line 3589
    :cond_1
    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    move-object v0, v2

    .line 3590
    goto :goto_0
.end method

.method final e()V
    .locals 14

    .prologue
    const/4 v9, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 2566
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    if-nez v0, :cond_1

    .line 2567
    const-string v0, "RecyclerView"

    const-string v1, "No adapter attached; skipping layout"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2786
    :cond_0
    :goto_0
    return-void

    .line 2570
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_2

    .line 2571
    const-string v0, "RecyclerView"

    const-string v1, "No layout manager attached; skipping layout"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2574
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2575
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 2576
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()V

    .line 2578
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->y()V

    .line 2580
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-eqz v0, :cond_5

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    :goto_1
    iput-object v0, v1, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    .line 2582
    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 2584
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v1}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;)Z

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;Z)Z

    .line 2585
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->a()I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/bf;->e:I

    .line 2586
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    .line 24789
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v5

    .line 24790
    if-nez v5, :cond_6

    .line 24791
    aput v8, v4, v8

    .line 24792
    aput v8, v4, v9

    .line 2588
    :goto_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2590
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V

    .line 2591
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V

    .line 2592
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v10

    move v6, v8

    .line 2593
    :goto_3
    if-ge v6, v10, :cond_9

    .line 2594
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v1

    .line 2595
    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->b()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->k_()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2598
    :cond_3
    iget-object v5, v1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 2599
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v11, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    new-instance v0, Landroid/support/v7/widget/at;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/at;-><init>(Landroid/support/v7/widget/bi;IIII)V

    invoke-virtual {v11, v1, v0}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2593
    :cond_4
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_3

    :cond_5
    move-object v0, v7

    .line 2580
    goto/16 :goto_1

    .line 24795
    :cond_6
    const v2, 0x7fffffff

    .line 24796
    const/high16 v1, -0x80000000

    move v3, v8

    .line 24797
    :goto_4
    if-ge v3, v5, :cond_8

    .line 24798
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 24799
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->b()Z

    move-result v6

    if-nez v6, :cond_2b

    .line 24802
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v0

    .line 24803
    if-ge v0, v2, :cond_7

    move v2, v0

    .line 24806
    :cond_7
    if-le v0, v1, :cond_2b

    move v1, v2

    .line 24797
    :goto_5
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v1

    move v1, v0

    goto :goto_4

    .line 24810
    :cond_8
    aput v2, v4, v8

    .line 24811
    aput v1, v4, v9

    goto/16 :goto_2

    .line 2603
    :cond_9
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 25108
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->b()I

    move-result v1

    move v0, v8

    .line 25109
    :goto_6
    if-ge v0, v1, :cond_b

    .line 25110
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v2

    .line 25115
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->b()Z

    move-result v3

    if-nez v3, :cond_a

    .line 26000
    iget v3, v2, Landroid/support/v7/widget/bi;->c:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_a

    .line 26001
    iget v3, v2, Landroid/support/v7/widget/bi;->b:I

    iput v3, v2, Landroid/support/v7/widget/bi;->c:I

    .line 25109
    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 2612
    :cond_b
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_d

    .line 2613
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v1

    move v0, v8

    .line 2614
    :goto_7
    if-ge v0, v1, :cond_d

    .line 2615
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v2

    .line 2616
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->l()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->b()Z

    move-result v3

    if-nez v3, :cond_c

    .line 2617
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/bi;)J

    move-result-wide v4

    .line 2618
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v3, v3, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2619
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v3, v3, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v3, v2}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2614
    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 2624
    :cond_d
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->c(Landroid/support/v7/widget/bf;)Z

    move-result v0

    .line 2625
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v1, v8}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 2627
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v1, v2, v3}, Landroid/support/v7/widget/au;->c(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)V

    .line 2628
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v1, v0}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 2630
    new-instance v3, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v3}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move v1, v8

    .line 2631
    :goto_8
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v0

    if-ge v1, v0, :cond_10

    .line 2633
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v4

    .line 2634
    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->b()Z

    move-result v0

    if-nez v0, :cond_e

    move v2, v8

    .line 2637
    :goto_9
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    if-ge v2, v0, :cond_2a

    .line 2638
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v2}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 2639
    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    if-ne v0, v4, :cond_f

    move v0, v9

    .line 2644
    :goto_a
    if-nez v0, :cond_e

    .line 2645
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v6

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v10

    invoke-direct {v0, v2, v5, v6, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v3, v4, v0}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2631
    :cond_e
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_8

    .line 2637
    :cond_f
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_9

    .line 2650
    :cond_10
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->A()V

    .line 2651
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->c()V

    move-object v6, v3

    .line 2668
    :goto_b
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->a()I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/bf;->e:I

    .line 2669
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->d(Landroid/support/v7/widget/bf;)I

    .line 2672
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v8}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;Z)Z

    .line 2673
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/au;->c(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)V

    .line 2675
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v8}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 2676
    iput-object v7, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    .line 2679
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_14

    move v0, v9

    :goto_c
    invoke-static {v1, v0}, Landroid/support/v7/widget/bf;->c(Landroid/support/v7/widget/bf;Z)Z

    .line 2681
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 2683
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_15

    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move-object v10, v0

    .line 2685
    :goto_d
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v12

    move v11, v8

    .line 2686
    :goto_e
    if-ge v11, v12, :cond_17

    .line 2687
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0, v11}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v1

    .line 2688
    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->b()Z

    move-result v0

    if-nez v0, :cond_11

    .line 2691
    iget-object v5, v1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 2692
    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/bi;)J

    move-result-wide v2

    .line 2693
    if-eqz v10, :cond_16

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 2694
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0, v1}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2686
    :cond_11
    :goto_f
    add-int/lit8 v0, v11, 0x1

    move v11, v0

    goto :goto_e

    .line 2653
    :cond_12
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->A()V

    .line 2655
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->e()V

    .line 2656
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_29

    .line 2657
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v1

    move v0, v8

    .line 2658
    :goto_10
    if-ge v0, v1, :cond_29

    .line 2659
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v2

    .line 2660
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->l()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    if-nez v3, :cond_13

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->b()Z

    move-result v3

    if-nez v3, :cond_13

    .line 2661
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/bi;)J

    move-result-wide v4

    .line 2662
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v3, v3, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2663
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v3, v3, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v3, v2}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2658
    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_14
    move v0, v8

    .line 2679
    goto/16 :goto_c

    :cond_15
    move-object v10, v7

    .line 2683
    goto/16 :goto_d

    .line 2696
    :cond_16
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v13, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    new-instance v0, Landroid/support/v7/widget/at;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/at;-><init>(Landroid/support/v7/widget/bi;IIII)V

    invoke-virtual {v13, v1, v0}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    .line 2700
    :cond_17
    invoke-direct {p0, v6}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v4/util/ArrayMap;)V

    .line 2702
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    .line 2703
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_11
    if-ltz v1, :cond_19

    .line 2704
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 2705
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v2, v2, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v0}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 2706
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/at;

    .line 2707
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v2, v2, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/ArrayMap;->removeAt(I)Ljava/lang/Object;

    .line 2710
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v3, v0, Landroid/support/v7/widget/at;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/az;->b(Landroid/support/v7/widget/bi;)V

    .line 2711
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/at;)V

    .line 2703
    :cond_18
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_11

    .line 2715
    :cond_19
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    .line 2716
    if-lez v0, :cond_1f

    .line 2717
    add-int/lit8 v0, v0, -0x1

    move v11, v0

    :goto_12
    if-ltz v11, :cond_1f

    .line 2718
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v11}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/bi;

    .line 2719
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v11}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/at;

    .line 2720
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v2, v2, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2}, Landroid/support/v4/util/ArrayMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1a

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v2, v2, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    .line 2722
    :cond_1a
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v2, v2, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v11}, Landroid/support/v4/util/ArrayMap;->removeAt(I)Ljava/lang/Object;

    .line 2723
    if-eqz v6, :cond_1d

    iget-object v2, v1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v6, v2}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    move-object v3, v2

    .line 2725
    :goto_13
    iget v4, v0, Landroid/support/v7/widget/at;->b:I

    iget v5, v0, Landroid/support/v7/widget/at;->c:I

    .line 26886
    if-eqz v3, :cond_1e

    iget v0, v3, Landroid/graphics/Rect;->left:I

    if-ne v0, v4, :cond_1b

    iget v0, v3, Landroid/graphics/Rect;->top:I

    if-eq v0, v5, :cond_1e

    .line 26889
    :cond_1b
    invoke-virtual {v1, v8}, Landroid/support/v7/widget/bi;->a(Z)V

    .line 26893
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    iget v2, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/bi;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 26896
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    .line 2717
    :cond_1c
    :goto_14
    add-int/lit8 v0, v11, -0x1

    move v11, v0

    goto :goto_12

    :cond_1d
    move-object v3, v7

    .line 2723
    goto :goto_13

    .line 26902
    :cond_1e
    invoke-virtual {v1, v8}, Landroid/support/v7/widget/bi;->a(Z)V

    .line 26903
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ap;->b(Landroid/support/v7/widget/bi;)Z

    .line 26904
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    goto :goto_14

    .line 2731
    :cond_1f
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v11

    move v6, v8

    .line 2732
    :goto_15
    if-ge v6, v11, :cond_22

    .line 2733
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v6}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/bi;

    .line 2734
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v6}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/support/v7/widget/at;

    .line 2735
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/support/v7/widget/at;

    .line 2736
    if-eqz v3, :cond_21

    if-eqz v5, :cond_21

    .line 2737
    iget v0, v3, Landroid/support/v7/widget/at;->b:I

    iget v2, v5, Landroid/support/v7/widget/at;->b:I

    if-ne v0, v2, :cond_20

    iget v0, v3, Landroid/support/v7/widget/at;->c:I

    iget v2, v5, Landroid/support/v7/widget/at;->c:I

    if-eq v0, v2, :cond_21

    .line 2738
    :cond_20
    invoke-virtual {v1, v8}, Landroid/support/v7/widget/bi;->a(Z)V

    .line 2743
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    iget v2, v3, Landroid/support/v7/widget/at;->b:I

    iget v3, v3, Landroid/support/v7/widget/at;->c:I

    iget v4, v5, Landroid/support/v7/widget/at;->b:I

    iget v5, v5, Landroid/support/v7/widget/at;->c:I

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/bi;IIII)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 2745
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    .line 2732
    :cond_21
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_15

    .line 2751
    :cond_22
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_25

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    .line 2753
    :goto_16
    add-int/lit8 v0, v0, -0x1

    move v11, v0

    :goto_17
    if-ltz v11, :cond_27

    .line 2754
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v11}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 2755
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/bi;

    .line 2757
    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->b()Z

    move-result v0

    if-nez v0, :cond_24

    .line 2762
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-static {v0}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/az;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-static {v0}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/az;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 2764
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/bi;

    .line 26942
    invoke-virtual {v1, v8}, Landroid/support/v7/widget/bi;->a(Z)V

    .line 26943
    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/bi;)V

    .line 26944
    iput-object v2, v1, Landroid/support/v7/widget/bi;->g:Landroid/support/v7/widget/bi;

    .line 26945
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/az;->b(Landroid/support/v7/widget/bi;)V

    .line 26949
    iget-object v0, v1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 26950
    iget-object v0, v1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    .line 26952
    if-eqz v2, :cond_23

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->b()Z

    move-result v0

    if-eqz v0, :cond_26

    :cond_23
    move v6, v4

    move v5, v3

    .line 26961
    :goto_18
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    invoke-virtual/range {v0 .. v6}, Landroid/support/v7/widget/ap;->a(Landroid/support/v7/widget/bi;Landroid/support/v7/widget/bi;IIII)Z

    .line 26963
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    .line 2753
    :cond_24
    add-int/lit8 v0, v11, -0x1

    move v11, v0

    goto :goto_17

    :cond_25
    move v0, v8

    .line 2751
    goto :goto_16

    .line 26956
    :cond_26
    iget-object v0, v2, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v5

    .line 26957
    iget-object v0, v2, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v6

    .line 26958
    invoke-virtual {v2, v8}, Landroid/support/v7/widget/bi;->a(Z)V

    .line 26959
    iput-object v1, v2, Landroid/support/v7/widget/bi;->h:Landroid/support/v7/widget/bi;

    goto :goto_18

    .line 2770
    :cond_27
    invoke-virtual {p0, v8}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 2771
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/az;)V

    .line 2772
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget v1, v1, Landroid/support/v7/widget/bf;->e:I

    invoke-static {v0, v1}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;I)I

    .line 2773
    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    .line 2774
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v8}, Landroid/support/v7/widget/bf;->c(Landroid/support/v7/widget/bf;Z)Z

    .line 2775
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v8}, Landroid/support/v7/widget/bf;->d(Landroid/support/v7/widget/bf;Z)Z

    .line 2776
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()V

    .line 2777
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-static {v0}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/au;)Z

    .line 2778
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-static {v0}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/az;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_28

    .line 2779
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-static {v0}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/az;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2781
    :cond_28
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iput-object v7, v0, Landroid/support/v7/widget/bf;->c:Landroid/support/v4/util/ArrayMap;

    .line 2783
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    aget v0, v0, v8

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->af:[I

    aget v1, v1, v9

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/RecyclerView;->f(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2784
    invoke-virtual {p0, v8, v8}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    goto/16 :goto_0

    :cond_29
    move-object v6, v7

    goto/16 :goto_b

    :cond_2a
    move v0, v8

    goto/16 :goto_a

    :cond_2b
    move v0, v1

    move v1, v2

    goto/16 :goto_5
.end method

.method final f()V
    .locals 5

    .prologue
    .line 3244
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v1

    .line 3245
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_6

    .line 3246
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v2

    .line 3248
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->b()Z

    move-result v3

    if-nez v3, :cond_1

    .line 3251
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->j()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 3252
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3245
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3253
    :cond_2
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->k()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3254
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    iget v4, v2, Landroid/support/v7/widget/bi;->b:I

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/al;->a(I)I

    move-result v3

    .line 29106
    iget v4, v2, Landroid/support/v7/widget/bi;->e:I

    .line 3255
    if-ne v4, v3, :cond_5

    .line 3257
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->l()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()Z

    move-result v3

    if-nez v3, :cond_4

    .line 3258
    :cond_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    iget v4, v2, Landroid/support/v7/widget/bi;->b:I

    invoke-virtual {v3, v2, v4}, Landroid/support/v7/widget/al;->b(Landroid/support/v7/widget/bi;I)V

    goto :goto_1

    .line 3263
    :cond_4
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_1

    .line 3268
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3273
    :cond_6
    return-void
.end method

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 3

    .prologue
    .line 1817
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    .line 1818
    invoke-virtual {v0, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 1819
    if-nez v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v1, :cond_0

    .line 1820
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 1821
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, p2, v1, v2}, Landroid/support/v7/widget/au;->c(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)Landroid/view/View;

    move-result-object v0

    .line 1822
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 1824
    :cond_0
    if-eqz v0, :cond_1

    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 3689
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->E:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->d()Z

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

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3073
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_0

    .line 3074
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3076
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->b()Landroid/support/v7/widget/RecyclerView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3081
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_0

    .line 3082
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3084
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/widget/au;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/RecyclerView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3089
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_0

    .line 3090
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3092
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/au;->a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/RecyclerView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    .prologue
    .line 863
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_0

    .line 864
    const/4 v0, -0x1

    .line 866
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result v0

    goto :goto_0
.end method

.method protected getChildDrawingOrder(II)I
    .locals 1

    .prologue
    .line 9784
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ae:Landroid/support/v7/widget/ao;

    if-nez v0, :cond_0

    .line 9785
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result v0

    .line 9787
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ae:Landroid/support/v7/widget/ao;

    invoke-interface {v0}, Landroid/support/v7/widget/ao;->a()I

    move-result v0

    goto :goto_0
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    .prologue
    .line 8300
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->hasNestedScrollingParent()Z

    move-result v0

    return v0
.end method

.method public isAttachedToWindow()Z
    .locals 1

    .prologue
    .line 1900
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .prologue
    .line 8285
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1869
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 1870
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->F:I

    .line 1871
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    .line 1872
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    .line 1873
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_0

    .line 1874
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->o()V

    .line 1876
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->ac:Z

    .line 1877
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1881
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 1882
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    if-eqz v0, :cond_0

    .line 1883
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    invoke-virtual {v0}, Landroid/support/v7/widget/ap;->c()V

    .line 1885
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    .line 1887
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->k()V

    .line 1888
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    .line 1889
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_1

    .line 1890
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    invoke-virtual {v0, p0, v1}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V

    .line 1892
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ak:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1893
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 3058
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 3060
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 3061
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 3062
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3061
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3064
    :cond_0
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 2268
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_1

    .line 2293
    :cond_0
    :goto_0
    return v7

    .line 2271
    :cond_1
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getSource(Landroid/view/MotionEvent;)I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 2272
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    .line 2274
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2275
    const/16 v0, 0x9

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getAxisValue(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 2280
    :goto_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v2}, Landroid/support/v7/widget/au;->g()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2281
    const/16 v2, 0xa

    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getAxisValue(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 2287
    :goto_2
    cmpl-float v3, v0, v1

    if-nez v3, :cond_2

    cmpl-float v3, v2, v1

    if-eqz v3, :cond_0

    .line 22300
    :cond_2
    iget v3, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    const/4 v4, 0x1

    cmpl-float v3, v3, v4

    if-nez v3, :cond_3

    .line 22301
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 22302
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    const v5, 0x101004d

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 22304
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    .line 22311
    :cond_3
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->U:F

    .line 2289
    :cond_4
    mul-float/2addr v2, v1

    float-to-int v2, v2

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p0, v2, v0}, Landroid/support/v7/widget/RecyclerView;->scrollBy(II)V

    goto :goto_0

    :cond_5
    move v0, v1

    .line 2278
    goto :goto_1

    :cond_6
    move v2, v1

    .line 2284
    goto :goto_2
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v1, -0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 2017
    .line 20968
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 20969
    if-eq v5, v9, :cond_0

    if-nez v5, :cond_1

    .line 20970
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/aw;

    .line 20973
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v4, v3

    .line 20974
    :goto_0
    if-ge v4, v6, :cond_4

    .line 20975
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/aw;

    .line 20976
    invoke-interface {v0}, Landroid/support/v7/widget/aw;->a()Z

    move-result v7

    if-eqz v7, :cond_3

    if-eq v5, v9, :cond_3

    .line 20977
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/aw;

    move v0, v2

    .line 2017
    :goto_1
    if-eqz v0, :cond_5

    .line 2018
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 2101
    :cond_2
    :goto_2
    return v2

    .line 20974
    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_4
    move v0, v3

    .line 20981
    goto :goto_1

    .line 2022
    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->g()Z

    move-result v0

    .line 2023
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->h()Z

    move-result v4

    .line 2025
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    if-nez v5, :cond_6

    .line 2026
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v5

    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    .line 2028
    :cond_6
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v5, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2030
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v5

    .line 2031
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v6

    .line 2033
    packed-switch v5, :pswitch_data_0

    .line 2101
    :cond_7
    :goto_3
    :pswitch_0
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-eq v0, v2, :cond_2

    move v2, v3

    goto :goto_2

    .line 2035
    :pswitch_1
    invoke-static {p1, v3}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2036
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    add-float/2addr v1, v8

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2037
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    add-float/2addr v1, v8

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 2039
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    const/4 v5, 0x2

    if-ne v1, v5, :cond_8

    .line 2040
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2041
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2045
    :cond_8
    if-eqz v0, :cond_f

    move v0, v2

    .line 2048
    :goto_4
    if-eqz v4, :cond_9

    .line 2049
    or-int/lit8 v0, v0, 0x2

    .line 2051
    :cond_9
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->startNestedScroll(I)Z

    goto :goto_3

    .line 2055
    :pswitch_2
    invoke-static {p1, v6}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2056
    invoke-static {p1, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2057
    invoke-static {p1, v6}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    goto :goto_3

    .line 2061
    :pswitch_3
    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v5

    .line 2062
    if-gez v5, :cond_a

    .line 2063
    const-string v0, "RecyclerView"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error processing scroll; pointer index for id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    .line 2065
    goto/16 :goto_2

    .line 2068
    :cond_a
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v6

    add-float/2addr v6, v8

    float-to-int v6, v6

    .line 2069
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v5

    add-float/2addr v5, v8

    float-to-int v5, v5

    .line 2070
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-eq v7, v2, :cond_7

    .line 2071
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    sub-int/2addr v6, v7

    .line 2072
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    sub-int/2addr v5, v7

    .line 2074
    if-eqz v0, :cond_e

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v0, v7, :cond_e

    .line 2075
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-gez v6, :cond_c

    move v0, v1

    :goto_5
    mul-int/2addr v0, v8

    add-int/2addr v0, v7

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    move v0, v2

    .line 2078
    :goto_6
    if-eqz v4, :cond_b

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v6, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v4, v6, :cond_b

    .line 2079
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-gez v5, :cond_d

    :goto_7
    mul-int/2addr v1, v4

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    move v0, v2

    .line 2082
    :cond_b
    if-eqz v0, :cond_7

    .line 2083
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    goto/16 :goto_3

    :cond_c
    move v0, v2

    .line 2075
    goto :goto_5

    :cond_d
    move v1, v2

    .line 2079
    goto :goto_7

    .line 2089
    :pswitch_4
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 2093
    :pswitch_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2094
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->stopNestedScroll()V

    goto/16 :goto_3

    .line 2098
    :pswitch_6
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    goto/16 :goto_3

    :cond_e
    move v0, v3

    goto :goto_6

    :cond_f
    move v0, v3

    goto/16 :goto_4

    .line 2033
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 2969
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 2970
    const-string v0, "RV OnLayout"

    invoke-static {v0}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 2971
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->e()V

    .line 2972
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 2973
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 2974
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    .line 2975
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2316
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Z

    if-eqz v0, :cond_0

    .line 2317
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 2318
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->y()V

    .line 2320
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2325
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;Z)Z

    .line 2331
    :goto_0
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->A:Z

    .line 2332
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 2335
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    if-eqz v0, :cond_2

    .line 2336
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/al;

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->a()I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/bf;->e:I

    .line 2340
    :goto_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v0, :cond_3

    .line 2341
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->e(II)V

    .line 2346
    :goto_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v2}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;Z)Z

    .line 2347
    return-void

    .line 2328
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->e()V

    .line 2329
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v2}, Landroid/support/v7/widget/bf;->b(Landroid/support/v7/widget/bf;Z)Z

    goto :goto_0

    .line 2338
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iput v2, v0, Landroid/support/v7/widget/bf;->e:I

    goto :goto_1

    .line 2343
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    .line 23215
    iget-object v0, v0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    .line 24139
    invoke-direct {v0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->e(II)V

    goto :goto_2
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .prologue
    .line 966
    check-cast p1, Landroid/support/v7/widget/RecyclerView$SavedState;

    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    .line 967
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 968
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$SavedState;->a:Landroid/os/Parcelable;

    if-eqz v0, :cond_0

    .line 969
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView$SavedState;->a:Landroid/os/Parcelable;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/au;->a(Landroid/os/Parcelable;)V

    .line 971
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 952
    new-instance v0, Landroid/support/v7/widget/RecyclerView$SavedState;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/widget/RecyclerView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 953
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    if-eqz v1, :cond_0

    .line 954
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView$SavedState;->a(Landroid/support/v7/widget/RecyclerView$SavedState;Landroid/support/v7/widget/RecyclerView$SavedState;)V

    .line 961
    :goto_0
    return-object v0

    .line 955
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-eqz v1, :cond_1

    .line 956
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v1}, Landroid/support/v7/widget/au;->f()Landroid/os/Parcelable;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/widget/RecyclerView$SavedState;->a:Landroid/os/Parcelable;

    goto :goto_0

    .line 958
    :cond_1
    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/RecyclerView$SavedState;->a:Landroid/os/Parcelable;

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 2388
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 2389
    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    .line 2390
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    .line 2392
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 2116
    .line 20985
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 20986
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/aw;

    if-eqz v4, :cond_0

    .line 20987
    if-nez v0, :cond_1

    .line 20989
    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/aw;

    .line 21002
    :cond_0
    if-eqz v0, :cond_5

    .line 21003
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v4, v2

    .line 21004
    :goto_0
    if-ge v4, v5, :cond_5

    .line 21005
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/aw;

    .line 21006
    invoke-interface {v0}, Landroid/support/v7/widget/aw;->a()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 21007
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/aw;

    move v0, v3

    .line 2116
    :goto_1
    if-eqz v0, :cond_6

    .line 2117
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 2243
    :goto_2
    return v3

    .line 20992
    :cond_1
    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    if-ne v0, v3, :cond_3

    .line 20994
    :cond_2
    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/aw;

    :cond_3
    move v0, v3

    .line 20996
    goto :goto_1

    .line 21004
    :cond_4
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_5
    move v0, v2

    .line 21012
    goto :goto_1

    .line 2121
    :cond_6
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->g()Z

    move-result v5

    .line 2122
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->h()Z

    move-result v6

    .line 2124
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    if-nez v0, :cond_7

    .line 2125
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    .line 2127
    :cond_7
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2129
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v7

    .line 2130
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2131
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v4

    .line 2133
    if-nez v0, :cond_8

    .line 2134
    iget-object v8, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    iget-object v9, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    aput v2, v9, v3

    aput v2, v8, v2

    .line 2136
    :cond_8
    iget-object v8, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    aget v8, v8, v2

    int-to-float v8, v8

    iget-object v9, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    aget v9, v9, v3

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 2138
    packed-switch v0, :pswitch_data_0

    .line 2241
    :cond_9
    :goto_3
    :pswitch_0
    invoke-virtual {v7}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_2

    .line 2140
    :pswitch_1
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2141
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 2145
    if-eqz v5, :cond_22

    move v0, v3

    .line 2148
    :goto_4
    if-eqz v6, :cond_a

    .line 2149
    or-int/lit8 v0, v0, 0x2

    .line 2151
    :cond_a
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->startNestedScroll(I)Z

    goto :goto_3

    .line 2155
    :pswitch_2
    invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    .line 2156
    invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2157
    invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    goto :goto_3

    .line 2161
    :pswitch_3
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 2162
    if-gez v0, :cond_b

    .line 2163
    const-string v0, "RecyclerView"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Error processing scroll; pointer index for id "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v3, v2

    .line 2165
    goto/16 :goto_2

    .line 2168
    :cond_b
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v1

    add-float/2addr v1, v10

    float-to-int v8, v1

    .line 2169
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v9, v0

    .line 2170
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    sub-int v1, v0, v8

    .line 2171
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    sub-int/2addr v0, v9

    .line 2173
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    iget-object v10, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    invoke-virtual {p0, v1, v0, v4, v10}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedPreScroll(II[I[I)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 2174
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    aget v4, v4, v2

    sub-int/2addr v1, v4

    .line 2175
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    aget v4, v4, v3

    sub-int/2addr v0, v4

    .line 2176
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v4, v4, v2

    int-to-float v4, v4

    iget-object v10, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v10, v10, v3

    int-to-float v10, v10

    invoke-virtual {v7, v4, v10}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 2178
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    aget v10, v4, v2

    iget-object v11, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v11, v11, v2

    add-int/2addr v10, v11

    aput v10, v4, v2

    .line 2179
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->aj:[I

    aget v10, v4, v3

    iget-object v11, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v11, v11, v3

    add-int/2addr v10, v11

    aput v10, v4, v3

    .line 2182
    :cond_c
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-eq v4, v3, :cond_e

    .line 2184
    if-eqz v5, :cond_21

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v10, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v4, v10, :cond_21

    .line 2185
    if-lez v1, :cond_f

    .line 2186
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    sub-int/2addr v1, v4

    :goto_5
    move v4, v3

    .line 2192
    :goto_6
    if-eqz v6, :cond_d

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v10

    iget v11, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-le v10, v11, :cond_d

    .line 2193
    if-lez v0, :cond_10

    .line 2194
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    sub-int/2addr v0, v4

    :goto_7
    move v4, v3

    .line 2200
    :cond_d
    if-eqz v4, :cond_e

    .line 2201
    invoke-direct {p0, v3}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2205
    :cond_e
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-ne v4, v3, :cond_9

    .line 2206
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v4, v4, v2

    sub-int v4, v8, v4

    iput v4, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    .line 2207
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v4, v4, v3

    sub-int v4, v9, v4

    iput v4, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    .line 2209
    if-eqz v5, :cond_11

    :goto_8
    if-eqz v6, :cond_12

    :goto_9
    invoke-direct {p0, v1, v0, v7}, Landroid/support/v7/widget/RecyclerView;->a(IILandroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2213
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_3

    .line 2188
    :cond_f
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    add-int/2addr v1, v4

    goto :goto_5

    .line 2196
    :cond_10
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    add-int/2addr v0, v4

    goto :goto_7

    :cond_11
    move v1, v2

    .line 2209
    goto :goto_8

    :cond_12
    move v0, v2

    goto :goto_9

    .line 2219
    :pswitch_4
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 2223
    :pswitch_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    int-to-float v8, v8

    invoke-virtual {v0, v4, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 2224
    if-eqz v5, :cond_17

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {v0, v4}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v0

    neg-float v0, v0

    move v4, v0

    .line 2226
    :goto_a
    if-eqz v6, :cond_18

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->L:I

    invoke-static {v0, v5}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v0

    neg-float v0, v0

    .line 2228
    :goto_b
    cmpl-float v5, v4, v1

    if-nez v5, :cond_13

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_15

    :cond_13
    float-to-int v1, v4

    float-to-int v0, v0

    .line 21594
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v4, :cond_19

    .line 21595
    const-string v0, "RecyclerView"

    const-string v1, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_14
    move v0, v2

    .line 2228
    :goto_c
    if-nez v0, :cond_16

    .line 2229
    :cond_15
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 2232
    :cond_16
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->M:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2233
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->m()V

    goto/16 :goto_3

    :cond_17
    move v4, v1

    .line 2224
    goto :goto_a

    :cond_18
    move v0, v1

    .line 2226
    goto :goto_b

    .line 21600
    :cond_19
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->g()Z

    move-result v5

    .line 21601
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->h()Z

    move-result v6

    .line 21603
    if-eqz v5, :cond_1a

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    if-ge v4, v8, :cond_20

    :cond_1a
    move v4, v2

    .line 21606
    :goto_d
    if-eqz v6, :cond_1b

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    if-ge v1, v8, :cond_1f

    :cond_1b
    move v1, v2

    .line 21609
    :goto_e
    if-nez v4, :cond_1c

    if-eqz v1, :cond_14

    .line 21614
    :cond_1c
    int-to-float v0, v4

    int-to-float v8, v1

    invoke-virtual {p0, v0, v8}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    move-result v0

    if-nez v0, :cond_14

    .line 21615
    if-nez v5, :cond_1d

    if-eqz v6, :cond_1e

    :cond_1d
    move v0, v3

    .line 21616
    :goto_f
    int-to-float v5, v4

    int-to-float v6, v1

    invoke-virtual {p0, v5, v6, v0}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    .line 21618
    if-eqz v0, :cond_14

    .line 21619
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    neg-int v0, v0

    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 21620
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    neg-int v4, v4

    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->T:I

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 21621
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->V:Landroid/support/v7/widget/bh;

    invoke-virtual {v4, v0, v1}, Landroid/support/v7/widget/bh;->a(II)V

    move v0, v3

    .line 21622
    goto :goto_c

    :cond_1e
    move v0, v2

    .line 21615
    goto :goto_f

    .line 2237
    :pswitch_6
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    goto/16 :goto_3

    :cond_1f
    move v1, v0

    goto :goto_e

    :cond_20
    move v4, v1

    goto :goto_d

    :cond_21
    move v4, v2

    goto/16 :goto_6

    :cond_22
    move v0, v2

    goto/16 :goto_4

    .line 2138
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method protected removeDetachedView(Landroid/view/View;Z)V
    .locals 4

    .prologue
    .line 2834
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 2835
    if-eqz v0, :cond_0

    .line 2836
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2837
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->i()V

    .line 2843
    :cond_0
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/view/View;)V

    .line 2844
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 2845
    return-void

    .line 2838
    :cond_1
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2839
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Called removeDetachedView with a view which is not flagged as tmp detached."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1829
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    .line 17983
    invoke-virtual {v0}, Landroid/support/v7/widget/au;->q()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    move v0, v1

    .line 1829
    :goto_0
    if-nez v0, :cond_2

    if-eqz p2, :cond_2

    .line 1830
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v0, v2, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 1835
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1836
    instance-of v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    if-eqz v3, :cond_1

    .line 1838
    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 1839
    iget-boolean v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    if-nez v3, :cond_1

    .line 1840
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 1841
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->left:I

    .line 1842
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->right:I

    .line 1843
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->top:I

    iget v5, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->top:I

    .line 1844
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    .line 1848
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, Landroid/support/v7/widget/RecyclerView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1849
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/RecyclerView;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1850
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-nez v0, :cond_4

    move v0, v1

    :goto_1
    invoke-virtual {p0, p1, v3, v0}, Landroid/support/v7/widget/RecyclerView;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 1852
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 1853
    return-void

    :cond_3
    move v0, v2

    .line 17983
    goto :goto_0

    :cond_4
    move v0, v2

    .line 1850
    goto :goto_1
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 13

    .prologue
    .line 1857
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    .line 18935
    invoke-virtual {v3}, Landroid/support/v7/widget/au;->u()I

    move-result v4

    .line 18936
    invoke-virtual {v3}, Landroid/support/v7/widget/au;->v()I

    move-result v5

    .line 18937
    invoke-virtual {v3}, Landroid/support/v7/widget/au;->s()I

    move-result v0

    invoke-virtual {v3}, Landroid/support/v7/widget/au;->w()I

    move-result v1

    sub-int v6, v0, v1

    .line 18938
    invoke-virtual {v3}, Landroid/support/v7/widget/au;->t()I

    move-result v0

    invoke-virtual {v3}, Landroid/support/v7/widget/au;->x()I

    move-result v1

    sub-int v7, v0, v1

    .line 18939
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p2, Landroid/graphics/Rect;->left:I

    add-int v8, v0, v1

    .line 18940
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    add-int v9, v0, v1

    .line 18941
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int v10, v8, v0

    .line 18942
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v0

    add-int v11, v9, v0

    .line 18944
    const/4 v0, 0x0

    sub-int v1, v8, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 18945
    const/4 v0, 0x0

    sub-int v2, v9, v5

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 18946
    const/4 v0, 0x0

    sub-int v12, v10, v6

    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 18947
    const/4 v12, 0x0

    sub-int v7, v11, v7

    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 19913
    iget-object v3, v3, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v3

    .line 18953
    const/4 v11, 0x1

    if-ne v3, v11, :cond_3

    .line 18954
    if-eqz v0, :cond_2

    .line 18963
    :goto_0
    if-eqz v2, :cond_5

    move v1, v2

    .line 18966
    :goto_1
    if-nez v0, :cond_0

    if-eqz v1, :cond_b

    .line 18967
    :cond_0
    if-eqz p3, :cond_6

    .line 18968
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/RecyclerView;->scrollBy(II)V

    .line 18972
    :cond_1
    :goto_2
    const/4 v0, 0x1

    :goto_3
    return v0

    .line 18954
    :cond_2
    sub-int v0, v10, v6

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    .line 18957
    :cond_3
    if-eqz v1, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    sub-int v1, v8, v4

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    .line 18963
    :cond_5
    sub-int v1, v9, v5

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    .line 20564
    :cond_6
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v2, :cond_7

    .line 20565
    const-string v0, "RecyclerView"

    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 20569
    :cond_7
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v2}, Landroid/support/v7/widget/au;->g()Z

    move-result v2

    if-nez v2, :cond_8

    .line 20570
    const/4 v0, 0x0

    .line 20572
    :cond_8
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v2}, Landroid/support/v7/widget/au;->h()Z

    move-result v2

    if-nez v2, :cond_9

    .line 20573
    const/4 v1, 0x0

    .line 20575
    :cond_9
    if-nez v0, :cond_a

    if-eqz v1, :cond_1

    .line 20576
    :cond_a
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->V:Landroid/support/v7/widget/bh;

    invoke-virtual {v2, v0, v1}, Landroid/support/v7/widget/bh;->b(II)V

    goto :goto_2

    .line 18974
    :cond_b
    const/4 v0, 0x0

    .line 1857
    goto :goto_3
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 3

    .prologue
    .line 2106
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 2107
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 2108
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2107
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2111
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 2112
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 2979
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    if-nez v0, :cond_0

    .line 2980
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 2984
    :goto_0
    return-void

    .line 2982
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->y:Z

    goto :goto_0
.end method

.method public scrollBy(II)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1306
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    if-nez v1, :cond_1

    .line 1307
    const-string v0, "RecyclerView"

    const-string v1, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1316
    :cond_0
    :goto_0
    return-void

    .line 1311
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v1}, Landroid/support/v7/widget/au;->g()Z

    move-result v1

    .line 1312
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/au;

    invoke-virtual {v2}, Landroid/support/v7/widget/au;->h()Z

    move-result v2

    .line 1313
    if-nez v1, :cond_2

    if-eqz v2, :cond_0

    .line 1314
    :cond_2
    if-eqz v1, :cond_3

    :goto_1
    if-eqz v2, :cond_4

    :goto_2
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/RecyclerView;->a(IILandroid/view/MotionEvent;)Z

    goto :goto_0

    :cond_3
    move p1, v0

    goto :goto_1

    :cond_4
    move p2, v0

    goto :goto_2
.end method

.method public scrollTo(II)V
    .locals 2

    .prologue
    .line 1300
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "RecyclerView does not support scrolling to an absolute position."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 2472
    .line 24456
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 24458
    if-eqz p1, :cond_3

    .line 24459
    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->getContentChangeTypes(Landroid/view/accessibility/AccessibilityEvent;)I

    move-result v1

    .line 24461
    :goto_0
    if-nez v1, :cond_2

    .line 24464
    :goto_1
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->z:I

    .line 24465
    const/4 v0, 0x1

    .line 2472
    :cond_0
    if-eqz v0, :cond_1

    .line 2476
    :goto_2
    return-void

    .line 2475
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_2

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    move v1, v0

    goto :goto_0
.end method

.method public setClipToPadding(Z)V
    .locals 1

    .prologue
    .line 714
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eq p1, v0, :cond_0

    .line 715
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    .line 717
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    .line 718
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 719
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_1

    .line 720
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 722
    :cond_1
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .prologue
    .line 8280
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    .line 8281
    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    .prologue
    .line 8290
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/NestedScrollingChildHelper;->startNestedScroll(I)Z

    move-result v0

    return v0
.end method

.method public stopNestedScroll()V
    .locals 1

    .prologue
    .line 8295
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->stopNestedScroll()V

    .line 8296
    return-void
.end method
