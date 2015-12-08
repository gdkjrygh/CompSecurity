.class public Lcom/crashlytics/android/HttpRequest$Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 344
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/crashlytics/android/HttpRequest$Base64;->a:[B

    return-void

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 359
    return-void
.end method

.method private static a([BII[BI)[B
    .locals 5

    .prologue
    const/16 v4, 0x3d

    const/4 v0, 0x0

    .line 394
    sget-object v3, Lcom/crashlytics/android/HttpRequest$Base64;->a:[B

    .line 396
    if-lez p2, :cond_1

    aget-byte v1, p0, p1

    shl-int/lit8 v1, v1, 0x18

    ushr-int/lit8 v1, v1, 0x8

    move v2, v1

    :goto_0
    const/4 v1, 0x1

    if-le p2, v1, :cond_2

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x18

    ushr-int/lit8 v1, v1, 0x10

    :goto_1
    or-int/2addr v1, v2

    const/4 v2, 0x2

    if-le p2, v2, :cond_0

    add-int/lit8 v0, p1, 0x2

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x18

    ushr-int/lit8 v0, v0, 0x18

    :cond_0
    or-int/2addr v0, v1

    .line 400
    packed-switch p2, :pswitch_data_0

    .line 423
    :goto_2
    return-object p3

    :cond_1
    move v2, v0

    .line 396
    goto :goto_0

    :cond_2
    move v1, v0

    goto :goto_1

    .line 402
    :pswitch_0
    ushr-int/lit8 v1, v0, 0x12

    aget-byte v1, v3, v1

    aput-byte v1, p3, p4

    .line 403
    add-int/lit8 v1, p4, 0x1

    ushr-int/lit8 v2, v0, 0xc

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v3, v2

    aput-byte v2, p3, v1

    .line 404
    add-int/lit8 v1, p4, 0x2

    ushr-int/lit8 v2, v0, 0x6

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v3, v2

    aput-byte v2, p3, v1

    .line 405
    add-int/lit8 v1, p4, 0x3

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v3, v0

    aput-byte v0, p3, v1

    goto :goto_2

    .line 409
    :pswitch_1
    ushr-int/lit8 v1, v0, 0x12

    aget-byte v1, v3, v1

    aput-byte v1, p3, p4

    .line 410
    add-int/lit8 v1, p4, 0x1

    ushr-int/lit8 v2, v0, 0xc

    and-int/lit8 v2, v2, 0x3f

    aget-byte v2, v3, v2

    aput-byte v2, p3, v1

    .line 411
    add-int/lit8 v1, p4, 0x2

    ushr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v3, v0

    aput-byte v0, p3, v1

    .line 412
    add-int/lit8 v0, p4, 0x3

    aput-byte v4, p3, v0

    goto :goto_2

    .line 416
    :pswitch_2
    ushr-int/lit8 v1, v0, 0x12

    aget-byte v1, v3, v1

    aput-byte v1, p3, p4

    .line 417
    add-int/lit8 v1, p4, 0x1

    ushr-int/lit8 v0, v0, 0xc

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v3, v0

    aput-byte v0, p3, v1

    .line 418
    add-int/lit8 v0, p4, 0x2

    aput-byte v4, p3, v0

    .line 419
    add-int/lit8 v0, p4, 0x3

    aput-byte v4, p3, v0

    goto :goto_2

    .line 400
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    .line 436
    :try_start_0
    const-string v0, "US-ASCII"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 440
    :goto_0
    invoke-static {v0}, Lcom/crashlytics/android/HttpRequest$Base64;->encodeBytes([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 438
    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_0
.end method

.method public static encodeBytes([B)Ljava/lang/String;
    .locals 2
    .param p0, "source"    # [B

    .prologue
    .line 456
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/crashlytics/android/HttpRequest$Base64;->encodeBytes([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encodeBytes([BII)Ljava/lang/String;
    .locals 3
    .param p0, "source"    # [B
    .param p1, "off"    # I
    .param p2, "len"    # I

    .prologue
    .line 476
    invoke-static {p0, p1, p2}, Lcom/crashlytics/android/HttpRequest$Base64;->encodeBytesToBytes([BII)[B

    move-result-object v1

    .line 478
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v2, "US-ASCII"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 480
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method public static encodeBytesToBytes([BII)[B
    .locals 7
    .param p0, "source"    # [B
    .param p1, "off"    # I
    .param p2, "len"    # I

    .prologue
    const/4 v6, 0x3

    const/4 v1, 0x0

    .line 505
    if-nez p0, :cond_0

    .line 506
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot serialize a null array."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 508
    :cond_0
    if-gez p1, :cond_1

    .line 509
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot have negative offset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 512
    :cond_1
    if-gez p2, :cond_2

    .line 513
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot have length offset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 515
    :cond_2
    add-int v0, p1, p2

    array-length v2, p0

    if-le v0, v2, :cond_3

    .line 516
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot have offset of %d and length of %d with array of length %d"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x2

    array-length v4, p0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 523
    :cond_3
    div-int/lit8 v0, p2, 0x3

    shl-int/lit8 v2, v0, 0x2

    rem-int/lit8 v0, p2, 0x3

    if-lez v0, :cond_4

    const/4 v0, 0x4

    :goto_0
    add-int/2addr v0, v2

    .line 525
    new-array v3, v0, [B

    .line 529
    add-int/lit8 v4, p2, -0x2

    move v0, v1

    move v2, v1

    .line 530
    :goto_1
    if-ge v2, v4, :cond_5

    .line 531
    add-int v5, v2, p1

    invoke-static {p0, v5, v6, v3, v0}, Lcom/crashlytics/android/HttpRequest$Base64;->a([BII[BI)[B

    .line 530
    add-int/lit8 v2, v2, 0x3

    add-int/lit8 v0, v0, 0x4

    goto :goto_1

    :cond_4
    move v0, v1

    .line 523
    goto :goto_0

    .line 533
    :cond_5
    if-ge v2, p2, :cond_6

    .line 534
    add-int v4, v2, p1

    sub-int v2, p2, v2

    invoke-static {p0, v4, v2, v3, v0}, Lcom/crashlytics/android/HttpRequest$Base64;->a([BII[BI)[B

    .line 535
    add-int/lit8 v0, v0, 0x4

    .line 538
    :cond_6
    array-length v2, v3

    add-int/lit8 v2, v2, -0x1

    if-gt v0, v2, :cond_7

    .line 539
    new-array v2, v0, [B

    .line 540
    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v2

    .line 543
    :goto_2
    return-object v0

    :cond_7
    move-object v0, v3

    goto :goto_2
.end method
