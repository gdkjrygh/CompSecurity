.class public Lorg/spongycastle/asn1/esf/SignerLocation;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/DERUTF8String;

.field private b:Lorg/spongycastle/asn1/DERUTF8String;

.field private c:Lorg/spongycastle/asn1/ASN1Sequence;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 143
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 145
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/SignerLocation;->a:Lorg/spongycastle/asn1/DERUTF8String;

    if-eqz v1, :cond_0

    .line 147
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/asn1/esf/SignerLocation;->a:Lorg/spongycastle/asn1/DERUTF8String;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 150
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/SignerLocation;->b:Lorg/spongycastle/asn1/DERUTF8String;

    if-eqz v1, :cond_1

    .line 152
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/esf/SignerLocation;->b:Lorg/spongycastle/asn1/DERUTF8String;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 155
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/SignerLocation;->c:Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_2

    .line 157
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/esf/SignerLocation;->c:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 160
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
