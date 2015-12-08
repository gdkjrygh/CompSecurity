.class final Lcom/mobeta/android/dslv/r;
.super Lcom/mobeta/android/dslv/t;


# instance fields
.field final synthetic a:Lcom/mobeta/android/dslv/DragSortListView;

.field private d:F

.field private e:F

.field private f:F

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I


# direct methods
.method public constructor <init>(Lcom/mobeta/android/dslv/DragSortListView;I)V
    .locals 1

    const/4 v0, -0x1

    iput-object p1, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-direct {p0, p1, p2}, Lcom/mobeta/android/dslv/t;-><init>(Lcom/mobeta/android/dslv/DragSortListView;I)V

    iput v0, p0, Lcom/mobeta/android/dslv/r;->g:I

    iput v0, p0, Lcom/mobeta/android/dslv/r;->h:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const/4 v1, 0x1

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v0, -0x1

    const/4 v5, 0x0

    iput v0, p0, Lcom/mobeta/android/dslv/r;->g:I

    iput v0, p0, Lcom/mobeta/android/dslv/r;->h:I

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v2}, Lcom/mobeta/android/dslv/DragSortListView;->m(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v2

    iput v2, p0, Lcom/mobeta/android/dslv/r;->i:I

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v2}, Lcom/mobeta/android/dslv/DragSortListView;->n(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v2

    iput v2, p0, Lcom/mobeta/android/dslv/r;->j:I

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v2}, Lcom/mobeta/android/dslv/DragSortListView;->i(Lcom/mobeta/android/dslv/DragSortListView;)I

    move-result v2

    iput v2, p0, Lcom/mobeta/android/dslv/r;->k:I

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v2, v1}, Lcom/mobeta/android/dslv/DragSortListView;->b(Lcom/mobeta/android/dslv/DragSortListView;I)V

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v2}, Lcom/mobeta/android/dslv/DragSortListView;->e(Lcom/mobeta/android/dslv/DragSortListView;)Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iput v2, p0, Lcom/mobeta/android/dslv/r;->d:F

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v2}, Lcom/mobeta/android/dslv/DragSortListView;->o(Lcom/mobeta/android/dslv/DragSortListView;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v2}, Lcom/mobeta/android/dslv/DragSortListView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v4

    iget-object v3, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v3}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v3

    cmpl-float v3, v3, v5

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    iget v4, p0, Lcom/mobeta/android/dslv/r;->d:F

    cmpg-float v4, v4, v5

    if-gez v4, :cond_1

    :goto_0
    int-to-float v0, v0

    mul-float/2addr v0, v2

    invoke-static {v3, v0}, Lcom/mobeta/android/dslv/DragSortListView;->a(Lcom/mobeta/android/dslv/DragSortListView;F)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    mul-float v0, v2, v4

    iget-object v1, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v1}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v1

    cmpg-float v1, v1, v5

    if-gez v1, :cond_3

    iget-object v1, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v1}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v1

    neg-float v2, v0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    iget-object v1, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    neg-float v0, v0

    invoke-static {v1, v0}, Lcom/mobeta/android/dslv/DragSortListView;->a(Lcom/mobeta/android/dslv/DragSortListView;F)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v1}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v1

    cmpl-float v1, v1, v5

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v1}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v1

    cmpg-float v1, v1, v0

    if-gez v1, :cond_0

    iget-object v1, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v1, v0}, Lcom/mobeta/android/dslv/DragSortListView;->a(Lcom/mobeta/android/dslv/DragSortListView;F)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->q(Lcom/mobeta/android/dslv/DragSortListView;)V

    goto :goto_1
.end method

.method public final a(F)V
    .locals 12

    const/4 v11, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v3, v0, p1

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0}, Lcom/mobeta/android/dslv/DragSortListView;->getFirstVisiblePosition()I

    move-result v4

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    iget v5, p0, Lcom/mobeta/android/dslv/r;->i:I

    sub-int/2addr v5, v4

    invoke-virtual {v0, v5}, Lcom/mobeta/android/dslv/DragSortListView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->o(Lcom/mobeta/android/dslv/DragSortListView;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iget-wide v8, p0, Lcom/mobeta/android/dslv/r;->b:J

    sub-long/2addr v6, v8

    long-to-float v0, v6

    const/high16 v6, 0x447a0000    # 1000.0f

    div-float v6, v0, v6

    cmpl-float v0, v6, v11

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v0

    mul-float v7, v0, v6

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-virtual {v0}, Lcom/mobeta/android/dslv/DragSortListView;->getWidth()I

    move-result v8

    iget-object v9, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v9}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v10

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->p(Lcom/mobeta/android/dslv/DragSortListView;)F

    move-result v0

    cmpl-float v0, v0, v11

    if-lez v0, :cond_2

    move v0, v1

    :goto_1
    int-to-float v0, v0

    mul-float/2addr v0, v6

    int-to-float v6, v8

    mul-float/2addr v0, v6

    add-float/2addr v0, v10

    invoke-static {v9, v0}, Lcom/mobeta/android/dslv/DragSortListView;->a(Lcom/mobeta/android/dslv/DragSortListView;F)V

    iget v0, p0, Lcom/mobeta/android/dslv/r;->d:F

    add-float/2addr v0, v7

    iput v0, p0, Lcom/mobeta/android/dslv/r;->d:F

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->e(Lcom/mobeta/android/dslv/DragSortListView;)Landroid/graphics/Point;

    move-result-object v0

    iget v6, p0, Lcom/mobeta/android/dslv/r;->d:F

    float-to-int v6, v6

    iput v6, v0, Landroid/graphics/Point;->x:I

    iget v0, p0, Lcom/mobeta/android/dslv/r;->d:F

    int-to-float v6, v8

    cmpg-float v0, v0, v6

    if-gez v0, :cond_3

    iget v0, p0, Lcom/mobeta/android/dslv/r;->d:F

    neg-int v6, v8

    int-to-float v6, v6

    cmpl-float v0, v0, v6

    if-lez v0, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mobeta/android/dslv/r;->b:J

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->g(Lcom/mobeta/android/dslv/DragSortListView;)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    if-eqz v5, :cond_5

    iget v0, p0, Lcom/mobeta/android/dslv/r;->g:I

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    iget v6, p0, Lcom/mobeta/android/dslv/r;->i:I

    invoke-static {v0, v6, v5}, Lcom/mobeta/android/dslv/DragSortListView;->b(Lcom/mobeta/android/dslv/DragSortListView;ILandroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/mobeta/android/dslv/r;->g:I

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v6, p0, Lcom/mobeta/android/dslv/r;->g:I

    sub-int/2addr v0, v6

    int-to-float v0, v0

    iput v0, p0, Lcom/mobeta/android/dslv/r;->e:F

    :cond_4
    iget v0, p0, Lcom/mobeta/android/dslv/r;->e:F

    mul-float/2addr v0, v3

    float-to-int v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    iget v7, p0, Lcom/mobeta/android/dslv/r;->g:I

    add-int/2addr v0, v7

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    iget v0, p0, Lcom/mobeta/android/dslv/r;->j:I

    iget v5, p0, Lcom/mobeta/android/dslv/r;->i:I

    if-eq v0, v5, :cond_0

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    iget v5, p0, Lcom/mobeta/android/dslv/r;->j:I

    sub-int v4, v5, v4

    invoke-virtual {v0, v4}, Lcom/mobeta/android/dslv/DragSortListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v4, p0, Lcom/mobeta/android/dslv/r;->h:I

    if-ne v4, v2, :cond_6

    iget-object v2, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    iget v4, p0, Lcom/mobeta/android/dslv/r;->j:I

    invoke-static {v2, v4, v0}, Lcom/mobeta/android/dslv/DragSortListView;->b(Lcom/mobeta/android/dslv/DragSortListView;ILandroid/view/View;)I

    move-result v2

    iput v2, p0, Lcom/mobeta/android/dslv/r;->h:I

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    iget v4, p0, Lcom/mobeta/android/dslv/r;->h:I

    sub-int/2addr v2, v4

    int-to-float v2, v2

    iput v2, p0, Lcom/mobeta/android/dslv/r;->f:F

    :cond_6
    iget v2, p0, Lcom/mobeta/android/dslv/r;->f:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v3, p0, Lcom/mobeta/android/dslv/r;->h:I

    add-int/2addr v1, v3

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/mobeta/android/dslv/r;->a:Lcom/mobeta/android/dslv/DragSortListView;

    invoke-static {v0}, Lcom/mobeta/android/dslv/DragSortListView;->r(Lcom/mobeta/android/dslv/DragSortListView;)V

    return-void
.end method
