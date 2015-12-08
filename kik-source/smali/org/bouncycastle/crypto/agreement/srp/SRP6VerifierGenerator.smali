.class public Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;
.super Ljava/lang/Object;


# instance fields
.field protected a:Ljava/math/BigInteger;

.field protected b:Ljava/math/BigInteger;

.field protected c:Lorg/bouncycastle/crypto/Digest;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public generateVerifier([B[B[B)Ljava/math/BigInteger;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;->c:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;->a:Ljava/math/BigInteger;

    invoke-static {v0, v1, p1, p2, p3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->calculateX(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;[B[B[B)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;->b:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v0, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public init(Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/Digest;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;->a:Ljava/math/BigInteger;

    iput-object p2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;->b:Ljava/math/BigInteger;

    iput-object p3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;->c:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method
