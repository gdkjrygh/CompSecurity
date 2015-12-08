.class final Lorg/spongycastle/crypto/engines/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

.field private b:Z


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 54
    iget-boolean v1, p0, Lorg/spongycastle/crypto/engines/a;->b:Z

    if-eqz v1, :cond_0

    .line 56
    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x1

    .line 60
    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    goto :goto_0
.end method

.method public final a([BII)Ljava/math/BigInteger;
    .locals 2

    .prologue
    .line 90
    invoke-virtual {p0}, Lorg/spongycastle/crypto/engines/a;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-le p3, v0, :cond_0

    .line 92
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input too large for RSA cipher."

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/engines/a;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-ne p3, v0, :cond_1

    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/a;->b:Z

    if-nez v0, :cond_1

    .line 96
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input too large for RSA cipher."

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_1
    if-nez p2, :cond_2

    array-length v0, p1

    if-eq p3, v0, :cond_3

    .line 103
    :cond_2
    new-array v0, p3, [B

    .line 105
    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v0

    .line 112
    :cond_3
    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 113
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/RSAKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-ltz v1, :cond_4

    .line 115
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input too large for RSA cipher."

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_4
    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 29
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 31
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 33
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/RSAKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    .line 40
    :goto_0
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/a;->b:Z

    .line 41
    return-void

    .line 37
    :cond_0
    check-cast p2, Lorg/spongycastle/crypto/params/RSAKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    goto :goto_0
.end method

.method public final a(Ljava/math/BigInteger;)[B
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 124
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    .line 126
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/a;->b:Z

    if-eqz v0, :cond_1

    .line 128
    aget-byte v0, v1, v4

    if-nez v0, :cond_0

    array-length v0, v1

    invoke-virtual {p0}, Lorg/spongycastle/crypto/engines/a;->b()I

    move-result v2

    if-le v0, v2, :cond_0

    .line 130
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    .line 132
    array-length v2, v0

    invoke-static {v1, v3, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    :goto_0
    return-object v0

    .line 137
    :cond_0
    array-length v0, v1

    invoke-virtual {p0}, Lorg/spongycastle/crypto/engines/a;->b()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 139
    invoke-virtual {p0}, Lorg/spongycastle/crypto/engines/a;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 141
    array-length v2, v0

    array-length v3, v1

    sub-int/2addr v2, v3

    array-length v3, v1

    invoke-static {v1, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 148
    :cond_1
    aget-byte v0, v1, v4

    if-nez v0, :cond_2

    .line 150
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    .line 152
    array-length v2, v0

    invoke-static {v1, v3, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 158
    goto :goto_0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 75
    iget-boolean v1, p0, Lorg/spongycastle/crypto/engines/a;->b:Z

    if-eqz v1, :cond_0

    .line 77
    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    .line 81
    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public final b(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 6

    .prologue
    .line 163
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    instance-of v0, v0, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;

    .line 172
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;->e()Ljava/math/BigInteger;

    move-result-object v1

    .line 173
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;->f()Ljava/math/BigInteger;

    move-result-object v2

    .line 174
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;->g()Ljava/math/BigInteger;

    move-result-object v3

    .line 175
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;->h()Ljava/math/BigInteger;

    move-result-object v4

    .line 176
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;->i()Ljava/math/BigInteger;

    move-result-object v0

    .line 181
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->remainder(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v3, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 184
    invoke-virtual {p1, v2}, Ljava/math/BigInteger;->remainder(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v4, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 187
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 188
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 189
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 192
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 193
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 199
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/RSAKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/a;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/RSAKeyParameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method
