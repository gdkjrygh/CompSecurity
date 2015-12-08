.class final Lcom/bumptech/glide/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:[B

.field protected c:I

.field protected d:I

.field protected e:[[I

.field protected f:[I

.field protected g:[I

.field protected h:[I

.field protected i:[I


# direct methods
.method public constructor <init>([BII)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/16 v6, 0x100

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    new-array v0, v6, [I

    iput-object v0, p0, Lcom/bumptech/glide/c/c;->f:[I

    .line 127
    new-array v0, v6, [I

    iput-object v0, p0, Lcom/bumptech/glide/c/c;->g:[I

    .line 130
    new-array v0, v6, [I

    iput-object v0, p0, Lcom/bumptech/glide/c/c;->h:[I

    .line 132
    const/16 v0, 0x20

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/bumptech/glide/c/c;->i:[I

    .line 145
    iput-object p1, p0, Lcom/bumptech/glide/c/c;->b:[B

    .line 146
    iput p2, p0, Lcom/bumptech/glide/c/c;->c:I

    .line 147
    iput p3, p0, Lcom/bumptech/glide/c/c;->d:I

    .line 149
    new-array v0, v6, [[I

    iput-object v0, p0, Lcom/bumptech/glide/c/c;->e:[[I

    move v0, v1

    .line 150
    :goto_0
    if-ge v0, v6, :cond_0

    .line 151
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    const/4 v3, 0x4

    new-array v3, v3, [I

    aput-object v3, v2, v0

    .line 152
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v0

    .line 153
    const/4 v3, 0x1

    const/4 v4, 0x2

    shl-int/lit8 v5, v0, 0xc

    div-int/lit16 v5, v5, 0x100

    aput v5, v2, v4

    aput v5, v2, v3

    aput v5, v2, v1

    .line 154
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->h:[I

    aput v6, v2, v0

    .line 155
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->g:[I

    aput v1, v2, v0

    .line 150
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 157
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(III)I
    .locals 12

    .prologue
    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v9, 0x0

    const/4 v6, -0x1

    const/16 v5, 0x100

    .line 317
    const/16 v3, 0x3e8

    .line 319
    iget-object v0, p0, Lcom/bumptech/glide/c/c;->f:[I

    aget v4, v0, p2

    .line 320
    add-int/lit8 v0, v4, -0x1

    move v1, v6

    move v2, v3

    move v7, v0

    move v3, v4

    .line 322
    :goto_0
    if-lt v3, v5, :cond_0

    if-ltz v7, :cond_9

    .line 323
    :cond_0
    if-ge v3, v5, :cond_c

    .line 324
    iget-object v0, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v8, v0, v3

    .line 325
    aget v0, v8, v10

    sub-int/2addr v0, p2

    .line 326
    if-lt v0, v2, :cond_1

    move v3, v2

    move v4, v5

    move v2, v1

    .line 348
    :goto_1
    if-ltz v7, :cond_a

    .line 349
    iget-object v0, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v8, v0, v7

    .line 350
    aget v0, v8, v10

    sub-int v0, p2, v0

    .line 351
    if-lt v0, v3, :cond_5

    move v1, v2

    move v7, v6

    move v2, v3

    move v3, v4

    .line 352
    goto :goto_0

    .line 329
    :cond_1
    add-int/lit8 v4, v3, 0x1

    .line 330
    if-gez v0, :cond_2

    .line 331
    neg-int v0, v0

    .line 332
    :cond_2
    aget v3, v8, v9

    sub-int/2addr v3, p1

    .line 333
    if-gez v3, :cond_3

    .line 334
    neg-int v3, v3

    .line 335
    :cond_3
    add-int/2addr v3, v0

    .line 336
    if-ge v3, v2, :cond_b

    .line 337
    aget v0, v8, v11

    sub-int/2addr v0, p3

    .line 338
    if-gez v0, :cond_4

    .line 339
    neg-int v0, v0

    .line 340
    :cond_4
    add-int/2addr v3, v0

    .line 341
    if-ge v3, v2, :cond_b

    .line 343
    const/4 v0, 0x3

    aget v0, v8, v0

    move v2, v0

    goto :goto_1

    .line 354
    :cond_5
    add-int/lit8 v7, v7, -0x1

    .line 355
    if-gez v0, :cond_6

    .line 356
    neg-int v0, v0

    .line 357
    :cond_6
    aget v1, v8, v9

    sub-int/2addr v1, p1

    .line 358
    if-gez v1, :cond_7

    .line 359
    neg-int v1, v1

    .line 360
    :cond_7
    add-int/2addr v1, v0

    .line 361
    if-ge v1, v3, :cond_a

    .line 362
    aget v0, v8, v11

    sub-int/2addr v0, p3

    .line 363
    if-gez v0, :cond_8

    .line 364
    neg-int v0, v0

    .line 365
    :cond_8
    add-int/2addr v0, v1

    .line 366
    if-ge v0, v3, :cond_a

    .line 368
    const/4 v1, 0x3

    aget v2, v8, v1

    move v1, v2

    move v3, v4

    move v2, v0

    goto :goto_0

    .line 374
    :cond_9
    return v1

    :cond_a
    move v1, v2

    move v2, v3

    move v3, v4

    goto :goto_0

    :cond_b
    move v3, v2

    move v2, v1

    goto :goto_1

    :cond_c
    move v4, v3

    move v3, v2

    move v2, v1

    goto :goto_1
.end method

.method public final a()[B
    .locals 10

    .prologue
    const/16 v9, 0x100

    const/4 v1, 0x0

    .line 160
    const/16 v0, 0x300

    new-array v3, v0, [B

    .line 161
    new-array v4, v9, [I

    move v0, v1

    .line 162
    :goto_0
    if-ge v0, v9, :cond_0

    .line 163
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v0

    const/4 v5, 0x3

    aget v2, v2, v5

    aput v0, v4, v2

    .line 162
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    move v2, v1

    .line 165
    :goto_1
    if-ge v0, v9, :cond_1

    .line 166
    aget v5, v4, v0

    .line 167
    add-int/lit8 v6, v2, 0x1

    iget-object v7, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v7, v7, v5

    aget v7, v7, v1

    int-to-byte v7, v7

    aput-byte v7, v3, v2

    .line 168
    add-int/lit8 v7, v6, 0x1

    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v5

    const/4 v8, 0x1

    aget v2, v2, v8

    int-to-byte v2, v2

    aput-byte v2, v3, v6

    .line 169
    add-int/lit8 v2, v7, 0x1

    iget-object v6, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v5, v6, v5

    const/4 v6, 0x2

    aget v5, v5, v6

    int-to-byte v5, v5

    aput-byte v5, v3, v7

    .line 165
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 171
    :cond_1
    return-object v3
.end method

.method public final b()V
    .locals 14

    .prologue
    const/16 v13, 0x100

    const/4 v12, 0x3

    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v6, 0x0

    .line 186
    move v4, v6

    move v5, v6

    move v3, v6

    .line 188
    :goto_0
    if-ge v3, v13, :cond_4

    .line 189
    iget-object v0, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v7, v0, v3

    .line 191
    aget v0, v7, v10

    .line 193
    add-int/lit8 v2, v3, 0x1

    move v1, v3

    :goto_1
    if-ge v2, v13, :cond_1

    .line 194
    iget-object v8, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v8, v8, v2

    .line 195
    aget v9, v8, v10

    if-ge v9, v0, :cond_0

    .line 197
    aget v0, v8, v10

    move v1, v2

    .line 193
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 200
    :cond_1
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v1

    .line 202
    if-eq v3, v1, :cond_2

    .line 203
    aget v1, v2, v6

    .line 204
    aget v8, v7, v6

    aput v8, v2, v6

    .line 205
    aput v1, v7, v6

    .line 206
    aget v1, v2, v10

    .line 207
    aget v8, v7, v10

    aput v8, v2, v10

    .line 208
    aput v1, v7, v10

    .line 209
    aget v1, v2, v11

    .line 210
    aget v8, v7, v11

    aput v8, v2, v11

    .line 211
    aput v1, v7, v11

    .line 212
    aget v1, v2, v12

    .line 213
    aget v8, v7, v12

    aput v8, v2, v12

    .line 214
    aput v1, v7, v12

    .line 217
    :cond_2
    if-eq v0, v5, :cond_6

    .line 218
    iget-object v1, p0, Lcom/bumptech/glide/c/c;->f:[I

    add-int v2, v4, v3

    shr-int/lit8 v2, v2, 0x1

    aput v2, v1, v5

    .line 219
    add-int/lit8 v1, v5, 0x1

    :goto_2
    if-ge v1, v0, :cond_3

    .line 220
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->f:[I

    aput v3, v2, v1

    .line 219
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    move v1, v0

    move v0, v3

    .line 188
    :goto_3
    add-int/lit8 v3, v3, 0x1

    move v4, v0

    move v5, v1

    goto :goto_0

    .line 225
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/c/c;->f:[I

    add-int/lit16 v1, v4, 0xff

    shr-int/lit8 v1, v1, 0x1

    aput v1, v0, v5

    .line 226
    add-int/lit8 v0, v5, 0x1

    :goto_4
    if-ge v0, v13, :cond_5

    .line 227
    iget-object v1, p0, Lcom/bumptech/glide/c/c;->f:[I

    const/16 v2, 0xff

    aput v2, v1, v0

    .line 226
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 228
    :cond_5
    return-void

    :cond_6
    move v0, v4

    move v1, v5

    goto :goto_3
.end method

.method public final c()V
    .locals 25

    .prologue
    .line 240
    move-object/from16 v0, p0

    iget v1, v0, Lcom/bumptech/glide/c/c;->c:I

    const/16 v2, 0x5e5

    if-ge v1, v2, :cond_0

    .line 241
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput v1, v0, Lcom/bumptech/glide/c/c;->d:I

    .line 242
    :cond_0
    move-object/from16 v0, p0

    iget v1, v0, Lcom/bumptech/glide/c/c;->d:I

    add-int/lit8 v1, v1, -0x1

    div-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x1e

    move-object/from16 v0, p0

    iput v1, v0, Lcom/bumptech/glide/c/c;->a:I

    .line 243
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/bumptech/glide/c/c;->b:[B

    .line 244
    const/4 v5, 0x0

    .line 245
    move-object/from16 v0, p0

    iget v0, v0, Lcom/bumptech/glide/c/c;->c:I

    move/from16 v16, v0

    .line 246
    move-object/from16 v0, p0

    iget v1, v0, Lcom/bumptech/glide/c/c;->c:I

    move-object/from16 v0, p0

    iget v2, v0, Lcom/bumptech/glide/c/c;->d:I

    mul-int/lit8 v2, v2, 0x3

    div-int v17, v1, v2

    .line 247
    div-int/lit8 v2, v17, 0x64

    .line 248
    const/16 v3, 0x400

    .line 249
    const/16 v6, 0x800

    .line 251
    const/16 v4, 0x20

    .line 254
    const/4 v1, 0x0

    :goto_0
    const/16 v7, 0x20

    if-ge v1, v7, :cond_1

    .line 255
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/bumptech/glide/c/c;->i:[I

    mul-int v8, v1, v1

    rsub-int v8, v8, 0x400

    mul-int/lit16 v8, v8, 0x100

    div-int/lit16 v8, v8, 0x400

    mul-int/lit16 v8, v8, 0x400

    aput v8, v7, v1

    .line 254
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 259
    :cond_1
    move-object/from16 v0, p0

    iget v1, v0, Lcom/bumptech/glide/c/c;->c:I

    const/16 v7, 0x5e5

    if-ge v1, v7, :cond_5

    .line 260
    const/4 v1, 0x3

    .line 274
    :goto_1
    const/4 v7, 0x0

    move v10, v5

    move v9, v2

    move v11, v3

    move v12, v4

    move v13, v6

    move v14, v7

    .line 275
    :goto_2
    move/from16 v0, v17

    if-ge v14, v0, :cond_e

    .line 276
    add-int/lit8 v2, v10, 0x0

    aget-byte v2, v15, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v18, v2, 0x4

    .line 277
    add-int/lit8 v2, v10, 0x1

    aget-byte v2, v15, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v19, v2, 0x4

    .line 278
    add-int/lit8 v2, v10, 0x2

    aget-byte v2, v15, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v20, v2, 0x4

    .line 1471
    const v4, 0x7fffffff

    .line 1472
    const v7, 0x7fffffff

    .line 1473
    const/4 v6, -0x1

    .line 1474
    const/4 v8, -0x1

    .line 1476
    const/4 v5, 0x0

    :goto_3
    const/16 v2, 0x100

    if-ge v5, v2, :cond_9

    .line 1477
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v21, v2, v5

    .line 1478
    const/4 v2, 0x0

    aget v2, v21, v2

    sub-int v2, v2, v18

    .line 1479
    if-gez v2, :cond_2

    .line 1480
    neg-int v2, v2

    .line 1481
    :cond_2
    const/4 v3, 0x1

    aget v3, v21, v3

    sub-int v3, v3, v19

    .line 1482
    if-gez v3, :cond_3

    .line 1483
    neg-int v3, v3

    .line 1484
    :cond_3
    add-int/2addr v3, v2

    .line 1485
    const/4 v2, 0x2

    aget v2, v21, v2

    sub-int v2, v2, v20

    .line 1486
    if-gez v2, :cond_4

    .line 1487
    neg-int v2, v2

    .line 1488
    :cond_4
    add-int/2addr v3, v2

    .line 1489
    if-ge v3, v4, :cond_17

    move v2, v3

    move v4, v5

    .line 1493
    :goto_4
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/bumptech/glide/c/c;->g:[I

    aget v6, v6, v5

    shr-int/lit8 v6, v6, 0xc

    sub-int/2addr v3, v6

    .line 1494
    if-ge v3, v7, :cond_16

    move v6, v5

    .line 1498
    :goto_5
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/bumptech/glide/c/c;->h:[I

    aget v7, v7, v5

    shr-int/lit8 v7, v7, 0xa

    .line 1499
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/bumptech/glide/c/c;->h:[I

    aget v21, v8, v5

    sub-int v21, v21, v7

    aput v21, v8, v5

    .line 1500
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/bumptech/glide/c/c;->g:[I

    aget v21, v8, v5

    shl-int/lit8 v7, v7, 0xa

    add-int v7, v7, v21

    aput v7, v8, v5

    .line 1476
    add-int/lit8 v5, v5, 0x1

    move v7, v3

    move v8, v6

    move v6, v4

    move v4, v2

    goto :goto_3

    .line 261
    :cond_5
    move-object/from16 v0, p0

    iget v1, v0, Lcom/bumptech/glide/c/c;->c:I

    rem-int/lit16 v1, v1, 0x1f3

    if-eqz v1, :cond_6

    .line 262
    const/16 v1, 0x5d9

    goto/16 :goto_1

    .line 264
    :cond_6
    move-object/from16 v0, p0

    iget v1, v0, Lcom/bumptech/glide/c/c;->c:I

    rem-int/lit16 v1, v1, 0x1eb

    if-eqz v1, :cond_7

    .line 265
    const/16 v1, 0x5c1

    goto/16 :goto_1

    .line 267
    :cond_7
    move-object/from16 v0, p0

    iget v1, v0, Lcom/bumptech/glide/c/c;->c:I

    rem-int/lit16 v1, v1, 0x1e7

    if-eqz v1, :cond_8

    .line 268
    const/16 v1, 0x5b5

    goto/16 :goto_1

    .line 270
    :cond_8
    const/16 v1, 0x5e5

    goto/16 :goto_1

    .line 1502
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/bumptech/glide/c/c;->h:[I

    aget v3, v2, v6

    add-int/lit8 v3, v3, 0x40

    aput v3, v2, v6

    .line 1503
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/bumptech/glide/c/c;->g:[I

    aget v3, v2, v6

    const/high16 v4, 0x10000

    sub-int/2addr v3, v4

    aput v3, v2, v6

    .line 2451
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v8

    .line 2452
    const/4 v3, 0x0

    aget v4, v2, v3

    const/4 v5, 0x0

    aget v5, v2, v5

    sub-int v5, v5, v18

    mul-int/2addr v5, v11

    div-int/lit16 v5, v5, 0x400

    sub-int/2addr v4, v5

    aput v4, v2, v3

    .line 2453
    const/4 v3, 0x1

    aget v4, v2, v3

    const/4 v5, 0x1

    aget v5, v2, v5

    sub-int v5, v5, v19

    mul-int/2addr v5, v11

    div-int/lit16 v5, v5, 0x400

    sub-int/2addr v4, v5

    aput v4, v2, v3

    .line 2454
    const/4 v3, 0x2

    aget v4, v2, v3

    const/4 v5, 0x2

    aget v5, v2, v5

    sub-int v5, v5, v20

    mul-int/2addr v5, v11

    div-int/lit16 v5, v5, 0x400

    sub-int/2addr v4, v5

    aput v4, v2, v3

    .line 282
    if-eqz v12, :cond_c

    .line 3411
    sub-int v2, v8, v12

    .line 3412
    const/4 v3, -0x1

    if-ge v2, v3, :cond_15

    .line 3413
    const/4 v2, -0x1

    move v7, v2

    .line 3414
    :goto_6
    add-int v2, v8, v12

    .line 3415
    const/16 v3, 0x100

    if-le v2, v3, :cond_a

    .line 3416
    const/16 v2, 0x100

    .line 3418
    :cond_a
    add-int/lit8 v4, v8, 0x1

    .line 3419
    add-int/lit8 v5, v8, -0x1

    .line 3420
    const/4 v3, 0x1

    move v6, v5

    move v5, v4

    .line 3421
    :goto_7
    if-lt v5, v2, :cond_b

    if-le v6, v7, :cond_c

    .line 3422
    :cond_b
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/bumptech/glide/c/c;->i:[I

    add-int/lit8 v4, v3, 0x1

    aget v8, v8, v3

    .line 3423
    if-ge v5, v2, :cond_13

    .line 3424
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/c/c;->e:[[I

    move-object/from16 v21, v0

    add-int/lit8 v3, v5, 0x1

    aget-object v5, v21, v5

    .line 3426
    const/16 v21, 0x0

    :try_start_0
    aget v22, v5, v21

    const/16 v23, 0x0

    aget v23, v5, v23

    sub-int v23, v23, v18

    mul-int v23, v23, v8

    const/high16 v24, 0x40000

    div-int v23, v23, v24

    sub-int v22, v22, v23

    aput v22, v5, v21

    .line 3427
    const/16 v21, 0x1

    aget v22, v5, v21

    const/16 v23, 0x1

    aget v23, v5, v23

    sub-int v23, v23, v19

    mul-int v23, v23, v8

    const/high16 v24, 0x40000

    div-int v23, v23, v24

    sub-int v22, v22, v23

    aput v22, v5, v21

    .line 3428
    const/16 v21, 0x2

    aget v22, v5, v21

    const/16 v23, 0x2

    aget v23, v5, v23

    sub-int v23, v23, v20

    mul-int v23, v23, v8

    const/high16 v24, 0x40000

    div-int v23, v23, v24

    sub-int v22, v22, v23

    aput v22, v5, v21
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 3432
    :goto_8
    if-le v6, v7, :cond_14

    .line 3433
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/c/c;->e:[[I

    move-object/from16 v21, v0

    add-int/lit8 v5, v6, -0x1

    aget-object v6, v21, v6

    .line 3435
    const/16 v21, 0x0

    :try_start_1
    aget v22, v6, v21

    const/16 v23, 0x0

    aget v23, v6, v23

    sub-int v23, v23, v18

    mul-int v23, v23, v8

    const/high16 v24, 0x40000

    div-int v23, v23, v24

    sub-int v22, v22, v23

    aput v22, v6, v21

    .line 3436
    const/16 v21, 0x1

    aget v22, v6, v21

    const/16 v23, 0x1

    aget v23, v6, v23

    sub-int v23, v23, v19

    mul-int v23, v23, v8

    const/high16 v24, 0x40000

    div-int v23, v23, v24

    sub-int v22, v22, v23

    aput v22, v6, v21

    .line 3437
    const/16 v21, 0x2

    aget v22, v6, v21

    const/16 v23, 0x2

    aget v23, v6, v23

    sub-int v23, v23, v20

    mul-int v8, v8, v23

    const/high16 v23, 0x40000

    div-int v8, v8, v23

    sub-int v8, v22, v8

    aput v8, v6, v21
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v6, v5

    move v5, v3

    move v3, v4

    .line 3439
    goto/16 :goto_7

    :catch_0
    move-exception v6

    move v6, v5

    move v5, v3

    move v3, v4

    goto/16 :goto_7

    .line 285
    :cond_c
    add-int v2, v10, v1

    .line 286
    move/from16 v0, v16

    if-lt v2, v0, :cond_12

    .line 287
    move-object/from16 v0, p0

    iget v3, v0, Lcom/bumptech/glide/c/c;->c:I

    sub-int/2addr v2, v3

    move v5, v2

    .line 289
    :goto_9
    add-int/lit8 v8, v14, 0x1

    .line 290
    if-nez v9, :cond_11

    .line 291
    const/4 v2, 0x1

    .line 292
    :goto_a
    rem-int v3, v8, v2

    if-nez v3, :cond_10

    .line 293
    move-object/from16 v0, p0

    iget v3, v0, Lcom/bumptech/glide/c/c;->a:I

    div-int v3, v11, v3

    sub-int v6, v11, v3

    .line 294
    div-int/lit8 v3, v13, 0x1e

    sub-int v7, v13, v3

    .line 295
    shr-int/lit8 v3, v7, 0x6

    .line 296
    const/4 v4, 0x1

    if-gt v3, v4, :cond_d

    .line 297
    const/4 v3, 0x0

    .line 298
    :cond_d
    const/4 v4, 0x0

    :goto_b
    if-ge v4, v3, :cond_f

    .line 299
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/bumptech/glide/c/c;->i:[I

    mul-int v10, v3, v3

    mul-int v11, v4, v4

    sub-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x100

    mul-int v11, v3, v3

    div-int/2addr v10, v11

    mul-int/2addr v10, v6

    aput v10, v9, v4

    .line 298
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    .line 304
    :cond_e
    return-void

    :catch_1
    move-exception v5

    goto/16 :goto_8

    :cond_f
    move v10, v5

    move v9, v2

    move v11, v6

    move v12, v3

    move v13, v7

    move v14, v8

    goto/16 :goto_2

    :cond_10
    move v10, v5

    move v9, v2

    move v14, v8

    goto/16 :goto_2

    :cond_11
    move v2, v9

    goto :goto_a

    :cond_12
    move v5, v2

    goto :goto_9

    :cond_13
    move v3, v5

    goto/16 :goto_8

    :cond_14
    move v5, v3

    move v3, v4

    goto/16 :goto_7

    :cond_15
    move v7, v2

    goto/16 :goto_6

    :cond_16
    move v3, v7

    move v6, v8

    goto/16 :goto_5

    :cond_17
    move v2, v4

    move v4, v6

    goto/16 :goto_4
.end method

.method public final d()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 393
    move v0, v1

    :goto_0
    const/16 v2, 0x100

    if-ge v0, v2, :cond_0

    .line 394
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v0

    aget v3, v2, v1

    shr-int/lit8 v3, v3, 0x4

    aput v3, v2, v1

    .line 395
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v0

    const/4 v3, 0x1

    aget v4, v2, v3

    shr-int/lit8 v4, v4, 0x4

    aput v4, v2, v3

    .line 396
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v0

    const/4 v3, 0x2

    aget v4, v2, v3

    shr-int/lit8 v4, v4, 0x4

    aput v4, v2, v3

    .line 397
    iget-object v2, p0, Lcom/bumptech/glide/c/c;->e:[[I

    aget-object v2, v2, v0

    const/4 v3, 0x3

    aput v0, v2, v3

    .line 393
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 399
    :cond_0
    return-void
.end method
