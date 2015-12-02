.class public Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;
.super Lcom/fasterxml/jackson/core/base/GeneratorBase;
.source "SmileGenerator.java"


# static fields
.field protected static final MAX_INT_AS_LONG:J = 0x7fffffffL

.field private static final MIN_BUFFER_LENGTH:I = 0x302

.field protected static final MIN_INT_AS_LONG:J = -0x80000000L

.field protected static final SURR1_FIRST:I = 0xd800

.field protected static final SURR1_LAST:I = 0xdbff

.field protected static final SURR2_FIRST:I = 0xdc00

.field protected static final SURR2_LAST:I = 0xdfff

.field protected static final TOKEN_BYTE_BIG_DECIMAL:B = 0x2at

.field protected static final TOKEN_BYTE_BIG_INTEGER:B = 0x26t

.field protected static final TOKEN_BYTE_FLOAT_32:B = 0x28t

.field protected static final TOKEN_BYTE_FLOAT_64:B = 0x29t

.field protected static final TOKEN_BYTE_INT_32:B = 0x24t

.field protected static final TOKEN_BYTE_INT_64:B = 0x25t

.field protected static final TOKEN_BYTE_LONG_STRING_ASCII:B = -0x20t

.field protected static final TOKEN_BYTE_LONG_STRING_UNICODE:B = -0x1ct

.field protected static final _smileRecyclerRef:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler",
            "<",
            "Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;",
            ">;>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected _bufferRecyclable:Z

.field protected _bytesWritten:I

.field protected _charBuffer:[C

.field protected final _charBufferLength:I

.field protected final _ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

.field protected final _out:Ljava/io/OutputStream;

.field protected _outputBuffer:[B

.field protected final _outputEnd:I

.field protected _outputTail:I

.field protected _seenNameCount:I

.field protected _seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

.field protected _seenStringValueCount:I

.field protected _seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

.field protected final _smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler",
            "<",
            "Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;",
            ">;"
        }
    .end annotation
.end field

.field protected _smileFeatures:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 271
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileRecyclerRef:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;IILcom/fasterxml/jackson/core/ObjectCodec;Ljava/io/OutputStream;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/16 v4, 0x302

    const/16 v3, 0x40

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 283
    invoke-direct {p0, p2, p4}, Lcom/fasterxml/jackson/core/base/GeneratorBase;-><init>(ILcom/fasterxml/jackson/core/ObjectCodec;)V

    .line 200
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 284
    iput p3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    .line 285
    iput-object p1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 286
    invoke-static {}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler()Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    .line 287
    iput-object p5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    .line 288
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_bufferRecyclable:Z

    .line 289
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->allocWriteEncodingBuffer()[B

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    .line 290
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    array-length v0, v0

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    .line 291
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->allocConcatBuffer()[C

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    .line 292
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    array-length v0, v0

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBufferLength:I

    .line 294
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-ge v0, v4, :cond_0

    .line 295
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Internal encoding buffer length ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") too short, must be at least "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 298
    :cond_0
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_NAMES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v0

    and-int/2addr v0, p3

    if-nez v0, :cond_1

    .line 299
    iput-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 300
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    .line 309
    :goto_0
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v0

    and-int/2addr v0, p3

    if-nez v0, :cond_3

    .line 310
    iput-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 311
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    .line 319
    :goto_1
    return-void

    .line 302
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->allocSeenNamesBuffer()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 303
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    if-nez v0, :cond_2

    .line 304
    new-array v0, v3, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 306
    :cond_2
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    goto :goto_0

    .line 313
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->allocSeenStringValuesBuffer()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 314
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    if-nez v0, :cond_4

    .line 315
    new-array v0, v3, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 317
    :cond_4
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    goto :goto_1
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;IILcom/fasterxml/jackson/core/ObjectCodec;Ljava/io/OutputStream;[BIZ)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/16 v4, 0x302

    const/16 v3, 0x40

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 324
    invoke-direct {p0, p2, p4}, Lcom/fasterxml/jackson/core/base/GeneratorBase;-><init>(ILcom/fasterxml/jackson/core/ObjectCodec;)V

    .line 200
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 325
    iput p3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    .line 326
    iput-object p1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 327
    invoke-static {}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler()Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    .line 328
    iput-object p5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    .line 329
    iput-boolean p8, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_bufferRecyclable:Z

    .line 330
    iput p7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 331
    iput-object p6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    .line 332
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    array-length v0, v0

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    .line 333
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->allocConcatBuffer()[C

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    .line 334
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    array-length v0, v0

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBufferLength:I

    .line 336
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-ge v0, v4, :cond_0

    .line 337
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Internal encoding buffer length ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") too short, must be at least "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 340
    :cond_0
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_NAMES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v0

    and-int/2addr v0, p3

    if-nez v0, :cond_1

    .line 341
    iput-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 342
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    .line 351
    :goto_0
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v0

    and-int/2addr v0, p3

    if-nez v0, :cond_3

    .line 352
    iput-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 353
    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    .line 361
    :goto_1
    return-void

    .line 344
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->allocSeenNamesBuffer()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 345
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    if-nez v0, :cond_2

    .line 346
    new-array v0, v3, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 348
    :cond_2
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    goto :goto_0

    .line 355
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->allocSeenStringValuesBuffer()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 356
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    if-nez v0, :cond_4

    .line 357
    new-array v0, v3, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 359
    :cond_4
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    goto :goto_1
.end method

.method private final _addSeenName(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/16 v4, 0x400

    const/4 v0, 0x0

    .line 2027
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    array-length v2, v2

    if-ne v1, v2, :cond_0

    .line 2028
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ne v1, v4, :cond_1

    .line 2029
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2030
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    .line 2047
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    .line 2048
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    new-instance v2, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    aget-object v4, v4, v0

    invoke-direct {v2, p1, v3, v4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;)V

    aput-object v2, v1, v0

    .line 2049
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    .line 2050
    return-void

    .line 2032
    :cond_1
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2033
    new-array v1, v4, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2035
    array-length v4, v3

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v0, v3, v2

    .line 2036
    :goto_1
    if-eqz v0, :cond_2

    .line 2037
    iget-object v1, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    and-int/lit16 v5, v1, 0x3ff

    .line 2038
    iget-object v1, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2039
    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    aget-object v6, v6, v5

    iput-object v6, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2040
    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    aput-object v0, v6, v5

    move-object v0, v1

    .line 2042
    goto :goto_1

    .line 2035
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0
.end method

.method private final _addSeenStringValue(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/16 v4, 0x400

    const/4 v0, 0x0

    .line 2081
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    array-length v2, v2

    if-ne v1, v2, :cond_0

    .line 2082
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-ne v1, v4, :cond_1

    .line 2083
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2084
    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    .line 2101
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    .line 2102
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    new-instance v2, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    aget-object v4, v4, v0

    invoke-direct {v2, p1, v3, v4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;-><init>(Ljava/lang/String;ILcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;)V

    aput-object v2, v1, v0

    .line 2103
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    .line 2104
    return-void

    .line 2086
    :cond_1
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2087
    new-array v1, v4, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iput-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2089
    array-length v4, v3

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v0, v3, v2

    .line 2090
    :goto_1
    if-eqz v0, :cond_2

    .line 2091
    iget-object v1, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    and-int/lit16 v5, v1, 0x3ff

    .line 2092
    iget-object v1, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2093
    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    aget-object v6, v6, v5

    iput-object v6, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2094
    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    aput-object v0, v6, v5

    move-object v0, v1

    .line 2096
    goto :goto_1

    .line 2089
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0
.end method

.method private _convertSurrogate(II)I
    .locals 3

    .prologue
    const v2, 0xdc00

    .line 1681
    if-lt p2, v2, :cond_0

    const v0, 0xdfff

    if-le p2, v0, :cond_1

    .line 1682
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

    .line 1684
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

.method private final _ensureRoomForOutput(I)V
    .locals 2

    .prologue
    .line 1710
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, p1

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1711
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1713
    :cond_0
    return-void
.end method

.method private final _findSeenName(Ljava/lang/String;)I
    .locals 5

    .prologue
    const/4 v2, -0x1

    .line 1996
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    .line 1997
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, v3

    aget-object v1, v0, v1

    .line 1998
    if-nez v1, :cond_0

    move v0, v2

    .line 2021
    :goto_0
    return v0

    .line 2004
    :cond_0
    iget-object v0, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    if-ne v0, p1, :cond_1

    .line 2005
    iget v0, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->index:I

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 2007
    :cond_2
    iget-object v0, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    if-eqz v0, :cond_3

    .line 2008
    iget-object v4, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    if-ne v4, p1, :cond_2

    .line 2009
    iget v0, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->index:I

    goto :goto_0

    .line 2015
    :cond_3
    iget-object v0, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    .line 2016
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    if-ne v4, v3, :cond_4

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2017
    iget v0, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->index:I

    goto :goto_0

    .line 2019
    :cond_4
    iget-object v1, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2020
    if-nez v1, :cond_3

    move v0, v2

    .line 2021
    goto :goto_0
.end method

.method private final _findSeenStringValue(Ljava/lang/String;)I
    .locals 4

    .prologue
    .line 2054
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    .line 2055
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, v2

    aget-object v1, v0, v1

    .line 2056
    if-eqz v1, :cond_4

    move-object v0, v1

    .line 2060
    :cond_0
    iget-object v3, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    if-ne v3, p1, :cond_1

    .line 2061
    iget v0, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->index:I

    .line 2075
    :goto_0
    return v0

    .line 2063
    :cond_1
    iget-object v0, v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2064
    if-nez v0, :cond_0

    .line 2068
    :cond_2
    iget-object v0, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->value:Ljava/lang/String;

    .line 2069
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    if-ne v3, v2, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2070
    iget v0, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->index:I

    goto :goto_0

    .line 2072
    :cond_3
    iget-object v1, v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;->next:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 2073
    if-nez v1, :cond_2

    .line 2075
    :cond_4
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private _mediumUTF8Encode([CII)V
    .locals 9

    .prologue
    const/16 v7, 0x7f

    .line 1608
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    add-int/lit8 v3, v0, -0x4

    move v0, p2

    .line 1611
    :goto_0
    if-ge v0, p3, :cond_9

    .line 1615
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    if-lt v1, v3, :cond_0

    .line 1616
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1618
    :cond_0
    add-int/lit8 v2, v0, 0x1

    aget-char v0, p1, v0

    .line 1620
    if-gt v0, v7, :cond_b

    .line 1621
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v0, v0

    aput-byte v0, v1, v4

    .line 1623
    sub-int v1, p3, v2

    .line 1624
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    sub-int v0, v3, v0

    .line 1626
    if-le v1, v0, :cond_a

    .line 1629
    :goto_1
    add-int v4, v0, v2

    .line 1632
    :goto_2
    if-lt v2, v4, :cond_1

    move v0, v2

    .line 1633
    goto :goto_0

    .line 1635
    :cond_1
    add-int/lit8 v1, v2, 0x1

    aget-char v0, p1, v2

    .line 1636
    if-le v0, v7, :cond_2

    move v2, v0

    move v0, v1

    .line 1644
    :goto_3
    const/16 v1, 0x800

    if-ge v2, v1, :cond_3

    .line 1645
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v5, v2, 0x6

    or-int/lit16 v5, v5, 0xc0

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    .line 1646
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v1, v4

    goto :goto_0

    .line 1639
    :cond_2
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v0, v0

    aput-byte v0, v2, v5

    move v2, v1

    goto :goto_2

    .line 1649
    :cond_3
    const v1, 0xd800

    if-lt v2, v1, :cond_4

    const v1, 0xdfff

    if-le v2, v1, :cond_5

    .line 1650
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v5, v2, 0xc

    or-int/lit16 v5, v5, 0xe0

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    .line 1651
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v5, v2, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    .line 1652
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v1, v4

    goto/16 :goto_0

    .line 1656
    :cond_5
    const v1, 0xdbff

    if-le v2, v1, :cond_6

    .line 1657
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1660
    :cond_6
    if-lt v0, p3, :cond_7

    .line 1661
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1663
    :cond_7
    add-int/lit8 v1, v0, 0x1

    aget-char v0, p1, v0

    invoke-direct {p0, v2, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_convertSurrogate(II)I

    move-result v0

    .line 1664
    const v2, 0x10ffff

    if-le v0, v2, :cond_8

    .line 1665
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1667
    :cond_8
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v5, v0, 0x12

    or-int/lit16 v5, v5, 0xf0

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    .line 1668
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v5, v0, 0xc

    and-int/lit8 v5, v5, 0x3f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    .line 1669
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v5, v0, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    .line 1670
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    aput-byte v0, v2, v4

    move v0, v1

    goto/16 :goto_0

    .line 1673
    :cond_9
    return-void

    :cond_a
    move v0, v1

    goto/16 :goto_1

    :cond_b
    move v8, v0

    move v0, v2

    move v2, v8

    goto/16 :goto_3
.end method

.method private final _shortUTF8Encode([CII)I
    .locals 4

    .prologue
    .line 1471
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1472
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    .line 1474
    :goto_0
    aget-char v3, p1, p2

    .line 1475
    const/16 v1, 0x7f

    if-le v3, v1, :cond_0

    .line 1476
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_shortUTF8Encode2([CIII)I

    move-result v0

    .line 1482
    :goto_1
    return v0

    .line 1478
    :cond_0
    add-int/lit8 v1, v0, 0x1

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 1479
    add-int/lit8 p2, p2, 0x1

    if-lt p2, p3, :cond_1

    .line 1480
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    sub-int v0, v1, v0

    .line 1481
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method private final _shortUTF8Encode2([CIII)I
    .locals 6

    .prologue
    .line 1492
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    .line 1493
    :goto_0
    if-ge p2, p3, :cond_7

    .line 1494
    add-int/lit8 v1, p2, 0x1

    aget-char v3, p1, p2

    .line 1495
    const/16 v0, 0x7f

    if-gt v3, v0, :cond_0

    .line 1496
    add-int/lit8 v0, p4, 0x1

    int-to-byte v3, v3

    aput-byte v3, v2, p4

    move p4, v0

    move p2, v1

    .line 1497
    goto :goto_0

    .line 1500
    :cond_0
    const/16 v0, 0x800

    if-ge v3, v0, :cond_1

    .line 1501
    add-int/lit8 v0, p4, 0x1

    shr-int/lit8 v4, v3, 0x6

    or-int/lit16 v4, v4, 0xc0

    int-to-byte v4, v4

    aput-byte v4, v2, p4

    .line 1502
    add-int/lit8 p4, v0, 0x1

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    move p2, v1

    .line 1503
    goto :goto_0

    .line 1507
    :cond_1
    const v0, 0xd800

    if-lt v3, v0, :cond_2

    const v0, 0xdfff

    if-le v3, v0, :cond_3

    .line 1508
    :cond_2
    add-int/lit8 v0, p4, 0x1

    shr-int/lit8 v4, v3, 0xc

    or-int/lit16 v4, v4, 0xe0

    int-to-byte v4, v4

    aput-byte v4, v2, p4

    .line 1509
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v5, v3, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    aput-byte v5, v2, v0

    .line 1510
    add-int/lit8 p4, v4, 0x1

    and-int/lit8 v0, v3, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    aput-byte v0, v2, v4

    move p2, v1

    .line 1511
    goto :goto_0

    .line 1514
    :cond_3
    const v0, 0xdbff

    if-le v3, v0, :cond_4

    .line 1515
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1518
    :cond_4
    if-lt v1, p3, :cond_5

    .line 1519
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1521
    :cond_5
    add-int/lit8 p2, v1, 0x1

    aget-char v0, p1, v1

    invoke-direct {p0, v3, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_convertSurrogate(II)I

    move-result v0

    .line 1522
    const v1, 0x10ffff

    if-le v0, v1, :cond_6

    .line 1523
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1525
    :cond_6
    add-int/lit8 v1, p4, 0x1

    shr-int/lit8 v3, v0, 0x12

    or-int/lit16 v3, v3, 0xf0

    int-to-byte v3, v3

    aput-byte v3, v2, p4

    .line 1526
    add-int/lit8 v3, v1, 0x1

    shr-int/lit8 v4, v0, 0xc

    and-int/lit8 v4, v4, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    aput-byte v4, v2, v1

    .line 1527
    add-int/lit8 v1, v3, 0x1

    shr-int/lit8 v4, v0, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 1528
    add-int/lit8 p4, v1, 0x1

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    aput-byte v0, v2, v1

    goto/16 :goto_0

    .line 1530
    :cond_7
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    sub-int v0, p4, v0

    .line 1531
    iput p4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1532
    return v0
.end method

.method private _slowUTF8Encode(Ljava/lang/String;)V
    .locals 10

    .prologue
    const/16 v8, 0x7f

    .line 1537
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 1538
    const/4 v0, 0x0

    .line 1539
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    add-int/lit8 v4, v1, -0x4

    .line 1542
    :goto_0
    if-ge v0, v3, :cond_9

    .line 1546
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    if-lt v1, v4, :cond_0

    .line 1547
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1549
    :cond_0
    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 1551
    if-gt v0, v8, :cond_b

    .line 1552
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v0, v0

    aput-byte v0, v1, v5

    .line 1554
    sub-int v1, v3, v2

    .line 1555
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    sub-int v0, v4, v0

    .line 1557
    if-le v1, v0, :cond_a

    .line 1560
    :goto_1
    add-int v5, v0, v2

    .line 1563
    :goto_2
    if-lt v2, v5, :cond_1

    move v0, v2

    .line 1564
    goto :goto_0

    .line 1566
    :cond_1
    add-int/lit8 v1, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 1567
    if-le v0, v8, :cond_2

    move v2, v0

    move v0, v1

    .line 1575
    :goto_3
    const/16 v1, 0x800

    if-ge v2, v1, :cond_3

    .line 1576
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v6, v2, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    .line 1577
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v1, v5

    goto :goto_0

    .line 1570
    :cond_2
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v0, v0

    aput-byte v0, v2, v6

    move v2, v1

    goto :goto_2

    .line 1580
    :cond_3
    const v1, 0xd800

    if-lt v2, v1, :cond_4

    const v1, 0xdfff

    if-le v2, v1, :cond_5

    .line 1581
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v6, v2, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    .line 1582
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v6, v2, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/lit16 v6, v6, 0x80

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    .line 1583
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v1, v5

    goto/16 :goto_0

    .line 1587
    :cond_5
    const v1, 0xdbff

    if-le v2, v1, :cond_6

    .line 1588
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1591
    :cond_6
    if-lt v0, v3, :cond_7

    .line 1592
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1594
    :cond_7
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v2, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_convertSurrogate(II)I

    move-result v0

    .line 1595
    const v2, 0x10ffff

    if-le v0, v2, :cond_8

    .line 1596
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_throwIllegalSurrogate(I)V

    .line 1598
    :cond_8
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v6, v0, 0x12

    or-int/lit16 v6, v6, 0xf0

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    .line 1599
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v6, v0, 0xc

    and-int/lit8 v6, v6, 0x3f

    or-int/lit16 v6, v6, 0x80

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    .line 1600
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v6, v0, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/lit16 v6, v6, 0x80

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    .line 1601
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    aput-byte v0, v2, v5

    move v0, v1

    goto/16 :goto_0

    .line 1604
    :cond_9
    return-void

    :cond_a
    move v0, v1

    goto/16 :goto_1

    :cond_b
    move v9, v0

    move v0, v2

    move v2, v9

    goto/16 :goto_3
.end method

.method protected static final _smileBufferRecycler()Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler",
            "<",
            "Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;",
            ">;"
        }
    .end annotation

    .prologue
    .line 387
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileRecyclerRef:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 388
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 390
    :goto_0
    if-nez v0, :cond_0

    .line 391
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-direct {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;-><init>()V

    .line 392
    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileRecyclerRef:Ljava/lang/ThreadLocal;

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 394
    :cond_0
    return-object v0

    .line 388
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    goto :goto_0
.end method

.method private _throwIllegalSurrogate(I)V
    .locals 3

    .prologue
    .line 1689
    const v0, 0x10ffff

    if-le p1, v0, :cond_0

    .line 1690
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

    .line 1692
    :cond_0
    const v0, 0xd800

    if-lt p1, v0, :cond_2

    .line 1693
    const v0, 0xdbff

    if-gt p1, v0, :cond_1

    .line 1694
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

    .line 1696
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

    .line 1699
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

.method private final _writeByte(B)V
    .locals 3

    .prologue
    .line 1717
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1718
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1720
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p1, v0, v1

    .line 1721
    return-void
.end method

.method private final _writeBytes(BB)V
    .locals 3

    .prologue
    .line 1725
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1726
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1728
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p1, v0, v1

    .line 1729
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p2, v0, v1

    .line 1730
    return-void
.end method

.method private final _writeBytes(BBB)V
    .locals 3

    .prologue
    .line 1734
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1735
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1737
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p1, v0, v1

    .line 1738
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p2, v0, v1

    .line 1739
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p3, v0, v1

    .line 1740
    return-void
.end method

.method private final _writeBytes(BBBB)V
    .locals 3

    .prologue
    .line 1744
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x3

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1745
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1747
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p1, v0, v1

    .line 1748
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p2, v0, v1

    .line 1749
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p3, v0, v1

    .line 1750
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p4, v0, v1

    .line 1751
    return-void
.end method

.method private final _writeBytes(BBBBB)V
    .locals 3

    .prologue
    .line 1755
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x4

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1756
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1758
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p1, v0, v1

    .line 1759
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p2, v0, v1

    .line 1760
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p3, v0, v1

    .line 1761
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p4, v0, v1

    .line 1762
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p5, v0, v1

    .line 1763
    return-void
.end method

.method private final _writeBytes(BBBBBB)V
    .locals 3

    .prologue
    .line 1767
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x5

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1768
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1770
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p1, v0, v1

    .line 1771
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p2, v0, v1

    .line 1772
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p3, v0, v1

    .line 1773
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p4, v0, v1

    .line 1774
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p5, v0, v1

    .line 1775
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte p6, v0, v1

    .line 1776
    return-void
.end method

.method private final _writeBytes([BII)V
    .locals 2

    .prologue
    .line 1780
    if-nez p3, :cond_0

    .line 1790
    :goto_0
    return-void

    .line 1783
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, p3

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_1

    .line 1784
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytesLong([BII)V

    goto :goto_0

    .line 1788
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1789
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    goto :goto_0
.end method

.method private final _writeBytesLong([BII)V
    .locals 3

    .prologue
    .line 1794
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1795
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1798
    :cond_0
    :goto_0
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    sub-int/2addr v0, v1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1799
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1800
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1801
    sub-int/2addr p3, v0

    if-nez p3, :cond_1

    .line 1807
    return-void

    .line 1804
    :cond_1
    add-int/2addr p2, v0

    .line 1805
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    goto :goto_0
.end method

.method private final _writeFieldName(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/16 v6, 0x38

    const/16 v0, 0x34

    const/4 v5, -0x4

    const/4 v4, 0x0

    .line 581
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 582
    if-nez v1, :cond_1

    .line 583
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 635
    :cond_0
    :goto_0
    return-void

    .line 587
    :cond_1
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ltz v2, :cond_2

    .line 588
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_findSeenName(Ljava/lang/String;)I

    move-result v2

    .line 589
    if-ltz v2, :cond_2

    .line 590
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeSharedNameReference(I)V

    goto :goto_0

    .line 594
    :cond_2
    if-le v1, v6, :cond_3

    .line 595
    invoke-direct {p0, p1, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeNonShortFieldName(Ljava/lang/String;I)V

    goto :goto_0

    .line 600
    :cond_3
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit16 v2, v2, 0xc4

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v2, v3, :cond_4

    .line 601
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 604
    :cond_4
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-virtual {p1, v4, v1, v2, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 605
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 606
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 607
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-direct {p0, v3, v4, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_shortUTF8Encode([CII)I

    move-result v3

    .line 611
    if-ne v3, v1, :cond_6

    .line 612
    const/16 v1, 0x40

    if-gt v3, v1, :cond_5

    .line 613
    add-int/lit8 v0, v3, 0x7f

    int-to-byte v0, v0

    .line 630
    :goto_1
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    aput-byte v0, v1, v2

    .line 632
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ltz v0, :cond_0

    .line 633
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_addSeenName(Ljava/lang/String;)V

    goto :goto_0

    .line 617
    :cond_5
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v5, v1, v3

    goto :goto_1

    .line 620
    :cond_6
    if-gt v3, v6, :cond_7

    .line 622
    add-int/lit16 v0, v3, 0xbe

    int-to-byte v0, v0

    goto :goto_1

    .line 626
    :cond_7
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v5, v1, v3

    goto :goto_1
.end method

.method private final _writeLongAsciiFieldName([B)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 709
    array-length v0, p1

    .line 710
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v1, v2, :cond_0

    .line 711
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 713
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/16 v3, 0x34

    aput-byte v3, v1, v2

    .line 715
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-ge v1, v2, :cond_1

    .line 716
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p1, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 717
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 733
    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/4 v2, -0x4

    aput-byte v2, v0, v1

    .line 734
    return-void

    .line 719
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 722
    const/16 v1, 0x302

    if-ge v0, v1, :cond_2

    .line 723
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p1, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 724
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    goto :goto_0

    .line 727
    :cond_2
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    if-lez v1, :cond_3

    .line 728
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 730
    :cond_3
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method

.method private final _writeNonSharedString(Ljava/lang/String;I)V
    .locals 5

    .prologue
    const/4 v4, -0x4

    const/16 v3, -0x1c

    const/4 v2, 0x0

    .line 886
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBufferLength:I

    if-le p2, v0, :cond_0

    .line 887
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 888
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_slowUTF8Encode(Ljava/lang/String;)V

    .line 889
    invoke-direct {p0, v4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 916
    :goto_0
    return-void

    .line 892
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-virtual {p1, v2, p2, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 894
    add-int v0, p2, p2

    add-int/2addr v0, p2

    add-int/lit8 v0, v0, 0x2

    .line 896
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    array-length v1, v1

    if-le v0, v1, :cond_1

    .line 898
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 899
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-direct {p0, v0, v2, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_mediumUTF8Encode([CII)V

    .line 900
    invoke-direct {p0, v4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    goto :goto_0

    .line 904
    :cond_1
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_2

    .line 905
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 907
    :cond_2
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 909
    const/16 v1, -0x20

    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 910
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-direct {p0, v1, v2, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_shortUTF8Encode([CII)I

    move-result v1

    .line 912
    if-le v1, p2, :cond_3

    .line 913
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    aput-byte v3, v1, v0

    .line 915
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v4, v0, v1

    goto :goto_0
.end method

.method private final _writeNonShortFieldName(Ljava/lang/String;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 640
    const/16 v0, 0x34

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 642
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBufferLength:I

    if-le p2, v0, :cond_2

    .line 643
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_slowUTF8Encode(Ljava/lang/String;)V

    .line 657
    :goto_0
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ltz v0, :cond_0

    .line 658
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_addSeenName(Ljava/lang/String;)V

    .line 660
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_1

    .line 661
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 663
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/4 v2, -0x4

    aput-byte v2, v0, v1

    .line 664
    return-void

    .line 645
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-virtual {p1, v2, p2, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 647
    add-int v0, p2, p2

    add-int/2addr v0, p2

    .line 648
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    array-length v1, v1

    if-gt v0, v1, :cond_4

    .line 649
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_3

    .line 650
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 652
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-direct {p0, v0, v2, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_shortUTF8Encode([CII)I

    goto :goto_0

    .line 654
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-direct {p0, v0, v2, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_mediumUTF8Encode([CII)V

    goto :goto_0
.end method

.method private _writePositiveVInt(I)V
    .locals 8

    .prologue
    const/16 v4, 0x7f

    .line 1816
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ensureRoomForOutput(I)V

    .line 1817
    and-int/lit8 v0, p1, 0x3f

    add-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    .line 1818
    shr-int/lit8 v1, p1, 0x6

    .line 1819
    if-gt v1, v4, :cond_1

    .line 1820
    if-lez v1, :cond_0

    .line 1821
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v1, v1

    aput-byte v1, v2, v3

    .line 1823
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v0, v1, v2

    .line 1849
    :goto_0
    return-void

    .line 1826
    :cond_1
    and-int/lit8 v2, v1, 0x7f

    int-to-byte v2, v2

    .line 1827
    shr-int/lit8 v1, v1, 0x7

    .line 1828
    if-gt v1, v4, :cond_2

    .line 1829
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v1, v1

    aput-byte v1, v3, v4

    .line 1830
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v2, v1, v3

    .line 1831
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v0, v1, v2

    goto :goto_0

    .line 1833
    :cond_2
    and-int/lit8 v3, v1, 0x7f

    int-to-byte v3, v3

    .line 1834
    shr-int/lit8 v1, v1, 0x7

    .line 1835
    if-gt v1, v4, :cond_3

    .line 1836
    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v1, v1

    aput-byte v1, v4, v5

    .line 1837
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v3, v1, v4

    .line 1838
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v2, v1, v3

    .line 1839
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v0, v1, v2

    goto :goto_0

    .line 1841
    :cond_3
    and-int/lit8 v4, v1, 0x7f

    int-to-byte v4, v4

    .line 1842
    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v1, v1, 0x7

    int-to-byte v1, v1

    aput-byte v1, v5, v6

    .line 1843
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v4, v1, v5

    .line 1844
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v3, v1, v4

    .line 1845
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v2, v1, v3

    .line 1846
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v0, v1, v2

    goto/16 :goto_0
.end method

.method private final _writeSharedNameReference(I)V
    .locals 3

    .prologue
    .line 791
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-lt p1, v0, :cond_0

    .line 792
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Internal error: trying to write shared name with index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; but have only seen "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " so far!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 795
    :cond_0
    const/16 v0, 0x40

    if-ge p1, v0, :cond_1

    .line 796
    add-int/lit8 v0, p1, 0x40

    int-to-byte v0, v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 800
    :goto_0
    return-void

    .line 798
    :cond_1
    shr-int/lit8 v0, p1, 0x8

    add-int/lit8 v0, v0, 0x30

    int-to-byte v0, v0

    int-to-byte v1, p1

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BB)V

    goto :goto_0
.end method

.method private final _writeSharedStringValueReference(I)V
    .locals 3

    .prologue
    .line 867
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-lt p1, v0, :cond_0

    .line 868
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Internal error: trying to write shared String value with index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; but have only seen "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " so far!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 871
    :cond_0
    const/16 v0, 0x1f

    if-ge p1, v0, :cond_1

    .line 872
    add-int/lit8 v0, p1, 0x1

    int-to-byte v0, v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 876
    :goto_0
    return-void

    .line 874
    :cond_1
    shr-int/lit8 v0, p1, 0x8

    add-int/lit16 v0, v0, 0xec

    int-to-byte v0, v0

    int-to-byte v1, p1

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BB)V

    goto :goto_0
.end method

.method private _writeSignedVInt(I)V
    .locals 1

    .prologue
    .line 1859
    invoke-static {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileUtil;->zigzagEncode(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writePositiveVInt(I)V

    .line 1860
    return-void
.end method


# virtual methods
.method protected final _flushBuffer()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1981
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    if-lez v0, :cond_0

    .line 1982
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_bytesWritten:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_bytesWritten:I

    .line 1983
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 1984
    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1986
    :cond_0
    return-void
.end method

.method protected _notSupported()Ljava/lang/UnsupportedOperationException;
    .locals 1

    .prologue
    .line 2121
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    return-object v0
.end method

.method protected _releaseBuffers()V
    .locals 4

    .prologue
    const/16 v3, 0x40

    const/4 v2, 0x0

    .line 1938
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    .line 1939
    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_bufferRecyclable:Z

    if-eqz v1, :cond_0

    .line 1940
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    .line 1941
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/IOContext;->releaseWriteEncodingBuffer([B)V

    .line 1943
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    .line 1944
    if-eqz v0, :cond_1

    .line 1945
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    .line 1946
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/IOContext;->releaseConcatBuffer([C)V

    .line 1952
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 1953
    if-eqz v0, :cond_3

    array-length v1, v0

    if-ne v1, v3, :cond_3

    .line 1954
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNames:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 1958
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-lez v1, :cond_2

    .line 1959
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1961
    :cond_2
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->releaseSeenNamesBuffer([Ljava/lang/Object;)V

    .line 1965
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 1966
    if-eqz v0, :cond_5

    array-length v1, v0

    if-ne v1, v3, :cond_5

    .line 1967
    iput-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValues:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$SharedStringNode;

    .line 1971
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-lez v1, :cond_4

    .line 1972
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1974
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileBufferRecycler:Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileBufferRecycler;->releaseSeenStringValuesBuffer([Ljava/lang/Object;)V

    .line 1977
    :cond_5
    return-void
.end method

.method protected final _verifyValueWrite(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1399
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->writeValue()I

    move-result v0

    .line 1400
    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 1401
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can not "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expecting field name"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_reportError(Ljava/lang/String;)V

    .line 1403
    :cond_0
    return-void
.end method

.method protected _write7BitBinaryWithLength([BII)V
    .locals 5

    .prologue
    .line 1864
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writePositiveVInt(I)V

    .line 1866
    :goto_0
    const/4 v0, 0x7

    if-lt p3, v0, :cond_1

    .line 1867
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x8

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_0

    .line 1868
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1870
    :cond_0
    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    .line 1871
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v1, 0x1

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 1872
    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    .line 1873
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x2

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    .line 1874
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    .line 1875
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x3

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 1876
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    .line 1877
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x4

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    .line 1878
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    .line 1879
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x5

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 1880
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    .line 1881
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x6

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    .line 1882
    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p2, v2, 0x1

    aget-byte v1, p1, v2

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    .line 1883
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v3, v0, 0x7

    and-int/lit8 v3, v3, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1884
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x7f

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 1885
    add-int/lit8 p3, p3, -0x7

    .line 1886
    goto/16 :goto_0

    .line 1888
    :cond_1
    if-lez p3, :cond_3

    .line 1890
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x7

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_2

    .line 1891
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1893
    :cond_2
    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    .line 1894
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v1, 0x1

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 1895
    const/4 v2, 0x1

    if-le p3, v2, :cond_8

    .line 1896
    and-int/lit8 v1, v1, 0x1

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    .line 1897
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x2

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    .line 1898
    const/4 v1, 0x2

    if-le p3, v1, :cond_7

    .line 1899
    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    .line 1900
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x3

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 1901
    const/4 v2, 0x3

    if-le p3, v2, :cond_6

    .line 1902
    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    .line 1903
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x4

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    .line 1904
    const/4 v1, 0x4

    if-le p3, v1, :cond_5

    .line 1905
    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    .line 1906
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v4, v0, 0x5

    and-int/lit8 v4, v4, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 1907
    const/4 v2, 0x5

    if-le p3, v2, :cond_4

    .line 1908
    and-int/lit8 v0, v0, 0x1f

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    .line 1909
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    shr-int/lit8 v3, v0, 0x6

    and-int/lit8 v3, v3, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1910
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x3f

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 1927
    :cond_3
    :goto_1
    return-void

    .line 1912
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    goto :goto_1

    .line 1915
    :cond_5
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0xf

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    goto :goto_1

    .line 1918
    :cond_6
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x7

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    goto :goto_1

    .line 1921
    :cond_7
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x3

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    goto :goto_1

    .line 1924
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    goto :goto_1
.end method

.method protected final _writeFieldName(Lcom/fasterxml/jackson/core/SerializableString;)V
    .locals 5

    .prologue
    .line 669
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->charLength()I

    move-result v0

    .line 670
    if-nez v0, :cond_1

    .line 671
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 704
    :cond_0
    :goto_0
    return-void

    .line 675
    :cond_1
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ltz v1, :cond_2

    .line 676
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_findSeenName(Ljava/lang/String;)I

    move-result v1

    .line 677
    if-ltz v1, :cond_2

    .line 678
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeSharedNameReference(I)V

    goto :goto_0

    .line 682
    :cond_2
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->asUnquotedUTF8()[B

    move-result-object v1

    .line 683
    array-length v2, v1

    .line 684
    if-eq v2, v0, :cond_3

    .line 685
    invoke-virtual {p0, p1, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeFieldNameUnicode(Lcom/fasterxml/jackson/core/SerializableString;[B)V

    goto :goto_0

    .line 689
    :cond_3
    const/16 v0, 0x40

    if-gt v2, v0, :cond_5

    .line 691
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v2

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v3, :cond_4

    .line 692
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 694
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v2, 0x7f

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    .line 695
    const/4 v0, 0x0

    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {v1, v0, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 696
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 701
    :goto_1
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ltz v0, :cond_0

    .line 702
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_addSeenName(Ljava/lang/String;)V

    goto :goto_0

    .line 698
    :cond_5
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeLongAsciiFieldName([B)V

    goto :goto_1
.end method

.method protected final _writeFieldNameUnicode(Lcom/fasterxml/jackson/core/SerializableString;[B)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 739
    array-length v0, p2

    .line 742
    const/16 v1, 0x38

    if-gt v0, v1, :cond_2

    .line 743
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v1, v0

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v1, v2, :cond_0

    .line 744
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 747
    :cond_0
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit16 v3, v0, 0xbe

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 749
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p2, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 750
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 752
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ltz v0, :cond_1

    .line 753
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_addSeenName(Ljava/lang/String;)V

    .line 785
    :cond_1
    :goto_0
    return-void

    .line 757
    :cond_2
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v1, v2, :cond_3

    .line 758
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 760
    :cond_3
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/16 v3, 0x34

    aput-byte v3, v1, v2

    .line 762
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-ge v1, v2, :cond_4

    .line 763
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p2, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 764
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 780
    :goto_1
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/4 v2, -0x4

    aput-byte v2, v0, v1

    .line 782
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenNameCount:I

    if-ltz v0, :cond_1

    .line 783
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_addSeenName(Ljava/lang/String;)V

    goto :goto_0

    .line 766
    :cond_4
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 769
    const/16 v1, 0x302

    if-ge v0, v1, :cond_5

    .line 770
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p2, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 771
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    goto :goto_1

    .line 774
    :cond_5
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    if-lez v1, :cond_6

    .line 775
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 777
    :cond_6
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    invoke-virtual {v1, p2, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_1
.end method

.method public close()V
    .locals 2

    .prologue
    .line 1427
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    if-eqz v0, :cond_1

    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->AUTO_CLOSE_JSON_CONTENT:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->isEnabled(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1430
    :goto_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->getOutputContext()Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    move-result-object v0

    .line 1431
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->inArray()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1432
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeEndArray()V

    goto :goto_0

    .line 1433
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->inObject()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1434
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeEndObject()V

    goto :goto_0

    .line 1440
    :cond_1
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_closed:Z

    .line 1441
    invoke-super {p0}, Lcom/fasterxml/jackson/core/base/GeneratorBase;->close()V

    .line 1443
    if-nez v0, :cond_2

    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_END_MARKER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->isEnabled(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1444
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1446
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1448
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/IOContext;->isResourceManaged()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->AUTO_CLOSE_TARGET:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->isEnabled(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1449
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 1455
    :goto_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_releaseBuffers()V

    .line 1456
    return-void

    .line 1452
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    goto :goto_1
.end method

.method public configure(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;
    .locals 0

    .prologue
    .line 500
    if-eqz p2, :cond_0

    .line 501
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->enable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    .line 505
    :goto_0
    return-object p0

    .line 503
    :cond_0
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->disable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    goto :goto_0
.end method

.method public disable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;
    .locals 2

    .prologue
    .line 491
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    xor-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    .line 492
    return-object p0
.end method

.method public enable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;
    .locals 2

    .prologue
    .line 486
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    or-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    .line 487
    return-object p0
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 1414
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1415
    sget-object v0, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->FLUSH_PASSED_TO_STREAM:Lcom/fasterxml/jackson/core/JsonGenerator$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->isEnabled(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1416
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 1418
    :cond_0
    return-void
.end method

.method public getOutputTarget()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 435
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_out:Ljava/io/OutputStream;

    return-object v0
.end method

.method public final isEnabled(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Z
    .locals 2

    .prologue
    .line 496
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected outputOffset()J
    .locals 2

    .prologue
    .line 2117
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_bytesWritten:I

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public setPrettyPrinter(Lcom/fasterxml/jackson/core/PrettyPrinter;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 0

    .prologue
    .line 430
    return-object p0
.end method

.method public useDefaultPrettyPrinter()Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 0

    .prologue
    .line 421
    return-object p0
.end method

.method public version()Lcom/fasterxml/jackson/core/Version;
    .locals 1

    .prologue
    .line 405
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;->instance:Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;->version()Lcom/fasterxml/jackson/core/Version;

    move-result-object v0

    return-object v0
.end method

.method public writeBinary(Lcom/fasterxml/jackson/core/Base64Variant;[BII)V
    .locals 1

    .prologue
    .line 1137
    if-nez p2, :cond_0

    .line 1138
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeNull()V

    .line 1151
    :goto_0
    return-void

    .line 1141
    :cond_0
    const-string v0, "write Binary value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1142
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->ENCODE_BINARY_AS_7BIT:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->isEnabled(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1143
    const/16 v0, -0x18

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1144
    invoke-virtual {p0, p2, p3, p4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_write7BitBinaryWithLength([BII)V

    goto :goto_0

    .line 1146
    :cond_1
    const/4 v0, -0x3

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1147
    invoke-direct {p0, p4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writePositiveVInt(I)V

    .line 1149
    invoke-direct {p0, p2, p3, p4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes([BII)V

    goto :goto_0
.end method

.method public writeBoolean(Z)V
    .locals 1

    .prologue
    .line 1162
    const-string v0, "write boolean value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1163
    if-eqz p1, :cond_0

    .line 1164
    const/16 v0, 0x23

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1168
    :goto_0
    return-void

    .line 1166
    :cond_0
    const/16 v0, 0x22

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    goto :goto_0
.end method

.method public writeBytes([BII)V
    .locals 0

    .prologue
    .line 533
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes([BII)V

    .line 534
    return-void
.end method

.method public final writeEndArray()V
    .locals 2

    .prologue
    .line 553
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->inArray()Z

    move-result v0

    if-nez v0, :cond_0

    .line 554
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Current context not an ARRAY but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->getTypeDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_reportError(Ljava/lang/String;)V

    .line 556
    :cond_0
    const/4 v0, -0x7

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 557
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->getParent()Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    .line 558
    return-void
.end method

.method public final writeEndObject()V
    .locals 2

    .prologue
    .line 571
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->inObject()Z

    move-result v0

    if-nez v0, :cond_0

    .line 572
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Current context not an object but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->getTypeDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_reportError(Ljava/lang/String;)V

    .line 574
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->getParent()Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    .line 575
    const/4 v0, -0x5

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 576
    return-void
.end method

.method public final writeFieldName(Lcom/fasterxml/jackson/core/SerializableString;)V
    .locals 2

    .prologue
    .line 462
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->writeFieldName(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 463
    const-string v0, "Can not write a field name, expecting a value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_reportError(Ljava/lang/String;)V

    .line 465
    :cond_0
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeFieldName(Lcom/fasterxml/jackson/core/SerializableString;)V

    .line 466
    return-void
.end method

.method public final writeFieldName(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 451
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->writeFieldName(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 452
    const-string v0, "Can not write a field name, expecting a value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_reportError(Ljava/lang/String;)V

    .line 454
    :cond_0
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeFieldName(Ljava/lang/String;)V

    .line 455
    return-void
.end method

.method public writeHeader()V
    .locals 4

    .prologue
    .line 372
    const/4 v0, 0x0

    .line 373
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    sget-object v2, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_NAMES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    .line 374
    const/4 v0, 0x1

    .line 376
    :cond_0
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    sget-object v2, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    .line 377
    or-int/lit8 v0, v0, 0x2

    .line 379
    :cond_1
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_smileFeatures:I

    sget-object v2, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->ENCODE_BINARY_AS_7BIT:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v2

    and-int/2addr v1, v2

    if-nez v1, :cond_2

    .line 380
    or-int/lit8 v0, v0, 0x4

    .line 382
    :cond_2
    const/16 v1, 0x3a

    const/16 v2, 0x29

    const/16 v3, 0xa

    int-to-byte v0, v0

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBB)V

    .line 383
    return-void
.end method

.method public writeNull()V
    .locals 1

    .prologue
    .line 1173
    const-string v0, "write null value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1174
    const/16 v0, 0x21

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1175
    return-void
.end method

.method public writeNumber(D)V
    .locals 6

    .prologue
    .line 1298
    const/16 v0, 0xb

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ensureRoomForOutput(I)V

    .line 1299
    const-string v0, "write number"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1305
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    .line 1306
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/16 v4, 0x29

    aput-byte v4, v2, v3

    .line 1308
    const/16 v2, 0x23

    ushr-long v2, v0, v2

    long-to-int v2, v2

    .line 1309
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v4, 0x4

    and-int/lit8 v5, v2, 0x7f

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    .line 1310
    shr-int/lit8 v2, v2, 0x7

    .line 1311
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v4, 0x3

    and-int/lit8 v5, v2, 0x7f

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    .line 1312
    shr-int/lit8 v2, v2, 0x7

    .line 1313
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v4, 0x2

    and-int/lit8 v5, v2, 0x7f

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    .line 1314
    shr-int/lit8 v2, v2, 0x7

    .line 1315
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v4, 0x1

    and-int/lit8 v5, v2, 0x7f

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    .line 1316
    shr-int/lit8 v2, v2, 0x7

    .line 1317
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v2, v2

    aput-byte v2, v3, v4

    .line 1318
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x5

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1321
    const/16 v2, 0x1c

    shr-long v2, v0, v2

    long-to-int v2, v2

    .line 1322
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v2, v2, 0x7f

    int-to-byte v2, v2

    aput-byte v2, v3, v4

    .line 1325
    long-to-int v0, v0

    .line 1326
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x3

    and-int/lit8 v3, v0, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1327
    shr-int/lit8 v0, v0, 0x7

    .line 1328
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x2

    and-int/lit8 v3, v0, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1329
    shr-int/lit8 v0, v0, 0x7

    .line 1330
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x1

    and-int/lit8 v3, v0, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1331
    shr-int/lit8 v0, v0, 0x7

    .line 1332
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x7f

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 1333
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1334
    return-void
.end method

.method public writeNumber(F)V
    .locals 4

    .prologue
    .line 1340
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_ensureRoomForOutput(I)V

    .line 1341
    const-string v0, "write number"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1348
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    .line 1349
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/16 v3, 0x28

    aput-byte v3, v1, v2

    .line 1350
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x4

    and-int/lit8 v3, v0, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1351
    shr-int/lit8 v0, v0, 0x7

    .line 1352
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x3

    and-int/lit8 v3, v0, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1353
    shr-int/lit8 v0, v0, 0x7

    .line 1354
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x2

    and-int/lit8 v3, v0, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1355
    shr-int/lit8 v0, v0, 0x7

    .line 1356
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x1

    and-int/lit8 v3, v0, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 1357
    shr-int/lit8 v0, v0, 0x7

    .line 1358
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    and-int/lit8 v0, v0, 0x7f

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 1359
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1360
    return-void
.end method

.method public writeNumber(I)V
    .locals 13

    .prologue
    const/16 v6, 0x7f

    const/16 v1, 0x24

    .line 1180
    const-string v0, "write number"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1182
    invoke-static {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileUtil;->zigzagEncode(I)I

    move-result v0

    .line 1184
    const/16 v2, 0x3f

    if-gt v0, v2, :cond_1

    if-ltz v0, :cond_1

    .line 1185
    const/16 v2, 0x1f

    if-gt v0, v2, :cond_0

    .line 1186
    add-int/lit16 v0, v0, 0xc0

    int-to-byte v0, v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1215
    :goto_0
    return-void

    .line 1190
    :cond_0
    add-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    invoke-direct {p0, v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BB)V

    goto :goto_0

    .line 1194
    :cond_1
    and-int/lit8 v2, v0, 0x3f

    add-int/lit16 v2, v2, 0x80

    int-to-byte v5, v2

    .line 1195
    ushr-int/lit8 v0, v0, 0x6

    .line 1196
    if-gt v0, v6, :cond_2

    .line 1197
    int-to-byte v0, v0

    invoke-direct {p0, v1, v0, v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBB)V

    goto :goto_0

    .line 1200
    :cond_2
    and-int/lit8 v2, v0, 0x7f

    int-to-byte v4, v2

    .line 1201
    shr-int/lit8 v0, v0, 0x7

    .line 1202
    if-gt v0, v6, :cond_3

    .line 1203
    int-to-byte v0, v0

    invoke-direct {p0, v1, v0, v4, v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBB)V

    goto :goto_0

    .line 1206
    :cond_3
    and-int/lit8 v2, v0, 0x7f

    int-to-byte v3, v2

    .line 1207
    shr-int/lit8 v0, v0, 0x7

    .line 1208
    if-gt v0, v6, :cond_4

    .line 1209
    int-to-byte v2, v0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBB)V

    goto :goto_0

    .line 1213
    :cond_4
    and-int/lit8 v2, v0, 0x7f

    int-to-byte v9, v2

    .line 1214
    shr-int/lit8 v0, v0, 0x7

    int-to-byte v8, v0

    move-object v6, p0

    move v7, v1

    move v10, v3

    move v11, v4

    move v12, v5

    invoke-direct/range {v6 .. v12}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBBB)V

    goto :goto_0
.end method

.method public writeNumber(J)V
    .locals 13

    .prologue
    .line 1221
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const-wide/32 v0, -0x80000000

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 1222
    long-to-int v0, p1

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeNumber(I)V

    .line 1278
    :goto_0
    return-void

    .line 1225
    :cond_0
    const-string v0, "write number"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1228
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileUtil;->zigzagEncode(J)J

    move-result-wide v0

    .line 1230
    long-to-int v2, v0

    .line 1232
    and-int/lit8 v3, v2, 0x3f

    add-int/lit16 v3, v3, 0x80

    int-to-byte v6, v3

    .line 1233
    shr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x7f

    int-to-byte v5, v3

    .line 1234
    shr-int/lit8 v3, v2, 0xd

    and-int/lit8 v3, v3, 0x7f

    int-to-byte v4, v3

    .line 1235
    shr-int/lit8 v2, v2, 0x14

    and-int/lit8 v2, v2, 0x7f

    int-to-byte v3, v2

    .line 1237
    const/16 v2, 0x1b

    ushr-long/2addr v0, v2

    .line 1238
    long-to-int v2, v0

    and-int/lit8 v2, v2, 0x7f

    int-to-byte v2, v2

    .line 1241
    const/4 v7, 0x7

    shr-long/2addr v0, v7

    long-to-int v0, v0

    .line 1242
    if-nez v0, :cond_1

    .line 1243
    const/16 v1, 0x25

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBBB)V

    goto :goto_0

    .line 1247
    :cond_1
    const/16 v1, 0x7f

    if-gt v0, v1, :cond_2

    .line 1248
    const/16 v1, 0x25

    int-to-byte v0, v0

    invoke-direct {p0, v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BB)V

    move-object v1, p0

    .line 1249
    invoke-direct/range {v1 .. v6}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBB)V

    goto :goto_0

    .line 1252
    :cond_2
    and-int/lit8 v1, v0, 0x7f

    int-to-byte v1, v1

    .line 1253
    shr-int/lit8 v0, v0, 0x7

    .line 1254
    const/16 v7, 0x7f

    if-gt v0, v7, :cond_3

    .line 1255
    const/16 v7, 0x25

    int-to-byte v0, v0

    invoke-direct {p0, v7, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BB)V

    move-object v0, p0

    .line 1256
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBBB)V

    goto :goto_0

    .line 1259
    :cond_3
    and-int/lit8 v7, v0, 0x7f

    int-to-byte v12, v7

    .line 1260
    shr-int/lit8 v0, v0, 0x7

    .line 1261
    const/16 v7, 0x7f

    if-gt v0, v7, :cond_4

    .line 1262
    const/16 v7, 0x25

    int-to-byte v0, v0

    invoke-direct {p0, v7, v0, v12}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBB)V

    move-object v0, p0

    .line 1263
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBBB)V

    goto :goto_0

    .line 1266
    :cond_4
    and-int/lit8 v7, v0, 0x7f

    int-to-byte v11, v7

    .line 1267
    shr-int/lit8 v0, v0, 0x7

    .line 1268
    const/16 v7, 0x7f

    if-gt v0, v7, :cond_5

    .line 1269
    const/16 v7, 0x25

    int-to-byte v0, v0

    invoke-direct {p0, v7, v0, v11, v12}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBB)V

    move-object v0, p0

    .line 1270
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBBB)V

    goto :goto_0

    .line 1273
    :cond_5
    and-int/lit8 v7, v0, 0x7f

    int-to-byte v10, v7

    .line 1274
    shr-int/lit8 v0, v0, 0x7

    .line 1276
    const/16 v8, 0x25

    int-to-byte v9, v0

    move-object v7, p0

    invoke-direct/range {v7 .. v12}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBB)V

    move-object v0, p0

    .line 1277
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes(BBBBBB)V

    goto/16 :goto_0
.end method

.method public writeNumber(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1386
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public writeNumber(Ljava/math/BigDecimal;)V
    .locals 3

    .prologue
    .line 1365
    if-nez p1, :cond_0

    .line 1366
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeNull()V

    .line 1378
    :goto_0
    return-void

    .line 1369
    :cond_0
    const-string v0, "write number"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1370
    const/16 v0, 0x2a

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1371
    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    move-result v0

    .line 1373
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeSignedVInt(I)V

    .line 1374
    invoke-virtual {p1}, Ljava/math/BigDecimal;->unscaledValue()Ljava/math/BigInteger;

    move-result-object v0

    .line 1375
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    .line 1377
    const/4 v1, 0x0

    array-length v2, v0

    invoke-virtual {p0, v0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_write7BitBinaryWithLength([BII)V

    goto :goto_0
.end method

.method public writeNumber(Ljava/math/BigInteger;)V
    .locals 3

    .prologue
    .line 1283
    if-nez p1, :cond_0

    .line 1284
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeNull()V

    .line 1292
    :goto_0
    return-void

    .line 1287
    :cond_0
    const-string v0, "write number"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1289
    const/16 v0, 0x26

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1290
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    .line 1291
    const/4 v1, 0x0

    array-length v2, v0

    invoke-virtual {p0, v0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_write7BitBinaryWithLength([BII)V

    goto :goto_0
.end method

.method public writeRaw(B)V
    .locals 1

    .prologue
    .line 522
    const/4 v0, -0x8

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 523
    return-void
.end method

.method public writeRaw(C)V
    .locals 1

    .prologue
    .line 1110
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public writeRaw(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1095
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public writeRaw(Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 1100
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public writeRaw([CII)V
    .locals 1

    .prologue
    .line 1105
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public writeRawUTF8String([BII)V
    .locals 5

    .prologue
    const/4 v4, -0x4

    const/16 v3, -0x1c

    .line 1030
    const-string v0, "write String value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 1032
    if-nez p3, :cond_0

    .line 1033
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1077
    :goto_0
    return-void

    .line 1037
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-ltz v0, :cond_1

    .line 1038
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can not use direct UTF-8 write methods when \'Feature.CHECK_SHARED_STRING_VALUES\' enabled"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1044
    :cond_1
    const/16 v0, 0x41

    if-gt p3, v0, :cond_4

    .line 1046
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, p3

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_2

    .line 1047
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1052
    :cond_2
    const/4 v0, 0x1

    if-ne p3, v0, :cond_3

    .line 1053
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/16 v2, 0x40

    aput-byte v2, v0, v1

    .line 1054
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aget-byte v2, p1, p2

    aput-byte v2, v0, v1

    goto :goto_0

    .line 1056
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, p3, 0x7e

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 1057
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1058
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    goto :goto_0

    .line 1062
    :cond_4
    add-int v0, p3, p3

    add-int/2addr v0, p3

    add-int/lit8 v0, v0, 0x2

    .line 1063
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    array-length v1, v1

    if-gt v0, v1, :cond_6

    .line 1064
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v1, :cond_5

    .line 1065
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1067
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v3, v0, v1

    .line 1068
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1069
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1070
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v4, v0, v1

    goto/16 :goto_0

    .line 1072
    :cond_6
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1073
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes([BII)V

    .line 1074
    invoke-direct {p0, v4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    goto/16 :goto_0
.end method

.method public writeRawValue(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1115
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public writeRawValue(Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 1120
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public writeRawValue([CII)V
    .locals 1

    .prologue
    .line 1125
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_notSupported()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public final writeStartArray()V
    .locals 1

    .prologue
    .line 545
    const-string v0, "start an array"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 546
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->createChildArrayContext()Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    .line 547
    const/4 v0, -0x8

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 548
    return-void
.end method

.method public final writeStartObject()V
    .locals 1

    .prologue
    .line 563
    const-string v0, "start an object"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 564
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->createChildObjectContext()Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    .line 565
    const/4 v0, -0x6

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 566
    return-void
.end method

.method public final writeString(Lcom/fasterxml/jackson/core/SerializableString;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 980
    const-string v0, "write String value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 982
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 983
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 984
    if-nez v1, :cond_1

    .line 985
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1024
    :cond_0
    :goto_0
    return-void

    .line 989
    :cond_1
    const/16 v2, 0x41

    if-gt v1, v2, :cond_2

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-ltz v2, :cond_2

    .line 990
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_findSeenStringValue(Ljava/lang/String;)I

    move-result v0

    .line 991
    if-ltz v0, :cond_2

    .line 992
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeSharedStringValueReference(I)V

    goto :goto_0

    .line 997
    :cond_2
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->asUnquotedUTF8()[B

    move-result-object v2

    .line 998
    array-length v3, v2

    .line 1000
    const/16 v0, 0x40

    if-gt v3, v0, :cond_5

    .line 1002
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v0, v4, :cond_3

    .line 1003
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 1006
    :cond_3
    if-ne v3, v1, :cond_4

    add-int/lit8 v0, v3, 0x3f

    .line 1010
    :goto_1
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    int-to-byte v0, v0

    aput-byte v0, v1, v4

    .line 1011
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    invoke-static {v2, v6, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1012
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 1014
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-ltz v0, :cond_0

    .line 1015
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/SerializableString;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_addSeenStringValue(Ljava/lang/String;)V

    goto :goto_0

    .line 1006
    :cond_4
    add-int/lit8 v0, v3, 0x7e

    goto :goto_1

    .line 1019
    :cond_5
    if-ne v3, v1, :cond_6

    const/16 v0, -0x20

    .line 1020
    :goto_2
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 1021
    array-length v0, v2

    invoke-direct {p0, v2, v6, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeBytes([BII)V

    .line 1022
    const/4 v0, -0x4

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    goto :goto_0

    .line 1019
    :cond_6
    const/16 v0, -0x1c

    goto :goto_2
.end method

.method public writeString(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 811
    if-nez p1, :cond_0

    .line 812
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeNull()V

    .line 861
    :goto_0
    return-void

    .line 815
    :cond_0
    const-string v0, "write String value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 816
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 817
    if-nez v0, :cond_1

    .line 818
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    goto :goto_0

    .line 822
    :cond_1
    const/16 v1, 0x41

    if-le v0, v1, :cond_2

    .line 823
    invoke-direct {p0, p1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeNonSharedString(Ljava/lang/String;I)V

    goto :goto_0

    .line 827
    :cond_2
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-ltz v1, :cond_3

    .line 828
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_findSeenStringValue(Ljava/lang/String;)I

    move-result v1

    .line 829
    if-ltz v1, :cond_3

    .line 830
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeSharedStringValueReference(I)V

    goto :goto_0

    .line 837
    :cond_3
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit16 v1, v1, 0xc4

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v1, v2, :cond_4

    .line 838
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 841
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-virtual {p1, v3, v0, v1, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 842
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 843
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 844
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_charBuffer:[C

    invoke-direct {p0, v2, v3, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_shortUTF8Encode([CII)I

    move-result v2

    .line 845
    const/16 v3, 0x40

    if-gt v2, v3, :cond_7

    .line 847
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-ltz v3, :cond_5

    .line 848
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_addSeenStringValue(Ljava/lang/String;)V

    .line 850
    :cond_5
    if-ne v2, v0, :cond_6

    .line 851
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    add-int/lit8 v2, v2, 0x3f

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    goto :goto_0

    .line 854
    :cond_6
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    add-int/lit8 v2, v2, 0x7e

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    goto :goto_0

    .line 857
    :cond_7
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    if-ne v2, v0, :cond_8

    const/16 v0, -0x20

    :goto_1
    aput-byte v0, v3, v1

    .line 859
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    const/4 v2, -0x4

    aput-byte v2, v0, v1

    goto :goto_0

    .line 857
    :cond_8
    const/16 v0, -0x1c

    goto :goto_1
.end method

.method public writeString([CII)V
    .locals 6

    .prologue
    const/16 v3, 0x40

    const/4 v5, -0x4

    const/16 v0, -0x1c

    .line 922
    const/16 v1, 0x41

    if-gt p3, v1, :cond_0

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_seenStringValueCount:I

    if-ltz v1, :cond_0

    if-lez p3, :cond_0

    .line 923
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeString(Ljava/lang/String;)V

    .line 974
    :goto_0
    return-void

    .line 926
    :cond_0
    const-string v1, "write String value"

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_verifyValueWrite(Ljava/lang/String;)V

    .line 927
    if-nez p3, :cond_1

    .line 928
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    goto :goto_0

    .line 931
    :cond_1
    if-gt p3, v3, :cond_5

    .line 933
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit16 v1, v1, 0xc4

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v1, v2, :cond_2

    .line 934
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 936
    :cond_2
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 937
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 938
    add-int v2, p2, p3

    invoke-direct {p0, p1, p2, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_shortUTF8Encode([CII)I

    move-result v2

    .line 940
    if-gt v2, v3, :cond_4

    .line 941
    if-ne v2, p3, :cond_3

    .line 942
    add-int/lit8 v0, v2, 0x3f

    int-to-byte v0, v0

    .line 952
    :goto_1
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    aput-byte v0, v2, v1

    goto :goto_0

    .line 944
    :cond_3
    add-int/lit8 v0, v2, 0x7e

    int-to-byte v0, v0

    goto :goto_1

    .line 949
    :cond_4
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v5, v2, v3

    goto :goto_1

    .line 955
    :cond_5
    add-int v1, p3, p3

    add-int/2addr v1, p3

    add-int/lit8 v1, v1, 0x2

    .line 956
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    array-length v2, v2

    if-gt v1, v2, :cond_8

    .line 957
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputEnd:I

    if-lt v1, v2, :cond_6

    .line 958
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_flushBuffer()V

    .line 960
    :cond_6
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    .line 961
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 962
    add-int v0, p2, p3

    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_shortUTF8Encode([CII)I

    move-result v0

    .line 964
    if-ne v0, p3, :cond_7

    .line 965
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    const/16 v2, -0x20

    aput-byte v2, v0, v1

    .line 967
    :cond_7
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_outputTail:I

    aput-byte v5, v0, v1

    goto :goto_0

    .line 969
    :cond_8
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    .line 970
    add-int v0, p2, p3

    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_mediumUTF8Encode([CII)V

    .line 971
    invoke-direct {p0, v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeByte(B)V

    goto/16 :goto_0
.end method

.method public final writeStringField(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 472
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeContext:Lcom/fasterxml/jackson/core/json/JsonWriteContext;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/json/JsonWriteContext;->writeFieldName(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 473
    const-string v0, "Can not write a field name, expecting a value"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_reportError(Ljava/lang/String;)V

    .line 475
    :cond_0
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->_writeFieldName(Ljava/lang/String;)V

    .line 476
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeString(Ljava/lang/String;)V

    .line 477
    return-void
.end method

.method public final writeUTF8String([BII)V
    .locals 0

    .prologue
    .line 1084
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeRawUTF8String([BII)V

    .line 1085
    return-void
.end method
