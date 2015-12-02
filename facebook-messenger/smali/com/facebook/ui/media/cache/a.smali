.class public abstract Lcom/facebook/ui/media/cache/a;
.super Ljava/lang/Object;
.source "DiskCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<KEY:",
        "Lcom/facebook/ui/media/cache/l;",
        "VA",
        "LUE:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation
.end field

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:J

.field private final g:J

.field private h:J

.field private final i:Ljava/lang/Object;

.field private final j:Lcom/facebook/analytics/cache/e;

.field private final k:Ljava/io/FilenameFilter;

.field private final l:Ljava/io/FilenameFilter;

.field private final m:Lcom/facebook/ui/media/cache/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/ui/media/cache/a",
            "<TKEY;TVA",
            "LUE;",
            ">.com/facebook/ui/media/cache/f;"
        }
    .end annotation
.end field

.field private final n:Lcom/google/common/base/Stopwatch;

.field private final o:Lcom/facebook/common/e/h;

.field private final p:Landroid/content/Context;

.field private final q:Lcom/facebook/common/time/a;

.field private final r:Ljava/lang/String;

.field private volatile s:Ljava/io/File;

.field private t:Lcom/facebook/ui/c/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 48
    const-class v0, Lcom/facebook/ui/media/cache/a;

    sput-object v0, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)V
    .locals 2

    .prologue
    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 87
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    .line 109
    iput-object p5, p0, Lcom/facebook/ui/media/cache/a;->q:Lcom/facebook/common/time/a;

    .line 110
    invoke-virtual {p6}, Lcom/facebook/ui/media/cache/m;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->r:Ljava/lang/String;

    .line 111
    invoke-virtual {p6}, Lcom/facebook/ui/media/cache/m;->j()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->f:J

    .line 112
    invoke-virtual {p6}, Lcom/facebook/ui/media/cache/m;->i()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->g:J

    .line 113
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->g:J

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->h:J

    .line 114
    iput-object p3, p0, Lcom/facebook/ui/media/cache/a;->t:Lcom/facebook/ui/c/d;

    .line 115
    invoke-virtual {p6}, Lcom/facebook/ui/media/cache/m;->d()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/media/cache/a;->c:I

    .line 116
    iput-object p1, p0, Lcom/facebook/ui/media/cache/a;->p:Landroid/content/Context;

    .line 117
    iput-object p2, p0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    .line 124
    const-string v0, ".lru"

    .line 125
    iget v0, p0, Lcom/facebook/ui/media/cache/a;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 126
    invoke-virtual {p6}, Lcom/facebook/ui/media/cache/m;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->d:Ljava/lang/String;

    .line 127
    const-string v0, ".lru"

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->e:Ljava/lang/String;

    .line 134
    :goto_0
    new-instance v0, Lcom/google/common/base/Stopwatch;

    invoke-direct {v0}, Lcom/google/common/base/Stopwatch;-><init>()V

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->n:Lcom/google/common/base/Stopwatch;

    .line 136
    new-instance v0, Lcom/facebook/ui/media/cache/f;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/cache/f;-><init>(Lcom/facebook/ui/media/cache/a;)V

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->m:Lcom/facebook/ui/media/cache/f;

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_file"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Lcom/facebook/analytics/cache/h;->a(Ljava/lang/String;)Lcom/facebook/analytics/cache/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    .line 140
    new-instance v0, Lcom/facebook/ui/media/cache/b;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/cache/b;-><init>(Lcom/facebook/ui/media/cache/a;)V

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->k:Ljava/io/FilenameFilter;

    .line 147
    new-instance v0, Lcom/facebook/ui/media/cache/c;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/cache/c;-><init>(Lcom/facebook/ui/media/cache/a;)V

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->l:Ljava/io/FilenameFilter;

    .line 153
    return-void

    .line 129
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p6}, Lcom/facebook/ui/media/cache/m;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/ui/media/cache/a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->d:Ljava/lang/String;

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ".lru_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/ui/media/cache/a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->e:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/ui/media/cache/a;J)J
    .locals 0

    .prologue
    .line 46
    iput-wide p1, p0, Lcom/facebook/ui/media/cache/a;->b:J

    return-wide p1
.end method

.method private a(Ljava/io/File;)J
    .locals 3
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    .line 388
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 390
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->d:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/facebook/ui/media/cache/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 392
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 393
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 394
    const-wide/16 v0, 0x0

    .line 405
    :goto_0
    return-wide v0

    .line 396
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    .line 397
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 398
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    goto :goto_0

    .line 401
    :cond_1
    const-wide/16 v0, -0x1

    goto :goto_0

    .line 404
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 405
    const-wide/16 v0, -0x2

    goto :goto_0
.end method

.method private a(Lcom/facebook/ui/media/cache/l;Ljava/lang/String;)Ljava/io/File;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;",
            "Ljava/lang/String;",
            ")",
            "Ljava/io/File;"
        }
    .end annotation

    .prologue
    .line 724
    invoke-virtual {p1}, Lcom/facebook/ui/media/cache/l;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/i;->b([B)Ljava/lang/String;

    move-result-object v0

    .line 725
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/a;->c()Ljava/io/File;

    move-result-object v1

    .line 726
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v2
.end method

.method private a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .prologue
    .line 781
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 782
    const/4 v1, 0x0

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 783
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method static synthetic a(Lcom/facebook/ui/media/cache/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method private a(J)V
    .locals 12
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    const-wide/16 v3, 0x0

    const/4 v0, 0x0

    .line 514
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->g()[Ljava/io/File;

    move-result-object v7

    .line 517
    new-instance v1, Lcom/facebook/ui/media/cache/d;

    invoke-direct {v1, p0}, Lcom/facebook/ui/media/cache/d;-><init>(Lcom/facebook/ui/media/cache/a;)V

    invoke-static {v7, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    move-wide v1, v3

    move v5, v0

    move v6, v0

    .line 543
    :goto_0
    iget-wide v8, p0, Lcom/facebook/ui/media/cache/a;->b:J

    cmp-long v8, v8, p1

    if-lez v8, :cond_2

    array-length v8, v7

    if-ge v6, v8, :cond_2

    .line 545
    aget-object v8, v7, v6

    invoke-direct {p0, v8}, Lcom/facebook/ui/media/cache/a;->a(Ljava/io/File;)J

    move-result-wide v8

    .line 546
    cmp-long v10, v8, v3

    if-lez v10, :cond_1

    .line 547
    iget-wide v10, p0, Lcom/facebook/ui/media/cache/a;->b:J

    sub-long/2addr v10, v8

    iput-wide v10, p0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 548
    add-int/lit8 v5, v5, 0x1

    .line 549
    add-long/2addr v1, v8

    .line 553
    :cond_0
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 554
    goto :goto_0

    .line 550
    :cond_1
    cmp-long v8, v8, v3

    if-gez v8, :cond_0

    .line 551
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 555
    :cond_2
    iget-object v3, p0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    sget-object v4, Lcom/facebook/analytics/cache/g;->CACHE_FULL:Lcom/facebook/analytics/cache/g;

    invoke-virtual {v3, v4, v5, v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/g;IJ)V

    .line 557
    if-lez v0, :cond_3

    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    if-eqz v1, :cond_3

    .line 558
    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " (unexpected files)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Found and deleted "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "non-cache non-lru files in cache"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    :cond_3
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->k()V

    .line 563
    return-void
.end method

.method private a(Ljava/io/FilenameFilter;)[Ljava/io/File;
    .locals 1

    .prologue
    .line 356
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/a;->c()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/io/File;)J
    .locals 24
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    .line 625
    const-wide/16 v9, 0x0

    .line 626
    const/4 v8, 0x0

    .line 627
    const/4 v7, 0x0

    .line 628
    const/4 v6, 0x0

    .line 629
    const/4 v5, 0x0

    .line 630
    const-wide/16 v3, -0x1

    .line 631
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/ui/media/cache/a;->q:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v11

    .line 632
    const-wide/32 v13, 0x6ddd00

    add-long/2addr v13, v11

    .line 634
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v15

    .line 638
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/ui/media/cache/a;->k:Ljava/io/FilenameFilter;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v16

    .line 640
    const/4 v2, 0x0

    move/from16 v19, v2

    move-wide/from16 v20, v3

    move-wide/from16 v2, v20

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move-wide/from16 v22, v9

    move-wide/from16 v8, v22

    move/from16 v10, v19

    :goto_0
    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v10, v0, :cond_2

    .line 641
    aget-object v17, v16, v10

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->isFile()Z

    move-result v17

    if-eqz v17, :cond_1

    .line 642
    aget-object v17, v16, v10

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->length()J

    move-result-wide v17

    add-long v8, v8, v17

    .line 645
    aget-object v17, v16, v10

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->lastModified()J

    move-result-wide v17

    cmp-long v17, v17, v13

    if-lez v17, :cond_0

    .line 646
    const/4 v6, 0x1

    .line 647
    add-int/lit8 v5, v5, 0x1

    .line 648
    int-to-long v0, v4

    move-wide/from16 v17, v0

    add-long v17, v17, v8

    move-wide/from16 v0, v17

    long-to-int v4, v0

    .line 649
    aget-object v17, v16, v10

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->lastModified()J

    move-result-wide v17

    sub-long v17, v17, v11

    move-wide/from16 v0, v17

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 640
    :cond_0
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 653
    :cond_1
    const/4 v7, 0x1

    goto :goto_1

    .line 656
    :cond_2
    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 658
    if-eqz v7, :cond_3

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    if-eqz v7, :cond_3

    .line 661
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " (sub-directory found)"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "Sub-directory found within cache directory during cache size calculation."

    invoke-interface {v7, v10, v11}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 665
    :cond_3
    if-eqz v6, :cond_4

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    if-eqz v6, :cond_4

    .line 666
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v10, " (future timestamp)"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Future timestamp found in "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v10, " files , with a total size of "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " bytes, and a maximum time delta of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "ms"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v6, v7, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 673
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/ui/media/cache/a;->n:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v2}, Lcom/google/common/base/Stopwatch;->reset()Lcom/google/common/base/Stopwatch;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/base/Stopwatch;->start()Lcom/google/common/base/Stopwatch;

    .line 675
    return-wide v8

    .line 656
    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2
.end method

.method static synthetic b(Lcom/facebook/ui/media/cache/a;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->q:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method private b(J)V
    .locals 4
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    .line 580
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 581
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/a;->c()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/ui/media/cache/a;->b(Ljava/io/File;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 585
    :goto_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/analytics/cache/e;->e(J)V

    .line 586
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->k()V

    .line 587
    return-void

    .line 583
    :cond_0
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/ui/media/cache/a;J)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Lcom/facebook/ui/media/cache/a;->a(J)V

    return-void
.end method

.method static synthetic c(Lcom/facebook/ui/media/cache/a;)J
    .locals 2

    .prologue
    .line 46
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    return-wide v0
.end method

.method static synthetic d(Lcom/facebook/ui/media/cache/a;)[Ljava/io/File;
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->f()[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/ui/media/cache/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    return-object v0
.end method

.method private e()V
    .locals 6
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    .line 339
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->f()[Ljava/io/File;

    move-result-object v1

    .line 341
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 342
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 343
    :try_start_0
    aget-object v3, v1, v0

    iget-object v4, p0, Lcom/facebook/ui/media/cache/a;->e:Ljava/lang/String;

    invoke-direct {p0, v3, v4}, Lcom/facebook/ui/media/cache/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 344
    invoke-virtual {v3}, Ljava/io/File;->exists()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    if-nez v4, :cond_0

    .line 346
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 351
    :cond_0
    :goto_1
    :try_start_2
    monitor-exit v2

    .line 341
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 347
    :catch_0
    move-exception v3

    .line 348
    sget-object v4, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    const-string v5, "IOException creating lru file"

    invoke-static {v4, v5, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 351
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 353
    :cond_1
    return-void
.end method

.method static synthetic f(Lcom/facebook/ui/media/cache/a;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->j()V

    return-void
.end method

.method private f()[Ljava/io/File;
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->k:Ljava/io/FilenameFilter;

    invoke-direct {p0, v0}, Lcom/facebook/ui/media/cache/a;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private g()[Ljava/io/File;
    .locals 1
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    .line 372
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->e()V

    .line 374
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->l:Ljava/io/FilenameFilter;

    invoke-direct {p0, v0}, Lcom/facebook/ui/media/cache/a;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private h()V
    .locals 4
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    .line 468
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->i()V

    .line 472
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    iget-wide v2, p0, Lcom/facebook/ui/media/cache/a;->h:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 473
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 475
    :cond_0
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->j()V

    .line 478
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    iget-wide v2, p0, Lcom/facebook/ui/media/cache/a;->h:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 479
    const-wide/16 v0, 0x9

    iget-wide v2, p0, Lcom/facebook/ui/media/cache/a;->h:J

    mul-long/2addr v0, v2

    const-wide/16 v2, 0xa

    div-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lcom/facebook/ui/media/cache/a;->a(J)V

    .line 481
    :cond_1
    return-void
.end method

.method private i()V
    .locals 5
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    .line 493
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->t:Lcom/facebook/ui/c/d;

    iget-wide v1, p0, Lcom/facebook/ui/media/cache/a;->g:J

    iget-wide v3, p0, Lcom/facebook/ui/media/cache/a;->b:J

    sub-long/2addr v1, v3

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/ui/c/d;->a(JZ)Z

    move-result v0

    .line 495
    if-nez v0, :cond_0

    .line 497
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->g:J

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->h:J

    .line 504
    :goto_0
    return-void

    .line 500
    :cond_0
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->f:J

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->h:J

    .line 502
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->t:Lcom/facebook/ui/c/d;

    iget-wide v1, p0, Lcom/facebook/ui/media/cache/a;->f:J

    iget-wide v3, p0, Lcom/facebook/ui/media/cache/a;->b:J

    sub-long/2addr v1, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/ui/c/d;->a(JZ)Z

    goto :goto_0
.end method

.method private j()V
    .locals 7
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mFileLock"
    .end annotation

    .prologue
    const-wide/16 v4, -0x1

    .line 597
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    cmp-long v0, v0, v4

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->n:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->n:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x1b7740

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 600
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/a;->c()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/ui/media/cache/a;->b(Ljava/io/File;)J

    move-result-wide v0

    .line 603
    iget-wide v2, p0, Lcom/facebook/ui/media/cache/a;->b:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lcom/facebook/ui/media/cache/a;->b:J

    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/32 v4, 0x80000

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    if-eqz v2, :cond_1

    .line 606
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " (mFileCacheSize drift)"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mFileCacheSize mValue of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-wide v5, p0, Lcom/facebook/ui/media/cache/a;->b:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " bytes has drifted from the ground truth "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " bytes by "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-wide v5, p0, Lcom/facebook/ui/media/cache/a;->b:J

    sub-long v5, v0, v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " bytes"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 611
    :cond_1
    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 613
    :cond_2
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->k()V

    .line 614
    return-void
.end method

.method private k()V
    .locals 4

    .prologue
    .line 877
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 878
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    sget-object v2, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/ui/media/cache/a;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 885
    :goto_0
    return-void

    .line 882
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    sget-object v2, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
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
    const/4 v1, 0x0

    .line 284
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 288
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->h()V

    .line 289
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v1

    .line 290
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 291
    new-instance v0, Lcom/facebook/ui/media/cache/e;

    const/4 v3, 0x0

    invoke-direct {v0, p2, v3}, Lcom/facebook/ui/media/cache/e;-><init>(Ljava/io/InputStream;Lcom/facebook/ui/media/cache/b;)V

    invoke-static {v0, v1}, Lcom/google/common/b/f;->a(Lcom/google/common/b/i;Ljava/io/File;)V

    .line 292
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/l;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 300
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/facebook/ui/media/cache/a;->b(J)V

    .line 303
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object v1

    .line 295
    :catch_0
    move-exception v0

    .line 297
    :try_start_2
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 299
    :catchall_0
    move-exception v0

    .line 301
    if-eqz v1, :cond_0

    .line 303
    :try_start_3
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    throw v0

    .line 306
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
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
    const/4 v1, 0x0

    .line 254
    iget-object v3, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v3

    .line 258
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->h()V

    .line 259
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 260
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 261
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;Ljava/io/File;)V

    .line 262
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/l;)Z
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 273
    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/facebook/ui/media/cache/a;->b(J)V

    .line 276
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 279
    :goto_0
    return-object v0

    .line 265
    :catch_0
    move-exception v0

    .line 267
    :goto_1
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 272
    :catchall_0
    move-exception v0

    .line 274
    :goto_2
    if-eqz v1, :cond_0

    .line 276
    :try_start_4
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    throw v0

    .line 280
    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 268
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 270
    :goto_3
    :try_start_5
    sget-object v4, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    const-string v5, "IOException"

    invoke-static {v4, v5, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 274
    if-eqz v2, :cond_1

    .line 276
    :try_start_6
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 279
    :cond_1
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object v0, v1

    goto :goto_0

    .line 272
    :catchall_2
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v1, v2

    goto :goto_2

    .line 268
    :catch_2
    move-exception v2

    move-object v6, v2

    move-object v2, v0

    move-object v0, v6

    goto :goto_3

    .line 265
    :catch_3
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_1
.end method

.method public a(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)TVA",
            "LUE;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 167
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v0

    .line 168
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 169
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 170
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/l;)Z

    .line 172
    :cond_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 176
    invoke-virtual {p0, p1, v0}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/io/File;)Ljava/lang/Object;

    move-result-object v0

    .line 177
    if-eqz v0, :cond_1

    .line 178
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    invoke-virtual {v2}, Lcom/facebook/analytics/cache/e;->b()V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 190
    :goto_0
    return-object v0

    .line 172
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    .line 186
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 188
    goto :goto_0

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    invoke-virtual {v0}, Lcom/facebook/analytics/cache/e;->c()V
    :try_end_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    move-object v0, v1

    .line 185
    goto :goto_0

    .line 189
    :catch_1
    move-exception v0

    move-object v0, v1

    .line 190
    goto :goto_0
.end method

.method protected abstract a(Lcom/facebook/ui/media/cache/l;Ljava/io/File;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;",
            "Ljava/io/File;",
            ")TVA",
            "LUE;"
        }
    .end annotation
.end method

.method public a()V
    .locals 20

    .prologue
    .line 414
    const/4 v6, 0x0

    .line 415
    const/4 v5, 0x0

    .line 416
    const/4 v4, 0x0

    .line 417
    const-wide/16 v2, 0x0

    .line 418
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/ui/media/cache/a;->q:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v7

    .line 420
    invoke-direct/range {p0 .. p0}, Lcom/facebook/ui/media/cache/a;->g()[Ljava/io/File;

    move-result-object v9

    .line 421
    array-length v10, v9

    const/4 v1, 0x0

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move-wide/from16 v1, v18

    move v3, v4

    move v4, v5

    move v5, v6

    move/from16 v6, v17

    :goto_0
    if-ge v6, v10, :cond_3

    aget-object v11, v9, v6

    .line 422
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v12

    .line 426
    :try_start_0
    invoke-virtual {v11}, Ljava/io/File;->lastModified()J

    move-result-wide v13

    sub-long v13, v7, v13

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v13

    const-wide/32 v15, 0x19bfcc00

    cmp-long v13, v13, v15

    if-lez v13, :cond_0

    .line 427
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lcom/facebook/ui/media/cache/a;->a(Ljava/io/File;)J

    move-result-wide v13

    .line 428
    const-wide/16 v15, 0x0

    cmp-long v11, v13, v15

    if-lez v11, :cond_1

    .line 429
    move-object/from16 v0, p0

    iget-wide v15, v0, Lcom/facebook/ui/media/cache/a;->b:J

    sub-long/2addr v15, v13

    move-object/from16 v0, p0

    iput-wide v15, v0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 430
    add-int/lit8 v3, v3, 0x1

    .line 431
    add-long/2addr v1, v13

    .line 438
    :cond_0
    :goto_1
    monitor-exit v12

    .line 421
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 432
    :cond_1
    const-wide/16 v15, -0x1

    cmp-long v11, v13, v15

    if-nez v11, :cond_2

    .line 433
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 434
    :cond_2
    const-wide/16 v15, -0x2

    cmp-long v11, v13, v15

    if-nez v11, :cond_0

    .line 435
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 438
    :catchall_0
    move-exception v1

    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 442
    :cond_3
    if-lez v5, :cond_4

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    if-eqz v6, :cond_4

    .line 443
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " (unable to delete files)"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Could not delete "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v8, " "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v8, "cache files in the cache"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v7, v5}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    :cond_4
    if-lez v4, :cond_5

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    if-eqz v5, :cond_5

    .line 449
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/ui/media/cache/a;->o:Lcom/facebook/common/e/h;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " (unexpected files)"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Found and deleted "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v7, " "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v7, "non-cache non-lru files in cache"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v6, v4}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    :cond_5
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/ui/media/cache/a;->j:Lcom/facebook/analytics/cache/e;

    sget-object v5, Lcom/facebook/analytics/cache/g;->CONTENT_STALE:Lcom/facebook/analytics/cache/g;

    invoke-virtual {v4, v5, v3, v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/g;IJ)V

    .line 456
    invoke-direct/range {p0 .. p0}, Lcom/facebook/ui/media/cache/a;->k()V

    .line 457
    return-void
.end method

.method a(Lcom/facebook/cache/j;)V
    .locals 1

    .prologue
    .line 819
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->m:Lcom/facebook/ui/media/cache/f;

    invoke-virtual {p1, v0}, Lcom/facebook/cache/j;->a(Lcom/facebook/cache/t;)V

    .line 820
    return-void
.end method

.method protected abstract a(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;Ljava/io/File;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;TVA",
            "LUE;",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation
.end method

.method public a(Ljava/lang/String;Lcom/facebook/analytics/cb;)V
    .locals 4

    .prologue
    .line 823
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 824
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_file_cache_size"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/a;->b()J

    move-result-wide v1

    invoke-virtual {p2, v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 826
    :cond_0
    return-void
.end method

.method protected b()J
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 567
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    return-wide v0
.end method

.method public b(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)",
            "Ljava/io/File;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 206
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v0

    .line 207
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 209
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/l;)Z

    .line 210
    monitor-exit v2

    .line 216
    :goto_0
    return-object v0

    .line 212
    :cond_0
    monitor-exit v2

    move-object v0, v1

    .line 214
    goto :goto_0

    .line 212
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 215
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 216
    goto :goto_0
.end method

.method protected c()Ljava/io/File;
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 744
    iget-object v3, p0, Lcom/facebook/ui/media/cache/a;->s:Ljava/io/File;

    .line 745
    if-nez v3, :cond_7

    move v2, v0

    .line 747
    :goto_0
    if-nez v2, :cond_2

    .line 748
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    move v1, v0

    .line 749
    :cond_0
    if-eqz v1, :cond_1

    .line 753
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v3, Lcom/facebook/common/e/h;

    invoke-virtual {v0, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    .line 755
    if-eqz v0, :cond_1

    .line 756
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/facebook/ui/media/cache/a;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " (cache directory)"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Cache directory initialized but later moved."

    invoke-interface {v0, v3, v4}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    move v0, v1

    .line 762
    :cond_2
    if-nez v2, :cond_3

    if-eqz v0, :cond_6

    .line 763
    :cond_3
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->r:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 764
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_4

    .line 765
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 767
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_5

    .line 768
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 771
    :cond_5
    iget-object v1, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 772
    const-wide/16 v2, -0x1

    :try_start_0
    iput-wide v2, p0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 773
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 774
    iput-object v0, p0, Lcom/facebook/ui/media/cache/a;->s:Ljava/io/File;

    .line 777
    :cond_6
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->s:Ljava/io/File;

    return-object v0

    :cond_7
    move v2, v1

    .line 745
    goto :goto_0

    .line 773
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected c(Lcom/facebook/ui/media/cache/l;)Z
    .locals 8
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 688
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->e(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v1

    .line 689
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->q:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 690
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 691
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    sub-long v4, v2, v4

    const-wide/32 v6, 0x1b7740

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    .line 692
    invoke-virtual {v1, v2, v3}, Ljava/io/File;->setLastModified(J)Z

    move-result v0

    .line 708
    :cond_0
    :goto_0
    return v0

    .line 695
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 699
    iget-object v4, p0, Lcom/facebook/ui/media/cache/a;->q:Lcom/facebook/common/time/a;

    instance-of v4, v4, Lcom/facebook/common/time/c;

    if-nez v4, :cond_2

    .line 700
    invoke-virtual {v1, v2, v3}, Ljava/io/File;->setLastModified(J)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 702
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 706
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method d(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)",
            "Ljava/io/File;"
        }
    .end annotation

    .prologue
    .line 714
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->d:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 5

    .prologue
    .line 787
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/a;->c()Ljava/io/File;

    move-result-object v0

    .line 788
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 789
    iget-object v2, p0, Lcom/facebook/ui/media/cache/a;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 790
    if-eqz v1, :cond_0

    .line 791
    :try_start_0
    array-length v3, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v1, v0

    .line 792
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 791
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 795
    :cond_0
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/a;->b:J

    .line 796
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 797
    invoke-direct {p0}, Lcom/facebook/ui/media/cache/a;->k()V

    .line 798
    return-void

    .line 796
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method e(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)",
            "Ljava/io/File;"
        }
    .end annotation

    .prologue
    .line 719
    iget-object v0, p0, Lcom/facebook/ui/media/cache/a;->e:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/l;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public f(Lcom/facebook/ui/media/cache/l;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKEY;)Z"
        }
    .end annotation

    .prologue
    .line 829
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/cache/a;->d(Lcom/facebook/ui/media/cache/l;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method
