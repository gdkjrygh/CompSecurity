.class public Lcom/qihoo360/common/unzip/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/unzip/a$a;,
        Lcom/qihoo360/common/unzip/a$b;
    }
.end annotation


# static fields
.field private static final c:[B

.field private static final d:J


# instance fields
.field final a:Ljava/io/RandomAccessFile;

.field final b:Lcom/qihoo360/common/unzip/a$b;

.field private final e:[B

.field private final f:[B

.field private final g:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 245
    const-wide/32 v0, 0x6054b50

    invoke-static {v0, v1}, Lcom/qihoo360/common/unzip/ZipLong;->getBytes(J)[B

    move-result-object v0

    sput-object v0, Lcom/qihoo360/common/unzip/a;->c:[B

    .line 384
    sget-object v0, Lcom/qihoo360/common/unzip/ZipLong;->CFH_SIG:Lcom/qihoo360/common/unzip/ZipLong;

    invoke-virtual {v0}, Lcom/qihoo360/common/unzip/ZipLong;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([B)J

    move-result-wide v0

    sput-wide v0, Lcom/qihoo360/common/unzip/a;->d:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 388
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    .line 389
    const/16 v0, 0x2a

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo360/common/unzip/a;->f:[B

    .line 390
    const/4 v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo360/common/unzip/a;->g:[B

    .line 394
    new-instance v0, Lcom/qihoo360/common/unzip/a$b;

    invoke-direct {v0, p0}, Lcom/qihoo360/common/unzip/a$b;-><init>(Lcom/qihoo360/common/unzip/a;)V

    iput-object v0, p0, Lcom/qihoo360/common/unzip/a;->b:Lcom/qihoo360/common/unzip/a$b;

    .line 172
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string/jumbo v1, "r"

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    .line 174
    invoke-direct {p0}, Lcom/qihoo360/common/unzip/a;->d()V

    .line 176
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 177
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    invoke-static {v0}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([B)J

    move-result-wide v0

    .line 179
    sget-wide v2, Lcom/qihoo360/common/unzip/a;->d:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo360/common/unzip/a;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, ": central directory is empty."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 182
    :cond_0
    return-void
.end method

.method private a(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 293
    const/4 v0, 0x0

    .line 294
    :goto_0
    if-lt v0, p1, :cond_0

    .line 301
    return-void

    .line 295
    :cond_0
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    sub-int v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    move-result v1

    .line 296
    if-gtz v1, :cond_1

    .line 297
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 299
    :cond_1
    add-int/2addr v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo360/common/unzip/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 292
    invoke-direct {p0, p1}, Lcom/qihoo360/common/unzip/a;->a(I)V

    return-void
.end method

.method private a(JJ[B)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v6, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 315
    .line 316
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    sub-long/2addr v0, p1

    .line 317
    iget-object v4, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v4

    sub-long/2addr v4, p3

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 318
    cmp-long v6, v0, v6

    if-ltz v6, :cond_0

    .line 319
    :goto_0
    cmp-long v6, v0, v4

    if-gez v6, :cond_2

    .line 340
    :cond_0
    :goto_1
    if-eqz v2, :cond_1

    .line 341
    iget-object v3, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v3, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 343
    :cond_1
    return v2

    .line 320
    :cond_2
    iget-object v6, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v6, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 321
    iget-object v6, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v6}, Ljava/io/RandomAccessFile;->read()I

    move-result v6

    .line 322
    const/4 v7, -0x1

    if-eq v6, v7, :cond_0

    .line 325
    aget-byte v7, p5, v2

    if-ne v6, v7, :cond_3

    .line 326
    iget-object v6, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v6}, Ljava/io/RandomAccessFile;->read()I

    move-result v6

    .line 327
    aget-byte v7, p5, v3

    if-ne v6, v7, :cond_3

    .line 328
    iget-object v6, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v6}, Ljava/io/RandomAccessFile;->read()I

    move-result v6

    .line 329
    const/4 v7, 0x2

    aget-byte v7, p5, v7

    if-ne v6, v7, :cond_3

    .line 330
    iget-object v6, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v6}, Ljava/io/RandomAccessFile;->read()I

    move-result v6

    .line 331
    const/4 v7, 0x3

    aget-byte v7, p5, v7

    if-ne v6, v7, :cond_3

    move v2, v3

    .line 333
    goto :goto_1

    .line 319
    :cond_3
    const-wide/16 v6, 0x1

    sub-long/2addr v0, v6

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo360/common/unzip/a;)[B
    .locals 1

    .prologue
    .line 388
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo360/common/unzip/a;)[B
    .locals 1

    .prologue
    .line 389
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->f:[B

    return-object v0
.end method

.method static synthetic c()J
    .locals 2

    .prologue
    .line 384
    sget-wide v0, Lcom/qihoo360/common/unzip/a;->d:J

    return-wide v0
.end method

.method static synthetic c(Lcom/qihoo360/common/unzip/a;)[B
    .locals 1

    .prologue
    .line 390
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->g:[B

    return-object v0
.end method

.method private d()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 211
    invoke-direct {p0}, Lcom/qihoo360/common/unzip/a;->e()V

    .line 212
    invoke-direct {p0}, Lcom/qihoo360/common/unzip/a;->f()V

    .line 213
    return-void
.end method

.method private e()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 252
    const-wide/16 v2, 0x16

    const-wide/32 v4, 0x10015

    sget-object v6, Lcom/qihoo360/common/unzip/a;->c:[B

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/qihoo360/common/unzip/a;->a(JJ[B)Z

    move-result v0

    .line 253
    if-nez v0, :cond_0

    .line 254
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "archive is not a ZIP archive"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 256
    :cond_0
    return-void
.end method

.method private f()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 283
    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lcom/qihoo360/common/unzip/a;->a(I)V

    .line 284
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 285
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    invoke-static {v1}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([B)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 286
    return-void
.end method

.method private g()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 351
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 352
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 353
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->e:[B

    sget-object v1, Lcom/qihoo360/common/unzip/ZipLong;->LFH_SIG:Lcom/qihoo360/common/unzip/ZipLong;

    invoke-virtual {v1}, Lcom/qihoo360/common/unzip/ZipLong;->getBytes()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Ljava/util/Enumeration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Enumeration",
            "<",
            "Lcom/qihoo360/common/unzip/a$a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 191
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->b:Lcom/qihoo360/common/unzip/a$b;

    return-object v0
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 201
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 202
    return-void
.end method
