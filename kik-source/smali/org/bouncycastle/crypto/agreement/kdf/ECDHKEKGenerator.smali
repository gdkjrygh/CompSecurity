.class public Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/DerivationFunction;


# instance fields
.field private a:Lorg/bouncycastle/crypto/DerivationFunction;

.field private b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field private c:I

.field private d:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/generators/KDF2BytesGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->a:Lorg/bouncycastle/crypto/DerivationFunction;

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
    .locals 6

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v3, Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v3}, Lorg/bouncycastle/asn1/DERNull;-><init>()V

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    const/4 v3, 0x2

    new-instance v4, Lorg/bouncycastle/asn1/DEROctetString;

    iget v5, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->c:I

    invoke-direct {p0, v5}, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->integerToBytes(I)[B

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v2, v3, v4}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->a:Lorg/bouncycastle/crypto/DerivationFunction;

    new-instance v2, Lorg/bouncycastle/crypto/params/KDFParameters;

    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->d:[B

    new-instance v4, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v4, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/DERSequence;->b()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/crypto/params/KDFParameters;-><init>([B[B)V

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->a:Lorg/bouncycastle/crypto/DerivationFunction;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    move-result v0

    return v0
.end method

.method public getDigest()Lorg/bouncycastle/crypto/Digest;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->a:Lorg/bouncycastle/crypto/DerivationFunction;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/DerivationFunction;->getDigest()Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/DerivationParameters;)V
    .locals 1

    check-cast p1, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getAlgorithm()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getKeySize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->c:I

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->getZ()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;->d:[B

    return-void
.end method
