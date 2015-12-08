.class public Lorg/spongycastle/asn1/DERInteger;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"


# instance fields
.field a:[B


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .prologue
    .line 60
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 61
    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    .line 62
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 67
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    .line 68
    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 73
    iput-object p1, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    .line 74
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;
    .locals 3

    .prologue
    .line 21
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1Integer;

    if-eqz v0, :cond_1

    .line 23
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/ASN1Integer;

    .line 27
    :goto_0
    return-object p0

    .line 25
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/DERInteger;

    if-eqz v0, :cond_2

    .line 27
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    check-cast p0, Lorg/spongycastle/asn1/DERInteger;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    move-object p0, v0

    goto :goto_0

    .line 30
    :cond_2
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Integer;
    .locals 2

    .prologue
    .line 46
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 48
    if-nez p1, :cond_0

    instance-of v1, v0, Lorg/spongycastle/asn1/DERInteger;

    if-eqz v1, :cond_1

    .line 50
    :cond_0
    invoke-static {v0}, Lorg/spongycastle/asn1/DERInteger;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    .line 54
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>([B)V

    goto :goto_0
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 104
    const/4 v0, 0x2

    iget-object v1, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    invoke-virtual {p1, v0, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 105
    return-void
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 2

    .prologue
    .line 122
    instance-of v0, p1, Lorg/spongycastle/asn1/DERInteger;

    if-nez v0, :cond_0

    .line 124
    const/4 v0, 0x0

    .line 129
    :goto_0
    return v0

    .line 127
    :cond_0
    check-cast p1, Lorg/spongycastle/asn1/DERInteger;

    .line 129
    iget-object v0, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    iget-object v1, p1, Lorg/spongycastle/asn1/DERInteger;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 2

    .prologue
    .line 78
    new-instance v0, Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    return-object v0
.end method

.method public final d()Ljava/math/BigInteger;
    .locals 3

    .prologue
    .line 87
    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    return-object v0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 109
    move v1, v0

    .line 111
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    array-length v2, v2

    if-eq v0, v2, :cond_0

    .line 113
    iget-object v2, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    aget-byte v2, v2, v0

    and-int/lit16 v2, v2, 0xff

    rem-int/lit8 v3, v0, 0x4

    shl-int/2addr v2, v3

    xor-int/2addr v1, v2

    .line 111
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 116
    :cond_0
    return v1
.end method

.method final i()I
    .locals 2

    .prologue
    .line 97
    iget-object v0, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    array-length v0, v0

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lorg/spongycastle/asn1/DERInteger;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 134
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
