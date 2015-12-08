.class public Lorg/spongycastle/asn1/cms/ContentInfo;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/cms/CMSObjectIdentifiers;


# instance fields
.field private k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private l:Lorg/spongycastle/asn1/ASN1Encodable;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 86
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 88
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/ContentInfo;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 90
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/ContentInfo;->l:Lorg/spongycastle/asn1/ASN1Encodable;

    if-eqz v1, :cond_0

    .line 92
    new-instance v1, Lorg/spongycastle/asn1/BERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cms/ContentInfo;->l:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/BERTaggedObject;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 95
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
