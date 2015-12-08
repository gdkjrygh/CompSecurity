.class public final Lcom/roidapp/imagelib/d/e;
.super Lcom/roidapp/imagelib/d/a;
.source "SourceFile"


# instance fields
.field b:I

.field public c:Z

.field public d:I

.field public e:I

.field public f:Landroid/graphics/Bitmap$Config;

.field public g:I

.field public h:I

.field public i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0}, Lcom/roidapp/imagelib/d/a;-><init>()V

    .line 11
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/imagelib/d/e;->b:I

    .line 12
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/d/e;->c:Z

    .line 13
    iput v1, p0, Lcom/roidapp/imagelib/d/e;->d:I

    iput v1, p0, Lcom/roidapp/imagelib/d/e;->e:I

    return-void
.end method

.method private a([IIII)V
    .locals 32

    .prologue
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    .line 73
    if-gtz p4, :cond_0

    .line 285
    :goto_0
    return-void

    .line 77
    :cond_0
    add-int/lit8 v17, p2, -0x1

    .line 78
    add-int/lit8 v20, p3, -0x1

    .line 79
    mul-int v2, p2, p3

    .line 80
    add-int v3, p4, p4

    add-int/lit8 v21, v3, 0x1

    .line 82
    new-array v0, v2, [S

    move-object/from16 v22, v0

    .line 83
    new-array v0, v2, [S

    move-object/from16 v23, v0

    .line 84
    new-array v0, v2, [S

    move-object/from16 v24, v0

    .line 86
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->max(II)I

    move-result v2

    new-array v0, v2, [I

    move-object/from16 v25, v0

    .line 88
    add-int/lit8 v2, v21, 0x1

    shr-int/lit8 v2, v2, 0x1

    .line 89
    mul-int v3, v2, v2

    .line 90
    mul-int/lit16 v2, v3, 0x100

    new-array v0, v2, [S

    move-object/from16 v26, v0

    .line 91
    const/4 v2, 0x0

    :goto_1
    mul-int/lit16 v4, v3, 0x100

    if-ge v2, v4, :cond_1

    .line 92
    div-int v4, v2, v3

    int-to-short v4, v4

    aput-short v4, v26, v2

    .line 91
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 95
    :cond_1
    const/4 v3, 0x0

    .line 97
    const/4 v2, 0x3

    move/from16 v0, v21

    filled-new-array {v0, v2}, [I

    move-result-object v2

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[I

    .line 102
    add-int/lit8 v27, p4, 0x1

    .line 106
    const/4 v4, 0x0

    move v15, v3

    move v9, v3

    move/from16 v16, v4

    :goto_2
    move/from16 v0, v16

    move/from16 v1, p3

    if-ge v0, v1, :cond_7

    .line 107
    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lcom/roidapp/imagelib/d/e;->e:I

    .line 108
    const/4 v3, 0x0

    .line 109
    move/from16 v0, p4

    neg-int v4, v0

    move v5, v3

    move v6, v3

    move v7, v3

    move v8, v3

    move v10, v4

    move v11, v3

    move v12, v3

    move v13, v3

    move v4, v3

    :goto_3
    move/from16 v0, p4

    if-gt v10, v0, :cond_3

    .line 110
    const/4 v14, 0x0

    invoke-static {v10, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    move/from16 v0, v17

    invoke-static {v0, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    add-int/2addr v14, v9

    aget v14, p1, v14

    .line 111
    add-int v28, v10, p4

    aget-object v28, v2, v28

    .line 112
    const/16 v29, 0x0

    const/high16 v30, 0xff0000

    and-int v30, v30, v14

    shr-int/lit8 v30, v30, 0x10

    aput v30, v28, v29

    .line 113
    const/16 v29, 0x1

    const v30, 0xff00

    and-int v30, v30, v14

    shr-int/lit8 v30, v30, 0x8

    aput v30, v28, v29

    .line 114
    const/16 v29, 0x2

    and-int/lit16 v14, v14, 0xff

    aput v14, v28, v29

    .line 115
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v14

    sub-int v14, v27, v14

    .line 116
    const/16 v29, 0x0

    aget v29, v28, v29

    mul-int v29, v29, v14

    add-int v13, v13, v29

    .line 117
    const/16 v29, 0x1

    aget v29, v28, v29

    mul-int v29, v29, v14

    add-int v12, v12, v29

    .line 118
    const/16 v29, 0x2

    aget v29, v28, v29

    mul-int v14, v14, v29

    add-int/2addr v11, v14

    .line 119
    if-lez v10, :cond_2

    .line 120
    const/4 v14, 0x0

    aget v14, v28, v14

    add-int/2addr v5, v14

    .line 121
    const/4 v14, 0x1

    aget v14, v28, v14

    add-int/2addr v4, v14

    .line 122
    const/4 v14, 0x2

    aget v14, v28, v14

    add-int/2addr v3, v14

    .line 109
    :goto_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 124
    :cond_2
    const/4 v14, 0x0

    aget v14, v28, v14

    add-int/2addr v8, v14

    .line 125
    const/4 v14, 0x1

    aget v14, v28, v14

    add-int/2addr v7, v14

    .line 126
    const/4 v14, 0x2

    aget v14, v28, v14

    add-int/2addr v6, v14

    goto :goto_4

    .line 131
    :cond_3
    const/4 v10, 0x0

    move v14, v10

    move/from16 v10, p4

    :goto_5
    move/from16 v0, p2

    if-ge v14, v0, :cond_6

    .line 132
    move-object/from16 v0, p0

    iput v14, v0, Lcom/roidapp/imagelib/d/e;->d:I

    .line 134
    move-object/from16 v0, v26

    array-length v0, v0

    move/from16 v28, v0

    move/from16 v0, v28

    if-ge v13, v0, :cond_5

    move-object/from16 v0, v26

    array-length v0, v0

    move/from16 v28, v0

    move/from16 v0, v28

    if-ge v12, v0, :cond_5

    move-object/from16 v0, v26

    array-length v0, v0

    move/from16 v28, v0

    move/from16 v0, v28

    if-ge v11, v0, :cond_5

    .line 136
    aget-short v28, v26, v13

    aput-short v28, v22, v9

    .line 137
    aget-short v28, v26, v12

    aput-short v28, v23, v9

    .line 138
    aget-short v28, v26, v11

    aput-short v28, v24, v9

    .line 140
    sub-int/2addr v13, v8

    .line 141
    sub-int/2addr v12, v7

    .line 142
    sub-int/2addr v11, v6

    .line 144
    sub-int v28, v10, p4

    add-int v28, v28, v21

    .line 145
    rem-int v28, v28, v21

    aget-object v28, v2, v28

    .line 147
    const/16 v29, 0x0

    aget v29, v28, v29

    sub-int v8, v8, v29

    .line 148
    const/16 v29, 0x1

    aget v29, v28, v29

    sub-int v7, v7, v29

    .line 149
    const/16 v29, 0x2

    aget v29, v28, v29

    sub-int v6, v6, v29

    .line 151
    if-nez v16, :cond_4

    .line 152
    add-int v29, v14, p4

    add-int/lit8 v29, v29, 0x1

    move/from16 v0, v29

    move/from16 v1, v17

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v29

    aput v29, v25, v14

    .line 154
    :cond_4
    aget v29, v25, v14

    add-int v29, v29, v15

    aget v29, p1, v29

    .line 156
    const/16 v30, 0x0

    const/high16 v31, 0xff0000

    and-int v31, v31, v29

    shr-int/lit8 v31, v31, 0x10

    aput v31, v28, v30

    .line 157
    const/16 v30, 0x1

    const v31, 0xff00

    and-int v31, v31, v29

    shr-int/lit8 v31, v31, 0x8

    aput v31, v28, v30

    .line 158
    const/16 v30, 0x2

    move/from16 v0, v29

    and-int/lit16 v0, v0, 0xff

    move/from16 v29, v0

    aput v29, v28, v30

    .line 160
    const/16 v29, 0x0

    aget v29, v28, v29

    add-int v5, v5, v29

    .line 161
    const/16 v29, 0x1

    aget v29, v28, v29

    add-int v4, v4, v29

    .line 162
    const/16 v29, 0x2

    aget v28, v28, v29

    add-int v3, v3, v28

    .line 164
    add-int/2addr v13, v5

    .line 165
    add-int/2addr v12, v4

    .line 166
    add-int/2addr v11, v3

    .line 168
    add-int/lit8 v10, v10, 0x1

    rem-int v10, v10, v21

    .line 169
    rem-int v28, v10, v21

    aget-object v28, v2, v28

    .line 171
    const/16 v29, 0x0

    aget v29, v28, v29

    add-int v8, v8, v29

    .line 172
    const/16 v29, 0x1

    aget v29, v28, v29

    add-int v7, v7, v29

    .line 173
    const/16 v29, 0x2

    aget v29, v28, v29

    add-int v6, v6, v29

    .line 175
    const/16 v29, 0x0

    aget v29, v28, v29

    sub-int v5, v5, v29

    .line 176
    const/16 v29, 0x1

    aget v29, v28, v29

    sub-int v4, v4, v29

    .line 177
    const/16 v29, 0x2

    aget v28, v28, v29

    sub-int v3, v3, v28

    .line 179
    add-int/lit8 v9, v9, 0x1

    .line 131
    :cond_5
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_5

    .line 181
    :cond_6
    add-int v3, v15, p2

    .line 106
    add-int/lit8 v4, v16, 0x1

    move v15, v3

    move/from16 v16, v4

    goto/16 :goto_2

    .line 183
    :cond_7
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lcom/roidapp/imagelib/d/e;->c:Z

    .line 184
    const/4 v14, 0x0

    :goto_6
    move/from16 v0, p2

    if-ge v14, v0, :cond_e

    .line 185
    move-object/from16 v0, p0

    iput v14, v0, Lcom/roidapp/imagelib/d/e;->d:I

    .line 186
    const/4 v4, 0x0

    .line 187
    move/from16 v0, p4

    neg-int v3, v0

    mul-int v5, v3, p2

    .line 188
    move/from16 v0, p4

    neg-int v3, v0

    move v6, v4

    move v7, v4

    move v8, v4

    move v9, v4

    move v10, v3

    move v11, v4

    move v12, v4

    move v13, v4

    move v3, v5

    move v5, v4

    :goto_7
    move/from16 v0, p4

    if-gt v10, v0, :cond_a

    .line 189
    const/4 v15, 0x0

    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    move-result v15

    add-int/2addr v15, v14

    .line 191
    add-int v16, v10, p4

    aget-object v16, v2, v16

    .line 193
    const/16 v17, 0x0

    aget-short v28, v22, v15

    aput v28, v16, v17

    .line 194
    const/16 v17, 0x1

    aget-short v28, v23, v15

    aput v28, v16, v17

    .line 195
    const/16 v17, 0x2

    aget-short v28, v24, v15

    aput v28, v16, v17

    .line 197
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v17

    sub-int v17, v27, v17

    .line 199
    aget-short v28, v22, v15

    mul-int v28, v28, v17

    add-int v13, v13, v28

    .line 200
    aget-short v28, v23, v15

    mul-int v28, v28, v17

    add-int v12, v12, v28

    .line 201
    aget-short v15, v24, v15

    mul-int v15, v15, v17

    add-int/2addr v11, v15

    .line 203
    if-lez v10, :cond_9

    .line 204
    const/4 v15, 0x0

    aget v15, v16, v15

    add-int/2addr v6, v15

    .line 205
    const/4 v15, 0x1

    aget v15, v16, v15

    add-int/2addr v5, v15

    .line 206
    const/4 v15, 0x2

    aget v15, v16, v15

    add-int/2addr v4, v15

    .line 213
    :goto_8
    move/from16 v0, v20

    if-ge v10, v0, :cond_8

    .line 214
    add-int v3, v3, p2

    .line 188
    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    .line 208
    :cond_9
    const/4 v15, 0x0

    aget v15, v16, v15

    add-int/2addr v9, v15

    .line 209
    const/4 v15, 0x1

    aget v15, v16, v15

    add-int/2addr v8, v15

    .line 210
    const/4 v15, 0x2

    aget v15, v16, v15

    add-int/2addr v7, v15

    goto :goto_8

    .line 219
    :cond_a
    const/4 v3, 0x0

    move/from16 v10, p4

    move v15, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v14

    :goto_9
    move/from16 v0, p3

    if-ge v15, v0, :cond_d

    .line 220
    move-object/from16 v0, p0

    iput v15, v0, Lcom/roidapp/imagelib/d/e;->e:I

    .line 222
    move-object/from16 v0, v26

    array-length v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    if-ge v13, v0, :cond_c

    move-object/from16 v0, v26

    array-length v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    if-ge v12, v0, :cond_c

    move-object/from16 v0, v26

    array-length v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    if-ge v11, v0, :cond_c

    .line 224
    const/high16 v16, -0x1000000

    aget-short v17, v26, v13

    shl-int/lit8 v17, v17, 0x10

    or-int v16, v16, v17

    aget-short v17, v26, v12

    shl-int/lit8 v17, v17, 0x8

    or-int v16, v16, v17

    aget-short v17, v26, v11

    or-int v16, v16, v17

    aput v16, p1, v9

    .line 226
    sub-int/2addr v13, v8

    .line 227
    sub-int/2addr v12, v7

    .line 228
    sub-int/2addr v11, v6

    .line 230
    sub-int v16, v10, p4

    add-int v16, v16, v21

    .line 231
    rem-int v16, v16, v21

    aget-object v16, v2, v16

    .line 233
    const/16 v17, 0x0

    aget v17, v16, v17

    sub-int v8, v8, v17

    .line 234
    const/16 v17, 0x1

    aget v17, v16, v17

    sub-int v7, v7, v17

    .line 235
    const/16 v17, 0x2

    aget v17, v16, v17

    sub-int v6, v6, v17

    .line 237
    if-nez v14, :cond_b

    .line 238
    add-int v17, v15, v27

    move/from16 v0, v17

    move/from16 v1, v20

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v17

    mul-int v17, v17, p2

    aput v17, v25, v15

    .line 240
    :cond_b
    aget v17, v25, v15

    add-int v17, v17, v14

    .line 242
    const/16 v28, 0x0

    aget-short v29, v22, v17

    aput v29, v16, v28

    .line 243
    const/16 v28, 0x1

    aget-short v29, v23, v17

    aput v29, v16, v28

    .line 244
    const/16 v28, 0x2

    aget-short v17, v24, v17

    aput v17, v16, v28

    .line 246
    const/16 v17, 0x0

    aget v17, v16, v17

    add-int v5, v5, v17

    .line 247
    const/16 v17, 0x1

    aget v17, v16, v17

    add-int v4, v4, v17

    .line 248
    const/16 v17, 0x2

    aget v16, v16, v17

    add-int v3, v3, v16

    .line 250
    add-int/2addr v13, v5

    .line 251
    add-int/2addr v12, v4

    .line 252
    add-int/2addr v11, v3

    .line 254
    add-int/lit8 v10, v10, 0x1

    rem-int v10, v10, v21

    .line 255
    aget-object v16, v2, v10

    .line 257
    const/16 v17, 0x0

    aget v17, v16, v17

    add-int v8, v8, v17

    .line 258
    const/16 v17, 0x1

    aget v17, v16, v17

    add-int v7, v7, v17

    .line 259
    const/16 v17, 0x2

    aget v17, v16, v17

    add-int v6, v6, v17

    .line 261
    const/16 v17, 0x0

    aget v17, v16, v17

    sub-int v5, v5, v17

    .line 262
    const/16 v17, 0x1

    aget v17, v16, v17

    sub-int v4, v4, v17

    .line 263
    const/16 v17, 0x2

    aget v16, v16, v17

    sub-int v3, v3, v16

    .line 265
    add-int v9, v9, p2

    .line 219
    :cond_c
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_9

    .line 184
    :cond_d
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_6

    .line 273
    :cond_e
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 275
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 276
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "StackBlurFilter time="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long v2, v2, v18

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto/16 :goto_0
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 30
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v8

    .line 32
    mul-int v9, v8, v7

    .line 33
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/d/e;->f:Landroid/graphics/Bitmap$Config;

    .line 34
    mul-int v0, v3, v7

    new-array v1, v0, [I

    move-object v0, p1

    move v4, v2

    move v5, v2

    move v6, v3

    .line 35
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "BlurExp:/"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v4, p0, Lcom/roidapp/imagelib/d/e;->b:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/imagelib/d/e;->f:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/imagelib/d/e;->i:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1055
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1059
    iput v3, p0, Lcom/roidapp/imagelib/d/e;->g:I

    .line 1060
    iput v7, p0, Lcom/roidapp/imagelib/d/e;->h:I

    .line 1062
    iget v0, p0, Lcom/roidapp/imagelib/d/e;->b:I

    invoke-direct {p0, v1, v3, v7, v0}, Lcom/roidapp/imagelib/d/e;->a([IIII)V

    .line 1064
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 1065
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v6, "StackBlurFilter used time="

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long v4, v8, v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    move v4, v2

    move v5, v2

    move v6, v3

    .line 45
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 47
    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 19
    iput p1, p0, Lcom/roidapp/imagelib/d/e;->b:I

    .line 20
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 23
    if-eqz p1, :cond_0

    .line 24
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/d/e;->i:Ljava/lang/String;

    .line 25
    :cond_0
    return-void
.end method
