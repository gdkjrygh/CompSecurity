.class final Lcom/cleanmaster/ui/app/market/loader/d;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/util/concurrent/Callable;)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/loader/d;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-void
.end method


# virtual methods
.method protected final done()V
    .locals 3

    .prologue
    .line 245
    :try_start_0
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/d;->get()Ljava/lang/Object;

    move-result-object v0

    .line 247
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/d;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    invoke-static {v1, v0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->b(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3

    .line 258
    :goto_0
    return-void

    .line 248
    :catch_0
    move-exception v0

    .line 249
    const-string v1, "AsyncTask"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 250
    :catch_1
    move-exception v0

    .line 251
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "An error occured while executing doInBackground()"

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 254
    :catch_2
    move-exception v0

    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/d;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->b(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/lang/Object;)V

    goto :goto_0

    .line 255
    :catch_3
    move-exception v0

    .line 256
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "An error occured while executing doInBackground()"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
