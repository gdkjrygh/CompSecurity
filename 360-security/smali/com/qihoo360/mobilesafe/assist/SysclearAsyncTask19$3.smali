.class Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$3;
.super Ljava/util/concurrent/FutureTask;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask",
        "<TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/util/concurrent/Callable;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$3;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    .line 278
    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-void
.end method


# virtual methods
.method protected done()V
    .locals 3

    .prologue
    .line 282
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$3;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$3;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2

    .line 290
    :goto_0
    return-void

    .line 283
    :catch_0
    move-exception v0

    .line 284
    const-string/jumbo v1, "SysclearAsyncTask19"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 285
    :catch_1
    move-exception v0

    .line 286
    new-instance v1, Ljava/lang/RuntimeException;

    const-string/jumbo v2, "An error occured while executing doInBackground()"

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 287
    :catch_2
    move-exception v0

    .line 288
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$3;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/lang/Object;)V

    goto :goto_0
.end method
