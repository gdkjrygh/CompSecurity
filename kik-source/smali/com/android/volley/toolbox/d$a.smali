.class final Lcom/android/volley/toolbox/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/volley/toolbox/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:J

.field public f:J

.field public g:Ljava/util/Map;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 395
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/b$a;)V
    .locals 2

    .prologue
    .line 403
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 404
    iput-object p1, p0, Lcom/android/volley/toolbox/d$a;->b:Ljava/lang/String;

    .line 405
    iget-object v0, p2, Lcom/android/volley/b$a;->a:[B

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/android/volley/toolbox/d$a;->a:J

    .line 406
    iget-object v0, p2, Lcom/android/volley/b$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/android/volley/toolbox/d$a;->c:Ljava/lang/String;

    .line 407
    iget-wide v0, p2, Lcom/android/volley/b$a;->c:J

    iput-wide v0, p0, Lcom/android/volley/toolbox/d$a;->d:J

    .line 408
    iget-wide v0, p2, Lcom/android/volley/b$a;->d:J

    iput-wide v0, p0, Lcom/android/volley/toolbox/d$a;->e:J

    .line 409
    iget-wide v0, p2, Lcom/android/volley/b$a;->e:J

    iput-wide v0, p0, Lcom/android/volley/toolbox/d$a;->f:J

    .line 410
    iget-object v0, p2, Lcom/android/volley/b$a;->f:Ljava/util/Map;

    iput-object v0, p0, Lcom/android/volley/toolbox/d$a;->g:Ljava/util/Map;

    .line 411
    return-void
.end method

.method public static a(Ljava/io/InputStream;)Lcom/android/volley/toolbox/d$a;
    .locals 4

    .prologue
    .line 420
    new-instance v0, Lcom/android/volley/toolbox/d$a;

    invoke-direct {v0}, Lcom/android/volley/toolbox/d$a;-><init>()V

    .line 421
    new-instance v1, Ljava/io/ObjectInputStream;

    invoke-direct {v1, p0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 422
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readByte()B

    move-result v2

    .line 423
    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    .line 425
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 427
    :cond_0
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/android/volley/toolbox/d$a;->b:Ljava/lang/String;

    .line 428
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/android/volley/toolbox/d$a;->c:Ljava/lang/String;

    .line 429
    iget-object v2, v0, Lcom/android/volley/toolbox/d$a;->c:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 430
    const/4 v2, 0x0

    iput-object v2, v0, Lcom/android/volley/toolbox/d$a;->c:Ljava/lang/String;

    .line 432
    :cond_1
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/android/volley/toolbox/d$a;->d:J

    .line 433
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/android/volley/toolbox/d$a;->e:J

    .line 434
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/android/volley/toolbox/d$a;->f:J

    .line 435
    invoke-static {v1}, Lcom/android/volley/toolbox/d$a;->a(Ljava/io/ObjectInputStream;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/android/volley/toolbox/d$a;->g:Ljava/util/Map;

    .line 436
    return-object v0
.end method

.method private static a(Ljava/io/ObjectInputStream;)Ljava/util/Map;
    .locals 5

    .prologue
    .line 501
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    .line 502
    if-nez v2, :cond_0

    .line 503
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 505
    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_1

    .line 506
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    .line 507
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    .line 508
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 503
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    goto :goto_0

    .line 510
    :cond_1
    return-object v0
.end method

.method private static a(Ljava/util/Map;Ljava/io/ObjectOutputStream;)V
    .locals 3

    .prologue
    .line 483
    if-eqz p0, :cond_0

    .line 484
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 485
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

    .line 486
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 487
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_0

    .line 491
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 493
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/OutputStream;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 460
    :try_start_0
    new-instance v3, Ljava/io/ObjectOutputStream;

    invoke-direct {v3, p1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 461
    const/4 v2, 0x2

    invoke-virtual {v3, v2}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 462
    iget-object v2, p0, Lcom/android/volley/toolbox/d$a;->b:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 463
    iget-object v2, p0, Lcom/android/volley/toolbox/d$a;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, ""

    :goto_0
    invoke-virtual {v3, v2}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 464
    iget-wide v4, p0, Lcom/android/volley/toolbox/d$a;->d:J

    invoke-virtual {v3, v4, v5}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    .line 465
    iget-wide v4, p0, Lcom/android/volley/toolbox/d$a;->e:J

    invoke-virtual {v3, v4, v5}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    .line 466
    iget-wide v4, p0, Lcom/android/volley/toolbox/d$a;->f:J

    invoke-virtual {v3, v4, v5}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    .line 467
    iget-object v2, p0, Lcom/android/volley/toolbox/d$a;->g:Ljava/util/Map;

    invoke-static {v2, v3}, Lcom/android/volley/toolbox/d$a;->a(Ljava/util/Map;Ljava/io/ObjectOutputStream;)V

    .line 468
    invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->flush()V

    .line 473
    :goto_1
    return v0

    .line 463
    :cond_0
    iget-object v2, p0, Lcom/android/volley/toolbox/d$a;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 471
    :catch_0
    move-exception v2

    .line 472
    const-string v3, "%s"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v3, v0}, Lcom/android/volley/x;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 473
    goto :goto_1
.end method
