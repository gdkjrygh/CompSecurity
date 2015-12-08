.class public Lorg/spongycastle/crypto/agreement/ECMQVBasicAgreement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BasicAgreement;


# instance fields
.field a:Lorg/spongycastle/crypto/params/MQVPrivateParameters;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 0

    .prologue
    .line 24
    check-cast p1, Lorg/spongycastle/crypto/params/MQVPrivateParameters;

    iput-object p1, p0, Lorg/spongycastle/crypto/agreement/ECMQVBasicAgreement;->a:Lorg/spongycastle/crypto/params/MQVPrivateParameters;

    .line 25
    return-void
.end method

.method public final b(Lorg/spongycastle/crypto/CipherParameters;)Ljava/math/BigInteger;
    .locals 10

    .prologue
    .line 29
    check-cast p1, Lorg/spongycastle/crypto/params/MQVPublicParameters;

    .line 31
    iget-object v0, p0, Lorg/spongycastle/crypto/agreement/ECMQVBasicAgreement;->a:Lorg/spongycastle/crypto/params/MQVPrivateParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/MQVPrivateParameters;->a()Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->b()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v2

    iget-object v0, p0, Lorg/spongycastle/crypto/agreement/ECMQVBasicAgreement;->a:Lorg/spongycastle/crypto/params/MQVPrivateParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/MQVPrivateParameters;->b()Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    move-result-object v3

    iget-object v0, p0, Lorg/spongycastle/crypto/agreement/ECMQVBasicAgreement;->a:Lorg/spongycastle/crypto/params/MQVPrivateParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/MQVPrivateParameters;->c()Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    move-result-object v0

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/MQVPublicParameters;->a()Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    move-result-object v4

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/MQVPublicParameters;->b()Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    move-result-object v5

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/ECDomainParameters;->c()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    div-int/lit8 v7, v7, 0x2

    sget-object v8, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-virtual {v8, v7}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v8

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/ECDomainParameters;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {v3}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v0, v9}, Lorg/spongycastle/math/ec/ECPoint;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v5}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/ECDomainParameters;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v4}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v5}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v3

    invoke-static {v2, v1, v3, v0}, Lorg/spongycastle/math/ec/ECAlgorithms;->a(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Infinity is not a valid agreement value for MQV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
