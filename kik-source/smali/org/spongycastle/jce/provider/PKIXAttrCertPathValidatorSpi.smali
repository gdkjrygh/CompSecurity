.class public Lorg/spongycastle/jce/provider/PKIXAttrCertPathValidatorSpi;
.super Ljava/security/cert/CertPathValidatorSpi;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/security/cert/CertPathValidatorSpi;-><init>()V

    return-void
.end method


# virtual methods
.method public engineValidate(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;
    .locals 4

    .prologue
    .line 56
    instance-of v0, p2, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Parameters must be a "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " instance."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_0
    check-cast p2, Lorg/spongycastle/x509/ExtendedPKIXParameters;

    .line 64
    invoke-virtual {p2}, Lorg/spongycastle/x509/ExtendedPKIXParameters;->h()Lorg/spongycastle/util/Selector;

    move-result-object v0

    .line 65
    instance-of v1, v0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    if-nez v1, :cond_1

    .line 67
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

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

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_1
    check-cast v0, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;

    invoke-virtual {v0}, Lorg/spongycastle/x509/X509AttributeCertStoreSelector;->a()Lorg/spongycastle/x509/X509AttributeCertificate;

    move-result-object v1

    .line 75
    invoke-static {v1, p2}, Lorg/spongycastle/jce/provider/e;->d(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)Ljava/security/cert/CertPath;

    .line 76
    invoke-static {p1, p2}, Lorg/spongycastle/jce/provider/e;->a(Ljava/security/cert/CertPath;Lorg/spongycastle/x509/ExtendedPKIXParameters;)Ljava/security/cert/CertPathValidatorResult;

    move-result-object v2

    .line 77
    invoke-virtual {p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 79
    invoke-static {v0}, Lorg/spongycastle/jce/provider/e;->a(Ljava/security/cert/X509Certificate;)V

    .line 80
    invoke-static {v0, p2}, Lorg/spongycastle/jce/provider/e;->a(Ljava/security/cert/X509Certificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 81
    invoke-static {v1, p2}, Lorg/spongycastle/jce/provider/e;->c(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 83
    invoke-static {v1, p2}, Lorg/spongycastle/jce/provider/e;->a(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 84
    invoke-static {v1, p2}, Lorg/spongycastle/jce/provider/e;->b(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;)V

    .line 85
    const/4 v0, 0x0

    const/4 v3, -0x1

    :try_start_0
    invoke-static {p2, v0, v3}, Lorg/spongycastle/jce/provider/CertPathValidatorUtilities;->a(Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/security/cert/CertPath;I)Ljava/util/Date;
    :try_end_0
    .catch Lorg/spongycastle/jce/provider/AnnotatedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 96
    invoke-virtual {p1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, p2, v0, v3}, Lorg/spongycastle/jce/provider/e;->a(Lorg/spongycastle/x509/X509AttributeCertificate;Lorg/spongycastle/x509/ExtendedPKIXParameters;Ljava/util/Date;Ljava/util/List;)V

    .line 97
    return-object v2

    .line 91
    :catch_0
    move-exception v0

    .line 93
    new-instance v1, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;

    const-string v2, "Could not get validity date from attribute certificate."

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jce/exception/ExtCertPathValidatorException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
