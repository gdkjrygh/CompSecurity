.class public abstract Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;
.super Ljava/security/SignatureSpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;


# instance fields
.field protected bA:Lorg/spongycastle/crypto/DSA;

.field protected bB:Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;

.field protected bz:Lorg/spongycastle/crypto/Digest;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/DSA;Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    .line 26
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bz:Lorg/spongycastle/crypto/Digest;

    .line 27
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bA:Lorg/spongycastle/crypto/DSA;

    .line 28
    iput-object p3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bB:Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;

    .line 29
    return-void
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 110
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 101
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    .prologue
    .line 91
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 50
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 52
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 56
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bA:Lorg/spongycastle/crypto/DSA;

    invoke-interface {v1, v0}, Lorg/spongycastle/crypto/DSA;->a([B)[Ljava/math/BigInteger;

    move-result-object v0

    .line 58
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bB:Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 60
    :catch_0
    move-exception v0

    .line 62
    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate(B)V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 36
    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 45
    return-void
.end method

.method protected engineVerify([B)Z
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 70
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 72
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v3}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 78
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bB:Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;

    invoke-interface {v1, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;->a([B)[Ljava/math/BigInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 85
    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;->bA:Lorg/spongycastle/crypto/DSA;

    aget-object v3, v1, v3

    const/4 v4, 0x1

    aget-object v1, v1, v4

    invoke-interface {v2, v0, v3, v1}, Lorg/spongycastle/crypto/DSA;->a([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z

    move-result v0

    return v0

    .line 82
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "error decoding signature bytes."

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
