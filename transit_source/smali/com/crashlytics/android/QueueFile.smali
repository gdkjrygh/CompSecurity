.class Lcom/crashlytics/android/QueueFile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final a:Ljava/util/logging/Logger;


# instance fields
.field private final b:Ljava/io/RandomAccessFile;

.field private c:I

.field private d:I

.field private e:Lcom/crashlytics/android/ao;

.field private f:Lcom/crashlytics/android/ao;

.field private final g:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const-class v0, Lcom/crashlytics/android/QueueFile;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/QueueFile;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 7
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v5, 0x0

    const/16 v0, 0x10

    const/4 v4, 0x4

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    .line 111
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".tmp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/crashlytics/android/QueueFile;->a(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v1

    const-wide/16 v2, 0x1000

    :try_start_0
    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->setLength(J)V

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/16 v2, 0x10

    new-array v2, v2, [B

    const/4 v3, 0x4

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-static {v2, v3}, Lcom/crashlytics/android/QueueFile;->a([B[I)V

    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Rename failed!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    throw p1

    .line 114
    :cond_0
    invoke-static {p1}, Lcom/crashlytics/android/QueueFile;->a(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    .line 115
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/crashlytics/android/QueueFile;->a([BI)I

    move-result v0

    iput v0, p0, Lcom/crashlytics/android/QueueFile;->c:I

    iget v0, p0, Lcom/crashlytics/android/QueueFile;->c:I

    int-to-long v0, v0

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File is truncated. Expected length: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/crashlytics/android/QueueFile;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Actual length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    invoke-static {v0, v4}, Lcom/crashlytics/android/QueueFile;->a([BI)I

    move-result v0

    iput v0, p0, Lcom/crashlytics/android/QueueFile;->d:I

    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/crashlytics/android/QueueFile;->a([BI)I

    move-result v0

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/16 v2, 0xc

    invoke-static {v1, v2}, Lcom/crashlytics/android/QueueFile;->a([BI)I

    move-result v1

    invoke-direct {p0, v0}, Lcom/crashlytics/android/QueueFile;->a(I)Lcom/crashlytics/android/ao;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    invoke-direct {p0, v1}, Lcom/crashlytics/android/QueueFile;->a(I)Lcom/crashlytics/android/ao;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    .line 116
    return-void

    .line 112
    :array_0
    .array-data 4
        0x1000
        0x0
        0x0
        0x0
    .end array-data
.end method

.method static synthetic a(Lcom/crashlytics/android/QueueFile;I)I
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/crashlytics/android/QueueFile;->b(I)I

    move-result v0

    return v0
.end method

.method private static a([BI)I
    .locals 2

    .prologue
    .line 148
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    return v0
.end method

.method private a(I)Lcom/crashlytics/android/ao;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 182
    if-nez p1, :cond_0

    .line 183
    sget-object v0, Lcom/crashlytics/android/ao;->a:Lcom/crashlytics/android/ao;

    .line 186
    :goto_0
    return-object v0

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 186
    new-instance v0, Lcom/crashlytics/android/ao;

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v1

    invoke-direct {v0, p1, v1}, Lcom/crashlytics/android/ao;-><init>(II)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/crashlytics/android/QueueFile;)Ljava/io/RandomAccessFile;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    return-object v0
.end method

.method private static a(Ljava/io/File;)Ljava/io/RandomAccessFile;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 212
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rwd"

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method static synthetic a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 56
    invoke-static {p0, p1}, Lcom/crashlytics/android/QueueFile;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private a(IIII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 175
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/4 v1, 0x4

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 v2, 0x1

    aput p2, v1, v2

    const/4 v2, 0x2

    aput p3, v1, v2

    const/4 v2, 0x3

    aput p4, v1, v2

    invoke-static {v0, v1}, Lcom/crashlytics/android/QueueFile;->a([B[I)V

    .line 176
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 177
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->write([B)V

    .line 178
    return-void
.end method

.method private a(I[BII)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 229
    invoke-direct {p0, p1}, Lcom/crashlytics/android/QueueFile;->b(I)I

    move-result v0

    .line 230
    add-int v1, v0, p4

    iget v2, p0, Lcom/crashlytics/android/QueueFile;->c:I

    if-gt v1, v2, :cond_0

    .line 231
    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 232
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p2, p3, p4}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 242
    :goto_0
    return-void

    .line 236
    :cond_0
    iget v1, p0, Lcom/crashlytics/android/QueueFile;->c:I

    sub-int/2addr v1, v0

    .line 237
    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 238
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p2, p3, v1}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 239
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x10

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 240
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    add-int v2, p3, v1

    sub-int v1, p4, v1

    invoke-virtual {v0, p2, v2, v1}, Ljava/io/RandomAccessFile;->write([BII)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/crashlytics/android/QueueFile;I[BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 56
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/crashlytics/android/QueueFile;->b(I[BII)V

    return-void
.end method

.method private static a([BII)V
    .locals 2

    .prologue
    .line 128
    shr-int/lit8 v0, p2, 0x18

    aput-byte v0, p0, p1

    .line 129
    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 130
    add-int/lit8 v0, p1, 0x2

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 131
    add-int/lit8 v0, p1, 0x3

    int-to-byte v1, p2

    aput-byte v1, p0, v0

    .line 132
    return-void
.end method

.method private static varargs a([B[I)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 139
    .line 140
    array-length v2, p1

    move v1, v0

    :goto_0
    if-ge v0, v2, :cond_0

    aget v3, p1, v0

    .line 141
    invoke-static {p0, v1, v3}, Lcom/crashlytics/android/QueueFile;->a([BII)V

    .line 142
    add-int/lit8 v1, v1, 0x4

    .line 140
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 144
    :cond_0
    return-void
.end method

.method private b(I)I
    .locals 2

    .prologue
    .line 217
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->c:I

    if-ge p1, v0, :cond_0

    :goto_0
    return p1

    :cond_0
    add-int/lit8 v0, p1, 0x10

    iget v1, p0, Lcom/crashlytics/android/QueueFile;->c:I

    sub-int p1, v0, v1

    goto :goto_0
.end method

.method private static b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 436
    if-nez p0, :cond_0

    .line 437
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 439
    :cond_0
    return-object p0
.end method

.method private b(I[BII)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 252
    invoke-direct {p0, p1}, Lcom/crashlytics/android/QueueFile;->b(I)I

    move-result v0

    .line 253
    add-int v1, v0, p4

    iget v2, p0, Lcom/crashlytics/android/QueueFile;->c:I

    if-gt v1, v2, :cond_0

    .line 254
    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 255
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V

    .line 265
    :goto_0
    return-void

    .line 259
    :cond_0
    iget v1, p0, Lcom/crashlytics/android/QueueFile;->c:I

    sub-int/2addr v1, v0

    .line 260
    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 261
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p2, p3, v1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    .line 262
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x10

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 263
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    add-int v2, p3, v1

    sub-int v1, p4, v1

    invoke-virtual {v0, p2, v2, v1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    goto :goto_0
.end method

.method private declared-synchronized b([BII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 286
    monitor-enter p0

    :try_start_0
    const-string v0, "buffer"

    invoke-static {p1, v0}, Lcom/crashlytics/android/QueueFile;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 287
    or-int/lit8 v0, p3, 0x0

    if-ltz v0, :cond_0

    array-length v0, p1

    if-le p3, v0, :cond_1

    .line 288
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 291
    :cond_1
    :try_start_1
    invoke-direct {p0, p3}, Lcom/crashlytics/android/QueueFile;->c(I)V

    .line 294
    invoke-virtual {p0}, Lcom/crashlytics/android/QueueFile;->b()Z

    move-result v1

    .line 295
    if-eqz v1, :cond_3

    const/16 v0, 0x10

    .line 296
    :goto_0
    new-instance v2, Lcom/crashlytics/android/ao;

    invoke-direct {v2, v0, p3}, Lcom/crashlytics/android/ao;-><init>(II)V

    .line 299
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/4 v3, 0x0

    invoke-static {v0, v3, p3}, Lcom/crashlytics/android/QueueFile;->a([BII)V

    .line 300
    iget v0, v2, Lcom/crashlytics/android/ao;->b:I

    iget-object v3, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-direct {p0, v0, v3, v4, v5}, Lcom/crashlytics/android/QueueFile;->a(I[BII)V

    .line 303
    iget v0, v2, Lcom/crashlytics/android/ao;->b:I

    add-int/lit8 v0, v0, 0x4

    const/4 v3, 0x0

    invoke-direct {p0, v0, p1, v3, p3}, Lcom/crashlytics/android/QueueFile;->a(I[BII)V

    .line 306
    if-eqz v1, :cond_4

    iget v0, v2, Lcom/crashlytics/android/ao;->b:I

    .line 307
    :goto_1
    iget v3, p0, Lcom/crashlytics/android/QueueFile;->c:I

    iget v4, p0, Lcom/crashlytics/android/QueueFile;->d:I

    add-int/lit8 v4, v4, 0x1

    iget v5, v2, Lcom/crashlytics/android/ao;->b:I

    invoke-direct {p0, v3, v4, v0, v5}, Lcom/crashlytics/android/QueueFile;->a(IIII)V

    .line 308
    iput-object v2, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    .line 309
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/crashlytics/android/QueueFile;->d:I

    .line 310
    if-eqz v1, :cond_2

    .line 311
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iput-object v0, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 313
    :cond_2
    monitor-exit p0

    return-void

    .line 295
    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    add-int/lit8 v0, v0, 0x4

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v2, v2, Lcom/crashlytics/android/ao;->c:I

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Lcom/crashlytics/android/QueueFile;->b(I)I

    move-result v0

    goto :goto_0

    .line 306
    :cond_4
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method private c(I)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 350
    add-int/lit8 v2, p1, 0x4

    .line 351
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->c:I

    invoke-virtual {p0}, Lcom/crashlytics/android/QueueFile;->a()I

    move-result v1

    sub-int v1, v0, v1

    .line 352
    if-lt v1, v2, :cond_0

    .line 391
    :goto_0
    return-void

    .line 357
    :cond_0
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->c:I

    .line 361
    :goto_1
    add-int/2addr v1, v0

    .line 362
    shl-int/lit8 v6, v0, 0x1

    .line 364
    if-lt v1, v2, :cond_3

    .line 366
    invoke-direct {p0, v6}, Lcom/crashlytics/android/QueueFile;->d(I)V

    .line 369
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->c:I

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/crashlytics/android/QueueFile;->b(I)I

    move-result v1

    .line 372
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    if-ge v1, v0, :cond_1

    .line 373
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    .line 374
    iget v2, p0, Lcom/crashlytics/android/QueueFile;->c:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 375
    add-int/lit8 v7, v1, -0x4

    .line 376
    const-wide/16 v1, 0x10

    int-to-long v3, v7

    move-object v5, v0

    invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    move-result-wide v0

    int-to-long v2, v7

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 377
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Copied insufficient number of bytes!"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 382
    :cond_1
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->b:I

    if-ge v0, v1, :cond_2

    .line 383
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->c:I

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->b:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x10

    .line 384
    iget v1, p0, Lcom/crashlytics/android/QueueFile;->d:I

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v2, v2, Lcom/crashlytics/android/ao;->b:I

    invoke-direct {p0, v6, v1, v2, v0}, Lcom/crashlytics/android/QueueFile;->a(IIII)V

    .line 385
    new-instance v1, Lcom/crashlytics/android/ao;

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v2, v2, Lcom/crashlytics/android/ao;->c:I

    invoke-direct {v1, v0, v2}, Lcom/crashlytics/android/ao;-><init>(II)V

    iput-object v1, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    .line 390
    :goto_2
    iput v6, p0, Lcom/crashlytics/android/QueueFile;->c:I

    goto :goto_0

    .line 387
    :cond_2
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->d:I

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->b:I

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v2, v2, Lcom/crashlytics/android/ao;->b:I

    invoke-direct {p0, v6, v0, v1, v2}, Lcom/crashlytics/android/QueueFile;->a(IIII)V

    goto :goto_2

    :cond_3
    move v0, v6

    goto :goto_1
.end method

.method private declared-synchronized d()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v4, 0x1000

    .line 513
    monitor-enter p0

    const/16 v0, 0x1000

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/crashlytics/android/QueueFile;->a(IIII)V

    .line 514
    const/4 v0, 0x0

    iput v0, p0, Lcom/crashlytics/android/QueueFile;->d:I

    .line 515
    sget-object v0, Lcom/crashlytics/android/ao;->a:Lcom/crashlytics/android/ao;

    iput-object v0, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    .line 516
    sget-object v0, Lcom/crashlytics/android/ao;->a:Lcom/crashlytics/android/ao;

    iput-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    .line 517
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->c:I

    if-le v0, v4, :cond_0

    .line 518
    const/16 v0, 0x1000

    invoke-direct {p0, v0}, Lcom/crashlytics/android/QueueFile;->d(I)V

    .line 519
    :cond_0
    const/16 v0, 0x1000

    iput v0, p0, Lcom/crashlytics/android/QueueFile;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 520
    monitor-exit p0

    return-void

    .line 513
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private d(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 396
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 397
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 398
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 317
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->d:I

    if-nez v0, :cond_0

    .line 318
    const/16 v0, 0x10

    .line 328
    :goto_0
    return v0

    .line 321
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->b:I

    if-lt v0, v1, :cond_1

    .line 323
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->b:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->c:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x10

    goto :goto_0

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/crashlytics/android/QueueFile;->c:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->b:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public final declared-synchronized a(Lcom/crashlytics/android/QueueFile$ElementReader;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 422
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->b:I

    .line 423
    :goto_0
    iget v2, p0, Lcom/crashlytics/android/QueueFile;->d:I

    if-ge v0, v2, :cond_0

    .line 424
    invoke-direct {p0, v1}, Lcom/crashlytics/android/QueueFile;->a(I)Lcom/crashlytics/android/ao;

    move-result-object v1

    .line 425
    new-instance v2, Lcom/crashlytics/android/ap;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v1, v3}, Lcom/crashlytics/android/ap;-><init>(Lcom/crashlytics/android/QueueFile;Lcom/crashlytics/android/ao;B)V

    iget v3, v1, Lcom/crashlytics/android/ao;->c:I

    invoke-interface {p1, v2, v3}, Lcom/crashlytics/android/QueueFile$ElementReader;->read(Ljava/io/InputStream;I)V

    .line 426
    iget v2, v1, Lcom/crashlytics/android/ao;->b:I

    add-int/lit8 v2, v2, 0x4

    iget v1, v1, Lcom/crashlytics/android/ao;->c:I

    add-int/2addr v1, v2

    invoke-direct {p0, v1}, Lcom/crashlytics/android/QueueFile;->b(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    .line 423
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 428
    :cond_0
    monitor-exit p0

    return-void

    .line 422
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 273
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/crashlytics/android/QueueFile;->b([BII)V

    .line 274
    return-void
.end method

.method public final declared-synchronized b()Z
    .locals 1

    .prologue
    .line 341
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->d:I
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

.method public final declared-synchronized c()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 495
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/crashlytics/android/QueueFile;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 496
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 498
    :cond_0
    :try_start_1
    iget v0, p0, Lcom/crashlytics/android/QueueFile;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 499
    invoke-direct {p0}, Lcom/crashlytics/android/QueueFile;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 509
    :goto_0
    monitor-exit p0

    return-void

    .line 502
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v0, v0, Lcom/crashlytics/android/ao;->b:I

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    iget v1, v1, Lcom/crashlytics/android/ao;->c:I

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/crashlytics/android/QueueFile;->b(I)I

    move-result v0

    .line 503
    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/crashlytics/android/QueueFile;->b(I[BII)V

    .line 504
    iget-object v1, p0, Lcom/crashlytics/android/QueueFile;->g:[B

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/crashlytics/android/QueueFile;->a([BI)I

    move-result v1

    .line 505
    iget v2, p0, Lcom/crashlytics/android/QueueFile;->c:I

    iget v3, p0, Lcom/crashlytics/android/QueueFile;->d:I

    add-int/lit8 v3, v3, -0x1

    iget-object v4, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    iget v4, v4, Lcom/crashlytics/android/ao;->b:I

    invoke-direct {p0, v2, v3, v0, v4}, Lcom/crashlytics/android/QueueFile;->a(IIII)V

    .line 506
    iget v2, p0, Lcom/crashlytics/android/QueueFile;->d:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/crashlytics/android/QueueFile;->d:I

    .line 507
    new-instance v2, Lcom/crashlytics/android/ao;

    invoke-direct {v2, v0, v1}, Lcom/crashlytics/android/ao;-><init>(II)V

    iput-object v2, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 524
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/QueueFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 525
    monitor-exit p0

    return-void

    .line 524
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 529
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 530
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 531
    const-string v0, "fileLength="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/crashlytics/android/QueueFile;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 532
    const-string v0, ", size="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/crashlytics/android/QueueFile;->d:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 533
    const-string v0, ", first="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->e:Lcom/crashlytics/android/ao;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 534
    const-string v0, ", last="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/crashlytics/android/QueueFile;->f:Lcom/crashlytics/android/ao;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 535
    const-string v0, ", element lengths=["

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    :try_start_0
    new-instance v0, Lcom/crashlytics/android/an;

    invoke-direct {v0, p0, v1}, Lcom/crashlytics/android/an;-><init>(Lcom/crashlytics/android/QueueFile;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/QueueFile;->a(Lcom/crashlytics/android/QueueFile$ElementReader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 553
    :goto_0
    const-string v0, "]]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 550
    :catch_0
    move-exception v0

    .line 551
    sget-object v2, Lcom/crashlytics/android/QueueFile;->a:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v4, "read error"

    invoke-virtual {v2, v3, v4, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
