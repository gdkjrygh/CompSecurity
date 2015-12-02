.class Lcom/facebook/orca/threadlist/bb;
.super Ljava/lang/Object;
.source "ThreadListFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 0

    .prologue
    .line 765
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bb;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 768
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bb;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->f(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    .line 769
    return-void
.end method
