.class public Lcom/googlecode/mp4parser/h264/read/CAVLCReader;
.super Lcom/googlecode/mp4parser/h264/read/BitstreamReader;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;-><init>(Ljava/io/InputStream;)V

    .line 36
    return-void
.end method

.method private readUE()I
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 54
    move v0, v1

    .line 55
    :goto_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->read1Bit()I

    move-result v2

    if-eqz v2, :cond_1

    .line 59
    if-lez v0, :cond_0

    .line 60
    invoke-virtual {p0, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(I)J

    move-result-wide v2

    .line 62
    const/4 v1, 0x1

    shl-int v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    add-long/2addr v0, v2

    long-to-int v1, v0

    .line 65
    :cond_0
    return v1

    .line 56
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private trace(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/16 v6, 0x20

    const/4 v0, 0x0

    .line 165
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    sget v1, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->bitsRead:I

    iget-object v3, p0, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->debugBits:Lcom/googlecode/mp4parser/h264/CharCache;

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/h264/CharCache;->length()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 168
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    rsub-int/lit8 v3, v3, 0x8

    .line 170
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "@"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v1, v0

    .line 172
    :goto_0
    if-lt v1, v3, :cond_0

    .line 175
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    rsub-int/lit8 v1, v1, 0x64

    iget-object v3, p0, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->debugBits:Lcom/googlecode/mp4parser/h264/CharCache;

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/h264/CharCache;->length()I

    move-result v3

    sub-int/2addr v1, v3

    .line 177
    :goto_1
    if-lt v0, v1, :cond_1

    .line 179
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->debugBits:Lcom/googlecode/mp4parser/h264/CharCache;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->debugBits:Lcom/googlecode/mp4parser/h264/CharCache;

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/CharCache;->clear()V

    .line 183
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/mp4parser/h264/Debug;->println(Ljava/lang/String;)V

    .line 184
    return-void

    .line 173
    :cond_0
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 172
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 178
    :cond_1
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method public read(I)[B
    .locals 3

    .prologue
    .line 107
    new-array v1, p1, [B

    .line 108
    const/4 v0, 0x0

    :goto_0
    if-lt v0, p1, :cond_0

    .line 111
    return-object v1

    .line 109
    :cond_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readByte()I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    .line 108
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public readAE()Z
    .locals 2

    .prologue
    .line 116
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Stan"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public readAEI()I
    .locals 2

    .prologue
    .line 127
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Stan"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public readBool(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->read1Bit()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    .line 97
    :goto_0
    if-eqz v1, :cond_1

    const-string v0, "1"

    :goto_1
    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    return v1

    .line 95
    :cond_0
    const/4 v0, 0x1

    move v1, v0

    goto :goto_0

    .line 97
    :cond_1
    const-string v0, "0"

    goto :goto_1
.end method

.method public readCE(Lcom/googlecode/mp4parser/h264/BTree;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 136
    :cond_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->read1Bit()I

    move-result v0

    .line 137
    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/h264/BTree;->down(I)Lcom/googlecode/mp4parser/h264/BTree;

    move-result-object p1

    .line 138
    if-nez p1, :cond_1

    .line 139
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Illegal code"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 141
    :cond_1
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/h264/BTree;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p2, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    return-object v0
.end method

.method public readME(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 131
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public readNBit(ILjava/lang/String;)J
    .locals 3

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(I)J

    move-result-wide v0

    .line 41
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p2, v2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    return-wide v0
.end method

.method public readSE(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 83
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE()I

    move-result v0

    .line 85
    and-int/lit8 v1, v0, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, -0x1

    .line 86
    shr-int/lit8 v2, v0, 0x1

    and-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 88
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    return v0
.end method

.method public readTE(I)I
    .locals 1

    .prologue
    .line 120
    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 121
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE()I

    move-result v0

    .line 122
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->read1Bit()I

    move-result v0

    xor-int/lit8 v0, v0, -0x1

    and-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public readTrailingBits()V
    .locals 0

    .prologue
    .line 160
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->read1Bit()I

    .line 161
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readRemainingByte()J

    .line 162
    return-void
.end method

.method public readU(ILjava/lang/String;)I
    .locals 2

    .prologue
    .line 103
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readNBit(ILjava/lang/String;)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public readUE(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->readUE()I

    move-result v0

    .line 77
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    return v0
.end method

.method public readZeroBitCount(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 150
    const/4 v0, 0x0

    .line 151
    :goto_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->read1Bit()I

    move-result v1

    if-eqz v1, :cond_0

    .line 154
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/googlecode/mp4parser/h264/read/CAVLCReader;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    return v0

    .line 152
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
