.class public Lorg/bouncycastle/crypto/tls/TlsBlockCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsCipher;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

.field protected b:Lorg/bouncycastle/crypto/BlockCipher;

.field protected c:Lorg/bouncycastle/crypto/BlockCipher;

.field protected d:Lorg/bouncycastle/crypto/tls/TlsMac;

.field protected e:Lorg/bouncycastle/crypto/tls/TlsMac;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;I)V
    .locals 8

    const/4 v7, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    iput-object p2, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    iput-object p3, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->c:Lorg/bouncycastle/crypto/BlockCipher;

    mul-int/lit8 v0, p6, 0x2

    invoke-interface {p4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {p5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {p2}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {p3}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {p1}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecurityParameters()Lorg/bouncycastle/crypto/tls/SecurityParameters;

    move-result-object v1

    iget-object v2, v1, Lorg/bouncycastle/crypto/tls/SecurityParameters;->c:[B

    const-string v3, "key expansion"

    iget-object v4, v1, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    iget-object v1, v1, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    invoke-static {v4, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->concat([B[B)[B

    move-result-object v1

    invoke-static {v2, v3, v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->PRF([BLjava/lang/String;[BI)[B

    move-result-object v3

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-interface {p4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    invoke-direct {v0, p4, v3, v7, v1}, Lorg/bouncycastle/crypto/tls/TlsMac;-><init>(Lorg/bouncycastle/crypto/Digest;[BII)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->d:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-interface {p4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    new-instance v1, Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-interface {p5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    invoke-direct {v1, p5, v3, v0, v2}, Lorg/bouncycastle/crypto/tls/TlsMac;-><init>(Lorg/bouncycastle/crypto/Digest;[BII)V

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->e:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-interface {p5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    add-int v5, v0, v1

    const/4 v1, 0x1

    mul-int/lit8 v0, p6, 0x2

    add-int v6, v5, v0

    move-object v0, p0

    move-object v2, p2

    move v4, p6

    invoke-virtual/range {v0 .. v6}, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->initCipher(ZLorg/bouncycastle/crypto/BlockCipher;[BIII)V

    add-int/2addr v5, p6

    add-int v0, v5, p6

    invoke-interface {p2}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v1

    add-int v6, v0, v1

    move-object v0, p0

    move v1, v7

    move-object v2, p3

    move v4, p6

    invoke-virtual/range {v0 .. v6}, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->initCipher(ZLorg/bouncycastle/crypto/BlockCipher;[BIII)V

    return-void
.end method


# virtual methods
.method protected chooseExtraPadBlocks(Ljava/security/SecureRandom;I)I
    .locals 1

    invoke-virtual {p1}, Ljava/security/SecureRandom;->nextInt()I

    move-result v0

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->lowestBitSet(I)I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public decodeCiphertext(S[BII)[B
    .locals 9

    const/4 v3, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->e:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsMac;->getSize()I

    move-result v0

    add-int/lit8 v2, v0, 0x1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->c:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v4

    if-ge p4, v2, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    rem-int v0, p4, v4

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_1
    move v0, v1

    :goto_0
    if-ge v0, p4, :cond_2

    iget-object v5, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->c:Lorg/bouncycastle/crypto/BlockCipher;

    add-int v6, v0, p3

    add-int v7, v0, p3

    invoke-interface {v5, p2, v6, p2, v7}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    add-int/2addr v0, v4

    goto :goto_0

    :cond_2
    add-int v0, p3, p4

    add-int/lit8 v5, v0, -0x1

    aget-byte v6, p2, v5

    and-int/lit16 v0, v6, 0xff

    sub-int v7, p4, v2

    if-le v0, v7, :cond_3

    move v0, v1

    move v2, v3

    :goto_1
    sub-int v0, v7, v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->e:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v4, p1, p2, p3, v0}, Lorg/bouncycastle/crypto/tls/TlsMac;->calculateMac(S[BII)[B

    move-result-object v4

    array-length v5, v4

    new-array v5, v5, [B

    add-int v6, p3, v0

    array-length v7, v4

    invoke-static {p2, v6, v5, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4, v5}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v4

    if-nez v4, :cond_6

    :goto_2
    if-eqz v3, :cond_5

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_3
    sub-int v2, v5, v0

    move v4, v1

    :goto_3
    if-ge v2, v5, :cond_4

    aget-byte v8, p2, v2

    xor-int/2addr v8, v6

    or-int/2addr v4, v8

    int-to-byte v4, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    if-eqz v4, :cond_7

    move v0, v1

    move v2, v3

    goto :goto_1

    :cond_5
    new-array v2, v0, [B

    invoke-static {p2, p3, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_6
    move v3, v2

    goto :goto_2

    :cond_7
    move v2, v1

    goto :goto_1
.end method

.method public encodePlaintext(S[BII)[B
    .locals 9

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v2

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->d:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/tls/TlsMac;->getSize()I

    move-result v1

    add-int/2addr v1, p4

    add-int/lit8 v1, v1, 0x1

    rem-int/2addr v1, v2

    sub-int v1, v2, v1

    rsub-int v3, v1, 0xff

    div-int/2addr v3, v2

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v4}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v4

    invoke-virtual {p0, v4, v3}, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->chooseExtraPadBlocks(Ljava/security/SecureRandom;I)I

    move-result v3

    mul-int/2addr v3, v2

    add-int/2addr v3, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->d:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/tls/TlsMac;->getSize()I

    move-result v1

    add-int/2addr v1, p4

    add-int/2addr v1, v3

    add-int/lit8 v4, v1, 0x1

    new-array v5, v4, [B

    invoke-static {p2, p3, v5, v0, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->d:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v1, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/TlsMac;->calculateMac(S[BII)[B

    move-result-object v1

    array-length v6, v1

    invoke-static {v1, v0, v5, p4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v1, v1

    add-int v6, p4, v1

    move v1, v0

    :goto_0
    if-gt v1, v3, :cond_0

    add-int v7, v1, v6

    int-to-byte v8, v3

    aput-byte v8, v5, v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v0, v4, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1, v5, v0, v5, v0}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    add-int/2addr v0, v2

    goto :goto_1

    :cond_1
    return-object v5
.end method

.method protected initCipher(ZLorg/bouncycastle/crypto/BlockCipher;[BIII)V
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v0, p3, p5, p4}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-interface {p2}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v2

    invoke-direct {v1, v0, p3, p6, v2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[BII)V

    invoke-interface {p2, p1, v1}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method protected lowestBitSet(I)I
    .locals 2

    if-nez p1, :cond_1

    const/16 v0, 0x20

    :cond_0
    return v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    shr-int/lit8 p1, p1, 0x1

    goto :goto_0
.end method
