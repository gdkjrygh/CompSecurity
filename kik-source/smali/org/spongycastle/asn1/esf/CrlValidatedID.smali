.class public Lorg/spongycastle/asn1/esf/CrlValidatedID;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/esf/OtherHash;

.field private b:Lorg/spongycastle/asn1/esf/CrlIdentifier;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 74
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 75
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlValidatedID;->a:Lorg/spongycastle/asn1/esf/OtherHash;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/esf/OtherHash;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 76
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlValidatedID;->b:Lorg/spongycastle/asn1/esf/CrlIdentifier;

    if-eqz v1, :cond_0

    .line 78
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlValidatedID;->b:Lorg/spongycastle/asn1/esf/CrlIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/esf/CrlIdentifier;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 80
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
