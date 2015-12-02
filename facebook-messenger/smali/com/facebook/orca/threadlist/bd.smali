.class Lcom/facebook/orca/threadlist/bd;
.super Ljava/lang/Object;
.source "ThreadListFragment.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListFragment;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 0

    .prologue
    .line 907
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bd;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threadlist/ao;)V
    .locals 0

    .prologue
    .line 907
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/bd;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 2

    .prologue
    .line 924
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bd;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    add-int v1, p2, p3

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Lcom/facebook/orca/threadlist/ThreadListFragment;I)I

    .line 925
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 911
    if-nez p2, :cond_0

    .line 912
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bd;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->f(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    .line 913
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bd;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->h(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    .line 916
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bd;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->i(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/orca/threadlist/be;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 917
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bd;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->i(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/orca/threadlist/be;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/threadlist/be;->a(Landroid/widget/AbsListView;I)V

    .line 919
    :cond_1
    return-void
.end method
