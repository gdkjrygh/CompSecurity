.class public Lorg/bouncycastle/asn1/x509/sigi/PersonalData;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x509/sigi/NameOrPseudonym;

.field private b:Ljava/math/BigInteger;

.field private c:Lorg/bouncycastle/asn1/DERGeneralizedTime;

.field private d:Lorg/bouncycastle/asn1/x500/DirectoryString;

.field private e:Ljava/lang/String;

.field private f:Lorg/bouncycastle/asn1/x500/DirectoryString;


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 7

    const/4 v6, 0x1

    const/4 v5, 0x0

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->a:Lorg/bouncycastle/asn1/x509/sigi/NameOrPseudonym;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->b:Ljava/math/BigInteger;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v2, Lorg/bouncycastle/asn1/DERInteger;

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->b:Ljava/math/BigInteger;

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-direct {v1, v5, v5, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->c:Lorg/bouncycastle/asn1/DERGeneralizedTime;

    if-eqz v1, :cond_1

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->c:Lorg/bouncycastle/asn1/DERGeneralizedTime;

    invoke-direct {v1, v5, v6, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->d:Lorg/bouncycastle/asn1/x500/DirectoryString;

    if-eqz v1, :cond_2

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->d:Lorg/bouncycastle/asn1/x500/DirectoryString;

    invoke-direct {v1, v6, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->e:Ljava/lang/String;

    if-eqz v1, :cond_3

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x3

    new-instance v3, Lorg/bouncycastle/asn1/DERPrintableString;

    iget-object v4, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->e:Ljava/lang/String;

    invoke-direct {v3, v4, v6}, Lorg/bouncycastle/asn1/DERPrintableString;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v1, v5, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_3
    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->f:Lorg/bouncycastle/asn1/x500/DirectoryString;

    if-eqz v1, :cond_4

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x4

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/sigi/PersonalData;->f:Lorg/bouncycastle/asn1/x500/DirectoryString;

    invoke-direct {v1, v6, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_4
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
