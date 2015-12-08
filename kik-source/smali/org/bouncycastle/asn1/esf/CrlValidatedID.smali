.class public Lorg/bouncycastle/asn1/esf/CrlValidatedID;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/esf/OtherHash;

.field private b:Lorg/bouncycastle/asn1/esf/CrlIdentifier;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/esf/CrlValidatedID;->a:Lorg/bouncycastle/asn1/esf/OtherHash;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/esf/OtherHash;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/esf/CrlValidatedID;->b:Lorg/bouncycastle/asn1/esf/CrlIdentifier;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/esf/CrlValidatedID;->b:Lorg/bouncycastle/asn1/esf/CrlIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/esf/CrlIdentifier;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
