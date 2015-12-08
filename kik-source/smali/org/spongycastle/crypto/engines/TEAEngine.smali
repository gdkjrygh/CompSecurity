.class public Lorg/spongycastle/crypto/engines/TEAEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->e:Z

    .line 33
    return-void
.end method

.method private static a([BI)I
    .locals 3

    .prologue
    .line 165
    add-int/lit8 v0, p1, 0x1

    aget-byte v1, p0, p1

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v0, v2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(I[BI)V
    .locals 3

    .prologue
    .line 173
    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, p2

    .line 174
    add-int/lit8 v1, v0, 0x1

    ushr-int/lit8 v2, p0, 0x10

    int-to-byte v2, v2

    aput-byte v2, p1, v0

    .line 175
    add-int/lit8 v0, v1, 0x1

    ushr-int/lit8 v2, p0, 0x8

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    .line 176
    int-to-byte v1, p0

    aput-byte v1, p1, v0

    .line 177
    return-void
.end method

.method private b([BI[BI)I
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 120
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v1

    .line 121
    add-int/lit8 v2, p2, 0x4

    invoke-static {p1, v2}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v2

    move v3, v2

    move v2, v0

    .line 125
    :goto_0
    const/16 v4, 0x20

    if-eq v0, v4, :cond_0

    .line 127
    const v4, 0x61c88647

    sub-int/2addr v2, v4

    .line 128
    shl-int/lit8 v4, v3, 0x4

    iget v5, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->a:I

    add-int/2addr v4, v5

    add-int v5, v3, v2

    xor-int/2addr v4, v5

    ushr-int/lit8 v5, v3, 0x5

    iget v6, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->b:I

    add-int/2addr v5, v6

    xor-int/2addr v4, v5

    add-int/2addr v1, v4

    .line 129
    shl-int/lit8 v4, v1, 0x4

    iget v5, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->c:I

    add-int/2addr v4, v5

    add-int v5, v1, v2

    xor-int/2addr v4, v5

    ushr-int/lit8 v5, v1, 0x5

    iget v6, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->d:I

    add-int/2addr v5, v6

    xor-int/2addr v4, v5

    add-int/2addr v3, v4

    .line 125
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 132
    :cond_0
    invoke-static {v1, p3, p4}, Lorg/spongycastle/crypto/engines/TEAEngine;->a(I[BI)V

    .line 133
    add-int/lit8 v0, p4, 0x4

    invoke-static {v3, p3, v0}, Lorg/spongycastle/crypto/engines/TEAEngine;->a(I[BI)V

    .line 135
    const/16 v0, 0x8

    return v0
.end method

.method private c([BI[BI)I
    .locals 7

    .prologue
    .line 145
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v1

    .line 146
    add-int/lit8 v0, p2, 0x4

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v3

    .line 148
    const v2, -0x3910c8e0

    .line 150
    const/4 v0, 0x0

    :goto_0
    const/16 v4, 0x20

    if-eq v0, v4, :cond_0

    .line 152
    shl-int/lit8 v4, v1, 0x4

    iget v5, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->c:I

    add-int/2addr v4, v5

    add-int v5, v1, v2

    xor-int/2addr v4, v5

    ushr-int/lit8 v5, v1, 0x5

    iget v6, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->d:I

    add-int/2addr v5, v6

    xor-int/2addr v4, v5

    sub-int/2addr v3, v4

    .line 153
    shl-int/lit8 v4, v3, 0x4

    iget v5, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->a:I

    add-int/2addr v4, v5

    add-int v5, v3, v2

    xor-int/2addr v4, v5

    ushr-int/lit8 v5, v3, 0x5

    iget v6, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->b:I

    add-int/2addr v5, v6

    xor-int/2addr v4, v5

    sub-int/2addr v1, v4

    .line 154
    const v4, 0x61c88647

    add-int/2addr v2, v4

    .line 150
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 157
    :cond_0
    invoke-static {v1, p3, p4}, Lorg/spongycastle/crypto/engines/TEAEngine;->a(I[BI)V

    .line 158
    add-int/lit8 v0, p4, 0x4

    invoke-static {v3, p3, v0}, Lorg/spongycastle/crypto/engines/TEAEngine;->a(I[BI)V

    .line 160
    const/16 v0, 0x8

    return v0
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 2

    .prologue
    .line 76
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->e:Z

    if-nez v0, :cond_0

    .line 78
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TEA not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_0
    add-int/lit8 v0, p2, 0x8

    array-length v1, p1

    if-le v0, v1, :cond_1

    .line 83
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_1
    add-int/lit8 v0, p4, 0x8

    array-length v1, p3

    if-le v0, v1, :cond_2

    .line 88
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_2
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->f:Z

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/spongycastle/crypto/engines/TEAEngine;->b([BI[BI)I

    move-result v0

    :goto_0
    return v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/spongycastle/crypto/engines/TEAEngine;->c([BI[BI)I

    move-result v0

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    const-string v0, "TEA"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 57
    instance-of v0, p2, Lorg/spongycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to TEA init - "

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

    .line 62
    :cond_0
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->f:Z

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->e:Z

    .line 65
    check-cast p2, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 67
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v1

    iput v1, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->a:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v1

    iput v1, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->b:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v1

    iput v1, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->c:I

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/engines/TEAEngine;->a([BI)I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/engines/TEAEngine;->d:I

    .line 68
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 42
    const/16 v0, 0x8

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 97
    return-void
.end method
