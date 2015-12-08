.class public Lorg/spongycastle/asn1/cms/RecipientKeyIdentifier;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1OctetString;

.field private b:Lorg/spongycastle/asn1/DERGeneralizedTime;

.field private c:Lorg/spongycastle/asn1/cms/OtherKeyAttribute;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 140
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 142
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/RecipientKeyIdentifier;->a:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 144
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/RecipientKeyIdentifier;->b:Lorg/spongycastle/asn1/DERGeneralizedTime;

    if-eqz v1, :cond_0

    .line 146
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/RecipientKeyIdentifier;->b:Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 149
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/RecipientKeyIdentifier;->c:Lorg/spongycastle/asn1/cms/OtherKeyAttribute;

    if-eqz v1, :cond_1

    .line 151
    iget-object v1, p0, Lorg/spongycastle/asn1/cms/RecipientKeyIdentifier;->c:Lorg/spongycastle/asn1/cms/OtherKeyAttribute;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 154
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
