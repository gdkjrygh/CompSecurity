.class Lcom/facebook/orca/chatheads/bo;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "ChatHeadWindowManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;

.field private final b:Lcom/facebook/n/g;

.field private final c:Lcom/facebook/n/g;

.field private d:F

.field private e:F

.field private f:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/facebook/n/c;

.field private h:F

.field private i:F

.field private j:Landroid/graphics/PointF;

.field private k:Landroid/graphics/PointF;

.field private l:I


# direct methods
.method public constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/n/j;)V
    .locals 4

    .prologue
    .line 1945
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 1929
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    const-wide/high16 v2, 0x4022000000000000L    # 9.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bo;->b:Lcom/facebook/n/g;

    .line 1931
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bo;->c:Lcom/facebook/n/g;

    .line 1941
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bo;->j:Landroid/graphics/PointF;

    .line 1942
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bo;->k:Landroid/graphics/PointF;

    .line 1946
    invoke-virtual {p2}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->b:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/bp;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/chatheads/bp;-><init>(Lcom/facebook/orca/chatheads/bo;Lcom/facebook/orca/chatheads/al;)V

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    .line 1954
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/bo;)V
    .locals 0

    .prologue
    .line 1927
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->d()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/bo;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 1927
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    return-object v0
.end method

.method private d()V
    .locals 15

    .prologue
    const/4 v14, 0x0

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 1971
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2008
    :cond_0
    return-void

    .line 1975
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    invoke-virtual {v0, v14}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 1977
    iget v1, p0, Lcom/facebook/orca/chatheads/bo;->h:F

    iget v2, p0, Lcom/facebook/orca/chatheads/bo;->d:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    .line 1978
    iget v2, p0, Lcom/facebook/orca/chatheads/bo;->i:F

    iget v3, p0, Lcom/facebook/orca/chatheads/bo;->e:F

    sub-float/2addr v2, v3

    float-to-int v2, v2

    .line 1980
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v3

    .line 1981
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->j:Landroid/graphics/PointF;

    invoke-virtual {v3, v4}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(Landroid/graphics/PointF;)V

    .line 1982
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->j:Landroid/graphics/PointF;

    iget v5, v4, Landroid/graphics/PointF;->x:F

    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v6}, Lcom/facebook/orca/chatheads/al;->h(Lcom/facebook/orca/chatheads/al;)I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    sub-float/2addr v5, v6

    iput v5, v4, Landroid/graphics/PointF;->x:F

    .line 1983
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->j:Landroid/graphics/PointF;

    iget v5, v4, Landroid/graphics/PointF;->y:F

    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v6}, Lcom/facebook/orca/chatheads/al;->I(Lcom/facebook/orca/chatheads/al;)I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    sub-float/2addr v5, v6

    iput v5, v4, Landroid/graphics/PointF;->y:F

    .line 1985
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    invoke-virtual {v4}, Lcom/facebook/n/c;->c()D

    move-result-wide v4

    .line 1986
    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->j:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    float-to-double v6, v6

    mul-double/2addr v6, v4

    sub-double v8, v12, v4

    int-to-double v10, v1

    mul-double/2addr v8, v10

    add-double/2addr v6, v8

    double-to-int v1, v6

    .line 1987
    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->j:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    float-to-double v6, v6

    mul-double/2addr v6, v4

    sub-double v4, v12, v4

    int-to-double v8, v2

    mul-double/2addr v4, v8

    add-double/2addr v4, v6

    double-to-int v2, v4

    .line 1989
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->k:Landroid/graphics/PointF;

    int-to-float v5, v1

    iput v5, v4, Landroid/graphics/PointF;->x:F

    .line 1990
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->k:Landroid/graphics/PointF;

    int-to-float v5, v2

    iput v5, v4, Landroid/graphics/PointF;->y:F

    .line 1991
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/orca/chatheads/bo;->k:Landroid/graphics/PointF;

    invoke-virtual {v4, v5}, Lcom/facebook/orca/chatheads/ef;->b(Landroid/graphics/PointF;)V

    .line 1993
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v4}, Lcom/facebook/orca/chatheads/al;->h(Lcom/facebook/orca/chatheads/al;)I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v1

    .line 1994
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->I(Lcom/facebook/orca/chatheads/al;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v2, v1

    .line 1995
    sget-object v1, Lcom/facebook/orca/chatheads/d;->NONE:Lcom/facebook/orca/chatheads/d;

    .line 1996
    int-to-float v4, v4

    int-to-float v2, v2

    invoke-virtual {v3, v4, v2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c(FF)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1997
    sget-object v1, Lcom/facebook/orca/chatheads/d;->CLOSE:Lcom/facebook/orca/chatheads/d;

    .line 2000
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getActionState()Lcom/facebook/orca/chatheads/d;

    move-result-object v2

    if-eq v1, v2, :cond_0

    .line 2001
    sget-object v2, Lcom/facebook/orca/chatheads/d;->CLOSE:Lcom/facebook/orca/chatheads/d;

    if-ne v1, v2, :cond_3

    .line 2002
    invoke-virtual {v0, v14}, Lcom/facebook/orca/chatheads/ag;->performHapticFeedback(I)Z

    .line 2004
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 2005
    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ag;->setActionState(Lcom/facebook/orca/chatheads/d;)V

    goto :goto_0
.end method

.method private e()Lcom/facebook/orca/chatheads/ag;
    .locals 2

    .prologue
    .line 2018
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2011
    invoke-static {p1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    .line 2012
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    invoke-static {v1, v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)Lcom/facebook/orca/chatheads/ag;

    .line 2013
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->k(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 2014
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ak;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/bo;->l:I

    .line 2015
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 1960
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2306
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)Lcom/facebook/orca/chatheads/ag;

    .line 2307
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    .line 2308
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 2309
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->setOnCloseBaublePositionListener(Lcom/facebook/orca/chatheads/l;)V

    .line 2310
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 2316
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 2317
    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    .line 2023
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    .line 2028
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0xc

    invoke-static {}, Lcom/facebook/orca/chatheads/al;->k()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 2030
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 2031
    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ef;->c(Landroid/graphics/PointF;)V

    .line 2032
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iput v2, p0, Lcom/facebook/orca/chatheads/bo;->h:F

    .line 2033
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iput v2, p0, Lcom/facebook/orca/chatheads/bo;->i:F

    .line 2034
    iget v2, p0, Lcom/facebook/orca/chatheads/bo;->h:F

    iget v3, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v2, v3

    iput v2, p0, Lcom/facebook/orca/chatheads/bo;->d:F

    .line 2035
    iget v2, p0, Lcom/facebook/orca/chatheads/bo;->i:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float v1, v2, v1

    iput v1, p0, Lcom/facebook/orca/chatheads/bo;->e:F

    .line 2037
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    .line 2041
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ef;->c()V

    .line 2043
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->d()Lcom/google/common/d/a/s;

    .line 2045
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/al;Z)Z

    .line 2047
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v10, 0x0

    const v9, 0x3e2e147b    # 0.17f

    .line 2191
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/ag;->getActionState()Lcom/facebook/orca/chatheads/d;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/chatheads/d;->CLOSE:Lcom/facebook/orca/chatheads/d;

    if-ne v2, v3, :cond_0

    .line 2298
    :goto_0
    return v0

    .line 2197
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;

    move-result-object v2

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 2200
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2, p2, p3, p4}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Landroid/view/MotionEvent;FF)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2201
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->c()Lcom/google/common/d/a/s;

    .line 2203
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    const-string v2, "remove"

    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    const-string v4, "fling_to_close"

    invoke-static {v0, v2, v3, v4}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 2205
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 2206
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3, v0, p3, p4}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;FF)V

    .line 2209
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v4}, Lcom/facebook/orca/chatheads/al;->H(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2211
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->b()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3, p3, p4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0, v3, p3, p4}, Lcom/facebook/orca/chatheads/ef;->b(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;

    goto :goto_1

    .line 2216
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->e()V

    .line 2218
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->l(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2219
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->N(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;

    .line 2222
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->u(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;

    move v0, v1

    .line 2223
    goto/16 :goto_0

    .line 2226
    :cond_4
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 2227
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b()Lcom/google/common/d/a/s;

    .line 2235
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->M(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/br;

    move-result-object v2

    .line 2237
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;

    move-result-object v3

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/chatheads/ak;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I

    move-result v3

    .line 2239
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v4

    .line 2241
    iget-object v5, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v5}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v5

    if-nez v5, :cond_5

    .line 2242
    iget-object v5, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v5}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/orca/chatheads/al;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2243
    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v6}, Lcom/facebook/orca/chatheads/al;->h(Lcom/facebook/orca/chatheads/al;)I

    move-result v6

    sub-int v6, v5, v6

    .line 2247
    new-instance v7, Landroid/graphics/PointF;

    invoke-direct {v7}, Landroid/graphics/PointF;-><init>()V

    .line 2248
    invoke-virtual {v4, v7}, Lcom/facebook/orca/chatheads/ef;->c(Landroid/graphics/PointF;)V

    .line 2259
    int-to-float v4, v6

    const/high16 v6, 0x3e800000    # 0.25f

    mul-float/2addr v4, v6

    .line 2262
    iget v6, v7, Landroid/graphics/PointF;->x:F

    mul-float v8, p3, v9

    add-float/2addr v6, v8

    .line 2263
    neg-float v8, v4

    invoke-static {v8, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    .line 2264
    int-to-float v5, v5

    add-float/2addr v4, v5

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 2267
    iget v5, v7, Landroid/graphics/PointF;->x:F

    sub-float v5, v4, v5

    .line 2268
    div-float/2addr v5, v9

    .line 2269
    div-float/2addr v5, p3

    .line 2272
    mul-float/2addr v5, p4

    .line 2273
    iget v6, v7, Landroid/graphics/PointF;->y:F

    mul-float/2addr v5, v9

    add-float/2addr v5, v6

    .line 2276
    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    new-instance v7, Landroid/graphics/PointF;

    invoke-direct {v7, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v6, v7}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Landroid/graphics/PointF;)V

    .line 2280
    :cond_5
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->f:Lcom/google/common/a/es;

    invoke-virtual {v4, v0}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    .line 2281
    invoke-interface {v2, v3}, Lcom/facebook/orca/chatheads/br;->a(I)Landroid/graphics/PointF;

    move-result-object v2

    .line 2282
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v3

    invoke-virtual {v3, v2, p3, p4}, Lcom/facebook/orca/chatheads/ef;->a(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;

    .line 2286
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->u(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;

    .line 2288
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->H(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 2293
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->b()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2, v10, v10}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0, v2, p3, p4}, Lcom/facebook/orca/chatheads/ef;->a(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;

    .line 2295
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->c()V

    :cond_6
    move v0, v1

    .line 2298
    goto/16 :goto_0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    .line 2055
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    const-string v1, "long_click"

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 2058
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2059
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->J(Lcom/facebook/orca/chatheads/al;)V

    .line 2060
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->K(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;

    .line 2062
    :cond_0
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 2097
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    .line 2099
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 2101
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/bo;->h:F

    .line 2102
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/bo;->i:F

    .line 2104
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->H(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z

    move-result v1

    .line 2106
    iget-object v2, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v2

    .line 2108
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->j(Lcom/facebook/orca/chatheads/al;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 2110
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3, v7}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/al;Z)Z

    .line 2113
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->A(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/b/k;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/b/k;->f()V

    .line 2115
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->L(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;

    .line 2116
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->G(Lcom/facebook/orca/chatheads/al;)V

    .line 2118
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->c()Lcom/google/common/d/a/s;

    .line 2120
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2123
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/dc;->d()Lcom/google/common/d/a/s;

    .line 2125
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    .line 2126
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/facebook/orca/chatheads/ak;->e(Lcom/facebook/messages/threads/model/ThreadViewSpec;)I

    move-result v1

    .line 2128
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->M(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/br;

    move-result-object v3

    .line 2129
    invoke-interface {v3, v1}, Lcom/facebook/orca/chatheads/br;->a(I)Landroid/graphics/PointF;

    move-result-object v1

    .line 2132
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/dc;->b()Lcom/facebook/orca/chatheads/ef;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v4

    new-instance v5, Landroid/graphics/PointF;

    iget v6, v1, Landroid/graphics/PointF;->x:F

    neg-float v6, v6

    iget v1, v1, Landroid/graphics/PointF;->y:F

    neg-float v1, v1

    invoke-direct {v5, v6, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v3, v4, v5}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;Landroid/graphics/PointF;)Lcom/google/common/d/a/s;

    .line 2137
    :cond_0
    new-instance v1, Lcom/facebook/orca/chatheads/bq;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/bq;-><init>(Lcom/facebook/orca/chatheads/bo;)V

    invoke-virtual {v2, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->setOnCloseBaublePositionListener(Lcom/facebook/orca/chatheads/l;)V

    .line 2148
    :cond_1
    iget v1, p0, Lcom/facebook/orca/chatheads/bo;->h:F

    iget v3, p0, Lcom/facebook/orca/chatheads/bo;->d:F

    sub-float/2addr v1, v3

    .line 2149
    iget v3, p0, Lcom/facebook/orca/chatheads/bo;->i:F

    iget v4, p0, Lcom/facebook/orca/chatheads/bo;->e:F

    sub-float/2addr v3, v4

    .line 2151
    iget-object v4, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v4}, Lcom/facebook/orca/chatheads/al;->h(Lcom/facebook/orca/chatheads/al;)I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    add-float/2addr v4, v1

    .line 2152
    iget-object v5, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v5}, Lcom/facebook/orca/chatheads/al;->I(Lcom/facebook/orca/chatheads/al;)I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    add-float/2addr v5, v3

    .line 2153
    invoke-virtual {v2, v4, v5}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(FF)V

    .line 2155
    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v6}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 2156
    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v6, v1, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;FF)I

    move-result v1

    .line 2157
    const/4 v3, 0x0

    iget-object v6, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v6}, Lcom/facebook/orca/chatheads/al;->D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;

    move-result-object v6

    invoke-virtual {v6}, Lcom/facebook/orca/chatheads/ak;->b()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 2158
    iget v3, p0, Lcom/facebook/orca/chatheads/bo;->l:I

    if-eq v1, v3, :cond_2

    .line 2159
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3, v0, v1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;I)V

    .line 2160
    iput v1, p0, Lcom/facebook/orca/chatheads/bo;->l:I

    .line 2164
    :cond_2
    invoke-virtual {v2, v4, v5}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2165
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->b:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 2174
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->d()V

    .line 2176
    return v7

    .line 2169
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->g:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->c:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    goto :goto_0
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 2075
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 2076
    if-eqz v0, :cond_0

    .line 2077
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/bo;->e()Lcom/facebook/orca/chatheads/ag;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/ag;->c()Lcom/google/common/d/a/s;

    .line 2078
    iget-object v1, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    const-string v2, "chathead_click"

    invoke-static {v1, v0, v2}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 2080
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bo;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b()Lcom/google/common/d/a/s;

    .line 2081
    const/4 v0, 0x1

    return v0
.end method
