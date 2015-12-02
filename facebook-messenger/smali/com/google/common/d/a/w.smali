.class public final Lcom/google/common/d/a/w;
.super Ljava/lang/Object;
.source "MoreExecutors.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/common/d/a/u;
    .locals 2

    .prologue
    .line 224
    new-instance v0, Lcom/google/common/d/a/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/common/d/a/z;-><init>(Lcom/google/common/d/a/x;)V

    return-object v0
.end method

.method public static a(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/d/a/u;
    .locals 1

    .prologue
    .line 371
    instance-of v0, p0, Lcom/google/common/d/a/u;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/common/d/a/u;

    :goto_0
    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/common/d/a/aa;

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0}, Lcom/google/common/d/a/aa;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/common/d/a/y;

    invoke-direct {v0, p0}, Lcom/google/common/d/a/y;-><init>(Ljava/util/concurrent/ExecutorService;)V

    move-object p0, v0

    goto :goto_0
.end method
