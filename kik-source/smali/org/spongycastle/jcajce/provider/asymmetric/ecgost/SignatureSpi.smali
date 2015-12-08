.class public Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;
.super Ljava/security/SignatureSpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;


# instance fields
.field private bA:Lorg/spongycastle/crypto/DSA;

.field private bz:Lorg/spongycastle/crypto/Digest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    .line 35
    new-instance v0, Lorg/spongycastle/crypto/digests/GOST3411Digest;

    invoke-direct {v0}, Lorg/spongycastle/crypto/digests/GOST3411Digest;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    .line 36
    new-instance v0, Lorg/spongycastle/crypto/signers/ECGOST3410Signer;

    invoke-direct {v0}, Lorg/spongycastle/crypto/signers/ECGOST3410Signer;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    .line 37
    return-void
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 216
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 86
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/ECKey;

    if-eqz v0, :cond_0

    .line 88
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    .line 95
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 97
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->appRandom:Ljava/security/SecureRandom;

    if-eqz v1, :cond_1

    .line 99
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    new-instance v2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->appRandom:Ljava/security/SecureRandom;

    invoke-direct {v2, v0, v3}, Lorg/spongycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-interface {v1, v4, v2}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 105
    :goto_1
    return-void

    .line 92
    :cond_0
    invoke-static {p1}, Lorg/spongycastle/jce/provider/GOST3410Util;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0

    .line 103
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    invoke-interface {v1, v4, v0}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_1
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    .prologue
    .line 45
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    if-eqz v0, :cond_0

    .line 47
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    .line 76
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 77
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 78
    return-void

    .line 49
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/GOST3410Key;

    if-eqz v0, :cond_1

    .line 51
    invoke-static {p1}, Lorg/spongycastle/jce/provider/GOST3410Util;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0

    .line 57
    :cond_1
    :try_start_0
    invoke-interface {p1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    .line 59
    invoke-static {v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;

    move-result-object v0

    .line 61
    instance-of v1, v0, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    if-eqz v1, :cond_2

    .line 63
    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0

    .line 67
    :cond_2
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in DSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in DSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 207
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    .prologue
    .line 197
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 126
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 128
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 132
    const/16 v1, 0x40

    :try_start_0
    new-array v1, v1, [B

    .line 133
    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    invoke-interface {v2, v0}, Lorg/spongycastle/crypto/DSA;->a([B)[Ljava/math/BigInteger;

    move-result-object v0

    .line 134
    const/4 v2, 0x0

    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    .line 135
    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    .line 137
    const/4 v3, 0x0

    aget-byte v3, v0, v3

    if-eqz v3, :cond_0

    .line 139
    const/4 v3, 0x0

    array-length v4, v0

    rsub-int/lit8 v4, v4, 0x20

    array-length v5, v0

    invoke-static {v0, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 146
    :goto_0
    const/4 v0, 0x0

    aget-byte v0, v2, v0

    if-eqz v0, :cond_1

    .line 148
    const/4 v0, 0x0

    array-length v3, v2

    rsub-int/lit8 v3, v3, 0x40

    array-length v4, v2

    invoke-static {v2, v0, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 155
    :goto_1
    return-object v1

    .line 143
    :cond_0
    const/4 v3, 0x1

    array-length v4, v0

    add-int/lit8 v4, v4, -0x1

    rsub-int/lit8 v4, v4, 0x20

    array-length v5, v0

    add-int/lit8 v5, v5, -0x1

    invoke-static {v0, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 157
    :catch_0
    move-exception v0

    .line 159
    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 152
    :cond_1
    const/4 v0, 0x1

    :try_start_1
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    rsub-int/lit8 v3, v3, 0x40

    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    invoke-static {v2, v0, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method protected engineUpdate(B)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 112
    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 121
    return-void
.end method

.method protected engineVerify([B)Z
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 167
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 169
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v7}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 175
    const/16 v1, 0x20

    :try_start_0
    new-array v1, v1, [B

    .line 176
    const/16 v2, 0x20

    new-array v2, v2, [B

    .line 178
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x20

    invoke-static {p1, v3, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 180
    const/16 v3, 0x20

    const/4 v4, 0x0

    const/16 v5, 0x20

    invoke-static {p1, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    const/4 v3, 0x2

    new-array v3, v3, [Ljava/math/BigInteger;

    .line 183
    const/4 v4, 0x0

    new-instance v5, Ljava/math/BigInteger;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v5, v3, v4

    .line 184
    const/4 v1, 0x1

    new-instance v4, Ljava/math/BigInteger;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v4, v3, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ecgost/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    aget-object v2, v3, v7

    aget-object v3, v3, v8

    invoke-interface {v1, v0, v2, v3}, Lorg/spongycastle/crypto/DSA;->a([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z

    move-result v0

    return v0

    .line 188
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "error decoding signature bytes."

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
