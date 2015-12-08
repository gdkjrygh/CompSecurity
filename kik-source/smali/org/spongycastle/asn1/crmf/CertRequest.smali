.class public Lorg/spongycastle/asn1/crmf/CertRequest;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Integer;

.field private b:Lorg/spongycastle/asn1/crmf/CertTemplate;

.field private c:Lorg/spongycastle/asn1/crmf/Controls;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 85
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 87
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/CertRequest;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 88
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/CertRequest;->b:Lorg/spongycastle/asn1/crmf/CertTemplate;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 90
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/CertRequest;->c:Lorg/spongycastle/asn1/crmf/Controls;

    if-eqz v1, :cond_0

    .line 92
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/CertRequest;->c:Lorg/spongycastle/asn1/crmf/Controls;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 95
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
