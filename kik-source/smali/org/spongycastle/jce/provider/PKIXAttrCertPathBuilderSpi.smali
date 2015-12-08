.class public Lorg/spongycastle/jce/provider/PKIXAttrCertPathBuilderSpi;
.super Ljava/security/cert/CertPathBuilderSpi;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/security/cert/CertPathBuilderSpi;-><init>()V

    return-void
.end method

.method private a(Lorg/spongycastle/x509/X509AttributeCertificate;Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;Ljava/util/List;)Ljava/security/cert/CertPathBuilderResult;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 171
    invoke-interface {p4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 300
    :cond_0
    :goto_0
    return-object v0

    .line 177
    :cond_1
    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 179
    goto :goto_0

    .line 182
    :cond_2
    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    .line 184
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b()I

    move-result v2

    if-le v0, v2, :cond_3

    move-object v0, v1

    .line 186
    goto :goto_0

    .line 190
    :cond_3
    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    :try_start_0
    const-string v0, "X.509"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    .line 199
    const-string v2, "RFC3281"

    sget-object v3, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/security/cert/CertPathValidator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathValidator;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 211
    :try_start_1
    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p3}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->getSigProvider()Ljava/lang/String;

    move-result-object v4

    invoke-static {p2, v3, v4}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Ljava/util/Set;Ljava/lang/String;)Ljava/security/cert/TrustAnchor;
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v3

    if-eqz v3, :cond_4

    .line 218
    :try_start_2
    invoke-virtual {v0, p4}, Ljava/security/cert/CertificateFactory;->generateCertPath(Ljava/util/List;)Ljava/security/cert/CertPath;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    .line 229
    :try_start_3
    invoke-virtual {v2, v3, p3}, Ljava/security/cert/CertPathValidator;->validate(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;

    move-result-object v0

    check-cast v0, Ljava/security/cert/PKIXCertPathValidatorResult;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 239
    :try_start_4
    new-instance v2, Ljava/security/cert/PKIXCertPathBuilderResult;

    invoke-virtual {v0}, Ljava/security/cert/PKIXCertPathValidatorResult;->getTrustAnchor()Ljava/security/cert/TrustAnchor;

    move-result-object v4

    invoke-virtual {v0}, Ljava/security/cert/PKIXCertPathValidatorResult;->getPolicyTree()Ljava/security/cert/PolicyNode;

    move-result-object v5

    invoke-virtual {v0}, Ljava/security/cert/PKIXCertPathValidatorResult;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-direct {v2, v3, v4, v5, v0}, Ljava/security/cert/PKIXCertPathBuilderResult;-><init>(Ljava/security/cert/CertPath;Ljava/security/cert/TrustAnchor;Ljava/security/cert/PolicyNode;Ljava/security/PublicKey;)V
    :try_end_4
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_4 .. :try_end_4} :catch_2

    move-object v0, v2

    goto :goto_0

    .line 204
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exception creating support classes."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :catch_1
    move-exception v0

    .line 222
    :try_start_5
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Certification path could not be constructed from certificate list."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_5 .. :try_end_5} :catch_2

    .line 291
    :catch_2
    move-exception v0

    .line 293
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "No valid certification path could be build."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v2, p0, Lorg/spongycastle/jce/provider/PKIXAttrCertPathBuilderSpi;->a:Ljava/lang/Exception;

    move-object v0, v1

    .line 296
    :goto_1
    if-nez v0, :cond_0

    .line 298
    invoke-interface {p4, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 232
    :catch_3
    move-exception v0

    .line 234
    :try_start_6
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Certification path could not be validated."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_6 .. :try_end_6} :catch_2

    .line 249
    :cond_4
    :try_start_7
    invoke-static {p2, p3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    :try_end_7
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_7 .. :try_end_7} :catch_2

    .line 257
    :try_start_8
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
    :try_end_8
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_8 .. :try_end_8} :catch_2

    .line 262
    :try_start_9
    invoke-static {p2, p3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z
    :try_end_9
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_9 .. :try_end_9} :catch_5

    .line 270
    :try_start_a
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 272
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "No issuer certificate for certificate in certification path found."

    invoke-direct {v0, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 251
    :catch_4
    move-exception v0

    .line 253
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "No additional X.509 stores can be added from certificate locations."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 264
    :catch_5
    move-exception v0

    .line 266
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Cannot find issuer certificate for certificate in certification path."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 275
    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 277
    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    if-nez v1, :cond_7

    .line 279
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 282
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 285
    invoke-direct {p0, p1, v0, p3, p4}, Lorg/spongycastle/jce/provider/PKIXAttrCertPathBuilderSpi;->a(Lorg/spongycastle/x509/X509AttributeCertificate;Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;Ljava/util/List;)Ljava/security/cert/CertPathBuilderResult;
    :try_end_a
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_a .. :try_end_a} :catch_2

    move-result-object v1

    goto :goto_2

    :cond_7
    move-object v0, v1

    .line 295
    goto :goto_1
.end method


# virtual methods
.method public engineBuild(Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathBuilderResult;
    .locals 9

    .prologue
    .line 47
    instance-of v0, p1, Ljava/security/cert/PKIXBuilderParameters;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Parameters must be an instance of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Ljava/security/cert/PKIXBuilderParameters;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " or "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    if-eqz v0, :cond_1

    .line 60
    check-cast p1, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    .line 70
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 75
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->h()Lorg/spongycastle/util/Selector;

    move-result-object v0

    .line 76
    instance-of v1, v0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    if-nez v1, :cond_2

    .line 78
    new-instance v0, Ljava/security/cert/CertPathBuilderException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TargetConstraints must be an instance of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " class."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_1
    check-cast p1, Ljava/security/cert/PKIXBuilderParameters;

    invoke-static {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b(Ljava/security/cert/PKIXParameters;)Lorg/spongycastle/x509/ExtendedPKIXParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    move-object p1, v0

    goto :goto_0

    .line 86
    :cond_2
    :try_start_0
    check-cast v0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509AttributeCertStoreSelector;Ljava/util/List;)Ljava/util/Collection;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 93
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 95
    new-instance v0, Ljava/security/cert/CertPathBuilderException;

    const-string v1, "No attribute certificate found matching targetContraints."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :catch_0
    move-exception v0

    .line 90
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;

    const-string v2, "Error finding target attribute certificate."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 99
    :cond_3
    const/4 v2, 0x0

    .line 102
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 103
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    if-nez v2, :cond_8

    .line 105
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/spongycastle/x509/X509AttributeCertificate;

    .line 107
    new-instance v6, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v6}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 108
    invoke-interface {v1}, Lorg/spongycastle/x509/X509AttributeCertificate;->d()Lorg/spongycastle/x509/AttributeCertificateIssuer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/x509/AttributeCertificateIssuer;->a()[Ljava/security/Principal;

    move-result-object v7

    .line 109
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 110
    const/4 v0, 0x0

    move v3, v0

    :goto_2
    array-length v0, v7

    if-ge v3, v0, :cond_5

    .line 114
    :try_start_1
    aget-object v0, v7, v3

    instance-of v0, v0, Ljavax/security/auth/x500/X500Principal;

    if-eqz v0, :cond_4

    .line 116
    aget-object v0, v7, v3

    check-cast v0, Ljavax/security/auth/x500/X500Principal;

    invoke-virtual {v0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubject([B)V

    .line 118
    :cond_4
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v6, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 119
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->getCertStores()Ljava/util/List;

    move-result-object v0

    invoke-static {v6, v0}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 110
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    .line 121
    :catch_1
    move-exception v0

    .line 123
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;

    const-string v2, "Public key certificate for attribute certificate cannot be searched."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 127
    :catch_2
    move-exception v0

    .line 129
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;

    const-string v2, "cannot encode X500Principal."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 134
    :cond_5
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 136
    new-instance v0, Ljava/security/cert/CertPathBuilderException;

    const-string v1, "Public key certificate for attribute certificate cannot be found."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_6
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v0, v2

    .line 140
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    if-nez v0, :cond_7

    .line 142
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-direct {p0, v1, v0, p1, v4}, Lorg/spongycastle/jce/provider/PKIXAttrCertPathBuilderSpi;->a(Lorg/spongycastle/x509/X509AttributeCertificate;Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;Ljava/util/List;)Ljava/security/cert/CertPathBuilderResult;

    move-result-object v0

    goto :goto_3

    :cond_7
    move-object v2, v0

    .line 144
    goto/16 :goto_1

    .line 146
    :cond_8
    if-nez v2, :cond_9

    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXAttrCertPathBuilderSpi;->a:Ljava/lang/Exception;

    if-eqz v0, :cond_9

    .line 148
    new-instance v0, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;

    const-string v1, "Possible certificate chain could not be validated."

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXAttrCertPathBuilderSpi;->a:Ljava/lang/Exception;

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 153
    :cond_9
    if-nez v2, :cond_a

    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXAttrCertPathBuilderSpi;->a:Ljava/lang/Exception;

    if-nez v0, :cond_a

    .line 155
    new-instance v0, Ljava/security/cert/CertPathBuilderException;

    const-string v1, "Unable to find certificate chain."

    invoke-direct {v0, v1}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_a
    return-object v2
.end method
