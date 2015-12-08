.class public Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 160
    invoke-static {p0}, Lorg/spongycastle/asn1/x9/X962NamedCurves;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 162
    if-nez v0, :cond_2

    .line 164
    invoke-static {p0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 165
    if-nez v0, :cond_0

    .line 167
    invoke-static {p0}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 169
    :cond_0
    if-nez v0, :cond_1

    .line 171
    invoke-static {p0}, Lorg/spongycastle/asn1/teletrust/TeleTrusTNamedCurves;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 173
    :cond_1
    if-nez v0, :cond_2

    .line 175
    invoke-static {p0}, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 179
    :cond_2
    return-object v0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;
    .locals 1

    .prologue
    .line 185
    invoke-static {p0}, Lorg/spongycastle/asn1/x9/X962NamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    .line 187
    if-nez v0, :cond_1

    .line 189
    invoke-static {p0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    .line 190
    if-nez v0, :cond_0

    .line 192
    invoke-static {p0}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    .line 194
    :cond_0
    if-nez v0, :cond_1

    .line 196
    invoke-static {p0}, Lorg/spongycastle/asn1/teletrust/TeleTrusTNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    .line 200
    :cond_1
    return-object v0
.end method

.method public static a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
    .locals 8

    .prologue
    .line 139
    instance-of v0, p0, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    if-eqz v0, :cond_0

    .line 141
    check-cast p0, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    .line 142
    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->b()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    .line 144
    if-nez v0, :cond_1

    .line 146
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    move-object v5, v0

    .line 149
    :goto_0
    new-instance v6, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v7

    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    return-object v6

    .line 154
    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t identify EC private key."

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v5, v0

    goto :goto_0
.end method

.method public static a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
    .locals 8

    .prologue
    .line 103
    instance-of v0, p0, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    if-eqz v0, :cond_1

    .line 105
    check-cast p0, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    .line 106
    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ECPublicKey;->b()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v5

    .line 108
    if-nez v5, :cond_0

    .line 110
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v5

    .line 112
    new-instance v6, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    check-cast p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;

    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v7

    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v6

    .line 127
    :goto_0
    return-object v0

    .line 118
    :cond_0
    new-instance v6, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ECPublicKey;->a()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v7

    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v6

    goto :goto_0

    .line 123
    :cond_1
    instance-of v0, p0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_2

    .line 125
    check-cast p0, Ljava/security/interfaces/ECPublicKey;

    .line 126
    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v5

    .line 127
    new-instance v6, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v7

    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    invoke-direct {v6, v7, v0}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v6

    goto :goto_0

    .line 132
    :cond_2
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "cannot identify EC public key."

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static a([I)[I
    .locals 6

    .prologue
    const/4 v2, 0x3

    const/4 v5, 0x0

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 39
    new-array v0, v2, [I

    .line 41
    array-length v1, p0

    if-ne v1, v3, :cond_0

    .line 43
    aget v1, p0, v5

    aput v1, v0, v5

    .line 96
    :goto_0
    return-object v0

    .line 47
    :cond_0
    array-length v1, p0

    if-eq v1, v2, :cond_1

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only Trinomials and pentanomials supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_1
    aget v1, p0, v5

    aget v2, p0, v3

    if-ge v1, v2, :cond_3

    aget v1, p0, v5

    aget v2, p0, v4

    if-ge v1, v2, :cond_3

    .line 54
    aget v1, p0, v5

    aput v1, v0, v5

    .line 55
    aget v1, p0, v3

    aget v2, p0, v4

    if-ge v1, v2, :cond_2

    .line 57
    aget v1, p0, v3

    aput v1, v0, v3

    .line 58
    aget v1, p0, v4

    aput v1, v0, v4

    goto :goto_0

    .line 62
    :cond_2
    aget v1, p0, v4

    aput v1, v0, v3

    .line 63
    aget v1, p0, v3

    aput v1, v0, v4

    goto :goto_0

    .line 66
    :cond_3
    aget v1, p0, v3

    aget v2, p0, v4

    if-ge v1, v2, :cond_5

    .line 68
    aget v1, p0, v3

    aput v1, v0, v5

    .line 69
    aget v1, p0, v5

    aget v2, p0, v4

    if-ge v1, v2, :cond_4

    .line 71
    aget v1, p0, v5

    aput v1, v0, v3

    .line 72
    aget v1, p0, v4

    aput v1, v0, v4

    goto :goto_0

    .line 76
    :cond_4
    aget v1, p0, v4

    aput v1, v0, v3

    .line 77
    aget v1, p0, v5

    aput v1, v0, v4

    goto :goto_0

    .line 82
    :cond_5
    aget v1, p0, v4

    aput v1, v0, v5

    .line 83
    aget v1, p0, v5

    aget v2, p0, v3

    if-ge v1, v2, :cond_6

    .line 85
    aget v1, p0, v5

    aput v1, v0, v3

    .line 86
    aget v1, p0, v3

    aput v1, v0, v4

    goto :goto_0

    .line 90
    :cond_6
    aget v1, p0, v3

    aput v1, v0, v3

    .line 91
    aget v1, p0, v5

    aput v1, v0, v4

    goto :goto_0
.end method

.method public static b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 206
    invoke-static {p0}, Lorg/spongycastle/asn1/x9/X962NamedCurves;->b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    .line 208
    if-nez v0, :cond_2

    .line 210
    invoke-static {p0}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    .line 211
    if-nez v0, :cond_0

    .line 213
    invoke-static {p0}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    .line 215
    :cond_0
    if-nez v0, :cond_1

    .line 217
    invoke-static {p0}, Lorg/spongycastle/asn1/teletrust/TeleTrusTNamedCurves;->b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    .line 219
    :cond_1
    if-nez v0, :cond_2

    .line 221
    invoke-static {p0}, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;

    move-result-object v0

    .line 225
    :cond_2
    return-object v0
.end method
