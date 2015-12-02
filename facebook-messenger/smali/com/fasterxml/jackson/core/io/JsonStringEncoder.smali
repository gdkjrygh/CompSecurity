.class public final Lcom/fasterxml/jackson/core/io/JsonStringEncoder;
.super Ljava/lang/Object;
.source "JsonStringEncoder.java"


# static fields
.field private static final HEX_BYTES:[B

.field private static final HEX_CHARS:[C

.field private static final INT_0:I = 0x30

.field private static final INT_BACKSLASH:I = 0x5c

.field private static final INT_U:I = 0x75

.field private static final SURR1_FIRST:I = 0xd800

.field private static final SURR1_LAST:I = 0xdbff

.field private static final SURR2_FIRST:I = 0xdc00

.field private static final SURR2_LAST:I = 0xdfff

.field protected static final _threadEncoder:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Lcom/fasterxml/jackson/core/io/JsonStringEncoder;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field protected _byteBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

.field protected final _quoteBuffer:[C

.field protected _textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    invoke-static {}, Lcom/fasterxml/jackson/core/io/CharTypes;->copyHexChars()[C

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_CHARS:[C

    .line 21
    invoke-static {}, Lcom/fasterxml/jackson/core/io/CharTypes;->copyHexBytes()[B

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_BYTES:[B

    .line 37
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_threadEncoder:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/16 v3, 0x30

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x6

    new-array v0, v0, [C

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    .line 66
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    const/4 v1, 0x0

    const/16 v2, 0x5c

    aput-char v2, v0, v1

    .line 67
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    const/4 v1, 0x2

    aput-char v3, v0, v1

    .line 68
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    const/4 v1, 0x3

    aput-char v3, v0, v1

    .line 69
    return-void
.end method

.method private _appendByteEscape(IILcom/fasterxml/jackson/core/util/ByteArrayBuilder;I)I
    .locals 3

    .prologue
    const/16 v1, 0x30

    .line 356
    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->setCurrentSegmentLength(I)V

    .line 357
    const/16 v0, 0x5c

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 358
    if-gez p2, :cond_1

    .line 359
    const/16 v0, 0x75

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 360
    const/16 v0, 0xff

    if-le p1, v0, :cond_0

    .line 361
    shr-int/lit8 v0, p1, 0x8

    .line 362
    sget-object v1, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_BYTES:[B

    shr-int/lit8 v2, v0, 0x4

    aget-byte v1, v1, v2

    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 363
    sget-object v1, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_BYTES:[B

    and-int/lit8 v0, v0, 0xf

    aget-byte v0, v1, v0

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 364
    and-int/lit16 p1, p1, 0xff

    .line 369
    :goto_0
    sget-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_BYTES:[B

    shr-int/lit8 v1, p1, 0x4

    aget-byte v0, v0, v1

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 370
    sget-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_BYTES:[B

    and-int/lit8 v1, p1, 0xf

    aget-byte v0, v0, v1

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 374
    :goto_1
    invoke-virtual {p3}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->getCurrentSegmentLength()I

    move-result v0

    return v0

    .line 366
    :cond_0
    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 367
    invoke-virtual {p3, v1}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    goto :goto_0

    .line 372
    :cond_1
    int-to-byte v0, p2

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    goto :goto_1
.end method

.method private _appendSingleEscape(I[C)I
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 342
    if-gez p1, :cond_0

    .line 343
    add-int/lit8 v0, p1, 0x1

    neg-int v0, v0

    .line 344
    const/16 v1, 0x75

    aput-char v1, p2, v2

    .line 346
    const/4 v1, 0x4

    sget-object v2, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_CHARS:[C

    shr-int/lit8 v3, v0, 0x4

    aget-char v2, v2, v3

    aput-char v2, p2, v1

    .line 347
    const/4 v1, 0x5

    sget-object v2, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HEX_CHARS:[C

    and-int/lit8 v0, v0, 0xf

    aget-char v0, v2, v0

    aput-char v0, p2, v1

    .line 348
    const/4 v0, 0x6

    .line 351
    :goto_0
    return v0

    .line 350
    :cond_0
    int-to-char v0, p1

    aput-char v0, p2, v2

    .line 351
    const/4 v0, 0x2

    goto :goto_0
.end method

.method private _convertSurrogate(II)I
    .locals 3

    .prologue
    const v2, 0xdc00

    .line 383
    if-lt p2, v2, :cond_0

    const v0, 0xdfff

    if-le p2, v0, :cond_1

    .line 384
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Broken surrogate pair: first char 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", second 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; illegal combination"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 386
    :cond_1
    const/high16 v0, 0x10000

    const v1, 0xd800

    sub-int v1, p1, v1

    shl-int/lit8 v1, v1, 0xa

    add-int/2addr v0, v1

    sub-int v1, p2, v2

    add-int/2addr v0, v1

    return v0
.end method

.method private _throwIllegalSurrogate(I)V
    .locals 3

    .prologue
    .line 391
    const v0, 0x10ffff

    if-le p1, v0, :cond_0

    .line 392
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal character point (0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") to output; max is 0x10FFFF as per RFC 4627"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 394
    :cond_0
    const v0, 0xd800

    if-lt p1, v0, :cond_2

    .line 395
    const v0, 0xdbff

    if-gt p1, v0, :cond_1

    .line 396
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unmatched first part of surrogate pair (0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 398
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unmatched second part of surrogate pair (0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 401
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal character point (0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") to output"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getInstance()Lcom/fasterxml/jackson/core/io/JsonStringEncoder;
    .locals 3

    .prologue
    .line 77
    sget-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_threadEncoder:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 78
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 80
    :goto_0
    if-nez v0, :cond_0

    .line 81
    new-instance v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;-><init>()V

    .line 82
    sget-object v1, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_threadEncoder:Ljava/lang/ThreadLocal;

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 84
    :cond_0
    return-object v0

    .line 78
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;

    goto :goto_0
.end method


# virtual methods
.method public encodeAsUTF8(Ljava/lang/String;)[B
    .locals 11

    .prologue
    const/4 v4, 0x0

    .line 250
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_byteBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    .line 251
    if-nez v0, :cond_0

    .line 253
    new-instance v0, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;-><init>(Lcom/fasterxml/jackson/core/util/BufferRecycler;)V

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_byteBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    .line 256
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v9

    .line 258
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->resetAndGetFirstSegment()[B

    move-result-object v3

    .line 259
    array-length v2, v3

    move v1, v4

    move v6, v4

    .line 262
    :goto_0
    if-ge v6, v9, :cond_f

    .line 263
    add-int/lit8 v7, v6, 0x1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move v10, v2

    move-object v2, v3

    move v3, v1

    move v1, v10

    .line 266
    :goto_1
    const/16 v5, 0x7f

    if-gt v6, v5, :cond_3

    .line 267
    if-lt v3, v1, :cond_1

    .line 268
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v2

    .line 269
    array-length v1, v2

    move v3, v4

    .line 272
    :cond_1
    add-int/lit8 v5, v3, 0x1

    int-to-byte v6, v6

    aput-byte v6, v2, v3

    .line 273
    if-lt v7, v9, :cond_2

    move v0, v5

    .line 331
    :goto_2
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_byteBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->completeAndCoalesce(I)[B

    move-result-object v0

    return-object v0

    .line 276
    :cond_2
    add-int/lit8 v3, v7, 0x1

    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move v7, v3

    move v3, v5

    goto :goto_1

    .line 280
    :cond_3
    if-lt v3, v1, :cond_e

    .line 281
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v2

    .line 282
    array-length v1, v2

    move v5, v4

    .line 285
    :goto_3
    const/16 v3, 0x800

    if-ge v6, v3, :cond_5

    .line 286
    add-int/lit8 v3, v5, 0x1

    shr-int/lit8 v8, v6, 0x6

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    aput-byte v8, v2, v5

    move v5, v6

    move v6, v7

    .line 324
    :goto_4
    if-lt v3, v1, :cond_4

    .line 325
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v2

    .line 326
    array-length v1, v2

    move v3, v4

    .line 329
    :cond_4
    add-int/lit8 v7, v3, 0x1

    and-int/lit8 v5, v5, 0x3f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    move-object v3, v2

    move v2, v1

    move v1, v7

    .line 330
    goto :goto_0

    .line 289
    :cond_5
    const v3, 0xd800

    if-lt v6, v3, :cond_6

    const v3, 0xdfff

    if-le v6, v3, :cond_8

    .line 290
    :cond_6
    add-int/lit8 v3, v5, 0x1

    shr-int/lit8 v8, v6, 0xc

    or-int/lit16 v8, v8, 0xe0

    int-to-byte v8, v8

    aput-byte v8, v2, v5

    .line 291
    if-lt v3, v1, :cond_7

    .line 292
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v2

    .line 293
    array-length v1, v2

    move v3, v4

    .line 296
    :cond_7
    add-int/lit8 v5, v3, 0x1

    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v2, v3

    move v3, v5

    move v5, v6

    move v6, v7

    goto :goto_4

    .line 298
    :cond_8
    const v3, 0xdbff

    if-le v6, v3, :cond_9

    .line 299
    invoke-direct {p0, v6}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_throwIllegalSurrogate(I)V

    .line 302
    :cond_9
    if-lt v7, v9, :cond_a

    .line 303
    invoke-direct {p0, v6}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_throwIllegalSurrogate(I)V

    .line 305
    :cond_a
    add-int/lit8 v8, v7, 0x1

    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-direct {p0, v6, v3}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_convertSurrogate(II)I

    move-result v6

    .line 306
    const v3, 0x10ffff

    if-le v6, v3, :cond_b

    .line 307
    invoke-direct {p0, v6}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_throwIllegalSurrogate(I)V

    .line 309
    :cond_b
    add-int/lit8 v3, v5, 0x1

    shr-int/lit8 v7, v6, 0x12

    or-int/lit16 v7, v7, 0xf0

    int-to-byte v7, v7

    aput-byte v7, v2, v5

    .line 310
    if-lt v3, v1, :cond_c

    .line 311
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v2

    .line 312
    array-length v1, v2

    move v3, v4

    .line 315
    :cond_c
    add-int/lit8 v5, v3, 0x1

    shr-int/lit8 v7, v6, 0xc

    and-int/lit8 v7, v7, 0x3f

    or-int/lit16 v7, v7, 0x80

    int-to-byte v7, v7

    aput-byte v7, v2, v3

    .line 316
    if-lt v5, v1, :cond_d

    .line 317
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v2

    .line 318
    array-length v1, v2

    move v3, v4

    .line 321
    :goto_5
    add-int/lit8 v5, v3, 0x1

    shr-int/lit8 v7, v6, 0x6

    and-int/lit8 v7, v7, 0x3f

    or-int/lit16 v7, v7, 0x80

    int-to-byte v7, v7

    aput-byte v7, v2, v3

    move v3, v5

    move v5, v6

    move v6, v8

    goto/16 :goto_4

    :cond_d
    move v3, v5

    goto :goto_5

    :cond_e
    move v5, v3

    goto/16 :goto_3

    :cond_f
    move v0, v1

    goto/16 :goto_2
.end method

.method public quoteAsString(Ljava/lang/String;)[C
    .locals 11

    .prologue
    const/4 v5, 0x0

    .line 99
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    .line 100
    if-nez v0, :cond_0

    .line 102
    new-instance v0, Lcom/fasterxml/jackson/core/util/TextBuffer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;-><init>(Lcom/fasterxml/jackson/core/util/BufferRecycler;)V

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    .line 104
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v3

    .line 105
    invoke-static {}, Lcom/fasterxml/jackson/core/io/CharTypes;->get7BitOutputEscapes()[I

    move-result-object v6

    .line 106
    array-length v7, v6

    .line 108
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    move v1, v5

    move v2, v5

    .line 112
    :goto_0
    if-ge v2, v8, :cond_4

    .line 115
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 116
    if-ge v9, v7, :cond_3

    aget v4, v6, v9

    if-eqz v4, :cond_3

    .line 129
    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    aget v2, v6, v2

    .line 130
    iget-object v9, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    invoke-direct {p0, v2, v9}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_appendSingleEscape(I[C)I

    move-result v2

    .line 131
    add-int v9, v1, v2

    array-length v10, v3

    if-le v9, v10, :cond_5

    .line 132
    array-length v9, v3

    sub-int/2addr v9, v1

    .line 133
    if-lez v9, :cond_2

    .line 134
    iget-object v10, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    invoke-static {v10, v5, v3, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 136
    :cond_2
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v3

    .line 137
    sub-int v1, v2, v9

    .line 138
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    invoke-static {v2, v9, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    move v2, v4

    .line 144
    goto :goto_0

    .line 119
    :cond_3
    array-length v4, v3

    if-lt v1, v4, :cond_6

    .line 120
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v3

    move v4, v5

    .line 123
    :goto_2
    add-int/lit8 v1, v4, 0x1

    aput-char v9, v3, v4

    .line 124
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v8, :cond_1

    .line 145
    :cond_4
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 146
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsArray()[C

    move-result-object v0

    return-object v0

    .line 141
    :cond_5
    iget-object v9, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_quoteBuffer:[C

    invoke-static {v9, v5, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    add-int/2addr v1, v2

    goto :goto_1

    :cond_6
    move v4, v1

    goto :goto_2
.end method

.method public quoteAsUTF8(Ljava/lang/String;)[B
    .locals 11

    .prologue
    const/16 v9, 0x7f

    const/4 v5, 0x0

    .line 155
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_byteBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    .line 156
    if-nez v0, :cond_0

    .line 158
    new-instance v0, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;-><init>(Lcom/fasterxml/jackson/core/util/BufferRecycler;)V

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_byteBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    .line 161
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    .line 163
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->resetAndGetFirstSegment()[B

    move-result-object v1

    move v2, v5

    move v3, v5

    .line 166
    :goto_0
    if-ge v3, v7, :cond_5

    .line 167
    invoke-static {}, Lcom/fasterxml/jackson/core/io/CharTypes;->get7BitOutputEscapes()[I

    move-result-object v6

    .line 171
    :cond_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 172
    if-gt v8, v9, :cond_2

    aget v4, v6, v8

    if-eqz v4, :cond_4

    .line 184
    :cond_2
    array-length v4, v1

    if-lt v2, v4, :cond_3

    .line 185
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v2, v5

    .line 189
    :cond_3
    add-int/lit8 v4, v3, 0x1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 190
    if-gt v8, v9, :cond_6

    .line 191
    aget v1, v6, v8

    .line 193
    invoke-direct {p0, v8, v1, v0, v2}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_appendByteEscape(IILcom/fasterxml/jackson/core/util/ByteArrayBuilder;I)I

    move-result v2

    .line 194
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->getCurrentSegment()[B

    move-result-object v1

    move v3, v4

    .line 195
    goto :goto_0

    .line 175
    :cond_4
    array-length v4, v1

    if-lt v2, v4, :cond_11

    .line 176
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v4, v5

    .line 179
    :goto_1
    add-int/lit8 v2, v4, 0x1

    int-to-byte v8, v8

    aput-byte v8, v1, v4

    .line 180
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v7, :cond_1

    .line 241
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_byteBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->completeAndCoalesce(I)[B

    move-result-object v0

    return-object v0

    .line 196
    :cond_6
    const/16 v3, 0x7ff

    if-gt v8, v3, :cond_8

    .line 197
    add-int/lit8 v3, v2, 0x1

    shr-int/lit8 v6, v8, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    aput-byte v6, v1, v2

    .line 198
    and-int/lit8 v2, v8, 0x3f

    or-int/lit16 v2, v2, 0x80

    move v10, v2

    move-object v2, v1

    move v1, v10

    .line 235
    :goto_2
    array-length v6, v2

    if-lt v3, v6, :cond_7

    .line 236
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v2

    move v3, v5

    .line 239
    :cond_7
    add-int/lit8 v6, v3, 0x1

    int-to-byte v1, v1

    aput-byte v1, v2, v3

    move-object v1, v2

    move v3, v4

    move v2, v6

    .line 240
    goto :goto_0

    .line 201
    :cond_8
    const v3, 0xd800

    if-lt v8, v3, :cond_9

    const v3, 0xdfff

    if-le v8, v3, :cond_a

    .line 202
    :cond_9
    add-int/lit8 v3, v2, 0x1

    shr-int/lit8 v6, v8, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    aput-byte v6, v1, v2

    .line 203
    array-length v2, v1

    if-lt v3, v2, :cond_10

    .line 204
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v2, v5

    .line 207
    :goto_3
    add-int/lit8 v3, v2, 0x1

    shr-int/lit8 v6, v8, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/lit16 v6, v6, 0x80

    int-to-byte v6, v6

    aput-byte v6, v1, v2

    .line 208
    and-int/lit8 v2, v8, 0x3f

    or-int/lit16 v2, v2, 0x80

    move v10, v2

    move-object v2, v1

    move v1, v10

    goto :goto_2

    .line 210
    :cond_a
    const v3, 0xdbff

    if-le v8, v3, :cond_b

    .line 211
    invoke-direct {p0, v8}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_throwIllegalSurrogate(I)V

    .line 214
    :cond_b
    if-lt v4, v7, :cond_c

    .line 215
    invoke-direct {p0, v8}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_throwIllegalSurrogate(I)V

    .line 217
    :cond_c
    add-int/lit8 v6, v4, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-direct {p0, v8, v3}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_convertSurrogate(II)I

    move-result v4

    .line 218
    const v3, 0x10ffff

    if-le v4, v3, :cond_d

    .line 219
    invoke-direct {p0, v4}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_throwIllegalSurrogate(I)V

    .line 221
    :cond_d
    add-int/lit8 v3, v2, 0x1

    shr-int/lit8 v8, v4, 0x12

    or-int/lit16 v8, v8, 0xf0

    int-to-byte v8, v8

    aput-byte v8, v1, v2

    .line 222
    array-length v2, v1

    if-lt v3, v2, :cond_f

    .line 223
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v2, v5

    .line 226
    :goto_4
    add-int/lit8 v3, v2, 0x1

    shr-int/lit8 v8, v4, 0xc

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v1, v2

    .line 227
    array-length v2, v1

    if-lt v3, v2, :cond_e

    .line 228
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v2, v5

    .line 231
    :goto_5
    add-int/lit8 v3, v2, 0x1

    shr-int/lit8 v8, v4, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v1, v2

    .line 232
    and-int/lit8 v2, v4, 0x3f

    or-int/lit16 v2, v2, 0x80

    move v4, v6

    move-object v10, v1

    move v1, v2

    move-object v2, v10

    goto/16 :goto_2

    :cond_e
    move v2, v3

    goto :goto_5

    :cond_f
    move v2, v3

    goto :goto_4

    :cond_10
    move v2, v3

    goto :goto_3

    :cond_11
    move v4, v2

    goto/16 :goto_1
.end method
