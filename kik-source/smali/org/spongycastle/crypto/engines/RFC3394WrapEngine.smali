.class public Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Wrapper;


# instance fields
.field private a:Lorg/spongycastle/crypto/BlockCipher;

.field private b:Lorg/spongycastle/crypto/params/KeyParameter;

.field private c:Z

.field private d:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    .line 33
    iput-object p1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->a:Lorg/spongycastle/crypto/BlockCipher;

    .line 34
    return-void

    .line 27
    nop

    :array_0
    .array-data 1
        -0x5at
        -0x5at
        -0x5at
        -0x5at
        -0x5at
        -0x5at
        -0x5at
        -0x5at
    .end array-data
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 2

    .prologue
    .line 40
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->c:Z

    .line 42
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_2

    .line 44
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    .line 47
    :goto_0
    instance-of v1, v0, Lorg/spongycastle/crypto/params/KeyParameter;

    if-eqz v1, :cond_1

    .line 49
    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->b:Lorg/spongycastle/crypto/params/KeyParameter;

    .line 60
    :cond_0
    return-void

    .line 51
    :cond_1
    instance-of v1, v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v1, :cond_0

    move-object v1, v0

    .line 53
    check-cast v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    .line 54
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->b:Lorg/spongycastle/crypto/params/KeyParameter;

    .line 55
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v0, v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 57
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "IV not equal to 8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object v0, p2

    goto :goto_0
.end method

.method public final a([BI)[B
    .locals 13

    .prologue
    const/4 v1, 0x1

    const/16 v12, 0x8

    const/4 v5, 0x0

    .line 72
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->c:Z

    if-nez v0, :cond_0

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not set for wrapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_0
    div-int/lit8 v6, p2, 0x8

    .line 79
    mul-int/lit8 v0, v6, 0x8

    if-eq v0, p2, :cond_1

    .line 81
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "wrap data must be a multiple of 8 bytes"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v0, v0

    add-int/2addr v0, p2

    new-array v7, v0, [B

    .line 85
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x8

    new-array v8, v0, [B

    .line 87
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v2, v2

    invoke-static {v0, v5, v7, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v0, v0

    invoke-static {p1, v5, v7, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->a:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->b:Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {v0, v1, v2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    move v4, v5

    .line 92
    :goto_0
    const/4 v0, 0x6

    if-eq v4, v0, :cond_4

    move v3, v1

    .line 94
    :goto_1
    if-gt v3, v6, :cond_3

    .line 96
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v0, v0

    invoke-static {v7, v5, v8, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    mul-int/lit8 v0, v3, 0x8

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v2, v2

    invoke-static {v7, v0, v8, v2, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v8, v5, v8, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 100
    mul-int v0, v6, v4

    add-int/2addr v0, v3

    move v2, v0

    move v0, v1

    .line 101
    :goto_2
    if-eqz v2, :cond_2

    .line 103
    int-to-byte v9, v2

    .line 105
    iget-object v10, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v10, v10

    sub-int/2addr v10, v0

    aget-byte v11, v8, v10

    xor-int/2addr v9, v11

    int-to-byte v9, v9

    aput-byte v9, v8, v10

    .line 107
    ushr-int/lit8 v2, v2, 0x8

    .line 101
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 110
    :cond_2
    invoke-static {v8, v5, v7, v5, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    mul-int/lit8 v0, v3, 0x8

    invoke-static {v8, v12, v7, v0, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 92
    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    .line 115
    :cond_4
    return-object v7
.end method

.method public final b([BI)[B
    .locals 13

    .prologue
    const/16 v12, 0x8

    const/4 v11, 0x0

    .line 124
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->c:Z

    if-eqz v0, :cond_0

    .line 126
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not set for unwrapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_0
    div-int/lit8 v0, p2, 0x8

    .line 131
    mul-int/lit8 v1, v0, 0x8

    if-eq v1, p2, :cond_1

    .line 133
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "unwrap data must be a multiple of 8 bytes"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 136
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v1, v1

    sub-int v1, p2, v1

    new-array v5, v1, [B

    .line 137
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v1, v1

    new-array v6, v1, [B

    .line 138
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v1, v1

    add-int/lit8 v1, v1, 0x8

    new-array v7, v1, [B

    .line 140
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v1, v1

    invoke-static {p1, v11, v6, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v1, v1

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v2, v2

    sub-int v2, p2, v2

    invoke-static {p1, v1, v5, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 143
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->a:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->b:Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {v1, v11, v2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 145
    add-int/lit8 v3, v0, -0x1

    .line 147
    const/4 v0, 0x5

    move v4, v0

    :goto_0
    if-ltz v4, :cond_4

    move v2, v3

    .line 149
    :goto_1
    if-lez v2, :cond_3

    .line 151
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v0, v0

    invoke-static {v6, v11, v7, v11, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    add-int/lit8 v0, v2, -0x1

    mul-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v1, v1

    invoke-static {v5, v0, v7, v1, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 154
    mul-int v0, v3, v4

    add-int v1, v0, v2

    .line 155
    const/4 v0, 0x1

    :goto_2
    if-eqz v1, :cond_2

    .line 157
    int-to-byte v8, v1

    .line 159
    iget-object v9, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    array-length v9, v9

    sub-int/2addr v9, v0

    aget-byte v10, v7, v9

    xor-int/2addr v8, v10

    int-to-byte v8, v8

    aput-byte v8, v7, v9

    .line 161
    ushr-int/lit8 v1, v1, 0x8

    .line 155
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 164
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v7, v11, v7, v11}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 165
    invoke-static {v7, v11, v6, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 166
    add-int/lit8 v0, v2, -0x1

    mul-int/lit8 v0, v0, 0x8

    invoke-static {v7, v12, v5, v0, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 149
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    .line 147
    :cond_3
    add-int/lit8 v0, v4, -0x1

    move v4, v0

    goto :goto_0

    .line 170
    :cond_4
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3394WrapEngine;->d:[B

    invoke-static {v6, v0}, Lorg/spongycastle/util/Arrays;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_5

    .line 172
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "checksum failed"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 175
    :cond_5
    return-object v5
.end method
