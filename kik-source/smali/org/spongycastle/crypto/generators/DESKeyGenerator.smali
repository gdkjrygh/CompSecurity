.class public Lorg/spongycastle/crypto/generators/DESKeyGenerator;
.super Lorg/spongycastle/crypto/CipherKeyGenerator;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lorg/spongycastle/crypto/CipherKeyGenerator;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 20
    invoke-super {p0, p1}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 22
    iget v0, p0, Lorg/spongycastle/crypto/generators/DESKeyGenerator;->b:I

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/spongycastle/crypto/generators/DESKeyGenerator;->b:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_2

    .line 24
    :cond_0
    iput v2, p0, Lorg/spongycastle/crypto/generators/DESKeyGenerator;->b:I

    .line 32
    :cond_1
    return-void

    .line 26
    :cond_2
    iget v0, p0, Lorg/spongycastle/crypto/generators/DESKeyGenerator;->b:I

    if-eq v0, v2, :cond_1

    .line 28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DES key must be 64 bits long."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()[B
    .locals 2

    .prologue
    .line 36
    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 40
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/crypto/generators/DESKeyGenerator;->a:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 42
    invoke-static {v0}, Lorg/spongycastle/crypto/params/DESParameters;->a([B)V

    .line 44
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/params/DESParameters;->a([BI)Z

    move-result v1

    if-nez v1, :cond_0

    .line 46
    return-object v0
.end method
