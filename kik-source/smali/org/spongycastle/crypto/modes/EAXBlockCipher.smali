.class public Lorg/spongycastle/crypto/modes/EAXBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/modes/AEADBlockCipher;


# instance fields
.field private a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

.field private b:Z

.field private c:I

.field private d:Lorg/spongycastle/crypto/Mac;

.field private e:[B

.field private f:[B

.field private g:[B

.field private h:I

.field private i:[B

.field private j:I


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    .line 59
    new-instance v0, Lorg/spongycastle/crypto/macs/CMac;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/macs/CMac;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    .line 60
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->g:[B

    .line 61
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    .line 62
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->f:[B

    .line 63
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->e:[B

    .line 64
    new-instance v0, Lorg/spongycastle/crypto/modes/SICBlockCipher;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/modes/SICBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    .line 65
    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 134
    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v1, v1, [B

    .line 135
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v2, v1, v0}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    .line 137
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->g:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 139
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->g:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->e:[B

    aget-byte v3, v3, v0

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->f:[B

    aget-byte v4, v4, v0

    xor-int/2addr v3, v4

    aget-byte v4, v1, v0

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 137
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 141
    :cond_0
    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 151
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->c()V

    .line 152
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->b()V

    .line 154
    iput v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    .line 155
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-static {v0, v3}, Lorg/spongycastle/util/Arrays;->a([BB)V

    .line 157
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v0, v0, [B

    .line 163
    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x2

    aput-byte v2, v0, v1

    .line 164
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget v2, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v1, v0, v3, v2}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 165
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 247
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    div-int/2addr v0, v1

    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public final a([BI)I
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 189
    iget v2, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    .line 190
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 192
    iput v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    .line 194
    iget-boolean v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->b:Z

    if-eqz v3, :cond_0

    .line 196
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v3, v4, v1, v0, v1}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a([BI[BI)I

    .line 197
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    iget v6, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-virtual {v3, v4, v5, v0, v6}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a([BI[BI)I

    .line 199
    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 201
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v3, v0, v1, v2}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 203
    invoke-direct {p0}, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->b()V

    .line 205
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->g:[B

    add-int v3, p2, v2

    iget v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    invoke-static {v0, v1, p1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 207
    invoke-direct {p0}, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c()V

    .line 209
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    add-int/2addr v0, v2

    .line 232
    :goto_0
    return v0

    .line 213
    :cond_0
    iget v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    if-le v2, v3, :cond_1

    .line 215
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int v5, v2, v5

    invoke-interface {v3, v4, v1, v5}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 217
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v3, v4, v1, v0, v1}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a([BI[BI)I

    .line 218
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    iget v6, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-virtual {v3, v4, v5, v0, v6}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a([BI[BI)I

    .line 220
    iget v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int v3, v2, v3

    invoke-static {v0, v1, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 223
    :cond_1
    invoke-direct {p0}, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->b()V

    .line 225
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int v4, v2, v0

    move v0, v1

    :goto_1
    iget v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    if-ge v0, v5, :cond_3

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->g:[B

    aget-byte v5, v5, v0

    add-int v6, v4, v0

    aget-byte v6, v3, v6

    if-eq v5, v6, :cond_2

    :goto_2
    if-nez v1, :cond_4

    .line 227
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "mac check in EAX failed"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 225
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    goto :goto_2

    .line 230
    :cond_4
    invoke-direct {p0}, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c()V

    .line 232
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int v0, v2, v0

    goto :goto_0
.end method

.method public final a([BII[BI)I
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 176
    move v2, v1

    move v3, v1

    .line 178
    :goto_0
    if-eq v2, p3, :cond_2

    .line 180
    add-int v0, p2, v2

    aget-byte v0, p1, v0

    add-int v4, p5, v3

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v6, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    aput-byte v0, v5, v6

    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    array-length v5, v5

    if-ne v0, v5, :cond_1

    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v0, v5, v1, p4, v4}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a([BI[BI)I

    move-result v0

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget v6, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v5, p4, v4, v6}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    :goto_1
    iget v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    iput v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    iget-object v6, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v7, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-static {v4, v5, v6, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    add-int/2addr v3, v0

    .line 178
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 180
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v6, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v0, v5, v1, v6}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v0, v5, v1, p4, v4}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a([BI[BI)I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_2

    .line 183
    :cond_2
    return v3
.end method

.method public final a()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->d()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 85
    iput-boolean p1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->b:Z

    .line 90
    instance-of v0, p2, Lorg/spongycastle/crypto/params/AEADParameters;

    if-eqz v0, :cond_0

    .line 92
    check-cast p2, Lorg/spongycastle/crypto/params/AEADParameters;

    .line 94
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->d()[B

    move-result-object v2

    .line 95
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->c()[B

    move-result-object v1

    .line 96
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->b()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    .line 97
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/AEADParameters;->a()Lorg/spongycastle/crypto/params/KeyParameter;

    move-result-object v0

    .line 113
    :goto_0
    iget v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v3, v3, [B

    .line 115
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v4, v0}, Lorg/spongycastle/crypto/Mac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    .line 116
    iget v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v4, v4, -0x1

    aput-byte v7, v3, v4

    .line 117
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget v5, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v4, v3, v6, v5}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 118
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    array-length v5, v1

    invoke-interface {v4, v1, v6, v5}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 119
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->f:[B

    invoke-interface {v1, v4, v6}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    .line 121
    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v1, v1, -0x1

    aput-byte v6, v3, v1

    .line 122
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget v4, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v1, v3, v6, v4}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 123
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    array-length v4, v2

    invoke-interface {v1, v2, v6, v4}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 124
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget-object v2, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->e:[B

    invoke-interface {v1, v2, v6}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    .line 126
    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x2

    aput-byte v2, v3, v1

    .line 127
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    iget v2, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v1, v3, v6, v2}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    .line 129
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->a:Lorg/spongycastle/crypto/modes/SICBlockCipher;

    new-instance v2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->e:[B

    invoke-direct {v2, v0, v3}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    invoke-virtual {v1, v7, v2}, Lorg/spongycastle/crypto/modes/SICBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 130
    return-void

    .line 99
    :cond_0
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_1

    .line 101
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 103
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v2

    .line 104
    new-array v1, v6, [B

    .line 105
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->d:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    .line 106
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    goto :goto_0

    .line 110
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid parameters passed to EAX"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 252
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->b:Z

    if-eqz v0, :cond_0

    .line 254
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    add-int/2addr v0, v1

    .line 258
    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/spongycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method
