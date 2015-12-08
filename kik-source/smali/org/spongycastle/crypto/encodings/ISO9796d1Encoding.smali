.class public Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricBlockCipher;


# static fields
.field private static final a:Ljava/math/BigInteger;

.field private static final b:Ljava/math/BigInteger;

.field private static c:[B

.field private static d:[B


# instance fields
.field private e:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

.field private f:Z

.field private g:I

.field private h:I

.field private i:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v2, 0x10

    .line 21
    const-wide/16 v0, 0x10

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->a:Ljava/math/BigInteger;

    .line 22
    const-wide/16 v0, 0x6

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->b:Ljava/math/BigInteger;

    .line 24
    new-array v0, v2, [B

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->c:[B

    .line 26
    new-array v0, v2, [B

    fill-array-data v0, :array_1

    sput-object v0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->d:[B

    return-void

    .line 24
    nop

    :array_0
    .array-data 1
        0xet
        0x3t
        0x5t
        0x8t
        0x9t
        0x4t
        0x2t
        0xft
        0x0t
        0xdt
        0xbt
        0x6t
        0x7t
        0xat
        0xct
        0x1t
    .end array-data

    .line 26
    :array_1
    .array-data 1
        0x8t
        0xft
        0x6t
        0x1t
        0x5t
        0x2t
        0xbt
        0xct
        0x3t
        0x4t
        0xdt
        0xat
        0xet
        0x9t
        0x0t
        0x7t
    .end array-data
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->h:I

    .line 38
    iput-object p1, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->e:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 39
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->e:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v0

    .line 80
    iget-boolean v1, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->f:Z

    if-eqz v1, :cond_0

    .line 82
    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    .line 86
    :cond_0
    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 2

    .prologue
    .line 50
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 54
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 56
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/RSAKeyParameters;

    .line 63
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->e:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1, p1, p2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 65
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->i:Ljava/math/BigInteger;

    .line 66
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->i:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->g:I

    .line 68
    iput-boolean p1, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->f:Z

    .line 69
    return-void

    :cond_0
    move-object v0, p2

    .line 60
    check-cast v0, Lorg/spongycastle/crypto/params/RSAKeyParameters;

    goto :goto_0
.end method

.method public final a([BII)[B
    .locals 11

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 136
    iget-boolean v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->f:Z

    if-eqz v0, :cond_4

    .line 138
    iget v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->g:I

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    new-array v3, v0, [B

    iget v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->h:I

    add-int/lit8 v4, v0, 0x1

    iget v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->g:I

    add-int/lit8 v0, v0, 0xd

    div-int/lit8 v5, v0, 0x10

    move v0, v1

    :goto_0
    if-ge v0, v5, :cond_1

    sub-int v6, v5, p3

    if-le v0, v6, :cond_0

    add-int v6, p2, p3

    sub-int v7, v5, v0

    sub-int/2addr v6, v7

    array-length v7, v3

    sub-int/2addr v7, v5

    sub-int v8, v5, v0

    invoke-static {p1, v6, v3, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    add-int/2addr v0, p3

    goto :goto_0

    :cond_0
    array-length v6, v3

    add-int v7, v0, p3

    sub-int/2addr v6, v7

    invoke-static {p1, p2, v3, v6, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_1
    array-length v0, v3

    mul-int/lit8 v6, v5, 0x2

    sub-int/2addr v0, v6

    :goto_2
    array-length v6, v3

    if-eq v0, v6, :cond_2

    array-length v6, v3

    sub-int/2addr v6, v5

    div-int/lit8 v7, v0, 0x2

    add-int/2addr v6, v7

    aget-byte v6, v3, v6

    sget-object v7, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->c:[B

    and-int/lit16 v8, v6, 0xff

    ushr-int/lit8 v8, v8, 0x4

    aget-byte v7, v7, v8

    shl-int/lit8 v7, v7, 0x4

    sget-object v8, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->c:[B

    and-int/lit8 v9, v6, 0xf

    aget-byte v8, v8, v9

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v3, v0

    add-int/lit8 v7, v0, 0x1

    aput-byte v6, v3, v7

    add-int/lit8 v0, v0, 0x2

    goto :goto_2

    :cond_2
    array-length v0, v3

    mul-int/lit8 v5, p3, 0x2

    sub-int/2addr v0, v5

    aget-byte v5, v3, v0

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    aget-byte v4, v3, v4

    shl-int/lit8 v4, v4, 0x4

    or-int/lit8 v4, v4, 0x6

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    iget v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->g:I

    add-int/lit8 v0, v0, -0x1

    rem-int/lit8 v0, v0, 0x8

    rsub-int/lit8 v0, v0, 0x8

    const/16 v4, 0x8

    if-eq v0, v4, :cond_3

    aget-byte v2, v3, v1

    const/16 v4, 0xff

    ushr-int/2addr v4, v0

    and-int/2addr v2, v4

    int-to-byte v2, v2

    aput-byte v2, v3, v1

    aget-byte v2, v3, v1

    const/16 v4, 0x80

    ushr-int v0, v4, v0

    or-int/2addr v0, v2

    int-to-byte v0, v0

    aput-byte v0, v3, v1

    move v0, v1

    :goto_3
    iget-object v1, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->e:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    array-length v2, v3

    sub-int/2addr v2, v0

    invoke-interface {v1, v3, v0, v2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v0

    .line 142
    :goto_4
    return-object v0

    .line 138
    :cond_3
    aput-byte v1, v3, v1

    aget-byte v0, v3, v2

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    aput-byte v0, v3, v2

    move v0, v2

    goto :goto_3

    .line 142
    :cond_4
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->e:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v3

    iget v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->g:I

    add-int/lit8 v0, v0, 0xd

    div-int/lit8 v7, v0, 0x10

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v2, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    sget-object v3, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    sget-object v4, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->b:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    :goto_5
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v3

    aget-byte v0, v3, v1

    if-nez v0, :cond_7

    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    array-length v4, v0

    invoke-static {v3, v2, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_6
    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    aget-byte v3, v0, v3

    and-int/lit8 v3, v3, 0xf

    const/4 v4, 0x6

    if-eq v3, v4, :cond_8

    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "invalid forcing byte in block"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object v3, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->i:Ljava/math/BigInteger;

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    sget-object v4, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->a:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    sget-object v4, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->b:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->i:Ljava/math/BigInteger;

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_5

    :cond_6
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "resulting integer iS or (modulus - iS) is not congruent to 6 mod 16"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move-object v0, v3

    goto :goto_6

    :cond_8
    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    array-length v4, v0

    add-int/lit8 v4, v4, -0x1

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    ushr-int/lit8 v4, v4, 0x4

    sget-object v5, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->d:[B

    array-length v6, v0

    add-int/lit8 v6, v6, -0x2

    aget-byte v6, v0, v6

    and-int/lit16 v6, v6, 0xff

    shr-int/lit8 v6, v6, 0x4

    aget-byte v5, v5, v6

    shl-int/lit8 v5, v5, 0x4

    or-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    sget-object v3, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->c:[B

    aget-byte v4, v0, v2

    and-int/lit16 v4, v4, 0xff

    ushr-int/lit8 v4, v4, 0x4

    aget-byte v3, v3, v4

    shl-int/lit8 v3, v3, 0x4

    sget-object v4, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->c:[B

    aget-byte v5, v0, v2

    and-int/lit8 v5, v5, 0xf

    aget-byte v4, v4, v5

    or-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    move v6, v3

    move v4, v1

    move v5, v1

    move v3, v2

    :goto_7
    array-length v8, v0

    mul-int/lit8 v9, v7, 0x2

    sub-int/2addr v8, v9

    if-lt v6, v8, :cond_b

    sget-object v8, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->c:[B

    aget-byte v9, v0, v6

    and-int/lit16 v9, v9, 0xff

    ushr-int/lit8 v9, v9, 0x4

    aget-byte v8, v8, v9

    shl-int/lit8 v8, v8, 0x4

    sget-object v9, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->c:[B

    aget-byte v10, v0, v6

    and-int/lit8 v10, v10, 0xf

    aget-byte v9, v9, v10

    or-int/2addr v8, v9

    add-int/lit8 v9, v6, -0x1

    aget-byte v9, v0, v9

    xor-int/2addr v9, v8

    and-int/lit16 v9, v9, 0xff

    if-eqz v9, :cond_9

    if-nez v5, :cond_a

    add-int/lit8 v3, v6, -0x1

    aget-byte v3, v0, v3

    xor-int/2addr v3, v8

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v6, -0x1

    move v5, v2

    :cond_9
    add-int/lit8 v6, v6, -0x2

    goto :goto_7

    :cond_a
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "invalid tsums in block"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    aput-byte v1, v0, v4

    array-length v2, v0

    sub-int/2addr v2, v4

    div-int/lit8 v2, v2, 0x2

    new-array v2, v2, [B

    :goto_8
    array-length v5, v2

    if-ge v1, v5, :cond_c

    mul-int/lit8 v5, v1, 0x2

    add-int/2addr v5, v4

    add-int/lit8 v5, v5, 0x1

    aget-byte v5, v0, v5

    aput-byte v5, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_c
    add-int/lit8 v0, v3, -0x1

    iput v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->h:I

    move-object v0, v2

    goto/16 :goto_4
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->e:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I

    move-result v0

    .line 97
    iget-boolean v1, p0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;->f:Z

    if-eqz v1, :cond_0

    .line 103
    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    goto :goto_0
.end method
