.class Lcom/google/common/d/a/o;
.super Ljava/lang/Object;
.source "Futures.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/common/d/a/s;

.field final synthetic b:Lcom/google/common/d/a/n;


# direct methods
.method constructor <init>(Lcom/google/common/d/a/n;Lcom/google/common/d/a/s;)V
    .locals 0

    .prologue
    .line 839
    iput-object p1, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    iput-object p2, p0, Lcom/google/common/d/a/o;->a:Lcom/google/common/d/a/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 846
    :try_start_0
    iget-object v0, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    iget-object v1, p0, Lcom/google/common/d/a/o;->a:Lcom/google/common/d/a/s;

    invoke-static {v1}, Lcom/google/common/d/a/ad;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/n;->a_(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 858
    iget-object v0, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    invoke-static {v0, v2}, Lcom/google/common/d/a/n;->a(Lcom/google/common/d/a/n;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 860
    :goto_0
    return-void

    .line 847
    :catch_0
    move-exception v0

    .line 851
    :try_start_1
    iget-object v0, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/n;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 858
    iget-object v0, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    invoke-static {v0, v2}, Lcom/google/common/d/a/n;->a(Lcom/google/common/d/a/n;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    goto :goto_0

    .line 853
    :catch_1
    move-exception v0

    .line 855
    :try_start_2
    iget-object v1, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/d/a/n;->a_(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 858
    iget-object v0, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    invoke-static {v0, v2}, Lcom/google/common/d/a/n;->a(Lcom/google/common/d/a/n;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/common/d/a/o;->b:Lcom/google/common/d/a/n;

    invoke-static {v1, v2}, Lcom/google/common/d/a/n;->a(Lcom/google/common/d/a/n;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    throw v0
.end method
