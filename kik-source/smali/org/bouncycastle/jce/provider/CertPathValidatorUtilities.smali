.class public Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;
.super Ljava/lang/Object;


# static fields
.field protected static final a:Lorg/bouncycastle/jce/provider/PKIXCRLUtil;

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

.field protected static final o:Ljava/lang/String;

.field protected static final p:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/jce/provider/PKIXCRLUtil;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/PKIXCRLUtil;-><init>()V

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a:Lorg/bouncycastle/jce/provider/PKIXCRLUtil;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->b:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->c:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->r:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->d:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->e:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->f:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->g:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->w:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->h:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->i:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->j:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->k:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->l:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->p:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->m:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->n:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Extensions;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->o:Ljava/lang/String;

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

    sput-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->p:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static a(Ljava/util/List;I)Ljava/security/PublicKey;
    .locals 5

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    instance-of v1, v0, Ljava/security/interfaces/DSAPublicKey;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    check-cast v0, Ljava/security/interfaces/DSAPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/DSAPublicKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v1

    if-nez v1, :cond_0

    add-int/lit8 v1, p1, 0x1

    move v2, v1

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    instance-of v3, v1, Ljava/security/interfaces/DSAPublicKey;

    if-nez v3, :cond_2

    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "DSA parameters cannot be inherited from previous certificate."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    check-cast v1, Ljava/security/interfaces/DSAPublicKey;

    invoke-interface {v1}, Ljava/security/interfaces/DSAPublicKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/security/interfaces/DSAPublicKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v1

    new-instance v2, Ljava/security/spec/DSAPublicKeySpec;

    invoke-interface {v0}, Ljava/security/interfaces/DSAPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v0

    invoke-interface {v1}, Ljava/security/interfaces/DSAParams;->getP()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {v1}, Ljava/security/interfaces/DSAParams;->getQ()Ljava/math/BigInteger;

    move-result-object v4

    invoke-interface {v1}, Ljava/security/interfaces/DSAParams;->getG()Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v2, v0, v3, v4, v1}, Ljava/security/spec/DSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    :try_start_0
    const-string v0, "DSA"

    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "DSA parameters cannot be inherited from previous certificate."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Ljava/util/Set;Ljava/lang/String;)Ljava/security/cert/TrustAnchor;
    .locals 9

    const/4 v2, 0x0

    new-instance v4, Ljava/security/cert/X509CertSelector;

    invoke-direct {v4}, Ljava/security/cert/X509CertSelector;-><init>()V

    invoke-static {p0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v5

    :try_start_0
    invoke-virtual {v5}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/security/cert/X509CertSelector;->setSubject([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v1, v2

    move-object v3, v2

    move-object v0, v2

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    if-nez v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/TrustAnchor;

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/security/cert/X509CertSelector;->match(Ljava/security/cert/Certificate;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_0

    :try_start_1
    invoke-static {p0, v3, p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot set subject search criteria for trust anchor."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    move-object v0, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAPublicKey()Ljava/security/PublicKey;

    move-result-object v7

    if-eqz v7, :cond_4

    :try_start_2
    new-instance v7, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAName()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAPublicKey()Ljava/security/PublicKey;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v0, v2

    goto :goto_1

    :catch_2
    move-exception v0

    :cond_4
    move-object v0, v2

    goto :goto_1

    :cond_5
    if-nez v0, :cond_6

    if-eqz v1, :cond_6

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "TrustAnchor found but certificate validation failed."

    invoke-direct {v0, v2, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    return-object v0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;)Ljava/util/Collection;
    .locals 4

    new-instance v0, Lorg/bouncycastle/x509/X509CertStoreSelector;

    invoke-direct {v0}, Lorg/bouncycastle/x509/X509CertStoreSelector;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v2}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/bouncycastle/x509/X509CertStoreSelector;->setSubject([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->getCertStores()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->f()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXBuilderParameters;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    :try_end_1
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Subject criteria for certificate selector to find issuer certificate could not be set."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuer certificate cannot be searched."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-object v1
.end method

.method protected static a(Lorg/bouncycastle/x509/X509AttributeCertStoreSelector;Ljava/util/List;)Ljava/util/Collection;
    .locals 4

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lorg/bouncycastle/x509/X509Store;

    if-eqz v3, :cond_0

    check-cast v0, Lorg/bouncycastle/x509/X509Store;

    :try_start_0
    invoke-virtual {v0, p0}, Lorg/bouncycastle/x509/X509Store;->a(Lorg/bouncycastle/util/Selector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/bouncycastle/util/StoreException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Problem while picking certificates from X.509 store."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    return-object v1
.end method

.method protected static a(Lorg/bouncycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;
    .locals 4

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lorg/bouncycastle/x509/X509Store;

    if-eqz v3, :cond_0

    check-cast v0, Lorg/bouncycastle/x509/X509Store;

    :try_start_0
    invoke-virtual {v0, p0}, Lorg/bouncycastle/x509/X509Store;->a(Lorg/bouncycastle/util/Selector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/bouncycastle/util/StoreException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Problem while picking certificates from X.509 store."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    check-cast v0, Ljava/security/cert/CertStore;

    :try_start_1
    invoke-virtual {v0, p0}, Ljava/security/cert/CertStore;->getCertificates(Ljava/security/cert/CertSelector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Ljava/security/cert/CertStoreException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Problem while picking certificates from certificate store."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    return-object v1
.end method

.method protected static a(Ljava/security/cert/PKIXParameters;)Ljava/util/Date;
    .locals 1

    invoke-virtual {p0}, Ljava/security/cert/PKIXParameters;->getDate()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    :cond_0
    return-object v0
.end method

.method protected static a(Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/CertPath;I)Ljava/util/Date;
    .locals 3

    invoke-virtual {p0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    if-gtz p2, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/PKIXParameters;)Ljava/util/Date;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    add-int/lit8 v0, p2, -0x1

    if-nez v0, :cond_2

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    add-int/lit8 v2, p2, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/ISISMTTObjectIdentifiers;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/security/cert/X509Certificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERGeneralizedTime;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERGeneralizedTime;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERGeneralizedTime;->f()Ljava/util/Date;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Date of cert gen extension could not be read."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "Date of cert gen extension could not be read."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Date from date of cert gen extension could not be parsed."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    invoke-virtual {p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    add-int/lit8 v1, p2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getNotBefore()Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    add-int/lit8 v1, p2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getNotBefore()Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/PKIXParameters;)Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_1
.end method

.method protected static a(Ljava/util/Date;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509CRL;)Ljava/util/Set;
    .locals 6

    const/4 v1, 0x0

    new-instance v2, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v2}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    :try_start_0
    invoke-virtual {p2}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->addIssuerName([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    :try_start_1
    sget-object v0, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->o:Ljava/lang/String;

    invoke-static {p2, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/CRLNumber;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->f()Ljava/math/BigInteger;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    :goto_1
    :try_start_2
    sget-object v3, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->i:Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/security/cert/X509CRL;->getExtensionValue(Ljava/lang/String;)[B
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    if-nez v0, :cond_1

    :goto_2
    invoke-virtual {v2, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setMinCRLNumber(Ljava/math/BigInteger;)V

    invoke-virtual {v2, v3}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a([B)V

    invoke-virtual {v2}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a()V

    invoke-virtual {v2, v0}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a(Ljava/math/BigInteger;)V

    invoke-static {v2, p1, p0}, Lorg/bouncycastle/jce/provider/PKIXCRLUtil;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CRL;

    invoke-virtual {v0}, Ljava/security/cert/X509CRL;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v3

    sget-object v4, Lorg/bouncycastle/jce/provider/RFC3280CertPathUtilities;->f:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :catch_0
    move-exception v0

    new-instance v3, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v4, "Cannot extract issuer from CRL."

    invoke-direct {v3, v4, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL number extension could not be extracted from CRL."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension value could not be read."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    goto :goto_2

    :cond_2
    return-object v1

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method protected static final a(Lorg/bouncycastle/asn1/ASN1Sequence;)Ljava/util/Set;
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-nez p0, :cond_1

    :cond_0
    return-object v0

    :cond_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Lorg/bouncycastle/asn1/ASN1OutputStream;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1OutputStream;->a(Ljava/lang/Object;)V

    new-instance v4, Ljava/security/cert/PolicyQualifierInfo;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/security/cert/PolicyQualifierInfo;-><init>([B)V

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy qualifier info cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/util/Date;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)Ljava/util/Set;
    .locals 6

    const/4 v5, 0x0

    new-instance v2, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v2}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    :try_start_0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    instance-of v1, p1, Lorg/bouncycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/x509/X509AttributeCertificate;

    move-object v1, v0

    invoke-interface {v1}, Lorg/bouncycastle/x509/X509AttributeCertificate;->d()Lorg/bouncycastle/x509/AttributeCertificateIssuer;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v1

    const/4 v4, 0x0

    aget-object v1, v1, v4

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-static {p0, v3, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/util/Collection;Ljava/security/cert/X509CRLSelector;)V
    :try_end_0
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    instance-of v1, p1, Ljava/security/cert/X509Certificate;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setCertificateChecking(Ljava/security/cert/X509Certificate;)V

    :cond_0
    :goto_2
    invoke-virtual {v2}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->d()V

    invoke-static {v2, p3, p2}, Lorg/bouncycastle/jce/provider/PKIXCRLUtil;->a(Lorg/bouncycastle/x509/X509CRLStoreSelector;Lorg/bouncycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    instance-of v1, p1, Lorg/bouncycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_3

    check-cast p1, Lorg/bouncycastle/x509/X509AttributeCertificate;

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No CRLs found for issuer \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lorg/bouncycastle/x509/X509AttributeCertificate;->d()Lorg/bouncycastle/x509/AttributeCertificateIssuer;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v3

    aget-object v3, v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :try_start_1
    invoke-static {p1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/bouncycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v3, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v4, "Could not get issuer information from distribution point."

    invoke-direct {v3, v4, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    instance-of v1, p1, Lorg/bouncycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lorg/bouncycastle/x509/X509AttributeCertificate;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a(Lorg/bouncycastle/x509/X509AttributeCertificate;)V

    goto :goto_2

    :cond_3
    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No CRLs found for issuer \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    return-object v1
.end method

.method protected static a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;
    .locals 2

    instance-of v0, p0, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    check-cast p0, Lorg/bouncycastle/x509/X509AttributeCertificate;

    invoke-interface {p0}, Lorg/bouncycastle/x509/X509AttributeCertificate;->d()Lorg/bouncycastle/x509/AttributeCertificateIssuer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;
    .locals 1

    invoke-virtual {p0}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;)Ljavax/security/auth/x500/X500Principal;
    .locals 1

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;[B)Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    :try_start_0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    new-instance v1, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception processing extension "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    invoke-interface {p0, p1}, Ljava/security/cert/X509Extension;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/String;[B)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0
.end method

.method protected static a(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    .locals 3

    :try_start_0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-interface {p0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Subject public key cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)Lorg/bouncycastle/jce/provider/PKIXPolicyNode;
    .locals 3

    const/4 v1, 0x0

    invoke-virtual {p2}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getParent()Ljava/security/cert/PolicyNode;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    if-nez p0, :cond_0

    move-object p0, v1

    :goto_0
    return-object p0

    :cond_0
    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    array-length v2, p1

    if-ge v0, v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    aput-object v2, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object p0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p2}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->b(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    invoke-static {p1, p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a([Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V
    .locals 5

    invoke-virtual {p1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "ldap://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ldap://"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const-string v4, "/"

    invoke-virtual {v1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;

    invoke-direct {v2, v1, v0}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->a()Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    move-result-object v0

    const-string v1, "CERTIFICATE/LDAP"

    sget-object v2, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/bouncycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/bouncycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/bouncycastle/x509/X509Store;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a(Lorg/bouncycastle/util/Store;)V

    const-string v1, "CRL/LDAP"

    sget-object v2, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/bouncycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/bouncycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/bouncycastle/x509/X509Store;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a(Lorg/bouncycastle/util/Store;)V

    const-string v1, "ATTRIBUTECERTIFICATE/LDAP"

    sget-object v2, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/bouncycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/bouncycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/bouncycastle/x509/X509Store;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a(Lorg/bouncycastle/util/Store;)V

    const-string v1, "CERTIFICATEPAIR/LDAP"

    sget-object v2, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/bouncycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/bouncycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/bouncycastle/x509/X509Store;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/x509/ExtendedPKIXParameters;->a(Lorg/bouncycastle/util/Store;)V

    :cond_0
    return-void

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ldap://"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exception adding X.509 stores."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/lang/String;)V
    .locals 0

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V
    .locals 5

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerAlternativeNames()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerAlternativeNames()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/lang/Integer;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/String;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected static a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/bouncycastle/jce/provider/b;)V
    .locals 6

    :try_start_0
    new-instance v1, Lorg/bouncycastle/jce/provider/X509CRLObject;

    new-instance v2, Lorg/bouncycastle/asn1/x509/CertificateList;

    invoke-virtual {p1}, Ljava/security/cert/X509CRL;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/x509/CertificateList;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/X509CRLObject;-><init>(Lorg/bouncycastle/asn1/x509/CertificateList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    instance-of v0, p2, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Lorg/bouncycastle/jce/provider/X509CRLObject;->getRevokedCertificate(Ljava/math/BigInteger;)Ljava/security/cert/X509CRLEntry;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/X509CRLEntryObject;

    if-eqz v0, :cond_3

    invoke-static {p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/X509CRLEntryObject;->getCertificateIssuer()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/X509CRLEntryObject;->hasExtensions()Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_1
    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Extensions;->i:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/DEREnumerated;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DEREnumerated;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/X509CRLEntryObject;->getRevocationDate()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DEREnumerated;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DEREnumerated;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DEREnumerated;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DEREnumerated;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_3

    :cond_2
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DEREnumerated;->e()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    iput v1, p3, Lorg/bouncycastle/jce/provider/b;->a:I

    :goto_2
    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/X509CRLEntryObject;->getRevocationDate()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p3, Lorg/bouncycastle/jce/provider/b;->b:Ljava/util/Date;

    :cond_3
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Bouncy Castle X509CRLObject could not be created."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/x509/X509AttributeCertificate;

    invoke-interface {v0}, Lorg/bouncycastle/x509/X509AttributeCertificate;->a()Ljava/math/BigInteger;

    move-result-object v0

    goto/16 :goto_0

    :catch_1
    move-exception v2

    new-instance v3, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v4, "Reason code CRL entry extension could not be decoded."

    invoke-direct {v3, v4, v2}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    iput v1, p3, Lorg/bouncycastle/jce/provider/b;->a:I

    goto :goto_2
.end method

.method protected static a(Lorg/bouncycastle/asn1/x509/CRLDistPoint;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V
    .locals 7

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/CRLDistPoint;->e()[Lorg/bouncycastle/asn1/x509/DistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    move v0, v1

    :goto_0
    array-length v2, v3

    if-ge v0, v2, :cond_2

    aget-object v2, v3, v0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->e()Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->e()I

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DistributionPointName;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v4

    move v2, v1

    :goto_1
    array-length v5, v4

    if-ge v2, v5, :cond_1

    aget-object v5, v4, v2

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x509/GeneralName;->e()I

    move-result v5

    const/4 v6, 0x6

    if-ne v5, v6, :cond_0

    aget-object v5, v4, v2

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x509/GeneralName;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v5

    invoke-static {v5}, Lorg/bouncycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERIA5String;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/DERIA5String;->n_()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/String;Lorg/bouncycastle/x509/ExtendedPKIXParameters;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Distribution points could not be read."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static a(Lorg/bouncycastle/asn1/x509/DistributionPoint;Ljava/util/Collection;Ljava/security/cert/X509CRLSelector;)V
    .locals 5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->g()Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/GeneralNames;->e()[Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v2

    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_3

    aget-object v3, v2, v0

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/GeneralName;->e()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    :try_start_0
    new-instance v3, Ljavax/security/auth/x500/X500Principal;

    aget-object v4, v2, v0

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/GeneralName;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v4

    invoke-interface {v4}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/DERObject;->a()[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL issuer information from distribution point cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/DistributionPoint;->e()Lorg/bouncycastle/asn1/x509/DistributionPointName;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v1, "CRL issuer is omitted from distribution point but no distributionPoint field present."

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/security/cert/X509CRLSelector;->addIssuerName([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot decode CRL issuer information."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    return-void
.end method

.method private static a([Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V
    .locals 2

    invoke-virtual {p1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getDepth()I

    move-result v0

    aget-object v0, p0, v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-static {p0, v0}, Lorg/bouncycastle/jce/provider/CertPathValidatorUtilities;->a([Ljava/util/List;Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected static a(I[Ljava/util/List;Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)Z
    .locals 8

    const/4 v7, 0x0

    add-int/lit8 v0, p0, -0x1

    aget-object v1, p1, v0

    move v0, v7

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    invoke-virtual {v4}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getExpectedPolicies()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v6

    move v2, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    invoke-virtual {v4, v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    aget-object v1, p1, p0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    :cond_0
    return v7

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected static a(Ljava/util/Set;)Z
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "2.5.29.32.0"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static b(I[Ljava/util/List;Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)V
    .locals 8

    const/4 v7, 0x0

    add-int/lit8 v0, p0, -0x1

    aget-object v1, p1, v0

    move v0, v7

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    const-string v2, "2.5.29.32.0"

    invoke-virtual {v4}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v6

    move v2, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    invoke-virtual {v4, v0}, Lorg/bouncycastle/jce/provider/PKIXPolicyNode;->a(Lorg/bouncycastle/jce/provider/PKIXPolicyNode;)V

    aget-object v1, p1, p0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected static b(Ljava/security/cert/X509Certificate;)Z
    .locals 2

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
