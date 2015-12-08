.class public Lorg/bouncycastle/asn1/pkcs/PBES2Algorithms;
.super Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

# interfaces
.implements Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;


# instance fields
.field private bA:Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

.field private by:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field private bz:Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;


# virtual methods
.method public final c()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/asn1/pkcs/PBES2Algorithms;->by:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v2, p0, Lorg/bouncycastle/asn1/pkcs/PBES2Algorithms;->bz:Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v2, p0, Lorg/bouncycastle/asn1/pkcs/PBES2Algorithms;->bA:Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/pkcs/PBES2Algorithms;->by:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-object v0
.end method
