.class public Lorg/spongycastle/crypto/engines/RC6Engine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private a:[I

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    .line 50
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 319
    shl-int v0, p0, p1

    neg-int v1, p1

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private static a([BI)I
    .locals 3

    .prologue
    .line 341
    const/4 v1, 0x0

    .line 343
    const/4 v0, 0x3

    :goto_0
    if-ltz v0, :cond_0

    .line 345
    shl-int/lit8 v1, v1, 0x8

    add-int v2, v0, p1

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    .line 343
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 348
    :cond_0
    return v1
.end method

.method private static a(I[BI)V
    .locals 3

    .prologue
    .line 356
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    .line 358
    add-int v1, v0, p2

    int-to-byte v2, p0

    aput-byte v2, p1, v1

    .line 359
    ushr-int/lit8 p0, p0, 0x8

    .line 356
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 361
    :cond_0
    return-void
.end method

.method private a([B)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 135
    array-length v0, p1

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v0, v0, 0x4

    new-array v6, v0, [I

    .line 143
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 145
    div-int/lit8 v2, v0, 0x4

    div-int/lit8 v3, v0, 0x4

    aget v3, v6, v3

    shl-int/lit8 v3, v3, 0x8

    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v3, v4

    aput v3, v6, v2

    .line 143
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 155
    :cond_0
    const/16 v0, 0x2c

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    .line 157
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const v2, -0x481eae9d

    aput v2, v0, v1

    .line 158
    const/4 v0, 0x1

    :goto_1
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 160
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    add-int/lit8 v4, v0, -0x1

    aget v3, v3, v4

    const v4, -0x61c88647

    add-int/2addr v3, v4

    aput v3, v2, v0

    .line 158
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 170
    :cond_1
    array-length v0, v6

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    array-length v2, v2

    if-le v0, v2, :cond_2

    .line 172
    array-length v0, v6

    mul-int/lit8 v0, v0, 0x3

    :goto_2
    move v2, v1

    move v3, v1

    move v4, v1

    move v5, v1

    .line 183
    :goto_3
    if-ge v1, v0, :cond_3

    .line 185
    iget-object v7, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    aget v8, v8, v3

    add-int/2addr v5, v8

    add-int/2addr v5, v4

    const/4 v8, 0x3

    invoke-static {v5, v8}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v5

    aput v5, v7, v3

    .line 186
    aget v7, v6, v2

    add-int/2addr v7, v5

    add-int/2addr v7, v4

    add-int/2addr v4, v5

    invoke-static {v7, v4}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v4

    aput v4, v6, v2

    .line 187
    add-int/lit8 v3, v3, 0x1

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    array-length v7, v7

    rem-int/2addr v3, v7

    .line 188
    add-int/lit8 v2, v2, 0x1

    array-length v7, v6

    rem-int/2addr v2, v7

    .line 183
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 176
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x3

    goto :goto_2

    .line 190
    :cond_3
    return-void
.end method

.method private static b(II)I
    .locals 2

    .prologue
    .line 334
    ushr-int v0, p0, p1

    neg-int v1, p1

    shl-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private b([BI[BI)I
    .locals 11

    .prologue
    const/4 v9, 0x5

    const/4 v3, 0x1

    .line 199
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v2

    .line 200
    add-int/lit8 v0, p2, 0x4

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v1

    .line 201
    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v0

    .line 202
    add-int/lit8 v4, p2, 0xc

    invoke-static {p1, v4}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v4

    .line 205
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    add-int/2addr v1, v5

    .line 206
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    aget v5, v5, v3

    add-int/2addr v4, v5

    move v10, v1

    move v1, v4

    move v4, v3

    move v3, v2

    move v2, v10

    .line 209
    :goto_0
    const/16 v5, 0x14

    if-gt v4, v5, :cond_0

    .line 211
    mul-int/lit8 v5, v2, 0x2

    add-int/lit8 v5, v5, 0x1

    mul-int/2addr v5, v2

    .line 214
    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v6

    .line 216
    mul-int/lit8 v5, v1, 0x2

    add-int/lit8 v5, v5, 0x1

    mul-int/2addr v5, v1

    .line 217
    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v7

    .line 219
    xor-int/2addr v3, v6

    .line 220
    invoke-static {v3, v7}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v3

    .line 221
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v8, v4, 0x2

    aget v5, v5, v8

    add-int/2addr v5, v3

    .line 223
    xor-int/2addr v0, v7

    .line 224
    invoke-static {v0, v6}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v0

    .line 225
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v6, v4, 0x2

    add-int/lit8 v6, v6, 0x1

    aget v3, v3, v6

    add-int/2addr v0, v3

    .line 209
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v2

    move v2, v0

    move v0, v1

    move v1, v5

    goto :goto_0

    .line 234
    :cond_0
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2a

    aget v4, v4, v5

    add-int/2addr v3, v4

    .line 235
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2b

    aget v4, v4, v5

    add-int/2addr v0, v4

    .line 238
    invoke-static {v3, p3, p4}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 239
    add-int/lit8 v3, p4, 0x4

    invoke-static {v2, p3, v3}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 240
    add-int/lit8 v2, p4, 0x8

    invoke-static {v0, p3, v2}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 241
    add-int/lit8 v0, p4, 0xc

    invoke-static {v1, p3, v0}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 243
    const/16 v0, 0x10

    return v0
.end method

.method private c([BI[BI)I
    .locals 11

    .prologue
    const/4 v9, 0x5

    .line 253
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v2

    .line 254
    add-int/lit8 v0, p2, 0x4

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v1

    .line 255
    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v0

    .line 256
    add-int/lit8 v3, p2, 0xc

    invoke-static {p1, v3}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([BI)I

    move-result v4

    .line 259
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2b

    aget v3, v3, v5

    sub-int/2addr v0, v3

    .line 260
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2a

    aget v3, v3, v5

    sub-int/2addr v2, v3

    .line 263
    const/16 v3, 0x14

    move v10, v3

    move v3, v4

    move v4, v10

    :goto_0
    if-lez v4, :cond_0

    .line 273
    mul-int/lit8 v5, v2, 0x2

    add-int/lit8 v5, v5, 0x1

    mul-int/2addr v5, v2

    .line 274
    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v5

    .line 276
    mul-int/lit8 v6, v0, 0x2

    add-int/lit8 v6, v6, 0x1

    mul-int/2addr v6, v0

    .line 277
    invoke-static {v6, v9}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(II)I

    move-result v6

    .line 279
    iget-object v7, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v8, v4, 0x2

    add-int/lit8 v8, v8, 0x1

    aget v7, v7, v8

    sub-int/2addr v1, v7

    .line 280
    invoke-static {v1, v5}, Lorg/spongycastle/crypto/engines/RC6Engine;->b(II)I

    move-result v1

    .line 281
    xor-int/2addr v1, v6

    .line 283
    iget-object v7, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v8, v4, 0x2

    aget v7, v7, v8

    sub-int/2addr v3, v7

    .line 284
    invoke-static {v3, v6}, Lorg/spongycastle/crypto/engines/RC6Engine;->b(II)I

    move-result v3

    .line 285
    xor-int/2addr v3, v5

    .line 263
    add-int/lit8 v4, v4, -0x1

    move v10, v1

    move v1, v2

    move v2, v3

    move v3, v0

    move v0, v10

    goto :goto_0

    .line 289
    :cond_0
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    sub-int/2addr v3, v4

    .line 290
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    sub-int/2addr v1, v4

    .line 292
    invoke-static {v2, p3, p4}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 293
    add-int/lit8 v2, p4, 0x4

    invoke-static {v1, p3, v2}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 294
    add-int/lit8 v1, p4, 0x8

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 295
    add-int/lit8 v0, p4, 0xc

    invoke-static {v3, p3, v0}, Lorg/spongycastle/crypto/engines/RC6Engine;->a(I[BI)V

    .line 297
    const/16 v0, 0x10

    return v0
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->a:[I

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RC6 engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    add-int/lit8 v0, p2, 0x10

    array-length v1, p1

    if-le v0, v1, :cond_1

    .line 97
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_1
    add-int/lit8 v0, p4, 0x10

    array-length v1, p3

    if-le v0, v1, :cond_2

    .line 101
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :cond_2
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->b:Z

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/spongycastle/crypto/engines/RC6Engine;->b([BI[BI)I

    move-result v0

    :goto_0
    return v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/spongycastle/crypto/engines/RC6Engine;->c([BI[BI)I

    move-result v0

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    const-string v0, "RC6"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 74
    instance-of v0, p2, Lorg/spongycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_0

    .line 76
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to RC6 init - "

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

    .line 79
    :cond_0
    check-cast p2, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 80
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/RC6Engine;->b:Z

    .line 81
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/engines/RC6Engine;->a([B)V

    .line 82
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 59
    const/16 v0, 0x10

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 111
    return-void
.end method
