.class public abstract Landroid/support/v7/widget/RecyclerView$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "i"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field q:Landroid/support/v7/widget/b;

.field r:Landroid/support/v7/widget/RecyclerView;

.field s:Landroid/support/v7/widget/RecyclerView$p;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 5546
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5553
    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->a:Z

    .line 5555
    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->b:Z

    .line 7668
    return-void
.end method

.method public static a(IIIZ)I
    .locals 4

    .prologue
    const/high16 v0, 0x40000000    # 2.0f

    const/4 v1, 0x0

    .line 6715
    sub-int v2, p0, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 6719
    if-eqz p3, :cond_2

    .line 6720
    if-ltz p2, :cond_1

    .line 6741
    :cond_0
    :goto_0
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    return v0

    :cond_1
    move v0, v1

    move p2, v1

    .line 6727
    goto :goto_0

    .line 6730
    :cond_2
    if-gez p2, :cond_0

    .line 6733
    const/4 v3, -0x1

    if-ne p2, v3, :cond_3

    move p2, v2

    .line 6735
    goto :goto_0

    .line 6736
    :cond_3
    const/4 v0, -0x2

    if-ne p2, v0, :cond_4

    .line 6738
    const/high16 v0, -0x80000000

    move p2, v2

    goto :goto_0

    :cond_4
    move v0, v1

    move p2, v1

    goto :goto_0
.end method

.method private a(I)V
    .locals 1

    .prologue
    .line 6115
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->d(I)Landroid/view/View;

    move-result-object v0

    .line 6116
    if-eqz v0, :cond_0

    .line 6117
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/b;->a(I)V

    .line 6119
    :cond_0
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView$i;Landroid/support/v7/widget/RecyclerView$p;)V
    .locals 1

    .prologue
    .line 5546
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    :cond_0
    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 4

    .prologue
    .line 6800
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 6801
    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, p1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, p2

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int v3, p3, v3

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v0, p4, v0

    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->layout(IIII)V

    .line 6803
    return-void
.end method

.method private a(Landroid/view/View;IZ)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v2, -0x1

    .line 6041
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v3

    .line 6042
    if-nez p3, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6044
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/view/View;)V

    .line 6053
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 6054
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->f()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 6055
    :cond_1
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->d()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 6056
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->e()V

    .line 6060
    :goto_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v7}, Landroid/support/v7/widget/b;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 6085
    :cond_2
    :goto_2
    iget-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->d:Z

    if-eqz v1, :cond_3

    .line 6089
    iget-object v1, v3, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 6090
    iput-boolean v7, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->d:Z

    .line 6092
    :cond_3
    return-void

    .line 6051
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/view/View;)V

    goto :goto_0

    .line 6058
    :cond_5
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->g()V

    goto :goto_1

    .line 6064
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-ne v1, v4, :cond_d

    .line 6066
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    iget-object v4, v1, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v4, p1}, Landroid/support/v7/widget/b$b;->a(Landroid/view/View;)I

    move-result v4

    if-ne v4, v2, :cond_8

    move v1, v2

    .line 6067
    :goto_3
    if-ne p2, v2, :cond_7

    .line 6068
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v4}, Landroid/support/v7/widget/b;->a()I

    move-result p2

    .line 6070
    :cond_7
    if-ne v1, v2, :cond_a

    .line 6071
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroid/support/v7/widget/RecyclerView;->indexOfChild(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6066
    :cond_8
    iget-object v5, v1, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/b$a;

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/b$a;->b(I)Z

    move-result v5

    if-eqz v5, :cond_9

    move v1, v2

    goto :goto_3

    :cond_9
    iget-object v1, v1, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/b$a;

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/b$a;->d(I)I

    move-result v1

    sub-int v1, v4, v1

    goto :goto_3

    .line 6075
    :cond_a
    if-eq v1, p2, :cond_2

    .line 6076
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/RecyclerView$i;->d(I)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_b

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

    :cond_b
    invoke-direct {v2, v1}, Landroid/support/v7/widget/RecyclerView$i;->h(I)V

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v6, v2, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v6, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v6, v4}, Landroid/support/v7/widget/RecyclerView$q;->b(Landroid/view/View;)V

    :goto_4
    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v5

    invoke-virtual {v2, v4, p2, v1, v5}, Landroid/support/v7/widget/b;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    goto/16 :goto_2

    :cond_c
    iget-object v6, v2, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v6, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v6, v4}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/view/View;)V

    goto :goto_4

    .line 6079
    :cond_d
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v1, p1, p2, v7}, Landroid/support/v7/widget/b;->a(Landroid/view/View;IZ)V

    .line 6080
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 6081
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$p;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6082
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    invoke-virtual {v1, p1}, Landroid/support/v7/widget/RecyclerView$p;->a(Landroid/view/View;)V

    goto/16 :goto_2
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView$i;)Z
    .locals 1

    .prologue
    .line 5546
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->a:Z

    return v0
.end method

.method static synthetic b(Landroid/support/v7/widget/RecyclerView$i;)Z
    .locals 1

    .prologue
    .line 5546
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->a:Z

    return v0
.end method

.method public static e(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 6151
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v0

    return v0
.end method

.method public static f(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 6754
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 6755
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
    .line 6768
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 6769
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public static h(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6814
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    sub-int v0, v1, v0

    return v0
.end method

.method private h(I)V
    .locals 1

    .prologue
    .line 6231
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->d(I)Landroid/view/View;

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/b;->d(I)V

    .line 6232
    return-void
.end method

.method public static i(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6826
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    sub-int v0, v1, v0

    return v0
.end method

.method public static j(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6838
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    return v0
.end method

.method public static k(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 6850
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 5870
    const/4 v0, 0x0

    return v0
.end method

.method public a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 7530
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7533
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v0

    goto :goto_0
.end method

.method public a(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 7201
    const/4 v0, 0x0

    return v0
.end method

.method public a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 5853
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 5829
    instance-of v0, p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_0

    .line 5830
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/support/v7/widget/RecyclerView$LayoutParams;)V

    .line 5834
    :goto_0
    return-object v0

    .line 5831
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 5832
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    goto :goto_0

    .line 5834
    :cond_1
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public a()V
    .locals 0

    .prologue
    .line 7123
    return-void
.end method

.method public a(II)V
    .locals 0

    .prologue
    .line 7135
    return-void
.end method

.method public final a(ILandroid/support/v7/widget/RecyclerView$m;)V
    .locals 1

    .prologue
    .line 6358
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->d(I)Landroid/view/View;

    move-result-object v0

    .line 6359
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(I)V

    .line 6360
    invoke-virtual {p2, v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/view/View;)V

    .line 6361
    return-void
.end method

.method public a(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 7323
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$m;)V
    .locals 4

    .prologue
    .line 6580
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->p()I

    move-result v0

    .line 6581
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 6582
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView$i;->d(I)Landroid/view/View;

    move-result-object v1

    .line 6583
    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView$i;->a(I)V

    invoke-virtual {p1, v2}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 6581
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 6583
    :cond_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView$i;->h(I)V

    invoke-virtual {p1, v1}, Landroid/support/v7/widget/RecyclerView$m;->c(Landroid/view/View;)V

    goto :goto_1

    .line 6585
    :cond_2
    return-void
.end method

.method public a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 7476
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Landroid/support/v7/widget/RecyclerView$i;->e(Landroid/view/View;)I

    move-result v0

    .line 7477
    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p3}, Landroid/support/v7/widget/RecyclerView$i;->e(Landroid/view/View;)I

    move-result v2

    :goto_1
    move v3, v1

    move v5, v4

    .line 7478
    invoke-static/range {v0 .. v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->obtain(IIIIZZ)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;

    move-result-object v0

    .line 7481
    invoke-virtual {p4, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setCollectionItemInfo(Ljava/lang/Object;)V

    .line 7482
    return-void

    :cond_0
    move v0, v4

    .line 7476
    goto :goto_0

    :cond_1
    move v2, v4

    .line 7477
    goto :goto_1
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$p;)V
    .locals 2

    .prologue
    .line 5942
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$p;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5944
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$p;->c()V

    .line 5946
    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    .line 5947
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v1, p0}, Landroid/support/v7/widget/RecyclerView$p;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$i;)V

    .line 5948
    return-void
.end method

.method final a(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 5558
    if-nez p1, :cond_0

    .line 5559
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    .line 5560
    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    .line 5566
    :goto_0
    return-void

    .line 5562
    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    .line 5563
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    goto :goto_0
.end method

.method public a(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 2

    .prologue
    .line 5933
    const-string v0, "RecyclerView"

    const-string v1, "You must override smoothScrollToPosition to support smooth scrolling"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5934
    return-void
.end method

.method public a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$m;)V
    .locals 0

    .prologue
    .line 5717
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 5996
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/view/View;IZ)V

    .line 5997
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 6871
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_0

    .line 6872
    invoke-virtual {p2, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 6877
    :goto_0
    return-void

    .line 6875
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    .line 6876
    invoke-virtual {p2, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_0
.end method

.method final a(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 2

    .prologue
    .line 7452
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 7454
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/b;->b(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7455
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {p0, v0, v1, p1, p2}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 7458
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/support/v7/widget/RecyclerView$m;)V
    .locals 3

    .prologue
    .line 6347
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    iget-object v1, v0, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v1, p1}, Landroid/support/v7/widget/b$b;->a(Landroid/view/View;)I

    move-result v1

    if-ltz v1, :cond_1

    iget-object v2, v0, Landroid/support/v7/widget/b;->b:Landroid/support/v7/widget/b$a;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/b$a;->c(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Landroid/support/v7/widget/b;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, v0, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v0, v1}, Landroid/support/v7/widget/b$b;->a(I)V

    .line 6348
    :cond_1
    invoke-virtual {p2, p1}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/view/View;)V

    .line 6349
    return-void
.end method

.method public a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v0, 0x1

    .line 7419
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v2, :cond_0

    if-nez v1, :cond_1

    .line 7420
    :cond_0
    :goto_0
    return-void

    .line 7419
    :cond_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v0}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v3}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    :goto_1
    invoke-virtual {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setScrollable(Z)V

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setItemCount(I)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 5598
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5599
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 5601
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v7/widget/RecyclerView$LayoutParams;)Z
    .locals 1

    .prologue
    .line 5812
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
    .line 5679
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5680
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    move-result v0

    .line 5682
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 5887
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 7549
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7552
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v0

    goto :goto_0
.end method

.method public b(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 7246
    const/4 v0, 0x0

    return v0
.end method

.method public abstract b()Landroid/support/v7/widget/RecyclerView$LayoutParams;
.end method

.method public b(I)Landroid/view/View;
    .locals 5

    .prologue
    .line 6178
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->p()I

    move-result v2

    .line 6179
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 6180
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView$i;->d(I)Landroid/view/View;

    move-result-object v0

    .line 6181
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v3

    .line 6182
    if-eqz v3, :cond_1

    .line 6183
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    if-ne v4, p1, :cond_1

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_1

    .line 6190
    :cond_0
    :goto_1
    return-object v0

    .line 6179
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 6190
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public b(II)V
    .locals 0

    .prologue
    .line 7145
    return-void
.end method

.method final b(Landroid/support/v7/widget/RecyclerView$m;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 6615
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 6617
    add-int/lit8 v0, v2, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_3

    .line 6618
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    .line 6619
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v3

    .line 6620
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v4

    if-nez v4, :cond_2

    .line 6621
    invoke-virtual {v3, v5}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 6629
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->n()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6630
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v0, v5}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 6632
    :cond_0
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    if-eqz v4, :cond_1

    .line 6633
    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    invoke-virtual {v4, v3}, Landroid/support/v7/widget/RecyclerView$e;->c(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 6635
    :cond_1
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 6636
    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$m;->b(Landroid/view/View;)V

    .line 6617
    :cond_2
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 6638
    :cond_3
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6639
    if-lez v2, :cond_4

    .line 6640
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 6642
    :cond_4
    return-void
.end method

.method final b(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$m;)V
    .locals 1

    .prologue
    .line 5633
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->b:Z

    .line 5634
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$m;)V

    .line 5635
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 6014
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/view/View;IZ)V

    .line 6015
    return-void
.end method

.method public c(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 7186
    const/4 v0, 0x0

    return v0
.end method

.method public c(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;
    .locals 1

    .prologue
    .line 6959
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 5920
    return-void
.end method

.method public c(II)V
    .locals 0

    .prologue
    .line 7155
    return-void
.end method

.method public final c(Landroid/support/v7/widget/RecyclerView$m;)V
    .locals 2

    .prologue
    .line 7358
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 7359
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView$i;->d(I)Landroid/view/View;

    move-result-object v1

    .line 7360
    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 7361
    invoke-virtual {p0, v0, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(ILandroid/support/v7/widget/RecyclerView$m;)V

    .line 7358
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7364
    :cond_1
    return-void
.end method

.method public c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)V
    .locals 2

    .prologue
    .line 5781
    const-string v0, "RecyclerView"

    const-string v1, "You must override onLayoutChildren(Recycler recycler, State state) "

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5782
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 6025
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/view/View;IZ)V

    .line 6026
    return-void
.end method

.method public d(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 7231
    const/4 v0, 0x0

    return v0
.end method

.method public final d(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 6379
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(II)V
    .locals 0

    .prologue
    .line 7171
    return-void
.end method

.method public final d(Landroid/view/View;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 6037
    invoke-direct {p0, p1, v0, v0}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/view/View;IZ)V

    .line 6038
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 5624
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 7216
    const/4 v0, 0x0

    return v0
.end method

.method public e()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 7317
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(I)V
    .locals 4

    .prologue
    .line 6512
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 6513
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    iget-object v3, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6515
    :cond_0
    return-void
.end method

.method public f(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 7261
    const/4 v0, 0x0

    return v0
.end method

.method public f(I)V
    .locals 4

    .prologue
    .line 6524
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 6525
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    iget-object v3, v1, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6527
    :cond_0
    return-void
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 5897
    const/4 v0, 0x0

    return v0
.end method

.method public g(I)V
    .locals 0

    .prologue
    .line 7343
    return-void
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 5907
    const/4 v0, 0x0

    return v0
.end method

.method public final l()V
    .locals 1

    .prologue
    .line 5572
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5573
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 5575
    :cond_0
    return-void
.end method

.method final m()V
    .locals 1

    .prologue
    .line 5628
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->b:Z

    .line 5629
    return-void
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 5645
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->b:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 5954
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$p;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final p()I
    .locals 1

    .prologue
    .line 6370
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()I
    .locals 1

    .prologue
    .line 6388
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final r()I
    .locals 1

    .prologue
    .line 6397
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

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
    .line 6406
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

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
    .line 6415
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

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
    .line 6424
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

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
    .line 6433
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final w()V
    .locals 1

    .prologue
    .line 7326
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    if-eqz v0, :cond_0

    .line 7327
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$p;->c()V

    .line 7329
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 7495
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$i;->a:Z

    .line 7496
    return-void
.end method
