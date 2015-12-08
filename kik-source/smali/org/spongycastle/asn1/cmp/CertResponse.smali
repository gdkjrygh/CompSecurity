.class public Lorg/spongycastle/asn1/cmp/CertResponse;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Integer;

.field private b:Lorg/spongycastle/asn1/cmp/PKIStatusInfo;

.field private c:Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;

.field private d:Lorg/spongycastle/asn1/ASN1OctetString;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 122
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 124
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertResponse;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 125
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertResponse;->b:Lorg/spongycastle/asn1/cmp/PKIStatusInfo;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 127
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertResponse;->c:Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;

    if-eqz v1, :cond_0

    .line 129
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertResponse;->c:Lorg/spongycastle/asn1/cmp/CertifiedKeyPair;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 132
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertResponse;->d:Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v1, :cond_1

    .line 134
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertResponse;->d:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 137
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
