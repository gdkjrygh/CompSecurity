.class public final Lcom/mobvista/sdk/m/a/d/a/m;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method private static a([BI)I
    .locals 4

    .prologue
    .line 208
    add-int/lit8 v0, p1, 0x0

    aget-byte v0, p0, v0

    .line 209
    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    .line 210
    add-int/lit8 v2, p1, 0x2

    aget-byte v2, p0, v2

    .line 211
    add-int/lit8 v3, p1, 0x3

    aget-byte v3, p0, v3

    .line 212
    shl-int/lit8 v1, v1, 0x8

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    shl-int/lit8 v2, v3, 0x18

    or-int/2addr v1, v2

    or-int/2addr v0, v1

    .line 213
    return v0
.end method

.method private static a(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 47
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 48
    invoke-static {v1}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v2

    .line 49
    invoke-static {v2}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-static {v1, v4, v4, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 53
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string/jumbo v3, "mNinePatchChunk"

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 55
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 56
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .prologue
    .line 31
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 32
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 42
    :goto_0
    return-object v0

    .line 38
    :cond_0
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 39
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v0

    invoke-static {v0, v4}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BLandroid/graphics/Rect;)V

    .line 40
    new-instance v0, Landroid/graphics/drawable/NinePatchDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static a(Landroid/graphics/Bitmap;[B)V
    .locals 14

    .prologue
    const/4 v4, 0x1

    const/high16 v13, -0x1000000

    const/4 v2, 0x0

    .line 160
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    new-array v1, v0, [I

    .line 161
    array-length v3, v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    array-length v6, v1

    move-object v0, p0

    move v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move v0, v2

    .line 163
    :goto_0
    array-length v3, v1

    if-ge v0, v3, :cond_0

    .line 164
    aget v3, v1, v0

    if-ne v13, v3, :cond_4

    .line 165
    const/16 v3, 0xc

    invoke-static {p1, v3, v0}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BII)V

    .line 169
    :cond_0
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_1

    .line 170
    aget v3, v1, v0

    if-ne v13, v3, :cond_5

    .line 171
    const/16 v3, 0x10

    array-length v1, v1

    sub-int v0, v1, v0

    add-int/lit8 v0, v0, -0x2

    invoke-static {p1, v3, v0}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BII)V

    .line 176
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    new-array v6, v0, [I

    .line 177
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    add-int/lit8 v9, v0, -0x1

    array-length v12, v6

    move-object v5, p0

    move v7, v2

    move v8, v4

    move v10, v2

    move v11, v4

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 179
    :goto_2
    array-length v0, v6

    if-ge v2, v0, :cond_2

    .line 180
    aget v0, v6, v2

    if-ne v13, v0, :cond_6

    .line 181
    const/16 v0, 0x14

    invoke-static {p1, v0, v2}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BII)V

    .line 185
    :cond_2
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    :goto_3
    if-ltz v0, :cond_3

    .line 186
    aget v1, v6, v0

    if-ne v13, v1, :cond_7

    .line 187
    const/16 v1, 0x18

    array-length v2, v6

    sub-int v0, v2, v0

    add-int/lit8 v0, v0, -0x2

    invoke-static {p1, v1, v0}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BII)V

    .line 191
    :cond_3
    return-void

    .line 163
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 169
    :cond_5
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 179
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 185
    :cond_7
    add-int/lit8 v0, v0, -0x1

    goto :goto_3
.end method

.method private static a(Ljava/io/OutputStream;I)V
    .locals 1

    .prologue
    .line 194
    shr-int/lit8 v0, p1, 0x0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 195
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 196
    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 197
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 198
    return-void
.end method

.method private static a([BII)V
    .locals 2

    .prologue
    .line 201
    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x0

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 202
    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 203
    add-int/lit8 v0, p1, 0x2

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 204
    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v1, p2, 0x18

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 205
    return-void
.end method

.method private static a([BLandroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 71
    const/16 v0, 0xc

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BI)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 72
    const/16 v0, 0x10

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BI)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 73
    const/16 v0, 0x14

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BI)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 74
    const/16 v0, 0x18

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/d/a/m;->a([BI)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 75
    return-void
.end method

.method private static a(Landroid/graphics/Bitmap;)[B
    .locals 13

    .prologue
    .line 78
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 79
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 84
    new-instance v12, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v12}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 88
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x20

    if-ge v0, v1, :cond_0

    .line 89
    const/4 v1, 0x0

    invoke-virtual {v12, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 88
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 93
    :cond_0
    add-int/lit8 v0, v3, -0x2

    new-array v1, v0, [I

    .line 94
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    add-int/lit8 v6, v3, -0x2

    const/4 v7, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 95
    const/4 v0, 0x0

    aget v0, v1, v0

    const/high16 v2, -0x1000000

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    .line 96
    :goto_1
    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget v2, v1, v2

    const/high16 v3, -0x1000000

    if-ne v2, v3, :cond_3

    const/4 v2, 0x1

    .line 97
    :goto_2
    const/4 v4, 0x0

    .line 98
    const/4 v3, 0x0

    array-length v6, v1

    move v5, v3

    move v3, v4

    move v4, v8

    :goto_3
    if-ge v5, v6, :cond_4

    .line 99
    aget v7, v1, v5

    if-eq v3, v7, :cond_1

    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    invoke-static {v12, v5}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Ljava/io/OutputStream;I)V

    .line 102
    aget v3, v1, v5

    .line 98
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 95
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 96
    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    .line 105
    :cond_4
    if-eqz v2, :cond_5

    .line 106
    add-int/lit8 v4, v4, 0x1

    .line 107
    array-length v1, v1

    invoke-static {v12, v1}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Ljava/io/OutputStream;I)V

    :cond_5
    move v10, v4

    .line 109
    add-int/lit8 v1, v10, 0x1

    .line 110
    if-eqz v0, :cond_f

    .line 111
    add-int/lit8 v0, v1, -0x1

    .line 113
    :goto_4
    if-eqz v2, :cond_e

    .line 114
    add-int/lit8 v0, v0, -0x1

    move v8, v0

    .line 119
    :goto_5
    add-int/lit8 v0, v11, -0x2

    new-array v1, v0, [I

    .line 120
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    add-int/lit8 v7, v11, -0x2

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 121
    const/4 v0, 0x0

    aget v0, v1, v0

    const/high16 v2, -0x1000000

    if-ne v0, v2, :cond_7

    const/4 v0, 0x1

    .line 122
    :goto_6
    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget v2, v1, v2

    const/high16 v3, -0x1000000

    if-ne v2, v3, :cond_8

    const/4 v2, 0x1

    .line 123
    :goto_7
    const/4 v4, 0x0

    .line 124
    const/4 v3, 0x0

    array-length v6, v1

    move v5, v3

    move v3, v4

    move v4, v9

    :goto_8
    if-ge v5, v6, :cond_9

    .line 125
    aget v7, v1, v5

    if-eq v3, v7, :cond_6

    .line 126
    add-int/lit8 v4, v4, 0x1

    .line 127
    invoke-static {v12, v5}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Ljava/io/OutputStream;I)V

    .line 128
    aget v3, v1, v5

    .line 124
    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 121
    :cond_7
    const/4 v0, 0x0

    goto :goto_6

    .line 122
    :cond_8
    const/4 v2, 0x0

    goto :goto_7

    .line 131
    :cond_9
    if-eqz v2, :cond_a

    .line 132
    add-int/lit8 v4, v4, 0x1

    .line 133
    array-length v1, v1

    invoke-static {v12, v1}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Ljava/io/OutputStream;I)V

    .line 135
    :cond_a
    add-int/lit8 v1, v4, 0x1

    .line 136
    if-eqz v0, :cond_d

    .line 137
    add-int/lit8 v0, v1, -0x1

    .line 139
    :goto_9
    if-eqz v2, :cond_b

    .line 140
    add-int/lit8 v0, v0, -0x1

    .line 145
    :cond_b
    const/4 v1, 0x0

    :goto_a
    mul-int v2, v8, v0

    if-ge v1, v2, :cond_c

    .line 146
    const/4 v2, 0x1

    invoke-static {v12, v2}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Ljava/io/OutputStream;I)V

    .line 145
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    .line 150
    :cond_c
    invoke-virtual {v12}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 151
    const/4 v2, 0x0

    const/4 v3, 0x1

    aput-byte v3, v1, v2

    .line 152
    const/4 v2, 0x1

    int-to-byte v3, v10

    aput-byte v3, v1, v2

    .line 153
    const/4 v2, 0x2

    int-to-byte v3, v4

    aput-byte v3, v1, v2

    .line 154
    const/4 v2, 0x3

    mul-int/2addr v0, v8

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 155
    invoke-static {p0, v1}, Lcom/mobvista/sdk/m/a/d/a/m;->a(Landroid/graphics/Bitmap;[B)V

    .line 156
    return-object v1

    :cond_d
    move v0, v1

    goto :goto_9

    :cond_e
    move v8, v0

    goto :goto_5

    :cond_f
    move v0, v1

    goto :goto_4
.end method
