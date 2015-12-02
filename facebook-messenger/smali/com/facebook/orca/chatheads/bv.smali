.class Lcom/facebook/orca/chatheads/bv;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;

.field private final b:Lcom/facebook/orca/chatheads/ag;

.field private c:Landroid/view/GestureDetector;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V
    .locals 0

    .prologue
    .line 1810
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1811
    iput-object p2, p0, Lcom/facebook/orca/chatheads/bv;->b:Lcom/facebook/orca/chatheads/ag;

    .line 1812
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1816
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_2

    .line 1819
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1821
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->b:Lcom/facebook/orca/chatheads/ag;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    .line 1827
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1906
    :goto_1
    return v2

    .line 1824
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ak;->e()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 1832
    :cond_1
    new-instance v3, Landroid/view/GestureDetector;

    iget-object v4, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v4}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/orca/chatheads/al;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v5, v5, Lcom/facebook/orca/chatheads/al;->b:Lcom/facebook/orca/chatheads/bo;

    invoke-direct {v3, v4, v5}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v3, p0, Lcom/facebook/orca/chatheads/bv;->c:Landroid/view/GestureDetector;

    .line 1833
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->c:Landroid/view/GestureDetector;

    invoke-virtual {v3, v2}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 1834
    iput-object v0, p0, Lcom/facebook/orca/chatheads/bv;->d:Ljava/util/List;

    .line 1835
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v0, v0, Lcom/facebook/orca/chatheads/al;->b:Lcom/facebook/orca/chatheads/bo;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->d:Ljava/util/List;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/chatheads/bo;->a(Ljava/util/Collection;)V

    .line 1842
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float v3, v0, v3

    .line 1843
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    sub-float v4, v0, v4

    .line 1844
    invoke-virtual {p2, v3, v4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 1849
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->c:Landroid/view/GestureDetector;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->c:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    .line 1853
    :goto_2
    neg-float v3, v3

    neg-float v4, v4

    invoke-virtual {p2, v3, v4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 1857
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-eq v3, v1, :cond_3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_6

    .line 1859
    :cond_3
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->y(Lcom/facebook/orca/chatheads/al;)Landroid/os/Handler;

    move-result-object v3

    const/16 v4, 0xc

    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 1860
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->b:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/ag;->c()Lcom/google/common/d/a/s;

    .line 1861
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->E(Lcom/facebook/orca/chatheads/al;)V

    .line 1863
    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v3, v3, Lcom/facebook/orca/chatheads/al;->b:Lcom/facebook/orca/chatheads/bo;

    invoke-virtual {v3}, Lcom/facebook/orca/chatheads/bo;->b()V

    .line 1865
    if-nez v0, :cond_6

    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->j(Lcom/facebook/orca/chatheads/al;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 1866
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->F(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/cf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/cf;->e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b()Lcom/google/common/d/a/s;

    .line 1867
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, v2}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/al;Z)Z

    .line 1869
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->b:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getActionState()Lcom/facebook/orca/chatheads/d;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/chatheads/d;->CLOSE:Lcom/facebook/orca/chatheads/d;

    if-ne v0, v2, :cond_4

    .line 1870
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->G(Lcom/facebook/orca/chatheads/al;)V

    .line 1871
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/bv;->d:Ljava/util/List;

    invoke-static {v0, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Ljava/util/List;)V

    .line 1872
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    const-string v2, "remove"

    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->d:Ljava/util/List;

    const-string v4, "drop_to_close"

    invoke-static {v0, v2, v3, v4}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move v2, v1

    .line 1874
    goto/16 :goto_1

    .line 1879
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1882
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->b:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    .line 1883
    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V

    .line 1884
    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/ef;->c(Landroid/graphics/PointF;)V

    .line 1885
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Landroid/graphics/PointF;)V

    .line 1896
    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->u(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;

    move v0, v1

    :cond_6
    move v2, v0

    .line 1906
    goto/16 :goto_1

    .line 1889
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/bv;->b:Lcom/facebook/orca/chatheads/ag;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v3}, Lcom/facebook/orca/chatheads/al;->H(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/chatheads/ag;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 1891
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->b()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2, v6, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/ef;->a(Landroid/graphics/PointF;)Lcom/google/common/d/a/s;

    .line 1892
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bv;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->c()V

    goto :goto_3

    :cond_8
    move v0, v2

    goto/16 :goto_2
.end method
