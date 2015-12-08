.class public Lorg/bouncycastle/asn1/x9/X9ECParameters;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;


# static fields
.field private static final al:Ljava/math/BigInteger;


# instance fields
.field private am:Lorg/bouncycastle/asn1/x9/X9FieldID;

.field private an:Lorg/bouncycastle/math/ec/ECCurve;

.field private ao:Lorg/bouncycastle/math/ec/ECPoint;

.field private ap:Ljava/math/BigInteger;

.field private aq:Ljava/math/BigInteger;

.field private ar:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->al:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 4

    const/4 v1, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    instance-of v0, v0, Lorg/bouncycastle/asn1/DERInteger;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/asn1/x9/X9ECParameters;->al:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bad version in X9ECParameters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Lorg/bouncycastle/asn1/x9/X9Curve;

    new-instance v2, Lorg/bouncycastle/asn1/x9/X9FieldID;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/x9/X9FieldID;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/x9/X9Curve;-><init>(Lorg/bouncycastle/asn1/x9/X9FieldID;Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9Curve;->e()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->an:Lorg/bouncycastle/math/ec/ECCurve;

    new-instance v2, Lorg/bouncycastle/asn1/x9/X9ECPoint;

    iget-object v3, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->an:Lorg/bouncycastle/math/ec/ECCurve;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/asn1/x9/X9ECPoint;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/asn1/ASN1OctetString;)V

    iget-object v0, v2, Lorg/bouncycastle/asn1/x9/X9ECPoint;->a:Lorg/bouncycastle/math/ec/ECPoint;

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ao:Lorg/bouncycastle/math/ec/ECPoint;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X9Curve;->f()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ar:[B

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    :cond_2
    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V
    .locals 5

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->an:Lorg/bouncycastle/math/ec/ECCurve;

    iput-object p2, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ao:Lorg/bouncycastle/math/ec/ECPoint;

    iput-object p3, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    iput-object p4, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    iput-object p5, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ar:[B

    instance-of v0, p1, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x9/X9FieldID;

    check-cast p1, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECCurve$Fp;->e()Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x9/X9FieldID;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->am:Lorg/bouncycastle/asn1/x9/X9FieldID;

    :cond_0
    :goto_0
    return-void

    :cond_1
    instance-of v0, p1, Lorg/bouncycastle/math/ec/ECCurve$F2m;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/math/ec/ECCurve$F2m;

    new-instance v0, Lorg/bouncycastle/asn1/x9/X9FieldID;

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->h()I

    move-result v1

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->j()I

    move-result v2

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->k()I

    move-result v3

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->l()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/bouncycastle/asn1/x9/X9FieldID;-><init>(IIII)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->am:Lorg/bouncycastle/asn1/x9/X9FieldID;

    goto :goto_0
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->am:Lorg/bouncycastle/asn1/x9/X9FieldID;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/x9/X9Curve;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->an:Lorg/bouncycastle/math/ec/ECCurve;

    iget-object v3, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ar:[B

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/x9/X9Curve;-><init>(Lorg/bouncycastle/math/ec/ECCurve;[B)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/x9/X9ECPoint;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ao:Lorg/bouncycastle/math/ec/ECPoint;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/x9/X9ECPoint;-><init>(Lorg/bouncycastle/math/ec/ECPoint;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERInteger;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/DERInteger;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/math/ec/ECCurve;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->an:Lorg/bouncycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public final f()Lorg/bouncycastle/math/ec/ECPoint;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ao:Lorg/bouncycastle/math/ec/ECPoint;

    return-object v0
.end method

.method public final g()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final h()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    sget-object v0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->al:Ljava/math/BigInteger;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    goto :goto_0
.end method

.method public final i()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECParameters;->ar:[B

    return-object v0
.end method
