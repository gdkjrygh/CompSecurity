.class public Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:[B

.field protected b:I

.field private final c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 23
    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 161
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->a:[B

    if-eqz v0, :cond_0

    move v0, v1

    .line 163
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->a:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 165
    iget-object v2, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->a:[B

    aput-byte v1, v2, v0

    .line 163
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 169
    :cond_0
    iput v1, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->b:I

    .line 170
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v0

    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0}, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->d()V

    .line 58
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 64
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    add-int/2addr v0, v2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->a:[B

    .line 65
    iput v1, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->b:I

    .line 66
    return-void

    :cond_0
    move v0, v1

    .line 64
    goto :goto_0
.end method

.method public final a([BII)V
    .locals 2

    .prologue
    .line 116
    if-nez p3, :cond_0

    .line 133
    :goto_0
    return-void

    .line 121
    :cond_0
    if-gez p3, :cond_1

    .line 123
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_1
    iget v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->b:I

    add-int/2addr v0, p3

    iget-object v1, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->a:[B

    array-length v1, v1

    if-le v0, v1, :cond_2

    .line 128
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "attempt to process message too long for cipher"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->a:[B

    iget v1, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->b:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    iget v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->b:I

    add-int/2addr v0, p3

    iput v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->b:I

    goto :goto_0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I

    move-result v0

    return v0
.end method

.method public final c()[B
    .locals 4

    .prologue
    .line 146
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->a:[B

    const/4 v2, 0x0

    iget v3, p0, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->b:I

    invoke-interface {v0, v1, v2, v3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v0

    .line 148
    invoke-direct {p0}, Lorg/spongycastle/crypto/BufferedAsymmetricBlockCipher;->d()V

    .line 150
    return-object v0
.end method
