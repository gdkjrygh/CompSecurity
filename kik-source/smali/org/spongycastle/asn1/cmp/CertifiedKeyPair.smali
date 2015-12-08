.class public Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/cmp/CertOrEncCert;

.field private b:Lorg/spongycastle/asn1/crmf/EncryptedValue;

.field private c:Lorg/spongycastle/asn1/crmf/PKIPublicationInfo;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 111
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 113
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;->a:Lorg/spongycastle/asn1/cmp/CertOrEncCert;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 115
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;->b:Lorg/spongycastle/asn1/crmf/EncryptedValue;

    if-eqz v1, :cond_0

    .line 117
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;->b:Lorg/spongycastle/asn1/crmf/EncryptedValue;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 120
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;->c:Lorg/spongycastle/asn1/crmf/PKIPublicationInfo;

    if-eqz v1, :cond_1

    .line 122
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;->c:Lorg/spongycastle/asn1/crmf/PKIPublicationInfo;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 125
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
