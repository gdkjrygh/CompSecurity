.class public Lorg/apache/sanselan/common/BinaryFileFunctions;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field protected a_:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    return-void
.end method

.method protected static a([BI)F
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a([BII)F

    move-result v0

    return v0
.end method

.method private static a([BII)F
    .locals 5

    add-int/lit8 v0, p1, 0x0

    aget-byte v0, p0, v0

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, p0, v2

    add-int/lit8 v3, p1, 0x3

    aget-byte v3, p0, v3

    const/16 v4, 0x4d

    if-ne p2, v4, :cond_0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0xff

    shl-int/lit8 v1, v1, 0x0

    or-int/2addr v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0

    :cond_0
    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    or-int/2addr v0, v1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;I[BI)I
    .locals 3

    add-int/lit8 v0, p2, 0x1

    array-length v1, p3

    if-lt v0, v1, :cond_0

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Index out of bounds. Array size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    add-int/lit8 v0, p2, 0x0

    aget-byte v0, p3, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p3, v1

    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0x4d

    if-ne p4, v2, :cond_2

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    :goto_0
    iget-boolean v1, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    invoke-static {p1, v0, v1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/lang/String;II)V

    :cond_1
    return v0

    :cond_2
    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    goto :goto_0
.end method

.method private static a(I[BII)V
    .locals 2

    const/16 v0, 0x4d

    if-ne p3, v0, :cond_0

    add-int/lit8 v0, p2, 0x0

    shr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x1

    shr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x2

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x3

    shr-int/lit8 v1, p0, 0x0

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    :goto_0
    return-void

    :cond_0
    add-int/lit8 v0, p2, 0x3

    shr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x2

    shr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x1

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    add-int/lit8 v0, p2, 0x0

    shr-int/lit8 v1, p0, 0x0

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    goto :goto_0
.end method

.method public static a(Ljava/io/InputStream;ILjava/lang/String;)V
    .locals 6

    const-wide/16 v0, 0x0

    :goto_0
    int-to-long v2, p1

    cmp-long v2, v2, v0

    if-nez v2, :cond_0

    return-void

    :cond_0
    int-to-long v2, p1

    sub-long/2addr v2, v0

    invoke-virtual {p0, v2, v3}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    const-wide/16 v4, 0x1

    cmp-long v4, v2, v4

    if-gez v4, :cond_1

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " ("

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-long/2addr v0, v2

    goto :goto_0
.end method

.method public static a(Ljava/io/InputStream;[BLjava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    and-int/lit16 v2, v1, 0xff

    int-to-byte v2, v2

    if-gez v1, :cond_1

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Unexpected EOF."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    aget-byte v1, p1, v0

    if-eq v2, v1, :cond_2

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    invoke-direct {v0, p2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static a(Ljava/io/PrintWriter;Ljava/lang/String;II)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 v0, 0x0

    move v1, p2

    :goto_0
    if-lt v0, p3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ") [0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/PrintWriter;->flush()V

    return-void

    :cond_0
    if-lez v0, :cond_1

    const-string v2, ","

    invoke-virtual {p0, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_1
    and-int/lit16 v2, v1, 0xff

    new-instance v3, Ljava/lang/StringBuilder;

    int-to-char v4, v2

    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    shr-int/lit8 v1, v1, 0x8

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;II)V
    .locals 2

    new-instance v0, Ljava/io/PrintWriter;

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-static {v0, p0, p1, p2}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/io/PrintWriter;Ljava/lang/String;II)V

    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public static a([B[B)Z
    .locals 5

    const/4 v0, 0x0

    array-length v1, p0

    array-length v2, p1

    if-eq v1, v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    array-length v2, p0

    array-length v1, p0

    add-int/lit8 v3, v2, 0x0

    if-lt v1, v3, :cond_0

    array-length v1, p1

    add-int/lit8 v3, v2, 0x0

    if-lt v1, v3, :cond_0

    move v1, v0

    :goto_1
    if-lt v1, v2, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v1, 0x0

    aget-byte v3, p0, v3

    add-int/lit8 v4, v1, 0x0

    aget-byte v4, p1, v4

    if-ne v3, v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public static final a([B[BI)Z
    .locals 4

    const/4 v0, 0x0

    array-length v1, p0

    add-int/lit8 v2, p2, 0x0

    if-ge v1, v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    array-length v1, p1

    add-int/lit8 v2, p2, 0x0

    if-lt v1, v2, :cond_0

    move v1, v0

    :goto_1
    if-lt v1, p2, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v1, 0x0

    aget-byte v2, p0, v2

    add-int/lit8 v3, v1, 0x0

    aget-byte v3, p1, v3

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method protected static a(II)[B
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x2

    new-array v0, v0, [B

    const/16 v1, 0x4d

    if-ne p1, v1, :cond_0

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    shr-int/lit8 v1, p0, 0x0

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    :goto_0
    return-object v0

    :cond_0
    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    shr-int/lit8 v1, p0, 0x0

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    goto :goto_0
.end method

.method protected static a(Lorg/apache/sanselan/common/RationalNumber;I)[B
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [B

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    const/4 v2, 0x0

    invoke-static {v1, v0, v2, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(I[BII)V

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    const/4 v2, 0x4

    invoke-static {v1, v0, v2, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(I[BII)V

    return-object v0
.end method

.method protected static a([DI)[B
    .locals 10

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x8

    new-array v1, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-lt v0, v2, :cond_0

    return-object v1

    :cond_0
    aget-wide v2, p0, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v2

    mul-int/lit8 v4, v0, 0x8

    const/16 v5, 0x4d

    if-ne p1, v5, :cond_1

    add-int/lit8 v5, v4, 0x0

    const-wide/16 v6, 0xff

    const/4 v8, 0x0

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x1

    const-wide/16 v6, 0xff

    const/16 v8, 0x8

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x2

    const-wide/16 v6, 0xff

    const/16 v8, 0x10

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x3

    const-wide/16 v6, 0xff

    const/16 v8, 0x18

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x4

    const-wide/16 v6, 0xff

    const/16 v8, 0x20

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x5

    const-wide/16 v6, 0xff

    const/16 v8, 0x28

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x6

    const-wide/16 v6, 0xff

    const/16 v8, 0x30

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v4, v4, 0x7

    const-wide/16 v6, 0xff

    const/16 v5, 0x38

    shr-long/2addr v2, v5

    and-long/2addr v2, v6

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v1, v4

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v4, 0x7

    const-wide/16 v6, 0xff

    const/4 v8, 0x0

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x6

    const-wide/16 v6, 0xff

    const/16 v8, 0x8

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x5

    const-wide/16 v6, 0xff

    const/16 v8, 0x10

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x4

    const-wide/16 v6, 0xff

    const/16 v8, 0x18

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x3

    const-wide/16 v6, 0xff

    const/16 v8, 0x20

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x2

    const-wide/16 v6, 0xff

    const/16 v8, 0x28

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v5, v4, 0x1

    const-wide/16 v6, 0xff

    const/16 v8, 0x30

    shr-long v8, v2, v8

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    add-int/lit8 v4, v4, 0x0

    const-wide/16 v6, 0xff

    const/16 v5, 0x38

    shr-long/2addr v2, v5

    and-long/2addr v2, v6

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v1, v4

    goto :goto_1
.end method

.method protected static a([FI)[B
    .locals 6

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x4

    new-array v1, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-lt v0, v2, :cond_0

    return-object v1

    :cond_0
    aget v2, p0, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    mul-int/lit8 v3, v0, 0x4

    const/16 v4, 0x4d

    if-ne p1, v4, :cond_1

    add-int/lit8 v4, v3, 0x0

    shr-int/lit8 v5, v2, 0x0

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v4, v3, 0x1

    shr-int/lit8 v5, v2, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v4, v3, 0x2

    shr-int/lit8 v5, v2, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v3, v3, 0x3

    shr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v3

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v3, 0x3

    shr-int/lit8 v5, v2, 0x0

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v4, v3, 0x2

    shr-int/lit8 v5, v2, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v4, v3, 0x1

    shr-int/lit8 v5, v2, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v3, v3, 0x0

    shr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v3

    goto :goto_1
.end method

.method protected static a([II)[B
    .locals 4

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x4

    new-array v1, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-lt v0, v2, :cond_0

    return-object v1

    :cond_0
    aget v2, p0, v0

    mul-int/lit8 v3, v0, 0x4

    invoke-static {v2, v1, v3, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(I[BII)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected static a([Lorg/apache/sanselan/common/RationalNumber;I)[B
    .locals 4

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x8

    new-array v1, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-lt v0, v2, :cond_0

    return-object v1

    :cond_0
    aget-object v2, p0, v0

    iget v2, v2, Lorg/apache/sanselan/common/RationalNumber;->a:I

    mul-int/lit8 v3, v0, 0x8

    invoke-static {v2, v1, v3, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(I[BII)V

    aget-object v2, p0, v0

    iget v2, v2, Lorg/apache/sanselan/common/RationalNumber;->b:I

    mul-int/lit8 v3, v0, 0x8

    add-int/lit8 v3, v3, 0x4

    invoke-static {v2, v1, v3, p1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(I[BII)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;[B)V
    .locals 4

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\t ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/lang/String;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected static b([II)[B
    .locals 5

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-lt v0, v2, :cond_0

    return-object v1

    :cond_0
    aget v2, p0, v0

    const/16 v3, 0x4d

    if-ne p1, v3, :cond_1

    mul-int/lit8 v3, v0, 0x2

    add-int/lit8 v3, v3, 0x0

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    mul-int/lit8 v3, v0, 0x2

    add-int/lit8 v3, v3, 0x1

    shr-int/lit8 v2, v2, 0x0

    int-to-byte v2, v2

    aput-byte v2, v1, v3

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    mul-int/lit8 v3, v0, 0x2

    add-int/lit8 v3, v3, 0x1

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    mul-int/lit8 v3, v0, 0x2

    add-int/lit8 v3, v3, 0x0

    shr-int/lit8 v2, v2, 0x0

    int-to-byte v2, v2

    aput-byte v2, v1, v3

    goto :goto_1
.end method

.method protected static d(Ljava/lang/String;[BII)[F
    .locals 4

    mul-int/lit8 v0, p2, 0x4

    add-int/lit8 v0, v0, 0x0

    array-length v1, p1

    if-ge v1, v0, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ": expected length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", actual length: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v2, p1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-array v0, p2, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    mul-int/lit8 v2, v1, 0x4

    add-int/lit8 v2, v2, 0x0

    invoke-static {p1, v2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a([BII)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private e(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;
    .locals 3

    add-int/lit8 v0, p3, 0x0

    invoke-direct {p0, p1, p2, v0, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->f(Ljava/lang/String;[BII)I

    move-result v0

    add-int/lit8 v1, p3, 0x4

    invoke-direct {p0, p1, p2, v1, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->f(Ljava/lang/String;[BII)I

    move-result v1

    new-instance v2, Lorg/apache/sanselan/common/RationalNumber;

    invoke-direct {v2, v0, v1}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    return-object v2
.end method

.method private f(Ljava/lang/String;[BII)I
    .locals 5

    add-int/lit8 v0, p3, 0x0

    aget-byte v0, p2, v0

    add-int/lit8 v1, p3, 0x1

    aget-byte v1, p2, v1

    add-int/lit8 v2, p3, 0x2

    aget-byte v2, p2, v2

    add-int/lit8 v3, p3, 0x3

    aget-byte v3, p2, v3

    const/16 v4, 0x4d

    if-ne p4, v4, :cond_1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0xff

    shl-int/lit8 v1, v1, 0x0

    or-int/2addr v0, v1

    :goto_0
    iget-boolean v1, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/lang/String;II)V

    :cond_0
    return v0

    :cond_1
    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x0

    or-int/2addr v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B
    .locals 4

    invoke-virtual {p2}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v1, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/lang/String;II)V

    :cond_1
    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    return v0
.end method

.method protected final a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I
    .locals 4

    const/4 v3, 0x4

    new-array v1, v3, [B

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v3, :cond_0

    invoke-virtual {p0, p1, v1, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->b(Ljava/lang/String;[BI)I

    move-result v0

    return v0

    :cond_0
    rsub-int/lit8 v2, v0, 0x4

    invoke-virtual {p2, v1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-gtz v2, :cond_1

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/2addr v0, v2

    goto :goto_0
.end method

.method protected final a(Ljava/lang/String;[BI)Lorg/apache/sanselan/common/RationalNumber;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->e(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v0

    return-object v0
.end method

.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    return v0
.end method

.method protected final a(Ljava/io/RandomAccessFile;JILjava/lang/String;)[B
    .locals 4

    iget-boolean v0, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getRAFBytes pos: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getRAFBytes length: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    new-array v1, p4, [B

    invoke-virtual {p1, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v0, 0x0

    :goto_0
    if-lt v0, p4, :cond_1

    return-object v1

    :cond_1
    sub-int v2, p4, v0

    invoke-virtual {p1, v1, v0, v2}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v2

    if-gtz v2, :cond_2

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/2addr v0, v2

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B
    .locals 5

    const/4 v0, 0x0

    new-array v2, p2, [B

    move v1, v0

    :goto_0
    if-lt v1, p2, :cond_1

    iget-boolean v1, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    if-eqz v1, :cond_0

    :goto_1
    if-ge v0, p2, :cond_0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_3

    :cond_0
    return-object v2

    :cond_1
    sub-int v3, p2, v1

    invoke-virtual {p3, v2, v1, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-gtz v3, :cond_2

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/2addr v1, v3

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ")"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aget-byte v3, v2, v0

    and-int/lit16 v3, v3, 0xff

    const/4 v4, 0x1

    invoke-static {v1, v3, v4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/lang/String;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method protected final a(Ljava/lang/String;[B)[B
    .locals 4

    array-length v0, p2

    add-int/lit8 v0, v0, -0x6

    array-length v1, p2

    add-int/lit8 v2, v0, 0x6

    if-ge v1, v2, :cond_0

    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid read. bytes.length: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", start: 6, count: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {p2, v2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-boolean v0, p0, Lorg/apache/sanselan/common/BinaryFileFunctions;->a_:Z

    if-eqz v0, :cond_1

    invoke-static {p1, v1}, Lorg/apache/sanselan/common/BinaryFileFunctions;->b(Ljava/lang/String;[B)V

    :cond_1
    return-object v1
.end method

.method protected final a(Ljava/lang/String;[BII)[Lorg/apache/sanselan/common/RationalNumber;
    .locals 4

    mul-int/lit8 v0, p3, 0x8

    add-int/lit8 v0, v0, 0x0

    array-length v1, p2

    if-ge v1, v0, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ": expected length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", actual length: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v2, p2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-array v0, p3, [Lorg/apache/sanselan/common/RationalNumber;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    mul-int/lit8 v2, v1, 0x8

    add-int/lit8 v2, v2, 0x0

    invoke-direct {p0, p1, p2, v2, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->e(Ljava/lang/String;[BII)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method protected final b(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;I)I
    .locals 4

    const/4 v3, 0x2

    new-array v1, v3, [B

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v3, :cond_0

    invoke-virtual {p0, p1, v1, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->c(Ljava/lang/String;[BI)I

    move-result v0

    return v0

    :cond_0
    rsub-int/lit8 v2, v0, 0x2

    invoke-virtual {p2, v1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-gtz v2, :cond_1

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/2addr v0, v2

    goto :goto_0
.end method

.method protected final b(Ljava/lang/String;[BI)I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->f(Ljava/lang/String;[BII)I

    move-result v0

    return v0
.end method

.method protected final b(Ljava/lang/String;[BII)[I
    .locals 4

    mul-int/lit8 v0, p3, 0x4

    add-int/lit8 v0, v0, 0x0

    array-length v1, p2

    if-ge v1, v0, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ": expected length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", actual length: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v2, p2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-array v0, p3, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    mul-int/lit8 v2, v1, 0x4

    add-int/lit8 v2, v2, 0x0

    invoke-direct {p0, p1, p2, v2, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->f(Ljava/lang/String;[BII)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method protected final c(Ljava/lang/String;[BI)I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p3}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/lang/String;I[BI)I

    move-result v0

    return v0
.end method

.method protected final c(Ljava/lang/String;[BII)[I
    .locals 4

    mul-int/lit8 v0, p3, 0x2

    add-int/lit8 v0, v0, 0x0

    array-length v1, p2

    if-ge v1, v0, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ": expected length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", actual length: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v2, p2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-array v0, p3, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    mul-int/lit8 v2, v1, 0x2

    add-int/lit8 v2, v2, 0x0

    invoke-direct {p0, p1, v2, p2, p4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a(Ljava/lang/String;I[BI)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
