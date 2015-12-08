.class public Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DerivationFunction;


# instance fields
.field private final a:Lorg/spongycastle/crypto/Digest;

.field private b:Lorg/spongycastle/asn1/DERObjectIdentifier;

.field private c:I

.field private d:[B

.field private e:[B


# direct methods
.method private static a(I)[B
    .locals 3

    .prologue
    .line 133
    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 135
    const/4 v1, 0x0

    shr-int/lit8 v2, p0, 0x18

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 136
    const/4 v1, 0x1

    shr-int/lit8 v2, p0, 0x10

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 137
    const/4 v1, 0x2

    shr-int/lit8 v2, p0, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 138
    const/4 v1, 0x3

    int-to-byte v2, p0

    aput-byte v2, v0, v1

    .line 140
    return-object v0
.end method


# virtual methods
.method public final a([BII)I
    .locals 15

    .prologue
    .line 53
    move-object/from16 v0, p1

    array-length v2, v0

    sub-int v2, v2, p3

    move/from16 v0, p2

    if-ge v2, v0, :cond_0

    .line 55
    new-instance v2, Lorg/spongycastle/crypto/DataLengthException;

    const-string v3, "output buffer too small"

    invoke-direct {v2, v3}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 58
    :cond_0
    move/from16 v0, p3

    int-to-long v2, v0

    .line 59
    iget-object v4, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v4}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v6

    .line 67
    const-wide v4, 0x1ffffffffL

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    .line 69
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Output length too large"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 72
    :cond_1
    int-to-long v4, v6

    add-long/2addr v2, v4

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    int-to-long v4, v6

    div-long/2addr v2, v4

    long-to-int v7, v2

    .line 74
    iget-object v2, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v2

    new-array v8, v2, [B

    .line 76
    const/4 v3, 0x1

    .line 78
    const/4 v2, 0x0

    move v4, v2

    move v5, v3

    move/from16 v2, p3

    move/from16 v3, p2

    :goto_0
    if-ge v4, v7, :cond_4

    .line 80
    iget-object v9, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v10, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->d:[B

    const/4 v11, 0x0

    iget-object v12, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->d:[B

    array-length v12, v12

    invoke-interface {v9, v10, v11, v12}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 83
    new-instance v9, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v9}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 85
    new-instance v10, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v10}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 87
    iget-object v11, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v10, v11}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 88
    new-instance v11, Lorg/spongycastle/asn1/DEROctetString;

    invoke-static {v5}, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a(I)[B

    move-result-object v12

    invoke-direct {v11, v12}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-virtual {v10, v11}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 90
    new-instance v11, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v11, v10}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v9, v11}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 92
    iget-object v10, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->e:[B

    if-eqz v10, :cond_2

    .line 94
    new-instance v10, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v11, 0x1

    const/4 v12, 0x0

    new-instance v13, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v14, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->e:[B

    invoke-direct {v13, v14}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v10, v11, v12, v13}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v9, v10}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 97
    :cond_2
    new-instance v10, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v11, 0x1

    const/4 v12, 0x2

    new-instance v13, Lorg/spongycastle/asn1/DEROctetString;

    iget v14, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->c:I

    invoke-static {v14}, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a(I)[B

    move-result-object v14

    invoke-direct {v13, v14}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v10, v11, v12, v13}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v9, v10}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 101
    :try_start_0
    new-instance v10, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v10, v9}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    const-string v9, "DER"

    invoke-virtual {v10, v9}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/String;)[B

    move-result-object v9

    .line 103
    iget-object v10, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/spongycastle/crypto/Digest;

    const/4 v11, 0x0

    array-length v12, v9

    invoke-interface {v10, v9, v11, v12}, Lorg/spongycastle/crypto/Digest;->a([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    iget-object v9, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/spongycastle/crypto/Digest;

    const/4 v10, 0x0

    invoke-interface {v9, v8, v10}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 112
    if-le v2, v6, :cond_3

    .line 114
    const/4 v9, 0x0

    move-object/from16 v0, p1

    invoke-static {v8, v9, v0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 115
    add-int/2addr v3, v6

    .line 116
    sub-int/2addr v2, v6

    .line 123
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 78
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 105
    :catch_0
    move-exception v2

    .line 107
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "unable to encode parameter info: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 120
    :cond_3
    const/4 v9, 0x0

    move-object/from16 v0, p1

    invoke-static {v8, v9, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 126
    :cond_4
    iget-object v3, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 128
    return v2
.end method

.method public final a(Lorg/spongycastle/crypto/DerivationParameters;)V
    .locals 1

    .prologue
    .line 37
    check-cast p1, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;

    .line 39
    invoke-virtual {p1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;->a()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 40
    invoke-virtual {p1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->c:I

    .line 41
    invoke-virtual {p1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;->c()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->d:[B

    .line 42
    invoke-virtual {p1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;->d()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/kdf/DHKEKGenerator;->e:[B

    .line 43
    return-void
.end method
