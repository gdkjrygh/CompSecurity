.class public Lcom/facebook/orca/chatheads/al;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"


# static fields
.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final d:I


# instance fields
.field private final A:Ljava/lang/Runnable;

.field private B:Z

.field private C:Lcom/facebook/orca/chatheads/bx;

.field private D:Lcom/facebook/orca/chatheads/bt;

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:I

.field private M:Landroid/graphics/Rect;

.field private N:Landroid/graphics/Rect;

.field private O:Lcom/facebook/orca/chatheads/bs;

.field private final P:Lcom/facebook/orca/chatheads/ak;

.field private final Q:Lcom/facebook/orca/chatheads/ak;

.field private final R:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;"
        }
    .end annotation
.end field

.field private S:I

.field private final T:Lcom/facebook/orca/chatheads/i;

.field private U:Lcom/facebook/orca/chatheads/ag;

.field private V:Lcom/facebook/orca/chatheads/ae;

.field private W:Z

.field private X:Lcom/facebook/orca/chatheads/dc;

.field private Y:Lcom/facebook/orca/chatheads/cf;

.field private Z:Lcom/facebook/orca/chatheads/cm;

.field private aa:Z

.field private ab:Lcom/facebook/orca/chatheads/ck;

.field private ac:Lcom/facebook/orca/chatheads/n;

.field private ad:Z

.field private ae:Lcom/facebook/orca/chatheads/ag;

.field private af:Z

.field private ag:Z

.field private ah:F

.field private ai:F

.field private aj:I

.field private ak:[I

.field private final al:Landroid/view/View$OnClickListener;

.field b:Lcom/facebook/orca/chatheads/bo;

.field private final c:Landroid/view/View$OnTouchListener;

.field private final e:Landroid/content/Context;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/chatheads/ae;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Lcom/facebook/c/s;

.field private final i:Landroid/view/WindowManager;

.field private final j:Landroid/os/PowerManager;

.field private final k:Lcom/facebook/common/hardware/q;

.field private final l:Landroid/app/KeyguardManager;

.field private final m:Lcom/facebook/orca/f/a;

.field private final n:Lcom/facebook/orca/chatheads/by;

.field private final o:Lcom/facebook/base/broadcast/q;

.field private final p:Lcom/facebook/orca/threads/q;

.field private q:Landroid/os/Handler;

.field private r:Landroid/os/Handler;

.field private final s:Lcom/facebook/orca/chatheads/eb;

.field private final t:Lcom/facebook/orca/chatheads/b/k;

.field private final u:Lcom/facebook/i/a/a/f;

.field private final v:Landroid/content/ComponentName;

.field private final w:Lcom/facebook/common/e/h;

.field private final x:Lcom/facebook/orca/chatheads/cz;

.field private final y:Lcom/facebook/common/hardware/t;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 289
    const-class v0, Lcom/facebook/orca/chatheads/al;

    sput-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    .line 306
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v0

    sput v0, Lcom/facebook/orca/chatheads/al;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/c/s;Landroid/view/WindowManager;Landroid/os/PowerManager;Lcom/facebook/common/hardware/q;Landroid/app/KeyguardManager;Lcom/facebook/orca/f/a;Lcom/facebook/orca/chatheads/by;Lcom/facebook/orca/threads/q;Lcom/facebook/common/executors/a;Lcom/facebook/n/j;Lcom/facebook/orca/chatheads/eb;Lcom/facebook/orca/chatheads/b/k;Lcom/facebook/i/a/a/f;Landroid/content/ComponentName;Lcom/facebook/common/e/h;Lcom/facebook/orca/chatheads/cz;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/chatheads/ae;",
            ">;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/c/s;",
            "Landroid/view/WindowManager;",
            "Landroid/os/PowerManager;",
            "Lcom/facebook/common/hardware/q;",
            "Landroid/app/KeyguardManager;",
            "Lcom/facebook/orca/f/a;",
            "Lcom/facebook/orca/chatheads/by;",
            "Lcom/facebook/orca/threads/q;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/facebook/n/j;",
            "Lcom/facebook/orca/chatheads/eb;",
            "Lcom/facebook/orca/chatheads/b/k;",
            "Lcom/facebook/i/a/a/f;",
            "Landroid/content/ComponentName;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/orca/chatheads/cz;",
            ")V"
        }
    .end annotation

    .prologue
    .line 453
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v1, Lcom/facebook/orca/chatheads/am;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/am;-><init>(Lcom/facebook/orca/chatheads/al;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->c:Landroid/view/View$OnTouchListener;

    .line 345
    new-instance v1, Lcom/facebook/orca/chatheads/ax;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/ax;-><init>(Lcom/facebook/orca/chatheads/al;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->A:Ljava/lang/Runnable;

    .line 371
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    .line 380
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    .line 713
    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->ak:[I

    .line 1784
    new-instance v1, Lcom/facebook/orca/chatheads/az;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/az;-><init>(Lcom/facebook/orca/chatheads/al;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->al:Landroid/view/View$OnClickListener;

    .line 454
    iput-object p1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    .line 455
    iput-object p2, p0, Lcom/facebook/orca/chatheads/al;->f:Ljavax/inject/a;

    .line 456
    iput-object p3, p0, Lcom/facebook/orca/chatheads/al;->g:Lcom/facebook/prefs/shared/d;

    .line 457
    iput-object p4, p0, Lcom/facebook/orca/chatheads/al;->h:Lcom/facebook/c/s;

    .line 458
    iput-object p5, p0, Lcom/facebook/orca/chatheads/al;->i:Landroid/view/WindowManager;

    .line 459
    iput-object p6, p0, Lcom/facebook/orca/chatheads/al;->j:Landroid/os/PowerManager;

    .line 460
    iput-object p7, p0, Lcom/facebook/orca/chatheads/al;->k:Lcom/facebook/common/hardware/q;

    .line 461
    iput-object p8, p0, Lcom/facebook/orca/chatheads/al;->l:Landroid/app/KeyguardManager;

    .line 462
    iput-object p9, p0, Lcom/facebook/orca/chatheads/al;->m:Lcom/facebook/orca/f/a;

    .line 463
    iput-object p10, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    .line 464
    iput-object p11, p0, Lcom/facebook/orca/chatheads/al;->p:Lcom/facebook/orca/threads/q;

    .line 465
    new-instance v1, Lcom/facebook/orca/chatheads/bu;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bu;-><init>(Lcom/facebook/orca/chatheads/al;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    .line 466
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->r:Landroid/os/Handler;

    .line 467
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->s:Lcom/facebook/orca/chatheads/eb;

    .line 469
    new-instance v1, Lcom/facebook/orca/chatheads/bo;

    move-object/from16 v0, p13

    invoke-direct {v1, p0, v0}, Lcom/facebook/orca/chatheads/bo;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/n/j;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->b:Lcom/facebook/orca/chatheads/bo;

    .line 470
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    .line 471
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    .line 472
    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->v:Landroid/content/ComponentName;

    .line 473
    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->w:Lcom/facebook/common/e/h;

    .line 474
    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->x:Lcom/facebook/orca/chatheads/cz;

    .line 476
    new-instance v1, Lcom/facebook/orca/chatheads/ak;

    move-object/from16 v0, p12

    invoke-direct {v1, v0}, Lcom/facebook/orca/chatheads/ak;-><init>(Lcom/facebook/common/executors/a;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    .line 477
    new-instance v1, Lcom/facebook/orca/chatheads/ak;

    move-object/from16 v0, p12

    invoke-direct {v1, v0}, Lcom/facebook/orca/chatheads/ak;-><init>(Lcom/facebook/common/executors/a;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    .line 478
    new-instance v1, Lcom/facebook/orca/chatheads/i;

    invoke-direct {v1}, Lcom/facebook/orca/chatheads/i;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    .line 480
    new-instance v1, Lcom/facebook/orca/chatheads/bh;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bh;-><init>(Lcom/facebook/orca/chatheads/al;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->y:Lcom/facebook/common/hardware/t;

    .line 490
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->k:Lcom/facebook/common/hardware/q;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->y:Lcom/facebook/common/hardware/t;

    invoke-virtual {v1, v2}, Lcom/facebook/common/hardware/q;->a(Lcom/facebook/common/hardware/t;)V

    .line 492
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->s:Lcom/facebook/orca/chatheads/eb;

    new-instance v2, Lcom/facebook/orca/chatheads/bi;

    invoke-direct {v2, p0}, Lcom/facebook/orca/chatheads/bi;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/chatheads/eb;->a(Lcom/facebook/orca/chatheads/ec;)V

    .line 500
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->s:Lcom/facebook/orca/chatheads/eb;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/eb;->a()V

    .line 501
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->m()V

    .line 502
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->n()V

    .line 504
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->p()V

    .line 506
    new-instance v1, Lcom/facebook/orca/chatheads/bx;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bx;-><init>(Lcom/facebook/orca/chatheads/al;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->C:Lcom/facebook/orca/chatheads/bx;

    .line 507
    new-instance v1, Lcom/facebook/orca/chatheads/bt;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bt;-><init>(Lcom/facebook/orca/chatheads/al;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->D:Lcom/facebook/orca/chatheads/bt;

    .line 508
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->o()V

    .line 510
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->A()V

    .line 511
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->v()V

    .line 513
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 514
    const-string v2, "com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 515
    new-instance v2, Lcom/facebook/orca/chatheads/bj;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-direct {v2, p0, v3, v1}, Lcom/facebook/orca/chatheads/bj;-><init>(Lcom/facebook/orca/chatheads/al;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v2, p0, Lcom/facebook/orca/chatheads/al;->o:Lcom/facebook/base/broadcast/q;

    .line 524
    return-void
.end method

.method static synthetic A(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/b/k;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    return-object v0
.end method

.method private A()V
    .locals 1

    .prologue
    .line 873
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->i:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/al;->z:I

    .line 874
    return-void
.end method

.method private B()V
    .locals 1

    .prologue
    .line 877
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 878
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->h()V

    .line 883
    :goto_0
    return-void

    .line 880
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Z)V

    .line 881
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ae()V

    goto :goto_0
.end method

.method static synthetic B(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->D()V

    return-void
.end method

.method static synthetic C(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/bs;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    return-object v0
.end method

.method private C()V
    .locals 1

    .prologue
    .line 886
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->D:Lcom/facebook/orca/chatheads/bt;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/bt;->a()V

    .line 887
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->C:Lcom/facebook/orca/chatheads/bx;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/bx;->a()V

    .line 888
    return-void
.end method

.method static synthetic D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    return-object v0
.end method

.method private D()V
    .locals 1

    .prologue
    .line 989
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 991
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->e()V

    .line 993
    :cond_0
    return-void
.end method

.method private E()V
    .locals 2

    .prologue
    .line 1229
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/facebook/orca/chatheads/av;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/av;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1238
    return-void
.end method

.method static synthetic E(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->am()V

    return-void
.end method

.method static synthetic F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    return-object v0
.end method

.method private F()V
    .locals 2

    .prologue
    .line 1241
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->G()Landroid/graphics/Rect;

    move-result-object v0

    .line 1242
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->M:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1243
    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->M:Landroid/graphics/Rect;

    .line 1244
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->C()V

    .line 1246
    :cond_0
    return-void
.end method

.method private G()Landroid/graphics/Rect;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1249
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    .line 1250
    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v3

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v3

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v3

    invoke-direct {v1, v4, v4, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method

.method static synthetic G(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->U()V

    return-void
.end method

.method static synthetic H(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ag;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    return-object v0
.end method

.method private H()V
    .locals 1

    .prologue
    .line 1352
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1353
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->e()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Ljava/util/List;)V

    .line 1354
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->e()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Ljava/util/List;)V

    .line 1359
    :goto_0
    return-void

    .line 1356
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Ljava/util/List;)V

    .line 1357
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Ljava/util/List;)V

    goto :goto_0
.end method

.method static synthetic I(Lcom/facebook/orca/chatheads/al;)I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->F:I

    return v0
.end method

.method private I()Lcom/facebook/orca/chatheads/ag;
    .locals 5

    .prologue
    .line 1399
    const/4 v1, 0x0

    .line 1400
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_2

    .line 1401
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/ak;->a(I)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1402
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1403
    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v3

    .line 1404
    iget-object v4, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v4}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1411
    :cond_0
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    return-object v0

    .line 1400
    :cond_1
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic J(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->af()V

    return-void
.end method

.method private J()Z
    .locals 2

    .prologue
    .line 1434
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->b()I

    move-result v0

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->S:I

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic K(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->X()Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private K()Z
    .locals 2

    .prologue
    .line 1441
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->ah:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private L()Lcom/facebook/orca/chatheads/ae;
    .locals 3

    .prologue
    .line 1450
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    if-eqz v0, :cond_0

    .line 1451
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    .line 1457
    :goto_0
    return-object v0

    .line 1453
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ae;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    .line 1454
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    new-instance v1, Lcom/facebook/orca/chatheads/v;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/facebook/orca/chatheads/v;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ae;->a(Landroid/view/View;)V

    .line 1455
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->al:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ae;->a(Landroid/view/View$OnClickListener;)V

    .line 1456
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ae;->a()V

    .line 1457
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    goto :goto_0
.end method

.method static synthetic L(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->Q()Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private M()Lcom/facebook/orca/chatheads/ag;
    .locals 4

    .prologue
    const/4 v3, -0x2

    .line 1467
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->r()V

    .line 1469
    new-instance v1, Lcom/facebook/orca/chatheads/ag;

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/orca/chatheads/ag;-><init>(Landroid/content/Context;)V

    .line 1470
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x33

    invoke-direct {v0, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ag;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1475
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getChatHeadsContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1478
    new-instance v0, Lcom/facebook/orca/chatheads/bv;

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/chatheads/bv;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ag;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1480
    return-object v1
.end method

.method static synthetic M(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/br;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->N()Lcom/facebook/orca/chatheads/br;

    move-result-object v0

    return-object v0
.end method

.method private N()Lcom/facebook/orca/chatheads/br;
    .locals 1

    .prologue
    .line 1487
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1488
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->D:Lcom/facebook/orca/chatheads/bt;

    .line 1490
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->C:Lcom/facebook/orca/chatheads/bx;

    goto :goto_0
.end method

.method static synthetic N(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->Y()Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private O()Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 1500
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->h()V

    .line 1502
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->N()Lcom/facebook/orca/chatheads/br;

    move-result-object v1

    .line 1504
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    .line 1506
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 1507
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->e()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1508
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 1511
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/n;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 1513
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 1514
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 1516
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/n;->g()Lcom/google/common/d/a/s;

    .line 1519
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->am()V

    .line 1521
    invoke-interface {v1, v0}, Lcom/facebook/orca/chatheads/br;->a(Ljava/util/List;)Lcom/google/common/d/a/s;

    move-result-object v1

    .line 1522
    new-instance v0, Lcom/facebook/orca/chatheads/aw;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/aw;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {v1, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 1564
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->e()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1565
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->K()Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/facebook/orca/chatheads/ag;->setUnreadCountOnLeftSide(Z)V

    goto :goto_1

    .line 1567
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->e()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1568
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->K()Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/facebook/orca/chatheads/ag;->setUnreadCountOnLeftSide(Z)V

    goto :goto_2

    .line 1572
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1573
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->P()V

    .line 1576
    :cond_4
    return-object v1
.end method

.method static synthetic O(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->aj()V

    return-void
.end method

.method private P()V
    .locals 2

    .prologue
    .line 1580
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_0

    .line 1581
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1582
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I

    move-result v0

    .line 1583
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->D:Lcom/facebook/orca/chatheads/bt;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/bt;->b(I)Landroid/graphics/PointF;

    move-result-object v0

    .line 1584
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/dc;->a(Landroid/graphics/PointF;)V

    .line 1586
    :cond_0
    return-void
.end method

.method static synthetic P(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ak()V

    return-void
.end method

.method private Q()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1687
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    if-nez v0, :cond_0

    .line 1688
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 1691
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/v;->b()Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic Q(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->an()V

    return-void
.end method

.method private R()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1695
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1696
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/orca/chatheads/ag;)V

    goto :goto_0

    .line 1698
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1699
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/orca/chatheads/ag;)V

    goto :goto_1

    .line 1701
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cl;->a()V

    .line 1703
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->a()V

    .line 1704
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1705
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->a()V

    .line 1706
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->m:Lcom/facebook/orca/f/a;

    invoke-virtual {v0}, Lcom/facebook/orca/f/a;->a()V

    .line 1708
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    if-eqz v0, :cond_2

    .line 1709
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/ae;->a(Landroid/view/View$OnClickListener;)V

    .line 1710
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ae;->b()V

    .line 1711
    iput-object v2, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    .line 1713
    :cond_2
    return-void
.end method

.method private S()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 1717
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->f(Lcom/facebook/orca/chatheads/ag;)V

    .line 1719
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 1720
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v1, :cond_0

    .line 1721
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/dc;->d()Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1723
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    if-eqz v1, :cond_1

    .line 1724
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b()Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1725
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->Y()Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1728
    :cond_1
    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Iterable;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private T()V
    .locals 2

    .prologue
    .line 1747
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    if-eqz v0, :cond_0

    .line 1748
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ae;->b()V

    .line 1749
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->V:Lcom/facebook/orca/chatheads/ae;

    .line 1754
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->aa:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->j:Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1755
    :cond_1
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "Skipping hideAuxiliaryWindows since showing mini window or screen is off"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 1756
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/bs;->c()V

    .line 1778
    :goto_0
    return-void

    .line 1763
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->S()Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/ay;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/ay;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private U()V
    .locals 1

    .prologue
    .line 1911
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1912
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->n()V

    .line 1913
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->g()V

    .line 1915
    :cond_0
    return-void
.end method

.method private V()I
    .locals 3

    .prologue
    .line 2475
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2476
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->E:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->G:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 2479
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lcom/facebook/orca/chatheads/al;->G:I

    sub-int/2addr v1, v2

    .line 2481
    iget v2, p0, Lcom/facebook/orca/chatheads/al;->ah:F

    int-to-float v0, v0

    mul-float/2addr v0, v2

    float-to-int v0, v0

    add-int/2addr v0, v1

    return v0
.end method

.method private W()I
    .locals 4

    .prologue
    .line 2488
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->F:I

    sub-int/2addr v0, v1

    .line 2489
    iget v1, p0, Lcom/facebook/orca/chatheads/al;->ai:F

    int-to-float v2, v0

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 2492
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private X()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2500
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->c()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 2502
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/n;->f()Lcom/google/common/d/a/s;

    .line 2503
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->Q()Lcom/google/common/d/a/s;

    .line 2504
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 2506
    return-object v0
.end method

.method private Y()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2513
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->d()Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private Z()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 2549
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->aa()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2550
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ab()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 2552
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0
.end method

.method private a(FF)I
    .locals 2

    .prologue
    .line 576
    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    div-float v0, p1, p2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;FF)I
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->b(FF)I

    move-result v0

    return v0
.end method

.method private a(Lcom/facebook/analytics/cb;)Lcom/facebook/analytics/cb;
    .locals 3

    .prologue
    .line 3031
    const-string v0, "headcount"

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/ak;->b()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "popupspace_open"

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "device_rotation"

    iget v2, p0, Lcom/facebook/orca/chatheads/al;->z:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)Lcom/facebook/orca/chatheads/ag;
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/orca/chatheads/al;->ae:Lcom/facebook/orca/chatheads/ag;

    return-object p1
.end method

.method private a(Lcom/facebook/orca/chatheads/ag;)Lcom/google/common/d/a/s;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/chatheads/ag;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1264
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->N()Lcom/facebook/orca/chatheads/br;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/orca/chatheads/br;->a(I)Landroid/graphics/PointF;

    move-result-object v2

    .line 1267
    iget v0, v2, Landroid/graphics/PointF;->y:F

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->I:I

    int-to-float v1, v1

    add-float v3, v0, v1

    .line 1270
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->K:I

    int-to-float v4, v0

    .line 1273
    iget v0, v2, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 1275
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->J:I

    int-to-float v0, v0

    .line 1276
    iget v1, v2, Landroid/graphics/PointF;->x:F

    iget v5, p0, Lcom/facebook/orca/chatheads/al;->H:I

    int-to-float v5, v5

    add-float/2addr v1, v5

    .line 1283
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v5

    .line 1284
    new-instance v6, Landroid/graphics/PointF;

    invoke-direct {v6, v1, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v5, v6}, Lcom/facebook/orca/chatheads/ef;->b(Landroid/graphics/PointF;)V

    .line 1285
    invoke-virtual {v5, v2, v0, v4}, Lcom/facebook/orca/chatheads/ef;->a(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0

    .line 1279
    :cond_0
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->J:I

    neg-int v0, v0

    int-to-float v0, v0

    .line 1280
    iget v1, v2, Landroid/graphics/PointF;->x:F

    iget v5, p0, Lcom/facebook/orca/chatheads/al;->H:I

    int-to-float v5, v5

    sub-float/2addr v1, v5

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/graphics/PointF;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 2435
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 2436
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 2437
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2438
    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2440
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->E:I

    sub-int v0, v2, v0

    .line 2441
    iget v4, p0, Lcom/facebook/orca/chatheads/al;->F:I

    sub-int v4, v3, v4

    .line 2444
    iget v5, p1, Landroid/graphics/PointF;->x:F

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 2445
    iput v6, p0, Lcom/facebook/orca/chatheads/al;->ah:F

    .line 2446
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Lcom/facebook/orca/chatheads/cm;->a(Z)V

    .line 2453
    :goto_0
    iget v0, p1, Landroid/graphics/PointF;->y:F

    int-to-float v4, v4

    div-float/2addr v0, v4

    .line 2454
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/al;->ai:F

    .line 2456
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v4, Lcom/facebook/orca/prefs/n;->D:Lcom/facebook/prefs/shared/ae;

    iget v5, p0, Lcom/facebook/orca/chatheads/al;->ah:F

    invoke-interface {v0, v4, v5}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;F)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v4, Lcom/facebook/orca/prefs/n;->E:Lcom/facebook/prefs/shared/ae;

    iget v5, p0, Lcom/facebook/orca/chatheads/al;->ai:F

    invoke-interface {v0, v4, v5}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;F)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 2461
    iget-object v4, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    iget-object v5, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    const-string v6, "dock"

    move-object v0, v1

    check-cast v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v5, v6, v0, v1}, Lcom/facebook/orca/chatheads/by;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "x"

    iget v5, p0, Lcom/facebook/orca/chatheads/al;->ah:F

    float-to-double v5, v5

    invoke-virtual {v0, v1, v5, v6}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "y"

    iget v5, p0, Lcom/facebook/orca/chatheads/al;->ai:F

    float-to-double v5, v5

    invoke-virtual {v0, v1, v5, v6}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "device_model"

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "device_width"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "device_height"

    invoke-virtual {v0, v1, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/analytics/cb;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/chatheads/by;->a(Lcom/facebook/analytics/cb;)V

    .line 2469
    return-void

    .line 2448
    :cond_0
    iput v7, p0, Lcom/facebook/orca/chatheads/al;->ah:F

    .line 2449
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lcom/facebook/orca/chatheads/cm;->a(Z)V

    goto :goto_0
.end method

.method private a(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 675
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 676
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/cf;->a(Landroid/graphics/Rect;)V

    .line 677
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->t()V

    .line 678
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->C()V

    .line 679
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 680
    return-void
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;I)V
    .locals 1

    .prologue
    .line 1344
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1345
    invoke-virtual {v0, p2}, Lcom/facebook/orca/chatheads/ag;->setUnreadCount(I)V

    .line 1346
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1347
    invoke-virtual {v0, p2}, Lcom/facebook/orca/chatheads/ag;->setUnreadCount(I)V

    .line 1348
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->H()V

    .line 1349
    return-void
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/model/threads/Message;)V
    .locals 3

    .prologue
    .line 1336
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    invoke-static {v0, v1, v2}, Lcom/facebook/messages/ipc/peer/e;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/i/a/a/f;)I

    move-result v0

    .line 1340
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;I)V

    .line 1341
    return-void
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/orca/chatheads/ag;)V
    .locals 2

    .prologue
    .line 1415
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1416
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->I()Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1417
    const-string v1, "max_chathead_limit"

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    goto :goto_0

    .line 1420
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/chatheads/ag;->setPendingThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1421
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/orca/chatheads/ag;)V

    .line 1422
    invoke-virtual {p2, p1}, Lcom/facebook/orca/chatheads/ag;->setThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1423
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/chatheads/ag;->setUnreadCount(I)V

    .line 1424
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->K()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/chatheads/ag;->setUnreadCountOnLeftSide(Z)V

    .line 1426
    invoke-virtual {p2}, Lcom/facebook/orca/chatheads/ag;->i()Lcom/facebook/orca/chatheads/ag;

    move-result-object v1

    .line 1427
    invoke-virtual {v1, p1}, Lcom/facebook/orca/chatheads/ag;->setPendingThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1428
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/orca/chatheads/ag;)V

    .line 1429
    invoke-virtual {v1, p1}, Lcom/facebook/orca/chatheads/ag;->setThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1430
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cl;->a(Lcom/facebook/orca/chatheads/ag;)V

    .line 1431
    return-void
.end method

.method private a(Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 4

    .prologue
    .line 3084
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/b;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 3085
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/b;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v1

    .line 3086
    if-nez v0, :cond_0

    .line 3102
    :goto_0
    return-void

    .line 3089
    :cond_0
    invoke-virtual {v0, p2}, Lcom/facebook/orca/chatheads/ag;->setPendingThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 3090
    invoke-virtual {p2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v2

    .line 3091
    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v3, p1, p2}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 3092
    invoke-virtual {v0, p2}, Lcom/facebook/orca/chatheads/ag;->setThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 3094
    if-eqz v1, :cond_1

    .line 3095
    invoke-virtual {v1, p2}, Lcom/facebook/orca/chatheads/ag;->setPendingThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 3096
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 3097
    invoke-virtual {v1, p2}, Lcom/facebook/orca/chatheads/ag;->setThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 3100
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->m:Lcom/facebook/orca/f/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/a;->b(Lcom/facebook/messages/threads/model/b;)V

    .line 3101
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->m:Lcom/facebook/orca/f/a;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/a;->a(Lcom/facebook/messages/threads/model/b;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/chatheads/ag;FF)V
    .locals 4

    .prologue
    .line 2387
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    .line 2390
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 2392
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v2

    .line 2393
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 2394
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/cl;->c(Lcom/facebook/orca/chatheads/ag;)V

    .line 2396
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2397
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->m:Lcom/facebook/orca/f/a;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/a;->b(Lcom/facebook/messages/threads/model/b;)V

    .line 2398
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/i;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 2400
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    .line 2401
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 2402
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v2, v2, 0x2

    iget v3, p0, Lcom/facebook/orca/chatheads/al;->E:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    int-to-float v2, v2

    .line 2403
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v3, p0, Lcom/facebook/orca/chatheads/al;->F:I

    sub-int/2addr v1, v3

    int-to-float v1, v1

    .line 2404
    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 2406
    sget-object v1, Lcom/facebook/orca/chatheads/d;->CLOSE:Lcom/facebook/orca/chatheads/d;

    invoke-virtual {p1, v1}, Lcom/facebook/orca/chatheads/ag;->setActionState(Lcom/facebook/orca/chatheads/d;)V

    .line 2408
    invoke-virtual {v0, v3, p2, p3}, Lcom/facebook/orca/chatheads/ef;->b(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 2410
    new-instance v1, Lcom/facebook/orca/chatheads/ba;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/chatheads/ba;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 2428
    return-void
.end method

.method private a(Lcom/facebook/orca/chatheads/ag;I)V
    .locals 5

    .prologue
    .line 2350
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 2351
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I

    move-result v1

    .line 2353
    if-ne v1, p2, :cond_0

    .line 2374
    :goto_0
    return-void

    .line 2357
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v2, v0, p2}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;I)Z

    .line 2358
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v2, v0, p2}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;I)Z

    .line 2360
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getChatHeadsContainer()Landroid/widget/FrameLayout;

    move-result-object v2

    .line 2361
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    .line 2362
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_1
    if-ltz v1, :cond_1

    .line 2363
    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/chatheads/ak;->a(I)Lcom/facebook/orca/chatheads/ag;

    move-result-object v3

    .line 2364
    iget-object v4, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v4, v1}, Lcom/facebook/orca/chatheads/ak;->a(I)Lcom/facebook/orca/chatheads/ag;

    move-result-object v4

    .line 2369
    invoke-interface {v2, v3}, Landroid/view/ViewParent;->bringChildToFront(Landroid/view/View;)V

    .line 2370
    invoke-virtual {v0, v4}, Lcom/facebook/orca/chatheads/cl;->b(Lcom/facebook/orca/chatheads/ag;)V

    .line 2362
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 2373
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1631
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1633
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    .line 1635
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1636
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/orca/chatheads/ag;)V

    .line 1637
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v2

    .line 1638
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/cl;->c(Lcom/facebook/orca/chatheads/ag;)V

    .line 1640
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1641
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/i;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1642
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->m:Lcom/facebook/orca/f/a;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/a;->b(Lcom/facebook/messages/threads/model/b;)V

    .line 1643
    if-eqz p2, :cond_0

    .line 1644
    const-string v0, "remove"

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1647
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1648
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->T()V

    .line 1650
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;I)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->b(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Landroid/graphics/PointF;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->a(Landroid/graphics/PointF;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Landroid/graphics/Rect;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->a(Landroid/graphics/Rect;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/messages/model/threads/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;FF)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;FF)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;I)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->c(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 3

    .prologue
    .line 3105
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->ag:Z

    if-eqz v0, :cond_1

    .line 3124
    :cond_0
    :goto_0
    return-void

    .line 3108
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->p:Lcom/facebook/orca/threads/q;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/q;->b(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    .line 3110
    if-eqz v0, :cond_0

    .line 3111
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 3113
    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_2

    .line 3114
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v2, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    .line 3122
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/chatheads/i;->a(Lcom/facebook/user/UserIdentifierKey;Ljava/lang/String;)V

    goto :goto_0

    .line 3116
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_0

    .line 3117
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v2, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private a(Lcom/google/common/d/a/s;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1026
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_0

    .line 1027
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->e()V

    .line 1028
    new-instance v0, Lcom/facebook/orca/chatheads/ar;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/ar;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 1037
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 3052
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/chatheads/al;->b(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 3053
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 3040
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/orca/chatheads/by;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 3042
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/analytics/cb;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/by;->b(Lcom/facebook/analytics/cb;)V

    .line 3043
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 3056
    const/4 v0, 0x0

    check-cast v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/chatheads/al;->b(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 3057
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Landroid/os/RemoteException;)V
    .locals 5

    .prologue
    .line 3264
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 3265
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3266
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3267
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3268
    const-string v0, ":\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3270
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 3271
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3272
    const-string v4, "\n"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3270
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3274
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3275
    sget-object v1, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 3276
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->w:Lcom/facebook/common/e/h;

    invoke-interface {v1, p1, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3277
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 3061
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/orca/chatheads/by;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 3063
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/analytics/cb;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/by;->a(Lcom/facebook/analytics/cb;)V

    .line 3064
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 1362
    .line 1363
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1365
    if-nez v1, :cond_1

    .line 1366
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getUnreadCount()I

    move-result v3

    .line 1367
    if-lez v3, :cond_1

    move v3, v4

    move v1, v4

    .line 1372
    :goto_1
    invoke-virtual {v0, v3}, Lcom/facebook/orca/chatheads/ag;->setShouldShowUnreadCount(Z)V

    goto :goto_0

    .line 1374
    :cond_0
    return-void

    :cond_1
    move v3, v2

    goto :goto_1
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    .line 716
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    .line 717
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    .line 719
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->ak:[I

    invoke-virtual {v0, v3}, Lcom/facebook/orca/chatheads/ca;->getLocationOnScreen([I)V

    .line 721
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    sub-float/2addr v1, v0

    .line 722
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sub-float v0, v2, v0

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->ak:[I

    const/4 v3, 0x1

    aget v2, v2, v3

    int-to-float v2, v2

    sub-float v2, v0, v2

    .line 723
    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 725
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ca;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 726
    neg-float v1, v1

    neg-float v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 727
    return v0
.end method

.method private a(Landroid/view/MotionEvent;FF)Z
    .locals 3

    .prologue
    .line 2331
    mul-float v0, p2, p2

    mul-float v1, p3, p3

    add-float/2addr v0, v1

    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    .line 2334
    iget v1, p0, Lcom/facebook/orca/chatheads/al;->L:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 2335
    const/4 v0, 0x0

    .line 2338
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    invoke-virtual {v0, v1, v2, p2, p3}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(FFFF)Z

    move-result v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z
    .locals 2

    .prologue
    .line 1594
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1595
    :cond_0
    const/4 v0, 0x0

    .line 1600
    :goto_0
    return v0

    .line 1598
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1599
    invoke-virtual {p2}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    .line 1600
    invoke-static {v0, v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;)Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->ag:Z

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/chatheads/al;->a(Landroid/view/MotionEvent;FF)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/al;Z)Z
    .locals 0

    .prologue
    .line 90
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/al;->B:Z

    return p1
.end method

.method private aa()Z
    .locals 1

    .prologue
    .line 2558
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->aj:I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private ab()Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .prologue
    const/16 v2, 0x12c

    .line 2567
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 2569
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/chatheads/cf;->f(I)Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2570
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/chatheads/cm;->f(I)Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2571
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->Q()Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2572
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/b/k;->h()V

    .line 2574
    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Iterable;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 2576
    new-instance v1, Lcom/facebook/orca/chatheads/bc;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bc;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 2590
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 2591
    return-object v0
.end method

.method private ac()V
    .locals 1

    .prologue
    .line 2612
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->aa()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2613
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ad()V

    .line 2615
    :cond_0
    return-void
.end method

.method private ad()V
    .locals 3

    .prologue
    const/16 v1, 0x12c

    .line 2622
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->am()V

    .line 2624
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cf;->e(I)Lcom/google/common/d/a/s;

    .line 2625
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cm;->e(I)Lcom/google/common/d/a/s;

    .line 2627
    const/16 v0, 0x1f4

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->c(I)V

    .line 2628
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->D()V

    .line 2629
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 2630
    return-void
.end method

.method private ae()V
    .locals 2

    .prologue
    .line 2633
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2639
    :goto_0
    return-void

    .line 2636
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->a(I)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 2637
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 2638
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    goto :goto_0
.end method

.method private af()V
    .locals 3

    .prologue
    .line 2777
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->af:Z

    if-eqz v0, :cond_0

    .line 2796
    :goto_0
    return-void

    .line 2781
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    if-eqz v0, :cond_1

    .line 2782
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/bs;->a()V

    .line 2785
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->af:Z

    .line 2788
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->al()V

    .line 2789
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/n;->f()Lcom/google/common/d/a/s;

    .line 2790
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(I)V

    .line 2792
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 2795
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private ag()V
    .locals 1

    .prologue
    .line 2909
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_0

    .line 2910
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->i()V

    .line 2911
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    .line 2913
    :cond_0
    return-void
.end method

.method private ah()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2951
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_0

    .line 2954
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->j()V

    .line 2955
    iput-object v2, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    .line 2957
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    if-eqz v0, :cond_1

    .line 2958
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/n;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2959
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/n;->a()V

    .line 2960
    iput-object v2, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    .line 2962
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    if-eqz v0, :cond_2

    .line 2963
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    .line 2964
    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/ca;->setOnDismissListener(Lcom/facebook/orca/chatheads/cd;)V

    .line 2965
    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/ca;->setOnSizeChangeListener(Lcom/facebook/orca/chatheads/ce;)V

    .line 2966
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getCloseTargetView()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->setOnCloseBaubleStateChangeListener(Lcom/facebook/orca/chatheads/m;)V

    .line 2967
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->a()V

    .line 2969
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->b()V

    .line 2970
    iput-object v2, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    .line 2972
    :cond_2
    return-void
.end method

.method private ai()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 2975
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    if-eqz v0, :cond_0

    .line 2976
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cl;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2977
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cl;->a()V

    .line 2978
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->b()V

    .line 2979
    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    .line 2982
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    if-eqz v0, :cond_1

    .line 2983
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->h()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2984
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->b()V

    .line 2985
    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    .line 2987
    :cond_1
    return-void
.end method

.method private aj()V
    .locals 1

    .prologue
    .line 3130
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->d()Lcom/google/common/d/a/s;

    .line 3131
    return-void
.end method

.method private ak()V
    .locals 4

    .prologue
    const/16 v3, 0xa

    .line 3137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->aa:Z

    .line 3138
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->am()V

    .line 3140
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->F:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3144
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 3145
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 3147
    :cond_0
    return-void
.end method

.method private al()V
    .locals 2

    .prologue
    .line 3157
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->aa:Z

    .line 3158
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->am()V

    .line 3159
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 3160
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 3162
    :cond_0
    return-void
.end method

.method private am()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 3169
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->ag:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    if-nez v0, :cond_1

    .line 3171
    :cond_0
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "updateWindowPositionsAndStates was called while destroyed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 3225
    :goto_0
    return-void

    .line 3175
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3176
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3179
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->l()V

    .line 3180
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->l()V

    .line 3181
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->l()V

    .line 3183
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->aa()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3185
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->j()V

    .line 3186
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->j()V

    .line 3187
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->j()V

    .line 3188
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "updateWindowPositionsAndStates - chat heads hidden"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 3222
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->m()V

    .line 3223
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->m()V

    .line 3224
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->m()V

    goto :goto_0

    .line 3189
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3192
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->r()V

    .line 3193
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cf;->setX(I)V

    .line 3194
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cf;->b(Z)V

    .line 3195
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->j()V

    .line 3196
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->j()V

    .line 3198
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->c()Lcom/google/common/d/a/s;

    .line 3199
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "updateWindowPositionsAndStates - expanded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 3201
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cf;->b(Z)V

    .line 3202
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->aa:Z

    if-eqz v0, :cond_4

    .line 3204
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->j()V

    .line 3205
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->j()V

    .line 3206
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cm;->setX(I)V

    .line 3207
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cm;->setY(I)V

    .line 3208
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "updateWindowPositionsAndStates - mini window"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 3213
    :cond_4
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->r()V

    .line 3214
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cf;->setX(I)V

    .line 3215
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ck;->setX(I)V

    .line 3216
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ck;->setY(I)V

    .line 3217
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->j()V

    .line 3218
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "updateWindowPositionsAndStates - mini touch proxy window"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method private an()V
    .locals 1

    .prologue
    .line 3228
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d()V

    .line 3229
    return-void
.end method

.method private b(FF)I
    .locals 1

    .prologue
    .line 2321
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->D:Lcom/facebook/orca/chatheads/bt;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/chatheads/bt;->a(FF)I

    move-result v0

    return v0
.end method

.method private b(Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 2

    .prologue
    .line 2652
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/PointF;->offset(FF)V

    .line 2653
    return-object p1
.end method

.method private b(Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 3067
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->ag:Z

    if-eqz v0, :cond_1

    .line 3081
    :cond_0
    :goto_0
    return-void

    .line 3071
    :cond_1
    const-string v0, "user_identifier_key"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserIdentifierKey;

    .line 3072
    const-string v1, "new_threadid"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3074
    if-eqz v1, :cond_0

    .line 3077
    invoke-static {v0}, Lcom/facebook/messages/threads/model/b;->a(Lcom/facebook/user/UserIdentifierKey;)Lcom/facebook/messages/threads/model/b;

    move-result-object v2

    .line 3078
    invoke-static {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v3

    .line 3079
    invoke-direct {p0, v2, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 3080
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/chatheads/i;->a(Lcom/facebook/user/UserIdentifierKey;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 915
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->r:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 917
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->r:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/chatheads/ap;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/chatheads/ap;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 926
    return-void
.end method

.method private b(Lcom/facebook/orca/chatheads/ag;)V
    .locals 2

    .prologue
    .line 1308
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1309
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1310
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;I)V

    .line 1314
    :goto_0
    return-void

    .line 1312
    :cond_0
    const-string v0, "clean_unread"

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 2875
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2906
    :cond_0
    :goto_0
    return-void

    .line 2879
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_0

    .line 2880
    if-eqz p2, :cond_2

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2881
    const-string v2, "close"

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    :goto_1
    invoke-direct {p0, v2, v0, p2}, Lcom/facebook/orca/chatheads/al;->b(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 2887
    :cond_2
    invoke-direct {p0, v1}, Lcom/facebook/orca/chatheads/al;->f(Lcom/facebook/orca/chatheads/ag;)V

    .line 2888
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->y()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2889
    invoke-virtual {p0, p2}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 2881
    goto :goto_1

    .line 2891
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->d()Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/bf;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bf;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->al()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/messages/model/threads/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->f(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/orca/chatheads/ag;)V

    return-void
.end method

.method private b(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 3046
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/orca/chatheads/by;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 3048
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/analytics/cb;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/by;->a(Lcom/facebook/analytics/cb;)V

    .line 3049
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1377
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1378
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/ag;->setShouldShowUnreadCount(Z)V

    goto :goto_0

    .line 1380
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/al;Z)Z
    .locals 0

    .prologue
    .line 90
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/al;->ad:Z

    return p1
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/al;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    return-object v0
.end method

.method private c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1154
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ak;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1157
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 1167
    :goto_0
    return-object v0

    .line 1161
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->al()V

    .line 1163
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1164
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/orca/chatheads/ag;)V

    .line 1166
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 1167
    new-instance v1, Lcom/facebook/orca/chatheads/as;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/as;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/base/Function;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0
.end method

.method private c(I)V
    .locals 5

    .prologue
    .line 996
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->b()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->aa()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1023
    :cond_0
    :goto_0
    return-void

    .line 1006
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1007
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1008
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->E:I

    sub-int/2addr v0, v1

    int-to-float v2, v0

    .line 1009
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v0

    int-to-float v1, v0

    .line 1010
    sget-object v0, Lcom/facebook/orca/chatheads/b/e;->RIGHT:Lcom/facebook/orca/chatheads/b/e;

    .line 1018
    :goto_1
    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 1019
    sget v4, Lcom/facebook/g;->chat_head_nux_bubble_x:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v2, v4

    .line 1020
    sget v4, Lcom/facebook/g;->chat_head_height:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    add-float/2addr v1, v3

    .line 1021
    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    new-instance v4, Landroid/graphics/Point;

    float-to-int v2, v2

    float-to-int v1, v1

    invoke-direct {v4, v2, v1}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v3, v4, v0, p1}, Lcom/facebook/orca/chatheads/b/k;->a(Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;I)V

    goto :goto_0

    .line 1012
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v0

    int-to-float v2, v0

    .line 1013
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v0

    int-to-float v1, v0

    .line 1014
    sget-object v0, Lcom/facebook/orca/chatheads/b/e;->LEFT:Lcom/facebook/orca/chatheads/b/e;

    goto :goto_1
.end method

.method private c(Lcom/facebook/messages/model/threads/Message;)V
    .locals 6

    .prologue
    .line 936
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->L()Lcom/facebook/orca/chatheads/ae;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 951
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->f()V

    .line 955
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 956
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 957
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->E:I

    sub-int v2, v0, v1

    .line 958
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v1

    .line 959
    sget-object v0, Lcom/facebook/orca/chatheads/ac;->RIGHT:Lcom/facebook/orca/chatheads/ac;

    .line 967
    :goto_0
    iget-object v4, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 968
    sget v5, Lcom/facebook/g;->chat_head_text_bubble_x:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    add-int/2addr v2, v5

    .line 969
    sget v5, Lcom/facebook/g;->chat_head_text_bubble_y:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    add-int/2addr v1, v4

    .line 971
    iget v4, p0, Lcom/facebook/orca/chatheads/al;->F:I

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v4

    .line 973
    invoke-virtual {v3, v0, v2, v1}, Lcom/facebook/orca/chatheads/ae;->a(Lcom/facebook/orca/chatheads/ac;II)V

    .line 974
    invoke-virtual {v3, p1}, Lcom/facebook/orca/chatheads/ae;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 976
    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/v;->a()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 977
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/google/common/d/a/s;)V

    .line 979
    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    new-instance v1, Lcom/facebook/orca/chatheads/aq;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/aq;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/v;->setOnTextBubbleAutoHideListener(Lcom/facebook/orca/chatheads/ab;)V

    .line 986
    :goto_1
    return-void

    .line 937
    :catch_0
    move-exception v0

    .line 938
    const-string v1, "T2190668:wm_ex_add_text_bubble"

    const-string v2, "Failed to add chat head text bubble window"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/RemoteException;)V

    goto :goto_1

    .line 961
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v2

    .line 962
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v1

    .line 963
    sget-object v0, Lcom/facebook/orca/chatheads/ac;->LEFT:Lcom/facebook/orca/chatheads/ac;

    goto :goto_0
.end method

.method private c(Lcom/facebook/orca/chatheads/ag;)V
    .locals 2

    .prologue
    .line 1383
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1384
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v1

    .line 1385
    if-eqz v1, :cond_0

    .line 1386
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->b()V

    .line 1388
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    .line 1389
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v1

    .line 1390
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cl;->b(Lcom/facebook/orca/chatheads/ag;)V

    .line 1392
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->f(Lcom/facebook/orca/chatheads/ag;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1604
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1605
    const/4 v2, 0x0

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    goto :goto_0

    .line 1608
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1611
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1612
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->y()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1615
    const-string v1, "drop_to_close"

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    .line 1621
    :goto_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 1623
    :cond_1
    return-void

    .line 1617
    :cond_2
    const-string v0, "drop_to_close"

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/al;)I
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v0

    return v0
.end method

.method private d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1176
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->al()V

    .line 1178
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->M()Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1179
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/orca/chatheads/ag;)V

    .line 1181
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->m:Lcom/facebook/orca/f/a;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/a;->a(Lcom/facebook/messages/threads/model/b;)V

    .line 1183
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v1

    .line 1184
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->e()Lcom/google/common/d/a/s;

    .line 1187
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/facebook/orca/chatheads/al;->B:Z

    .line 1189
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v2, Lcom/facebook/orca/chatheads/at;

    invoke-direct {v2, p0, v1}, Lcom/facebook/orca/chatheads/at;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/google/common/d/a/ab;)V

    invoke-static {v0, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 1213
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1217
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 1220
    :cond_0
    return-object v1
.end method

.method private d(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/google/common/d/a/s;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 2674
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "openChatThreadView(%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2675
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->l:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2676
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 2677
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v5

    .line 2678
    invoke-virtual {v5, v3}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 2741
    :goto_0
    return-object v5

    .line 2682
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    if-eqz v0, :cond_1

    .line 2689
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/bs;->a()V

    .line 2692
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/i;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v2

    .line 2694
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->a()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2697
    :cond_2
    invoke-direct {p0, v2}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 2700
    :cond_3
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v5

    .line 2703
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2704
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->af()V

    .line 2705
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->X()Lcom/google/common/d/a/s;

    move-result-object v0

    move-object v6, v0

    .line 2710
    :goto_1
    new-instance v0, Lcom/facebook/orca/chatheads/bd;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/chatheads/bd;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Lcom/google/common/d/a/ab;)V

    invoke-static {v6, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0

    .line 2707
    :cond_4
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    move-object v6, v0

    goto :goto_1
.end method

.method private d(Lcom/facebook/orca/chatheads/ag;)V
    .locals 3

    .prologue
    .line 1658
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1660
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/orca/chatheads/ag;)V

    .line 1662
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 1663
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 1664
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1665
    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1666
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1671
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1672
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->T()V

    .line 1674
    :cond_1
    return-void

    .line 1663
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic e(Lcom/facebook/orca/chatheads/al;)I
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v0

    return v0
.end method

.method private e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 3

    .prologue
    .line 2657
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Z)V

    .line 2662
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ak;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I

    move-result v0

    .line 2663
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/chatheads/dc;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 2664
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->D:Lcom/facebook/orca/chatheads/bt;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/chatheads/bt;->b(I)Landroid/graphics/PointF;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/dc;->a(Landroid/graphics/PointF;)V

    .line 2666
    return-void
.end method

.method private e(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 2754
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "openChatThreadViewThroughKeyguard(%s)"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2755
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->x:Lcom/facebook/orca/chatheads/cz;

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/cz;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2757
    const-string v1, "com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2758
    const-string v1, "com.facebook.orca.chatheads.EXTRA_THREAD_VIEW_SPEC"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2759
    const-string v1, "com.facebook.orca.chatheads.EXTRA_REASON"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2760
    const-string v1, "com.facebook.orca.chatheads.EXTRA_FOR_AFTER_UNLOCK_KEYGUARD"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2762
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    const/high16 v2, 0x50000000

    invoke-static {v1, v3, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 2769
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    const-class v3, Lcom/facebook/common/keyguard/KeyguardPendingIntentActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2770
    const-string v2, "pendingIntent"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2771
    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2773
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->h:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 2774
    return-void
.end method

.method private e(Lcom/facebook/orca/chatheads/ag;)V
    .locals 1

    .prologue
    .line 1681
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/facebook/orca/chatheads/ag;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1682
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->a()V

    .line 1683
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getChatHeadsContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 1684
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/chatheads/al;)Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->G()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method private f(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 3007
    .line 3008
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v2

    .line 3011
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3012
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 3016
    :goto_0
    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    iget-object v4, p0, Lcom/facebook/orca/chatheads/al;->A:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3019
    invoke-static {v0, p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3020
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/google/common/d/a/s;

    .line 3028
    :goto_1
    return-void

    .line 3021
    :cond_0
    if-eqz v2, :cond_1

    .line 3022
    invoke-virtual {p0, p2}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 3024
    :cond_1
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v2, "tried to toggle thread that was considered open even though the chat head stack is already collapsed."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 3026
    invoke-direct {p0, v1}, Lcom/facebook/orca/chatheads/al;->f(Lcom/facebook/orca/chatheads/ag;)V

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method private f(Lcom/facebook/orca/chatheads/ag;)V
    .locals 0

    .prologue
    .line 2996
    iput-object p1, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    .line 2998
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 2999
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->H()V

    .line 3000
    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/chatheads/al;)I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->S:I

    return v0
.end method

.method static synthetic h(Lcom/facebook/orca/chatheads/al;)I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->E:I

    return v0
.end method

.method static synthetic i(Lcom/facebook/orca/chatheads/al;)Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/orca/chatheads/al;)Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->ad:Z

    return v0
.end method

.method static synthetic k()I
    .locals 1

    .prologue
    .line 90
    sget v0, Lcom/facebook/orca/chatheads/al;->d:I

    return v0
.end method

.method static synthetic k(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ag;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ae:Lcom/facebook/orca/chatheads/ag;

    return-object v0
.end method

.method private l()V
    .locals 0

    .prologue
    .line 530
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->h()V

    .line 531
    return-void
.end method

.method static synthetic l(Lcom/facebook/orca/chatheads/al;)Z
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->y()Z

    move-result v0

    return v0
.end method

.method private m()V
    .locals 3

    .prologue
    .line 534
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->D:Lcom/facebook/prefs/shared/ae;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;F)F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/al;->ah:F

    .line 538
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->E:Lcom/facebook/prefs/shared/ae;

    const v2, 0x3e2e147b    # 0.17f

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;F)F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/al;->ai:F

    .line 541
    return-void
.end method

.method static synthetic m(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ae()V

    return-void
.end method

.method private n()V
    .locals 2

    .prologue
    .line 544
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 545
    sget v1, Lcom/facebook/g;->chat_head_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->E:I

    .line 546
    sget v1, Lcom/facebook/g;->chat_head_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->F:I

    .line 547
    sget v1, Lcom/facebook/g;->chat_head_dock_overshoot_x:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->G:I

    .line 548
    sget v1, Lcom/facebook/g;->chat_head_side_spring_in_start_offset_x:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->H:I

    .line 550
    sget v1, Lcom/facebook/g;->chat_head_side_spring_in_start_offset_y:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->I:I

    .line 552
    sget v1, Lcom/facebook/g;->chat_head_side_spring_in_initial_velocity_x:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->J:I

    .line 554
    sget v1, Lcom/facebook/g;->chat_head_side_spring_in_initial_velocity_y:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->K:I

    .line 556
    sget v1, Lcom/facebook/g;->chat_head_dismiss_velocity_threshold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/al;->L:I

    .line 558
    return-void
.end method

.method static synthetic n(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->l()V

    return-void
.end method

.method private o()V
    .locals 4

    .prologue
    .line 561
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 562
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 565
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v2

    sget v3, Lcom/facebook/g;->chat_head_line_item_min_x_offset:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-direct {p0, v2, v3}, Lcom/facebook/orca/chatheads/al;->a(FF)I

    move-result v2

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v1, v1

    sget v3, Lcom/facebook/g;->chat_head_line_item_min_y_offset:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/chatheads/al;->a(FF)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/al;->S:I

    .line 571
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mMaxNumChatHeads set to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/facebook/orca/chatheads/al;->S:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 572
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->C()V

    .line 573
    return-void
.end method

.method static synthetic o(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->s()V

    return-void
.end method

.method static synthetic p(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/i/a/a/f;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    return-object v0
.end method

.method private p()V
    .locals 0

    .prologue
    .line 580
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->q()V

    .line 581
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->u()V

    .line 582
    return-void
.end method

.method private q()V
    .locals 3

    .prologue
    .line 585
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 587
    new-instance v0, Lcom/facebook/orca/chatheads/cf;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->i:Landroid/view/WindowManager;

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/cf;-><init>(Landroid/view/WindowManager;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    .line 589
    new-instance v0, Lcom/facebook/orca/chatheads/ca;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/ca;-><init>(Landroid/content/Context;)V

    .line 590
    new-instance v1, Lcom/facebook/orca/chatheads/bk;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bk;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ca;->setOnDismissListener(Lcom/facebook/orca/chatheads/cd;)V

    .line 602
    new-instance v1, Lcom/facebook/orca/chatheads/bl;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bl;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ca;->setOnSizeChangeListener(Lcom/facebook/orca/chatheads/ce;)V

    .line 609
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getCloseTargetView()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/chatheads/bm;

    invoke-direct {v2, p0}, Lcom/facebook/orca/chatheads/bm;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->setOnCloseBaubleStateChangeListener(Lcom/facebook/orca/chatheads/m;)V

    .line 625
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/cf;->a(Landroid/view/View;)V

    .line 626
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->a()V

    .line 627
    return-void

    .line 585
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic q(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->w()V

    return-void
.end method

.method private r()V
    .locals 2

    .prologue
    .line 636
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ca;->setVisibility(I)V

    .line 637
    return-void
.end method

.method static synthetic r(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->x()V

    return-void
.end method

.method private s()V
    .locals 1

    .prologue
    .line 644
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->M:Landroid/graphics/Rect;

    .line 647
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->C()V

    .line 648
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 649
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 650
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->P()V

    .line 652
    :cond_0
    return-void
.end method

.method static synthetic s(Lcom/facebook/orca/chatheads/al;)Z
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->aa()Z

    move-result v0

    return v0
.end method

.method static synthetic t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    return-object v0
.end method

.method private t()V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 687
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->W:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->N:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    if-nez v0, :cond_0

    .line 688
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/al;->a(I)Lcom/google/common/d/a/s;

    .line 692
    :goto_0
    return-void

    .line 690
    :cond_0
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/al;->b(I)V

    goto :goto_0
.end method

.method static synthetic u(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private u()V
    .locals 4

    .prologue
    .line 695
    new-instance v0, Lcom/facebook/orca/chatheads/cl;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/cl;-><init>(Landroid/content/Context;)V

    .line 697
    new-instance v1, Lcom/facebook/orca/chatheads/cm;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->i:Landroid/view/WindowManager;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/orca/chatheads/cm;-><init>(Landroid/view/WindowManager;Landroid/content/res/Resources;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    .line 698
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/cm;->a(Landroid/view/View;)V

    .line 699
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->j()V

    .line 700
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->K()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/cm;->a(Z)V

    .line 701
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cl;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->c:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/cl;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 702
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Z:Lcom/facebook/orca/chatheads/cm;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cm;->a()V

    .line 704
    new-instance v0, Lcom/facebook/orca/chatheads/ck;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->i:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/chatheads/ck;-><init>(Landroid/view/WindowManager;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    .line 705
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->j()V

    .line 706
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->a()V

    .line 709
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ab:Lcom/facebook/orca/chatheads/ck;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ck;->h()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->c:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 710
    return-void

    .line 700
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic v(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/common/e/h;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->w:Lcom/facebook/common/e/h;

    return-object v0
.end method

.method private v()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v4, -0x2

    .line 731
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 733
    new-instance v0, Lcom/facebook/orca/chatheads/n;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/facebook/orca/chatheads/n;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    .line 734
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/n;->g()Lcom/google/common/d/a/s;

    .line 735
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    new-instance v2, Lcom/facebook/orca/chatheads/bn;

    invoke-direct {v2, p0}, Lcom/facebook/orca/chatheads/bn;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/n;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 741
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x33

    invoke-direct {v2, v4, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/n;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 746
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/n;->h()V

    .line 747
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getChatHeadsContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 750
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->N()Lcom/facebook/orca/chatheads/br;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/facebook/orca/chatheads/br;->a(I)Landroid/graphics/PointF;

    move-result-object v0

    .line 751
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/n;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ef;->b(Landroid/graphics/PointF;)V

    .line 752
    return-void

    :cond_0
    move v0, v1

    .line 731
    goto :goto_0
.end method

.method private w()V
    .locals 3

    .prologue
    .line 755
    const-string v0, "open_inbox"

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    .line 757
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ab()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 758
    new-instance v1, Lcom/facebook/orca/chatheads/an;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/an;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 764
    return-void
.end method

.method static synthetic w(Lcom/facebook/orca/chatheads/al;)Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->B:Z

    return v0
.end method

.method private x()V
    .locals 3

    .prologue
    .line 767
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 768
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->v:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 769
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 770
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->h:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 771
    return-void
.end method

.method static synthetic x(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->E()V

    return-void
.end method

.method static synthetic y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    return-object v0
.end method

.method private y()Z
    .locals 1

    .prologue
    .line 845
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private z()Z
    .locals 1

    .prologue
    .line 853
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic z(Lcom/facebook/orca/chatheads/al;)Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->aa:Z

    return v0
.end method


# virtual methods
.method public a(I)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 2535
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->aj:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2536
    :goto_0
    iget v1, p0, Lcom/facebook/orca/chatheads/al;->aj:I

    or-int/2addr v1, p1

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->aj:I

    .line 2538
    if-nez v0, :cond_1

    .line 2539
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->Z()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 2542
    :goto_1
    return-object v0

    .line 2535
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2542
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1044
    const-string v0, "pop"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1045
    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 778
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->o:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 779
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 2517
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2518
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    const-string v3, "close"

    move-object v0, v1

    check-cast v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    const-string v4, "starting_activity"

    invoke-virtual {v2, v3, v0, v4}, Lcom/facebook/orca/chatheads/by;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 2522
    const-string v2, "intent"

    invoke-static {p1}, Lcom/facebook/analytics/i/c;->a(Landroid/content/Intent;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 2524
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->n:Lcom/facebook/orca/chatheads/by;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/analytics/cb;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/chatheads/by;->a(Lcom/facebook/analytics/cb;)V

    .line 2526
    :cond_0
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    .line 2527
    return-void
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    .line 897
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 899
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 900
    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 902
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;

    move-result-object v1

    .line 903
    new-instance v2, Lcom/facebook/orca/chatheads/ao;

    invoke-direct {v2, p0, p1, v0}, Lcom/facebook/orca/chatheads/ao;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 911
    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/model/threads/Message;)V

    .line 912
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1055
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1056
    if-nez v0, :cond_0

    .line 1061
    :goto_0
    return-void

    .line 1059
    :cond_0
    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    .line 1060
    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/chatheads/bs;)V
    .locals 0

    .prologue
    .line 774
    iput-object p1, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    .line 775
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 2804
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->af:Z

    if-nez v0, :cond_0

    .line 2867
    :goto_0
    return-void

    .line 2807
    :cond_0
    iput-boolean v3, p0, Lcom/facebook/orca/chatheads/al;->af:Z

    .line 2809
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    if-eqz v0, :cond_1

    .line 2810
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->O:Lcom/facebook/orca/chatheads/bs;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/bs;->b()V

    .line 2813
    :cond_1
    if-eqz p1, :cond_2

    .line 2814
    const-string v2, "close"

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->U:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    :goto_1
    invoke-direct {p0, v2, v0, p1}, Lcom/facebook/orca/chatheads/al;->b(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 2820
    :cond_2
    invoke-direct {p0, v1}, Lcom/facebook/orca/chatheads/al;->f(Lcom/facebook/orca/chatheads/ag;)V

    .line 2822
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->ac:Lcom/facebook/orca/chatheads/n;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/n;->g()Lcom/google/common/d/a/s;

    .line 2823
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 2827
    invoke-virtual {p0, v3}, Lcom/facebook/orca/chatheads/al;->a(I)Lcom/google/common/d/a/s;

    .line 2829
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->c()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_3

    .line 2832
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->V()I

    move-result v0

    iget v1, p0, Lcom/facebook/orca/chatheads/al;->E:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-float v0, v0

    .line 2833
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->W()I

    move-result v1

    iget v2, p0, Lcom/facebook/orca/chatheads/al;->F:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    int-to-float v1, v1

    .line 2834
    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/dc;->g()Landroid/graphics/PointF;

    move-result-object v2

    .line 2835
    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/dc;->b()Lcom/facebook/orca/chatheads/ef;

    move-result-object v3

    new-instance v4, Landroid/graphics/PointF;

    iget v5, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v5

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    invoke-direct {v4, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v3, v4}, Lcom/facebook/orca/chatheads/ef;->a(Landroid/graphics/PointF;)Lcom/google/common/d/a/s;

    .line 2841
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_5

    .line 2842
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->d()Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/be;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/be;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 2865
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_4
    move-object v0, v1

    .line 2814
    goto :goto_1

    .line 2861
    :cond_5
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->Y()Lcom/google/common/d/a/s;

    goto :goto_2
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 661
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->W:Z

    if-ne p1, v0, :cond_0

    .line 666
    :goto_0
    return-void

    .line 664
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/al;->W:Z

    .line 665
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->t()V

    goto :goto_0
.end method

.method public b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1107
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->r()V

    .line 1108
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->F()V

    .line 1111
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/i;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1112
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1113
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 1118
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->j:Landroid/os/PowerManager;

    invoke-virtual {v1}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1119
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->h()V

    .line 1122
    :cond_0
    return-object v0

    .line 1115
    :cond_1
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0
.end method

.method public b()V
    .locals 4

    .prologue
    .line 789
    const/4 v1, 0x0

    .line 790
    iget-boolean v2, p0, Lcom/facebook/orca/chatheads/al;->ad:Z

    .line 793
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-eqz v0, :cond_0

    .line 794
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->i()V

    .line 795
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    .line 797
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    if-eqz v0, :cond_3

    .line 798
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/facebook/orca/chatheads/ca;->setVisibility(I)V

    .line 799
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 800
    const/4 v0, 0x1

    .line 801
    const-string v1, "low_on_memory"

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    .line 804
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ak()V

    .line 806
    if-nez v0, :cond_1

    if-eqz v2, :cond_2

    .line 807
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 808
    const-string v3, "expanded="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 809
    const-string v0, ",dragging="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 810
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->w:Lcom/facebook/common/e/h;

    const-string v2, "ChatHeadWindowManager: onLowMemory during interaction"

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 813
    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public b(I)V
    .locals 3

    .prologue
    .line 2601
    iget v0, p0, Lcom/facebook/orca/chatheads/al;->aj:I

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 2602
    :goto_0
    iget v1, p0, Lcom/facebook/orca/chatheads/al;->aj:I

    xor-int/lit8 v2, p1, -0x1

    and-int/2addr v1, v2

    iput v1, p0, Lcom/facebook/orca/chatheads/al;->aj:I

    .line 2603
    if-eqz v0, :cond_0

    .line 2604
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ac()V

    .line 2606
    :cond_0
    return-void

    .line 2601
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1067
    const-string v0, "pop"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1068
    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;

    .line 1069
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/google/common/d/a/s;

    .line 1070
    return-void
.end method

.method public b(Z)V
    .locals 4

    .prologue
    .line 2921
    if-eqz p1, :cond_0

    .line 2922
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ag()V

    .line 2925
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    if-nez v0, :cond_1

    .line 2926
    new-instance v0, Lcom/facebook/orca/chatheads/dc;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/al;->i:Landroid/view/WindowManager;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/al;->Y:Lcom/facebook/orca/chatheads/cf;

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/cf;->f()Landroid/view/ViewGroup;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/chatheads/dc;-><init>(Landroid/content/Context;Landroid/view/WindowManager;Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    .line 2929
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->X:Lcom/facebook/orca/chatheads/dc;

    new-instance v1, Lcom/facebook/orca/chatheads/bg;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bg;-><init>(Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/dc;->a(Lcom/facebook/orca/chatheads/dt;)V

    .line 2948
    :cond_1
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 819
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->ag:Z

    .line 820
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->b:Lcom/facebook/orca/chatheads/bo;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/bo;->c()V

    .line 821
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->k:Lcom/facebook/common/hardware/q;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->y:Lcom/facebook/common/hardware/t;

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/q;->b(Lcom/facebook/common/hardware/t;)V

    .line 822
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 823
    iput-object v2, p0, Lcom/facebook/orca/chatheads/al;->q:Landroid/os/Handler;

    .line 824
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->i()V

    .line 825
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->s:Lcom/facebook/orca/chatheads/eb;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/eb;->b()V

    .line 826
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->t:Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/k;->k()V

    .line 827
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->o:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 830
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 832
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 834
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->u:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 835
    return-void
.end method

.method public c(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1292
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->T:Lcom/facebook/orca/chatheads/i;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/i;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1294
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v1

    .line 1295
    if-nez v1, :cond_1

    .line 1305
    :cond_0
    :goto_0
    return-void

    .line 1298
    :cond_1
    invoke-direct {p0, v1}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/ag;)V

    .line 1300
    iget-object v1, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 1301
    if-eqz v0, :cond_0

    .line 1304
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/ag;)V

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 841
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->y()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 849
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/al;->af:Z

    return v0
.end method

.method public f()V
    .locals 0

    .prologue
    .line 862
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->A()V

    .line 863
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->B()V

    .line 867
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->C()V

    .line 868
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->O()Lcom/google/common/d/a/s;

    .line 869
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->am()V

    .line 870
    return-void
.end method

.method public g()V
    .locals 2

    .prologue
    .line 1320
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 1321
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1322
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/ag;)V

    goto :goto_0

    .line 1324
    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    .prologue
    .line 1327
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1328
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->k()V

    goto :goto_0

    .line 1330
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->Q:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1331
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->k()V

    goto :goto_1

    .line 1333
    :cond_1
    return-void
.end method

.method public i()V
    .locals 0

    .prologue
    .line 1735
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->R()V

    .line 1736
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ai()V

    .line 1737
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->ah()V

    .line 1738
    return-void
.end method

.method public j()V
    .locals 2

    .prologue
    .line 2642
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/al;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2649
    :cond_0
    :goto_0
    return-void

    .line 2646
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/al;->P:Lcom/facebook/orca/chatheads/ak;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->a(I)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 2647
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 2648
    const-string v1, "dismissed_previous"

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/google/common/d/a/s;

    goto :goto_0
.end method
