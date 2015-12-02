.class Lcom/facebook/reflex/view/c/k;
.super Lcom/facebook/reflex/view/ContainerView;
.source "ListAdapterWrapper.java"

# interfaces
.implements Lcom/facebook/reflex/view/c/t;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/c/j;

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/view/c/j;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/reflex/view/c/k;->a:Lcom/facebook/reflex/view/c/j;

    .line 96
    invoke-direct {p0, p2}, Lcom/facebook/reflex/view/ContainerView;-><init>(Landroid/content/Context;)V

    .line 93
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    .line 97
    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    .prologue
    .line 147
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/k;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 100
    invoke-virtual {p0, v1}, Lcom/facebook/reflex/view/c/k;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 101
    invoke-virtual {p0}, Lcom/facebook/reflex/view/c/k;->removeAllViewsInLayout()V

    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, p1, v1, v0}, Lcom/facebook/reflex/view/c/k;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/k;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 133
    iget-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    if-eqz v0, :cond_0

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    .line 135
    invoke-super {p0}, Lcom/facebook/reflex/view/ContainerView;->e()V

    .line 137
    :cond_0
    return-void
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    .line 122
    invoke-super {p0}, Lcom/facebook/reflex/view/ContainerView;->invalidate()V

    .line 123
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 115
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    .line 116
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/reflex/view/ContainerView;->invalidate(IIII)V

    .line 117
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    .line 110
    invoke-super {p0, p1}, Lcom/facebook/reflex/view/ContainerView;->invalidate(Landroid/graphics/Rect;)V

    .line 111
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    .line 128
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/view/ContainerView;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    move-result-object v0

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/k;->c:Z

    .line 142
    invoke-super/range {p0 .. p5}, Lcom/facebook/reflex/view/ContainerView;->onLayout(ZIIII)V

    .line 143
    return-void
.end method
