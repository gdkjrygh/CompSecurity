.class Lcom/facebook/backgroundtasks/m;
.super Ljava/lang/Object;
.source "BackgroundTaskRunner.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/backgroundtasks/j;


# direct methods
.method constructor <init>(Lcom/facebook/backgroundtasks/j;)V
    .locals 0

    .prologue
    .line 303
    iput-object p1, p0, Lcom/facebook/backgroundtasks/m;->a:Lcom/facebook/backgroundtasks/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 306
    iget-object v0, p0, Lcom/facebook/backgroundtasks/m;->a:Lcom/facebook/backgroundtasks/j;

    invoke-static {v0}, Lcom/facebook/backgroundtasks/j;->a(Lcom/facebook/backgroundtasks/j;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 307
    :try_start_0
    iget-object v0, p0, Lcom/facebook/backgroundtasks/m;->a:Lcom/facebook/backgroundtasks/j;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/backgroundtasks/j;->a(Lcom/facebook/backgroundtasks/j;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 308
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    iget-object v0, p0, Lcom/facebook/backgroundtasks/m;->a:Lcom/facebook/backgroundtasks/j;

    invoke-static {v0}, Lcom/facebook/backgroundtasks/j;->b(Lcom/facebook/backgroundtasks/j;)V

    .line 310
    return-void

    .line 308
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
