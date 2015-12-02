.class public abstract Lcom/facebook/ui/media/cache/g;
.super Ljava/lang/Object;
.source "MediaCache.java"

# interfaces
.implements Lcom/facebook/analytics/periodicreporters/l;
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<KEY:",
        "Lcom/facebook/ui/media/cache/l;",
        "VA",
        "LUE:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/analytics/periodicreporters/l;",
        "Lcom/facebook/auth/f/b;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
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
.field private final b:Lcom/facebook/common/time/a;

.field private final c:Lcom/facebook/common/e/h;

.field private final d:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<TKEY;",
            "Lcom/facebook/ui/media/cache/g",
            "<TKEY;TVA",
            "LUE;",
            ">.com/facebook/ui/media/cache/i<TKEY;TVA",
            "LUE;",
            ">;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mInMemoryWriteLock for writes to keep in sync with mBytesInMemory"
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<TKEY;TVA",
            "LUE;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<TKEY;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/Object;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Z

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private o:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mInMemoryWriteLock"
    .end annotation
.end field

.field private final p:Lcom/facebook/analytics/cache/e;

.field private final q:Lcom/facebook/analytics/cache/e;

.field private final r:Lcom/facebook/analytics/cache/a;

.field private s:J

.field private final t:Lcom/facebook/analytics/j/a;

.field private final u:Lcom/facebook/cache/a;

.field private final v:Lcom/facebook/cache/j;

.field private final w:Lcom/facebook/ui/media/cache/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/ui/media/cache/a",
            "<TKEY;TVA",
            "LUE;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 70
    const-class v0, Lcom/facebook/ui/media/cache/g;

    sput-object v0, Lcom/facebook/ui/media/cache/g;->a:Ljava/lang/Class;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/analytics/j/a;Lcom/facebook/common/e/h;Lcom/facebook/ui/media/cache/m;Lcom/facebook/analytics/av;Lcom/facebook/cache/j;Ljavax/inject/a;)V
    .locals 9
    .param p9    # Lcom/facebook/cache/j;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/analytics/cache/IsAccessPatternLoggingEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/ui/c/d;",
            "Lcom/facebook/analytics/cache/h;",
            "Lcom/facebook/analytics/j/a;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/ui/media/cache/m;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/cache/j;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->g:Ljava/lang/Object;

    .line 108
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/facebook/ui/media/cache/g;->s:J

    .line 146
    iput-object p2, p0, Lcom/facebook/ui/media/cache/g;->b:Lcom/facebook/common/time/a;

    .line 147
    iput-object p6, p0, Lcom/facebook/ui/media/cache/g;->c:Lcom/facebook/common/e/h;

    .line 148
    invoke-virtual/range {p7 .. p7}, Lcom/facebook/ui/media/cache/m;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->h:Ljava/lang/String;

    .line 149
    invoke-virtual/range {p7 .. p7}, Lcom/facebook/ui/media/cache/m;->c()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->i:Ljava/lang/String;

    .line 150
    invoke-virtual/range {p7 .. p7}, Lcom/facebook/ui/media/cache/m;->h()I

    move-result v2

    iput v2, p0, Lcom/facebook/ui/media/cache/g;->k:I

    .line 151
    invoke-virtual/range {p7 .. p7}, Lcom/facebook/ui/media/cache/m;->g()I

    move-result v2

    iput v2, p0, Lcom/facebook/ui/media/cache/g;->l:I

    .line 152
    invoke-virtual/range {p7 .. p7}, Lcom/facebook/ui/media/cache/m;->e()I

    move-result v2

    iput v2, p0, Lcom/facebook/ui/media/cache/g;->m:I

    .line 153
    invoke-virtual/range {p7 .. p7}, Lcom/facebook/ui/media/cache/m;->f()I

    move-result v2

    iput v2, p0, Lcom/facebook/ui/media/cache/g;->n:I

    .line 154
    invoke-virtual/range {p7 .. p7}, Lcom/facebook/ui/media/cache/m;->k()Z

    move-result v2

    iput-boolean v2, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    .line 155
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->f:Ljava/util/concurrent/ConcurrentMap;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p6

    move-object v5, p3

    move-object v6, p4

    move-object v7, p2

    move-object/from16 v8, p7

    .line 157
    invoke-virtual/range {v2 .. v8}, Lcom/facebook/ui/media/cache/g;->a(Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)Lcom/facebook/ui/media/cache/a;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    .line 165
    iget-boolean v2, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    if-eqz v2, :cond_2

    .line 166
    iget v2, p0, Lcom/facebook/ui/media/cache/g;->l:I

    iget v3, p0, Lcom/facebook/ui/media/cache/g;->k:I

    if-gt v2, v3, :cond_1

    const/4 v2, 0x1

    :goto_0
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 167
    new-instance v2, Lcom/google/common/a/hy;

    invoke-direct {v2}, Lcom/google/common/a/hy;-><init>()V

    const/16 v3, 0x80

    invoke-virtual {v2, v3}, Lcom/google/common/a/hy;->a(I)Lcom/google/common/a/hy;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lcom/google/common/a/hy;->c(I)Lcom/google/common/a/hy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 171
    new-instance v2, Lcom/google/common/a/hy;

    invoke-direct {v2}, Lcom/google/common/a/hy;-><init>()V

    const/16 v3, 0x80

    invoke-virtual {v2, v3}, Lcom/google/common/a/hy;->a(I)Lcom/google/common/a/hy;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lcom/google/common/a/hy;->c(I)Lcom/google/common/a/hy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/hy;->h()Lcom/google/common/a/hy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->e:Ljava/util/concurrent/ConcurrentMap;

    .line 176
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_memory"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Lcom/facebook/analytics/cache/h;->a(Ljava/lang/String;)Lcom/facebook/analytics/cache/e;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_weakmem"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Lcom/facebook/analytics/cache/h;->a(Ljava/lang/String;)Lcom/facebook/analytics/cache/e;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->q:Lcom/facebook/analytics/cache/e;

    .line 178
    new-instance v2, Lcom/facebook/ui/media/cache/j;

    invoke-direct {v2, p0}, Lcom/facebook/ui/media/cache/j;-><init>(Lcom/facebook/ui/media/cache/g;)V

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->u:Lcom/facebook/cache/a;

    .line 187
    :goto_1
    iput-object p5, p0, Lcom/facebook/ui/media/cache/g;->t:Lcom/facebook/analytics/j/a;

    .line 189
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/facebook/ui/media/cache/g;->v:Lcom/facebook/cache/j;

    .line 190
    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->v:Lcom/facebook/cache/j;

    if-eqz v2, :cond_0

    .line 191
    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->v:Lcom/facebook/cache/j;

    invoke-direct {p0, v2}, Lcom/facebook/ui/media/cache/g;->a(Lcom/facebook/cache/j;)V

    .line 194
    :cond_0
    new-instance v2, Lcom/facebook/analytics/cache/a;

    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->i:Ljava/lang/String;

    move-object/from16 v0, p8

    move-object/from16 v1, p10

    invoke-direct {v2, v3, v0, v1}, Lcom/facebook/analytics/cache/a;-><init>(Ljava/lang/String;Lcom/facebook/analytics/av;Ljavax/inject/a;)V

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    .line 196
    return-void

    .line 166
    :cond_1
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 180
    :cond_2
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 181
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->e:Ljava/util/concurrent/ConcurrentMap;

    .line 182
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    .line 183
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->q:Lcom/facebook/analytics/cache/e;

    .line 184
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/ui/media/cache/g;->u:Lcom/facebook/cache/a;

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/ui/media/cache/g;I)I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    return v0
.end method

.method static synthetic a(Lcom/facebook/ui/media/cache/g;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->b:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method private a(Lcom/facebook/cache/j;)V
    .locals 1

    .prologue
    .line 683
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/cache/j;)V

    .line 684
    iget-boolean v0, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    if-eqz v0, :cond_0

    .line 685
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->u:Lcom/facebook/cache/a;

    invoke-virtual {p1, v0}, Lcom/facebook/cache/j;->a(Lcom/facebook/cache/t;)V

    .line 687
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/ui/media/cache/g;)I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    return v0
.end method

.method private b(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;TVA",
            "LUE;",
            ")V"
        }
    .end annotation

    .prologue
    .line 502
    iget-boolean v0, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    if-nez v0, :cond_0

    .line 503
    sget-object v0, Lcom/facebook/ui/media/cache/g;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The in-memory cached for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is disabled."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 549
    :goto_0
    return-void

    .line 506
    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/ui/media/cache/g;->a(Ljava/lang/Object;)I

    move-result v1

    .line 507
    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->g:Ljava/lang/Object;

    monitor-enter v2

    .line 508
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    new-instance v3, Lcom/facebook/ui/media/cache/i;

    invoke-direct {v3, p0, p1, p2, v1}, Lcom/facebook/ui/media/cache/i;-><init>(Lcom/facebook/ui/media/cache/g;Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;I)V

    invoke-interface {v0, p1, v3}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/cache/i;

    .line 513
    if-eqz v0, :cond_1

    .line 514
    iget v3, p0, Lcom/facebook/ui/media/cache/g;->o:I

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->b(Lcom/facebook/ui/media/cache/i;)I

    move-result v0

    sub-int v0, v3, v0

    iput v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    .line 516
    :cond_1
    iget v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    .line 517
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    int-to-long v3, v1

    invoke-virtual {v0, v3, v4}, Lcom/facebook/analytics/cache/e;->e(J)V

    .line 520
    iget v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    iget v1, p0, Lcom/facebook/ui/media/cache/g;->k:I

    if-gt v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    iget v1, p0, Lcom/facebook/ui/media/cache/g;->m:I

    if-le v0, v1, :cond_6

    .line 522
    :cond_2
    sget-object v0, Lcom/facebook/ui/media/cache/g;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cleaning out in memory cache: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v3, p0, Lcom/facebook/ui/media/cache/g;->o:I

    div-int/lit16 v3, v3, 0x400

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " KB with "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " values"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 524
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    .line 526
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/cache/i;

    .line 529
    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->c(Lcom/facebook/ui/media/cache/i;)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lcom/facebook/ui/media/cache/i;->a(Lcom/facebook/ui/media/cache/i;J)J

    goto :goto_1

    .line 547
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 531
    :cond_3
    :try_start_1
    new-instance v0, Lcom/facebook/ui/media/cache/h;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/cache/h;-><init>(Lcom/facebook/ui/media/cache/g;)V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 533
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/cache/i;

    .line 534
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->d(Lcom/facebook/ui/media/cache/i;)Lcom/facebook/ui/media/cache/l;

    move-result-object v4

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->a(Lcom/facebook/ui/media/cache/i;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->d(Lcom/facebook/ui/media/cache/i;)Lcom/facebook/ui/media/cache/l;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    iget v3, p0, Lcom/facebook/ui/media/cache/g;->o:I

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->b(Lcom/facebook/ui/media/cache/i;)I

    move-result v0

    sub-int v0, v3, v0

    iput v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    .line 539
    iget v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    iget v3, p0, Lcom/facebook/ui/media/cache/g;->l:I

    if-ge v0, v3, :cond_4

    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    iget v3, p0, Lcom/facebook/ui/media/cache/g;->n:I

    if-gt v0, v3, :cond_4

    .line 544
    :cond_5
    sget-object v0, Lcom/facebook/ui/media/cache/g;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Finished cleaning out in memory cache: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v3, p0, Lcom/facebook/ui/media/cache/g;->o:I

    div-int/lit16 v3, v3, 0x400

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " KB with "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " values"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 547
    :cond_6
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 548
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/g;->h()V

    goto/16 :goto_0
.end method

.method static synthetic c(Lcom/facebook/ui/media/cache/g;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/ui/media/cache/g;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/ui/media/cache/g;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->e:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/facebook/ui/media/cache/g;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private h()V
    .locals 6

    .prologue
    .line 651
    iget-boolean v0, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 652
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/g;->e()I

    move-result v0

    .line 653
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/g;->f()I

    move-result v1

    .line 654
    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v2

    .line 655
    if-lez v1, :cond_0

    .line 656
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->c:Lcom/facebook/common/e/h;

    iget-object v4, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    sget-object v5, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v4, v5}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v0}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 659
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->c:Lcom/facebook/common/e/h;

    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    sget-object v4, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    :goto_0
    if-lez v2, :cond_1

    .line 670
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->c:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->q:Lcom/facebook/analytics/cache/e;

    sget-object v3, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v3}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 677
    :goto_1
    return-void

    .line 663
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->c:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    sget-object v3, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v3}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;)V

    .line 665
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->c:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    sget-object v3, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v3}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 674
    :cond_1
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->c:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->q:Lcom/facebook/analytics/cache/e;

    sget-object v2, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private i(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)TVA",
            "LUE;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 477
    iget-boolean v0, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    if-nez v0, :cond_0

    .line 478
    sget-object v0, Lcom/facebook/ui/media/cache/g;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The in-memory cached for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is disabled."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    .line 498
    :goto_0
    return-object v0

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/cache/i;

    .line 482
    if-eqz v0, :cond_1

    .line 483
    invoke-virtual {v0}, Lcom/facebook/ui/media/cache/i;->a()V

    .line 484
    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    invoke-virtual {v1}, Lcom/facebook/analytics/cache/e;->b()V

    .line 485
    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->a(Lcom/facebook/ui/media/cache/i;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 487
    :cond_1
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->p:Lcom/facebook/analytics/cache/e;

    invoke-virtual {v0}, Lcom/facebook/analytics/cache/e;->c()V

    .line 490
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 491
    if-eqz v0, :cond_2

    .line 492
    invoke-direct {p0, p1, v0}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;)V

    .line 493
    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->q:Lcom/facebook/analytics/cache/e;

    invoke-virtual {v1}, Lcom/facebook/analytics/cache/e;->b()V

    goto :goto_0

    .line 496
    :cond_2
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->q:Lcom/facebook/analytics/cache/e;

    invoke-virtual {v0}, Lcom/facebook/analytics/cache/e;->c()V

    move-object v0, v1

    .line 498
    goto :goto_0
.end method


# virtual methods
.method protected abstract a(Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVA",
            "LUE;",
            ")I"
        }
    .end annotation
.end method

.method protected abstract a(Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)Lcom/facebook/ui/media/cache/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/ui/c/d;",
            "Lcom/facebook/analytics/cache/h;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/ui/media/cache/m;",
            ")",
            "Lcom/facebook/ui/media/cache/a",
            "<TKEY;TVA",
            "LUE;",
            ">;"
        }
    .end annotation
.end method

.method public a(Lcom/facebook/ui/media/cache/l;Ljava/io/InputStream;)Ljava/io/File;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;",
            "Ljava/io/InputStream;",
            ")",
            "Ljava/io/File;"
        }
    .end annotation

    .prologue
    .line 414
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/io/InputStream;)Ljava/io/File;

    move-result-object v2

    .line 415
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    .line 416
    :goto_0
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->hashCode()I

    move-result v4

    invoke-virtual {v3, v4, v0, v1}, Lcom/facebook/analytics/cache/a;->d(IJ)V

    .line 417
    return-object v2

    .line 415
    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public a(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;)Ljava/io/File;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;TVA",
            "LUE;",
            ")",
            "Ljava/io/File;"
        }
    .end annotation

    .prologue
    .line 387
    invoke-direct {p0, p1, p2}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;)V

    .line 388
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;)Ljava/io/File;

    move-result-object v6

    .line 389
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v4

    .line 390
    :goto_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->hashCode()I

    move-result v1

    invoke-virtual {p0, p2}, Lcom/facebook/ui/media/cache/g;->a(Ljava/lang/Object;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cache/a;->a(IJJ)V

    .line 391
    return-object v6

    .line 389
    :cond_0
    const-wide/16 v4, -0x1

    goto :goto_0
.end method

.method public a(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)TVA",
            "LUE;"
        }
    .end annotation

    .prologue
    .line 229
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/cache/g;->i(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v2

    .line 230
    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lcom/facebook/ui/media/cache/g;->a(Ljava/lang/Object;)I

    move-result v0

    int-to-long v0, v0

    .line 231
    :goto_0
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->hashCode()I

    move-result v4

    invoke-virtual {v3, v4, v0, v1}, Lcom/facebook/analytics/cache/a;->b(IJ)V

    .line 232
    return-object v2

    .line 230
    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public a(Lcom/facebook/ui/media/cache/l;Ljava/io/File;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;",
            "Ljava/io/File;",
            ")TVA",
            "LUE;"
        }
    .end annotation

    .prologue
    .line 578
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/io/File;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(JLjava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation

    .prologue
    .line 213
    iput-wide p1, p0, Lcom/facebook/ui/media/cache/g;->s:J

    .line 214
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "media_cache_size"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 215
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_memory_cache_size"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/g;->e()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 216
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_memory_cache_count"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/g;->f()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 217
    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->i:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/ui/media/cache/a;->a(Ljava/lang/String;Lcom/facebook/analytics/cb;)V

    .line 218
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0}, Lcom/facebook/ui/media/cache/a;->a()V

    .line 440
    return-void
.end method

.method public a(Lcom/facebook/ui/media/cache/l;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;J)V"
        }
    .end annotation

    .prologue
    .line 430
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->f:Ljava/util/concurrent/ConcurrentMap;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->b:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    return-void
.end method

.method public a(J)Z
    .locals 4

    .prologue
    .line 208
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/g;->s:J

    sub-long v0, p1, v0

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 455
    iget-boolean v0, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    if-nez v0, :cond_0

    .line 464
    :goto_0
    return-void

    .line 458
    :cond_0
    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 459
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 460
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 461
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    .line 462
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 463
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/g;->h()V

    goto :goto_0

    .line 462
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b(Lcom/facebook/ui/media/cache/l;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 249
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/g;->c(Lcom/facebook/ui/media/cache/l;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v1, p1}, Lcom/facebook/ui/media/cache/a;->f(Lcom/facebook/ui/media/cache/l;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 251
    :cond_1
    :goto_0
    return v0

    .line 250
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 467
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/g;->b()V

    .line 468
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0}, Lcom/facebook/ui/media/cache/a;->d()V

    .line 469
    return-void
.end method

.method c(Lcom/facebook/ui/media/cache/l;)Z
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)Z"
        }
    .end annotation

    .prologue
    .line 257
    iget-boolean v0, p0, Lcom/facebook/ui/media/cache/g;->j:Z

    if-nez v0, :cond_0

    .line 258
    const/4 v0, 0x0

    .line 260
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public d(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)TVA",
            "LUE;"
        }
    .end annotation

    .prologue
    .line 282
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/cache/g;->i(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    .line 283
    if-eqz v0, :cond_0

    .line 284
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/g;->h(Lcom/facebook/ui/media/cache/l;)Z

    .line 285
    iget-object v1, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->hashCode()I

    move-result v2

    invoke-virtual {p0, v0}, Lcom/facebook/ui/media/cache/g;->a(Ljava/lang/Object;)I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/analytics/cache/a;->a(IJ)V

    .line 297
    :goto_0
    return-object v0

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v2

    .line 291
    const-wide/16 v0, -0x1

    .line 292
    if-eqz v2, :cond_1

    .line 293
    invoke-virtual {p0, v2}, Lcom/facebook/ui/media/cache/g;->a(Ljava/lang/Object;)I

    move-result v0

    int-to-long v0, v0

    .line 294
    invoke-direct {p0, p1, v2}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;)V

    .line 296
    :cond_1
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->hashCode()I

    move-result v4

    invoke-virtual {v3, v4, v0, v1}, Lcom/facebook/analytics/cache/a;->a(IJ)V

    move-object v0, v2

    .line 297
    goto :goto_0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 473
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/g;->c()V

    .line 474
    return-void
.end method

.method public e()I
    .locals 1

    .prologue
    .line 557
    iget v0, p0, Lcom/facebook/ui/media/cache/g;->o:I

    return v0
.end method

.method public e(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)",
            "Ljava/io/File;"
        }
    .end annotation

    .prologue
    .line 311
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/cache/a;->b(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v2

    .line 312
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    .line 313
    :goto_0
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->hashCode()I

    move-result v4

    invoke-virtual {v3, v4, v0, v1}, Lcom/facebook/analytics/cache/a;->c(IJ)V

    .line 314
    return-object v2

    .line 312
    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 566
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    goto :goto_0
.end method

.method public f(Lcom/facebook/ui/media/cache/l;)Landroid/net/Uri;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)",
            "Landroid/net/Uri;"
        }
    .end annotation

    .prologue
    .line 326
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/cache/a;->b(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v2

    .line 327
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    .line 328
    :goto_0
    iget-object v3, p0, Lcom/facebook/ui/media/cache/g;->r:Lcom/facebook/analytics/cache/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->hashCode()I

    move-result v4

    invoke-virtual {v3, v4, v0, v1}, Lcom/facebook/analytics/cache/a;->c(IJ)V

    .line 329
    if-eqz v2, :cond_1

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    :goto_1
    return-object v0

    .line 327
    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0

    .line 329
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public g(Lcom/facebook/ui/media/cache/l;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)Z"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 364
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 365
    if-nez v0, :cond_0

    move v0, v1

    .line 373
    :goto_0
    return v0

    .line 368
    :cond_0
    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->b:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    .line 369
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->t:Lcom/facebook/analytics/j/a;

    invoke-virtual {v0}, Lcom/facebook/analytics/j/a;->e()V

    .line 370
    const/4 v0, 0x1

    goto :goto_0

    .line 372
    :cond_1
    iget-object v2, p0, Lcom/facebook/ui/media/cache/g;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v0, v1

    .line 373
    goto :goto_0
.end method

.method protected h(Lcom/facebook/ui/media/cache/l;)Z
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)Z"
        }
    .end annotation

    .prologue
    .line 451
    iget-object v0, p0, Lcom/facebook/ui/media/cache/g;->w:Lcom/facebook/ui/media/cache/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/l;)Z

    move-result v0

    return v0
.end method
