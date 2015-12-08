.class public Lorg/spongycastle/crypto/engines/RC2WrapEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Wrapper;


# static fields
.field private static final i:[B


# instance fields
.field a:Lorg/spongycastle/crypto/Digest;

.field b:[B

.field private c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

.field private d:Lorg/spongycastle/crypto/CipherParameters;

.field private e:Lorg/spongycastle/crypto/params/ParametersWithIV;

.field private f:[B

.field private g:Z

.field private h:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->i:[B

    return-void

    :array_0
    .array-data 1
        0x4at
        -0x23t
        -0x5et
        0x2ct
        0x79t
        -0x18t
        0x21t
        0x5t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v0}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->a:Lorg/spongycastle/crypto/Digest;

    .line 47
    const/16 v0, 0x14

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->b:[B

    return-void
.end method

.method private a([B)[B
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 361
    new-array v0, v4, [B

    .line 363
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->a:Lorg/spongycastle/crypto/Digest;

    array-length v2, p1

    invoke-interface {v1, p1, v3, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 364
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->b:[B

    invoke-interface {v1, v2, v3}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 366
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->b:[B

    invoke-static {v1, v3, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 368
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    const-string v0, "RC2"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 57
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->g:Z

    .line 58
    new-instance v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    new-instance v1, Lorg/spongycastle/crypto/engines/RC2Engine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/RC2Engine;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    .line 60
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_1

    .line 62
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 63
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->h:Ljava/security/SecureRandom;

    .line 64
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    .line 71
    :goto_0
    instance-of v1, v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v1, :cond_3

    .line 73
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->e:Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 74
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->e:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    .line 75
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->e:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->d:Lorg/spongycastle/crypto/CipherParameters;

    .line 77
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->g:Z

    if-eqz v0, :cond_2

    .line 79
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    array-length v0, v0

    if-eq v0, v2, :cond_4

    .line 81
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "IV is not 8 octets"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_1
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->h:Ljava/security/SecureRandom;

    move-object v0, p2

    goto :goto_0

    .line 86
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You should not supply an IV for unwrapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_3
    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->d:Lorg/spongycastle/crypto/CipherParameters;

    .line 94
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->g:Z

    if-eqz v0, :cond_4

    .line 99
    new-array v0, v2, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    .line 101
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->h:Ljava/security/SecureRandom;

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 103
    new-instance v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->d:Lorg/spongycastle/crypto/CipherParameters;

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->e:Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 107
    :cond_4
    return-void
.end method

.method public final a([BI)[B
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 130
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->g:Z

    if-nez v0, :cond_0

    .line 132
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized for wrapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_0
    add-int/lit8 v0, p2, 0x1

    .line 136
    rem-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_1

    .line 138
    rem-int/lit8 v2, v0, 0x8

    rsub-int/lit8 v2, v2, 0x8

    add-int/2addr v0, v2

    .line 141
    :cond_1
    new-array v0, v0, [B

    .line 143
    int-to-byte v2, p2

    aput-byte v2, v0, v1

    .line 144
    invoke-static {p1, v1, v0, v7, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 146
    array-length v2, v0

    sub-int/2addr v2, p2

    add-int/lit8 v2, v2, -0x1

    new-array v2, v2, [B

    .line 148
    array-length v3, v2

    if-lez v3, :cond_2

    .line 150
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->h:Ljava/security/SecureRandom;

    invoke-virtual {v3, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 151
    add-int/lit8 v3, p2, 0x1

    array-length v4, v2

    invoke-static {v2, v1, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 155
    :cond_2
    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->a([B)[B

    move-result-object v2

    .line 158
    array-length v3, v0

    add-int/lit8 v3, v3, 0x8

    new-array v3, v3, [B

    .line 160
    array-length v4, v0

    invoke-static {v0, v1, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 161
    array-length v0, v0

    const/16 v4, 0x8

    invoke-static {v2, v1, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 165
    array-length v0, v3

    new-array v2, v0, [B

    .line 167
    array-length v0, v3

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 169
    array-length v0, v3

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v4}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v4

    div-int v4, v0, v4

    .line 170
    array-length v0, v3

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v3

    rem-int/2addr v0, v3

    .line 172
    if-eqz v0, :cond_3

    .line 174
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not multiple of block length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 177
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->e:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0, v7, v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    move v0, v1

    .line 179
    :goto_0
    if-ge v0, v4, :cond_4

    .line 181
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v3

    mul-int/2addr v3, v0

    .line 183
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v5, v2, v3, v2, v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 179
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 187
    :cond_4
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    array-length v0, v0

    array-length v3, v2

    add-int/2addr v0, v3

    new-array v3, v0, [B

    .line 189
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    array-length v5, v5

    invoke-static {v0, v1, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    array-length v0, v0

    array-length v5, v2

    invoke-static {v2, v1, v3, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 193
    array-length v0, v3

    new-array v2, v0, [B

    move v0, v1

    .line 195
    :goto_1
    array-length v5, v3

    if-ge v0, v5, :cond_5

    .line 197
    array-length v5, v3

    add-int/lit8 v6, v0, 0x1

    sub-int/2addr v5, v6

    aget-byte v5, v3, v5

    aput-byte v5, v2, v0

    .line 195
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 204
    :cond_5
    new-instance v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->d:Lorg/spongycastle/crypto/CipherParameters;

    sget-object v5, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->i:[B

    invoke-direct {v0, v3, v5}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    .line 206
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v3, v7, v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 208
    :goto_2
    add-int/lit8 v0, v4, 0x1

    if-ge v1, v0, :cond_6

    .line 210
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v0

    mul-int/2addr v0, v1

    .line 212
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v3, v2, v0, v2, v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 208
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 215
    :cond_6
    return-object v2
.end method

.method public final b([BI)[B
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v1, 0x0

    .line 231
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->g:Z

    if-eqz v0, :cond_0

    .line 233
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not set for unwrapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 236
    :cond_0
    if-nez p1, :cond_1

    .line 238
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "Null pointer as ciphertext"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v0

    rem-int v0, p2, v0

    if-eqz v0, :cond_2

    .line 243
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ciphertext not multiple of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v2}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_2
    new-instance v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->d:Lorg/spongycastle/crypto/CipherParameters;

    sget-object v3, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->i:[B

    invoke-direct {v0, v2, v3}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    .line 265
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v2, v1, v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 267
    new-array v2, p2, [B

    .line 269
    invoke-static {p1, v1, v2, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 271
    :goto_0
    array-length v3, v2

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v4}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v4

    div-int/2addr v3, v4

    if-ge v0, v3, :cond_3

    .line 273
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v3

    mul-int/2addr v3, v0

    .line 275
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v4, v2, v3, v2, v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 271
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 279
    :cond_3
    array-length v0, v2

    new-array v3, v0, [B

    move v0, v1

    .line 281
    :goto_1
    array-length v4, v2

    if-ge v0, v4, :cond_4

    .line 283
    array-length v4, v2

    add-int/lit8 v5, v0, 0x1

    sub-int/2addr v4, v5

    aget-byte v4, v2, v4

    aput-byte v4, v3, v0

    .line 281
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 288
    :cond_4
    new-array v0, v6, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    .line 290
    array-length v0, v3

    add-int/lit8 v0, v0, -0x8

    new-array v0, v0, [B

    .line 292
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    invoke-static {v3, v1, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 293
    array-length v2, v3

    add-int/lit8 v2, v2, -0x8

    invoke-static {v3, v6, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 297
    new-instance v2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->d:Lorg/spongycastle/crypto/CipherParameters;

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->f:[B

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    iput-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->e:Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 299
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->e:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v2, v1, v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 301
    array-length v2, v0

    new-array v2, v2, [B

    .line 303
    array-length v3, v0

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 305
    :goto_2
    array-length v3, v2

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v4}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v4

    div-int/2addr v3, v4

    if-ge v0, v3, :cond_5

    .line 307
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->b()I

    move-result v3

    mul-int/2addr v3, v0

    .line 309
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->c:Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v4, v2, v3, v2, v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->a([BI[BI)I

    .line 305
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 316
    :cond_5
    array-length v0, v2

    add-int/lit8 v0, v0, -0x8

    new-array v0, v0, [B

    .line 317
    new-array v3, v6, [B

    .line 319
    array-length v4, v2

    add-int/lit8 v4, v4, -0x8

    invoke-static {v2, v1, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 320
    array-length v4, v2

    add-int/lit8 v4, v4, -0x8

    invoke-static {v2, v4, v3, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 327
    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/engines/RC2WrapEngine;->a([B)[B

    move-result-object v2

    invoke-static {v2, v3}, Lorg/spongycastle/util/Arrays;->b([B[B)Z

    move-result v2

    if-nez v2, :cond_6

    .line 329
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "Checksum inside ciphertext is corrupted"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_6
    array-length v2, v0

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v3, v3, 0x1

    sub-int/2addr v2, v3

    const/4 v3, 0x7

    if-le v2, v3, :cond_7

    .line 335
    new-instance v2, Lorg/spongycastle/crypto/InvalidCipherTextException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "too many pad bytes ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v4, v0

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v0, v0, 0x1

    sub-int v0, v4, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 340
    :cond_7
    aget-byte v2, v0, v1

    new-array v2, v2, [B

    .line 341
    const/4 v3, 0x1

    array-length v4, v2

    invoke-static {v0, v3, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 342
    return-object v2
.end method
