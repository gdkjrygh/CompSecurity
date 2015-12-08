.class public Lorg/spongycastle/asn1/pkcs/PBES2Parameters;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;


# instance fields
.field private bA:Lorg/spongycastle/asn1/pkcs/EncryptionScheme;

.field private bz:Lorg/spongycastle/asn1/pkcs/KeyDerivationFunc;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 65
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 67
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/PBES2Parameters;->bz:Lorg/spongycastle/asn1/pkcs/KeyDerivationFunc;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 68
    iget-object v1, p0, Lorg/spongycastle/asn1/pkcs/PBES2Parameters;->bA:Lorg/spongycastle/asn1/pkcs/EncryptionScheme;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 70
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
