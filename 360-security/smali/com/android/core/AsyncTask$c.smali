.class Lcom/android/core/AsyncTask$c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/core/AsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final a:Lcom/android/core/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/core/ArrayDeque",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    new-instance v0, Lcom/android/core/ArrayDeque;

    invoke-direct {v0}, Lcom/android/core/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/android/core/AsyncTask$c;->a:Lcom/android/core/ArrayDeque;

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/core/AsyncTask$1;)V
    .locals 0

    .prologue
    .line 208
    invoke-direct {p0}, Lcom/android/core/AsyncTask$c;-><init>()V

    return-void
.end method


# virtual methods
.method protected declared-synchronized a()V
    .locals 2

    .prologue
    .line 230
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/core/AsyncTask$c;->a:Lcom/android/core/ArrayDeque;

    invoke-virtual {v0}, Lcom/android/core/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    iput-object v0, p0, Lcom/android/core/AsyncTask$c;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 231
    sget-object v0, Lcom/android/core/AsyncTask;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/android/core/AsyncTask$c;->b:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    :cond_0
    monitor-exit p0

    return-void

    .line 230
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 214
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/core/AsyncTask$c;->a:Lcom/android/core/ArrayDeque;

    new-instance v1, Lcom/android/core/AsyncTask$c$1;

    invoke-direct {v1, p0, p1}, Lcom/android/core/AsyncTask$c$1;-><init>(Lcom/android/core/AsyncTask$c;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/android/core/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 224
    iget-object v0, p0, Lcom/android/core/AsyncTask$c;->b:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 225
    invoke-virtual {p0}, Lcom/android/core/AsyncTask$c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    :cond_0
    monitor-exit p0

    return-void

    .line 214
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
