.class public Lorg/bouncycastle/asn1/tsp/TimeStampReq;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:Lorg/bouncycastle/asn1/DERInteger;

.field b:Lorg/bouncycastle/asn1/tsp/MessageImprint;

.field c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field d:Lorg/bouncycastle/asn1/DERInteger;

.field e:Lorg/bouncycastle/asn1/DERBoolean;

.field f:Lorg/bouncycastle/asn1/x509/X509Extensions;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->a:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->b:Lorg/bouncycastle/asn1/tsp/MessageImprint;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->d:Lorg/bouncycastle/asn1/DERInteger;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->d:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->e:Lorg/bouncycastle/asn1/DERBoolean;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->e:Lorg/bouncycastle/asn1/DERBoolean;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBoolean;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->e:Lorg/bouncycastle/asn1/DERBoolean;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->f:Lorg/bouncycastle/asn1/x509/X509Extensions;

    if-eqz v1, :cond_3

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/bouncycastle/asn1/tsp/TimeStampReq;->f:Lorg/bouncycastle/asn1/x509/X509Extensions;

    invoke-direct {v1, v3, v3, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_3
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
