.class public Lorg/spongycastle/crypto/generators/DHParametersGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/math/BigInteger;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 14
    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->d:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/crypto/params/DHParameters;
    .locals 5

    .prologue
    .line 44
    iget v0, p0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->a:I

    iget v1, p0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->b:I

    iget-object v2, p0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->c:Ljava/security/SecureRandom;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/generators/b;->a(IILjava/security/SecureRandom;)[Ljava/math/BigInteger;

    move-result-object v0

    .line 46
    const/4 v1, 0x0

    aget-object v1, v0, v1

    .line 47
    const/4 v2, 0x1

    aget-object v0, v0, v2

    .line 48
    iget-object v2, p0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->c:Ljava/security/SecureRandom;

    invoke-static {v1, v2}, Lorg/spongycastle/crypto/generators/b;->a(Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v2

    .line 50
    new-instance v3, Lorg/spongycastle/crypto/params/DHParameters;

    sget-object v4, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->d:Ljava/math/BigInteger;

    invoke-direct {v3, v1, v2, v0, v4}, Lorg/spongycastle/crypto/params/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v3
.end method

.method public final a(IILjava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 28
    iput p1, p0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->a:I

    .line 29
    iput p2, p0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->b:I

    .line 30
    iput-object p3, p0, Lorg/spongycastle/crypto/generators/DHParametersGenerator;->c:Ljava/security/SecureRandom;

    .line 31
    return-void
.end method
