.class public Lorg/spongycastle/asn1/tsp/TimeStampReq;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Integer;

.field b:Lorg/spongycastle/asn1/tsp/MessageImprint;

.field c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field d:Lorg/spongycastle/asn1/ASN1Integer;

.field e:Lorg/spongycastle/asn1/ASN1Boolean;

.field f:Lorg/spongycastle/asn1/x509/Extensions;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 153
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 155
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 156
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->b:Lorg/spongycastle/asn1/tsp/MessageImprint;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 158
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    .line 160
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 163
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->d:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_1

    .line 165
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->d:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 168
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->e:Lorg/spongycastle/asn1/ASN1Boolean;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->e:Lorg/spongycastle/asn1/ASN1Boolean;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Boolean;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 170
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->e:Lorg/spongycastle/asn1/ASN1Boolean;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 173
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->f:Lorg/spongycastle/asn1/x509/Extensions;

    if-eqz v1, :cond_3

    .line 175
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/tsp/TimeStampReq;->f:Lorg/spongycastle/asn1/x509/Extensions;

    invoke-direct {v1, v3, v3, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 178
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
