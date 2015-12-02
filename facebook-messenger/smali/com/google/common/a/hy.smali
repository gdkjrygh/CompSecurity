.class public final Lcom/google/common/a/hy;
.super Lcom/google/common/a/ea;
.source "MapMaker.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/ea",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field b:Z

.field c:I

.field d:I

.field e:I

.field f:Lcom/google/common/a/ct;

.field g:Lcom/google/common/a/ct;

.field h:J

.field i:J

.field j:Lcom/google/common/a/ic;

.field k:Lcom/google/common/base/Equivalence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field l:Lcom/google/common/base/Equivalence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field m:Lcom/google/common/base/Ticker;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const-wide/16 v1, -0x1

    const/4 v0, -0x1

    .line 147
    invoke-direct {p0}, Lcom/google/common/a/ea;-><init>()V

    .line 126
    iput v0, p0, Lcom/google/common/a/hy;->c:I

    .line 127
    iput v0, p0, Lcom/google/common/a/hy;->d:I

    .line 128
    iput v0, p0, Lcom/google/common/a/hy;->e:I

    .line 133
    iput-wide v1, p0, Lcom/google/common/a/hy;->h:J

    .line 134
    iput-wide v1, p0, Lcom/google/common/a/hy;->i:J

    .line 147
    return-void
.end method

.method private d(JLjava/util/concurrent/TimeUnit;)V
    .locals 9

    .prologue
    const-wide/16 v7, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 477
    iget-wide v3, p0, Lcom/google/common/a/hy;->h:J

    cmp-long v0, v3, v7

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "expireAfterWrite was already set to %s ns"

    new-array v4, v1, [Ljava/lang/Object;

    iget-wide v5, p0, Lcom/google/common/a/hy;->h:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget-wide v3, p0, Lcom/google/common/a/hy;->i:J

    cmp-long v0, v3, v7

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "expireAfterAccess was already set to %s ns"

    new-array v4, v1, [Ljava/lang/Object;

    iget-wide v5, p0, Lcom/google/common/a/hy;->i:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const-wide/16 v3, 0x0

    cmp-long v0, p1, v3

    if-ltz v0, :cond_2

    move v0, v1

    :goto_2
    const-string v3, "duration cannot be negative: %s %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    aput-object p3, v4, v1

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 482
    return-void

    :cond_0
    move v0, v2

    .line 477
    goto :goto_0

    :cond_1
    move v0, v2

    .line 479
    goto :goto_1

    :cond_2
    move v0, v2

    .line 481
    goto :goto_2
.end method

.method private o()Z
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/google/common/a/hy;->j:Lcom/google/common/a/ic;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/google/common/a/hy;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 206
    iget v0, p0, Lcom/google/common/a/hy;->c:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "initial capacity was already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/common/a/hy;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    if-ltz p1, :cond_1

    :goto_1
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 209
    iput p1, p0, Lcom/google/common/a/hy;->c:I

    .line 210
    return-object p0

    :cond_0
    move v0, v2

    .line 206
    goto :goto_0

    :cond_1
    move v1, v2

    .line 208
    goto :goto_1
.end method

.method public a(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 435
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/google/common/a/ct;)Lcom/google/common/a/hy;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 336
    iget-object v0, p0, Lcom/google/common/a/hy;->f:Lcom/google/common/a/ct;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Key strength was already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/common/a/hy;->f:Lcom/google/common/a/ct;

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 337
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ct;

    iput-object v0, p0, Lcom/google/common/a/hy;->f:Lcom/google/common/a/ct;

    .line 338
    sget-object v0, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    if-eq p1, v0, :cond_0

    .line 340
    iput-boolean v1, p0, Lcom/google/common/a/hy;->b:Z

    .line 342
    :cond_0
    return-object p0

    :cond_1
    move v0, v2

    .line 336
    goto :goto_0
.end method

.method public a(Lcom/google/common/base/Function;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/base/Function",
            "<-TK;+TV;>;)",
            "Ljava/util/concurrent/ConcurrentMap",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 739
    invoke-direct {p0}, Lcom/google/common/a/hy;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/common/a/bf;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/bf;-><init>(Lcom/google/common/a/hy;Lcom/google/common/base/Function;)V

    :goto_0
    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/ia;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/ia;-><init>(Lcom/google/common/a/hy;Lcom/google/common/base/Function;)V

    goto :goto_0
.end method

.method public b(I)Lcom/google/common/a/hy;
    .locals 6
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 241
    iget v0, p0, Lcom/google/common/a/hy;->e:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    move v0, v1

    :goto_0
    const-string v3, "maximum size was already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/common/a/hy;->e:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 243
    if-ltz p1, :cond_0

    move v2, v1

    :cond_0
    const-string v0, "maximum size must not be negative"

    invoke-static {v2, v0}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 244
    iput p1, p0, Lcom/google/common/a/hy;->e:I

    .line 245
    iput-boolean v1, p0, Lcom/google/common/a/hy;->b:Z

    .line 246
    iget v0, p0, Lcom/google/common/a/hy;->e:I

    if-nez v0, :cond_1

    .line 248
    sget-object v0, Lcom/google/common/a/ic;->SIZE:Lcom/google/common/a/ic;

    iput-object v0, p0, Lcom/google/common/a/hy;->j:Lcom/google/common/a/ic;

    .line 250
    :cond_1
    return-object p0

    :cond_2
    move v0, v2

    .line 241
    goto :goto_0
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 466
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/hy;->d(JLjava/util/concurrent/TimeUnit;)V

    .line 467
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/common/a/hy;->h:J

    .line 468
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/hy;->j:Lcom/google/common/a/ic;

    if-nez v0, :cond_0

    .line 470
    sget-object v0, Lcom/google/common/a/ic;->EXPIRED:Lcom/google/common/a/ic;

    iput-object v0, p0, Lcom/google/common/a/hy;->j:Lcom/google/common/a/ic;

    .line 472
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/common/a/hy;->b:Z

    .line 473
    return-object p0
.end method

.method b(Lcom/google/common/a/ct;)Lcom/google/common/a/hy;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 409
    iget-object v0, p0, Lcom/google/common/a/hy;->g:Lcom/google/common/a/ct;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Value strength was already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/common/a/hy;->g:Lcom/google/common/a/ct;

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 410
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ct;

    iput-object v0, p0, Lcom/google/common/a/hy;->g:Lcom/google/common/a/ct;

    .line 411
    sget-object v0, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    if-eq p1, v0, :cond_0

    .line 413
    iput-boolean v1, p0, Lcom/google/common/a/hy;->b:Z

    .line 415
    :cond_0
    return-object p0

    :cond_1
    move v0, v2

    .line 409
    goto :goto_0
.end method

.method b()Lcom/google/common/base/Equivalence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 170
    iget-object v0, p0, Lcom/google/common/a/hy;->k:Lcom/google/common/base/Equivalence;

    invoke-virtual {p0}, Lcom/google/common/a/hy;->g()Lcom/google/common/a/ct;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/ct;->defaultEquivalence()Lcom/google/common/base/Equivalence;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Equivalence;

    return-object v0
.end method

.method public c(I)Lcom/google/common/a/hy;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 274
    iget v0, p0, Lcom/google/common/a/hy;->d:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "concurrency level was already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/common/a/hy;->d:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 276
    if-lez p1, :cond_1

    :goto_1
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 277
    iput p1, p0, Lcom/google/common/a/hy;->d:I

    .line 278
    return-object p0

    :cond_0
    move v0, v2

    .line 274
    goto :goto_0

    :cond_1
    move v1, v2

    .line 276
    goto :goto_1
.end method

.method public c(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;
    .locals 2
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
        value = "To be supported"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 517
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/hy;->d(JLjava/util/concurrent/TimeUnit;)V

    .line 518
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/common/a/hy;->i:J

    .line 519
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/hy;->j:Lcom/google/common/a/ic;

    if-nez v0, :cond_0

    .line 521
    sget-object v0, Lcom/google/common/a/ic;->EXPIRED:Lcom/google/common/a/ic;

    iput-object v0, p0, Lcom/google/common/a/hy;->j:Lcom/google/common/a/ic;

    .line 523
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/common/a/hy;->b:Z

    .line 524
    return-object p0
.end method

.method c()Lcom/google/common/base/Equivalence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 191
    iget-object v0, p0, Lcom/google/common/a/hy;->l:Lcom/google/common/base/Equivalence;

    invoke-virtual {p0}, Lcom/google/common/a/hy;->j()Lcom/google/common/a/ct;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/ct;->defaultEquivalence()Lcom/google/common/base/Equivalence;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Equivalence;

    return-object v0
.end method

.method d()I
    .locals 2

    .prologue
    .line 214
    iget v0, p0, Lcom/google/common/a/hy;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x10

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/google/common/a/hy;->c:I

    goto :goto_0
.end method

.method e()I
    .locals 2

    .prologue
    .line 282
    iget v0, p0, Lcom/google/common/a/hy;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x4

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/google/common/a/hy;->d:I

    goto :goto_0
.end method

.method public f()Lcom/google/common/a/hy;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
        value = "java.lang.ref.WeakReference"
    .end annotation

    .prologue
    .line 309
    sget-object v0, Lcom/google/common/a/ct;->WEAK:Lcom/google/common/a/ct;

    invoke-virtual {p0, v0}, Lcom/google/common/a/hy;->a(Lcom/google/common/a/ct;)Lcom/google/common/a/hy;

    move-result-object v0

    return-object v0
.end method

.method g()Lcom/google/common/a/ct;
    .locals 2

    .prologue
    .line 346
    iget-object v0, p0, Lcom/google/common/a/hy;->f:Lcom/google/common/a/ct;

    sget-object v1, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ct;

    return-object v0
.end method

.method public h()Lcom/google/common/a/hy;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
        value = "java.lang.ref.WeakReference"
    .end annotation

    .prologue
    .line 379
    sget-object v0, Lcom/google/common/a/ct;->WEAK:Lcom/google/common/a/ct;

    invoke-virtual {p0, v0}, Lcom/google/common/a/hy;->b(Lcom/google/common/a/ct;)Lcom/google/common/a/hy;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/google/common/a/hy;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
        value = "java.lang.ref.SoftReference"
    .end annotation

    .prologue
    .line 405
    sget-object v0, Lcom/google/common/a/ct;->SOFT:Lcom/google/common/a/ct;

    invoke-virtual {p0, v0}, Lcom/google/common/a/hy;->b(Lcom/google/common/a/ct;)Lcom/google/common/a/hy;

    move-result-object v0

    return-object v0
.end method

.method j()Lcom/google/common/a/ct;
    .locals 2

    .prologue
    .line 419
    iget-object v0, p0, Lcom/google/common/a/hy;->g:Lcom/google/common/a/ct;

    sget-object v1, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ct;

    return-object v0
.end method

.method k()J
    .locals 4

    .prologue
    .line 485
    iget-wide v0, p0, Lcom/google/common/a/hy;->h:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :cond_0
    iget-wide v0, p0, Lcom/google/common/a/hy;->h:J

    goto :goto_0
.end method

.method l()J
    .locals 4

    .prologue
    .line 528
    iget-wide v0, p0, Lcom/google/common/a/hy;->i:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :cond_0
    iget-wide v0, p0, Lcom/google/common/a/hy;->i:J

    goto :goto_0
.end method

.method m()Lcom/google/common/base/Ticker;
    .locals 2

    .prologue
    .line 533
    iget-object v0, p0, Lcom/google/common/a/hy;->m:Lcom/google/common/base/Ticker;

    invoke-static {}, Lcom/google/common/base/Ticker;->systemTicker()Lcom/google/common/base/Ticker;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->firstNonNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Ticker;

    return-object v0
.end method

.method public n()Ljava/util/concurrent/ConcurrentMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/concurrent/ConcurrentMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 659
    iget-boolean v0, p0, Lcom/google/common/a/hy;->b:Z

    if-nez v0, :cond_0

    .line 660
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Lcom/google/common/a/hy;->d()I

    move-result v1

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-virtual {p0}, Lcom/google/common/a/hy;->e()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 662
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/common/a/hy;->j:Lcom/google/common/a/ic;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/common/a/bj;

    invoke-direct {v0, p0}, Lcom/google/common/a/bj;-><init>(Lcom/google/common/a/hy;)V

    :goto_1
    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/common/a/ib;

    invoke-direct {v0, p0}, Lcom/google/common/a/ib;-><init>(Lcom/google/common/a/hy;)V

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .prologue
    const-wide/16 v5, -0x1

    const/4 v3, -0x1

    .line 750
    invoke-static {p0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    .line 751
    iget v1, p0, Lcom/google/common/a/hy;->c:I

    if-eq v1, v3, :cond_0

    .line 752
    const-string v1, "initialCapacity"

    iget v2, p0, Lcom/google/common/a/hy;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 754
    :cond_0
    iget v1, p0, Lcom/google/common/a/hy;->d:I

    if-eq v1, v3, :cond_1

    .line 755
    const-string v1, "concurrencyLevel"

    iget v2, p0, Lcom/google/common/a/hy;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 757
    :cond_1
    iget v1, p0, Lcom/google/common/a/hy;->e:I

    if-eq v1, v3, :cond_2

    .line 758
    const-string v1, "maximumSize"

    iget v2, p0, Lcom/google/common/a/hy;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 760
    :cond_2
    iget-wide v1, p0, Lcom/google/common/a/hy;->h:J

    cmp-long v1, v1, v5

    if-eqz v1, :cond_3

    .line 761
    const-string v1, "expireAfterWrite"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/google/common/a/hy;->h:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "ns"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 763
    :cond_3
    iget-wide v1, p0, Lcom/google/common/a/hy;->i:J

    cmp-long v1, v1, v5

    if-eqz v1, :cond_4

    .line 764
    const-string v1, "expireAfterAccess"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/google/common/a/hy;->i:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "ns"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 766
    :cond_4
    iget-object v1, p0, Lcom/google/common/a/hy;->f:Lcom/google/common/a/ct;

    if-eqz v1, :cond_5

    .line 767
    const-string v1, "keyStrength"

    iget-object v2, p0, Lcom/google/common/a/hy;->f:Lcom/google/common/a/ct;

    invoke-virtual {v2}, Lcom/google/common/a/ct;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/base/Ascii;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 769
    :cond_5
    iget-object v1, p0, Lcom/google/common/a/hy;->g:Lcom/google/common/a/ct;

    if-eqz v1, :cond_6

    .line 770
    const-string v1, "valueStrength"

    iget-object v2, p0, Lcom/google/common/a/hy;->g:Lcom/google/common/a/ct;

    invoke-virtual {v2}, Lcom/google/common/a/ct;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/base/Ascii;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 772
    :cond_6
    iget-object v1, p0, Lcom/google/common/a/hy;->k:Lcom/google/common/base/Equivalence;

    if-eqz v1, :cond_7

    .line 773
    const-string v1, "keyEquivalence"

    invoke-virtual {v0, v1}, Lcom/google/common/base/Objects$ToStringHelper;->addValue(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 775
    :cond_7
    iget-object v1, p0, Lcom/google/common/a/hy;->l:Lcom/google/common/base/Equivalence;

    if-eqz v1, :cond_8

    .line 776
    const-string v1, "valueEquivalence"

    invoke-virtual {v0, v1}, Lcom/google/common/base/Objects$ToStringHelper;->addValue(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 778
    :cond_8
    iget-object v1, p0, Lcom/google/common/a/hy;->a:Lcom/google/common/a/ii;

    if-eqz v1, :cond_9

    .line 779
    const-string v1, "removalListener"

    invoke-virtual {v0, v1}, Lcom/google/common/base/Objects$ToStringHelper;->addValue(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    .line 781
    :cond_9
    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
