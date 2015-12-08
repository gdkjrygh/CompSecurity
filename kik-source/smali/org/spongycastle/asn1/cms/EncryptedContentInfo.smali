.class public Lorg/spongycastle/asn1/cms/EncryptedContentInfo;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field private c:Lorg/spongycastle/asn1/ASN1OctetString;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 97
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 99
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/EncryptedContentInfo;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 100
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/EncryptedContentInfo;->b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 102
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/EncryptedContentInfo;->c:Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v1, :cond_0

    .line 104
    new-instance v1, Lorg/spongycastle/asn1/BERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cms/EncryptedContentInfo;->c:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-direct {v1, v3, v3, v2}, Lorg/spongycastle/asn1/BERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 107
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/BERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
