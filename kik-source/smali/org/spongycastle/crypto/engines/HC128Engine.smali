.class public Lorg/spongycastle/crypto/engines/HC128Engine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/StreamCipher;


# instance fields
.field private a:[I

.field private b:[I

.field private c:I

.field private d:[B

.field private e:[B

.field private f:Z

.field private g:[B

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/16 v2, 0x200

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-array v0, v2, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    .line 26
    new-array v0, v2, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    .line 27
    iput v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->c:I

    .line 200
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->g:[B

    .line 201
    iput v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->h:I

    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 56
    shl-int v0, p0, p1

    neg-int v1, p1

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private static b(II)I
    .locals 2

    .prologue
    .line 63
    ushr-int v0, p0, p1

    neg-int v1, p1

    shl-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private c()I
    .locals 10

    .prologue
    const/16 v9, 0x17

    const/16 v8, 0xa

    const/16 v7, 0x8

    .line 93
    iget v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->c:I

    and-int/lit16 v0, v0, 0x1ff

    .line 95
    iget v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->c:I

    const/16 v2, 0x200

    if-ge v1, v2, :cond_0

    .line 97
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    aget v2, v1, v0

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    add-int/lit8 v4, v0, -0x3

    and-int/lit16 v4, v4, 0x1ff

    aget v3, v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    add-int/lit8 v5, v0, -0xa

    and-int/lit16 v5, v5, 0x1ff

    aget v4, v4, v5

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    add-int/lit16 v6, v0, -0x1ff

    and-int/lit16 v6, v6, 0x1ff

    aget v5, v5, v6

    invoke-static {v3, v8}, Lorg/spongycastle/crypto/engines/HC128Engine;->b(II)I

    move-result v3

    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/HC128Engine;->b(II)I

    move-result v5

    xor-int/2addr v3, v5

    invoke-static {v4, v7}, Lorg/spongycastle/crypto/engines/HC128Engine;->b(II)I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    aput v2, v1, v0

    .line 98
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    add-int/lit8 v2, v0, -0xc

    and-int/lit16 v2, v2, 0x1ff

    aget v1, v1, v2

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    and-int/lit16 v3, v1, 0xff

    aget v2, v2, v3

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    shr-int/lit8 v1, v1, 0x10

    and-int/lit16 v1, v1, 0xff

    add-int/lit16 v1, v1, 0x100

    aget v1, v3, v1

    add-int/2addr v1, v2

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    aget v0, v2, v0

    xor-int/2addr v0, v1

    .line 105
    :goto_0
    iget v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->c:I

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0x3ff

    iput v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->c:I

    .line 106
    return v0

    .line 102
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    aget v2, v1, v0

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    add-int/lit8 v4, v0, -0x3

    and-int/lit16 v4, v4, 0x1ff

    aget v3, v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    add-int/lit8 v5, v0, -0xa

    and-int/lit16 v5, v5, 0x1ff

    aget v4, v4, v5

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    add-int/lit16 v6, v0, -0x1ff

    and-int/lit16 v6, v6, 0x1ff

    aget v5, v5, v6

    invoke-static {v3, v8}, Lorg/spongycastle/crypto/engines/HC128Engine;->a(II)I

    move-result v3

    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/HC128Engine;->a(II)I

    move-result v5

    xor-int/2addr v3, v5

    invoke-static {v4, v7}, Lorg/spongycastle/crypto/engines/HC128Engine;->a(II)I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    aput v2, v1, v0

    .line 103
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    add-int/lit8 v2, v0, -0xc

    and-int/lit16 v2, v2, 0x1ff

    aget v1, v1, v2

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    and-int/lit16 v3, v1, 0xff

    aget v2, v2, v3

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    shr-int/lit8 v1, v1, 0x10

    and-int/lit16 v1, v1, 0xff

    add-int/lit16 v1, v1, 0x100

    aget v1, v3, v1

    add-int/2addr v1, v2

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    aget v0, v2, v0

    xor-int/2addr v0, v1

    goto :goto_0
.end method

.method private d()V
    .locals 11

    .prologue
    const/16 v10, 0x500

    const/4 v9, 0x4

    const/16 v8, 0x200

    const/16 v2, 0x10

    const/4 v1, 0x0

    .line 114
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->d:[B

    array-length v0, v0

    if-eq v0, v2, :cond_0

    .line 116
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The key must be 128 bits long"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_0
    iput v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->c:I

    .line 122
    new-array v3, v10, [I

    move v0, v1

    .line 124
    :goto_0
    if-ge v0, v2, :cond_1

    .line 126
    shr-int/lit8 v4, v0, 0x2

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->d:[B

    aget-byte v6, v6, v0

    and-int/lit16 v6, v6, 0xff

    and-int/lit8 v7, v0, 0x3

    mul-int/lit8 v7, v7, 0x8

    shl-int/2addr v6, v7

    or-int/2addr v5, v6

    aput v5, v3, v4

    .line 124
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 128
    :cond_1
    invoke-static {v3, v1, v3, v9, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 130
    :goto_1
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->e:[B

    array-length v4, v4

    if-ge v0, v4, :cond_2

    if-ge v0, v2, :cond_2

    .line 132
    shr-int/lit8 v4, v0, 0x2

    add-int/lit8 v4, v4, 0x8

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->e:[B

    aget-byte v6, v6, v0

    and-int/lit16 v6, v6, 0xff

    and-int/lit8 v7, v0, 0x3

    mul-int/lit8 v7, v7, 0x8

    shl-int/2addr v6, v7

    or-int/2addr v5, v6

    aput v5, v3, v4

    .line 130
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 134
    :cond_2
    const/16 v0, 0x8

    const/16 v4, 0xc

    invoke-static {v3, v0, v3, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v2

    .line 136
    :goto_2
    if-ge v0, v10, :cond_3

    .line 138
    add-int/lit8 v2, v0, -0x2

    aget v2, v3, v2

    const/16 v4, 0x11

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/engines/HC128Engine;->b(II)I

    move-result v4

    const/16 v5, 0x13

    invoke-static {v2, v5}, Lorg/spongycastle/crypto/engines/HC128Engine;->b(II)I

    move-result v5

    xor-int/2addr v4, v5

    ushr-int/lit8 v2, v2, 0xa

    xor-int/2addr v2, v4

    add-int/lit8 v4, v0, -0x7

    aget v4, v3, v4

    add-int/2addr v2, v4

    add-int/lit8 v4, v0, -0xf

    aget v4, v3, v4

    const/4 v5, 0x7

    invoke-static {v4, v5}, Lorg/spongycastle/crypto/engines/HC128Engine;->b(II)I

    move-result v5

    const/16 v6, 0x12

    invoke-static {v4, v6}, Lorg/spongycastle/crypto/engines/HC128Engine;->b(II)I

    move-result v6

    xor-int/2addr v5, v6

    ushr-int/lit8 v4, v4, 0x3

    xor-int/2addr v4, v5

    add-int/2addr v2, v4

    add-int/lit8 v4, v0, -0x10

    aget v4, v3, v4

    add-int/2addr v2, v4

    add-int/2addr v2, v0

    aput v2, v3, v0

    .line 136
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 141
    :cond_3
    const/16 v0, 0x100

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    invoke-static {v3, v0, v2, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    const/16 v0, 0x300

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    invoke-static {v3, v0, v2, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 144
    :goto_3
    if-ge v0, v8, :cond_4

    .line 146
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->a:[I

    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/HC128Engine;->c()I

    move-result v3

    aput v3, v2, v0

    .line 144
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    move v0, v1

    .line 148
    :goto_4
    if-ge v0, v8, :cond_5

    .line 150
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->b:[I

    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/HC128Engine;->c()I

    move-result v3

    aput v3, v2, v0

    .line 148
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 153
    :cond_5
    iput v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->c:I

    .line 154
    return-void
.end method

.method private e()B
    .locals 4

    .prologue
    .line 205
    iget v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->h:I

    if-nez v0, :cond_0

    .line 207
    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/HC128Engine;->c()I

    move-result v0

    .line 208
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->g:[B

    const/4 v2, 0x0

    and-int/lit16 v3, v0, 0xff

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 209
    shr-int/lit8 v0, v0, 0x8

    .line 210
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->g:[B

    const/4 v2, 0x1

    and-int/lit16 v3, v0, 0xff

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 211
    shr-int/lit8 v0, v0, 0x8

    .line 212
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->g:[B

    const/4 v2, 0x2

    and-int/lit16 v3, v0, 0xff

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 213
    shr-int/lit8 v0, v0, 0x8

    .line 214
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->g:[B

    const/4 v2, 0x3

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 216
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->g:[B

    iget v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->h:I

    aget-byte v0, v0, v1

    .line 217
    iget v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->h:I

    add-int/lit8 v1, v1, 0x1

    and-int/lit8 v1, v1, 0x3

    iput v1, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->h:I

    .line 218
    return v0
.end method


# virtual methods
.method public final a(B)B
    .locals 1

    .prologue
    .line 254
    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/HC128Engine;->e()B

    move-result v0

    xor-int/2addr v0, p1

    int-to-byte v0, v0

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 158
    const-string v0, "HC-128"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 173
    .line 175
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 177
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->e:[B

    move-object v0, p2

    .line 178
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    .line 185
    :goto_0
    instance-of v1, v0, Lorg/spongycastle/crypto/params/KeyParameter;

    if-eqz v1, :cond_1

    .line 187
    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->d:[B

    .line 188
    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/HC128Engine;->d()V

    .line 197
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->f:Z

    .line 198
    return-void

    .line 182
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->e:[B

    move-object v0, p2

    goto :goto_0

    .line 192
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid parameter passed to HC128 init - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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

.method public final a([BII[BI)V
    .locals 4

    .prologue
    .line 224
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->f:Z

    if-nez v0, :cond_0

    .line 226
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HC-128 not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 230
    :cond_0
    add-int v0, p2, p3

    array-length v1, p1

    if-le v0, v1, :cond_1

    .line 232
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 235
    :cond_1
    add-int v0, p5, p3

    array-length v1, p4

    if-le v0, v1, :cond_2

    .line 237
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    .line 242
    add-int v1, p5, v0

    add-int v2, p2, v0

    aget-byte v2, p1, v2

    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/HC128Engine;->e()B

    move-result v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p4, v1

    .line 240
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 244
    :cond_3
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 248
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/engines/HC128Engine;->h:I

    .line 249
    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/HC128Engine;->d()V

    .line 250
    return-void
.end method
