.class public Lorg/spongycastle/asn1/ocsp/CrlID;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/DERIA5String;

.field private b:Lorg/spongycastle/asn1/ASN1Integer;

.field private c:Lorg/spongycastle/asn1/ASN1GeneralizedTime;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 92
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 94
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/CrlID;->a:Lorg/spongycastle/asn1/DERIA5String;

    if-eqz v1, :cond_0

    .line 96
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/asn1/ocsp/CrlID;->a:Lorg/spongycastle/asn1/DERIA5String;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 99
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/CrlID;->b:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_1

    .line 101
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/ocsp/CrlID;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 104
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/ocsp/CrlID;->c:Lorg/spongycastle/asn1/ASN1GeneralizedTime;

    if-eqz v1, :cond_2

    .line 106
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/ocsp/CrlID;->c:Lorg/spongycastle/asn1/ASN1GeneralizedTime;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 109
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
