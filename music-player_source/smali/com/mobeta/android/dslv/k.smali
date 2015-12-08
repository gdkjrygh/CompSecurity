.class final Lcom/mobeta/android/dslv/k;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mobeta/android/dslv/DragSortListView;

.field private b:Z

.field private c:J

.field private d:J

.field private e:I

.field private f:F

.field private g:J

.field private h:I

.field private i:F

.field private j:Z


# direct methods
.method public constructor <init>(Lcom/mobeta/android/dslv/DragSortListView;)V
    .locals 1

    iput-object p1, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobeta/android/dslv/k;->j:Z

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/mobeta/android/dslv/k;->j:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobeta/android/dslv/k;->b:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mobeta/android/dslv/k;->j:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mobeta/android/dslv/k;->g:J

    iget-wide v0, p0, Lcom/mobeta/android/dslv/k;->g:J

    iput-wide v0, p0, Lcom/mobeta/android/dslv/k;->c:J

    iput p1, p0, Lcom/mobeta/android/dslv/k;->h:I

    iget-object v0, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0, p0}, Lcom/mobeta/android/dslv/DragSortListView;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mobeta/android/dslv/k;->j:Z

    return v0
.end method

.method public final b()I
    .locals 1

    iget-boolean v0, p0, Lcom/mobeta/android/dslv/k;->j:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/mobeta/android/dslv/k;->h:I

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0, p0}, Lcom/mobeta/android/dslv/DragSortListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobeta/android/dslv/k;->j:Z

    return-void
.end method

.method public final run()V
    .locals 11

    const/4 v10, 0x0

    iget-boolean v0, p0, Lcom/mobeta/android/dslv/k;->b:Z

    if-eqz v0, :cond_0

    iput-boolean v10, p0, Lcom/mobeta/android/dslv/k;->j:Z

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0}, Lcom/mobeta/android/dslv/DragSortListView;->getFirstVisiblePosition()I

    move-result v1

    iget-object v0, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0}, Lcom/mobeta/android/dslv/DragSortListView;->getLastVisiblePosition()I

    move-result v0

    iget-object v2, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v2}, Lcom/mobeta/android/dslv/DragSortListView;->getCount()I

    move-result v3

    iget-object v2, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v2}, Lcom/mobeta/android/dslv/DragSortListView;->getPaddingTop()I

    move-result v2

    iget-object v4, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v4}, Lcom/mobeta/android/dslv/DragSortListView;->getHeight()I

    move-result v4

    sub-int/2addr v4, v2

    iget-object v5, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v5}, Lcom/mobeta/android/dslv/DragSortListView;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v5}, Lcom/mobeta/android/dslv/DragSortListView;->f(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v5

    iget-object v6, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v6}, Lcom/mobeta/android/dslv/DragSortListView;->s(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v6

    iget-object v7, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v7}, Lcom/mobeta/android/dslv/DragSortListView;->c(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget-object v6, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v6}, Lcom/mobeta/android/dslv/DragSortListView;->f(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v6

    iget-object v7, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v7}, Lcom/mobeta/android/dslv/DragSortListView;->s(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v7

    iget-object v8, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v8}, Lcom/mobeta/android/dslv/DragSortListView;->c(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v8

    sub-int/2addr v7, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v7, p0, Lcom/mobeta/android/dslv/k;->h:I

    if-nez v7, :cond_4

    iget-object v3, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v3, v10}, Lcom/mobeta/android/dslv/DragSortListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_1

    iput-boolean v10, p0, Lcom/mobeta/android/dslv/k;->j:Z

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    if-ne v3, v2, :cond_2

    iput-boolean v10, p0, Lcom/mobeta/android/dslv/k;->j:Z

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v3}, Lcom/mobeta/android/dslv/DragSortListView;->t(Lcom/mobeta/android/dslv/DragSortListView;)Lcom/mobeta/android/dslv/j;

    move-result-object v3

    iget-object v5, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v5}, Lcom/mobeta/android/dslv/DragSortListView;->u(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v5

    int-to-float v6, v6

    sub-float/2addr v5, v6

    iget-object v6, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v6}, Lcom/mobeta/android/dslv/DragSortListView;->v(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v6

    div-float/2addr v5, v6

    iget-wide v6, p0, Lcom/mobeta/android/dslv/k;->c:J

    invoke-interface {v3, v5}, Lcom/mobeta/android/dslv/j;->a(F)F

    move-result v3

    iput v3, p0, Lcom/mobeta/android/dslv/k;->i:F

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/mobeta/android/dslv/k;->d:J

    iget-wide v6, p0, Lcom/mobeta/android/dslv/k;->d:J

    iget-wide v8, p0, Lcom/mobeta/android/dslv/k;->c:J

    sub-long/2addr v6, v8

    long-to-float v3, v6

    iput v3, p0, Lcom/mobeta/android/dslv/k;->f:F

    iget v3, p0, Lcom/mobeta/android/dslv/k;->i:F

    iget v5, p0, Lcom/mobeta/android/dslv/k;->f:F

    mul-float/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, p0, Lcom/mobeta/android/dslv/k;->e:I

    iget v3, p0, Lcom/mobeta/android/dslv/k;->e:I

    if-ltz v3, :cond_7

    iget v0, p0, Lcom/mobeta/android/dslv/k;->e:I

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/mobeta/android/dslv/k;->e:I

    move v0, v1

    :goto_2
    iget-object v3, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    sub-int v1, v0, v1

    invoke-virtual {v3, v1}, Lcom/mobeta/android/dslv/DragSortListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v1

    iget v4, p0, Lcom/mobeta/android/dslv/k;->e:I

    add-int/2addr v1, v4

    if-nez v0, :cond_3

    if-le v1, v2, :cond_3

    move v1, v2

    :cond_3
    iget-object v4, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lcom/mobeta/android/dslv/DragSortListView;->a(Lcom/mobeta/android/dslv/DragSortListView;Z)V

    iget-object v4, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    sub-int/2addr v1, v2

    invoke-virtual {v4, v0, v1}, Lcom/mobeta/android/dslv/DragSortListView;->setSelectionFromTop(II)V

    iget-object v1, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v1}, Lcom/mobeta/android/dslv/DragSortListView;->layoutChildren()V

    iget-object v1, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v1}, Lcom/mobeta/android/dslv/DragSortListView;->invalidate()V

    iget-object v1, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v1, v10}, Lcom/mobeta/android/dslv/DragSortListView;->a(Lcom/mobeta/android/dslv/DragSortListView;Z)V

    iget-object v1, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v1, v0, v3}, Lcom/mobeta/android/dslv/DragSortListView;->c(Lcom/mobeta/android/dslv/DragSortListView;ILandroid/view/View;)V

    iget-wide v0, p0, Lcom/mobeta/android/dslv/k;->d:J

    iput-wide v0, p0, Lcom/mobeta/android/dslv/k;->c:J

    iget-object v0, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0, p0}, Lcom/mobeta/android/dslv/DragSortListView;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :cond_4
    iget-object v6, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    sub-int v7, v0, v1

    invoke-virtual {v6, v7}, Lcom/mobeta/android/dslv/DragSortListView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_5

    iput-boolean v10, p0, Lcom/mobeta/android/dslv/k;->j:Z

    goto/16 :goto_0

    :cond_5
    add-int/lit8 v3, v3, -0x1

    if-ne v0, v3, :cond_6

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v3

    add-int v6, v4, v2

    if-gt v3, v6, :cond_6

    iput-boolean v10, p0, Lcom/mobeta/android/dslv/k;->j:Z

    goto/16 :goto_0

    :cond_6
    iget-object v3, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v3}, Lcom/mobeta/android/dslv/DragSortListView;->t(Lcom/mobeta/android/dslv/DragSortListView;)Lcom/mobeta/android/dslv/j;

    move-result-object v3

    int-to-float v5, v5

    iget-object v6, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v6}, Lcom/mobeta/android/dslv/DragSortListView;->w(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v6

    sub-float/2addr v5, v6

    iget-object v6, p0, Lcom/mobeta/android/dslv/k;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v6}, Lcom/mobeta/android/dslv/DragSortListView;->x(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v6

    div-float/2addr v5, v6

    iget-wide v6, p0, Lcom/mobeta/android/dslv/k;->c:J

    invoke-interface {v3, v5}, Lcom/mobeta/android/dslv/j;->a(F)F

    move-result v3

    neg-float v3, v3

    iput v3, p0, Lcom/mobeta/android/dslv/k;->i:F

    goto/16 :goto_1

    :cond_7
    neg-int v3, v4

    iget v4, p0, Lcom/mobeta/android/dslv/k;->e:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, p0, Lcom/mobeta/android/dslv/k;->e:I

    goto/16 :goto_2
.end method
