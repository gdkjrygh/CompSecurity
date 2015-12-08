.class final Lcom/roidapp/baselib/hlistview/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 0

    .prologue
    .line 2717
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 2721
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-nez v0, :cond_2

    .line 2722
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iput v3, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 2723
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v1, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v2, v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2724
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v1

    if-nez v1, :cond_2

    .line 2725
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iput v4, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 2727
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v1, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v1, :cond_5

    .line 2728
    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 2729
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 2730
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d()V

    .line 2731
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v2, v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(ILandroid/view/View;)V

    .line 2732
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->refreshDrawableState()V

    .line 2734
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    .line 2735
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isLongClickable()Z

    move-result v2

    .line 2737
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2738
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2739
    if-eqz v0, :cond_0

    instance-of v3, v0, Landroid/graphics/drawable/TransitionDrawable;

    if-eqz v3, :cond_0

    .line 2740
    if-eqz v2, :cond_3

    .line 2741
    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 2748
    :cond_0
    :goto_0
    if-eqz v2, :cond_4

    .line 2749
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/e;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2750
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    new-instance v2, Lcom/roidapp/baselib/hlistview/e;

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/hlistview/e;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V

    invoke-static {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Lcom/roidapp/baselib/hlistview/AbsHListView;Lcom/roidapp/baselib/hlistview/e;)Lcom/roidapp/baselib/hlistview/e;

    .line 2752
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/e;->a()V

    .line 2753
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/e;

    move-result-object v2

    int-to-long v4, v1

    invoke-virtual {v0, v2, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2762
    :cond_2
    :goto_1
    return-void

    .line 2743
    :cond_3
    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/TransitionDrawable;->resetTransition()V

    goto :goto_0

    .line 2755
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iput v5, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    goto :goto_1

    .line 2758
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/f;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iput v5, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    goto :goto_1
.end method
