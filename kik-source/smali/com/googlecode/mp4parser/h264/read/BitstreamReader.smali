.class public Lcom/googlecode/mp4parser/h264/read/BitstreamReader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static bitsRead:I


# instance fields
.field private curByte:I

.field protected debugBits:Lcom/googlecode/mp4parser/h264/CharCache;

.field private is:Ljava/io/InputStream;

.field nBit:I

.field private nextByte:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Lcom/googlecode/mp4parser/h264/CharCache;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/h264/CharCache;-><init>(I)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->debugBits:Lcom/googlecode/mp4parser/h264/CharCache;

    .line 43
    iput-object p1, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->is:Ljava/io/InputStream;

    .line 44
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    .line 45
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nextByte:I

    .line 46
    return-void
.end method

.method private advance()V
    .locals 1

    .prologue
    .line 89
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nextByte:I

    iput v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    .line 90
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nextByte:I

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    .line 92
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .prologue
    .line 189
    return-void
.end method

.method public getBitPosition()J
    .locals 2

    .prologue
    .line 128
    sget v0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->bitsRead:I

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    rem-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public getCurBit()I
    .locals 1

    .prologue
    .line 192
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    return v0
.end method

.method public isByteAligned()Z
    .locals 1

    .prologue
    .line 180
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    rem-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public moreRBSPData()Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v5, -0x1

    const/4 v1, 0x1

    .line 117
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    const/16 v3, 0x8

    if-ne v0, v3, :cond_0

    .line 118
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->advance()V

    .line 120
    :cond_0
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    rsub-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x1

    shl-int v0, v1, v0

    .line 121
    shl-int/lit8 v3, v0, 0x1

    add-int/lit8 v3, v3, -0x1

    .line 122
    iget v4, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    and-int/2addr v3, v4

    if-ne v3, v0, :cond_3

    move v0, v1

    .line 124
    :goto_0
    iget v3, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    if-eq v3, v5, :cond_1

    iget v3, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nextByte:I

    if-ne v3, v5, :cond_2

    if-eqz v0, :cond_2

    :cond_1
    move v1, v2

    :cond_2
    return v1

    :cond_3
    move v0, v2

    .line 122
    goto :goto_0
.end method

.method public peakNextBits(I)I
    .locals 8

    .prologue
    const/4 v0, -0x1

    const/16 v7, 0x8

    const/4 v1, 0x0

    .line 146
    if-le p1, v7, :cond_0

    .line 147
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "N should be less then 8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :cond_0
    iget v2, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    if-ne v2, v7, :cond_2

    .line 149
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->advance()V

    .line 150
    iget v2, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    if-ne v2, v0, :cond_2

    .line 171
    :cond_1
    return v0

    .line 154
    :cond_2
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    rsub-int/lit8 v0, v0, 0x10

    new-array v4, v0, [I

    .line 157
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    move v2, v0

    move v0, v1

    :goto_0
    if-lt v2, v7, :cond_3

    move v2, v0

    move v0, v1

    .line 161
    :goto_1
    if-lt v0, v7, :cond_4

    move v0, v1

    .line 166
    :goto_2
    if-ge v1, p1, :cond_1

    .line 167
    shl-int/lit8 v0, v0, 0x1

    .line 168
    aget v2, v4, v1

    or-int/2addr v0, v2

    .line 166
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 158
    :cond_3
    add-int/lit8 v3, v0, 0x1

    iget v5, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    rsub-int/lit8 v6, v2, 0x7

    shr-int/2addr v5, v6

    and-int/lit8 v5, v5, 0x1

    aput v5, v4, v0

    .line 157
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v3

    goto :goto_0

    .line 162
    :cond_4
    add-int/lit8 v3, v2, 0x1

    iget v5, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nextByte:I

    rsub-int/lit8 v6, v0, 0x7

    shr-int/2addr v5, v6

    and-int/lit8 v5, v5, 0x1

    aput v5, v4, v2

    .line 161
    add-int/lit8 v0, v0, 0x1

    move v2, v3

    goto :goto_1
.end method

.method public read1Bit()I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 54
    iget v1, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 55
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->advance()V

    .line 56
    iget v1, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    if-ne v1, v0, :cond_0

    .line 66
    :goto_0
    return v0

    .line 60
    :cond_0
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    iget v1, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    rsub-int/lit8 v1, v1, 0x7

    shr-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x1

    .line 61
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    .line 63
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->debugBits:Lcom/googlecode/mp4parser/h264/CharCache;

    if-nez v1, :cond_1

    const/16 v0, 0x30

    :goto_1
    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/h264/CharCache;->append(C)V

    .line 64
    sget v0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->bitsRead:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->bitsRead:I

    move v0, v1

    .line 66
    goto :goto_0

    .line 63
    :cond_1
    const/16 v0, 0x31

    goto :goto_1
.end method

.method public readByte()I
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    if-lez v0, :cond_0

    .line 101
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->advance()V

    .line 104
    :cond_0
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->curByte:I

    .line 106
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->advance()V

    .line 108
    return v0
.end method

.method public readNBit(I)J
    .locals 6

    .prologue
    .line 75
    const/16 v0, 0x40

    if-le p1, v0, :cond_0

    .line 76
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can not readByte more then 64 bit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_0
    const-wide/16 v2, 0x0

    .line 80
    const/4 v0, 0x0

    :goto_0
    if-lt v0, p1, :cond_1

    .line 85
    return-wide v2

    .line 81
    :cond_1
    const/4 v1, 0x1

    shl-long/2addr v2, v1

    .line 82
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->read1Bit()I

    move-result v1

    int-to-long v4, v1

    or-long/2addr v2, v4

    .line 80
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public readRemainingByte()J
    .locals 2

    .prologue
    .line 137
    iget v0, p0, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->nBit:I

    rsub-int/lit8 v0, v0, 0x8

    invoke-virtual {p0, v0}, Lcom/googlecode/mp4parser/h264/read/BitstreamReader;->readNBit(I)J

    move-result-wide v0

    return-wide v0
.end method
