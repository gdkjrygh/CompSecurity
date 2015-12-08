.class public Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;
.super Ljava/security/cert/CertPathBuilderSpi;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/security/cert/CertPathBuilderSpi;-><init>()V

    return-void
.end method

.method private a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;Ljava/util/List;)Ljava/security/cert/CertPathBuilderResult;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 136
    invoke-interface {p3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 258
    :cond_0
    :goto_0
    return-object v0

    .line 142
    :cond_1
    invoke-virtual {p2}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 144
    goto :goto_0

    .line 147
    :cond_2
    invoke-virtual {p2}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    .line 149
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b()I

    move-result v2

    if-le v0, v2, :cond_3

    move-object v0, v1

    .line 151
    goto :goto_0

    .line 155
    :cond_3
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    :try_start_0
    const-string v0, "X.509"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    .line 164
    const-string v2, "PKIX"

    sget-object v3, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/security/cert/CertPathValidator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertPathValidator;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 175
    :try_start_1
    invoke-virtual {p2}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->getTrustAnchors()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p2}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->getSigProvider()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v3, v4}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Ljava/util/Set;Ljava/lang/String;)Ljava/security/cert/TrustAnchor;
    :try_end_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v3

    if-eqz v3, :cond_4

    .line 180
    :try_start_2
    invoke-virtual {v0, p3}, Ljava/security/cert/CertificateFactory;->generateCertPath(Ljava/util/List;)Ljava/security/cert/CertPath;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    .line 195
    :try_start_3
    invoke-virtual {v2, v3, p2}, Ljava/security/cert/CertPathValidator;->validate(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;

    move-result-object v0

    check-cast v0, Ljava/security/cert/PKIXCertPathValidatorResult;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 204
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

    .line 169
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exception creating support classes."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :catch_1
    move-exception v0

    .line 188
    :try_start_5
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Certification path could not be constructed from certificate list."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_5 .. :try_end_5} :catch_2

    .line 250
    :catch_2
    move-exception v0

    .line 252
    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a:Ljava/lang/Exception;

    move-object v0, v1

    .line 254
    :goto_1
    if-nez v0, :cond_0

    .line 256
    invoke-interface {p3, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 198
    :catch_3
    move-exception v0

    .line 200
    :try_start_6
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Certification path could not be validated."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_6 .. :try_end_6} :catch_2

    .line 214
    :cond_4
    :try_start_7
    invoke-static {p1, p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V
    :try_end_7
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_7 .. :try_end_7} :catch_2

    .line 223
    :try_start_8
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
    :try_end_8
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_8 .. :try_end_8} :catch_2

    .line 228
    :try_start_9
    invoke-static {p1, p2}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z
    :try_end_9
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_9 .. :try_end_9} :catch_5

    .line 236
    :try_start_a
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 238
    new-instance v0, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v2, "No issuer certificate for certificate in certification path found."

    invoke-direct {v0, v2}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 217
    :catch_4
    move-exception v0

    .line 219
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "No additiontal X.509 stores can be added from certificate locations."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 230
    :catch_5
    move-exception v0

    .line 232
    new-instance v2, Lorg/spongycastle/jce/provider/AnnotatedException;

    const-string v3, "Cannot find issuer certificate for certificate in certification path."

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 241
    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 243
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez v1, :cond_6

    .line 245
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 246
    invoke-direct {p0, v0, p2, p3}, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;Ljava/util/List;)Ljava/security/cert/CertPathBuilderResult;
    :try_end_a
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_a .. :try_end_a} :catch_2

    move-result-object v1

    goto :goto_2

    :cond_6
    move-object v0, v1

    .line 253
    goto :goto_1
.end method


# virtual methods
.method public engineBuild(Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathBuilderResult;
    .locals 5

    .prologue
    .line 44
    instance-of v1, p1, Ljava/security/cert/PKIXBuilderParameters;

    if-nez v1, :cond_0

    instance-of v1, p1, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Parameters must be an instance of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v3, Ljava/security/cert/PKIXBuilderParameters;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " or "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-class v3, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 53
    :cond_0
    instance-of v1, p1, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    if-eqz v1, :cond_1

    .line 56
    check-cast p1, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    .line 66
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 71
    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->h()Lorg/spongycastle/util/Selector;

    move-result-object v2

    .line 72
    instance-of v1, v2, Lorg/spongycastle/x509/X509CertStoreSelector;

    if-nez v1, :cond_2

    .line 74
    new-instance v1, Ljava/security/cert/CertPathBuilderException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TargetConstraints must be an instance of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v3, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " class."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 60
    :cond_1
    check-cast p1, Ljava/security/cert/PKIXBuilderParameters;

    invoke-static {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->b(Ljava/security/cert/PKIXParameters;)Lorg/spongycastle/x509/ExtendedPKIXParameters;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;

    move-object p1, v1

    goto :goto_0

    .line 82
    :cond_2
    :try_start_0
    move-object v0, v2

    check-cast v0, Lorg/spongycastle/x509/X509CertStoreSelector;

    move-object v1, v0

    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->f()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v4}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v4

    .line 83
    check-cast v2, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-virtual {p1}, Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;->getCertStores()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/X509CertStoreSelector;Ljava/util/List;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 94
    new-instance v1, Ljava/security/cert/CertPathBuilderException;

    const-string v2, "No certificate found matching targetContraints."

    invoke-direct {v1, v2}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 85
    :catch_0
    move-exception v1

    .line 87
    new-instance v2, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;

    const-string v3, "Error finding target certificate."

    invoke-direct {v2, v3, v1}, Lorg/spongycastle/jce/exception/ExtCertPathBuilderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 98
    :cond_3
    const/4 v1, 0x0

    .line 101
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 102
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    if-nez v1, :cond_4

    .line 104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 105
    invoke-direct {p0, v1, p1, v3}, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXBuilderParameters;Ljava/util/List;)Ljava/security/cert/CertPathBuilderResult;

    move-result-object v1

    goto :goto_1

    .line 108
    :cond_4
    if-nez v1, :cond_6

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a:Ljava/lang/Exception;

    if-eqz v2, :cond_6

    .line 110
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a:Ljava/lang/Exception;

    instance-of v1, v1, Lorg/spongycastle/jce/provider/AnnotatedException;

    if-eqz v1, :cond_5

    .line 112
    new-instance v1, Ljava/security/cert/CertPathBuilderException;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a:Ljava/lang/Exception;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a:Ljava/lang/Exception;

    invoke-virtual {v3}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 114
    :cond_5
    new-instance v1, Ljava/security/cert/CertPathBuilderException;

    const-string v2, "Possible certificate chain could not be validated."

    iget-object v3, p0, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a:Ljava/lang/Exception;

    invoke-direct {v1, v2, v3}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 119
    :cond_6
    if-nez v1, :cond_7

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXCertPathBuilderSpi;->a:Ljava/lang/Exception;

    if-nez v2, :cond_7

    .line 121
    new-instance v1, Ljava/security/cert/CertPathBuilderException;

    const-string v2, "Unable to find certificate chain."

    invoke-direct {v1, v2}, Ljava/security/cert/CertPathBuilderException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 125
    :cond_7
    return-object v1
.end method
