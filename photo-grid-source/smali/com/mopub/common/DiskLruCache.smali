.class public final Lcom/mopub/common/DiskLruCache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field static final a:Ljava/util/regex/Pattern;

.field private static final p:Ljava/io/OutputStream;


# instance fields
.field final b:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final c:Ljava/io/File;

.field private final d:Ljava/io/File;

.field private final e:Ljava/io/File;

.field private final f:Ljava/io/File;

.field private final g:I

.field private h:J

.field private final i:I

.field private j:J

.field private k:Ljava/io/Writer;

.field private final l:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/mopub/common/g;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:J

.field private final o:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 97
    const-string v0, "[a-z0-9_-]{1,64}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/mopub/common/DiskLruCache;->a:Ljava/util/regex/Pattern;

    .line 715
    new-instance v0, Lcom/mopub/common/e;

    invoke-direct {v0}, Lcom/mopub/common/e;-><init>()V

    sput-object v0, Lcom/mopub/common/DiskLruCache;->p:Ljava/io/OutputStream;

    return-void
.end method

.method private constructor <init>(Ljava/io/File;IIJ)V
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput-wide v4, p0, Lcom/mopub/common/DiskLruCache;->j:J

    .line 152
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {v0, v2, v1, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    .line 161
    iput-wide v4, p0, Lcom/mopub/common/DiskLruCache;->n:J

    .line 164
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/mopub/common/DiskLruCache;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 166
    new-instance v0, Lcom/mopub/common/d;

    invoke-direct {v0, p0}, Lcom/mopub/common/d;-><init>(Lcom/mopub/common/DiskLruCache;)V

    iput-object v0, p0, Lcom/mopub/common/DiskLruCache;->o:Ljava/util/concurrent/Callable;

    .line 183
    iput-object p1, p0, Lcom/mopub/common/DiskLruCache;->c:Ljava/io/File;

    .line 184
    iput p2, p0, Lcom/mopub/common/DiskLruCache;->g:I

    .line 185
    new-instance v0, Ljava/io/File;

    const-string v1, "journal"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    .line 186
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.tmp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mopub/common/DiskLruCache;->e:Ljava/io/File;

    .line 187
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mopub/common/DiskLruCache;->f:Ljava/io/File;

    .line 188
    iput p3, p0, Lcom/mopub/common/DiskLruCache;->i:I

    .line 189
    iput-wide p4, p0, Lcom/mopub/common/DiskLruCache;->h:J

    .line 190
    return-void
.end method

.method static synthetic a(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;J)Lcom/mopub/common/DiskLruCache$Editor;
    .locals 2

    .prologue
    .line 90
    invoke-direct {p0, p1, p2, p3}, Lcom/mopub/common/DiskLruCache;->a(Ljava/lang/String;J)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized a(Ljava/lang/String;J)Lcom/mopub/common/DiskLruCache$Editor;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 456
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->f()V

    .line 457
    invoke-static {p1}, Lcom/mopub/common/DiskLruCache;->a(Ljava/lang/String;)V

    .line 458
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/g;

    .line 459
    const-wide/16 v2, -0x1

    cmp-long v2, p2, v2

    if-eqz v2, :cond_1

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/mopub/common/g;->f(Lcom/mopub/common/g;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    cmp-long v2, v2, p2

    if-eqz v2, :cond_1

    :cond_0
    move-object v0, v1

    .line 476
    :goto_0
    monitor-exit p0

    return-object v0

    .line 463
    :cond_1
    if-nez v0, :cond_2

    .line 464
    :try_start_1
    new-instance v0, Lcom/mopub/common/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/mopub/common/g;-><init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;B)V

    .line 465
    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    .line 470
    :goto_1
    new-instance v0, Lcom/mopub/common/DiskLruCache$Editor;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/mopub/common/DiskLruCache$Editor;-><init>(Lcom/mopub/common/DiskLruCache;Lcom/mopub/common/g;B)V

    .line 471
    invoke-static {v1, v0}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;Lcom/mopub/common/DiskLruCache$Editor;)Lcom/mopub/common/DiskLruCache$Editor;

    .line 474
    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DIRTY "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 475
    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    invoke-virtual {v1}, Ljava/io/Writer;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 456
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 466
    :cond_2
    :try_start_2
    invoke-static {v0}, Lcom/mopub/common/g;->b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_3

    move-object v0, v1

    .line 467
    goto :goto_0

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method

.method static synthetic a()Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 90
    sget-object v0, Lcom/mopub/common/DiskLruCache;->p:Ljava/io/OutputStream;

    return-object v0
.end method

.method static synthetic a(Lcom/mopub/common/DiskLruCache;)Ljava/io/Writer;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1667
    new-instance v0, Ljava/io/InputStreamReader;

    sget-object v1, Lcom/mopub/common/DiskLruCacheUtil;->b:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-static {v0}, Lcom/mopub/common/DiskLruCacheUtil;->a(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0

    .line 90
    return-object v0
.end method

.method private declared-synchronized a(Lcom/mopub/common/DiskLruCache$Editor;Z)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 511
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/mopub/common/DiskLruCache$Editor;->a(Lcom/mopub/common/DiskLruCache$Editor;)Lcom/mopub/common/g;

    move-result-object v2

    .line 512
    invoke-static {v2}, Lcom/mopub/common/g;->b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 513
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 511
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 517
    :cond_0
    if-eqz p2, :cond_4

    :try_start_1
    invoke-static {v2}, Lcom/mopub/common/g;->e(Lcom/mopub/common/g;)Z

    move-result v1

    if-nez v1, :cond_4

    move v1, v0

    .line 518
    :goto_0
    iget v3, p0, Lcom/mopub/common/DiskLruCache;->i:I

    if-ge v1, v3, :cond_4

    .line 519
    invoke-static {p1}, Lcom/mopub/common/DiskLruCache$Editor;->b(Lcom/mopub/common/DiskLruCache$Editor;)[Z

    move-result-object v3

    aget-boolean v3, v3, v1

    if-nez v3, :cond_1

    .line 520
    invoke-virtual {p1}, Lcom/mopub/common/DiskLruCache$Editor;->abort()V

    .line 521
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Newly created entry didn\'t create value for index "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 523
    :cond_1
    invoke-virtual {v2, v1}, Lcom/mopub/common/g;->getDirtyFile(I)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_3

    .line 524
    invoke-virtual {p1}, Lcom/mopub/common/DiskLruCache$Editor;->abort()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 563
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    .line 518
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 530
    :cond_4
    :goto_2
    :try_start_2
    iget v1, p0, Lcom/mopub/common/DiskLruCache;->i:I

    if-ge v0, v1, :cond_7

    .line 531
    invoke-virtual {v2, v0}, Lcom/mopub/common/g;->getDirtyFile(I)Ljava/io/File;

    move-result-object v1

    .line 532
    if-eqz p2, :cond_6

    .line 533
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 534
    invoke-virtual {v2, v0}, Lcom/mopub/common/g;->getCleanFile(I)Ljava/io/File;

    move-result-object v3

    .line 535
    invoke-virtual {v1, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 536
    invoke-static {v2}, Lcom/mopub/common/g;->c(Lcom/mopub/common/g;)[J

    move-result-object v1

    aget-wide v4, v1, v0

    .line 537
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 538
    invoke-static {v2}, Lcom/mopub/common/g;->c(Lcom/mopub/common/g;)[J

    move-result-object v1

    aput-wide v6, v1, v0

    .line 539
    iget-wide v8, p0, Lcom/mopub/common/DiskLruCache;->j:J

    sub-long v4, v8, v4

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/mopub/common/DiskLruCache;->j:J

    .line 530
    :cond_5
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 542
    :cond_6
    invoke-static {v1}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;)V

    goto :goto_3

    .line 546
    :cond_7
    iget v0, p0, Lcom/mopub/common/DiskLruCache;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mopub/common/DiskLruCache;->m:I

    .line 547
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;Lcom/mopub/common/DiskLruCache$Editor;)Lcom/mopub/common/DiskLruCache$Editor;

    .line 548
    invoke-static {v2}, Lcom/mopub/common/g;->e(Lcom/mopub/common/g;)Z

    move-result v0

    or-int/2addr v0, p2

    if-eqz v0, :cond_a

    .line 549
    invoke-static {v2}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;)Z

    .line 550
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "CLEAN "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/mopub/common/g;->d(Lcom/mopub/common/g;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v2}, Lcom/mopub/common/g;->getLengths()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 551
    if-eqz p2, :cond_8

    .line 552
    iget-wide v0, p0, Lcom/mopub/common/DiskLruCache;->n:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v0

    iput-wide v4, p0, Lcom/mopub/common/DiskLruCache;->n:J

    invoke-static {v2, v0, v1}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;J)J

    .line 558
    :cond_8
    :goto_4
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 560
    iget-wide v0, p0, Lcom/mopub/common/DiskLruCache;->j:J

    iget-wide v2, p0, Lcom/mopub/common/DiskLruCache;->h:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_9

    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 561
    :cond_9
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->o:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto/16 :goto_1

    .line 555
    :cond_a
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Lcom/mopub/common/g;->d(Lcom/mopub/common/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "REMOVE "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/mopub/common/g;->d(Lcom/mopub/common/g;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4
.end method

.method static synthetic a(Lcom/mopub/common/DiskLruCache;Lcom/mopub/common/DiskLruCache$Editor;Z)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Lcom/mopub/common/DiskLruCache;->a(Lcom/mopub/common/DiskLruCache$Editor;Z)V

    return-void
.end method

.method private static a(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 387
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 388
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 390
    :cond_0
    return-void
.end method

.method private static a(Ljava/io/File;Ljava/io/File;Z)V
    .locals 1

    .prologue
    .line 393
    if-eqz p2, :cond_0

    .line 394
    invoke-static {p1}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;)V

    .line 396
    :cond_0
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 397
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 399
    :cond_1
    return-void
.end method

.method private static a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 660
    sget-object v0, Lcom/mopub/common/DiskLruCache;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 661
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 662
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "keys must match regex [a-z0-9_-]{1,64}: \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 664
    :cond_0
    return-void
.end method

.method private b()V
    .locals 10

    .prologue
    const/4 v9, 0x5

    const/4 v0, 0x0

    const/4 v8, -0x1

    .line 250
    new-instance v3, Lcom/mopub/common/h;

    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object v2, Lcom/mopub/common/DiskLruCacheUtil;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, v1, v2}, Lcom/mopub/common/h;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 252
    :try_start_0
    invoke-virtual {v3}, Lcom/mopub/common/h;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 253
    invoke-virtual {v3}, Lcom/mopub/common/h;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 254
    invoke-virtual {v3}, Lcom/mopub/common/h;->readLine()Ljava/lang/String;

    move-result-object v4

    .line 255
    invoke-virtual {v3}, Lcom/mopub/common/h;->readLine()Ljava/lang/String;

    move-result-object v5

    .line 256
    invoke-virtual {v3}, Lcom/mopub/common/h;->readLine()Ljava/lang/String;

    move-result-object v6

    .line 257
    const-string v7, "libcore.io.DiskLruCache"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "1"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget v7, p0, Lcom/mopub/common/DiskLruCache;->g:I

    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget v4, p0, Lcom/mopub/common/DiskLruCache;->i:I

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, ""

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 262
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "unexpected journal header: ["

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ", "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    :catchall_0
    move-exception v0

    invoke-static {v3}, Lcom/mopub/common/DiskLruCacheUtil;->a(Ljava/io/Closeable;)V

    throw v0

    :cond_1
    move v1, v0

    .line 269
    :goto_0
    :try_start_1
    invoke-virtual {v3}, Lcom/mopub/common/h;->readLine()Ljava/lang/String;

    move-result-object v4

    .line 1282
    const/16 v0, 0x20

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    .line 1283
    if-ne v5, v8, :cond_2

    .line 1284
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "unexpected journal line: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 275
    :catch_0
    move-exception v0

    :try_start_2
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Lcom/mopub/common/DiskLruCache;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 277
    invoke-static {v3}, Lcom/mopub/common/DiskLruCacheUtil;->a(Ljava/io/Closeable;)V

    .line 278
    return-void

    .line 1287
    :cond_2
    add-int/lit8 v0, v5, 0x1

    .line 1288
    const/16 v2, 0x20

    :try_start_3
    invoke-virtual {v4, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    .line 1290
    if-ne v6, v8, :cond_4

    .line 1291
    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 1292
    const/4 v2, 0x6

    if-ne v5, v2, :cond_9

    const-string v2, "REMOVE"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1293
    iget-object v2, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    :cond_3
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 273
    goto :goto_0

    .line 1297
    :cond_4
    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 1300
    :goto_2
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/g;

    .line 1301
    if-nez v0, :cond_5

    .line 1302
    new-instance v0, Lcom/mopub/common/g;

    const/4 v7, 0x0

    invoke-direct {v0, p0, v2, v7}, Lcom/mopub/common/g;-><init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;B)V

    .line 1303
    iget-object v7, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1306
    :cond_5
    if-eq v6, v8, :cond_6

    if-ne v5, v9, :cond_6

    const-string v2, "CLEAN"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 1307
    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 1308
    invoke-static {v0}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;)Z

    .line 1309
    const/4 v4, 0x0

    invoke-static {v0, v4}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;Lcom/mopub/common/DiskLruCache$Editor;)Lcom/mopub/common/DiskLruCache$Editor;

    .line 1310
    invoke-static {v0, v2}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;[Ljava/lang/String;)V

    goto :goto_1

    .line 1311
    :cond_6
    if-ne v6, v8, :cond_7

    if-ne v5, v9, :cond_7

    const-string v2, "DIRTY"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1312
    new-instance v2, Lcom/mopub/common/DiskLruCache$Editor;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v0, v4}, Lcom/mopub/common/DiskLruCache$Editor;-><init>(Lcom/mopub/common/DiskLruCache;Lcom/mopub/common/g;B)V

    invoke-static {v0, v2}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;Lcom/mopub/common/DiskLruCache$Editor;)Lcom/mopub/common/DiskLruCache$Editor;

    goto :goto_1

    .line 1313
    :cond_7
    if-ne v6, v8, :cond_8

    const/4 v0, 0x4

    if-ne v5, v0, :cond_8

    const-string v0, "READ"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1316
    :cond_8
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "unexpected journal line: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_9
    move-object v2, v0

    goto :goto_2
.end method

.method static synthetic b(Lcom/mopub/common/DiskLruCache;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->g()V

    return-void
.end method

.method private c()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 325
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->e:Ljava/io/File;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;)V

    .line 326
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 327
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/g;

    .line 328
    invoke-static {v0}, Lcom/mopub/common/g;->b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v2

    .line 329
    :goto_1
    iget v4, p0, Lcom/mopub/common/DiskLruCache;->i:I

    if-ge v1, v4, :cond_0

    .line 330
    iget-wide v4, p0, Lcom/mopub/common/DiskLruCache;->j:J

    invoke-static {v0}, Lcom/mopub/common/g;->c(Lcom/mopub/common/g;)[J

    move-result-object v6

    aget-wide v6, v6, v1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/mopub/common/DiskLruCache;->j:J

    .line 329
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 333
    :cond_1
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mopub/common/g;->a(Lcom/mopub/common/g;Lcom/mopub/common/DiskLruCache$Editor;)Lcom/mopub/common/DiskLruCache$Editor;

    move v1, v2

    .line 334
    :goto_2
    iget v4, p0, Lcom/mopub/common/DiskLruCache;->i:I

    if-ge v1, v4, :cond_2

    .line 335
    invoke-virtual {v0, v1}, Lcom/mopub/common/g;->getCleanFile(I)Ljava/io/File;

    move-result-object v4

    invoke-static {v4}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;)V

    .line 336
    invoke-virtual {v0, v1}, Lcom/mopub/common/g;->getDirtyFile(I)Ljava/io/File;

    move-result-object v4

    invoke-static {v4}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;)V

    .line 334
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 338
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 341
    :cond_3
    return-void
.end method

.method static synthetic c(Lcom/mopub/common/DiskLruCache;)Z
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->e()Z

    move-result v0

    return v0
.end method

.method private declared-synchronized d()V
    .locals 5

    .prologue
    .line 348
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 352
    :cond_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/mopub/common/DiskLruCache;->e:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v3, Lcom/mopub/common/DiskLruCacheUtil;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 355
    :try_start_1
    const-string v0, "libcore.io.DiskLruCache"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 356
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 357
    const-string v0, "1"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 358
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 359
    iget v0, p0, Lcom/mopub/common/DiskLruCache;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 360
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 361
    iget v0, p0, Lcom/mopub/common/DiskLruCache;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 362
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 363
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/g;

    .line 366
    invoke-static {v0}, Lcom/mopub/common/g;->b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 367
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DIRTY "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mopub/common/g;->d(Lcom/mopub/common/g;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 373
    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 348
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 369
    :cond_1
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CLEAN "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mopub/common/g;->d(Lcom/mopub/common/g;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/mopub/common/g;->getLengths()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 373
    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    .line 376
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 377
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->f:Ljava/io/File;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;Ljava/io/File;Z)V

    .line 379
    :cond_3
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->e:Ljava/io/File;

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;Ljava/io/File;Z)V

    .line 380
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 382
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    sget-object v3, Lcom/mopub/common/DiskLruCacheUtil;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 384
    monitor-exit p0

    return-void
.end method

.method static synthetic d(Lcom/mopub/common/DiskLruCache;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->d()V

    return-void
.end method

.method static synthetic e(Lcom/mopub/common/DiskLruCache;)I
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lcom/mopub/common/DiskLruCache;->m:I

    return v0
.end method

.method private e()Z
    .locals 2

    .prologue
    .line 571
    iget v0, p0, Lcom/mopub/common/DiskLruCache;->m:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/mopub/common/DiskLruCache;->m:I

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic f(Lcom/mopub/common/DiskLruCache;)I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/mopub/common/DiskLruCache;->i:I

    return v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 615
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    if-nez v0, :cond_0

    .line 616
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 618
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/mopub/common/DiskLruCache;)Ljava/io/File;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->c:Ljava/io/File;

    return-object v0
.end method

.method private g()V
    .locals 4

    .prologue
    .line 643
    :goto_0
    iget-wide v0, p0, Lcom/mopub/common/DiskLruCache;->j:J

    iget-wide v2, p0, Lcom/mopub/common/DiskLruCache;->h:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 644
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 645
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/mopub/common/DiskLruCache;->remove(Ljava/lang/String;)Z

    goto :goto_0

    .line 647
    :cond_0
    return-void
.end method

.method public static open(Ljava/io/File;IIJ)Lcom/mopub/common/DiskLruCache;
    .locals 7

    .prologue
    .line 203
    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-gtz v0, :cond_0

    .line 204
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxSize <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 206
    :cond_0
    if-gtz p2, :cond_1

    .line 207
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "valueCount <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 211
    :cond_1
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 212
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 213
    new-instance v1, Ljava/io/File;

    const-string v2, "journal"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 215
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 216
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 223
    :cond_2
    :goto_0
    new-instance v0, Lcom/mopub/common/DiskLruCache;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/mopub/common/DiskLruCache;-><init>(Ljava/io/File;IIJ)V

    .line 224
    iget-object v1, v0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 226
    :try_start_0
    invoke-direct {v0}, Lcom/mopub/common/DiskLruCache;->b()V

    .line 227
    invoke-direct {v0}, Lcom/mopub/common/DiskLruCache;->c()V

    .line 228
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    new-instance v3, Ljava/io/FileOutputStream;

    iget-object v4, v0, Lcom/mopub/common/DiskLruCache;->d:Ljava/io/File;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    sget-object v4, Lcom/mopub/common/DiskLruCacheUtil;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v1, v0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 246
    :goto_1
    return-object v0

    .line 218
    :cond_3
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/mopub/common/DiskLruCache;->a(Ljava/io/File;Ljava/io/File;Z)V

    goto :goto_0

    .line 231
    :catch_0
    move-exception v1

    .line 232
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DiskLruCache "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " is corrupt: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", removing"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 238
    invoke-virtual {v0}, Lcom/mopub/common/DiskLruCache;->delete()V

    .line 243
    :cond_4
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 244
    new-instance v0, Lcom/mopub/common/DiskLruCache;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/mopub/common/DiskLruCache;-><init>(Ljava/io/File;IIJ)V

    .line 245
    invoke-direct {v0}, Lcom/mopub/common/DiskLruCache;->d()V

    goto :goto_1
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    .prologue
    .line 629
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 640
    :goto_0
    monitor-exit p0

    return-void

    .line 632
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/g;

    .line 633
    invoke-static {v0}, Lcom/mopub/common/g;->b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 634
    invoke-static {v0}, Lcom/mopub/common/g;->b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/common/DiskLruCache$Editor;->abort()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 629
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 637
    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->g()V

    .line 638
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 639
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public final delete()V
    .locals 1

    .prologue
    .line 655
    invoke-virtual {p0}, Lcom/mopub/common/DiskLruCache;->close()V

    .line 656
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->c:Ljava/io/File;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCacheUtil;->a(Ljava/io/File;)V

    .line 657
    return-void
.end method

.method public final edit(Ljava/lang/String;)Lcom/mopub/common/DiskLruCache$Editor;
    .locals 2

    .prologue
    .line 452
    const-wide/16 v0, -0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/mopub/common/DiskLruCache;->a(Ljava/lang/String;J)Lcom/mopub/common/DiskLruCache$Editor;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .prologue
    .line 622
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->f()V

    .line 623
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->g()V

    .line 624
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 625
    monitor-exit p0

    return-void

    .line 622
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized get(Ljava/lang/String;)Lcom/mopub/common/DiskLruCache$Snapshot;
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 407
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->f()V

    .line 408
    invoke-static {p1}, Lcom/mopub/common/DiskLruCache;->a(Ljava/lang/String;)V

    .line 409
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 410
    if-nez v0, :cond_1

    .line 444
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    .line 414
    :cond_1
    :try_start_1
    invoke-static {v0}, Lcom/mopub/common/g;->e(Lcom/mopub/common/g;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 421
    iget v3, p0, Lcom/mopub/common/DiskLruCache;->i:I

    new-array v6, v3, [Ljava/io/InputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v3, v2

    .line 423
    :goto_1
    :try_start_2
    iget v4, p0, Lcom/mopub/common/DiskLruCache;->i:I

    if-ge v3, v4, :cond_2

    .line 424
    new-instance v4, Ljava/io/FileInputStream;

    invoke-virtual {v0, v3}, Lcom/mopub/common/g;->getCleanFile(I)Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    aput-object v4, v6, v3
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 423
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 428
    :catch_0
    move-exception v0

    move v0, v2

    :goto_2
    :try_start_3
    iget v2, p0, Lcom/mopub/common/DiskLruCache;->i:I

    if-ge v0, v2, :cond_0

    .line 429
    aget-object v2, v6, v0

    if-eqz v2, :cond_0

    .line 430
    aget-object v2, v6, v0

    invoke-static {v2}, Lcom/mopub/common/DiskLruCacheUtil;->a(Ljava/io/Closeable;)V

    .line 428
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 438
    :cond_2
    iget v1, p0, Lcom/mopub/common/DiskLruCache;->m:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mopub/common/DiskLruCache;->m:I

    .line 439
    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "READ "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 440
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 441
    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v2, p0, Lcom/mopub/common/DiskLruCache;->o:Ljava/util/concurrent/Callable;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 444
    :cond_3
    new-instance v1, Lcom/mopub/common/DiskLruCache$Snapshot;

    invoke-static {v0}, Lcom/mopub/common/g;->f(Lcom/mopub/common/g;)J

    move-result-wide v4

    invoke-static {v0}, Lcom/mopub/common/g;->c(Lcom/mopub/common/g;)[J

    move-result-object v7

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/mopub/common/DiskLruCache$Snapshot;-><init>(Lcom/mopub/common/DiskLruCache;Ljava/lang/String;J[Ljava/io/InputStream;[JB)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 407
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getDirectory()Ljava/io/File;
    .locals 1

    .prologue
    .line 481
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->c:Ljava/io/File;

    return-object v0
.end method

.method public final declared-synchronized getMaxSize()J
    .locals 2

    .prologue
    .line 489
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/mopub/common/DiskLruCache;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized isClosed()Z
    .locals 1

    .prologue
    .line 611
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized remove(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 582
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->f()V

    .line 583
    invoke-static {p1}, Lcom/mopub/common/DiskLruCache;->a(Ljava/lang/String;)V

    .line 584
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/g;

    .line 585
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/mopub/common/g;->b(Lcom/mopub/common/g;)Lcom/mopub/common/DiskLruCache$Editor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_2

    :cond_0
    move v0, v1

    .line 606
    :goto_0
    monitor-exit p0

    return v0

    .line 594
    :cond_1
    :try_start_1
    iget-wide v2, p0, Lcom/mopub/common/DiskLruCache;->j:J

    invoke-static {v0}, Lcom/mopub/common/g;->c(Lcom/mopub/common/g;)[J

    move-result-object v4

    aget-wide v4, v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/mopub/common/DiskLruCache;->j:J

    .line 595
    invoke-static {v0}, Lcom/mopub/common/g;->c(Lcom/mopub/common/g;)[J

    move-result-object v2

    const-wide/16 v4, 0x0

    aput-wide v4, v2, v1

    .line 589
    add-int/lit8 v1, v1, 0x1

    :cond_2
    iget v2, p0, Lcom/mopub/common/DiskLruCache;->i:I

    if-ge v1, v2, :cond_3

    .line 590
    invoke-virtual {v0, v1}, Lcom/mopub/common/g;->getCleanFile(I)Ljava/io/File;

    move-result-object v2

    .line 591
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-nez v3, :cond_1

    .line 592
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "failed to delete "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 582
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 598
    :cond_3
    :try_start_2
    iget v0, p0, Lcom/mopub/common/DiskLruCache;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mopub/common/DiskLruCache;->m:I

    .line 599
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->k:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "REMOVE "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 600
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    invoke-direct {p0}, Lcom/mopub/common/DiskLruCache;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 603
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->o:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 606
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final declared-synchronized setMaxSize(J)V
    .locals 3

    .prologue
    .line 497
    monitor-enter p0

    :try_start_0
    iput-wide p1, p0, Lcom/mopub/common/DiskLruCache;->h:J

    .line 498
    iget-object v0, p0, Lcom/mopub/common/DiskLruCache;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/mopub/common/DiskLruCache;->o:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 499
    monitor-exit p0

    return-void

    .line 497
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized size()J
    .locals 2

    .prologue
    .line 507
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/mopub/common/DiskLruCache;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
