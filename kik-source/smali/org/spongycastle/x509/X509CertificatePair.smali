.class public Lorg/spongycastle/x509/X509CertificatePair;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/security/cert/X509Certificate;

.field private b:Ljava/security/cert/X509Certificate;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/x509/CertificatePair;)V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/CertificatePair;->c()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 50
    new-instance v0, Lorg/spongycastle/jce/provider/X509CertificateObject;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/CertificatePair;->c()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/X509CertificateObject;-><init>(Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V

    iput-object v0, p0, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    .line 52
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/CertificatePair;->d()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 54
    new-instance v0, Lorg/spongycastle/jce/provider/X509CertificateObject;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/CertificatePair;->d()Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/X509CertificateObject;-><init>(Lorg/spongycastle/asn1/x509/X509CertificateStructure;)V

    iput-object v0, p0, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    .line 56
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Ljava/security/cert/X509Certificate;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method public final b()Ljava/security/cert/X509Certificate;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 117
    if-nez p1, :cond_1

    .line 150
    :cond_0
    :goto_0
    return v1

    .line 121
    :cond_1
    instance-of v0, p1, Lorg/spongycastle/x509/X509CertificatePair;

    if-eqz v0, :cond_0

    .line 125
    check-cast p1, Lorg/spongycastle/x509/X509CertificatePair;

    .line 128
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    iget-object v3, p1, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, v3}, Ljava/security/cert/X509Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 139
    :goto_1
    iget-object v3, p0, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    if-eqz v3, :cond_3

    .line 141
    iget-object v3, p0, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    iget-object v4, p1, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    invoke-virtual {v3, v4}, Ljava/security/cert/X509Certificate;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 150
    :goto_2
    if-eqz v0, :cond_0

    if-eqz v3, :cond_0

    move v1, v2

    goto :goto_0

    .line 134
    :cond_2
    iget-object v0, p1, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_5

    move v0, v1

    .line 136
    goto :goto_1

    .line 145
    :cond_3
    iget-object v3, p1, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    if-eqz v3, :cond_4

    move v3, v1

    .line 147
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

    .prologue
    .line 155
    const/4 v0, -0x1

    .line 156
    iget-object v1, p0, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    if-eqz v1, :cond_0

    .line 158
    iget-object v0, p0, Lorg/spongycastle/x509/X509CertificatePair;->a:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->hashCode()I

    move-result v0

    xor-int/lit8 v0, v0, -0x1

    .line 160
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    if-eqz v1, :cond_1

    .line 162
    mul-int/lit8 v0, v0, 0x11

    .line 163
    iget-object v1, p0, Lorg/spongycastle/x509/X509CertificatePair;->b:Ljava/security/cert/X509Certificate;

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 165
    :cond_1
    return v0
.end method
