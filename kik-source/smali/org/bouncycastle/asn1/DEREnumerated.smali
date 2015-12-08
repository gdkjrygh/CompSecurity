.class public Lorg/bouncycastle/asn1/DEREnumerated;
.super Lorg/bouncycastle/asn1/ASN1Object;


# instance fields
.field a:[B


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/DEREnumerated;->a:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/DEREnumerated;->a:[B

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DEREnumerated;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/DEREnumerated;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/DEREnumerated;

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "illegal object in getInstance: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method final a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 2

    const/16 v0, 0xa

    iget-object v1, p0, Lorg/bouncycastle/asn1/DEREnumerated;->a:[B

    invoke-virtual {p1, v0, v1}, Lorg/bouncycastle/asn1/DEROutputStream;->a(I[B)V

    return-void
.end method

.method final a(Lorg/bouncycastle/asn1/DERObject;)Z
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/asn1/DEREnumerated;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p1, Lorg/bouncycastle/asn1/DEREnumerated;

    iget-object v0, p0, Lorg/bouncycastle/asn1/DEREnumerated;->a:[B

    iget-object v1, p1, Lorg/bouncycastle/asn1/DEREnumerated;->a:[B

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public final e()Ljava/math/BigInteger;
    .locals 2

    new-instance v0, Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/bouncycastle/asn1/DEREnumerated;->a:[B

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/DEREnumerated;->a:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->b([B)I

    move-result v0

    return v0
.end method
