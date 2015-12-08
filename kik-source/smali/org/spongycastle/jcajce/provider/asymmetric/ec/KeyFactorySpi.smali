.class public Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;
.super Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseKeyFactorySpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi$ECMQV;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi$ECDHC;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi$ECDH;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi$ECGOST3410;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi$ECDSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi$EC;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;


# direct methods
.method constructor <init>(Ljava/lang/String;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseKeyFactorySpi;-><init>()V

    .line 36
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->a:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    .line 38
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;
    .locals 4

    .prologue
    .line 158
    invoke-virtual {p1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 160
    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 162
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-direct {v0, v1, p1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V

    return-object v0

    .line 166
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "algorithm identifier "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " in key not recognised"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final a(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;
    .locals 4

    .prologue
    .line 173
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 175
    sget-object v1, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 177
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->a:Ljava/lang/String;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-direct {v0, v1, p1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V

    return-object v0

    .line 181
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "algorithm identifier "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " in key not recognised"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    .locals 3

    .prologue
    .line 127
    instance-of v0, p1, Lorg/spongycastle/jce/spec/ECPrivateKeySpec;

    if-eqz v0, :cond_0

    .line 129
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->a:Ljava/lang/String;

    check-cast p1, Lorg/spongycastle/jce/spec/ECPrivateKeySpec;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-direct {v0, v1, p1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;-><init>(Ljava/lang/String;Lorg/spongycastle/jce/spec/ECPrivateKeySpec;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V

    .line 136
    :goto_0
    return-object v0

    .line 131
    :cond_0
    instance-of v0, p1, Ljava/security/spec/ECPrivateKeySpec;

    if-eqz v0, :cond_1

    .line 133
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->a:Ljava/lang/String;

    check-cast p1, Ljava/security/spec/ECPrivateKeySpec;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-direct {v0, v1, p1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;-><init>(Ljava/lang/String;Ljava/security/spec/ECPrivateKeySpec;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V

    goto :goto_0

    .line 136
    :cond_1
    invoke-super {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseKeyFactorySpi;->engineGeneratePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    goto :goto_0
.end method

.method protected engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    .locals 3

    .prologue
    .line 143
    instance-of v0, p1, Lorg/spongycastle/jce/spec/ECPublicKeySpec;

    if-eqz v0, :cond_0

    .line 145
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->a:Ljava/lang/String;

    check-cast p1, Lorg/spongycastle/jce/spec/ECPublicKeySpec;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-direct {v0, v1, p1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;-><init>(Ljava/lang/String;Lorg/spongycastle/jce/spec/ECPublicKeySpec;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V

    .line 152
    :goto_0
    return-object v0

    .line 147
    :cond_0
    instance-of v0, p1, Ljava/security/spec/ECPublicKeySpec;

    if-eqz v0, :cond_1

    .line 149
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->a:Ljava/lang/String;

    check-cast p1, Ljava/security/spec/ECPublicKeySpec;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-direct {v0, v1, p1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;-><init>(Ljava/lang/String;Ljava/security/spec/ECPublicKeySpec;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V

    goto :goto_0

    .line 152
    :cond_1
    invoke-super {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseKeyFactorySpi;->engineGeneratePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    goto :goto_0
.end method

.method protected engineGetKeySpec(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/spec/KeySpec;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 61
    const-class v0, Ljava/security/spec/ECPublicKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_1

    .line 63
    check-cast p1, Ljava/security/interfaces/ECPublicKey;

    .line 64
    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    new-instance v0, Ljava/security/spec/ECPublicKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 120
    :goto_0
    return-object v0

    .line 70
    :cond_0
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    .line 72
    new-instance v0, Ljava/security/spec/ECPublicKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-virtual {v1}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Lorg/spongycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v3

    invoke-static {v3, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;Lorg/spongycastle/jce/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    goto :goto_0

    .line 75
    :cond_1
    const-class v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p1, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v0, :cond_3

    .line 77
    check-cast p1, Ljava/security/interfaces/ECPrivateKey;

    .line 79
    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 81
    new-instance v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    goto :goto_0

    .line 85
    :cond_2
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    .line 87
    new-instance v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Lorg/spongycastle/math/ec/ECCurve;)Ljava/security/spec/EllipticCurve;

    move-result-object v3

    invoke-static {v3, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;Lorg/spongycastle/jce/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    goto :goto_0

    .line 90
    :cond_3
    const-class v0, Lorg/spongycastle/jce/spec/ECPublicKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of v0, p1, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_5

    .line 92
    check-cast p1, Ljava/security/interfaces/ECPublicKey;

    .line 93
    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 95
    new-instance v0, Lorg/spongycastle/jce/spec/ECPublicKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-static {v2, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/spec/ECPublicKeySpec;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/jce/spec/ECParameterSpec;)V

    goto/16 :goto_0

    .line 99
    :cond_4
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    .line 101
    new-instance v0, Lorg/spongycastle/jce/spec/ECPublicKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v3

    invoke-static {v2, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lorg/spongycastle/jce/spec/ECPublicKeySpec;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/jce/spec/ECParameterSpec;)V

    goto/16 :goto_0

    .line 104
    :cond_5
    const-class v0, Lorg/spongycastle/jce/spec/ECPrivateKeySpec;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_7

    instance-of v0, p1, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v0, :cond_7

    .line 106
    check-cast p1, Ljava/security/interfaces/ECPrivateKey;

    .line 108
    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 110
    new-instance v0, Lorg/spongycastle/jce/spec/ECPrivateKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-static {v2, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/jce/spec/ECParameterSpec;)V

    goto/16 :goto_0

    .line 114
    :cond_6
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    .line 116
    new-instance v0, Lorg/spongycastle/jce/spec/ECPrivateKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lorg/spongycastle/jce/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/jce/spec/ECParameterSpec;)V

    goto/16 :goto_0

    .line 120
    :cond_7
    invoke-super {p0, p1, p2}, Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseKeyFactorySpi;->engineGetKeySpec(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/spec/KeySpec;

    move-result-object v0

    goto/16 :goto_0
.end method

.method protected engineTranslateKey(Ljava/security/Key;)Ljava/security/Key;
    .locals 2

    .prologue
    .line 44
    instance-of v0, p1, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_0

    .line 46
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;

    check-cast p1, Ljava/security/interfaces/ECPublicKey;

    invoke-direct {v0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPublicKey;-><init>(Ljava/security/interfaces/ECPublicKey;)V

    .line 50
    :goto_0
    return-object v0

    .line 48
    :cond_0
    instance-of v0, p1, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v0, :cond_1

    .line 50
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;

    check-cast p1, Ljava/security/interfaces/ECPrivateKey;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/KeyFactorySpi;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-direct {v0, p1, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/BCECPrivateKey;-><init>(Ljava/security/interfaces/ECPrivateKey;Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;)V

    goto :goto_0

    .line 53
    :cond_1
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "key type unknown"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
