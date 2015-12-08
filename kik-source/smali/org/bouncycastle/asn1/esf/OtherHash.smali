.class public Lorg/bouncycastle/asn1/esf/OtherHash;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private b:Lorg/bouncycastle/asn1/esf/OtherHashAlgAndValue;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/esf/OtherHash;->b:Lorg/bouncycastle/asn1/esf/OtherHashAlgAndValue;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/esf/OtherHash;->a:Lorg/bouncycastle/asn1/ASN1OctetString;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/esf/OtherHash;->b:Lorg/bouncycastle/asn1/esf/OtherHashAlgAndValue;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/esf/OtherHashAlgAndValue;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0
.end method
