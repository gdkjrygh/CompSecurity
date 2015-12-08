.class public Lorg/spongycastle/asn1/ocsp/SingleResponse;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ocsp/CertID;

.field private b:Lorg/spongycastle/asn1/ocsp/CertStatus;

.field private c:Lorg/spongycastle/asn1/DERGeneralizedTime;

.field private d:Lorg/spongycastle/asn1/DERGeneralizedTime;

.field private e:Lorg/spongycastle/asn1/x509/Extensions;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 144
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 146
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->a:Lorg/spongycastle/asn1/ocsp/CertID;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 147
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->b:Lorg/spongycastle/asn1/ocsp/CertStatus;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 148
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->c:Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 150
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->d:Lorg/spongycastle/asn1/DERGeneralizedTime;

    if-eqz v1, :cond_0

    .line 152
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->d:Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 155
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->e:Lorg/spongycastle/asn1/x509/Extensions;

    if-eqz v1, :cond_1

    .line 157
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->e:Lorg/spongycastle/asn1/x509/Extensions;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 160
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/x509/Extensions;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lorg/spongycastle/asn1/ocsp/SingleResponse;->e:Lorg/spongycastle/asn1/x509/Extensions;

    return-object v0
.end method
