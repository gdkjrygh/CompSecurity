.class public final Lcom/d/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/d/a/a$b;,
        Lcom/d/a/a$a;,
        Lcom/d/a/a$c;
    }
.end annotation


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

.field private m:I

.field private n:J

.field private final o:Ljava/util/concurrent/Callable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 95
    const-string v0, "[a-z0-9_-]{1,64}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/d/a/a;->a:Ljava/util/regex/Pattern;

    .line 713
    new-instance v0, Lcom/d/a/c;

    invoke-direct {v0}, Lcom/d/a/c;-><init>()V

    sput-object v0, Lcom/d/a/a;->p:Ljava/io/OutputStream;

    return-void
.end method

.method private constructor <init>(Ljava/io/File;)V
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    iput-wide v4, p0, Lcom/d/a/a;->j:J

    .line 150
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {v0, v2, v1, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    .line 159
    iput-wide v4, p0, Lcom/d/a/a;->n:J

    .line 162
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/d/a/a;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 164
    new-instance v0, Lcom/d/a/b;

    invoke-direct {v0, p0}, Lcom/d/a/b;-><init>(Lcom/d/a/a;)V

    iput-object v0, p0, Lcom/d/a/a;->o:Ljava/util/concurrent/Callable;

    .line 181
    iput-object p1, p0, Lcom/d/a/a;->c:Ljava/io/File;

    .line 182
    iput v3, p0, Lcom/d/a/a;->g:I

    .line 183
    new-instance v0, Ljava/io/File;

    const-string v1, "journal"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/d/a/a;->d:Ljava/io/File;

    .line 184
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.tmp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/d/a/a;->e:Ljava/io/File;

    .line 185
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/d/a/a;->f:Ljava/io/File;

    .line 186
    iput v3, p0, Lcom/d/a/a;->i:I

    .line 187
    const-wide/32 v0, 0x6400000

    iput-wide v0, p0, Lcom/d/a/a;->h:J

    .line 188
    return-void
.end method

.method public static a(Ljava/io/File;)Lcom/d/a/a;
    .locals 6

    .prologue
    .line 201
    const-wide/32 v0, 0x6400000

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 202
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxSize <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 210
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 211
    new-instance v1, Ljava/io/File;

    const-string v2, "journal"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 213
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 214
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 221
    :cond_1
    :goto_0
    new-instance v0, Lcom/d/a/a;

    invoke-direct {v0, p0}, Lcom/d/a/a;-><init>(Ljava/io/File;)V

    .line 222
    iget-object v1, v0, Lcom/d/a/a;->d:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 224
    :try_start_0
    invoke-direct {v0}, Lcom/d/a/a;->c()V

    .line 225
    invoke-direct {v0}, Lcom/d/a/a;->d()V

    .line 226
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    new-instance v3, Ljava/io/FileOutputStream;

    iget-object v4, v0, Lcom/d/a/a;->d:Ljava/io/File;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    sget-object v4, Lcom/d/a/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v1, v0, Lcom/d/a/a;->k:Ljava/io/Writer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    :goto_1
    return-object v0

    .line 216
    :cond_2
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/d/a/a;->a(Ljava/io/File;Ljava/io/File;Z)V

    goto :goto_0

    .line 229
    :catch_0
    move-exception v1

    .line 230
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

    .line 236
    invoke-virtual {v0}, Lcom/d/a/a;->close()V

    iget-object v0, v0, Lcom/d/a/a;->c:Ljava/io/File;

    invoke-static {v0}, Lcom/d/a/f;->a(Ljava/io/File;)V

    .line 241
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 242
    new-instance v0, Lcom/d/a/a;

    invoke-direct {v0, p0}, Lcom/d/a/a;-><init>(Ljava/io/File;)V

    .line 243
    invoke-direct {v0}, Lcom/d/a/a;->e()V

    goto :goto_1
.end method

.method static synthetic a(Lcom/d/a/a;)Ljava/io/Writer;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    return-object v0
.end method

.method private declared-synchronized a(Lcom/d/a/a$a;Z)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 509
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/d/a/a$a;->a(Lcom/d/a/a$a;)Lcom/d/a/a$b;

    move-result-object v2

    .line 510
    invoke-static {v2}, Lcom/d/a/a$b;->b(Lcom/d/a/a$b;)Lcom/d/a/a$a;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 511
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 509
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 515
    :cond_0
    if-eqz p2, :cond_4

    :try_start_1
    invoke-static {v2}, Lcom/d/a/a$b;->e(Lcom/d/a/a$b;)Z

    move-result v1

    if-nez v1, :cond_4

    move v1, v0

    .line 516
    :goto_0
    iget v3, p0, Lcom/d/a/a;->i:I

    if-ge v1, v3, :cond_4

    .line 517
    invoke-static {p1}, Lcom/d/a/a$a;->b(Lcom/d/a/a$a;)[Z

    move-result-object v3

    aget-boolean v3, v3, v1

    if-nez v3, :cond_1

    .line 518
    invoke-virtual {p1}, Lcom/d/a/a$a;->c()V

    .line 519
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

    .line 521
    :cond_1
    invoke-virtual {v2, v1}, Lcom/d/a/a$b;->b(I)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_3

    .line 522
    invoke-virtual {p1}, Lcom/d/a/a$a;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 561
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    .line 516
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 528
    :cond_4
    :goto_2
    :try_start_2
    iget v1, p0, Lcom/d/a/a;->i:I

    if-ge v0, v1, :cond_7

    .line 529
    invoke-virtual {v2, v0}, Lcom/d/a/a$b;->b(I)Ljava/io/File;

    move-result-object v1

    .line 530
    if-eqz p2, :cond_6

    .line 531
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 532
    invoke-virtual {v2, v0}, Lcom/d/a/a$b;->a(I)Ljava/io/File;

    move-result-object v3

    .line 533
    invoke-virtual {v1, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 534
    invoke-static {v2}, Lcom/d/a/a$b;->c(Lcom/d/a/a$b;)[J

    move-result-object v1

    aget-wide v4, v1, v0

    .line 535
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 536
    invoke-static {v2}, Lcom/d/a/a$b;->c(Lcom/d/a/a$b;)[J

    move-result-object v1

    aput-wide v6, v1, v0

    .line 537
    iget-wide v8, p0, Lcom/d/a/a;->j:J

    sub-long v4, v8, v4

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/d/a/a;->j:J

    .line 528
    :cond_5
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 540
    :cond_6
    invoke-static {v1}, Lcom/d/a/a;->b(Ljava/io/File;)V

    goto :goto_3

    .line 544
    :cond_7
    iget v0, p0, Lcom/d/a/a;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/d/a/a;->m:I

    .line 545
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;Lcom/d/a/a$a;)Lcom/d/a/a$a;

    .line 546
    invoke-static {v2}, Lcom/d/a/a$b;->e(Lcom/d/a/a$b;)Z

    move-result v0

    or-int/2addr v0, p2

    if-eqz v0, :cond_a

    .line 547
    invoke-static {v2}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;)Z

    .line 548
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "CLEAN "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/d/a/a$b;->d(Lcom/d/a/a$b;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v2}, Lcom/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 549
    if-eqz p2, :cond_8

    .line 550
    iget-wide v0, p0, Lcom/d/a/a;->n:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v0

    iput-wide v4, p0, Lcom/d/a/a;->n:J

    invoke-static {v2, v0, v1}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;J)J

    .line 556
    :cond_8
    :goto_4
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 558
    iget-wide v0, p0, Lcom/d/a/a;->j:J

    iget-wide v2, p0, Lcom/d/a/a;->h:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_9

    invoke-direct {p0}, Lcom/d/a/a;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 559
    :cond_9
    iget-object v0, p0, Lcom/d/a/a;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/d/a/a;->o:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto/16 :goto_1

    .line 553
    :cond_a
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Lcom/d/a/a$b;->d(Lcom/d/a/a$b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "REMOVE "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/d/a/a$b;->d(Lcom/d/a/a$b;)Ljava/lang/String;

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

.method static synthetic a(Lcom/d/a/a;Lcom/d/a/a$a;Z)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Lcom/d/a/a;->a(Lcom/d/a/a$a;Z)V

    return-void
.end method

.method private static a(Ljava/io/File;Ljava/io/File;Z)V
    .locals 1

    .prologue
    .line 391
    if-eqz p2, :cond_0

    .line 392
    invoke-static {p1}, Lcom/d/a/a;->b(Ljava/io/File;)V

    .line 394
    :cond_0
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 395
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 397
    :cond_1
    return-void
.end method

.method static synthetic b()Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lcom/d/a/a;->p:Ljava/io/OutputStream;

    return-object v0
.end method

.method static synthetic b(Lcom/d/a/a;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0}, Lcom/d/a/a;->h()V

    return-void
.end method

.method private static b(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 385
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 386
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 388
    :cond_0
    return-void
.end method

.method private c()V
    .locals 10

    .prologue
    const/4 v9, 0x5

    const/4 v0, 0x0

    const/4 v8, -0x1

    .line 248
    new-instance v3, Lcom/d/a/d;

    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/d/a/a;->d:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object v2, Lcom/d/a/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, v1, v2}, Lcom/d/a/d;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 250
    :try_start_0
    invoke-virtual {v3}, Lcom/d/a/d;->a()Ljava/lang/String;

    move-result-object v1

    .line 251
    invoke-virtual {v3}, Lcom/d/a/d;->a()Ljava/lang/String;

    move-result-object v2

    .line 252
    invoke-virtual {v3}, Lcom/d/a/d;->a()Ljava/lang/String;

    move-result-object v4

    .line 253
    invoke-virtual {v3}, Lcom/d/a/d;->a()Ljava/lang/String;

    move-result-object v5

    .line 254
    invoke-virtual {v3}, Lcom/d/a/d;->a()Ljava/lang/String;

    move-result-object v6

    .line 255
    const-string v7, "libcore.io.DiskLruCache"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "1"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget v7, p0, Lcom/d/a/a;->g:I

    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget v4, p0, Lcom/d/a/a;->i:I

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, ""

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 260
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

    .line 275
    :catchall_0
    move-exception v0

    invoke-static {v3}, Lcom/d/a/f;->a(Ljava/io/Closeable;)V

    throw v0

    :cond_1
    move v1, v0

    .line 267
    :goto_0
    :try_start_1
    invoke-virtual {v3}, Lcom/d/a/d;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v0, 0x20

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-ne v5, v8, :cond_2

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

    .line 270
    :catch_0
    move-exception v0

    :try_start_2
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Lcom/d/a/a;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 275
    invoke-static {v3}, Lcom/d/a/f;->a(Ljava/io/Closeable;)V

    .line 276
    return-void

    .line 267
    :cond_2
    add-int/lit8 v0, v5, 0x1

    const/16 v2, 0x20

    :try_start_3
    invoke-virtual {v4, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-ne v6, v8, :cond_4

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    if-ne v5, v2, :cond_9

    const-string v2, "REMOVE"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    :cond_3
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 271
    goto :goto_0

    .line 267
    :cond_4
    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    :goto_2
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/d/a/a$b;

    if-nez v0, :cond_5

    new-instance v0, Lcom/d/a/a$b;

    const/4 v7, 0x0

    invoke-direct {v0, p0, v2, v7}, Lcom/d/a/a$b;-><init>(Lcom/d/a/a;Ljava/lang/String;B)V

    iget-object v7, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-eq v6, v8, :cond_6

    if-ne v5, v9, :cond_6

    const-string v2, "CLEAN"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;)Z

    const/4 v4, 0x0

    invoke-static {v0, v4}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;Lcom/d/a/a$a;)Lcom/d/a/a$a;

    invoke-static {v0, v2}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;[Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    if-ne v6, v8, :cond_7

    if-ne v5, v9, :cond_7

    const-string v2, "DIRTY"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, Lcom/d/a/a$a;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v0, v4}, Lcom/d/a/a$a;-><init>(Lcom/d/a/a;Lcom/d/a/a$b;B)V

    invoke-static {v0, v2}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;Lcom/d/a/a$a;)Lcom/d/a/a$a;

    goto :goto_1

    :cond_7
    if-ne v6, v8, :cond_8

    const/4 v0, 0x4

    if-ne v5, v0, :cond_8

    const-string v0, "READ"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

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

.method static synthetic c(Lcom/d/a/a;)Z
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0}, Lcom/d/a/a;->f()Z

    move-result v0

    return v0
.end method

.method private declared-synchronized d(Ljava/lang/String;)Lcom/d/a/a$a;
    .locals 6

    .prologue
    const/4 v1, 0x0

    const-wide/16 v4, -0x1

    .line 454
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/d/a/a;->g()V

    .line 455
    invoke-static {p1}, Lcom/d/a/a;->e(Ljava/lang/String;)V

    .line 456
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/d/a/a$b;

    .line 457
    cmp-long v2, v4, v4

    if-eqz v2, :cond_1

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/d/a/a$b;->f(Lcom/d/a/a$b;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    :cond_0
    move-object v0, v1

    .line 474
    :goto_0
    monitor-exit p0

    return-object v0

    .line 461
    :cond_1
    if-nez v0, :cond_2

    .line 462
    :try_start_1
    new-instance v0, Lcom/d/a/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/d/a/a$b;-><init>(Lcom/d/a/a;Ljava/lang/String;B)V

    .line 463
    iget-object v1, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    .line 468
    :goto_1
    new-instance v0, Lcom/d/a/a$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/d/a/a$a;-><init>(Lcom/d/a/a;Lcom/d/a/a$b;B)V

    .line 469
    invoke-static {v1, v0}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;Lcom/d/a/a$a;)Lcom/d/a/a$a;

    .line 472
    iget-object v1, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

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

    .line 473
    iget-object v1, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    invoke-virtual {v1}, Ljava/io/Writer;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 454
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 464
    :cond_2
    :try_start_2
    invoke-static {v0}, Lcom/d/a/a$b;->b(Lcom/d/a/a$b;)Lcom/d/a/a$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_3

    move-object v0, v1

    .line 465
    goto :goto_0

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method

.method private d()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 323
    iget-object v0, p0, Lcom/d/a/a;->e:Ljava/io/File;

    invoke-static {v0}, Lcom/d/a/a;->b(Ljava/io/File;)V

    .line 324
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 325
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/d/a/a$b;

    .line 326
    invoke-static {v0}, Lcom/d/a/a$b;->b(Lcom/d/a/a$b;)Lcom/d/a/a$a;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v2

    .line 327
    :goto_1
    iget v4, p0, Lcom/d/a/a;->i:I

    if-ge v1, v4, :cond_0

    .line 328
    iget-wide v4, p0, Lcom/d/a/a;->j:J

    invoke-static {v0}, Lcom/d/a/a$b;->c(Lcom/d/a/a$b;)[J

    move-result-object v6

    aget-wide v6, v6, v1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/d/a/a;->j:J

    .line 327
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 331
    :cond_1
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/d/a/a$b;->a(Lcom/d/a/a$b;Lcom/d/a/a$a;)Lcom/d/a/a$a;

    move v1, v2

    .line 332
    :goto_2
    iget v4, p0, Lcom/d/a/a;->i:I

    if-ge v1, v4, :cond_2

    .line 333
    invoke-virtual {v0, v1}, Lcom/d/a/a$b;->a(I)Ljava/io/File;

    move-result-object v4

    invoke-static {v4}, Lcom/d/a/a;->b(Ljava/io/File;)V

    .line 334
    invoke-virtual {v0, v1}, Lcom/d/a/a$b;->b(I)Ljava/io/File;

    move-result-object v4

    invoke-static {v4}, Lcom/d/a/a;->b(Ljava/io/File;)V

    .line 332
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 336
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 339
    :cond_3
    return-void
.end method

.method static synthetic d(Lcom/d/a/a;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0}, Lcom/d/a/a;->e()V

    return-void
.end method

.method static synthetic e(Lcom/d/a/a;)I
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    iput v0, p0, Lcom/d/a/a;->m:I

    return v0
.end method

.method private declared-synchronized e()V
    .locals 5

    .prologue
    .line 346
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 350
    :cond_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/d/a/a;->e:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v3, Lcom/d/a/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 353
    :try_start_1
    const-string v0, "libcore.io.DiskLruCache"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 354
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 355
    const-string v0, "1"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 356
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 357
    iget v0, p0, Lcom/d/a/a;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 358
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 359
    iget v0, p0, Lcom/d/a/a;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 360
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 361
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 363
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

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

    check-cast v0, Lcom/d/a/a$b;

    .line 364
    invoke-static {v0}, Lcom/d/a/a$b;->b(Lcom/d/a/a$b;)Lcom/d/a/a$a;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 365
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DIRTY "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/d/a/a$b;->d(Lcom/d/a/a$b;)Ljava/lang/String;

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

    .line 371
    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 346
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 367
    :cond_1
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CLEAN "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/d/a/a$b;->d(Lcom/d/a/a$b;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/d/a/a$b;->a()Ljava/lang/String;

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

    .line 371
    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    .line 374
    iget-object v0, p0, Lcom/d/a/a;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 375
    iget-object v0, p0, Lcom/d/a/a;->d:Ljava/io/File;

    iget-object v1, p0, Lcom/d/a/a;->f:Ljava/io/File;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/d/a/a;->a(Ljava/io/File;Ljava/io/File;Z)V

    .line 377
    :cond_3
    iget-object v0, p0, Lcom/d/a/a;->e:Ljava/io/File;

    iget-object v1, p0, Lcom/d/a/a;->d:Ljava/io/File;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/d/a/a;->a(Ljava/io/File;Ljava/io/File;Z)V

    .line 378
    iget-object v0, p0, Lcom/d/a/a;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 380
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/d/a/a;->d:Ljava/io/File;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    sget-object v3, Lcom/d/a/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 382
    monitor-exit p0

    return-void
.end method

.method private static e(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 658
    sget-object v0, Lcom/d/a/a;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 659
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 660
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

    .line 662
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/d/a/a;)I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Lcom/d/a/a;->i:I

    return v0
.end method

.method private f()Z
    .locals 2

    .prologue
    .line 568
    iget v0, p0, Lcom/d/a/a;->m:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/d/a/a;->m:I

    iget-object v1, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

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

.method static synthetic g(Lcom/d/a/a;)Ljava/io/File;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/d/a/a;->c:Ljava/io/File;

    return-object v0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 613
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    if-nez v0, :cond_0

    .line 614
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 616
    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    .prologue
    .line 641
    :goto_0
    iget-wide v0, p0, Lcom/d/a/a;->j:J

    iget-wide v2, p0, Lcom/d/a/a;->h:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 642
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 643
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/d/a/a;->c(Ljava/lang/String;)Z

    goto :goto_0

    .line 645
    :cond_0
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Lcom/d/a/a$c;
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 405
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/d/a/a;->g()V

    .line 406
    invoke-static {p1}, Lcom/d/a/a;->e(Ljava/lang/String;)V

    .line 407
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/d/a/a$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 408
    if-nez v0, :cond_1

    .line 442
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    .line 412
    :cond_1
    :try_start_1
    invoke-static {v0}, Lcom/d/a/a$b;->e(Lcom/d/a/a$b;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 419
    iget v3, p0, Lcom/d/a/a;->i:I

    new-array v6, v3, [Ljava/io/InputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v3, v2

    .line 421
    :goto_1
    :try_start_2
    iget v4, p0, Lcom/d/a/a;->i:I

    if-ge v3, v4, :cond_2

    .line 422
    new-instance v4, Ljava/io/FileInputStream;

    invoke-virtual {v0, v3}, Lcom/d/a/a$b;->a(I)Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    aput-object v4, v6, v3
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 421
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 426
    :catch_0
    move-exception v0

    move v0, v2

    :goto_2
    :try_start_3
    iget v2, p0, Lcom/d/a/a;->i:I

    if-ge v0, v2, :cond_0

    .line 427
    aget-object v2, v6, v0

    if-eqz v2, :cond_0

    .line 428
    aget-object v2, v6, v0

    invoke-static {v2}, Lcom/d/a/f;->a(Ljava/io/Closeable;)V

    .line 426
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 436
    :cond_2
    iget v1, p0, Lcom/d/a/a;->m:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/d/a/a;->m:I

    .line 437
    iget-object v1, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

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

    .line 438
    invoke-direct {p0}, Lcom/d/a/a;->f()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 439
    iget-object v1, p0, Lcom/d/a/a;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v2, p0, Lcom/d/a/a;->o:Ljava/util/concurrent/Callable;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 442
    :cond_3
    new-instance v1, Lcom/d/a/a$c;

    invoke-static {v0}, Lcom/d/a/a$b;->f(Lcom/d/a/a$b;)J

    move-result-wide v4

    invoke-static {v0}, Lcom/d/a/a$b;->c(Lcom/d/a/a$b;)[J

    move-result-object v7

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/d/a/a$c;-><init>(Lcom/d/a/a;Ljava/lang/String;J[Ljava/io/InputStream;[JB)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 405
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a()Ljava/io/File;
    .locals 1

    .prologue
    .line 479
    iget-object v0, p0, Lcom/d/a/a;->c:Ljava/io/File;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/d/a/a$a;
    .locals 1

    .prologue
    .line 450
    invoke-direct {p0, p1}, Lcom/d/a/a;->d(Ljava/lang/String;)Lcom/d/a/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized c(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 580
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/d/a/a;->g()V

    .line 581
    invoke-static {p1}, Lcom/d/a/a;->e(Ljava/lang/String;)V

    .line 582
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/d/a/a$b;

    .line 583
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/d/a/a$b;->b(Lcom/d/a/a$b;)Lcom/d/a/a$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_2

    :cond_0
    move v0, v1

    .line 604
    :goto_0
    monitor-exit p0

    return v0

    .line 592
    :cond_1
    :try_start_1
    iget-wide v2, p0, Lcom/d/a/a;->j:J

    invoke-static {v0}, Lcom/d/a/a$b;->c(Lcom/d/a/a$b;)[J

    move-result-object v4

    aget-wide v4, v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/d/a/a;->j:J

    .line 593
    invoke-static {v0}, Lcom/d/a/a$b;->c(Lcom/d/a/a$b;)[J

    move-result-object v2

    const-wide/16 v4, 0x0

    aput-wide v4, v2, v1

    .line 587
    add-int/lit8 v1, v1, 0x1

    :cond_2
    iget v2, p0, Lcom/d/a/a;->i:I

    if-ge v1, v2, :cond_3

    .line 588
    invoke-virtual {v0, v1}, Lcom/d/a/a$b;->a(I)Ljava/io/File;

    move-result-object v2

    .line 589
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-nez v3, :cond_1

    .line 590
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

    .line 580
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 596
    :cond_3
    :try_start_2
    iget v0, p0, Lcom/d/a/a;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/d/a/a;->m:I

    .line 597
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

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

    .line 598
    iget-object v0, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    invoke-direct {p0}, Lcom/d/a/a;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 601
    iget-object v0, p0, Lcom/d/a/a;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/d/a/a;->o:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 604
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final declared-synchronized close()V
    .locals 3

    .prologue
    .line 627
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 638
    :goto_0
    monitor-exit p0

    return-void

    .line 630
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/d/a/a;->l:Ljava/util/LinkedHashMap;

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

    check-cast v0, Lcom/d/a/a$b;

    .line 631
    invoke-static {v0}, Lcom/d/a/a$b;->b(Lcom/d/a/a$b;)Lcom/d/a/a$a;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 632
    invoke-static {v0}, Lcom/d/a/a$b;->b(Lcom/d/a/a$b;)Lcom/d/a/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/d/a/a$a;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 627
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 635
    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/d/a/a;->h()V

    .line 636
    iget-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 637
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/d/a/a;->k:Ljava/io/Writer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method
