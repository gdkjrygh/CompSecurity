.class public abstract Landroid/support/v7/widget/au;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field q:Landroid/support/v7/widget/d;

.field r:Landroid/support/v7/widget/RecyclerView;

.field s:Landroid/support/v7/widget/bd;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 5492
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5499
    iput-boolean v0, p0, Landroid/support/v7/widget/au;->a:Z

    .line 5501
    iput-boolean v0, p0, Landroid/support/v7/widget/au;->b:Z

    .line 7604
    return-void
.end method

.method public static a(IIIZ)I
    .locals 4

    .prologue
    const/high16 v0, 0x40000000    # 2.0f

    const/4 v1, 0x0

    .line 6651
    sub-int v2, p0, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 6655
    if-eqz p3, :cond_2

    .line 6656
    if-ltz p2, :cond_1

    .line 6677
    :cond_0
    :goto_0
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    return v0

    :cond_1
    move v0, v1

    move p2, v1

    .line 6663
    goto :goto_0

    .line 6666
    :cond_2
    if-gez p2, :cond_0

    .line 6669
    const/4 v3, -0x1

    if-ne p2, v3, :cond_3

    move p2, v2

    .line 6671
    goto :goto_0

    .line 6672
    :cond_3
    const/4 v0, -0x2

    if-ne p2, v0, :cond_4

    .line 6674
    const/high16 v0, -0x80000000

    move p2, v2

    goto :goto_0

    :cond_4
    move v0, v1

    move p2, v1

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/widget/au;Landroid/support/v7/widget/bd;)V
    .locals 1

    .prologue
    .line 5492
    .line 19268
    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    if-ne v0, p1, :cond_0

    .line 19269
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    .line 5492
    :cond_0
    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 4

    .prologue
    .line 6736
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 6737
    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, p1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, p2

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int v3, p3, v3

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v0, p4, v0

    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->layout(IIII)V

    .line 6739
    return-void
.end method

.method private a(Landroid/view/View;IZ)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v2, -0x1

    .line 5987
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v3

    .line 5988
    if-nez p3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 5990
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/bf;->b(Landroid/view/View;)V

    .line 5999
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 6000
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->g()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 6001
    :cond_1
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 6002
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->f()V

    .line 6006
    :goto_1
    iget-object v1, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v7}, Landroid/support/v7/widget/d;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 6031
    :cond_2
    :goto_2
    iget-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->d:Z

    if-eqz v1, :cond_3

    .line 6035
    iget-object v1, v3, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 6036
    iput-boolean v7, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->d:Z

    .line 6038
    :cond_3
    return-void

    .line 5997
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/bf;->a(Landroid/view/View;)V

    goto :goto_0

    .line 6004
    :cond_5
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->h()V

    goto :goto_1

    .line 6010
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v4, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-ne v1, v4, :cond_d

    .line 6012
    iget-object v1, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    .line 9270
    iget-object v4, v1, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v4, p1}, Landroid/support/v7/widget/f;->a(Landroid/view/View;)I

    move-result v4

    .line 9271
    if-ne v4, v2, :cond_8

    move v1, v2

    .line 6013
    :goto_3
    if-ne p2, v2, :cond_7

    .line 6014
    iget-object v4, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v4}, Landroid/support/v7/widget/d;->a()I

    move-result p2

    .line 6016
    :cond_7
    if-ne v1, v2, :cond_a

    .line 6017
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroid/support/v7/widget/RecyclerView;->indexOfChild(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9274
    :cond_8
    iget-object v5, v1, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/e;->b(I)Z

    move-result v5

    if-eqz v5, :cond_9

    move v1, v2

    .line 9278
    goto :goto_3

    .line 9282
    :cond_9
    iget-object v1, v1, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/e;->d(I)I

    move-result v1

    sub-int v1, v4, v1

    goto :goto_3

    .line 6021
    :cond_a
    if-eq v1, p2, :cond_2

    .line 6022
    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v2

    .line 10249
    invoke-virtual {v2, v1}, Landroid/support/v7/widget/au;->c(I)Landroid/view/View;

    move-result-object v4

    .line 10250
    if-nez v4, :cond_b

    .line 10251
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot move a child from non-existing index:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10254
    :cond_b
    invoke-direct {v2, v1}, Landroid/support/v7/widget/au;->h(I)V

    .line 11218
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 12197
    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v5

    .line 12198
    invoke-virtual {v5}, Landroid/support/v7/widget/bi;->n()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 12199
    iget-object v6, v2, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v6, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v6, v4}, Landroid/support/v7/widget/bf;->b(Landroid/view/View;)V

    .line 12203
    :goto_4
    iget-object v2, v2, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v5}, Landroid/support/v7/widget/bi;->n()Z

    move-result v5

    invoke-virtual {v2, v4, p2, v1, v5}, Landroid/support/v7/widget/d;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    goto/16 :goto_2

    .line 12201
    :cond_c
    iget-object v6, v2, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v6, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v6, v4}, Landroid/support/v7/widget/bf;->a(Landroid/view/View;)V

    goto :goto_4

    .line 6025
    :cond_d
    iget-object v1, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v1, p1, p2, v7}, Landroid/support/v7/widget/d;->a(Landroid/view/View;IZ)V

    .line 6026
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 6027
    iget-object v1, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    invoke-virtual {v1}, Landroid/support/v7/widget/bd;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6028
    iget-object v1, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    invoke-virtual {v1, p1}, Landroid/support/v7/widget/bd;->a(Landroid/view/View;)V

    goto/16 :goto_2
.end method

.method static synthetic a(Landroid/support/v7/widget/au;)Z
    .locals 1

    .prologue
    .line 5492
    iget-boolean v0, p0, Landroid/support/v7/widget/au;->a:Z

    return v0
.end method

.method static synthetic b(Landroid/support/v7/widget/au;)Z
    .locals 1

    .prologue
    .line 5492
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/au;->a:Z

    return v0
.end method

.method public static e(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 6097
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 12416
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v0

    .line 6097
    return v0
.end method

.method public static f(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 6690
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 6691
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    return v0
.end method

.method public static g(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 6704
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 6705
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method private g(I)V
    .locals 1

    .prologue
    .line 6061
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/au;->c(I)Landroid/view/View;

    move-result-object v0

    .line 6062
    if-eqz v0, :cond_0

    .line 6063
    iget-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/d;->a(I)V

    .line 6065
    :cond_0
    return-void
.end method

.method public static h(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6750
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    .line 15857
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 6750
    sub-int v0, v1, v0

    return v0
.end method

.method private h(I)V
    .locals 1

    .prologue
    .line 6177
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/au;->c(I)Landroid/view/View;

    .line 13184
    iget-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/d;->d(I)V

    .line 6178
    return-void
.end method

.method public static i(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6762
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    .line 16827
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 6762
    sub-int v0, v1, v0

    return v0
.end method

.method public static j(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6774
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v1

    .line 16872
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 6774
    add-int/2addr v0, v1

    return v0
.end method

.method public static k(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6786
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v1

    .line 17842
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 6786
    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final A()V
    .locals 1

    .prologue
    .line 7431
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/au;->a:Z

    .line 7432
    return-void
.end method

.method public a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 5816
    const/4 v0, 0x0

    return v0
.end method

.method public a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 7466
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7469
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->a()I

    move-result v0

    goto :goto_0
.end method

.method public a(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 7137
    const/4 v0, 0x0

    return v0
.end method

.method public a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 5799
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 5775
    instance-of v0, p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_0

    .line 5776
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/support/v7/widget/RecyclerView$LayoutParams;)V

    .line 5780
    :goto_0
    return-object v0

    .line 5777
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 5778
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    goto :goto_0

    .line 5780
    :cond_1
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public a(I)Landroid/view/View;
    .locals 5

    .prologue
    .line 6124
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->r()I

    move-result v2

    .line 6125
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 6126
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/au;->c(I)Landroid/view/View;

    move-result-object v0

    .line 6127
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v3

    .line 6128
    if-eqz v3, :cond_1

    .line 6131
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->c()I

    move-result v4

    if-ne v4, p1, :cond_1

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->b()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v4}, Landroid/support/v7/widget/bf;->a()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    if-nez v3, :cond_1

    .line 6136
    :cond_0
    :goto_1
    return-object v0

    .line 6125
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 6136
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a()V
    .locals 0

    .prologue
    .line 7059
    return-void
.end method

.method public a(II)V
    .locals 0

    .prologue
    .line 7071
    return-void
.end method

.method public final a(ILandroid/support/v7/widget/az;)V
    .locals 1

    .prologue
    .line 6304
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/au;->c(I)Landroid/view/View;

    move-result-object v0

    .line 6305
    invoke-direct {p0, p1}, Landroid/support/v7/widget/au;->g(I)V

    .line 6306
    invoke-virtual {p2, v0}, Landroid/support/v7/widget/az;->a(Landroid/view/View;)V

    .line 6307
    return-void
.end method

.method public a(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 7259
    return-void
.end method

.method public a(Landroid/support/v7/widget/RecyclerView;)V
    .locals 2

    .prologue
    .line 5879
    const-string v0, "RecyclerView"

    const-string v1, "You must override smoothScrollToPosition to support smooth scrolling"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5880
    return-void
.end method

.method public a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V
    .locals 0

    .prologue
    .line 5664
    return-void
.end method

.method public final a(Landroid/support/v7/widget/az;)V
    .locals 4

    .prologue
    .line 6526
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->r()I

    move-result v0

    .line 6527
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 6528
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/au;->c(I)Landroid/view/View;

    move-result-object v1

    .line 15534
    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v2

    .line 15535
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->b()Z

    move-result v3

    if-nez v3, :cond_0

    .line 15541
    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->j()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->l()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/widget/al;->k_()Z

    move-result v3

    if-nez v3, :cond_1

    .line 15543
    invoke-direct {p0, v0}, Landroid/support/v7/widget/au;->g(I)V

    .line 15544
    invoke-virtual {p1, v2}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/bi;)V

    .line 6527
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 15546
    :cond_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/au;->h(I)V

    .line 15547
    invoke-virtual {p1, v1}, Landroid/support/v7/widget/az;->c(Landroid/view/View;)V

    goto :goto_1

    .line 6531
    :cond_2
    return-void
.end method

.method public a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 7412
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Landroid/support/v7/widget/au;->e(Landroid/view/View;)I

    move-result v0

    .line 7413
    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p3}, Landroid/support/v7/widget/au;->e(Landroid/view/View;)I

    move-result v2

    :goto_1
    move v3, v1

    move v5, v4

    .line 7414
    invoke-static/range {v0 .. v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->obtain(IIIIZZ)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;

    move-result-object v0

    .line 7417
    invoke-virtual {p4, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setCollectionItemInfo(Ljava/lang/Object;)V

    .line 7418
    return-void

    :cond_0
    move v0, v4

    .line 7412
    goto :goto_0

    :cond_1
    move v2, v4

    .line 7413
    goto :goto_1
.end method

.method public final a(Landroid/support/v7/widget/bd;)V
    .locals 2

    .prologue
    .line 5888
    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    invoke-virtual {v0}, Landroid/support/v7/widget/bd;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5890
    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    invoke-virtual {v0}, Landroid/support/v7/widget/bd;->c()V

    .line 5892
    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    .line 5893
    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v1, p0}, Landroid/support/v7/widget/bd;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/au;)V

    .line 5894
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 5942
    .line 8960
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/widget/au;->a(Landroid/view/View;IZ)V

    .line 5943
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 6807
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_0

    .line 6808
    invoke-virtual {p2, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 6813
    :goto_0
    return-void

    .line 6811
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    .line 6812
    invoke-virtual {p2, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_0
.end method

.method final a(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 2

    .prologue
    .line 7388
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 7390
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7391
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {p0, v0, v1, p1, p2}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 7394
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/support/v7/widget/az;)V
    .locals 3

    .prologue
    .line 6293
    .line 14049
    iget-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    .line 14116
    iget-object v1, v0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v1, p1}, Landroid/support/v7/widget/f;->a(Landroid/view/View;)I

    move-result v1

    .line 14117
    if-ltz v1, :cond_1

    .line 14120
    iget-object v2, v0, Landroid/support/v7/widget/d;->b:Landroid/support/v7/widget/e;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/e;->c(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 14121
    iget-object v2, v0, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 14123
    :cond_0
    iget-object v0, v0, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v0, v1}, Landroid/support/v7/widget/f;->a(I)V

    .line 6294
    :cond_1
    invoke-virtual {p2, p1}, Landroid/support/v7/widget/az;->a(Landroid/view/View;)V

    .line 6295
    return-void
.end method

.method public a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v0, 0x1

    .line 7355
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    .line 18371
    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;

    move-result-object v1

    .line 18373
    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v2, :cond_0

    if-nez v1, :cond_1

    .line 18374
    :cond_0
    :goto_0
    return-void

    .line 18376
    :cond_1
    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v0}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    :goto_1
    invoke-virtual {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setScrollable(Z)V

    .line 18381
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 18382
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setItemCount(I)V

    goto :goto_0

    .line 18376
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 5544
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5545
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 5547
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v7/widget/RecyclerView$LayoutParams;)Z
    .locals 1

    .prologue
    .line 5758
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/Runnable;)Z
    .locals 1

    .prologue
    .line 5625
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5626
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    move-result v0

    .line 5628
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 5833
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 7485
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7488
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->a()I

    move-result v0

    goto :goto_0
.end method

.method public b(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 7182
    const/4 v0, 0x0

    return v0
.end method

.method public abstract b()Landroid/support/v7/widget/RecyclerView$LayoutParams;
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 5866
    return-void
.end method

.method public b(II)V
    .locals 0

    .prologue
    .line 7081
    return-void
.end method

.method final b(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 5504
    if-nez p1, :cond_0

    .line 5505
    iput-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    .line 5506
    iput-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    .line 5512
    :goto_0
    return-void

    .line 5508
    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    .line 5509
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    iput-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    goto :goto_0
.end method

.method final b(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V
    .locals 1

    .prologue
    .line 5579
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/au;->b:Z

    .line 5580
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V

    .line 5581
    return-void
.end method

.method final b(Landroid/support/v7/widget/az;)V
    .locals 5

    .prologue
    .line 6561
    .line 15636
    iget-object v0, p1, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 6563
    add-int/lit8 v0, v2, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    .line 15640
    iget-object v0, p1, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 6565
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v3

    .line 6566
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->b()Z

    move-result v4

    if-nez v4, :cond_1

    .line 6569
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->p()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6570
    iget-object v3, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 6572
    :cond_0
    invoke-virtual {p1, v0}, Landroid/support/v7/widget/az;->b(Landroid/view/View;)V

    .line 6563
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 15644
    :cond_2
    iget-object v0, p1, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6575
    if-lez v2, :cond_3

    .line 6576
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 6578
    :cond_3
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 5960
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/widget/au;->a(Landroid/view/View;IZ)V

    .line 5961
    return-void
.end method

.method public c(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 7122
    const/4 v0, 0x0

    return v0
.end method

.method public final c(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 6325
    iget-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)Landroid/view/View;
    .locals 1

    .prologue
    .line 6895
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(II)V
    .locals 0

    .prologue
    .line 7091
    return-void
.end method

.method public final c(Landroid/support/v7/widget/az;)V
    .locals 2

    .prologue
    .line 7294
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 7295
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/au;->c(I)Landroid/view/View;

    move-result-object v1

    .line 7296
    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 7297
    invoke-virtual {p0, v0, p1}, Landroid/support/v7/widget/au;->a(ILandroid/support/v7/widget/az;)V

    .line 7294
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7300
    :cond_1
    return-void
.end method

.method public c(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)V
    .locals 2

    .prologue
    .line 5727
    const-string v0, "RecyclerView"

    const-string v1, "You must override onLayoutChildren(Recycler recycler, State state) "

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5728
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 5971
    .line 8983
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/widget/au;->a(Landroid/view/View;IZ)V

    .line 5972
    return-void
.end method

.method public d(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 7167
    const/4 v0, 0x0

    return v0
.end method

.method public d(I)V
    .locals 4

    .prologue
    .line 6458
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 6459
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    .line 14566
    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v2

    .line 14567
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 14568
    iget-object v3, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 14567
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6461
    :cond_0
    return-void
.end method

.method public d(II)V
    .locals 0

    .prologue
    .line 7107
    return-void
.end method

.method public final d(Landroid/view/View;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 5983
    invoke-direct {p0, p1, v0, v0}, Landroid/support/v7/widget/au;->a(Landroid/view/View;IZ)V

    .line 5984
    return-void
.end method

.method public e(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 7152
    const/4 v0, 0x0

    return v0
.end method

.method public e(I)V
    .locals 4

    .prologue
    .line 6470
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 6471
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    .line 15528
    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v2

    .line 15529
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 15530
    iget-object v3, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 15529
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6473
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 5570
    const/4 v0, 0x0

    return v0
.end method

.method public f(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 7197
    const/4 v0, 0x0

    return v0
.end method

.method public f()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 7253
    const/4 v0, 0x0

    return-object v0
.end method

.method public f(I)V
    .locals 0

    .prologue
    .line 7279
    return-void
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 5843
    const/4 v0, 0x0

    return v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 5853
    const/4 v0, 0x0

    return v0
.end method

.method public final n()V
    .locals 1

    .prologue
    .line 5518
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5519
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 5521
    :cond_0
    return-void
.end method

.method final o()V
    .locals 1

    .prologue
    .line 5574
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/au;->b:Z

    .line 5576
    return-void
.end method

.method public final p()Z
    .locals 1

    .prologue
    .line 5591
    iget-boolean v0, p0, Landroid/support/v7/widget/au;->b:Z

    return v0
.end method

.method public final q()Z
    .locals 1

    .prologue
    .line 5900
    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    invoke-virtual {v0}, Landroid/support/v7/widget/bd;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final r()I
    .locals 1

    .prologue
    .line 6316
    iget-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final s()I
    .locals 1

    .prologue
    .line 6334
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final t()I
    .locals 1

    .prologue
    .line 6343
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final u()I
    .locals 1

    .prologue
    .line 6352
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final v()I
    .locals 1

    .prologue
    .line 6361
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final w()I
    .locals 1

    .prologue
    .line 6370
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final x()I
    .locals 1

    .prologue
    .line 6379
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final y()I
    .locals 1

    .prologue
    .line 6447
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    .line 6448
    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->a()I

    move-result v0

    :goto_1
    return v0

    .line 6447
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 6448
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method final z()V
    .locals 1

    .prologue
    .line 7262
    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    if-eqz v0, :cond_0

    .line 7263
    iget-object v0, p0, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    invoke-virtual {v0}, Landroid/support/v7/widget/bd;->c()V

    .line 7265
    :cond_0
    return-void
.end method
