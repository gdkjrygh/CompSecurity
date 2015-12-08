.class public Lorg/spongycastle/asn1/cms/SignedData;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Integer;

.field private b:Lorg/spongycastle/asn1/ASN1Set;

.field private c:Lorg/spongycastle/asn1/cms/ContentInfo;

.field private d:Lorg/spongycastle/asn1/ASN1Set;

.field private e:Lorg/spongycastle/asn1/ASN1Set;

.field private f:Lorg/spongycastle/asn1/ASN1Set;

.field private g:Z

.field private h:Z


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 268
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 270
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 271
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->b:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 272
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->c:Lorg/spongycastle/asn1/cms/ContentInfo;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 274
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->d:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_0

    .line 276
    iget-boolean v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->g:Z

    if-eqz v1, :cond_2

    .line 278
    new-instance v1, Lorg/spongycastle/asn1/BERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cms/SignedData;->d:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v3, v3, v2}, Lorg/spongycastle/asn1/BERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 286
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->e:Lorg/spongycastle/asn1/ASN1Set;

    if-eqz v1, :cond_1

    .line 288
    iget-boolean v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->h:Z

    if-eqz v1, :cond_3

    .line 290
    new-instance v1, Lorg/spongycastle/asn1/BERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cms/SignedData;->e:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v3, v4, v2}, Lorg/spongycastle/asn1/BERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 298
    :cond_1
    :goto_1
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/SignedData;->f:Lorg/spongycastle/asn1/ASN1Set;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 300
    new-instance v1, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1

    .line 282
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cms/SignedData;->d:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v3, v3, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 294
    :cond_3
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cms/SignedData;->e:Lorg/spongycastle/asn1/ASN1Set;

    invoke-direct {v1, v3, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_1
.end method
