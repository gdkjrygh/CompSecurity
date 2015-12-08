.class public Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;
.super Ljava/lang/Object;


# instance fields
.field protected a:Ljava/math/BigInteger;

.field protected b:Ljava/math/BigInteger;

.field protected c:Ljava/math/BigInteger;

.field protected d:Ljava/math/BigInteger;

.field protected e:Ljava/math/BigInteger;

.field protected f:Ljava/math/BigInteger;

.field protected g:Ljava/math/BigInteger;

.field protected h:Ljava/math/BigInteger;

.field protected i:Lorg/bouncycastle/crypto/Digest;

.field protected j:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private calculateS()Ljava/math/BigInteger;
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->i:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->b:Ljava/math/BigInteger;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->calculateK(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->g:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->c:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->b:Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->f:Ljava/math/BigInteger;

    iget-object v4, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    invoke-virtual {v2, v3, v4}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->e:Ljava/math/BigInteger;

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public calculateSecret(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->validatePublicValue(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->e:Ljava/math/BigInteger;

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->i:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->d:Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->e:Ljava/math/BigInteger;

    invoke-static {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->calculateU(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->g:Ljava/math/BigInteger;

    invoke-direct {p0}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->calculateS()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->h:Ljava/math/BigInteger;

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->h:Ljava/math/BigInteger;

    return-object v0
.end method

.method public generateClientCredentials([B[B[B)Ljava/math/BigInteger;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->i:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    invoke-static {v0, v1, p1, p2, p3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->calculateX(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;[B[B[B)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->f:Ljava/math/BigInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->selectPrivateValue()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->c:Ljava/math/BigInteger;

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->b:Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->c:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->d:Ljava/math/BigInteger;

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->d:Ljava/math/BigInteger;

    return-object v0
.end method

.method public init(Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/Digest;Ljava/security/SecureRandom;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    iput-object p2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->b:Ljava/math/BigInteger;

    iput-object p3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->i:Lorg/bouncycastle/crypto/Digest;

    iput-object p4, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->j:Ljava/security/SecureRandom;

    return-void
.end method

.method protected selectPrivateValue()Ljava/math/BigInteger;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->i:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->b:Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->j:Ljava/security/SecureRandom;

    invoke-static {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->generatePrivateValue(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
