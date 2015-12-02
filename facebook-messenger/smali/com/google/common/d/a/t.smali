.class public final Lcom/google/common/d/a/t;
.super Ljava/util/concurrent/FutureTask;
.source "ListenableFutureTask.java"

# interfaces
.implements Lcom/google/common/d/a/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/FutureTask",
        "<TV;>;",
        "Lcom/google/common/d/a/s",
        "<TV;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/d/a/d;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "TV;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 101
    invoke-direct {p0, p1, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 40
    new-instance v0, Lcom/google/common/d/a/d;

    invoke-direct {v0}, Lcom/google/common/d/a/d;-><init>()V

    iput-object v0, p0, Lcom/google/common/d/a/t;->a:Lcom/google/common/d/a/d;

    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 81
    invoke-direct {p0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 40
    new-instance v0, Lcom/google/common/d/a/d;

    invoke-direct {v0}, Lcom/google/common/d/a/d;-><init>()V

    iput-object v0, p0, Lcom/google/common/d/a/t;->a:Lcom/google/common/d/a/d;

    .line 82
    return-void
.end method

.method public static a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/google/common/d/a/t;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TV;)",
            "Lcom/google/common/d/a/t",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 67
    new-instance v0, Lcom/google/common/d/a/t;

    invoke-direct {v0, p0, p1}, Lcom/google/common/d/a/t;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)",
            "Lcom/google/common/d/a/t",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 50
    new-instance v0, Lcom/google/common/d/a/t;

    invoke-direct {v0, p0}, Lcom/google/common/d/a/t;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/google/common/d/a/t;->a:Lcom/google/common/d/a/d;

    invoke-virtual {v0, p1, p2}, Lcom/google/common/d/a/d;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 107
    return-void
.end method

.method protected done()V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/google/common/d/a/t;->a:Lcom/google/common/d/a/d;

    invoke-virtual {v0}, Lcom/google/common/d/a/d;->a()V

    .line 112
    return-void
.end method
