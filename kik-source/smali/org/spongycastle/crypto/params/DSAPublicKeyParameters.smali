.class public Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;
.super Lorg/spongycastle/crypto/params/DSAKeyParameters;
.source "SourceFile"


# instance fields
.field private b:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DSAParameters;)V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lorg/spongycastle/crypto/params/DSAKeyParameters;-><init>(ZLorg/spongycastle/crypto/params/DSAParameters;)V

    .line 16
    iput-object p1, p0, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;->b:Ljava/math/BigInteger;

    .line 17
    return-void
.end method


# virtual methods
.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;->b:Ljava/math/BigInteger;

    return-object v0
.end method
