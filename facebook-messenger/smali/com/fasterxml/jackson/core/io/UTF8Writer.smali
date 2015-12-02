.class public final Lcom/fasterxml/jackson/core/io/UTF8Writer;
.super Ljava/io/Writer;
.source "UTF8Writer.java"


# static fields
.field static final SURR1_FIRST:I = 0xd800

.field static final SURR1_LAST:I = 0xdbff

.field static final SURR2_FIRST:I = 0xdc00

.field static final SURR2_LAST:I = 0xdfff


# instance fields
.field protected final _context:Lcom/fasterxml/jackson/core/io/IOContext;

.field _out:Ljava/io/OutputStream;

.field _outBuffer:[B

.field final _outBufferEnd:I

.field _outPtr:I

.field _surrogate:I


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 32
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 29
    iput v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 33
    iput-object p1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 34
    iput-object p2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    .line 36
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->allocWriteEncodingBuffer()[B

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 41
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x4

    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    .line 42
    iput v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 43
    return-void
.end method

.method private convertSurrogate(I)I
    .locals 4

    .prologue
    const v3, 0xdc00

    .line 361
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 362
    const/4 v1, 0x0

    iput v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 365
    if-lt p1, v3, :cond_0

    const v1, 0xdfff

    if-le p1, v1, :cond_1

    .line 366
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Broken surrogate pair: first char 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", second 0x"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; illegal combination"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 368
    :cond_1
    const/high16 v1, 0x10000

    const v2, 0xd800

    sub-int/2addr v0, v2

    shl-int/lit8 v0, v0, 0xa

    add-int/2addr v0, v1

    sub-int v1, p1, v3

    add-int/2addr v0, v1

    return v0
.end method

.method private throwIllegal(I)V
    .locals 3

    .prologue
    .line 374
    const v0, 0x10ffff

    if-le p1, v0, :cond_0

    .line 375
    new-instance v0, Ljava/io/IOException;

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

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 377
    :cond_0
    const v0, 0xd800

    if-lt p1, v0, :cond_2

    .line 378
    const v0, 0xdbff

    if-gt p1, v0, :cond_1

    .line 379
    new-instance v0, Ljava/io/IOException;

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

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 381
    :cond_1
    new-instance v0, Ljava/io/IOException;

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

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 385
    :cond_2
    new-instance v0, Ljava/io/IOException;

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

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public append(C)Ljava/io/Writer;
    .locals 0

    .prologue
    .line 49
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->write(I)V

    .line 50
    return-object p0
.end method

.method public bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 1

    .prologue
    .line 6
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->append(C)Ljava/io/Writer;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 57
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    if-eqz v0, :cond_2

    .line 58
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    if-lez v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 60
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    .line 63
    iput-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    .line 65
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 66
    if-eqz v1, :cond_1

    .line 67
    iput-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 68
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/io/IOContext;->releaseWriteEncodingBuffer([B)V

    .line 71
    :cond_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 76
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 77
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 78
    if-lez v0, :cond_2

    .line 79
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->throwIllegal(I)V

    .line 82
    :cond_2
    return-void
.end method

.method public flush()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 88
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    .line 89
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    if-lez v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 91
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 95
    :cond_1
    return-void
.end method

.method public write(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 205
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lez v0, :cond_2

    .line 206
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result p1

    .line 218
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    if-lt v0, v1, :cond_1

    .line 219
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 220
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 223
    :cond_1
    const/16 v0, 0x80

    if-ge p1, v0, :cond_4

    .line 224
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 245
    :goto_0
    return-void

    .line 208
    :cond_2
    const v0, 0xd800

    if-lt p1, v0, :cond_0

    const v0, 0xdfff

    if-gt p1, v0, :cond_0

    .line 210
    const v0, 0xdbff

    if-le p1, v0, :cond_3

    .line 211
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->throwIllegal(I)V

    .line 214
    :cond_3
    iput p1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    goto :goto_0

    .line 226
    :cond_4
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 227
    const/16 v1, 0x800

    if-ge p1, v1, :cond_5

    .line 228
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v2, v0, 0x1

    shr-int/lit8 v3, p1, 0x6

    or-int/lit16 v3, v3, 0xc0

    int-to-byte v3, v3

    aput-byte v3, v1, v0

    .line 229
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v0, v2, 0x1

    and-int/lit8 v3, p1, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 243
    :goto_1
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    goto :goto_0

    .line 230
    :cond_5
    const v1, 0xffff

    if-gt p1, v1, :cond_6

    .line 231
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v2, v0, 0x1

    shr-int/lit8 v3, p1, 0xc

    or-int/lit16 v3, v3, 0xe0

    int-to-byte v3, v3

    aput-byte v3, v1, v0

    .line 232
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v1, v2, 0x1

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    .line 233
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v0, v1, 0x1

    and-int/lit8 v3, p1, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    goto :goto_1

    .line 235
    :cond_6
    const v1, 0x10ffff

    if-le p1, v1, :cond_7

    .line 236
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->throwIllegal(I)V

    .line 238
    :cond_7
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v2, v0, 0x1

    shr-int/lit8 v3, p1, 0x12

    or-int/lit16 v3, v3, 0xf0

    int-to-byte v3, v3

    aput-byte v3, v1, v0

    .line 239
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v1, v2, 0x1

    shr-int/lit8 v3, p1, 0xc

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    .line 240
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    .line 241
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    add-int/lit8 v0, v2, 0x1

    and-int/lit8 v3, p1, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    goto :goto_1
.end method

.method public write(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 250
    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->write(Ljava/lang/String;II)V

    .line 251
    return-void
.end method

.method public write(Ljava/lang/String;II)V
    .locals 11

    .prologue
    const/16 v9, 0x80

    const/4 v1, 0x0

    .line 256
    const/4 v0, 0x2

    if-ge p3, v0, :cond_1

    .line 257
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 258
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->write(I)V

    .line 347
    :cond_0
    :goto_0
    return-void

    .line 264
    :cond_1
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lez v0, :cond_2

    .line 265
    add-int/lit8 v0, p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 266
    add-int/lit8 p3, p3, -0x1

    .line 267
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->write(I)V

    move p2, v0

    .line 271
    :cond_2
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 272
    iget-object v5, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 273
    iget v6, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    .line 276
    add-int v7, p3, p2

    move v2, p2

    .line 279
    :goto_1
    if-ge v2, v7, :cond_a

    .line 283
    if-lt v0, v6, :cond_3

    .line 284
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    invoke-virtual {v3, v5, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    move v0, v1

    .line 288
    :cond_3
    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 290
    if-ge v2, v9, :cond_e

    .line 291
    add-int/lit8 v4, v0, 0x1

    int-to-byte v2, v2

    aput-byte v2, v5, v0

    .line 293
    sub-int v2, v7, v3

    .line 294
    sub-int v0, v6, v4

    .line 296
    if-le v2, v0, :cond_d

    .line 299
    :goto_2
    add-int v8, v0, v3

    move v2, v4

    move v0, v3

    .line 302
    :goto_3
    if-lt v0, v8, :cond_4

    move v10, v2

    move v2, v0

    move v0, v10

    .line 303
    goto :goto_1

    .line 305
    :cond_4
    add-int/lit8 v3, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 306
    if-lt v0, v9, :cond_5

    move v10, v0

    move v0, v2

    move v2, v3

    move v3, v10

    .line 314
    :goto_4
    const/16 v4, 0x800

    if-ge v3, v4, :cond_6

    .line 315
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v3, 0x6

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 316
    add-int/lit8 v0, v4, 0x1

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v5, v4

    goto :goto_1

    .line 309
    :cond_5
    add-int/lit8 v4, v2, 0x1

    int-to-byte v0, v0

    aput-byte v0, v5, v2

    move v2, v4

    move v0, v3

    goto :goto_3

    .line 319
    :cond_6
    const v4, 0xd800

    if-lt v3, v4, :cond_7

    const v4, 0xdfff

    if-le v3, v4, :cond_8

    .line 320
    :cond_7
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v3, 0xc

    or-int/lit16 v8, v8, 0xe0

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 321
    add-int/lit8 v8, v4, 0x1

    shr-int/lit8 v0, v3, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 322
    add-int/lit8 v0, v8, 0x1

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v5, v8

    goto :goto_1

    .line 326
    :cond_8
    const v4, 0xdbff

    if-le v3, v4, :cond_9

    .line 327
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 328
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->throwIllegal(I)V

    .line 330
    :cond_9
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 332
    if-lt v2, v7, :cond_b

    .line 346
    :cond_a
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    goto/16 :goto_0

    .line 335
    :cond_b
    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v2

    .line 336
    const v4, 0x10ffff

    if-le v2, v4, :cond_c

    .line 337
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 338
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->throwIllegal(I)V

    .line 340
    :cond_c
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v2, 0x12

    or-int/lit16 v8, v8, 0xf0

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 341
    add-int/lit8 v0, v4, 0x1

    shr-int/lit8 v8, v2, 0xc

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v5, v4

    .line 342
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v2, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 343
    add-int/lit8 v0, v4, 0x1

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v5, v4

    move v2, v3

    goto/16 :goto_1

    :cond_d
    move v0, v2

    goto/16 :goto_2

    :cond_e
    move v10, v2

    move v2, v3

    move v3, v10

    goto/16 :goto_4
.end method

.method public write([C)V
    .locals 2

    .prologue
    .line 101
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->write([CII)V

    .line 102
    return-void
.end method

.method public write([CII)V
    .locals 11

    .prologue
    const/16 v9, 0x80

    const/4 v1, 0x0

    .line 108
    const/4 v0, 0x2

    if-ge p3, v0, :cond_1

    .line 109
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 110
    aget-char v0, p1, p2

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->write(I)V

    .line 199
    :cond_0
    :goto_0
    return-void

    .line 116
    :cond_1
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lez v0, :cond_2

    .line 117
    add-int/lit8 v0, p2, 0x1

    aget-char v2, p1, p2

    .line 118
    add-int/lit8 p3, p3, -0x1

    .line 119
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->write(I)V

    move p2, v0

    .line 123
    :cond_2
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 124
    iget-object v5, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 125
    iget v6, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    .line 128
    add-int v7, p3, p2

    move v2, p2

    .line 131
    :goto_1
    if-ge v2, v7, :cond_a

    .line 135
    if-lt v0, v6, :cond_3

    .line 136
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    invoke-virtual {v3, v5, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    move v0, v1

    .line 140
    :cond_3
    add-int/lit8 v3, v2, 0x1

    aget-char v2, p1, v2

    .line 142
    if-ge v2, v9, :cond_e

    .line 143
    add-int/lit8 v4, v0, 0x1

    int-to-byte v2, v2

    aput-byte v2, v5, v0

    .line 145
    sub-int v2, v7, v3

    .line 146
    sub-int v0, v6, v4

    .line 148
    if-le v2, v0, :cond_d

    .line 151
    :goto_2
    add-int v8, v0, v3

    move v2, v4

    move v0, v3

    .line 154
    :goto_3
    if-lt v0, v8, :cond_4

    move v10, v2

    move v2, v0

    move v0, v10

    .line 155
    goto :goto_1

    .line 157
    :cond_4
    add-int/lit8 v3, v0, 0x1

    aget-char v0, p1, v0

    .line 158
    if-lt v0, v9, :cond_5

    move v10, v0

    move v0, v2

    move v2, v3

    move v3, v10

    .line 166
    :goto_4
    const/16 v4, 0x800

    if-ge v3, v4, :cond_6

    .line 167
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v3, 0x6

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 168
    add-int/lit8 v0, v4, 0x1

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v5, v4

    goto :goto_1

    .line 161
    :cond_5
    add-int/lit8 v4, v2, 0x1

    int-to-byte v0, v0

    aput-byte v0, v5, v2

    move v2, v4

    move v0, v3

    goto :goto_3

    .line 171
    :cond_6
    const v4, 0xd800

    if-lt v3, v4, :cond_7

    const v4, 0xdfff

    if-le v3, v4, :cond_8

    .line 172
    :cond_7
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v3, 0xc

    or-int/lit16 v8, v8, 0xe0

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 173
    add-int/lit8 v8, v4, 0x1

    shr-int/lit8 v0, v3, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 174
    add-int/lit8 v0, v8, 0x1

    and-int/lit8 v3, v3, 0x3f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v5, v8

    goto :goto_1

    .line 178
    :cond_8
    const v4, 0xdbff

    if-le v3, v4, :cond_9

    .line 179
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 180
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->throwIllegal(I)V

    .line 182
    :cond_9
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 184
    if-lt v2, v7, :cond_b

    .line 198
    :cond_a
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    goto/16 :goto_0

    .line 187
    :cond_b
    add-int/lit8 v3, v2, 0x1

    aget-char v2, p1, v2

    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v2

    .line 188
    const v4, 0x10ffff

    if-le v2, v4, :cond_c

    .line 189
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 190
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->throwIllegal(I)V

    .line 192
    :cond_c
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v2, 0x12

    or-int/lit16 v8, v8, 0xf0

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 193
    add-int/lit8 v0, v4, 0x1

    shr-int/lit8 v8, v2, 0xc

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v5, v4

    .line 194
    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v8, v2, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    .line 195
    add-int/lit8 v0, v4, 0x1

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v5, v4

    move v2, v3

    goto/16 :goto_1

    :cond_d
    move v0, v2

    goto/16 :goto_2

    :cond_e
    move v10, v2

    move v2, v3

    move v3, v10

    goto/16 :goto_4
.end method
