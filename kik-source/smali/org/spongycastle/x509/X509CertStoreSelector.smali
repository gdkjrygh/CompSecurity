.class public Lorg/spongycastle/x509/X509CertStoreSelector;
.super Ljava/security/cert/X509CertSelector;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/util/Selector;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/security/cert/X509CertSelector;-><init>()V

    return-void
.end method

.method public static a(Ljava/security/cert/X509CertSelector;)Lorg/spongycastle/x509/X509CertStoreSelector;
    .locals 4

    .prologue
    .line 54
    if-nez p0, :cond_0

    .line 56
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot create from null selector"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    new-instance v0, Lorg/spongycastle/x509/X509CertStoreSelector;

    invoke-direct {v0}, Lorg/spongycastle/x509/X509CertStoreSelector;-><init>()V

    .line 59
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getAuthorityKeyIdentifier()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setAuthorityKeyIdentifier([B)V

    .line 60
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getBasicConstraints()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setBasicConstraints(I)V

    .line 61
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setCertificate(Ljava/security/cert/X509Certificate;)V

    .line 62
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getCertificateValid()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setCertificateValid(Ljava/util/Date;)V

    .line 63
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getMatchAllSubjectAltNames()Z

    move-result v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setMatchAllSubjectAltNames(Z)V

    .line 66
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getPathToNames()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setPathToNames(Ljava/util/Collection;)V

    .line 67
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getExtendedKeyUsage()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setExtendedKeyUsage(Ljava/util/Set;)V

    .line 68
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getNameConstraints()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setNameConstraints([B)V

    .line 69
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getPolicy()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setPolicy(Ljava/util/Set;)V

    .line 70
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getSubjectPublicKeyAlgID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubjectPublicKeyAlgID(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubjectAlternativeNames(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getIssuer()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setIssuer(Ljavax/security/auth/x500/X500Principal;)V

    .line 78
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getKeyUsage()[Z

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setKeyUsage([Z)V

    .line 79
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getPrivateKeyValid()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setPrivateKeyValid(Ljava/util/Date;)V

    .line 80
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSerialNumber(Ljava/math/BigInteger;)V

    .line 81
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getSubject()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubject(Ljavax/security/auth/x500/X500Principal;)V

    .line 82
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getSubjectKeyIdentifier()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubjectKeyIdentifier([B)V

    .line 83
    invoke-virtual {p0}, Ljava/security/cert/X509CertSelector;->getSubjectPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/x509/X509CertStoreSelector;->setSubjectPublicKey(Ljava/security/PublicKey;)V

    .line 84
    return-object v0

    .line 73
    :catch_0
    move-exception v0

    .line 75
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error in passed in selector: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 23
    instance-of v0, p1, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    .line 25
    const/4 v0, 0x0

    .line 30
    :goto_0
    return v0

    .line 28
    :cond_0
    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 30
    invoke-super {p0, p1}, Ljava/security/cert/X509CertSelector;->match(Ljava/security/cert/Certificate;)Z

    move-result v0

    goto :goto_0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    invoke-super {p0}, Ljava/security/cert/X509CertSelector;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/x509/X509CertStoreSelector;

    .line 42
    return-object v0
.end method

.method public match(Ljava/security/cert/Certificate;)Z
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lorg/spongycastle/x509/X509CertStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
