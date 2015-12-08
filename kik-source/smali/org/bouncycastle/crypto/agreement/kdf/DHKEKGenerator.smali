.class public Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/DerivationFunction;


# instance fields
.field private final a:Lorg/bouncycastle/crypto/Digest;

.field private b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field private c:I

.field private d:[B

.field private e:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method

.method private integerToBytes(I)[B
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    shr-int/lit8 v2, p1, 0x18

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/4 v1, 0x1

    shr-int/lit8 v2, p1, 0x10

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/4 v1, 0x2

    shr-int/lit8 v2, p1, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/4 v1, 0x3

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    return-object v0
.end method


# virtual methods
.method public generateBytes([BII)I
    .locals 15

    move-object/from16 v0, p1

    array-length v2, v0

    sub-int v2, v2, p3

    move/from16 v0, p2

    if-ge v2, v0, :cond_0

    new-instance v2, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v3, "output buffer too small"

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_0
    move/from16 v0, p3

    int-to-long v2, v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v6

    const-wide v4, 0x1ffffffffL

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Output length too large"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    int-to-long v4, v6

    add-long/2addr v2, v4

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    int-to-long v4, v6

    div-long/2addr v2, v4

    long-to-int v7, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    new-array v8, v2, [B

    const/4 v3, 0x1

    const/4 v2, 0x0

    move v4, v2

    move v5, v3

    move/from16 v2, p3

    move/from16 v3, p2

    :goto_0
    if-ge v4, v7, :cond_4

    iget-object v9, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    iget-object v10, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->d:[B

    const/4 v11, 0x0

    iget-object v12, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->d:[B

    array-length v12, v12

    invoke-interface {v9, v10, v11, v12}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    new-instance v9, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v9}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v10, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v11, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v10, v11}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v11, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {p0, v5}, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->integerToBytes(I)[B

    move-result-object v12

    invoke-direct {v11, v12}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-virtual {v10, v11}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v11, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v11, v10}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v9, v11}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v10, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->e:[B

    if-eqz v10, :cond_2

    new-instance v10, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v11, 0x1

    const/4 v12, 0x0

    new-instance v13, Lorg/bouncycastle/asn1/DEROctetString;

    iget-object v14, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->e:[B

    invoke-direct {v13, v14}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v10, v11, v12, v13}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v9, v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    new-instance v10, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v11, 0x1

    const/4 v12, 0x2

    new-instance v13, Lorg/bouncycastle/asn1/DEROctetString;

    iget v14, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->c:I

    invoke-direct {p0, v14}, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->integerToBytes(I)[B

    move-result-object v14

    invoke-direct {v13, v14}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v10, v11, v12, v13}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v9, v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v10, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v10, v9}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v10}, Lorg/bouncycastle/asn1/DERSequence;->b()[B

    move-result-object v9

    iget-object v10, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    const/4 v11, 0x0

    array-length v12, v9

    invoke-interface {v10, v9, v11, v12}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v9, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    const/4 v10, 0x0

    invoke-interface {v9, v8, v10}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    if-le v2, v6, :cond_3

    const/4 v9, 0x0

    move-object/from16 v0, p1

    invoke-static {v8, v9, v0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    sub-int/2addr v2, v6

    :goto_1
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v9, 0x0

    move-object/from16 v0, p1

    invoke-static {v8, v9, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_4
    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/bouncycastle/crypto/Digest;->reset()V

    return v2
.end method

.method public getDigest()Lorg/bouncycastle/crypto/Digest;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/bouncycastle/crypto/Digest;

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/DerivationParameters;)V
    .locals 1

    check-cast p1, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getAlgorithm()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getKeySize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->c:I

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getZ()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->d:[B

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getExtraInfo()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKEKGenerator;->e:[B

    return-void
.end method
