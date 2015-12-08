.class public Lorg/spongycastle/crypto/macs/VMPCMac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Mac;


# instance fields
.field private a:B

.field private b:B

.field private c:[B

.field private d:B

.field private e:[B

.field private f:[B

.field private g:[B

.field private h:B

.field private i:B

.field private j:B

.field private k:B


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    .line 15
    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 82
    const/16 v0, 0x14

    return v0
.end method

.method public final a([BI)I
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/16 v8, 0x14

    .line 28
    const/4 v0, 0x1

    :goto_0
    const/16 v2, 0x19

    if-ge v0, v2, :cond_0

    .line 30
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    and-int/lit16 v5, v5, 0xff

    aget-byte v4, v4, v5

    add-int/2addr v3, v4

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    .line 32
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->k:B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    add-int/2addr v3, v4

    add-int/2addr v3, v0

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->k:B

    .line 33
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    add-int/2addr v3, v4

    add-int/2addr v3, v0

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    .line 34
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    add-int/2addr v3, v4

    add-int/2addr v3, v0

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    .line 35
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    add-int/2addr v3, v4

    add-int/2addr v3, v0

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    .line 36
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    and-int/lit8 v3, v3, 0x1f

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    and-int/lit8 v5, v5, 0x1f

    aget-byte v4, v4, v5

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 37
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v3, v3, 0x1

    and-int/lit8 v3, v3, 0x1f

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v5, v5, 0x1

    and-int/lit8 v5, v5, 0x1f

    aget-byte v4, v4, v5

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 38
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v3, v3, 0x2

    and-int/lit8 v3, v3, 0x1f

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v5, v5, 0x2

    and-int/lit8 v5, v5, 0x1f

    aget-byte v4, v4, v5

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 39
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x1f

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0x1f

    aget-byte v4, v4, v5

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->k:B

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    .line 40
    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v2, v2, 0x4

    and-int/lit8 v2, v2, 0x1f

    int-to-byte v2, v2

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    .line 42
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    .line 43
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    and-int/lit16 v4, v4, 0xff

    iget-object v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v6, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v6, v6, 0xff

    aget-byte v5, v5, v6

    aput-byte v5, v3, v4

    .line 44
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v4, v4, 0xff

    aput-byte v2, v3, v4

    .line 45
    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    add-int/lit8 v2, v2, 0x1

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    .line 28
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_0
    move v0, v1

    .line 49
    :goto_1
    const/16 v2, 0x300

    if-ge v0, v2, :cond_1

    .line 51
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v5, v0, 0xff

    aget-byte v4, v4, v5

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    and-int/lit8 v5, v0, 0x1f

    aget-byte v4, v4, v5

    add-int/2addr v3, v4

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    .line 52
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v3, v0, 0xff

    aget-byte v2, v2, v3

    .line 53
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v4, v0, 0xff

    iget-object v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v6, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v6, v6, 0xff

    aget-byte v5, v5, v6

    aput-byte v5, v3, v4

    .line 54
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v4, v4, 0xff

    aput-byte v2, v3, v4

    .line 49
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 58
    :cond_1
    new-array v2, v8, [B

    move v0, v1

    .line 59
    :goto_2
    if-ge v0, v8, :cond_2

    .line 61
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v6, v0, 0xff

    aget-byte v5, v5, v6

    add-int/2addr v4, v5

    and-int/lit16 v4, v4, 0xff

    aget-byte v3, v3, v4

    iput-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    .line 62
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-object v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v6, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v6, v6, 0xff

    aget-byte v5, v5, v6

    and-int/lit16 v5, v5, 0xff

    aget-byte v4, v4, v5

    add-int/lit8 v4, v4, 0x1

    and-int/lit16 v4, v4, 0xff

    aget-byte v3, v3, v4

    aput-byte v3, v2, v0

    .line 64
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v4, v0, 0xff

    aget-byte v3, v3, v4

    .line 65
    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v5, v0, 0xff

    iget-object v6, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v7, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v7, v7, 0xff

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    .line 66
    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v5, v5, 0xff

    aput-byte v3, v4, v5

    .line 59
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 69
    :cond_2
    invoke-static {v2, v1, p1, p2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 70
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/VMPCMac;->b()V

    .line 72
    return v8
.end method

.method public final a(B)V
    .locals 5

    .prologue
    .line 154
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    add-int/2addr v1, v2

    and-int/lit16 v1, v1, 0xff

    aget-byte v0, v0, v1

    iput-byte v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    .line 155
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v3, v3, 0xff

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    aget-byte v1, v1, v2

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0xff

    aget-byte v0, v0, v1

    xor-int/2addr v0, p1

    int-to-byte v0, v0

    .line 157
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->k:B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    add-int/2addr v2, v3

    and-int/lit16 v2, v2, 0xff

    aget-byte v1, v1, v2

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->k:B

    .line 158
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    add-int/2addr v2, v3

    and-int/lit16 v2, v2, 0xff

    aget-byte v1, v1, v2

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    .line 159
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    add-int/2addr v2, v3

    and-int/lit16 v2, v2, 0xff

    aget-byte v1, v1, v2

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    .line 160
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    add-int/2addr v2, v3

    add-int/2addr v0, v2

    and-int/lit16 v0, v0, 0xff

    aget-byte v0, v1, v0

    iput-byte v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    .line 161
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    and-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    and-int/lit8 v3, v3, 0x1f

    aget-byte v2, v2, v3

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 162
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v1, v1, 0x1

    and-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v3, v3, 0x1

    and-int/lit8 v3, v3, 0x1f

    aget-byte v2, v2, v3

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 163
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v1, v1, 0x2

    and-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v3, v3, 0x2

    and-int/lit8 v3, v3, 0x1f

    aget-byte v2, v2, v3

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 164
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x1f

    aget-byte v2, v2, v3

    iget-byte v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->k:B

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 165
    iget-byte v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    add-int/lit8 v0, v0, 0x4

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    iput-byte v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    .line 167
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    and-int/lit16 v1, v1, 0xff

    aget-byte v0, v0, v1

    .line 168
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    and-int/lit16 v2, v2, 0xff

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v4, v4, 0xff

    aget-byte v3, v3, v4

    aput-byte v3, v1, v2

    .line 169
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v2, v2, 0xff

    aput-byte v0, v1, v2

    .line 170
    iget-byte v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    add-int/lit8 v0, v0, 0x1

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    iput-byte v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    .line 171
    return-void
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 87
    instance-of v0, p1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "VMPC-MAC Init parameters must include an IV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_0
    check-cast p1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 94
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 96
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    instance-of v1, v1, Lorg/spongycastle/crypto/params/KeyParameter;

    if-nez v1, :cond_1

    .line 98
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "VMPC-MAC Init parameters must include a key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->f:[B

    .line 104
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->f:[B

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->f:[B

    array-length v1, v1

    if-lez v1, :cond_2

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->f:[B

    array-length v1, v1

    const/16 v2, 0x300

    if-le v1, v2, :cond_3

    .line 106
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "VMPC-MAC requires 1 to 768 bytes of IV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_3
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->g:[B

    .line 112
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/VMPCMac;->b()V

    .line 114
    return-void
.end method

.method public final a([BII)V
    .locals 2

    .prologue
    .line 176
    add-int v0, p2, p3

    array-length v1, p1

    if-le v0, v1, :cond_0

    .line 178
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    .line 183
    aget-byte v1, p1, v0

    invoke-virtual {p0, v1}, Lorg/spongycastle/crypto/macs/VMPCMac;->a(B)V

    .line 181
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 185
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 11

    .prologue
    const/16 v10, 0x300

    const/16 v6, 0x100

    const/16 v9, 0x20

    const/4 v1, 0x0

    .line 143
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->g:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->f:[B

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    new-array v0, v6, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    move v0, v1

    :goto_0
    if-ge v0, v6, :cond_0

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    int-to-byte v5, v0

    aput-byte v5, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_1
    if-ge v0, v10, :cond_1

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v6, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v7, v0, 0xff

    aget-byte v6, v6, v7

    add-int/2addr v5, v6

    array-length v6, v2

    rem-int v6, v0, v6

    aget-byte v6, v2, v6

    add-int/2addr v5, v6

    and-int/lit16 v5, v5, 0xff

    aget-byte v4, v4, v5

    iput-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v5, v0, 0xff

    aget-byte v4, v4, v5

    iget-object v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v6, v0, 0xff

    iget-object v7, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v8, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v8, v8, 0xff

    aget-byte v7, v7, v8

    aput-byte v7, v5, v6

    iget-object v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v6, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v6, v6, 0xff

    aput-byte v4, v5, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_2
    if-ge v0, v10, :cond_2

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v6, v0, 0xff

    aget-byte v5, v5, v6

    add-int/2addr v4, v5

    array-length v5, v3

    rem-int v5, v0, v5

    aget-byte v5, v3, v5

    add-int/2addr v4, v5

    and-int/lit16 v4, v4, 0xff

    aget-byte v2, v2, v4

    iput-byte v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v4, v0, 0xff

    aget-byte v2, v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    and-int/lit16 v5, v0, 0xff

    iget-object v6, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v7, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v7, v7, 0xff

    aget-byte v6, v6, v7

    aput-byte v6, v4, v5

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->c:[B

    iget-byte v5, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->d:B

    and-int/lit16 v5, v5, 0xff

    aput-byte v2, v4, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    .line 144
    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->b:B

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->k:B

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->j:B

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->i:B

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->h:B

    iput-byte v1, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->a:B

    .line 145
    new-array v0, v9, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    move v0, v1

    .line 146
    :goto_3
    if-ge v0, v9, :cond_3

    .line 148
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/VMPCMac;->e:[B

    aput-byte v1, v2, v0

    .line 146
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 150
    :cond_3
    return-void
.end method
