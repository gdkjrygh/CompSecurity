.class public Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;
.super Ljavax/crypto/KeyGeneratorSpi;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:I

.field protected c:I

.field protected d:Lorg/spongycastle/crypto/CipherKeyGenerator;

.field protected e:Z


# direct methods
.method protected constructor <init>(Ljava/lang/String;ILorg/spongycastle/crypto/CipherKeyGenerator;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljavax/crypto/KeyGeneratorSpi;-><init>()V

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->e:Z

    .line 30
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->a:Ljava/lang/String;

    .line 31
    iput p2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->c:I

    iput p2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->b:I

    .line 32
    iput-object p3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    .line 33
    return-void
.end method


# virtual methods
.method protected engineGenerateKey()Ljavax/crypto/SecretKey;
    .locals 4

    .prologue
    .line 70
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->e:Z

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    new-instance v1, Lorg/spongycastle/crypto/KeyGenerationParameters;

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    iget v3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->c:I

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->e:Z

    .line 76
    :cond_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a()[B

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method protected engineInit(ILjava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 59
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    new-instance v1, Lorg/spongycastle/crypto/KeyGenerationParameters;

    invoke-direct {v1, p2, p1}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->e:Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    return-void

    .line 62
    :catch_0
    move-exception v0

    .line 64
    new-instance v1, Ljava/security/InvalidParameterException;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(Ljava/security/SecureRandom;)V
    .locals 3

    .prologue
    .line 46
    if-eqz p1, :cond_0

    .line 48
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->d:Lorg/spongycastle/crypto/CipherKeyGenerator;

    new-instance v1, Lorg/spongycastle/crypto/KeyGenerationParameters;

    iget v2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->c:I

    invoke-direct {v1, p1, v2}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/CipherKeyGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator;->e:Z

    .line 51
    :cond_0
    return-void
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "Not Implemented"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
