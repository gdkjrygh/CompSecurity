.class Lcom/facebook/orca/threadlist/as;
.super Ljava/lang/Object;
.source "ThreadListFragment.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/ThreadListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 0

    .prologue
    .line 888
    iput-object p1, p0, Lcom/facebook/orca/threadlist/as;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 891
    iget-object v0, p0, Lcom/facebook/orca/threadlist/as;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 892
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 888
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadlist/as;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 897
    iget-object v0, p0, Lcom/facebook/orca/threadlist/as;->a:Lcom/facebook/orca/threadlist/ThreadListFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 898
    return-void
.end method
