.class Lcom/facebook/Session$4;
.super Ljava/lang/Object;
.source "Session.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/Session;

.field final synthetic val$exception:Ljava/lang/Exception;

.field final synthetic val$newState:Lcom/facebook/SessionState;


# direct methods
.method constructor <init>(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 0
    .param p1, "this$0"    # Lcom/facebook/Session;

    .prologue
    .line 1538
    iput-object p1, p0, Lcom/facebook/Session$4;->this$0:Lcom/facebook/Session;

    iput-object p2, p0, Lcom/facebook/Session$4;->val$newState:Lcom/facebook/SessionState;

    iput-object p3, p0, Lcom/facebook/Session$4;->val$exception:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 1540
    iget-object v2, p0, Lcom/facebook/Session$4;->this$0:Lcom/facebook/Session;

    # getter for: Lcom/facebook/Session;->callbacks:Ljava/util/List;
    invoke-static {v2}, Lcom/facebook/Session;->access$1200(Lcom/facebook/Session;)Ljava/util/List;

    move-result-object v3

    monitor-enter v3

    .line 1541
    :try_start_0
    iget-object v2, p0, Lcom/facebook/Session$4;->this$0:Lcom/facebook/Session;

    # getter for: Lcom/facebook/Session;->callbacks:Ljava/util/List;
    invoke-static {v2}, Lcom/facebook/Session;->access$1200(Lcom/facebook/Session;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/Session$StatusCallback;

    .line 1542
    .local v0, "callback":Lcom/facebook/Session$StatusCallback;
    new-instance v1, Lcom/facebook/Session$4$1;

    invoke-direct {v1, p0, v0}, Lcom/facebook/Session$4$1;-><init>(Lcom/facebook/Session$4;Lcom/facebook/Session$StatusCallback;)V

    .line 1549
    .local v1, "closure":Ljava/lang/Runnable;
    iget-object v4, p0, Lcom/facebook/Session$4;->this$0:Lcom/facebook/Session;

    # getter for: Lcom/facebook/Session;->handler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/facebook/Session;->access$1300(Lcom/facebook/Session;)Landroid/os/Handler;

    move-result-object v4

    # invokes: Lcom/facebook/Session;->runWithHandlerOrExecutor(Landroid/os/Handler;Ljava/lang/Runnable;)V
    invoke-static {v4, v1}, Lcom/facebook/Session;->access$1400(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1551
    .end local v0    # "callback":Lcom/facebook/Session$StatusCallback;
    .end local v1    # "closure":Ljava/lang/Runnable;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_0
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1552
    return-void
.end method
