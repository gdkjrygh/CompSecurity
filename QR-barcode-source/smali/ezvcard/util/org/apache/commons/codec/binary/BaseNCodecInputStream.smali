.class public Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;
.super Ljava/io/FilterInputStream;
.source "BaseNCodecInputStream.java"


# instance fields
.field private final baseNCodec:Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;

.field private final doEncode:Z

.field private final singleByte:[B


# direct methods
.method protected constructor <init>(Ljava/io/InputStream;Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;Z)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "baseNCodec"    # Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;
    .param p3, "doEncode"    # Z

    .prologue
    .line 38
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 35
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->singleByte:[B

    .line 39
    iput-boolean p3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->doEncode:Z

    .line 40
    iput-object p2, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->baseNCodec:Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;

    .line 41
    return-void
.end method


# virtual methods
.method public markSupported()Z
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x0

    return v0
.end method

.method public read()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 52
    iget-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->singleByte:[B

    invoke-virtual {p0, v1, v2, v3}, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->read([BII)I

    move-result v0

    .line 53
    .local v0, "r":I
    :goto_0
    if-nez v0, :cond_0

    .line 54
    iget-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->singleByte:[B

    invoke-virtual {p0, v1, v2, v3}, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->read([BII)I

    move-result v0

    goto :goto_0

    .line 56
    :cond_0
    if-lez v0, :cond_2

    .line 57
    iget-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->singleByte:[B

    aget-byte v1, v1, v2

    if-gez v1, :cond_1

    iget-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->singleByte:[B

    aget-byte v1, v1, v2

    add-int/lit16 v1, v1, 0x100

    .line 59
    :goto_1
    return v1

    .line 57
    :cond_1
    iget-object v1, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->singleByte:[B

    aget-byte v1, v1, v2

    goto :goto_1

    .line 59
    :cond_2
    const/4 v1, -0x1

    goto :goto_1
.end method

.method public read([BII)I
    .locals 6
    .param p1, "b"    # [B
    .param p2, "offset"    # I
    .param p3, "len"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 83
    if-nez p1, :cond_0

    .line 84
    new-instance v3, Ljava/lang/NullPointerException;

    invoke-direct {v3}, Ljava/lang/NullPointerException;-><init>()V

    throw v3

    .line 85
    :cond_0
    if-ltz p2, :cond_1

    if-gez p3, :cond_2

    .line 86
    :cond_1
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v3}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v3

    .line 87
    :cond_2
    array-length v3, p1

    if-gt p2, v3, :cond_3

    add-int v3, p2, p3

    array-length v5, p1

    if-le v3, v5, :cond_4

    .line 88
    :cond_3
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v3}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v3

    .line 89
    :cond_4
    if-nez p3, :cond_6

    move v2, v4

    .line 121
    :cond_5
    return v2

    .line 92
    :cond_6
    const/4 v2, 0x0

    .line 109
    .local v2, "readLen":I
    :goto_0
    if-nez v2, :cond_5

    .line 110
    iget-object v3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->baseNCodec:Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;

    invoke-virtual {v3}, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;->hasData()Z

    move-result v3

    if-nez v3, :cond_7

    .line 111
    iget-boolean v3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->doEncode:Z

    if-eqz v3, :cond_8

    const/16 v3, 0x1000

    :goto_1
    new-array v0, v3, [B

    .line 112
    .local v0, "buf":[B
    iget-object v3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    .line 113
    .local v1, "c":I
    iget-boolean v3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->doEncode:Z

    if-eqz v3, :cond_9

    .line 114
    iget-object v3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->baseNCodec:Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;

    invoke-virtual {v3, v0, v4, v1}, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;->encode([BII)V

    .line 119
    .end local v0    # "buf":[B
    .end local v1    # "c":I
    :cond_7
    :goto_2
    iget-object v3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->baseNCodec:Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;

    invoke-virtual {v3, p1, p2, p3}, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;->readResults([BII)I

    move-result v2

    goto :goto_0

    .line 111
    :cond_8
    const/16 v3, 0x2000

    goto :goto_1

    .line 116
    .restart local v0    # "buf":[B
    .restart local v1    # "c":I
    :cond_9
    iget-object v3, p0, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodecInputStream;->baseNCodec:Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;

    invoke-virtual {v3, v0, v4, v1}, Lezvcard/util/org/apache/commons/codec/binary/BaseNCodec;->decode([BII)V

    goto :goto_2
.end method
