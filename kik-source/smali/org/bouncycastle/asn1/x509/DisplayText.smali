.class public Lorg/bouncycastle/asn1/x509/DisplayText;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field a:Lorg/bouncycastle/asn1/ASN1String;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/DisplayText;->a:Lorg/bouncycastle/asn1/ASN1String;

    check-cast v0, Lorg/bouncycastle/asn1/DERObject;

    return-object v0
.end method
