.class Lroboguice/util/SafeAsyncTask$Task$6;
.super Ljava/lang/Object;
.source "SafeAsyncTask.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/util/SafeAsyncTask$Task;->postToUiThreadAndWait(Ljava/util/concurrent/Callable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lroboguice/util/SafeAsyncTask$Task;

.field final synthetic val$c:Ljava/util/concurrent/Callable;

.field final synthetic val$exceptions:[Ljava/lang/Exception;

.field final synthetic val$latch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/util/concurrent/Callable;[Ljava/lang/Exception;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .prologue
    .line 272
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$6;, "Lroboguice/util/SafeAsyncTask$Task.6;"
    iput-object p1, p0, Lroboguice/util/SafeAsyncTask$Task$6;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iput-object p2, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$c:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$exceptions:[Ljava/lang/Exception;

    iput-object p4, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 275
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$6;, "Lroboguice/util/SafeAsyncTask$Task.6;"
    :try_start_0
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$c:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 281
    :goto_0
    return-void

    .line 276
    :catch_0
    move-exception v0

    .line 277
    .local v0, "e":Ljava/lang/Exception;
    :try_start_1
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$exceptions:[Ljava/lang/Exception;

    const/4 v2, 0x0

    aput-object v0, v1, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 279
    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v1

    iget-object v2, p0, Lroboguice/util/SafeAsyncTask$Task$6;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v1
.end method
