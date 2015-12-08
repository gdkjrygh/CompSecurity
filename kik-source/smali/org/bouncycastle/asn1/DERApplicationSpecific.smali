.class public Lorg/bouncycastle/asn1/DERApplicationSpecific;
.super Lorg/bouncycastle/asn1/ASN1Object;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:[B


# direct methods
.method public constructor <init>(ILorg/bouncycastle/asn1/ASN1EncodableVector;)V
    .locals 4

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->b:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a:Z

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p2, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-eq v1, v0, :cond_0

    :try_start_0
    invoke-virtual {p2, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Encodable;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Encodable;->a()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ParsingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "malformed object: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->c:[B

    return-void
.end method

.method constructor <init>(ZI[B)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Object;-><init>()V

    iput-boolean p1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a:Z

    iput p2, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->b:I

    iput-object p3, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->c:[B

    return-void
.end method


# virtual methods
.method final a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 3

    const/16 v0, 0x40

    iget-boolean v1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a:Z

    if-eqz v1, :cond_0

    const/16 v0, 0x60

    :cond_0
    iget v1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->b:I

    iget-object v2, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->c:[B

    invoke-virtual {p1, v0, v1, v2}, Lorg/bouncycastle/asn1/DEROutputStream;->a(II[B)V

    return-void
.end method

.method final a(Lorg/bouncycastle/asn1/DERObject;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/asn1/DERApplicationSpecific;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/asn1/DERApplicationSpecific;

    iget-boolean v1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a:Z

    iget-boolean v2, p1, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a:Z

    if-ne v1, v2, :cond_0

    iget v1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->b:I

    iget v2, p1, Lorg/bouncycastle/asn1/DERApplicationSpecific;->b:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->c:[B

    iget-object v2, p1, Lorg/bouncycastle/asn1/DERApplicationSpecific;->c:[B

    invoke-static {v1, v2}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a:Z

    return v0
.end method

.method public final f()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->c:[B

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->b:I

    return v0
.end method

.method public final h()Lorg/bouncycastle/asn1/DERObject;
    .locals 7

    const/4 v1, 0x1

    const/4 v5, 0x0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a()[B

    move-result-object v3

    aget-byte v0, v3, v5

    and-int/lit8 v0, v0, 0x1f

    const/16 v2, 0x1f

    if-ne v0, v2, :cond_1

    const/4 v0, 0x2

    aget-byte v2, v3, v1

    and-int/lit16 v2, v2, 0xff

    and-int/lit8 v4, v2, 0x7f

    if-nez v4, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ParsingException;

    const-string v1, "corrupted stream - invalid high tag number found"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :goto_0
    if-ltz v2, :cond_2

    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_2

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v3, v0

    and-int/lit16 v0, v0, 0xff

    move v6, v2

    move v2, v0

    move v0, v6

    goto :goto_0

    :cond_1
    move v0, v1

    :cond_2
    array-length v2, v3

    sub-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [B

    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    invoke-static {v3, v0, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v0, 0x10

    aput-byte v0, v2, v5

    aget-byte v0, v3, v5

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_3

    aget-byte v0, v2, v5

    or-int/lit8 v0, v0, 0x20

    int-to-byte v0, v0

    aput-byte v0, v2, v5

    :cond_3
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget v1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->b:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Lorg/bouncycastle/asn1/DERApplicationSpecific;->c:[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->b([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
