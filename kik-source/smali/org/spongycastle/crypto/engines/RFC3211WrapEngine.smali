.class public Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Wrapper;


# instance fields
.field private a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

.field private b:Lorg/spongycastle/crypto/params/ParametersWithIV;

.field private c:Z

.field private d:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    .line 28
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/RFC3211Wrap"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 34
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->c:Z

    .line 36
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 38
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 40
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->d:Ljava/security/SecureRandom;

    .line 41
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->b:Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 52
    :goto_0
    return-void

    .line 45
    :cond_0
    if-eqz p1, :cond_1

    .line 47
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->d:Ljava/security/SecureRandom;

    .line 50
    :cond_1
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object p2, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->b:Lorg/spongycastle/crypto/params/ParametersWithIV;

    goto :goto_0
.end method

.method public final a([BI)[B
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 64
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->c:Z

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not set for wrapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->b:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0, v4, v2}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 71
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v2

    .line 74
    add-int/lit8 v0, p2, 0x4

    mul-int/lit8 v3, v2, 0x2

    if-ge v0, v3, :cond_1

    .line 76
    mul-int/lit8 v0, v2, 0x2

    .line 80
    :goto_0
    new-array v3, v0, [B

    .line 83
    int-to-byte v0, p2

    aput-byte v0, v3, v1

    .line 84
    aget-byte v0, p1, v1

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    .line 85
    aget-byte v0, p1, v4

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v0, v0

    aput-byte v0, v3, v5

    .line 86
    const/4 v0, 0x3

    aget-byte v4, p1, v5

    xor-int/lit8 v4, v4, -0x1

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    .line 88
    const/4 v0, 0x4

    invoke-static {p1, v1, v3, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    add-int/lit8 v0, p2, 0x4

    :goto_1
    array-length v4, v3

    if-ge v0, v4, :cond_3

    .line 92
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->d:Ljava/security/SecureRandom;

    invoke-virtual {v4}, Ljava/security/SecureRandom;->nextInt()I

    move-result v4

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    .line 90
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 80
    :cond_1
    add-int/lit8 v0, p2, 0x4

    rem-int/2addr v0, v2

    if-nez v0, :cond_2

    add-int/lit8 v0, p2, 0x4

    goto :goto_0

    :cond_2
    add-int/lit8 v0, p2, 0x4

    div-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x1

    mul-int/2addr v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    .line 95
    :goto_2
    array-length v4, v3

    if-ge v0, v4, :cond_4

    .line 97
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v4, v3, v0, v3, v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 95
    add-int/2addr v0, v2

    goto :goto_2

    .line 100
    :cond_4
    :goto_3
    array-length v0, v3

    if-ge v1, v0, :cond_5

    .line 102
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0, v3, v1, v3, v1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 100
    add-int/2addr v1, v2

    goto :goto_3

    .line 105
    :cond_5
    return-object v3
.end method

.method public final b([BI)[B
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 114
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->c:Z

    if-eqz v0, :cond_0

    .line 116
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not set for unwrapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v1

    .line 121
    mul-int/lit8 v0, v1, 0x2

    if-ge p2, v0, :cond_1

    .line 123
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "input too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_1
    new-array v3, p2, [B

    .line 127
    new-array v4, v1, [B

    .line 129
    invoke-static {p1, v2, v3, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 130
    array-length v0, v4

    invoke-static {p1, v2, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    new-instance v5, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->b:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v6}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    invoke-virtual {v0, v2, v5}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    move v0, v1

    .line 134
    :goto_0
    array-length v5, v3

    if-ge v0, v5, :cond_2

    .line 136
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v5, v3, v0, v3, v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 134
    add-int/2addr v0, v1

    goto :goto_0

    .line 139
    :cond_2
    array-length v0, v3

    array-length v5, v4

    sub-int/2addr v0, v5

    array-length v5, v4

    invoke-static {v3, v0, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    new-instance v5, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->b:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v6}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    invoke-virtual {v0, v2, v5}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 143
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0, v3, v2, v3, v2}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 145
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->b:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0, v2, v4}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    move v0, v2

    .line 147
    :goto_1
    array-length v4, v3

    if-ge v0, v4, :cond_3

    .line 149
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RFC3211WrapEngine;->a:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v4, v3, v0, v3, v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 147
    add-int/2addr v0, v1

    goto :goto_1

    .line 152
    :cond_3
    aget-byte v0, v3, v2

    and-int/lit16 v0, v0, 0xff

    array-length v1, v3

    add-int/lit8 v1, v1, -0x4

    if-le v0, v1, :cond_4

    .line 154
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "wrapped key corrupted"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 157
    :cond_4
    aget-byte v0, v3, v2

    and-int/lit16 v0, v0, 0xff

    new-array v1, v0, [B

    .line 159
    const/4 v0, 0x4

    aget-byte v4, v3, v2

    invoke-static {v3, v0, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v2

    .line 163
    :goto_2
    const/4 v4, 0x3

    if-eq v0, v4, :cond_5

    .line 165
    add-int/lit8 v4, v0, 0x1

    aget-byte v4, v3, v4

    xor-int/lit8 v4, v4, -0x1

    int-to-byte v4, v4

    .line 166
    aget-byte v5, v1, v0

    xor-int/2addr v4, v5

    or-int/2addr v2, v4

    .line 163
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 168
    :cond_5
    if-eqz v2, :cond_6

    .line 170
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "wrapped key fails checksum"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 173
    :cond_6
    return-object v1
.end method
