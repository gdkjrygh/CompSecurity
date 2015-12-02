.class Lcom/facebook/orca/threadview/dc;
.super Ljava/lang/Object;
.source "ThreadViewMessageFragment.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 352
    iput-object p1, p0, Lcom/facebook/orca/threadview/dc;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lcom/facebook/orca/threadview/dc;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0, p2, p3, p4}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;III)V

    .line 364
    iget-object v0, p0, Lcom/facebook/orca/threadview/dc;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/facebook/orca/threadview/dc;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 368
    :cond_0
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/facebook/orca/threadview/dc;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, p0, Lcom/facebook/orca/threadview/dc;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 358
    :cond_0
    return-void
.end method
