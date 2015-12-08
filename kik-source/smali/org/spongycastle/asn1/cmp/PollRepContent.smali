.class public Lorg/spongycastle/asn1/cmp/PollRepContent;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Integer;

.field private b:Lorg/spongycastle/asn1/ASN1Integer;

.field private c:Lorg/spongycastle/asn1/cmp/PKIFreeText;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 70
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 72
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PollRepContent;->a:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 73
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PollRepContent;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 75
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PollRepContent;->c:Lorg/spongycastle/asn1/cmp/PKIFreeText;

    if-eqz v1, :cond_0

    .line 77
    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/PollRepContent;->c:Lorg/spongycastle/asn1/cmp/PKIFreeText;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 80
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
