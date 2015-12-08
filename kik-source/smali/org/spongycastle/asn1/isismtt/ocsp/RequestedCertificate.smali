.class public Lorg/spongycastle/asn1/isismtt/ocsp/RequestedCertificate;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

.field private b:[B

.field private c:[B


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 173
    iget-object v0, p0, Lorg/spongycastle/asn1/isismtt/ocsp/RequestedCertificate;->b:[B

    if-eqz v0, :cond_0

    .line 175
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    new-instance v2, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v3, p0, Lorg/spongycastle/asn1/isismtt/ocsp/RequestedCertificate;->b:[B

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 181
    :goto_0
    return-object v0

    .line 177
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/isismtt/ocsp/RequestedCertificate;->c:[B

    if-eqz v0, :cond_1

    .line 179
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    new-instance v2, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v3, p0, Lorg/spongycastle/asn1/isismtt/ocsp/RequestedCertificate;->c:[B

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 181
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/asn1/isismtt/ocsp/RequestedCertificate;->a:Lorg/spongycastle/asn1/x509/X509CertificateStructure;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/X509CertificateStructure;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0
.end method
