.class public Lorg/spongycastle/crypto/params/DSAParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/CipherParameters;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Ljava/math/BigInteger;

.field private c:Ljava/math/BigInteger;

.field private d:Lorg/spongycastle/crypto/params/DSAValidationParameters;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p3, p0, Lorg/spongycastle/crypto/params/DSAParameters;->a:Ljava/math/BigInteger;

    .line 21
    iput-object p1, p0, Lorg/spongycastle/crypto/params/DSAParameters;->c:Ljava/math/BigInteger;

    .line 22
    iput-object p2, p0, Lorg/spongycastle/crypto/params/DSAParameters;->b:Ljava/math/BigInteger;

    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DSAValidationParameters;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p3, p0, Lorg/spongycastle/crypto/params/DSAParameters;->a:Ljava/math/BigInteger;

    .line 32
    iput-object p1, p0, Lorg/spongycastle/crypto/params/DSAParameters;->c:Ljava/math/BigInteger;

    .line 33
    iput-object p2, p0, Lorg/spongycastle/crypto/params/DSAParameters;->b:Ljava/math/BigInteger;

    .line 34
    iput-object p4, p0, Lorg/spongycastle/crypto/params/DSAParameters;->d:Lorg/spongycastle/crypto/params/DSAValidationParameters;

    .line 35
    return-void
.end method


# virtual methods
.method public final a()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DSAParameters;->c:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DSAParameters;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DSAParameters;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 60
    instance-of v1, p1, Lorg/spongycastle/crypto/params/DSAParameters;

    if-nez v1, :cond_1

    .line 67
    :cond_0
    :goto_0
    return v0

    .line 65
    :cond_1
    check-cast p1, Lorg/spongycastle/crypto/params/DSAParameters;

    .line 67
    iget-object v1, p1, Lorg/spongycastle/crypto/params/DSAParameters;->c:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/spongycastle/crypto/params/DSAParameters;->c:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/crypto/params/DSAParameters;->b:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/spongycastle/crypto/params/DSAParameters;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/crypto/params/DSAParameters;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/spongycastle/crypto/params/DSAParameters;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DSAParameters;->c:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/crypto/params/DSAParameters;->b:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/crypto/params/DSAParameters;->a:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
