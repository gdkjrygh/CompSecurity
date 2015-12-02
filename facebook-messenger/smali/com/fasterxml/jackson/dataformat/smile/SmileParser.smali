.class public Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
.super Lcom/fasterxml/jackson/core/base/ParserBase;
.source "SmileParser.java"


# static fields
.field private static final NO_INTS:[I

.field private static final NO_STRINGS:[Ljava/lang/String;

.field protected static final _smileRecyclerRef:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler",
            "<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected _bufferRecyclable:Z

.field protected _got32BitFloat:Z

.field protected _inputBuffer:[B

.field protected _inputStream:Ljava/io/InputStream;

.field protected _mayContainRawBinary:Z

.field protected _objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

.field protected _quad1:I

.field protected _quad2:I

.field protected _quadBuffer:[I

.field protected _seenNameCount:I

.field protected _seenNames:[Ljava/lang/String;

.field protected _seenStringValueCount:I

.field protected _seenStringValues:[Ljava/lang/String;

.field protected final _smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final _symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

.field protected _tokenIncomplete:Z

.field protected _typeByte:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 62
    new-array v0, v1, [I

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->NO_INTS:[I

    .line 64
    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->NO_STRINGS:[Ljava/lang/String;

    .line 197
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileRecyclerRef:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;IILcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;Ljava/io/InputStream;[BIIZ)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 212
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/core/base/ParserBase;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;I)V

    .line 132
    iput-boolean v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 161
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->NO_INTS:[I

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    .line 173
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->NO_STRINGS:[Ljava/lang/String;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 175
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    .line 182
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    .line 184
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    .line 213
    iput-object p4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    .line 214
    iput-object p5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    .line 216
    iput-object p6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    .line 217
    iput-object p7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 218
    iput p8, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 219
    iput p9, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    .line 220
    iput-boolean p10, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_bufferRecyclable:Z

    .line 222
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenInputRow:I

    .line 223
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenInputCol:I

    .line 224
    invoke-static {}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileBufferRecycler()Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    .line 225
    return-void
.end method

.method private final _addDecodedToSymbols(ILjava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1348
    const/4 v0, 0x5

    if-ge p1, v0, :cond_0

    .line 1349
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quad1:I

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->addName(Ljava/lang/String;II)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/sym/Name;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1355
    :goto_0
    return-object v0

    .line 1351
    :cond_0
    const/16 v0, 0x9

    if-ge p1, v0, :cond_1

    .line 1352
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quad1:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quad2:I

    invoke-virtual {v0, p2, v1, v2}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->addName(Ljava/lang/String;II)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/sym/Name;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1354
    :cond_1
    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v0, v0, 0x2

    .line 1355
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    invoke-virtual {v1, p2, v2, v0}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->addName(Ljava/lang/String;[II)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/sym/Name;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private final _addSeenStringValue()V
    .locals 3

    .prologue
    .line 713
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishToken()V

    .line 714
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 716
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 720
    :goto_0
    return-void

    .line 719
    :cond_0
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenStringValues()V

    goto :goto_0
.end method

.method private final _decodeLongAscii()V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 2132
    .line 2133
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v0

    move v1, v2

    .line 2136
    :goto_0
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v3, v4, :cond_0

    .line 2137
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2139
    :cond_0
    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2140
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    sub-int/2addr v3, v4

    .line 2141
    array-length v5, v0

    if-lt v1, v5, :cond_1

    .line 2142
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v0

    move v1, v2

    .line 2145
    :cond_1
    array-length v5, v0

    sub-int/2addr v5, v1

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    move v5, v1

    move v1, v4

    .line 2147
    :goto_1
    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    add-int/lit8 v4, v1, 0x1

    aget-byte v6, v6, v1

    .line 2148
    const/4 v1, -0x4

    if-ne v6, v1, :cond_2

    .line 2149
    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2156
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 2157
    return-void

    .line 2152
    :cond_2
    add-int/lit8 v1, v5, 0x1

    int-to-char v6, v6

    aput-char v6, v0, v5

    .line 2153
    add-int/lit8 v3, v3, -0x1

    if-gtz v3, :cond_3

    .line 2154
    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    goto :goto_0

    :cond_3
    move v5, v1

    move v1, v4

    goto :goto_1
.end method

.method private final _decodeLongUnicode()V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 2162
    .line 2163
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v0

    .line 2164
    sget-object v7, Lcom/fasterxml/jackson/dataformat/smile/SmileConstants;->sUtf8UnitLengths:[I

    .line 2166
    iget-object v8, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    move v1, v2

    .line 2173
    :goto_0
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2174
    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v3, v4, :cond_0

    .line 2175
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2176
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2178
    :cond_0
    array-length v4, v0

    if-lt v1, v4, :cond_1

    .line 2179
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v0

    move v1, v2

    .line 2182
    :cond_1
    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    .line 2184
    array-length v4, v0

    sub-int/2addr v4, v1

    add-int/2addr v4, v3

    .line 2185
    if-ge v4, v5, :cond_8

    .line 2189
    :goto_1
    if-ge v3, v4, :cond_3

    .line 2190
    add-int/lit8 v5, v3, 0x1

    aget-byte v3, v8, v3

    and-int/lit16 v3, v3, 0xff

    .line 2191
    aget v6, v7, v3

    if-eqz v6, :cond_2

    .line 2192
    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2200
    const/16 v4, 0xfc

    if-ne v3, v4, :cond_4

    .line 2238
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 2239
    return-void

    .line 2195
    :cond_2
    add-int/lit8 v6, v1, 0x1

    int-to-char v3, v3

    aput-char v3, v0, v1

    move v3, v5

    move v1, v6

    goto :goto_1

    .line 2197
    :cond_3
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    goto :goto_0

    .line 2204
    :cond_4
    aget v4, v7, v3

    packed-switch v4, :pswitch_data_0

    .line 2228
    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidChar(I)V

    .line 2231
    :goto_2
    array-length v4, v0

    if-lt v1, v4, :cond_6

    .line 2232
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v0

    move v4, v2

    .line 2236
    :goto_3
    add-int/lit8 v1, v4, 0x1

    int-to-char v3, v3

    aput-char v3, v0, v4

    goto :goto_0

    .line 2206
    :pswitch_0
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeUtf8_2(I)I

    move-result v3

    goto :goto_2

    .line 2209
    :pswitch_1
    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v4, v5

    const/4 v5, 0x2

    if-lt v4, v5, :cond_5

    .line 2210
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeUtf8_3fast(I)I

    move-result v3

    goto :goto_2

    .line 2212
    :cond_5
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeUtf8_3(I)I

    move-result v3

    goto :goto_2

    .line 2216
    :pswitch_2
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeUtf8_4(I)I

    move-result v4

    .line 2218
    add-int/lit8 v3, v1, 0x1

    const v5, 0xd800

    shr-int/lit8 v6, v4, 0xa

    or-int/2addr v5, v6

    int-to-char v5, v5

    aput-char v5, v0, v1

    .line 2219
    array-length v1, v0

    if-lt v3, v1, :cond_7

    .line 2220
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v0

    move v1, v2

    .line 2223
    :goto_4
    const v3, 0xdc00

    and-int/lit16 v4, v4, 0x3ff

    or-int/2addr v3, v4

    .line 2225
    goto :goto_2

    :cond_6
    move v4, v1

    goto :goto_3

    :cond_7
    move v1, v3

    goto :goto_4

    :cond_8
    move v4, v5

    goto :goto_1

    .line 2204
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private final _decodeLongUnicodeName([III)Lcom/fasterxml/jackson/core/sym/Name;
    .locals 11

    .prologue
    .line 1443
    and-int/lit8 v6, p2, 0x3

    .line 1452
    const/4 v0, 0x4

    if-ge v6, v0, :cond_7

    .line 1453
    add-int/lit8 v0, p3, -0x1

    aget v0, p1, v0

    .line 1455
    add-int/lit8 v1, p3, -0x1

    rsub-int/lit8 v2, v6, 0x4

    shl-int/lit8 v2, v2, 0x3

    shl-int v2, v0, v2

    aput v2, p1, v1

    .line 1460
    :goto_0
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v1

    .line 1461
    const/4 v5, 0x0

    .line 1463
    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v3, p2, :cond_b

    .line 1464
    shr-int/lit8 v2, v3, 0x2

    aget v2, p1, v2

    .line 1465
    and-int/lit8 v4, v3, 0x3

    .line 1466
    rsub-int/lit8 v4, v4, 0x3

    shl-int/lit8 v4, v4, 0x3

    shr-int/2addr v2, v4

    and-int/lit16 v2, v2, 0xff

    .line 1467
    add-int/lit8 v3, v3, 0x1

    .line 1469
    const/16 v4, 0x7f

    if-le v2, v4, :cond_d

    .line 1471
    and-int/lit16 v4, v2, 0xe0

    const/16 v7, 0xc0

    if-ne v4, v7, :cond_8

    .line 1472
    and-int/lit8 v4, v2, 0x1f

    .line 1473
    const/4 v2, 0x1

    move v10, v2

    move v2, v4

    move v4, v10

    .line 1484
    :goto_2
    add-int v7, v3, v4

    if-le v7, p2, :cond_0

    .line 1485
    const-string v7, " in long field name"

    invoke-virtual {p0, v7}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidEOF(Ljava/lang/String;)V

    .line 1489
    :cond_0
    shr-int/lit8 v7, v3, 0x2

    aget v7, p1, v7

    .line 1490
    and-int/lit8 v8, v3, 0x3

    .line 1491
    rsub-int/lit8 v8, v8, 0x3

    shl-int/lit8 v8, v8, 0x3

    shr-int/2addr v7, v8

    .line 1492
    add-int/lit8 v3, v3, 0x1

    .line 1494
    and-int/lit16 v8, v7, 0xc0

    const/16 v9, 0x80

    if-eq v8, v9, :cond_1

    .line 1495
    invoke-virtual {p0, v7}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(I)V

    .line 1497
    :cond_1
    shl-int/lit8 v2, v2, 0x6

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v2, v7

    .line 1498
    const/4 v7, 0x1

    if-le v4, v7, :cond_4

    .line 1499
    shr-int/lit8 v7, v3, 0x2

    aget v7, p1, v7

    .line 1500
    and-int/lit8 v8, v3, 0x3

    .line 1501
    rsub-int/lit8 v8, v8, 0x3

    shl-int/lit8 v8, v8, 0x3

    shr-int/2addr v7, v8

    .line 1502
    add-int/lit8 v3, v3, 0x1

    .line 1504
    and-int/lit16 v8, v7, 0xc0

    const/16 v9, 0x80

    if-eq v8, v9, :cond_2

    .line 1505
    invoke-virtual {p0, v7}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(I)V

    .line 1507
    :cond_2
    shl-int/lit8 v2, v2, 0x6

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v2, v7

    .line 1508
    const/4 v7, 0x2

    if-le v4, v7, :cond_4

    .line 1509
    shr-int/lit8 v7, v3, 0x2

    aget v7, p1, v7

    .line 1510
    and-int/lit8 v8, v3, 0x3

    .line 1511
    rsub-int/lit8 v8, v8, 0x3

    shl-int/lit8 v8, v8, 0x3

    shr-int/2addr v7, v8

    .line 1512
    add-int/lit8 v3, v3, 0x1

    .line 1513
    and-int/lit16 v8, v7, 0xc0

    const/16 v9, 0x80

    if-eq v8, v9, :cond_3

    .line 1514
    and-int/lit16 v8, v7, 0xff

    invoke-virtual {p0, v8}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(I)V

    .line 1516
    :cond_3
    shl-int/lit8 v2, v2, 0x6

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v2, v7

    .line 1519
    :cond_4
    const/4 v7, 0x2

    if-le v4, v7, :cond_d

    .line 1520
    const/high16 v4, 0x10000

    sub-int/2addr v2, v4

    .line 1521
    array-length v4, v1

    if-lt v5, v4, :cond_5

    .line 1522
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->expandCurrentSegment()[C

    move-result-object v1

    .line 1524
    :cond_5
    add-int/lit8 v4, v5, 0x1

    const v7, 0xd800

    shr-int/lit8 v8, v2, 0xa

    add-int/2addr v7, v8

    int-to-char v7, v7

    aput-char v7, v1, v5

    .line 1525
    const v5, 0xdc00

    and-int/lit16 v2, v2, 0x3ff

    or-int/2addr v2, v5

    move v10, v2

    move v2, v3

    move v3, v4

    move-object v4, v1

    move v1, v10

    .line 1528
    :goto_3
    array-length v5, v4

    if-lt v3, v5, :cond_6

    .line 1529
    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/TextBuffer;->expandCurrentSegment()[C

    move-result-object v4

    .line 1531
    :cond_6
    add-int/lit8 v5, v3, 0x1

    int-to-char v1, v1

    aput-char v1, v4, v3

    move v3, v2

    move-object v1, v4

    .line 1532
    goto/16 :goto_1

    .line 1457
    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 1474
    :cond_8
    and-int/lit16 v4, v2, 0xf0

    const/16 v7, 0xe0

    if-ne v4, v7, :cond_9

    .line 1475
    and-int/lit8 v4, v2, 0xf

    .line 1476
    const/4 v2, 0x2

    move v10, v2

    move v2, v4

    move v4, v10

    goto/16 :goto_2

    .line 1477
    :cond_9
    and-int/lit16 v4, v2, 0xf8

    const/16 v7, 0xf0

    if-ne v4, v7, :cond_a

    .line 1478
    and-int/lit8 v4, v2, 0x7

    .line 1479
    const/4 v2, 0x3

    move v10, v2

    move v2, v4

    move v4, v10

    goto/16 :goto_2

    .line 1481
    :cond_a
    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidInitial(I)V

    .line 1482
    const/4 v2, 0x1

    move v4, v2

    goto/16 :goto_2

    .line 1535
    :cond_b
    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v5}, Ljava/lang/String;-><init>([CII)V

    .line 1537
    const/4 v1, 0x4

    if-ge v6, v1, :cond_c

    .line 1538
    add-int/lit8 v1, p3, -0x1

    aput v0, p1, v1

    .line 1540
    :cond_c
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    invoke-virtual {v0, v2, p1, p3}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->addName(Ljava/lang/String;[II)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    return-object v0

    :cond_d
    move-object v4, v1

    move v1, v2

    move v2, v3

    move v3, v5

    goto :goto_3
.end method

.method private final _decodeShortAsciiName(I)Ljava/lang/String;
    .locals 8

    .prologue
    .line 1362
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v3

    .line 1363
    const/4 v0, 0x0

    .line 1364
    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 1365
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1368
    add-int v2, v1, p1

    add-int/lit8 v5, v2, -0x3

    move v2, v0

    :goto_0
    if-ge v1, v5, :cond_0

    .line 1369
    add-int/lit8 v0, v2, 0x1

    add-int/lit8 v6, v1, 0x1

    aget-byte v1, v4, v1

    int-to-char v1, v1

    aput-char v1, v3, v2

    .line 1370
    add-int/lit8 v1, v0, 0x1

    add-int/lit8 v2, v6, 0x1

    aget-byte v6, v4, v6

    int-to-char v6, v6

    aput-char v6, v3, v0

    .line 1371
    add-int/lit8 v6, v1, 0x1

    add-int/lit8 v7, v2, 0x1

    aget-byte v0, v4, v2

    int-to-char v0, v0

    aput-char v0, v3, v1

    .line 1372
    add-int/lit8 v0, v6, 0x1

    add-int/lit8 v1, v7, 0x1

    aget-byte v2, v4, v7

    int-to-char v2, v2

    aput-char v2, v3, v6

    move v2, v0

    goto :goto_0

    .line 1374
    :cond_0
    and-int/lit8 v5, p1, 0x3

    .line 1375
    if-lez v5, :cond_2

    .line 1376
    add-int/lit8 v6, v2, 0x1

    add-int/lit8 v0, v1, 0x1

    aget-byte v1, v4, v1

    int-to-char v1, v1

    aput-char v1, v3, v2

    .line 1377
    const/4 v1, 0x1

    if-le v5, v1, :cond_1

    .line 1378
    add-int/lit8 v2, v6, 0x1

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v4, v0

    int-to-char v0, v0

    aput-char v0, v3, v6

    .line 1379
    const/4 v0, 0x2

    if-le v5, v0, :cond_2

    .line 1380
    add-int/lit8 v0, v2, 0x1

    add-int/lit8 v0, v1, 0x1

    aget-byte v1, v4, v1

    int-to-char v1, v1

    aput-char v1, v3, v2

    .line 1384
    :cond_1
    :goto_1
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1385
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 1386
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method private final _decodeShortUnicodeName(I)Ljava/lang/String;
    .locals 10

    .prologue
    .line 1399
    const/4 v3, 0x0

    .line 1400
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v4

    .line 1401
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1402
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1403
    sget-object v5, Lcom/fasterxml/jackson/dataformat/smile/SmileConstants;->sUtf8UnitLengths:[I

    .line 1404
    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 1405
    add-int v7, v1, p1

    :goto_0
    if-ge v1, v7, :cond_1

    .line 1406
    add-int/lit8 v2, v1, 0x1

    aget-byte v0, v6, v1

    and-int/lit16 v0, v0, 0xff

    .line 1407
    aget v1, v5, v0

    .line 1408
    if-eqz v1, :cond_0

    .line 1410
    packed-switch v1, :pswitch_data_0

    .line 1430
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Invalid byte "

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v8, " in short Unicode text block"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    :cond_0
    move v1, v2

    move v2, v3

    .line 1433
    :goto_1
    add-int/lit8 v3, v2, 0x1

    int-to-char v0, v0

    aput-char v0, v4, v2

    goto :goto_0

    .line 1412
    :pswitch_0
    and-int/lit8 v0, v0, 0x1f

    shl-int/lit8 v0, v0, 0x6

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v6, v2

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    move v2, v3

    .line 1413
    goto :goto_1

    .line 1415
    :pswitch_1
    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0xc

    add-int/lit8 v8, v2, 0x1

    aget-byte v1, v6, v2

    and-int/lit8 v1, v1, 0x3f

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    add-int/lit8 v1, v8, 0x1

    aget-byte v2, v6, v8

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    move v2, v3

    .line 1418
    goto :goto_1

    .line 1420
    :pswitch_2
    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x12

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v6, v2

    and-int/lit8 v2, v2, 0x3f

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v0, v2

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v6, v1

    and-int/lit8 v1, v1, 0x3f

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v6, v2

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    .line 1425
    const/high16 v2, 0x10000

    sub-int/2addr v0, v2

    .line 1426
    add-int/lit8 v2, v3, 0x1

    const v8, 0xd800

    shr-int/lit8 v9, v0, 0xa

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v4, v3

    .line 1427
    const v3, 0xdc00

    and-int/lit16 v0, v0, 0x3ff

    or-int/2addr v0, v3

    .line 1428
    goto :goto_1

    .line 1435
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 1436
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1410
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private final _decodeUtf8_2(I)I
    .locals 3

    .prologue
    .line 2406
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v1, :cond_0

    .line 2407
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2409
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v1

    .line 2410
    and-int/lit16 v1, v0, 0xc0

    const/16 v2, 0x80

    if-eq v1, v2, :cond_1

    .line 2411
    and-int/lit16 v1, v0, 0xff

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2413
    :cond_1
    and-int/lit8 v1, p1, 0x1f

    shl-int/lit8 v1, v1, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    return v0
.end method

.method private final _decodeUtf8_3(I)I
    .locals 5

    .prologue
    const/16 v4, 0x80

    .line 2419
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v1, :cond_0

    .line 2420
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2422
    :cond_0
    and-int/lit8 v0, p1, 0xf

    .line 2423
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 2424
    and-int/lit16 v2, v1, 0xc0

    if-eq v2, v4, :cond_1

    .line 2425
    and-int/lit16 v2, v1, 0xff

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2427
    :cond_1
    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v0, v1

    .line 2428
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_2

    .line 2429
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2431
    :cond_2
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 2432
    and-int/lit16 v2, v1, 0xc0

    if-eq v2, v4, :cond_3

    .line 2433
    and-int/lit16 v2, v1, 0xff

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2435
    :cond_3
    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v0, v1

    .line 2436
    return v0
.end method

.method private final _decodeUtf8_3fast(I)I
    .locals 5

    .prologue
    const/16 v4, 0x80

    .line 2442
    and-int/lit8 v0, p1, 0xf

    .line 2443
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 2444
    and-int/lit16 v2, v1, 0xc0

    if-eq v2, v4, :cond_0

    .line 2445
    and-int/lit16 v2, v1, 0xff

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2447
    :cond_0
    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v0, v1

    .line 2448
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 2449
    and-int/lit16 v2, v1, 0xc0

    if-eq v2, v4, :cond_1

    .line 2450
    and-int/lit16 v2, v1, 0xff

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2452
    :cond_1
    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v0, v1

    .line 2453
    return v0
.end method

.method private final _decodeUtf8_4(I)I
    .locals 5

    .prologue
    const/16 v4, 0x80

    .line 2463
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v1, :cond_0

    .line 2464
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2466
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v1

    .line 2467
    and-int/lit16 v1, v0, 0xc0

    if-eq v1, v4, :cond_1

    .line 2468
    and-int/lit16 v1, v0, 0xff

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2470
    :cond_1
    and-int/lit8 v1, p1, 0x7

    shl-int/lit8 v1, v1, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    .line 2472
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_2

    .line 2473
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2475
    :cond_2
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 2476
    and-int/lit16 v2, v1, 0xc0

    if-eq v2, v4, :cond_3

    .line 2477
    and-int/lit16 v2, v1, 0xff

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2479
    :cond_3
    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v0, v1

    .line 2480
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_4

    .line 2481
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2483
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 2484
    and-int/lit16 v2, v1, 0xc0

    if-eq v2, v4, :cond_5

    .line 2485
    and-int/lit16 v2, v1, 0xff

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    invoke-virtual {p0, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(II)V

    .line 2491
    :cond_5
    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v0, v1

    const/high16 v1, 0x10000

    sub-int/2addr v0, v1

    return v0
.end method

.method private final _expandSeenNames([Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v0, 0x400

    const/16 v3, 0x40

    const/4 v2, 0x0

    .line 1328
    array-length v1, p1

    .line 1330
    if-nez v1, :cond_1

    .line 1331
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->allocSeenNamesBuffer()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 1332
    if-nez v0, :cond_0

    .line 1333
    new-array v0, v3, [Ljava/lang/String;

    .line 1343
    :cond_0
    :goto_0
    return-object v0

    .line 1335
    :cond_1
    if-ne v1, v0, :cond_2

    .line 1337
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    move-object v0, p1

    goto :goto_0

    .line 1339
    :cond_2
    if-ne v1, v3, :cond_3

    const/16 v0, 0x100

    .line 1340
    :cond_3
    new-array v0, v0, [Ljava/lang/String;

    .line 1341
    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method private final _expandSeenStringValues()V
    .locals 5

    .prologue
    const/16 v0, 0x400

    const/16 v4, 0x40

    const/4 v3, 0x0

    .line 724
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    .line 725
    array-length v2, v1

    .line 727
    if-nez v2, :cond_1

    .line 728
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->allocSeenStringValuesBuffer()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 729
    if-nez v0, :cond_0

    .line 730
    new-array v0, v4, [Ljava/lang/String;

    .line 740
    :cond_0
    :goto_0
    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    .line 741
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 742
    return-void

    .line 732
    :cond_1
    if-ne v2, v0, :cond_2

    .line 734
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    move-object v0, v1

    goto :goto_0

    .line 736
    :cond_2
    if-ne v2, v4, :cond_3

    const/16 v0, 0x100

    .line 737
    :cond_3
    new-array v0, v0, [Ljava/lang/String;

    .line 738
    array-length v2, v1

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method private final _findDecodedFromSymbols(I)Lcom/fasterxml/jackson/core/sym/Name;
    .locals 6

    .prologue
    .line 1627
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    .line 1628
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_loadToHaveAtLeast(I)Z

    .line 1631
    :cond_0
    const/4 v0, 0x5

    if-ge p1, v0, :cond_2

    .line 1632
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1633
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 1634
    aget-byte v0, v2, v1

    and-int/lit16 v0, v0, 0xff

    .line 1635
    add-int/lit8 v3, p1, -0x1

    if-lez v3, :cond_1

    .line 1636
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v1, 0x1

    aget-byte v4, v2, v1

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v0, v4

    .line 1637
    add-int/lit8 v3, v3, -0x1

    if-lez v3, :cond_1

    .line 1638
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v1, 0x1

    aget-byte v4, v2, v1

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v0, v4

    .line 1639
    add-int/lit8 v3, v3, -0x1

    if-lez v3, :cond_1

    .line 1640
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    .line 1644
    :cond_1
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quad1:I

    .line 1645
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->findName(I)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    .line 1672
    :goto_0
    return-object v0

    .line 1647
    :cond_2
    const/16 v0, 0x9

    if-ge p1, v0, :cond_4

    .line 1648
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1649
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 1651
    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    .line 1652
    add-int/lit8 v0, v0, 0x1

    aget-byte v3, v1, v0

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    .line 1653
    shl-int/lit8 v2, v2, 0x8

    .line 1654
    add-int/lit8 v0, v0, 0x1

    aget-byte v3, v1, v0

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    .line 1655
    shl-int/lit8 v2, v2, 0x8

    .line 1656
    add-int/lit8 v0, v0, 0x1

    aget-byte v3, v1, v0

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    .line 1657
    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v1, v3

    and-int/lit16 v0, v0, 0xff

    .line 1658
    add-int/lit8 v4, p1, -0x5

    .line 1659
    if-lez v4, :cond_3

    .line 1660
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v3, v3, 0x1

    aget-byte v5, v1, v3

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v0, v5

    .line 1661
    add-int/lit8 v4, v4, -0x1

    if-lez v4, :cond_3

    .line 1662
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v3, v3, 0x1

    aget-byte v5, v1, v3

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v0, v5

    .line 1663
    add-int/lit8 v4, v4, -0x1

    if-lez v4, :cond_3

    .line 1664
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v3, v3, 0x1

    aget-byte v1, v1, v3

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    .line 1668
    :cond_3
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quad1:I

    .line 1669
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quad2:I

    .line 1670
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    invoke-virtual {v1, v2, v0}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->findName(II)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    goto :goto_0

    .line 1672
    :cond_4
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_findDecodedMedium(I)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    goto :goto_0
.end method

.method private final _findDecodedMedium(I)Lcom/fasterxml/jackson/core/sym/Name;
    .locals 6

    .prologue
    .line 1683
    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v0, v0, 0x2

    .line 1684
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    array-length v1, v1

    if-le v0, v1, :cond_0

    .line 1685
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    invoke-static {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_growArrayTo([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    .line 1689
    :cond_0
    const/4 v1, 0x0

    .line 1690
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1691
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 1693
    :goto_0
    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v3, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    .line 1694
    add-int/lit8 v4, v2, 0x1

    aget-byte v2, v3, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    .line 1695
    shl-int/lit8 v0, v0, 0x8

    .line 1696
    add-int/lit8 v2, v4, 0x1

    aget-byte v4, v3, v4

    and-int/lit16 v4, v4, 0xff

    or-int/2addr v0, v4

    .line 1697
    shl-int/lit8 v4, v0, 0x8

    .line 1698
    add-int/lit8 v0, v2, 0x1

    aget-byte v2, v3, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v4, v2

    .line 1699
    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    add-int/lit8 v2, v1, 0x1

    aput v4, v5, v1

    .line 1700
    add-int/lit8 p1, p1, -0x4

    const/4 v1, 0x3

    if-gt p1, v1, :cond_4

    .line 1702
    if-lez p1, :cond_2

    .line 1703
    aget-byte v1, v3, v0

    and-int/lit16 v1, v1, 0xff

    .line 1704
    add-int/lit8 v4, p1, -0x1

    if-lez v4, :cond_3

    .line 1705
    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 v5, v0, 0x1

    aget-byte v0, v3, v5

    and-int/lit16 v0, v0, 0xff

    add-int/2addr v0, v1

    .line 1706
    add-int/lit8 v1, v4, -0x1

    if-lez v1, :cond_1

    .line 1707
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v5, 0x1

    aget-byte v1, v3, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    .line 1710
    :cond_1
    :goto_1
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    add-int/lit8 v1, v2, 0x1

    aput v0, v3, v2

    move v2, v1

    .line 1712
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->findName([II)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    return-object v0

    :cond_3
    move v0, v1

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_0
.end method

.method private final _finishBigDecimal()V
    .locals 4

    .prologue
    .line 1963
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_readUnsignedVInt()I

    move-result v0

    invoke-static {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileUtil;->zigzagDecode(I)I

    move-result v0

    .line 1964
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_read7BitBinaryWithLength()[B

    move-result-object v1

    .line 1965
    new-instance v2, Ljava/math/BigDecimal;

    new-instance v3, Ljava/math/BigInteger;

    invoke-direct {v3, v1}, Ljava/math/BigInteger;-><init>([B)V

    invoke-direct {v2, v3, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numberBigDecimal:Ljava/math/BigDecimal;

    .line 1966
    const/16 v0, 0x10

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 1967
    return-void
.end method

.method private final _finishBigInteger()V
    .locals 2

    .prologue
    .line 1901
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_read7BitBinaryWithLength()[B

    move-result-object v0

    .line 1902
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>([B)V

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numberBigInt:Ljava/math/BigInteger;

    .line 1903
    const/4 v0, 0x4

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 1904
    return-void
.end method

.method private final _finishDouble()V
    .locals 6

    .prologue
    const/4 v5, 0x7

    .line 1924
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_fourBytesToInt()I

    move-result v0

    int-to-long v0, v0

    .line 1925
    const/16 v2, 0x1c

    shl-long/2addr v0, v2

    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_fourBytesToInt()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 1927
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v2, v3, :cond_0

    .line 1928
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1930
    :cond_0
    shl-long/2addr v0, v5

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 1931
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v2, v3, :cond_1

    .line 1932
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1934
    :cond_1
    shl-long/2addr v0, v5

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 1935
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numberDouble:D

    .line 1936
    const/16 v0, 0x8

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 1937
    return-void
.end method

.method private final _finishFloat()V
    .locals 4

    .prologue
    .line 1910
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_fourBytesToInt()I

    move-result v0

    .line 1911
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_0

    .line 1912
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1914
    :cond_0
    shl-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    add-int/2addr v0, v1

    .line 1915
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 1916
    float-to-double v0, v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numberDouble:D

    .line 1917
    const/16 v0, 0x8

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 1918
    return-void
.end method

.method private final _finishInt()V
    .locals 4

    .prologue
    .line 1834
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v1, :cond_0

    .line 1835
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1837
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v0, v1

    .line 1839
    if-gez v1, :cond_1

    .line 1840
    and-int/lit8 v0, v1, 0x3f

    .line 1873
    :goto_0
    invoke-static {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileUtil;->zigzagDecode(I)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numberInt:I

    .line 1874
    const/4 v0, 0x1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 1875
    return-void

    .line 1842
    :cond_1
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v2, :cond_2

    .line 1843
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1845
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v2

    .line 1846
    if-ltz v0, :cond_6

    .line 1847
    shl-int/lit8 v1, v1, 0x7

    add-int/2addr v1, v0

    .line 1848
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v2, :cond_3

    .line 1849
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1851
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v2

    .line 1852
    if-ltz v0, :cond_6

    .line 1853
    shl-int/lit8 v1, v1, 0x7

    add-int/2addr v1, v0

    .line 1854
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v2, :cond_4

    .line 1855
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1857
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v2

    .line 1858
    if-ltz v0, :cond_6

    .line 1859
    shl-int/lit8 v1, v1, 0x7

    add-int/2addr v1, v0

    .line 1861
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v2, :cond_5

    .line 1862
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1864
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v2

    .line 1865
    if-ltz v0, :cond_6

    .line 1866
    const-string v2, "Corrupt input; 32-bit VInt extends beyond 5 data bytes"

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 1871
    :cond_6
    shl-int/lit8 v1, v1, 0x6

    and-int/lit8 v0, v0, 0x3f

    add-int/2addr v0, v1

    goto :goto_0
.end method

.method private final _finishLong()V
    .locals 5

    .prologue
    .line 1881
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_fourBytesToInt()I

    move-result v0

    int-to-long v0, v0

    .line 1884
    :goto_0
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v2, v3, :cond_0

    .line 1885
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1887
    :cond_0
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    .line 1888
    if-gez v2, :cond_1

    .line 1889
    const/4 v3, 0x6

    shl-long/2addr v0, v3

    and-int/lit8 v2, v2, 0x3f

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 1890
    invoke-static {v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileUtil;->zigzagDecode(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numberLong:J

    .line 1891
    const/4 v0, 0x2

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 1892
    return-void

    .line 1894
    :cond_1
    const/4 v3, 0x7

    shl-long/2addr v0, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 1895
    goto :goto_0
.end method

.method private final _finishRawBinary()V
    .locals 6

    .prologue
    .line 2244
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_readUnsignedVInt()I

    move-result v1

    .line 2245
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_binaryValue:[B

    .line 2246
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v2, :cond_0

    .line 2247
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 2249
    :cond_0
    const/4 v0, 0x0

    .line 2251
    :goto_0
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 2252
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_binaryValue:[B

    invoke-static {v3, v4, v5, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2253
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/2addr v3, v2

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2254
    add-int/2addr v0, v2

    .line 2255
    sub-int/2addr v1, v2

    .line 2256
    if-gtz v1, :cond_1

    .line 2257
    return-void

    .line 2259
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    goto :goto_0
.end method

.method private final _fourBytesToInt()I
    .locals 4

    .prologue
    .line 1942
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v1, :cond_0

    .line 1943
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1945
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v1

    .line 1946
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_1

    .line 1947
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1949
    :cond_1
    shl-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    add-int/2addr v0, v1

    .line 1950
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_2

    .line 1951
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1953
    :cond_2
    shl-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    add-int/2addr v0, v1

    .line 1954
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_3

    .line 1955
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1957
    :cond_3
    shl-int/lit8 v0, v0, 0x7

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    add-int/2addr v0, v1

    return v0
.end method

.method private static _growArrayTo([II)[I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1717
    add-int/lit8 v0, p1, 0x4

    new-array v0, v0, [I

    .line 1718
    if-eqz p0, :cond_0

    .line 1720
    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1722
    :cond_0
    return-object v0
.end method

.method private final _handleLongFieldName()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v6, -0x4

    .line 1546
    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    move v0, v1

    move v2, v1

    .line 1552
    :goto_0
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v3, v5, :cond_0

    .line 1553
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1555
    :cond_0
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v4, v3

    .line 1556
    if-ne v6, v3, :cond_5

    move v3, v0

    move v4, v1

    .line 1594
    :goto_1
    shl-int/lit8 v0, v2, 0x2

    .line 1595
    if-lez v4, :cond_2

    .line 1596
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    array-length v1, v1

    if-lt v2, v1, :cond_1

    .line 1597
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    array-length v5, v5

    add-int/lit16 v5, v5, 0x100

    invoke-static {v1, v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_growArrayTo([II)[I

    move-result-object v1

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    .line 1599
    :cond_1
    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    add-int/lit8 v1, v2, 0x1

    aput v3, v5, v2

    .line 1600
    add-int/2addr v0, v4

    move v2, v1

    .line 1605
    :cond_2
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    invoke-virtual {v1, v3, v2}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->findName([II)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v1

    .line 1606
    if-eqz v1, :cond_d

    .line 1607
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/sym/Name;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1611
    :goto_2
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 1612
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    array-length v2, v2

    if-lt v1, v2, :cond_3

    .line 1613
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenNames([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 1615
    :cond_3
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    aput-object v0, v1, v2

    .line 1617
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 1618
    return-void

    .line 1560
    :cond_5
    and-int/lit16 v0, v3, 0xff

    .line 1561
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v3, v5, :cond_6

    .line 1562
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1564
    :cond_6
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v4, v3

    .line 1565
    if-ne v6, v3, :cond_7

    .line 1566
    const/4 v1, 0x1

    move v3, v0

    move v4, v1

    .line 1567
    goto :goto_1

    .line 1569
    :cond_7
    shl-int/lit8 v0, v0, 0x8

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v0, v3

    .line 1570
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v3, v5, :cond_8

    .line 1571
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1573
    :cond_8
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v4, v3

    .line 1574
    if-ne v6, v3, :cond_9

    .line 1575
    const/4 v1, 0x2

    move v3, v0

    move v4, v1

    .line 1576
    goto/16 :goto_1

    .line 1578
    :cond_9
    shl-int/lit8 v0, v0, 0x8

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v0, v3

    .line 1579
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v3, v5, :cond_a

    .line 1580
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1582
    :cond_a
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v4, v3

    .line 1583
    if-ne v6, v3, :cond_b

    .line 1584
    const/4 v1, 0x3

    move v3, v0

    move v4, v1

    .line 1585
    goto/16 :goto_1

    .line 1587
    :cond_b
    shl-int/lit8 v0, v0, 0x8

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v0, v3

    .line 1588
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    array-length v3, v3

    if-lt v2, v3, :cond_c

    .line 1589
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    array-length v5, v5

    add-int/lit16 v5, v5, 0x100

    invoke-static {v3, v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_growArrayTo([II)[I

    move-result-object v3

    iput-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    .line 1591
    :cond_c
    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    add-int/lit8 v3, v2, 0x1

    aput v0, v5, v2

    move v2, v3

    .line 1592
    goto/16 :goto_0

    .line 1609
    :cond_d
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_quadBuffer:[I

    invoke-direct {p0, v1, v0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeLongUnicodeName([III)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/sym/Name;->getName()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2
.end method

.method private final _handleSharedString(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2

    .prologue
    .line 703
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    if-lt p1, v0, :cond_0

    .line 704
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidSharedStringValue(I)V

    .line 706
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->resetWithString(Ljava/lang/String;)V

    .line 707
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    return-object v0
.end method

.method private final _read7BitBinaryWithLength()[B
    .locals 9

    .prologue
    const/16 v8, 0x8

    .line 1989
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_readUnsignedVInt()I

    move-result v0

    .line 1990
    new-array v4, v0, [B

    .line 1991
    const/4 v2, 0x0

    .line 1992
    add-int/lit8 v0, v0, -0x7

    .line 1995
    :goto_0
    if-gt v2, v0, :cond_1

    .line 1996
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v1, v3

    if-ge v1, v8, :cond_0

    .line 1997
    invoke-virtual {p0, v8}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_loadToHaveAtLeast(I)Z

    .line 1999
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v3

    shl-int/lit8 v1, v1, 0x19

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v3, v5

    shl-int/lit8 v3, v3, 0x12

    add-int/2addr v1, v3

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v3, v5

    shl-int/lit8 v3, v3, 0xb

    add-int/2addr v1, v3

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v3, v5

    shl-int/lit8 v3, v3, 0x4

    add-int/2addr v1, v3

    .line 2003
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v3, v5

    .line 2004
    shr-int/lit8 v5, v3, 0x3

    add-int/2addr v1, v5

    .line 2005
    and-int/lit8 v3, v3, 0x7

    shl-int/lit8 v3, v3, 0x15

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v5, v5, v6

    shl-int/lit8 v5, v5, 0xe

    add-int/2addr v3, v5

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v5, v5, v6

    shl-int/lit8 v5, v5, 0x7

    add-int/2addr v3, v5

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v5, v5, v6

    add-int/2addr v3, v5

    .line 2010
    add-int/lit8 v5, v2, 0x1

    shr-int/lit8 v6, v1, 0x18

    int-to-byte v6, v6

    aput-byte v6, v4, v2

    .line 2011
    add-int/lit8 v2, v5, 0x1

    shr-int/lit8 v6, v1, 0x10

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 2012
    add-int/lit8 v5, v2, 0x1

    shr-int/lit8 v6, v1, 0x8

    int-to-byte v6, v6

    aput-byte v6, v4, v2

    .line 2013
    add-int/lit8 v2, v5, 0x1

    int-to-byte v1, v1

    aput-byte v1, v4, v5

    .line 2014
    add-int/lit8 v1, v2, 0x1

    shr-int/lit8 v5, v3, 0x10

    int-to-byte v5, v5

    aput-byte v5, v4, v2

    .line 2015
    add-int/lit8 v5, v1, 0x1

    shr-int/lit8 v2, v3, 0x8

    int-to-byte v2, v2

    aput-byte v2, v4, v1

    .line 2016
    add-int/lit8 v2, v5, 0x1

    int-to-byte v1, v3

    aput-byte v1, v4, v5

    goto/16 :goto_0

    .line 2019
    :cond_1
    array-length v0, v4

    sub-int v5, v0, v2

    .line 2020
    if-lez v5, :cond_4

    .line 2021
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v0, v1

    add-int/lit8 v1, v5, 0x1

    if-ge v0, v1, :cond_2

    .line 2022
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_loadToHaveAtLeast(I)Z

    .line 2024
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v0, v1

    .line 2025
    const/4 v0, 0x1

    :goto_1
    if-ge v0, v5, :cond_3

    .line 2026
    shl-int/lit8 v1, v1, 0x7

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v3, v6

    add-int/2addr v1, v3

    .line 2027
    add-int/lit8 v3, v2, 0x1

    rsub-int/lit8 v6, v0, 0x7

    shr-int v6, v1, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v2

    .line 2025
    add-int/lit8 v0, v0, 0x1

    move v2, v3

    goto :goto_1

    .line 2030
    :cond_3
    shl-int v0, v1, v5

    .line 2031
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v3

    add-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v2

    .line 2033
    :cond_4
    return-object v4
.end method

.method private final _readUnsignedVInt()I
    .locals 4

    .prologue
    .line 1972
    const/4 v0, 0x0

    .line 1974
    :goto_0
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_0

    .line 1975
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1977
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 1978
    if-gez v1, :cond_1

    .line 1979
    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v1, v1, 0x3f

    add-int/2addr v0, v1

    .line 1980
    return v0

    .line 1982
    :cond_1
    shl-int/lit8 v0, v0, 0x7

    add-int/2addr v0, v1

    .line 1983
    goto :goto_0
.end method

.method protected static final _smileBufferRecycler()Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 297
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileRecyclerRef:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 298
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 300
    :goto_0
    if-nez v0, :cond_0

    .line 301
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-direct {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;-><init>()V

    .line 302
    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileRecyclerRef:Ljava/lang/ThreadLocal;

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 304
    :cond_0
    return-object v0

    .line 298
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    goto :goto_0
.end method


# virtual methods
.method protected _closeInput()V
    .locals 1

    .prologue
    .line 445
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    .line 446
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/IOContext;->isResourceManaged()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->AUTO_CLOSE_SOURCE:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->isEnabled(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 447
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 449
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    .line 451
    :cond_2
    return-void
.end method

.method protected final _decodeShortAsciiValue(I)V
    .locals 7

    .prologue
    .line 2045
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    .line 2046
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_loadToHaveAtLeast(I)Z

    .line 2049
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v3

    .line 2050
    const/4 v1, 0x0

    .line 2051
    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 2052
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2076
    add-int v5, v0, p1

    :goto_0
    if-ge v0, v5, :cond_1

    .line 2077
    add-int/lit8 v2, v1, 0x1

    aget-byte v6, v4, v0

    int-to-char v6, v6

    aput-char v6, v3, v1

    .line 2076
    add-int/lit8 v0, v0, 0x1

    move v1, v2

    goto :goto_0

    .line 2080
    :cond_1
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2081
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 2082
    return-void
.end method

.method protected final _decodeShortUnicodeValue(I)V
    .locals 10

    .prologue
    .line 2087
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    .line 2088
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_loadToHaveAtLeast(I)Z

    .line 2090
    :cond_0
    const/4 v3, 0x0

    .line 2091
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->emptyAndGetCurrentSegment()[C

    move-result-object v4

    .line 2092
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2093
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2094
    sget-object v5, Lcom/fasterxml/jackson/dataformat/smile/SmileConstants;->sUtf8UnitLengths:[I

    .line 2095
    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 2096
    add-int v7, v1, p1

    :goto_0
    if-ge v1, v7, :cond_2

    .line 2097
    add-int/lit8 v2, v1, 0x1

    aget-byte v0, v6, v1

    and-int/lit16 v0, v0, 0xff

    .line 2098
    aget v1, v5, v0

    .line 2099
    if-eqz v1, :cond_1

    .line 2101
    packed-switch v1, :pswitch_data_0

    .line 2121
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Invalid byte "

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v8, " in short Unicode text block"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    :cond_1
    move v1, v2

    move v2, v3

    .line 2124
    :goto_1
    add-int/lit8 v3, v2, 0x1

    int-to-char v0, v0

    aput-char v0, v4, v2

    goto :goto_0

    .line 2103
    :pswitch_0
    and-int/lit8 v0, v0, 0x1f

    shl-int/lit8 v0, v0, 0x6

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v6, v2

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    move v2, v3

    .line 2104
    goto :goto_1

    .line 2106
    :pswitch_1
    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0xc

    add-int/lit8 v8, v2, 0x1

    aget-byte v1, v6, v2

    and-int/lit8 v1, v1, 0x3f

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    add-int/lit8 v1, v8, 0x1

    aget-byte v2, v6, v8

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    move v2, v3

    .line 2109
    goto :goto_1

    .line 2111
    :pswitch_2
    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x12

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v6, v2

    and-int/lit8 v2, v2, 0x3f

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v0, v2

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v6, v1

    and-int/lit8 v1, v1, 0x3f

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v6, v2

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    .line 2116
    const/high16 v2, 0x10000

    sub-int/2addr v0, v2

    .line 2117
    add-int/lit8 v2, v3, 0x1

    const v8, 0xd800

    shr-int/lit8 v9, v0, 0xa

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v4, v3

    .line 2118
    const v3, 0xdc00

    and-int/lit16 v0, v0, 0x3ff

    or-int/2addr v0, v3

    .line 2119
    goto :goto_1

    .line 2126
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 2127
    return-void

    .line 2101
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected final _finishNumberToken(I)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 1795
    and-int/lit8 v0, p1, 0x1f

    .line 1796
    shr-int/lit8 v1, v0, 0x2

    .line 1797
    if-ne v1, v2, :cond_3

    .line 1798
    and-int/lit8 v0, v0, 0x3

    .line 1799
    if-nez v0, :cond_0

    .line 1800
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishInt()V

    .line 1824
    :goto_0
    return-void

    .line 1801
    :cond_0
    if-ne v0, v2, :cond_1

    .line 1802
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishLong()V

    goto :goto_0

    .line 1803
    :cond_1
    if-ne v0, v3, :cond_2

    .line 1804
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishBigInteger()V

    goto :goto_0

    .line 1806
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_throwInternal()V

    goto :goto_0

    .line 1810
    :cond_3
    if-ne v1, v3, :cond_4

    .line 1811
    and-int/lit8 v0, v0, 0x3

    packed-switch v0, :pswitch_data_0

    .line 1823
    :cond_4
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_throwInternal()V

    goto :goto_0

    .line 1813
    :pswitch_0
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishFloat()V

    goto :goto_0

    .line 1816
    :pswitch_1
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishDouble()V

    goto :goto_0

    .line 1819
    :pswitch_2
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishBigDecimal()V

    goto :goto_0

    .line 1811
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected _finishString()V
    .locals 0

    .prologue
    .line 463
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_throwInternal()V

    .line 464
    return-void
.end method

.method protected _finishToken()V
    .locals 3

    .prologue
    .line 1753
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 1754
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 1756
    shr-int/lit8 v1, v0, 0x5

    and-int/lit8 v1, v1, 0x7

    .line 1757
    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 1758
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishNumberToken(I)V

    .line 1790
    :goto_0
    return-void

    .line 1761
    :cond_0
    const/4 v2, 0x3

    if-gt v1, v2, :cond_1

    .line 1762
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortAsciiValue(I)V

    goto :goto_0

    .line 1765
    :cond_1
    const/4 v2, 0x5

    if-gt v1, v2, :cond_2

    .line 1767
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortUnicodeValue(I)V

    goto :goto_0

    .line 1770
    :cond_2
    const/4 v2, 0x7

    if-ne v1, v2, :cond_3

    .line 1771
    and-int/lit8 v0, v0, 0x1f

    .line 1773
    shr-int/lit8 v0, v0, 0x2

    packed-switch v0, :pswitch_data_0

    .line 1789
    :cond_3
    :pswitch_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_throwInternal()V

    goto :goto_0

    .line 1775
    :pswitch_1
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeLongAscii()V

    goto :goto_0

    .line 1778
    :pswitch_2
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeLongUnicode()V

    goto :goto_0

    .line 1781
    :pswitch_3
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_read7BitBinaryWithLength()[B

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_binaryValue:[B

    goto :goto_0

    .line 1784
    :pswitch_4
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishRawBinary()V

    goto :goto_0

    .line 1773
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method protected final _handleFieldName()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4

    .prologue
    .line 1219
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v1, :cond_0

    .line 1220
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1222
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v0, v0, v1

    .line 1224
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 1225
    shr-int/lit8 v1, v0, 0x6

    and-int/lit8 v1, v1, 0x3

    packed-switch v1, :pswitch_data_0

    .line 1317
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid type marker byte 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " for expected field name (or END_OBJECT marker)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 1318
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 1227
    :pswitch_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1229
    :sswitch_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 1230
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_1

    .line 1236
    :sswitch_1
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v1, v2, :cond_2

    .line 1237
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 1239
    :cond_2
    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    .line 1240
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    if-lt v0, v1, :cond_3

    .line 1241
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidSharedName(I)V

    .line 1243
    :cond_3
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    aget-object v0, v2, v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 1245
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_1

    .line 1247
    :sswitch_2
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_handleLongFieldName()V

    .line 1248
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_1

    .line 1253
    :pswitch_1
    and-int/lit8 v0, v0, 0x3f

    .line 1254
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    if-lt v0, v1, :cond_4

    .line 1255
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidSharedName(I)V

    .line 1257
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    aget-object v0, v2, v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 1259
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_1

    .line 1262
    :pswitch_2
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v1, v0, 0x1

    .line 1264
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_findDecodedFromSymbols(I)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    .line 1265
    if-eqz v0, :cond_7

    .line 1266
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/sym/Name;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1267
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1272
    :goto_2
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 1273
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    array-length v2, v2

    if-lt v1, v2, :cond_5

    .line 1274
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenNames([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 1276
    :cond_5
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    aput-object v0, v1, v2

    .line 1278
    :cond_6
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 1280
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_1

    .line 1269
    :cond_7
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortAsciiName(I)Ljava/lang/String;

    move-result-object v0

    .line 1270
    invoke-direct {p0, v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_addDecodedToSymbols(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 1283
    :pswitch_3
    and-int/lit8 v0, v0, 0x3f

    .line 1285
    const/16 v1, 0x37

    if-le v0, v1, :cond_9

    .line 1286
    const/16 v1, 0x3b

    if-ne v0, v1, :cond_1

    .line 1287
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->inObject()Z

    move-result v0

    if-nez v0, :cond_8

    .line 1288
    const/16 v0, 0x7d

    const/16 v1, 0x5d

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportMismatchedEndMarker(IC)V

    .line 1290
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getParent()Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 1291
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_1

    .line 1294
    :cond_9
    add-int/lit8 v1, v0, 0x2

    .line 1296
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_findDecodedFromSymbols(I)Lcom/fasterxml/jackson/core/sym/Name;

    move-result-object v0

    .line 1297
    if-eqz v0, :cond_c

    .line 1298
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/sym/Name;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1299
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 1304
    :goto_3
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    if-eqz v1, :cond_b

    .line 1305
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    array-length v2, v2

    if-lt v1, v2, :cond_a

    .line 1306
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenNames([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 1308
    :cond_a
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    aput-object v0, v1, v2

    .line 1310
    :cond_b
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 1311
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_1

    .line 1301
    :cond_c
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortUnicodeName(I)Ljava/lang/String;

    move-result-object v0

    .line 1302
    invoke-direct {p0, v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_addDecodedToSymbols(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 1225
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 1227
    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_0
        0x30 -> :sswitch_1
        0x31 -> :sswitch_1
        0x32 -> :sswitch_1
        0x33 -> :sswitch_1
        0x34 -> :sswitch_2
    .end sparse-switch
.end method

.method protected final _loadToHaveAtLeast(I)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 408
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    if-nez v2, :cond_1

    .line 435
    :cond_0
    :goto_0
    return v0

    .line 412
    :cond_1
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v2, v3

    .line 413
    if-lez v2, :cond_2

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    if-lez v3, :cond_2

    .line 414
    iget-wide v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currInputProcessed:J

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currInputProcessed:J

    .line 416
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    invoke-static {v3, v4, v5, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 417
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    .line 421
    :goto_1
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 422
    :goto_2
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-ge v3, p1, :cond_4

    .line 423
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    array-length v6, v6

    iget v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    sub-int/2addr v6, v7

    invoke-virtual {v3, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    .line 424
    if-ge v3, v1, :cond_3

    .line 426
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_closeInput()V

    .line 428
    if-nez v3, :cond_0

    .line 429
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InputStream.read() returned 0 characters when trying to read "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 419
    :cond_2
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    goto :goto_1

    .line 433
    :cond_3
    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    add-int/2addr v3, v4

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    goto :goto_2

    :cond_4
    move v0, v1

    .line 435
    goto :goto_0
.end method

.method protected _parseNumericValue(I)V
    .locals 3

    .prologue
    .line 1735
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v0, :cond_1

    .line 1736
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 1738
    shr-int/lit8 v1, v0, 0x5

    and-int/lit8 v1, v1, 0x7

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    .line 1739
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current token ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") not numeric, can not use numeric value accessors"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 1741
    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 1742
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishNumberToken(I)V

    .line 1744
    :cond_1
    return-void
.end method

.method protected _releaseBuffers()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 498
    invoke-super {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_releaseBuffers()V

    .line 499
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_bufferRecyclable:Z

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 501
    if-eqz v0, :cond_0

    .line 502
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 503
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/IOContext;->releaseReadIOBuffer([B)V

    .line 507
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 508
    if-eqz v0, :cond_2

    array-length v1, v0

    if-lez v1, :cond_2

    .line 509
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 513
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    if-lez v1, :cond_1

    .line 514
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 516
    :cond_1
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->releaseSeenNamesBuffer([Ljava/lang/Object;)V

    .line 520
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    .line 521
    if-eqz v0, :cond_4

    array-length v1, v0

    if-lez v1, :cond_4

    .line 522
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    .line 526
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    if-lez v1, :cond_3

    .line 527
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 529
    :cond_3
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->releaseSeenStringValuesBuffer([Ljava/lang/Object;)V

    .line 532
    :cond_4
    return-void
.end method

.method protected _reportInvalidChar(I)V
    .locals 1

    .prologue
    .line 2519
    const/16 v0, 0x20

    if-ge p1, v0, :cond_0

    .line 2520
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_throwInvalidSpace(I)V

    .line 2522
    :cond_0
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidInitial(I)V

    .line 2523
    return-void
.end method

.method protected _reportInvalidInitial(I)V
    .locals 2

    .prologue
    .line 2528
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid UTF-8 start byte 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 2529
    return-void
.end method

.method protected _reportInvalidOther(I)V
    .locals 2

    .prologue
    .line 2534
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid UTF-8 middle byte 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 2535
    return-void
.end method

.method protected _reportInvalidOther(II)V
    .locals 0

    .prologue
    .line 2540
    iput p2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2541
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidOther(I)V

    .line 2542
    return-void
.end method

.method protected _reportInvalidSharedName(I)V
    .locals 2

    .prologue
    .line 2502
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2503
    const-string v0, "Encountered shared name reference, even though document header explicitly declared no shared name references are included"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 2505
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid shared name reference "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; only got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " names in buffer (invalid content)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 2506
    return-void
.end method

.method protected _reportInvalidSharedStringValue(I)V
    .locals 2

    .prologue
    .line 2510
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2511
    const-string v0, "Encountered shared text value reference, even though document header did not declared shared text value references may be included"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 2513
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid shared text value reference "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; only got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " names in buffer (invalid content)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 2514
    return-void
.end method

.method protected _skip7BitBinary()V
    .locals 3

    .prologue
    .line 2385
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_readUnsignedVInt()I

    move-result v1

    .line 2387
    div-int/lit8 v2, v1, 0x7

    .line 2388
    mul-int/lit8 v0, v2, 0x8

    .line 2390
    mul-int/lit8 v2, v2, 0x7

    sub-int/2addr v1, v2

    .line 2391
    if-lez v1, :cond_0

    .line 2392
    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 2394
    :cond_0
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipBytes(I)V

    .line 2395
    return-void
.end method

.method protected _skipBytes(I)V
    .locals 2

    .prologue
    .line 2368
    :goto_0
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 2369
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 2370
    sub-int/2addr p1, v0

    .line 2371
    if-gtz p1, :cond_0

    .line 2372
    return-void

    .line 2374
    :cond_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    goto :goto_0
.end method

.method protected _skipIncomplete()V
    .locals 4

    .prologue
    .line 2275
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 2276
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 2277
    shr-int/lit8 v1, v0, 0x5

    and-int/lit8 v1, v1, 0x7

    packed-switch v1, :pswitch_data_0

    .line 2361
    :goto_0
    :pswitch_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_throwInternal()V

    .line 2362
    :goto_1
    return-void

    .line 2279
    :pswitch_1
    and-int/lit8 v0, v0, 0x1f

    .line 2281
    shr-int/lit8 v1, v0, 0x2

    packed-switch v1, :pswitch_data_1

    goto :goto_0

    .line 2284
    :pswitch_2
    and-int/lit8 v0, v0, 0x3

    packed-switch v0, :pswitch_data_2

    goto :goto_0

    .line 2290
    :goto_2
    :pswitch_3
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    .line 2291
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 2292
    :cond_0
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    if-ge v2, v0, :cond_1

    .line 2293
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v1, v2

    if-gez v2, :cond_0

    goto :goto_1

    .line 2286
    :pswitch_4
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipBytes(I)V

    goto :goto_2

    .line 2297
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    goto :goto_2

    .line 2301
    :pswitch_5
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skip7BitBinary()V

    goto :goto_1

    .line 2306
    :pswitch_6
    and-int/lit8 v0, v0, 0x3

    packed-switch v0, :pswitch_data_3

    goto :goto_0

    .line 2308
    :pswitch_7
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipBytes(I)V

    goto :goto_1

    .line 2311
    :pswitch_8
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipBytes(I)V

    goto :goto_1

    .line 2315
    :pswitch_9
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_readUnsignedVInt()I

    .line 2317
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skip7BitBinary()V

    goto :goto_1

    .line 2326
    :pswitch_a
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipBytes(I)V

    goto :goto_1

    .line 2331
    :pswitch_b
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipBytes(I)V

    goto :goto_1

    .line 2334
    :pswitch_c
    and-int/lit8 v0, v0, 0x1f

    .line 2336
    shr-int/lit8 v0, v0, 0x2

    packed-switch v0, :pswitch_data_4

    :pswitch_d
    goto :goto_0

    .line 2343
    :goto_3
    :pswitch_e
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    .line 2344
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    .line 2345
    :cond_2
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    if-ge v2, v0, :cond_3

    .line 2346
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v1, v2

    const/4 v3, -0x4

    if-ne v2, v3, :cond_2

    goto :goto_1

    .line 2350
    :cond_3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    goto :goto_3

    .line 2354
    :pswitch_f
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skip7BitBinary()V

    goto :goto_1

    .line 2357
    :pswitch_10
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_readUnsignedVInt()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipBytes(I)V

    goto/16 :goto_1

    .line 2277
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_b
        :pswitch_b
        :pswitch_0
        :pswitch_c
    .end packed-switch

    .line 2281
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_6
    .end packed-switch

    .line 2284
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    .line 2306
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch

    .line 2336
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_e
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_10
    .end packed-switch
.end method

.method public close()V
    .locals 1

    .prologue
    .line 469
    invoke-super {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->close()V

    .line 471
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_symbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->release()V

    .line 472
    return-void
.end method

.method public getBinaryValue(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .locals 2

    .prologue
    .line 1184
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v0, :cond_0

    .line 1185
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishToken()V

    .line 1187
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_1

    .line 1189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Current token ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") not VALUE_EMBEDDED_OBJECT, can not access as binary"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 1191
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_binaryValue:[B

    return-object v0
.end method

.method public getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    return-object v0
.end method

.method public getCurrentLocation()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 8

    .prologue
    .line 362
    iget-wide v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currInputProcessed:J

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    int-to-long v2, v2

    add-long/2addr v2, v0

    .line 363
    new-instance v0, Lcom/fasterxml/jackson/core/JsonLocation;

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/io/IOContext;->getSourceReference()Ljava/lang/Object;

    move-result-object v1

    const-wide/16 v4, -0x1

    const/4 v6, -0x1

    long-to-int v7, v2

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Ljava/lang/Object;JJII)V

    return-object v0
.end method

.method public getEmbeddedObject()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1198
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v0, :cond_0

    .line 1199
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishToken()V

    .line 1201
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_1

    .line 1202
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_binaryValue:[B

    .line 1204
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getInputSource()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 339
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    return-object v0
.end method

.method public getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;
    .locals 1

    .prologue
    .line 751
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_got32BitFloat:Z

    if-eqz v0, :cond_0

    .line 752
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->FLOAT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    .line 754
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    move-result-object v0

    goto :goto_0
.end method

.method public getText()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1071
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v0, :cond_4

    .line 1072
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 1074
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 1075
    shr-int/lit8 v1, v0, 0x5

    and-int/lit8 v1, v1, 0x7

    .line 1076
    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 1077
    :cond_0
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortAsciiValue(I)V

    .line 1078
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    .line 1101
    :goto_0
    return-object v0

    .line 1080
    :cond_1
    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x5

    if-ne v1, v2, :cond_3

    .line 1082
    :cond_2
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortUnicodeValue(I)V

    .line 1083
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1085
    :cond_3
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishToken()V

    .line 1087
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_5

    .line 1088
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1090
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 1091
    if-nez v0, :cond_6

    .line 1092
    const/4 v0, 0x0

    goto :goto_0

    .line 1094
    :cond_6
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_7

    .line 1095
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getCurrentName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1097
    :cond_7
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->isNumeric()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1099
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->getNumberValue()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1101
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTextCharacters()[C
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1108
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    if-eqz v0, :cond_4

    .line 1109
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v0, :cond_0

    .line 1110
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishToken()V

    .line 1112
    :cond_0
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1136
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    move-result-object v0

    .line 1139
    :goto_0
    return-object v0

    .line 1114
    :pswitch_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->getTextBuffer()[C

    move-result-object v0

    goto :goto_0

    .line 1116
    :pswitch_1
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopied:Z

    if-nez v0, :cond_2

    .line 1117
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getCurrentName()Ljava/lang/String;

    move-result-object v0

    .line 1118
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 1119
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopyBuffer:[C

    if-nez v2, :cond_3

    .line 1120
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/io/IOContext;->allocNameCopyBuffer(I)[C

    move-result-object v2

    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopyBuffer:[C

    .line 1124
    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopyBuffer:[C

    invoke-virtual {v0, v3, v1, v2, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 1125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopied:Z

    .line 1127
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopyBuffer:[C

    goto :goto_0

    .line 1121
    :cond_3
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopyBuffer:[C

    array-length v2, v2

    if-ge v2, v1, :cond_1

    .line 1122
    new-array v2, v1, [C

    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopyBuffer:[C

    goto :goto_1

    .line 1133
    :pswitch_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->getNumberValue()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    goto :goto_0

    .line 1139
    :cond_4
    const/4 v0, 0x0

    goto :goto_0

    .line 1112
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public getTextLength()I
    .locals 2

    .prologue
    .line 1146
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    if-eqz v0, :cond_1

    .line 1147
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v0, :cond_0

    .line 1148
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_finishToken()V

    .line 1150
    :cond_0
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1162
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    move-result-object v0

    array-length v0, v0

    .line 1165
    :goto_0
    return v0

    .line 1152
    :pswitch_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->size()I

    move-result v0

    goto :goto_0

    .line 1154
    :pswitch_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getCurrentName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    .line 1159
    :pswitch_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->getNumberValue()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    .line 1165
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 1150
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public getTextOffset()I
    .locals 1

    .prologue
    .line 1171
    const/4 v0, 0x0

    return v0
.end method

.method public getTokenLocation()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 9

    .prologue
    .line 350
    new-instance v0, Lcom/fasterxml/jackson/core/JsonLocation;

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/io/IOContext;->getSourceReference()Ljava/lang/Object;

    move-result-object v1

    iget-wide v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenInputTotal:J

    const-wide/16 v4, -0x1

    const/4 v6, -0x1

    iget-wide v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenInputTotal:J

    long-to-int v7, v7

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Ljava/lang/Object;JJII)V

    return-object v0
.end method

.method protected handleSignature(ZZ)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 247
    if-eqz p1, :cond_0

    .line 248
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 250
    :cond_0
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v2, v3, :cond_1

    .line 251
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 253
    :cond_1
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    const/16 v3, 0x29

    if-eq v2, v3, :cond_3

    .line 254
    if-eqz p2, :cond_2

    .line 255
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed content: signature not valid, starts with 0x3a but followed by 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", not 0x29"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 292
    :cond_2
    :goto_0
    return v0

    .line 260
    :cond_3
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v2, v3, :cond_4

    .line 261
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 263
    :cond_4
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    const/16 v3, 0xa

    if-eq v2, v3, :cond_5

    .line 264
    if-eqz p2, :cond_2

    .line 265
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed content: signature not valid, starts with 0x3a, 0x29, but followed by 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", not 0xA"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    goto :goto_0

    .line 271
    :cond_5
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v2, v3, :cond_6

    .line 272
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 274
    :cond_6
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v2, v2, v3

    .line 275
    shr-int/lit8 v3, v2, 0x4

    and-int/lit8 v3, v3, 0xf

    .line 277
    if-eqz v3, :cond_7

    .line 278
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Header version number bits (0x"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ") indicate unrecognized version; only 0x0 handled by parser"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 282
    :cond_7
    and-int/lit8 v3, v2, 0x1

    if-nez v3, :cond_8

    .line 283
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 284
    const/4 v3, -0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    .line 287
    :cond_8
    and-int/lit8 v3, v2, 0x2

    if-eqz v3, :cond_9

    .line 288
    sget-object v3, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->NO_STRINGS:[Ljava/lang/String;

    iput-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    .line 289
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    .line 291
    :cond_9
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_a

    move v0, v1

    :cond_a
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_mayContainRawBinary:Z

    move v0, v1

    .line 292
    goto/16 :goto_0
.end method

.method public hasTextCharacters()Z
    .locals 2

    .prologue
    .line 477
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_0

    .line 479
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->hasTextAsCharacters()Z

    move-result v0

    .line 486
    :goto_0
    return v0

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_1

    .line 483
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_nameCopied:Z

    goto :goto_0

    .line 486
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final loadMore()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 378
    iget-wide v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currInputProcessed:J

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currInputProcessed:J

    .line 381
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 382
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputStream:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    array-length v3, v3

    invoke-virtual {v1, v2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    .line 383
    if-lez v1, :cond_1

    .line 384
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 385
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    .line 386
    const/4 v0, 0x1

    .line 395
    :cond_0
    return v0

    .line 389
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_closeInput()V

    .line 391
    if-nez v1, :cond_0

    .line 392
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "InputStream.read() returned 0 characters when trying to read "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public mayContainRawBinary()Z
    .locals 1

    .prologue
    .line 541
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_mayContainRawBinary:Z

    return v0
.end method

.method public nextBooleanValue()Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 1046
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1052
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1048
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    .line 1050
    :pswitch_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    .line 1046
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public nextFieldName(Lcom/fasterxml/jackson/core/SerializableString;)Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 768
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->inObject()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_d

    .line 769
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->asQuotedUTF8()[B

    move-result-object v3

    .line 770
    array-length v2, v3

    .line 772
    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/2addr v4, v2

    add-int/lit8 v4, v4, 0x1

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-ge v4, v5, :cond_0

    .line 773
    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 774
    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    add-int/lit8 v6, v4, 0x1

    aget-byte v4, v5, v4

    .line 775
    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 777
    shr-int/lit8 v5, v4, 0x6

    and-int/lit8 v5, v5, 0x3

    packed-switch v5, :pswitch_data_0

    .line 884
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_handleFieldName()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    .line 885
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 886
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v2, v3, :cond_c

    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getCurrentName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 889
    :cond_1
    :goto_1
    return v0

    .line 779
    :pswitch_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 781
    :sswitch_0
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 782
    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 783
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    const-string v4, ""

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 784
    if-eqz v2, :cond_1

    move v0, v1

    goto :goto_1

    .line 790
    :sswitch_1
    and-int/lit8 v0, v4, 0x3

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    add-int/lit8 v2, v6, 0x1

    aget-byte v1, v1, v6

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    .line 791
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    if-lt v0, v1, :cond_2

    .line 792
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidSharedName(I)V

    .line 794
    :cond_2
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    aget-object v0, v1, v0

    .line 795
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 796
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 797
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 798
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    .line 805
    :pswitch_1
    and-int/lit8 v0, v4, 0x3f

    .line 806
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    if-lt v0, v1, :cond_3

    .line 807
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidSharedName(I)V

    .line 809
    :cond_3
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 810
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    aget-object v0, v1, v0

    .line 811
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 812
    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 813
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 814
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    .line 818
    :pswitch_2
    and-int/lit8 v4, v4, 0x3f

    add-int/lit8 v4, v4, 0x1

    .line 819
    if-ne v4, v2, :cond_0

    move v2, v1

    .line 821
    :goto_2
    if-ge v2, v4, :cond_4

    .line 822
    aget-byte v5, v3, v2

    iget-object v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    add-int v8, v6, v2

    aget-byte v7, v7, v8

    if-ne v5, v7, :cond_0

    .line 821
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 827
    :cond_4
    add-int v1, v6, v4

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 828
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 829
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 830
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    array-length v3, v3

    if-lt v2, v3, :cond_5

    .line 831
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenNames([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 833
    :cond_5
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    aput-object v1, v2, v3

    .line 835
    :cond_6
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 836
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_1

    .line 844
    :pswitch_3
    and-int/lit8 v4, v4, 0x3f

    .line 845
    const/16 v5, 0x37

    if-le v4, v5, :cond_8

    .line 846
    const/16 v2, 0x3b

    if-ne v4, v2, :cond_0

    .line 847
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 848
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->inObject()Z

    move-result v0

    if-nez v0, :cond_7

    .line 849
    const/16 v0, 0x7d

    const/16 v2, 0x5d

    invoke-virtual {p0, v0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportMismatchedEndMarker(IC)V

    .line 851
    :cond_7
    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 852
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getParent()Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move v0, v1

    .line 853
    goto/16 :goto_1

    .line 858
    :cond_8
    add-int/lit8 v4, v4, 0x2

    .line 859
    if-ne v4, v2, :cond_0

    move v2, v1

    .line 861
    :goto_3
    if-ge v2, v4, :cond_9

    .line 862
    aget-byte v5, v3, v2

    iget-object v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    add-int v8, v6, v2

    aget-byte v7, v7, v8

    if-ne v5, v7, :cond_0

    .line 861
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 867
    :cond_9
    add-int v1, v6, v4

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 868
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 869
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    if-eqz v2, :cond_b

    .line 870
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    array-length v3, v3

    if-lt v2, v3, :cond_a

    .line 871
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenNames([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    .line 873
    :cond_a
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNames:[Ljava/lang/String;

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenNameCount:I

    aput-object v1, v2, v3

    .line 875
    :cond_b
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->setCurrentName(Ljava/lang/String;)V

    .line 876
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_1

    :cond_c
    move v0, v1

    .line 886
    goto/16 :goto_1

    .line 889
    :cond_d
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v2, v3, :cond_e

    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->getCurrentName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_e
    move v0, v1

    goto/16 :goto_1

    .line 777
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 779
    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_0
        0x30 -> :sswitch_1
        0x31 -> :sswitch_1
        0x32 -> :sswitch_1
        0x33 -> :sswitch_1
    .end sparse-switch
.end method

.method public nextIntValue(I)I
    .locals 2

    .prologue
    .line 1026
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_0

    .line 1027
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->getIntValue()I

    move-result p1

    .line 1029
    :cond_0
    return p1
.end method

.method public nextLongValue(J)J
    .locals 2

    .prologue
    .line 1036
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_0

    .line 1037
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->getLongValue()J

    move-result-wide p1

    .line 1039
    :cond_0
    return-wide p1
.end method

.method public nextTextValue()Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 897
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->inObject()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v2, :cond_4

    .line 898
    :cond_0
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v0, :cond_1

    .line 899
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipIncomplete()V

    .line 901
    :cond_1
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 902
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v2, :cond_3

    .line 903
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMore()Z

    move-result v0

    if-nez v0, :cond_2

    .line 904
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_handleEOF()V

    .line 905
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->close()V

    .line 906
    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    move-object v0, v1

    .line 1019
    :goto_0
    return-object v0

    .line 909
    :cond_2
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 911
    :cond_3
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v2, v0

    .line 912
    iget-wide v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currInputProcessed:J

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenInputTotal:J

    .line 915
    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_binaryValue:[B

    .line 916
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 918
    shr-int/lit8 v2, v0, 0x5

    and-int/lit8 v2, v2, 0x7

    packed-switch v2, :pswitch_data_0

    .line 1019
    :cond_4
    :pswitch_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v2, :cond_b

    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->getText()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 920
    :pswitch_1
    if-nez v0, :cond_5

    .line 921
    const-string v1, "Invalid token byte 0x00"

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 925
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 926
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    if-lt v0, v1, :cond_6

    .line 927
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportInvalidSharedStringValue(I)V

    .line 929
    :cond_6
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 930
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    aget-object v0, v1, v0

    .line 931
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->resetWithString(Ljava/lang/String;)V

    .line 932
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_0

    .line 938
    :pswitch_2
    and-int/lit8 v0, v0, 0x1f

    .line 939
    if-nez v0, :cond_4

    .line 940
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 941
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->resetWithEmpty()V

    .line 942
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 943
    const-string v0, ""

    goto :goto_0

    .line 950
    :pswitch_3
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 951
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 952
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortAsciiValue(I)V

    .line 956
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    if-ltz v0, :cond_8

    .line 957
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_7

    .line 958
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    .line 959
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    aput-object v0, v1, v2

    goto/16 :goto_0

    .line 961
    :cond_7
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenStringValues()V

    .line 962
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 965
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 973
    :pswitch_4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 974
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 975
    and-int/lit8 v0, v0, 0x3f

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_decodeShortUnicodeValue(I)V

    .line 979
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    if-ltz v0, :cond_a

    .line 980
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_9

    .line 981
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    .line 982
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValues:[Ljava/lang/String;

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    aput-object v0, v1, v2

    goto/16 :goto_0

    .line 984
    :cond_9
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_expandSeenStringValues()V

    .line 985
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 988
    :cond_a
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    move-object v0, v1

    .line 1019
    goto/16 :goto_0

    .line 918
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public nextToken()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 553
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 555
    iget-boolean v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    if-eqz v3, :cond_0

    .line 556
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_skipIncomplete()V

    .line 558
    :cond_0
    iget-wide v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currInputProcessed:J

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenInputTotal:J

    .line 560
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_binaryValue:[B

    .line 562
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->inObject()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v4, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v3, v4, :cond_1

    .line 563
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_handleFieldName()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 697
    :goto_0
    return-object v0

    .line 565
    :cond_1
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v3, v4, :cond_2

    .line 566
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMore()Z

    move-result v3

    if-nez v3, :cond_2

    .line 567
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_handleEOF()V

    .line 572
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->close()V

    .line 573
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    move-object v0, v2

    goto :goto_0

    .line 576
    :cond_2
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v3, v3, v4

    .line 577
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_typeByte:I

    .line 578
    shr-int/lit8 v4, v3, 0x5

    and-int/lit8 v4, v4, 0x7

    packed-switch v4, :pswitch_data_0

    .line 696
    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid type marker byte 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v3, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " for expected value token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    move-object v0, v2

    .line 697
    goto :goto_0

    .line 580
    :pswitch_0
    if-nez v3, :cond_4

    .line 581
    const-string v0, "Invalid token byte 0x00"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 583
    :cond_4
    add-int/lit8 v0, v3, -0x1

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_handleSharedString(I)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    goto :goto_0

    .line 587
    :pswitch_1
    and-int/lit8 v4, v3, 0x1f

    .line 588
    const/4 v5, 0x4

    if-ge v4, v5, :cond_5

    .line 589
    packed-switch v4, :pswitch_data_1

    .line 598
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_0

    .line 591
    :pswitch_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->resetWithEmpty()V

    .line 592
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_0

    .line 594
    :pswitch_3
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_0

    .line 596
    :pswitch_4
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto :goto_0

    .line 602
    :cond_5
    const/16 v5, 0x8

    if-ge v4, v5, :cond_6

    .line 603
    and-int/lit8 v4, v4, 0x3

    if-gt v4, v8, :cond_3

    .line 604
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 605
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 606
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 610
    :cond_6
    const/16 v5, 0xc

    if-ge v4, v5, :cond_8

    .line 611
    and-int/lit8 v4, v4, 0x3

    .line 612
    if-gt v4, v8, :cond_3

    .line 613
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 614
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 615
    if-nez v4, :cond_7

    :goto_2
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_got32BitFloat:Z

    .line 616
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    :cond_7
    move v0, v1

    .line 615
    goto :goto_2

    .line 620
    :cond_8
    const/16 v0, 0x1a

    if-ne v4, v0, :cond_a

    .line 621
    invoke-virtual {p0, v1, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->handleSignature(ZZ)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 627
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    if-nez v0, :cond_9

    .line 628
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    goto/16 :goto_0

    .line 630
    :cond_9
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    move-object v0, v2

    goto/16 :goto_0

    .line 633
    :cond_a
    const-string v0, "Unrecognized token byte 0x3A (malformed segment header?"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 645
    :pswitch_5
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    .line 646
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_seenStringValueCount:I

    if-ltz v1, :cond_b

    .line 647
    invoke-direct {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_addSeenStringValue()V

    .line 651
    :goto_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 649
    :cond_b
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    goto :goto_3

    .line 653
    :pswitch_6
    and-int/lit8 v1, v3, 0x1f

    invoke-static {v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileUtil;->zigzagDecode(I)I

    move-result v1

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numberInt:I

    .line 654
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_numTypesValid:I

    .line 655
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 657
    :pswitch_7
    and-int/lit8 v1, v3, 0x1f

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    .line 660
    :sswitch_0
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 661
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 663
    :sswitch_1
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 664
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 669
    :sswitch_2
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    if-lt v0, v1, :cond_c

    .line 670
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->loadMoreGuaranteed()V

    .line 672
    :cond_c
    and-int/lit8 v0, v3, 0x3

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_handleSharedString(I)Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    goto/16 :goto_0

    .line 674
    :sswitch_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0, v7, v7}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->createChildArrayContext(II)Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 675
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 677
    :sswitch_4
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->inArray()Z

    move-result v0

    if-nez v0, :cond_d

    .line 678
    const/16 v0, 0x5d

    const/16 v1, 0x7d

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportMismatchedEndMarker(IC)V

    .line 680
    :cond_d
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getParent()Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 681
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 683
    :sswitch_5
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0, v7, v7}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->createChildObjectContext(II)Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 684
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 686
    :sswitch_6
    const-string v1, "Invalid type marker byte 0xFB in value mode (would be END_OBJECT in key mode)"

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_reportError(Ljava/lang/String;)V

    .line 688
    :sswitch_7
    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_tokenIncomplete:Z

    .line 689
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    goto/16 :goto_0

    .line 691
    :sswitch_8
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    move-object v0, v2

    goto/16 :goto_0

    .line 578
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    .line 589
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 657
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x4 -> :sswitch_0
        0x8 -> :sswitch_1
        0xc -> :sswitch_2
        0xd -> :sswitch_2
        0xe -> :sswitch_2
        0xf -> :sswitch_2
        0x18 -> :sswitch_3
        0x19 -> :sswitch_4
        0x1a -> :sswitch_5
        0x1b -> :sswitch_6
        0x1d -> :sswitch_7
        0x1f -> :sswitch_8
    .end sparse-switch
.end method

.method public releaseBuffered(Ljava/io/OutputStream;)I
    .locals 3

    .prologue
    .line 327
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputEnd:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    sub-int/2addr v0, v1

    .line 328
    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 329
    const/4 v0, 0x0

    .line 334
    :goto_0
    return v0

    .line 332
    :cond_0
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputPtr:I

    .line 333
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_inputBuffer:[B

    invoke-virtual {p1, v2, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method

.method public setCodec(Lcom/fasterxml/jackson/core/ObjectCodec;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    .line 235
    return-void
.end method

.method public version()Lcom/fasterxml/jackson/core/Version;
    .locals 1

    .prologue
    .line 315
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;->instance:Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;->version()Lcom/fasterxml/jackson/core/Version;

    move-result-object v0

    return-object v0
.end method
