.class final Lcom/roidapp/baselib/view/l;
.super Landroid/support/v4/widget/ViewDragHelper$Callback;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

.field private final b:I

.field private c:Landroid/support/v4/widget/ViewDragHelper;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/view/FixedDrawerLayout;I)V
    .locals 1

    .prologue
    .line 1493
    iput-object p1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V

    .line 1487
    new-instance v0, Lcom/roidapp/baselib/view/m;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/view/m;-><init>(Lcom/roidapp/baselib/view/l;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/l;->d:Ljava/lang/Runnable;

    .line 1494
    iput p2, p0, Lcom/roidapp/baselib/view/l;->b:I

    .line 1495
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/view/l;)V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x1

    const/4 v0, 0x0

    .line 1483
    .line 2578
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->c:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I

    move-result v2

    .line 2579
    iget v1, p0, Lcom/roidapp/baselib/view/l;->b:I

    if-ne v1, v5, :cond_4

    move v3, v4

    .line 2580
    :goto_0
    if-eqz v3, :cond_5

    .line 2581
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v1, v5}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v1

    .line 2582
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    :cond_0
    add-int/2addr v0, v2

    move-object v2, v1

    move v1, v0

    .line 2588
    :goto_1
    if-eqz v2, :cond_3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v0

    if-lt v0, v1, :cond_2

    :cond_1
    if-nez v3, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v0

    if-le v0, v1, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_3

    .line 2591
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 2592
    iget-object v3, p0, Lcom/roidapp/baselib/view/l;->c:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v3, v2, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    .line 2593
    iput-boolean v4, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->c:Z

    .line 2594
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->invalidate()V

    .line 2596
    invoke-direct {p0}, Lcom/roidapp/baselib/view/l;->b()V

    .line 2598
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a()V

    .line 1483
    :cond_3
    return-void

    :cond_4
    move v3, v0

    .line 2579
    goto :goto_0

    .line 2584
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v1

    .line 2585
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v0

    sub-int/2addr v0, v2

    move-object v2, v1

    move v1, v0

    goto :goto_1
.end method

.method private b()V
    .locals 2

    .prologue
    const/4 v0, 0x3

    .line 1544
    iget v1, p0, Lcom/roidapp/baselib/view/l;->b:I

    if-ne v1, v0, :cond_0

    const/4 v0, 0x5

    .line 1545
    :cond_0
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    .line 1546
    if-eqz v0, :cond_1

    .line 1547
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    .line 1549
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1502
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1503
    return-void
.end method

.method public final a(Landroid/support/v4/widget/ViewDragHelper;)V
    .locals 0

    .prologue
    .line 1498
    iput-object p1, p0, Lcom/roidapp/baselib/view/l;->c:Landroid/support/v4/widget/ViewDragHelper;

    .line 1499
    return-void
.end method

.method public final clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 2

    .prologue
    .line 1635
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1636
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    const/4 v1, 0x0

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1639
    :goto_0
    return v0

    .line 1638
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v0

    .line 1639
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int v1, v0, v1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0
.end method

.method public final clampViewPositionVertical(Landroid/view/View;II)I
    .locals 1

    .prologue
    .line 1645
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    return v0
.end method

.method public final getViewHorizontalDragRange(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1630
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0
.end method

.method public final onEdgeDragStarted(II)V
    .locals 2

    .prologue
    .line 1617
    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1618
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    .line 1623
    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_0

    .line 1624
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->c:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1, v0, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V

    .line 1626
    :cond_0
    return-void

    .line 1620
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public final onEdgeLock(I)Z
    .locals 1

    .prologue
    .line 1611
    const/4 v0, 0x0

    return v0
.end method

.method public final onEdgeTouched(II)V
    .locals 4

    .prologue
    .line 1572
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0xa0

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1573
    return-void
.end method

.method public final onViewCaptured(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 1537
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;

    .line 1538
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$LayoutParams;->c:Z

    .line 1540
    invoke-direct {p0}, Lcom/roidapp/baselib/view/l;->b()V

    .line 1541
    return-void
.end method

.method public final onViewDragStateChanged(I)V
    .locals 2

    .prologue
    .line 1515
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->c:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->getCapturedView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(ILandroid/view/View;)V

    .line 1516
    return-void
.end method

.method public final onViewPositionChanged(Landroid/view/View;IIII)V
    .locals 3

    .prologue
    .line 1521
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1524
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    const/4 v2, 0x3

    invoke-virtual {v1, p1, v2}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1525
    add-int v1, v0, p2

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    .line 1530
    :goto_0
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v1, p1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;F)V

    .line 1531
    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1532
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->invalidate()V

    .line 1533
    return-void

    .line 1527
    :cond_0
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v1

    .line 1528
    sub-int/2addr v1, p2

    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    goto :goto_0

    .line 1531
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final onViewReleased(Landroid/view/View;FF)V
    .locals 6

    .prologue
    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    .line 1555
    invoke-static {p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b(Landroid/view/View;)F

    move-result v1

    .line 1556
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1559
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    const/4 v3, 0x3

    invoke-virtual {v0, p1, v3}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1560
    cmpl-float v0, p2, v4

    if-gtz v0, :cond_0

    cmpl-float v0, p2, v4

    if-nez v0, :cond_2

    cmpl-float v0, v1, v5

    if-lez v0, :cond_2

    :cond_0
    const/4 v0, 0x0

    .line 1566
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/roidapp/baselib/view/l;->c:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    .line 1567
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->invalidate()V

    .line 1568
    return-void

    .line 1560
    :cond_2
    neg-int v0, v2

    goto :goto_0

    .line 1562
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->getWidth()I

    move-result v0

    .line 1563
    cmpg-float v3, p2, v4

    if-ltz v3, :cond_4

    cmpl-float v3, p2, v4

    if-nez v3, :cond_1

    cmpl-float v1, v1, v5

    if-lez v1, :cond_1

    :cond_4
    sub-int/2addr v0, v2

    goto :goto_0
.end method

.method public final tryCaptureView(Landroid/view/View;I)Z
    .locals 2

    .prologue
    .line 1509
    invoke-static {p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->d(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget v1, p0, Lcom/roidapp/baselib/view/l;->b:I

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/l;->a:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
