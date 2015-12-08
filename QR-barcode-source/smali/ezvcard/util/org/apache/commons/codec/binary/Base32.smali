.class public Lezvcard/util/org/apache/commons/codec/binary/Base32;
.super Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;
.source "Base32.java"


# static fields
.field private static final BITS_PER_ENCODED_BYTE:I = 0x5

.field private static final BYTES_PER_ENCODED_BLOCK:I = 0x8

.field private static final BYTES_PER_UNENCODED_BLOCK:I = 0x5

.field private static final CHUNK_SEPARATOR:[B

.field private static final DECODE_TABLE:[B

.field private static final ENCODE_TABLE:[B

.field private static final HEX_DECODE_TABLE:[B

.field private static final HEX_ENCODE_TABLE:[B

.field private static final MASK_5BITS:I = 0x1f


# instance fields
.field private bitWorkArea:J

.field private final decodeSize:I

.field private final decodeTable:[B

.field private final encodeSize:I

.field private final encodeTable:[B

.field private final lineSeparator:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x20

    .line 60
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->CHUNK_SEPARATOR:[B

    .line 68
    const/16 v0, 0x5b

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->DECODE_TABLE:[B

    .line 82
    new-array v0, v1, [B

    fill-array-data v0, :array_2

    sput-object v0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->ENCODE_TABLE:[B

    .line 94
    const/16 v0, 0x58

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    sput-object v0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->HEX_DECODE_TABLE:[B

    .line 108
    new-array v0, v1, [B

    fill-array-data v0, :array_4

    sput-object v0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->HEX_ENCODE_TABLE:[B

    return-void

    .line 60
    nop

    :array_0
    .array-data 1
        0xdt
        0xat
    .end array-data

    .line 68
    nop

    :array_1
    .array-data 1
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x3ft
        -0x1t
        -0x1t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
    .end array-data

    .line 82
    :array_2
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
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
    .end array-data

    .line 94
    :array_3
    .array-data 1
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x3ft
        0x0t
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0x19t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x1ft
        0x20t
    .end array-data

    .line 108
    :array_4
    .array-data 1
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
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lezvcard/util/org/apache/commons/codec/binary/Base32;-><init>(Z)V

    .line 163
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .param p1, "lineLength"    # I

    .prologue
    .line 187
    sget-object v0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->CHUNK_SEPARATOR:[B

    invoke-direct {p0, p1, v0}, Lezvcard/util/org/apache/commons/codec/binary/Base32;-><init>(I[B)V

    .line 188
    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 1
    .param p1, "lineLength"    # I
    .param p2, "lineSeparator"    # [B

    .prologue
    .line 208
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lezvcard/util/org/apache/commons/codec/binary/Base32;-><init>(I[BZ)V

    .line 209
    return-void
.end method

.method public constructor <init>(I[BZ)V
    .locals 5
    .param p1, "lineLength"    # I
    .param p2, "lineSeparator"    # [B
    .param p3, "useHex"    # Z

    .prologue
    const/16 v4, 0x8

    const/4 v2, 0x0

    .line 231
    const/4 v3, 0x5

    if-nez p2, :cond_0

    move v1, v2

    :goto_0
    invoke-direct {p0, v3, v4, p1, v1}, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;-><init>(IIII)V

    .line 234
    if-eqz p3, :cond_1

    .line 235
    sget-object v1, Lezvcard/util/org/apache/commons/codec/binary/Base32;->HEX_ENCODE_TABLE:[B

    iput-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    .line 236
    sget-object v1, Lezvcard/util/org/apache/commons/codec/binary/Base32;->HEX_DECODE_TABLE:[B

    iput-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeTable:[B

    .line 241
    :goto_1
    if-lez p1, :cond_4

    .line 242
    if-nez p2, :cond_2

    .line 243
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lineLength "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " > 0, but lineSeparator is null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 231
    :cond_0
    array-length v1, p2

    goto :goto_0

    .line 238
    :cond_1
    sget-object v1, Lezvcard/util/org/apache/commons/codec/binary/Base32;->ENCODE_TABLE:[B

    iput-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    .line 239
    sget-object v1, Lezvcard/util/org/apache/commons/codec/binary/Base32;->DECODE_TABLE:[B

    iput-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeTable:[B

    goto :goto_1

    .line 246
    :cond_2
    invoke-virtual {p0, p2}, Lezvcard/util/org/apache/commons/codec/binary/Base32;->containsAlphabetOrPad([B)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 247
    invoke-static {p2}, Lezvcard/util/org/apache/commons/codec/binary/StringUtils;->newStringUtf8([B)Ljava/lang/String;

    move-result-object v0

    .line 248
    .local v0, "sep":Ljava/lang/String;
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lineSeparator must not contain Base32 characters: ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 250
    .end local v0    # "sep":Ljava/lang/String;
    :cond_3
    array-length v1, p2

    add-int/lit8 v1, v1, 0x8

    iput v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeSize:I

    .line 251
    array-length v1, p2

    new-array v1, v1, [B

    iput-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    .line 252
    iget-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v3, p2

    invoke-static {p2, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 257
    :goto_2
    iget v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeSize:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeSize:I

    .line 258
    return-void

    .line 254
    :cond_4
    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeSize:I

    .line 255
    const/4 v1, 0x0

    iput-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    goto :goto_2
.end method

.method public constructor <init>(Z)V
    .locals 2
    .param p1, "useHex"    # Z

    .prologue
    .line 173
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lezvcard/util/org/apache/commons/codec/binary/Base32;-><init>(I[BZ)V

    .line 174
    return-void
.end method


# virtual methods
.method decode([BII)V
    .locals 10
    .param p1, "in"    # [B
    .param p2, "inPos"    # I
    .param p3, "inAvail"    # I

    .prologue
    .line 283
    iget-boolean v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->eof:Z

    if-eqz v4, :cond_1

    .line 354
    :cond_0
    :goto_0
    return-void

    .line 286
    :cond_1
    if-gez p3, :cond_2

    .line 287
    const/4 v4, 0x1

    iput-boolean v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->eof:Z

    .line 289
    :cond_2
    const/4 v1, 0x0

    .local v1, "i":I
    move v2, p2

    .end local p2    # "inPos":I
    .local v2, "inPos":I
    :goto_1
    if-ge v1, p3, :cond_5

    .line 290
    add-int/lit8 p2, v2, 0x1

    .end local v2    # "inPos":I
    .restart local p2    # "inPos":I
    aget-byte v0, p1, v2

    .line 291
    .local v0, "b":B
    const/16 v4, 0x3d

    if-ne v0, v4, :cond_3

    .line 293
    const/4 v4, 0x1

    iput-boolean v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->eof:Z

    .line 317
    .end local v0    # "b":B
    :goto_2
    iget-boolean v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->eof:Z

    if-eqz v4, :cond_0

    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    const/4 v5, 0x2

    if-lt v4, v5, :cond_0

    .line 318
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeSize:I

    invoke-virtual {p0, v4}, Lezvcard/util/org/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    .line 321
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 323
    :pswitch_0
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v8, 0x2

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    goto :goto_0

    .line 296
    .restart local v0    # "b":B
    :cond_3
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeSize:I

    invoke-virtual {p0, v4}, Lezvcard/util/org/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    .line 297
    if-ltz v0, :cond_4

    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeTable:[B

    array-length v4, v4

    if-ge v0, v4, :cond_4

    .line 298
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeTable:[B

    aget-byte v3, v4, v0

    .line 299
    .local v3, "result":I
    if-ltz v3, :cond_4

    .line 300
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    add-int/lit8 v4, v4, 0x1

    rem-int/lit8 v4, v4, 0x8

    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    .line 301
    iget-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v6, 0x5

    shl-long/2addr v4, v6

    int-to-long v6, v3

    add-long/2addr v4, v6

    iput-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 302
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    if-nez v4, :cond_4

    .line 303
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x20

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 304
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x18

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 305
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x10

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 306
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x8

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 307
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 289
    .end local v3    # "result":I
    :cond_4
    add-int/lit8 v1, v1, 0x1

    move v2, p2

    .end local p2    # "inPos":I
    .restart local v2    # "inPos":I
    goto/16 :goto_1

    .line 326
    .end local v0    # "b":B
    .end local v2    # "inPos":I
    .restart local p2    # "inPos":I
    :pswitch_1
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v8, 0x7

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    goto/16 :goto_0

    .line 329
    :pswitch_2
    iget-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v6, 0x4

    shr-long/2addr v4, v6

    iput-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 330
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x8

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 331
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    goto/16 :goto_0

    .line 334
    :pswitch_3
    iget-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v6, 0x1

    shr-long/2addr v4, v6

    iput-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 335
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x10

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 336
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x8

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 337
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    goto/16 :goto_0

    .line 340
    :pswitch_4
    iget-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v6, 0x6

    shr-long/2addr v4, v6

    iput-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 341
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x10

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 342
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x8

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 343
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    goto/16 :goto_0

    .line 346
    :pswitch_5
    iget-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v6, 0x3

    shr-long/2addr v4, v6

    iput-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 347
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x18

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 348
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x10

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 349
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v8, 0x8

    shr-long/2addr v6, v8

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 350
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-wide v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    goto/16 :goto_0

    .end local p2    # "inPos":I
    .restart local v2    # "inPos":I
    :cond_5
    move p2, v2

    .end local v2    # "inPos":I
    .restart local p2    # "inPos":I
    goto/16 :goto_2

    .line 321
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method encode([BII)V
    .locals 10
    .param p1, "in"    # [B
    .param p2, "inPos"    # I
    .param p3, "inAvail"    # I

    .prologue
    .line 372
    iget-boolean v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->eof:Z

    if-eqz v4, :cond_1

    .line 460
    :cond_0
    :goto_0
    return-void

    .line 377
    :cond_1
    if-gez p3, :cond_3

    .line 378
    const/4 v4, 0x1

    iput-boolean v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->eof:Z

    .line 379
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    if-nez v4, :cond_2

    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineLength:I

    if-eqz v4, :cond_0

    .line 382
    :cond_2
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeSize:I

    invoke-virtual {p0, v4}, Lezvcard/util/org/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    .line 383
    iget v3, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    .line 384
    .local v3, "savedPos":I
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    packed-switch v4, :pswitch_data_0

    .line 427
    :goto_1
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->currentLinePos:I

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    sub-int/2addr v5, v3

    add-int/2addr v4, v5

    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->currentLinePos:I

    .line 429
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineLength:I

    if-lez v4, :cond_0

    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->currentLinePos:I

    if-lez v4, :cond_0

    .line 430
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    const/4 v5, 0x0

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v7, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v8, v8

    invoke-static {v4, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 431
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v5, v5

    add-int/2addr v4, v5

    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    goto :goto_0

    .line 386
    :pswitch_0
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x3

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 387
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x2

    shl-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 388
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 389
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 390
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 391
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 392
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 393
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    goto/16 :goto_1

    .line 397
    :pswitch_1
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xb

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 398
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x6

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 399
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x1

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 400
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x4

    shl-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 401
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 402
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 403
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 404
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    goto/16 :goto_1

    .line 407
    :pswitch_2
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x13

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 408
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xe

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 409
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x9

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 410
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x4

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 411
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x1

    shl-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 412
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 413
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    .line 414
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    goto/16 :goto_1

    .line 417
    :pswitch_3
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x1b

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 418
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x16

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 419
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x11

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 420
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xc

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 421
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x7

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 422
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x2

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 423
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x3

    shl-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 424
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    const/16 v6, 0x3d

    aput-byte v6, v4, v5

    goto/16 :goto_1

    .line 434
    .end local v3    # "savedPos":I
    :cond_3
    const/4 v1, 0x0

    .local v1, "i":I
    move v2, p2

    .end local p2    # "inPos":I
    .local v2, "inPos":I
    :goto_2
    if-ge v1, p3, :cond_6

    .line 435
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeSize:I

    invoke-virtual {p0, v4}, Lezvcard/util/org/apache/commons/codec/binary/Base32;->ensureBufferSize(I)V

    .line 436
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    add-int/lit8 v4, v4, 0x1

    rem-int/lit8 v4, v4, 0x5

    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    .line 437
    add-int/lit8 p2, v2, 0x1

    .end local v2    # "inPos":I
    .restart local p2    # "inPos":I
    aget-byte v0, p1, v2

    .line 438
    .local v0, "b":I
    if-gez v0, :cond_4

    .line 439
    add-int/lit16 v0, v0, 0x100

    .line 441
    :cond_4
    iget-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    int-to-long v6, v0

    add-long/2addr v4, v6

    iput-wide v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    .line 442
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->modulus:I

    if-nez v4, :cond_5

    .line 443
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x23

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 444
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x1e

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 445
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x19

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 446
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0x14

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 447
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xf

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 448
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/16 v7, 0xa

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 449
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    const/4 v7, 0x5

    shr-long/2addr v8, v7

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 450
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->encodeTable:[B

    iget-wide v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->bitWorkArea:J

    long-to-int v7, v8

    and-int/lit8 v7, v7, 0x1f

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 451
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->currentLinePos:I

    add-int/lit8 v4, v4, 0x8

    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->currentLinePos:I

    .line 452
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineLength:I

    if-lez v4, :cond_5

    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineLength:I

    iget v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->currentLinePos:I

    if-gt v4, v5, :cond_5

    .line 453
    iget-object v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    const/4 v5, 0x0

    iget-object v6, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->buffer:[B

    iget v7, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v8, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v8, v8

    invoke-static {v4, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 454
    iget v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    iget-object v5, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->lineSeparator:[B

    array-length v5, v5

    add-int/2addr v4, v5

    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->pos:I

    .line 455
    const/4 v4, 0x0

    iput v4, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->currentLinePos:I

    .line 434
    :cond_5
    add-int/lit8 v1, v1, 0x1

    move v2, p2

    .end local p2    # "inPos":I
    .restart local v2    # "inPos":I
    goto/16 :goto_2

    .end local v0    # "b":I
    :cond_6
    move p2, v2

    .end local v2    # "inPos":I
    .restart local p2    # "inPos":I
    goto/16 :goto_0

    .line 384
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public isInAlphabet(B)Z
    .locals 2
    .param p1, "octet"    # B

    .prologue
    .line 471
    if-ltz p1, :cond_0

    iget-object v0, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeTable:[B

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lezvcard/util/org/apache/commons/codec/binary/Base32;->decodeTable:[B

    aget-byte v0, v0, p1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
