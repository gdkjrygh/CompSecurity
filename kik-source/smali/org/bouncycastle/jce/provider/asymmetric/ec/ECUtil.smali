.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->b(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->b(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->b(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {p0}, Lorg/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves;->b(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    invoke-static {p0}, Lorg/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b(Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public static a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {p0}, Lorg/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static a(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 8

    instance-of v0, p0, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;

    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    move-object v5, v0

    :goto_0
    new-instance v6, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPrivateKey;->b()Ljava/math/BigInteger;

    move-result-object v7

    new-instance v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v6

    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t identify EC private key."

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v5, v0

    goto :goto_0
.end method

.method public static a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 8

    instance-of v0, p0, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    if-eqz v0, :cond_1

    check-cast p0, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPublicKey;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, Lorg/bouncycastle/jce/provider/ProviderUtil;->a()Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v5

    new-instance v6, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    check-cast p0, Lorg/bouncycastle/jce/provider/JCEECPublicKey;

    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/JCEECPublicKey;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v7

    new-instance v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v6

    :goto_0
    return-object v0

    :cond_0
    new-instance v6, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPublicKey;->b()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v7

    new-instance v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v6

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/security/interfaces/ECPublicKey;

    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/bouncycastle/jce/spec/ECParameterSpec;

    move-result-object v5

    new-instance v6, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v7

    new-instance v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v6

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "cannot identify EC public key."

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static a([I)[I
    .locals 6

    const/4 v2, 0x3

    const/4 v5, 0x0

    const/4 v4, 0x2

    const/4 v3, 0x1

    new-array v0, v2, [I

    array-length v1, p0

    if-ne v1, v3, :cond_0

    aget v1, p0, v5

    aput v1, v0, v5

    :goto_0
    return-object v0

    :cond_0
    array-length v1, p0

    if-eq v1, v2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only Trinomials and pentanomials supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    aget v1, p0, v5

    aget v2, p0, v3

    if-ge v1, v2, :cond_3

    aget v1, p0, v5

    aget v2, p0, v4

    if-ge v1, v2, :cond_3

    aget v1, p0, v5

    aput v1, v0, v5

    aget v1, p0, v3

    aget v2, p0, v4

    if-ge v1, v2, :cond_2

    aget v1, p0, v3

    aput v1, v0, v3

    aget v1, p0, v4

    aput v1, v0, v4

    goto :goto_0

    :cond_2
    aget v1, p0, v4

    aput v1, v0, v3

    aget v1, p0, v3

    aput v1, v0, v4

    goto :goto_0

    :cond_3
    aget v1, p0, v3

    aget v2, p0, v4

    if-ge v1, v2, :cond_5

    aget v1, p0, v3

    aput v1, v0, v5

    aget v1, p0, v5

    aget v2, p0, v4

    if-ge v1, v2, :cond_4

    aget v1, p0, v5

    aput v1, v0, v3

    aget v1, p0, v4

    aput v1, v0, v4

    goto :goto_0

    :cond_4
    aget v1, p0, v4

    aput v1, v0, v3

    aget v1, p0, v5

    aput v1, v0, v4

    goto :goto_0

    :cond_5
    aget v1, p0, v4

    aput v1, v0, v5

    aget v1, p0, v5

    aget v2, p0, v3

    if-ge v1, v2, :cond_6

    aget v1, p0, v5

    aput v1, v0, v3

    aget v1, p0, v3

    aput v1, v0, v4

    goto :goto_0

    :cond_6
    aget v1, p0, v3

    aput v1, v0, v3

    aget v1, p0, v5

    aput v1, v0, v4

    goto :goto_0
.end method

.method public static b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {p0}, Lorg/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    invoke-static {p0}, Lorg/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method
