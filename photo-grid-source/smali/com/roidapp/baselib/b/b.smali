.class public final Lcom/roidapp/baselib/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final a:Ljava/nio/charset/Charset;


# instance fields
.field private final b:Ljava/io/File;

.field private final c:Ljava/io/File;

.field private final d:Ljava/io/File;

.field private final e:I

.field private final f:J

.field private final g:I

.field private h:J

.field private i:Ljava/io/Writer;

.field private final j:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/b/f;",
            ">;"
        }
    .end annotation
.end field

.field private k:I

.field private l:J

.field private final m:Ljava/util/concurrent/ExecutorService;

.field private final n:Ljava/util/concurrent/Callable;
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
    .line 111
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/roidapp/baselib/b/b;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method private constructor <init>(Ljava/io/File;)V
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    iput-wide v4, p0, Lcom/roidapp/baselib/b/b;->h:J

    .line 162
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {v0, v2, v1, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    .line 171
    iput-wide v4, p0, Lcom/roidapp/baselib/b/b;->l:J

    .line 272
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/roidapp/baselib/b/b;->m:Ljava/util/concurrent/ExecutorService;

    .line 274
    new-instance v0, Lcom/roidapp/baselib/b/c;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/b/c;-><init>(Lcom/roidapp/baselib/b/b;)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/b;->n:Ljava/util/concurrent/Callable;

    .line 291
    iput-object p1, p0, Lcom/roidapp/baselib/b/b;->b:Ljava/io/File;

    .line 292
    iput v3, p0, Lcom/roidapp/baselib/b/b;->e:I

    .line 293
    new-instance v0, Ljava/io/File;

    const-string v1, "journal"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/b;->c:Ljava/io/File;

    .line 294
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.tmp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/b;->d:Ljava/io/File;

    .line 295
    iput v3, p0, Lcom/roidapp/baselib/b/b;->g:I

    .line 296
    const-wide/32 v0, 0xa00000

    iput-wide v0, p0, Lcom/roidapp/baselib/b/b;->f:J

    .line 297
    return-void
.end method

.method public static a(Ljava/io/File;)Lcom/roidapp/baselib/b/b;
    .locals 5

    .prologue
    .line 311
    const-wide/32 v0, 0xa00000

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 312
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxSize <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 319
    :cond_0
    new-instance v0, Lcom/roidapp/baselib/b/b;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/b/b;-><init>(Ljava/io/File;)V

    .line 320
    iget-object v1, v0, Lcom/roidapp/baselib/b/b;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 322
    :try_start_0
    invoke-direct {v0}, Lcom/roidapp/baselib/b/b;->c()V

    .line 323
    invoke-direct {v0}, Lcom/roidapp/baselib/b/b;->d()V

    .line 324
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/FileWriter;

    iget-object v3, v0, Lcom/roidapp/baselib/b/b;->c:Ljava/io/File;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    const/16 v3, 0x2000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    iput-object v1, v0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    :goto_0
    return-object v0

    .line 330
    :catch_0
    move-exception v1

    .line 1724
    invoke-virtual {v0}, Lcom/roidapp/baselib/b/b;->close()V

    .line 1725
    iget-object v0, v0, Lcom/roidapp/baselib/b/b;->b:Ljava/io/File;

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->b(Ljava/io/File;)V

    .line 335
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 336
    new-instance v0, Lcom/roidapp/baselib/b/b;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/b/b;-><init>(Ljava/io/File;)V

    .line 337
    invoke-direct {v0}, Lcom/roidapp/baselib/b/b;->e()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/baselib/b/b;)Ljava/io/Writer;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    return-object v0
.end method

.method private static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 220
    :goto_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 221
    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 222
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 223
    :cond_0
    const/16 v2, 0xa

    if-eq v1, v2, :cond_1

    .line 227
    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 229
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 230
    if-lez v1, :cond_2

    add-int/lit8 v2, v1, -0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_2

    .line 231
    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 233
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/d;Z)V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0, p1, p2}, Lcom/roidapp/baselib/b/b;->a(Lcom/roidapp/baselib/b/d;Z)V

    return-void
.end method

.method private declared-synchronized a(Lcom/roidapp/baselib/b/d;Z)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 578
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/roidapp/baselib/b/d;->a(Lcom/roidapp/baselib/b/d;)Lcom/roidapp/baselib/b/f;

    move-result-object v2

    .line 579
    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 580
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 578
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 584
    :cond_0
    if-eqz p2, :cond_2

    :try_start_1
    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->e(Lcom/roidapp/baselib/b/f;)Z

    move-result v1

    if-nez v1, :cond_2

    move v1, v0

    .line 585
    :goto_0
    iget v3, p0, Lcom/roidapp/baselib/b/b;->g:I

    if-ge v1, v3, :cond_2

    .line 586
    invoke-virtual {v2, v1}, Lcom/roidapp/baselib/b/f;->b(I)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 587
    invoke-virtual {p1}, Lcom/roidapp/baselib/b/d;->c()V

    .line 588
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "edit didn\'t create file "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 585
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 593
    :cond_2
    :goto_1
    iget v1, p0, Lcom/roidapp/baselib/b/b;->g:I

    if-ge v0, v1, :cond_5

    .line 594
    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/b/f;->b(I)Ljava/io/File;

    move-result-object v1

    .line 595
    if-eqz p2, :cond_4

    .line 596
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 597
    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/b/f;->a(I)Ljava/io/File;

    move-result-object v3

    .line 598
    invoke-virtual {v1, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 599
    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->c(Lcom/roidapp/baselib/b/f;)[J

    move-result-object v1

    aget-wide v4, v1, v0

    .line 600
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 601
    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->c(Lcom/roidapp/baselib/b/f;)[J

    move-result-object v1

    aput-wide v6, v1, v0

    .line 602
    iget-wide v8, p0, Lcom/roidapp/baselib/b/b;->h:J

    sub-long v4, v8, v4

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/roidapp/baselib/b/b;->h:J

    .line 593
    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 605
    :cond_4
    invoke-static {v1}, Lcom/roidapp/baselib/b/b;->c(Ljava/io/File;)V

    goto :goto_2

    .line 609
    :cond_5
    iget v0, p0, Lcom/roidapp/baselib/b/b;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/baselib/b/b;->k:I

    .line 610
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;Lcom/roidapp/baselib/b/d;)Lcom/roidapp/baselib/b/d;

    .line 611
    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->e(Lcom/roidapp/baselib/b/f;)Z

    move-result v0

    or-int/2addr v0, p2

    if-eqz v0, :cond_9

    .line 612
    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;)Z

    .line 613
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "CLEAN "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->d(Lcom/roidapp/baselib/b/f;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v2}, Lcom/roidapp/baselib/b/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 614
    if-eqz p2, :cond_6

    .line 615
    iget-wide v0, p0, Lcom/roidapp/baselib/b/b;->l:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v0

    iput-wide v4, p0, Lcom/roidapp/baselib/b/b;->l:J

    invoke-static {v2, v0, v1}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;J)J

    .line 622
    :cond_6
    :goto_3
    iget-wide v0, p0, Lcom/roidapp/baselib/b/b;->h:J

    iget-wide v2, p0, Lcom/roidapp/baselib/b/b;->f:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_7

    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 623
    :cond_7
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->m:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->n:Ljava/util/concurrent/Callable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 625
    :cond_8
    monitor-exit p0

    return-void

    .line 618
    :cond_9
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->d(Lcom/roidapp/baselib/b/f;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "REMOVE "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/roidapp/baselib/b/f;->d(Lcom/roidapp/baselib/b/f;)Ljava/lang/String;

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

    goto :goto_3
.end method

.method public static a(Ljava/io/Closeable;)V
    .locals 1

    .prologue
    .line 240
    if-eqz p0, :cond_0

    .line 242
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 248
    :cond_0
    :goto_0
    return-void

    .line 244
    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/baselib/b/b;)V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->h()V

    return-void
.end method

.method private static b(Ljava/io/File;)V
    .locals 5

    .prologue
    .line 255
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 256
    if-nez v1, :cond_1

    .line 269
    :cond_0
    return-void

    .line 261
    :cond_1
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 262
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 263
    invoke-static {v3}, Lcom/roidapp/baselib/b/b;->b(Ljava/io/File;)V

    .line 265
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_3

    .line 266
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "failed to delete file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 261
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private c()V
    .locals 8

    .prologue
    const/4 v7, 0x2

    .line 342
    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->c:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 v1, 0x2000

    invoke-direct {v2, v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 344
    :try_start_0
    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    .line 345
    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    .line 346
    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    .line 347
    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v4

    .line 348
    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v5

    .line 349
    const-string v6, "libcore.io.DiskLruCache"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget v6, p0, Lcom/roidapp/baselib/b/b;->e:I

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget v3, p0, Lcom/roidapp/baselib/b/b;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, ""

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 354
    :cond_0
    new-instance v3, Ljava/io/IOException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "unexpected journal header: ["

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 366
    :catchall_0
    move-exception v0

    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/Closeable;)V

    throw v0

    .line 2376
    :cond_1
    const/4 v0, 0x1

    :try_start_1
    aget-object v1, v4, v0

    .line 2377
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const-string v5, "REMOVE"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    array-length v0, v4

    if-ne v0, v7, :cond_3

    .line 2378
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    :cond_2
    :goto_0
    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    .line 2371
    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 2372
    array-length v0, v4

    if-ge v0, v7, :cond_1

    .line 2373
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "unexpected journal line: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    move-exception v0

    .line 366
    invoke-static {v2}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/Closeable;)V

    .line 367
    return-void

    .line 2382
    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/b/f;

    .line 2383
    if-nez v0, :cond_9

    .line 2384
    new-instance v0, Lcom/roidapp/baselib/b/f;

    const/4 v5, 0x0

    invoke-direct {v0, p0, v1, v5}, Lcom/roidapp/baselib/b/f;-><init>(Lcom/roidapp/baselib/b/b;Ljava/lang/String;B)V

    .line 2385
    iget-object v5, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    .line 2388
    :goto_1
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const-string v5, "CLEAN"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    array-length v0, v4

    iget v5, p0, Lcom/roidapp/baselib/b/b;->g:I

    add-int/lit8 v5, v5, 0x2

    if-ne v0, v5, :cond_6

    .line 2389
    invoke-static {v1}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;)Z

    .line 2390
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;Lcom/roidapp/baselib/b/d;)Lcom/roidapp/baselib/b/d;

    .line 2391
    array-length v0, v4

    .line 3176
    array-length v3, v4

    .line 3177
    if-le v7, v0, :cond_4

    .line 3178
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 3180
    :cond_4
    if-le v7, v3, :cond_5

    .line 3181
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw v0

    .line 3183
    :cond_5
    add-int/lit8 v0, v0, -0x2

    .line 3184
    add-int/lit8 v3, v3, -0x2

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 3185
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 3187
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v4, v5, v0, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2391
    check-cast v0, [Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;[Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2392
    :cond_6
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const-string v5, "DIRTY"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    array-length v0, v4

    if-ne v0, v7, :cond_7

    .line 2393
    new-instance v0, Lcom/roidapp/baselib/b/d;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v3}, Lcom/roidapp/baselib/b/d;-><init>(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/f;B)V

    invoke-static {v1, v0}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;Lcom/roidapp/baselib/b/d;)Lcom/roidapp/baselib/b/d;

    goto/16 :goto_0

    .line 2394
    :cond_7
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const-string v1, "READ"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    array-length v0, v4

    if-eq v0, v7, :cond_2

    .line 2397
    :cond_8
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "unexpected journal line: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_9
    move-object v1, v0

    goto/16 :goto_1
.end method

.method private static c(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 465
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 466
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 468
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/roidapp/baselib/b/b;)Z
    .locals 1

    .prologue
    .line 100
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->f()Z

    move-result v0

    return v0
.end method

.method private declared-synchronized d(Ljava/lang/String;)Lcom/roidapp/baselib/b/d;
    .locals 6

    .prologue
    const/4 v1, 0x0

    const-wide/16 v4, -0x1

    .line 530
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->g()V

    .line 531
    invoke-static {p1}, Lcom/roidapp/baselib/b/b;->e(Ljava/lang/String;)V

    .line 532
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/b/f;

    .line 533
    cmp-long v2, v4, v4

    if-eqz v2, :cond_1

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->f(Lcom/roidapp/baselib/b/f;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    :cond_0
    move-object v0, v1

    .line 550
    :goto_0
    monitor-exit p0

    return-object v0

    .line 537
    :cond_1
    if-nez v0, :cond_2

    .line 538
    :try_start_1
    new-instance v0, Lcom/roidapp/baselib/b/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/roidapp/baselib/b/f;-><init>(Lcom/roidapp/baselib/b/b;Ljava/lang/String;B)V

    .line 539
    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    .line 544
    :goto_1
    new-instance v0, Lcom/roidapp/baselib/b/d;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/roidapp/baselib/b/d;-><init>(Lcom/roidapp/baselib/b/b;Lcom/roidapp/baselib/b/f;B)V

    .line 545
    invoke-static {v1, v0}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;Lcom/roidapp/baselib/b/d;)Lcom/roidapp/baselib/b/d;

    .line 548
    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

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

    .line 549
    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    invoke-virtual {v1}, Ljava/io/Writer;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 530
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 540
    :cond_2
    :try_start_2
    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_3

    move-object v0, v1

    .line 541
    goto :goto_0

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method

.method private d()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 406
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->d:Ljava/io/File;

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->c(Ljava/io/File;)V

    .line 407
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 408
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/b/f;

    .line 409
    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v2

    .line 410
    :goto_1
    iget v4, p0, Lcom/roidapp/baselib/b/b;->g:I

    if-ge v1, v4, :cond_0

    .line 411
    iget-wide v4, p0, Lcom/roidapp/baselib/b/b;->h:J

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->c(Lcom/roidapp/baselib/b/f;)[J

    move-result-object v6

    aget-wide v6, v6, v1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/roidapp/baselib/b/b;->h:J

    .line 410
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 414
    :cond_1
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/b/f;->a(Lcom/roidapp/baselib/b/f;Lcom/roidapp/baselib/b/d;)Lcom/roidapp/baselib/b/d;

    move v1, v2

    .line 415
    :goto_2
    iget v4, p0, Lcom/roidapp/baselib/b/b;->g:I

    if-ge v1, v4, :cond_2

    .line 416
    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/b/f;->a(I)Ljava/io/File;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/baselib/b/b;->c(Ljava/io/File;)V

    .line 417
    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/b/f;->b(I)Ljava/io/File;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/baselib/b/b;->c(Ljava/io/File;)V

    .line 415
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 419
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 422
    :cond_3
    return-void
.end method

.method static synthetic d(Lcom/roidapp/baselib/b/b;)V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->e()V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/baselib/b/b;)I
    .locals 1

    .prologue
    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/b/b;->k:I

    return v0
.end method

.method private declared-synchronized e()V
    .locals 5

    .prologue
    .line 429
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    if-eqz v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 433
    :cond_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/FileWriter;

    iget-object v2, p0, Lcom/roidapp/baselib/b/b;->d:Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    const/16 v2, 0x2000

    invoke-direct {v1, v0, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    .line 434
    const-string v0, "libcore.io.DiskLruCache"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 435
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 436
    const-string v0, "1"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 437
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 438
    iget v0, p0, Lcom/roidapp/baselib/b/b;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 439
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 440
    iget v0, p0, Lcom/roidapp/baselib/b/b;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 441
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 442
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 444
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

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

    check-cast v0, Lcom/roidapp/baselib/b/f;

    .line 445
    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 446
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DIRTY "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->d(Lcom/roidapp/baselib/b/f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 429
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 448
    :cond_1
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CLEAN "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->d(Lcom/roidapp/baselib/b/f;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    .line 452
    :cond_2
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    .line 453
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->d:Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->c:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 454
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/FileWriter;

    iget-object v2, p0, Lcom/roidapp/baselib/b/b;->c:Ljava/io/File;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 455
    monitor-exit p0

    return-void
.end method

.method private static e(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 729
    const-string v0, " "

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\n"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\r"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 730
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "keys must not contain spaces or newlines: \""

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

    .line 733
    :cond_1
    return-void
.end method

.method static synthetic f(Lcom/roidapp/baselib/b/b;)I
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/roidapp/baselib/b/b;->g:I

    return v0
.end method

.method private f()Z
    .locals 2

    .prologue
    .line 633
    iget v0, p0, Lcom/roidapp/baselib/b/b;->k:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/roidapp/baselib/b/b;->k:I

    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

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

.method static synthetic g(Lcom/roidapp/baselib/b/b;)Ljava/io/File;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->b:Ljava/io/File;

    return-object v0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 679
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    if-nez v0, :cond_0

    .line 680
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 682
    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    .prologue
    .line 711
    :goto_0
    iget-wide v0, p0, Lcom/roidapp/baselib/b/b;->h:J

    iget-wide v2, p0, Lcom/roidapp/baselib/b/b;->f:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 713
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 714
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/b/b;->c(Ljava/lang/String;)Z

    goto :goto_0

    .line 716
    :cond_0
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Lcom/roidapp/baselib/b/g;
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 486
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->g()V

    .line 487
    invoke-static {p1}, Lcom/roidapp/baselib/b/b;->e(Ljava/lang/String;)V

    .line 488
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/b/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 489
    if-nez v0, :cond_1

    .line 518
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    .line 493
    :cond_1
    :try_start_1
    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->e(Lcom/roidapp/baselib/b/f;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 502
    iget v3, p0, Lcom/roidapp/baselib/b/b;->g:I

    new-array v6, v3, [Ljava/io/InputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 504
    :goto_1
    :try_start_2
    iget v3, p0, Lcom/roidapp/baselib/b/b;->g:I

    if-ge v2, v3, :cond_2

    .line 505
    new-instance v3, Ljava/io/FileInputStream;

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/b/f;->a(I)Ljava/io/File;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    aput-object v3, v6, v2
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 504
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 512
    :cond_2
    :try_start_3
    iget v1, p0, Lcom/roidapp/baselib/b/b;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/roidapp/baselib/b/b;->k:I

    .line 513
    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

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

    .line 514
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->f()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 515
    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->m:Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcom/roidapp/baselib/b/b;->n:Ljava/util/concurrent/Callable;

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 518
    :cond_3
    new-instance v1, Lcom/roidapp/baselib/b/g;

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->f(Lcom/roidapp/baselib/b/f;)J

    move-result-wide v4

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lcom/roidapp/baselib/b/g;-><init>(Lcom/roidapp/baselib/b/b;Ljava/lang/String;J[Ljava/io/InputStream;B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 486
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 509
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 675
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)Lcom/roidapp/baselib/b/d;
    .locals 1

    .prologue
    .line 526
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/b/b;->d(Ljava/lang/String;)Lcom/roidapp/baselib/b/d;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized b()V
    .locals 1

    .prologue
    .line 688
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->g()V

    .line 689
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->h()V

    .line 690
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 691
    monitor-exit p0

    return-void

    .line 688
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 644
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->g()V

    .line 645
    invoke-static {p1}, Lcom/roidapp/baselib/b/b;->e(Ljava/lang/String;)V

    .line 646
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/b/f;

    .line 647
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_2

    :cond_0
    move v0, v1

    .line 668
    :goto_0
    monitor-exit p0

    return v0

    .line 656
    :cond_1
    :try_start_1
    iget-wide v2, p0, Lcom/roidapp/baselib/b/b;->h:J

    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->c(Lcom/roidapp/baselib/b/f;)[J

    move-result-object v4

    aget-wide v4, v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/roidapp/baselib/b/b;->h:J

    .line 657
    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->c(Lcom/roidapp/baselib/b/f;)[J

    move-result-object v2

    const-wide/16 v4, 0x0

    aput-wide v4, v2, v1

    .line 651
    add-int/lit8 v1, v1, 0x1

    :cond_2
    iget v2, p0, Lcom/roidapp/baselib/b/b;->g:I

    if-ge v1, v2, :cond_3

    .line 652
    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/b/f;->a(I)Ljava/io/File;

    move-result-object v2

    .line 653
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-nez v3, :cond_1

    .line 654
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

    .line 644
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 660
    :cond_3
    :try_start_2
    iget v0, p0, Lcom/roidapp/baselib/b/b;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/baselib/b/b;->k:I

    .line 661
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

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

    .line 662
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 665
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->m:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->n:Ljava/util/concurrent/Callable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 668
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final declared-synchronized close()V
    .locals 3

    .prologue
    .line 697
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 708
    :goto_0
    monitor-exit p0

    return-void

    .line 700
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/baselib/b/b;->j:Ljava/util/LinkedHashMap;

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

    check-cast v0, Lcom/roidapp/baselib/b/f;

    .line 701
    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 702
    invoke-static {v0}, Lcom/roidapp/baselib/b/f;->b(Lcom/roidapp/baselib/b/f;)Lcom/roidapp/baselib/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/d;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 697
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 705
    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/roidapp/baselib/b/b;->h()V

    .line 706
    iget-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 707
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/b/b;->i:Ljava/io/Writer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method
