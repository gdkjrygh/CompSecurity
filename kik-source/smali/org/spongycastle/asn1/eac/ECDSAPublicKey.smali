.class public Lorg/spongycastle/asn1/eac/ECDSAPublicKey;
.super Lorg/spongycastle/asn1/eac/PublicKeyDataObject;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private b:Ljava/math/BigInteger;

.field private c:Ljava/math/BigInteger;

.field private d:Ljava/math/BigInteger;

.field private e:[B

.field private f:Ljava/math/BigInteger;

.field private g:[B

.field private h:Ljava/math/BigInteger;

.field private i:I


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 339
    new-instance v2, Lorg/spongycastle/asn1/DERSequence;

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->a:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v3, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {v3, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v4, Lorg/spongycastle/asn1/eac/UnsignedInteger;

    const/4 v5, 0x1

    iget v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->i:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->b:Ljava/math/BigInteger;

    :goto_0
    invoke-direct {v4, v5, v0}, Lorg/spongycastle/asn1/eac/UnsignedInteger;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v4, Lorg/spongycastle/asn1/eac/UnsignedInteger;

    const/4 v5, 0x2

    iget v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->i:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->c:Ljava/math/BigInteger;

    :goto_1
    invoke-direct {v4, v5, v0}, Lorg/spongycastle/asn1/eac/UnsignedInteger;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v4, Lorg/spongycastle/asn1/eac/UnsignedInteger;

    const/4 v5, 0x3

    iget v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->i:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->d:Ljava/math/BigInteger;

    :goto_2
    invoke-direct {v4, v5, v0}, Lorg/spongycastle/asn1/eac/UnsignedInteger;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v4, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v5, 0x4

    new-instance v6, Lorg/spongycastle/asn1/DEROctetString;

    iget v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->i:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->e:[B

    :goto_3
    invoke-direct {v6, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v4, v7, v5, v6}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v4, Lorg/spongycastle/asn1/eac/UnsignedInteger;

    const/4 v5, 0x5

    iget v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->i:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->f:Ljava/math/BigInteger;

    :goto_4
    invoke-direct {v4, v5, v0}, Lorg/spongycastle/asn1/eac/UnsignedInteger;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v4, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v5, 0x6

    new-instance v6, Lorg/spongycastle/asn1/DEROctetString;

    iget v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->i:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_6

    iget-object v0, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->g:[B

    :goto_5
    invoke-direct {v6, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v4, v7, v5, v6}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/spongycastle/asn1/eac/UnsignedInteger;

    const/4 v4, 0x7

    iget v5, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->i:I

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_0

    iget-object v1, p0, Lorg/spongycastle/asn1/eac/ECDSAPublicKey;->h:Ljava/math/BigInteger;

    :cond_0
    invoke-direct {v0, v4, v1}, Lorg/spongycastle/asn1/eac/UnsignedInteger;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v3, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v2

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_2

    :cond_4
    move-object v0, v1

    goto :goto_3

    :cond_5
    move-object v0, v1

    goto :goto_4

    :cond_6
    move-object v0, v1

    goto :goto_5
.end method
