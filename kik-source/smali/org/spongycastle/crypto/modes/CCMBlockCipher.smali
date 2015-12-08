.class public Lorg/spongycastle/crypto/modes/CCMBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/modes/AEADBlockCipher;


# instance fields
.field private a:Lorg/spongycastle/crypto/BlockCipher;

.field private b:I

.field private c:Z

.field private d:[B

.field private e:[B

.field private f:I

.field private g:Lorg/spongycastle/crypto/CipherParameters;

.field private h:[B

.field private i:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 2

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->i:Ljava/io/ByteArrayOutputStream;

    .line 41
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    .line 42
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    .line 43
    iget v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    .line 45
    iget v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    .line 47
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cipher required with a block size of 16."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_0
    return-void
.end method

.method private a([BI[B)I
    .locals 8

    .prologue
    const/16 v7, 0x10

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 257
    new-instance v3, Lorg/spongycastle/crypto/macs/CBCBlockCipherMac;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    iget v4, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    mul-int/lit8 v4, v4, 0x8

    invoke-direct {v3, v2, v4}, Lorg/spongycastle/crypto/macs/CBCBlockCipherMac;-><init>(Lorg/spongycastle/crypto/BlockCipher;I)V

    .line 259
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->g:Lorg/spongycastle/crypto/CipherParameters;

    invoke-interface {v3, v2}, Lorg/spongycastle/crypto/Mac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    .line 264
    new-array v4, v7, [B

    .line 266
    invoke-direct {p0}, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 268
    aget-byte v2, v4, v1

    or-int/lit8 v2, v2, 0x40

    int-to-byte v2, v2

    aput-byte v2, v4, v1

    .line 271
    :cond_0
    aget-byte v2, v4, v1

    invoke-interface {v3}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v5

    add-int/lit8 v5, v5, -0x2

    div-int/lit8 v5, v5, 0x2

    and-int/lit8 v5, v5, 0x7

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v2, v5

    int-to-byte v2, v2

    aput-byte v2, v4, v1

    .line 273
    aget-byte v2, v4, v1

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    array-length v5, v5

    rsub-int/lit8 v5, v5, 0xf

    add-int/lit8 v5, v5, -0x1

    and-int/lit8 v5, v5, 0x7

    or-int/2addr v2, v5

    int-to-byte v2, v2

    aput-byte v2, v4, v1

    .line 275
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    array-length v5, v5

    invoke-static {v2, v1, v4, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v2, p2

    .line 279
    :goto_0
    if-lez v2, :cond_1

    .line 281
    rsub-int/lit8 v5, v0, 0x10

    and-int/lit16 v6, v2, 0xff

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 282
    ushr-int/lit8 v2, v2, 0x8

    .line 283
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 286
    :cond_1
    invoke-interface {v3, v4, v1, v7}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 291
    invoke-direct {p0}, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 295
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    const v2, 0xff00

    if-ge v0, v2, :cond_2

    .line 297
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 298
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    int-to-byte v0, v0

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 300
    const/4 v0, 0x2

    .line 314
    :goto_1
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v4, v4

    invoke-interface {v3, v2, v1, v4}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 316
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v2, v2

    add-int/2addr v0, v2

    rem-int/lit8 v2, v0, 0x10

    .line 317
    if-eqz v2, :cond_3

    move v0, v1

    .line 319
    :goto_2
    rsub-int/lit8 v4, v2, 0x10

    if-eq v0, v4, :cond_3

    .line 321
    invoke-interface {v3, v1}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 319
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 304
    :cond_2
    const/4 v0, -0x1

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 305
    const/4 v0, -0x2

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 306
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    shr-int/lit8 v0, v0, 0x18

    int-to-byte v0, v0

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 307
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    shr-int/lit8 v0, v0, 0x10

    int-to-byte v0, v0

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 308
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 309
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    int-to-byte v0, v0

    invoke-interface {v3, v0}, Lorg/spongycastle/crypto/Mac;->a(B)V

    .line 311
    const/4 v0, 0x6

    goto :goto_1

    .line 329
    :cond_3
    invoke-interface {v3, p1, v1, p2}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 331
    invoke-interface {v3, p3, v1}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    move-result v0

    return v0
.end method

.method private b()Z
    .locals 1

    .prologue
    .line 336
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    array-length v0, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .prologue
    .line 148
    const/4 v0, 0x0

    return v0
.end method

.method public final a([BI)I
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 115
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->i:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    .line 116
    array-length v5, v4

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->g:Lorg/spongycastle/crypto/CipherParameters;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CCM cipher unitialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v6, Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v6, v0}, Lorg/spongycastle/crypto/modes/SICBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iget v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    new-array v0, v0, [B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    array-length v2, v2

    rsub-int/lit8 v2, v2, 0xf

    add-int/lit8 v2, v2, -0x1

    and-int/lit8 v2, v2, 0x7

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    const/4 v3, 0x1

    iget-object v7, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    array-length v7, v7

    invoke-static {v2, v1, v0, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-boolean v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->c:Z

    new-instance v3, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v7, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->g:Lorg/spongycastle/crypto/CipherParameters;

    invoke-direct {v3, v7, v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    invoke-interface {v6, v2, v3}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->c:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    add-int/2addr v0, v5

    new-array v3, v0, [B

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    invoke-direct {p0, v4, v5, v0}, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->a([BI[B)I

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    invoke-interface {v6, v0, v1, v2, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move v0, v1

    move v2, v1

    :goto_0
    iget v7, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    sub-int v7, v5, v7

    if-ge v2, v7, :cond_1

    invoke-interface {v6, v4, v2, v3, v0}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    iget v7, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    add-int/2addr v0, v7

    iget v7, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    add-int/2addr v2, v7

    goto :goto_0

    :cond_1
    iget v7, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    new-array v7, v7, [B

    sub-int v8, v5, v2

    invoke-static {v4, v2, v7, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {v6, v7, v1, v7, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    sub-int v4, v5, v2

    invoke-static {v7, v1, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v2, v5, v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    array-length v4, v3

    sub-int/2addr v4, v0

    invoke-static {v2, v1, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v3

    .line 118
    :goto_1
    array-length v2, v0

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 120
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->i:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 122
    array-length v0, v0

    return v0

    .line 116
    :cond_2
    iget v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    sub-int v0, v5, v0

    new-array v3, v0, [B

    add-int/lit8 v0, v5, 0x0

    iget v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    invoke-static {v4, v0, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    invoke-interface {v6, v0, v1, v2, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    iget v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    :goto_2
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    array-length v2, v2

    if-eq v0, v2, :cond_5

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    aput-byte v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :goto_3
    array-length v5, v3

    iget v7, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    sub-int/2addr v5, v7

    if-ge v0, v5, :cond_3

    invoke-interface {v6, v4, v2, v3, v0}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    iget v5, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    add-int/2addr v0, v5

    iget v5, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    add-int/2addr v2, v5

    goto :goto_3

    :cond_3
    iget v5, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    new-array v5, v5, [B

    array-length v7, v3

    sub-int/2addr v7, v0

    invoke-static {v4, v2, v5, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {v6, v5, v1, v5, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    array-length v2, v3

    sub-int/2addr v2, v0

    invoke-static {v5, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->b:I

    new-array v0, v0, [B

    array-length v2, v3

    invoke-direct {p0, v3, v2, v0}, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->a([BI[B)I

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    invoke-static {v2, v0}, Lorg/spongycastle/util/Arrays;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "mac check in CCM failed"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v0, v3

    goto :goto_1

    :cond_5
    move v0, v1

    move v2, v1

    goto :goto_3
.end method

.method public final a([BII[BI)I
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->i:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 109
    const/4 v0, 0x0

    return v0
.end method

.method public final a()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 2

    .prologue
    .line 65
    iput-boolean p1, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->c:Z

    .line 67
    instance-of v0, p2, Lorg/spongycastle/crypto/params/AEADParameters;

    if-eqz v0, :cond_0

    .line 69
    check-cast p2, Lorg/spongycastle/crypto/params/AEADParameters;

    .line 71
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->d()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    .line 72
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->c()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    .line 73
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->b()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    .line 74
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->a()Lorg/spongycastle/crypto/params/KeyParameter;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->g:Lorg/spongycastle/crypto/CipherParameters;

    .line 84
    :goto_0
    return-void

    .line 76
    :cond_0
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_1

    .line 78
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 80
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->d:[B

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->e:[B

    .line 82
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->h:[B

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    .line 83
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->g:Lorg/spongycastle/crypto/CipherParameters;

    goto :goto_0

    .line 87
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid parameters passed to CCM"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 153
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->c:Z

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->i:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    add-int/2addr v0, p1

    iget v1, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    add-int/2addr v0, v1

    .line 159
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->i:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    add-int/2addr v0, p1

    iget v1, p0, Lorg/spongycastle/crypto/modes/CCMBlockCipher;->f:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method
