.class public abstract Lcom/facebook/common/g/a;
.super Ljava/lang/Object;
.source "AbstractDisposableFutureCallback.java"

# interfaces
.implements Lcom/facebook/common/g/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/common/g/b",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private volatile a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/common/g/a;->a:Z

    .line 18
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 28
    iget-boolean v0, p0, Lcom/facebook/common/g/a;->a:Z

    if-eqz v0, :cond_0

    .line 32
    :goto_0
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/common/g/a;->b(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/facebook/common/g/a;->a:Z

    if-eqz v0, :cond_0

    .line 46
    :goto_0
    return-void

    .line 39
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    .line 42
    check-cast p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0, p1}, Lcom/facebook/common/g/a;->a(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p0, p1}, Lcom/facebook/common/g/a;->b(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected a(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .prologue
    .line 52
    return-void
.end method

.method protected abstract b(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method protected abstract b(Ljava/lang/Throwable;)V
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/facebook/common/g/a;->a:Z

    return v0
.end method
