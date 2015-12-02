.class public interface abstract Lcom/google/common/d/a/u;
.super Ljava/lang/Object;
.source "ListeningExecutorService.java"

# interfaces
.implements Ljava/util/concurrent/ExecutorService;


# virtual methods
.method public abstract b(Ljava/lang/Runnable;)Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lcom/google/common/d/a/s",
            "<*>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Lcom/google/common/d/a/s",
            "<TT;>;"
        }
    .end annotation
.end method
