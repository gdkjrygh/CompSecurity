.class public final Lcom/roidapp/cloudlib/sns/b;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;"
        }
    .end annotation
.end field

.field private volatile b:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;>;)V"
        }
    .end annotation

    .prologue
    .line 16
    const-string v0, "SNS - NetworkDispatcher"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 17
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/b;->a:Ljava/util/concurrent/BlockingQueue;

    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/b;->b:Z

    .line 22
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/b;->interrupt()V

    .line 23
    return-void
.end method

.method public final run()V
    .locals 3

    .prologue
    .line 29
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/o;

    .line 30
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->j()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->k()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 31
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NetworkDispatcher --- request canceled :"

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

    const-string v2, " --- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/m;->c(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->k()Z

    move-result v1

    if-nez v1, :cond_0

    .line 35
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->q()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/b;->b:Z

    if-eqz v0, :cond_0

    .line 44
    const-string v0, "NetworkDispatcher has quited"

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->a(Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V

    .line 46
    invoke-static {p0}, Lcom/roidapp/baselib/c/ae;->a(Ljava/lang/Object;)V

    .line 47
    return-void

    .line 40
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->run()V

    .line 41
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->q()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
