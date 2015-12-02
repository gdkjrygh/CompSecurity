.class public Lcom/facebook/common/o/a;
.super Ljava/lang/Object;
.source "ObjectPool.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:Lcom/facebook/common/o/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/o/b",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/common/time/a;

.field private final h:J

.field private i:J

.field private j:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/common/o/a;

    sput-object v0, Lcom/facebook/common/o/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;IIIJLcom/facebook/common/o/b;Lcom/facebook/common/time/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;IIIJ",
            "Lcom/facebook/common/o/b",
            "<TT;>;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput-object p1, p0, Lcom/facebook/common/o/a;->b:Ljava/lang/Class;

    .line 126
    const/4 v0, 0x0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/common/o/a;->c:I

    .line 127
    iget v0, p0, Lcom/facebook/common/o/a;->c:I

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/common/o/a;->d:I

    .line 128
    const/4 v0, 0x1

    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/common/o/a;->e:I

    .line 129
    iput-wide p5, p0, Lcom/facebook/common/o/a;->h:J

    .line 130
    iput-object p7, p0, Lcom/facebook/common/o/a;->f:Lcom/facebook/common/o/b;

    .line 131
    iget-object v0, p0, Lcom/facebook/common/o/a;->f:Lcom/facebook/common/o/b;

    invoke-interface {v0, p0}, Lcom/facebook/common/o/b;->a(Lcom/facebook/common/o/a;)V

    .line 132
    iput-object p8, p0, Lcom/facebook/common/o/a;->g:Lcom/facebook/common/time/a;

    .line 133
    iget-object v0, p0, Lcom/facebook/common/o/a;->b:Ljava/lang/Class;

    iget v1, p0, Lcom/facebook/common/o/a;->c:I

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    .line 134
    return-void
.end method

.method private a(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 229
    move v0, p1

    :goto_0
    iget v1, p0, Lcom/facebook/common/o/a;->k:I

    if-ge v0, v1, :cond_0

    .line 230
    iget-object v1, p0, Lcom/facebook/common/o/a;->f:Lcom/facebook/common/o/b;

    iget-object v2, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-interface {v1, v2}, Lcom/facebook/common/o/b;->c(Ljava/lang/Object;)V

    .line 229
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/o/a;->b:Ljava/lang/Class;

    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 233
    iget-object v1, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    iget-object v2, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    array-length v2, v2

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 234
    iput-object v0, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    .line 235
    iget v0, p0, Lcom/facebook/common/o/a;->k:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/common/o/a;->k:I

    .line 236
    return-void
.end method

.method static synthetic d()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/facebook/common/o/a;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 143
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/facebook/common/o/a;->k:I

    if-lez v0, :cond_0

    .line 144
    iget v0, p0, Lcom/facebook/common/o/a;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/facebook/common/o/a;->k:I

    .line 145
    iget-object v0, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    iget v1, p0, Lcom/facebook/common/o/a;->k:I

    aget-object v0, v0, v1

    .line 146
    iget-object v1, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    iget v2, p0, Lcom/facebook/common/o/a;->k:I

    const/4 v3, 0x0

    aput-object v3, v1, v2

    .line 150
    :goto_0
    iget-object v1, p0, Lcom/facebook/common/o/a;->f:Lcom/facebook/common/o/b;

    invoke-interface {v1, v0}, Lcom/facebook/common/o/b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    monitor-exit p0

    return-object v0

    .line 148
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/o/a;->f:Lcom/facebook/common/o/b;

    invoke-interface {v0}, Lcom/facebook/common/o/b;->a()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 143
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 160
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/common/o/a;->b()V

    .line 162
    iget-object v0, p0, Lcom/facebook/common/o/a;->f:Lcom/facebook/common/o/b;

    invoke-interface {v0, p1}, Lcom/facebook/common/o/b;->b(Ljava/lang/Object;)V

    .line 163
    iget v0, p0, Lcom/facebook/common/o/a;->k:I

    iget v1, p0, Lcom/facebook/common/o/a;->d:I

    if-ge v0, v1, :cond_1

    .line 164
    iget v0, p0, Lcom/facebook/common/o/a;->k:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    array-length v1, v1

    if-le v0, v1, :cond_0

    .line 165
    iget v0, p0, Lcom/facebook/common/o/a;->d:I

    iget-object v1, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    array-length v1, v1

    iget v2, p0, Lcom/facebook/common/o/a;->e:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/common/o/a;->a(I)V

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    iget v1, p0, Lcom/facebook/common/o/a;->k:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/facebook/common/o/a;->k:I

    aput-object p1, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    :goto_0
    monitor-exit p0

    return-void

    .line 169
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/o/a;->f:Lcom/facebook/common/o/b;

    invoke-interface {v0, p1}, Lcom/facebook/common/o/b;->c(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 4

    .prologue
    .line 177
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/facebook/common/o/a;->k:I

    iget v1, p0, Lcom/facebook/common/o/a;->e:I

    mul-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_0

    .line 178
    iget-object v0, p0, Lcom/facebook/common/o/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/common/o/a;->i:J

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/o/a;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/common/o/a;->i:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/facebook/common/o/a;->h:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 181
    invoke-virtual {p0}, Lcom/facebook/common/o/a;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    :cond_1
    monitor-exit p0

    return-void

    .line 177
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 189
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Lcom/facebook/common/o/a;->e:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/facebook/common/o/a;->c:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 190
    iget-object v1, p0, Lcom/facebook/common/o/a;->j:[Ljava/lang/Object;

    array-length v1, v1

    if-eq v0, v1, :cond_0

    .line 191
    invoke-direct {p0, v0}, Lcom/facebook/common/o/a;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    :cond_0
    monitor-exit p0

    return-void

    .line 189
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
