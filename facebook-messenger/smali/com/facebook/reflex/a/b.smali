.class public Lcom/facebook/reflex/a/b;
.super Ljava/lang/Object;
.source "BucketedCounter.java"


# instance fields
.field final a:[D

.field final b:[I

.field c:I


# direct methods
.method public constructor <init>(DDD)V
    .locals 2

    .prologue
    .line 23
    const/4 v0, 0x3

    new-array v0, v0, [D

    const/4 v1, 0x0

    aput-wide p1, v0, v1

    const/4 v1, 0x1

    aput-wide p3, v0, v1

    const/4 v1, 0x2

    aput-wide p5, v0, v1

    invoke-direct {p0, v0}, Lcom/facebook/reflex/a/b;-><init>([D)V

    .line 24
    return-void
.end method

.method public constructor <init>(DDDD)V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x4

    new-array v0, v0, [D

    const/4 v1, 0x0

    aput-wide p1, v0, v1

    const/4 v1, 0x1

    aput-wide p3, v0, v1

    const/4 v1, 0x2

    aput-wide p5, v0, v1

    const/4 v1, 0x3

    aput-wide p7, v0, v1

    invoke-direct {p0, v0}, Lcom/facebook/reflex/a/b;-><init>([D)V

    .line 28
    return-void
.end method

.method public constructor <init>([D)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput v2, p0, Lcom/facebook/reflex/a/b;->c:I

    .line 16
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/facebook/reflex/a/b;->b:[I

    .line 17
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [D

    iput-object v0, p0, Lcom/facebook/reflex/a/b;->a:[D

    .line 18
    iget-object v0, p0, Lcom/facebook/reflex/a/b;->a:[D

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    iget-object v0, p0, Lcom/facebook/reflex/a/b;->a:[D

    iget-object v1, p0, Lcom/facebook/reflex/a/b;->a:[D

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    aput-wide v2, v0, v1

    .line 20
    return-void
.end method


# virtual methods
.method public declared-synchronized a(D)V
    .locals 3

    .prologue
    .line 35
    monitor-enter p0

    const/4 v0, 0x0

    .line 38
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/reflex/a/b;->a:[D

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/facebook/reflex/a/b;->a:[D

    aget-wide v1, v1, v0

    cmpg-double v1, v1, p1

    if-gez v1, :cond_0

    .line 39
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 41
    :cond_0
    iget-object v1, p0, Lcom/facebook/reflex/a/b;->b:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    .line 42
    iget v0, p0, Lcom/facebook/reflex/a/b;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/reflex/a/b;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    return-void

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a()[I
    .locals 5

    .prologue
    .line 46
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/reflex/a/b;->b:[I

    array-length v0, v0

    new-array v0, v0, [I

    .line 47
    iget-object v1, p0, Lcom/facebook/reflex/a/b;->b:[I

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/reflex/a/b;->b:[I

    array-length v4, v4

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    iget-object v1, p0, Lcom/facebook/reflex/a/b;->b:[I

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 49
    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/reflex/a/b;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit p0

    return-object v0

    .line 46
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()I
    .locals 1

    .prologue
    .line 54
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/facebook/reflex/a/b;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
