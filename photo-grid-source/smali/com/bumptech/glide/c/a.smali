.class public final Lcom/bumptech/glide/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/Integer;

.field private d:I

.field private e:I

.field private f:I

.field private g:Z

.field private h:Ljava/io/OutputStream;

.field private i:Landroid/graphics/Bitmap;

.field private j:[B

.field private k:[B

.field private l:I

.field private m:[B

.field private n:[Z

.field private o:I

.field private p:I

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:I

.field private u:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/c/a;->c:Ljava/lang/Integer;

    .line 52
    iput v2, p0, Lcom/bumptech/glide/c/a;->e:I

    .line 54
    iput v1, p0, Lcom/bumptech/glide/c/a;->f:I

    .line 56
    iput-boolean v1, p0, Lcom/bumptech/glide/c/a;->g:Z

    .line 70
    const/16 v0, 0x100

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/bumptech/glide/c/a;->n:[Z

    .line 72
    const/4 v0, 0x7

    iput v0, p0, Lcom/bumptech/glide/c/a;->o:I

    .line 74
    iput v2, p0, Lcom/bumptech/glide/c/a;->p:I

    .line 76
    iput-boolean v1, p0, Lcom/bumptech/glide/c/a;->q:Z

    .line 78
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/c/a;->r:Z

    .line 80
    iput-boolean v1, p0, Lcom/bumptech/glide/c/a;->s:Z

    .line 82
    const/16 v0, 0xa

    iput v0, p0, Lcom/bumptech/glide/c/a;->t:I

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 527
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 528
    iget-object v1, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 527
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 530
    :cond_0
    return-void
.end method

.method private b(I)I
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 347
    iget-object v1, p0, Lcom/bumptech/glide/c/a;->m:[B

    if-nez v1, :cond_1

    .line 348
    const/4 v3, -0x1

    .line 367
    :cond_0
    return v3

    .line 349
    :cond_1
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v4

    .line 350
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v5

    .line 351
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    .line 353
    const/high16 v1, 0x1000000

    .line 354
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->m:[B

    array-length v7, v2

    move v3, v0

    .line 355
    :goto_0
    if-ge v0, v7, :cond_0

    .line 356
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->m:[B

    add-int/lit8 v8, v0, 0x1

    aget-byte v0, v2, v0

    and-int/lit16 v0, v0, 0xff

    sub-int v0, v4, v0

    .line 357
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->m:[B

    add-int/lit8 v9, v8, 0x1

    aget-byte v2, v2, v8

    and-int/lit16 v2, v2, 0xff

    sub-int v2, v5, v2

    .line 358
    iget-object v8, p0, Lcom/bumptech/glide/c/a;->m:[B

    aget-byte v8, v8, v9

    and-int/lit16 v8, v8, 0xff

    sub-int v8, v6, v8

    .line 359
    mul-int/2addr v0, v0

    mul-int/2addr v2, v2

    add-int/2addr v0, v2

    mul-int v2, v8, v8

    add-int/2addr v0, v2

    .line 360
    div-int/lit8 v2, v9, 0x3

    .line 361
    iget-object v8, p0, Lcom/bumptech/glide/c/a;->n:[Z

    aget-boolean v8, v8, v2

    if-eqz v8, :cond_2

    if-ge v0, v1, :cond_2

    move v1, v2

    .line 365
    :goto_1
    add-int/lit8 v2, v9, 0x1

    move v3, v1

    move v1, v0

    move v0, v2

    .line 366
    goto :goto_0

    :cond_2
    move v0, v1

    move v1, v3

    goto :goto_1
.end method

.method private b()V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 311
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->j:[B

    array-length v0, v0

    .line 312
    div-int/lit8 v3, v0, 0x3

    .line 313
    new-array v2, v3, [B

    iput-object v2, p0, Lcom/bumptech/glide/c/a;->k:[B

    .line 314
    new-instance v4, Lcom/bumptech/glide/c/c;

    iget-object v2, p0, Lcom/bumptech/glide/c/a;->j:[B

    iget v5, p0, Lcom/bumptech/glide/c/a;->t:I

    invoke-direct {v4, v2, v0, v5}, Lcom/bumptech/glide/c/c;-><init>([BII)V

    .line 3378
    invoke-virtual {v4}, Lcom/bumptech/glide/c/c;->c()V

    .line 3379
    invoke-virtual {v4}, Lcom/bumptech/glide/c/c;->d()V

    .line 3380
    invoke-virtual {v4}, Lcom/bumptech/glide/c/c;->b()V

    .line 3381
    invoke-virtual {v4}, Lcom/bumptech/glide/c/c;->a()[B

    move-result-object v0

    .line 316
    iput-object v0, p0, Lcom/bumptech/glide/c/a;->m:[B

    move v0, v1

    .line 318
    :goto_0
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->m:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 319
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->m:[B

    aget-byte v2, v2, v0

    .line 320
    iget-object v5, p0, Lcom/bumptech/glide/c/a;->m:[B

    iget-object v6, p0, Lcom/bumptech/glide/c/a;->m:[B

    add-int/lit8 v7, v0, 0x2

    aget-byte v6, v6, v7

    aput-byte v6, v5, v0

    .line 321
    iget-object v5, p0, Lcom/bumptech/glide/c/a;->m:[B

    add-int/lit8 v6, v0, 0x2

    aput-byte v2, v5, v6

    .line 322
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->n:[Z

    div-int/lit8 v5, v0, 0x3

    aput-boolean v1, v2, v5

    .line 318
    add-int/lit8 v0, v0, 0x3

    goto :goto_0

    :cond_0
    move v0, v1

    move v2, v1

    .line 326
    :goto_1
    if-ge v0, v3, :cond_1

    .line 327
    iget-object v5, p0, Lcom/bumptech/glide/c/a;->j:[B

    add-int/lit8 v6, v2, 0x1

    aget-byte v2, v5, v2

    and-int/lit16 v5, v2, 0xff

    iget-object v2, p0, Lcom/bumptech/glide/c/a;->j:[B

    add-int/lit8 v7, v6, 0x1

    aget-byte v2, v2, v6

    and-int/lit16 v6, v2, 0xff

    iget-object v8, p0, Lcom/bumptech/glide/c/a;->j:[B

    add-int/lit8 v2, v7, 0x1

    aget-byte v7, v8, v7

    and-int/lit16 v7, v7, 0xff

    invoke-virtual {v4, v5, v6, v7}, Lcom/bumptech/glide/c/c;->a(III)I

    move-result v5

    .line 328
    iget-object v6, p0, Lcom/bumptech/glide/c/a;->n:[Z

    const/4 v7, 0x1

    aput-boolean v7, v6, v5

    .line 329
    iget-object v6, p0, Lcom/bumptech/glide/c/a;->k:[B

    int-to-byte v5, v5

    aput-byte v5, v6, v0

    .line 326
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 331
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/c/a;->j:[B

    .line 332
    const/16 v0, 0x8

    iput v0, p0, Lcom/bumptech/glide/c/a;->l:I

    .line 333
    const/4 v0, 0x7

    iput v0, p0, Lcom/bumptech/glide/c/a;->o:I

    .line 335
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 336
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->c:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->b(I)I

    move-result v0

    iput v0, p0, Lcom/bumptech/glide/c/a;->d:I

    .line 340
    :cond_2
    :goto_2
    return-void

    .line 337
    :cond_3
    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->u:Z

    if-eqz v0, :cond_2

    .line 338
    invoke-direct {p0, v1}, Lcom/bumptech/glide/c/a;->b(I)I

    move-result v0

    iput v0, p0, Lcom/bumptech/glide/c/a;->d:I

    goto :goto_2
.end method

.method private c()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 500
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/bumptech/glide/c/a;->m:[B

    iget-object v3, p0, Lcom/bumptech/glide/c/a;->m:[B

    array-length v3, v3

    invoke-virtual {v0, v2, v1, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 501
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->m:[B

    array-length v0, v0

    rsub-int v2, v0, 0x300

    move v0, v1

    .line 502
    :goto_0
    if-ge v0, v2, :cond_0

    .line 503
    iget-object v3, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write(I)V

    .line 502
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 505
    :cond_0
    return-void
.end method

.method private c(I)V
    .locals 2

    .prologue
    .line 519
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    and-int/lit16 v1, p1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 520
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 521
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 94
    int-to-float v0, p1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/bumptech/glide/c/a;->f:I

    .line 95
    return-void
.end method

.method public final a()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 190
    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->g:Z

    if-nez v0, :cond_0

    .line 214
    :goto_0
    return v2

    .line 193
    :cond_0
    iput-boolean v2, p0, Lcom/bumptech/glide/c/a;->g:Z

    .line 195
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/16 v3, 0x3b

    invoke-virtual {v0, v3}, Ljava/io/OutputStream;->write(I)V

    .line 196
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 197
    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->q:Z

    if-eqz v0, :cond_1

    .line 198
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    move v0, v1

    .line 205
    :goto_1
    iput v2, p0, Lcom/bumptech/glide/c/a;->d:I

    .line 206
    iput-object v4, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    .line 207
    iput-object v4, p0, Lcom/bumptech/glide/c/a;->i:Landroid/graphics/Bitmap;

    .line 208
    iput-object v4, p0, Lcom/bumptech/glide/c/a;->j:[B

    .line 209
    iput-object v4, p0, Lcom/bumptech/glide/c/a;->k:[B

    .line 210
    iput-object v4, p0, Lcom/bumptech/glide/c/a;->m:[B

    .line 211
    iput-boolean v2, p0, Lcom/bumptech/glide/c/a;->q:Z

    .line 212
    iput-boolean v1, p0, Lcom/bumptech/glide/c/a;->r:Z

    move v2, v0

    .line 214
    goto :goto_0

    .line 201
    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_1
.end method

.method public final a(Landroid/graphics/Bitmap;)Z
    .locals 11

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 151
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->g:Z

    if-nez v0, :cond_1

    :cond_0
    move v0, v9

    .line 182
    :goto_0
    return v0

    .line 156
    :cond_1
    :try_start_0
    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->s:Z

    if-nez v0, :cond_5

    .line 158
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 1255
    iget-boolean v2, p0, Lcom/bumptech/glide/c/a;->g:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/bumptech/glide/c/a;->r:Z

    if-eqz v2, :cond_5

    .line 1257
    :cond_2
    iput v0, p0, Lcom/bumptech/glide/c/a;->a:I

    .line 1258
    iput v1, p0, Lcom/bumptech/glide/c/a;->b:I

    .line 1259
    iget v0, p0, Lcom/bumptech/glide/c/a;->a:I

    if-gtz v0, :cond_3

    .line 1260
    const/16 v0, 0x140

    iput v0, p0, Lcom/bumptech/glide/c/a;->a:I

    .line 1261
    :cond_3
    iget v0, p0, Lcom/bumptech/glide/c/a;->b:I

    if-gtz v0, :cond_4

    .line 1262
    const/16 v0, 0xf0

    iput v0, p0, Lcom/bumptech/glide/c/a;->b:I

    .line 1263
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/c/a;->s:Z

    .line 160
    :cond_5
    iput-object p1, p0, Lcom/bumptech/glide/c/a;->i:Landroid/graphics/Bitmap;

    .line 1374
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 1375
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    .line 1377
    iget v0, p0, Lcom/bumptech/glide/c/a;->a:I

    if-ne v3, v0, :cond_6

    iget v0, p0, Lcom/bumptech/glide/c/a;->b:I

    if-eq v7, v0, :cond_7

    .line 1379
    :cond_6
    iget v0, p0, Lcom/bumptech/glide/c/a;->a:I

    iget v1, p0, Lcom/bumptech/glide/c/a;->b:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1380
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1381
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v0, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 1382
    iput-object v0, p0, Lcom/bumptech/glide/c/a;->i:Landroid/graphics/Bitmap;

    .line 1384
    :cond_7
    mul-int v0, v3, v7

    new-array v1, v0, [I

    .line 1385
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->i:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, v3

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 1388
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x3

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/bumptech/glide/c/a;->j:[B

    .line 1391
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/c/a;->u:Z

    .line 1393
    array-length v4, v1

    move v2, v9

    move v0, v9

    move v3, v9

    :goto_1
    if-ge v3, v4, :cond_9

    aget v5, v1, v3

    .line 1394
    if-nez v5, :cond_8

    .line 1395
    add-int/lit8 v0, v0, 0x1

    .line 1397
    :cond_8
    iget-object v6, p0, Lcom/bumptech/glide/c/a;->j:[B

    add-int/lit8 v7, v2, 0x1

    and-int/lit16 v10, v5, 0xff

    int-to-byte v10, v10

    aput-byte v10, v6, v2

    .line 1398
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->j:[B

    add-int/lit8 v6, v7, 0x1

    shr-int/lit8 v10, v5, 0x8

    and-int/lit16 v10, v10, 0xff

    int-to-byte v10, v10

    aput-byte v10, v2, v7

    .line 1399
    iget-object v7, p0, Lcom/bumptech/glide/c/a;->j:[B

    add-int/lit8 v2, v6, 0x1

    shr-int/lit8 v5, v5, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v7, v6

    .line 1393
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1402
    :cond_9
    mul-int/lit8 v0, v0, 0x64

    int-to-double v0, v0

    int-to-double v2, v4

    div-double v2, v0, v2

    .line 1405
    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    cmpl-double v0, v2, v0

    if-lez v0, :cond_e

    move v0, v8

    :goto_2
    iput-boolean v0, p0, Lcom/bumptech/glide/c/a;->u:Z

    .line 1406
    const-string v0, "AnimatedGifEncoder"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1407
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "got pixels for frame with "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "% transparent pixels"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    :cond_a
    invoke-direct {p0}, Lcom/bumptech/glide/c/a;->b()V

    .line 163
    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->r:Z

    if-eqz v0, :cond_b

    .line 1470
    iget v0, p0, Lcom/bumptech/glide/c/a;->a:I

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 1471
    iget v0, p0, Lcom/bumptech/glide/c/a;->b:I

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 1473
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    iget v1, p0, Lcom/bumptech/glide/c/a;->o:I

    or-int/lit16 v1, v1, 0xf0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1478
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1479
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 165
    invoke-direct {p0}, Lcom/bumptech/glide/c/a;->c()V

    .line 166
    iget v0, p0, Lcom/bumptech/glide/c/a;->e:I

    if-ltz v0, :cond_b

    .line 1486
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1487
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1488
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1489
    const-string v0, "NETSCAPE2.0"

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->a(Ljava/lang/String;)V

    .line 1490
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1491
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1492
    iget v0, p0, Lcom/bumptech/glide/c/a;->e:I

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 1493
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 2415
    :cond_b
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 2416
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/16 v1, 0xf9

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 2417
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 2419
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->c:Ljava/lang/Integer;

    if-nez v0, :cond_f

    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->u:Z

    if-nez v0, :cond_f

    move v0, v9

    move v1, v9

    .line 2426
    :goto_3
    iget v2, p0, Lcom/bumptech/glide/c/a;->p:I

    if-ltz v2, :cond_c

    .line 2427
    iget v0, p0, Lcom/bumptech/glide/c/a;->p:I

    and-int/lit8 v0, v0, 0x7

    .line 2429
    :cond_c
    shl-int/lit8 v0, v0, 0x2

    .line 2432
    iget-object v2, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    or-int/lit8 v0, v0, 0x0

    or-int/lit8 v0, v0, 0x0

    or-int/2addr v0, v1

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 2437
    iget v0, p0, Lcom/bumptech/glide/c/a;->f:I

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 2438
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    iget v1, p0, Lcom/bumptech/glide/c/a;->d:I

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 2439
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 2446
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 2447
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 2448
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 2449
    iget v0, p0, Lcom/bumptech/glide/c/a;->a:I

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 2450
    iget v0, p0, Lcom/bumptech/glide/c/a;->b:I

    invoke-direct {p0, v0}, Lcom/bumptech/glide/c/a;->c(I)V

    .line 2452
    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->r:Z

    if-eqz v0, :cond_10

    .line 2454
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 173
    :goto_4
    iget-boolean v0, p0, Lcom/bumptech/glide/c/a;->r:Z

    if-nez v0, :cond_d

    .line 174
    invoke-direct {p0}, Lcom/bumptech/glide/c/a;->c()V

    .line 2511
    :cond_d
    new-instance v0, Lcom/bumptech/glide/c/b;

    iget v1, p0, Lcom/bumptech/glide/c/a;->a:I

    iget v2, p0, Lcom/bumptech/glide/c/a;->b:I

    iget-object v3, p0, Lcom/bumptech/glide/c/a;->k:[B

    iget v4, p0, Lcom/bumptech/glide/c/a;->l:I

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/bumptech/glide/c/b;-><init>(II[BI)V

    .line 2512
    iget-object v1, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c/b;->a(Ljava/io/OutputStream;)V

    .line 177
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/c/a;->r:Z

    move v0, v8

    .line 180
    goto/16 :goto_0

    :cond_e
    move v0, v9

    .line 1405
    goto/16 :goto_2

    .line 2424
    :cond_f
    const/4 v0, 0x2

    move v1, v8

    goto :goto_3

    .line 2457
    :cond_10
    iget-object v0, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    iget v1, p0, Lcom/bumptech/glide/c/a;->o:I

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 179
    :catch_0
    move-exception v0

    move v0, v9

    goto/16 :goto_0
.end method

.method public final a(Ljava/io/OutputStream;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 275
    if-nez p1, :cond_0

    .line 285
    :goto_0
    return v1

    .line 277
    :cond_0
    const/4 v0, 0x1

    .line 278
    iput-boolean v1, p0, Lcom/bumptech/glide/c/a;->q:Z

    .line 279
    iput-object p1, p0, Lcom/bumptech/glide/c/a;->h:Ljava/io/OutputStream;

    .line 281
    :try_start_0
    const-string v2, "GIF89a"

    invoke-direct {p0, v2}, Lcom/bumptech/glide/c/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    :goto_1
    iput-boolean v0, p0, Lcom/bumptech/glide/c/a;->g:Z

    move v1, v0

    goto :goto_0

    .line 283
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_1
.end method
