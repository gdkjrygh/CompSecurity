.class public Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;
.super Landroid/widget/ExpandableListView;
.source "ParallaxExpandableListView.java"


# instance fields
.field private helper:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    return-void
.end method


# virtual methods
.method public addParallaxedHeaderView(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 33
    invoke-super {p0, p1}, Landroid/widget/ExpandableListView;->addHeaderView(Landroid/view/View;)V

    .line 34
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;->helper:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;

    invoke-virtual {v0, p1}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->addParallaxedHeaderView(Landroid/view/View;)V

    .line 35
    return-void
.end method

.method public addParallaxedHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "data"    # Ljava/lang/Object;
    .param p3, "isSelectable"    # Z

    .prologue
    .line 38
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ExpandableListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 39
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;->helper:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->addParallaxedHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 40
    return-void
.end method

.method protected init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 23
    new-instance v0, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;

    invoke-direct {v0, p1, p2, p0}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/widget/ListView;)V

    iput-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;->helper:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;

    .line 24
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;->helper:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;

    invoke-super {p0, v0}, Landroid/widget/ExpandableListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 25
    return-void
.end method

.method public setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1
    .param p1, "l"    # Landroid/widget/AbsListView$OnScrollListener;

    .prologue
    .line 29
    iget-object v0, p0, Lcom/nirhart/parallaxscroll/views/ParallaxExpandableListView;->helper:Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;

    invoke-virtual {v0, p1}, Lcom/nirhart/parallaxscroll/views/ParallaxListViewHelper;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 30
    return-void
.end method
