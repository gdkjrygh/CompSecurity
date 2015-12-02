.class Lcom/facebook/orca/threadlist/ap;
.super Ljava/lang/Object;
.source "ThreadListFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threads/ThreadSummary;

.field final synthetic b:Lcom/facebook/orca/threadlist/ThreadListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 797
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ap;->b:Lcom/facebook/orca/threadlist/ThreadListFragment;

    iput-object p2, p0, Lcom/facebook/orca/threadlist/ap;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 800
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ap;->b:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->g(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/b/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ap;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/b/a/b;->a(Ljava/lang/String;)V

    .line 801
    return-void
.end method
