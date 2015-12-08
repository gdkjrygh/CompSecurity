.class public final Lorg/bouncycastle/util/Strings;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 9

    const/16 v8, 0xf0

    const/16 v7, 0xe0

    const/16 v6, 0xc0

    const/4 v1, 0x0

    move v0, v1

    move v2, v1

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_3

    add-int/lit8 v0, v0, 0x1

    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xf0

    if-ne v3, v8, :cond_0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, v2, 0x4

    goto :goto_0

    :cond_0
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xe0

    if-ne v3, v7, :cond_1

    add-int/lit8 v2, v2, 0x3

    goto :goto_0

    :cond_1
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xc0

    if-ne v3, v6, :cond_2

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-array v4, v0, [C

    move v0, v1

    :goto_1
    array-length v2, p0

    if-ge v0, v2, :cond_8

    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xf0

    if-ne v2, v8, :cond_4

    aget-byte v2, p0, v0

    and-int/lit8 v2, v2, 0x3

    shl-int/lit8 v2, v2, 0x12

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, p0, v3

    and-int/lit8 v3, v3, 0x3f

    shl-int/lit8 v3, v3, 0xc

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, p0, v3

    and-int/lit8 v3, v3, 0x3f

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x3

    aget-byte v3, p0, v3

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v2, v3

    const/high16 v3, 0x10000

    sub-int/2addr v2, v3

    const v3, 0xd800

    shr-int/lit8 v5, v2, 0xa

    or-int/2addr v3, v5

    int-to-char v5, v3

    const v3, 0xdc00

    and-int/lit16 v2, v2, 0x3ff

    or-int/2addr v2, v3

    int-to-char v2, v2

    add-int/lit8 v3, v1, 0x1

    aput-char v5, v4, v1

    add-int/lit8 v0, v0, 0x4

    :goto_2
    add-int/lit8 v1, v3, 0x1

    aput-char v2, v4, v3

    goto :goto_1

    :cond_4
    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xe0

    if-ne v2, v7, :cond_5

    aget-byte v2, p0, v0

    and-int/lit8 v2, v2, 0xf

    shl-int/lit8 v2, v2, 0xc

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, p0, v3

    and-int/lit8 v3, v3, 0x3f

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, p0, v3

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v2, v3

    int-to-char v2, v2

    add-int/lit8 v0, v0, 0x3

    move v3, v1

    goto :goto_2

    :cond_5
    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xd0

    const/16 v3, 0xd0

    if-ne v2, v3, :cond_6

    aget-byte v2, p0, v0

    and-int/lit8 v2, v2, 0x1f

    shl-int/lit8 v2, v2, 0x6

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, p0, v3

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v2, v3

    int-to-char v2, v2

    add-int/lit8 v0, v0, 0x2

    move v3, v1

    goto :goto_2

    :cond_6
    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xc0

    if-ne v2, v6, :cond_7

    aget-byte v2, p0, v0

    and-int/lit8 v2, v2, 0x1f

    shl-int/lit8 v2, v2, 0x6

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, p0, v3

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v2, v3

    int-to-char v2, v2

    add-int/lit8 v0, v0, 0x2

    move v3, v1

    goto :goto_2

    :cond_7
    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xff

    int-to-char v2, v2

    add-int/lit8 v0, v0, 0x1

    move v3, v1

    goto :goto_2

    :cond_8
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->a([C)[B

    move-result-object v0

    return-object v0
.end method

.method public static a([C)[B
    .locals 5

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_5

    aget-char v2, p0, v0

    const/16 v3, 0x80

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v3, 0x800

    if-ge v2, v3, :cond_1

    shr-int/lit8 v3, v2, 0x6

    or-int/lit16 v3, v3, 0xc0

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_1
    const v3, 0xd800

    if-lt v2, v3, :cond_4

    const v3, 0xdfff

    if-gt v2, v3, :cond_4

    add-int/lit8 v3, v0, 0x1

    array-length v4, p0

    if-lt v3, v4, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "invalid UTF-16 codepoint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    aget-char v3, p0, v0

    const v4, 0xdbff

    if-le v2, v4, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "invalid UTF-16 codepoint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    and-int/lit16 v2, v2, 0x3ff

    shl-int/lit8 v2, v2, 0xa

    and-int/lit16 v3, v3, 0x3ff

    or-int/2addr v2, v3

    const/high16 v3, 0x10000

    add-int/2addr v2, v3

    shr-int/lit8 v3, v2, 0x12

    or-int/lit16 v3, v3, 0xf0

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    shr-int/lit8 v3, v2, 0xc

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    shr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_4
    shr-int/lit8 v3, v2, 0xc

    or-int/lit16 v3, v3, 0xe0

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    shr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    move v1, v0

    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_1

    aget-char v3, v2, v0

    const/16 v4, 0x61

    if-gt v4, v3, :cond_0

    const/16 v4, 0x7a

    if-lt v4, v3, :cond_0

    const/4 v1, 0x1

    add-int/lit8 v3, v3, -0x61

    add-int/lit8 v3, v3, 0x41

    int-to-char v3, v3

    aput-char v3, v2, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    :cond_2
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    move v1, v0

    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_1

    aget-char v3, v2, v0

    const/16 v4, 0x41

    if-gt v4, v3, :cond_0

    const/16 v4, 0x5a

    if-lt v4, v3, :cond_0

    const/4 v1, 0x1

    add-int/lit8 v3, v3, -0x41

    add-int/lit8 v3, v3, 0x61

    int-to-char v3, v3

    aput-char v3, v2, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    :cond_2
    return-object p0
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    new-array v1, v0, [B

    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static e(Ljava/lang/String;)[Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_1

    const/16 v3, 0x2e

    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v1

    new-array v3, v1, [Ljava/lang/String;

    move v1, v0

    :goto_1
    array-length v0, v3

    if-eq v1, v0, :cond_2

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v3, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    return-object v3
.end method
