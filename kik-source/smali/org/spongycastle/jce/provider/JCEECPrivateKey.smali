.class public Lorg/spongycastle/jce/provider/JCEECPrivateKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/interfaces/ECPrivateKey;
.implements Lorg/spongycastle/jce/interfaces/ECPointEncoder;
.implements Lorg/spongycastle/jce/interfaces/ECPrivateKey;
.implements Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/math/BigInteger;

.field private c:Ljava/security/spec/ECParameterSpec;

.field private d:Z

.field private e:Lorg/spongycastle/asn1/DERBitString;

.field private f:Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const-string v0, "EC"

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    .line 52
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->f:Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    .line 56
    return-void
.end method

.method private d()Lorg/spongycastle/jce/spec/ECParameterSpec;
    .locals 2

    .prologue
    .line 369
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    iget-boolean v1, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->d:Z

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    .line 374
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/util/Enumeration;
    .locals 1

    .prologue
    .line 402
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->f:Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-virtual {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;->a()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 397
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->f:Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 391
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->f:Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-virtual {v0, p1, p2}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 392
    return-void
.end method

.method public final b()Lorg/spongycastle/jce/spec/ECParameterSpec;
    .locals 2

    .prologue
    .line 359
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    if-nez v0, :cond_0

    .line 361
    const/4 v0, 0x0

    .line 364
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    iget-boolean v1, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->d:Z

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 412
    instance-of v1, p1, Lorg/spongycastle/jce/provider/JCEECPrivateKey;

    if-nez v1, :cond_1

    .line 419
    :cond_0
    :goto_0
    return v0

    .line 417
    :cond_1
    check-cast p1, Lorg/spongycastle/jce/provider/JCEECPrivateKey;

    .line 419
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    iget-object v2, p1, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->d()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {p1}, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->d()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/jce/spec/ECParameterSpec;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getEncoded()[B
    .locals 6

    .prologue
    .line 293
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    instance-of v0, v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    if-eqz v0, :cond_1

    .line 295
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    check-cast v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 296
    if-nez v0, :cond_0

    .line 298
    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    check-cast v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    .line 300
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/x9/X962Parameters;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/ASN1Primitive;)V

    move-object v0, v1

    .line 323
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->e:Lorg/spongycastle/asn1/DERBitString;

    if-eqz v1, :cond_3

    .line 325
    new-instance v1, Lorg/spongycastle/asn1/sec/ECPrivateKeyStructure;

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->e:Lorg/spongycastle/asn1/DERBitString;

    invoke-direct {v1, v2, v3, v0}, Lorg/spongycastle/asn1/sec/ECPrivateKeyStructure;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/DERBitString;Lorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v2, v1

    .line 334
    :goto_1
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->a:Ljava/lang/String;

    const-string v3, "ECGOST3410"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 336
    new-instance v1, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;

    new-instance v3, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x9/X962Parameters;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/sec/ECPrivateKeyStructure;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v0, v1

    .line 344
    :goto_2
    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 348
    :goto_3
    return-object v0

    .line 302
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    if-nez v0, :cond_2

    .line 304
    new-instance v0, Lorg/spongycastle/asn1/x9/X962Parameters;

    sget-object v1, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/ASN1Primitive;)V

    goto :goto_0

    .line 308
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;)Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    .line 310
    new-instance v0, Lorg/spongycastle/asn1/x9/X9ECParameters;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v2

    iget-boolean v3, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->d:Z

    invoke-static {v1, v2, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Lorg/spongycastle/math/ec/ECCurve;Ljava/security/spec/ECPoint;Z)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v5}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v5

    invoke-virtual {v5}, Ljava/security/spec/EllipticCurve;->getSeed()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 317
    new-instance v1, Lorg/spongycastle/asn1/x9/X962Parameters;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/x9/X9ECParameters;)V

    move-object v0, v1

    goto :goto_0

    .line 329
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/sec/ECPrivateKeyStructure;

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/asn1/sec/ECPrivateKeyStructure;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v2, v1

    goto :goto_1

    .line 341
    :cond_4
    :try_start_1
    new-instance v1, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;

    new-instance v3, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x9/X962Parameters;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/sec/ECPrivateKeyStructure;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v1

    goto :goto_2

    .line 348
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_3
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 280
    const-string v0, "PKCS#8"

    return-object v0
.end method

.method public getParams()Ljava/security/spec/ECParameterSpec;
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->c:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public getS()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 424
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    invoke-direct {p0}, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->d()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/jce/spec/ECParameterSpec;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 429
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 430
    const-string v1, "line.separator"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 432
    const-string v2, "EC Private Key"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 433
    const-string v2, "             S: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEECPrivateKey;->b:Ljava/math/BigInteger;

    const/16 v4, 0x10

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 435
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
