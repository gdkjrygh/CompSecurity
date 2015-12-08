.class public Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;
.super Ljava/lang/Object;


# instance fields
.field protected a:Ljava/math/BigInteger;

.field protected b:Ljava/math/BigInteger;

.field protected c:Ljava/math/BigInteger;

.field protected d:Ljava/security/SecureRandom;

.field protected e:Lorg/bouncycastle/crypto/Digest;

.field protected f:Ljava/math/BigInteger;

.field protected g:Ljava/math/BigInteger;

.field protected h:Ljava/math/BigInteger;

.field protected i:Ljava/math/BigInteger;

.field protected j:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private calculateS()Ljava/math/BigInteger;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->c:Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->i:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->f:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->g:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public calculateSecret(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->validatePublicValue(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->f:Ljava/math/BigInteger;

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->e:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->f:Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->h:Ljava/math/BigInteger;

    invoke-static {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->calculateU(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->i:Ljava/math/BigInteger;

    invoke-direct {p0}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->calculateS()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->j:Ljava/math/BigInteger;

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->j:Ljava/math/BigInteger;

    return-object v0
.end method

.method public generateServerCredentials()Ljava/math/BigInteger;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->e:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->b:Ljava/math/BigInteger;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->calculateK(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->selectPrivateValue()Ljava/math/BigInteger;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->g:Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->c:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->b:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->g:Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v2, v3}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->h:Ljava/math/BigInteger;

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->h:Ljava/math/BigInteger;

    return-object v0
.end method

.method public init(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/Digest;Ljava/security/SecureRandom;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    iput-object p2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->b:Ljava/math/BigInteger;

    iput-object p3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->c:Ljava/math/BigInteger;

    iput-object p5, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->d:Ljava/security/SecureRandom;

    iput-object p4, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->e:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method

.method protected selectPrivateValue()Ljava/math/BigInteger;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->e:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->b:Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Server;->d:Ljava/security/SecureRandom;

    invoke-static {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->generatePrivateValue(Lorg/bouncycastle/crypto/Digest;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
