.class public Lorg/bouncycastle/asn1/BERTaggedObject;
.super Lorg/bouncycastle/asn1/DERTaggedObject;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/DEREncodable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ILorg/bouncycastle/asn1/DEREncodable;)V

    return-void
.end method

.method public constructor <init>(ZILorg/bouncycastle/asn1/DEREncodable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    return-void
.end method


# virtual methods
.method final a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 3

    const/4 v2, 0x0

    instance-of v0, p1, Lorg/bouncycastle/asn1/ASN1OutputStream;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/bouncycastle/asn1/BEROutputStream;

    if-eqz v0, :cond_7

    :cond_0
    const/16 v0, 0xa0

    iget v1, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->a:I

    invoke-virtual {p1, v0, v1}, Lorg/bouncycastle/asn1/DEROutputStream;->a(II)V

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/DEROutputStream;->write(I)V

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->b:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->c:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    instance-of v0, v0, Lorg/bouncycastle/asn1/BERConstructedOctetString;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    check-cast v0, Lorg/bouncycastle/asn1/BERConstructedOctetString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/BERConstructedOctetString;->h()Ljava/util/Enumeration;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/DEROutputStream;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    new-instance v1, Lorg/bouncycastle/asn1/BERConstructedOctetString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/BERConstructedOctetString;-><init>([B)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/BERConstructedOctetString;->h()Ljava/util/Enumeration;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1Set;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Set;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Set;->e()Ljava/util/Enumeration;

    move-result-object v0

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not implemented: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObject;->d:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/DEROutputStream;->a(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p1, v2}, Lorg/bouncycastle/asn1/DEROutputStream;->write(I)V

    invoke-virtual {p1, v2}, Lorg/bouncycastle/asn1/DEROutputStream;->write(I)V

    :goto_1
    return-void

    :cond_7
    invoke-super {p0, p1}, Lorg/bouncycastle/asn1/DERTaggedObject;->a(Lorg/bouncycastle/asn1/DEROutputStream;)V

    goto :goto_1
.end method
