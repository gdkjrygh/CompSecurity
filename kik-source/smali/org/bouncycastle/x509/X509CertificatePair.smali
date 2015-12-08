.class public Lorg/bouncycastle/x509/X509CertificatePair;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/security/cert/X509Certificate;

.field private b:Ljava/security/cert/X509Certificate;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/x509/CertificatePair;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/CertificatePair;->e()Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/X509CertificateObject;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/CertificatePair;->e()Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/X509CertificateObject;-><init>(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    :cond_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/CertificatePair;->f()Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/jce/provider/X509CertificateObject;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/CertificatePair;->f()Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/X509CertificateObject;-><init>(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    iput-object v0, p0, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Ljava/security/cert/X509Certificate;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method public final b()Ljava/security/cert/X509Certificate;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    instance-of v0, p1, Lorg/bouncycastle/x509/X509CertificatePair;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/x509/X509CertificatePair;

    iget-object v0, p0, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    iget-object v3, p1, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, v3}, Ljava/security/cert/X509Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_1
    iget-object v3, p0, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    iget-object v4, p1, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    invoke-virtual {v3, v4}, Ljava/security/cert/X509Certificate;->equals(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v0, :cond_0

    if-eqz v3, :cond_0

    move v1, v2

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_5

    move v0, v1

    goto :goto_1

    :cond_3
    iget-object v3, p1, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    if-eqz v3, :cond_4

    move v3, v1

    goto :goto_2

    :cond_4
    move v3, v2

    goto :goto_2

    :cond_5
    move v0, v2

    goto :goto_1
.end method

.method public hashCode()I
    .locals 2

    const/4 v0, -0x1

    iget-object v1, p0, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->hashCode()I

    move-result v0

    xor-int/lit8 v0, v0, -0x1

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    if-eqz v1, :cond_1

    mul-int/lit8 v0, v0, 0x11

    iget-object v1, p0, Lorg/bouncycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    :cond_1
    return v0
.end method
