.class public Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;
.super Lorg/bouncycastle/crypto/generators/DESKeyGenerator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/crypto/generators/DESKeyGenerator;-><init>()V

    return-void
.end method


# virtual methods
.method public generateKey()[B
    .locals 3

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    new-array v0, v0, [B

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->a:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v0}, Lorg/bouncycastle/crypto/params/DESedeParameters;->setOddParity([B)V

    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/params/DESedeParameters;->isWeakKey([BII)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V
    .locals 4

    const/16 v3, 0x18

    const/16 v2, 0x10

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->a:Ljava/security/SecureRandom;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getStrength()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_2

    :cond_0
    iput v3, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    const/16 v1, 0xe

    if-ne v0, v1, :cond_3

    iput v2, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    if-eq v0, v3, :cond_1

    iget v0, p0, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;->b:I

    if-eq v0, v2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DESede key must be 192 or 128 bits long."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
