.class public Lorg/spongycastle/asn1/cmp/PKIStatusInfo;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Integer;

.field b:Lorg/spongycastle/asn1/cmp/PKIFreeText;

.field c:Lorg/spongycastle/asn1/DERBitString;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 149
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 151
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PKIStatusInfo;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 153
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PKIStatusInfo;->b:Lorg/spongycastle/asn1/cmp/PKIFreeText;

    if-eqz v1, :cond_0

    .line 155
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PKIStatusInfo;->b:Lorg/spongycastle/asn1/cmp/PKIFreeText;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 158
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PKIStatusInfo;->c:Lorg/spongycastle/asn1/DERBitString;

    if-eqz v1, :cond_1

    .line 160
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PKIStatusInfo;->c:Lorg/spongycastle/asn1/DERBitString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 163
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
