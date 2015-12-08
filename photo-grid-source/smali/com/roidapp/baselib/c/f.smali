.class final Lcom/roidapp/baselib/c/f;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask",
        "<TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/c/c;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/c/c;Ljava/util/concurrent/Callable;)V
    .locals 0

    .prologue
    .line 322
    iput-object p1, p0, Lcom/roidapp/baselib/c/f;->a:Lcom/roidapp/baselib/c/c;

    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-void
.end method


# virtual methods
.method protected final done()V
    .locals 3

    .prologue
    .line 326
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/f;->a:Lcom/roidapp/baselib/c/c;

    invoke-virtual {p0}, Lcom/roidapp/baselib/c/f;->get()Ljava/lang/Object;

    move-result-object v1

    # invokes: Lcom/roidapp/baselib/c/c;->postResultIfNotInvoked(Ljava/lang/Object;)V
    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/c;->access$500(Lcom/roidapp/baselib/c/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2

    .line 335
    :goto_0
    return-void

    .line 327
    :catch_0
    move-exception v0

    .line 328
    const-string v1, "AsyncTask"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 329
    :catch_1
    move-exception v0

    .line 330
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "An error occured while executing doInBackground()"

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 333
    :catch_2
    move-exception v0

    iget-object v0, p0, Lcom/roidapp/baselib/c/f;->a:Lcom/roidapp/baselib/c/c;

    const/4 v1, 0x0

    # invokes: Lcom/roidapp/baselib/c/c;->postResultIfNotInvoked(Ljava/lang/Object;)V
    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/c;->access$500(Lcom/roidapp/baselib/c/c;Ljava/lang/Object;)V

    goto :goto_0
.end method
