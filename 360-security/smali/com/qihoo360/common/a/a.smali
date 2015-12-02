.class public Lcom/qihoo360/common/a/a;
.super Ljava/io/FilterInputStream;
.source "360Security"


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:[B

.field private e:[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 47
    iput v0, p0, Lcom/qihoo360/common/a/a;->a:I

    .line 48
    iput v0, p0, Lcom/qihoo360/common/a/a;->b:I

    .line 49
    iput-boolean v0, p0, Lcom/qihoo360/common/a/a;->c:Z

    .line 50
    const/4 v0, 0x5

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo360/common/a/a;->d:[B

    .line 51
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo360/common/a/a;->e:[B

    .line 52
    return-void
.end method


# virtual methods
.method public available()I
    .locals 1

    .prologue
    .line 235
    const/4 v0, 0x0

    return v0
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 200
    iput-object v1, p0, Lcom/qihoo360/common/a/a;->d:[B

    .line 201
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/common/a/a;->c:Z

    .line 202
    iput-object v1, p0, Lcom/qihoo360/common/a/a;->e:[B

    .line 203
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    .line 204
    return-void
.end method

.method public mark(I)V
    .locals 0

    .prologue
    .line 245
    return-void
.end method

.method public markSupported()Z
    .locals 1

    .prologue
    .line 213
    const/4 v0, 0x0

    return v0
.end method

.method public final read()I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v9, 0x5

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v0, -0x1

    const/4 v4, 0x1

    .line 63
    iget v1, p0, Lcom/qihoo360/common/a/a;->a:I

    iget v2, p0, Lcom/qihoo360/common/a/a;->b:I

    if-lt v1, v2, :cond_5

    .line 65
    iget-boolean v1, p0, Lcom/qihoo360/common/a/a;->c:Z

    if-eqz v1, :cond_0

    .line 154
    :goto_0
    return v0

    .line 69
    :cond_0
    iput v3, p0, Lcom/qihoo360/common/a/a;->a:I

    .line 74
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/common/a/a;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    int-to-byte v1, v1

    .line 75
    if-ne v1, v0, :cond_2

    .line 77
    iput-boolean v4, p0, Lcom/qihoo360/common/a/a;->c:Z

    goto :goto_0

    .line 80
    :cond_2
    int-to-byte v1, v1

    .line 81
    const/16 v2, 0xa

    if-eq v1, v2, :cond_1

    const/16 v2, 0xd

    if-eq v1, v2, :cond_1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_1

    .line 83
    const/16 v2, 0x7e

    if-eq v1, v2, :cond_3

    const/16 v2, 0x78

    if-ne v1, v2, :cond_4

    .line 85
    :cond_3
    iput-boolean v4, p0, Lcom/qihoo360/common/a/a;->c:Z

    .line 86
    iput-object v8, p0, Lcom/qihoo360/common/a/a;->e:[B

    iput-object v8, p0, Lcom/qihoo360/common/a/a;->d:[B

    .line 87
    iput v3, p0, Lcom/qihoo360/common/a/a;->b:I

    goto :goto_0

    .line 90
    :cond_4
    const/16 v2, 0x7a

    if-ne v1, v2, :cond_6

    .line 92
    iget-object v0, p0, Lcom/qihoo360/common/a/a;->e:[B

    iget-object v1, p0, Lcom/qihoo360/common/a/a;->e:[B

    iget-object v2, p0, Lcom/qihoo360/common/a/a;->e:[B

    const/4 v5, 0x2

    iget-object v6, p0, Lcom/qihoo360/common/a/a;->e:[B

    const/4 v7, 0x3

    aput-byte v3, v6, v7

    aput-byte v3, v2, v5

    aput-byte v3, v1, v4

    aput-byte v3, v0, v3

    .line 93
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo360/common/a/a;->b:I

    .line 154
    :cond_5
    iget-object v0, p0, Lcom/qihoo360/common/a/a;->e:[B

    iget v1, p0, Lcom/qihoo360/common/a/a;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/qihoo360/common/a/a;->a:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    .line 97
    :cond_6
    iget-object v2, p0, Lcom/qihoo360/common/a/a;->d:[B

    aput-byte v1, v2, v3

    move v1, v4

    .line 98
    :goto_1
    if-lt v1, v9, :cond_8

    .line 116
    :cond_7
    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lcom/qihoo360/common/a/a;->b:I

    .line 117
    iget v2, p0, Lcom/qihoo360/common/a/a;->b:I

    if-nez v2, :cond_a

    .line 119
    iput-boolean v4, p0, Lcom/qihoo360/common/a/a;->c:Z

    .line 120
    iput-object v8, p0, Lcom/qihoo360/common/a/a;->d:[B

    .line 121
    iput-object v8, p0, Lcom/qihoo360/common/a/a;->e:[B

    goto :goto_0

    .line 102
    :cond_8
    iget-object v2, p0, Lcom/qihoo360/common/a/a;->in:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    int-to-byte v2, v2

    .line 103
    if-ne v2, v0, :cond_9

    .line 105
    iput-boolean v4, p0, Lcom/qihoo360/common/a/a;->c:Z

    goto :goto_0

    .line 108
    :cond_9
    int-to-byte v2, v2

    .line 109
    const/16 v5, 0xa

    if-eq v2, v5, :cond_8

    const/16 v5, 0xd

    if-eq v2, v5, :cond_8

    const/16 v5, 0x20

    if-eq v2, v5, :cond_8

    .line 110
    iget-object v5, p0, Lcom/qihoo360/common/a/a;->d:[B

    aput-byte v2, v5, v1

    .line 111
    const/16 v5, 0x7e

    if-eq v2, v5, :cond_7

    const/16 v5, 0x78

    if-eq v2, v5, :cond_7

    .line 98
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 124
    :cond_a
    if-ge v1, v9, :cond_b

    .line 126
    add-int/lit8 v0, v1, 0x1

    :goto_2
    if-lt v0, v9, :cond_c

    .line 130
    iput-boolean v4, p0, Lcom/qihoo360/common/a/a;->c:Z

    .line 133
    :cond_b
    const-wide/16 v0, 0x0

    move v2, v3

    .line 134
    :goto_3
    if-lt v2, v9, :cond_d

    .line 147
    const/4 v2, 0x3

    :goto_4
    if-ltz v2, :cond_5

    .line 149
    iget-object v3, p0, Lcom/qihoo360/common/a/a;->e:[B

    const-wide/16 v4, 0xff

    and-long/2addr v4, v0

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    .line 150
    const/16 v3, 0x8

    ushr-long/2addr v0, v3

    .line 147
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    .line 128
    :cond_c
    iget-object v1, p0, Lcom/qihoo360/common/a/a;->d:[B

    const/16 v2, 0x23

    aput-byte v2, v1, v0

    .line 126
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 136
    :cond_d
    iget-object v5, p0, Lcom/qihoo360/common/a/a;->d:[B

    aget-byte v5, v5, v2

    add-int/lit8 v5, v5, -0x23

    int-to-byte v5, v5

    .line 137
    if-ltz v5, :cond_e

    const/16 v6, 0x5d

    if-le v5, v6, :cond_f

    .line 139
    :cond_e
    iput v3, p0, Lcom/qihoo360/common/a/a;->b:I

    .line 140
    iput-boolean v4, p0, Lcom/qihoo360/common/a/a;->c:Z

    .line 141
    iput-object v8, p0, Lcom/qihoo360/common/a/a;->d:[B

    .line 142
    iput-object v8, p0, Lcom/qihoo360/common/a/a;->e:[B

    .line 143
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "Invalid data in Ascii85 stream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_f
    const-wide/16 v6, 0x55

    mul-long/2addr v0, v6

    int-to-long v6, v5

    add-long/2addr v0, v6

    .line 134
    add-int/lit8 v2, v2, 0x1

    goto :goto_3
.end method

.method public final read([BII)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, -0x1

    .line 170
    iget-boolean v1, p0, Lcom/qihoo360/common/a/a;->c:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/qihoo360/common/a/a;->a:I

    iget v2, p0, Lcom/qihoo360/common/a/a;->b:I

    if-lt v1, v2, :cond_1

    move p3, v0

    .line 190
    :cond_0
    :goto_0
    return p3

    .line 174
    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-ge v1, p3, :cond_0

    .line 176
    iget v2, p0, Lcom/qihoo360/common/a/a;->a:I

    iget v3, p0, Lcom/qihoo360/common/a/a;->b:I

    if-ge v2, v3, :cond_2

    .line 178
    add-int v2, v1, p2

    iget-object v3, p0, Lcom/qihoo360/common/a/a;->e:[B

    iget v4, p0, Lcom/qihoo360/common/a/a;->a:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/qihoo360/common/a/a;->a:I

    aget-byte v3, v3, v4

    aput-byte v3, p1, v2

    .line 174
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 182
    :cond_2
    invoke-virtual {p0}, Lcom/qihoo360/common/a/a;->read()I

    move-result v2

    .line 183
    if-ne v2, v0, :cond_3

    move p3, v1

    .line 185
    goto :goto_0

    .line 187
    :cond_3
    add-int v3, v1, p2

    int-to-byte v2, v2

    aput-byte v2, p1, v3

    goto :goto_2
.end method

.method public reset()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 254
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "Reset is not supported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public skip(J)J
    .locals 2

    .prologue
    .line 225
    const-wide/16 v0, 0x0

    return-wide v0
.end method
