.class public Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/DerivationParameters;


# instance fields
.field private final a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field private final b:I

.field private final c:[B

.field private final d:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;I[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput p2, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->b:I

    iput-object p3, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->c:[B

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->d:[B

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;I[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput p2, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->b:I

    iput-object p3, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->c:[B

    iput-object p4, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->d:[B

    return-void
.end method


# virtual methods
.method public getAlgorithm()Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-object v0
.end method

.method public getExtraInfo()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->d:[B

    return-object v0
.end method

.method public getKeySize()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->b:I

    return v0
.end method

.method public getZ()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/kdf/DHKDFParameters;->c:[B

    return-object v0
.end method
