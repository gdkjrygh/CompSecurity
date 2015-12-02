.class Lcom/facebook/common/executors/c;
.super Ljava/lang/Object;
.source "DefaultAndroidThreadUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Landroid/os/HandlerThread;

.field final synthetic c:Lcom/facebook/common/executors/b;


# direct methods
.method constructor <init>(Lcom/facebook/common/executors/b;Ljava/lang/Runnable;Landroid/os/HandlerThread;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/common/executors/c;->c:Lcom/facebook/common/executors/b;

    iput-object p2, p0, Lcom/facebook/common/executors/c;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/facebook/common/executors/c;->b:Landroid/os/HandlerThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 127
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/executors/c;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    iget-object v0, p0, Lcom/facebook/common/executors/c;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 131
    return-void

    .line 129
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/common/executors/c;->b:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    throw v0
.end method
