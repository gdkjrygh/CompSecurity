.class public Lorg/spongycastle/asn1/x9/X9Curve;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;


# instance fields
.field private al:Lorg/spongycastle/math/ec/ECCurve;

.field private am:[B

.field private an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/x9/X9FieldID;Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 12

    .prologue
    const/4 v11, 0x2

    const/4 v7, 0x1

    const/4 v5, 0x0

    .line 48
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 49
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x9/X9FieldID;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 50
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9Curve;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 52
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x9/X9FieldID;->d()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v1

    .line 53
    new-instance v2, Lorg/spongycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v5}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-direct {v2, v1, v0}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/ASN1OctetString;)V

    .line 54
    new-instance v3, Lorg/spongycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v7}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-direct {v3, v1, v0}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/ASN1OctetString;)V

    .line 55
    new-instance v0, Lorg/spongycastle/math/ec/ECCurve$Fp;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x9/X9FieldElement;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x9/X9FieldElement;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    .line 96
    :cond_0
    :goto_0
    invoke-virtual {p2}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 98
    invoke-virtual {p2, v11}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERBitString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->am:[B

    .line 100
    :cond_1
    return-void

    .line 59
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/x9/X9Curve;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x9/X9FieldID;->d()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v2

    .line 63
    invoke-virtual {v2, v5}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    .line 65
    invoke-virtual {v2, v7}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 71
    sget-object v3, Lorg/spongycastle/asn1/x9/X9Curve;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 74
    invoke-virtual {v2, v11}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    move v4, v5

    move v3, v5

    .line 89
    :goto_1
    new-instance v0, Lorg/spongycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v5}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v5

    check-cast v5, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(IIIILorg/spongycastle/asn1/ASN1OctetString;)V

    .line 90
    new-instance v5, Lorg/spongycastle/asn1/x9/X9FieldElement;

    invoke-virtual {p2, v7}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v10

    check-cast v10, Lorg/spongycastle/asn1/ASN1OctetString;

    move v6, v1

    move v7, v2

    move v8, v3

    move v9, v4

    invoke-direct/range {v5 .. v10}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(IIIILorg/spongycastle/asn1/ASN1OctetString;)V

    .line 92
    new-instance v7, Lorg/spongycastle/math/ec/ECCurve$F2m;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x9/X9FieldElement;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x9/X9FieldElement;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v6

    move-object v0, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v6}, Lorg/spongycastle/math/ec/ECCurve$F2m;-><init>(IIIILjava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object v7, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    goto/16 :goto_0

    .line 80
    :cond_3
    invoke-virtual {v2, v11}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERSequence;

    .line 82
    invoke-virtual {v0, v5}, Lorg/spongycastle/asn1/DERSequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v6

    .line 84
    invoke-virtual {v0, v7}, Lorg/spongycastle/asn1/DERSequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    .line 86
    invoke-virtual {v0, v11}, Lorg/spongycastle/asn1/DERSequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    move v2, v6

    goto :goto_1
.end method

.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;[B)V
    .locals 2

    .prologue
    .line 39
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 40
    iput-object p1, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    .line 41
    iput-object p2, p0, Lorg/spongycastle/asn1/x9/X9Curve;->am:[B

    .line 42
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    instance-of v0, v0, Lorg/spongycastle/math/ec/ECCurve$Fp;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/spongycastle/asn1/x9/X9Curve;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    instance-of v0, v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    if-eqz v0, :cond_1

    sget-object v0, Lorg/spongycastle/asn1/x9/X9Curve;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "This type of ECCurve is not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 141
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 143
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sget-object v2, Lorg/spongycastle/asn1/x9/X9Curve;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 145
    new-instance v1, Lorg/spongycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x9/X9FieldElement;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 146
    new-instance v1, Lorg/spongycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x9/X9FieldElement;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 154
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9Curve;->am:[B

    if-eqz v1, :cond_1

    .line 156
    new-instance v1, Lorg/spongycastle/asn1/DERBitString;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9Curve;->am:[B

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/DERBitString;-><init>([B)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 159
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1

    .line 148
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9Curve;->an:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sget-object v2, Lorg/spongycastle/asn1/x9/X9Curve;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 150
    new-instance v1, Lorg/spongycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x9/X9FieldElement;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 151
    new-instance v1, Lorg/spongycastle/asn1/x9/X9FieldElement;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/x9/X9FieldElement;-><init>(Lorg/spongycastle/math/ec/ECFieldElement;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x9/X9FieldElement;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method

.method public final c()Lorg/spongycastle/math/ec/ECCurve;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->al:Lorg/spongycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public final d()[B
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9Curve;->am:[B

    return-object v0
.end method
