.class public Lorg/spongycastle/asn1/cms/TimeStampTokenEvidence;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:[Lorg/spongycastle/asn1/cms/TimeStampAndCRL;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 74
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 76
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/asn1/cms/TimeStampTokenEvidence;->a:[Lorg/spongycastle/asn1/cms/TimeStampAndCRL;

    array-length v2, v2

    if-eq v0, v2, :cond_0

    .line 78
    iget-object v2, p0, Lorg/spongycastle/asn1/cms/TimeStampTokenEvidence;->a:[Lorg/spongycastle/asn1/cms/TimeStampAndCRL;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 76
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 81
    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v0
.end method
