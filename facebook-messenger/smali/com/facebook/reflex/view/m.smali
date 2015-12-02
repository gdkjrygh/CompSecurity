.class Lcom/facebook/reflex/view/m;
.super Ljava/lang/Object;
.source "ListView.java"

# interfaces
.implements Lcom/facebook/reflex/view/c/f;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/h;

.field private final b:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>(Lcom/facebook/reflex/view/h;)V
    .locals 1

    .prologue
    .line 487
    iput-object p1, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 489
    new-instance v0, Lcom/facebook/reflex/view/n;

    invoke-direct {v0, p0}, Lcom/facebook/reflex/view/n;-><init>(Lcom/facebook/reflex/view/m;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/m;->b:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/view/i;)V
    .locals 0

    .prologue
    .line 487
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/m;-><init>(Lcom/facebook/reflex/view/h;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 551
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    return v0
.end method

.method public a(Lcom/facebook/reflex/view/b/r;)V
    .locals 4

    .prologue
    .line 498
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Trying to add a row to the ListView that already has a parent"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 503
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v2}, Lcom/facebook/reflex/view/h;->getChildCount()I

    move-result v2

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 504
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->j(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/Container;

    move-result-object v0

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/Widget;)V

    .line 505
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 506
    return-void

    .line 498
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 556
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    iget-object v1, p0, Lcom/facebook/reflex/view/m;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/h;->post(Ljava/lang/Runnable;)Z

    .line 557
    return-void
.end method

.method public b(Lcom/facebook/reflex/view/b/r;)V
    .locals 2

    .prologue
    .line 510
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Trying to detach a ListView row that is not contained by the ListView"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 514
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;Landroid/view/View;)V

    .line 515
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/o;->b(Lcom/facebook/reflex/view/b/r;)V

    .line 516
    return-void

    .line 510
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/facebook/reflex/view/b/r;)V
    .locals 4

    .prologue
    .line 520
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Trying to add a row to the ListView that already has a parent"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 525
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v2}, Lcom/facebook/reflex/view/h;->getChildCount()I

    move-result v2

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/reflex/view/h;->b(Lcom/facebook/reflex/view/h;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 529
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 530
    return-void

    .line 520
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(Lcom/facebook/reflex/view/b/r;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 534
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    if-ne v0, v2, :cond_2

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v2, "Trying to remove a ListView row that is neither detached, nor contained by the ListView"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 539
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_3

    .line 541
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;Landroid/view/View;Z)V

    .line 545
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->j(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/Container;

    move-result-object v0

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->c(Lcom/facebook/reflex/Widget;)V

    .line 546
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/o;->b(Lcom/facebook/reflex/view/b/r;)V

    .line 547
    return-void

    :cond_2
    move v0, v1

    .line 534
    goto :goto_0

    .line 542
    :cond_3
    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    if-ne v0, v1, :cond_1

    .line 543
    iget-object v0, p0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/h;->removeViewInLayout(Landroid/view/View;)V

    goto :goto_1
.end method
