.class public Lorg/spongycastle/asn1/cms/MetaData;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/DERBoolean;

.field private b:Lorg/spongycastle/asn1/DERUTF8String;

.field private c:Lorg/spongycastle/asn1/DERIA5String;

.field private d:Lorg/spongycastle/asn1/cms/Attributes;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 79
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 81
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/MetaData;->a:Lorg/spongycastle/asn1/DERBoolean;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 83
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/MetaData;->b:Lorg/spongycastle/asn1/DERUTF8String;

    if-eqz v1, :cond_0

    .line 85
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/MetaData;->b:Lorg/spongycastle/asn1/DERUTF8String;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 88
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/MetaData;->c:Lorg/spongycastle/asn1/DERIA5String;

    if-eqz v1, :cond_1

    .line 90
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/MetaData;->c:Lorg/spongycastle/asn1/DERIA5String;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 93
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/MetaData;->d:Lorg/spongycastle/asn1/cms/Attributes;

    if-eqz v1, :cond_2

    .line 95
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/MetaData;->d:Lorg/spongycastle/asn1/cms/Attributes;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 98
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
