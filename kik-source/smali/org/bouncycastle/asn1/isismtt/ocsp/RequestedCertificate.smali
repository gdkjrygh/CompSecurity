.class public Lorg/bouncycastle/asn1/isismtt/ocsp/RequestedCertificate;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

.field private b:[B

.field private c:[B


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/asn1/isismtt/ocsp/RequestedCertificate;->b:[B

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    new-instance v2, Lorg/bouncycastle/asn1/DEROctetString;

    iget-object v3, p0, Lorg/bouncycastle/asn1/isismtt/ocsp/RequestedCertificate;->b:[B

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ILorg/bouncycastle/asn1/DEREncodable;)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/isismtt/ocsp/RequestedCertificate;->c:[B

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    new-instance v2, Lorg/bouncycastle/asn1/DEROctetString;

    iget-object v3, p0, Lorg/bouncycastle/asn1/isismtt/ocsp/RequestedCertificate;->c:[B

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/asn1/isismtt/ocsp/RequestedCertificate;->a:Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0
.end method
