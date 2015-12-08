.class public Lorg/spongycastle/crypto/macs/GOST28147Mac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Mac;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:[B

.field private e:[B

.field private f:Z

.field private g:[I

.field private h:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/16 v0, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    .line 16
    const/4 v0, 0x4

    iput v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b:I

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->g:[I

    .line 25
    const/16 v0, 0x80

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    .line 38
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    .line 40
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    .line 42
    return-void

    .line 25
    nop

    :array_0
    .array-data 1
        0x9t
        0x6t
        0x3t
        0x2t
        0x8t
        0xbt
        0x1t
        0x7t
        0xat
        0x4t
        0xet
        0xft
        0xct
        0x0t
        0xdt
        0x5t
        0x3t
        0x7t
        0xet
        0x9t
        0x8t
        0xat
        0xft
        0x0t
        0x5t
        0x2t
        0x6t
        0xct
        0xbt
        0x4t
        0xdt
        0x1t
        0xet
        0x4t
        0x6t
        0x2t
        0xbt
        0x3t
        0xdt
        0x8t
        0xct
        0xft
        0x5t
        0xat
        0x0t
        0x7t
        0x1t
        0x9t
        0xet
        0x7t
        0xat
        0xct
        0xdt
        0x1t
        0x3t
        0x9t
        0x0t
        0x2t
        0xbt
        0x4t
        0xft
        0x8t
        0x5t
        0x6t
        0xbt
        0x5t
        0x1t
        0x9t
        0x8t
        0xdt
        0xft
        0x0t
        0xet
        0x4t
        0x2t
        0x3t
        0xct
        0x7t
        0xat
        0x6t
        0x3t
        0xat
        0xdt
        0xct
        0x1t
        0x2t
        0x0t
        0xbt
        0x7t
        0x5t
        0x9t
        0x4t
        0x8t
        0xft
        0xet
        0x6t
        0x1t
        0xdt
        0x2t
        0x9t
        0x7t
        0xat
        0x6t
        0x0t
        0x8t
        0xct
        0x4t
        0x5t
        0xft
        0x3t
        0xbt
        0xet
        0xbt
        0xat
        0xft
        0x5t
        0x0t
        0xct
        0xet
        0x8t
        0x6t
        0x2t
        0x3t
        0x9t
        0x1t
        0x7t
        0xdt
        0x4t
    .end array-data
.end method

.method private static a(I[BI)V
    .locals 2

    .prologue
    .line 162
    add-int/lit8 v0, p2, 0x3

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 163
    add-int/lit8 v0, p2, 0x2

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 164
    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 165
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 166
    return-void
.end method

.method private a([I[B[B)V
    .locals 11

    .prologue
    const/4 v9, 0x4

    const/4 v1, 0x0

    .line 130
    invoke-static {p2, v1}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b([BI)I

    move-result v0

    .line 131
    invoke-static {p2, v9}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b([BI)I

    move-result v2

    move v4, v1

    .line 133
    :goto_0
    const/4 v3, 0x2

    if-ge v4, v3, :cond_1

    move v3, v2

    move v2, v0

    move v0, v1

    .line 135
    :goto_1
    const/16 v5, 0x8

    if-ge v0, v5, :cond_0

    .line 138
    aget v5, p1, v0

    add-int/2addr v5, v2

    iget-object v6, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v7, v5, 0x0

    and-int/lit8 v7, v7, 0xf

    add-int/lit8 v7, v7, 0x0

    aget-byte v6, v6, v7

    shl-int/lit8 v6, v6, 0x0

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v8, v5, 0x4

    and-int/lit8 v8, v8, 0xf

    add-int/lit8 v8, v8, 0x10

    aget-byte v7, v7, v8

    shl-int/lit8 v7, v7, 0x4

    add-int/2addr v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v8, v5, 0x8

    and-int/lit8 v8, v8, 0xf

    add-int/lit8 v8, v8, 0x20

    aget-byte v7, v7, v8

    shl-int/lit8 v7, v7, 0x8

    add-int/2addr v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v8, v5, 0xc

    and-int/lit8 v8, v8, 0xf

    add-int/lit8 v8, v8, 0x30

    aget-byte v7, v7, v8

    shl-int/lit8 v7, v7, 0xc

    add-int/2addr v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v8, v5, 0x10

    and-int/lit8 v8, v8, 0xf

    add-int/lit8 v8, v8, 0x40

    aget-byte v7, v7, v8

    shl-int/lit8 v7, v7, 0x10

    add-int/2addr v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v8, v5, 0x14

    and-int/lit8 v8, v8, 0xf

    add-int/lit8 v8, v8, 0x50

    aget-byte v7, v7, v8

    shl-int/lit8 v7, v7, 0x14

    add-int/2addr v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v8, v5, 0x18

    and-int/lit8 v8, v8, 0xf

    add-int/lit8 v8, v8, 0x60

    aget-byte v7, v7, v8

    shl-int/lit8 v7, v7, 0x18

    add-int/2addr v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    shr-int/lit8 v5, v5, 0x1c

    and-int/lit8 v5, v5, 0xf

    add-int/lit8 v5, v5, 0x70

    aget-byte v5, v7, v5

    shl-int/lit8 v5, v5, 0x1c

    add-int/2addr v5, v6

    shl-int/lit8 v6, v5, 0xb

    ushr-int/lit8 v5, v5, 0x15

    or-int/2addr v5, v6

    xor-int/2addr v3, v5

    .line 135
    add-int/lit8 v0, v0, 0x1

    move v10, v3

    move v3, v2

    move v2, v10

    goto :goto_1

    .line 133
    :cond_0
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move v0, v2

    move v2, v3

    goto/16 :goto_0

    .line 143
    :cond_1
    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a(I[BI)V

    .line 144
    invoke-static {v2, p3, v9}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a(I[BI)V

    .line 145
    return-void
.end method

.method private static a([BI[B)[B
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 170
    array-length v1, p0

    sub-int/2addr v1, p1

    new-array v1, v1, [B

    .line 172
    array-length v2, p2

    invoke-static {p0, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 174
    :goto_0
    array-length v2, p2

    if-eq v0, v2, :cond_0

    .line 176
    aget-byte v2, v1, v0

    aget-byte v3, p2, v0

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    .line 174
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 179
    :cond_0
    return-object v1
.end method

.method private static a([B)[I
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 47
    array-length v0, p0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Key length invalid. Key needs to be 32 byte - 256 bit!!!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_0
    new-array v1, v3, [I

    .line 53
    const/4 v0, 0x0

    :goto_0
    if-eq v0, v3, :cond_1

    .line 55
    mul-int/lit8 v2, v0, 0x4

    invoke-static {p0, v2}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b([BI)I

    move-result v2

    aput v2, v1, v0

    .line 53
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 58
    :cond_1
    return-object v1
.end method

.method private static b([BI)I
    .locals 3

    .prologue
    .line 152
    add-int/lit8 v0, p1, 0x3

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    aget-byte v1, p0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b:I

    return v0
.end method

.method public final a([BI)I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 257
    :goto_0
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    iget v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    if-ge v0, v1, :cond_0

    .line 259
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    aput-byte v3, v0, v1

    .line 260
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    goto :goto_0

    .line 263
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 264
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    array-length v2, v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 266
    iget-boolean v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    if-eqz v1, :cond_1

    .line 268
    iput-boolean v3, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    .line 275
    :goto_1
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->g:[I

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-direct {p0, v1, v0, v2}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([I[B[B)V

    .line 277
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    iget v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b:I

    sub-int/2addr v1, v2

    iget v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b:I

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 279
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b()V

    .line 281
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b:I

    return v0

    .line 272
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-static {v0, v3, v1}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([BI[B)[B

    move-result-object v0

    goto :goto_1
.end method

.method public final a(B)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 185
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 187
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 188
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    array-length v2, v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    iget-boolean v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    if-eqz v1, :cond_1

    .line 192
    iput-boolean v3, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    .line 199
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->g:[I

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-direct {p0, v1, v0, v2}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([I[B[B)V

    .line 200
    iput v3, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    .line 203
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    aput-byte p1, v0, v1

    .line 204
    return-void

    .line 196
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-static {v0, v3, v1}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([BI[B)[B

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 65
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->b()V

    .line 66
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    .line 67
    instance-of v0, p1, Lorg/spongycastle/crypto/params/ParametersWithSBox;

    if-eqz v0, :cond_1

    .line 69
    check-cast p1, Lorg/spongycastle/crypto/params/ParametersWithSBox;

    .line 74
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithSBox;->a()[B

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->h:[B

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithSBox;->a()[B

    move-result-object v2

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithSBox;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithSBox;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->g:[I

    .line 86
    :cond_0
    :goto_0
    return-void

    .line 84
    :cond_1
    instance-of v0, p1, Lorg/spongycastle/crypto/params/KeyParameter;

    if-eqz v0, :cond_2

    .line 86
    check-cast p1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->g:[I

    goto :goto_0

    .line 90
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to GOST28147 init - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a([BII)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 209
    if-gez p3, :cond_0

    .line 211
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 214
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    iget v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    sub-int v1, v0, v1

    .line 216
    if-le p3, v1, :cond_2

    .line 218
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 220
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 221
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    array-length v3, v3

    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 223
    iget-boolean v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    if-eqz v2, :cond_1

    .line 225
    iput-boolean v4, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    .line 232
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->g:[I

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-direct {p0, v2, v0, v3}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([I[B[B)V

    .line 234
    iput v4, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    .line 235
    sub-int v0, p3, v1

    .line 236
    add-int/2addr v1, p2

    .line 238
    :goto_1
    iget v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    if-le v0, v2, :cond_3

    .line 240
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-static {p1, v1, v2}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([BI[B)[B

    move-result-object v2

    .line 241
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->g:[I

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-direct {p0, v3, v2, v4}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([I[B[B)V

    .line 243
    iget v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    sub-int/2addr v0, v2

    .line 244
    iget v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a:I

    add-int/2addr v1, v2

    goto :goto_1

    .line 229
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->e:[B

    invoke-static {v0, v4, v2}, Lorg/spongycastle/crypto/macs/GOST28147Mac;->a([BI[B)[B

    move-result-object v0

    goto :goto_0

    :cond_2
    move v0, p3

    move v1, p2

    .line 248
    :cond_3
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    iget v3, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    invoke-static {p1, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 250
    iget v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    .line 251
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 289
    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 291
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->d:[B

    aput-byte v1, v2, v0

    .line 289
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 294
    :cond_0
    iput v1, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->c:I

    .line 296
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/crypto/macs/GOST28147Mac;->f:Z

    .line 297
    return-void
.end method
