.class public final Lcom/coremedia/iso/IsoTypeWriter;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/coremedia/iso/IsoTypeWriter;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/coremedia/iso/IsoTypeWriter;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static writeFixedPoint0230(Ljava/nio/ByteBuffer;D)V
    .locals 3

    .prologue
    .line 83
    const-wide/high16 v0, 0x41d0000000000000L    # 1.073741824E9

    mul-double/2addr v0, p1

    double-to-int v0, v0

    .line 84
    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x18

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 85
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 86
    const v1, 0xff00

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 87
    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 88
    return-void
.end method

.method public static writeFixedPoint1616(Ljava/nio/ByteBuffer;D)V
    .locals 3

    .prologue
    .line 75
    const-wide/high16 v0, 0x40f0000000000000L    # 65536.0

    mul-double/2addr v0, p1

    double-to-int v0, v0

    .line 76
    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x18

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 77
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 78
    const v1, 0xff00

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 79
    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 80
    return-void
.end method

.method public static writeFixedPoint88(Ljava/nio/ByteBuffer;D)V
    .locals 3

    .prologue
    .line 91
    const-wide/high16 v0, 0x4070000000000000L    # 256.0

    mul-double/2addr v0, p1

    double-to-int v0, v0

    int-to-short v0, v0

    .line 92
    const v1, 0xff00

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 93
    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 94
    return-void
.end method

.method public static writeIso639(Ljava/nio/ByteBuffer;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v0, 0x0

    .line 97
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    if-eq v1, v4, :cond_0

    .line 98
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" language string isn\'t exactly 3 characters long!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move v1, v0

    .line 101
    :goto_0
    if-lt v0, v4, :cond_1

    .line 104
    invoke-static {p0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 105
    return-void

    .line 102
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    aget-byte v2, v2, v0

    add-int/lit8 v2, v2, -0x60

    rsub-int/lit8 v3, v0, 0x2

    mul-int/lit8 v3, v3, 0x5

    shl-int/2addr v2, v3

    add-int/2addr v1, v2

    .line 101
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static writePascalUtfString(Ljava/nio/ByteBuffer;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 108
    invoke-static {p1}, Lcom/coremedia/iso/Utf8;->convert(Ljava/lang/String;)[B

    move-result-object v0

    .line 109
    sget-boolean v1, Lcom/coremedia/iso/IsoTypeWriter;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    array-length v1, v0

    const/16 v2, 0xff

    if-lt v1, v2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 110
    :cond_0
    array-length v1, v0

    invoke-static {p0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 111
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 112
    return-void
.end method

.method public static writeUInt16(Ljava/nio/ByteBuffer;I)V
    .locals 2

    .prologue
    .line 57
    const v0, 0xffff

    and-int/2addr v0, p1

    .line 58
    shr-int/lit8 v1, v0, 0x8

    invoke-static {p0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 59
    and-int/lit16 v0, v0, 0xff

    invoke-static {p0, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 60
    return-void
.end method

.method public static writeUInt16BE(Ljava/nio/ByteBuffer;I)V
    .locals 2

    .prologue
    .line 63
    const v0, 0xffff

    and-int/2addr v0, p1

    .line 64
    and-int/lit16 v1, v0, 0xff

    invoke-static {p0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 65
    shr-int/lit8 v0, v0, 0x8

    invoke-static {p0, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 66
    return-void
.end method

.method public static writeUInt24(Ljava/nio/ByteBuffer;I)V
    .locals 2

    .prologue
    .line 42
    const v0, 0xffffff

    and-int/2addr v0, p1

    .line 43
    shr-int/lit8 v1, v0, 0x8

    invoke-static {p0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 44
    invoke-static {p0, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 46
    return-void
.end method

.method public static writeUInt32(Ljava/nio/ByteBuffer;J)V
    .locals 3

    .prologue
    .line 28
    sget-boolean v0, Lcom/coremedia/iso/IsoTypeWriter;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const-wide v0, 0x100000000L

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The given long is not in the range of uint32 ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 29
    :cond_1
    long-to-int v0, p1

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 31
    return-void
.end method

.method public static writeUInt32BE(Ljava/nio/ByteBuffer;J)V
    .locals 5

    .prologue
    .line 34
    sget-boolean v0, Lcom/coremedia/iso/IsoTypeWriter;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const-wide v0, 0x100000000L

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The given long is not in the range of uint32 ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 35
    :cond_1
    long-to-int v0, p1

    const v1, 0xffff

    and-int/2addr v0, v1

    invoke-static {p0, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16BE(Ljava/nio/ByteBuffer;I)V

    .line 36
    const/16 v0, 0x10

    shr-long v0, p1, v0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {p0, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16BE(Ljava/nio/ByteBuffer;I)V

    .line 38
    return-void
.end method

.method public static writeUInt48(Ljava/nio/ByteBuffer;J)V
    .locals 5

    .prologue
    .line 49
    const-wide v0, 0xffffffffffffL

    and-long/2addr v0, p1

    .line 50
    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    invoke-static {p0, v2}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 51
    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {p0, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 53
    return-void
.end method

.method public static writeUInt64(Ljava/nio/ByteBuffer;J)V
    .locals 3

    .prologue
    .line 23
    sget-boolean v0, Lcom/coremedia/iso/IsoTypeWriter;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "The given long is negative"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 24
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 25
    return-void
.end method

.method public static writeUInt8(Ljava/nio/ByteBuffer;I)V
    .locals 1

    .prologue
    .line 69
    and-int/lit16 v0, p1, 0xff

    .line 70
    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 71
    return-void
.end method

.method public static writeUtf8String(Ljava/nio/ByteBuffer;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 122
    invoke-static {p1}, Lcom/coremedia/iso/Utf8;->convert(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 123
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 124
    return-void
.end method

.method public static writeZeroTermUtf8String(Ljava/nio/ByteBuffer;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 115
    invoke-static {p1}, Lcom/coremedia/iso/Utf8;->convert(Ljava/lang/String;)[B

    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 117
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 118
    return-void
.end method
