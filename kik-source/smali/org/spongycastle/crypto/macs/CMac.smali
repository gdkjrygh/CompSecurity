.class public Lorg/spongycastle/crypto/macs/CMac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Mac;


# instance fields
.field private a:[B

.field private b:[B

.field private c:[B

.field private d:I

.field private e:Lorg/spongycastle/crypto/BlockCipher;

.field private f:I

.field private g:[B

.field private h:[B

.field private i:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 54
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/macs/CMac;-><init>(Lorg/spongycastle/crypto/BlockCipher;I)V

    .line 55
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/crypto/BlockCipher;I)V
    .locals 3

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    rem-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_0

    .line 73
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MAC size must be multiple of 8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_0
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    if-le p2, v0, :cond_1

    .line 78
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MAC size must be less or equal to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_1
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Block size must be either 64 or 128 bits"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_2
    new-instance v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    .line 90
    div-int/lit8 v0, p2, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/macs/CMac;->f:I

    .line 92
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->b:[B

    .line 94
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    .line 96
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->a:[B

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    .line 99
    return-void
.end method

.method private static a([B)[B
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 108
    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v1, v1, 0x7

    .line 109
    array-length v2, p0

    new-array v2, v2, [B

    .line 110
    :goto_0
    array-length v3, p0

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_0

    .line 112
    aget-byte v3, p0, v0

    shl-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v0, 0x1

    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    shr-int/lit8 v4, v4, 0x7

    add-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 110
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 114
    :cond_0
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    array-length v3, p0

    add-int/lit8 v3, v3, -0x1

    aget-byte v3, p0, v3

    shl-int/lit8 v3, v3, 0x1

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 115
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 117
    array-length v0, p0

    add-int/lit8 v1, v0, -0x1

    aget-byte v3, v2, v1

    array-length v0, p0

    const/16 v4, 0x10

    if-ne v0, v4, :cond_2

    const/16 v0, -0x79

    :goto_1
    xor-int/2addr v0, v3

    int-to-byte v0, v0

    aput-byte v0, v2, v1

    .line 119
    :cond_1
    return-object v2

    .line 117
    :cond_2
    const/16 v0, 0x1b

    goto :goto_1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 139
    iget v0, p0, Lorg/spongycastle/crypto/macs/CMac;->f:I

    return v0
.end method

.method public final a([BI)I
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 190
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    .line 193
    iget v1, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    if-ne v1, v0, :cond_0

    .line 195
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->h:[B

    :goto_0
    move v1, v2

    .line 203
    :goto_1
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/CMac;->b:[B

    array-length v3, v3

    if-ge v1, v3, :cond_1

    .line 205
    iget-object v3, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    aget-byte v4, v3, v1

    aget-byte v5, v0, v1

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v3, v1

    .line 203
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 199
    :cond_0
    new-instance v0, Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;

    invoke-direct {v0}, Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    iget v3, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    invoke-virtual {v0, v1, v3}, Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;->a([BI)I

    .line 200
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->i:[B

    goto :goto_0

    .line 208
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v0, v1, v2, v3, v2}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 210
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->b:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/CMac;->f:I

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 212
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/CMac;->b()V

    .line 214
    iget v0, p0, Lorg/spongycastle/crypto/macs/CMac;->f:I

    return v0
.end method

.method public final a(B)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 144
    iget v0, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 146
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 147
    iput v3, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    .line 150
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    aput-byte p1, v0, v1

    .line 151
    return-void
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 124
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/CMac;->b()V

    .line 126
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v4, p1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 129
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->a:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->g:[B

    .line 130
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/CMac;->a:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/CMac;->g:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 131
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->g:[B

    invoke-static {v0}, Lorg/spongycastle/crypto/macs/CMac;->a([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->h:[B

    .line 132
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->h:[B

    invoke-static {v0}, Lorg/spongycastle/crypto/macs/CMac;->a([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->i:[B

    .line 134
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v4, p1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 135
    return-void
.end method

.method public final a([BII)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 155
    if-gez p3, :cond_0

    .line 157
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 161
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    .line 162
    iget v1, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    sub-int v1, v0, v1

    .line 164
    if-le p3, v1, :cond_1

    .line 166
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    iget v3, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    invoke-static {p1, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v2, v3, v5, v4, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 170
    iput v5, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    .line 171
    sub-int/2addr p3, v1

    .line 172
    add-int/2addr p2, v1

    .line 174
    :goto_0
    if-le p3, v0, :cond_1

    .line 176
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v1, p1, p2, v2, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 178
    sub-int/2addr p3, v0

    .line 179
    add-int/2addr p2, v0

    goto :goto_0

    .line 183
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    iget v1, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 185
    iget v0, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    add-int/2addr v0, p3

    iput v0, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    .line 186
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 225
    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 227
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/CMac;->c:[B

    aput-byte v1, v2, v0

    .line 225
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 230
    :cond_0
    iput v1, p0, Lorg/spongycastle/crypto/macs/CMac;->d:I

    .line 235
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/CMac;->e:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 236
    return-void
.end method
