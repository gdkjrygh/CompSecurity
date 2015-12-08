.class public Lorg/spongycastle/asn1/esf/CrlIdentifier;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x500/X500Name;

.field private b:Lorg/spongycastle/asn1/DERUTCTime;

.field private c:Lorg/spongycastle/asn1/ASN1Integer;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 96
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 97
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlIdentifier;->a:Lorg/spongycastle/asn1/x500/X500Name;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x500/X500Name;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 98
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlIdentifier;->b:Lorg/spongycastle/asn1/DERUTCTime;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 99
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlIdentifier;->c:Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v1, :cond_0

    .line 101
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlIdentifier;->c:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 103
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
