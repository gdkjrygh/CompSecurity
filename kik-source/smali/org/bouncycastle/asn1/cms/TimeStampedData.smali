.class public Lorg/bouncycastle/asn1/cms/TimeStampedData;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/DERInteger;

.field private b:Lorg/bouncycastle/asn1/DERIA5String;

.field private c:Lorg/bouncycastle/asn1/cms/MetaData;

.field private d:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private e:Lorg/bouncycastle/asn1/cms/Evidence;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->a:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->b:Lorg/bouncycastle/asn1/DERIA5String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->b:Lorg/bouncycastle/asn1/DERIA5String;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->c:Lorg/bouncycastle/asn1/cms/MetaData;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->c:Lorg/bouncycastle/asn1/cms/MetaData;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->d:Lorg/bouncycastle/asn1/ASN1OctetString;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->d:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/TimeStampedData;->e:Lorg/bouncycastle/asn1/cms/Evidence;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/BERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
