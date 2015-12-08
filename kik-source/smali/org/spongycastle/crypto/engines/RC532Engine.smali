.class public Lorg/spongycastle/crypto/engines/RC532Engine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private a:I

.field private b:[I

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/16 v0, 0xc

    iput v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->a:I

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    .line 52
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 251
    and-int/lit8 v0, p1, 0x1f

    shl-int v0, p0, v0

    and-int/lit8 v1, p1, 0x1f

    rsub-int/lit8 v1, v1, 0x20

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private static a([BI)I
    .locals 2

    .prologue
    .line 273
    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(I[BI)V
    .locals 2

    .prologue
    .line 282
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 283
    add-int/lit8 v0, p2, 0x1

    shr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 284
    add-int/lit8 v0, p2, 0x2

    shr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 285
    add-int/lit8 v0, p2, 0x3

    shr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 286
    return-void
.end method

.method private a([B)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 132
    array-length v0, p1

    add-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x4

    new-array v6, v0, [I

    move v0, v1

    .line 134
    :goto_0
    array-length v2, p1

    if-eq v0, v2, :cond_0

    .line 136
    div-int/lit8 v2, v0, 0x4

    aget v3, v6, v2

    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    rem-int/lit8 v5, v0, 0x4

    mul-int/lit8 v5, v5, 0x8

    shl-int/2addr v4, v5

    add-int/2addr v3, v4

    aput v3, v6, v2

    .line 134
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 145
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->a:I

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    .line 147
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    const v2, -0x481eae9d

    aput v2, v0, v1

    .line 148
    const/4 v0, 0x1

    :goto_1
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 150
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    add-int/lit8 v4, v0, -0x1

    aget v3, v3, v4

    const v4, -0x61c88647

    add-int/2addr v3, v4

    aput v3, v2, v0

    .line 148
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 160
    :cond_1
    array-length v0, v6

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    array-length v2, v2

    if-le v0, v2, :cond_2

    .line 162
    array-length v0, v6

    mul-int/lit8 v0, v0, 0x3

    :goto_2
    move v2, v1

    move v3, v1

    move v4, v1

    move v5, v1

    .line 172
    :goto_3
    if-ge v1, v0, :cond_3

    .line 174
    iget-object v7, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    aget v8, v8, v3

    add-int/2addr v5, v8

    add-int/2addr v5, v4

    const/4 v8, 0x3

    invoke-static {v5, v8}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(II)I

    move-result v5

    aput v5, v7, v3

    .line 175
    aget v7, v6, v2

    add-int/2addr v7, v5

    add-int/2addr v7, v4

    add-int/2addr v4, v5

    invoke-static {v7, v4}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(II)I

    move-result v4

    aput v4, v6, v2

    .line 176
    add-int/lit8 v3, v3, 0x1

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    array-length v7, v7

    rem-int/2addr v3, v7

    .line 177
    add-int/lit8 v2, v2, 0x1

    array-length v7, v6

    rem-int/2addr v2, v7

    .line 172
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 166
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x3

    goto :goto_2

    .line 179
    :cond_3
    return-void
.end method

.method private static b(II)I
    .locals 2

    .prologue
    .line 266
    and-int/lit8 v0, p1, 0x1f

    ushr-int v0, p0, v0

    and-int/lit8 v1, p1, 0x1f

    rsub-int/lit8 v1, v1, 0x20

    shl-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, 0x0

    const/4 v1, 0x1

    .line 104
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->c:Z

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/RC532Engine;->a([BI)I

    move-result v0

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    aget v2, v2, v6

    add-int/2addr v0, v2

    add-int/lit8 v2, p2, 0x4

    invoke-static {p1, v2}, Lorg/spongycastle/crypto/engines/RC532Engine;->a([BI)I

    move-result v2

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    aget v3, v3, v1

    add-int/2addr v2, v3

    :goto_0
    iget v3, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->a:I

    if-gt v1, v3, :cond_0

    xor-int/2addr v0, v2

    invoke-static {v0, v2}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(II)I

    move-result v0

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    mul-int/lit8 v4, v1, 0x2

    aget v3, v3, v4

    add-int/2addr v0, v3

    xor-int/2addr v2, v0

    invoke-static {v2, v0}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(II)I

    move-result v2

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    mul-int/lit8 v4, v1, 0x2

    add-int/lit8 v4, v4, 0x1

    aget v3, v3, v4

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0, p3, p4}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(I[BI)V

    add-int/lit8 v0, p4, 0x4

    invoke-static {v2, p3, v0}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(I[BI)V

    :goto_1
    return v7

    :cond_1
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/RC532Engine;->a([BI)I

    move-result v0

    add-int/lit8 v2, p2, 0x4

    invoke-static {p1, v2}, Lorg/spongycastle/crypto/engines/RC532Engine;->a([BI)I

    move-result v3

    iget v2, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->a:I

    :goto_2
    if-lez v2, :cond_2

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    mul-int/lit8 v5, v2, 0x2

    add-int/lit8 v5, v5, 0x1

    aget v4, v4, v5

    sub-int/2addr v3, v4

    invoke-static {v3, v0}, Lorg/spongycastle/crypto/engines/RC532Engine;->b(II)I

    move-result v3

    xor-int/2addr v3, v0

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    mul-int/lit8 v5, v2, 0x2

    aget v4, v4, v5

    sub-int/2addr v0, v4

    invoke-static {v0, v3}, Lorg/spongycastle/crypto/engines/RC532Engine;->b(II)I

    move-result v0

    xor-int/2addr v0, v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    aget v2, v2, v6

    sub-int/2addr v0, v2

    invoke-static {v0, p3, p4}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(I[BI)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->b:[I

    aget v0, v0, v1

    sub-int v0, v3, v0

    add-int/lit8 v1, p4, 0x4

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/RC532Engine;->a(I[BI)V

    goto :goto_1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    const-string v0, "RC5-32"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 76
    instance-of v0, p2, Lorg/spongycastle/crypto/params/RC5Parameters;

    if-eqz v0, :cond_0

    .line 78
    check-cast p2, Lorg/spongycastle/crypto/params/RC5Parameters;

    .line 80
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/RC5Parameters;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->a:I

    .line 82
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/RC5Parameters;->a()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/engines/RC532Engine;->a([B)V

    .line 95
    :goto_0
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/RC532Engine;->c:Z

    .line 96
    return-void

    .line 84
    :cond_0
    instance-of v0, p2, Lorg/spongycastle/crypto/params/KeyParameter;

    if-eqz v0, :cond_1

    .line 86
    check-cast p2, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 88
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/engines/RC532Engine;->a([B)V

    goto :goto_0

    .line 92
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to RC532 init - "

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

.method public final b()I
    .locals 1

    .prologue
    .line 61
    const/16 v0, 0x8

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 110
    return-void
.end method
