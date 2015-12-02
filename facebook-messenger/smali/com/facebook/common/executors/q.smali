.class Lcom/facebook/common/executors/q;
.super Ljava/lang/Object;
.source "KeyedExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field final b:Ljava/lang/Object;

.field final c:Ljava/lang/String;

.field private d:Lcom/google/common/d/a/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/t",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/concurrent/Callable;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/concurrent/Callable",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    invoke-static {p3}, Lcom/google/common/d/a/t;->a(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/q;->d:Lcom/google/common/d/a/t;

    .line 60
    iput-object p1, p0, Lcom/facebook/common/executors/q;->a:Ljava/lang/Object;

    .line 61
    iput-object p2, p0, Lcom/facebook/common/executors/q;->b:Ljava/lang/Object;

    .line 62
    iput-object p4, p0, Lcom/facebook/common/executors/q;->c:Ljava/lang/String;

    .line 63
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/concurrent/Callable;Ljava/lang/String;Lcom/facebook/common/executors/o;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/common/executors/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/concurrent/Callable;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/common/executors/q;)Lcom/google/common/d/a/t;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/common/executors/q;->d:Lcom/google/common/d/a/t;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v3, 0x3

    const-wide/16 v4, 0x32

    .line 67
    invoke-static {v4, v5}, Lcom/facebook/debug/d/e;->b(J)V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KeyedExecutor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/common/executors/q;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/facebook/common/executors/q;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/common/executors/q;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 72
    :cond_0
    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/executors/q;->d:Lcom/google/common/d/a/t;

    invoke-virtual {v0}, Lcom/google/common/d/a/t;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v0

    .line 77
    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 78
    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    .line 79
    invoke-static {}, Lcom/facebook/common/executors/n;->a()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread trace:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/facebook/debug/d/e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 83
    :cond_1
    return-void

    .line 76
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    move-result-wide v1

    .line 77
    invoke-static {v3}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 78
    cmp-long v1, v1, v4

    if-lez v1, :cond_2

    .line 79
    invoke-static {}, Lcom/facebook/common/executors/n;->a()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread trace:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/facebook/debug/d/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 82
    :cond_2
    throw v0
.end method
