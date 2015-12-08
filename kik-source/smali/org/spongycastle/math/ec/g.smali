.class final Lorg/spongycastle/math/ec/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ec/a;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/d;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 11

    .prologue
    .line 94
    if-eqz p3, :cond_0

    instance-of v0, p3, Lorg/spongycastle/math/ec/h;

    if-eqz v0, :cond_0

    .line 96
    check-cast p3, Lorg/spongycastle/math/ec/h;

    .line 105
    :goto_0
    invoke-virtual {p2}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 115
    const/16 v1, 0xd

    if-ge v0, v1, :cond_1

    .line 117
    const/4 v1, 0x2

    .line 118
    const/4 v0, 0x1

    .line 167
    :goto_1
    const/4 v4, 0x1

    .line 169
    invoke-virtual {p3}, Lorg/spongycastle/math/ec/h;->a()[Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v3

    .line 170
    invoke-virtual {p3}, Lorg/spongycastle/math/ec/h;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    .line 173
    if-nez v3, :cond_7

    .line 177
    const/4 v3, 0x1

    new-array v3, v3, [Lorg/spongycastle/math/ec/ECPoint;

    const/4 v5, 0x0

    aput-object p1, v3, v5

    .line 185
    :goto_2
    if-nez v2, :cond_10

    .line 188
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint;->h()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    move-object v5, v2

    .line 191
    :goto_3
    if-ge v4, v0, :cond_f

    .line 196
    new-array v2, v0, [Lorg/spongycastle/math/ec/ECPoint;

    .line 197
    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v3, v6, v2, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v3, v4

    .line 199
    :goto_4
    if-ge v3, v0, :cond_8

    .line 204
    add-int/lit8 v4, v3, -0x1

    aget-object v4, v2, v4

    invoke-virtual {v5, v4}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v4

    aput-object v4, v2, v3

    .line 199
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 101
    :cond_0
    new-instance p3, Lorg/spongycastle/math/ec/h;

    invoke-direct {p3}, Lorg/spongycastle/math/ec/h;-><init>()V

    goto :goto_0

    .line 122
    :cond_1
    const/16 v1, 0x29

    if-ge v0, v1, :cond_2

    .line 124
    const/4 v1, 0x3

    .line 125
    const/4 v0, 0x2

    goto :goto_1

    .line 129
    :cond_2
    const/16 v1, 0x79

    if-ge v0, v1, :cond_3

    .line 131
    const/4 v1, 0x4

    .line 132
    const/4 v0, 0x4

    goto :goto_1

    .line 136
    :cond_3
    const/16 v1, 0x151

    if-ge v0, v1, :cond_4

    .line 138
    const/4 v1, 0x5

    .line 139
    const/16 v0, 0x8

    goto :goto_1

    .line 143
    :cond_4
    const/16 v1, 0x381

    if-ge v0, v1, :cond_5

    .line 145
    const/4 v1, 0x6

    .line 146
    const/16 v0, 0x10

    goto :goto_1

    .line 150
    :cond_5
    const/16 v1, 0x901

    if-ge v0, v1, :cond_6

    .line 152
    const/4 v1, 0x7

    .line 153
    const/16 v0, 0x20

    goto :goto_1

    .line 157
    :cond_6
    const/16 v1, 0x8

    .line 158
    const/16 v0, 0x7f

    goto :goto_1

    .line 182
    :cond_7
    array-length v4, v3

    goto :goto_2

    :cond_8
    move-object v0, v2

    .line 209
    :goto_5
    invoke-virtual {p2}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    new-array v4, v2, [B

    const/4 v2, 0x1

    shl-int/2addr v2, v1

    int-to-short v6, v2

    int-to-long v2, v6

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v2, 0x0

    :goto_6
    invoke-virtual {p2}, Ljava/math/BigInteger;->signum()I

    move-result v8

    if-lez v8, :cond_b

    const/4 v8, 0x0

    invoke-virtual {p2, v8}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {p2, v7}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    add-int/lit8 v8, v1, -0x1

    invoke-virtual {v2, v8}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    sub-int/2addr v2, v6

    int-to-byte v2, v2

    aput-byte v2, v4, v3

    :goto_7
    aget-byte v2, v4, v3

    int-to-long v8, v2

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p2

    move v2, v3

    :goto_8
    const/4 v8, 0x1

    invoke-virtual {p2, v8}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object p2

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_9
    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v4, v3

    goto :goto_7

    :cond_a
    const/4 v8, 0x0

    aput-byte v8, v4, v3

    goto :goto_8

    :cond_b
    add-int/lit8 v1, v2, 0x1

    new-array v3, v1, [B

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-static {v4, v2, v3, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 210
    array-length v1, v3

    .line 213
    iget-object v2, p1, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    .line 214
    add-int/lit8 v1, v1, -0x1

    move v10, v1

    move-object v1, v2

    move v2, v10

    :goto_9
    if-ltz v2, :cond_e

    .line 216
    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECPoint;->h()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    .line 218
    aget-byte v4, v3, v2

    if-eqz v4, :cond_c

    .line 220
    aget-byte v4, v3, v2

    if-lez v4, :cond_d

    .line 222
    aget-byte v4, v3, v2

    add-int/lit8 v4, v4, -0x1

    div-int/lit8 v4, v4, 0x2

    aget-object v4, v0, v4

    invoke-virtual {v1, v4}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    .line 214
    :cond_c
    :goto_a
    add-int/lit8 v2, v2, -0x1

    goto :goto_9

    .line 227
    :cond_d
    aget-byte v4, v3, v2

    neg-int v4, v4

    add-int/lit8 v4, v4, -0x1

    div-int/lit8 v4, v4, 0x2

    aget-object v4, v0, v4

    invoke-virtual {v1, v4}, Lorg/spongycastle/math/ec/ECPoint;->b(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    goto :goto_a

    .line 234
    :cond_e
    invoke-virtual {p3, v0}, Lorg/spongycastle/math/ec/h;->a([Lorg/spongycastle/math/ec/ECPoint;)V

    .line 235
    invoke-virtual {p3, v5}, Lorg/spongycastle/math/ec/h;->a(Lorg/spongycastle/math/ec/ECPoint;)V

    .line 236
    invoke-virtual {p1, p3}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/d;)V

    .line 237
    return-object v1

    :cond_f
    move-object v0, v3

    goto/16 :goto_5

    :cond_10
    move-object v5, v2

    goto/16 :goto_3
.end method
