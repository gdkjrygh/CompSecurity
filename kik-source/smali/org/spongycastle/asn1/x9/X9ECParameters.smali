.class public Lorg/spongycastle/asn1/x9/X9ECParameters;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;


# static fields
.field private static final al:Ljava/math/BigInteger;


# instance fields
.field private am:Lorg/spongycastle/asn1/x9/X9FieldID;

.field private an:Lorg/spongycastle/math/ec/ECCurve;

.field private ao:Lorg/spongycastle/math/ec/ECPoint;

.field private ap:Ljava/math/BigInteger;

.field private aq:Ljava/math/BigInteger;

.field private ar:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 23
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/asn1/x9/X9ECParameters;->al:Ljava/math/BigInteger;

    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 34
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 35
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Lorg/spongycastle/asn1/x9/X9ECParameters;->al:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bad version in X9ECParameters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_1
    new-instance v1, Lorg/spongycastle/asn1/x9/X9Curve;

    new-instance v2, Lorg/spongycastle/asn1/x9/X9FieldID;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/spongycastle/asn1/x9/X9FieldID;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/asn1/x9/X9Curve;-><init>(Lorg/spongycastle/asn1/x9/X9FieldID;Lorg/spongycastle/asn1/ASN1Sequence;)V

    .line 45
    invoke-virtual {v1}, Lorg/spongycastle/asn1/x9/X9Curve;->c()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->an:Lorg/spongycastle/math/ec/ECCurve;

    .line 46
    new-instance v2, Lorg/spongycastle/asn1/x9/X9ECPoint;

    iget-object v3, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->an:Lorg/spongycastle/math/ec/ECCurve;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/asn1/x9/X9ECPoint;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/asn1/ASN1OctetString;)V

    iget-object v0, v2, Lorg/spongycastle/asn1/x9/X9ECPoint;->a:Lorg/spongycastle/math/ec/ECPoint;

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ao:Lorg/spongycastle/math/ec/ECPoint;

    .line 47
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    .line 48
    invoke-virtual {v1}, Lorg/spongycastle/asn1/x9/X9Curve;->d()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ar:[B

    .line 50
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 52
    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    .line 54
    :cond_2
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 6

    .prologue
    .line 85
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 86
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V
    .locals 5

    .prologue
    .line 94
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 95
    iput-object p1, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->an:Lorg/spongycastle/math/ec/ECCurve;

    .line 96
    iput-object p2, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ao:Lorg/spongycastle/math/ec/ECPoint;

    .line 97
    iput-object p3, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    .line 98
    iput-object p4, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    .line 99
    iput-object p5, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ar:[B

    .line 101
    instance-of v0, p1, Lorg/spongycastle/math/ec/ECCurve$Fp;

    if-eqz v0, :cond_1

    .line 103
    new-instance v0, Lorg/spongycastle/asn1/x9/X9FieldID;

    check-cast p1, Lorg/spongycastle/math/ec/ECCurve$Fp;

    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECCurve$Fp;->e()Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x9/X9FieldID;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->am:Lorg/spongycastle/asn1/x9/X9FieldID;

    .line 114
    :cond_0
    :goto_0
    return-void

    .line 107
    :cond_1
    instance-of v0, p1, Lorg/spongycastle/math/ec/ECCurve$F2m;

    if-eqz v0, :cond_0

    .line 109
    check-cast p1, Lorg/spongycastle/math/ec/ECCurve$F2m;

    .line 110
    new-instance v0, Lorg/spongycastle/asn1/x9/X9FieldID;

    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECCurve$F2m;->h()I

    move-result v1

    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECCurve$F2m;->j()I

    move-result v2

    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECCurve$F2m;->k()I

    move-result v3

    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECCurve$F2m;->l()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/spongycastle/asn1/x9/X9FieldID;-><init>(IIII)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->am:Lorg/spongycastle/asn1/x9/X9FieldID;

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x9/X9ECParameters;
    .locals 2

    .prologue
    .line 58
    instance-of v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;

    if-eqz v0, :cond_0

    .line 60
    check-cast p0, Lorg/spongycastle/asn1/x9/X9ECParameters;

    .line 68
    :goto_0
    return-object p0

    .line 63
    :cond_0
    if-eqz p0, :cond_1

    .line 65
    new-instance v0, Lorg/spongycastle/asn1/x9/X9ECParameters;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x9/X9ECParameters;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 68
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 161
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 163
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 164
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->am:Lorg/spongycastle/asn1/x9/X9FieldID;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 165
    new-instance v1, Lorg/spongycastle/asn1/x9/X9Curve;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->an:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v3, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ar:[B

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/x9/X9Curve;-><init>(Lorg/spongycastle/math/ec/ECCurve;[B)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 166
    new-instance v1, Lorg/spongycastle/asn1/x9/X9ECPoint;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ao:Lorg/spongycastle/math/ec/ECPoint;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/x9/X9ECPoint;-><init>(Lorg/spongycastle/math/ec/ECPoint;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 167
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 169
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    if-eqz v1, :cond_0

    .line 171
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    iget-object v2, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 174
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/math/ec/ECCurve;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->an:Lorg/spongycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ao:Lorg/spongycastle/math/ec/ECPoint;

    return-object v0
.end method

.method public final e()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ap:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final f()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    .line 135
    sget-object v0, Lorg/spongycastle/asn1/x9/X9ECParameters;->al:Ljava/math/BigInteger;

    .line 138
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->aq:Ljava/math/BigInteger;

    goto :goto_0
.end method

.method public final g()[B
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECParameters;->ar:[B

    return-object v0
.end method
