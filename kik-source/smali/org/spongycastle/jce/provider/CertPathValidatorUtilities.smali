.class public Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final a:Lorg/spongycastle/jce/provider/PKIXCRLUtil;

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

    .prologue
    .line 78
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXCRLUtil;

    invoke-direct {v0}, Lorg/spongycastle/jce/provider/PKIXCRLUtil;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a:Lorg/spongycastle/jce/provider/PKIXCRLUtil;

    .line 80
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b:Ljava/lang/String;

    .line 81
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->c:Ljava/lang/String;

    .line 82
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->d:Ljava/lang/String;

    .line 83
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->e:Ljava/lang/String;

    .line 84
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->f:Ljava/lang/String;

    .line 85
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->g:Ljava/lang/String;

    .line 86
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->w:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->h:Ljava/lang/String;

    .line 87
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->i:Ljava/lang/String;

    .line 88
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->j:Ljava/lang/String;

    .line 89
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->t:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->k:Ljava/lang/String;

    .line 90
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->l:Ljava/lang/String;

    .line 91
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->m:Ljava/lang/String;

    .line 92
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->n:Ljava/lang/String;

    .line 96
    sget-object v0, Lorg/spongycastle/asn1/x509/X509Extensions;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->o:Ljava/lang/String;

    .line 104
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

    sput-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->p:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static a(Ljava/util/List;I)Ljava/security/PublicKey;
    .locals 5

    .prologue
    .line 1317
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    .line 1318
    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    .line 1319
    instance-of v1, v0, Ljava/security/interfaces/DSAPublicKey;

    if-nez v1, :cond_1

    .line 1348
    :cond_0
    :goto_0
    return-object v0

    .line 1323
    :cond_1
    check-cast v0, Ljava/security/interfaces/DSAPublicKey;

    .line 1324
    invoke-interface {v0}, Ljava/security/interfaces/DSAPublicKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1328
    add-int/lit8 v1, p1, 0x1

    move v2, v1

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 1330
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 1331
    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    .line 1332
    instance-of v3, v1, Ljava/security/interfaces/DSAPublicKey;

    if-nez v3, :cond_2

    .line 1334
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "DSA parameters cannot be inherited from previous certificate."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1337
    :cond_2
    check-cast v1, Ljava/security/interfaces/DSAPublicKey;

    .line 1338
    invoke-interface {v1}, Ljava/security/interfaces/DSAPublicKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 1340
    invoke-interface {v1}, Ljava/security/interfaces/DSAPublicKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v1

    .line 1343
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

    .line 1347
    :try_start_0
    const-string v0, "DSA"

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    .line 1348
    invoke-virtual {v0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 1350
    :catch_0
    move-exception v0

    .line 1352
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1328
    :cond_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 1355
    :cond_4
    new-instance v0, Ljava/security/cert/CertPathValidatorException;

    const-string v1, "DSA parameters cannot be inherited from previous certificate."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathValidatorException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Ljava/util/Set;Ljava/lang/String;)Ljava/security/cert/TrustAnchor;
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 157
    .line 161
    new-instance v4, Ljava/security/cert/X509CertSelector;

    invoke-direct {v4}, Ljava/security/cert/X509CertSelector;-><init>()V

    .line 162
    invoke-static {p0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v5

    .line 166
    :try_start_0
    invoke-virtual {v5}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/security/cert/X509CertSelector;->setSubject([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v1, v2

    move-object v3, v2

    move-object v0, v2

    .line 174
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    if-nez v0, :cond_4

    .line 176
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/TrustAnchor;

    .line 177
    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v7

    if-eqz v7, :cond_1

    .line 179
    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/security/cert/X509CertSelector;->match(Ljava/security/cert/Certificate;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 181
    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getTrustedCert()Ljava/security/cert/X509Certificate;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    move-object v9, v3

    move-object v3, v0

    move-object v0, v9

    .line 213
    :goto_1
    if-eqz v0, :cond_6

    .line 217
    :try_start_1
    invoke-static {p0, v0, p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object v9, v0

    move-object v0, v3

    move-object v3, v9

    .line 224
    goto :goto_0

    .line 168
    :catch_0
    move-exception v0

    .line 170
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot set subject search criteria for trust anchor."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    move-object v0, v3

    move-object v3, v2

    .line 185
    goto :goto_1

    .line 188
    :cond_1
    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAPublicKey()Ljava/security/PublicKey;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 193
    :try_start_2
    new-instance v7, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAName()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-virtual {v5, v7}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 196
    invoke-virtual {v0}, Ljava/security/cert/TrustAnchor;->getCAPublicKey()Ljava/security/PublicKey;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v3

    move-object v9, v3

    move-object v3, v0

    move-object v0, v9

    goto :goto_1

    :cond_2
    move-object v0, v3

    move-object v3, v2

    .line 206
    goto :goto_1

    :catch_1
    move-exception v0

    :cond_3
    move-object v0, v3

    move-object v3, v2

    .line 205
    goto :goto_1

    .line 219
    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v3, v2

    move-object v0, v2

    .line 224
    goto :goto_0

    .line 228
    :cond_4
    if-nez v0, :cond_5

    if-eqz v1, :cond_5

    .line 230
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "TrustAnchor found but certificate validation failed."

    invoke-direct {v0, v2, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 233
    :cond_5
    return-object v0

    :cond_6
    move-object v9, v0

    move-object v0, v3

    move-object v3, v9

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;)Ljava/util/Collection;
    .locals 4

    .prologue
    .line 1372
    new-instance v0, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v0}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 1373
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1376
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v2}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubject([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1388
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1390
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->getCertStores()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1391
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->f()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1392
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1394
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 1401
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1404
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 1407
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1378
    :catch_0
    move-exception v0

    .line 1380
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Subject criteria for certificate selector to find issuer certificate could not be set."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1396
    :catch_1
    move-exception v0

    .line 1398
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuer certificate cannot be searched."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1409
    :cond_0
    return-object v1
.end method

.method protected static a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;Ljava/util/List;)Ljava/util/Collection;
    .locals 4

    .prologue
    .line 758
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 759
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 761
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 763
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 765
    instance-of v3, v0, Lorg/spongycastle/x509/X509Store;

    if-eqz v3, :cond_0

    .line 767
    check-cast v0, Lorg/spongycastle/x509/X509Store;

    .line 770
    :try_start_0
    invoke-virtual {v0, p0}, Lorg/spongycastle/x509/X509Store;->a(Lorg/spongycastle/util/Selector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/spongycastle/util/StoreException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 772
    :catch_0
    move-exception v0

    .line 774
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Problem while picking certificates from X.509 store."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 779
    :cond_1
    return-object v1
.end method

.method protected static a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;
    .locals 4

    .prologue
    .line 715
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 716
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 718
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 720
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 722
    instance-of v3, v0, Lorg/spongycastle/x509/X509Store;

    if-eqz v3, :cond_0

    .line 724
    check-cast v0, Lorg/spongycastle/x509/X509Store;

    .line 727
    :try_start_0
    invoke-virtual {v0, p0}, Lorg/spongycastle/x509/X509Store;->a(Lorg/spongycastle/util/Selector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/spongycastle/util/StoreException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 729
    :catch_0
    move-exception v0

    .line 731
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Problem while picking certificates from X.509 store."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 734
    :cond_0
    check-cast v0, Ljava/security/cert/CertStore;

    .line 741
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/security/cert/CertStore;->getCertificates(Ljava/security/cert/CertSelector;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Ljava/security/cert/CertStoreException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 743
    :catch_1
    move-exception v0

    .line 745
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Problem while picking certificates from certificate store."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 750
    :cond_1
    return-object v1
.end method

.method protected static a(Ljava/security/cert/PKIXParameters;)Ljava/util/Date;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0}, Ljava/security/cert/PKIXParameters;->getDate()Ljava/util/Date;

    move-result-object v0

    .line 283
    if-nez v0, :cond_0

    .line 285
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 288
    :cond_0
    return-object v0
.end method

.method protected static a(Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/CertPath;I)Ljava/util/Date;
    .locals 3

    .prologue
    .line 1233
    invoke-virtual {p0}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 1236
    if-gtz p2, :cond_0

    .line 1238
    invoke-static {p0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/PKIXParameters;)Ljava/util/Date;

    move-result-object v0

    .line 1289
    :goto_0
    return-object v0

    .line 1243
    :cond_0
    add-int/lit8 v0, p2, -0x1

    if-nez v0, :cond_2

    .line 1245
    const/4 v1, 0x0

    .line 1248
    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    add-int/lit8 v2, p2, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    sget-object v2, Lorg/spongycastle/asn1/isismtt/ISISMTTObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/security/cert/X509Certificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    .line 1249
    if-eqz v0, :cond_4

    .line 1251
    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERGeneralizedTime;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1GeneralizedTime;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 1264
    :goto_1
    if-eqz v0, :cond_1

    .line 1268
    :try_start_1
    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERGeneralizedTime;->d()Ljava/util/Date;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    goto :goto_0

    .line 1256
    :catch_0
    move-exception v0

    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Date of cert gen extension could not be read."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1261
    :catch_1
    move-exception v0

    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "Date of cert gen extension could not be read."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1270
    :catch_2
    move-exception v0

    .line 1272
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Date from date of cert gen extension could not be parsed."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1277
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

    .line 1282
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

    .line 1289
    :cond_3
    invoke-static {p0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/PKIXParameters;)Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_1
.end method

.method protected static a(Ljava/util/Date;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/X509CRL;)Ljava/util/Set;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1076
    new-instance v2, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v2}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 1081
    :try_start_0
    invoke-virtual {p2}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/spongycastle/x509/X509CRLStoreSelector;->addIssuerName([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1092
    :try_start_1
    sget-object v0, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->o:Ljava/lang/String;

    invoke-static {p2, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 1094
    if-eqz v0, :cond_4

    .line 1096
    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->d()Ljava/math/BigInteger;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 1106
    :goto_0
    :try_start_2
    sget-object v3, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->i:Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/security/cert/X509CRL;->getExtensionValue(Ljava/lang/String;)[B
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    .line 1120
    if-nez v0, :cond_1

    :goto_1
    invoke-virtual {v2, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setMinCRLNumber(Ljava/math/BigInteger;)V

    .line 1123
    invoke-virtual {v2, v3}, Lorg/spongycastle/x509/X509CRLStoreSelector;->a([B)V

    .line 1124
    invoke-virtual {v2}, Lorg/spongycastle/x509/X509CRLStoreSelector;->a()V

    .line 1127
    invoke-virtual {v2, v0}, Lorg/spongycastle/x509/X509CRLStoreSelector;->a(Ljava/math/BigInteger;)V

    .line 1130
    invoke-static {v2, p1, p0}, Lorg/spongycastle/jce/provider/PKIXCRLUtil;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;)Ljava/util/Set;

    move-result-object v0

    .line 1132
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1134
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1136
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509CRL;

    .line 1138
    invoke-virtual {v0}, Ljava/security/cert/X509CRL;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_0

    .line 1140
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1084
    :catch_0
    move-exception v0

    .line 1086
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot extract issuer from CRL."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1099
    :catch_1
    move-exception v0

    .line 1101
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL number extension could not be extracted from CRL."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1111
    :catch_2
    move-exception v0

    .line 1113
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Issuing distribution point extension value could not be read."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1120
    :cond_1
    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    goto :goto_1

    .line 1138
    :cond_2
    sget-object v4, Lorg/spongycastle/jce/provider/RFC3280CertPathUtilities;->f:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_3

    .line 1144
    :cond_3
    return-object v2

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method protected static final a(Lorg/spongycastle/asn1/ASN1Sequence;)Ljava/util/Set;
    .locals 6

    .prologue
    .line 375
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 377
    if-nez p0, :cond_0

    move-object v0, v1

    .line 403
    :goto_0
    return-object v0

    .line 382
    :cond_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 383
    new-instance v3, Lorg/spongycastle/asn1/ASN1OutputStream;

    invoke-direct {v3, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 385
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v4

    .line 387
    :goto_1
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 391
    :try_start_0
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v3, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 393
    new-instance v0, Ljava/security/cert/PolicyQualifierInfo;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/security/cert/PolicyQualifierInfo;-><init>([B)V

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 400
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->reset()V

    goto :goto_1

    .line 395
    :catch_0
    move-exception v0

    .line 397
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Policy qualifier info cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    move-object v0, v1

    .line 403
    goto :goto_0
.end method

.method protected static a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/lang/Object;Ljava/util/Date;Lorg/spongycastle/x509/ExtendedPKIXParameters;)Ljava/util/Set;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 1177
    new-instance v2, Lorg/spongycastle/x509/X509CRLStoreSelector;

    invoke-direct {v2}, Lorg/spongycastle/x509/X509CRLStoreSelector;-><init>()V

    .line 1180
    :try_start_0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 1181
    instance-of v1, p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_1

    .line 1183
    move-object v0, p1

    check-cast v0, Lorg/spongycastle/x509/X509AttributeCertificate;

    move-object v1, v0

    invoke-interface {v1}, Lorg/spongycastle/x509/X509AttributeCertificate;->d()Lorg/spongycastle/x509/AttributeCertificateIssuer;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v1

    const/4 v4, 0x0

    aget-object v1, v1, v4

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1190
    :goto_0
    invoke-static {p0, v3, v2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/util/Collection;Ljava/security/cert/X509CRLSelector;)V
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1197
    instance-of v1, p1, Ljava/security/cert/X509Certificate;

    if-eqz v1, :cond_2

    move-object v1, p1

    .line 1199
    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->setCertificateChecking(Ljava/security/cert/X509Certificate;)V

    .line 1207
    :cond_0
    :goto_1
    invoke-virtual {v2}, Lorg/spongycastle/x509/X509CRLStoreSelector;->d()V

    .line 1209
    invoke-static {v2, p3, p2}, Lorg/spongycastle/jce/provider/PKIXCRLUtil;->a(Lorg/spongycastle/x509/X509CRLStoreSelector;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;)Ljava/util/Set;

    move-result-object v1

    .line 1211
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1213
    instance-of v1, p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_3

    .line 1215
    check-cast p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 1217
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No CRLs found for issuer \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lorg/spongycastle/x509/X509AttributeCertificate;->d()Lorg/spongycastle/x509/AttributeCertificateIssuer;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v3

    aget-object v3, v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1188
    :cond_1
    :try_start_1
    invoke-static {p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 1192
    :catch_0
    move-exception v1

    .line 1194
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Could not get issuer information from distribution point."

    invoke-direct {v2, v3, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 1201
    :cond_2
    instance-of v1, p1, Lorg/spongycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_0

    move-object v1, p1

    .line 1203
    check-cast v1, Lorg/spongycastle/x509/X509AttributeCertificate;

    invoke-virtual {v2, v1}, Lorg/spongycastle/x509/X509CRLStoreSelector;->a(Lorg/spongycastle/x509/X509AttributeCertificate;)V

    goto :goto_1

    .line 1221
    :cond_3
    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 1223
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

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

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1226
    :cond_4
    return-object v1
.end method

.method protected static a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;
    .locals 2

    .prologue
    .line 269
    instance-of v0, p0, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_0

    .line 271
    check-cast p0, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    .line 275
    :goto_0
    return-object v0

    :cond_0
    check-cast p0, Lorg/spongycastle/x509/X509AttributeCertificate;

    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->d()Lorg/spongycastle/x509/AttributeCertificateIssuer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509CRL;)Ljavax/security/auth/x500/X500Principal;
    .locals 1

    .prologue
    .line 344
    invoke-virtual {p0}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;)Ljavax/security/auth/x500/X500Principal;
    .locals 1

    .prologue
    .line 293
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;[B)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 330
    :try_start_0
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 331
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    .line 333
    new-instance v1, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 334
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 336
    :catch_0
    move-exception v0

    .line 338
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception processing extension "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 314
    invoke-interface {p0, p1}, Ljava/security/cert/X509Extension;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    .line 315
    if-nez v0, :cond_0

    .line 317
    const/4 v0, 0x0

    .line 320
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/String;[B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0
.end method

.method protected static a(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    .locals 3

    .prologue
    .line 353
    :try_start_0
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-interface {p0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 355
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    .line 357
    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->d()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 359
    :catch_0
    move-exception v0

    .line 361
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Subject public key cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;[Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)Lorg/spongycastle/jce/provider/PKIXPolicyNode;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 411
    invoke-virtual {p2}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getParent()Ljava/security/cert/PolicyNode;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 413
    if-nez p0, :cond_0

    move-object p0, v1

    .line 432
    :goto_0
    return-object p0

    .line 418
    :cond_0
    if-nez v0, :cond_2

    .line 420
    const/4 v0, 0x0

    :goto_1
    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 422
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    aput-object v2, p1, v0

    .line 420
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object p0, v1

    .line 425
    goto :goto_0

    .line 429
    :cond_2
    invoke-virtual {v0, p2}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->b(Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    .line 430
    invoke-static {p1, p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a([Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 5

    .prologue
    .line 654
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 658
    :try_start_0
    const-string v0, "ldap://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 663
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 665
    const/4 v0, 0x0

    .line 666
    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 669
    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 671
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

    .line 679
    :goto_0
    new-instance v2, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;

    invoke-direct {v2, v1, v0}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->a()Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    move-result-object v0

    .line 681
    const-string v1, "CERTIFICATE/LDAP"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/spongycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/spongycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/spongycastle/x509/X509Store;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->a(Lorg/spongycastle/util/Store;)V

    .line 683
    const-string v1, "CRL/LDAP"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/spongycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/spongycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/spongycastle/x509/X509Store;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->a(Lorg/spongycastle/util/Store;)V

    .line 685
    const-string v1, "ATTRIBUTECERTIFICATE/LDAP"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/spongycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/spongycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/spongycastle/x509/X509Store;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->a(Lorg/spongycastle/util/Store;)V

    .line 687
    const-string v1, "CERTIFICATEPAIR/LDAP"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lorg/spongycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/spongycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/spongycastle/x509/X509Store;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->a(Lorg/spongycastle/util/Store;)V

    .line 697
    :cond_0
    return-void

    .line 676
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

    .line 694
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exception adding X.509 stores."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Ljava/security/PublicKey;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1416
    if-nez p2, :cond_0

    .line 1418
    invoke-virtual {p0, p1}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;)V

    .line 1424
    :goto_0
    return-void

    .line 1422
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected static a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 5

    .prologue
    .line 243
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerAlternativeNames()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 245
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerAlternativeNames()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 246
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 250
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/lang/Integer;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 253
    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 254
    invoke-static {v0, p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/String;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    goto :goto_0

    .line 258
    :cond_1
    return-void
.end method

.method protected static a(Ljava/util/Date;Ljava/security/cert/X509CRL;Ljava/lang/Object;Lorg/spongycastle/jce/provider/c;)V
    .locals 6

    .prologue
    .line 972
    :try_start_0
    invoke-static {p1}, Lorg/spongycastle/jce/provider/X509CRLObject;->a(Ljava/security/cert/X509CRL;)Z
    :try_end_0
    .catch Ljava/security/cert/CRLException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 984
    if-eqz v0, :cond_6

    .line 986
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/lang/Object;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/cert/X509CRL;->getRevokedCertificate(Ljava/math/BigInteger;)Ljava/security/cert/X509CRLEntry;

    move-result-object v1

    .line 988
    if-nez v1, :cond_1

    .line 1059
    :cond_0
    :goto_0
    return-void

    .line 979
    :catch_0
    move-exception v0

    .line 981
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Failed check for indirect CRL."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 993
    :cond_1
    invoke-virtual {v1}, Ljava/security/cert/X509CRLEntry;->getCertificateIssuer()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    .line 995
    if-nez v0, :cond_2

    .line 997
    invoke-virtual {p1}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    .line 1000
    :cond_2
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 1019
    :cond_3
    const/4 v1, 0x0

    .line 1020
    invoke-virtual {v0}, Ljava/security/cert/X509CRLEntry;->hasExtensions()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1024
    :try_start_1
    sget-object v1, Lorg/spongycastle/asn1/x509/X509Extension;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Extension;Ljava/lang/String;)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DEREnumerated;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Enumerated;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 1039
    :cond_4
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/security/cert/X509CRLEntry;->getRevocationDate()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_5

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DEREnumerated;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DEREnumerated;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_5

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DEREnumerated;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_5

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DEREnumerated;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    .line 1048
    :cond_5
    if-eqz v1, :cond_7

    .line 1050
    invoke-virtual {v1}, Lorg/spongycastle/asn1/DEREnumerated;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    iput v1, p3, Lorg/spongycastle/jce/provider/c;->a:I

    .line 1057
    :goto_1
    invoke-virtual {v0}, Ljava/security/cert/X509CRLEntry;->getRevocationDate()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p3, Lorg/spongycastle/jce/provider/c;->b:Ljava/util/Date;

    goto/16 :goto_0

    .line 1005
    :cond_6
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/Object;)Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {p1}, Ljava/security/cert/X509CRL;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1011
    invoke-static {p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->b(Ljava/lang/Object;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/cert/X509CRL;->getRevokedCertificate(Ljava/math/BigInteger;)Ljava/security/cert/X509CRLEntry;

    move-result-object v0

    .line 1013
    if-nez v0, :cond_3

    goto/16 :goto_0

    .line 1029
    :catch_1
    move-exception v0

    .line 1031
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Reason code CRL entry extension could not be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1055
    :cond_7
    const/4 v1, 0x0

    iput v1, p3, Lorg/spongycastle/jce/provider/c;->a:I

    goto :goto_1
.end method

.method protected static a(Lorg/spongycastle/asn1/x509/CRLDistPoint;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 786
    if-eqz p0, :cond_2

    .line 788
    :try_start_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/CRLDistPoint;->c()[Lorg/spongycastle/asn1/x509/DistributionPoint;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    move v0, v1

    .line 798
    :goto_0
    array-length v2, v3

    if-ge v0, v2, :cond_2

    .line 800
    aget-object v2, v3, v0

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/DistributionPoint;->c()Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v2

    .line 802
    if-eqz v2, :cond_1

    .line 804
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/DistributionPointName;->c()I

    move-result v4

    if-nez v4, :cond_1

    .line 806
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/DistributionPointName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v4

    move v2, v1

    .line 809
    :goto_1
    array-length v5, v4

    if-ge v2, v5, :cond_1

    .line 811
    aget-object v5, v4, v2

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v5

    const/4 v6, 0x6

    if-ne v5, v6, :cond_0

    .line 813
    aget-object v5, v4, v2

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v5

    invoke-static {v5}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v5

    invoke-virtual {v5}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v5

    .line 815
    invoke-static {v5, p1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/lang/String;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 809
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 793
    :catch_0
    move-exception v0

    .line 795
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Distribution points could not be read."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 798
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 824
    :cond_2
    return-void
.end method

.method private static a(Lorg/spongycastle/asn1/x509/DistributionPoint;Ljava/util/Collection;Ljava/security/cert/X509CRLSelector;)V
    .locals 5

    .prologue
    .line 852
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 854
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 856
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->e()Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralNames;->c()[Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v2

    .line 858
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_3

    .line 860
    aget-object v3, v2, v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    .line 864
    :try_start_0
    new-instance v3, Ljavax/security/auth/x500/X500Principal;

    aget-object v4, v2, v0

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-interface {v4}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1Primitive;->b()[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 858
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 867
    :catch_0
    move-exception v0

    .line 869
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "CRL issuer information from distribution point cannot be decoded."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 882
    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/DistributionPoint;->c()Lorg/spongycastle/asn1/x509/DistributionPointName;

    move-result-object v0

    if-nez v0, :cond_2

    .line 884
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v1, "CRL issuer is omitted from distribution point but no distributionPoint field present."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 888
    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 890
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 937
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 938
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 942
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

    .line 944
    :catch_1
    move-exception v0

    .line 946
    new-instance v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "Cannot decode CRL issuer information."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 950
    :cond_4
    return-void
.end method

.method private static a([Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V
    .locals 2

    .prologue
    .line 440
    invoke-virtual {p1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getDepth()I

    move-result v0

    aget-object v0, p0, v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 442
    invoke-virtual {p1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 444
    invoke-virtual {p1}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getChildren()Ljava/util/Iterator;

    move-result-object v1

    .line 445
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 448
    invoke-static {p0, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a([Ljava/util/List;Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    goto :goto_0

    .line 451
    :cond_0
    return-void
.end method

.method protected static a(I[Ljava/util/List;Lorg/spongycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)Z
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 460
    add-int/lit8 v0, p0, -0x1

    aget-object v1, p1, v0

    move v0, v7

    .line 462
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 464
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 465
    invoke-virtual {v4}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getExpectedPolicies()Ljava/util/Set;

    move-result-object v2

    .line 467
    invoke-virtual {p2}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 469
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 470
    invoke-virtual {p2}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 472
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v6

    move v2, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    .line 479
    invoke-virtual {v4, v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    .line 480
    aget-object v1, p1, p0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 482
    const/4 v7, 0x1

    .line 486
    :cond_0
    return v7

    .line 462
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected static a(Ljava/util/Set;)Z
    .locals 1

    .prologue
    .line 648
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

.method private static b(Ljava/lang/Object;)Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 955
    instance-of v0, p0, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_0

    .line 957
    check-cast p0, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    .line 961
    :goto_0
    return-object v0

    :cond_0
    check-cast p0, Lorg/spongycastle/x509/X509AttributeCertificate;

    invoke-interface {p0}, Lorg/spongycastle/x509/X509AttributeCertificate;->a()Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method

.method protected static b(I[Ljava/util/List;Lorg/spongycastle/asn1/DERObjectIdentifier;Ljava/util/Set;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 495
    add-int/lit8 v0, p0, -0x1

    aget-object v1, p1, v0

    move v0, v7

    .line 497
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 499
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    .line 501
    const-string v2, "2.5.29.32.0"

    invoke-virtual {v4}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->getValidPolicy()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 503
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 504
    invoke-virtual {p2}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 506
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXPolicyNode;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v6

    move v2, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;-><init>(Ljava/util/List;ILjava/util/Set;Ljava/security/cert/PolicyNode;Ljava/util/Set;Ljava/lang/String;Z)V

    .line 513
    invoke-virtual {v4, v0}, Lorg/spongycastle/jce/provider/PKIXPolicyNode;->a(Lorg/spongycastle/jce/provider/PKIXPolicyNode;)V

    .line 514
    aget-object v1, p1, p0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 518
    :cond_0
    return-void

    .line 497
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected static b(Ljava/security/cert/X509Certificate;)Z
    .locals 2

    .prologue
    .line 298
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
