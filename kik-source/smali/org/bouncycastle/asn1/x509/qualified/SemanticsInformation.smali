.class public Lorg/bouncycastle/asn1/x509/qualified/SemanticsInformation;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field b:[Lorg/bouncycastle/asn1/x509/GeneralName;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/qualified/SemanticsInformation;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/qualified/SemanticsInformation;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/qualified/SemanticsInformation;->b:[Lorg/bouncycastle/asn1/x509/GeneralName;

    if-eqz v0, :cond_2

    new-instance v2, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/qualified/SemanticsInformation;->b:[Lorg/bouncycastle/asn1/x509/GeneralName;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/qualified/SemanticsInformation;->b:[Lorg/bouncycastle/asn1/x509/GeneralName;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v0
.end method
