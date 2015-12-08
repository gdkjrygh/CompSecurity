.class public Lorg/bouncycastle/asn1/DERObjectIdentifier;
.super Lorg/bouncycastle/asn1/ASN1Object;


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    const/16 v7, 0x30

    const/16 v6, 0x2e

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x3

    if-lt v0, v3, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v6, :cond_1

    :cond_0
    :goto_0
    if-nez v2, :cond_4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "string "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not an OID"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-lt v0, v7, :cond_0

    const/16 v3, 0x32

    if-gt v0, v3, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    move v0, v2

    :goto_1
    const/4 v4, 0x2

    if-lt v3, v4, :cond_3

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-gt v7, v4, :cond_2

    const/16 v5, 0x39

    if-gt v4, v5, :cond_2

    move v0, v1

    :goto_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    if-ne v4, v6, :cond_0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_2

    :cond_3
    move v2, v0

    goto :goto_0

    :cond_4
    iput-object p1, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>([B)V
    .locals 11

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    move v10, v0

    move-object v0, v2

    move-wide v2, v4

    move v4, v10

    :goto_0
    array-length v5, p1

    if-eq v4, v5, :cond_3

    aget-byte v5, p1, v4

    and-int/lit16 v5, v5, 0xff

    const-wide/high16 v8, 0x80000000000000L

    cmp-long v7, v2, v8

    if-gez v7, :cond_1

    const-wide/16 v8, 0x80

    mul-long/2addr v2, v8

    and-int/lit8 v7, v5, 0x7f

    int-to-long v8, v7

    add-long/2addr v2, v8

    and-int/lit16 v5, v5, 0x80

    if-nez v5, :cond_4

    if-eqz v1, :cond_0

    long-to-int v1, v2

    div-int/lit8 v1, v1, 0x28

    packed-switch v1, :pswitch_data_0

    const/16 v1, 0x32

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const-wide/16 v8, 0x50

    sub-long/2addr v2, v8

    :goto_1
    const/4 v1, 0x0

    :cond_0
    const/16 v5, 0x2e

    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-wide/16 v2, 0x0

    move v10, v1

    move-object v1, v0

    move v0, v10

    :goto_2
    add-int/lit8 v4, v4, 0x1

    move v10, v0

    move-object v0, v1

    move v1, v10

    goto :goto_0

    :pswitch_0
    const/16 v1, 0x30

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    :pswitch_1
    const/16 v1, 0x31

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const-wide/16 v8, 0x28

    sub-long/2addr v2, v8

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    :cond_2
    const/4 v7, 0x7

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v0

    and-int/lit8 v7, v5, 0x7f

    int-to-long v8, v7

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    and-int/lit16 v5, v5, 0x80

    if-nez v5, :cond_4

    const/16 v2, 0x2e

    invoke-virtual {v6, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    move v10, v1

    move-object v1, v0

    move v0, v10

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    return-void

    :cond_4
    move v10, v1

    move-object v1, v0

    move v0, v10

    goto :goto_2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

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

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    instance-of v1, v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>([B)V

    goto :goto_0
.end method

.method private static a(Ljava/io/OutputStream;J)V
    .locals 5

    const/16 v0, 0x8

    const/16 v1, 0x9

    new-array v1, v1, [B

    long-to-int v2, p1

    and-int/lit8 v2, v2, 0x7f

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    :goto_0
    const-wide/16 v2, 0x80

    cmp-long v2, p1, v2

    if-ltz v2, :cond_0

    const/4 v2, 0x7

    shr-long/2addr p1, v2

    add-int/lit8 v0, v0, -0x1

    long-to-int v2, p1

    and-int/lit8 v2, v2, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    goto :goto_0

    :cond_0
    rsub-int/lit8 v2, v0, 0x9

    invoke-virtual {p0, v1, v0, v2}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method private static a(Ljava/io/OutputStream;Ljava/math/BigInteger;)V
    .locals 4

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    div-int/lit8 v1, v0, 0x7

    if-nez v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    :goto_0
    return-void

    :cond_0
    new-array v2, v1, [B

    add-int/lit8 v0, v1, -0x1

    :goto_1
    if-ltz v0, :cond_1

    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    and-int/lit8 v3, v3, 0x7f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    const/4 v3, 0x7

    invoke-virtual {p1, v3}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object p1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v1, -0x1

    aget-byte v1, v2, v0

    and-int/lit8 v1, v1, 0x7f

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0
.end method


# virtual methods
.method final a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 6

    new-instance v0, Lorg/bouncycastle/asn1/OIDTokenizer;

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/OIDTokenizer;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Lorg/bouncycastle/asn1/DEROutputStream;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/DEROutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/OIDTokenizer;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    mul-int/lit8 v3, v3, 0x28

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/OIDTokenizer;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v3, v4

    int-to-long v4, v3

    invoke-static {v1, v4, v5}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Ljava/io/OutputStream;J)V

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/OIDTokenizer;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/OIDTokenizer;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x12

    if-ge v4, v5, :cond_0

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v1, v4, v5}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Ljava/io/OutputStream;J)V

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/math/BigInteger;

    invoke-direct {v4, v3}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v4}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Ljava/io/OutputStream;Ljava/math/BigInteger;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/DEROutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lorg/bouncycastle/asn1/DEROutputStream;->a(I[B)V

    return-void
.end method

.method final a(Lorg/bouncycastle/asn1/DERObject;)Z
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    check-cast p1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v1, p1, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    return-object v0
.end method
