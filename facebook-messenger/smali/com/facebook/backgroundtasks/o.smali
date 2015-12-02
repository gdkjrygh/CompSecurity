.class Lcom/facebook/backgroundtasks/o;
.super Ljava/lang/Object;
.source "BackgroundTaskRunner.java"


# instance fields
.field private final a:Lcom/facebook/common/executors/a;

.field private final b:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method constructor <init>(Lcom/facebook/common/executors/a;)V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/facebook/backgroundtasks/o;->b:Ljava/util/concurrent/locks/ReentrantLock;

    .line 63
    iput-object p1, p0, Lcom/facebook/backgroundtasks/o;->a:Lcom/facebook/common/executors/a;

    .line 64
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/backgroundtasks/o;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 68
    iget-object v0, p0, Lcom/facebook/backgroundtasks/o;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 69
    return-void
.end method

.method b()V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/backgroundtasks/o;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 73
    return-void
.end method

.method c()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/backgroundtasks/o;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    return v0
.end method
