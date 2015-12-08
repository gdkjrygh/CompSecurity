.class final Lorg/chromium/content/common/CleanupReference$1;
.super Ljava/lang/Thread;
.source "CleanupReference.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/common/CleanupReference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 50
    :goto_0
    :try_start_0
    # getter for: Lorg/chromium/content/common/CleanupReference;->sGcQueue:Ljava/lang/ref/ReferenceQueue;
    invoke-static {}, Lorg/chromium/content/common/CleanupReference;->access$000()Ljava/lang/ref/ReferenceQueue;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v1

    check-cast v1, Lorg/chromium/content/common/CleanupReference;

    .line 52
    .local v1, "ref":Lorg/chromium/content/common/CleanupReference;
    # getter for: Lorg/chromium/content/common/CleanupReference;->sCleanupMonitor:Ljava/lang/Object;
    invoke-static {}, Lorg/chromium/content/common/CleanupReference;->access$100()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :try_start_1
    sget-object v2, Lorg/chromium/content/common/CleanupReference$LazyHolder;->sHandler:Landroid/os/Handler;

    const/4 v4, 0x2

    invoke-static {v2, v4, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 56
    # getter for: Lorg/chromium/content/common/CleanupReference;->sCleanupMonitor:Ljava/lang/Object;
    invoke-static {}, Lorg/chromium/content/common/CleanupReference;->access$100()Ljava/lang/Object;

    move-result-object v2

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v4, v5}, Ljava/lang/Object;->wait(J)V

    .line 57
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 58
    .end local v1    # "ref":Lorg/chromium/content/common/CleanupReference;
    :catch_0
    move-exception v0

    .line 59
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "CleanupReference"

    const-string v3, "Queue remove exception:"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
