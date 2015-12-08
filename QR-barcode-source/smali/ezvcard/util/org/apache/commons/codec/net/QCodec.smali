.class public Lezvcard/util/org/apache/commons/codec/net/QCodec;
.super Lezvcard/util/org/apache/commons/codec/net/RFC1522Codec;
.source "QCodec.java"

# interfaces
.implements Lezvcard/util/org/apache/commons/codec/StringEncoder;
.implements Lezvcard/util/org/apache/commons/codec/StringDecoder;


# static fields
.field private static final BLANK:B = 0x20t

.field private static final PRINTABLE_CHARS:Ljava/util/BitSet;

.field private static final UNDERSCORE:B = 0x5ft


# instance fields
.field private final charset:Ljava/lang/String;

.field private encodeBlanks:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 58
    new-instance v1, Ljava/util/BitSet;

    const/16 v2, 0x100

    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    sput-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    .line 62
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 63
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x21

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 64
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 65
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x23

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 66
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x24

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 67
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x25

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 68
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x26

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 69
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 70
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x28

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 71
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 72
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x2a

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 73
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x2b

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 74
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 75
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x2d

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 76
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 77
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 78
    const/16 v0, 0x30

    .local v0, "i":I
    :goto_0
    const/16 v1, 0x39

    if-gt v0, v1, :cond_0

    .line 79
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    .line 78
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 81
    :cond_0
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 82
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x3b

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 83
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x3c

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 84
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x3e

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 85
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 86
    const/16 v0, 0x41

    :goto_1
    const/16 v1, 0x5a

    if-gt v0, v1, :cond_1

    .line 87
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    .line 86
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 89
    :cond_1
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 90
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x5c

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 91
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 92
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x5e

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 93
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x60

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 94
    const/16 v0, 0x61

    :goto_2
    const/16 v1, 0x7a

    if-gt v0, v1, :cond_2

    .line 95
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    .line 94
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 97
    :cond_2
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 98
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x7c

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 99
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 100
    sget-object v1, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    const/16 v2, 0x7e

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 101
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 113
    const-string v0, "UTF-8"

    invoke-direct {p0, v0}, Lezvcard/util/org/apache/commons/codec/net/QCodec;-><init>(Ljava/lang/String;)V

    .line 114
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "charset"    # Ljava/lang/String;

    .prologue
    .line 125
    invoke-direct {p0}, Lezvcard/util/org/apache/commons/codec/net/RFC1522Codec;-><init>()V

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/util/org/apache/commons/codec/net/QCodec;->encodeBlanks:Z

    .line 126
    iput-object p1, p0, Lezvcard/util/org/apache/commons/codec/net/QCodec;->charset:Ljava/lang/String;

    .line 127
    return-void
.end method


# virtual methods
.method public decode(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "pObject"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lezvcard/util/org/apache/commons/codec/DecoderException;
        }
    .end annotation

    .prologue
    .line 276
    if-nez p1, :cond_0

    .line 277
    const/4 v0, 0x0

    .line 279
    .end local p1    # "pObject":Ljava/lang/Object;
    :goto_0
    return-object v0

    .line 278
    .restart local p1    # "pObject":Ljava/lang/Object;
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 279
    check-cast p1, Ljava/lang/String;

    .end local p1    # "pObject":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lezvcard/util/org/apache/commons/codec/net/QCodec;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 281
    .restart local p1    # "pObject":Ljava/lang/Object;
    :cond_1
    new-instance v0, Lezvcard/util/org/apache/commons/codec/DecoderException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Objects of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " cannot be decoded using Q codec"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lezvcard/util/org/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public decode(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "pString"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lezvcard/util/org/apache/commons/codec/DecoderException;
        }
    .end annotation

    .prologue
    .line 230
    if-nez p1, :cond_0

    .line 231
    const/4 v1, 0x0

    .line 234
    :goto_0
    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lezvcard/util/org/apache/commons/codec/net/QCodec;->decodeText(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 235
    :catch_0
    move-exception v0

    .line 236
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Lezvcard/util/org/apache/commons/codec/DecoderException;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lezvcard/util/org/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected doDecoding([B)[B
    .locals 9
    .param p1, "bytes"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lezvcard/util/org/apache/commons/codec/DecoderException;
        }
    .end annotation

    .prologue
    const/16 v8, 0x5f

    .line 152
    if-nez p1, :cond_0

    .line 153
    const/4 v7, 0x0

    .line 174
    :goto_0
    return-object v7

    .line 155
    :cond_0
    const/4 v2, 0x0

    .line 156
    .local v2, "hasUnderscores":Z
    move-object v0, p1

    .local v0, "arr$":[B
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_1
    if-ge v4, v5, :cond_1

    aget-byte v1, v0, v4

    .line 157
    .local v1, "b":B
    if-ne v1, v8, :cond_2

    .line 158
    const/4 v2, 0x1

    .line 162
    .end local v1    # "b":B
    :cond_1
    if-eqz v2, :cond_5

    .line 163
    array-length v7, p1

    new-array v6, v7, [B

    .line 164
    .local v6, "tmp":[B
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_2
    array-length v7, p1

    if-ge v3, v7, :cond_4

    .line 165
    aget-byte v1, p1, v3

    .line 166
    .restart local v1    # "b":B
    if-eq v1, v8, :cond_3

    .line 167
    aput-byte v1, v6, v3

    .line 164
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 156
    .end local v3    # "i":I
    .end local v6    # "tmp":[B
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 169
    .restart local v3    # "i":I
    .restart local v6    # "tmp":[B
    :cond_3
    const/16 v7, 0x20

    aput-byte v7, v6, v3

    goto :goto_3

    .line 172
    .end local v1    # "b":B
    :cond_4
    invoke-static {v6}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;->decodeQuotedPrintable([B)[B

    move-result-object v7

    goto :goto_0

    .line 174
    .end local v3    # "i":I
    .end local v6    # "tmp":[B
    :cond_5
    invoke-static {p1}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;->decodeQuotedPrintable([B)[B

    move-result-object v7

    goto :goto_0
.end method

.method protected doEncoding([B)[B
    .locals 4
    .param p1, "bytes"    # [B

    .prologue
    .line 136
    if-nez p1, :cond_1

    .line 137
    const/4 v0, 0x0

    .line 147
    :cond_0
    return-object v0

    .line 139
    :cond_1
    sget-object v2, Lezvcard/util/org/apache/commons/codec/net/QCodec;->PRINTABLE_CHARS:Ljava/util/BitSet;

    invoke-static {v2, p1}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;->encodeQuotedPrintable(Ljava/util/BitSet;[B)[B

    move-result-object v0

    .line 140
    .local v0, "data":[B
    iget-boolean v2, p0, Lezvcard/util/org/apache/commons/codec/net/QCodec;->encodeBlanks:Z

    if-eqz v2, :cond_0

    .line 141
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 142
    aget-byte v2, v0, v1

    const/16 v3, 0x20

    if-ne v2, v3, :cond_2

    .line 143
    const/16 v2, 0x5f

    aput-byte v2, v0, v1

    .line 141
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public encode(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "pObject"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lezvcard/util/org/apache/commons/codec/EncoderException;
        }
    .end annotation

    .prologue
    .line 251
    if-nez p1, :cond_0

    .line 252
    const/4 v0, 0x0

    .line 254
    .end local p1    # "pObject":Ljava/lang/Object;
    :goto_0
    return-object v0

    .line 253
    .restart local p1    # "pObject":Ljava/lang/Object;
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 254
    check-cast p1, Ljava/lang/String;

    .end local p1    # "pObject":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lezvcard/util/org/apache/commons/codec/net/QCodec;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 256
    .restart local p1    # "pObject":Ljava/lang/Object;
    :cond_1
    new-instance v0, Lezvcard/util/org/apache/commons/codec/EncoderException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Objects of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " cannot be encoded using Q codec"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lezvcard/util/org/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "pString"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lezvcard/util/org/apache/commons/codec/EncoderException;
        }
    .end annotation

    .prologue
    .line 211
    if-nez p1, :cond_0

    .line 212
    const/4 v0, 0x0

    .line 214
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lezvcard/util/org/apache/commons/codec/net/QCodec;->getDefaultCharset()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lezvcard/util/org/apache/commons/codec/net/QCodec;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "pString"    # Ljava/lang/String;
    .param p2, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lezvcard/util/org/apache/commons/codec/EncoderException;
        }
    .end annotation

    .prologue
    .line 190
    if-nez p1, :cond_0

    .line 191
    const/4 v1, 0x0

    .line 194
    :goto_0
    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lezvcard/util/org/apache/commons/codec/net/QCodec;->encodeText(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 195
    :catch_0
    move-exception v0

    .line 196
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v1, Lezvcard/util/org/apache/commons/codec/EncoderException;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lezvcard/util/org/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getDefaultCharset()Ljava/lang/String;
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lezvcard/util/org/apache/commons/codec/net/QCodec;->charset:Ljava/lang/String;

    return-object v0
.end method

.method protected getEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    const-string v0, "Q"

    return-object v0
.end method

.method public isEncodeBlanks()Z
    .locals 1

    .prologue
    .line 302
    iget-boolean v0, p0, Lezvcard/util/org/apache/commons/codec/net/QCodec;->encodeBlanks:Z

    return v0
.end method

.method public setEncodeBlanks(Z)V
    .locals 0
    .param p1, "b"    # Z

    .prologue
    .line 312
    iput-boolean p1, p0, Lezvcard/util/org/apache/commons/codec/net/QCodec;->encodeBlanks:Z

    .line 313
    return-void
.end method
