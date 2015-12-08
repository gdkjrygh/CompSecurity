.class public Lcom/mopub/volley/toolbox/DiskBasedCache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/Cache;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/mopub/volley/toolbox/b;",
            ">;"
        }
    .end annotation
.end field

.field private b:J

.field private final c:Ljava/io/File;

.field private final d:I


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 83
    const/high16 v0, 0x500000

    invoke-direct {p0, p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;-><init>(Ljava/io/File;I)V

    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/io/File;I)V
    .locals 4

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/LinkedHashMap;

    const/16 v1, 0x10

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    .line 50
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    .line 73
    iput-object p1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->c:Ljava/io/File;

    .line 74
    iput p2, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->d:I

    .line 75
    return-void
.end method

.method static a(Ljava/io/InputStream;)I
    .locals 2

    .prologue
    .line 493
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v0

    shl-int/lit8 v0, v0, 0x0

    or-int/lit8 v0, v0, 0x0

    .line 494
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    .line 495
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    .line 496
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    .line 497
    return v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 238
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 239
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 240
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 241
    return-object v0
.end method

.method static a(Ljava/io/OutputStream;I)V
    .locals 1

    .prologue
    .line 485
    shr-int/lit8 v0, p1, 0x0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 486
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 487
    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 488
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 489
    return-void
.end method

.method static a(Ljava/io/OutputStream;J)V
    .locals 3

    .prologue
    .line 501
    const/4 v0, 0x0

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 502
    const/16 v0, 0x8

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 503
    const/16 v0, 0x10

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 504
    const/16 v0, 0x18

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 505
    const/16 v0, 0x20

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 506
    const/16 v0, 0x28

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 507
    const/16 v0, 0x30

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 508
    const/16 v0, 0x38

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 509
    return-void
.end method

.method static a(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 525
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 526
    array-length v1, v0

    int-to-long v2, v1

    invoke-static {p0, v2, v3}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;J)V

    .line 527
    const/4 v1, 0x0

    array-length v2, v0

    invoke-virtual {p0, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 528
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/mopub/volley/toolbox/b;)V
    .locals 6

    .prologue
    .line 298
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 299
    iget-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    iget-wide v2, p2, Lcom/mopub/volley/toolbox/b;->size:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    .line 304
    :goto_0
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    return-void

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/b;

    .line 302
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    iget-wide v4, p2, Lcom/mopub/volley/toolbox/b;->size:J

    iget-wide v0, v0, Lcom/mopub/volley/toolbox/b;->size:J

    sub-long v0, v4, v0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    goto :goto_0
.end method

.method static a(Ljava/util/Map;Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/OutputStream;",
            ")V"
        }
    .end annotation

    .prologue
    .line 537
    if-eqz p0, :cond_0

    .line 538
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;I)V

    .line 539
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 540
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 541
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_0

    .line 544
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/OutputStream;I)V

    .line 546
    :cond_1
    return-void
.end method

.method private static a(Ljava/io/InputStream;I)[B
    .locals 4

    .prologue
    .line 322
    new-array v1, p1, [B

    .line 324
    const/4 v0, 0x0

    .line 325
    :goto_0
    if-ge v0, p1, :cond_0

    sub-int v2, p1, v0

    invoke-virtual {p0, v1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 326
    add-int/2addr v0, v2

    goto :goto_0

    .line 328
    :cond_0
    if-eq v0, p1, :cond_1

    .line 329
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " bytes, read "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " bytes"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 331
    :cond_1
    return-object v1
.end method

.method static b(Ljava/io/InputStream;)J
    .locals 8

    .prologue
    const-wide/16 v6, 0xff

    .line 513
    const-wide/16 v0, 0x0

    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/4 v4, 0x0

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 514
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 515
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/16 v4, 0x10

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 516
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/16 v4, 0x18

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 517
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 518
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 519
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 520
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->e(Ljava/io/InputStream;)I

    move-result v2

    int-to-long v2, v2

    and-long/2addr v2, v6

    const/16 v4, 0x38

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 521
    return-wide v0
.end method

.method static c(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 531
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->b(Ljava/io/InputStream;)J

    move-result-wide v0

    long-to-int v0, v0

    .line 532
    invoke-static {p0, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/InputStream;I)[B

    move-result-object v0

    .line 533
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v1
.end method

.method static d(Ljava/io/InputStream;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 549
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/InputStream;)I

    move-result v2

    .line 550
    if-nez v2, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 553
    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_1

    .line 554
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    .line 555
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    .line 556
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 550
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    goto :goto_0

    .line 558
    :cond_1
    return-object v0
.end method

.method private static e(Ljava/io/InputStream;)I
    .locals 2

    .prologue
    .line 477
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 478
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 479
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 481
    :cond_0
    return v0
.end method


# virtual methods
.method public declared-synchronized clear()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 91
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 92
    if-eqz v1, :cond_0

    .line 93
    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 94
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 93
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 98
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    .line 99
    const-string v0, "Cache cleared."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    monitor-exit p0

    return-void

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized get(Ljava/lang/String;)Lcom/mopub/volley/Cache$Entry;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 107
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 109
    if-nez v0, :cond_0

    move-object v0, v1

    .line 129
    :goto_0
    monitor-exit p0

    return-object v0

    .line 113
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v3

    .line 116
    :try_start_2
    new-instance v2, Lcom/mopub/volley/toolbox/c;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5}, Lcom/mopub/volley/toolbox/c;-><init>(Ljava/io/InputStream;B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    :try_start_3
    invoke-static {v2}, Lcom/mopub/volley/toolbox/b;->readHeader(Ljava/io/InputStream;)Lcom/mopub/volley/toolbox/b;

    .line 118
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-static {v2}, Lcom/mopub/volley/toolbox/c;->a(Lcom/mopub/volley/toolbox/c;)I

    move-result v6

    int-to-long v6, v6

    sub-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v2, v4}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/io/InputStream;I)[B

    move-result-object v4

    .line 119
    invoke-virtual {v0, v4}, Lcom/mopub/volley/toolbox/b;->toCacheEntry([B)Lcom/mopub/volley/Cache$Entry;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v0

    .line 127
    :try_start_4
    invoke-virtual {v2}, Lcom/mopub/volley/toolbox/c;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    .line 129
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 120
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 121
    :goto_1
    :try_start_5
    const-string v4, "%s: %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v6

    const/4 v3, 0x1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v3

    invoke-static {v4, v5}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p0, p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->remove(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 125
    if-eqz v2, :cond_1

    .line 127
    :try_start_6
    invoke-virtual {v2}, Lcom/mopub/volley/toolbox/c;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_1
    move-object v0, v1

    .line 129
    goto :goto_0

    :catch_2
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 125
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_2

    .line 127
    :try_start_7
    invoke-virtual {v2}, Lcom/mopub/volley/toolbox/c;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 129
    :cond_2
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 107
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 129
    :catch_3
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 125
    :catchall_2
    move-exception v0

    goto :goto_2

    .line 120
    :catch_4
    move-exception v0

    goto :goto_1
.end method

.method public getFileForKey(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .prologue
    .line 248
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->c:Ljava/io/File;

    invoke-static {p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public declared-synchronized initialize()V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 141
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 142
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    const-string v0, "Unable to create cache dir %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->c:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/mopub/volley/VolleyLog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 171
    :cond_0
    monitor-exit p0

    return-void

    .line 148
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 149
    if-eqz v3, :cond_0

    .line 152
    array-length v4, v3

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v5, v3, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    const/4 v1, 0x0

    .line 155
    :try_start_2
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 156
    :try_start_3
    invoke-static {v0}, Lcom/mopub/volley/toolbox/b;->readHeader(Ljava/io/InputStream;)Lcom/mopub/volley/toolbox/b;

    move-result-object v1

    .line 157
    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v6

    iput-wide v6, v1, Lcom/mopub/volley/toolbox/b;->size:J

    .line 158
    iget-object v6, v1, Lcom/mopub/volley/toolbox/b;->key:Ljava/lang/String;

    invoke-direct {p0, v6, v1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/lang/String;Lcom/mopub/volley/toolbox/b;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 166
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 152
    :cond_2
    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 160
    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_2
    if-eqz v5, :cond_3

    .line 161
    :try_start_5
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 165
    :cond_3
    if-eqz v0, :cond_2

    .line 166
    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    .line 169
    :catch_1
    move-exception v0

    goto :goto_1

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    :goto_3
    if-eqz v1, :cond_4

    .line 166
    :try_start_7
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 168
    :cond_4
    :goto_4
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 141
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 169
    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_4

    .line 164
    :catchall_2
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_3

    .line 160
    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public declared-synchronized invalidate(Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 180
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->get(Ljava/lang/String;)Lcom/mopub/volley/Cache$Entry;

    move-result-object v0

    .line 181
    if-eqz v0, :cond_1

    .line 182
    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/mopub/volley/Cache$Entry;->softTtl:J

    .line 183
    if-eqz p2, :cond_0

    .line 184
    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/mopub/volley/Cache$Entry;->ttl:J

    .line 186
    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->put(Ljava/lang/String;Lcom/mopub/volley/Cache$Entry;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    :cond_1
    monitor-exit p0

    return-void

    .line 180
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized put(Ljava/lang/String;Lcom/mopub/volley/Cache$Entry;)V
    .locals 12

    .prologue
    const/4 v1, 0x0

    .line 196
    monitor-enter p0

    :try_start_0
    iget-object v0, p2, Lcom/mopub/volley/Cache$Entry;->data:[B

    array-length v2, v0

    .line 1256
    iget-wide v4, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iget v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->d:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_1

    .line 1259
    sget-boolean v0, Lcom/mopub/volley/VolleyLog;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 1260
    const-string v0, "Pruning old cache entries."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lcom/mopub/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1263
    :cond_0
    iget-wide v4, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    .line 1265
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    .line 1267
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 1268
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1269
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1270
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/b;

    .line 1271
    iget-object v8, v0, Lcom/mopub/volley/toolbox/b;->key:Ljava/lang/String;

    invoke-virtual {p0, v8}, Lcom/mopub/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v8

    .line 1272
    if-eqz v8, :cond_3

    .line 1273
    iget-wide v8, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    iget-wide v10, v0, Lcom/mopub/volley/toolbox/b;->size:J

    sub-long/2addr v8, v10

    iput-wide v8, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    .line 1278
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 1279
    add-int/lit8 v0, v1, 0x1

    .line 1281
    iget-wide v8, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    int-to-long v10, v2

    add-long/2addr v8, v10

    long-to-float v1, v8

    iget v8, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->d:I

    int-to-float v8, v8

    const v9, 0x3f666666    # 0.9f

    mul-float/2addr v8, v9

    cmpg-float v1, v1, v8

    if-gez v1, :cond_5

    .line 1286
    :goto_2
    sget-boolean v1, Lcom/mopub/volley/VolleyLog;->DEBUG:Z

    if-eqz v1, :cond_1

    .line 1287
    const-string v1, "pruned %d files, %d bytes, %d ms"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    iget-wide v8, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    sub-long v4, v8, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Lcom/mopub/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :cond_1
    invoke-virtual {p0, p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 199
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 200
    new-instance v2, Lcom/mopub/volley/toolbox/b;

    invoke-direct {v2, p1, p2}, Lcom/mopub/volley/toolbox/b;-><init>(Ljava/lang/String;Lcom/mopub/volley/Cache$Entry;)V

    .line 201
    invoke-virtual {v2, v1}, Lcom/mopub/volley/toolbox/b;->writeHeader(Ljava/io/OutputStream;)Z

    move-result v3

    .line 202
    if-nez v3, :cond_4

    .line 203
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 204
    const-string v1, "Failed to write header for %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    .line 214
    if-nez v1, :cond_2

    .line 215
    const-string v1, "Could not clean up file %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 217
    :cond_2
    :goto_3
    monitor-exit p0

    return-void

    .line 1275
    :cond_3
    :try_start_3
    const-string v8, "Could not delete cache entry for key=%s, filename=%s"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    iget-object v11, v0, Lcom/mopub/volley/toolbox/b;->key:Ljava/lang/String;

    aput-object v11, v9, v10

    const/4 v10, 0x1

    iget-object v0, v0, Lcom/mopub/volley/toolbox/b;->key:Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    invoke-static {v8, v9}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    .line 196
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 207
    :cond_4
    :try_start_4
    iget-object v3, p2, Lcom/mopub/volley/Cache$Entry;->data:[B

    invoke-virtual {v1, v3}, Ljava/io/FileOutputStream;->write([B)V

    .line 208
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 209
    invoke-direct {p0, p1, v2}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/lang/String;Lcom/mopub/volley/toolbox/b;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    :cond_5
    move v1, v0

    goto/16 :goto_0

    :cond_6
    move v0, v1

    goto/16 :goto_2
.end method

.method public declared-synchronized remove(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 224
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    .line 1311
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/b;

    .line 1312
    if-eqz v0, :cond_0

    .line 1313
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    iget-wide v4, v0, Lcom/mopub/volley/toolbox/b;->size:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->b:J

    .line 1314
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    :cond_0
    if-nez v1, :cond_1

    .line 227
    const-string v0, "Could not delete cache entry for key=%s, filename=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    :cond_1
    monitor-exit p0

    return-void

    .line 224
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
