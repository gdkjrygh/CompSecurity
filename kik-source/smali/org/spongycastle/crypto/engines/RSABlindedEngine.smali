.class public Lorg/spongycastle/crypto/engines/RSABlindedEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricBlockCipher;


# static fields
.field private static a:Ljava/math/BigInteger;


# instance fields
.field private b:Lorg/spongycastle/crypto/engines/a;

.field private c:Lorg/spongycastle/crypto/params/RSAKeyParameters;

.field private d:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 20
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->a:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lorg/spongycastle/crypto/engines/a;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/a;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/engines/a;->a()I

    move-result v0

    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v0, p1, p2}, Lorg/spongycastle/crypto/engines/a;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 38
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 40
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 42
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/RSAKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->c:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    .line 43
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->d:Ljava/security/SecureRandom;

    .line 50
    :goto_0
    return-void

    .line 47
    :cond_0
    check-cast p2, Lorg/spongycastle/crypto/params/RSAKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->c:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    .line 48
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->d:Ljava/security/SecureRandom;

    goto :goto_0
.end method

.method public final a([BII)[B
    .locals 6

    .prologue
    .line 90
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->c:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    if-nez v0, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RSA engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v0, p1, p2, p3}, Lorg/spongycastle/crypto/engines/a;->a([BII)Ljava/math/BigInteger;

    move-result-object v1

    .line 98
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->c:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    instance-of v0, v0, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;

    if-eqz v0, :cond_2

    .line 100
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->c:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;

    .line 102
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;->d()Ljava/math/BigInteger;

    move-result-object v2

    .line 103
    if-eqz v2, :cond_1

    .line 105
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    .line 106
    sget-object v3, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->a:Ljava/math/BigInteger;

    sget-object v4, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->d:Ljava/security/SecureRandom;

    invoke-static {v3, v4, v5}, Lorg/spongycastle/util/BigIntegers;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v3

    .line 108
    invoke-virtual {v3, v2, v0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 109
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v2, v1}, Lorg/spongycastle/crypto/engines/a;->b(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 111
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 112
    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 124
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v1, v0}, Lorg/spongycastle/crypto/engines/a;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0

    .line 116
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/engines/a;->b(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0

    .line 121
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/engines/a;->b(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;->b:Lorg/spongycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/engines/a;->b()I

    move-result v0

    return v0
.end method
