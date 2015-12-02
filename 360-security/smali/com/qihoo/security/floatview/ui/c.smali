.class public Lcom/qihoo/security/floatview/ui/c;
.super Landroid/widget/FrameLayout;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/floatview/ui/c$b;,
        Lcom/qihoo/security/floatview/ui/c$a;
    }
.end annotation


# instance fields
.field private final A:I

.field private final B:Landroid/os/Handler;

.field private final C:Ljava/lang/Runnable;

.field private D:Lcom/qihoo/security/floatview/ui/c$b;

.field private E:I

.field private F:Z

.field private G:Z

.field private final a:Lcom/qihoo/security/floatview/ui/c$a;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field f:Landroid/content/Context;

.field protected g:Landroid/view/WindowManager;

.field protected h:Landroid/view/WindowManager$LayoutParams;

.field protected i:I

.field protected j:I

.field protected k:I

.field protected l:I

.field protected m:I

.field protected n:I

.field protected o:I

.field protected p:I

.field protected q:I

.field protected r:I

.field protected s:Z

.field private final t:Z

.field private u:I

.field private v:I

.field private w:Landroid/widget/Scroller;

.field private x:Landroid/view/VelocityTracker;

.field private final y:I

.field private final z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/qihoo/security/floatview/ui/c$a;)V
    .locals 6

    .prologue
    const/4 v1, -0x2

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 152
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 63
    iput v3, p0, Lcom/qihoo/security/floatview/ui/c;->v:I

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    .line 70
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->B:Landroid/os/Handler;

    .line 71
    new-instance v0, Lcom/qihoo/security/floatview/ui/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/ui/c$1;-><init>(Lcom/qihoo/security/floatview/ui/c;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->C:Ljava/lang/Runnable;

    .line 226
    iput v3, p0, Lcom/qihoo/security/floatview/ui/c;->E:I

    .line 304
    iput v2, p0, Lcom/qihoo/security/floatview/ui/c;->l:I

    .line 305
    iput v2, p0, Lcom/qihoo/security/floatview/ui/c;->n:I

    .line 306
    iput v2, p0, Lcom/qihoo/security/floatview/ui/c;->p:I

    .line 307
    iput v2, p0, Lcom/qihoo/security/floatview/ui/c;->r:I

    .line 626
    iput-boolean v3, p0, Lcom/qihoo/security/floatview/ui/c;->G:Z

    .line 154
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    .line 155
    iput-object p7, p0, Lcom/qihoo/security/floatview/ui/c;->a:Lcom/qihoo/security/floatview/ui/c$a;

    .line 156
    iput-boolean p6, p0, Lcom/qihoo/security/floatview/ui/c;->t:Z

    .line 158
    iput-object p2, p0, Lcom/qihoo/security/floatview/ui/c;->b:Ljava/lang/String;

    .line 159
    iput-object p3, p0, Lcom/qihoo/security/floatview/ui/c;->c:Ljava/lang/String;

    .line 160
    iput-object p4, p0, Lcom/qihoo/security/floatview/ui/c;->d:Ljava/lang/String;

    .line 161
    iput-object p5, p0, Lcom/qihoo/security/floatview/ui/c;->e:Ljava/lang/String;

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    const-string/jumbo v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->g:Landroid/view/WindowManager;

    .line 164
    new-instance v0, Landroid/widget/Scroller;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-direct {v0, v2, v3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    .line 166
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v3, 0x7d3

    const/16 v4, 0x8

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 171
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 172
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    .line 173
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->j:I

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 175
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/floatview/ui/c;->y:I

    .line 176
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/floatview/ui/c;->z:I

    .line 177
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->A:I

    .line 179
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 180
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    iput v1, p0, Lcom/qihoo/security/floatview/ui/c;->u:I

    .line 181
    const v1, 0x7f090061

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->v:I

    .line 183
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->u:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->c(I)V

    .line 184
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    return-object v0
.end method

.method private a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 517
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v1, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    div-int/lit8 v1, v1, 0x2

    if-lt v0, v1, :cond_1

    .line 522
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 524
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    .line 536
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 537
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 539
    :cond_0
    return-void

    .line 531
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 533
    invoke-virtual {p0, v2}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    goto :goto_0
.end method

.method private a(III)V
    .locals 12

    .prologue
    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 482
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    if-eqz v0, :cond_0

    .line 483
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/floatview/ui/c$b;->a(II)V

    .line 486
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 487
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    move v0, v9

    :goto_0
    invoke-virtual {p0, v1, v2, v0}, Lcom/qihoo/security/floatview/ui/c;->a(IIZ)Z

    move-result v0

    move v11, v0

    .line 493
    :goto_1
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    .line 494
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->z:I

    if-gt v1, v2, :cond_1

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->z:I

    if-le v1, v2, :cond_2

    .line 495
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    neg-int v3, v3

    mul-int/lit8 v5, v3, 0x2

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    mul-int/lit8 v6, v3, 0x2

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->j:I

    neg-int v3, v3

    mul-int/lit8 v7, v3, 0x2

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->j:I

    mul-int/lit8 v8, v3, 0x2

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 497
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getDuration()I

    move-result v1

    int-to-double v2, v1

    const-wide v4, 0x3fd999999999999aL    # 0.4

    mul-double/2addr v2, v4

    double-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->extendDuration(I)V

    move v0, v9

    .line 503
    :cond_2
    if-eqz v0, :cond_5

    .line 504
    if-nez v11, :cond_4

    .line 505
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->B:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->C:Ljava/lang/Runnable;

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 506
    iput-boolean v9, p0, Lcom/qihoo/security/floatview/ui/c;->F:Z

    .line 514
    :goto_2
    return-void

    :cond_3
    move v0, v10

    .line 487
    goto :goto_0

    .line 508
    :cond_4
    iput-boolean v10, p0, Lcom/qihoo/security/floatview/ui/c;->F:Z

    goto :goto_2

    .line 511
    :cond_5
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->j()V

    goto :goto_2

    :cond_6
    move v11, v10

    goto :goto_1
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/ui/c;III)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/floatview/ui/c;->a(III)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/ui/c;Z)Z
    .locals 0

    .prologue
    .line 29
    iput-boolean p1, p0, Lcom/qihoo/security/floatview/ui/c;->F:Z

    return p1
.end method

.method private b()V
    .locals 3

    .prologue
    .line 542
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 547
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 548
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 549
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 554
    :goto_0
    return-void

    .line 551
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 552
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/floatview/ui/c;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/c;->a()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/floatview/ui/c;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/c;->b()V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/floatview/ui/c;)Lcom/qihoo/security/floatview/ui/c$b;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/floatview/ui/c;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->B:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/floatview/ui/c;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->F:Z

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/floatview/ui/c;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->t:Z

    return v0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 236
    return-void
.end method

.method protected a(II)V
    .locals 1

    .prologue
    .line 328
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/floatview/ui/c$b;->b(II)V

    .line 331
    :cond_0
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 635
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->u:I

    .line 639
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 640
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    .line 641
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->j:I

    .line 642
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->l()V

    .line 643
    return-void
.end method

.method protected a(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .prologue
    .line 349
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->g:Landroid/view/WindowManager;

    invoke-interface {v0, p0, p1}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 350
    return-void
.end method

.method protected a(IIZ)Z
    .locals 3

    .prologue
    .line 334
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {v0, v1, v2, p3}, Lcom/qihoo/security/floatview/ui/c$b;->a(IIZ)Z

    move-result v0

    .line 337
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected b(II)V
    .locals 3

    .prologue
    .line 322
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/floatview/ui/c$b;->c(II)V

    .line 325
    :cond_0
    return-void
.end method

.method protected c(I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, -0x1

    .line 565
    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    .line 570
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v1

    .line 571
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->c:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 586
    :goto_0
    if-eq v1, v3, :cond_3

    if-eq v0, v3, :cond_3

    .line 587
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 588
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 595
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v1, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    div-int/lit8 v1, v1, 0x2

    if-lt v0, v1, :cond_4

    .line 596
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 597
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    .line 603
    :goto_2
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 605
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/floatview/ui/c$b;->a(II)V

    .line 608
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->a(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 613
    :cond_1
    :goto_3
    return-void

    .line 577
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->d:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v1

    .line 578
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->e:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    .line 591
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 592
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/c;->j:I

    div-int/lit8 v1, v1, 0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_1

    .line 599
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iput v4, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 600
    invoke-virtual {p0, v4}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    goto :goto_2

    .line 609
    :catch_0
    move-exception v0

    goto :goto_3
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 478
    const/4 v0, 0x1

    return v0
.end method

.method public e()V
    .locals 0

    .prologue
    .line 319
    return-void
.end method

.method public f()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 250
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 269
    :goto_0
    return v0

    .line 259
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->g:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v1, p0, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    const/4 v0, 0x1

    goto :goto_0

    .line 264
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public g()V
    .locals 1

    .prologue
    .line 277
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 294
    :goto_0
    return-void

    .line 285
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->g:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 289
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public getOrientation()I
    .locals 1

    .prologue
    .line 187
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->u:I

    return v0
.end method

.method protected getSide()I
    .locals 1

    .prologue
    .line 229
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->E:I

    return v0
.end method

.method public getWidthOnSide()I
    .locals 1

    .prologue
    .line 623
    const/4 v0, 0x0

    return v0
.end method

.method public getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 616
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    return v0
.end method

.method public j()V
    .locals 1

    .prologue
    .line 216
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->playSoundEffect(I)V

    .line 217
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->a:Lcom/qihoo/security/floatview/ui/c$a;

    if-eqz v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->a:Lcom/qihoo/security/floatview/ui/c$a;

    invoke-interface {v0}, Lcom/qihoo/security/floatview/ui/c$a;->c()V

    .line 220
    :cond_0
    return-void
.end method

.method protected k()V
    .locals 1

    .prologue
    .line 557
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->u:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->c(I)V

    .line 558
    return-void
.end method

.method public l()V
    .locals 1

    .prologue
    .line 629
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->k()V

    .line 630
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->G:Z

    .line 631
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .prologue
    .line 192
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 198
    invoke-virtual {p0, p0}, Lcom/qihoo/security/floatview/ui/c;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 199
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 203
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 208
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->g()V

    .line 212
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 213
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 353
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 354
    iget-boolean v3, p0, Lcom/qihoo/security/floatview/ui/c;->G:Z

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    .line 355
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_0

    .line 356
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 357
    iput-object v9, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    .line 474
    :cond_0
    :goto_0
    return v0

    .line 364
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    .line 365
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    float-to-int v3, v3

    iput v3, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    .line 366
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 367
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 368
    iget-object v5, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    if-nez v5, :cond_2

    .line 369
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v5

    iput-object v5, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    .line 371
    :cond_2
    iget v5, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    int-to-float v5, v5

    iget v6, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    int-to-float v6, v6

    invoke-virtual {p2, v5, v6}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 372
    iget-object v5, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    invoke-virtual {v5, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 373
    invoke-virtual {p2, v3, v4}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 375
    packed-switch v2, :pswitch_data_0

    :cond_3
    :goto_1
    move v0, v1

    .line 474
    goto :goto_0

    .line 377
    :pswitch_0
    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->G:Z

    .line 378
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->isFinished()Z

    move-result v2

    if-nez v2, :cond_4

    .line 379
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->w:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 380
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    .line 384
    :goto_2
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->l:I

    .line 385
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->n:I

    .line 386
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->o:I

    .line 387
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->p:I

    .line 388
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->q:I

    .line 389
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->r:I

    .line 390
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->e()V

    goto :goto_1

    .line 382
    :cond_4
    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    goto :goto_2

    .line 395
    :pswitch_1
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    if-nez v0, :cond_9

    .line 397
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->l:I

    sub-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->y:I

    if-gt v0, v2, :cond_5

    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->n:I

    sub-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->y:I

    if-le v0, v2, :cond_3

    .line 399
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 400
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->v:I

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 401
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    div-int/lit8 v2, v2, 0x2

    if-lt v0, v2, :cond_8

    .line 402
    invoke-virtual {p0, v8}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    .line 406
    :goto_3
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 407
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/floatview/ui/c;->b(II)V

    .line 408
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    if-eqz v0, :cond_6

    .line 409
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {v0, v2, v3}, Lcom/qihoo/security/floatview/ui/c$b;->a(II)V

    .line 411
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 413
    :cond_7
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/c;->s:Z

    .line 414
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->l:I

    .line 415
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->n:I

    goto/16 :goto_1

    .line 404
    :cond_8
    invoke-virtual {p0, v7}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    goto :goto_3

    .line 420
    :cond_9
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 421
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->v:I

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 423
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c;->i:I

    div-int/lit8 v2, v2, 0x2

    if-lt v0, v2, :cond_c

    .line 424
    invoke-virtual {p0, v8}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    .line 429
    :goto_4
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 430
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    if-eqz v0, :cond_a

    .line 431
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {v0, v2, v3}, Lcom/qihoo/security/floatview/ui/c$b;->a(II)V

    .line 432
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/floatview/ui/c;->a(II)V

    .line 435
    :cond_a
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/c;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 437
    :cond_b
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->l:I

    .line 438
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/c;->n:I

    goto/16 :goto_1

    .line 426
    :cond_c
    invoke-virtual {p0, v7}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    goto :goto_4

    .line 445
    :pswitch_2
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->d()Z

    move-result v0

    if-nez v0, :cond_d

    .line 446
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->k:I

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 447
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iget v4, p0, Lcom/qihoo/security/floatview/ui/c;->v:I

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/c;->getHeight()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 448
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->g:Landroid/view/WindowManager;

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v3}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 450
    :cond_d
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    .line 451
    const/16 v3, 0x3e8

    iget v4, p0, Lcom/qihoo/security/floatview/ui/c;->A:I

    int-to-float v4, v4

    invoke-virtual {v0, v3, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 452
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v3

    float-to-int v3, v3

    .line 453
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    float-to-int v0, v0

    .line 454
    div-int/lit8 v3, v3, 0x2

    .line 455
    div-int/lit8 v0, v0, 0x2

    .line 456
    iget-object v4, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    if-eqz v4, :cond_e

    .line 457
    iget-object v4, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    invoke-virtual {v4}, Landroid/view/VelocityTracker;->recycle()V

    .line 458
    iput-object v9, p0, Lcom/qihoo/security/floatview/ui/c;->x:Landroid/view/VelocityTracker;

    .line 460
    :cond_e
    iget-object v4, p0, Lcom/qihoo/security/floatview/ui/c;->B:Landroid/os/Handler;

    new-instance v5, Lcom/qihoo/security/floatview/ui/c$2;

    invoke-direct {v5, p0, v2, v3, v0}, Lcom/qihoo/security/floatview/ui/c$2;-><init>(Lcom/qihoo/security/floatview/ui/c;III)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_1

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setOnPositionChangeListener(Lcom/qihoo/security/floatview/ui/c$b;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/c;->D:Lcom/qihoo/security/floatview/ui/c$b;

    .line 144
    return-void
.end method

.method protected setSide(I)V
    .locals 1

    .prologue
    .line 239
    iget v0, p0, Lcom/qihoo/security/floatview/ui/c;->E:I

    if-eq v0, p1, :cond_0

    .line 240
    iput p1, p0, Lcom/qihoo/security/floatview/ui/c;->E:I

    .line 241
    invoke-virtual {p0, p1}, Lcom/qihoo/security/floatview/ui/c;->a(I)V

    .line 243
    :cond_0
    return-void
.end method

.method public setWindowLayoutParams(Landroid/view/WindowManager$LayoutParams;)V
    .locals 0

    .prologue
    .line 297
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    .line 298
    return-void
.end method
