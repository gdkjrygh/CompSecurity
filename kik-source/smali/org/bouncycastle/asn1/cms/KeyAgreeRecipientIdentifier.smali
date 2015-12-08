.class public Lorg/bouncycastle/asn1/cms/KeyAgreeRecipientIdentifier;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/bouncycastle/asn1/cms/IssuerAndSerialNumber;

.field private b:Lorg/bouncycastle/asn1/cms/RecipientKeyIdentifier;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/asn1/cms/KeyAgreeRecipientIdentifier;->a:Lorg/bouncycastle/asn1/cms/IssuerAndSerialNumber;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/cms/KeyAgreeRecipientIdentifier;->a:Lorg/bouncycastle/asn1/cms/IssuerAndSerialNumber;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/cms/IssuerAndSerialNumber;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/bouncycastle/asn1/cms/KeyAgreeRecipientIdentifier;->b:Lorg/bouncycastle/asn1/cms/RecipientKeyIdentifier;

    invoke-direct {v0, v2, v2, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0
.end method
