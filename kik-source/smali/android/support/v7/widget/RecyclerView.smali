.class public Landroid/support/v7/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/NestedScrollingChild;
.implements Landroid/support/v4/view/ScrollingView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/RecyclerView$d;,
        Landroid/support/v7/widget/RecyclerView$h;,
        Landroid/support/v7/widget/RecyclerView$e;,
        Landroid/support/v7/widget/RecyclerView$f;,
        Landroid/support/v7/widget/RecyclerView$q;,
        Landroid/support/v7/widget/RecyclerView$SavedState;,
        Landroid/support/v7/widget/RecyclerView$b;,
        Landroid/support/v7/widget/RecyclerView$p;,
        Landroid/support/v7/widget/RecyclerView$c;,
        Landroid/support/v7/widget/RecyclerView$LayoutParams;,
        Landroid/support/v7/widget/RecyclerView$t;,
        Landroid/support/v7/widget/RecyclerView$n;,
        Landroid/support/v7/widget/RecyclerView$k;,
        Landroid/support/v7/widget/RecyclerView$j;,
        Landroid/support/v7/widget/RecyclerView$g;,
        Landroid/support/v7/widget/RecyclerView$i;,
        Landroid/support/v7/widget/RecyclerView$a;,
        Landroid/support/v7/widget/RecyclerView$r;,
        Landroid/support/v7/widget/RecyclerView$m;,
        Landroid/support/v7/widget/RecyclerView$l;,
        Landroid/support/v7/widget/RecyclerView$o;,
        Landroid/support/v7/widget/RecyclerView$s;
    }
.end annotation


# static fields
.field private static final ak:Landroid/view/animation/Interpolator;

.field private static final h:Z

.field private static final i:[Ljava/lang/Class;


# instance fields
.field private final A:Z

.field private final B:Landroid/view/accessibility/AccessibilityManager;

.field private C:Ljava/util/List;

.field private D:Z

.field private E:I

.field private F:Landroid/support/v4/widget/EdgeEffectCompat;

.field private G:Landroid/support/v4/widget/EdgeEffectCompat;

.field private H:Landroid/support/v4/widget/EdgeEffectCompat;

.field private I:Landroid/support/v4/widget/EdgeEffectCompat;

.field private J:I

.field private K:I

.field private L:Landroid/view/VelocityTracker;

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:I

.field private final R:I

.field private final S:I

.field private T:F

.field private final U:Landroid/support/v7/widget/RecyclerView$s;

.field private V:Landroid/support/v7/widget/RecyclerView$k;

.field private W:Ljava/util/List;

.field final a:Landroid/support/v7/widget/RecyclerView$m;

.field private aa:Landroid/support/v7/widget/RecyclerView$e$a;

.field private ab:Z

.field private ac:Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;

.field private ad:Landroid/support/v7/widget/RecyclerView$d;

.field private final ae:[I

.field private final af:Landroid/support/v4/view/NestedScrollingChildHelper;

.field private final ag:[I

.field private final ah:[I

.field private final ai:[I

.field private aj:Ljava/lang/Runnable;

.field b:Landroid/support/v7/widget/a;

.field c:Landroid/support/v7/widget/b;

.field d:Landroid/support/v7/widget/RecyclerView$e;

.field final e:Landroid/support/v7/widget/RecyclerView$q;

.field f:Z

.field g:Z

.field private final j:Landroid/support/v7/widget/RecyclerView$o;

.field private k:Landroid/support/v7/widget/RecyclerView$SavedState;

.field private l:Z

.field private final m:Ljava/lang/Runnable;

.field private final n:Landroid/graphics/Rect;

.field private o:Landroid/support/v7/widget/RecyclerView$a;

.field private p:Landroid/support/v7/widget/RecyclerView$i;

.field private q:Landroid/support/v7/widget/RecyclerView$n;

.field private final r:Ljava/util/ArrayList;

.field private final s:Ljava/util/ArrayList;

.field private t:Landroid/support/v7/widget/RecyclerView$j;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:I

.field private z:Z


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
    new-instance v0, Landroid/support/v7/widget/v;

    invoke-direct {v0}, Landroid/support/v7/widget/v;-><init>()V

    sput-object v0, Landroid/support/v7/widget/RecyclerView;->ak:Landroid/view/animation/Interpolator;

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
    new-instance v0, Landroid/support/v7/widget/RecyclerView$o;

    invoke-direct {v0, p0, v2}, Landroid/support/v7/widget/RecyclerView$o;-><init>(Landroid/support/v7/widget/RecyclerView;B)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->j:Landroid/support/v7/widget/RecyclerView$o;

    .line 236
    new-instance v0, Landroid/support/v7/widget/RecyclerView$m;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/RecyclerView$m;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    .line 256
    new-instance v0, Landroid/support/v7/widget/t;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/t;-><init>(Landroid/support/v7/widget/RecyclerView;)V

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
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    .line 315
    iput v2, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    .line 319
    new-instance v0, Landroid/support/v7/widget/c;

    invoke-direct {v0}, Landroid/support/v7/widget/c;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    .line 344
    iput v2, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    .line 345
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 355
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->T:F

    .line 357
    new-instance v0, Landroid/support/v7/widget/RecyclerView$s;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/RecyclerView$s;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->U:Landroid/support/v7/widget/RecyclerView$s;

    .line 359
    new-instance v0, Landroid/support/v7/widget/RecyclerView$q;

    invoke-direct {v0}, Landroid/support/v7/widget/RecyclerView$q;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    .line 365
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 366
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    .line 367
    new-instance v0, Landroid/support/v7/widget/RecyclerView$f;

    invoke-direct {v0, p0, v2}, Landroid/support/v7/widget/RecyclerView$f;-><init>(Landroid/support/v7/widget/RecyclerView;B)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aa:Landroid/support/v7/widget/RecyclerView$e$a;

    .line 369
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->ab:Z

    .line 375
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    .line 378
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    .line 379
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    .line 380
    new-array v0, v4, [I

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    .line 382
    new-instance v0, Landroid/support/v7/widget/u;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/u;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aj:Ljava/lang/Runnable;

    .line 409
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 410
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 411
    const/16 v3, 0x10

    if-lt v0, v3, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->A:Z

    .line 413
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 414
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    .line 415
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    iput v3, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    .line 416
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    .line 417
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v0

    if-ne v0, v4, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setWillNotDraw(Z)V

    .line 419
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->aa:Landroid/support/v7/widget/RecyclerView$e$a;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/RecyclerView$e;->a(Landroid/support/v7/widget/RecyclerView$e$a;)V

    .line 420
    new-instance v0, Landroid/support/v7/widget/a;

    new-instance v3, Landroid/support/v7/widget/x;

    invoke-direct {v3, p0}, Landroid/support/v7/widget/x;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    invoke-direct {v0, v3}, Landroid/support/v7/widget/a;-><init>(Landroid/support/v7/widget/a$a;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    .line 421
    new-instance v0, Landroid/support/v7/widget/b;

    new-instance v3, Landroid/support/v7/widget/w;

    invoke-direct {v3, p0}, Landroid/support/v7/widget/w;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    invoke-direct {v0, v3}, Landroid/support/v7/widget/b;-><init>(Landroid/support/v7/widget/b$b;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

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

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->B:Landroid/view/accessibility/AccessibilityManager;

    .line 430
    new-instance v0, Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 432
    if-eqz p2, :cond_1

    .line 433
    sget-object v0, Landroid/support/v7/a/a$a;->a:[I

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 436
    sget v3, Landroid/support/v7/a/a$a;->b:I

    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 437
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 438
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_4

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

    :goto_2
    :try_start_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v3, Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v5

    const/4 v3, 0x0

    :try_start_1
    sget-object v0, Landroid/support/v7/widget/RecyclerView;->i:[Ljava/lang/Class;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

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

    :goto_4
    const/4 v4, 0x1

    :try_start_2
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$i;)V
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

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

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

    .line 438
    :cond_4
    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, v0

    goto :goto_2

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

    :catch_0
    move-exception v0

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

    goto :goto_4

    :catch_1
    move-exception v1

    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/NoSuchMethodException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

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

    :catch_2
    move-exception v0

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

    :catch_3
    move-exception v0

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

    :catch_4
    move-exception v0

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

    :catch_5
    move-exception v0

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

    :catch_6
    move-exception v0

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

.method private a(Landroid/support/v4/util/ArrayMap;)V
    .locals 8

    .prologue
    .line 2900
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v7, v0, Landroid/support/v7/widget/RecyclerView$q;->d:Ljava/util/List;

    .line 2901
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v6, v0

    :goto_0
    if-ltz v6, :cond_3

    .line 2902
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    .line 2903
    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v1

    .line 2904
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$h;

    .line 2905
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2906
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2908
    :cond_0
    invoke-virtual {p1, v5}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 2909
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0, v5, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/view/View;Landroid/support/v7/widget/RecyclerView$m;)V

    .line 2901
    :goto_1
    add-int/lit8 v0, v6, -0x1

    move v6, v0

    goto :goto_0

    .line 2912
    :cond_1
    if-eqz v0, :cond_2

    .line 2913
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$h;)V

    goto :goto_1

    .line 2916
    :cond_2
    new-instance v0, Landroid/support/v7/widget/RecyclerView$h;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView$h;-><init>(Landroid/support/v7/widget/RecyclerView$t;IIII)V

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$h;)V

    goto :goto_1

    .line 2920
    :cond_3
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 2921
    return-void
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$h;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 2950
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    .line 2951
    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 2952
    iget v2, p1, Landroid/support/v7/widget/RecyclerView$h;->b:I

    .line 2953
    iget v3, p1, Landroid/support/v7/widget/RecyclerView$h;->c:I

    .line 2954
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v4

    .line 2955
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v5

    .line 2956
    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v1

    if-nez v1, :cond_2

    if-ne v2, v4, :cond_0

    if-eq v3, v5, :cond_2

    .line 2957
    :cond_0
    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 2958
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v5

    invoke-virtual {v0, v4, v5, v1, v6}, Landroid/view/View;->layout(IIII)V

    .line 2965
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView$e;->a(Landroid/support/v7/widget/RecyclerView$t;IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2967
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    .line 2979
    :cond_1
    :goto_0
    return-void

    .line 2974
    :cond_2
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 2975
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$e;->a(Landroid/support/v7/widget/RecyclerView$t;)Z

    .line 2976
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    goto :goto_0
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 998
    iget-object v2, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    .line 999
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_0

    move v0, v1

    .line 1000
    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/RecyclerView$m;->b(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 1001
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->n()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1003
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    const/4 v3, -0x1

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/support/v7/widget/b;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

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
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/b;->a(Landroid/view/View;)V

    goto :goto_1

    .line 1007
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    iget-object v1, v0, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v1, v2}, Landroid/support/v7/widget/b$b;->a(Landroid/view/View;)I

    move-result v1

    if-gez v1, :cond_3

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

    :cond_3
    iget-object v3, v0, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/b$a;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/b$a;->a(I)V

    iget-object v0, v0, Landroid/support/v7/widget/b;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
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
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 139
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView$a;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->C:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 139
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 4

    .prologue
    const/high16 v3, 0x3f000000    # 0.5f

    .line 2274
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2275
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    if-ne v1, v2, :cond_0

    .line 2277
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2278
    :goto_0
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 2279
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v1

    add-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->M:I

    .line 2280
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2282
    :cond_0
    return-void

    .line 2277
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(IILandroid/view/MotionEvent;)Z
    .locals 11

    .prologue
    .line 1350
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 1351
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 1353
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->i()V

    .line 1354
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v4, :cond_6

    .line 1355
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 1356
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    .line 1357
    const-string v4, "RV Scroll"

    invoke-static {v4}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 1358
    if-eqz p1, :cond_0

    .line 1359
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v2, p1, v3, v4}, Landroid/support/v7/widget/RecyclerView$i;->a(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v2

    .line 1360
    sub-int v3, p1, v2

    .line 1362
    :cond_0
    if-eqz p2, :cond_1

    .line 1363
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, p2, v1, v4}, Landroid/support/v7/widget/RecyclerView$i;->b(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    .line 1364
    sub-int v1, p2, v0

    .line 1366
    :cond_1
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 1367
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1369
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v4}, Landroid/support/v7/widget/b;->a()I

    move-result v6

    .line 1370
    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v6, :cond_5

    .line 1371
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v4, v5}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v7

    .line 1372
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v4

    .line 1373
    if-eqz v4, :cond_3

    iget-object v8, v4, Landroid/support/v7/widget/RecyclerView$t;->h:Landroid/support/v7/widget/RecyclerView$t;

    if-eqz v8, :cond_3

    .line 1374
    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView$t;->h:Landroid/support/v7/widget/RecyclerView$t;

    .line 1375
    if-eqz v4, :cond_4

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    .line 1376
    :goto_1
    if-eqz v4, :cond_3

    .line 1377
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    .line 1378
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v7

    .line 1379
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v9

    if-ne v8, v9, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v9

    if-eq v7, v9, :cond_3

    .line 1380
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v9, v8

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v10

    add-int/2addr v10, v7

    invoke-virtual {v4, v8, v7, v9, v10}, Landroid/view/View;->layout(IIII)V

    .line 1370
    :cond_3
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    goto :goto_0

    .line 1375
    :cond_4
    const/4 v4, 0x0

    goto :goto_1

    .line 1388
    :cond_5
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 1389
    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    :cond_6
    move v4, v1

    move v1, v2

    move v2, v0

    .line 1391
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1392
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 1395
    :cond_7
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedScroll(IIII[I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1397
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    sub-int/2addr v0, v3

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 1398
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    sub-int/2addr v0, v3

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    .line 1399
    if-eqz p3, :cond_8

    .line 1400
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v3, 0x0

    aget v0, v0, v3

    int-to-float v0, v0

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    int-to-float v3, v3

    invoke-virtual {p3, v0, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 1402
    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    const/4 v3, 0x0

    aget v4, v0, v3

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    add-int/2addr v4, v5

    aput v4, v0, v3

    .line 1403
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    const/4 v3, 0x1

    aget v4, v0, v3

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    const/4 v6, 0x1

    aget v5, v5, v6

    add-int/2addr v4, v5

    aput v4, v0, v3

    .line 1410
    :cond_9
    :goto_2
    if-nez v1, :cond_a

    if-eqz v2, :cond_b

    .line 1411
    :cond_a
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 1413
    :cond_b
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    move-result v0

    if-nez v0, :cond_c

    .line 1414
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 1416
    :cond_c
    if-nez v1, :cond_d

    if-eqz v2, :cond_15

    :cond_d
    const/4 v0, 0x1

    :goto_3
    return v0

    .line 1404
    :cond_e
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v0

    const/4 v5, 0x2

    if-eq v0, v5, :cond_9

    .line 1405
    if-eqz p3, :cond_12

    .line 1406
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    int-to-float v3, v3

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    int-to-float v4, v4

    const/4 v0, 0x0

    const/4 v7, 0x0

    cmpg-float v7, v3, v7

    if-gez v7, :cond_13

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->l()V

    iget-object v7, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

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

    if-eqz v6, :cond_f

    const/4 v0, 0x1

    :cond_f
    :goto_4
    const/4 v6, 0x0

    cmpg-float v6, v4, v6

    if-gez v6, :cond_14

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->n()V

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

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

    if-eqz v5, :cond_10

    const/4 v0, 0x1

    :cond_10
    :goto_5
    if-nez v0, :cond_11

    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-eqz v0, :cond_12

    :cond_11
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1408
    :cond_12
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    goto :goto_2

    .line 1406
    :cond_13
    const/4 v7, 0x0

    cmpl-float v7, v3, v7

    if-lez v7, :cond_f

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->m()V

    iget-object v7, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

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

    if-eqz v6, :cond_f

    const/4 v0, 0x1

    goto :goto_4

    :cond_14
    const/4 v6, 0x0

    cmpl-float v6, v4, v6

    if-lez v6, :cond_10

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->o()V

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

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

    if-eqz v5, :cond_10

    const/4 v0, 0x1

    goto :goto_5

    .line 1416
    :cond_15
    const/4 v0, 0x0

    goto/16 :goto_3
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    return v0
.end method

.method private b(Landroid/support/v7/widget/RecyclerView$t;)J
    .locals 2

    .prologue
    .line 2892
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p1, Landroid/support/v7/widget/RecyclerView$t;->d:J

    :goto_0
    return-wide v0

    :cond_0
    iget v0, p1, Landroid/support/v7/widget/RecyclerView$t;->b:I

    int-to-long v0, v0

    goto :goto_0
.end method

.method static b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;
    .locals 1

    .prologue
    .line 3378
    if-nez p0, :cond_0

    .line 3379
    const/4 v0, 0x0

    .line 3381
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    goto :goto_0
.end method

.method static synthetic b(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->c(I)V

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
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    return v0
.end method

.method private c(I)V
    .locals 2

    .prologue
    .line 1103
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    if-ne p1, v0, :cond_1

    .line 1115
    :cond_0
    return-void

    .line 1110
    :cond_1
    iput p1, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    .line 1111
    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    .line 1112
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->j()V

    .line 1114
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$i;->g(I)V

    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method private c(II)V
    .locals 2

    .prologue
    .line 1722
    const/4 v0, 0x0

    .line 1723
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_0

    if-lez p1, :cond_0

    .line 1724
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v0

    .line 1726
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_1

    if-gez p1, :cond_1

    .line 1727
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1729
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_2

    if-lez p2, :cond_2

    .line 1730
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1732
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v1

    if-nez v1, :cond_3

    if-gez p2, :cond_3

    .line 1733
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1735
    :cond_3
    if-eqz v0, :cond_4

    .line 1736
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1738
    :cond_4
    return-void
.end method

.method static synthetic c(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$i;->c(I)V

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->awakenScrollBars()Z

    :cond_0
    return-void
.end method

.method static synthetic c(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    return v0
.end method

.method static synthetic c(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 139
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->c()V

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    iget-object v3, v2, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v3, p1}, Landroid/support/v7/widget/b$b;->a(Landroid/view/View;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    iget-object v2, v2, Landroid/support/v7/widget/b;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :goto_0
    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v2

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/RecyclerView$m;->b(Landroid/support/v7/widget/RecyclerView$t;)V

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    :cond_0
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    return v0

    :cond_1
    iget-object v4, v2, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/b$a;

    invoke-virtual {v4, v3}, Landroid/support/v7/widget/b$a;->b(I)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v2, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/b$a;

    invoke-virtual {v4, v3}, Landroid/support/v7/widget/b$a;->c(I)Z

    iget-object v4, v2, Landroid/support/v7/widget/b;->c:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v2, v2, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v2, v3}, Landroid/support/v7/widget/b$b;->a(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public static d(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 3415
    invoke-static {p0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 3416
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private d(II)V
    .locals 4

    .prologue
    .line 2374
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 2375
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 2376
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 2377
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2379
    sparse-switch v2, :sswitch_data_0

    .line 2389
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getMinimumWidth(Landroid/view/View;)I

    move-result v1

    .line 2393
    :sswitch_0
    sparse-switch v3, :sswitch_data_1

    .line 2400
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getMinimumHeight(Landroid/view/View;)I

    move-result v0

    .line 2404
    :sswitch_1
    invoke-virtual {p0, v1, v0}, Landroid/support/v7/widget/RecyclerView;->setMeasuredDimension(II)V

    .line 2405
    return-void

    .line 2379
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_0
    .end sparse-switch

    .line 2393
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic d(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->ab:Z

    return v0
.end method

.method static synthetic e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    return-object v0
.end method

.method private e(II)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 2855
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v2}, Landroid/support/v7/widget/b;->a()I

    move-result v3

    .line 2856
    if-nez v3, :cond_2

    .line 2857
    if-nez p1, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    move v0, v1

    .line 2869
    :cond_1
    :goto_0
    return v0

    :cond_2
    move v2, v0

    .line 2859
    :goto_1
    if-ge v2, v3, :cond_1

    .line 2860
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v4, v2}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v4

    .line 2861
    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v5

    if-nez v5, :cond_4

    .line 2862
    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    .line 2865
    if-lt v4, p1, :cond_3

    if-le v4, p2, :cond_4

    :cond_3
    move v0, v1

    .line 2866
    goto :goto_0

    .line 2859
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method static synthetic f(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->i()V

    return-void
.end method

.method private f(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 5502
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 5503
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 5505
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView$a;->b(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 5507
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 5508
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 5509
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 5510
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->C:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5509
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 5513
    :cond_1
    return-void
.end method

.method static synthetic g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    return-object v0
.end method

.method static synthetic g()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 139
    sget-object v0, Landroid/support/v7/widget/RecyclerView;->ak:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method static synthetic h(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    return-void
.end method

.method static synthetic h()Z
    .locals 1

    .prologue
    .line 139
    sget-boolean v0, Landroid/support/v7/widget/RecyclerView;->h:Z

    return v0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 1335
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->m:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1336
    return-void
.end method

.method static synthetic i(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()Z

    move-result v0

    return v0
.end method

.method private j()V
    .locals 1

    .prologue
    .line 1651
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->U:Landroid/support/v7/widget/RecyclerView$s;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$s;->b()V

    .line 1652
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_0

    .line 1653
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->w()V

    .line 1655
    :cond_0
    return-void
.end method

.method static synthetic j(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

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
    .locals 2

    .prologue
    .line 1711
    const/4 v0, 0x0

    .line 1712
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v0

    .line 1713
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1714
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1715
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v1

    or-int/2addr v0, v1

    .line 1716
    :cond_3
    if-eqz v0, :cond_4

    .line 1717
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1719
    :cond_4
    return-void
.end method

.method private l()V
    .locals 4

    .prologue
    .line 1763
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1773
    :goto_0
    return-void

    .line 1766
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1767
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1768
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

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

    .line 1771
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
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
    .locals 4

    .prologue
    .line 1776
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1786
    :goto_0
    return-void

    .line 1779
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1780
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1781
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

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

    .line 1784
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
.end method

.method static synthetic m(Landroid/support/v7/widget/RecyclerView;)V
    .locals 6

    .prologue
    const/16 v5, 0x200

    const/4 v0, 0x0

    .line 139
    iget-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v1}, Landroid/support/v7/widget/b;->b()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/b;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v5}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v1, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_3

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    return-void
.end method

.method static synthetic n(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->B:Landroid/view/accessibility/AccessibilityManager;

    return-object v0
.end method

.method private n()V
    .locals 4

    .prologue
    .line 1789
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1800
    :goto_0
    return-void

    .line 1792
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1793
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1794
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

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

    .line 1797
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
.end method

.method static synthetic o(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ac:Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;

    return-object v0
.end method

.method private o()V
    .locals 4

    .prologue
    .line 1803
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 1813
    :goto_0
    return-void

    .line 1806
    :cond_0
    new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1807
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_1

    .line 1808
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

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

    .line 1811
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    goto :goto_0
.end method

.method static synthetic p(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$n;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->q:Landroid/support/v7/widget/RecyclerView$n;

    return-object v0
.end method

.method private p()V
    .locals 1

    .prologue
    .line 1816
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 1817
    return-void
.end method

.method private q()V
    .locals 1

    .prologue
    .line 2265
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2266
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2268
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->stopNestedScroll()V

    .line 2269
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->k()V

    .line 2270
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->c(I)V

    .line 2271
    return-void
.end method

.method static synthetic q(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    return v0
.end method

.method static synthetic r(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$s;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->U:Landroid/support/v7/widget/RecyclerView$s;

    return-object v0
.end method

.method private r()V
    .locals 1

    .prologue
    .line 2438
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    .line 2439
    return-void
.end method

.method private s()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 2442
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    .line 2443
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    if-gtz v0, :cond_0

    .line 2448
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    .line 2449
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->y:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->y:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->B:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->B:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    const/16 v2, 0x800

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-static {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->setContentChangeTypes(Landroid/view/accessibility/AccessibilityEvent;I)V

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2451
    :cond_0
    return-void
.end method

.method private t()Z
    .locals 1

    .prologue
    .line 2484
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private u()Z
    .locals 1

    .prologue
    .line 2532
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private v()V
    .locals 1

    .prologue
    .line 2540
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->ab:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    if-eqz v0, :cond_0

    .line 2541
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aj:Ljava/lang/Runnable;

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 2542
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->ab:Z

    .line 2544
    :cond_0
    return-void
.end method

.method private w()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 2557
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-eqz v0, :cond_0

    .line 2560
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->a()V

    .line 2561
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->z()V

    .line 2562
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->a()V

    .line 2567
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2568
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->b()V

    .line 2572
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

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_2
    move v0, v2

    .line 2574
    :goto_1
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v3, :cond_7

    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-nez v3, :cond_3

    if-nez v0, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView$i;)Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_3
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_4
    move v3, v2

    :goto_2
    invoke-static {v4, v3}, Landroid/support/v7/widget/RecyclerView$q;->c(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2578
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v4

    if-eqz v4, :cond_9

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->d()Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    :goto_3
    if-eqz v0, :cond_9

    :goto_4
    invoke-static {v3, v2}, Landroid/support/v7/widget/RecyclerView$q;->d(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2581
    return-void

    .line 2570
    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->e()V

    goto :goto_0

    :cond_6
    move v0, v1

    .line 2572
    goto :goto_1

    :cond_7
    move v3, v1

    .line 2574
    goto :goto_2

    :cond_8
    move v0, v1

    .line 2578
    goto :goto_3

    :cond_9
    move v2, v1

    goto :goto_4
.end method

.method private x()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 3027
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->b()I

    move-result v3

    move v2, v1

    .line 3028
    :goto_0
    if-ge v2, v3, :cond_0

    .line 3029
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/b;->c(I)Landroid/view/View;

    move-result-object v0

    .line 3030
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 3028
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 3032
    :cond_0
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_1
    if-ge v1, v3, :cond_2

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_1

    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 3033
    :cond_2
    return-void
.end method

.method private y()V
    .locals 4

    .prologue
    .line 3162
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->b()I

    move-result v1

    .line 3163
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 3164
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/b;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v2

    .line 3165
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v3

    if-nez v3, :cond_0

    .line 3166
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->a()V

    .line 3163
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3169
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$m;->e()V

    .line 3170
    return-void
.end method

.method private z()V
    .locals 6

    .prologue
    const/4 v5, 0x6

    const/4 v0, 0x0

    .line 3335
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v1}, Landroid/support/v7/widget/b;->b()I

    move-result v2

    move v1, v0

    .line 3336
    :goto_0
    if-ge v1, v2, :cond_1

    .line 3337
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/b;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v3

    .line 3338
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 3339
    invoke-virtual {v3, v5}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    .line 3336
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3342
    :cond_1
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    .line 3343
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v1, v2, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v1, :cond_3

    iget-object v1, v2, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_4

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$m;->c()V

    .line 3344
    :cond_4
    return-void
.end method


# virtual methods
.method public final a()Landroid/support/v7/widget/RecyclerView$a;
    .locals 1

    .prologue
    .line 836
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    return-object v0
.end method

.method public final a(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;
    .locals 3

    .prologue
    .line 3369
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 3370
    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    .line 3371
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

    .line 3374
    :cond_0
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1298
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_0

    .line 1299
    const-string v0, "RecyclerView"

    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1304
    :goto_0
    return-void

    .line 1303
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0, p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView;I)V

    goto :goto_0
.end method

.method final a(II)V
    .locals 2

    .prologue
    .line 1741
    if-gez p1, :cond_4

    .line 1742
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->l()V

    .line 1743
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    neg-int v1, p1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    .line 1749
    :cond_0
    :goto_0
    if-gez p2, :cond_5

    .line 1750
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->n()V

    .line 1751
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    neg-int v1, p2

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    .line 1757
    :cond_1
    :goto_1
    if-nez p1, :cond_2

    if-eqz p2, :cond_3

    .line 1758
    :cond_2
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1760
    :cond_3
    return-void

    .line 1744
    :cond_4
    if-lez p1, :cond_0

    .line 1745
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->m()V

    .line 1746
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    goto :goto_0

    .line 1752
    :cond_5
    if-lez p2, :cond_1

    .line 1753
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->o()V

    .line 1754
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0, p2}, Landroid/support/v4/widget/EdgeEffectCompat;->onAbsorb(I)Z

    goto :goto_1
.end method

.method final a(IIZ)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, 0x1

    .line 3225
    add-int v1, p1, p2

    .line 3226
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->b()I

    move-result v2

    .line 3227
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    .line 3228
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/b;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v3

    .line 3229
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v4

    if-nez v4, :cond_0

    .line 3230
    iget v4, v3, Landroid/support/v7/widget/RecyclerView$t;->b:I

    if-lt v4, v1, :cond_1

    .line 3236
    neg-int v4, p2

    invoke-virtual {v3, v4, p3}, Landroid/support/v7/widget/RecyclerView$t;->a(IZ)V

    .line 3237
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v3, v6}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 3227
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3238
    :cond_1
    iget v4, v3, Landroid/support/v7/widget/RecyclerView$t;->b:I

    if-lt v4, p1, :cond_0

    .line 3243
    add-int/lit8 v4, p1, -0x1

    neg-int v5, p2

    invoke-virtual {v3, v7}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    invoke-virtual {v3, v5, p3}, Landroid/support/v7/widget/RecyclerView$t;->a(IZ)V

    iput v4, v3, Landroid/support/v7/widget/RecyclerView$t;->b:I

    .line 3245
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v3, v6}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    goto :goto_1

    .line 3249
    :cond_2
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    add-int v3, p1, p2

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_5

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    if-lt v4, v3, :cond_4

    neg-int v4, p2

    invoke-virtual {v0, v4, p3}, Landroid/support/v7/widget/RecyclerView$t;->a(IZ)V

    :cond_3
    :goto_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    if-lt v4, p1, :cond_3

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/RecyclerView$m;->c(I)V

    goto :goto_3

    .line 3250
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3251
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$a;)V
    .locals 3

    .prologue
    .line 779
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Landroid/support/v7/widget/RecyclerView$o;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$a;->b(Landroid/support/v7/widget/RecyclerView$c;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$e;->c()V

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->c(Landroid/support/v7/widget/RecyclerView$m;)V

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->b(Landroid/support/v7/widget/RecyclerView$m;)V

    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$m;->a()V

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->a()V

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz p1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->j:Landroid/support/v7/widget/RecyclerView$o;

    invoke-virtual {p1, v1}, Landroid/support/v7/widget/RecyclerView$a;->a(Landroid/support/v7/widget/RecyclerView$c;)V

    :cond_3
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$m;->a()V

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$m;->d()Landroid/support/v7/widget/RecyclerView$l;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/RecyclerView$l;->a(Landroid/support/v7/widget/RecyclerView$a;Landroid/support/v7/widget/RecyclerView$a;)V

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->z()V

    .line 780
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 781
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$g;)V
    .locals 2

    .prologue
    .line 1161
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    const-string v1, "Cannot add item decoration during a scroll  or layout"

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setWillNotDraw(Z)V

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->x()V

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 1162
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$i;)V
    .locals 4

    .prologue
    .line 923
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-ne p1, v0, :cond_0

    .line 948
    :goto_0
    return-void

    .line 928
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_2

    .line 929
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    if-eqz v0, :cond_1

    .line 930
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0, p0, v1}, Landroid/support/v7/widget/RecyclerView$i;->b(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$m;)V

    .line 932
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView;)V

    .line 934
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$m;->a()V

    .line 935
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    iget-object v0, v1, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/b$a;

    :goto_1
    const-wide/16 v2, 0x0

    iput-wide v2, v0, Landroid/support/v7/widget/b$a;->a:J

    iget-object v2, v0, Landroid/support/v7/widget/b$a;->b:Landroid/support/v7/widget/b$a;

    if-eqz v2, :cond_3

    iget-object v0, v0, Landroid/support/v7/widget/b$a;->b:Landroid/support/v7/widget/b$a;

    goto :goto_1

    :cond_3
    iget-object v0, v1, Landroid/support/v7/widget/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, v1, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v0}, Landroid/support/v7/widget/b$b;->b()V

    .line 936
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    .line 937
    if-eqz p1, :cond_5

    .line 938
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

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

    iget-object v2, p1, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 942
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView;)V

    .line 943
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    if-eqz v0, :cond_5

    .line 944
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->m()V

    .line 947
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$k;)V
    .locals 1

    .prologue
    .line 1229
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1230
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    .line 1232
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1233
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1939
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1940
    if-nez p1, :cond_0

    .line 1941
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1944
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1946
    :cond_1
    return-void
.end method

.method final a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1557
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-eqz v0, :cond_1

    .line 1558
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v0, :cond_0

    .line 1560
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 1562
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    .line 1563
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    .line 1565
    :cond_1
    return-void
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 0

    .prologue
    .line 1872
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 1875
    return-void
.end method

.method public final b()Landroid/support/v7/widget/RecyclerView$i;
    .locals 1

    .prologue
    .line 1039
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    return-object v0
.end method

.method final b(I)V
    .locals 2

    .prologue
    .line 3660
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getScrollX()I

    move-result v0

    .line 3661
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getScrollY()I

    move-result v1

    .line 3662
    invoke-virtual {p0, v0, v1, v0, v1}, Landroid/support/v7/widget/RecyclerView;->onScrollChanged(IIII)V

    .line 3665
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->V:Landroid/support/v7/widget/RecyclerView$k;

    if-eqz v0, :cond_0

    .line 3670
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->V:Landroid/support/v7/widget/RecyclerView$k;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$k;->a(I)V

    .line 3672
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 3673
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 3674
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->W:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$k;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$k;->a(I)V

    .line 3673
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 3677
    :cond_1
    return-void
.end method

.method final b(II)V
    .locals 7

    .prologue
    const/4 v6, 0x2

    .line 3260
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->b()I

    move-result v2

    .line 3261
    add-int v3, p1, p2

    .line 3263
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 3264
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/b;->c(I)Landroid/view/View;

    move-result-object v0

    .line 3265
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v4

    .line 3266
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v5

    if-nez v5, :cond_1

    .line 3267
    iget v5, v4, Landroid/support/v7/widget/RecyclerView$t;->b:I

    if-lt v5, p1, :cond_1

    iget v5, v4, Landroid/support/v7/widget/RecyclerView$t;->b:I

    if-ge v5, v3, :cond_1

    .line 3272
    invoke-virtual {v4, v6}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    .line 3273
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 3274
    const/16 v5, 0x40

    invoke-virtual {v4, v5}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    .line 3277
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v4, 0x1

    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 3263
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 3280
    :cond_2
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    add-int v3, p1, p2

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_4

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    if-lt v4, p1, :cond_3

    if-ge v4, v3, :cond_3

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/RecyclerView$m;->c(I)V

    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 3281
    :cond_4
    return-void
.end method

.method public c(Landroid/view/View;)I
    .locals 8

    .prologue
    const/4 v2, -0x1

    .line 3400
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 3401
    if-eqz v0, :cond_6

    iget-object v1, v0, Landroid/support/v7/widget/RecyclerView$t;->i:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_6

    iget-object v1, v0, Landroid/support/v7/widget/RecyclerView$t;->i:Landroid/support/v7/widget/RecyclerView;

    const/16 v3, 0x20c

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/RecyclerView$t;->a(I)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->l()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    move v1, v2

    :cond_1
    :goto_0
    return v1

    :cond_2
    iget-object v4, v1, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    iget v1, v0, Landroid/support/v7/widget/RecyclerView$t;->b:I

    iget-object v0, v4, Landroid/support/v7/widget/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v0, 0x0

    move v3, v0

    :goto_1
    if-ge v3, v5, :cond_1

    iget-object v0, v4, Landroid/support/v7/widget/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/a$b;

    iget v6, v0, Landroid/support/v7/widget/a$b;->a:I

    packed-switch v6, :pswitch_data_0

    :cond_3
    :goto_2
    :pswitch_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :pswitch_1
    iget v6, v0, Landroid/support/v7/widget/a$b;->b:I

    if-gt v6, v1, :cond_3

    iget v0, v0, Landroid/support/v7/widget/a$b;->c:I

    add-int/2addr v1, v0

    goto :goto_2

    :pswitch_2
    iget v6, v0, Landroid/support/v7/widget/a$b;->b:I

    if-gt v6, v1, :cond_3

    iget v6, v0, Landroid/support/v7/widget/a$b;->b:I

    iget v7, v0, Landroid/support/v7/widget/a$b;->c:I

    add-int/2addr v6, v7

    if-gt v6, v1, :cond_6

    iget v0, v0, Landroid/support/v7/widget/a$b;->c:I

    sub-int/2addr v1, v0

    goto :goto_2

    :pswitch_3
    iget v6, v0, Landroid/support/v7/widget/a$b;->b:I

    if-ne v6, v1, :cond_4

    iget v1, v0, Landroid/support/v7/widget/a$b;->c:I

    goto :goto_2

    :cond_4
    iget v6, v0, Landroid/support/v7/widget/a$b;->b:I

    if-ge v6, v1, :cond_5

    add-int/lit8 v1, v1, -0x1

    :cond_5
    iget v0, v0, Landroid/support/v7/widget/a$b;->c:I

    if-gt v0, v1, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    move v1, v2

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method final c()V
    .locals 1

    .prologue
    .line 1550
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-nez v0, :cond_0

    .line 1551
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    .line 1552
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    .line 1554
    :cond_0
    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 3108
    instance-of v0, p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView$LayoutParams;)Z

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
    .line 1462
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->c(Landroid/support/v7/widget/RecyclerView$q;)I

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
    .line 1439
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView$q;)I

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
    .line 1482
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->e(Landroid/support/v7/widget/RecyclerView$q;)I

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
    .line 1525
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->d(Landroid/support/v7/widget/RecyclerView$q;)I

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
    .line 1504
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->b(Landroid/support/v7/widget/RecyclerView$q;)I

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
    .line 1545
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->f(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d()V
    .locals 14

    .prologue
    const/4 v9, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 2606
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-nez v0, :cond_1

    .line 2607
    const-string v0, "RecyclerView"

    const-string v1, "No adapter attached; skipping layout"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2826
    :cond_0
    :goto_0
    return-void

    .line 2610
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_2

    .line 2611
    const-string v0, "RecyclerView"

    const-string v1, "No layout manager attached; skipping layout"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2614
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2615
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 2616
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->r()V

    .line 2618
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()V

    .line 2620
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    if-eqz v0, :cond_5

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    :goto_1
    iput-object v0, v1, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    .line 2622
    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->g:Z

    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 2624
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2625
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/RecyclerView$q;->e:I

    .line 2626
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v5

    if-nez v5, :cond_6

    aput v8, v4, v8

    aput v8, v4, v9

    .line 2628
    :goto_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2630
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V

    .line 2631
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V

    .line 2632
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v10

    move v6, v8

    .line 2633
    :goto_3
    if-ge v6, v10, :cond_9

    .line 2634
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v1

    .line 2635
    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2636
    :cond_3
    iget-object v5, v1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    .line 2639
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v11, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    new-instance v0, Landroid/support/v7/widget/RecyclerView$h;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView$h;-><init>(Landroid/support/v7/widget/RecyclerView$t;IIII)V

    invoke-virtual {v11, v1, v0}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2633
    :cond_4
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_3

    :cond_5
    move-object v0, v7

    .line 2620
    goto/16 :goto_1

    .line 2626
    :cond_6
    const v2, 0x7fffffff

    const/high16 v1, -0x80000000

    move v3, v8

    :goto_4
    if-ge v3, v5, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v6

    if-nez v6, :cond_2b

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v0

    if-ge v0, v2, :cond_7

    move v2, v0

    :cond_7
    if-le v0, v1, :cond_2b

    move v1, v2

    :goto_5
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v1

    move v1, v0

    goto :goto_4

    :cond_8
    aput v2, v4, v8

    aput v1, v4, v9

    goto/16 :goto_2

    .line 2643
    :cond_9
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 2650
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->b()I

    move-result v1

    move v0, v8

    :goto_6
    if-ge v0, v1, :cond_b

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/b;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v3

    if-nez v3, :cond_a

    iget v3, v2, Landroid/support/v7/widget/RecyclerView$t;->c:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_a

    iget v3, v2, Landroid/support/v7/widget/RecyclerView$t;->b:I

    iput v3, v2, Landroid/support/v7/widget/RecyclerView$t;->c:I

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 2652
    :cond_b
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_d

    .line 2653
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v1

    move v0, v8

    .line 2654
    :goto_7
    if-ge v0, v1, :cond_d

    .line 2655
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v2

    .line 2656
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v3

    if-nez v3, :cond_c

    .line 2657
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView$t;)J

    move-result-wide v4

    .line 2658
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2659
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v3, v2}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2654
    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 2664
    :cond_d
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->c(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v0

    .line 2665
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v1, v8}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2667
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v1, v2, v3}, Landroid/support/v7/widget/RecyclerView$i;->c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)V

    .line 2668
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v1, v0}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2670
    new-instance v3, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v3}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move v1, v8

    .line 2671
    :goto_8
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v0

    if-ge v1, v0, :cond_10

    .line 2673
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v4

    .line 2674
    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v0

    if-nez v0, :cond_e

    move v2, v8

    .line 2675
    :goto_9
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    if-ge v2, v0, :cond_2a

    .line 2678
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v2}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 2679
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    if-ne v0, v4, :cond_f

    move v0, v9

    .line 2684
    :goto_a
    if-nez v0, :cond_e

    .line 2685
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

    .line 2671
    :cond_e
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_8

    .line 2677
    :cond_f
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_9

    .line 2690
    :cond_10
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->y()V

    .line 2691
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->c()V

    move-object v6, v3

    .line 2708
    :goto_b
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/RecyclerView$q;->e:I

    .line 2709
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->d(Landroid/support/v7/widget/RecyclerView$q;)I

    .line 2712
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0, v8}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2713
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$i;->c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)V

    .line 2715
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0, v8}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2716
    iput-object v7, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    .line 2719
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v0, :cond_14

    move v0, v9

    :goto_c
    invoke-static {v1, v0}, Landroid/support/v7/widget/RecyclerView$q;->c(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2721
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 2723
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_15

    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move-object v10, v0

    .line 2725
    :goto_d
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v12

    move v11, v8

    .line 2726
    :goto_e
    if-ge v11, v12, :cond_17

    .line 2727
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0, v11}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v1

    .line 2728
    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v0

    if-nez v0, :cond_11

    .line 2729
    iget-object v5, v1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    .line 2732
    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView$t;)J

    move-result-wide v2

    .line 2733
    if-eqz v10, :cond_16

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 2734
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0, v1}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2726
    :cond_11
    :goto_f
    add-int/lit8 v0, v11, 0x1

    move v11, v0

    goto :goto_e

    .line 2693
    :cond_12
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->y()V

    .line 2695
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->e()V

    .line 2696
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_29

    .line 2697
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v1

    move v0, v8

    .line 2698
    :goto_10
    if-ge v0, v1, :cond_29

    .line 2699
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v2

    .line 2700
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_13

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v3

    if-nez v3, :cond_13

    .line 2701
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView$t;)J

    move-result-wide v4

    .line 2702
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2703
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v3, v2}, Landroid/support/v4/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2698
    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_14
    move v0, v8

    .line 2719
    goto/16 :goto_c

    :cond_15
    move-object v10, v7

    .line 2723
    goto/16 :goto_d

    .line 2736
    :cond_16
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v13, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    new-instance v0, Landroid/support/v7/widget/RecyclerView$h;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView$h;-><init>(Landroid/support/v7/widget/RecyclerView$t;IIII)V

    invoke-virtual {v13, v1, v0}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    .line 2740
    :cond_17
    invoke-direct {p0, v6}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v4/util/ArrayMap;)V

    .line 2742
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    .line 2743
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_11
    if-ltz v1, :cond_19

    .line 2744
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 2745
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v0}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 2746
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$h;

    .line 2747
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/ArrayMap;->removeAt(I)Ljava/lang/Object;

    .line 2749
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v3, v0, Landroid/support/v7/widget/RecyclerView$h;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView$m;->b(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 2751
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$h;)V

    .line 2743
    :cond_18
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_11

    .line 2755
    :cond_19
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    .line 2756
    if-lez v0, :cond_1f

    .line 2757
    add-int/lit8 v0, v0, -0x1

    move v11, v0

    :goto_12
    if-ltz v11, :cond_1f

    .line 2758
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v11}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$t;

    .line 2759
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v11}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$h;

    .line 2760
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2}, Landroid/support/v4/util/ArrayMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1a

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    .line 2762
    :cond_1a
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2, v11}, Landroid/support/v4/util/ArrayMap;->removeAt(I)Ljava/lang/Object;

    .line 2763
    if-eqz v6, :cond_1d

    iget-object v2, v1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v6, v2}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    move-object v3, v2

    .line 2765
    :goto_13
    iget v4, v0, Landroid/support/v7/widget/RecyclerView$h;->b:I

    iget v5, v0, Landroid/support/v7/widget/RecyclerView$h;->c:I

    if-eqz v3, :cond_1e

    iget v0, v3, Landroid/graphics/Rect;->left:I

    if-ne v0, v4, :cond_1b

    iget v0, v3, Landroid/graphics/Rect;->top:I

    if-eq v0, v5, :cond_1e

    :cond_1b
    invoke-virtual {v1, v8}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    iget v2, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView$e;->a(Landroid/support/v7/widget/RecyclerView$t;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    .line 2757
    :cond_1c
    :goto_14
    add-int/lit8 v0, v11, -0x1

    move v11, v0

    goto :goto_12

    :cond_1d
    move-object v3, v7

    .line 2763
    goto :goto_13

    .line 2765
    :cond_1e
    invoke-virtual {v1, v8}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$e;->b(Landroid/support/v7/widget/RecyclerView$t;)Z

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    goto :goto_14

    .line 2771
    :cond_1f
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v11

    move v6, v8

    .line 2772
    :goto_15
    if-ge v6, v11, :cond_22

    .line 2773
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v6}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$t;

    .line 2774
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->b:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v6}, Landroid/support/v4/util/ArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/support/v7/widget/RecyclerView$h;

    .line 2775
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->a:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/support/v7/widget/RecyclerView$h;

    .line 2776
    if-eqz v3, :cond_21

    if-eqz v5, :cond_21

    .line 2777
    iget v0, v3, Landroid/support/v7/widget/RecyclerView$h;->b:I

    iget v2, v5, Landroid/support/v7/widget/RecyclerView$h;->b:I

    if-ne v0, v2, :cond_20

    iget v0, v3, Landroid/support/v7/widget/RecyclerView$h;->c:I

    iget v2, v5, Landroid/support/v7/widget/RecyclerView$h;->c:I

    if-eq v0, v2, :cond_21

    .line 2778
    :cond_20
    invoke-virtual {v1, v8}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 2783
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    iget v2, v3, Landroid/support/v7/widget/RecyclerView$h;->b:I

    iget v3, v3, Landroid/support/v7/widget/RecyclerView$h;->c:I

    iget v4, v5, Landroid/support/v7/widget/RecyclerView$h;->b:I

    iget v5, v5, Landroid/support/v7/widget/RecyclerView$h;->c:I

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/RecyclerView$e;->a(Landroid/support/v7/widget/RecyclerView$t;IIII)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 2785
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    .line 2772
    :cond_21
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_15

    .line 2791
    :cond_22
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_25

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->size()I

    move-result v0

    .line 2793
    :goto_16
    add-int/lit8 v0, v0, -0x1

    move v11, v0

    :goto_17
    if-ltz v11, :cond_27

    .line 2794
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0, v11}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 2795
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$t;

    .line 2796
    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v0

    if-nez v0, :cond_24

    .line 2798
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$m;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$m;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 2804
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v1, v8}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    iput-object v2, v1, Landroid/support/v7/widget/RecyclerView$t;->g:Landroid/support/v7/widget/RecyclerView$t;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$m;->b(Landroid/support/v7/widget/RecyclerView$t;)V

    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    if-eqz v2, :cond_23

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v0

    if-eqz v0, :cond_26

    :cond_23
    move v6, v4

    move v5, v3

    :goto_18
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    invoke-virtual/range {v0 .. v6}, Landroid/support/v7/widget/RecyclerView$e;->a(Landroid/support/v7/widget/RecyclerView$t;Landroid/support/v7/widget/RecyclerView$t;IIII)Z

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->v()V

    .line 2793
    :cond_24
    add-int/lit8 v0, v11, -0x1

    move v11, v0

    goto :goto_17

    :cond_25
    move v0, v8

    .line 2791
    goto :goto_16

    .line 2804
    :cond_26
    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v5

    iget-object v0, v2, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v6

    invoke-virtual {v2, v8}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    iput-object v1, v2, Landroid/support/v7/widget/RecyclerView$t;->h:Landroid/support/v7/widget/RecyclerView$t;

    goto :goto_18

    .line 2810
    :cond_27
    invoke-virtual {p0, v8}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 2811
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->b(Landroid/support/v7/widget/RecyclerView$m;)V

    .line 2812
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget v1, v1, Landroid/support/v7/widget/RecyclerView$q;->e:I

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;I)I

    .line 2813
    iput-boolean v8, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

    .line 2814
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0, v8}, Landroid/support/v7/widget/RecyclerView$q;->c(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2815
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0, v8}, Landroid/support/v7/widget/RecyclerView$q;->d(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2816
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->s()V

    .line 2817
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$i;->b(Landroid/support/v7/widget/RecyclerView$i;)Z

    .line 2818
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$m;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_28

    .line 2819
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$m;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2821
    :cond_28
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iput-object v7, v0, Landroid/support/v7/widget/RecyclerView$q;->c:Landroid/support/v4/util/ArrayMap;

    .line 2823
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v0, v0, v8

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->ae:[I

    aget v1, v1, v9

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/RecyclerView;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2824
    invoke-virtual {p0, v8}, Landroid/support/v7/widget/RecyclerView;->b(I)V

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

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    .prologue
    .line 8381
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    move-result v0

    return v0
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    .prologue
    .line 8386
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    move-result v0

    return v0
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    .prologue
    .line 8376
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[I)Z

    move-result v0

    return v0
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    .prologue
    .line 8370
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

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

    .prologue
    .line 986
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 987
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

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

    .line 3037
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 3039
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v0, v1

    .line 3040
    :goto_0
    if-ge v0, v3, :cond_0

    .line 3041
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3040
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3046
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_e

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v0

    if-nez v0, :cond_e

    .line 3047
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 3048
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v0

    .line 3049
    :goto_1
    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3050
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v4

    neg-int v4, v4

    add-int/2addr v0, v4

    int-to-float v0, v0

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3051
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->F:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    .line 3052
    :goto_2
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3054
    :goto_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v3

    if-nez v3, :cond_2

    .line 3055
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 3056
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v3, :cond_1

    .line 3057
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3059
    :cond_1
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_9

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->G:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_9

    move v3, v2

    :goto_4
    or-int/2addr v0, v3

    .line 3060
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3062
    :cond_2
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v3

    if-nez v3, :cond_3

    .line 3063
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 3064
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v5

    .line 3065
    iget-boolean v3, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v3, :cond_a

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v3

    .line 3066
    :goto_5
    const/high16 v6, 0x42b40000    # 90.0f

    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3067
    neg-int v3, v3

    int-to-float v3, v3

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3068
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_b

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->H:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_b

    move v3, v2

    :goto_6
    or-int/2addr v0, v3

    .line 3069
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3071
    :cond_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v3, :cond_5

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v3}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v3

    if-nez v3, :cond_5

    .line 3072
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 3073
    const/high16 v4, 0x43340000    # 180.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3074
    iget-boolean v4, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    if-eqz v4, :cond_c

    .line 3075
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

    .line 3079
    :goto_7
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    if-eqz v4, :cond_4

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->I:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v4, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v1, v2

    :cond_4
    or-int/2addr v0, v1

    .line 3080
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3086
    :cond_5
    if-nez v0, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v1, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_d

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$e;->b()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 3091
    :goto_8
    if-eqz v2, :cond_6

    .line 3092
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 3094
    :cond_6
    return-void

    :cond_7
    move v0, v1

    .line 3048
    goto/16 :goto_1

    :cond_8
    move v0, v1

    .line 3051
    goto/16 :goto_2

    :cond_9
    move v3, v1

    .line 3059
    goto/16 :goto_4

    :cond_a
    move v3, v1

    .line 3065
    goto/16 :goto_5

    :cond_b
    move v3, v1

    .line 3068
    goto :goto_6

    .line 3077
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
    .line 3558
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v0

    return v0
.end method

.method final e(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 3613
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 3614
    iget-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    if-nez v1, :cond_0

    .line 3615
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 3630
    :goto_0
    return-object v0

    .line 3618
    :cond_0
    iget-object v2, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 3619
    invoke-virtual {v2, v4, v4, v4, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3620
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v3, v4

    .line 3621
    :goto_1
    if-ge v3, v5, :cond_1

    .line 3622
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3623
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$g;

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {v1, v6, p1}, Landroid/support/v7/widget/RecyclerView$g;->a(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 3624
    iget v1, v2, Landroid/graphics/Rect;->left:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->left:I

    .line 3625
    iget v1, v2, Landroid/graphics/Rect;->top:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->top:I

    .line 3626
    iget v1, v2, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->right:I

    .line 3627
    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v6

    iput v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 3621
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_1

    .line 3629
    :cond_1
    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    move-object v0, v2

    .line 3630
    goto :goto_0
.end method

.method final e()V
    .locals 5

    .prologue
    .line 3284
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v1

    .line 3285
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_6

    .line 3286
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v2

    .line 3288
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v3

    if-nez v3, :cond_1

    .line 3289
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 3292
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3285
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3293
    :cond_2
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->j()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3294
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    iget v4, v2, Landroid/support/v7/widget/RecyclerView$t;->b:I

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/RecyclerView$a;->a(I)I

    move-result v3

    .line 3295
    iget v4, v2, Landroid/support/v7/widget/RecyclerView$t;->e:I

    if-ne v4, v3, :cond_5

    .line 3297
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->u()Z

    move-result v3

    if-nez v3, :cond_4

    .line 3298
    :cond_3
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    iget v4, v2, Landroid/support/v7/widget/RecyclerView$t;->b:I

    invoke-virtual {v3, v2, v4}, Landroid/support/v7/widget/RecyclerView$a;->b(Landroid/support/v7/widget/RecyclerView$t;I)V

    goto :goto_1

    .line 3303
    :cond_4
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_1

    .line 3308
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3313
    :cond_6
    return-void
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 3729
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->D:Z

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

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 3

    .prologue
    .line 1823
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    .line 1828
    invoke-virtual {v0, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    .line 1829
    if-nez v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v1, :cond_0

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1830
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 1831
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, p2, v1, v2}, Landroid/support/v7/widget/RecyclerView$i;->c(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v0

    .line 1832
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 1834
    :cond_0
    if-eqz v0, :cond_1

    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3113
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_0

    .line 3114
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3116
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->b()Landroid/support/v7/widget/RecyclerView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3121
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_0

    .line 3122
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3124
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/RecyclerView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 3129
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_0

    .line 3130
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3132
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/RecyclerView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    .prologue
    .line 863
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

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
    .line 9896
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Landroid/support/v7/widget/RecyclerView$d;

    if-nez v0, :cond_0

    .line 9897
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result v0

    .line 9899
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->ad:Landroid/support/v7/widget/RecyclerView$d;

    invoke-interface {v0}, Landroid/support/v7/widget/RecyclerView$d;->a()I

    move-result v0

    goto :goto_0
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    .prologue
    .line 8364
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->hasNestedScrollingParent()Z

    move-result v0

    return v0
.end method

.method public isAttachedToWindow()Z
    .locals 1

    .prologue
    .line 1910
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .prologue
    .line 8349
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1879
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 1880
    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->E:I

    .line 1881
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    .line 1882
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    .line 1883
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_0

    .line 1884
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->m()V

    .line 1886
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->ab:Z

    .line 1887
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1891
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 1892
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v0, :cond_0

    .line 1893
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$e;->c()V

    .line 1895
    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    .line 1897
    invoke-direct {p0, v1}, Landroid/support/v7/widget/RecyclerView;->c(I)V

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->j()V

    .line 1898
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView;->u:Z

    .line 1899
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_1

    .line 1900
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    invoke-virtual {v0, p0, v1}, Landroid/support/v7/widget/RecyclerView$i;->b(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$m;)V

    .line 1902
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->aj:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1903
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 3098
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 3100
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 3101
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 3102
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->r:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3101
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3104
    :cond_0
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 2286
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_1

    .line 2314
    :cond_0
    :goto_0
    return v7

    .line 2289
    :cond_1
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getSource(Landroid/view/MotionEvent;)I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 2290
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    .line 2292
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2295
    const/16 v0, 0x9

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getAxisValue(Landroid/view/MotionEvent;I)F

    move-result v0

    neg-float v0, v0

    .line 2300
    :goto_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2301
    const/16 v2, 0xa

    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getAxisValue(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 2307
    :goto_2
    cmpl-float v3, v0, v1

    if-nez v3, :cond_2

    cmpl-float v3, v2, v1

    if-eqz v3, :cond_0

    .line 2308
    :cond_2
    iget v3, p0, Landroid/support/v7/widget/RecyclerView;->T:F

    const/4 v4, 0x1

    cmpl-float v3, v3, v4

    if-nez v3, :cond_3

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    const v5, 0x101004d

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->T:F

    :cond_3
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->T:F

    .line 2309
    :cond_4
    mul-float/2addr v2, v1

    float-to-int v2, v2

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-direct {p0, v2, v0, p1}, Landroid/support/v7/widget/RecyclerView;->a(IILandroid/view/MotionEvent;)Z

    goto :goto_0

    :cond_5
    move v0, v1

    .line 2298
    goto :goto_1

    :cond_6
    move v2, v1

    .line 2304
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

    .line 2027
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    if-eq v5, v9, :cond_0

    if-nez v5, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/RecyclerView$j;

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v4, v3

    :goto_0
    if-ge v4, v6, :cond_4

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$j;

    invoke-interface {v0}, Landroid/support/v7/widget/RecyclerView$j;->a()Z

    move-result v7

    if-eqz v7, :cond_3

    if-eq v5, v9, :cond_3

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/RecyclerView$j;

    move v0, v2

    :goto_1
    if-eqz v0, :cond_5

    .line 2028
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    .line 2115
    :cond_2
    :goto_2
    return v2

    .line 2027
    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_4
    move v0, v3

    goto :goto_1

    .line 2032
    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_6

    move v2, v3

    .line 2033
    goto :goto_2

    .line 2036
    :cond_6
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v0

    .line 2037
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v4

    .line 2039
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    if-nez v5, :cond_7

    .line 2040
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v5

    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    .line 2042
    :cond_7
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v5, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2044
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v5

    .line 2045
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v6

    .line 2047
    packed-switch v5, :pswitch_data_0

    .line 2115
    :cond_8
    :goto_3
    :pswitch_0
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    if-eq v0, v2, :cond_2

    move v2, v3

    goto :goto_2

    .line 2049
    :pswitch_1
    invoke-static {p1, v3}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 2050
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    add-float/2addr v1, v8

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->M:I

    .line 2051
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    add-float/2addr v1, v8

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2053
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    const/4 v5, 0x2

    if-ne v1, v5, :cond_9

    .line 2054
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2055
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->c(I)V

    .line 2059
    :cond_9
    if-eqz v0, :cond_10

    move v0, v2

    .line 2062
    :goto_4
    if-eqz v4, :cond_a

    .line 2063
    or-int/lit8 v0, v0, 0x2

    .line 2065
    :cond_a
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->startNestedScroll(I)Z

    goto :goto_3

    .line 2069
    :pswitch_2
    invoke-static {p1, v6}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 2070
    invoke-static {p1, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->M:I

    .line 2071
    invoke-static {p1, v6}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    goto :goto_3

    .line 2075
    :pswitch_3
    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v5

    .line 2076
    if-gez v5, :cond_b

    .line 2077
    const-string v0, "RecyclerView"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error processing scroll; pointer index for id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v3

    .line 2079
    goto/16 :goto_2

    .line 2082
    :cond_b
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v6

    add-float/2addr v6, v8

    float-to-int v6, v6

    .line 2083
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v5

    add-float/2addr v5, v8

    float-to-int v5, v5

    .line 2084
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    if-eq v7, v2, :cond_8

    .line 2085
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->M:I

    sub-int/2addr v6, v7

    .line 2086
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    sub-int/2addr v5, v7

    .line 2088
    if-eqz v0, :cond_f

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    if-le v0, v7, :cond_f

    .line 2089
    iget v7, p0, Landroid/support/v7/widget/RecyclerView;->M:I

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    if-gez v6, :cond_d

    move v0, v1

    :goto_5
    mul-int/2addr v0, v8

    add-int/2addr v0, v7

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    move v0, v2

    .line 2092
    :goto_6
    if-eqz v4, :cond_c

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v6, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    if-le v4, v6, :cond_c

    .line 2093
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    if-gez v5, :cond_e

    :goto_7
    mul-int/2addr v1, v4

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    move v0, v2

    .line 2096
    :cond_c
    if-eqz v0, :cond_8

    .line 2097
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->c(I)V

    goto/16 :goto_3

    :cond_d
    move v0, v2

    .line 2089
    goto :goto_5

    :cond_e
    move v1, v2

    .line 2093
    goto :goto_7

    .line 2103
    :pswitch_4
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 2107
    :pswitch_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2108
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->stopNestedScroll()V

    goto/16 :goto_3

    .line 2112
    :pswitch_6
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    goto/16 :goto_3

    :cond_f
    move v0, v3

    goto :goto_6

    :cond_10
    move v0, v3

    goto/16 :goto_4

    .line 2047
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
    .line 3009
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 3010
    const-string v0, "RV OnLayout"

    invoke-static {v0}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 3011
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 3012
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 3013
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 3014
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    .line 3015
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2337
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->z:Z

    if-eqz v0, :cond_0

    .line 2338
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 2339
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->w()V

    .line 2341
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2346
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2352
    :goto_0
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView;->z:Z

    .line 2353
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 2356
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    if-eqz v0, :cond_2

    .line 2357
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->o:Landroid/support/v7/widget/RecyclerView$a;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/RecyclerView$q;->e:I

    .line 2361
    :goto_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_3

    .line 2362
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->d(II)V

    .line 2367
    :goto_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0, v2}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    .line 2368
    return-void

    .line 2349
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->e()V

    .line 2350
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0, v2}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/support/v7/widget/RecyclerView$q;Z)Z

    goto :goto_0

    .line 2359
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iput v2, v0, Landroid/support/v7/widget/RecyclerView$q;->e:I

    goto :goto_1

    .line 2364
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->d(II)V

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
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$SavedState;->a:Landroid/os/Parcelable;

    if-eqz v0, :cond_0

    .line 969
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->k:Landroid/support/v7/widget/RecyclerView$SavedState;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView$SavedState;->a:Landroid/os/Parcelable;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/os/Parcelable;)V

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
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-eqz v1, :cond_1

    .line 956
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$i;->e()Landroid/os/Parcelable;

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
    .line 2409
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 2410
    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    .line 2411
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    .line 2413
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

    .line 2130
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/RecyclerView$j;

    if-eqz v4, :cond_0

    if-nez v0, :cond_1

    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/RecyclerView$j;

    :cond_0
    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v4, v2

    :goto_0
    if-ge v4, v5, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$j;

    invoke-interface {v0}, Landroid/support/v7/widget/RecyclerView$j;->a()Z

    move-result v6

    if-eqz v6, :cond_4

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/RecyclerView$j;

    move v0, v3

    :goto_1
    if-eqz v0, :cond_6

    .line 2131
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    .line 2261
    :goto_2
    return v3

    .line 2130
    :cond_1
    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    if-ne v0, v3, :cond_3

    :cond_2
    iput-object v5, p0, Landroid/support/v7/widget/RecyclerView;->t:Landroid/support/v7/widget/RecyclerView$j;

    :cond_3
    move v0, v3

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_1

    .line 2135
    :cond_6
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v0, :cond_7

    move v3, v2

    .line 2136
    goto :goto_2

    .line 2139
    :cond_7
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v5

    .line 2140
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v6

    .line 2142
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    if-nez v0, :cond_8

    .line 2143
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    .line 2145
    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2147
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v7

    .line 2148
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2149
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v4

    .line 2151
    if-nez v0, :cond_9

    .line 2152
    iget-object v8, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    iget-object v9, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    aput v2, v9, v3

    aput v2, v8, v2

    .line 2154
    :cond_9
    iget-object v8, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    aget v8, v8, v2

    int-to-float v8, v8

    iget-object v9, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    aget v9, v9, v3

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 2156
    packed-switch v0, :pswitch_data_0

    .line 2259
    :cond_a
    :goto_3
    :pswitch_0
    invoke-virtual {v7}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_2

    .line 2158
    :pswitch_1
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 2159
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->M:I

    .line 2160
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    .line 2163
    if-eqz v5, :cond_23

    move v0, v3

    .line 2166
    :goto_4
    if-eqz v6, :cond_b

    .line 2167
    or-int/lit8 v0, v0, 0x2

    .line 2169
    :cond_b
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->startNestedScroll(I)Z

    goto :goto_3

    .line 2173
    :pswitch_2
    invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    .line 2174
    invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->M:I

    .line 2175
    invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->N:I

    goto :goto_3

    .line 2179
    :pswitch_3
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 2180
    if-gez v0, :cond_c

    .line 2181
    const-string v0, "RecyclerView"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Error processing scroll; pointer index for id "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v3, v2

    .line 2183
    goto/16 :goto_2

    .line 2186
    :cond_c
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v1

    add-float/2addr v1, v10

    float-to-int v8, v1

    .line 2187
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    add-float/2addr v0, v10

    float-to-int v9, v0

    .line 2188
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    sub-int v1, v0, v8

    .line 2189
    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    sub-int/2addr v0, v9

    .line 2191
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    iget-object v10, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    invoke-virtual {p0, v1, v0, v4, v10}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedPreScroll(II[I[I)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 2192
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v4, v4, v2

    sub-int/2addr v1, v4

    .line 2193
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ah:[I

    aget v4, v4, v3

    sub-int/2addr v0, v4

    .line 2194
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v4, v4, v2

    int-to-float v4, v4

    iget-object v10, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v10, v10, v3

    int-to-float v10, v10

    invoke-virtual {v7, v4, v10}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 2196
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    aget v10, v4, v2

    iget-object v11, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v11, v11, v2

    add-int/2addr v10, v11

    aput v10, v4, v2

    .line 2197
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ai:[I

    aget v10, v4, v3

    iget-object v11, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v11, v11, v3

    add-int/2addr v10, v11

    aput v10, v4, v3

    .line 2200
    :cond_d
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    if-eq v4, v3, :cond_f

    .line 2202
    if-eqz v5, :cond_22

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v10, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    if-le v4, v10, :cond_22

    .line 2203
    if-lez v1, :cond_10

    .line 2204
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    sub-int/2addr v1, v4

    :goto_5
    move v4, v3

    .line 2210
    :goto_6
    if-eqz v6, :cond_e

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v10

    iget v11, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    if-le v10, v11, :cond_e

    .line 2211
    if-lez v0, :cond_11

    .line 2212
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    sub-int/2addr v0, v4

    :goto_7
    move v4, v3

    .line 2218
    :cond_e
    if-eqz v4, :cond_f

    .line 2219
    invoke-direct {p0, v3}, Landroid/support/v7/widget/RecyclerView;->c(I)V

    .line 2223
    :cond_f
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->J:I

    if-ne v4, v3, :cond_a

    .line 2224
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v4, v4, v2

    sub-int v4, v8, v4

    iput v4, p0, Landroid/support/v7/widget/RecyclerView;->O:I

    .line 2225
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->ag:[I

    aget v4, v4, v3

    sub-int v4, v9, v4

    iput v4, p0, Landroid/support/v7/widget/RecyclerView;->P:I

    .line 2227
    if-eqz v5, :cond_12

    :goto_8
    if-eqz v6, :cond_13

    :goto_9
    invoke-direct {p0, v1, v0, v7}, Landroid/support/v7/widget/RecyclerView;->a(IILandroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2231
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_3

    .line 2206
    :cond_10
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    add-int/2addr v1, v4

    goto :goto_5

    .line 2214
    :cond_11
    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->Q:I

    add-int/2addr v0, v4

    goto :goto_7

    :cond_12
    move v1, v2

    .line 2227
    goto :goto_8

    :cond_13
    move v0, v2

    goto :goto_9

    .line 2237
    :pswitch_4
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 2241
    :pswitch_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    int-to-float v8, v8

    invoke-virtual {v0, v4, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 2242
    if-eqz v5, :cond_18

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    invoke-static {v0, v4}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v0

    neg-float v0, v0

    move v4, v0

    .line 2244
    :goto_a
    if-eqz v6, :cond_19

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->K:I

    invoke-static {v0, v5}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v0

    neg-float v0, v0

    .line 2246
    :goto_b
    cmpl-float v5, v4, v1

    if-nez v5, :cond_14

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_16

    :cond_14
    float-to-int v1, v4

    float-to-int v0, v0

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v4, :cond_1a

    const-string v0, "RecyclerView"

    const-string v1, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    move v0, v2

    :goto_c
    if-nez v0, :cond_17

    .line 2247
    :cond_16
    invoke-direct {p0, v2}, Landroid/support/v7/widget/RecyclerView;->c(I)V

    .line 2250
    :cond_17
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2251
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->k()V

    goto/16 :goto_3

    :cond_18
    move v4, v1

    .line 2242
    goto :goto_a

    :cond_19
    move v0, v1

    .line 2244
    goto :goto_b

    .line 2246
    :cond_1a
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v5

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v6

    if-eqz v5, :cond_1b

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-ge v4, v8, :cond_21

    :cond_1b
    move v4, v2

    :goto_d
    if-eqz v6, :cond_1c

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v8, p0, Landroid/support/v7/widget/RecyclerView;->R:I

    if-ge v1, v8, :cond_20

    :cond_1c
    move v1, v2

    :goto_e
    if-nez v4, :cond_1d

    if-eqz v1, :cond_15

    :cond_1d
    int-to-float v0, v4

    int-to-float v8, v1

    invoke-virtual {p0, v0, v8}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    move-result v0

    if-nez v0, :cond_15

    if-nez v5, :cond_1e

    if-eqz v6, :cond_1f

    :cond_1e
    move v0, v3

    :goto_f
    int-to-float v5, v4

    int-to-float v6, v1

    invoke-virtual {p0, v5, v6, v0}, Landroid/support/v7/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    if-eqz v0, :cond_15

    iget v0, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    neg-int v0, v0

    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v4, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    neg-int v4, v4

    iget v5, p0, Landroid/support/v7/widget/RecyclerView;->S:I

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView;->U:Landroid/support/v7/widget/RecyclerView$s;

    invoke-virtual {v4, v0, v1}, Landroid/support/v7/widget/RecyclerView$s;->a(II)V

    move v0, v3

    goto :goto_c

    :cond_1f
    move v0, v2

    goto :goto_f

    .line 2255
    :pswitch_6
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->q()V

    goto/16 :goto_3

    :cond_20
    move v1, v0

    goto :goto_e

    :cond_21
    move v4, v1

    goto :goto_d

    :cond_22
    move v4, v2

    goto/16 :goto_6

    :cond_23
    move v0, v2

    goto/16 :goto_4

    .line 2156
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
    .line 2874
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 2875
    if-eqz v0, :cond_0

    .line 2876
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2877
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->h()V

    .line 2883
    :cond_0
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/view/View;)V

    .line 2884
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 2885
    return-void

    .line 2878
    :cond_1
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2879
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

    .line 1839
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    if-eqz p2, :cond_2

    .line 1840
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v0, v2, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 1845
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1846
    instance-of v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    if-eqz v3, :cond_1

    .line 1848
    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 1849
    iget-boolean v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    if-nez v3, :cond_1

    .line 1850
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 1851
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->left:I

    .line 1852
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->right:I

    .line 1853
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->top:I

    iget v5, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v5

    iput v4, v3, Landroid/graphics/Rect;->top:I

    .line 1854
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    .line 1858
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, Landroid/support/v7/widget/RecyclerView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1859
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/RecyclerView;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1860
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->n:Landroid/graphics/Rect;

    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

    if-nez v0, :cond_4

    move v0, v1

    :goto_1
    invoke-virtual {p0, p1, v3, v0}, Landroid/support/v7/widget/RecyclerView;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 1862
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 1863
    return-void

    :cond_3
    move v0, v2

    .line 1839
    goto :goto_0

    :cond_4
    move v0, v2

    .line 1860
    goto :goto_1
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 13

    .prologue
    .line 1867
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$i;->s()I

    move-result v4

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$i;->t()I

    move-result v5

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$i;->q()I

    move-result v0

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$i;->u()I

    move-result v1

    sub-int v6, v0, v1

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$i;->r()I

    move-result v0

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$i;->v()I

    move-result v1

    sub-int v7, v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p2, Landroid/graphics/Rect;->left:I

    add-int v8, v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    add-int v9, v0, v1

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int v10, v8, v0

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v0

    add-int v11, v9, v0

    const/4 v0, 0x0

    sub-int v1, v8, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v0, 0x0

    sub-int v2, v9, v5

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v0, 0x0

    sub-int v12, v10, v6

    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v12, 0x0

    sub-int v7, v11, v7

    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v3

    const/4 v11, 0x1

    if-ne v3, v11, :cond_3

    if-eqz v0, :cond_2

    :goto_0
    if-eqz v2, :cond_5

    move v1, v2

    :goto_1
    if-nez v0, :cond_0

    if-eqz v1, :cond_b

    :cond_0
    if-eqz p3, :cond_6

    invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/RecyclerView;->scrollBy(II)V

    :cond_1
    :goto_2
    const/4 v0, 0x1

    :goto_3
    return v0

    :cond_2
    sub-int v0, v10, v6

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    sub-int v1, v8, v4

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_5
    sub-int v1, v9, v5

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_6
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v2, :cond_7

    const-string v0, "RecyclerView"

    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_7
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v2

    if-nez v2, :cond_8

    const/4 v0, 0x0

    :cond_8
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v2

    if-nez v2, :cond_9

    const/4 v1, 0x0

    :cond_9
    if-nez v0, :cond_a

    if-eqz v1, :cond_1

    :cond_a
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->U:Landroid/support/v7/widget/RecyclerView$s;

    invoke-virtual {v2, v0, v1}, Landroid/support/v7/widget/RecyclerView$s;->b(II)V

    goto :goto_2

    :cond_b
    const/4 v0, 0x0

    goto :goto_3
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 3

    .prologue
    .line 2120
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 2121
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 2122
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->s:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2123
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2125
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 2126
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 3019
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->w:Z

    if-nez v0, :cond_0

    .line 3020
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 3024
    :goto_0
    return-void

    .line 3022
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->x:Z

    goto :goto_0
.end method

.method public scrollBy(II)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1314
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    if-nez v1, :cond_1

    .line 1315
    const-string v0, "RecyclerView"

    const-string v1, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1324
    :cond_0
    :goto_0
    return-void

    .line 1319
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v1

    .line 1320
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView;->p:Landroid/support/v7/widget/RecyclerView$i;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v2

    .line 1321
    if-nez v1, :cond_2

    if-eqz v2, :cond_0

    .line 1322
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
    .line 1308
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "RecyclerView does not support scrolling to an absolute position."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 2512
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_3

    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->getContentChangeTypes(Landroid/view/accessibility/AccessibilityEvent;)I

    move-result v1

    :goto_0
    if-nez v1, :cond_2

    :goto_1
    iget v1, p0, Landroid/support/v7/widget/RecyclerView;->y:I

    or-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView;->y:I

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    .line 2516
    :goto_2
    return-void

    .line 2515
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
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView;->p()V

    .line 717
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/widget/RecyclerView;->l:Z

    .line 718
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 719
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView;->v:Z

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
    .line 8344
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    .line 8345
    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    .prologue
    .line 8354
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/NestedScrollingChildHelper;->startNestedScroll(I)Z

    move-result v0

    return v0
.end method

.method public stopNestedScroll()V
    .locals 1

    .prologue
    .line 8359
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView;->af:Landroid/support/v4/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroid/support/v4/view/NestedScrollingChildHelper;->stopNestedScroll()V

    .line 8360
    return-void
.end method
