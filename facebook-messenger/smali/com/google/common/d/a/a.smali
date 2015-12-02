.class public abstract Lcom/google/common/d/a/a;
.super Ljava/lang/Object;
.source "AbstractFuture.java"

# interfaces
.implements Lcom/google/common/d/a/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/s",
        "<TV;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/d/a/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/b",
            "<TV;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/d/a/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Lcom/google/common/d/a/b;

    invoke-direct {v0}, Lcom/google/common/d/a/b;-><init>()V

    iput-object v0, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    .line 73
    new-instance v0, Lcom/google/common/d/a/d;

    invoke-direct {v0}, Lcom/google/common/d/a/d;-><init>()V

    iput-object v0, p0, Lcom/google/common/d/a/a;->b:Lcom/google/common/d/a/d;

    .line 254
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/google/common/d/a/a;->b:Lcom/google/common/d/a/d;

    invoke-virtual {v0, p1, p2}, Lcom/google/common/d/a/d;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 158
    return-void
.end method

.method protected a_(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .prologue
    .line 170
    iget-object v0, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/b;->a(Ljava/lang/Object;)Z

    move-result v0

    .line 171
    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {p0}, Lcom/google/common/d/a/a;->d()V

    .line 174
    :cond_0
    return v0
.end method

.method protected a_(Ljava/lang/Throwable;)Z
    .locals 2

    .prologue
    .line 188
    iget-object v1, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lcom/google/common/d/a/b;->a(Ljava/lang/Throwable;)Z

    move-result v0

    .line 189
    if-eqz v0, :cond_0

    .line 190
    invoke-virtual {p0}, Lcom/google/common/d/a/a;->d()V

    .line 195
    :cond_0
    instance-of v1, p1, Ljava/lang/Error;

    if-eqz v1, :cond_1

    .line 196
    check-cast p1, Ljava/lang/Error;

    throw p1

    .line 198
    :cond_1
    return v0
.end method

.method protected c()V
    .locals 0

    .prologue
    .line 148
    return-void
.end method

.method public cancel(Z)Z
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    invoke-virtual {v0}, Lcom/google/common/d/a/b;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    const/4 v0, 0x0

    .line 135
    :goto_0
    return v0

    .line 131
    :cond_0
    invoke-virtual {p0}, Lcom/google/common/d/a/a;->d()V

    .line 132
    if-eqz p1, :cond_1

    .line 133
    invoke-virtual {p0}, Lcom/google/common/d/a/a;->c()V

    .line 135
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected d()V
    .locals 1
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 235
    iget-object v0, p0, Lcom/google/common/d/a/a;->b:Lcom/google/common/d/a/d;

    invoke-virtual {v0}, Lcom/google/common/d/a/d;->a()V

    .line 236
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 113
    iget-object v0, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    invoke-virtual {v0}, Lcom/google/common/d/a/b;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 93
    iget-object v0, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/common/d/a/b;->a(J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    invoke-virtual {v0}, Lcom/google/common/d/a/b;->c()Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/google/common/d/a/a;->a:Lcom/google/common/d/a/b;

    invoke-virtual {v0}, Lcom/google/common/d/a/b;->b()Z

    move-result v0

    return v0
.end method
