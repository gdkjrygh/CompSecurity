.class public Lcom/facebook/orca/camera/ImageManager;
.super Ljava/lang/Object;
.source "ImageManager.java"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final d:Landroid/net/Uri;

.field private static final e:Landroid/net/Uri;

.field private static final f:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 56
    const-class v0, Lcom/facebook/orca/camera/ImageManager;

    sput-object v0, Lcom/facebook/orca/camera/ImageManager;->c:Ljava/lang/Class;

    .line 58
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    sput-object v0, Lcom/facebook/orca/camera/ImageManager;->d:Landroid/net/Uri;

    .line 59
    sget-object v0, Landroid/provider/MediaStore$Images$Thumbnails;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    sput-object v0, Lcom/facebook/orca/camera/ImageManager;->e:Landroid/net/Uri;

    .line 62
    const-string v0, "content://media/external/video/media"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/camera/ImageManager;->f:Landroid/net/Uri;

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/DCIM/Camera"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/camera/ImageManager;->a:Ljava/lang/String;

    .line 136
    sget-object v0, Lcom/facebook/orca/camera/ImageManager;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/orca/camera/ImageManager;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/camera/ImageManager;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 397
    return-void
.end method

.method public static a(Landroid/content/ContentResolver;Ljava/lang/String;JLandroid/location/Location;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;[B[I)Landroid/net/Uri;
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 225
    .line 226
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 228
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 229
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 230
    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p5, p6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    if-eqz p7, :cond_2

    .line 233
    :try_start_1
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x4b

    invoke-virtual {p7, v3, v4, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 234
    const/4 v3, 0x0

    const/4 v4, 0x0

    aput v4, p9, v3
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 246
    :goto_0
    invoke-static {v2}, Lcom/facebook/orca/camera/aa;->a(Ljava/io/Closeable;)V

    .line 249
    new-instance v0, Landroid/content/ContentValues;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 250
    const-string v2, "title"

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const-string v2, "_display_name"

    invoke-virtual {v0, v2, p6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const-string v2, "datetaken"

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 257
    const-string v2, "mime_type"

    const-string v3, "image/jpeg"

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    const-string v2, "orientation"

    aget v3, p9, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 259
    const-string v2, "_data"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    if-eqz p4, :cond_1

    .line 262
    const-string v1, "latitude"

    invoke-virtual {p4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 263
    const-string v1, "longitude"

    invoke-virtual {p4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 266
    :cond_1
    sget-object v1, Lcom/facebook/orca/camera/ImageManager;->d:Landroid/net/Uri;

    invoke-virtual {p0, v1, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    :goto_1
    return-object v0

    .line 236
    :cond_2
    :try_start_2
    invoke-virtual {v2, p8}, Ljava/io/OutputStream;->write([B)V

    .line 237
    const/4 v3, 0x0

    invoke-static {v1}, Lcom/facebook/orca/camera/ImageManager;->b(Ljava/lang/String;)I

    move-result v4

    aput v4, p9, v3
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 239
    :catch_0
    move-exception v1

    .line 240
    :goto_2
    :try_start_3
    sget-object v3, Lcom/facebook/orca/camera/ImageManager;->c:Ljava/lang/Class;

    invoke-static {v3, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 246
    invoke-static {v2}, Lcom/facebook/orca/camera/aa;->a(Ljava/io/Closeable;)V

    goto :goto_1

    .line 242
    :catch_1
    move-exception v1

    move-object v2, v0

    .line 243
    :goto_3
    :try_start_4
    sget-object v3, Lcom/facebook/orca/camera/ImageManager;->c:Ljava/lang/Class;

    invoke-static {v3, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 246
    invoke-static {v2}, Lcom/facebook/orca/camera/aa;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_4
    invoke-static {v2}, Lcom/facebook/orca/camera/aa;->a(Ljava/io/Closeable;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_4

    .line 242
    :catch_2
    move-exception v1

    goto :goto_3

    .line 239
    :catch_3
    move-exception v1

    move-object v2, v0

    goto :goto_2
.end method

.method public static a(Landroid/net/Uri;)Lcom/facebook/orca/camera/ImageManager$ImageListParam;
    .locals 1

    .prologue
    .line 445
    new-instance v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    invoke-direct {v0}, Lcom/facebook/orca/camera/ImageManager$ImageListParam;-><init>()V

    .line 446
    iput-object p0, v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->e:Landroid/net/Uri;

    .line 447
    return-object v0
.end method

.method public static a(Lcom/facebook/orca/camera/p;IILjava/lang/String;)Lcom/facebook/orca/camera/ImageManager$ImageListParam;
    .locals 1

    .prologue
    .line 436
    new-instance v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    invoke-direct {v0}, Lcom/facebook/orca/camera/ImageManager$ImageListParam;-><init>()V

    .line 437
    iput-object p0, v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->a:Lcom/facebook/orca/camera/p;

    .line 438
    iput p1, v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->b:I

    .line 439
    iput p2, v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->c:I

    .line 440
    iput-object p3, v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->d:Ljava/lang/String;

    .line 441
    return-object v0
.end method

.method public static a(Landroid/content/ContentResolver;Landroid/net/Uri;)Lcom/facebook/orca/camera/a/d;
    .locals 1

    .prologue
    .line 468
    invoke-static {p1}, Lcom/facebook/orca/camera/ImageManager;->a(Landroid/net/Uri;)Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/facebook/orca/camera/ImageManager;->a(Landroid/content/ContentResolver;Lcom/facebook/orca/camera/ImageManager$ImageListParam;)Lcom/facebook/orca/camera/a/d;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/ContentResolver;Landroid/net/Uri;I)Lcom/facebook/orca/camera/a/d;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 369
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 375
    :goto_0
    const-string v1, "content://drm"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 376
    sget-object v0, Lcom/facebook/orca/camera/p;->ALL:Lcom/facebook/orca/camera/p;

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, p2, v2}, Lcom/facebook/orca/camera/ImageManager;->a(Landroid/content/ContentResolver;Lcom/facebook/orca/camera/p;IILjava/lang/String;)Lcom/facebook/orca/camera/a/d;

    move-result-object v0

    .line 385
    :goto_1
    return-object v0

    .line 369
    :cond_0
    const-string v0, ""

    goto :goto_0

    .line 378
    :cond_1
    const-string v1, "content://media/external/video"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 379
    sget-object v0, Lcom/facebook/orca/camera/p;->EXTERNAL:Lcom/facebook/orca/camera/p;

    const/4 v1, 0x4

    invoke-static {p0, v0, v1, p2, v2}, Lcom/facebook/orca/camera/ImageManager;->a(Landroid/content/ContentResolver;Lcom/facebook/orca/camera/p;IILjava/lang/String;)Lcom/facebook/orca/camera/a/d;

    move-result-object v0

    goto :goto_1

    .line 381
    :cond_2
    invoke-static {v0}, Lcom/facebook/orca/camera/ImageManager;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 382
    invoke-static {p0, p1}, Lcom/facebook/orca/camera/ImageManager;->a(Landroid/content/ContentResolver;Landroid/net/Uri;)Lcom/facebook/orca/camera/a/d;

    move-result-object v0

    goto :goto_1

    .line 384
    :cond_3
    const-string v0, "bucketId"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 385
    sget-object v1, Lcom/facebook/orca/camera/p;->ALL:Lcom/facebook/orca/camera/p;

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, p2, v0}, Lcom/facebook/orca/camera/ImageManager;->a(Landroid/content/ContentResolver;Lcom/facebook/orca/camera/p;IILjava/lang/String;)Lcom/facebook/orca/camera/a/d;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Landroid/content/ContentResolver;Lcom/facebook/orca/camera/ImageManager$ImageListParam;)Lcom/facebook/orca/camera/a/d;
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 302
    iget-object v6, p1, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->a:Lcom/facebook/orca/camera/p;

    .line 303
    iget v7, p1, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->b:I

    .line 304
    iget v4, p1, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->c:I

    .line 305
    iget-object v5, p1, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->d:Ljava/lang/String;

    .line 306
    iget-object v1, p1, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->e:Landroid/net/Uri;

    .line 307
    iget-boolean v0, p1, Lcom/facebook/orca/camera/ImageManager$ImageListParam;->f:Z

    .line 309
    if-nez v0, :cond_0

    if-nez p0, :cond_1

    .line 310
    :cond_0
    new-instance v0, Lcom/facebook/orca/camera/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/orca/camera/q;-><init>(Lcom/facebook/orca/camera/o;)V

    .line 363
    :goto_0
    return-object v0

    .line 313
    :cond_1
    if-eqz v1, :cond_2

    .line 314
    new-instance v0, Lcom/facebook/orca/camera/a/l;

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/camera/a/l;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    goto :goto_0

    .line 318
    :cond_2
    invoke-static {v9}, Lcom/facebook/orca/camera/ImageManager;->a(Z)Z

    move-result v0

    .line 321
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 323
    if-eqz v0, :cond_3

    sget-object v0, Lcom/facebook/orca/camera/p;->INTERNAL:Lcom/facebook/orca/camera/p;

    if-eq v6, v0, :cond_3

    .line 324
    and-int/lit8 v0, v7, 0x1

    if-eqz v0, :cond_3

    .line 325
    new-instance v0, Lcom/facebook/orca/camera/a/f;

    sget-object v2, Lcom/facebook/orca/camera/ImageManager;->d:Landroid/net/Uri;

    sget-object v3, Lcom/facebook/orca/camera/ImageManager;->e:Landroid/net/Uri;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/camera/a/f;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;ILjava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    :cond_3
    sget-object v0, Lcom/facebook/orca/camera/p;->INTERNAL:Lcom/facebook/orca/camera/p;

    if-eq v6, v0, :cond_4

    sget-object v0, Lcom/facebook/orca/camera/p;->ALL:Lcom/facebook/orca/camera/p;

    if-ne v6, v0, :cond_5

    .line 333
    :cond_4
    and-int/lit8 v0, v7, 0x1

    if-eqz v0, :cond_5

    .line 334
    new-instance v0, Lcom/facebook/orca/camera/a/f;

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    sget-object v3, Landroid/provider/MediaStore$Images$Thumbnails;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/camera/a/f;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;ILjava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 348
    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 349
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/a/b;

    .line 350
    invoke-virtual {v0}, Lcom/facebook/orca/camera/a/b;->c()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 351
    invoke-virtual {v0}, Lcom/facebook/orca/camera/a/b;->a()V

    .line 352
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 356
    :cond_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 357
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/a/b;

    goto :goto_0

    .line 361
    :cond_8
    new-instance v1, Lcom/facebook/orca/camera/a/g;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/facebook/orca/camera/a/d;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/camera/a/d;

    invoke-direct {v1, v0, v4}, Lcom/facebook/orca/camera/a/g;-><init>([Lcom/facebook/orca/camera/a/d;I)V

    move-object v0, v1

    .line 363
    goto :goto_0
.end method

.method public static a(Landroid/content/ContentResolver;Lcom/facebook/orca/camera/p;IILjava/lang/String;)Lcom/facebook/orca/camera/a/d;
    .locals 1

    .prologue
    .line 458
    invoke-static {p1, p2, p3, p4}, Lcom/facebook/orca/camera/ImageManager;->a(Lcom/facebook/orca/camera/p;IILjava/lang/String;)Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    move-result-object v0

    .line 460
    invoke-static {p0, v0}, Lcom/facebook/orca/camera/ImageManager;->a(Landroid/content/ContentResolver;Lcom/facebook/orca/camera/ImageManager$ImageListParam;)Lcom/facebook/orca/camera/a/d;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 500
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/facebook/orca/camera/ImageManager;->a(Z)Z

    move-result v0

    return v0
.end method

.method public static a(Z)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 504
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    .line 506
    const-string v2, "mounted"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 507
    if-eqz p0, :cond_0

    .line 508
    invoke-static {}, Lcom/facebook/orca/camera/ImageManager;->b()Z

    move-result v0

    .line 517
    :cond_0
    :goto_0
    return v0

    .line 513
    :cond_1
    if-nez p0, :cond_2

    const-string v2, "mounted_ro"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 517
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 6

    .prologue
    const/4 v5, -0x1

    .line 270
    const/4 v0, 0x0

    .line 271
    const/4 v2, 0x0

    .line 273
    :try_start_0
    new-instance v1, Landroid/media/ExifInterface;

    invoke-direct {v1, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 277
    :goto_0
    if-eqz v1, :cond_0

    .line 278
    const-string v2, "Orientation"

    invoke-virtual {v1, v2, v5}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v1

    .line 280
    if-eq v1, v5, :cond_0

    .line 282
    packed-switch v1, :pswitch_data_0

    .line 296
    :cond_0
    :goto_1
    :pswitch_0
    return v0

    .line 274
    :catch_0
    move-exception v1

    .line 275
    sget-object v3, Lcom/facebook/orca/camera/ImageManager;->c:Ljava/lang/Class;

    const-string v4, "cannot read exif"

    invoke-static {v3, v4, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v2

    goto :goto_0

    .line 284
    :pswitch_1
    const/16 v0, 0x5a

    .line 285
    goto :goto_1

    .line 287
    :pswitch_2
    const/16 v0, 0xb4

    .line 288
    goto :goto_1

    .line 290
    :pswitch_3
    const/16 v0, 0x10e

    goto :goto_1

    .line 282
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private static b()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 475
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/DCIM"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 477
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 478
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_1

    .line 479
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_1

    .line 495
    :cond_0
    :goto_0
    return v0

    .line 483
    :cond_1
    new-instance v2, Ljava/io/File;

    const-string v3, ".probe"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 487
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 489
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 492
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 493
    const/4 v0, 0x1

    goto :goto_0

    .line 494
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 391
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
