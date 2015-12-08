.class public final Lcom/roidapp/cloudlib/sns/a;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private final a:Lcom/roidapp/cloudlib/sns/p;

.field private final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;"
        }
    .end annotation
.end field

.field private volatile d:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/roidapp/cloudlib/sns/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;",
            "Lcom/roidapp/cloudlib/sns/p;",
            ")V"
        }
    .end annotation

    .prologue
    .line 19
    const-string v0, "SNS - CacheDispatcher"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 20
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/a;->b:Ljava/util/concurrent/BlockingQueue;

    .line 21
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/a;->c:Ljava/util/concurrent/BlockingQueue;

    .line 22
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/a;->a:Lcom/roidapp/cloudlib/sns/p;

    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/a;->d:Z

    .line 27
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/a;->interrupt()V

    .line 28
    return-void
.end method

.method public final run()V
    .locals 5

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a;->a:Lcom/roidapp/cloudlib/sns/p;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/p;->a()V

    .line 37
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/o;

    .line 38
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->j()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->k()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 39
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cacheDispatcher --- request canceled :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->j()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " finished: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->k()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " --- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "---"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/m;->c(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->k()Z

    move-result v1

    if-nez v1, :cond_0

    .line 43
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->q()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 72
    :catch_0
    move-exception v0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/a;->d:Z

    if-eqz v0, :cond_0

    .line 73
    const-string v0, "CacheDispatcher has quited"

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a;->a:Lcom/roidapp/cloudlib/sns/p;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/p;->c()V

    .line 75
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V

    .line 76
    invoke-static {p0}, Lcom/roidapp/baselib/c/ae;->a(Ljava/lang/Object;)V

    .line 77
    return-void

    .line 49
    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/a;->a:Lcom/roidapp/cloudlib/sns/p;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/p;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->i()Lcom/roidapp/cloudlib/sns/x;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v2

    .line 52
    if-eqz v2, :cond_3

    .line 54
    const/4 v3, 0x0

    :try_start_2
    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "hit cache --- "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " --- "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/m;->b(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v2, v1}, Lcom/roidapp/cloudlib/sns/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 65
    :cond_3
    :goto_1
    :try_start_3
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->j()Z

    move-result v1

    if-nez v1, :cond_4

    .line 66
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/a;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 69
    :cond_4
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->q()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    :catch_1
    move-exception v1

    goto :goto_1
.end method
