.class public final Lcom/coremedia/iso/IsoTypeReader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static codeBytes:[B

.field private static codeCache:Lcom/googlecode/mp4parser/util/IntHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 159
    new-instance v0, Lcom/googlecode/mp4parser/util/IntHashMap;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/util/IntHashMap;-><init>()V

    sput-object v0, Lcom/coremedia/iso/IsoTypeReader;->codeCache:Lcom/googlecode/mp4parser/util/IntHashMap;

    .line 160
    const/4 v0, 0x4

    new-array v0, v0, [B

    sput-object v0, Lcom/coremedia/iso/IsoTypeReader;->codeBytes:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static byte2int(B)I
    .locals 0

    .prologue
    .line 72
    if-gez p0, :cond_0

    add-int/lit16 p0, p0, 0x100

    :cond_0
    return p0
.end method

.method public static read4cc(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 163
    sget-object v0, Lcom/coremedia/iso/IsoTypeReader;->codeBytes:[B

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 165
    sget-object v0, Lcom/coremedia/iso/IsoTypeReader;->codeBytes:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    .line 166
    sget-object v1, Lcom/coremedia/iso/IsoTypeReader;->codeBytes:[B

    const/4 v2, 0x1

    aget-byte v1, v1, v2

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    .line 167
    sget-object v1, Lcom/coremedia/iso/IsoTypeReader;->codeBytes:[B

    const/4 v2, 0x2

    aget-byte v1, v1, v2

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    .line 168
    sget-object v1, Lcom/coremedia/iso/IsoTypeReader;->codeBytes:[B

    const/4 v2, 0x3

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v1, v0

    .line 171
    sget-object v0, Lcom/coremedia/iso/IsoTypeReader;->codeCache:Lcom/googlecode/mp4parser/util/IntHashMap;

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/IntHashMap;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 177
    :goto_0
    return-object v0

    .line 175
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/String;

    sget-object v2, Lcom/coremedia/iso/IsoTypeReader;->codeBytes:[B

    const-string v3, "ISO-8859-1"

    invoke-direct {v0, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 176
    sget-object v2, Lcom/coremedia/iso/IsoTypeReader;->codeCache:Lcom/googlecode/mp4parser/util/IntHashMap;

    invoke-virtual {v2, v1, v0}, Lcom/googlecode/mp4parser/util/IntHashMap;->put(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 178
    :catch_0
    move-exception v0

    .line 179
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static readFixedPoint0230(Ljava/nio/ByteBuffer;)D
    .locals 4

    .prologue
    .line 127
    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 128
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 130
    const/4 v1, 0x0

    aget-byte v1, v0, v1

    shl-int/lit8 v1, v1, 0x18

    const/high16 v2, -0x1000000

    and-int/2addr v1, v2

    or-int/lit8 v1, v1, 0x0

    .line 132
    const/4 v2, 0x1

    aget-byte v2, v0, v2

    shl-int/lit8 v2, v2, 0x10

    const/high16 v3, 0xff0000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 133
    const/4 v2, 0x2

    aget-byte v2, v0, v2

    shl-int/lit8 v2, v2, 0x8

    const v3, 0xff00

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 134
    const/4 v2, 0x3

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    .line 135
    int-to-double v0, v0

    const-wide/high16 v2, 0x41d0000000000000L    # 1.073741824E9

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static readFixedPoint1616(Ljava/nio/ByteBuffer;)D
    .locals 4

    .prologue
    .line 113
    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 114
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 116
    const/4 v1, 0x0

    aget-byte v1, v0, v1

    shl-int/lit8 v1, v1, 0x18

    const/high16 v2, -0x1000000

    and-int/2addr v1, v2

    or-int/lit8 v1, v1, 0x0

    .line 118
    const/4 v2, 0x1

    aget-byte v2, v0, v2

    shl-int/lit8 v2, v2, 0x10

    const/high16 v3, 0xff0000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 119
    const/4 v2, 0x2

    aget-byte v2, v0, v2

    shl-int/lit8 v2, v2, 0x8

    const v3, 0xff00

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 120
    const/4 v2, 0x3

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    .line 121
    int-to-double v0, v0

    const-wide/high16 v2, 0x40f0000000000000L    # 65536.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static readFixedPoint88(Ljava/nio/ByteBuffer;)F
    .locals 3

    .prologue
    .line 140
    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 141
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 142
    const/4 v1, 0x0

    aget-byte v1, v0, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    or-int/lit8 v1, v1, 0x0

    int-to-short v1, v1

    .line 144
    const/4 v2, 0x1

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    .line 145
    int-to-float v0, v0

    const/high16 v1, 0x43800000    # 256.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public static readIso639(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 149
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 150
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x3

    if-lt v0, v3, :cond_0

    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 152
    :cond_0
    rsub-int/lit8 v3, v0, 0x2

    mul-int/lit8 v3, v3, 0x5

    shr-int v3, v1, v3

    and-int/lit8 v3, v3, 0x1f

    .line 153
    add-int/lit8 v3, v3, 0x60

    int-to-char v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static readString(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 85
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 87
    :goto_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    if-nez v1, :cond_0

    .line 90
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->convert([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 88
    :cond_0
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0
.end method

.method public static readString(Ljava/nio/ByteBuffer;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    new-array v0, p1, [B

    .line 95
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 96
    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->convert([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static readUInt16(Ljava/nio/ByteBuffer;)I
    .locals 2

    .prologue
    .line 54
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->byte2int(B)I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x0

    .line 56
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/coremedia/iso/IsoTypeReader;->byte2int(B)I

    move-result v1

    add-int/2addr v0, v1

    .line 57
    return v0
.end method

.method public static readUInt16BE(Ljava/nio/ByteBuffer;)I
    .locals 2

    .prologue
    .line 61
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->byte2int(B)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 63
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/coremedia/iso/IsoTypeReader;->byte2int(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    .line 64
    return v0
.end method

.method public static readUInt24(Ljava/nio/ByteBuffer;)I
    .locals 2

    .prologue
    .line 46
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x0

    .line 48
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/coremedia/iso/IsoTypeReader;->byte2int(B)I

    move-result v1

    add-int/2addr v0, v1

    .line 49
    return v0
.end method

.method public static readUInt32(Ljava/nio/ByteBuffer;)J
    .locals 4

    .prologue
    .line 38
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    int-to-long v0, v0

    .line 39
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    .line 40
    const-wide v2, 0x100000000L

    add-long/2addr v0, v2

    .line 42
    :cond_0
    return-wide v0
.end method

.method public static readUInt32BE(Ljava/nio/ByteBuffer;)J
    .locals 9

    .prologue
    .line 28
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    int-to-long v0, v0

    .line 29
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v2

    int-to-long v2, v2

    .line 30
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v4

    int-to-long v4, v4

    .line 31
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v6

    int-to-long v6, v6

    .line 32
    const/16 v8, 0x18

    shl-long/2addr v6, v8

    const/16 v8, 0x10

    shl-long/2addr v4, v8

    add-long/2addr v4, v6

    const/16 v6, 0x8

    shl-long/2addr v2, v6

    add-long/2addr v2, v4

    const/4 v4, 0x0

    shl-long/2addr v0, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static readUInt48(Ljava/nio/ByteBuffer;)J
    .locals 4

    .prologue
    .line 186
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    .line 187
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    .line 188
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "I don\'t know how to deal with UInt64! long is not sufficient and I don\'t want to use BigInt"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_0
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v2

    add-long/2addr v0, v2

    .line 192
    return-wide v0
.end method

.method public static readUInt64(Ljava/nio/ByteBuffer;)J
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    .line 101
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    add-long/2addr v0, v4

    .line 104
    cmp-long v2, v0, v4

    if-gez v2, :cond_0

    .line 105
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "I don\'t know how to deal with UInt64! long is not sufficient and I don\'t want to use BigInt"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_0
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v2

    add-long/2addr v0, v2

    .line 109
    return-wide v0
.end method

.method public static readUInt8(Ljava/nio/ByteBuffer;)I
    .locals 1

    .prologue
    .line 68
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->byte2int(B)I

    move-result v0

    return v0
.end method
