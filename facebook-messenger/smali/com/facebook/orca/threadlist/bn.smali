.class Lcom/facebook/orca/threadlist/bn;
.super Ljava/lang/Object;
.source "ThreadListView.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListView;)V
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bn;->a:Lcom/facebook/orca/threadlist/ThreadListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bn;->a:Lcom/facebook/orca/threadlist/ThreadListView;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListView;->a(Lcom/facebook/orca/threadlist/ThreadListView;)Lcom/facebook/orca/threadlist/i;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bn;->a:Lcom/facebook/orca/threadlist/ThreadListView;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListView;->a(Lcom/facebook/orca/threadlist/ThreadListView;)Lcom/facebook/orca/threadlist/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/orca/threadlist/i;->a(Landroid/widget/AbsListView;III)V

    .line 32
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bn;->a:Lcom/facebook/orca/threadlist/ThreadListView;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListView;->a(Lcom/facebook/orca/threadlist/ThreadListView;)Lcom/facebook/orca/threadlist/i;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bn;->a:Lcom/facebook/orca/threadlist/ThreadListView;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListView;->a(Lcom/facebook/orca/threadlist/ThreadListView;)Lcom/facebook/orca/threadlist/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/threadlist/i;->a(Landroid/widget/AbsListView;I)V

    .line 25
    return-void
.end method
