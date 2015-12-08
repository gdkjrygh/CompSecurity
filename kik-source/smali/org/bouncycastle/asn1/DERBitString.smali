.class public Lorg/bouncycastle/asn1/DERBitString;
.super Lorg/bouncycastle/asn1/ASN1Object;

# interfaces
.implements Lorg/bouncycastle/asn1/DERString;


# static fields
.field private static final c:[C


# instance fields
.field protected a:[B

.field protected b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/asn1/DERBitString;->c:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/DEREncodable;)V
    .locals 4

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    :try_start_0
    invoke-interface {p1}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/DERObject;->a(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/asn1/DERBitString;->b:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error processing object : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/asn1/DERBitString;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    iput p2, p0, Lorg/bouncycastle/asn1/DERBitString;->b:I

    return-void
.end method

.method protected static a(I)I
    .locals 3

    const/4 v1, 0x0

    const/4 v0, 0x3

    :goto_0
    if-ltz v0, :cond_0

    if-eqz v0, :cond_1

    mul-int/lit8 v2, v0, 0x8

    shr-int v2, p0, v2

    if-eqz v2, :cond_2

    mul-int/lit8 v0, v0, 0x8

    shr-int v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    :cond_0
    :goto_1
    if-nez v1, :cond_3

    const/4 v0, 0x7

    :goto_2
    return v0

    :cond_1
    if-eqz p0, :cond_2

    and-int/lit16 v1, p0, 0xff

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :goto_3
    shl-int/lit8 v1, v1, 0x1

    and-int/lit16 v2, v1, 0xff

    if-eqz v2, :cond_4

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    rsub-int/lit8 v0, v0, 0x8

    goto :goto_2
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;
    .locals 3

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/DERBitString;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/DERBitString;

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

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/DERBitString;
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->i()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    instance-of v1, v0, Lorg/bouncycastle/asn1/DERBitString;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/DERBitString;->b([B)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    goto :goto_0
.end method

.method static b([B)Lorg/bouncycastle/asn1/DERBitString;
    .locals 5

    const/4 v4, 0x0

    array-length v0, p0

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "truncated BIT STRING detected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    aget-byte v0, p0, v4

    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    new-array v1, v1, [B

    array-length v2, v1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    array-length v3, p0

    add-int/lit8 v3, v3, -0x1

    invoke-static {p0, v2, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    new-instance v2, Lorg/bouncycastle/asn1/DERBitString;

    invoke-direct {v2, v1, v0}, Lorg/bouncycastle/asn1/DERBitString;-><init>([BI)V

    return-object v2
.end method

.method protected static b(I)[B
    .locals 4

    const/4 v1, 0x4

    const/4 v0, 0x3

    :goto_0
    if-lez v0, :cond_0

    const/16 v2, 0xff

    mul-int/lit8 v3, v0, 0x8

    shl-int/2addr v2, v3

    and-int/2addr v2, p0

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    new-array v2, v1, [B

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_1

    mul-int/lit8 v3, v0, 0x8

    shr-int v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method


# virtual methods
.method final a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    iget v1, p0, Lorg/bouncycastle/asn1/DERBitString;->b:I

    int-to-byte v1, v1

    aput-byte v1, v0, v4

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    const/4 v2, 0x1

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    invoke-static {v1, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lorg/bouncycastle/asn1/DEROutputStream;->a(I[B)V

    return-void
.end method

.method protected final a(Lorg/bouncycastle/asn1/DERObject;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/asn1/DERBitString;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/asn1/DERBitString;

    iget v1, p0, Lorg/bouncycastle/asn1/DERBitString;->b:I

    iget v2, p1, Lorg/bouncycastle/asn1/DERBitString;->b:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    iget-object v2, p1, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    invoke-static {v1, v2}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final e()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/asn1/DERBitString;->b:I

    return v0
.end method

.method public final g()I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    array-length v2, v2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    aget-byte v2, v2, v0

    and-int/lit16 v2, v2, 0xff

    mul-int/lit8 v3, v0, 0x8

    shl-int/2addr v2, v3

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lorg/bouncycastle/asn1/DERBitString;->b:I

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERBitString;->a:[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->b([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final n_()Ljava/lang/String;
    .locals 5

    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "#"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Lorg/bouncycastle/asn1/ASN1OutputStream;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    :try_start_0
    invoke-virtual {v2, p0}, Lorg/bouncycastle/asn1/ASN1OutputStream;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_0

    sget-object v3, Lorg/bouncycastle/asn1/DERBitString;->c:[C

    aget-byte v4, v2, v0

    ushr-int/lit8 v4, v4, 0x4

    and-int/lit8 v4, v4, 0xf

    aget-char v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v3, Lorg/bouncycastle/asn1/DERBitString;->c:[C

    aget-byte v4, v2, v0

    and-int/lit8 v4, v4, 0xf

    aget-char v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "internal error encoding BitString"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DERBitString;->n_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
