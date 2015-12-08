.class public Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricCipherKeyPairGenerator;


# static fields
.field private static final a:Ljava/math/BigInteger;


# instance fields
.field private b:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 24
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;
    .locals 5

    .prologue
    .line 36
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->b:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;->c()Lorg/spongycastle/crypto/params/DSAParameters;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->b:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;->a()Ljava/security/SecureRandom;

    move-result-object v2

    sget-object v3, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    sget-object v4, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v3, v1, v2}, Lorg/spongycastle/util/BigIntegers;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v1

    .line 39
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAParameters;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAParameters;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 41
    new-instance v3, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;

    new-instance v4, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;

    invoke-direct {v4, v2, v0}, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DSAParameters;)V

    new-instance v2, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;

    invoke-direct {v2, v1, v0}, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DSAParameters;)V

    invoke-direct {v3, v4, v2}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;-><init>(Lorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;)V

    return-object v3
.end method

.method public final a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V
    .locals 0

    .prologue
    .line 31
    check-cast p1, Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    iput-object p1, p0, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->b:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    .line 32
    return-void
.end method
