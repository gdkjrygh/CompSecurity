.class Lcom/facebook/orca/threadlist/ay;
.super Ljava/lang/Object;
.source "ThreadListFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ay;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ay;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->d(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/orca/threadlist/bc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 442
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ay;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->d(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/orca/threadlist/bc;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/threadlist/bc;->b()V

    .line 444
    :cond_0
    return-void
.end method
