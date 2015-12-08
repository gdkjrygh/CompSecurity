.class public final Lorg/spongycastle/util/Arrays;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method

.method public static a([B)I
    .locals 3

    .prologue
    .line 274
    if-nez p0, :cond_1

    .line 276
    const/4 v0, 0x0

    .line 288
    :cond_0
    return v0

    .line 279
    :cond_1
    array-length v1, p0

    .line 280
    add-int/lit8 v0, v1, 0x1

    .line 282
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 284
    mul-int/lit16 v0, v0, 0x101

    .line 285
    aget-byte v2, p0, v1

    xor-int/2addr v0, v2

    goto :goto_0
.end method

.method public static a([C)I
    .locals 3

    .prologue
    .line 293
    if-nez p0, :cond_1

    .line 295
    const/4 v0, 0x0

    .line 307
    :cond_0
    return v0

    .line 298
    :cond_1
    array-length v1, p0

    .line 299
    add-int/lit8 v0, v1, 0x1

    .line 301
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 303
    mul-int/lit16 v0, v0, 0x101

    .line 304
    aget-char v2, p0, v1

    xor-int/2addr v0, v2

    goto :goto_0
.end method

.method public static a([I)I
    .locals 3

    .prologue
    .line 312
    if-nez p0, :cond_1

    .line 314
    const/4 v0, 0x0

    .line 326
    :cond_0
    return v0

    .line 317
    :cond_1
    array-length v1, p0

    .line 318
    add-int/lit8 v0, v1, 0x1

    .line 320
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 322
    mul-int/lit16 v0, v0, 0x101

    .line 323
    aget v2, p0, v1

    xor-int/2addr v0, v2

    goto :goto_0
.end method

.method public static a([Ljava/math/BigInteger;)I
    .locals 3

    .prologue
    .line 331
    if-nez p0, :cond_1

    .line 333
    const/4 v0, 0x0

    .line 345
    :cond_0
    return v0

    .line 336
    :cond_1
    array-length v1, p0

    .line 337
    add-int/lit8 v0, v1, 0x1

    .line 339
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 341
    mul-int/lit16 v0, v0, 0x101

    .line 342
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/math/BigInteger;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    goto :goto_0
.end method

.method public static a([BB)V
    .locals 2

    .prologue
    .line 236
    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 238
    aput-byte p1, p0, v0

    .line 236
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 240
    :cond_0
    return-void
.end method

.method public static a([J)V
    .locals 4

    .prologue
    .line 246
    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 248
    const-wide/16 v2, 0x0

    aput-wide v2, p0, v0

    .line 246
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 250
    :cond_0
    return-void
.end method

.method public static a([S)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 256
    move v0, v1

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_0

    .line 258
    aput-short v1, p0, v0

    .line 256
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 260
    :cond_0
    return-void
.end method

.method public static a([B[B)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 79
    if-ne p0, p1, :cond_1

    move v1, v2

    .line 102
    :cond_0
    :goto_0
    return v1

    .line 84
    :cond_1
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 89
    array-length v0, p0

    array-length v3, p1

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 94
    :goto_1
    array-length v3, p0

    if-eq v0, v3, :cond_2

    .line 96
    aget-byte v3, p0, v0

    aget-byte v4, p1, v0

    if-ne v3, v4, :cond_0

    .line 94
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    .line 102
    goto :goto_0
.end method

.method public static a([C[C)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 49
    if-ne p0, p1, :cond_1

    move v1, v2

    .line 72
    :cond_0
    :goto_0
    return v1

    .line 54
    :cond_1
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 59
    array-length v0, p0

    array-length v3, p1

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 64
    :goto_1
    array-length v3, p0

    if-eq v0, v3, :cond_2

    .line 66
    aget-char v3, p0, v0

    aget-char v4, p1, v0

    if-ne v3, v4, :cond_0

    .line 64
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    .line 72
    goto :goto_0
.end method

.method public static a([I[I)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 146
    if-ne p0, p1, :cond_1

    move v1, v2

    .line 169
    :cond_0
    :goto_0
    return v1

    .line 151
    :cond_1
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 156
    array-length v0, p0

    array-length v3, p1

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 161
    :goto_1
    array-length v3, p0

    if-eq v0, v3, :cond_2

    .line 163
    aget v3, p0, v0

    aget v4, p1, v0

    if-ne v3, v4, :cond_0

    .line 161
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    .line 169
    goto :goto_0
.end method

.method public static a([J[J)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 176
    if-ne p0, p1, :cond_1

    move v1, v2

    .line 199
    :cond_0
    :goto_0
    return v1

    .line 181
    :cond_1
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 186
    array-length v0, p0

    array-length v3, p1

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 191
    :goto_1
    array-length v3, p0

    if-eq v0, v3, :cond_2

    .line 193
    aget-wide v4, p0, v0

    aget-wide v6, p1, v0

    cmp-long v3, v4, v6

    if-nez v3, :cond_0

    .line 191
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    .line 199
    goto :goto_0
.end method

.method public static a([Ljava/math/BigInteger;[Ljava/math/BigInteger;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 206
    if-ne p0, p1, :cond_1

    move v1, v2

    .line 229
    :cond_0
    :goto_0
    return v1

    .line 211
    :cond_1
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 216
    array-length v0, p0

    array-length v3, p1

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 221
    :goto_1
    array-length v3, p0

    if-eq v0, v3, :cond_2

    .line 223
    aget-object v3, p0, v0

    aget-object v4, p1, v0

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 221
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    .line 229
    goto :goto_0
.end method

.method public static a([II)[I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 405
    new-array v0, p1, [I

    .line 407
    array-length v1, p0

    if-ge p1, v1, :cond_0

    .line 409
    invoke-static {p0, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 416
    :goto_0
    return-object v0

    .line 413
    :cond_0
    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public static a([III)[I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 471
    sub-int v0, p2, p1

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 473
    :cond_0
    new-array v1, v0, [I

    .line 475
    array-length v2, p0

    sub-int/2addr v2, p1

    if-ge v2, v0, :cond_1

    .line 477
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p0, p1, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 484
    :goto_0
    return-object v1

    .line 481
    :cond_1
    invoke-static {p0, p1, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public static a([JI)[J
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 421
    new-array v0, p1, [J

    .line 423
    array-length v1, p0

    if-ge p1, v1, :cond_0

    .line 425
    invoke-static {p0, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 432
    :goto_0
    return-object v0

    .line 429
    :cond_0
    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public static b([B[B)Z
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 117
    if-ne p0, p1, :cond_1

    move v1, v3

    .line 139
    :cond_0
    :goto_0
    return v1

    .line 122
    :cond_1
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 127
    array-length v0, p0

    array-length v2, p1

    if-ne v0, v2, :cond_0

    move v0, v1

    move v2, v1

    .line 134
    :goto_1
    array-length v4, p0

    if-eq v0, v4, :cond_2

    .line 136
    aget-byte v4, p0, v0

    aget-byte v5, p1, v0

    xor-int/2addr v4, v5

    or-int/2addr v2, v4

    .line 134
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 139
    :cond_2
    if-nez v2, :cond_0

    move v1, v3

    goto :goto_0
.end method

.method public static b([B)[B
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 350
    if-nez p0, :cond_0

    .line 352
    const/4 v0, 0x0

    .line 358
    :goto_0
    return-object v0

    .line 354
    :cond_0
    array-length v0, p0

    new-array v0, v0, [B

    .line 356
    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public static b([I)[I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 363
    if-nez p0, :cond_0

    .line 365
    const/4 v0, 0x0

    .line 371
    :goto_0
    return-object v0

    .line 367
    :cond_0
    array-length v0, p0

    new-array v0, v0, [I

    .line 369
    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method
