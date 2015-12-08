.class public Lorg/spongycastle/asn1/esf/SignerAttribute;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:[Ljava/lang/Object;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 107
    new-instance v3, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    move v1, v2

    .line 109
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/asn1/esf/SignerAttribute;->a:[Ljava/lang/Object;

    array-length v0, v0

    if-eq v1, v0, :cond_1

    .line 111
    iget-object v0, p0, Lorg/spongycastle/asn1/esf/SignerAttribute;->a:[Ljava/lang/Object;

    aget-object v0, v0, v1

    instance-of v0, v0, [Lorg/spongycastle/asn1/x509/Attribute;

    if-eqz v0, :cond_0

    .line 113
    new-instance v4, Lorg/spongycastle/asn1/DERTaggedObject;

    new-instance v5, Lorg/spongycastle/asn1/DERSequence;

    iget-object v0, p0, Lorg/spongycastle/asn1/esf/SignerAttribute;->a:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, [Lorg/spongycastle/asn1/x509/Attribute;

    invoke-direct {v5, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-direct {v4, v2, v5}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 109
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 117
    :cond_0
    new-instance v4, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v5, 0x1

    iget-object v0, p0, Lorg/spongycastle/asn1/esf/SignerAttribute;->a:[Ljava/lang/Object;

    aget-object v0, v0, v1

    check-cast v0, Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-direct {v4, v5, v0}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_1

    .line 121
    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0, v3}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v0
.end method
