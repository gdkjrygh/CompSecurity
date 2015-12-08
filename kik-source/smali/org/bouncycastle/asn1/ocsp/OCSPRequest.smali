.class public Lorg/bouncycastle/asn1/ocsp/OCSPRequest;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:Lorg/bouncycastle/asn1/ocsp/TBSRequest;

.field b:Lorg/bouncycastle/asn1/ocsp/Signature;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 5

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/ocsp/OCSPRequest;->a:Lorg/bouncycastle/asn1/ocsp/TBSRequest;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/ocsp/OCSPRequest;->b:Lorg/bouncycastle/asn1/ocsp/Signature;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Lorg/bouncycastle/asn1/ocsp/OCSPRequest;->b:Lorg/bouncycastle/asn1/ocsp/Signature;

    invoke-direct {v1, v2, v3, v4}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/asn1/ocsp/TBSRequest;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ocsp/OCSPRequest;->a:Lorg/bouncycastle/asn1/ocsp/TBSRequest;

    return-object v0
.end method
