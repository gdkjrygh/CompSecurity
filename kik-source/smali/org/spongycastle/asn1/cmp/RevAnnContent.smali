.class public Lorg/spongycastle/asn1/cmp/RevAnnContent;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/cmp/PKIStatus;

.field private b:Lorg/spongycastle/asn1/crmf/CertId;

.field private c:Lorg/spongycastle/asn1/DERGeneralizedTime;

.field private d:Lorg/spongycastle/asn1/DERGeneralizedTime;

.field private e:Lorg/spongycastle/asn1/x509/Extensions;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 89
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 91
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/RevAnnContent;->a:Lorg/spongycastle/asn1/cmp/PKIStatus;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 92
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/RevAnnContent;->b:Lorg/spongycastle/asn1/crmf/CertId;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 93
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/RevAnnContent;->c:Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 94
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/RevAnnContent;->d:Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 96
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/RevAnnContent;->e:Lorg/spongycastle/asn1/x509/Extensions;

    if-eqz v1, :cond_0

    .line 98
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/RevAnnContent;->e:Lorg/spongycastle/asn1/x509/Extensions;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 101
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
