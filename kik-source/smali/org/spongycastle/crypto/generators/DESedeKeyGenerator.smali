.class public Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;
.super Lorg/spongycastle/crypto/generators/DESKeyGenerator;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Lorg/spongycastle/crypto/generators/DESKeyGenerator;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V
    .locals 4

    .prologue
    const/16 v3, 0x18

    const/16 v2, 0x10

    .line 21
    invoke-virtual {p1}, Lorg/spongycastle/crypto/KeyGenerationParameters;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->a:Ljava/security/SecureRandom;

    .line 22
    invoke-virtual {p1}, Lorg/spongycastle/crypto/KeyGenerationParameters;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    .line 24
    iget v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_2

    .line 26
    :cond_0
    iput v3, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    .line 40
    :cond_1
    :goto_0
    return-void

    .line 28
    :cond_2
    iget v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    const/16 v1, 0xe

    if-ne v0, v1, :cond_3

    .line 30
    iput v2, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    goto :goto_0

    .line 32
    :cond_3
    iget v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    if-eq v0, v3, :cond_1

    iget v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    if-eq v0, v2, :cond_1

    .line 35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DESede key must be 192 or 128 bits long."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a()[B
    .locals 2

    .prologue
    .line 44
    iget v0, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->b:I

    new-array v0, v0, [B

    .line 48
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/crypto/generators/DESedeKeyGenerator;->a:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 50
    invoke-static {v0}, Lorg/spongycastle/crypto/params/DESedeParameters;->a([B)V

    .line 52
    array-length v1, v0

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/params/DESedeParameters;->b([BI)Z

    move-result v1

    if-nez v1, :cond_0

    .line 54
    return-object v0
.end method
