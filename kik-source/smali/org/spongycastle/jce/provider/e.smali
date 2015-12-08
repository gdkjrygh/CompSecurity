.class final Lorg/spongycastle/jce/provider/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/e;->a:Ljava/lang/String;

    .line 52
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/e;->b:Ljava/lang/String;

    .line 55
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/e;->c:Ljava/lang/String;

    .line 58
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->x:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/e;->d:Ljava/lang/String;

    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;Lorg/spongycastle/x509/ExtendedPKIXParameters;)Ljava/security/cert/CertPathValidatorResult;
    .locals 3

    .prologue
    .line 370
    :try_start_0
    const-string v0, "PKIX"

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/cert/CertPathValidator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathValidator;
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 387
    :try_start_1
    invoke-virtual {v0, p0, p1}, Ljava/security/cert/CertPathValidator;->validate(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;
    :try_end_1
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    return-object v0

    .line 375
    :catch_0
    move-exception v0

    .line 377
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Support class could not be created."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 380
    :catch_1
    move-exception v0

    .line 382
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Support class could not be created."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 389
    :catch_2
    move-exception v0

    .line 391
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Certification path for issuer certificate of attribute certificate could not be validated."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 395
    :catch_3
    move-exception v0

    .line 398
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected static a(Ljava/security/cert/X509Certificate;)V
    .locals 2

    .prologue
    .line 353
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    const/4 v1, 0x1

    aget-boolean v0, v0, v1

    if-nez v0, :cond_0

    .line 356
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Attribute certificate issuer public key cannot be used to validate digital signatures."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 359
    :cond_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getBasicConstraints()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 361
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Attribute certificate issuer is also a public key certificate issuer."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 364
    :cond_1
    return-void
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 5

    .prologue
    .line 331
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->i()Ljava/util/Set;

    move-result-object v1

    .line 332
    const/4 v0, 0x0

    .line 333
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 335
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/TrustAnchor;

    .line 336
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    const-string v4, "RFC2253"

    invoke-virtual {v3, v4}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/security/cert/X509Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 340
    :cond_0
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    .line 342
    goto :goto_0

    .line 343
    :cond_1
    if-nez v1, :cond_2

    .line 345
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Attribute certificate issuer is not directly trusted."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 348
    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method private static a(Lorg/spongycastle/asn1/x509/DistributionPoint;Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/jce/provider/f;Ljava/util/List;)V
    .locals 16

    .prologue
    .line 573
    sget-object v4, Lorg/spongycastle/asn1/x509/X509Extensions;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-interface {v0, v4}, Lorg/spongycastle/x509/X509AttributeCertificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v4

    if-eqz v4, :cond_1

    .line 702
    :cond_0
    return-void

    .line 577
    :cond_1
    new-instance v8, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v8, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 578
    invoke-virtual/range {p3 .. p3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_2

    .line 580
    new-instance v4, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v5, "Validation time is in future."

    invoke-direct {v4, v5}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 591
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static {v0, v1, v8, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/util/Date;Lorg/spongycastle/x509/ExtendedPKIXParameters;)Ljava/util/Set;

    move-result-object v6

    .line 593
    const/4 v5, 0x0

    .line 594
    const/4 v4, 0x0

    .line 595
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v6, v5

    move-object v5, v4

    .line 599
    :cond_3
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v0, p4

    iget v4, v0, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v7, 0xb

    if-ne v4, v7, :cond_7

    invoke-virtual/range {p5 .. p5}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v4

    if-nez v4, :cond_7

    .line 603
    :try_start_0
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/X509CRL;

    .line 606
    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Lorg/spongycastle/asn1/x509/DistributionPoint;)Lorg/spongycastle/jce/provider/f;

    move-result-object v10

    .line 615
    move-object/from16 v0, p5

    invoke-virtual {v10, v0}, Lorg/spongycastle/jce/provider/f;->c(Lorg/spongycastle/jce/provider/f;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 621
    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object/from16 v0, p2

    move-object/from16 v1, p6

    invoke-static {v4, v7, v11, v0, v1}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/List;)Ljava/util/Set;

    move-result-object v7

    .line 624
    invoke-static {v4, v7}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/util/Set;)Ljava/security/PublicKey;

    move-result-object v11

    .line 626
    const/4 v7, 0x0

    .line 628
    invoke-virtual/range {p2 .. p2}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->c()Z

    move-result v12

    if-eqz v12, :cond_4

    .line 631
    move-object/from16 v0, p2

    invoke-static {v8, v0, v4}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Date;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509CRL;)Ljava/util/Set;

    move-result-object v7

    .line 635
    invoke-static {v7, v11}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Set;Ljava/security/PublicKey;)Ljava/security/cert/X509CRL;

    move-result-object v7

    .line 652
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->d()I

    move-result v11

    const/4 v12, 0x1

    if-eq v11, v12, :cond_5

    .line 659
    invoke-interface/range {p1 .. p1}, Lorg/spongycastle/x509/X509AttributeCertificate;->b()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-virtual {v4}, Ljava/security/cert/X509CRL;->getThisUpdate()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    cmp-long v11, v12, v14

    if-gez v11, :cond_5

    .line 662
    new-instance v4, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v5, "No valid CRL for current time found."

    invoke-direct {v4, v5}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 693
    :catch_0
    move-exception v4

    move-object v5, v4

    .line 696
    goto :goto_0

    .line 667
    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1, v4}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->b(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V

    .line 670
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1, v4}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V

    .line 673
    move-object/from16 v0, p2

    invoke-static {v7, v4, v0}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509CRL;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 676
    move-object/from16 v0, p3

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p2

    invoke-static {v0, v7, v1, v2, v3}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 680
    move-object/from16 v0, p3

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    invoke-static {v0, v4, v1, v2}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;)V

    .line 684
    move-object/from16 v0, p4

    iget v4, v0, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v7, 0x8

    if-ne v4, v7, :cond_6

    .line 686
    const/16 v4, 0xb

    move-object/from16 v0, p4

    iput v4, v0, Lorg/spongycastle/jce/provider/c;->a:I

    .line 690
    :cond_6
    move-object/from16 v0, p5

    invoke-virtual {v0, v10}, Lorg/spongycastle/jce/provider/f;->a(Lorg/spongycastle/jce/provider/f;)V
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 691
    const/4 v4, 0x1

    move v6, v4

    .line 696
    goto/16 :goto_0

    .line 698
    :cond_7
    if-nez v6, :cond_0

    .line 700
    throw v5
.end method

.method protected static a(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 4

    .prologue
    .line 69
    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    .line 74
    sget-object v1, Lorg/spongycastle/jce/provider/e;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 78
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/e;->a:Ljava/lang/String;

    invoke-static {p0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/TargetInformation;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/TargetInformation;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 92
    :cond_0
    sget-object v1, Lorg/spongycastle/jce/provider/e;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 93
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->l()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 94
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 83
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Target information extension could not be read."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 86
    :catch_1
    move-exception v0

    .line 88
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Target information extension could not be read."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 99
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 101
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attribute certificate contains unsupported critical extensions: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 105
    :cond_2
    return-void
.end method

.method protected static a(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;Ljava/util/List;)V
    .locals 11

    .prologue
    .line 126
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->isRevocationEnabled()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 129
    sget-object v0, Lorg/spongycastle/jce/provider/e;->b:Ljava/lang/String;

    invoke-interface {p0, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_5

    .line 131
    :try_start_0
    sget-object v0, Lorg/spongycastle/jce/provider/e;->c:Ljava/lang/String;

    invoke-static {p0, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CRLDistPoint;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 145
    :try_start_1
    invoke-static {v1, p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/x509/CRLDistPoint;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    new-instance v4, Lorg/spongycastle/jce/provider/c;

    invoke-direct {v4}, Lorg/spongycastle/jce/provider/c;-><init>()V

    .line 156
    new-instance v5, Lorg/spongycastle/jce/provider/f;

    invoke-direct {v5}, Lorg/spongycastle/jce/provider/f;-><init>()V

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v0, 0x0

    .line 161
    if-eqz v1, :cond_8

    .line 163
    :try_start_2
    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/CRLDistPoint;->c()[Lorg/spongycastle/asn1/x509/DistributionPoint;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v10

    .line 175
    const/4 v1, 0x0

    move v9, v1

    move v7, v0

    .line 177
    :goto_0
    :try_start_3
    array-length v0, v10

    if-ge v9, v0, :cond_0

    iget v0, v4, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    invoke-virtual {v5}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    .line 181
    aget-object v0, v10, v9

    move-object v1, p0

    move-object v3, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lorg/spongycastle/jce/provider/e;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/jce/provider/f;Ljava/util/List;)V
    :try_end_3
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_3 .. :try_end_3} :catch_3

    .line 184
    const/4 v7, 0x1

    .line 177
    add-int/lit8 v0, v9, 0x1

    move v9, v0

    goto :goto_0

    .line 137
    :catch_0
    move-exception v0

    .line 139
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "CRL distribution point extension could not be read."

    invoke-direct {v1, v2, v0}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 149
    :catch_1
    move-exception v0

    .line 151
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "No additional CRL locations could be decoded from CRL distribution point extension."

    invoke-direct {v1, v2, v0}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 168
    :catch_2
    move-exception v0

    .line 170
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Distribution points could not be read."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 187
    :catch_3
    move-exception v0

    move-object v1, v0

    .line 189
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "No valid CRL for distribution point found."

    invoke-direct {v0, v2, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v8, v0

    .line 200
    :cond_0
    :goto_1
    iget v0, v4, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    invoke-virtual {v5}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 210
    :try_start_4
    new-instance v1, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->d()Lorg/spongycastle/x509/AttributeCertificateIssuer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v0

    const/4 v2, 0x0

    aget-object v0, v0, v2

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_4 .. :try_end_4} :catch_5

    move-result-object v1

    .line 225
    :try_start_5
    new-instance v0, Lorg/spongycastle/asn1/x509/DistributionPoint;

    new-instance v2, Lorg/spongycastle/asn1/x509/DistributionPointName;

    new-instance v3, Lorg/spongycastle/asn1/x509/GeneralNames;

    new-instance v6, Lorg/spongycastle/asn1/x509/GeneralName;

    const/4 v9, 0x4

    invoke-direct {v6, v9, v1}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-direct {v3, v6}, Lorg/spongycastle/asn1/x509/GeneralNames;-><init>(Lorg/spongycastle/asn1/x509/GeneralName;)V

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/x509/DistributionPoint;-><init>(Lorg/spongycastle/asn1/x509/DistributionPointName;)V

    .line 229
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    move-object v1, p0

    move-object v3, p2

    move-object v6, p3

    .line 231
    invoke-static/range {v0 .. v6}, Lorg/spongycastle/jce/provider/e;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/jce/provider/f;Ljava/util/List;)V
    :try_end_5
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_5 .. :try_end_5} :catch_5

    .line 233
    const/4 v7, 0x1

    .line 242
    :cond_1
    :goto_2
    if-nez v7, :cond_2

    .line 244
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "No valid CRL found."

    invoke-direct {v0, v1, v8}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 219
    :catch_4
    move-exception v0

    .line 221
    :try_start_6
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuer from certificate for CRL could not be reencoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_6 .. :try_end_6} :catch_5

    .line 235
    :catch_5
    move-exception v0

    .line 237
    new-instance v8, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "No valid CRL for distribution point found."

    invoke-direct {v8, v1, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 247
    :cond_2
    iget v0, v4, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_3

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attribute certificate revocation after "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v4, Lorg/spongycastle/jce/provider/c;->b:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 251
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->o:[Ljava/lang/String;

    iget v2, v4, Lorg/spongycastle/jce/provider/c;->a:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 254
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    invoke-direct {v1, v0}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 256
    :cond_3
    invoke-virtual {v5}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v0

    if-nez v0, :cond_4

    iget v0, v4, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_4

    .line 259
    const/16 v0, 0xc

    iput v0, v4, Lorg/spongycastle/jce/provider/c;->a:I

    .line 261
    :cond_4
    iget v0, v4, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_7

    .line 263
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Attribute certificate status could not be determined."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 270
    :cond_5
    sget-object v0, Lorg/spongycastle/jce/provider/e;->c:Ljava/lang/String;

    invoke-interface {p0, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_6

    sget-object v0, Lorg/spongycastle/jce/provider/e;->d:Ljava/lang/String;

    invoke-interface {p0, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_7

    .line 273
    :cond_6
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "No rev avail extension is set, but also an AC revocation pointer."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 278
    :cond_7
    return-void

    :cond_8
    move v7, v0

    goto/16 :goto_1
.end method

.method protected static b(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 4

    .prologue
    .line 284
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->k()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 285
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 288
    invoke-interface {p0, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->a(Ljava/lang/String;)[Lorg/spongycastle/x509/X509Attribute;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 290
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attribute certificate contains prohibited attribute: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 295
    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->j()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 296
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 298
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 299
    invoke-interface {p0, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->a(Ljava/lang/String;)[Lorg/spongycastle/x509/X509Attribute;

    move-result-object v2

    if-nez v2, :cond_2

    .line 301
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attribute certificate does not contain necessary attribute: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 306
    :cond_3
    return-void
.end method

.method protected static c(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 3

    .prologue
    .line 313
    :try_start_0
    invoke-static {p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/PKIXParameters;)Ljava/util/Date;

    move-result-object v0

    invoke-interface {p0, v0}, Lorg/spongycastle/x509/X509AttributeCertificate;->a(Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateExpiredException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateNotYetValidException; {:try_start_0 .. :try_end_0} :catch_1

    .line 325
    return-void

    .line 316
    :catch_0
    move-exception v0

    .line 318
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Attribute certificate is not valid."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 321
    :catch_1
    move-exception v0

    .line 323
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Attribute certificate is not valid."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static d(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)Ljava/security/cert/CertPath;
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 423
    .line 425
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 426
    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->b()[Ljava/security/Principal;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 428
    new-instance v5, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v5}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 429
    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSerialNumber(Ljava/math/BigInteger;)V

    .line 430
    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->b()[Ljava/security/Principal;

    move-result-object v6

    move v1, v2

    .line 431
    :goto_0
    array-length v0, v6

    if-ge v1, v0, :cond_1

    .line 435
    :try_start_0
    aget-object v0, v6, v1

    instance-of v0, v0, Ljavax/security/auth/x500/X500Principal;

    if-eqz v0, :cond_0

    .line 437
    aget-object v0, v6, v1

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/spongycastle/x509/X509CertStoreSelector;->setIssuer([B)V

    .line 440
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v5, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 431
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 443
    :catch_0
    move-exception v0

    .line 445
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Public key certificate for attribute certificate cannot be searched."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 449
    :catch_1
    move-exception v0

    .line 451
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Unable to encode X500 principal."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 455
    :cond_1
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 457
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Public key certificate specified in base certificate ID for attribute certificate cannot be found."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 461
    :cond_2
    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 463
    new-instance v1, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v1}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 464
    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->c()Lorg/spongycastle/x509/AttributeCertificateHolder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateHolder;->a()[Ljava/security/Principal;

    move-result-object v5

    .line 465
    :goto_1
    array-length v0, v5

    if-ge v2, v0, :cond_4

    .line 469
    :try_start_1
    aget-object v0, v5, v2

    instance-of v0, v0, Ljavax/security/auth/x500/X500Principal;

    if-eqz v0, :cond_3

    .line 471
    aget-object v0, v5, v2

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/spongycastle/x509/X509CertStoreSelector;->setIssuer([B)V

    .line 474
    :cond_3
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 465
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 477
    :catch_2
    move-exception v0

    .line 479
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Public key certificate for attribute certificate cannot be searched."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 483
    :catch_3
    move-exception v0

    .line 485
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Unable to encode X500 principal."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 489
    :cond_4
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 491
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Public key certificate specified in entity name for attribute certificate cannot be found."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 496
    :cond_5
    invoke-static {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b(Ljava/security/cert/PKIXParameters;)Lorg/spongycastle/x509/ExtendedPKIXParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    .line 499
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v2, v3

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 501
    new-instance v5, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v5}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 502
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {v5, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setCertificate(Ljava/security/cert/X509Certificate;)V

    .line 503
    invoke-virtual {v0, v5}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->a(Lorg/spongycastle/util/Selector;)V

    .line 504
    :try_start_2
    const-string v1, "PKIX"

    sget-object v5, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v5}, Ljava/security/cert/CertPathBuilder;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathBuilder;
    :try_end_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_5

    move-result-object v1

    .line 521
    :try_start_3
    invoke-static {v0}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b(Ljava/security/cert/PKIXParameters;)Lorg/spongycastle/x509/ExtendedPKIXParameters;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/security/cert/CertPathBuilder;->build(Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathBuilderResult;
    :try_end_3
    .catch Ljava/security/cert/CertPathBuilderException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_3 .. :try_end_3} :catch_7

    move-result-object v3

    goto :goto_2

    .line 509
    :catch_4
    move-exception v0

    .line 511
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Support class could not be created."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 514
    :catch_5
    move-exception v0

    .line 516
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Support class could not be created."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 524
    :catch_6
    move-exception v1

    move-object v2, v1

    .line 526
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v5, "Certification path for public key certificate of attribute certificate could not be build."

    invoke-direct {v1, v5, v2}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v2, v1

    .line 534
    goto :goto_2

    .line 530
    :catch_7
    move-exception v0

    .line 533
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 535
    :cond_6
    if-eqz v2, :cond_7

    .line 538
    throw v2

    .line 540
    :cond_7
    invoke-interface {v3}, Ljava/security/cert/CertPathBuilderResult;->getCertPath()Ljava/security/cert/CertPath;

    move-result-object v0

    return-object v0
.end method
