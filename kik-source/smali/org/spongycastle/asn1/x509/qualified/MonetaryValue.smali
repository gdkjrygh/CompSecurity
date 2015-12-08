.class public Lorg/spongycastle/asn1/x509/qualified/MonetaryValue;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/qualified/Iso4217CurrencyCode;

.field private b:Lorg/spongycastle/asn1/ASN1Integer;

.field private c:Lorg/spongycastle/asn1/ASN1Integer;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 85
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 86
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/qualified/MonetaryValue;->a:Lorg/spongycastle/asn1/x509/qualified/Iso4217CurrencyCode;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 87
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/qualified/MonetaryValue;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 88
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/qualified/MonetaryValue;->c:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 90
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
