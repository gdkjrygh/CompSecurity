.class public Lorg/bouncycastle/asn1/cmp/CMPCertificate;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

.field private b:Lorg/bouncycastle/asn1/x509/AttributeCertificate;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cmp/CMPCertificate;->b:Lorg/bouncycastle/asn1/x509/AttributeCertificate;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/bouncycastle/asn1/cmp/CMPCertificate;->b:Lorg/bouncycastle/asn1/x509/AttributeCertificate;

    invoke-direct {v0, v2, v2, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/cmp/CMPCertificate;->a:Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0
.end method
