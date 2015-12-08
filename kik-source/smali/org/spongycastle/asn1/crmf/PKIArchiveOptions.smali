.class public Lorg/spongycastle/asn1/crmf/PKIArchiveOptions;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Encodable;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 104
    iget-object v0, p0, Lorg/spongycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    instance-of v0, v0, Lorg/spongycastle/asn1/crmf/EncryptedKey;

    if-eqz v0, :cond_0

    .line 106
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v2, v3, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 114
    :goto_0
    return-object v0

    .line 109
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    instance-of v0, v0, Lorg/spongycastle/asn1/ASN1OctetString;

    if-eqz v0, :cond_1

    .line 111
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v3, v2, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    .line 114
    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x2

    iget-object v2, p0, Lorg/spongycastle/asn1/crmf/PKIArchiveOptions;->a:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-direct {v0, v3, v1, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method
