.class public Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;
.super Lorg/bouncycastle/crypto/params/RSAKeyParameters;


# instance fields
.field private b:Ljava/math/BigInteger;

.field private c:Ljava/math/BigInteger;

.field private d:Ljava/math/BigInteger;

.field private e:Ljava/math/BigInteger;

.field private f:Ljava/math/BigInteger;

.field private g:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p3}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;-><init>(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V

    iput-object p2, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->b:Ljava/math/BigInteger;

    iput-object p4, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->c:Ljava/math/BigInteger;

    iput-object p5, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->d:Ljava/math/BigInteger;

    iput-object p6, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->e:Ljava/math/BigInteger;

    iput-object p7, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->f:Ljava/math/BigInteger;

    iput-object p8, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->g:Ljava/math/BigInteger;

    return-void
.end method


# virtual methods
.method public getDP()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->e:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getDQ()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->f:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getP()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->c:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getPublicExponent()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getQ()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->d:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getQInv()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->g:Ljava/math/BigInteger;

    return-object v0
.end method
