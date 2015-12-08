.class public Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DerivationFunction;


# instance fields
.field private a:Lorg/spongycastle/crypto/DerivationFunction;

.field private b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private c:I

.field private d:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lorg/spongycastle/crypto/generators/KDF2BytesGenerator;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/generators/KDF2BytesGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->a:Lorg/spongycastle/crypto/DerivationFunction;

    .line 36
    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    .line 57
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 59
    new-instance v1, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    iget-object v2, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v3, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v3}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 60
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    new-instance v2, Lorg/spongycastle/asn1/DEROctetString;

    iget v3, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->c:I

    const/4 v4, 0x4

    new-array v4, v4, [B

    const/4 v5, 0x0

    shr-int/lit8 v6, v3, 0x18

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    shr-int/lit8 v5, v3, 0x10

    int-to-byte v5, v5

    aput-byte v5, v4, v7

    shr-int/lit8 v5, v3, 0x8

    int-to-byte v5, v5

    aput-byte v5, v4, v8

    const/4 v5, 0x3

    int-to-byte v3, v3

    aput-byte v3, v4, v5

    invoke-direct {v2, v4}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v1, v7, v8, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 64
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->a:Lorg/spongycastle/crypto/DerivationFunction;

    new-instance v2, Lorg/spongycastle/crypto/params/KDFParameters;

    iget-object v3, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->d:[B

    new-instance v4, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v4, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    const-string v0, "DER"

    invoke-virtual {v4, v0}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/crypto/params/KDFParameters;-><init>([B[B)V

    invoke-interface {v1, v2}, Lorg/spongycastle/crypto/DerivationFunction;->a(Lorg/spongycastle/crypto/DerivationParameters;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    iget-object v0, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->a:Lorg/spongycastle/crypto/DerivationFunction;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/DerivationFunction;->a([BII)I

    move-result v0

    return v0

    .line 66
    :catch_0
    move-exception v0

    .line 68
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unable to initialise kdf: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final a(Lorg/spongycastle/crypto/DerivationParameters;)V
    .locals 1

    .prologue
    .line 40
    check-cast p1, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;

    .line 42
    invoke-virtual {p1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;->a()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 43
    invoke-virtual {p1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->c:I

    .line 44
    invoke-virtual {p1}, Lorg/spongycastle/crypto/agreement/kdf/DHKDFParameters;->c()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/kdf/ECDHKEKGenerator;->d:[B

    .line 45
    return-void
.end method
