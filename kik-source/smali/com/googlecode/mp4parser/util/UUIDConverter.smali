.class public Lcom/googlecode/mp4parser/util/UUIDConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convert([B)Ljava/util/UUID;
    .locals 6

    .prologue
    .line 44
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 45
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 46
    new-instance v1, Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    return-object v1
.end method

.method public static convert(Ljava/util/UUID;)[B
    .locals 11

    .prologue
    const/16 v10, 0x10

    const/16 v0, 0x8

    .line 28
    invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    .line 29
    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v4

    .line 30
    new-array v6, v10, [B

    .line 32
    const/4 v1, 0x0

    :goto_0
    if-lt v1, v0, :cond_0

    .line 35
    :goto_1
    if-lt v0, v10, :cond_1

    .line 39
    return-object v6

    .line 33
    :cond_0
    rsub-int/lit8 v7, v1, 0x7

    mul-int/lit8 v7, v7, 0x8

    ushr-long v8, v2, v7

    long-to-int v7, v8

    int-to-byte v7, v7

    aput-byte v7, v6, v1

    .line 32
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 36
    :cond_1
    rsub-int/lit8 v1, v0, 0x7

    mul-int/lit8 v1, v1, 0x8

    ushr-long v2, v4, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 35
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method
