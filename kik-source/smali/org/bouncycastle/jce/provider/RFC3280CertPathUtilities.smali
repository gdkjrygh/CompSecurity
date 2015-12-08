.class public Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;
.super Ljava/lang/Object;


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

.field private static final p:Lorg/bouncycastle/jce/provider/PKIXCRLUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/jce/provider/PKIXCRLUtil;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/PKIXCRLUtil;-><init>()V

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->p:Lorg/bouncycastle/jce/provider/PKIXCRLUtil;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->r:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->w:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->c:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->e:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->f:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->p:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->i:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->j:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->k:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->l:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->m:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->n:Ljava/lang/String;

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

    sput-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->o:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static a(ILjava/security/cert/X509Certificate;)I
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    return p0
.end method

.method protected static a(Ljava/security/cert/CertPath;II)I
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_1
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lorg/bouncycastle/asn1/DERInteger;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-ge v0, p2, :cond_1

    move p2, v0

    :cond_1
    return p2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension contents cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static a(Ljava/security/cert/X509CRL;Ljava/util/Set;)Ljava/security/PublicKey;
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/PublicKey;

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CRL;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot verify CRL."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected static a(Ljava/util/Set;Ljava/security/PublicKey;)Ljava/security/cert/X509CRL;
    .locals 4

    const/4 v1, 0x0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v0, v1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CRL;

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/security/cert/X509CRL;->verify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v0

    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot verify delta CRL."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    move-object v0, v1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/util/List;)Ljava/util/Set;
    .locals 8

    const/4 v2, 0x0

    new-instance v0, Lorg/bouncycastle/x509/X509CertStoreSelector;

    invoke-direct {v0}, Lorg/bouncycastle/x509/X509CertStoreSelector;-><init>()V

    :try_start_0
    invoke-static {p0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->setSubject([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p3}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p3}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p3}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getCertStores()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1, p1}, Ljava/security/cert/X509Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Subject criteria for certificate selector to find issuer certificate for CRL could not be set."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuer certificate for CRL cannot be searched."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :try_start_2
    const-string v0, "PKIX"

    sget-object v6, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v6}, Ljava/security/cert/CertPathBuilder;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathBuilder;

    move-result-object v6

    new-instance v7, Lorg/bouncycastle/x509/X509CertStoreSelector;

    invoke-direct {v7}, Lorg/bouncycastle/x509/X509CertStoreSelector;-><init>()V

    invoke-virtual {v7, v1}, Lorg/bouncycastle/x509/X509CertStoreSelector;->setCertificate(Ljava/security/cert/X509Certificate;)V

    invoke-virtual {p3}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    invoke-virtual {v0, v7}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->setTargetCertConstraints(Ljava/security/cert/CertSelector;)V

    invoke-static {v0}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->b(Ljava/security/cert/PKIXParameters;)Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;

    invoke-interface {p4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->setRevocationEnabled(Z)V

    :goto_1
    invoke-virtual {v6, v0}, Ljava/security/cert/CertPathBuilder;->build(Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathBuilderResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/cert/CertPathBuilderResult;->getCertPath()Ljava/security/cert/CertPath;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/List;I)Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/security/cert/CertPathBuilderException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_0

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Internal error."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    const/4 v7, 0x1

    :try_start_3
    invoke-virtual {v0, v7}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->setRevocationEnabled(Z)V
    :try_end_3
    .catch Ljava/security/cert/CertPathBuilderException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_1

    :catch_3
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Public key of issuer certificate of CRL could not be retrieved."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_4
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    if-eqz v0, :cond_4

    array-length v6, v0

    const/4 v7, 0x7

    if-lt v6, v7, :cond_3

    const/4 v6, 0x6

    aget-boolean v0, v0, v6

    if-nez v0, :cond_4

    :cond_3
    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Issuer certificate key usage extension does not permit CRL signing."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    :goto_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_2

    :cond_4
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    goto :goto_3

    :cond_5
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez v1, :cond_6

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Cannot find a valid issuer certificate."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz v1, :cond_7

    throw v1

    :cond_7
    return-object v3
.end method

.method protected static a(Ljava/security/cert/CertPath;ILjava/util/Set;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;I)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;
    .locals 13

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/security/cert/X509Certificate;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    sub-int v3, v1, p1

    :try_start_0
    sget-object v2, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-static {v9, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    if-eqz v2, :cond_10

    if-eqz p3, :cond_10

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v4

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/PolicyInformation;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v7

    invoke-virtual {v7}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v8, "2.5.29.32.0"

    invoke-virtual {v7}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    :try_start_1
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->f()Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v6

    invoke-static {v6}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/asn1/ASN1Sequence;)Ljava/util/Set;
    :try_end_1
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v6

    move-object/from16 v0, p4

    invoke-static {v3, v0, v7, v6}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(I[Ljava/util/List;Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)Z

    move-result v8

    if-nez v8, :cond_0

    move-object/from16 v0, p4

    invoke-static {v3, v0, v7, v6}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(I[Ljava/util/List;Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)V

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v3, "Could not read certificate policies extension from certificate."

    invoke-direct {v2, v3, v1, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :catch_1
    move-exception v1

    new-instance v2, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v3, "Policy qualifier info set could not be build."

    invoke-direct {v2, v3, v1, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :cond_1
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "2.5.29.32.0"

    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_2
    invoke-interface {p2}, Ljava/util/Set;->clear()V

    invoke-interface {p2, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :goto_1
    if-gtz p5, :cond_3

    if-ge v3, v1, :cond_c

    invoke-static {v9}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_3
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/PolicyInformation;

    move-result-object v2

    const-string v4, "2.5.29.32.0"

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->f()Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/asn1/ASN1Sequence;)Ljava/util/Set;

    move-result-object v6

    add-int/lit8 v1, v3, -0x1

    aget-object v11, p4, v1

    const/4 v1, 0x0

    move v10, v1

    :goto_2
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v1

    if-ge v10, v1, :cond_c

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v5}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getExpectedPolicies()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_5
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_9

    check-cast v1, Ljava/lang/String;

    move-object v7, v1

    :goto_4
    const/4 v2, 0x0

    invoke-virtual {v5}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    const/4 v1, 0x1

    :goto_6
    move v2, v1

    goto :goto_5

    :cond_6
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    :cond_7
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_8
    invoke-interface {p2}, Ljava/util/Set;->clear()V

    invoke-interface {p2, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_1

    :cond_9
    instance-of v2, v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v2, :cond_5

    check-cast v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_a
    if-nez v2, :cond_5

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v1, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    invoke-virtual {v5, v1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    aget-object v2, p4, v3

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    add-int/lit8 v1, v10, 0x1

    move v10, v1

    goto/16 :goto_2

    :cond_c
    add-int/lit8 v1, v3, -0x1

    move v5, v1

    move-object/from16 v2, p3

    :goto_8
    if-ltz v5, :cond_f

    aget-object v6, p4, v5

    const/4 v1, 0x0

    move v4, v1

    :goto_9
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_d

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v7

    if-nez v7, :cond_12

    move-object/from16 v0, p4

    invoke-static {v2, v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v1

    if-eqz v1, :cond_e

    :goto_a
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-object v2, v1

    goto :goto_9

    :cond_d
    move-object v1, v2

    :cond_e
    add-int/lit8 v2, v5, -0x1

    move v5, v2

    move-object v2, v1

    goto :goto_8

    :cond_f
    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_11

    sget-object v4, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    aget-object v5, p4, v3

    const/4 v1, 0x0

    move v3, v1

    :goto_b
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_11

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v1, v4}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a(Z)V

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_b

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

.method protected static a(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    return-object p2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Could not read certificate policies extension from certificate."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static a(Ljava/security/cert/CertPath;I[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;I)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;
    .locals 12

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/security/cert/X509Certificate;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    sub-int v2, v0, p1

    :try_start_0
    sget-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    invoke-static {v8, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    if-eqz v4, :cond_f

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    if-ge v3, v0, :cond_1

    invoke-virtual {v4, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x1

    invoke-virtual {v0, v6}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v10, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v10, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy mappings extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_0
    invoke-interface {v10, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v9, p3

    :cond_2
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-lez p4, :cond_8

    const/4 v1, 0x0

    aget-object v0, p2, v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v3, 0x1

    invoke-interface {v10, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iput-object v1, v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->c:Ljava/util/Set;

    move v0, v3

    :goto_3
    if-nez v0, :cond_2

    aget-object v0, p2, v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    const-string v0, "2.5.29.32.0"

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v5, 0x0

    :try_start_1
    sget-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-static {v8, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_1
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_6

    :try_start_2
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/PolicyInformation;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    const-string v4, "2.5.29.32.0"

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v7

    invoke-virtual {v7}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    :try_start_3
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/PolicyInformation;->f()Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/asn1/ASN1Sequence;)Ljava/util/Set;
    :try_end_3
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v5

    :cond_6
    const/4 v7, 0x0

    invoke-virtual {v8}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v8}, Ljava/security/cert/X509Certificate;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    sget-object v3, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a:Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    :cond_7
    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getParent()Ljava/security/cert/PolicyNode;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    const-string v0, "2.5.29.32.0"

    invoke-virtual {v4}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    invoke-virtual {v4, v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    aget-object v1, p2, v2

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Certificate policies extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Policy information could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy qualifier info set could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_8
    if-gtz p4, :cond_d

    aget-object v0, p2, v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v3, v9

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getParent()Ljava/security/cert/PolicyNode;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->b(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    add-int/lit8 v0, v2, -0x1

    move v4, v0

    move-object v1, v3

    :goto_5
    if-ltz v4, :cond_c

    aget-object v7, p2, v4

    const/4 v0, 0x0

    move-object v3, v1

    move v1, v0

    :goto_6
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_a

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v9

    if-nez v9, :cond_9

    invoke-static {v3, p2, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v3

    if-eqz v3, :cond_a

    :cond_9
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    :cond_a
    add-int/lit8 v0, v4, -0x1

    move v4, v0

    move-object v1, v3

    goto :goto_5

    :cond_b
    move-object v1, v3

    :cond_c
    move-object v3, v1

    goto :goto_4

    :cond_d
    move-object v3, v9

    :cond_e
    move-object v9, v3

    goto/16 :goto_2

    :cond_f
    move-object v9, p3

    :cond_10
    return-object v9

    :cond_11
    move v0, v1

    goto/16 :goto_3
.end method

.method protected static a(Ljava/security/cert/CertPath;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/util/Set;I[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;Ljava/util/Set;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;
    .locals 9

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-nez p5, :cond_2

    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->isExplicitPolicyRequired()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Explicit policy requested but none available."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p3}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_0
    const/4 p5, 0x0

    :cond_1
    :goto_0
    return-object p5

    :cond_2
    invoke-static {p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Set;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->isExplicitPolicyRequired()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p6}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Explicit policy requested but none available."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p3}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_3
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x0

    move v2, v0

    :goto_1
    array-length v0, p4

    if-ge v2, v0, :cond_6

    aget-object v5, p4, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    const-string v6, "2.5.29.32.0"

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_5
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_6
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p6, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    if-eqz p5, :cond_1

    add-int/lit8 v0, v3, -0x1

    move-object v1, p5

    move v3, v0

    :goto_5
    if-ltz v3, :cond_15

    aget-object v4, p4, v3

    const/4 v0, 0x0

    move-object v2, v1

    move v1, v0

    :goto_6
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_9

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v2, p4, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v2

    :cond_8
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    :cond_9
    add-int/lit8 v0, v3, -0x1

    move-object v1, v2

    move v3, v0

    goto :goto_5

    :cond_a
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x0

    move v2, v0

    :goto_7
    array-length v0, p4

    if-ge v2, v0, :cond_e

    aget-object v5, p4, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_8
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_d

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    const-string v6, "2.5.29.32.0"

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    const-string v7, "2.5.29.32.0"

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_c
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_8

    :cond_d
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_7

    :cond_e
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    invoke-static {p5, p4, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object p5

    goto :goto_a

    :cond_10
    if-eqz p5, :cond_13

    add-int/lit8 v0, v3, -0x1

    move-object v1, p5

    move v3, v0

    :goto_b
    if-ltz v3, :cond_14

    aget-object v4, p4, v3

    const/4 v0, 0x0

    move-object v2, v1

    move v1, v0

    :goto_c
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_12

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v5

    if-nez v5, :cond_11

    invoke-static {v2, p4, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    move-result-object v2

    :cond_11
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_c

    :cond_12
    add-int/lit8 v0, v3, -0x1

    move-object v1, v2

    move v3, v0

    goto :goto_b

    :cond_13
    move-object v1, p5

    :cond_14
    move-object p5, v1

    goto/16 :goto_0

    :cond_15
    move-object p5, v1

    goto/16 :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;Lorg/bouncycastle/asn1/x509/DistributionPoint;)Lorg/bouncycastle/jce/provider/h;
    .locals 3

    :try_start_0
    sget-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p0, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->j()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->f()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/h;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->f()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/ReasonFlags;->g()I

    move-result v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/h;-><init>(I)V

    new-instance v1, Lorg/bouncycastle/jce/provider/h;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->j()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/ReasonFlags;->g()I

    move-result v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/h;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/jce/provider/h;->b(Lorg/bouncycastle/jce/provider/h;)Lorg/bouncycastle/jce/provider/h;

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension could not be decoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->j()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->f()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lorg/bouncycastle/jce/provider/h;->a:Lorg/bouncycastle/jce/provider/h;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->f()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lorg/bouncycastle/jce/provider/h;->a:Lorg/bouncycastle/jce/provider/h;

    move-object v1, v0

    :goto_1
    if-nez v2, :cond_4

    sget-object v0, Lorg/bouncycastle/jce/provider/h;->a:Lorg/bouncycastle/jce/provider/h;

    :goto_2
    invoke-virtual {v1, v0}, Lorg/bouncycastle/jce/provider/h;->b(Lorg/bouncycastle/jce/provider/h;)Lorg/bouncycastle/jce/provider/h;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance v0, Lorg/bouncycastle/jce/provider/h;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->f()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/ReasonFlags;->g()I

    move-result v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/h;-><init>(I)V

    move-object v1, v0

    goto :goto_1

    :cond_4
    new-instance v0, Lorg/bouncycastle/jce/provider/h;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->j()Lorg/bouncycastle/asn1/x509/ReasonFlags;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/ReasonFlags;->g()I

    move-result v2

    invoke-direct {v0, v2}, Lorg/bouncycastle/jce/provider/h;-><init>(I)V

    goto :goto_2
.end method

.method protected static a(Ljava/security/cert/CertPath;I)V
    .locals 6

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v2, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    if-eqz v2, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-ge v0, v1, :cond_2

    :try_start_1
    invoke-virtual {v2, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERObjectIdentifier;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    const-string v4, "2.5.29.32.0"

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "IssuerDomainPolicy is anyPolicy"

    invoke-direct {v0, v1, v5, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy mappings extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy mappings extension contents could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_0
    const-string v3, "2.5.29.32.0"

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "SubjectDomainPolicy is anyPolicy,"

    invoke-direct {v0, v1, v5, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILjava/util/List;Ljava/util/Set;)V
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/PKIXCertPathChecker;

    invoke-virtual {v1, v0, p3}, Ljava/security/cert/PKIXCertPathChecker;->check(Ljava/security/cert/Certificate;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Additional certificate path checker failed."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_0
    invoke-interface {p3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Certificate has unsupported critical extension"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_1
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILjava/util/Set;Ljava/util/List;)V
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/PKIXCertPathChecker;

    invoke-virtual {v1, v0, p2}, Ljava/security/cert/PKIXCertPathChecker;->check(Ljava/security/cert/Certificate;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/security/cert/CertPathValidatorException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    invoke-virtual {v0}, Ljava/security/cert/CertPathValidatorException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/security/cert/CertPathValidatorException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Certificate has unsupported critical extension."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_1
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;)V
    .locals 4

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int v2, v1, p1

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-lt v2, v1, :cond_2

    :cond_0
    invoke-static {v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    :try_start_0
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    :try_start_1
    invoke-virtual {p2, v1}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {p2, v1}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->b(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    :try_end_1
    .catch Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidatorException; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    sget-object v2, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->j:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/GeneralNames;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v2

    new-instance v0, Lorg/bouncycastle/asn1/x509/X509Name;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/X509Name;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->D:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v3, Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-direct {v3, v0}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(Ljava/lang/String;)V

    :try_start_3
    invoke-virtual {p2, v3}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/bouncycastle/asn1/x509/GeneralName;)V

    invoke-virtual {p2, v3}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->b(Lorg/bouncycastle/asn1/x509/GeneralName;)V
    :try_end_3
    .catch Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidatorException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subtree check for certificate subject alternative email failed."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Exception extracting subject name when checking subtrees."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subtree check for certificate subject failed."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subject alternative name extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_1
    if-eqz v2, :cond_2

    :try_start_4
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v1

    const/4 v0, 0x0

    :goto_1
    array-length v2, v1

    if-ge v0, v2, :cond_2

    :try_start_5
    aget-object v2, v1, v0

    invoke-virtual {p2, v2}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/bouncycastle/asn1/x509/GeneralName;)V

    aget-object v2, v1, v0

    invoke-virtual {p2, v2}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->b(Lorg/bouncycastle/asn1/x509/GeneralName;)V
    :try_end_5
    .catch Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidatorException; {:try_start_5 .. :try_end_5} :catch_5

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_4
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subject alternative name contents could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_5
    move-exception v0

    new-instance v1, Ljava/security/cert/CertPathValidatorException;

    const-string v2, "Subtree check for certificate subject alternative name failed."

    invoke-direct {v1, v2, v0, p0, p1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_2
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXPolicyNode;I)V
    .locals 3

    if-gtz p3, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "No valid policy tree found when one expected."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_0
    return-void
.end method

.method protected static a(Ljava/security/cert/CertPath;Lorg/bouncycastle/x509/ExtendedPKIXParameters;ILjava/security/PublicKey;ZLjavax/security/auth/x500/X500Principal;Ljava/security/cert/X509Certificate;)V
    .locals 6

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    if-nez p4, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->getSigProvider()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, p3, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :try_start_1
    invoke-static {p1, p0, p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/CertPath;I)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/cert/X509Certificate;->checkValidity(Ljava/util/Date;)V
    :try_end_1
    .catch Ljava/security/cert/CertificateExpiredException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/cert/CertificateNotYetValidException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_3

    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->isRevocationEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_2
    invoke-static {p1, p0, p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/CertPath;I)Ljava/util/Date;

    move-result-object v2

    move-object v0, p1

    move-object v3, p6

    move-object v4, p3

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/util/List;)V
    :try_end_2
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_2 .. :try_end_2} :catch_4

    :cond_1
    invoke-static {v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IssuerName("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

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

    invoke-direct {v0, v1, v2, p0, p2}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Could not validate certificate signature."

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not validate certificate: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/cert/CertificateExpiredException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not validate certificate: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/cert/CertificateNotYetValidException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Could not validate time of certificate."

    invoke-direct {v1, v2, v0, p0, p2}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_4
    move-exception v1

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    :goto_0
    new-instance v2, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0, p0, p2}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v2

    :cond_2
    return-void

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509CRL;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V
    .locals 4

    const/4 v0, 0x1

    if-nez p0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p1, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    invoke-virtual {p2}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Complete CRL issuer does not match delta CRL issuer."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension could not be decoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    :try_start_1
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    const/4 v1, 0x0

    if-nez v2, :cond_4

    if-nez v3, :cond_5

    :cond_3
    :goto_0
    if-nez v0, :cond_6

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Issuing distribution point extension from delta CRL and complete CRL does not match."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension from delta CRL could not be decoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_5
    move v0, v1

    goto :goto_0

    :cond_6
    :try_start_2
    sget-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->l:Ljava/lang/String;

    invoke-static {p1, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;
    :try_end_2
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    :try_start_3
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->l:Ljava/lang/String;

    invoke-static {p0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;
    :try_end_3
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v1

    if-nez v0, :cond_7

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "CRL authority key identifier is null."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Authority key identifier extension could not be extracted from complete CRL."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Authority key identifier extension could not be extracted from delta CRL."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_7
    if-nez v1, :cond_8

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Delta CRL authority key identifier is null."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Delta CRL authority key identifier does not match complete CRL authority key identifier."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/bouncycastle/jce/provider/b;)V
    .locals 2

    iget v0, p3, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/bouncycastle/jce/provider/b;)V

    :cond_0
    return-void
.end method

.method protected static a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/bouncycastle/jce/provider/b;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V
    .locals 1

    invoke-virtual {p4}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {p0, p1, p2, p3}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/bouncycastle/jce/provider/b;)V

    :cond_0
    return-void
.end method

.method protected static a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V
    .locals 12

    const/4 v5, 0x1

    const/4 v2, 0x0

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p2, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->i()Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-static {v6}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->i()Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object v3

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->e()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v4

    move v1, v2

    :goto_0
    array-length v8, v4

    if-ge v1, v8, :cond_0

    aget-object v8, v4, v1

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v3, "Issuing distribution point extension could not be decoded."

    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_0
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->e()I

    move-result v1

    if-ne v1, v5, :cond_2

    new-instance v4, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    :try_start_1
    invoke-static {p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v8}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v4, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    new-instance v2, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v3, "Could not read CRL issuer."

    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-virtual {v4, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/x509/GeneralName;

    new-instance v3, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v3, v4}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(Lorg/bouncycastle/asn1/x509/X509Name;)V

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->e()Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->e()Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object v8

    const/4 v1, 0x0

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->e()I

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v1

    :cond_3
    invoke-virtual {v8}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->e()I

    move-result v3

    if-ne v3, v5, :cond_6

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v1

    move-object v3, v1

    :goto_2
    move v4, v2

    :goto_3
    array-length v1, v3

    if-ge v4, v1, :cond_7

    aget-object v1, v3, v4

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/GeneralName;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-interface {v1}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v9

    new-instance v10, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    :goto_4
    invoke-interface {v9}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v9}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v10, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_4

    :cond_4
    new-array v3, v5, [Lorg/bouncycastle/asn1/x509/GeneralName;

    const/4 v4, 0x0

    :try_start_2
    new-instance v9, Lorg/bouncycastle/asn1/x509/GeneralName;

    new-instance v10, Lorg/bouncycastle/asn1/x509/X509Name;

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v10, v1}, Lorg/bouncycastle/asn1/x509/X509Name;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-direct {v9, v10}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(Lorg/bouncycastle/asn1/x509/X509Name;)V

    aput-object v9, v3, v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    new-instance v2, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v3, "Could not read certificate issuer."

    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_5
    invoke-virtual {v8}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-virtual {v10, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/x509/GeneralName;

    new-instance v9, Lorg/bouncycastle/asn1/x509/X509Name;

    new-instance v11, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v11, v10}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v9, v11}, Lorg/bouncycastle/asn1/x509/X509Name;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-direct {v1, v9}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(Lorg/bouncycastle/asn1/x509/X509Name;)V

    aput-object v1, v3, v4

    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_3

    :cond_6
    move-object v3, v1

    :cond_7
    if-eqz v3, :cond_8

    move v1, v2

    :goto_5
    array-length v4, v3

    if-ge v1, v4, :cond_8

    aget-object v4, v3, v1

    invoke-interface {v7, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move v2, v5

    :cond_8
    if-nez v2, :cond_e

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v1

    if-nez v1, :cond_b

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint."

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v3

    move v1, v2

    :goto_6
    array-length v4, v3

    if-ge v1, v4, :cond_c

    aget-object v4, v3, v1

    invoke-interface {v7, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    move v2, v5

    :cond_c
    if-nez v2, :cond_e

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_e
    :try_start_3
    move-object v0, p1

    check-cast v0, Ljava/security/cert/X509Extension;

    move-object v1, v0

    sget-object v2, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-static {v1, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/BasicConstraints;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v1

    instance-of v2, p1, Ljava/security/cert/X509Certificate;

    if-eqz v2, :cond_11

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->e()Z

    move-result v2

    if-eqz v2, :cond_f

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/BasicConstraints;->e()Z

    move-result v2

    if-eqz v2, :cond_f

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "CA Cert CRL only contains user certificates."

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_3
    move-exception v1

    new-instance v2, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v3, "Basic constraints extension could not be decoded."

    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_f
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->f()Z

    move-result v2

    if-eqz v2, :cond_11

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/BasicConstraints;->e()Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "End CRL only contains CA certificates."

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->h()Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "onlyContainsAttributeCerts boolean is asserted."

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    return-void
.end method

.method private static a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/bouncycastle/jce/provider/b;Lorg/bouncycastle/jce/provider/h;Ljava/util/List;)V
    .locals 16

    new-instance v8, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v8, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual/range {p3 .. p3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    new-instance v4, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v5, "Validation time is in future."

    invoke-direct {v4, v5}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    invoke-static {v0, v1, v8, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/util/Date;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)Ljava/util/Set;

    move-result-object v6

    const/4 v5, 0x0

    const/4 v4, 0x0

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v6, v5

    move-object v5, v4

    :cond_1
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v0, p6

    iget v4, v0, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v7, 0xb

    if-ne v4, v7, :cond_7

    invoke-virtual/range {p7 .. p7}, Lorg/bouncycastle/jce/provider/h;->a()Z

    move-result v4

    if-nez v4, :cond_7

    :try_start_0
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/X509CRL;

    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Lorg/bouncycastle/asn1/x509/DistributionPoint;)Lorg/bouncycastle/jce/provider/h;

    move-result-object v10

    move-object/from16 v0, p7

    invoke-virtual {v10, v0}, Lorg/bouncycastle/jce/provider/h;->c(Lorg/bouncycastle/jce/provider/h;)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p1

    move-object/from16 v3, p8

    invoke-static {v4, v0, v1, v2, v3}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/util/List;)Ljava/util/Set;

    move-result-object v7

    invoke-static {v4, v7}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/util/Set;)Ljava/security/PublicKey;

    move-result-object v11

    const/4 v7, 0x0

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->c()Z

    move-result v12

    if-eqz v12, :cond_2

    move-object/from16 v0, p1

    invoke-static {v8, v0, v4}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/util/Date;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509CRL;)Ljava/util/Set;

    move-result-object v7

    invoke-static {v7, v11}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Set;Ljava/security/PublicKey;)Ljava/security/cert/X509CRL;

    move-result-object v7

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->d()I

    move-result v11

    const/4 v12, 0x1

    if-eq v11, v12, :cond_3

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

    new-instance v4, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v5, "No valid CRL for current time found."

    invoke-direct {v4, v5}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    :catch_0
    move-exception v4

    move-object v5, v4

    goto :goto_0

    :cond_3
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->b(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V

    move-object/from16 v0, p1

    invoke-static {v7, v4, v0}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/security/cert/X509CRL;Ljava/security/cert/X509CRL;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V

    move-object/from16 v0, p3

    move-object/from16 v1, p2

    move-object/from16 v2, p6

    move-object/from16 v3, p1

    invoke-static {v0, v7, v1, v2, v3}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/bouncycastle/jce/provider/b;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V

    move-object/from16 v0, p3

    move-object/from16 v1, p2

    move-object/from16 v2, p6

    invoke-static {v0, v4, v1, v2}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/bouncycastle/jce/provider/b;)V

    move-object/from16 v0, p6

    iget v11, v0, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v12, 0x8

    if-ne v11, v12, :cond_4

    const/16 v11, 0xb

    move-object/from16 v0, p6

    iput v11, v0, Lorg/bouncycastle/jce/provider/b;->a:I

    :cond_4
    move-object/from16 v0, p7

    invoke-virtual {v0, v10}, Lorg/bouncycastle/jce/provider/h;->a(Lorg/bouncycastle/jce/provider/h;)V

    invoke-virtual {v4}, Ljava/security/cert/X509CRL;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_5

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sget-object v4, Lorg/bouncycastle/asn1/x509/X509Extensions;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v4, Lorg/bouncycastle/asn1/x509/X509Extensions;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v10}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    new-instance v4, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v5, "CRL contains unsupported critical extensions."

    invoke-direct {v4, v5}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_5
    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/security/cert/X509CRL;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_6

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sget-object v4, Lorg/bouncycastle/asn1/x509/X509Extensions;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v4, Lorg/bouncycastle/asn1/x509/X509Extensions;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    new-instance v4, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v5, "Delta CRL contains unsupported critical extension."

    invoke-direct {v4, v5}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    const/4 v4, 0x1

    move v6, v4

    goto/16 :goto_0

    :cond_7
    if-nez v6, :cond_8

    throw v5

    :cond_8
    return-void
.end method

.method private static a(Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/util/List;)V
    .locals 13

    const/4 v10, 0x0

    :try_start_0
    sget-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->i:Ljava/lang/String;

    invoke-static {p1, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/CRLDistPoint;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/CRLDistPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :try_start_1
    invoke-static {v0, p0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/asn1/x509/CRLDistPoint;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V
    :try_end_1
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    new-instance v6, Lorg/bouncycastle/jce/provider/b;

    invoke-direct {v6}, Lorg/bouncycastle/jce/provider/b;-><init>()V

    new-instance v7, Lorg/bouncycastle/jce/provider/h;

    invoke-direct {v7}, Lorg/bouncycastle/jce/provider/h;-><init>()V

    const/4 v9, 0x0

    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/CRLDistPoint;->e()[Lorg/bouncycastle/asn1/x509/DistributionPoint;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v12

    const/4 v0, 0x0

    move v11, v0

    :goto_0
    array-length v0, v12

    if-ge v11, v0, :cond_0

    iget v0, v6, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    invoke-virtual {v7}, Lorg/bouncycastle/jce/provider/h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    :try_start_3
    aget-object v0, v12, v11

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v8, p5

    invoke-static/range {v0 .. v8}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/bouncycastle/jce/provider/b;Lorg/bouncycastle/jce/provider/h;Ljava/util/List;)V
    :try_end_3
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v0, 0x1

    move-object v1, v10

    :goto_1
    add-int/lit8 v2, v11, 0x1

    move v11, v2

    move v9, v0

    move-object v10, v1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL distribution point extension could not be read."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "No additional CRL locations could be decoded from CRL distribution point extension."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Distribution points could not be read."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    move-object v1, v0

    move v0, v9

    goto :goto_1

    :cond_0
    iget v0, v6, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    invoke-virtual {v7}, Lorg/bouncycastle/jce/provider/h;->a()Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_4
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_4 .. :try_end_4} :catch_5

    move-result-object v1

    :try_start_5
    new-instance v0, Lorg/bouncycastle/asn1/x509/DistributionPoint;

    new-instance v2, Lorg/bouncycastle/asn1/x509/DistributionPointName;

    new-instance v3, Lorg/bouncycastle/asn1/x509/GeneralNames;

    new-instance v4, Lorg/bouncycastle/asn1/x509/GeneralName;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v1}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(ILorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-direct {v3, v4}, Lorg/bouncycastle/asn1/x509/GeneralNames;-><init>(Lorg/bouncycastle/asn1/x509/GeneralName;)V

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/x509/DistributionPointName;-><init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/x509/DistributionPoint;-><init>(Lorg/bouncycastle/asn1/x509/DistributionPointName;)V

    invoke-virtual {p0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/x509/ExtendedPKIXParameters;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v8, p5

    invoke-static/range {v0 .. v8}, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509Certificate;Ljava/util/Date;Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Lorg/bouncycastle/jce/provider/b;Lorg/bouncycastle/jce/provider/h;Ljava/util/List;)V
    :try_end_5
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_5 .. :try_end_5} :catch_5

    const/4 v9, 0x1

    :cond_1
    :goto_2
    if-nez v9, :cond_3

    instance-of v0, v10, Lorg/bouncycastle/jce/provider/AnnotatedException;

    if-eqz v0, :cond_2

    throw v10

    :catch_4
    move-exception v0

    :try_start_6
    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuer from certificate for CRL could not be reencoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_6 .. :try_end_6} :catch_5

    :catch_5
    move-exception v0

    move-object v10, v0

    goto :goto_2

    :cond_2
    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "No valid CRL found."

    invoke-direct {v0, v1, v10}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    iget v0, v6, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Certificate revocation after "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v6, Lorg/bouncycastle/jce/provider/b;->b:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->o:[Ljava/lang/String;

    iget v2, v6, Lorg/bouncycastle/jce/provider/b;->a:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    invoke-direct {v1, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual {v7}, Lorg/bouncycastle/jce/provider/h;->a()Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, v6, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_5

    const/16 v0, 0xc

    iput v0, v6, Lorg/bouncycastle/jce/provider/b;->a:I

    :cond_5
    iget v0, v6, Lorg/bouncycastle/jce/provider/b;->a:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_6

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Certificate status could not be determined."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    return-void
.end method

.method protected static b(Ljava/security/cert/CertPath;II)I
    .locals 4

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_1
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lorg/bouncycastle/asn1/DERInteger;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-ge v0, p2, :cond_1

    move p2, v0

    :cond_1
    return p2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints extension contents cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static b(Ljava/security/cert/CertPath;I)V
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/BasicConstraints;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/BasicConstraints;->e()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Not a CA certificate"

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Basic constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_0
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "Intermediate certificate lacks BasicConstraints"

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method protected static b(Ljava/security/cert/CertPath;ILorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;)V
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->k:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/x509/NameConstraints;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/x509/NameConstraints;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/NameConstraints;->e()Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {p2, v1}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :cond_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/NameConstraints;->f()Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v0

    :goto_1
    :try_start_2
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/GeneralSubtree;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/GeneralSubtree;

    move-result-object v1

    invoke-virtual {p2, v1}, Lorg/bouncycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/bouncycastle/asn1/x509/GeneralSubtree;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Excluded subtrees cannot be build from name constraints extension."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Name constraints extension could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Permitted subtrees cannot be build from name constraints extension."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :cond_1
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method protected static b(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/security/cert/X509CRL;)V
    .locals 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    sget-object v0, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->d:Ljava/lang/String;

    invoke-static {p2, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/IssuingDistributionPoint;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    :goto_0
    invoke-static {p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v4

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v5

    move v3, v2

    :goto_1
    array-length v6, v5

    if-ge v3, v6, :cond_1

    aget-object v6, v5, v3

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/GeneralName;->e()I

    move-result v6

    const/4 v7, 0x4

    if-ne v6, v7, :cond_0

    :try_start_0
    aget-object v6, v5, v3

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/GeneralName;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v6

    invoke-interface {v6}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/DERObject;->a()[B

    move-result-object v6

    invoke-static {v6, v4}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-eqz v6, :cond_0

    move v2, v1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL issuer information from distribution point cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    if-eqz v2, :cond_2

    if-nez v0, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Distribution point contains cRLIssuer field but CRL is not indirect."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    if-nez v2, :cond_4

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "CRL issuer of CRL does not match CRL issuer of distribution point."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v2, v1

    :cond_4
    if-nez v2, :cond_5

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Cannot find matching CRL issuer for certificate."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    return-void

    :cond_6
    move v0, v2

    goto :goto_0
.end method

.method protected static c(Ljava/security/cert/CertPath;II)I
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    if-ge v0, p2, :cond_0

    move p2, v0

    :cond_0
    return p2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Inhibit any-policy extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static c(Ljava/security/cert/CertPath;I)V
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x5

    aget-boolean v0, v0, v1

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Issuer certificate keyusage extension is critical and does not permit key signing."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_0
    return-void
.end method

.method protected static d(Ljava/security/cert/CertPath;II)I
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_1

    if-gtz p2, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v1, "Max path length not greater than zero"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v0

    :cond_0
    add-int/lit8 p2, p2, -0x1

    :cond_1
    return p2
.end method

.method protected static e(Ljava/security/cert/CertPath;II)I
    .locals 3

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/BasicConstraints;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/BasicConstraints;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/BasicConstraints;->f()Ljava/math/BigInteger;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    if-ge v0, p2, :cond_0

    move p2, v0

    :cond_0
    return p2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Basic constraints extension cannot be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1
.end method

.method protected static f(Ljava/security/cert/CertPath;II)I
    .locals 1

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    add-int/lit8 p2, p2, -0x1

    :cond_0
    return p2
.end method

.method protected static g(Ljava/security/cert/CertPath;II)I
    .locals 1

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    add-int/lit8 p2, p2, -0x1

    :cond_0
    return p2
.end method

.method protected static h(Ljava/security/cert/CertPath;II)I
    .locals 1

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    add-int/lit8 p2, p2, -0x1

    :cond_0
    return p2
.end method

.method protected static i(Ljava/security/cert/CertPath;II)I
    .locals 4

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    :try_start_0
    sget-object v2, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v3, 0x0

    :try_start_1
    invoke-static {v0, v3}, Lorg/bouncycastle/asn1/DERInteger;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-nez v0, :cond_0

    move p2, v1

    :cond_1
    return p2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy constraints requireExplicitPolicy field could not be decoded."

    invoke-direct {v1, v2, v0, p0, p1}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
