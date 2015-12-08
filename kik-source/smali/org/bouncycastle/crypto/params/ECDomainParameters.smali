.class public Lorg/bouncycastle/crypto/params/ECDomainParameters;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/math/ec/ECConstants;


# instance fields
.field a:Lorg/bouncycastle/math/ec/ECCurve;

.field b:[B

.field c:Lorg/bouncycastle/math/ec/ECPoint;

.field d:Ljava/math/BigInteger;

.field e:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->a:Lorg/bouncycastle/math/ec/ECCurve;

    iput-object p2, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->c:Lorg/bouncycastle/math/ec/ECPoint;

    iput-object p3, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->d:Ljava/math/BigInteger;

    sget-object v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->g:Ljava/math/BigInteger;

    iput-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->e:Ljava/math/BigInteger;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->b:[B

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->a:Lorg/bouncycastle/math/ec/ECCurve;

    iput-object p2, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->c:Lorg/bouncycastle/math/ec/ECPoint;

    iput-object p3, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->d:Ljava/math/BigInteger;

    iput-object p4, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->e:Ljava/math/BigInteger;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->b:[B

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->a:Lorg/bouncycastle/math/ec/ECCurve;

    iput-object p2, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->c:Lorg/bouncycastle/math/ec/ECPoint;

    iput-object p3, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->d:Ljava/math/BigInteger;

    iput-object p4, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->e:Ljava/math/BigInteger;

    iput-object p5, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->b:[B

    return-void
.end method


# virtual methods
.method public getCurve()Lorg/bouncycastle/math/ec/ECCurve;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->a:Lorg/bouncycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public getG()Lorg/bouncycastle/math/ec/ECPoint;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->c:Lorg/bouncycastle/math/ec/ECPoint;

    return-object v0
.end method

.method public getH()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->e:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getN()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->d:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getSeed()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/params/ECDomainParameters;->b:[B

    return-object v0
.end method
