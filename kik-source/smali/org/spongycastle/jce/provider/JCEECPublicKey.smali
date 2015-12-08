.class public Lorg/spongycastle/jce/provider/JCEECPublicKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/interfaces/ECPublicKey;
.implements Lorg/spongycastle/jce/interfaces/ECPointEncoder;
.implements Lorg/spongycastle/jce/interfaces/ECPublicKey;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lorg/spongycastle/math/ec/ECPoint;

.field private c:Ljava/security/spec/ECParameterSpec;

.field private d:Z

.field private e:Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;


# direct methods
.method private static a([BILjava/math/BigInteger;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/16 v5, 0x20

    .line 397
    invoke-virtual {p2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    .line 398
    array-length v0, v1

    if-ge v0, v5, :cond_1

    .line 400
    new-array v0, v5, [B

    .line 401
    array-length v3, v1

    rsub-int/lit8 v3, v3, 0x20

    array-length v4, v1

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    move v1, v2

    .line 405
    :goto_1
    if-eq v1, v5, :cond_0

    .line 407
    add-int v2, p1, v1

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v1

    aget-byte v3, v0, v3

    aput-byte v3, p0, v2

    .line 405
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 409
    :cond_0
    return-void

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method private c()Lorg/spongycastle/jce/spec/ECParameterSpec;
    .locals 2

    .prologue
    .line 455
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    if-eqz v0, :cond_0

    .line 457
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    iget-boolean v1, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->d:Z

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    .line 460
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->a()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/math/ec/ECPoint;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 433
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    if-nez v0, :cond_1

    .line 435
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    instance-of v0, v0, Lorg/spongycastle/math/ec/ECPoint$Fp;

    if-eqz v0, :cond_0

    .line 437
    new-instance v0, Lorg/spongycastle/math/ec/ECPoint$Fp;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECPoint;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v0, v3, v1, v2}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    .line 445
    :goto_0
    return-object v0

    .line 441
    :cond_0
    new-instance v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECPoint;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v0, v3, v1, v2}, Lorg/spongycastle/math/ec/ECPoint$F2m;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    goto :goto_0

    .line 445
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    goto :goto_0
.end method

.method public final b()Lorg/spongycastle/jce/spec/ECParameterSpec;
    .locals 2

    .prologue
    .line 418
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    if-nez v0, :cond_0

    .line 420
    const/4 v0, 0x0

    .line 423
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    iget-boolean v1, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->d:Z

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/ECParameterSpec;Z)Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 483
    instance-of v1, p1, Lorg/spongycastle/jce/provider/JCEECPublicKey;

    if-nez v1, :cond_1

    .line 490
    :cond_0
    :goto_0
    return v0

    .line 488
    :cond_1
    check-cast p1, Lorg/spongycastle/jce/provider/JCEECPublicKey;

    .line 490
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    iget-object v2, p1, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {p1}, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c()Lorg/spongycastle/jce/spec/ECParameterSpec;

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
    .line 305
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getEncoded()[B
    .locals 6

    .prologue
    .line 318
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->a:Ljava/lang/String;

    const-string v1, "ECGOST3410"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 320
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->e:Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->e:Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    .line 347
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v1

    .line 348
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECPoint;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    .line 349
    const/16 v3, 0x40

    new-array v3, v3, [B

    .line 351
    const/4 v4, 0x0

    invoke-static {v3, v4, v1}, Lorg/spongycastle/jce/provider/JCEECPublicKey;->a([BILjava/math/BigInteger;)V

    .line 352
    const/16 v1, 0x20

    invoke-static {v3, v1, v2}, Lorg/spongycastle/jce/provider/JCEECPublicKey;->a([BILjava/math/BigInteger;)V

    .line 354
    new-instance v1, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    new-instance v2, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v2, v4, v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v0, v3}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    move-object v0, v1

    .line 392
    :goto_1
    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/KeyUtil;->a(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)[B

    move-result-object v0

    return-object v0

    .line 326
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    instance-of v0, v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    if-eqz v0, :cond_1

    .line 328
    new-instance v1, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    check-cast v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/cryptopro/ECGOST3410NamedCurves;->b(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v2, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, v0, v2}, Lorg/spongycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    move-object v0, v1

    goto :goto_0

    .line 334
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;)Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    .line 336
    new-instance v0, Lorg/spongycastle/asn1/x9/X9ECParameters;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v2

    iget-boolean v3, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->d:Z

    invoke-static {v1, v2, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Lorg/spongycastle/math/ec/ECCurve;Ljava/security/spec/ECPoint;Z)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v5}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v5

    invoke-virtual {v5}, Ljava/security/spec/EllipticCurve;->getSeed()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 343
    new-instance v1, Lorg/spongycastle/asn1/x9/X962Parameters;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/x9/X9ECParameters;)V

    move-object v0, v1

    goto/16 :goto_0

    .line 358
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    instance-of v0, v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    if-eqz v0, :cond_4

    .line 360
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    check-cast v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 361
    if-nez v0, :cond_3

    .line 363
    new-instance v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    check-cast v0, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/ECNamedCurveSpec;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    .line 365
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/x9/X962Parameters;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 385
    :goto_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->a()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v0

    .line 386
    new-instance v2, Lorg/spongycastle/asn1/x9/X9ECPoint;

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/JCEECPublicKey;->a()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/JCEECPublicKey;->a()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/math/ec/ECPoint;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    iget-boolean v5, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->d:Z

    invoke-virtual {v0, v3, v4, v5}, Lorg/spongycastle/math/ec/ECCurve;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/spongycastle/asn1/x9/X9ECPoint;-><init>(Lorg/spongycastle/math/ec/ECPoint;)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x9/X9ECPoint;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    .line 389
    new-instance v2, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    new-instance v3, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v3, v4, v1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;[B)V

    move-object v0, v2

    goto/16 :goto_1

    .line 367
    :cond_4
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    if-nez v0, :cond_5

    .line 369
    new-instance v0, Lorg/spongycastle/asn1/x9/X962Parameters;

    sget-object v1, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/ASN1Primitive;)V

    move-object v1, v0

    goto :goto_2

    .line 373
    :cond_5
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Ljava/security/spec/EllipticCurve;)Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    .line 375
    new-instance v0, Lorg/spongycastle/asn1/x9/X9ECParameters;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v2

    iget-boolean v3, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->d:Z

    invoke-static {v1, v2, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/EC5Util;->a(Lorg/spongycastle/math/ec/ECCurve;Ljava/security/spec/ECPoint;Z)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v5}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v5

    invoke-virtual {v5}, Ljava/security/spec/EllipticCurve;->getSeed()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 382
    new-instance v1, Lorg/spongycastle/asn1/x9/X962Parameters;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/x9/X9ECParameters;)V

    goto/16 :goto_2
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 310
    const-string v0, "X.509"

    return-object v0
.end method

.method public getParams()Ljava/security/spec/ECParameterSpec;
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public getW()Ljava/security/spec/ECPoint;
    .locals 3

    .prologue
    .line 428
    new-instance v0, Ljava/security/spec/ECPoint;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECPoint;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 495
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->hashCode()I

    move-result v0

    invoke-direct {p0}, Lorg/spongycastle/jce/provider/JCEECPublicKey;->c()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/jce/spec/ECParameterSpec;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x10

    .line 465
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 466
    const-string v1, "line.separator"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 468
    const-string v2, "EC Public Key"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 469
    const-string v2, "            X: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 470
    const-string v2, "            Y: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEECPublicKey;->b:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECPoint;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 472
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
