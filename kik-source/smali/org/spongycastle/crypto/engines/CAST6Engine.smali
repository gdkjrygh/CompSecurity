.class public final Lorg/spongycastle/crypto/engines/CAST6Engine;
.super Lorg/spongycastle/crypto/engines/CAST5Engine;
.source "SourceFile"


# instance fields
.field protected k:[I

.field protected l:[I

.field protected m:[I

.field protected n:[I

.field private o:[I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/16 v2, 0xc0

    const/16 v1, 0x30

    .line 40
    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/CAST5Engine;-><init>()V

    .line 28
    new-array v0, v1, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    .line 29
    new-array v0, v1, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    .line 34
    new-array v0, v2, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    .line 35
    new-array v0, v2, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    .line 37
    const/16 v0, 0x8

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    .line 41
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    const-string v0, "CAST6"

    return-object v0
.end method

.method protected final a([B)V
    .locals 14

    .prologue
    const/4 v13, 0x4

    const/4 v12, 0x3

    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v1, 0x0

    .line 69
    const v2, 0x5a827999

    .line 70
    const/16 v0, 0x13

    move v4, v1

    .line 72
    :goto_0
    const/16 v3, 0x18

    if-ge v4, v3, :cond_1

    move v3, v2

    move v2, v0

    move v0, v1

    .line 83
    :goto_1
    const/16 v5, 0x8

    if-ge v0, v5, :cond_0

    .line 85
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    mul-int/lit8 v6, v4, 0x8

    add-int/2addr v6, v0

    aput v3, v5, v6

    .line 86
    const v5, 0x6ed9eba1

    add-int/2addr v3, v5

    .line 88
    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    mul-int/lit8 v6, v4, 0x8

    add-int/2addr v6, v0

    aput v2, v5, v6

    .line 89
    add-int/lit8 v2, v2, 0x11

    and-int/lit8 v2, v2, 0x1f

    .line 83
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 81
    :cond_0
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move v0, v2

    move v2, v3

    goto :goto_0

    .line 93
    :cond_1
    const/16 v0, 0x40

    new-array v2, v0, [B

    .line 94
    array-length v0, p1

    .line 95
    invoke-static {p1, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 98
    :goto_2
    const/16 v3, 0x8

    if-ge v0, v3, :cond_2

    .line 100
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    mul-int/lit8 v4, v0, 0x4

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v4

    aput v4, v3, v0

    .line 98
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    .line 104
    :goto_3
    const/16 v2, 0xc

    if-ge v0, v2, :cond_3

    .line 107
    mul-int/lit8 v2, v0, 0x2

    mul-int/lit8 v2, v2, 0x8

    .line 108
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v4, 0x6

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v7, 0x7

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    aget v7, v7, v2

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    aget v8, v8, v2

    invoke-static {v6, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    .line 109
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v4, 0x5

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v7, 0x6

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v8, v2, 0x1

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v9, v2, 0x1

    aget v8, v8, v9

    invoke-static {v6, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    .line 110
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v13

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v6, 0x5

    aget v5, v5, v6

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x2

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x2

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v13

    .line 111
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v12

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v13

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x3

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x3

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v12

    .line 112
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v11

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v12

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x4

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x4

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v11

    .line 113
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v10

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v11

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x5

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x5

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v10

    .line 114
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v1

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v10

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x6

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x6

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v1

    .line 115
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v4, 0x7

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v6, v6, v1

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v8, v2, 0x7

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v2, v2, 0x7

    aget v2, v8, v2

    invoke-static {v6, v7, v2}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v2

    xor-int/2addr v2, v5

    aput v2, v3, v4

    .line 118
    mul-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x1

    mul-int/lit8 v2, v2, 0x8

    .line 119
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v4, 0x6

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v7, 0x7

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    aget v7, v7, v2

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    aget v8, v8, v2

    invoke-static {v6, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    .line 120
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v4, 0x5

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v7, 0x6

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v8, v2, 0x1

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v9, v2, 0x1

    aget v8, v8, v9

    invoke-static {v6, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    .line 121
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v13

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v6, 0x5

    aget v5, v5, v6

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x2

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x2

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v13

    .line 122
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v12

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v13

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x3

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x3

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v12

    .line 123
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v11

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v12

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x4

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x4

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v11

    .line 124
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v10

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v11

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x5

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x5

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v10

    .line 125
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v3, v1

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v5, v5, v10

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v7, v2, 0x6

    aget v6, v6, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v8, v2, 0x6

    aget v7, v7, v8

    invoke-static {v5, v6, v7}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v1

    .line 126
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v4, 0x7

    aget v5, v3, v4

    iget-object v6, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v6, v6, v1

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->n:[I

    add-int/lit8 v8, v2, 0x7

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->m:[I

    add-int/lit8 v2, v2, 0x7

    aget v2, v8, v2

    invoke-static {v6, v7, v2}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v2

    xor-int/2addr v2, v5

    aput v2, v3, v4

    .line 129
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    mul-int/lit8 v3, v0, 0x4

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v4, v1

    and-int/lit8 v4, v4, 0x1f

    aput v4, v2, v3

    .line 130
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v4, v11

    and-int/lit8 v4, v4, 0x1f

    aput v4, v2, v3

    .line 131
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x2

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v4, v13

    and-int/lit8 v4, v4, 0x1f

    aput v4, v2, v3

    .line 132
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x3

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v5, 0x6

    aget v4, v4, v5

    and-int/lit8 v4, v4, 0x1f

    aput v4, v2, v3

    .line 136
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    mul-int/lit8 v3, v0, 0x4

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v5, 0x7

    aget v4, v4, v5

    aput v4, v2, v3

    .line 137
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    const/4 v5, 0x5

    aget v4, v4, v5

    aput v4, v2, v3

    .line 138
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x2

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v4, v12

    aput v4, v2, v3

    .line 139
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    mul-int/lit8 v3, v0, 0x4

    add-int/lit8 v3, v3, 0x3

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->o:[I

    aget v4, v4, v10

    aput v4, v2, v3

    .line 104
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_3

    .line 142
    :cond_3
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 54
    const/16 v0, 0x10

    return v0
.end method

.method protected final b([BI[BI)I
    .locals 10

    .prologue
    .line 160
    const/4 v0, 0x4

    new-array v5, v0, [I

    .line 165
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v4

    .line 166
    add-int/lit8 v0, p2, 0x4

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v3

    .line 167
    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v2

    .line 168
    add-int/lit8 v0, p2, 0xc

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v1

    .line 170
    const/4 v0, 0x0

    :goto_0
    const/4 v6, 0x6

    if-ge v0, v6, :cond_0

    mul-int/lit8 v6, v0, 0x4

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    aget v7, v7, v6

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    aget v8, v8, v6

    invoke-static {v1, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v7

    xor-int/2addr v2, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x1

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x1

    aget v8, v8, v9

    invoke-static {v2, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v7

    xor-int/2addr v3, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x2

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x2

    aget v8, v8, v9

    invoke-static {v3, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v7

    xor-int/2addr v4, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x3

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v6, v6, 0x3

    aget v6, v8, v6

    invoke-static {v4, v7, v6}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v6

    xor-int/2addr v1, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    :goto_1
    const/16 v6, 0xc

    if-ge v0, v6, :cond_1

    mul-int/lit8 v6, v0, 0x4

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x3

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x3

    aget v8, v8, v9

    invoke-static {v4, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v7

    xor-int/2addr v1, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x2

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x2

    aget v8, v8, v9

    invoke-static {v3, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v7

    xor-int/2addr v4, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x1

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x1

    aget v8, v8, v9

    invoke-static {v2, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v7

    xor-int/2addr v3, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    aget v7, v7, v6

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    aget v6, v8, v6

    invoke-static {v1, v7, v6}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v6

    xor-int/2addr v2, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    aput v4, v5, v0

    const/4 v0, 0x1

    aput v3, v5, v0

    const/4 v0, 0x2

    aput v2, v5, v0

    const/4 v0, 0x3

    aput v1, v5, v0

    .line 173
    const/4 v0, 0x0

    aget v0, v5, v0

    invoke-static {v0, p3, p4}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 174
    const/4 v0, 0x1

    aget v0, v5, v0

    add-int/lit8 v1, p4, 0x4

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 175
    const/4 v0, 0x2

    aget v0, v5, v0

    add-int/lit8 v1, p4, 0x8

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 176
    const/4 v0, 0x3

    aget v0, v5, v0

    add-int/lit8 v1, p4, 0xc

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 178
    const/16 v0, 0x10

    return v0
.end method

.method protected final c([BI[BI)I
    .locals 10

    .prologue
    .line 196
    const/4 v0, 0x4

    new-array v5, v0, [I

    .line 200
    invoke-static {p1, p2}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v4

    .line 201
    add-int/lit8 v0, p2, 0x4

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v3

    .line 202
    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v2

    .line 203
    add-int/lit8 v0, p2, 0xc

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a([BI)I

    move-result v1

    .line 205
    const/4 v0, 0x0

    :goto_0
    const/4 v6, 0x6

    if-ge v0, v6, :cond_0

    rsub-int/lit8 v6, v0, 0xb

    mul-int/lit8 v6, v6, 0x4

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    aget v7, v7, v6

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    aget v8, v8, v6

    invoke-static {v1, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v7

    xor-int/2addr v2, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x1

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x1

    aget v8, v8, v9

    invoke-static {v2, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v7

    xor-int/2addr v3, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x2

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x2

    aget v8, v8, v9

    invoke-static {v3, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v7

    xor-int/2addr v4, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x3

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v6, v6, 0x3

    aget v6, v8, v6

    invoke-static {v4, v7, v6}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v6

    xor-int/2addr v1, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    :goto_1
    const/16 v6, 0xc

    if-ge v0, v6, :cond_1

    rsub-int/lit8 v6, v0, 0xb

    mul-int/lit8 v6, v6, 0x4

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x3

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x3

    aget v8, v8, v9

    invoke-static {v4, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v7

    xor-int/2addr v1, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x2

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x2

    aget v8, v8, v9

    invoke-static {v3, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->c(III)I

    move-result v7

    xor-int/2addr v4, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    add-int/lit8 v8, v6, 0x1

    aget v7, v7, v8

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    add-int/lit8 v9, v6, 0x1

    aget v8, v8, v9

    invoke-static {v2, v7, v8}, Lorg/spongycastle/crypto/engines/CAST6Engine;->b(III)I

    move-result v7

    xor-int/2addr v3, v7

    iget-object v7, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->l:[I

    aget v7, v7, v6

    iget-object v8, p0, Lorg/spongycastle/crypto/engines/CAST6Engine;->k:[I

    aget v6, v8, v6

    invoke-static {v1, v7, v6}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(III)I

    move-result v6

    xor-int/2addr v2, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    aput v4, v5, v0

    const/4 v0, 0x1

    aput v3, v5, v0

    const/4 v0, 0x2

    aput v2, v5, v0

    const/4 v0, 0x3

    aput v1, v5, v0

    .line 208
    const/4 v0, 0x0

    aget v0, v5, v0

    invoke-static {v0, p3, p4}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 209
    const/4 v0, 0x1

    aget v0, v5, v0

    add-int/lit8 v1, p4, 0x4

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 210
    const/4 v0, 0x2

    aget v0, v5, v0

    add-int/lit8 v1, p4, 0x8

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 211
    const/4 v0, 0x3

    aget v0, v5, v0

    add-int/lit8 v1, p4, 0xc

    invoke-static {v0, p3, v1}, Lorg/spongycastle/crypto/engines/CAST6Engine;->a(I[BI)V

    .line 213
    const/16 v0, 0x10

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 50
    return-void
.end method
