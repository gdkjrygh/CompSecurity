.class public Lorg/spongycastle/crypto/io/CipherInputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/crypto/BufferedBlockCipher;

.field private b:Lorg/spongycastle/crypto/StreamCipher;

.field private c:[B

.field private d:[B

.field private e:I

.field private f:I

.field private g:Z


# direct methods
.method private a()I
    .locals 9

    .prologue
    const/4 v6, 0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    .line 70
    :cond_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->available()I

    move-result v0

    .line 74
    if-gtz v0, :cond_1

    move v0, v6

    .line 79
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->d:[B

    array-length v1, v1

    if-le v0, v1, :cond_2

    .line 81
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->d:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->d:[B

    array-length v1, v1

    invoke-super {p0, v0, v8, v1}, Ljava/io/FilterInputStream;->read([BII)I

    move-result v3

    .line 88
    :goto_0
    if-gez v3, :cond_5

    .line 90
    iget-boolean v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->g:Z

    if-eqz v0, :cond_3

    move v0, v7

    .line 143
    :goto_1
    return v0

    .line 85
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->d:[B

    invoke-super {p0, v1, v8, v0}, Ljava/io/FilterInputStream;->read([BII)I

    move-result v3

    goto :goto_0

    .line 97
    :cond_3
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    if-eqz v0, :cond_4

    .line 99
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->c:[B

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BI)I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    :goto_2
    iput v8, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    .line 113
    iput-boolean v6, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->g:Z

    .line 115
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    if-ne v0, v1, :cond_6

    move v0, v7

    .line 117
    goto :goto_1

    .line 103
    :cond_4
    const/4 v0, 0x0

    :try_start_1
    iput v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 106
    :catch_0
    move-exception v0

    .line 108
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error processing stream: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 122
    :cond_5
    iput v8, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    .line 126
    :try_start_2
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    if-eqz v0, :cond_7

    .line 128
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->d:[B

    const/4 v2, 0x0

    iget-object v4, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->c:[B

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BII[BI)I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 141
    :goto_3
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    if-eqz v0, :cond_0

    .line 143
    :cond_6
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    goto :goto_1

    .line 132
    :cond_7
    :try_start_3
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->b:Lorg/spongycastle/crypto/StreamCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->d:[B

    const/4 v2, 0x0

    iget-object v4, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->c:[B

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/crypto/StreamCipher;->a([BII[BI)V

    .line 133
    iput v3, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    .line 136
    :catch_1
    move-exception v0

    .line 138
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error processing stream: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public available()I
    .locals 2

    .prologue
    .line 231
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public close()V
    .locals 0

    .prologue
    .line 237
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    .line 238
    return-void
.end method

.method public markSupported()Z
    .locals 1

    .prologue
    .line 242
    const/4 v0, 0x0

    return v0
.end method

.method public read()I
    .locals 3

    .prologue
    .line 153
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    if-ne v0, v1, :cond_0

    .line 155
    invoke-direct {p0}, Lorg/spongycastle/crypto/io/CipherInputStream;->a()I

    move-result v0

    if-gez v0, :cond_0

    .line 157
    const/4 v0, -0x1

    .line 161
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->c:[B

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    goto :goto_0
.end method

.method public read([B)I
    .locals 2

    .prologue
    .line 168
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lorg/spongycastle/crypto/io/CipherInputStream;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 3

    .prologue
    .line 177
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    if-ne v0, v1, :cond_0

    .line 179
    invoke-direct {p0}, Lorg/spongycastle/crypto/io/CipherInputStream;->a()I

    move-result v0

    if-gez v0, :cond_0

    .line 181
    const/4 p3, -0x1

    .line 199
    :goto_0
    return p3

    .line 185
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    sub-int/2addr v0, v1

    .line 187
    if-le p3, v0, :cond_1

    .line 189
    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->c:[B

    iget v2, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    iput v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    move p3, v0

    .line 192
    goto :goto_0

    .line 196
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->c:[B

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 197
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    add-int/2addr v0, p3

    iput v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    goto :goto_0
.end method

.method public skip(J)J
    .locals 5

    .prologue
    const-wide/16 v0, 0x0

    .line 207
    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 224
    :goto_0
    return-wide v0

    .line 212
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    sub-int/2addr v0, v1

    .line 214
    int-to-long v2, v0

    cmp-long v1, p1, v2

    if-lez v1, :cond_1

    .line 216
    iget v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->f:I

    iput v1, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    .line 218
    int-to-long v0, v0

    goto :goto_0

    .line 222
    :cond_1
    iget v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    long-to-int v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/io/CipherInputStream;->e:I

    .line 224
    long-to-int v0, p1

    int-to-long v0, v0

    goto :goto_0
.end method
