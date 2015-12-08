.class public Lorg/bouncycastle/asn1/esf/CrlOcspRef;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/esf/CrlListID;

.field private b:Lorg/bouncycastle/asn1/esf/OcspListID;

.field private c:Lorg/bouncycastle/asn1/esf/OtherRevRefs;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 5

    const/4 v4, 0x1

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/esf/CrlOcspRef;->a:Lorg/bouncycastle/asn1/esf/CrlListID;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/bouncycastle/asn1/esf/CrlOcspRef;->a:Lorg/bouncycastle/asn1/esf/CrlListID;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/esf/CrlListID;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v3

    invoke-direct {v1, v4, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/esf/CrlOcspRef;->b:Lorg/bouncycastle/asn1/esf/OcspListID;

    if-eqz v1, :cond_1

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/bouncycastle/asn1/esf/CrlOcspRef;->b:Lorg/bouncycastle/asn1/esf/OcspListID;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/esf/OcspListID;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    invoke-direct {v1, v4, v4, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/esf/CrlOcspRef;->c:Lorg/bouncycastle/asn1/esf/OtherRevRefs;

    if-eqz v1, :cond_2

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/bouncycastle/asn1/esf/CrlOcspRef;->c:Lorg/bouncycastle/asn1/esf/OtherRevRefs;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/esf/OtherRevRefs;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v3

    invoke-direct {v1, v4, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
