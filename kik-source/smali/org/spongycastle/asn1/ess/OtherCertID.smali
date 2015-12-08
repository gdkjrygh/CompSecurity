.class public Lorg/spongycastle/asn1/ess/OtherCertID;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Encodable;

.field private b:Lorg/spongycastle/asn1/x509/IssuerSerial;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 126
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 128
    iget-object v1, p0, Lorg/spongycastle/asn1/ess/OtherCertID;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 130
    iget-object v1, p0, Lorg/spongycastle/asn1/ess/OtherCertID;->b:Lorg/spongycastle/asn1/x509/IssuerSerial;

    if-eqz v1, :cond_0

    .line 132
    iget-object v1, p0, Lorg/spongycastle/asn1/ess/OtherCertID;->b:Lorg/spongycastle/asn1/x509/IssuerSerial;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 135
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
