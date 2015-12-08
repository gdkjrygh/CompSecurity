.class public Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;
.super Ljava/lang/Object;
.source "ParallaxListViewHelper.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;
    }
.end annotation


# static fields
.field private static final DEFAULT_ALPHA_FACTOR:F = -1.0f

.field private static final DEFAULT_IS_CIRCULAR:Z = false

.field private static final DEFAULT_PARALLAX_FACTOR:F = 1.9f


# instance fields
.field private alphaFactor:F

.field private isCircular:Z

.field private listView:Landroid/widget/ListView;

.field private listener:Landroid/widget/AbsListView$OnScrollListener;

.field private parallaxFactor:F

.field private parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/widget/ListView;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "listView"    # Landroid/widget/ListView;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const v0, 0x3ff33333    # 1.9f

    iput v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxFactor:F

    .line 21
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->alphaFactor:F

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listener:Landroid/widget/AbsListView$OnScrollListener;

    .line 28
    invoke-virtual {p0, p1, p2, p3}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->init(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/widget/ListView;)V

    .line 29
    return-void
.end method

.method private circularParallax()V
    .locals 3

    .prologue
    .line 64
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 65
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    neg-int v0, v1

    .line 66
    .local v0, "top":I
    if-ltz v0, :cond_0

    .line 67
    invoke-direct {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->fillParallaxedViews()V

    .line 68
    invoke-direct {p0, v0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->setFilters(I)V

    .line 71
    .end local v0    # "top":I
    :cond_0
    return-void
.end method

.method private fillParallaxedViews()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 94
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->is(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    if-eqz v0, :cond_2

    .line 96
    invoke-direct {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->resetFilters()V

    .line 97
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->setView(Landroid/view/View;)V

    .line 102
    :cond_1
    :goto_0
    return-void

    .line 99
    :cond_2
    new-instance v0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;

    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;-><init>(Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;Landroid/view/View;)V

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    goto :goto_0
.end method

.method private headerParallax()V
    .locals 3

    .prologue
    .line 74
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    if-eqz v1, :cond_0

    .line 75
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 76
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    neg-int v0, v1

    .line 77
    .local v0, "top":I
    if-ltz v0, :cond_0

    .line 78
    invoke-direct {p0, v0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->setFilters(I)V

    .line 82
    .end local v0    # "top":I
    :cond_0
    return-void
.end method

.method private resetFilters()V
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->setOffset(F)V

    .line 106
    iget v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->alphaFactor:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->setAlpha(F)V

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    invoke-virtual {v0}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->animateNow()V

    .line 109
    return-void
.end method

.method private setFilters(I)V
    .locals 4
    .param p1, "top"    # I

    .prologue
    .line 85
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    int-to-float v2, p1

    iget v3, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxFactor:F

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->setOffset(F)V

    .line 86
    iget v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->alphaFactor:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_0

    .line 87
    if-gtz p1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 88
    .local v0, "alpha":F
    :goto_0
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    invoke-virtual {v1, v0}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->setAlpha(F)V

    .line 90
    .end local v0    # "alpha":F
    :cond_0
    iget-object v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    invoke-virtual {v1}, Lcom/nirhart/parallaxscroll/views/ParallaxedView;->animateNow()V

    .line 91
    return-void

    .line 87
    :cond_1
    const/high16 v1, 0x42c80000    # 100.0f

    int-to-float v2, p1

    iget v3, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->alphaFactor:F

    mul-float/2addr v2, v3

    div-float v0, v1, v2

    goto :goto_0
.end method


# virtual methods
.method protected addParallaxedHeaderView(Landroid/view/View;)V
    .locals 0
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 45
    invoke-virtual {p0, p1}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->addParallaxedView(Landroid/view/View;)V

    .line 46
    return-void
.end method

.method protected addParallaxedHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
    .locals 0
    .param p1, "v"    # Landroid/view/View;
    .param p2, "data"    # Ljava/lang/Object;
    .param p3, "isSelectable"    # Z

    .prologue
    .line 49
    invoke-virtual {p0, p1}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->addParallaxedView(Landroid/view/View;)V

    .line 50
    return-void
.end method

.method protected addParallaxedView(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 53
    new-instance v0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;

    invoke-direct {v0, p0, p1}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper$ListViewParallaxedItem;-><init>(Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;Landroid/view/View;)V

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxedView:Lcom/nirhart/parallaxscroll/views/ParallaxedView;

    .line 54
    return-void
.end method

.method protected init(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/widget/ListView;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "listView"    # Landroid/widget/ListView;

    .prologue
    const/4 v3, 0x0

    .line 32
    iput-object p3, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listView:Landroid/widget/ListView;

    .line 33
    sget-object v1, Lcom/aetn/history/android/historyhere/R$styleable;->ParallaxScroll:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 34
    .local v0, "typeArray":Landroid/content/res/TypedArray;
    const v1, 0x3ff33333    # 1.9f

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxFactor:F

    .line 35
    const/4 v1, 0x1

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->alphaFactor:F

    .line 36
    const/4 v1, 0x4

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->isCircular:Z

    .line 37
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 1
    .param p1, "view"    # Landroid/widget/AbsListView;
    .param p2, "firstVisibleItem"    # I
    .param p3, "visibleItemCount"    # I
    .param p4, "totalItemCount"    # I

    .prologue
    .line 113
    invoke-virtual {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->parallaxScroll()V

    .line 114
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listener:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listener:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 116
    :cond_0
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1
    .param p1, "view"    # Landroid/widget/AbsListView;
    .param p2, "scrollState"    # I

    .prologue
    .line 120
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listener:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listener:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 122
    :cond_0
    return-void
.end method

.method protected parallaxScroll()V
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->isCircular:Z

    if-eqz v0, :cond_0

    .line 58
    invoke-direct {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->circularParallax()V

    .line 61
    :goto_0
    return-void

    .line 60
    :cond_0
    invoke-direct {p0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->headerParallax()V

    goto :goto_0
.end method

.method protected setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0
    .param p1, "l"    # Landroid/widget/AbsListView$OnScrollListener;

    .prologue
    .line 41
    iput-object p1, p0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->listener:Landroid/widget/AbsListView$OnScrollListener;

    .line 42
    return-void
.end method
