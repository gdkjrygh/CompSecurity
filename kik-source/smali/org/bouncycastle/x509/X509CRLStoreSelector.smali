.class public Lorg/bouncycastle/x509/X509CRLStoreSelector;
.super Ljava/security/cert/X509CRLSelector;

# interfaces
.implements Lorg/bouncycastle/util/Selector;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ljava/math/BigInteger;

.field private d:[B

.field private e:Z

.field private f:Lorg/bouncycastle/x509/X509AttributeCertificate;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/security/cert/X509CRLSelector;-><init>()V

    iput-boolean v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a:Z

    iput-boolean v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->b:Z

    iput-object v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    iput-object v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->d:[B

    iput-boolean v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->e:Z

    return-void
.end method

.method private static a(Ljava/security/cert/X509CRLSelector;)Lorg/bouncycastle/x509/X509CRLStoreSelector;
    .locals 2

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot create from null selector"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/x509/X509CRLStoreSelector;

    invoke-direct {v0}, Lorg/bouncycastle/x509/X509CRLStoreSelector;-><init>()V

    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getCertificateChecking()Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setCertificateChecking(Ljava/security/cert/X509Certificate;)V

    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getDateAndTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setDateAndTime(Ljava/util/Date;)V

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getIssuerNames()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setIssuerNames(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getIssuers()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setIssuers(Ljava/util/Collection;)V

    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getMaxCRL()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setMaxCRLNumber(Ljava/math/BigInteger;)V

    invoke-virtual {p0}, Ljava/security/cert/X509CRLSelector;->getMinCRL()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->setMinCRLNumber(Ljava/math/BigInteger;)V

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->e:Z

    return-void
.end method

.method public final a(Ljava/math/BigInteger;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    return-void
.end method

.method public final a(Lorg/bouncycastle/x509/X509AttributeCertificate;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->f:Lorg/bouncycastle/x509/X509AttributeCertificate;

    return-void
.end method

.method public final a([B)V
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->d:[B

    return-void
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 4

    const/4 v2, 0x0

    instance-of v0, p1, Ljava/security/cert/X509CRL;

    if-nez v0, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/security/cert/X509CRL;

    const/4 v1, 0x0

    :try_start_0
    sget-object v3, Lorg/bouncycastle/asn1/x509/X509Extensions;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/security/cert/X509CRL;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lorg/bouncycastle/x509/extension/X509ExtensionUtil;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :cond_1
    iget-boolean v3, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a:Z

    if-eqz v3, :cond_2

    if-nez v1, :cond_2

    move v0, v2

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0

    :cond_2
    iget-boolean v3, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->b:Z

    if-eqz v3, :cond_3

    if-eqz v1, :cond_3

    move v0, v2

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    iget-object v3, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    if-eqz v3, :cond_4

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERInteger;->f()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v3, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    move v0, v2

    goto :goto_0

    :cond_4
    iget-boolean v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->e:Z

    if-eqz v1, :cond_6

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Extensions;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/cert/X509CRL;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->d:[B

    if-nez v1, :cond_5

    if-eqz v0, :cond_6

    move v0, v2

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->d:[B

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_6

    move v0, v2

    goto :goto_0

    :cond_6
    check-cast p1, Ljava/security/cert/X509CRL;

    invoke-super {p0, p1}, Ljava/security/cert/X509CRLSelector;->match(Ljava/security/cert/CRL;)Z

    move-result v0

    goto :goto_0
.end method

.method public final b()Lorg/bouncycastle/x509/X509AttributeCertificate;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->f:Lorg/bouncycastle/x509/X509AttributeCertificate;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a:Z

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    invoke-static {p0}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a(Ljava/security/cert/X509CRLSelector;)Lorg/bouncycastle/x509/X509CRLStoreSelector;

    move-result-object v0

    iget-boolean v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a:Z

    iput-boolean v1, v0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a:Z

    iget-boolean v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->b:Z

    iput-boolean v1, v0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->b:Z

    iget-object v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    iput-object v1, v0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->c:Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->f:Lorg/bouncycastle/x509/X509AttributeCertificate;

    iput-object v1, v0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->f:Lorg/bouncycastle/x509/X509AttributeCertificate;

    iget-boolean v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->e:Z

    iput-boolean v1, v0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->e:Z

    iget-object v1, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->d:[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v1

    iput-object v1, v0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->d:[B

    return-object v0
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/x509/X509CRLStoreSelector;->b:Z

    return-void
.end method

.method public match(Ljava/security/cert/CRL;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lorg/bouncycastle/x509/X509CRLStoreSelector;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
