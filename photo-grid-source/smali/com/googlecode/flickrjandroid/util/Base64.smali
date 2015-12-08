.class public final Lcom/googlecode/flickrjandroid/util/Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BASELENGTH:I = 0xff

.field private static final EIGHTBIT:I = 0x8

.field private static final FOURBYTE:I = 0x4

.field private static final LOOKUPLENGTH:I = 0x40

.field private static final PAD:B = 0x3dt

.field private static final SIGN:I = -0x80

.field private static final SIXBIT:I = 0x6

.field private static final SIXTEENBIT:I = 0x10

.field private static final TWENTYFOURBITGROUP:I = 0x18

.field private static base64Alphabet:[B

.field private static final fDebug:Z

.field private static lookUpBase64Alphabet:[B


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/16 v8, 0x3f

    const/16 v7, 0x3e

    const/16 v6, 0x2f

    const/16 v5, 0x2b

    const/4 v0, 0x0

    .line 89
    const/16 v1, 0xff

    new-array v1, v1, [B

    sput-object v1, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    .line 90
    const/16 v1, 0x40

    new-array v1, v1, [B

    sput-object v1, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    move v1, v0

    .line 95
    :goto_0
    const/16 v2, 0xff

    if-lt v1, v2, :cond_0

    .line 98
    const/16 v1, 0x5a

    :goto_1
    const/16 v2, 0x41

    if-ge v1, v2, :cond_1

    .line 101
    const/16 v1, 0x7a

    :goto_2
    const/16 v2, 0x61

    if-ge v1, v2, :cond_2

    .line 105
    const/16 v1, 0x39

    :goto_3
    const/16 v2, 0x30

    if-ge v1, v2, :cond_3

    .line 109
    sget-object v1, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aput-byte v7, v1, v5

    .line 110
    sget-object v1, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aput-byte v8, v1, v6

    move v1, v0

    .line 112
    :goto_4
    const/16 v2, 0x19

    if-le v1, v2, :cond_4

    .line 115
    const/16 v1, 0x1a

    move v2, v1

    move v1, v0

    :goto_5
    const/16 v3, 0x33

    if-le v2, v3, :cond_5

    .line 118
    const/16 v1, 0x34

    :goto_6
    const/16 v2, 0x3d

    if-le v1, v2, :cond_6

    .line 120
    sget-object v0, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    aput-byte v5, v0, v7

    .line 121
    sget-object v0, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    aput-byte v6, v0, v8

    .line 123
    return-void

    .line 96
    :cond_0
    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    const/4 v3, -0x1

    aput-byte v3, v2, v1

    .line 95
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 99
    :cond_1
    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    add-int/lit8 v3, v1, -0x41

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    .line 98
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 102
    :cond_2
    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    add-int/lit8 v3, v1, -0x61

    add-int/lit8 v3, v3, 0x1a

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    .line 101
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    .line 106
    :cond_3
    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    add-int/lit8 v3, v1, -0x30

    add-int/lit8 v3, v3, 0x34

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    .line 105
    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    .line 113
    :cond_4
    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    add-int/lit8 v3, v1, 0x41

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    .line 112
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 116
    :cond_5
    sget-object v3, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    add-int/lit8 v4, v1, 0x61

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    .line 115
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 119
    :cond_6
    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    add-int/lit8 v3, v0, 0x30

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    .line 118
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_6
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized decode([B)[B
    .locals 14

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 294
    const-class v5, Lcom/googlecode/flickrjandroid/util/Base64;

    monitor-enter v5

    if-nez p0, :cond_1

    .line 381
    :cond_0
    :goto_0
    monitor-exit v5

    return-object v0

    .line 297
    :cond_1
    :try_start_0
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/util/Base64;->removeWhiteSpace([B)[B

    move-result-object v6

    .line 299
    array-length v1, v6

    rem-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_0

    .line 303
    array-length v1, v6

    div-int/lit8 v7, v1, 0x4

    .line 305
    if-nez v7, :cond_2

    .line 306
    const/4 v0, 0x0

    new-array v0, v0, [B

    goto :goto_0

    .line 319
    :cond_2
    mul-int/lit8 v1, v7, 0x3

    new-array v1, v1, [B

    move v3, v2

    move v4, v2

    .line 321
    :goto_1
    add-int/lit8 v8, v7, -0x1

    if-lt v4, v8, :cond_4

    .line 340
    add-int/lit8 v7, v2, 0x1

    aget-byte v2, v6, v2

    invoke-static {v2}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 341
    add-int/lit8 v8, v7, 0x1

    aget-byte v7, v6, v7

    invoke-static {v7}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 346
    sget-object v9, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v2, v9, v2

    .line 347
    sget-object v9, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v7, v9, v7

    .line 349
    add-int/lit8 v9, v8, 0x1

    aget-byte v8, v6, v8

    .line 350
    aget-byte v6, v6, v9

    .line 351
    invoke-static {v8}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 352
    invoke-static {v6}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v9

    if-nez v9, :cond_6

    .line 353
    :cond_3
    invoke-static {v8}, Lcom/googlecode/flickrjandroid/util/Base64;->isPad(B)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-static {v6}, Lcom/googlecode/flickrjandroid/util/Base64;->isPad(B)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 354
    and-int/lit8 v6, v7, 0xf

    if-nez v6, :cond_0

    .line 356
    mul-int/lit8 v0, v4, 0x3

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    .line 357
    const/4 v6, 0x0

    const/4 v8, 0x0

    mul-int/lit8 v4, v4, 0x3

    invoke-static {v1, v6, v0, v8, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 358
    shl-int/lit8 v1, v2, 0x2

    shr-int/lit8 v2, v7, 0x4

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 294
    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    .line 323
    :cond_4
    add-int/lit8 v8, v2, 0x1

    :try_start_1
    aget-byte v9, v6, v2

    invoke-static {v9}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 324
    add-int/lit8 v2, v8, 0x1

    aget-byte v8, v6, v8

    invoke-static {v8}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 325
    add-int/lit8 v10, v2, 0x1

    aget-byte v11, v6, v2

    invoke-static {v11}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 326
    add-int/lit8 v2, v10, 0x1

    aget-byte v10, v6, v10

    invoke-static {v10}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 329
    sget-object v12, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v9, v12, v9

    .line 330
    sget-object v12, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v8, v12, v8

    .line 331
    sget-object v12, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v11, v12, v11

    .line 332
    sget-object v12, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v10, v12, v10

    .line 334
    add-int/lit8 v12, v3, 0x1

    shl-int/lit8 v9, v9, 0x2

    shr-int/lit8 v13, v8, 0x4

    or-int/2addr v9, v13

    int-to-byte v9, v9

    aput-byte v9, v1, v3

    .line 335
    add-int/lit8 v9, v12, 0x1

    and-int/lit8 v3, v8, 0xf

    shl-int/lit8 v3, v3, 0x4

    shr-int/lit8 v8, v11, 0x2

    and-int/lit8 v8, v8, 0xf

    or-int/2addr v3, v8

    int-to-byte v3, v3

    aput-byte v3, v1, v12

    .line 336
    add-int/lit8 v3, v9, 0x1

    shl-int/lit8 v8, v11, 0x6

    or-int/2addr v8, v10

    int-to-byte v8, v8

    aput-byte v8, v1, v9

    .line 321
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 360
    :cond_5
    invoke-static {v8}, Lcom/googlecode/flickrjandroid/util/Base64;->isPad(B)Z

    move-result v9

    if-nez v9, :cond_0

    invoke-static {v6}, Lcom/googlecode/flickrjandroid/util/Base64;->isPad(B)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 361
    sget-object v6, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v6, v6, v8

    .line 362
    and-int/lit8 v8, v6, 0x3

    if-nez v8, :cond_0

    .line 364
    mul-int/lit8 v0, v4, 0x3

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    .line 365
    const/4 v8, 0x0

    const/4 v9, 0x0

    mul-int/lit8 v4, v4, 0x3

    invoke-static {v1, v8, v0, v9, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 366
    add-int/lit8 v1, v3, 0x1

    shl-int/lit8 v2, v2, 0x2

    shr-int/lit8 v4, v7, 0x4

    or-int/2addr v2, v4

    int-to-byte v2, v2

    aput-byte v2, v0, v3

    .line 367
    and-int/lit8 v2, v7, 0xf

    shl-int/lit8 v2, v2, 0x4

    shr-int/lit8 v3, v6, 0x2

    and-int/lit8 v3, v3, 0xf

    or-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    goto/16 :goto_0

    .line 373
    :cond_6
    sget-object v0, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v0, v0, v8

    .line 374
    sget-object v4, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v4, v4, v6

    .line 375
    add-int/lit8 v6, v3, 0x1

    shl-int/lit8 v2, v2, 0x2

    shr-int/lit8 v8, v7, 0x4

    or-int/2addr v2, v8

    int-to-byte v2, v2

    aput-byte v2, v1, v3

    .line 376
    add-int/lit8 v2, v6, 0x1

    and-int/lit8 v3, v7, 0xf

    shl-int/lit8 v3, v3, 0x4

    shr-int/lit8 v7, v0, 0x2

    and-int/lit8 v7, v7, 0xf

    or-int/2addr v3, v7

    int-to-byte v3, v3

    aput-byte v3, v1, v6

    .line 377
    shl-int/lit8 v0, v0, 0x6

    or-int/2addr v0, v4

    int-to-byte v0, v0

    aput-byte v0, v1, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v1

    .line 381
    goto/16 :goto_0
.end method

.method public static declared-synchronized encode([B)[B
    .locals 13

    .prologue
    .line 199
    const-class v5, Lcom/googlecode/flickrjandroid/util/Base64;

    monitor-enter v5

    if-nez p0, :cond_1

    .line 200
    const/4 v0, 0x0

    .line 283
    :cond_0
    :goto_0
    monitor-exit v5

    return-object v0

    .line 202
    :cond_1
    :try_start_0
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x8

    .line 203
    rem-int/lit8 v6, v0, 0x18

    .line 204
    div-int/lit8 v7, v0, 0x18

    .line 208
    if-eqz v6, :cond_2

    .line 209
    add-int/lit8 v0, v7, 0x1

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [B

    .line 221
    :goto_1
    const/4 v1, 0x0

    move v4, v1

    :goto_2
    if-lt v4, v7, :cond_3

    .line 254
    mul-int/lit8 v1, v4, 0x3

    .line 255
    mul-int/lit8 v3, v4, 0x4

    .line 256
    const/16 v2, 0x8

    if-ne v6, v2, :cond_8

    .line 257
    aget-byte v1, p0, v1

    .line 258
    and-int/lit8 v2, v1, 0x3

    int-to-byte v2, v2

    .line 263
    and-int/lit8 v4, v1, -0x80

    if-nez v4, :cond_7

    shr-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    .line 264
    :goto_3
    sget-object v4, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    aget-byte v1, v4, v1

    aput-byte v1, v0, v3

    .line 265
    add-int/lit8 v1, v3, 0x1

    sget-object v4, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    shl-int/lit8 v2, v2, 0x4

    aget-byte v2, v4, v2

    aput-byte v2, v0, v1

    .line 266
    add-int/lit8 v1, v3, 0x2

    const/16 v2, 0x3d

    aput-byte v2, v0, v1

    .line 267
    add-int/lit8 v1, v3, 0x3

    const/16 v2, 0x3d

    aput-byte v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 199
    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    .line 211
    :cond_2
    mul-int/lit8 v0, v7, 0x4

    :try_start_1
    new-array v0, v0, [B

    goto :goto_1

    .line 223
    :cond_3
    mul-int/lit8 v1, v4, 0x3

    .line 224
    aget-byte v2, p0, v1

    .line 225
    add-int/lit8 v3, v1, 0x1

    aget-byte v8, p0, v3

    .line 226
    add-int/lit8 v1, v1, 0x2

    aget-byte v9, p0, v1

    .line 232
    and-int/lit8 v1, v8, 0xf

    int-to-byte v10, v1

    .line 233
    and-int/lit8 v1, v2, 0x3

    int-to-byte v11, v1

    .line 235
    mul-int/lit8 v12, v4, 0x4

    .line 236
    and-int/lit8 v1, v2, -0x80

    if-nez v1, :cond_4

    shr-int/lit8 v1, v2, 0x2

    int-to-byte v1, v1

    move v3, v1

    .line 238
    :goto_4
    and-int/lit8 v1, v8, -0x80

    if-nez v1, :cond_5

    shr-int/lit8 v1, v8, 0x4

    int-to-byte v1, v1

    move v2, v1

    .line 239
    :goto_5
    and-int/lit8 v1, v9, -0x80

    if-nez v1, :cond_6

    shr-int/lit8 v1, v9, 0x6

    int-to-byte v1, v1

    .line 241
    :goto_6
    sget-object v8, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    aget-byte v3, v8, v3

    aput-byte v3, v0, v12

    .line 248
    add-int/lit8 v3, v12, 0x1

    sget-object v8, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    shl-int/lit8 v11, v11, 0x4

    or-int/2addr v2, v11

    aget-byte v2, v8, v2

    aput-byte v2, v0, v3

    .line 249
    add-int/lit8 v2, v12, 0x2

    sget-object v3, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    shl-int/lit8 v8, v10, 0x2

    or-int/2addr v1, v8

    aget-byte v1, v3, v1

    aput-byte v1, v0, v2

    .line 250
    add-int/lit8 v1, v12, 0x3

    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    and-int/lit8 v3, v9, 0x3f

    aget-byte v2, v2, v3

    aput-byte v2, v0, v1

    .line 221
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto/16 :goto_2

    .line 236
    :cond_4
    shr-int/lit8 v1, v2, 0x2

    xor-int/lit16 v1, v1, 0xc0

    int-to-byte v1, v1

    move v3, v1

    goto :goto_4

    .line 238
    :cond_5
    shr-int/lit8 v1, v8, 0x4

    xor-int/lit16 v1, v1, 0xf0

    int-to-byte v1, v1

    move v2, v1

    goto :goto_5

    .line 239
    :cond_6
    shr-int/lit8 v1, v9, 0x6

    xor-int/lit16 v1, v1, 0xfc

    int-to-byte v1, v1

    goto :goto_6

    .line 263
    :cond_7
    shr-int/lit8 v1, v1, 0x2

    xor-int/lit16 v1, v1, 0xc0

    int-to-byte v1, v1

    goto/16 :goto_3

    .line 268
    :cond_8
    const/16 v2, 0x10

    if-ne v6, v2, :cond_0

    .line 270
    aget-byte v2, p0, v1

    .line 271
    add-int/lit8 v1, v1, 0x1

    aget-byte v4, p0, v1

    .line 272
    and-int/lit8 v1, v4, 0xf

    int-to-byte v6, v1

    .line 273
    and-int/lit8 v1, v2, 0x3

    int-to-byte v7, v1

    .line 275
    and-int/lit8 v1, v2, -0x80

    if-nez v1, :cond_9

    shr-int/lit8 v1, v2, 0x2

    int-to-byte v1, v1

    move v2, v1

    .line 276
    :goto_7
    and-int/lit8 v1, v4, -0x80

    if-nez v1, :cond_a

    shr-int/lit8 v1, v4, 0x4

    int-to-byte v1, v1

    .line 278
    :goto_8
    sget-object v4, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    aget-byte v2, v4, v2

    aput-byte v2, v0, v3

    .line 279
    add-int/lit8 v2, v3, 0x1

    sget-object v4, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    shl-int/lit8 v7, v7, 0x4

    or-int/2addr v1, v7

    aget-byte v1, v4, v1

    aput-byte v1, v0, v2

    .line 280
    add-int/lit8 v1, v3, 0x2

    sget-object v2, Lcom/googlecode/flickrjandroid/util/Base64;->lookUpBase64Alphabet:[B

    shl-int/lit8 v4, v6, 0x2

    aget-byte v2, v2, v4

    aput-byte v2, v0, v1

    .line 281
    add-int/lit8 v1, v3, 0x3

    const/16 v2, 0x3d

    aput-byte v2, v0, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 275
    :cond_9
    shr-int/lit8 v1, v2, 0x2

    xor-int/lit16 v1, v1, 0xc0

    int-to-byte v1, v1

    move v2, v1

    goto :goto_7

    .line 276
    :cond_a
    shr-int/lit8 v1, v4, 0x4

    xor-int/lit16 v1, v1, 0xf0

    int-to-byte v1, v1

    goto :goto_8
.end method

.method public static declared-synchronized getDecodedDataLength([B)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 396
    const-class v1, Lcom/googlecode/flickrjandroid/util/Base64;

    monitor-enter v1

    if-nez p0, :cond_1

    .line 408
    :cond_0
    :goto_0
    monitor-exit v1

    return v0

    .line 399
    :cond_1
    :try_start_0
    array-length v2, p0

    if-nez v2, :cond_2

    .line 400
    const/4 v0, 0x0

    goto :goto_0

    .line 405
    :cond_2
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/util/Base64;->decode([B)[B

    move-result-object v2

    if-eqz v2, :cond_0

    .line 408
    array-length v0, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 396
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized isArrayByteBase64([B)Z
    .locals 2

    .prologue
    .line 189
    const-class v1, Lcom/googlecode/flickrjandroid/util/Base64;

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/util/Base64;->getDecodedDataLength([B)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static isBase64(B)Z
    .locals 1

    .prologue
    .line 145
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/util/Base64;->isWhiteSpace(B)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/googlecode/flickrjandroid/util/Base64;->isPad(B)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/googlecode/flickrjandroid/util/Base64;->isData(B)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static isBase64(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 138
    if-nez p0, :cond_0

    .line 139
    const/4 v0, 0x0

    .line 140
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/util/Base64;->isArrayByteBase64([B)Z

    move-result v0

    goto :goto_0
.end method

.method protected static isData(B)Z
    .locals 2

    .prologue
    .line 134
    sget-object v0, Lcom/googlecode/flickrjandroid/util/Base64;->base64Alphabet:[B

    aget-byte v0, v0, p0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static isPad(B)Z
    .locals 1

    .prologue
    .line 130
    const/16 v0, 0x3d

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static isWhiteSpace(B)Z
    .locals 1

    .prologue
    .line 126
    const/16 v0, 0x20

    if-eq p0, v0, :cond_0

    const/16 v0, 0xd

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static declared-synchronized removeWhiteSpace([B)[B
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 160
    const-class v4, Lcom/googlecode/flickrjandroid/util/Base64;

    monitor-enter v4

    if-nez p0, :cond_1

    .line 161
    const/4 p0, 0x0

    .line 184
    :cond_0
    :goto_0
    monitor-exit v4

    return-object p0

    .line 164
    :cond_1
    :try_start_0
    array-length v5, p0

    move v2, v1

    move v0, v1

    .line 166
    :goto_1
    if-lt v2, v5, :cond_2

    .line 171
    if-eq v0, v5, :cond_0

    .line 175
    new-array v2, v0, [B

    move v3, v1

    .line 178
    :goto_2
    if-lt v3, v5, :cond_4

    move-object p0, v2

    .line 184
    goto :goto_0

    .line 167
    :cond_2
    aget-byte v3, p0, v2

    invoke-static {v3}, Lcom/googlecode/flickrjandroid/util/Base64;->isWhiteSpace(B)Z

    move-result v3

    if-nez v3, :cond_3

    .line 168
    add-int/lit8 v0, v0, 0x1

    .line 166
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 179
    :cond_4
    aget-byte v0, p0, v3

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/util/Base64;->isWhiteSpace(B)Z

    move-result v0

    if-nez v0, :cond_5

    .line 182
    add-int/lit8 v0, v1, 0x1

    aget-byte v6, p0, v3

    aput-byte v6, v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    :goto_3
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    goto :goto_2

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_5
    move v0, v1

    goto :goto_3
.end method
