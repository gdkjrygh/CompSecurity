.class public Lcom/facebook/orca/camera/aa;
.super Ljava/lang/Object;
.source "Util.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/facebook/orca/camera/aa;

    sput-object v0, Lcom/facebook/orca/camera/aa;->a:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    return-void
.end method

.method public static a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 2

    .prologue
    .line 96
    invoke-static {p0, p1, p2}, Lcom/facebook/orca/camera/aa;->b(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v1

    .line 100
    const/16 v0, 0x8

    if-gt v1, v0, :cond_0

    .line 101
    const/4 v0, 0x1

    .line 102
    :goto_0
    if-ge v0, v1, :cond_1

    .line 103
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 106
    :cond_0
    add-int/lit8 v0, v1, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    .line 109
    :cond_1
    return v0
.end method

.method public static a(IILandroid/net/Uri;Landroid/content/ContentResolver;Landroid/os/ParcelFileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v0, 0x0

    .line 299
    if-nez p4, :cond_0

    :try_start_0
    invoke-static {p2, p3}, Lcom/facebook/orca/camera/aa;->a(Landroid/net/Uri;Landroid/content/ContentResolver;)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object p4

    .line 300
    :cond_0
    if-nez p4, :cond_1

    .line 321
    invoke-static {p4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    :goto_0
    return-object v0

    .line 301
    :cond_1
    if-nez p5, :cond_2

    :try_start_1
    new-instance p5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 303
    :cond_2
    invoke-virtual {p4}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    .line 304
    const/4 v2, 0x1

    iput-boolean v2, p5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 305
    invoke-static {}, Lcom/facebook/orca/camera/a;->a()Lcom/facebook/orca/camera/a;

    move-result-object v2

    invoke-virtual {v2, v1, p5}, Lcom/facebook/orca/camera/a;->a(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 306
    iget-boolean v2, p5, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-nez v2, :cond_3

    iget v2, p5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v2, v3, :cond_3

    iget v2, p5, Landroid/graphics/BitmapFactory$Options;->outHeight:I
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v2, v3, :cond_4

    .line 321
    :cond_3
    invoke-static {p4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    goto :goto_0

    .line 310
    :cond_4
    :try_start_2
    invoke-static {p5, p0, p1}, Lcom/facebook/orca/camera/aa;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v2

    iput v2, p5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 312
    const/4 v2, 0x0

    iput-boolean v2, p5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 314
    const/4 v2, 0x0

    iput-boolean v2, p5, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 315
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v2, p5, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 316
    invoke-static {}, Lcom/facebook/orca/camera/a;->a()Lcom/facebook/orca/camera/a;

    move-result-object v2

    invoke-virtual {v2, v1, p5}, Lcom/facebook/orca/camera/a;->a(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 321
    invoke-static {p4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    goto :goto_0

    .line 317
    :catch_0
    move-exception v1

    .line 318
    :try_start_3
    sget-object v2, Lcom/facebook/orca/camera/aa;->a:Ljava/lang/Class;

    const-string v3, "Got oom exception "

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 321
    invoke-static {p4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {p4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    throw v0
.end method

.method public static a(IILandroid/net/Uri;Landroid/content/ContentResolver;Z)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 269
    .line 271
    :try_start_0
    const-string v0, "r"

    invoke-virtual {p3, p2, v0}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 273
    if-eqz p4, :cond_0

    .line 274
    :try_start_1
    invoke-static {}, Lcom/facebook/orca/camera/aa;->a()Landroid/graphics/BitmapFactory$Options;

    move-result-object v5

    :goto_0
    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 276
    invoke-static/range {v0 .. v5}, Lcom/facebook/orca/camera/aa;->a(IILandroid/net/Uri;Landroid/content/ContentResolver;Landroid/os/ParcelFileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 281
    invoke-static {v4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    :goto_1
    return-object v0

    .line 278
    :catch_0
    move-exception v0

    move-object v4, v6

    .line 281
    :goto_2
    invoke-static {v4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    move-object v0, v6

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v4, v6

    :goto_3
    invoke-static {v4}, Lcom/facebook/orca/camera/aa;->a(Landroid/os/ParcelFileDescriptor;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_3

    .line 278
    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    move-object v5, v6

    goto :goto_0
.end method

.method public static a(IILandroid/os/ParcelFileDescriptor;Z)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 287
    .line 288
    if-eqz p3, :cond_0

    .line 289
    invoke-static {}, Lcom/facebook/orca/camera/aa;->a()Landroid/graphics/BitmapFactory$Options;

    move-result-object v5

    :goto_0
    move v0, p0

    move v1, p1

    move-object v3, v2

    move-object v4, p2

    .line 291
    invoke-static/range {v0 .. v5}, Lcom/facebook/orca/camera/aa;->a(IILandroid/net/Uri;Landroid/content/ContentResolver;Landroid/os/ParcelFileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v5, v2

    goto :goto_0
.end method

.method public static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    .line 57
    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    .line 58
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 59
    int-to-float v0, p1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-virtual {v5, v0, v1, v2}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 62
    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 64
    if-eq p0, v0, :cond_0

    .line 65
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    .line 72
    :cond_0
    :goto_0
    return-object p0

    .line 68
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/graphics/Matrix;Landroid/graphics/Bitmap;IIZZ)Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const/high16 v8, 0x3f800000    # 1.0f

    const v7, 0x3f666666    # 0.9f

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 148
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    sub-int v3, v2, p2

    .line 149
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int v4, v2, p3

    .line 150
    if-nez p4, :cond_3

    if-ltz v3, :cond_0

    if-gez v4, :cond_3

    .line 157
    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 159
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 161
    div-int/lit8 v3, v3, 0x2

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 162
    div-int/lit8 v4, v4, 0x2

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 163
    new-instance v4, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    add-int/2addr v6, v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-static {p3, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    add-int/2addr v7, v1

    invoke-direct {v4, v3, v1, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 168
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int v1, p2, v1

    div-int/lit8 v1, v1, 0x2

    .line 169
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v3

    sub-int v3, p3, v3

    div-int/lit8 v3, v3, 0x2

    .line 170
    new-instance v6, Landroid/graphics/Rect;

    sub-int v7, p2, v1

    sub-int v8, p3, v3

    invoke-direct {v6, v1, v3, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 175
    invoke-virtual {v5, p1, v4, v6, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 176
    if-eqz p5, :cond_1

    .line 177
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    move-object v0, v2

    .line 232
    :cond_2
    :goto_0
    return-object v0

    .line 181
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 182
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 184
    div-float v4, v2, v3

    .line 185
    int-to-float v5, p2

    int-to-float v6, p3

    div-float/2addr v5, v6

    .line 187
    cmpl-float v4, v4, v5

    if-lez v4, :cond_8

    .line 188
    int-to-float v2, p3

    div-float/2addr v2, v3

    .line 189
    cmpg-float v3, v2, v7

    if-ltz v3, :cond_4

    cmpl-float v3, v2, v8

    if-lez v3, :cond_7

    .line 190
    :cond_4
    invoke-virtual {p0, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    :goto_1
    move-object v5, p0

    .line 204
    :goto_2
    if-eqz v5, :cond_b

    .line 206
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v2, v0

    .line 212
    :goto_3
    if-eqz p5, :cond_5

    if-eq v2, p1, :cond_5

    .line 213
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 216
    :cond_5
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    sub-int/2addr v0, p2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 217
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 219
    div-int/lit8 v0, v0, 0x2

    div-int/lit8 v1, v1, 0x2

    invoke-static {v2, v0, v1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 226
    if-eq v0, v2, :cond_2

    .line 227
    if-nez p5, :cond_6

    if-eq v2, p1, :cond_2

    .line 228
    :cond_6
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :cond_7
    move-object p0, v0

    .line 192
    goto :goto_1

    .line 195
    :cond_8
    int-to-float v3, p2

    div-float v2, v3, v2

    .line 196
    cmpg-float v3, v2, v7

    if-ltz v3, :cond_9

    cmpl-float v3, v2, v8

    if-lez v3, :cond_a

    .line 197
    :cond_9
    invoke-virtual {p0, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    move-object v5, p0

    goto :goto_2

    :cond_a
    move-object v5, v0

    .line 199
    goto :goto_2

    :cond_b
    move-object v2, p1

    .line 209
    goto :goto_3
.end method

.method public static a()Landroid/graphics/BitmapFactory$Options;
    .locals 1

    .prologue
    .line 402
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 404
    return-object v0
.end method

.method private static a(Landroid/net/Uri;Landroid/content/ContentResolver;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .prologue
    .line 329
    :try_start_0
    const-string v0, "r"

    invoke-virtual {p1, p0, v0}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 331
    :goto_0
    return-object v0

    .line 330
    :catch_0
    move-exception v0

    .line 331
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/os/ParcelFileDescriptor;)V
    .locals 1

    .prologue
    .line 254
    if-nez p0, :cond_0

    .line 260
    :goto_0
    return-void

    .line 256
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 257
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lcom/facebook/orca/camera/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;Landroid/os/Handler;)V
    .locals 3

    .prologue
    .line 395
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v0, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    .line 397
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/facebook/orca/camera/ab;

    invoke-direct {v2, p0, p3, v0, p4}, Lcom/facebook/orca/camera/ab;-><init>(Lcom/facebook/orca/camera/x;Ljava/lang/Runnable;Landroid/app/ProgressDialog;Landroid/os/Handler;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 398
    return-void
.end method

.method public static a(Ljava/io/Closeable;)V
    .locals 1

    .prologue
    .line 245
    if-nez p0, :cond_0

    .line 251
    :goto_0
    return-void

    .line 247
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 248
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 337
    if-eq p0, p1, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v10, -0x1

    .line 114
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-double v2, v0

    .line 115
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-double v4, v0

    .line 117
    if-ne p2, v10, :cond_1

    move v0, v1

    .line 119
    :goto_0
    if-ne p1, v10, :cond_2

    const/16 v2, 0x80

    .line 123
    :goto_1
    if-ge v2, v0, :cond_3

    .line 134
    :cond_0
    :goto_2
    return v0

    .line 117
    :cond_1
    mul-double v6, v2, v4

    int-to-double v8, p2

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v0, v6

    goto :goto_0

    .line 119
    :cond_2
    int-to-double v6, p1

    div-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    int-to-double v6, p1

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    double-to-int v2, v2

    goto :goto_1

    .line 128
    :cond_3
    if-ne p2, v10, :cond_4

    if-ne p1, v10, :cond_4

    move v0, v1

    .line 130
    goto :goto_2

    .line 131
    :cond_4
    if-eq p1, v10, :cond_0

    move v0, v2

    .line 134
    goto :goto_2
.end method
