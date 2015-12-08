.class public final Lkik/android/net/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Lkik/android/net/a/h;


# instance fields
.field private final a:Ljava/io/RandomAccessFile;

.field private final b:Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

.field private c:[B

.field private d:[B

.field private e:[B

.field private f:I

.field private g:I

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;[B[BZ)V
    .locals 1

    .prologue
    .line 40
    new-instance v0, Ljava/io/RandomAccessFile;

    invoke-direct {v0, p1, p2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p0, v0, p3, p4, p5}, Lkik/android/net/a/a;-><init>(Ljava/io/RandomAccessFile;[B[BZ)V

    .line 41
    return-void
.end method

.method private constructor <init>(Ljava/io/RandomAccessFile;[B[BZ)V
    .locals 3

    .prologue
    const/16 v2, 0x1000

    const/4 v1, 0x0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-array v0, v2, [B

    iput-object v0, p0, Lkik/android/net/a/a;->c:[B

    .line 29
    new-array v0, v2, [B

    iput-object v0, p0, Lkik/android/net/a/a;->d:[B

    .line 31
    const/16 v0, 0x1010

    new-array v0, v0, [B

    iput-object v0, p0, Lkik/android/net/a/a;->e:[B

    .line 32
    iput v1, p0, Lkik/android/net/a/a;->f:I

    .line 33
    iput v1, p0, Lkik/android/net/a/a;->g:I

    .line 35
    iput v1, p0, Lkik/android/net/a/a;->h:I

    .line 36
    iput v1, p0, Lkik/android/net/a/a;->i:I

    .line 45
    iput-object p1, p0, Lkik/android/net/a/a;->a:Ljava/io/RandomAccessFile;

    .line 46
    new-instance v0, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/engines/AESEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/AESEngine;-><init>()V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    new-instance v2, Lorg/bouncycastle/crypto/paddings/PKCS7Padding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/PKCS7Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lkik/android/net/a/a;->b:Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    .line 48
    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v1, p2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    invoke-direct {v0, v1, p3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    .line 50
    iget-object v1, p0, Lkik/android/net/a/a;->b:Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-virtual {v1, p4, v0}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    .line 51
    return-void
.end method

.method private a([BII)I
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 55
    iget v0, p0, Lkik/android/net/a/a;->g:I

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 57
    if-lez v0, :cond_0

    .line 59
    iget-object v1, p0, Lkik/android/net/a/a;->e:[B

    iget v2, p0, Lkik/android/net/a/a;->f:I

    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    :cond_0
    iget v1, p0, Lkik/android/net/a/a;->g:I

    if-ge v0, v1, :cond_1

    .line 64
    iget-object v1, p0, Lkik/android/net/a/a;->e:[B

    iget v2, p0, Lkik/android/net/a/a;->f:I

    add-int/2addr v2, v0

    iget-object v3, p0, Lkik/android/net/a/a;->e:[B

    iget v4, p0, Lkik/android/net/a/a;->g:I

    sub-int/2addr v4, v0

    invoke-static {v1, v2, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    :cond_1
    iget v1, p0, Lkik/android/net/a/a;->g:I

    sub-int/2addr v1, v0

    iput v1, p0, Lkik/android/net/a/a;->g:I

    .line 68
    iput v5, p0, Lkik/android/net/a/a;->f:I

    .line 70
    iget v1, p0, Lkik/android/net/a/a;->i:I

    add-int/2addr v1, v0

    iput v1, p0, Lkik/android/net/a/a;->i:I

    .line 72
    return v0
.end method

.method private b()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 169
    iget-object v0, p0, Lkik/android/net/a/a;->b:Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->reset()V

    .line 170
    iget-object v0, p0, Lkik/android/net/a/a;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 171
    iput v1, p0, Lkik/android/net/a/a;->h:I

    .line 172
    iput v1, p0, Lkik/android/net/a/a;->i:I

    .line 174
    iput v1, p0, Lkik/android/net/a/a;->f:I

    .line 175
    iput v1, p0, Lkik/android/net/a/a;->g:I

    .line 176
    return-void
.end method


# virtual methods
.method public final a([BI)I
    .locals 11

    .prologue
    .line 78
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0, p2}, Lkik/android/net/a/a;->a([BII)I

    move-result v0

    .line 87
    add-int/lit8 v1, v0, 0x0

    .line 89
    sub-int v2, p2, v0

    .line 90
    add-int/lit8 v0, v0, 0x0

    move v6, v0

    move v7, v1

    move v8, v2

    .line 92
    :goto_0
    if-lez v8, :cond_2

    .line 93
    iget v0, p0, Lkik/android/net/a/a;->h:I

    int-to-long v0, v0

    iget-object v2, p0, Lkik/android/net/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 94
    iget-object v0, p0, Lkik/android/net/a/a;->d:[B

    array-length v0, v0

    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 98
    iget-object v1, p0, Lkik/android/net/a/a;->a:Ljava/io/RandomAccessFile;

    iget-object v2, p0, Lkik/android/net/a/a;->d:[B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v3

    .line 101
    iget v0, p0, Lkik/android/net/a/a;->h:I

    add-int/2addr v0, v3

    iput v0, p0, Lkik/android/net/a/a;->h:I

    .line 104
    if-ltz v3, :cond_0

    .line 105
    iget v9, p0, Lkik/android/net/a/a;->g:I

    iget-object v0, p0, Lkik/android/net/a/a;->b:Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    iget-object v1, p0, Lkik/android/net/a/a;->d:[B

    const/4 v2, 0x0

    iget-object v4, p0, Lkik/android/net/a/a;->e:[B

    iget v5, p0, Lkik/android/net/a/a;->f:I

    iget v10, p0, Lkik/android/net/a/a;->g:I

    add-int/2addr v5, v10

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->processBytes([BII[BI)I

    move-result v0

    add-int/2addr v0, v9

    iput v0, p0, Lkik/android/net/a/a;->g:I

    .line 109
    :cond_0
    iget v0, p0, Lkik/android/net/a/a;->h:I

    int-to-long v0, v0

    iget-object v2, p0, Lkik/android/net/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 110
    iget v0, p0, Lkik/android/net/a/a;->g:I

    iget-object v1, p0, Lkik/android/net/a/a;->b:Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    iget-object v2, p0, Lkik/android/net/a/a;->e:[B

    iget v3, p0, Lkik/android/net/a/a;->f:I

    iget v4, p0, Lkik/android/net/a/a;->g:I

    add-int/2addr v3, v4

    invoke-virtual {v1, v2, v3}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->doFinal([BI)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lkik/android/net/a/a;->g:I

    .line 114
    :cond_1
    invoke-direct {p0, p1, v6, v8}, Lkik/android/net/a/a;->a([BII)I
    :try_end_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 116
    add-int v1, v7, v0

    .line 119
    sub-int v2, v8, v0

    .line 120
    add-int/2addr v0, v6

    move v6, v0

    move v7, v1

    move v8, v2

    .line 121
    goto :goto_0

    .line 123
    :catch_0
    move-exception v0

    .line 124
    new-instance v1, Lkik/a/f/g;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v1

    .line 127
    :cond_2
    return v7
.end method

.method public final a()J
    .locals 4

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/net/a/a;->b:Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    iget-object v1, p0, Lkik/android/net/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->getOutputSize(I)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final a(J)V
    .locals 7

    .prologue
    .line 139
    long-to-int v0, p1

    .line 141
    iget v1, p0, Lkik/android/net/a/a;->h:I

    if-ge v0, v1, :cond_0

    .line 142
    invoke-direct {p0}, Lkik/android/net/a/a;->b()V

    .line 145
    :cond_0
    int-to-long v2, v0

    invoke-virtual {p0}, Lkik/android/net/a/a;->a()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 146
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot seek beyond the end of file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :cond_1
    int-to-long v2, v0

    invoke-virtual {p0}, Lkik/android/net/a/a;->a()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-nez v1, :cond_2

    .line 149
    invoke-direct {p0}, Lkik/android/net/a/a;->b()V

    .line 150
    iput v0, p0, Lkik/android/net/a/a;->i:I

    .line 154
    :cond_2
    :goto_0
    iget v1, p0, Lkik/android/net/a/a;->i:I

    if-ge v1, v0, :cond_3

    .line 155
    iget v1, p0, Lkik/android/net/a/a;->i:I

    sub-int v1, v0, v1

    iget-object v2, p0, Lkik/android/net/a/a;->c:[B

    array-length v2, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 157
    iget-object v2, p0, Lkik/android/net/a/a;->c:[B

    invoke-virtual {p0, v2, v1}, Lkik/android/net/a/a;->a([BI)I

    goto :goto_0

    .line 159
    :cond_3
    return-void
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lkik/android/net/a/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 134
    return-void
.end method
