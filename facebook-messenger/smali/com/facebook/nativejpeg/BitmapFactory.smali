.class public Lcom/facebook/nativejpeg/BitmapFactory;
.super Ljava/lang/Object;
.source "BitmapFactory.java"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/nativejpeg/BitmapFactory;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    return-void
.end method

.method private static a(Ljava/io/InputStream;Landroid/graphics/Rect;Lcom/facebook/nativejpeg/b;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 12

    .prologue
    .line 256
    if-nez p2, :cond_0

    new-instance p2, Lcom/facebook/nativejpeg/b;

    invoke-direct {p2}, Lcom/facebook/nativejpeg/b;-><init>()V

    .line 258
    :cond_0
    iget-boolean v0, p2, Lcom/facebook/nativejpeg/b;->inJustDecodeBounds:Z

    if-eqz v0, :cond_2

    .line 259
    invoke-static {p3, p1, p2}, Lcom/facebook/nativejpeg/BitmapFactory;->b(Ljava/lang/String;Landroid/graphics/Rect;Lcom/facebook/nativejpeg/b;)V

    .line 260
    const/4 v0, 0x0

    .line 373
    :cond_1
    :goto_0
    return-object v0

    .line 263
    :cond_2
    const/4 v7, 0x0

    .line 264
    const/4 v6, 0x1

    .line 265
    const/4 v1, 0x0

    .line 266
    const/4 v2, -0x1

    .line 267
    const/4 v3, -0x1

    .line 268
    const/4 v4, 0x0

    .line 270
    new-instance v0, Ljava/io/BufferedInputStream;

    const/16 v5, 0x1000

    invoke-direct {v0, p0, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 271
    const/16 v5, 0x80

    new-array v8, v5, [B

    .line 275
    const/16 v5, 0x80

    :try_start_0
    invoke-virtual {v0, v5}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 276
    const/4 v5, 0x0

    const/16 v9, 0x80

    invoke-virtual {v0, v8, v5, v9}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v5

    .line 277
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 282
    :goto_1
    if-gtz v5, :cond_3

    .line 283
    const/4 v0, 0x0

    goto :goto_0

    .line 278
    :catch_0
    move-exception v5

    .line 279
    const/4 v5, -0x1

    goto :goto_1

    .line 286
    :cond_3
    if-eqz p2, :cond_4

    .line 287
    iget v2, p2, Lcom/facebook/nativejpeg/b;->a:I

    .line 288
    iget v3, p2, Lcom/facebook/nativejpeg/b;->b:I

    .line 289
    iget-boolean v1, p2, Lcom/facebook/nativejpeg/b;->e:Z

    if-eqz v1, :cond_6

    .line 290
    const/4 v1, 0x2

    .line 296
    :goto_2
    iget-object v4, p2, Lcom/facebook/nativejpeg/b;->i:Landroid/graphics/Bitmap;

    move v11, v1

    move-object v1, v4

    move v4, v11

    .line 299
    :cond_4
    sget-object v5, Lcom/facebook/nativejpeg/a;->UNKNOWN:Lcom/facebook/nativejpeg/a;

    .line 300
    const/4 v9, 0x0

    aget-byte v9, v8, v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_8

    const/4 v9, 0x1

    aget-byte v9, v8, v9

    const/16 v10, -0x28

    if-ne v9, v10, :cond_8

    const/4 v9, 0x2

    aget-byte v9, v8, v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_8

    .line 302
    sget-object v5, Lcom/facebook/nativejpeg/a;->JPEG:Lcom/facebook/nativejpeg/a;

    .line 314
    :cond_5
    :goto_3
    sget-boolean v8, Lcom/facebook/nativejpeg/BitmapFactory;->a:Z

    if-eqz v8, :cond_13

    iget-boolean v8, p2, Lcom/facebook/nativejpeg/b;->f:Z

    if-eqz v8, :cond_13

    sget-object v8, Lcom/facebook/nativejpeg/a;->JPEG:Lcom/facebook/nativejpeg/a;

    if-ne v5, v8, :cond_13

    .line 315
    iget-object v5, p2, Lcom/facebook/nativejpeg/b;->g:Ljava/io/OutputStream;

    if-eqz v5, :cond_b

    .line 316
    iget-object v1, p2, Lcom/facebook/nativejpeg/b;->g:Ljava/io/OutputStream;

    iget v5, p2, Lcom/facebook/nativejpeg/b;->h:I

    invoke-static/range {v0 .. v5}, Lcom/facebook/nativejpeg/BitmapFactory;->native_transcodeStream(Ljava/io/InputStream;Ljava/io/OutputStream;IIII)I

    .line 318
    const/4 v0, 0x0

    goto :goto_0

    .line 291
    :cond_6
    iget-boolean v1, p2, Lcom/facebook/nativejpeg/b;->d:Z

    if-eqz v1, :cond_7

    .line 292
    const/4 v1, 0x1

    goto :goto_2

    .line 294
    :cond_7
    const/4 v1, 0x0

    goto :goto_2

    .line 303
    :cond_8
    const/4 v9, 0x0

    aget-byte v9, v8, v9

    const/16 v10, -0x77

    if-ne v9, v10, :cond_9

    const/4 v9, 0x1

    aget-byte v9, v8, v9

    const/16 v10, 0x50

    if-ne v9, v10, :cond_9

    const/4 v9, 0x2

    aget-byte v9, v8, v9

    const/16 v10, 0x4e

    if-ne v9, v10, :cond_9

    const/4 v9, 0x3

    aget-byte v9, v8, v9

    const/16 v10, 0x47

    if-ne v9, v10, :cond_9

    const/4 v9, 0x4

    aget-byte v9, v8, v9

    const/16 v10, 0xd

    if-ne v9, v10, :cond_9

    const/4 v9, 0x5

    aget-byte v9, v8, v9

    const/16 v10, 0xa

    if-ne v9, v10, :cond_9

    const/4 v9, 0x6

    aget-byte v9, v8, v9

    const/16 v10, 0x1a

    if-ne v9, v10, :cond_9

    const/4 v9, 0x7

    aget-byte v9, v8, v9

    const/16 v10, 0xa

    if-ne v9, v10, :cond_9

    .line 307
    sget-object v5, Lcom/facebook/nativejpeg/a;->PNG:Lcom/facebook/nativejpeg/a;

    goto :goto_3

    .line 308
    :cond_9
    const/4 v9, 0x0

    aget-byte v9, v8, v9

    const/16 v10, 0x47

    if-ne v9, v10, :cond_5

    const/4 v9, 0x1

    aget-byte v9, v8, v9

    const/16 v10, 0x49

    if-ne v9, v10, :cond_5

    const/4 v9, 0x2

    aget-byte v9, v8, v9

    const/16 v10, 0x46

    if-ne v9, v10, :cond_5

    const/4 v9, 0x3

    aget-byte v9, v8, v9

    const/16 v10, 0x38

    if-ne v9, v10, :cond_5

    const/4 v9, 0x4

    aget-byte v9, v8, v9

    const/16 v10, 0x37

    if-eq v9, v10, :cond_a

    const/4 v9, 0x4

    aget-byte v9, v8, v9

    const/16 v10, 0x39

    if-ne v9, v10, :cond_5

    :cond_a
    const/4 v9, 0x5

    aget-byte v8, v8, v9

    const/16 v9, 0x61

    if-ne v8, v9, :cond_5

    .line 311
    sget-object v5, Lcom/facebook/nativejpeg/a;->GIF:Lcom/facebook/nativejpeg/a;

    goto/16 :goto_3

    .line 320
    :cond_b
    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/nativejpeg/BitmapFactory;->native_decodeStream(Ljava/io/InputStream;Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 321
    if-eqz v5, :cond_12

    .line 322
    const/4 v1, 0x0

    move v11, v1

    move-object v1, v5

    move v5, v11

    .line 327
    :goto_4
    if-eqz v5, :cond_11

    .line 328
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 330
    iget-boolean v5, p2, Lcom/facebook/nativejpeg/b;->inJustDecodeBounds:Z

    if-eqz v5, :cond_f

    .line 331
    const/16 v5, 0x1000

    invoke-virtual {v0, v5}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 332
    const/4 v5, 0x0

    invoke-static {v0, v5, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 336
    :goto_5
    invoke-static {v0, p1, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 338
    iget-object v1, p2, Lcom/facebook/nativejpeg/b;->g:Ljava/io/OutputStream;

    if-eqz v1, :cond_c

    .line 339
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    iget v5, p2, Lcom/facebook/nativejpeg/b;->h:I

    iget-object v6, p2, Lcom/facebook/nativejpeg/b;->g:Ljava/io/OutputStream;

    invoke-virtual {v0, v1, v5, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 343
    :cond_c
    :goto_6
    if-eqz v0, :cond_1

    .line 344
    if-lez v2, :cond_d

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-gt v1, v2, :cond_e

    :cond_d
    if-lez v2, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-le v1, v2, :cond_1

    .line 347
    :cond_e
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 348
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 350
    const/4 v1, 0x0

    .line 351
    const/4 v9, 0x0

    .line 357
    sget-boolean v5, Lcom/facebook/nativejpeg/BitmapFactory;->a:Z

    if-eqz v5, :cond_10

    .line 359
    iget-object v1, p2, Lcom/facebook/nativejpeg/b;->i:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/nativejpeg/BitmapFactory;->native_copyBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v0

    goto/16 :goto_0

    .line 334
    :cond_f
    const/4 v5, 0x1

    iput v5, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_5

    .line 361
    :cond_10
    int-to-float v2, v2

    int-to-float v4, v7

    div-float/2addr v2, v4

    .line 362
    int-to-float v3, v3

    int-to-float v4, v8

    div-float/2addr v3, v4

    .line 364
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 365
    invoke-virtual {v5, v2, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 367
    const/4 v6, 0x1

    move v2, v9

    move v3, v7

    move v4, v8

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    goto/16 :goto_0

    :cond_11
    move-object v0, v1

    goto :goto_6

    :cond_12
    move-object v1, v5

    move v5, v6

    goto :goto_4

    :cond_13
    move v5, v6

    move-object v1, v7

    goto :goto_4
.end method

.method public static a(Ljava/lang/String;Landroid/graphics/Rect;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 433
    .line 437
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    :try_start_1
    invoke-static {v1, p1, p2, p0}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/io/InputStream;Landroid/graphics/Rect;Lcom/facebook/nativejpeg/b;Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 442
    if-eqz v1, :cond_0

    .line 444
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 451
    :cond_0
    :goto_0
    return-object v0

    .line 439
    :catch_0
    move-exception v1

    move-object v1, v0

    .line 442
    :goto_1
    if-eqz v1, :cond_0

    .line 444
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    .line 445
    :catch_1
    move-exception v1

    goto :goto_0

    .line 442
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_2
    if-eqz v1, :cond_1

    .line 444
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 447
    :cond_1
    :goto_3
    throw v0

    .line 445
    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_3

    .line 442
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 439
    :catch_4
    move-exception v2

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/lang/String;Landroid/graphics/Rect;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/String;Landroid/graphics/Rect;Lcom/facebook/nativejpeg/b;)V
    .locals 3

    .prologue
    .line 238
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 240
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 241
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 242
    invoke-static {v0, p1, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 243
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iput v2, p2, Lcom/facebook/nativejpeg/b;->outWidth:I

    .line 244
    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iput v1, p2, Lcom/facebook/nativejpeg/b;->outHeight:I

    .line 246
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 250
    :goto_0
    return-void

    .line 247
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static native native_copyBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
.end method

.method private static native native_decodeByteArray([BIILandroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
.end method

.method private static native native_decodeFile(Ljava/lang/String;Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
.end method

.method private static native native_decodeStream(Ljava/io/InputStream;Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
.end method

.method private static native native_transcodeStream(Ljava/io/InputStream;Ljava/io/OutputStream;IIII)I
.end method
