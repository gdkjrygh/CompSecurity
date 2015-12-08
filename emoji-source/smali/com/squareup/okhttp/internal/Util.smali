.class public final Lcom/squareup/okhttp/internal/Util;
.super Ljava/lang/Object;
.source "Util.java"


# static fields
.field private static final DIGITS:[C

.field public static final EMPTY_BYTE_ARRAY:[B

.field public static final EMPTY_STRING_ARRAY:[Ljava/lang/String;

.field public static final ISO_8859_1:Ljava/nio/charset/Charset;

.field public static final US_ASCII:Ljava/nio/charset/Charset;

.field public static final UTF_8:Ljava/nio/charset/Charset;

.field private static skipBuffer:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<[B>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 44
    new-array v0, v1, [B

    sput-object v0, Lcom/squareup/okhttp/internal/Util;->EMPTY_BYTE_ARRAY:[B

    .line 45
    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/squareup/okhttp/internal/Util;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    .line 48
    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/Util;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 51
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/Util;->US_ASCII:Ljava/nio/charset/Charset;

    .line 54
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/Util;->UTF_8:Ljava/nio/charset/Charset;

    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/Util;->skipBuffer:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/squareup/okhttp/internal/Util;->DIGITS:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    return-void
.end method

.method private static bytesToHexString([B)Ljava/lang/String;
    .locals 8
    .param p0, "bytes"    # [B

    .prologue
    .line 370
    sget-object v4, Lcom/squareup/okhttp/internal/Util;->DIGITS:[C

    .line 371
    .local v4, "digits":[C
    array-length v5, p0

    mul-int/lit8 v5, v5, 0x2

    new-array v1, v5, [C

    .line 372
    .local v1, "buf":[C
    const/4 v2, 0x0

    .line 373
    .local v2, "c":I
    array-length v6, p0

    const/4 v5, 0x0

    move v3, v2

    .end local v2    # "c":I
    .local v3, "c":I
    :goto_0
    if-ge v5, v6, :cond_0

    aget-byte v0, p0, v5

    .line 374
    .local v0, "b":B
    add-int/lit8 v2, v3, 0x1

    .end local v3    # "c":I
    .restart local v2    # "c":I
    shr-int/lit8 v7, v0, 0x4

    and-int/lit8 v7, v7, 0xf

    aget-char v7, v4, v7

    aput-char v7, v1, v3

    .line 375
    add-int/lit8 v3, v2, 0x1

    .end local v2    # "c":I
    .restart local v3    # "c":I
    and-int/lit8 v7, v0, 0xf

    aget-char v7, v4, v7

    aput-char v7, v1, v2

    .line 373
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 377
    .end local v0    # "b":B
    :cond_0
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v1}, Ljava/lang/String;-><init>([C)V

    return-object v5
.end method

.method public static checkOffsetAndCount(III)V
    .locals 1
    .param p0, "arrayLength"    # I
    .param p1, "offset"    # I
    .param p2, "count"    # I

    .prologue
    .line 86
    or-int v0, p1, p2

    if-ltz v0, :cond_0

    if-gt p1, p0, :cond_0

    sub-int v0, p0, p1

    if-ge v0, p2, :cond_1

    .line 87
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw v0

    .line 89
    :cond_1
    return-void
.end method

.method public static closeAll(Ljava/io/Closeable;Ljava/io/Closeable;)V
    .locals 3
    .param p0, "a"    # Ljava/io/Closeable;
    .param p1, "b"    # Ljava/io/Closeable;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 160
    const/4 v1, 0x0

    .line 162
    .local v1, "thrown":Ljava/lang/Throwable;
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    :goto_0
    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    .line 171
    :cond_0
    :goto_1
    if-nez v1, :cond_1

    return-void

    .line 163
    :catch_0
    move-exception v0

    .line 164
    .local v0, "e":Ljava/lang/Throwable;
    move-object v1, v0

    goto :goto_0

    .line 168
    .end local v0    # "e":Ljava/lang/Throwable;
    :catch_1
    move-exception v0

    .line 169
    .restart local v0    # "e":Ljava/lang/Throwable;
    if-nez v1, :cond_0

    move-object v1, v0

    goto :goto_1

    .line 172
    .end local v0    # "e":Ljava/lang/Throwable;
    :cond_1
    instance-of v2, v1, Ljava/io/IOException;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/io/IOException;

    .end local v1    # "thrown":Ljava/lang/Throwable;
    throw v1

    .line 173
    .restart local v1    # "thrown":Ljava/lang/Throwable;
    :cond_2
    instance-of v2, v1, Ljava/lang/RuntimeException;

    if-eqz v2, :cond_3

    check-cast v1, Ljava/lang/RuntimeException;

    .end local v1    # "thrown":Ljava/lang/Throwable;
    throw v1

    .line 174
    .restart local v1    # "thrown":Ljava/lang/Throwable;
    :cond_3
    instance-of v2, v1, Ljava/lang/Error;

    if-eqz v2, :cond_4

    check-cast v1, Ljava/lang/Error;

    .end local v1    # "thrown":Ljava/lang/Throwable;
    throw v1

    .line 175
    .restart local v1    # "thrown":Ljava/lang/Throwable;
    :cond_4
    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2
.end method

.method public static closeQuietly(Ljava/io/Closeable;)V
    .locals 2
    .param p0, "closeable"    # Ljava/io/Closeable;

    .prologue
    .line 115
    if-eqz p0, :cond_0

    .line 117
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 123
    :cond_0
    :goto_0
    return-void

    .line 118
    :catch_0
    move-exception v0

    .line 119
    .local v0, "rethrown":Ljava/lang/RuntimeException;
    throw v0

    .line 120
    .end local v0    # "rethrown":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public static closeQuietly(Ljava/net/ServerSocket;)V
    .locals 2
    .param p0, "serverSocket"    # Ljava/net/ServerSocket;

    .prologue
    .line 145
    if-eqz p0, :cond_0

    .line 147
    :try_start_0
    invoke-virtual {p0}, Ljava/net/ServerSocket;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 153
    :cond_0
    :goto_0
    return-void

    .line 148
    :catch_0
    move-exception v0

    .line 149
    .local v0, "rethrown":Ljava/lang/RuntimeException;
    throw v0

    .line 150
    .end local v0    # "rethrown":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public static closeQuietly(Ljava/net/Socket;)V
    .locals 2
    .param p0, "socket"    # Ljava/net/Socket;

    .prologue
    .line 130
    if-eqz p0, :cond_0

    .line 132
    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 138
    :cond_0
    :goto_0
    return-void

    .line 133
    :catch_0
    move-exception v0

    .line 134
    .local v0, "rethrown":Ljava/lang/RuntimeException;
    throw v0

    .line 135
    .end local v0    # "rethrown":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 4
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 319
    const/4 v2, 0x0

    .line 320
    .local v2, "total":I
    const/16 v3, 0x2000

    new-array v0, v3, [B

    .line 322
    .local v0, "buffer":[B
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    .local v1, "c":I
    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    .line 323
    add-int/2addr v2, v1

    .line 324
    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 326
    :cond_0
    return v2
.end method

.method public static daemonThreadFactory(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 386
    new-instance v0, Lcom/squareup/okhttp/internal/Util$1;

    invoke-direct {v0, p0}, Lcom/squareup/okhttp/internal/Util$1;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static deleteContents(Ljava/io/File;)V
    .locals 5
    .param p0, "dir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 183
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 184
    .local v1, "files":[Ljava/io/File;
    if-nez v1, :cond_0

    .line 185
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "not a readable directory: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 187
    :cond_0
    array-length v3, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v3, :cond_3

    aget-object v0, v1, v2

    .line 188
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 189
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->deleteContents(Ljava/io/File;)V

    .line 191
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_2

    .line 192
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "failed to delete file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 187
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 195
    .end local v0    # "file":Ljava/io/File;
    :cond_3
    return-void
.end method

.method public static equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p0, "a"    # Ljava/lang/Object;
    .param p1, "b"    # Ljava/lang/Object;

    .prologue
    .line 107
    if-eq p0, p1, :cond_0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getDefaultPort(Ljava/lang/String;)I
    .locals 1
    .param p0, "scheme"    # Ljava/lang/String;

    .prologue
    .line 76
    const-string v0, "http"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const/16 v0, 0x50

    .line 81
    :goto_0
    return v0

    .line 78
    :cond_0
    const-string v0, "https"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    const/16 v0, 0x1bb

    goto :goto_0

    .line 81
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private static getEffectivePort(Ljava/lang/String;I)I
    .locals 1
    .param p0, "scheme"    # Ljava/lang/String;
    .param p1, "specifiedPort"    # I

    .prologue
    .line 72
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .end local p1    # "specifiedPort":I
    :goto_0
    return p1

    .restart local p1    # "specifiedPort":I
    :cond_0
    invoke-static {p0}, Lcom/squareup/okhttp/internal/Util;->getDefaultPort(Ljava/lang/String;)I

    move-result p1

    goto :goto_0
.end method

.method public static getEffectivePort(Ljava/net/URI;)I
    .locals 2
    .param p0, "uri"    # Ljava/net/URI;

    .prologue
    .line 64
    invoke-virtual {p0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/net/URI;->getPort()I

    move-result v1

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static getEffectivePort(Ljava/net/URL;)I
    .locals 2
    .param p0, "url"    # Ljava/net/URL;

    .prologue
    .line 68
    invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/net/URL;->getPort()I

    move-result v1

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static hash(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 359
    :try_start_0
    const-string v3, "MD5"

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 360
    .local v2, "messageDigest":Ljava/security/MessageDigest;
    const-string v3, "UTF-8"

    invoke-virtual {p0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    .line 361
    .local v1, "md5bytes":[B
    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->bytesToHexString([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    return-object v3

    .line 362
    .end local v1    # "md5bytes":[B
    .end local v2    # "messageDigest":Ljava/security/MessageDigest;
    :catch_0
    move-exception v0

    .line 363
    .local v0, "e":Ljava/security/NoSuchAlgorithmException;
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3

    .line 364
    .end local v0    # "e":Ljava/security/NoSuchAlgorithmException;
    :catch_1
    move-exception v0

    .line 365
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3
.end method

.method public static immutableList(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TT;>;)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 382
    .local p0, "list":Ljava/util/List;, "Ljava/util/List<TT;>;"
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static pokeInt([BIILjava/nio/ByteOrder;)V
    .locals 2
    .param p0, "dst"    # [B
    .param p1, "offset"    # I
    .param p2, "value"    # I
    .param p3, "order"    # Ljava/nio/ByteOrder;

    .prologue
    .line 92
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne p3, v1, :cond_0

    .line 93
    add-int/lit8 v0, p1, 0x1

    .end local p1    # "offset":I
    .local v0, "offset":I
    shr-int/lit8 v1, p2, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, p1

    .line 94
    add-int/lit8 p1, v0, 0x1

    .end local v0    # "offset":I
    .restart local p1    # "offset":I
    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 95
    add-int/lit8 v0, p1, 0x1

    .end local p1    # "offset":I
    .restart local v0    # "offset":I
    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, p1

    .line 96
    shr-int/lit8 v1, p2, 0x0

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    move p1, v0

    .line 103
    .end local v0    # "offset":I
    .restart local p1    # "offset":I
    :goto_0
    return-void

    .line 98
    :cond_0
    add-int/lit8 v0, p1, 0x1

    .end local p1    # "offset":I
    .restart local v0    # "offset":I
    shr-int/lit8 v1, p2, 0x0

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, p1

    .line 99
    add-int/lit8 p1, v0, 0x1

    .end local v0    # "offset":I
    .restart local p1    # "offset":I
    shr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 100
    add-int/lit8 v0, p1, 0x1

    .end local p1    # "offset":I
    .restart local v0    # "offset":I
    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, p1

    .line 101
    shr-int/lit8 v1, p2, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    move p1, v0

    .end local v0    # "offset":I
    .restart local p1    # "offset":I
    goto :goto_0
.end method

.method public static readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 5
    .param p0, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 338
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x50

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 340
    .local v2, "result":Ljava/lang/StringBuilder;
    :goto_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 341
    .local v0, "c":I
    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    .line 342
    new-instance v3, Ljava/io/EOFException;

    invoke-direct {v3}, Ljava/io/EOFException;-><init>()V

    throw v3

    .line 343
    :cond_0
    const/16 v3, 0xa

    if-ne v0, v3, :cond_2

    .line 349
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 350
    .local v1, "length":I
    if-lez v1, :cond_1

    add-int/lit8 v3, v1, -0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v3

    const/16 v4, 0xd

    if-ne v3, v4, :cond_1

    .line 351
    add-int/lit8 v3, v1, -0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 353
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 347
    .end local v1    # "length":I
    :cond_2
    int-to-char v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public static readFully(Ljava/io/Reader;)Ljava/lang/String;
    .locals 4
    .param p0, "reader"    # Ljava/io/Reader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 257
    :try_start_0
    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 258
    .local v2, "writer":Ljava/io/StringWriter;
    const/16 v3, 0x400

    new-array v0, v3, [C

    .line 260
    .local v0, "buffer":[C
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/Reader;->read([C)I

    move-result v1

    .local v1, "count":I
    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    .line 261
    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/StringWriter;->write([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 265
    .end local v0    # "buffer":[C
    .end local v1    # "count":I
    .end local v2    # "writer":Ljava/io/StringWriter;
    :catchall_0
    move-exception v3

    invoke-virtual {p0}, Ljava/io/Reader;->close()V

    throw v3

    .line 263
    .restart local v0    # "buffer":[C
    .restart local v1    # "count":I
    .restart local v2    # "writer":Ljava/io/StringWriter;
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v3

    .line 265
    invoke-virtual {p0}, Ljava/io/Reader;->close()V

    return-object v3
.end method

.method public static readFully(Ljava/io/InputStream;[B)V
    .locals 2
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "dst"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 223
    const/4 v0, 0x0

    array-length v1, p1

    invoke-static {p0, p1, v0, v1}, Lcom/squareup/okhttp/internal/Util;->readFully(Ljava/io/InputStream;[BII)V

    .line 224
    return-void
.end method

.method public static readFully(Ljava/io/InputStream;[BII)V
    .locals 3
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "dst"    # [B
    .param p2, "offset"    # I
    .param p3, "byteCount"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 234
    if-nez p3, :cond_1

    .line 252
    :cond_0
    return-void

    .line 237
    :cond_1
    if-nez p0, :cond_2

    .line 238
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "in == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 240
    :cond_2
    if-nez p1, :cond_3

    .line 241
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "dst == null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 243
    :cond_3
    array-length v1, p1

    invoke-static {v1, p2, p3}, Lcom/squareup/okhttp/internal/Util;->checkOffsetAndCount(III)V

    .line 244
    :goto_0
    if-lez p3, :cond_0

    .line 245
    invoke-virtual {p0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 246
    .local v0, "bytesRead":I
    if-gez v0, :cond_4

    .line 247
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    .line 249
    :cond_4
    add-int/2addr p2, v0

    .line 250
    sub-int/2addr p3, v0

    .line 251
    goto :goto_0
.end method

.method public static readSingleByte(Ljava/io/InputStream;)I
    .locals 5
    .param p0, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 203
    new-array v0, v4, [B

    .line 204
    .local v0, "buffer":[B
    invoke-virtual {p0, v0, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    .line 205
    .local v1, "result":I
    if-eq v1, v2, :cond_0

    aget-byte v2, v0, v3

    and-int/lit16 v2, v2, 0xff

    :cond_0
    return v2
.end method

.method public static skipAll(Ljava/io/InputStream;)V
    .locals 2
    .param p0, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 271
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Ljava/io/InputStream;->skip(J)J

    .line 272
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 273
    return-void
.end method

.method public static skipByReading(Ljava/io/InputStream;J)J
    .locals 11
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "byteCount"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v2, 0x0

    .line 287
    cmp-long v5, p1, v2

    if-nez v5, :cond_0

    .line 311
    :goto_0
    return-wide v2

    .line 290
    :cond_0
    sget-object v5, Lcom/squareup/okhttp/internal/Util;->skipBuffer:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 291
    .local v0, "buffer":[B
    if-nez v0, :cond_1

    .line 292
    const/16 v5, 0x1000

    new-array v0, v5, [B

    .line 295
    :cond_1
    const-wide/16 v2, 0x0

    .line 296
    .local v2, "skipped":J
    :cond_2
    cmp-long v5, v2, p1

    if-gez v5, :cond_3

    .line 297
    sub-long v6, p1, v2

    array-length v5, v0

    int-to-long v8, v5

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v4, v6

    .line 298
    .local v4, "toRead":I
    const/4 v5, 0x0

    invoke-virtual {p0, v0, v5, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    .line 299
    .local v1, "read":I
    const/4 v5, -0x1

    if-ne v1, v5, :cond_4

    .line 309
    .end local v1    # "read":I
    .end local v4    # "toRead":I
    :cond_3
    :goto_1
    sget-object v5, Lcom/squareup/okhttp/internal/Util;->skipBuffer:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 302
    .restart local v1    # "read":I
    .restart local v4    # "toRead":I
    :cond_4
    int-to-long v6, v1

    add-long/2addr v2, v6

    .line 303
    if-ge v1, v4, :cond_2

    goto :goto_1
.end method

.method public static writeSingleByte(Ljava/io/OutputStream;I)V
    .locals 3
    .param p0, "out"    # Ljava/io/OutputStream;
    .param p1, "b"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 214
    const/4 v1, 0x1

    new-array v0, v1, [B

    .line 215
    .local v0, "buffer":[B
    const/4 v1, 0x0

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 216
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 217
    return-void
.end method
