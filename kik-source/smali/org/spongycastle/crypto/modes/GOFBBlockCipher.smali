.class public Lorg/spongycastle/crypto/modes/GOFBBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field a:Z

.field b:I

.field c:I

.field private d:[B

.field private e:[B

.field private f:[B

.field private final g:I

.field private final h:Lorg/spongycastle/crypto/BlockCipher;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a:Z

    .line 37
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/spongycastle/crypto/BlockCipher;

    .line 38
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    .line 40
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "GCTR only for 64 bit block ciphers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    .line 46
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    .line 47
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->f:[B

    .line 48
    return-void
.end method

.method private static a([BI)I
    .locals 3

    .prologue
    .line 219
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

.method private static a(I[BI)V
    .locals 2

    .prologue
    .line 229
    add-int/lit8 v0, p2, 0x3

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 230
    add-int/lit8 v0, p2, 0x2

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 231
    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 232
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 233
    return-void
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 6

    .prologue
    const/4 v4, 0x4

    const/4 v1, 0x0

    .line 161
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_0

    .line 163
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    add-int/2addr v0, p4

    array-length v2, p3

    if-le v0, v2, :cond_1

    .line 168
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_1
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a:Z

    if-eqz v0, :cond_2

    .line 173
    iput-boolean v1, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a:Z

    .line 174
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 175
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a([BI)I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->b:I

    .line 176
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-static {v0, v4}, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a([BI)I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->c:I

    .line 178
    :cond_2
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->b:I

    const v2, 0x1010101

    add-int/2addr v0, v2

    iput v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->b:I

    .line 179
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->c:I

    const v2, 0x1010104

    add-int/2addr v0, v2

    iput v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->c:I

    .line 180
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->b:I

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    invoke-static {v0, v2, v1}, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a(I[BI)V

    .line 181
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->c:I

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    invoke-static {v0, v2, v4}, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a(I[BI)V

    .line 183
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move v0, v1

    .line 189
    :goto_0
    iget v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    if-ge v0, v2, :cond_3

    .line 191
    add-int v2, p4, v0

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->f:[B

    aget-byte v3, v3, v0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    .line 189
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 197
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    array-length v4, v4

    iget v5, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    sub-int/2addr v4, v5

    invoke-static {v0, v2, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 198
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->f:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    array-length v3, v3

    iget v4, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    sub-int/2addr v3, v4

    iget v4, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    invoke-static {v0, v1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 200
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/GCTR"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 76
    iput-boolean v5, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->a:Z

    .line 77
    iput v1, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->b:I

    .line 78
    iput v1, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->c:I

    .line 80
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_3

    .line 82
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 83
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v2

    .line 85
    array-length v0, v2

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    if-ge v0, v3, :cond_0

    .line 88
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    array-length v4, v2

    sub-int/2addr v3, v4

    array-length v4, v2

    invoke-static {v2, v1, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 89
    :goto_0
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    array-length v4, v2

    sub-int/2addr v3, v4

    if-ge v0, v3, :cond_1

    .line 91
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    aput-byte v1, v3, v0

    .line 89
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 96
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 99
    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->c()V

    .line 102
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 104
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/spongycastle/crypto/BlockCipher;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 117
    :cond_2
    :goto_1
    return-void

    .line 109
    :cond_3
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->c()V

    .line 112
    if-eqz p2, :cond_2

    .line 114
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v5, p2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_1
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 138
    iget v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->g:I

    return v0
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 209
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 211
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 212
    return-void
.end method
