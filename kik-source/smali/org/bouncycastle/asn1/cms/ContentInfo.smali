.class public Lorg/bouncycastle/asn1/cms/ContentInfo;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/cms/CMSObjectIdentifiers;


# instance fields
.field private k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field private l:Lorg/bouncycastle/asn1/DEREncodable;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/ContentInfo;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/ContentInfo;->l:Lorg/bouncycastle/asn1/DEREncodable;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/BERTaggedObject;

    iget-object v2, p0, Lorg/bouncycastle/asn1/cms/ContentInfo;->l:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/BERTaggedObject;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/BERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
