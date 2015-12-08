.class final Lorg/spongycastle/crypto/generators/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lorg/spongycastle/crypto/generators/a;

.field private static final b:Ljava/math/BigInteger;

.field private static final c:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 11
    new-instance v0, Lorg/spongycastle/crypto/generators/a;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/a;-><init>()V

    sput-object v0, Lorg/spongycastle/crypto/generators/a;->a:Lorg/spongycastle/crypto/generators/a;

    .line 13
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/generators/a;->b:Ljava/math/BigInteger;

    .line 14
    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/generators/a;->c:Ljava/math/BigInteger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method static a(Lorg/spongycastle/crypto/params/DHParameters;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 2

    .prologue
    .line 49
    invoke-virtual {p0}, Lorg/spongycastle/crypto/params/DHParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0}, Lorg/spongycastle/crypto/params/DHParameters;->a()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method static a(Lorg/spongycastle/crypto/params/DHParameters;Ljava/security/SecureRandom;)Ljava/math/BigInteger;
    .locals 3

    .prologue
    .line 22
    invoke-virtual {p0}, Lorg/spongycastle/crypto/params/DHParameters;->a()Ljava/math/BigInteger;

    move-result-object v1

    .line 23
    invoke-virtual {p0}, Lorg/spongycastle/crypto/params/DHParameters;->e()I

    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 27
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0, p1}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v0

    .line 44
    :goto_0
    return-object v0

    .line 30
    :cond_0
    sget-object v0, Lorg/spongycastle/crypto/generators/a;->c:Ljava/math/BigInteger;

    .line 31
    invoke-virtual {p0}, Lorg/spongycastle/crypto/params/DHParameters;->d()I

    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 34
    sget-object v0, Lorg/spongycastle/crypto/generators/a;->b:Ljava/math/BigInteger;

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v0

    .line 37
    :cond_1
    sget-object v2, Lorg/spongycastle/crypto/generators/a;->c:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 38
    invoke-virtual {p0}, Lorg/spongycastle/crypto/params/DHParameters;->c()Ljava/math/BigInteger;

    move-result-object v2

    .line 39
    if-eqz v2, :cond_2

    .line 41
    sget-object v1, Lorg/spongycastle/crypto/generators/a;->c:Ljava/math/BigInteger;

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 44
    :cond_2
    invoke-static {v0, v1, p1}, Lorg/spongycastle/util/BigIntegers;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method
