.class public Lorg/spongycastle/jce/provider/X509CertificateObject;
.super Ljava/security/cert/X509Certificate;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

.field private b:Lorg/spongycastle/asn1/x509/BasicConstraints;

.field private c:[Z

.field private d:Z

.field private e:I

.field private f:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V
    .locals 8

    .prologue
    const/16 v0, 0x9

    const/4 v1, 0x0

    .line 76
    invoke-direct {p0}, Ljava/security/cert/X509Certificate;-><init>()V

    .line 71
    new-instance v2, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;

    invoke-direct {v2}, Lorg/spongycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl;-><init>()V

    iput-object v2, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->f:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 77
    iput-object p1, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    .line 81
    :try_start_0
    const-string v2, "2.5.29.19"

    invoke-direct {p0, v2}, Lorg/spongycastle/jce/provider/X509CertificateObject;->a(Ljava/lang/String;)[B

    move-result-object v2

    .line 83
    if-eqz v2, :cond_0

    .line 85
    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/BasicConstraints;

    move-result-object v2

    iput-object v2, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->b:Lorg/spongycastle/asn1/x509/BasicConstraints;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :cond_0
    :try_start_1
    const-string v2, "2.5.29.15"

    invoke-direct {p0, v2}, Lorg/spongycastle/jce/provider/X509CertificateObject;->a(Ljava/lang/String;)[B

    move-result-object v2

    .line 96
    if-eqz v2, :cond_3

    .line 98
    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v2

    .line 100
    invoke-virtual {v2}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v4

    .line 101
    array-length v3, v4

    mul-int/lit8 v3, v3, 0x8

    invoke-virtual {v2}, Lorg/spongycastle/asn1/DERBitString;->d()I

    move-result v2

    sub-int/2addr v3, v2

    .line 103
    if-ge v3, v0, :cond_1

    :goto_0
    new-array v0, v0, [Z

    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->c:[Z

    move v2, v1

    .line 105
    :goto_1
    if-eq v2, v3, :cond_4

    .line 107
    iget-object v5, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->c:[Z

    div-int/lit8 v0, v2, 0x8

    aget-byte v0, v4, v0

    const/16 v6, 0x80

    rem-int/lit8 v7, v2, 0x8

    ushr-int/2addr v6, v7

    and-int/2addr v0, v6

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_2
    aput-boolean v0, v5, v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 88
    :catch_0
    move-exception v0

    .line 90
    new-instance v1, Ljava/security/cert/CertificateParsingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cannot construct BasicConstraints: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateParsingException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    move v0, v3

    .line 103
    goto :goto_0

    :cond_2
    move v0, v1

    .line 107
    goto :goto_2

    .line 112
    :cond_3
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->c:[Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 118
    :cond_4
    return-void

    .line 115
    :catch_1
    move-exception v0

    .line 117
    new-instance v1, Ljava/security/cert/CertificateParsingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cannot construct KeyUsage: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateParsingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private a(Ljava/security/PublicKey;Ljava/security/Signature;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 769
    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    :goto_0
    if-nez v0, :cond_6

    .line 771
    new-instance v0, Ljava/security/cert/CertificateException;

    const-string v1, "signature algorithm in TBS cert not same as outer cert"

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 769
    :cond_1
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    sget-object v3, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    if-nez v4, :cond_5

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    sget-object v3, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 774
    :cond_6
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    .line 777
    invoke-static {p2, v0}, Lorg/spongycastle/jce/provider/g;->a(Ljava/security/Signature;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 779
    invoke-virtual {p2, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 781
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getTBSCertificate()[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/security/Signature;->update([B)V

    .line 783
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSignature()[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/security/Signature;->verify([B)Z

    move-result v0

    if-nez v0, :cond_7

    .line 785
    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "certificate does not verify with supplied key"

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 787
    :cond_7
    return-void
.end method

.method private a(Ljava/lang/String;)[B
    .locals 2

    .prologue
    .line 425
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->h()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    .line 427
    if-eqz v0, :cond_0

    .line 429
    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v0

    .line 430
    if-eqz v0, :cond_0

    .line 432
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    .line 436
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 603
    .line 604
    :try_start_0
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getEncoded()[B

    move-result-object v4

    .line 605
    const/4 v0, 0x1

    move v2, v0

    move v0, v1

    :goto_0
    array-length v3, v4

    if-ge v2, v3, :cond_0

    .line 607
    aget-byte v3, v4, v2
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    mul-int/2addr v3, v2

    add-int/2addr v3, v0

    .line 605
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v3

    goto :goto_0

    .line 613
    :catch_0
    move-exception v0

    move v0, v1

    :cond_0
    return v0
.end method


# virtual methods
.method public final a()Ljava/util/Enumeration;
    .locals 1

    .prologue
    .line 632
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->f:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v0}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 627
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->f:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v0, p1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 1

    .prologue
    .line 621
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->f:Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 622
    return-void
.end method

.method public checkValidity()V
    .locals 1

    .prologue
    .line 124
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0, v0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->checkValidity(Ljava/util/Date;)V

    .line 125
    return-void
.end method

.method public checkValidity(Ljava/util/Date;)V
    .locals 4

    .prologue
    .line 131
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getNotAfter()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 133
    new-instance v0, Ljava/security/cert/CertificateExpiredException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "certificate expired on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->h()Lorg/spongycastle/asn1/x509/Time;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/Time;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateExpiredException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 136
    :cond_0
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getNotBefore()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 138
    new-instance v0, Ljava/security/cert/CertificateNotYetValidException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "certificate not valid till "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->g()Lorg/spongycastle/asn1/x509/Time;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/Time;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateNotYetValidException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 563
    if-ne p1, p0, :cond_1

    .line 565
    const/4 v0, 0x1

    .line 584
    :cond_0
    :goto_0
    return v0

    .line 568
    :cond_1
    instance-of v1, p1, Ljava/security/cert/Certificate;

    if-eqz v1, :cond_0

    .line 573
    check-cast p1, Ljava/security/cert/Certificate;

    .line 577
    :try_start_0
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getEncoded()[B

    move-result-object v1

    .line 578
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v2

    .line 580
    invoke-static {v1, v2}, Lorg/spongycastle/util/Arrays;->a([B[B)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 584
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public getBasicConstraints()I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 372
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->b:Lorg/spongycastle/asn1/x509/BasicConstraints;

    if-eqz v1, :cond_0

    .line 374
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->b:Lorg/spongycastle/asn1/x509/BasicConstraints;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/BasicConstraints;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 376
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->b:Lorg/spongycastle/asn1/x509/BasicConstraints;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/BasicConstraints;->d()Ljava/math/BigInteger;

    move-result-object v0

    if-nez v0, :cond_1

    .line 378
    const v0, 0x7fffffff

    .line 391
    :cond_0
    :goto_0
    return v0

    .line 382
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->b:Lorg/spongycastle/asn1/x509/BasicConstraints;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/BasicConstraints;->d()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public getCriticalExtensionOIDs()Ljava/util/Set;
    .locals 5

    .prologue
    .line 396
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getVersion()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 398
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 399
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->h()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v2

    .line 401
    if-eqz v2, :cond_2

    .line 403
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509Extensions;->c()Ljava/util/Enumeration;

    move-result-object v3

    .line 405
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 407
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 408
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v4

    .line 410
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/X509Extension;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 412
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 420
    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getEncoded()[B
    .locals 2

    .prologue
    .line 552
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 554
    :catch_0
    move-exception v0

    .line 556
    new-instance v1, Ljava/security/cert/CertificateEncodingException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateEncodingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getExtendedKeyUsage()Ljava/util/List;
    .locals 4

    .prologue
    .line 344
    const-string v0, "2.5.29.37"

    invoke-direct {p0, v0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 346
    if-eqz v0, :cond_1

    .line 350
    :try_start_0
    new-instance v1, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 351
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 352
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 354
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eq v2, v1, :cond_0

    .line 356
    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 359
    :cond_0
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 367
    :goto_1
    return-object v0

    .line 363
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/cert/CertificateParsingException;

    const-string v1, "error processing extended key usage extension"

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateParsingException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 367
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getExtensionValue(Ljava/lang/String;)[B
    .locals 4

    .prologue
    .line 441
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->h()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v0

    .line 443
    if-eqz v0, :cond_0

    .line 445
    new-instance v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v0

    .line 447
    if-eqz v0, :cond_0

    .line 451
    :try_start_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->b()[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 460
    :goto_0
    return-object v0

    .line 453
    :catch_0
    move-exception v0

    .line 455
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error parsing "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 460
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getIssuerDN()Ljava/security/Principal;
    .locals 2

    .prologue
    .line 156
    :try_start_0
    new-instance v0, Lorg/spongycastle/jce/X509Principal;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->f()Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x500/X500Name;->b()[B

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/X509Principal;-><init>(Lorg/spongycastle/asn1/x500/X500Name;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getIssuerUniqueID()[Z
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 298
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->f()Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    .line 300
    if-eqz v0, :cond_2

    .line 302
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v4

    .line 303
    array-length v2, v4

    mul-int/lit8 v2, v2, 0x8

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERBitString;->d()I

    move-result v0

    sub-int v0, v2, v0

    new-array v3, v0, [Z

    move v0, v1

    .line 305
    :goto_0
    array-length v2, v3

    if-eq v0, v2, :cond_1

    .line 307
    div-int/lit8 v2, v0, 0x8

    aget-byte v2, v4, v2

    const/16 v5, 0x80

    rem-int/lit8 v6, v0, 0x8

    ushr-int/2addr v5, v6

    and-int/2addr v2, v5

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    :goto_1
    aput-boolean v2, v3, v0

    .line 305
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    .line 307
    goto :goto_1

    :cond_1
    move-object v0, v3

    .line 313
    :goto_2
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;
    .locals 3

    .prologue
    .line 168
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 169
    new-instance v1, Lorg/spongycastle/asn1/ASN1OutputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 171
    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->f()Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 173
    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 177
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "can\'t encode issuer DN"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getKeyUsage()[Z
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->c:[Z

    return-object v0
.end method

.method public getNonCriticalExtensionOIDs()Ljava/util/Set;
    .locals 5

    .prologue
    .line 465
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getVersion()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 467
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 468
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->h()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v2

    .line 470
    if-eqz v2, :cond_2

    .line 472
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509Extensions;->c()Ljava/util/Enumeration;

    move-result-object v3

    .line 474
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 476
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 477
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v4

    .line 479
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/X509Extension;->a()Z

    move-result v4

    if-nez v4, :cond_0

    .line 481
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 489
    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getNotAfter()Ljava/util/Date;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->h()Lorg/spongycastle/asn1/x509/Time;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Time;->d()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public getNotBefore()Ljava/util/Date;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->g()Lorg/spongycastle/asn1/x509/Time;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Time;->d()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public getPublicKey()Ljava/security/PublicKey;
    .locals 1

    .prologue
    .line 539
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->j()Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 543
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getSerialNumber()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->e()Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public getSigAlgName()Ljava/lang/String;
    .locals 5

    .prologue
    .line 237
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v0

    .line 239
    if-eqz v0, :cond_0

    .line 241
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Alg.Alias.Signature."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSigAlgOID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Provider;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 243
    if-eqz v0, :cond_0

    .line 263
    :goto_0
    return-object v0

    .line 249
    :cond_0
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v2

    .line 254
    const/4 v0, 0x0

    :goto_1
    array-length v1, v2

    if-eq v0, v1, :cond_2

    .line 256
    aget-object v1, v2, v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Alg.Alias.Signature."

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSigAlgOID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/Provider;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 257
    if-eqz v1, :cond_1

    move-object v0, v1

    .line 259
    goto :goto_0

    .line 254
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 263
    :cond_2
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSigAlgOID()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getSigAlgOID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSigAlgParams()[B
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 279
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 283
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-interface {v1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    const-string v2, "DER"

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Primitive;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 292
    :cond_0
    :goto_0
    return-object v0

    .line 287
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public getSignature()[B
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->l()Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public getSubjectDN()Ljava/security/Principal;
    .locals 2

    .prologue
    .line 183
    new-instance v0, Lorg/spongycastle/jce/X509Principal;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->i()Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x500/X500Name;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/X509Principal;-><init>(Lorg/spongycastle/asn1/x500/X500Name;)V

    return-object v0
.end method

.method public getSubjectUniqueID()[Z
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 318
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->g()Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    .line 320
    if-eqz v0, :cond_2

    .line 322
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v4

    .line 323
    array-length v2, v4

    mul-int/lit8 v2, v2, 0x8

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERBitString;->d()I

    move-result v0

    sub-int v0, v2, v0

    new-array v3, v0, [Z

    move v0, v1

    .line 325
    :goto_0
    array-length v2, v3

    if-eq v0, v2, :cond_1

    .line 327
    div-int/lit8 v2, v0, 0x8

    aget-byte v2, v4, v2

    const/16 v5, 0x80

    rem-int/lit8 v6, v0, 0x8

    ushr-int/2addr v5, v6

    and-int/2addr v2, v5

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    :goto_1
    aput-boolean v2, v3, v0

    .line 325
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    .line 327
    goto :goto_1

    :cond_1
    move-object v0, v3

    .line 333
    :goto_2
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;
    .locals 3

    .prologue
    .line 190
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 191
    new-instance v1, Lorg/spongycastle/asn1/ASN1OutputStream;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 193
    iget-object v2, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->i()Lorg/spongycastle/asn1/x500/X500Name;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 195
    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 199
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "can\'t encode issuer DN"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getTBSCertificate()[B
    .locals 2

    .prologue
    .line 218
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 220
    :catch_0
    move-exception v0

    .line 222
    new-instance v1, Ljava/security/cert/CertificateEncodingException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertificateEncodingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getVersion()I
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->d()I

    move-result v0

    return v0
.end method

.method public hasUnsupportedCriticalExtension()Z
    .locals 5

    .prologue
    .line 494
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getVersion()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 496
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->h()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v1

    .line 498
    if-eqz v1, :cond_1

    .line 500
    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509Extensions;->c()Ljava/util/Enumeration;

    move-result-object v2

    .line 502
    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 504
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 505
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    .line 507
    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->m:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->i:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->j:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->k:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 519
    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v0

    .line 524
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509Extension;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 526
    const/4 v0, 0x1

    .line 532
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public declared-synchronized hashCode()I
    .locals 1

    .prologue
    .line 590
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->d:Z

    if-nez v0, :cond_0

    .line 592
    invoke-direct {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->e:I

    .line 593
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->d:Z

    .line 596
    :cond_0
    iget v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    .line 590
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .prologue
    const/16 v1, 0x14

    .line 637
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 638
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 640
    const-string v0, "  [0]         Version: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getVersion()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 641
    const-string v0, "         SerialNumber: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 642
    const-string v0, "             IssuerDN: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getIssuerDN()Ljava/security/Principal;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 643
    const-string v0, "           Start Date: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getNotBefore()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 644
    const-string v0, "           Final Date: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getNotAfter()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 645
    const-string v0, "            SubjectDN: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSubjectDN()Ljava/security/Principal;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 646
    const-string v0, "           Public Key: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 647
    const-string v0, "  Signature Algorithm: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSigAlgName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 649
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->getSignature()[B

    move-result-object v4

    .line 651
    const-string v0, "            Signature: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {v4, v6, v1}, Lorg/spongycastle/util/encoders/Hex;->a([BII)[B

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move v0, v1

    .line 652
    :goto_0
    array-length v5, v4

    if-ge v0, v5, :cond_1

    .line 654
    array-length v5, v4

    add-int/lit8 v5, v5, -0x14

    if-ge v0, v5, :cond_0

    .line 656
    const-string v5, "                       "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v5

    new-instance v6, Ljava/lang/String;

    invoke-static {v4, v0, v1}, Lorg/spongycastle/util/encoders/Hex;->a([BII)[B

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 652
    :goto_1
    add-int/lit8 v0, v0, 0x14

    goto :goto_0

    .line 660
    :cond_0
    const-string v5, "                       "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v5

    new-instance v6, Ljava/lang/String;

    array-length v7, v4

    sub-int/2addr v7, v0

    invoke-static {v4, v0, v7}, Lorg/spongycastle/util/encoders/Hex;->a([BII)[B

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 664
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->c()Lorg/spongycastle/asn1/x509/TBSCertificateStructure;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/TBSCertificateStructure;->h()Lorg/spongycastle/asn1/x509/X509Extensions;

    move-result-object v4

    .line 666
    if-eqz v4, :cond_9

    .line 668
    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/X509Extensions;->c()Ljava/util/Enumeration;

    move-result-object v5

    .line 670
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 672
    const-string v0, "       Extensions: \n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 675
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 677
    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 678
    invoke-virtual {v4, v0}, Lorg/spongycastle/asn1/x509/X509Extensions;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/x509/X509Extension;

    move-result-object v1

    .line 680
    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v6

    if-eqz v6, :cond_8

    .line 682
    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509Extension;->b()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v6

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v6

    .line 683
    new-instance v7, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v7, v6}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 684
    const-string v6, "                       critical("

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/X509Extension;->a()Z

    move-result v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v6, ") "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 687
    :try_start_0
    sget-object v1, Lorg/spongycastle/asn1/x509/X509Extension;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 689
    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/BasicConstraints;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 716
    :catch_0
    move-exception v1

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 718
    const-string v0, " value = *****"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 691
    :cond_3
    :try_start_1
    sget-object v1, Lorg/spongycastle/asn1/x509/X509Extension;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 693
    new-instance v6, Lorg/spongycastle/asn1/x509/KeyUsage;

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERBitString;

    invoke-direct {v6, v1}, Lorg/spongycastle/asn1/x509/KeyUsage;-><init>(Lorg/spongycastle/asn1/DERBitString;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 695
    :cond_4
    sget-object v1, Lorg/spongycastle/asn1/misc/MiscObjectIdentifiers;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 697
    new-instance v6, Lorg/spongycastle/asn1/misc/NetscapeCertType;

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERBitString;

    invoke-direct {v6, v1}, Lorg/spongycastle/asn1/misc/NetscapeCertType;-><init>(Lorg/spongycastle/asn1/DERBitString;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    .line 699
    :cond_5
    sget-object v1, Lorg/spongycastle/asn1/misc/MiscObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 701
    new-instance v6, Lorg/spongycastle/asn1/misc/NetscapeRevocationURL;

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERIA5String;

    invoke-direct {v6, v1}, Lorg/spongycastle/asn1/misc/NetscapeRevocationURL;-><init>(Lorg/spongycastle/asn1/DERIA5String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    .line 703
    :cond_6
    sget-object v1, Lorg/spongycastle/asn1/misc/MiscObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 705
    new-instance v6, Lorg/spongycastle/asn1/misc/VerisignCzagExtension;

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERIA5String;

    invoke-direct {v6, v1}, Lorg/spongycastle/asn1/misc/VerisignCzagExtension;-><init>(Lorg/spongycastle/asn1/DERIA5String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    .line 709
    :cond_7
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 710
    const-string v1, " value = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v6

    invoke-static {v6}, Lorg/spongycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    .line 723
    :cond_8
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    .line 728
    :cond_9
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final verify(Ljava/security/PublicKey;)V
    .locals 2

    .prologue
    .line 737
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/g;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;)Ljava/lang/String;

    move-result-object v0

    .line 741
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 748
    :goto_0
    invoke-direct {p0, p1, v0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->a(Ljava/security/PublicKey;Ljava/security/Signature;)V

    .line 749
    return-void

    .line 745
    :catch_0
    move-exception v1

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    goto :goto_0
.end method

.method public final verify(Ljava/security/PublicKey;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 757
    iget-object v0, p0, Lorg/spongycastle/jce/provider/X509CertificateObject;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->k()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/g;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;)Ljava/lang/String;

    move-result-object v0

    .line 758
    invoke-static {v0, p2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 760
    invoke-direct {p0, p1, v0}, Lorg/spongycastle/jce/provider/X509CertificateObject;->a(Ljava/security/PublicKey;Ljava/security/Signature;)V

    .line 761
    return-void
.end method
