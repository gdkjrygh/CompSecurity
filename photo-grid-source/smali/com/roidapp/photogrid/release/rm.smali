.class public final Lcom/roidapp/photogrid/release/rm;
.super Lcom/roidapp/photogrid/release/ap;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private f:[Lcom/roidapp/photogrid/release/ig;

.field private g:F

.field private h:F

.field private i:I

.field private j:I

.field private k:Lcom/roidapp/photogrid/release/ml;


# direct methods
.method public constructor <init>(Landroid/content/Context;II[Lcom/roidapp/photogrid/release/ig;IIIILcom/roidapp/photogrid/release/ml;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ap;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/roidapp/photogrid/release/rm;->e:Landroid/content/Context;

    .line 34
    iput p2, p0, Lcom/roidapp/photogrid/release/rm;->a:I

    .line 35
    iput p3, p0, Lcom/roidapp/photogrid/release/rm;->b:I

    .line 36
    iput-object p4, p0, Lcom/roidapp/photogrid/release/rm;->f:[Lcom/roidapp/photogrid/release/ig;

    .line 37
    iput p7, p0, Lcom/roidapp/photogrid/release/rm;->i:I

    .line 38
    iput p5, p0, Lcom/roidapp/photogrid/release/rm;->c:I

    .line 39
    iput p6, p0, Lcom/roidapp/photogrid/release/rm;->d:I

    .line 40
    iput p8, p0, Lcom/roidapp/photogrid/release/rm;->j:I

    .line 41
    iput-object p9, p0, Lcom/roidapp/photogrid/release/rm;->k:Lcom/roidapp/photogrid/release/ml;

    .line 42
    return-void
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rm;->k:Lcom/roidapp/photogrid/release/ml;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rm;->k:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 58
    :cond_0
    return-void
.end method

.method private static a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 276
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 280
    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 16

    .prologue
    .line 189
    const/4 v1, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/rm;->f:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    if-ge v1, v2, :cond_4

    .line 192
    const/4 v3, 0x0

    .line 193
    const/4 v2, 0x0

    .line 195
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/rm;->f:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, v1

    move-object/from16 v0, p0

    iget v5, v0, Lcom/roidapp/photogrid/release/rm;->d:I

    move-object/from16 v0, p0

    iget v6, v0, Lcom/roidapp/photogrid/release/rm;->c:I

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v4, v5, v6, v7}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 196
    if-nez v3, :cond_2

    .line 197
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v4, "WideHighUtils b is null"

    invoke-direct {v1, v4}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    :catch_0
    move-exception v1

    .line 216
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_0

    .line 217
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 220
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_1

    .line 221
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 224
    :cond_1
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 225
    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "WideHighSaveUtils drawGrid OOM"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v1

    .line 200
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/photogrid/release/rm;->c:I

    move-object/from16 v0, p0

    iget v5, v0, Lcom/roidapp/photogrid/release/rm;->d:I

    sget-object v6, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v6}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 201
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 202
    move-object/from16 v0, p0

    iget v6, v0, Lcom/roidapp/photogrid/release/rm;->c:I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/roidapp/photogrid/release/rm;->d:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/rm;->f:[Lcom/roidapp/photogrid/release/ig;

    aget-object v8, v4, v1

    .line 2232
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 2233
    const/4 v4, 0x1

    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2234
    const/4 v4, 0x1

    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 2235
    const/4 v4, 0x5

    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setFlags(I)V

    .line 2236
    new-instance v10, Landroid/graphics/Matrix;

    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 2238
    int-to-float v4, v6

    int-to-float v11, v7

    .line 2264
    div-float v12, v4, v11

    .line 2265
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    int-to-float v14, v14

    div-float/2addr v13, v14

    .line 2266
    cmpl-float v12, v12, v13

    if-lez v12, :cond_3

    .line 2267
    const/high16 v11, 0x3f800000    # 1.0f

    mul-float/2addr v4, v11

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    int-to-float v11, v11

    div-float/2addr v4, v11

    .line 2241
    :goto_1
    iget v11, v8, Lcom/roidapp/photogrid/release/ig;->r:I

    int-to-float v11, v11

    iget v12, v8, Lcom/roidapp/photogrid/release/ig;->s:I

    int-to-float v12, v12

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    int-to-float v13, v13

    const/high16 v14, 0x40000000    # 2.0f

    div-float/2addr v13, v14

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    int-to-float v14, v14

    const/high16 v15, 0x40000000    # 2.0f

    div-float/2addr v14, v15

    invoke-virtual {v10, v11, v12, v13, v14}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 2243
    iget v11, v8, Lcom/roidapp/photogrid/release/ig;->p:I

    int-to-float v11, v11

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    int-to-float v12, v12

    const/high16 v13, 0x40000000    # 2.0f

    div-float/2addr v12, v13

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    int-to-float v13, v13

    const/high16 v14, 0x40000000    # 2.0f

    div-float/2addr v13, v14

    invoke-virtual {v10, v11, v12, v13}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 2245
    iget v11, v8, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v11, v4

    iget v12, v8, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v12, v4

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 2246
    iget v11, v8, Lcom/roidapp/photogrid/release/ig;->t:F

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    int-to-float v12, v12

    const/high16 v13, 0x40000000    # 2.0f

    div-float/2addr v12, v13

    iget v13, v8, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v12, v13

    mul-float/2addr v12, v4

    sub-float/2addr v11, v12

    int-to-float v6, v6

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v6, v12

    add-float/2addr v6, v11

    .line 2247
    iget v11, v8, Lcom/roidapp/photogrid/release/ig;->u:F

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    int-to-float v12, v12

    const/high16 v13, 0x40000000    # 2.0f

    div-float/2addr v12, v13

    iget v8, v8, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v8, v12

    mul-float/2addr v4, v8

    sub-float v4, v11, v4

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    add-float/2addr v4, v7

    .line 2248
    invoke-virtual {v10, v6, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 2250
    new-instance v4, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x0

    const/4 v7, 0x6

    invoke-direct {v4, v6, v7}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v5, v4}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 2251
    invoke-virtual {v5, v3, v10, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 203
    invoke-static {v3}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 205
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/photogrid/release/rm;->i:I

    packed-switch v4, :pswitch_data_0

    .line 214
    :goto_2
    invoke-static {v2}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    .line 227
    mul-int/lit8 v2, v1, 0x4

    add-int/lit8 v2, v2, 0x2a

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 189
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 2269
    :cond_3
    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v4, v11

    :try_start_2
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    int-to-float v11, v11

    div-float/2addr v4, v11

    goto/16 :goto_1

    .line 207
    :pswitch_0
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/photogrid/release/rm;->c:I

    add-int/lit8 v4, v4, 0x5

    mul-int/2addr v4, v1

    add-int/lit8 v4, v4, 0x5

    int-to-float v4, v4

    const/high16 v5, 0x40a00000    # 5.0f

    const/4 v6, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 210
    :pswitch_1
    const/high16 v4, 0x40a00000    # 5.0f

    move-object/from16 v0, p0

    iget v5, v0, Lcom/roidapp/photogrid/release/rm;->d:I

    add-int/lit8 v5, v5, 0x5

    mul-int/2addr v5, v1

    add-int/lit8 v5, v5, 0x5

    int-to-float v5, v5

    const/4 v6, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    .line 229
    :cond_4
    return-void

    .line 205
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;)[Ljava/lang/String;
    .locals 12

    .prologue
    const/16 v11, 0x12

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 100
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 101
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rm;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 102
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-ne v0, v4, :cond_4

    .line 106
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rm;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-direct {v0, v4, v3}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 108
    :try_start_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->a()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 122
    :cond_0
    const/16 v0, 0x50

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 123
    new-instance v0, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PhotoGrid_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 134
    :cond_1
    const/16 v1, 0x51

    :try_start_2
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 135
    const/4 v1, 0x0

    .line 136
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v4

    if-nez v4, :cond_7

    .line 137
    :cond_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    if-le v4, v11, :cond_6

    .line 139
    :try_start_3
    new-instance v4, Lcom/roidapp/photogrid/common/ae;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/rm;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 140
    invoke-virtual {v4}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;

    move-result-object v1

    .line 141
    if-nez v1, :cond_5

    .line 142
    new-instance v0, Ljava/io/IOException;

    const-string v4, "4.4 IOException"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 145
    :catch_0
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rm;->e:Landroid/content/Context;

    const v5, 0x7f07002e

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 148
    new-instance v0, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PhotoGrid_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 150
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 156
    :try_start_6
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rm;->e:Landroid/content/Context;

    invoke-static {v2, v4}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 158
    if-eqz v1, :cond_3

    .line 160
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 161
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 164
    :cond_3
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 173
    :goto_0
    const/16 v0, 0x64

    invoke-virtual {p1, p2, v0, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 174
    const/16 v0, 0x5a

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 175
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 176
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 178
    const/16 v0, 0x5c

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 179
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 180
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "0"

    aput-object v3, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 184
    :goto_1
    return-object v0

    .line 110
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 111
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 113
    new-array v0, v10, [Ljava/lang/String;

    const-string v2, "2"

    aput-object v2, v0, v8

    aput-object v1, v0, v9

    goto :goto_1

    .line 116
    :cond_4
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 118
    new-array v0, v10, [Ljava/lang/String;

    const-string v2, "2"

    aput-object v2, v0, v8

    aput-object v1, v0, v9

    goto :goto_1

    .line 127
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 128
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v1, v11, :cond_1

    .line 129
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 130
    new-array v0, v10, [Ljava/lang/String;

    const-string v1, "1"

    aput-object v1, v0, v8

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v9

    goto :goto_1

    :cond_5
    move-object v2, v0

    .line 165
    goto :goto_0

    .line 152
    :catch_3
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 153
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 154
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "1"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_1

    .line 181
    :catch_4
    move-exception v0

    .line 182
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 183
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 184
    new-array v0, v10, [Ljava/lang/String;

    const-string v1, "2"

    aput-object v1, v0, v8

    const-string v1, ""

    aput-object v1, v0, v9

    goto :goto_1

    .line 167
    :cond_6
    :try_start_8
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;)V

    .line 168
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "1"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_1

    .line 171
    :cond_7
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    move-object v2, v0

    goto/16 :goto_0
.end method


# virtual methods
.method public final b()V
    .locals 1

    .prologue
    const/high16 v0, 0x40a00000    # 5.0f

    .line 45
    iput v0, p0, Lcom/roidapp/photogrid/release/rm;->h:F

    .line 46
    iput v0, p0, Lcom/roidapp/photogrid/release/rm;->g:F

    .line 48
    return-void
.end method

.method public final c()[Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 63
    const/4 v1, 0x0

    .line 65
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/rm;->a:I

    iget v2, p0, Lcom/roidapp/photogrid/release/rm;->b:I

    sget-object v3, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 66
    const/16 v0, 0x19

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 67
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 70
    iget v0, p0, Lcom/roidapp/photogrid/release/rm;->j:I

    if-ne v0, v5, :cond_1

    .line 71
    const-string v2, ".png"

    .line 72
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 77
    :goto_0
    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 78
    const/16 v4, 0x1a

    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 80
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Canvas;)V

    .line 82
    invoke-direct {p0, v1, v0, v2}, Lcom/roidapp/photogrid/release/rm;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 84
    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/roidapp/photogrid/release/rm;->j:I

    if-eq v2, v5, :cond_0

    .line 85
    const/4 v2, 0x1

    aget-object v2, v0, v2

    .line 1284
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x5

    if-le v3, v4, :cond_0

    .line 1287
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {v2}, Lcom/roidapp/photogrid/common/bp;->a(Ljava/lang/String;)V

    .line 87
    :cond_0
    const/16 v2, 0x5a

    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/rm;->a(I)V

    .line 96
    return-object v0

    .line 74
    :cond_1
    const-string v2, ".jpg"

    .line 75
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 88
    :catch_0
    move-exception v0

    .line 89
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_2

    .line 90
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 93
    :cond_2
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 94
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "WideHighSaveUtils doSave OOM"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
.end method
