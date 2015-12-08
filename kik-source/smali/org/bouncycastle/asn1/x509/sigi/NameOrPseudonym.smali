.class public Lorg/bouncycastle/asn1/x509/sigi/NameOrPseudonym;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x500/DirectoryString;

.field private b:Lorg/bouncycastle/asn1/x500/DirectoryString;

.field private c:Lorg/bouncycastle/asn1/ASN1Sequence;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/sigi/NameOrPseudonym;->a:Lorg/bouncycastle/asn1/x500/DirectoryString;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/sigi/NameOrPseudonym;->a:Lorg/bouncycastle/asn1/x500/DirectoryString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x500/DirectoryString;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/sigi/NameOrPseudonym;->b:Lorg/bouncycastle/asn1/x500/DirectoryString;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/sigi/NameOrPseudonym;->c:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    goto :goto_0
.end method
