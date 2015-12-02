.class public final Lcom/fasterxml/jackson/core/io/UTF32Reader;
.super Lcom/fasterxml/jackson/core/io/BaseReader;
.source "UTF32Reader.java"


# instance fields
.field final mBigEndian:Z

.field mByteCount:I

.field mCharCount:I

.field mSurrogate:C


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/InputStream;[BIIZ)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 42
    invoke-direct/range {p0 .. p5}, Lcom/fasterxml/jackson/core/io/BaseReader;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/InputStream;[BII)V

    .line 20
    iput-char v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mSurrogate:C

    .line 25
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mCharCount:I

    .line 30
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mByteCount:I

    .line 43
    iput-boolean p6, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mBigEndian:Z

    .line 44
    return-void
.end method

.method private loadMore(I)Z
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 167
    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mByteCount:I

    iget v3, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    sub-int/2addr v3, p1

    add-int/2addr v2, v3

    iput v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mByteCount:I

    .line 170
    if-lez p1, :cond_4

    .line 171
    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    if-lez v2, :cond_1

    move v2, v0

    .line 172
    :goto_0
    if-ge v2, p1, :cond_0

    .line 173
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    add-int/2addr v5, v2

    aget-byte v4, v4, v5

    aput-byte v4, v3, v2

    .line 172
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 175
    :cond_0
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    .line 177
    :cond_1
    iput p1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    .line 199
    :goto_1
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    if-ge v0, v6, :cond_7

    .line 200
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_in:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    array-length v4, v4

    iget v5, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    sub-int/2addr v4, v5

    invoke-virtual {v0, v2, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 201
    if-ge v0, v1, :cond_3

    .line 202
    if-gez v0, :cond_2

    .line 203
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->freeBuffers()V

    .line 204
    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    invoke-direct {p0, v2, v6}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->reportUnexpectedEOF(II)V

    .line 207
    :cond_2
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->reportStrangeStream()V

    .line 209
    :cond_3
    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    goto :goto_1

    .line 182
    :cond_4
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    .line 183
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_in:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    move-result v2

    .line 184
    if-ge v2, v1, :cond_6

    .line 185
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    .line 186
    if-gez v2, :cond_5

    .line 187
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->freeBuffers()V

    .line 211
    :goto_2
    return v0

    .line 191
    :cond_5
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->reportStrangeStream()V

    .line 193
    :cond_6
    iput v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    goto :goto_1

    :cond_7
    move v0, v1

    .line 211
    goto :goto_2
.end method

.method private reportInvalid(IILjava/lang/String;)V
    .locals 5

    .prologue
    .line 150
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mByteCount:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    .line 151
    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mCharCount:I

    add-int/2addr v1, p2

    .line 153
    new-instance v2, Ljava/io/CharConversionException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid UTF-32 character 0x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " at char #"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", byte #"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private reportUnexpectedEOF(II)V
    .locals 5

    .prologue
    .line 139
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mByteCount:I

    add-int/2addr v0, p1

    .line 140
    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mCharCount:I

    .line 142
    new-instance v2, Ljava/io/CharConversionException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected EOF in the middle of a 4-byte UTF-32 char: got "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", needed "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", at char #"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", byte #"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public bridge synthetic close()V
    .locals 0

    .prologue
    .line 10
    invoke-super {p0}, Lcom/fasterxml/jackson/core/io/BaseReader;->close()V

    return-void
.end method

.method public bridge synthetic read()I
    .locals 1

    .prologue
    .line 10
    invoke-super {p0}, Lcom/fasterxml/jackson/core/io/BaseReader;->read()I

    move-result v0

    return v0
.end method

.method public read([CII)I
    .locals 7

    .prologue
    const v6, 0x10ffff

    const/4 v0, -0x1

    .line 57
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    if-nez v1, :cond_1

    move p3, v0

    .line 127
    :cond_0
    :goto_0
    return p3

    .line 60
    :cond_1
    const/4 v1, 0x1

    if-lt p3, v1, :cond_0

    .line 64
    if-ltz p2, :cond_2

    add-int v1, p2, p3

    array-length v2, p1

    if-le v1, v2, :cond_3

    .line 65
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->reportBounds([CII)V

    .line 68
    :cond_3
    add-int v3, p3, p2

    .line 72
    iget-char v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mSurrogate:C

    if-eqz v1, :cond_6

    .line 73
    add-int/lit8 v2, p2, 0x1

    iget-char v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mSurrogate:C

    aput-char v0, p1, p2

    .line 74
    const/4 v0, 0x0

    iput-char v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mSurrogate:C

    .line 89
    :cond_4
    :goto_1
    if-ge v2, v3, :cond_a

    .line 90
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    .line 93
    iget-boolean v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mBigEndian:Z

    if-eqz v1, :cond_7

    .line 94
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    aget-byte v1, v1, v0

    shl-int/lit8 v1, v1, 0x18

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    add-int/lit8 v5, v0, 0x1

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v1, v4

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    add-int/lit8 v5, v0, 0x2

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v1, v4

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    .line 100
    :goto_2
    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    .line 104
    const v1, 0xffff

    if-le v0, v1, :cond_8

    .line 105
    if-le v0, v6, :cond_5

    .line 106
    sub-int v1, v2, p2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "(above "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ") "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v0, v1, v4}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->reportInvalid(IILjava/lang/String;)V

    .line 109
    :cond_5
    const/high16 v1, 0x10000

    sub-int/2addr v0, v1

    .line 110
    add-int/lit8 v1, v2, 0x1

    const v4, 0xd800

    shr-int/lit8 v5, v0, 0xa

    add-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, p1, v2

    .line 112
    const v2, 0xdc00

    and-int/lit16 v0, v0, 0x3ff

    or-int/2addr v0, v2

    .line 114
    if-lt v1, v3, :cond_9

    .line 115
    int-to-char v0, v0

    iput-char v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mSurrogate:C

    .line 125
    :goto_3
    sub-int p3, v1, p2

    .line 126
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mCharCount:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->mCharCount:I

    goto/16 :goto_0

    .line 80
    :cond_6
    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    sub-int/2addr v1, v2

    .line 81
    const/4 v2, 0x4

    if-ge v1, v2, :cond_b

    .line 82
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/UTF32Reader;->loadMore(I)Z

    move-result v1

    if-nez v1, :cond_b

    move p3, v0

    .line 83
    goto/16 :goto_0

    .line 97
    :cond_7
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    aget-byte v1, v1, v0

    and-int/lit16 v1, v1, 0xff

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    add-int/lit8 v5, v0, 0x1

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v1, v4

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    add-int/lit8 v5, v0, 0x2

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v1, v4

    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_buffer:[B

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v4, v0

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v1

    goto/16 :goto_2

    :cond_8
    move v1, v2

    .line 119
    :cond_9
    add-int/lit8 v2, v1, 0x1

    int-to-char v0, v0

    aput-char v0, p1, v1

    .line 120
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_ptr:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF32Reader;->_length:I

    if-lt v0, v1, :cond_4

    move v1, v2

    .line 121
    goto :goto_3

    :cond_a
    move v1, v2

    goto :goto_3

    :cond_b
    move v2, p2

    goto/16 :goto_1
.end method
