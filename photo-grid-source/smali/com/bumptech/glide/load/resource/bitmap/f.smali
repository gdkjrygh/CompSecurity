.class public abstract Lcom/bumptech/glide/load/resource/bitmap/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/resource/bitmap/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/resource/bitmap/a",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/bumptech/glide/load/resource/bitmap/f;

.field public static final b:Lcom/bumptech/glide/load/resource/bitmap/f;

.field public static final c:Lcom/bumptech/glide/load/resource/bitmap/f;

.field private static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Landroid/graphics/BitmapFactory$Options;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 29
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    sget-object v1, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    sget-object v2, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->d:Ljava/util/Set;

    .line 32
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/bumptech/glide/i/h;->a(I)Ljava/util/Queue;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->e:Ljava/util/Queue;

    .line 38
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/g;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/g;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    .line 54
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/h;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/h;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->b:Lcom/bumptech/glide/load/resource/bitmap/f;

    .line 72
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/i;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/i;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->c:Lcom/bumptech/glide/load/resource/bitmap/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/io/InputStream;Lcom/bumptech/glide/load/a;)Landroid/graphics/Bitmap$Config;
    .locals 6

    .prologue
    const/4 v5, 0x5

    .line 254
    sget-object v0, Lcom/bumptech/glide/load/a;->a:Lcom/bumptech/glide/load/a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/bumptech/glide/load/a;->b:Lcom/bumptech/glide/load/a;

    if-eq p1, v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    .line 256
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 278
    :goto_0
    return-object v0

    .line 259
    :cond_1
    const/4 v1, 0x0

    .line 261
    const/16 v0, 0x400

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->mark(I)V

    .line 263
    :try_start_0
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;-><init>(Ljava/io/InputStream;)V

    .line 4083
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;->a()Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;->hasAlpha()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 270
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 278
    :cond_2
    :goto_1
    if-eqz v0, :cond_6

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    .line 271
    :catch_0
    move-exception v1

    .line 272
    const-string v2, "Downsampler"

    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 273
    const-string v2, "Downsampler"

    const-string v3, "Cannot reset the input stream"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 264
    :catch_1
    move-exception v0

    .line 265
    :try_start_2
    const-string v2, "Downsampler"

    const/4 v3, 0x5

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 266
    const-string v2, "Downsampler"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Cannot determine whether the image has alpha or not from header for format "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 270
    :cond_3
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    move v0, v1

    .line 275
    goto :goto_1

    .line 271
    :catch_2
    move-exception v0

    .line 272
    const-string v2, "Downsampler"

    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 273
    const-string v2, "Downsampler"

    const-string v3, "Cannot reset the input stream"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    move v0, v1

    .line 276
    goto :goto_1

    .line 269
    :catchall_0
    move-exception v0

    .line 270
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 275
    :cond_5
    :goto_2
    throw v0

    .line 271
    :catch_3
    move-exception v1

    .line 272
    const-string v2, "Downsampler"

    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 273
    const-string v2, "Downsampler"

    const-string v3, "Cannot reset the input stream"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 278
    :cond_6
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0
.end method

.method private static a(Lcom/bumptech/glide/i/f;Lcom/bumptech/glide/load/resource/bitmap/t;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    .line 315
    iget-boolean v0, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-eqz v0, :cond_1

    .line 321
    const/high16 v0, 0x500000

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/i/f;->mark(I)V

    .line 329
    :goto_0
    const/4 v0, 0x0

    invoke-static {p0, v0, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 332
    :try_start_0
    iget-boolean v0, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-eqz v0, :cond_0

    .line 333
    invoke-virtual {p0}, Lcom/bumptech/glide/i/f;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 342
    :cond_0
    :goto_1
    return-object v1

    .line 326
    :cond_1
    invoke-virtual {p1}, Lcom/bumptech/glide/load/resource/bitmap/t;->a()V

    goto :goto_0

    .line 335
    :catch_0
    move-exception v0

    .line 336
    const-string v2, "Downsampler"

    const/4 v3, 0x6

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 337
    const-string v2, "Downsampler"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception loading inDecodeBounds="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v4, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " sample="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private static a(Landroid/graphics/BitmapFactory$Options;)V
    .locals 2

    .prologue
    .line 367
    invoke-static {p0}, Lcom/bumptech/glide/load/resource/bitmap/f;->b(Landroid/graphics/BitmapFactory$Options;)V

    .line 368
    sget-object v1, Lcom/bumptech/glide/load/resource/bitmap/f;->e:Ljava/util/Queue;

    monitor-enter v1

    .line 369
    :try_start_0
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->e:Ljava/util/Queue;

    invoke-interface {v0, p0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 370
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static a(Ljava/io/InputStream;)Z
    .locals 4

    .prologue
    const/4 v3, 0x5

    .line 225
    const/16 v0, 0x13

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v1, :cond_1

    .line 226
    const/4 v0, 0x1

    .line 248
    :cond_0
    :goto_0
    return v0

    .line 229
    :cond_1
    const/16 v0, 0x400

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->mark(I)V

    .line 231
    :try_start_0
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;->a()Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType;

    move-result-object v0

    .line 234
    sget-object v1, Lcom/bumptech/glide/load/resource/bitmap/f;->d:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 241
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 242
    :catch_0
    move-exception v1

    .line 243
    const-string v2, "Downsampler"

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 244
    const-string v2, "Downsampler"

    const-string v3, "Cannot reset the input stream"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 235
    :catch_1
    move-exception v0

    .line 236
    :try_start_2
    const-string v1, "Downsampler"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 237
    const-string v1, "Downsampler"

    const-string v2, "Cannot determine the image type from header"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    :cond_2
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 248
    :cond_3
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 242
    :catch_2
    move-exception v0

    .line 243
    const-string v1, "Downsampler"

    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 244
    const-string v1, "Downsampler"

    const-string v2, "Cannot reset the input stream"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 240
    :catchall_0
    move-exception v0

    .line 241
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 246
    :cond_4
    :goto_2
    throw v0

    .line 242
    :catch_3
    move-exception v1

    .line 243
    const-string v2, "Downsampler"

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 244
    const-string v2, "Downsampler"

    const-string v3, "Cannot reset the input stream"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2
.end method

.method private static declared-synchronized b()Landroid/graphics/BitmapFactory$Options;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 355
    const-class v1, Lcom/bumptech/glide/load/resource/bitmap/f;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/bumptech/glide/load/resource/bitmap/f;->e:Ljava/util/Queue;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 356
    :try_start_1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->e:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/BitmapFactory$Options;

    .line 357
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 358
    if-nez v0, :cond_0

    .line 359
    :try_start_2
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 360
    invoke-static {v0}, Lcom/bumptech/glide/load/resource/bitmap/f;->b(Landroid/graphics/BitmapFactory$Options;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 363
    :cond_0
    monitor-exit v1

    return-object v0

    .line 357
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 355
    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static b(Landroid/graphics/BitmapFactory$Options;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 375
    iput-object v2, p0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 376
    iput-boolean v0, p0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 377
    iput-boolean v0, p0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 378
    iput v3, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 379
    iput-object v2, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 380
    iput-boolean v0, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 381
    iput v0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 382
    iput v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 383
    iput-object v2, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 385
    const/16 v0, 0xb

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v1, :cond_0

    .line 386
    iput-object v2, p0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 387
    iput-boolean v3, p0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 389
    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract a(IIII)I
.end method

.method public final a(Ljava/io/InputStream;Lcom/bumptech/glide/load/b/a/e;IILcom/bumptech/glide/load/a;)Landroid/graphics/Bitmap;
    .locals 20

    .prologue
    .line 108
    invoke-static {}, Lcom/bumptech/glide/i/a;->a()Lcom/bumptech/glide/i/a;

    move-result-object v8

    .line 109
    invoke-virtual {v8}, Lcom/bumptech/glide/i/a;->b()[B

    move-result-object v9

    .line 110
    invoke-virtual {v8}, Lcom/bumptech/glide/i/a;->b()[B

    move-result-object v10

    .line 111
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/f;->b()Landroid/graphics/BitmapFactory$Options;

    move-result-object v11

    .line 114
    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/t;

    move-object/from16 v0, p1

    invoke-direct {v12, v0, v10}, Lcom/bumptech/glide/load/resource/bitmap/t;-><init>(Ljava/io/InputStream;[B)V

    .line 119
    invoke-static {v12}, Lcom/bumptech/glide/i/c;->a(Ljava/io/InputStream;)Lcom/bumptech/glide/i/c;

    move-result-object v13

    .line 124
    new-instance v14, Lcom/bumptech/glide/i/f;

    invoke-direct {v14, v13}, Lcom/bumptech/glide/i/f;-><init>(Ljava/io/InputStream;)V

    .line 126
    const/high16 v4, 0x500000

    :try_start_0
    invoke-virtual {v13, v4}, Lcom/bumptech/glide/i/c;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    const/4 v5, 0x0

    .line 129
    :try_start_1
    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;

    invoke-direct {v4, v13}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v4}, Lcom/bumptech/glide/load/resource/bitmap/ImageHeaderParser;->b()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v4

    .line 136
    :try_start_2
    invoke-virtual {v13}, Lcom/bumptech/glide/i/c;->reset()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v7, v4

    .line 144
    :goto_0
    :try_start_3
    iput-object v9, v11, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 1307
    const/4 v4, 0x1

    iput-boolean v4, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1308
    invoke-static {v14, v12, v11}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(Lcom/bumptech/glide/i/f;Lcom/bumptech/glide/load/resource/bitmap/t;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1309
    const/4 v4, 0x0

    iput-boolean v4, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1310
    const/4 v4, 0x2

    new-array v4, v4, [I

    const/4 v5, 0x0

    iget v6, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    aput v6, v4, v5

    const/4 v5, 0x1

    iget v6, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    aput v6, v4, v5

    .line 147
    const/4 v5, 0x0

    aget v5, v4, v5

    .line 148
    const/4 v6, 0x1

    aget v6, v4, v6

    .line 2227
    packed-switch v7, :pswitch_data_0

    .line 2241
    const/4 v4, 0x0

    .line 3184
    :goto_1
    const/high16 v15, -0x80000000

    move/from16 v0, p4

    if-ne v0, v15, :cond_0

    move/from16 p4, v6

    .line 3185
    :cond_0
    const/high16 v15, -0x80000000

    move/from16 v0, p3

    if-ne v0, v15, :cond_1

    move/from16 p3, v5

    .line 3188
    :cond_1
    const/16 v15, 0x5a

    if-eq v4, v15, :cond_2

    const/16 v15, 0x10e

    if-ne v4, v15, :cond_9

    .line 3192
    :cond_2
    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    invoke-virtual {v0, v6, v5, v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(IIII)I

    move-result v4

    .line 3201
    :goto_2
    if-nez v4, :cond_a

    const/4 v4, 0x0

    .line 3204
    :goto_3
    const/4 v15, 0x1

    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 3211
    move-object/from16 v0, p5

    invoke-static {v14, v0}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(Ljava/io/InputStream;Lcom/bumptech/glide/load/a;)Landroid/graphics/Bitmap$Config;

    move-result-object v15

    .line 3212
    iput v4, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 3213
    iput-object v15, v11, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 3214
    iget v0, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    move/from16 v16, v0

    const/16 v17, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    if-eq v0, v1, :cond_3

    const/16 v16, 0x13

    sget v17, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v0, v16

    move/from16 v1, v17

    if-gt v0, v1, :cond_4

    :cond_3
    invoke-static {v14}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(Ljava/io/InputStream;)Z

    move-result v16

    if-eqz v16, :cond_4

    .line 3215
    int-to-double v0, v5

    move-wide/from16 v16, v0

    int-to-double v0, v4

    move-wide/from16 v18, v0

    div-double v16, v16, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v16

    move-wide/from16 v0, v16

    double-to-int v5, v0

    .line 3216
    int-to-double v0, v6

    move-wide/from16 v16, v0

    int-to-double v0, v4

    move-wide/from16 v18, v0

    div-double v16, v16, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v16

    move-wide/from16 v0, v16

    double-to-int v4, v0

    .line 3218
    move-object/from16 v0, p2

    invoke-interface {v0, v5, v4, v15}, Lcom/bumptech/glide/load/b/a/e;->b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 3347
    const/16 v5, 0xb

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v5, v6, :cond_4

    .line 3348
    iput-object v4, v11, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 3220
    :cond_4
    invoke-static {v14, v12, v11}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(Lcom/bumptech/glide/i/f;Lcom/bumptech/glide/load/resource/bitmap/t;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 160
    invoke-virtual {v13}, Lcom/bumptech/glide/i/c;->a()Ljava/io/IOException;

    move-result-object v4

    .line 161
    if-eqz v4, :cond_b

    .line 162
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 176
    :catchall_0
    move-exception v4

    invoke-virtual {v8, v9}, Lcom/bumptech/glide/i/a;->a([B)Z

    .line 177
    invoke-virtual {v8, v10}, Lcom/bumptech/glide/i/a;->a([B)Z

    .line 178
    invoke-virtual {v13}, Lcom/bumptech/glide/i/c;->b()V

    .line 179
    invoke-static {v11}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(Landroid/graphics/BitmapFactory$Options;)V

    throw v4

    .line 137
    :catch_0
    move-exception v5

    .line 138
    :try_start_4
    const-string v6, "Downsampler"

    const/4 v7, 0x5

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 139
    const-string v6, "Downsampler"

    const-string v7, "Cannot reset the input stream"

    invoke-static {v6, v7, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_5
    move v7, v4

    .line 142
    goto/16 :goto_0

    .line 130
    :catch_1
    move-exception v4

    .line 131
    :try_start_5
    const-string v6, "Downsampler"

    const/4 v7, 0x5

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 132
    const-string v6, "Downsampler"

    const-string v7, "Cannot determine the image orientation from header"

    invoke-static {v6, v7, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 136
    :cond_6
    :try_start_6
    invoke-virtual {v13}, Lcom/bumptech/glide/i/c;->reset()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move v7, v5

    .line 141
    goto/16 :goto_0

    .line 137
    :catch_2
    move-exception v4

    .line 138
    :try_start_7
    const-string v6, "Downsampler"

    const/4 v7, 0x5

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 139
    const-string v6, "Downsampler"

    const-string v7, "Cannot reset the input stream"

    invoke-static {v6, v7, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_7
    move v7, v5

    .line 142
    goto/16 :goto_0

    .line 135
    :catchall_1
    move-exception v4

    .line 136
    :try_start_8
    invoke-virtual {v13}, Lcom/bumptech/glide/i/c;->reset()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 141
    :cond_8
    :goto_4
    :try_start_9
    throw v4

    .line 137
    :catch_3
    move-exception v5

    .line 138
    const-string v6, "Downsampler"

    const/4 v7, 0x5

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 139
    const-string v6, "Downsampler"

    const-string v7, "Cannot reset the input stream"

    invoke-static {v6, v7, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    .line 2230
    :pswitch_0
    const/16 v4, 0x5a

    .line 2231
    goto/16 :goto_1

    .line 2234
    :pswitch_1
    const/16 v4, 0xb4

    .line 2235
    goto/16 :goto_1

    .line 2238
    :pswitch_2
    const/16 v4, 0x10e

    .line 2239
    goto/16 :goto_1

    .line 3194
    :cond_9
    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    invoke-virtual {v0, v5, v6, v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(IIII)I

    move-result v4

    goto/16 :goto_2

    .line 3201
    :cond_a
    invoke-static {v4}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v4

    goto/16 :goto_3

    .line 165
    :cond_b
    const/4 v4, 0x0

    .line 166
    if-eqz v5, :cond_c

    .line 167
    move-object/from16 v0, p2

    invoke-static {v5, v0, v7}, Lcom/bumptech/glide/load/resource/bitmap/x;->a(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 169
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    move-object/from16 v0, p2

    invoke-interface {v0, v5}, Lcom/bumptech/glide/load/b/a/e;->a(Landroid/graphics/Bitmap;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 170
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 176
    :cond_c
    invoke-virtual {v8, v9}, Lcom/bumptech/glide/i/a;->a([B)Z

    .line 177
    invoke-virtual {v8, v10}, Lcom/bumptech/glide/i/a;->a([B)Z

    .line 178
    invoke-virtual {v13}, Lcom/bumptech/glide/i/c;->b()V

    .line 179
    invoke-static {v11}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(Landroid/graphics/BitmapFactory$Options;)V

    return-object v4

    .line 2227
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
