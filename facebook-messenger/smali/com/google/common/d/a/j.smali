.class final Lcom/google/common/d/a/j;
.super Ljava/lang/Object;
.source "Futures.java"

# interfaces
.implements Lcom/google/common/d/a/ac;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/ac",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Future;


# virtual methods
.method public cancel(Z)Z
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/google/common/d/a/j;->a:Ljava/util/concurrent/Future;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    return v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lcom/google/common/d/a/j;->a:Ljava/util/concurrent/Future;

    invoke-static {v0}, Lcom/google/common/d/a/ad;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 101
    iget-object v0, p0, Lcom/google/common/d/a/j;->a:Ljava/util/concurrent/Future;

    invoke-static {v0, p1, p2, p3}, Lcom/google/common/d/a/ad;->a(Ljava/util/concurrent/Future;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/google/common/d/a/j;->a:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/google/common/d/a/j;->a:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    return v0
.end method
