.class public Lorg/bouncycastle/asn1/cms/MetaData;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/DERBoolean;

.field private b:Lorg/bouncycastle/asn1/DERUTF8String;

.field private c:Lorg/bouncycastle/asn1/DERIA5String;

.field private d:Lorg/bouncycastle/asn1/cms/Attributes;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/MetaData;->a:Lorg/bouncycastle/asn1/DERBoolean;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/MetaData;->b:Lorg/bouncycastle/asn1/DERUTF8String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/MetaData;->b:Lorg/bouncycastle/asn1/DERUTF8String;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/MetaData;->c:Lorg/bouncycastle/asn1/DERIA5String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/MetaData;->c:Lorg/bouncycastle/asn1/DERIA5String;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/MetaData;->d:Lorg/bouncycastle/asn1/cms/Attributes;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/MetaData;->d:Lorg/bouncycastle/asn1/cms/Attributes;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
