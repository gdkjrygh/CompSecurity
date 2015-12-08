.class public Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final a:Ljava/lang/String;

.field protected static final b:Ljava/lang/String;

.field protected static final c:Ljava/lang/String;

.field protected static final d:Ljava/lang/String;

.field protected static final e:Ljava/lang/String;

.field protected static final f:Ljava/lang/String;

.field protected static final g:Ljava/lang/String;

.field protected static final h:Ljava/lang/String;

.field protected static final i:Ljava/lang/String;

.field protected static final j:Ljava/lang/String;

.field protected static final k:Ljava/lang/String;

.field protected static final l:Ljava/lang/String;

.field protected static final m:Ljava/lang/String;

.field protected static final n:Ljava/lang/String;

.field protected static final o:[Ljava/lang/String;

.field private static final p:Lorg/spongycastle/jce/provider/PKIXCRLUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 62
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXCRLUtil;

    invoke-direct {v0}, Lorg/spongycastle/jce/provider/PKIXCRLUtil;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->p:Lorg/spongycastle/jce/provider/PKIXCRLUtil;

    .line 378
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    .line 380
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    .line 382
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->w:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->c:Ljava/lang/String;

    .line 384
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    .line 386
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->e:Ljava/lang/String;

    .line 388
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->f:Ljava/lang/String;

    .line 390
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->t:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    .line 392
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    .line 394
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->i:Ljava/lang/String;

    .line 396
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->j:Ljava/lang/String;

    .line 398
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->k:Ljava/lang/String;

    .line 400
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->l:Ljava/lang/String;

    .line 402
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->m:Ljava/lang/String;

    .line 404
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->n:Ljava/lang/String;

    .line 2280
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "unspecified"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "keyCompromise"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "cACompromise"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "affiliationChanged"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "superseded"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "cessationOfOperation"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "certificateHold"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "unknown"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "removeFromCRL"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "privilegeWithdrawn"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "aACompromise"

    aput-object v2, v0, v1

    sput-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->o:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static a(ILjava/security/cert/X509Certificate;)I
    .locals 1

    .prologue
    .line 2301
    invoke-static {p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 2303
    add-int/lit8 p0, p0, -0x1

    .line 2305
    :cond_0
    return p0
.end method

.method protected static a(Ljava/security/cert/CertPath;II)I
    .locals 3

    .prologue
    .line 1537
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 1538
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1542
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1556
    if-eqz v0, :cond_1

    .line 1558
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v0

    .line 1560
    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1565
    :try_start_1
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    .line 1566
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    if-nez v2, :cond_0

    .line 1568
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lorg/spongycastle/asn1/DERInteger;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 1569
    if-ge v0, p2, :cond_1

    move p2, v0

    .line 1583
    :cond_1
    return p2

    .line 1548
    :catch_0
    move-exception v0

    .line 1550
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1576
    :catch_1
    move-exception v0

    .line 1578
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension contents cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static a(Ljava/security/cert/X509CRL;Ljava/util/Set;)Ljava/security/PublicKey;
    .locals 3

    .prologue
    .line 572
    const/4 v0, 0x0

    .line 573
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 575
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/PublicKey;

    .line 578
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CRL;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 579
    return-object v0

    .line 586
    :cond_0
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot verify CRL."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 581
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected static a(Ljava/util/Set;Ljava/security/PublicKey;)Ljava/security/cert/X509CRL;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 594
    .line 596
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v0, v1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 598
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CRL;

    .line 601
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/security/cert/X509CRL;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 614
    :goto_1
    return-object v0

    .line 610
    :cond_0
    if-eqz v0, :cond_1

    .line 612
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot verify delta CRL."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    move-object v0, v1

    .line 614
    goto :goto_1

    .line 604
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/List;)Ljava/util/Set;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 446
    new-instance v0, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v0}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 449
    :try_start_0
    invoke-static {p0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    .line 450
    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubject([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 462
    :try_start_1
    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v1

    .line 463
    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 464
    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->getCertStores()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 471
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 473
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 475
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 476
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 478
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 480
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 486
    invoke-virtual {v1, p1}, Ljava/security/cert/X509Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 488
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 489
    invoke-interface {v5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 452
    :catch_0
    move-exception v0

    .line 454
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Subject criteria for certificate selector to find issuer certificate for CRL could not be set."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 466
    :catch_1
    move-exception v0

    .line 468
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuer certificate for CRL cannot be searched."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 494
    :cond_0
    :try_start_2
    const-string v0, "PKIX"

    sget-object v6, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v6}, Ljava/security/cert/CertPathBuilder;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathBuilder;

    move-result-object v6

    .line 495
    new-instance v7, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v7}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 496
    invoke-virtual {v7, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setCertificate(Ljava/security/cert/X509Certificate;)V

    .line 497
    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    .line 498
    invoke-virtual {v0, v7}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->setTargetCertConstraints(Ljava/security/cert/CertSelector;)V

    .line 499
    invoke-static {v0}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b(Ljava/security/cert/PKIXParameters;)Lorg/spongycastle/x509/ExtendedPKIXParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    .line 510
    invoke-interface {p4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 512
    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->setRevocationEnabled(Z)V

    .line 518
    :goto_1
    invoke-virtual {v6, v0}, Ljava/security/cert/CertPathBuilder;->build(Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathBuilderResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/cert/CertPathBuilderResult;->getCertPath()Ljava/security/cert/CertPath;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 519
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 520
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/List;I)Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/security/cert/CertPathBuilderException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_0

    .line 522
    :catch_2
    move-exception v0

    .line 524
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Internal error."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 516
    :cond_1
    const/4 v7, 0x1

    :try_start_3
    invoke-virtual {v0, v7}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->setRevocationEnabled(Z)V
    :try_end_3
    .catch Ljava/security/cert/CertPathBuilderException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_1

    .line 526
    :catch_3
    move-exception v0

    .line 528
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Public key of issuer certificate of CRL could not be retrieved."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 530
    :catch_4
    move-exception v0

    .line 532
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 534
    :cond_2
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 538
    const/4 v1, 0x0

    .line 539
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 541
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 542
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    .line 544
    if-eqz v0, :cond_4

    array-length v6, v0

    const/4 v7, 0x7

    if-lt v6, v7, :cond_3

    const/4 v6, 0x6

    aget-boolean v0, v0, v6

    if-nez v0, :cond_4

    .line 546
    :cond_3
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Issuer certificate key usage extension does not permit CRL signing."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    .line 539
    :goto_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_2

    .line 551
    :cond_4
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    goto :goto_3

    .line 555
    :cond_5
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez v1, :cond_6

    .line 557
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Cannot find a valid issuer certificate."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 559
    :cond_6
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz v1, :cond_7

    .line 561
    throw v1

    .line 564
    :cond_7
    return-object v3
.end method

.method protected static a(Ljava/security/cert/CertPath;ILjava/util/Set;Lorg/spongycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;I)Lorg/spongycastle/jce/provider/PKIXPolicyNode;
    .locals 13

    .prologue
    .line 1256
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v2

    .line 1257
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/security/cert/X509Certificate;

    .line 1258
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    .line 1260
    sub-int v3, v1, p1

    .line 1265
    :try_start_0
    sget-object v2, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-static {v9, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 1276
    if-eqz v2, :cond_10

    if-eqz p3, :cond_10

    .line 1281
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v4

    .line 1282
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 1284
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 1286
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lorg/spongycastle/asn1/x509/PolicyInformation;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/PolicyInformation;

    move-result-object v6

    .line 1287
    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/PolicyInformation;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v7

    .line 1289
    invoke-virtual {v7}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1291
    const-string v8, "2.5.29.32.0"

    invoke-virtual {v7}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 1293
    :try_start_1
    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/PolicyInformation;->d()Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v6

    invoke-static {v6}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/ASN1Sequence;)Ljava/util/Set;
    :try_end_1
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v6

    .line 1304
    move-object/from16 v0, p4

    invoke-static {v3, v0, v7, v6}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(I[Ljava/util/List;Lorg/spongycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)Z

    move-result v8

    .line 1306
    if-nez v8, :cond_0

    .line 1308
    move-object/from16 v0, p4

    invoke-static {v3, v0, v7, v6}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(I[Ljava/util/List;Lorg/spongycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)V

    goto :goto_0

    .line 1271
    :catch_0
    move-exception v1

    .line 1273
    new-instance v2, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v3, "Could not read certificate policies extension from certificate."

    invoke-direct {v2, v3, v1, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    .line 1298
    :catch_1
    move-exception v1

    .line 1300
    new-instance v2, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v3, "Policy qualifier info set could not be build."

    invoke-direct {v2, v3, v1, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    .line 1313
    :cond_1
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "2.5.29.32.0"

    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 1315
    :cond_2
    invoke-interface {p2}, Ljava/util/Set;->clear()V

    .line 1316
    invoke-interface {p2, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1339
    :goto_1
    if-gtz p5, :cond_3

    if-ge v3, v1, :cond_c

    invoke-static {v9}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1341
    :cond_3
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v1

    .line 1343
    :cond_4
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 1345
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/PolicyInformation;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/PolicyInformation;

    move-result-object v2

    .line 1347
    const-string v4, "2.5.29.32.0"

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/PolicyInformation;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    invoke-virtual {v5}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1349
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/PolicyInformation;->d()Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/ASN1Sequence;)Ljava/util/Set;

    move-result-object v6

    .line 1350
    add-int/lit8 v1, v3, -0x1

    aget-object v11, p4, v1

    .line 1352
    const/4 v1, 0x0

    move v10, v1

    :goto_2
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v1

    if-ge v10, v1, :cond_c

    .line 1354
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 1356
    invoke-virtual {v5}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getExpectedPolicies()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 1357
    :cond_5
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 1359
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1362
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_9

    .line 1364
    check-cast v1, Ljava/lang/String;

    move-object v7, v1

    .line 1375
    :goto_4
    const/4 v2, 0x0

    .line 1376
    invoke-virtual {v5}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v4

    .line 1378
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 1380
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 1382
    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 1384
    const/4 v1, 0x1

    :goto_6
    move v2, v1

    .line 1386
    goto :goto_5

    .line 1320
    :cond_6
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 1321
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 1323
    :cond_7
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 1325
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 1327
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 1329
    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 1332
    :cond_8
    invoke-interface {p2}, Ljava/util/Set;->clear()V

    .line 1333
    invoke-interface {p2, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_1

    .line 1366
    :cond_9
    instance-of v2, v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    if-eqz v2, :cond_5

    .line 1368
    check-cast v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    .line 1388
    :cond_a
    if-nez v2, :cond_5

    .line 1390
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 1391
    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1393
    new-instance v1, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    .line 1395
    invoke-virtual {v5, v1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    .line 1396
    aget-object v2, p4, v3

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1352
    :cond_b
    add-int/lit8 v1, v10, 0x1

    move v10, v1

    goto/16 :goto_2

    .line 1409
    :cond_c
    add-int/lit8 v1, v3, -0x1

    move v5, v1

    move-object/from16 v2, p3

    :goto_8
    if-ltz v5, :cond_f

    .line 1411
    aget-object v6, p4, v5

    .line 1413
    const/4 v1, 0x0

    move v4, v1

    :goto_9
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_d

    .line 1415
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 1416
    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v7

    if-nez v7, :cond_12

    .line 1418
    move-object/from16 v0, p4

    invoke-static {v2, v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    move-result-object v1

    .line 1420
    if-eqz v1, :cond_e

    .line 1422
    :goto_a
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-object v2, v1

    goto :goto_9

    :cond_d
    move-object v1, v2

    .line 1409
    :cond_e
    add-int/lit8 v2, v5, -0x1

    move v5, v2

    move-object v2, v1

    goto :goto_8

    .line 1431
    :cond_f
    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v1

    .line 1433
    if-eqz v1, :cond_11

    .line 1435
    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    .line 1437
    aget-object v5, p4, v3

    .line 1438
    const/4 v1, 0x0

    move v3, v1

    :goto_b
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_11

    .line 1440
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 1441
    invoke-virtual {v1, v4}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a(Z)V

    .line 1438
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_b

    .line 1446
    :cond_10
    const/4 v2, 0x0

    :cond_11
    return-object v2

    :cond_12
    move-object v1, v2

    goto :goto_a

    :cond_13
    move v1, v2

    goto/16 :goto_6
.end method

.method protected static a(Ljava/security/cert/CertPath;ILorg/spongycastle/jce/provider/PKIXPolicyNode;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;
    .locals 3

    .prologue
    .line 1126
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 1127
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1131
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1142
    if-nez v0, :cond_0

    .line 1144
    const/4 p2, 0x0

    .line 1146
    :cond_0
    return-object p2

    .line 1137
    :catch_0
    move-exception v0

    .line 1139
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Could not read certificate policies extension from certificate."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static a(Ljava/security/cert/CertPath;I[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;I)Lorg/spongycastle/jce/provider/PKIXPolicyNode;
    .locals 12

    .prologue
    .line 866
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v1

    .line 867
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/security/cert/X509Certificate;

    .line 868
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    .line 870
    sub-int v2, v0, p1

    .line 873
    :try_start_0
    sget-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    invoke-static {v8, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 884
    if-eqz v4, :cond_f

    .line 887
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 889
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 891
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 893
    invoke-virtual {v4, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 894
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    .line 895
    const/4 v6, 0x1

    invoke-virtual {v0, v6}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v6

    .line 898
    invoke-interface {v10, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 900
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 901
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 902
    invoke-interface {v10, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 903
    invoke-interface {v5, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 891
    :goto_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 879
    :catch_0
    move-exception v0

    .line 881
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy mappings extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 907
    :cond_0
    invoke-interface {v10, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 908
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 912
    :cond_1
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v9, p3

    .line 913
    :cond_2
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 915
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 920
    if-lez p4, :cond_8

    .line 922
    const/4 v1, 0x0

    .line 923
    aget-object v0, p2, v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 924
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 926
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 927
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 929
    const/4 v3, 0x1

    .line 930
    invoke-interface {v10, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iput-object v1, v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->c:Ljava/util/Set;

    move v0, v3

    .line 935
    :goto_3
    if-nez v0, :cond_2

    .line 937
    aget-object v0, p2, v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 938
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 940
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 941
    const-string v0, "2.5.29.32.0"

    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 943
    const/4 v5, 0x0

    .line 944
    :try_start_1
    sget-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-static {v8, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 955
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v0

    .line 956
    :cond_5
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 958
    :try_start_2
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/asn1/x509/PolicyInformation;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/PolicyInformation;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    .line 968
    const-string v4, "2.5.29.32.0"

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/PolicyInformation;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v7

    invoke-virtual {v7}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 972
    :try_start_3
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/PolicyInformation;->d()Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/ASN1Sequence;)Ljava/util/Set;
    :try_end_3
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v5

    .line 985
    :cond_6
    const/4 v7, 0x0

    .line 986
    invoke-virtual {v8}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 988
    invoke-virtual {v8}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    sget-object v3, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    .line 992
    :cond_7
    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getParent()Ljava/security/cert/PolicyNode;

    move-result-object v4

    check-cast v4, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 993
    const-string v0, "2.5.29.32.0"

    invoke-virtual {v4}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 995
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-direct/range {v0 .. v7}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    .line 997
    invoke-virtual {v4, v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    .line 998
    aget-object v1, p2, v2

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 950
    :catch_1
    move-exception v0

    .line 952
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Certificate policies extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 963
    :catch_2
    move-exception v0

    .line 965
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Policy information could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 975
    :catch_3
    move-exception v0

    .line 978
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy qualifier info set could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1009
    :cond_8
    if-gtz p4, :cond_d

    .line 1011
    aget-object v0, p2, v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v3, v9

    .line 1012
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1014
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 1015
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 1017
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getParent()Ljava/security/cert/PolicyNode;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 1018
    invoke-virtual {v1, v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->b(Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    .line 1019
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 1020
    add-int/lit8 v0, v2, -0x1

    move v4, v0

    move-object v1, v3

    :goto_5
    if-ltz v4, :cond_c

    .line 1022
    aget-object v7, p2, v4

    .line 1023
    const/4 v0, 0x0

    move-object v3, v1

    move v1, v0

    :goto_6
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_a

    .line 1025
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 1026
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v9

    if-nez v9, :cond_9

    .line 1028
    invoke-static {v3, p2, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    move-result-object v3

    .line 1030
    if-eqz v3, :cond_a

    .line 1032
    :cond_9
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    .line 1020
    :cond_a
    add-int/lit8 v0, v4, -0x1

    move v4, v0

    move-object v1, v3

    goto :goto_5

    :cond_b
    move-object v1, v3

    :cond_c
    move-object v3, v1

    .line 1038
    goto :goto_4

    :cond_d
    move-object v3, v9

    :cond_e
    move-object v9, v3

    .line 1040
    goto/16 :goto_2

    :cond_f
    move-object v9, p3

    .line 1042
    :cond_10
    return-object v9

    :cond_11
    move v0, v1

    goto/16 :goto_3
.end method

.method protected static a(Ljava/security/cert/CertPath;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Set;I[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;Ljava/util/Set;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;
    .locals 9

    .prologue
    .line 2402
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 2411
    if-nez p5, :cond_2

    .line 2413
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->isExplicitPolicyRequired()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2415
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Explicit policy requested but none available."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p3}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 2418
    :cond_0
    const/4 p5, 0x0

    .line 2566
    :cond_1
    :goto_0
    return-object p5

    .line 2420
    :cond_2
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Set;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2423
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->isExplicitPolicyRequired()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2425
    invoke-interface {p6}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2427
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Explicit policy requested but none available."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p3}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 2432
    :cond_3
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 2434
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    array-length v0, p4

    if-ge v2, v0, :cond_6

    .line 2436
    aget-object v5, p4, v2

    .line 2438
    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 2440
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 2442
    const-string v6, "2.5.29.32.0"

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 2444
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v0

    .line 2445
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 2447
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 2438
    :cond_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 2434
    :cond_5
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 2453
    :cond_6
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 2454
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2456
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 2457
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v0

    .line 2459
    invoke-interface {p6, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    goto :goto_4

    .line 2466
    :cond_7
    if-eqz p5, :cond_1

    .line 2468
    add-int/lit8 v0, v3, -0x1

    move-object v1, p5

    move v3, v0

    :goto_5
    if-ltz v3, :cond_15

    .line 2470
    aget-object v4, p4, v3

    .line 2472
    const/4 v0, 0x0

    move-object v2, v1

    move v1, v0

    :goto_6
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_9

    .line 2474
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 2475
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v5

    if-nez v5, :cond_8

    .line 2477
    invoke-static {v2, p4, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    move-result-object v2

    .line 2472
    :cond_8
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    .line 2468
    :cond_9
    add-int/lit8 v0, v3, -0x1

    move-object v1, v2

    move v3, v0

    goto :goto_5

    .line 2503
    :cond_a
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 2505
    const/4 v0, 0x0

    move v2, v0

    :goto_7
    array-length v0, p4

    if-ge v2, v0, :cond_e

    .line 2507
    aget-object v5, p4, v2

    .line 2509
    const/4 v0, 0x0

    move v1, v0

    :goto_8
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_d

    .line 2511
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 2513
    const-string v6, "2.5.29.32.0"

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 2515
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v6

    .line 2516
    :cond_b
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2518
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 2519
    const-string v7, "2.5.29.32.0"

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    .line 2521
    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 2509
    :cond_c
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_8

    .line 2505
    :cond_d
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_7

    .line 2531
    :cond_e
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 2532
    :cond_f
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 2534
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 2535
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v2

    .line 2537
    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    .line 2539
    invoke-static {p5, p4, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    move-result-object p5

    goto :goto_a

    .line 2546
    :cond_10
    if-eqz p5, :cond_13

    .line 2548
    add-int/lit8 v0, v3, -0x1

    move-object v1, p5

    move v3, v0

    :goto_b
    if-ltz v3, :cond_14

    .line 2550
    aget-object v4, p4, v3

    .line 2552
    const/4 v0, 0x0

    move-object v2, v1

    move v1, v0

    :goto_c
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_12

    .line 2554
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 2555
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v5

    if-nez v5, :cond_11

    .line 2557
    invoke-static {v2, p4, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    move-result-object v2

    .line 2552
    :cond_11
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_c

    .line 2548
    :cond_12
    add-int/lit8 v0, v3, -0x1

    move-object v1, v2

    move v3, v0

    goto :goto_b

    :cond_13
    move-object v1, p5

    :cond_14
    move-object p5, v1

    .line 2564
    goto/16 :goto_0

    :cond_15
    move-object p5, v1

    goto/16 :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;Lorg/spongycastle/asn1/x509/DistributionPoint;)Lorg/spongycastle/jce/provider/f;
    .locals 3

    .prologue
    .line 349
    :try_start_0
    sget-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p0, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 360
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->h()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/DistributionPoint;->d()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 362
    new-instance v0, Lorg/spongycastle/jce/provider/f;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/DistributionPoint;->d()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/f;-><init>(Lorg/spongycastle/asn1/x509/ReasonFlags;)V

    new-instance v1, Lorg/spongycastle/jce/provider/f;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->h()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/f;-><init>(Lorg/spongycastle/asn1/x509/ReasonFlags;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/jce/provider/f;->b(Lorg/spongycastle/jce/provider/f;)Lorg/spongycastle/jce/provider/f;

    move-result-object v0

    .line 370
    :goto_0
    return-object v0

    .line 355
    :catch_0
    move-exception v0

    .line 357
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension could not be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 365
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->h()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/DistributionPoint;->d()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-nez v0, :cond_2

    .line 367
    sget-object v0, Lorg/spongycastle/jce/provider/f;->a:Lorg/spongycastle/jce/provider/f;

    goto :goto_0

    .line 370
    :cond_2
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/DistributionPoint;->d()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lorg/spongycastle/jce/provider/f;->a:Lorg/spongycastle/jce/provider/f;

    move-object v1, v0

    :goto_1
    if-nez v2, :cond_4

    sget-object v0, Lorg/spongycastle/jce/provider/f;->a:Lorg/spongycastle/jce/provider/f;

    :goto_2
    invoke-virtual {v1, v0}, Lorg/spongycastle/jce/provider/f;->b(Lorg/spongycastle/jce/provider/f;)Lorg/spongycastle/jce/provider/f;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance v0, Lorg/spongycastle/jce/provider/f;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/DistributionPoint;->d()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/f;-><init>(Lorg/spongycastle/asn1/x509/ReasonFlags;)V

    move-object v1, v0

    goto :goto_1

    :cond_4
    new-instance v0, Lorg/spongycastle/jce/provider/f;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->h()Lorg/spongycastle/asn1/x509/ReasonFlags;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/spongycastle/jce/provider/f;-><init>(Lorg/spongycastle/asn1/x509/ReasonFlags;)V

    goto :goto_2
.end method

.method protected static a(Ljava/security/cert/CertPath;I)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 1050
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 1051
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1056
    :try_start_0
    sget-object v2, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 1067
    if-eqz v2, :cond_2

    move v0, v1

    .line 1069
    :goto_0
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1073
    :try_start_1
    invoke-virtual {v2, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    .line 1079
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    .line 1080
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 1088
    const-string v4, "2.5.29.32.0"

    invoke-virtual {v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1091
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "IssuerDomainPolicy is anyPolicy"

    invoke-direct {v0, v1, v5, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 1062
    :catch_0
    move-exception v0

    .line 1064
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy mappings extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1082
    :catch_1
    move-exception v0

    .line 1084
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy mappings extension contents could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1094
    :cond_0
    const-string v3, "2.5.29.32.0"

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1097
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "SubjectDomainPolicy is anyPolicy,"

    invoke-direct {v0, v1, v5, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 1071
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1101
    :cond_2
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILjava/util/List;Ljava/util/Set;)V
    .locals 3

    .prologue
    .line 2368
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2369
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2371
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 2372
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2376
    :try_start_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/PKIXCertPathChecker;

    invoke-virtual {v1, v0, p3}, Ljava/security/cert/PKIXCertPathChecker;->check(Ljava/security/cert/Certificate;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2378
    :catch_0
    move-exception v0

    .line 2380
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Additional certificate path checker failed."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 2385
    :cond_0
    invoke-interface {p3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2387
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Certificate has unsupported critical extension"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 2390
    :cond_1
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILjava/util/Set;Ljava/util/List;)V
    .locals 3

    .prologue
    .line 2185
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2186
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2192
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 2193
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2197
    :try_start_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/PKIXCertPathChecker;

    invoke-virtual {v1, v0, p2}, Ljava/security/cert/PKIXCertPathChecker;->check(Ljava/security/cert/Certificate;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2199
    :catch_0
    move-exception v0

    .line 2201
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    invoke-virtual {v0}, Ljava/security/cert/CertPathValidatorException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/security/cert/CertPathValidatorException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 2204
    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2206
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Certificate has unsupported critical extension."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 2209
    :cond_1
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILorg/spongycastle/jce/provider/PKIXNameConstraintValidator;)V
    .locals 4

    .prologue
    .line 1155
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v1

    .line 1156
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1157
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 1159
    sub-int v2, v1, p1

    .line 1163
    invoke-static {v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-lt v2, v1, :cond_2

    .line 1165
    :cond_0
    invoke-static {v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    .line 1166
    new-instance v2, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 1171
    :try_start_0
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 1181
    :try_start_1
    invoke-virtual {p2, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;)V

    .line 1182
    invoke-virtual {p2, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Lorg/spongycastle/asn1/ASN1Sequence;)V
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException; {:try_start_1 .. :try_end_1} :catch_2

    .line 1190
    :try_start_2
    sget-object v2, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->j:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v2

    .line 1201
    new-instance v0, Lorg/spongycastle/asn1/x509/X509Name;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/X509Name;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    sget-object v1, Lorg/spongycastle/asn1/x509/X509Name;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/X509Name;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Ljava/util/Vector;

    move-result-object v0

    .line 1202
    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1204
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1205
    new-instance v3, Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v3, v0}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(Ljava/lang/String;)V

    .line 1208
    :try_start_3
    invoke-virtual {p2, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/x509/GeneralName;)V

    .line 1209
    invoke-virtual {p2, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Lorg/spongycastle/asn1/x509/GeneralName;)V
    :try_end_3
    .catch Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    .line 1211
    :catch_0
    move-exception v0

    .line 1213
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subtree check for certificate subject alternative email failed."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1173
    :catch_1
    move-exception v0

    .line 1175
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Exception extracting subject name when checking subtrees."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1184
    :catch_2
    move-exception v0

    .line 1186
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subtree check for certificate subject failed."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1196
    :catch_3
    move-exception v0

    .line 1198
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subject alternative name extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1216
    :cond_1
    if-eqz v2, :cond_2

    .line 1219
    :try_start_4
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v1

    .line 1229
    const/4 v0, 0x0

    :goto_1
    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 1234
    :try_start_5
    aget-object v2, v1, v0

    invoke-virtual {p2, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/x509/GeneralName;)V

    .line 1235
    aget-object v2, v1, v0

    invoke-virtual {p2, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Lorg/spongycastle/asn1/x509/GeneralName;)V
    :try_end_5
    .catch Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException; {:try_start_5 .. :try_end_5} :catch_5

    .line 1229
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1224
    :catch_4
    move-exception v0

    .line 1226
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subject alternative name contents could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1237
    :catch_5
    move-exception v0

    .line 1239
    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subtree check for certificate subject alternative name failed."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1245
    :cond_2
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILorg/spongycastle/jce/provider/PKIXPolicyNode;I)V
    .locals 3

    .prologue
    .line 1113
    if-gtz p3, :cond_0

    if-nez p2, :cond_0

    .line 1115
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "No valid policy tree found when one expected."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 1118
    :cond_0
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;Lorg/spongycastle/x509/ExtendedPKIXParameters;ILjava/security/PublicKey;ZLjavax/security/auth/x500/X500Principal;Ljava/security/cert/X509Certificate;)V
    .locals 6

    .prologue
    .line 1459
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v5

    .line 1460
    invoke-interface {v5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 1464
    if-nez p4, :cond_0

    .line 1470
    :try_start_0
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->getSigProvider()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, p3, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1483
    :cond_0
    :try_start_1
    invoke-static {p1, p0, p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/CertPath;I)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/cert/X509Certificate;->checkValidity(Ljava/util/Date;)V
    :try_end_1
    .catch Ljava/security/cert/CertificateExpiredException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/cert/CertificateNotYetValidException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_3

    .line 1502
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->isRevocationEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1506
    :try_start_2
    invoke-static {p1, p0, p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/CertPath;I)Ljava/util/Date;

    move-result-object v2

    move-object v0, p1

    move-object v3, p6

    move-object v4, p3

    invoke-static/range {v0 .. v5}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/util/List;)V
    :try_end_2
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_2 .. :try_end_2} :catch_4

    .line 1523
    :cond_1
    invoke-static {v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1525
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IssuerName("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") does not match SubjectName("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") of signing certificate."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p2}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 1473
    :catch_0
    move-exception v0

    .line 1475
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Could not validate certificate signature."

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1486
    :catch_1
    move-exception v0

    .line 1488
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not validate certificate: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/cert/CertificateExpiredException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1490
    :catch_2
    move-exception v0

    .line 1492
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not validate certificate: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/cert/CertificateNotYetValidException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1494
    :catch_3
    move-exception v0

    .line 1496
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Could not validate time of certificate."

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1509
    :catch_4
    move-exception v1

    .line 1512
    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/AnnotatedException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1514
    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/AnnotatedException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 1516
    :goto_0
    new-instance v2, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/AnnotatedException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0, p0, p2}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    .line 1529
    :cond_2
    return-void

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509CRL;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 731
    if-nez p0, :cond_1

    .line 829
    :cond_0
    return-void

    .line 735
    :cond_1
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p1, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 746
    invoke-virtual {p2}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 749
    invoke-virtual {p0}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 751
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Complete CRL issuer does not match delta CRL issuer."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 741
    :catch_0
    move-exception v0

    .line 743
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension could not be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 755
    :cond_2
    :try_start_1
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    .line 767
    const/4 v1, 0x0

    .line 768
    if-nez v2, :cond_4

    .line 770
    if-nez v3, :cond_5

    .line 782
    :cond_3
    :goto_0
    if-nez v0, :cond_6

    .line 784
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Issuing distribution point extension from delta CRL and complete CRL does not match."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 761
    :catch_1
    move-exception v0

    .line 763
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension from delta CRL could not be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 777
    :cond_4
    invoke-virtual {v2, v3}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_5
    move v0, v1

    goto :goto_0

    .line 789
    :cond_6
    :try_start_2
    sget-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->l:Ljava/lang/String;

    invoke-static {p1, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_2
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 801
    :try_start_3
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->l:Ljava/lang/String;

    invoke-static {p0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_3
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v1

    .line 813
    if-nez v0, :cond_7

    .line 815
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "CRL authority key identifier is null."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 795
    :catch_2
    move-exception v0

    .line 797
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Authority key identifier extension could not be extracted from complete CRL."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 807
    :catch_3
    move-exception v0

    .line 809
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Authority key identifier extension could not be extracted from delta CRL."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 818
    :cond_7
    if-nez v1, :cond_8

    .line 820
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Delta CRL authority key identifier is null."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 823
    :cond_8
    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 825
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Delta CRL authority key identifier does not match complete CRL authority key identifier."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;)V
    .locals 2

    .prologue
    .line 852
    iget v0, p3, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 854
    invoke-static {p0, p1, p2, p3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;)V

    .line 856
    :cond_0
    return-void
.end method

.method protected static a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 1

    .prologue
    .line 839
    invoke-virtual {p4}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 841
    invoke-static {p0, p1, p2, p3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;)V

    .line 843
    :cond_0
    return-void
.end method

.method protected static a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V
    .locals 12

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 101
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p2, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 113
    if-eqz v6, :cond_12

    .line 115
    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->g()Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 118
    invoke-static {v6}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->g()Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v3

    .line 119
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 121
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->c()I

    move-result v1

    if-nez v1, :cond_0

    .line 123
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v4

    move v1, v2

    .line 124
    :goto_0
    array-length v8, v4

    if-ge v1, v8, :cond_0

    .line 126
    aget-object v8, v4, v1

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 107
    :catch_0
    move-exception v1

    .line 109
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Issuing distribution point extension could not be decoded."

    invoke-direct {v2, v3, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 129
    :cond_0
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->c()I

    move-result v1

    if-ne v1, v5, :cond_2

    .line 131
    new-instance v4, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 134
    :try_start_1
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v8

    .line 137
    :goto_1
    invoke-interface {v8}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 139
    invoke-interface {v8}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v4, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 142
    :catch_1
    move-exception v1

    .line 144
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Could not read CRL issuer."

    invoke-direct {v2, v3, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 146
    :cond_1
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-virtual {v4, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 147
    new-instance v1, Lorg/spongycastle/asn1/x509/GeneralName;

    new-instance v3, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v3, v4}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-static {v3}, Lorg/spongycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/X509Name;

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(Lorg/spongycastle/asn1/x509/X509Name;)V

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    :cond_2
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->c()Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 154
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->c()Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v8

    .line 155
    const/4 v1, 0x0

    .line 156
    invoke-virtual {v8}, Lorg/spongycastle/asn1/x509/DistributionPointName;->c()I

    move-result v3

    if-nez v3, :cond_3

    .line 158
    invoke-virtual {v8}, Lorg/spongycastle/asn1/x509/DistributionPointName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v1

    .line 160
    :cond_3
    invoke-virtual {v8}, Lorg/spongycastle/asn1/x509/DistributionPointName;->c()I

    move-result v3

    if-ne v3, v5, :cond_6

    .line 162
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 164
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v1

    move-object v3, v1

    :goto_2
    move v4, v2

    .line 180
    :goto_3
    array-length v1, v3

    if-ge v4, v1, :cond_7

    .line 182
    aget-object v1, v3, v4

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-interface {v1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v9

    .line 183
    new-instance v10, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v10}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 184
    :goto_4
    invoke-interface {v9}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 186
    invoke-interface {v9}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v10, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_4

    .line 168
    :cond_4
    new-array v3, v5, [Lorg/spongycastle/asn1/x509/GeneralName;

    .line 171
    const/4 v4, 0x0

    :try_start_2
    new-instance v9, Lorg/spongycastle/asn1/x509/GeneralName;

    new-instance v10, Lorg/spongycastle/asn1/x509/X509Name;

    invoke-static {p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v10, v1}, Lorg/spongycastle/asn1/x509/X509Name;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    invoke-direct {v9, v10}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(Lorg/spongycastle/asn1/x509/X509Name;)V

    aput-object v9, v3, v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    .line 175
    :catch_2
    move-exception v1

    .line 177
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Could not read certificate issuer."

    invoke-direct {v2, v3, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 188
    :cond_5
    invoke-virtual {v8}, Lorg/spongycastle/asn1/x509/DistributionPointName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-virtual {v10, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 189
    new-instance v1, Lorg/spongycastle/asn1/x509/GeneralName;

    new-instance v9, Lorg/spongycastle/asn1/x509/X509Name;

    new-instance v11, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v11, v10}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v9, v11}, Lorg/spongycastle/asn1/x509/X509Name;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    invoke-direct {v1, v9}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(Lorg/spongycastle/asn1/x509/X509Name;)V

    aput-object v1, v3, v4

    .line 180
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_3

    :cond_6
    move-object v3, v1

    .line 192
    :cond_7
    if-eqz v3, :cond_8

    move v1, v2

    .line 194
    :goto_5
    array-length v4, v3

    if-ge v1, v4, :cond_8

    .line 196
    aget-object v4, v3, v1

    invoke-interface {v7, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move v2, v5

    .line 203
    :cond_8
    if-nez v2, :cond_e

    .line 205
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 194
    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 214
    :cond_a
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    if-nez v1, :cond_b

    .line 216
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint."

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 219
    :cond_b
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v3

    move v1, v2

    .line 220
    :goto_6
    array-length v4, v3

    if-ge v1, v4, :cond_c

    .line 222
    aget-object v4, v3, v1

    invoke-interface {v7, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    move v2, v5

    .line 228
    :cond_c
    if-nez v2, :cond_e

    .line 230
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 220
    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 235
    :cond_e
    :try_start_3
    move-object v0, p1

    check-cast v0, Ljava/security/cert/X509Extension;

    move-object v1, v0

    sget-object v2, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/BasicConstraints;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v1

    .line 246
    instance-of v2, p1, Ljava/security/cert/X509Certificate;

    if-eqz v2, :cond_11

    .line 249
    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->c()Z

    move-result v2

    if-eqz v2, :cond_f

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/BasicConstraints;->c()Z

    move-result v2

    if-eqz v2, :cond_f

    .line 251
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "CA Cert CRL only contains user certificates."

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 241
    :catch_3
    move-exception v1

    .line 243
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Basic constraints extension could not be decoded."

    invoke-direct {v2, v3, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 255
    :cond_f
    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->d()Z

    move-result v2

    if-eqz v2, :cond_11

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/BasicConstraints;->c()Z

    move-result v1

    if-nez v1, :cond_11

    .line 257
    :cond_10
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "End CRL only contains CA certificates."

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 262
    :cond_11
    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->f()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 264
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "onlyContainsAttributeCerts boolean is asserted."

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 267
    :cond_12
    return-void
.end method

.method private static a(Lorg/spongycastle/asn1/x509/DistributionPoint;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/jce/provider/f;Ljava/util/List;)V
    .locals 16

    .prologue
    .line 1740
    new-instance v8, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v8, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 1741
    invoke-virtual/range {p3 .. p3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    .line 1743
    new-instance v4, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v5, "Validation time is in future."

    invoke-direct {v4, v5}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1754
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    invoke-static {v0, v1, v8, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/util/Date;Lorg/spongycastle/x509/ExtendedPKIXParameters;)Ljava/util/Set;

    move-result-object v6

    .line 1755
    const/4 v5, 0x0

    .line 1756
    const/4 v4, 0x0

    .line 1757
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v6, v5

    move-object v5, v4

    .line 1759
    :cond_1
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v0, p6

    iget v4, v0, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v7, 0xb

    if-ne v4, v7, :cond_7

    invoke-virtual/range {p7 .. p7}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v4

    if-nez v4, :cond_7

    .line 1763
    :try_start_0
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/X509CRL;

    .line 1766
    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Lorg/spongycastle/asn1/x509/DistributionPoint;)Lorg/spongycastle/jce/provider/f;

    move-result-object v10

    .line 1774
    move-object/from16 v0, p7

    invoke-virtual {v10, v0}, Lorg/spongycastle/jce/provider/f;->c(Lorg/spongycastle/jce/provider/f;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 1780
    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p1

    move-object/from16 v3, p8

    invoke-static {v4, v0, v1, v2, v3}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/List;)Ljava/util/Set;

    move-result-object v7

    .line 1783
    invoke-static {v4, v7}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/util/Set;)Ljava/security/PublicKey;

    move-result-object v11

    .line 1785
    const/4 v7, 0x0

    .line 1787
    invoke-virtual/range {p1 .. p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->c()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 1790
    move-object/from16 v0, p1

    invoke-static {v8, v0, v4}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Date;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509CRL;)Ljava/util/Set;

    move-result-object v7

    .line 1793
    invoke-static {v7, v11}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Set;Ljava/security/PublicKey;)Ljava/security/cert/X509CRL;

    move-result-object v7

    .line 1809
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->d()I

    move-result v11

    const/4 v12, 0x1

    if-eq v11, v12, :cond_3

    .line 1816
    invoke-virtual/range {p2 .. p2}, Ljava/security/cert/X509Certificate;->getNotAfter()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-virtual {v4}, Ljava/security/cert/X509CRL;->getThisUpdate()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    cmp-long v11, v12, v14

    if-gez v11, :cond_3

    .line 1818
    new-instance v4, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v5, "No valid CRL for current time found."

    invoke-direct {v4, v5}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1875
    :catch_0
    move-exception v4

    move-object v5, v4

    .line 1878
    goto :goto_0

    .line 1822
    :cond_3
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v1, v4}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->b(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V

    .line 1825
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v1, v4}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V

    .line 1828
    move-object/from16 v0, p1

    invoke-static {v7, v4, v0}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509CRL;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 1831
    move-object/from16 v0, p3

    move-object/from16 v1, p2

    move-object/from16 v2, p6

    move-object/from16 v3, p1

    invoke-static {v0, v7, v1, v2, v3}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 1834
    move-object/from16 v0, p3

    move-object/from16 v1, p2

    move-object/from16 v2, p6

    invoke-static {v0, v4, v1, v2}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;)V

    .line 1837
    move-object/from16 v0, p6

    iget v11, v0, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v12, 0x8

    if-ne v11, v12, :cond_4

    .line 1839
    const/16 v11, 0xb

    move-object/from16 v0, p6

    iput v11, v0, Lorg/spongycastle/jce/provider/c;->a:I

    .line 1843
    :cond_4
    move-object/from16 v0, p7

    invoke-virtual {v0, v10}, Lorg/spongycastle/jce/provider/f;->a(Lorg/spongycastle/jce/provider/f;)V

    .line 1845
    invoke-virtual {v4}, Ljava/security/cert/X509CRL;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v4

    .line 1846
    if-eqz v4, :cond_5

    .line 1848
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 1849
    sget-object v4, Lorg/spongycastle/asn1/x509/X509Extensions;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1850
    sget-object v4, Lorg/spongycastle/asn1/x509/X509Extensions;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1852
    invoke-interface {v10}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    .line 1854
    new-instance v4, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v5, "CRL contains unsupported critical extensions."

    invoke-direct {v4, v5}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1858
    :cond_5
    if-eqz v7, :cond_6

    .line 1860
    invoke-virtual {v7}, Ljava/security/cert/X509CRL;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v4

    .line 1861
    if-eqz v4, :cond_6

    .line 1863
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 1864
    sget-object v4, Lorg/spongycastle/asn1/x509/X509Extensions;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1865
    sget-object v4, Lorg/spongycastle/asn1/x509/X509Extensions;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1866
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    .line 1868
    new-instance v4, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v5, "Delta CRL contains unsupported critical extension."

    invoke-direct {v4, v5}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1873
    :cond_6
    const/4 v4, 0x1

    move v6, v4

    .line 1878
    goto/16 :goto_0

    .line 1880
    :cond_7
    if-nez v6, :cond_8

    .line 1882
    throw v5

    .line 1884
    :cond_8
    return-void
.end method

.method private static a(Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/util/List;)V
    .locals 13

    .prologue
    .line 1908
    const/4 v10, 0x0

    .line 1909
    :try_start_0
    sget-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->i:Ljava/lang/String;

    invoke-static {p1, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/CRLDistPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/CRLDistPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1921
    :try_start_1
    invoke-static {v0, p0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/x509/CRLDistPoint;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1928
    new-instance v6, Lorg/spongycastle/jce/provider/c;

    invoke-direct {v6}, Lorg/spongycastle/jce/provider/c;-><init>()V

    .line 1929
    new-instance v7, Lorg/spongycastle/jce/provider/f;

    invoke-direct {v7}, Lorg/spongycastle/jce/provider/f;-><init>()V

    .line 1931
    const/4 v9, 0x0

    .line 1933
    if-eqz v0, :cond_0

    .line 1935
    :try_start_2
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/CRLDistPoint;->c()[Lorg/spongycastle/asn1/x509/DistributionPoint;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v12

    .line 1944
    const/4 v0, 0x0

    move v11, v0

    :goto_0
    array-length v0, v12

    if-ge v11, v0, :cond_0

    iget v0, v6, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    invoke-virtual {v7}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1948
    invoke-virtual {p0}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    .line 1951
    :try_start_3
    aget-object v0, v12, v11

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v8, p5

    invoke-static/range {v0 .. v8}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/jce/provider/f;Ljava/util/List;)V
    :try_end_3
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1952
    const/4 v0, 0x1

    move-object v1, v10

    .line 1946
    :goto_1
    add-int/lit8 v2, v11, 0x1

    move v11, v2

    move v9, v0

    move-object v10, v1

    goto :goto_0

    .line 1915
    :catch_0
    move-exception v0

    .line 1917
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL distribution point extension could not be read."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1923
    :catch_1
    move-exception v0

    .line 1925
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "No additional CRL locations could be decoded from CRL distribution point extension."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1940
    :catch_2
    move-exception v0

    .line 1942
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Distribution points could not be read."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1954
    :catch_3
    move-exception v0

    move-object v1, v0

    move v0, v9

    goto :goto_1

    .line 1968
    :cond_0
    iget v0, v6, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    invoke-virtual {v7}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1977
    :try_start_4
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-static {p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_4 .. :try_end_4} :catch_5

    move-result-object v1

    .line 1987
    :try_start_5
    new-instance v0, Lorg/spongycastle/asn1/x509/DistributionPoint;

    new-instance v2, Lorg/spongycastle/asn1/x509/DistributionPointName;

    new-instance v3, Lorg/spongycastle/asn1/x509/GeneralNames;

    new-instance v4, Lorg/spongycastle/asn1/x509/GeneralName;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v1}, Lorg/spongycastle/asn1/x509/GeneralName;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-direct {v3, v4}, Lorg/spongycastle/asn1/x509/GeneralNames;-><init>(Lorg/spongycastle/asn1/x509/GeneralName;)V

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/x509/DistributionPointName;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/x509/DistributionPoint;-><init>(Lorg/spongycastle/asn1/x509/DistributionPointName;)V

    .line 1989
    invoke-virtual {p0}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v8, p5

    .line 1990
    invoke-static/range {v0 .. v8}, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/spongycastle/jce/provider/c;Lorg/spongycastle/jce/provider/f;Ljava/util/List;)V
    :try_end_5
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_5 .. :try_end_5} :catch_5

    .line 1992
    const/4 v9, 0x1

    .line 2000
    :cond_1
    :goto_2
    if-nez v9, :cond_3

    .line 2002
    instance-of v0, v10, Lorg/spongycastle/jce/provider/AnnotatedException;

    if-eqz v0, :cond_2

    .line 2004
    throw v10

    .line 1983
    :catch_4
    move-exception v0

    .line 1985
    :try_start_6
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuer from certificate for CRL could not be reencoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_6 .. :try_end_6} :catch_5

    .line 1994
    :catch_5
    move-exception v0

    move-object v10, v0

    goto :goto_2

    .line 2007
    :cond_2
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "No valid CRL found."

    invoke-direct {v0, v1, v10}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 2009
    :cond_3
    iget v0, v6, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_4

    .line 2011
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Certificate revocation after "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v6, Lorg/spongycastle/jce/provider/c;->b:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2012
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->o:[Ljava/lang/String;

    iget v2, v6, Lorg/spongycastle/jce/provider/c;->a:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2013
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    invoke-direct {v1, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2015
    :cond_4
    invoke-virtual {v7}, Lorg/spongycastle/jce/provider/f;->a()Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, v6, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_5

    .line 2017
    const/16 v0, 0xc

    iput v0, v6, Lorg/spongycastle/jce/provider/c;->a:I

    .line 2019
    :cond_5
    iget v0, v6, Lorg/spongycastle/jce/provider/c;->a:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_6

    .line 2021
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Certificate status could not be determined."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2023
    :cond_6
    return-void
.end method

.method protected static b(Ljava/security/cert/CertPath;II)I
    .locals 4

    .prologue
    .line 1592
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 1593
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1597
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1611
    if-eqz v0, :cond_1

    .line 1613
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v0

    .line 1615
    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1619
    :try_start_1
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    .line 1620
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 1622
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lorg/spongycastle/asn1/DERInteger;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 1623
    if-ge v0, p2, :cond_1

    move p2, v0

    .line 1637
    :cond_1
    return p2

    .line 1603
    :catch_0
    move-exception v0

    .line 1605
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1630
    :catch_1
    move-exception v0

    .line 1632
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension contents cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static b(Ljava/security/cert/CertPath;I)V
    .locals 3

    .prologue
    .line 2065
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2066
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2070
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/BasicConstraints;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2081
    if-eqz v0, :cond_0

    .line 2083
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/BasicConstraints;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2085
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Not a CA certificate"

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2076
    :catch_0
    move-exception v0

    .line 2078
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Basic constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 2090
    :cond_0
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Intermediate certificate lacks BasicConstraints"

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2092
    :cond_1
    return-void
.end method

.method protected static b(Ljava/security/cert/CertPath;ILorg/spongycastle/jce/provider/PKIXNameConstraintValidator;)V
    .locals 3

    .prologue
    .line 1646
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 1647
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1651
    const/4 v1, 0x0

    .line 1654
    :try_start_0
    sget-object v2, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->k:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    .line 1656
    if-eqz v0, :cond_2

    .line 1658
    invoke-static {v0}, Lorg/spongycastle/asn1/x509/NameConstraints;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/NameConstraints;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 1666
    :goto_0
    if-eqz v0, :cond_1

    .line 1672
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/NameConstraints;->c()Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    .line 1673
    if-eqz v1, :cond_0

    .line 1677
    :try_start_1
    invoke-virtual {p2, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/ASN1Sequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 1689
    :cond_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/NameConstraints;->d()Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    .line 1690
    if-eqz v0, :cond_1

    .line 1692
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v0

    .line 1695
    :goto_1
    :try_start_2
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1697
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralSubtree;

    move-result-object v1

    .line 1698
    invoke-virtual {p2, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/x509/GeneralSubtree;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 1701
    :catch_0
    move-exception v0

    .line 1703
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Excluded subtrees cannot be build from name constraints extension."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1661
    :catch_1
    move-exception v0

    .line 1663
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Name constraints extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1679
    :catch_2
    move-exception v0

    .line 1681
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Permitted subtrees cannot be build from name constraints extension."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 1708
    :cond_1
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method protected static b(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 288
    sget-object v0, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p2, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 290
    if-eqz v0, :cond_6

    .line 292
    invoke-static {v0}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/IssuingDistributionPoint;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    .line 297
    :goto_0
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v4

    .line 300
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 302
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v5

    move v3, v2

    .line 303
    :goto_1
    array-length v6, v5

    if-ge v3, v6, :cond_1

    .line 305
    aget-object v6, v5, v3

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v6

    const/4 v7, 0x4

    if-ne v6, v7, :cond_0

    .line 309
    :try_start_0
    aget-object v6, v5, v3

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v6

    invoke-interface {v6}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v6

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1Primitive;->b()[B

    move-result-object v6

    invoke-static {v6, v4}, Lorg/spongycastle/util/Arrays;->a([B[B)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-eqz v6, :cond_0

    move v2, v1

    .line 303
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 314
    :catch_0
    move-exception v0

    .line 316
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL issuer information from distribution point cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 321
    :cond_1
    if-eqz v2, :cond_2

    if-nez v0, :cond_2

    .line 323
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Distribution point contains cRLIssuer field but CRL is not indirect."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 325
    :cond_2
    if-nez v2, :cond_4

    .line 327
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "CRL issuer of CRL does not match CRL issuer of distribution point."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 332
    :cond_3
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-static {p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v2, v1

    .line 338
    :cond_4
    if-nez v2, :cond_5

    .line 340
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Cannot find matching CRL issuer for certificate."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 342
    :cond_5
    return-void

    :cond_6
    move v0, v2

    goto :goto_0
.end method

.method protected static c(Ljava/security/cert/CertPath;II)I
    .locals 3

    .prologue
    .line 2031
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2032
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2036
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2048
    if-eqz v0, :cond_0

    .line 2050
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    .line 2052
    if-ge v0, p2, :cond_0

    move p2, v0

    .line 2057
    :cond_0
    return p2

    .line 2042
    :catch_0
    move-exception v0

    .line 2044
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Inhibit any-policy extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static c(Ljava/security/cert/CertPath;I)V
    .locals 3

    .prologue
    .line 2162
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2163
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2168
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    .line 2170
    if-eqz v0, :cond_0

    const/4 v1, 0x5

    aget-boolean v0, v0, v1

    if-nez v0, :cond_0

    .line 2172
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Issuer certificate keyusage extension is critical and does not permit key signing."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 2176
    :cond_0
    return-void
.end method

.method protected static d(Ljava/security/cert/CertPath;II)I
    .locals 3

    .prologue
    .line 2100
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2101
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2105
    invoke-static {v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2107
    if-gtz p2, :cond_0

    .line 2109
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Max path length not greater than zero"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    .line 2112
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 2114
    :cond_1
    return p2
.end method

.method protected static e(Ljava/security/cert/CertPath;II)I
    .locals 3

    .prologue
    .line 2123
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2124
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2129
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/BasicConstraints;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2140
    if-eqz v0, :cond_0

    .line 2142
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/BasicConstraints;->d()Ljava/math/BigInteger;

    move-result-object v0

    .line 2144
    if-eqz v0, :cond_0

    .line 2146
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    .line 2148
    if-ge v0, p2, :cond_0

    move p2, v0

    .line 2154
    :cond_0
    return p2

    .line 2135
    :catch_0
    move-exception v0

    .line 2137
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Basic constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static f(Ljava/security/cert/CertPath;II)I
    .locals 1

    .prologue
    .line 2216
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2217
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2221
    invoke-static {v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2226
    if-eqz p2, :cond_0

    .line 2228
    add-int/lit8 p2, p2, -0x1

    .line 2231
    :cond_0
    return p2
.end method

.method protected static g(Ljava/security/cert/CertPath;II)I
    .locals 1

    .prologue
    .line 2239
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2240
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2244
    invoke-static {v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2249
    if-eqz p2, :cond_0

    .line 2251
    add-int/lit8 p2, p2, -0x1

    .line 2254
    :cond_0
    return p2
.end method

.method protected static h(Ljava/security/cert/CertPath;II)I
    .locals 1

    .prologue
    .line 2262
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2263
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2267
    invoke-static {v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2272
    if-eqz p2, :cond_0

    .line 2274
    add-int/lit8 p2, p2, -0x1

    .line 2277
    :cond_0
    return p2
.end method

.method protected static i(Ljava/security/cert/CertPath;II)I
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 2314
    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    .line 2315
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 2320
    :try_start_0
    sget-object v2, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2330
    if-eqz v0, :cond_1

    .line 2332
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v2

    .line 2334
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2336
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    .line 2337
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 2342
    :pswitch_0
    const/4 v3, 0x0

    :try_start_1
    invoke-static {v0, v3}, Lorg/spongycastle/asn1/DERInteger;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 2350
    if-nez v0, :cond_0

    move p2, v1

    .line 2358
    :cond_1
    return p2

    .line 2326
    :catch_0
    move-exception v0

    .line 2328
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 2344
    :catch_1
    move-exception v0

    .line 2346
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints requireExplicitPolicy field could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    .line 2337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
