.class public Lorg/spongycastle/asn1/cmp/CAKeyUpdAnnContent;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/cmp/CMPCertificate;

.field private b:Lorg/spongycastle/asn1/cmp/CMPCertificate;

.field private c:Lorg/spongycastle/asn1/cmp/CMPCertificate;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 72
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 74
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CAKeyUpdAnnContent;->a:Lorg/spongycastle/asn1/cmp/CMPCertificate;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 75
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CAKeyUpdAnnContent;->b:Lorg/spongycastle/asn1/cmp/CMPCertificate;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 76
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CAKeyUpdAnnContent;->c:Lorg/spongycastle/asn1/cmp/CMPCertificate;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 78
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
