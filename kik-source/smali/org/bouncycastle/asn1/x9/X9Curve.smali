.class public Lorg/bouncycastle/asn1/x9/X9Curve;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;


# instance fields
.field private al:Lorg/bouncycastle/math/ec/ECCurve;

.field private am:[B

.field private an:Lorg/bouncycastle/asn1/DERObjectIdentifier;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/x9/X9FieldID;Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 12

    const/4 v11, 0x2

    const/4 v7, 0x1

    const/4 v5, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X9FieldID;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/x9/X9Curve;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X9FieldID;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-direct {v2, v1, v0}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/asn1/ASN1OctetString;)V

    new-instance v3, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v7}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-direct {v3, v1, v0}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/asn1/ASN1OctetString;)V

    new-instance v0, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->e()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->e()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    :cond_0
    :goto_0
    invoke-virtual {p2}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p2, v11}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERBitString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERBitString;->e()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->am:[B

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/x9/X9Curve;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X9FieldID;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-virtual {v0, v5}, Lorg/bouncycastle/asn1/DERSequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    invoke-virtual {v0, v7}, Lorg/bouncycastle/asn1/DERSequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v3, Lorg/bouncycastle/asn1/x9/X9Curve;->f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v11}, Lorg/bouncycastle/asn1/DERSequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    move v4, v5

    move v3, v5

    :goto_1
    new-instance v0, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v5

    check-cast v5, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(IIIILorg/bouncycastle/asn1/ASN1OctetString;)V

    new-instance v5, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v7}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v10

    check-cast v10, Lorg/bouncycastle/asn1/ASN1OctetString;

    move v6, v1

    move v7, v2

    move v8, v3

    move v9, v4

    invoke-direct/range {v5 .. v10}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(IIIILorg/bouncycastle/asn1/ASN1OctetString;)V

    new-instance v7, Lorg/bouncycastle/math/ec/ECCurve$F2m;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->e()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->e()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v6

    move-object v0, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/math/ec/ECCurve$F2m;-><init>(IIIILjava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v7, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v0, v11}, Lorg/bouncycastle/asn1/DERSequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-virtual {v0, v5}, Lorg/bouncycastle/asn1/DERSequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v6

    invoke-virtual {v0, v7}, Lorg/bouncycastle/asn1/DERSequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    invoke-virtual {v0, v11}, Lorg/bouncycastle/asn1/DERSequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    move v2, v6

    goto :goto_1
.end method

.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;[B)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object p1, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    iput-object p2, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->am:[B

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    instance-of v0, v0, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/bouncycastle/asn1/x9/X9Curve;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    instance-of v0, v0, Lorg/bouncycastle/math/ec/ECCurve$F2m;

    if-eqz v0, :cond_1

    sget-object v0, Lorg/bouncycastle/asn1/x9/X9Curve;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "This type of ECCurve is not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v2, Lorg/bouncycastle/asn1/x9/X9Curve;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECCurve;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(Lorg/bouncycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECCurve;->d()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(Lorg/bouncycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->am:[B

    if-eqz v1, :cond_1

    new-instance v1, Lorg/bouncycastle/asn1/DERBitString;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->am:[B

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERBitString;-><init>([B)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->an:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v2, Lorg/bouncycastle/asn1/x9/X9Curve;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECCurve;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(Lorg/bouncycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECCurve;->d()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/x9/X9FieldElement;-><init>(Lorg/bouncycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9FieldElement;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0
.end method

.method public final e()Lorg/bouncycastle/math/ec/ECCurve;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->al:Lorg/bouncycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public final f()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9Curve;->am:[B

    return-object v0
.end method
