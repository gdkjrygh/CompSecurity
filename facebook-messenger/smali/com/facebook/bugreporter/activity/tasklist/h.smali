.class Lcom/facebook/bugreporter/activity/tasklist/h;
.super Ljava/lang/Object;
.source "TaskListFragment.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/google/common/a/es",
        "<",
        "Lcom/facebook/bugreporter/activity/tasklist/Task;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/common/w/q;

.field final synthetic b:Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;Lcom/facebook/common/w/q;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/h;->b:Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    iput-object p2, p0, Lcom/facebook/bugreporter/activity/tasklist/h;->a:Lcom/facebook/common/w/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/tasklist/Task;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/h;->b:Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/tasklist/h;->a:Lcom/facebook/common/w/q;

    invoke-static {v0, p1, v1}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;Lcom/google/common/a/es;Lcom/facebook/common/w/q;)V

    .line 123
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 119
    check-cast p1, Lcom/google/common/a/es;

    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/h;->a(Lcom/google/common/a/es;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/tasklist/h;->b:Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/tasklist/h;->a:Lcom/facebook/common/w/q;

    invoke-static {v0, v1, v2}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;Ljava/util/List;Lcom/facebook/common/w/q;)V

    .line 128
    return-void
.end method
