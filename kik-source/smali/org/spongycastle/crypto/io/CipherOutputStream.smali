.class public Lorg/spongycastle/crypto/io/CipherOutputStream;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/crypto/BufferedBlockCipher;

.field private b:Lorg/spongycastle/crypto/StreamCipher;

.field private c:[B

.field private d:[B


# virtual methods
.method public close()V
    .locals 4

    .prologue
    .line 167
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/BufferedBlockCipher;->b(I)I

    move-result v0

    new-array v0, v0, [B

    .line 171
    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BI)I

    move-result v1

    .line 173
    if-eqz v1, :cond_0

    .line 175
    iget-object v2, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->out:Ljava/io/OutputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/io/CipherOutputStream;->flush()V

    .line 186
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 187
    return-void

    .line 179
    :catch_0
    move-exception v0

    .line 181
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error closing stream: "

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

.method public flush()V
    .locals 0

    .prologue
    .line 144
    invoke-super {p0}, Ljava/io/FilterOutputStream;->flush()V

    .line 145
    return-void
.end method

.method public write(I)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 54
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->c:[B

    int-to-byte v1, p1

    aput-byte v1, v0, v2

    .line 56
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    if-eqz v0, :cond_1

    .line 58
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->c:[B

    const/4 v3, 0x1

    iget-object v4, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->d:[B

    move v5, v2

    invoke-virtual/range {v0 .. v5}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BII[BI)I

    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 62
    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->out:Ljava/io/OutputStream;

    iget-object v3, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->d:[B

    invoke-virtual {v1, v3, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 69
    :cond_0
    :goto_0
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->b:Lorg/spongycastle/crypto/StreamCipher;

    int-to-byte v2, p1

    invoke-interface {v1, v2}, Lorg/spongycastle/crypto/StreamCipher;->a(B)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0
.end method

.method public write([B)V
    .locals 2

    .prologue
    .line 88
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lorg/spongycastle/crypto/io/CipherOutputStream;->write([BII)V

    .line 89
    return-void
.end method

.method public write([BII)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 106
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    if-eqz v0, :cond_1

    .line 108
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p3}, Lorg/spongycastle/crypto/BufferedBlockCipher;->b(I)I

    move-result v0

    new-array v4, v0, [B

    .line 110
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->a:Lorg/spongycastle/crypto/BufferedBlockCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BII[BI)I

    move-result v0

    .line 112
    if-eqz v0, :cond_0

    .line 114
    iget-object v1, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, v4, v5, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 125
    :cond_0
    :goto_0
    return-void

    .line 119
    :cond_1
    new-array v4, p3, [B

    .line 121
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->b:Lorg/spongycastle/crypto/StreamCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/crypto/StreamCipher;->a([BII[BI)V

    .line 123
    iget-object v0, p0, Lorg/spongycastle/crypto/io/CipherOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, v4, v5, p3}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method
