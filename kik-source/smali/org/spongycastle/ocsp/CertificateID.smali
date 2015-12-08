.class public Lorg/spongycastle/ocsp/CertificateID;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lorg/spongycastle/asn1/ocsp/CertID;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 111
    instance-of v0, p1, Lorg/spongycastle/ocsp/CertificateID;

    if-nez v0, :cond_0

    .line 113
    const/4 v0, 0x0

    .line 118
    :goto_0
    return v0

    .line 116
    :cond_0
    check-cast p1, Lorg/spongycastle/ocsp/CertificateID;

    .line 118
    iget-object v0, p0, Lorg/spongycastle/ocsp/CertificateID;->a:Lorg/spongycastle/asn1/ocsp/CertID;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/CertID;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    iget-object v1, p1, Lorg/spongycastle/ocsp/CertificateID;->a:Lorg/spongycastle/asn1/ocsp/CertID;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ocsp/CertID;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lorg/spongycastle/ocsp/CertificateID;->a:Lorg/spongycastle/asn1/ocsp/CertID;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ocsp/CertID;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->hashCode()I

    move-result v0

    return v0
.end method
