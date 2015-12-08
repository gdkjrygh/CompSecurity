.class public Lorg/spongycastle/asn1/ess/ContentHints;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/DERUTF8String;

.field private b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 103
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 105
    iget-object v1, p0, Lorg/spongycastle/asn1/ess/ContentHints;->a:Lorg/spongycastle/asn1/DERUTF8String;

    if-eqz v1, :cond_0

    .line 107
    iget-object v1, p0, Lorg/spongycastle/asn1/ess/ContentHints;->a:Lorg/spongycastle/asn1/DERUTF8String;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 110
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/ess/ContentHints;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 112
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
