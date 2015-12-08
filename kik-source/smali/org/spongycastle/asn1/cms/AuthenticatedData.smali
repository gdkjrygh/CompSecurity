.class public Lorg/spongycastle/asn1/cms/AuthenticatedData;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Integer;

.field private b:Lorg/spongycastle/asn1/cms/OriginatorInfo;

.field private c:Lorg/spongycastle/asn1/ASN1Set;

.field private d:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field private e:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field private f:Lorg/spongycastle/asn1/cms/ContentInfo;

.field private g:Lorg/spongycastle/asn1/ASN1Set;

.field private h:Lorg/spongycastle/asn1/ASN1OctetString;

.field private i:Lorg/spongycastle/asn1/ASN1Set;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 210
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 212
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 214
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->b:Lorg/spongycastle/asn1/cms/OriginatorInfo;

    if-eqz v1, :cond_0

    .line 216
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->b:Lorg/spongycastle/asn1/cms/OriginatorInfo;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 219
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->c:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 220
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->d:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 222
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->e:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    if-eqz v1, :cond_1

    .line 224
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->e:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 227
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->f:Lorg/spongycastle/asn1/cms/ContentInfo;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 229
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->g:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_2

    .line 231
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->g:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 234
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->h:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 236
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->i:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_3

    .line 238
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x3

    iget-object v3, p0, Lorg/spongycastle/asn1/cms/AuthenticatedData;->i:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 241
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
