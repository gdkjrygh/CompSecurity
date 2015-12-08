.class public Lorg/bouncycastle/asn1/x500/DirectoryString;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;
.implements Lorg/bouncycastle/asn1/ASN1String;


# instance fields
.field private a:Lorg/bouncycastle/asn1/ASN1String;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x500/DirectoryString;->a:Lorg/bouncycastle/asn1/ASN1String;

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    return-object v0
.end method

.method public final n_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x500/DirectoryString;->a:Lorg/bouncycastle/asn1/ASN1String;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/ASN1String;->n_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x500/DirectoryString;->a:Lorg/bouncycastle/asn1/ASN1String;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/ASN1String;->n_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
