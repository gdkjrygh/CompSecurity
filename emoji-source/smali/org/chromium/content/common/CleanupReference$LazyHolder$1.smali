.class final Lorg/chromium/content/common/CleanupReference$LazyHolder$1;
.super Landroid/os/Handler;
.source "CleanupReference.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/common/CleanupReference$LazyHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0
    .param p1, "x0"    # Landroid/os/Looper;

    .prologue
    .line 84
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 87
    invoke-static {}, Lorg/chromium/base/TraceEvent;->begin()V

    .line 88
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/chromium/content/common/CleanupReference;

    .line 89
    .local v1, "ref":Lorg/chromium/content/common/CleanupReference;
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 97
    const-string v2, "CleanupReference"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Bad message="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p1, Landroid/os/Message;->what:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    :goto_0
    # getter for: Lorg/chromium/content/common/CleanupReference;->sCleanupMonitor:Ljava/lang/Object;
    invoke-static {}, Lorg/chromium/content/common/CleanupReference;->access$100()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 106
    :goto_1
    :try_start_0
    # getter for: Lorg/chromium/content/common/CleanupReference;->sGcQueue:Ljava/lang/ref/ReferenceQueue;
    invoke-static {}, Lorg/chromium/content/common/CleanupReference;->access$000()Ljava/lang/ref/ReferenceQueue;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lorg/chromium/content/common/CleanupReference;

    move-object v1, v0

    if-eqz v1, :cond_0

    .line 107
    # invokes: Lorg/chromium/content/common/CleanupReference;->runCleanupTaskInternal()V
    invoke-static {v1}, Lorg/chromium/content/common/CleanupReference;->access$300(Lorg/chromium/content/common/CleanupReference;)V

    goto :goto_1

    .line 110
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    .line 91
    :pswitch_0
    # getter for: Lorg/chromium/content/common/CleanupReference;->sRefs:Ljava/util/Set;
    invoke-static {}, Lorg/chromium/content/common/CleanupReference;->access$200()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 94
    :pswitch_1
    # invokes: Lorg/chromium/content/common/CleanupReference;->runCleanupTaskInternal()V
    invoke-static {v1}, Lorg/chromium/content/common/CleanupReference;->access$300(Lorg/chromium/content/common/CleanupReference;)V

    goto :goto_0

    .line 109
    :cond_0
    :try_start_1
    # getter for: Lorg/chromium/content/common/CleanupReference;->sCleanupMonitor:Ljava/lang/Object;
    invoke-static {}, Lorg/chromium/content/common/CleanupReference;->access$100()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 110
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    invoke-static {}, Lorg/chromium/base/TraceEvent;->end()V

    .line 112
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
