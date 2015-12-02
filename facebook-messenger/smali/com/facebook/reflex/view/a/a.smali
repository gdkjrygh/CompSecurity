.class public Lcom/facebook/reflex/view/a/a;
.super Landroid/widget/FrameLayout;
.source "DelegatingRefreshableListViewContainer.java"

# interfaces
.implements Lcom/facebook/widget/refreshablelistview/b;


# instance fields
.field a:Lcom/facebook/widget/refreshablelistview/b;

.field private final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/reflex/view/a/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    sget-object v0, Lcom/facebook/q;->RefreshableListViewContainer:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 42
    sget v1, Lcom/facebook/q;->RefreshableListViewContainer_overflowAndListOverlap:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/facebook/reflex/view/a/a;->b:I

    .line 44
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 45
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/a/a;->a:Lcom/facebook/widget/refreshablelistview/b;

    invoke-interface {v0}, Lcom/facebook/widget/refreshablelistview/b;->a()V

    .line 60
    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 69
    instance-of v0, p1, Lcom/facebook/reflex/view/h;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 70
    check-cast v0, Lcom/facebook/reflex/view/h;

    .line 71
    iget v1, p0, Lcom/facebook/reflex/view/a/a;->b:I

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/h;->setOverflowListOverlap(I)V

    .line 72
    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getRefreshableInterface()Lcom/facebook/widget/refreshablelistview/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/a/a;->a:Lcom/facebook/widget/refreshablelistview/b;

    .line 73
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/reflex/view/a/a;->a:Lcom/facebook/widget/refreshablelistview/b;

    invoke-interface {v0}, Lcom/facebook/widget/refreshablelistview/b;->b()V

    .line 65
    return-void
.end method

.method public setLastLoadedTime(J)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/reflex/view/a/a;->a:Lcom/facebook/widget/refreshablelistview/b;

    invoke-interface {v0, p1, p2}, Lcom/facebook/widget/refreshablelistview/b;->setLastLoadedTime(J)V

    .line 55
    return-void
.end method

.method public setOnRefreshListener(Lcom/facebook/widget/refreshablelistview/c;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/reflex/view/a/a;->a:Lcom/facebook/widget/refreshablelistview/b;

    invoke-interface {v0, p1}, Lcom/facebook/widget/refreshablelistview/b;->setOnRefreshListener(Lcom/facebook/widget/refreshablelistview/c;)V

    .line 50
    return-void
.end method
