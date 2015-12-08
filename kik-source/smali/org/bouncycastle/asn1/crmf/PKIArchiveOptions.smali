.class public Lorg/bouncycastle/asn1/crmf/PKIArchiveOptions;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/bouncycastle/asn1/ASN1Encodable;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/bouncycastle/asn1/ASN1Encodable;

    instance-of v0, v0, Lorg/bouncycastle/asn1/crmf/EncryptedKey;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/bouncycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v2, v3, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/bouncycastle/asn1/ASN1Encodable;

    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/bouncycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v3, v2, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x2

    iget-object v2, p0, Lorg/bouncycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v3, v1, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0
.end method
