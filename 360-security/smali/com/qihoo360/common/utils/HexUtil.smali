.class public Lcom/qihoo360/common/utils/HexUtil;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bytes2HexStr([B)Ljava/lang/String;
    .locals 2

    .prologue
    .line 16
    if-eqz p0, :cond_0

    .line 17
    new-instance v0, Ljava/lang/String;

    invoke-static {p0}, Lorg/apache/commons/codec/binary/Hex;->encodeHex([B)[C

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 19
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static hexStr2Bytes(Ljava/lang/String;)[B
    .locals 4

    .prologue
    .line 25
    new-instance v0, Ljava/math/BigInteger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "10"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    .line 28
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    new-array v2, v0, [B

    .line 29
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-lt v0, v3, :cond_0

    .line 31
    return-object v2

    .line 30
    :cond_0
    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v1, v3

    aput-byte v3, v2, v0

    .line 29
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
