.class public Lcom/facebook/ui/images/a/a;
.super Ljava/lang/Object;
.source "ImageAttachmentDecoder.java"


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/ui/images/a/a;->a:Landroid/content/Context;

    .line 39
    return-void
.end method

.method private a(IIIILcom/facebook/ui/images/cache/f;)I
    .locals 6

    .prologue
    const/4 v2, -0x1

    const/4 v1, -0x2

    .line 214
    if-ne p2, v1, :cond_3

    .line 215
    iget-object v0, p0, Lcom/facebook/ui/images/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget p2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 220
    :cond_0
    :goto_0
    if-ne p1, v1, :cond_4

    .line 221
    iget-object v0, p0, Lcom/facebook/ui/images/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget p1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 226
    :cond_1
    :goto_1
    const/4 v0, 0x1

    .line 227
    sget-object v1, Lcom/facebook/ui/images/a/c;->a:[I

    invoke-virtual {p5}, Lcom/facebook/ui/images/cache/f;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 252
    :cond_2
    :goto_2
    return v0

    .line 216
    :cond_3
    if-ne p2, v2, :cond_0

    move p2, p4

    .line 217
    goto :goto_0

    .line 222
    :cond_4
    if-ne p1, v2, :cond_1

    move p1, p3

    .line 223
    goto :goto_1

    .line 231
    :pswitch_0
    mul-int v1, p4, p3

    mul-int/lit8 v1, v1, 0x4

    .line 232
    mul-int/lit8 v2, p2, 0x11

    mul-int/2addr v2, p1

    mul-int/lit8 v2, v2, 0x4

    div-int/lit8 v3, v2, 0xa

    .line 233
    :goto_3
    if-le v1, v3, :cond_2

    .line 234
    mul-int/lit8 v2, v0, 0x2

    .line 235
    div-int/lit8 v0, v1, 0x4

    move v1, v0

    move v0, v2

    goto :goto_3

    .line 240
    :pswitch_1
    int-to-double v0, p3

    int-to-double v2, p1

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    int-to-double v2, p4

    int-to-double v4, p2

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-int v0, v0

    .line 243
    goto :goto_2

    .line 246
    :pswitch_2
    int-to-double v0, p3

    int-to-double v2, p1

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    int-to-double v2, p4

    int-to-double v4, p2

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-int v0, v0

    goto :goto_2

    .line 227
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/facebook/ui/media/attachments/a;)I
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 157
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    .line 159
    const-string v1, "file"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "temp-rotate_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 162
    iget-object v1, p0, Lcom/facebook/ui/images/a/a;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 164
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->c()Lcom/google/common/b/i;

    move-result-object v0

    new-instance v2, Lcom/facebook/ui/images/a/b;

    invoke-direct {v2, p0, v1}, Lcom/facebook/ui/images/a/b;-><init>(Lcom/facebook/ui/images/a/a;Ljava/io/File;)V

    invoke-static {v0, v2}, Lcom/google/common/b/a;->a(Lcom/google/common/b/i;Lcom/google/common/b/j;)J

    .line 170
    new-instance v0, Landroid/media/ExifInterface;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 171
    const-string v2, "Orientation"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 173
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 177
    :goto_0
    return v0

    .line 173
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    throw v0

    .line 176
    :cond_0
    new-instance v1, Landroid/media/ExifInterface;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 177
    const-string v0, "Orientation"

    invoke-virtual {v1, v0, v3}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/ui/images/a/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/ui/images/a/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method private a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v6, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v3, -0x40800000    # -1.0f

    .line 182
    if-eqz p2, :cond_0

    if-ne p2, v6, :cond_1

    .line 208
    :cond_0
    :goto_0
    return-object p1

    .line 186
    :cond_1
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 187
    const/4 v2, 0x2

    if-ne p2, v2, :cond_4

    .line 188
    invoke-virtual {v5, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    move p2, v6

    .line 201
    :cond_2
    :goto_1
    if-ne p2, v0, :cond_7

    .line 202
    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 208
    :cond_3
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v0, p1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_0

    .line 190
    :cond_4
    const/4 v2, 0x4

    if-ne p2, v2, :cond_5

    .line 191
    invoke-virtual {v5, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    move p2, v0

    .line 192
    goto :goto_1

    .line 193
    :cond_5
    const/4 v2, 0x7

    if-ne p2, v2, :cond_6

    .line 194
    invoke-virtual {v5, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 195
    const/4 p2, 0x6

    goto :goto_1

    .line 196
    :cond_6
    const/4 v2, 0x5

    if-ne p2, v2, :cond_2

    .line 197
    invoke-virtual {v5, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 198
    const/16 p2, 0x8

    goto :goto_1

    .line 203
    :cond_7
    const/4 v0, 0x6

    if-ne p2, v0, :cond_8

    .line 204
    const/high16 v0, 0x42b40000    # 90.0f

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    goto :goto_2

    .line 205
    :cond_8
    const/16 v0, 0x8

    if-ne p2, v0, :cond_3

    .line 206
    const/high16 v0, 0x43870000    # 270.0f

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    goto :goto_2
.end method


# virtual methods
.method public a(Lcom/facebook/ui/media/attachments/a;I)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0, p1, p2, p2}, Lcom/facebook/ui/images/a/a;->a(Lcom/facebook/ui/media/attachments/a;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/ui/media/attachments/a;II)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    .line 75
    const/4 v4, 0x0

    sget-object v5, Lcom/facebook/ui/images/cache/e;->a:Lcom/facebook/ui/images/cache/f;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/ui/images/a/a;->a(Lcom/facebook/ui/media/attachments/a;IIZLcom/facebook/ui/images/cache/f;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/ui/media/attachments/a;IIZLcom/facebook/ui/images/cache/f;)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v6, -0x1

    const/4 v3, 0x1

    const/4 v7, 0x0

    .line 95
    :try_start_0
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 96
    const/4 v1, 0x1

    iput-boolean v1, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 97
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->b()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 99
    :try_start_1
    instance-of v1, v2, Ljava/io/FileInputStream;

    if-eqz v1, :cond_0

    .line 100
    move-object v0, v2

    check-cast v0, Ljava/io/FileInputStream;

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    .line 101
    const/4 v4, 0x0

    invoke-static {v1, v4, v5}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    :goto_0
    :try_start_2
    invoke-static {v2}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    .line 110
    if-ne p2, v6, :cond_1

    if-ne p3, v6, :cond_1

    move v1, v3

    .line 118
    :goto_1
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 119
    iput v1, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 120
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/a;->b()Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v2

    .line 124
    if-eqz p4, :cond_2

    :try_start_3
    instance-of v1, v2, Ljava/io/FileInputStream;

    if-eqz v1, :cond_2

    .line 125
    move-object v0, v2

    check-cast v0, Ljava/io/FileInputStream;

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    .line 127
    const/4 v4, 0x1

    iput-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 128
    const/4 v4, 0x1

    iput-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 129
    const/4 v4, 0x0

    invoke-static {v1, v4, v3}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v1

    .line 134
    :goto_2
    :try_start_4
    invoke-static {v2}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 137
    if-nez v1, :cond_3

    move-object v1, v7

    .line 153
    :goto_3
    return-object v1

    .line 103
    :cond_0
    const/4 v1, 0x0

    :try_start_5
    invoke-static {v2, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    .line 106
    :catchall_0
    move-exception v1

    :try_start_6
    invoke-static {v2}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    throw v1

    .line 150
    :catch_0
    move-exception v1

    move-object v1, v7

    .line 153
    goto :goto_3

    .line 114
    :cond_1
    iget v4, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v5, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    move-object v1, p0

    move v2, p2

    move v3, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/facebook/ui/images/a/a;->a(IIIILcom/facebook/ui/images/cache/f;)I
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    move-result v1

    goto :goto_1

    .line 131
    :cond_2
    const/4 v1, 0x0

    :try_start_7
    invoke-static {v2, v1, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-result-object v1

    goto :goto_2

    .line 134
    :catchall_1
    move-exception v1

    :try_start_8
    invoke-static {v2}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 143
    :cond_3
    :try_start_9
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/a/a;->a(Lcom/facebook/ui/media/attachments/a;)I

    move-result v2

    .line 144
    invoke-direct {p0, v1, v2}, Lcom/facebook/ui/images/a/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    move-result-object v1

    goto :goto_3

    .line 145
    :catch_1
    move-exception v2

    goto :goto_3
.end method
