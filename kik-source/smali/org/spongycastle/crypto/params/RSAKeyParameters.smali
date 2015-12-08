.class public Lorg/spongycastle/crypto/params/RSAKeyParameters;
.super Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
.source "SourceFile"


# instance fields
.field private b:Ljava/math/BigInteger;

.field private c:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;-><init>(Z)V

    .line 18
    iput-object p2, p0, Lorg/spongycastle/crypto/params/RSAKeyParameters;->b:Ljava/math/BigInteger;

    .line 19
    iput-object p3, p0, Lorg/spongycastle/crypto/params/RSAKeyParameters;->c:Ljava/math/BigInteger;

    .line 20
    return-void
.end method


# virtual methods
.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lorg/spongycastle/crypto/params/RSAKeyParameters;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lorg/spongycastle/crypto/params/RSAKeyParameters;->c:Ljava/math/BigInteger;

    return-object v0
.end method
