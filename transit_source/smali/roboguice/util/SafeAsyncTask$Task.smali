.class public Lroboguice/util/SafeAsyncTask$Task;
.super Ljava/lang/Object;
.source "SafeAsyncTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/util/SafeAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Task"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field protected handler:Landroid/os/Handler;

.field protected parent:Lroboguice/util/SafeAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lroboguice/util/SafeAsyncTask",
            "<TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lroboguice/util/SafeAsyncTask;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lroboguice/util/SafeAsyncTask",
            "<TResultT;>;)V"
        }
    .end annotation

    .prologue
    .line 162
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    .local p1, "parent":Lroboguice/util/SafeAsyncTask;, "Lroboguice/util/SafeAsyncTask<TResultT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput-object p1, p0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    .line 164
    iget-object v0, p1, Lroboguice/util/SafeAsyncTask;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lroboguice/util/SafeAsyncTask;->handler:Landroid/os/Handler;

    :goto_0
    iput-object v0, p0, Lroboguice/util/SafeAsyncTask$Task;->handler:Landroid/os/Handler;

    .line 165
    return-void

    .line 164
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 158
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    invoke-virtual {p0}, Lroboguice/util/SafeAsyncTask$Task;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 169
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    :try_start_0
    invoke-virtual {p0}, Lroboguice/util/SafeAsyncTask$Task;->doPreExecute()V

    .line 170
    invoke-virtual {p0}, Lroboguice/util/SafeAsyncTask$Task;->doCall()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Lroboguice/util/SafeAsyncTask$Task;->doSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    invoke-virtual {p0}, Lroboguice/util/SafeAsyncTask$Task;->doFinally()V

    .line 191
    :goto_0
    const/4 v3, 0x0

    return-object v3

    .line 172
    :catch_0
    move-exception v0

    .line 174
    .local v0, "e":Ljava/lang/Exception;
    :try_start_1
    invoke-virtual {p0, v0}, Lroboguice/util/SafeAsyncTask$Task;->doException(Ljava/lang/Exception;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    :goto_1
    invoke-virtual {p0}, Lroboguice/util/SafeAsyncTask$Task;->doFinally()V

    goto :goto_0

    .line 175
    :catch_1
    move-exception v1

    .line 177
    .local v1, "f":Ljava/lang/Exception;
    :try_start_2
    invoke-static {v1}, Lroboguice/util/Ln;->e(Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 188
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v1    # "f":Ljava/lang/Exception;
    :catchall_0
    move-exception v3

    invoke-virtual {p0}, Lroboguice/util/SafeAsyncTask$Task;->doFinally()V

    throw v3

    .line 180
    :catch_2
    move-exception v2

    .line 182
    .local v2, "t":Ljava/lang/Throwable;
    :try_start_3
    invoke-virtual {p0, v2}, Lroboguice/util/SafeAsyncTask$Task;->doThrowable(Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 188
    :goto_2
    invoke-virtual {p0}, Lroboguice/util/SafeAsyncTask$Task;->doFinally()V

    goto :goto_0

    .line 183
    :catch_3
    move-exception v1

    .line 185
    .restart local v1    # "f":Ljava/lang/Exception;
    :try_start_4
    invoke-static {v1}, Lroboguice/util/Ln;->e(Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2
.end method

.method protected doCall()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResultT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 204
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    iget-object v0, p0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    invoke-virtual {v0}, Lroboguice/util/SafeAsyncTask;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected doException(Ljava/lang/Exception;)V
    .locals 2
    .param p1, "e"    # Ljava/lang/Exception;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 217
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, v1, Lroboguice/util/SafeAsyncTask;->launchLocation:[Ljava/lang/StackTraceElement;

    if-eqz v1, :cond_0

    .line 218
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 219
    .local v0, "stack":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/StackTraceElement;>;"
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, v1, Lroboguice/util/SafeAsyncTask;->launchLocation:[Ljava/lang/StackTraceElement;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 220
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/StackTraceElement;

    invoke-virtual {p1, v1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 222
    .end local v0    # "stack":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/StackTraceElement;>;"
    :cond_0
    new-instance v1, Lroboguice/util/SafeAsyncTask$Task$3;

    invoke-direct {v1, p0, p1}, Lroboguice/util/SafeAsyncTask$Task$3;-><init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/lang/Exception;)V

    invoke-virtual {p0, v1}, Lroboguice/util/SafeAsyncTask$Task;->postToUiThreadAndWait(Ljava/util/concurrent/Callable;)V

    .line 231
    return-void
.end method

.method protected doFinally()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 248
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    new-instance v0, Lroboguice/util/SafeAsyncTask$Task$5;

    invoke-direct {v0, p0}, Lroboguice/util/SafeAsyncTask$Task$5;-><init>(Lroboguice/util/SafeAsyncTask$Task;)V

    invoke-virtual {p0, v0}, Lroboguice/util/SafeAsyncTask$Task;->postToUiThreadAndWait(Ljava/util/concurrent/Callable;)V

    .line 254
    return-void
.end method

.method protected doPreExecute()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 195
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    new-instance v0, Lroboguice/util/SafeAsyncTask$Task$1;

    invoke-direct {v0, p0}, Lroboguice/util/SafeAsyncTask$Task$1;-><init>(Lroboguice/util/SafeAsyncTask$Task;)V

    invoke-virtual {p0, v0}, Lroboguice/util/SafeAsyncTask$Task;->postToUiThreadAndWait(Ljava/util/concurrent/Callable;)V

    .line 201
    return-void
.end method

.method protected doSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 208
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    .local p1, "r":Ljava/lang/Object;, "TResultT;"
    new-instance v0, Lroboguice/util/SafeAsyncTask$Task$2;

    invoke-direct {v0, p0, p1}, Lroboguice/util/SafeAsyncTask$Task$2;-><init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lroboguice/util/SafeAsyncTask$Task;->postToUiThreadAndWait(Ljava/util/concurrent/Callable;)V

    .line 214
    return-void
.end method

.method protected doThrowable(Ljava/lang/Throwable;)V
    .locals 2
    .param p1, "e"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 234
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, v1, Lroboguice/util/SafeAsyncTask;->launchLocation:[Ljava/lang/StackTraceElement;

    if-eqz v1, :cond_0

    .line 235
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 236
    .local v0, "stack":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/StackTraceElement;>;"
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, v1, Lroboguice/util/SafeAsyncTask;->launchLocation:[Ljava/lang/StackTraceElement;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 237
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/StackTraceElement;

    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 239
    .end local v0    # "stack":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/StackTraceElement;>;"
    :cond_0
    new-instance v1, Lroboguice/util/SafeAsyncTask$Task$4;

    invoke-direct {v1, p0, p1}, Lroboguice/util/SafeAsyncTask$Task$4;-><init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lroboguice/util/SafeAsyncTask$Task;->postToUiThreadAndWait(Ljava/util/concurrent/Callable;)V

    .line 245
    return-void
.end method

.method protected postToUiThreadAndWait(Ljava/util/concurrent/Callable;)V
    .locals 5
    .param p1, "c"    # Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task;, "Lroboguice/util/SafeAsyncTask$Task<TResultT;>;"
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 265
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 266
    .local v1, "latch":Ljava/util/concurrent/CountDownLatch;
    new-array v0, v2, [Ljava/lang/Exception;

    .line 272
    .local v0, "exceptions":[Ljava/lang/Exception;
    iget-object v2, p0, Lroboguice/util/SafeAsyncTask$Task;->handler:Landroid/os/Handler;

    new-instance v3, Lroboguice/util/SafeAsyncTask$Task$6;

    invoke-direct {v3, p0, p1, v0, v1}, Lroboguice/util/SafeAsyncTask$Task$6;-><init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/util/concurrent/Callable;[Ljava/lang/Exception;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 285
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 287
    aget-object v2, v0, v4

    if-eqz v2, :cond_0

    .line 288
    aget-object v2, v0, v4

    throw v2

    .line 290
    :cond_0
    return-void
.end method
