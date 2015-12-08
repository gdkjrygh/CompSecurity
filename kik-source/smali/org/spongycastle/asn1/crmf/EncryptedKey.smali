.class public Lorg/spongycastle/asn1/crmf/EncryptedKey;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/cms/EnvelopedData;

.field private b:Lorg/spongycastle/asn1/crmf/EncryptedValue;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 74
    iget-object v0, p0, Lorg/spongycastle/asn1/crmf/EncryptedKey;->b:Lorg/spongycastle/asn1/crmf/EncryptedValue;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lorg/spongycastle/asn1/crmf/EncryptedKey;->b:Lorg/spongycastle/asn1/crmf/EncryptedValue;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/crmf/EncryptedValue;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 79
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/EncryptedKey;->a:Lorg/spongycastle/asn1/cms/EnvelopedData;

    invoke-direct {v0, v2, v2, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method
