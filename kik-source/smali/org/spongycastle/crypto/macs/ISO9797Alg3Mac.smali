.class public Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Mac;


# instance fields
.field private a:[B

.field private b:[B

.field private c:I

.field private d:Lorg/spongycastle/crypto/BlockCipher;

.field private e:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

.field private f:I

.field private g:Lorg/spongycastle/crypto/params/KeyParameter;

.field private h:Lorg/spongycastle/crypto/params/KeyParameter;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 2

    .prologue
    .line 43
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;-><init>(Lorg/spongycastle/crypto/BlockCipher;ILorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    .line 44
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/crypto/BlockCipher;ILorg/spongycastle/crypto/paddings/BlockCipherPadding;)V
    .locals 2

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    rem-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_0

    .line 102
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MAC size must be multiple of 8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 105
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/crypto/engines/DESEngine;

    if-nez v0, :cond_1

    .line 107
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cipher must be instance of DESEngine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_1
    new-instance v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    .line 111
    iput-object p3, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->e:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    .line 112
    div-int/lit8 v0, p2, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->f:I

    .line 114
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    .line 116
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    .line 118
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V
    .locals 1

    .prologue
    .line 57
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    invoke-direct {p0, p1, v0, p2}, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;-><init>(Lorg/spongycastle/crypto/BlockCipher;ILorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    .line 58
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 183
    iget v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->f:I

    return v0
.end method

.method public final a([BI)I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 241
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    .line 243
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->e:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    if-nez v1, :cond_0

    .line 248
    :goto_0
    iget v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    if-ge v1, v0, :cond_2

    .line 250
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    aput-byte v3, v1, v2

    .line 251
    iget v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    goto :goto_0

    .line 256
    :cond_0
    iget v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    if-ne v1, v0, :cond_1

    .line 258
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 259
    iput v3, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    .line 262
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->e:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    invoke-interface {v0, v1, v2}, Lorg/spongycastle/crypto/paddings/BlockCipherPadding;->a([BI)I

    .line 265
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 268
    new-instance v0, Lorg/spongycastle/crypto/engines/DESEngine;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/DESEngine;-><init>()V

    .line 270
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->g:Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {v0, v3, v1}, Lorg/spongycastle/crypto/engines/DESEngine;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 271
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    invoke-virtual {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/engines/DESEngine;->a([BI[BI)I

    .line 273
    const/4 v1, 0x1

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->h:Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {v0, v1, v2}, Lorg/spongycastle/crypto/engines/DESEngine;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 274
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    invoke-virtual {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/engines/DESEngine;->a([BI[BI)I

    .line 277
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->f:I

    invoke-static {v0, v3, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 279
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b()V

    .line 281
    iget v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->f:I

    return v0
.end method

.method public final a(B)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 189
    iget v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 191
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 192
    iput v3, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    .line 195
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    aput-byte p1, v0, v1

    .line 196
    return-void
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 7

    .prologue
    const/16 v6, 0x10

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/16 v3, 0x8

    .line 127
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b()V

    .line 129
    instance-of v0, p1, Lorg/spongycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-nez v0, :cond_0

    .line 131
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "params must be an instance of KeyParameter or ParametersWithIV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 141
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/crypto/params/KeyParameter;

    if-eqz v0, :cond_1

    move-object v0, p1

    .line 143
    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 151
    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v1

    .line 153
    array-length v0, v1

    if-ne v0, v6, :cond_2

    .line 155
    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-direct {v0, v1, v4, v3}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    .line 156
    new-instance v2, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-direct {v2, v1, v3, v3}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    iput-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->g:Lorg/spongycastle/crypto/params/KeyParameter;

    .line 157
    iput-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->h:Lorg/spongycastle/crypto/params/KeyParameter;

    .line 171
    :goto_1
    instance-of v1, p1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v1, :cond_4

    .line 173
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    new-instance v2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    check-cast p1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    invoke-interface {v1, v5, v2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 179
    :goto_2
    return-void

    :cond_1
    move-object v0, p1

    .line 147
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    goto :goto_0

    .line 159
    :cond_2
    array-length v0, v1

    const/16 v2, 0x18

    if-ne v0, v2, :cond_3

    .line 161
    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-direct {v0, v1, v4, v3}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    .line 162
    new-instance v2, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-direct {v2, v1, v3, v3}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    iput-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->g:Lorg/spongycastle/crypto/params/KeyParameter;

    .line 163
    new-instance v2, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-direct {v2, v1, v6, v3}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    iput-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->h:Lorg/spongycastle/crypto/params/KeyParameter;

    goto :goto_1

    .line 167
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Key must be either 112 or 168 bit long"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 177
    :cond_4
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1, v5, v0}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_2
.end method

.method public final a([BII)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 204
    if-gez p3, :cond_0

    .line 206
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 209
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    .line 210
    iget v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    sub-int v1, v0, v1

    .line 213
    if-le p3, v1, :cond_1

    .line 215
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget v3, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    invoke-static {p1, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 217
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    invoke-interface {v2, v3, v5, v4, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 219
    iput v5, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    .line 220
    sub-int/2addr p3, v1

    .line 221
    add-int/2addr p2, v1

    .line 223
    :goto_0
    if-le p3, v0, :cond_1

    .line 225
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->a:[B

    invoke-interface {v1, p1, p2, v2, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 227
    sub-int/2addr p3, v0

    .line 228
    add-int/2addr p2, v0

    goto :goto_0

    .line 232
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 234
    iget v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    add-int/2addr v0, p3

    iput v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    .line 235
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 293
    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 295
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->b:[B

    aput-byte v1, v2, v0

    .line 293
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 298
    :cond_0
    iput v1, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->c:I

    .line 303
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/ISO9797Alg3Mac;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 304
    return-void
.end method
