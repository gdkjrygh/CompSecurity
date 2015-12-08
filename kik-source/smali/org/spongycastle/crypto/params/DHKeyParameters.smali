.class public Lorg/spongycastle/crypto/params/DHKeyParameters;
.super Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
.source "SourceFile"


# instance fields
.field private b:Lorg/spongycastle/crypto/params/DHParameters;


# direct methods
.method protected constructor <init>(ZLorg/spongycastle/crypto/params/DHParameters;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;-><init>(Z)V

    .line 15
    iput-object p2, p0, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    .line 16
    return-void
.end method


# virtual methods
.method public final b()Lorg/spongycastle/crypto/params/DHParameters;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 26
    instance-of v1, p1, Lorg/spongycastle/crypto/params/DHKeyParameters;

    if-nez v1, :cond_1

    .line 39
    :cond_0
    :goto_0
    return v0

    .line 31
    :cond_1
    check-cast p1, Lorg/spongycastle/crypto/params/DHKeyParameters;

    .line 33
    iget-object v1, p0, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    if-nez v1, :cond_2

    .line 35
    iget-object v1, p1, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 39
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    iget-object v1, p1, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/params/DHParameters;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 45
    iget-boolean v0, p0, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 47
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    if-eqz v1, :cond_0

    .line 49
    iget-object v1, p0, Lorg/spongycastle/crypto/params/DHKeyParameters;->b:Lorg/spongycastle/crypto/params/DHParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DHParameters;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 52
    :cond_0
    return v0

    .line 45
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method
