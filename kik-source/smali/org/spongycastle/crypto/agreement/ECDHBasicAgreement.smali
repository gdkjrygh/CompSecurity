.class public Lorg/spongycastle/crypto/agreement/ECDHBasicAgreement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BasicAgreement;


# instance fields
.field private a:Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 0

    .prologue
    .line 34
    check-cast p1, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    iput-object p1, p0, Lorg/spongycastle/crypto/agreement/ECDHBasicAgreement;->a:Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    .line 35
    return-void
.end method

.method public final b(Lorg/spongycastle/crypto/CipherParameters;)Ljava/math/BigInteger;
    .locals 2

    .prologue
    .line 40
    check-cast p1, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    .line 41
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/crypto/agreement/ECDHBasicAgreement;->a:Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECPoint;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
