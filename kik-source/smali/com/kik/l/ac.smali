.class public final Lcom/kik/l/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;

.field private static g:Ljava/io/File;

.field private static h:Ljava/io/File;

.field private static i:Ljava/io/File;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:[B

.field private d:Ljava/io/File;

.field private e:Ljava/io/File;

.field private f:Ljava/io/File;

.field private j:Lkik/android/util/bs;

.field private k:Lkik/android/util/bs;

.field private l:Lcom/kik/l/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-string v0, "ImageStorage"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/l/ac;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Lkik/android/util/bs;Lkik/android/util/bs;Lcom/kik/l/p;)V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/16 v0, 0x4000

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/kik/l/ac;->c:[B

    .line 50
    iput-object p1, p0, Lcom/kik/l/ac;->b:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lcom/kik/l/ac;->d:Ljava/io/File;

    .line 52
    iput-object p3, p0, Lcom/kik/l/ac;->e:Ljava/io/File;

    .line 53
    iput-object p4, p0, Lcom/kik/l/ac;->f:Ljava/io/File;

    .line 54
    iput-object p7, p0, Lcom/kik/l/ac;->j:Lkik/android/util/bs;

    .line 55
    iput-object p8, p0, Lcom/kik/l/ac;->k:Lkik/android/util/bs;

    .line 56
    sput-object p5, Lcom/kik/l/ac;->h:Ljava/io/File;

    .line 57
    sput-object p6, Lcom/kik/l/ac;->i:Ljava/io/File;

    .line 58
    iput-object p9, p0, Lcom/kik/l/ac;->l:Lcom/kik/l/p;

    .line 59
    return-void
.end method

.method private static a()V
    .locals 3

    .prologue
    .line 407
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 408
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    .line 409
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    .line 417
    :cond_1
    :goto_0
    return-void

    .line 412
    :cond_2
    new-instance v1, Ljava/io/File;

    const-string v2, "Kik"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 413
    sput-object v1, Lcom/kik/l/ac;->g:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 414
    sget-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 421
    iget-object v0, p0, Lcom/kik/l/ac;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/kik/l/ac;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 424
    :cond_0
    iget-object v0, p0, Lcom/kik/l/ac;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 425
    iget-object v0, p0, Lcom/kik/l/ac;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 427
    :cond_1
    sget-object v0, Lcom/kik/l/ac;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 428
    sget-object v0, Lcom/kik/l/ac;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 430
    :cond_2
    iget-object v0, p0, Lcom/kik/l/ac;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 431
    iget-object v0, p0, Lcom/kik/l/ac;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 433
    :cond_3
    sget-object v0, Lcom/kik/l/ac;->i:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 434
    sget-object v0, Lcom/kik/l/ac;->i:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 436
    :cond_4
    return-void
.end method

.method static b(Ljava/io/File;)Z
    .locals 4

    .prologue
    .line 395
    invoke-static {}, Lcom/kik/l/ac;->a()V

    .line 396
    sget-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    if-nez v0, :cond_0

    .line 397
    const/4 v0, 0x0

    .line 402
    :goto_0
    return v0

    .line 400
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 401
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/kik/l/ac;->g:Ljava/io/File;

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 402
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 203
    invoke-direct {p0}, Lcom/kik/l/ac;->b()V

    .line 204
    if-nez p2, :cond_1

    move-object v0, v1

    .line 271
    :cond_0
    :goto_0
    return-object v0

    .line 210
    :cond_1
    if-eqz p3, :cond_8

    .line 211
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/kik/l/ac;->e:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".jpg"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 212
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v2

    .line 213
    goto :goto_0

    .line 215
    :cond_2
    if-nez p5, :cond_f

    .line 216
    new-instance v0, Ljava/io/File;

    sget-object v3, Lcom/kik/l/ac;->h:Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 217
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 231
    :goto_1
    :try_start_0
    check-cast p2, [B

    .line 232
    if-eqz p3, :cond_3

    .line 233
    iget-object v3, p0, Lcom/kik/l/ac;->l:Lcom/kik/l/p;

    invoke-virtual {v3, p2, p1}, Lcom/kik/l/p;->a([BLjava/lang/String;)V

    .line 235
    :cond_3
    if-eqz v2, :cond_e

    .line 236
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    :try_start_1
    invoke-virtual {v4, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 239
    :goto_2
    if-eqz v0, :cond_d

    .line 240
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 241
    :try_start_2
    invoke-virtual {v3, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 243
    :goto_3
    if-eqz p4, :cond_4

    if-eqz p3, :cond_4

    .line 245
    invoke-virtual {p0, p1, p2}, Lcom/kik/l/ac;->a(Ljava/lang/String;[B)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 256
    :cond_4
    if-eqz v4, :cond_5

    .line 257
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 259
    :cond_5
    if-eqz v3, :cond_6

    .line 260
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 267
    :cond_6
    :goto_4
    if-eqz p3, :cond_7

    .line 268
    iget-object v1, p0, Lcom/kik/l/ac;->j:Lkik/android/util/bs;

    invoke-virtual {v1, p1, v2}, Lkik/android/util/bs;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    iget-object v1, p0, Lcom/kik/l/ac;->k:Lkik/android/util/bs;

    invoke-virtual {v1, p1, v0}, Lkik/android/util/bs;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    :cond_7
    if-nez v0, :cond_0

    move-object v0, v2

    goto/16 :goto_0

    .line 223
    :cond_8
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/kik/l/ac;->i:Ljava/io/File;

    invoke-direct {v0, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 224
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    move-object v2, v1

    goto :goto_1

    .line 263
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 248
    :catch_1
    move-exception v3

    move-object v4, v1

    move-object v6, v1

    move-object v1, v3

    move-object v3, v6

    :goto_5
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 256
    if-eqz v4, :cond_9

    .line 257
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 259
    :cond_9
    if-eqz v3, :cond_6

    .line 260
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_4

    .line 263
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 251
    :catch_3
    move-exception v3

    move-object v4, v1

    move-object v6, v1

    move-object v1, v3

    move-object v3, v6

    :goto_6
    :try_start_6
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 256
    if-eqz v4, :cond_a

    .line 257
    :try_start_7
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 259
    :cond_a
    if-eqz v3, :cond_6

    .line 260
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_4

    .line 263
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 255
    :catchall_0
    move-exception v0

    move-object v4, v1

    .line 256
    :goto_7
    if-eqz v4, :cond_b

    .line 257
    :try_start_8
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 259
    :cond_b
    if-eqz v1, :cond_c

    .line 260
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 265
    :cond_c
    :goto_8
    throw v0

    .line 263
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_8

    .line 255
    :catchall_1
    move-exception v0

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v1, v3

    goto :goto_7

    .line 251
    :catch_6
    move-exception v3

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    goto :goto_6

    :catch_7
    move-exception v1

    goto :goto_6

    .line 248
    :catch_8
    move-exception v3

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    goto :goto_5

    :catch_9
    move-exception v1

    goto :goto_5

    :cond_d
    move-object v3, v1

    goto/16 :goto_3

    :cond_e
    move-object v4, v1

    goto/16 :goto_2

    :cond_f
    move-object v0, v1

    goto/16 :goto_1
.end method

.method public final a(Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 581
    invoke-virtual {p0, p1, p2}, Lcom/kik/l/ac;->b(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v1

    .line 583
    if-nez v1, :cond_0

    .line 593
    :goto_0
    return-object v0

    .line 588
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 590
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method final a(Ljava/io/File;)V
    .locals 6

    .prologue
    .line 352
    invoke-static {}, Lcom/kik/l/ac;->a()V

    .line 355
    sget-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    if-nez v0, :cond_0

    .line 391
    :goto_0
    return-void

    .line 359
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 360
    new-instance v3, Ljava/io/File;

    sget-object v1, Lcom/kik/l/ac;->g:Ljava/io/File;

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 362
    const/4 v2, 0x0

    .line 364
    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 368
    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 369
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    :goto_1
    :try_start_1
    invoke-virtual {v4, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_2

    .line 371
    const/4 v5, 0x0

    invoke-virtual {v1, v0, v5, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 374
    :catch_0
    move-exception v0

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 382
    if-eqz v1, :cond_1

    .line 383
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 390
    :cond_1
    :goto_3
    iget-object v0, p0, Lcom/kik/l/ac;->b:Landroid/content/Context;

    invoke-static {v0, v3}, Lkik/android/widget/cr;->a(Landroid/content/Context;Ljava/io/File;)V

    goto :goto_0

    .line 382
    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_3

    .line 386
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 377
    :catch_3
    move-exception v0

    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 382
    if-eqz v2, :cond_1

    .line 383
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_3

    .line 386
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 381
    :catchall_0
    move-exception v0

    .line 382
    :goto_5
    if-eqz v2, :cond_3

    .line 383
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 388
    :cond_3
    :goto_6
    throw v0

    .line 386
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_6

    .line 381
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_5

    .line 377
    :catch_6
    move-exception v0

    move-object v2, v1

    goto :goto_4

    .line 374
    :catch_7
    move-exception v0

    move-object v1, v2

    goto :goto_2
.end method

.method final a(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 440
    invoke-direct {p0}, Lcom/kik/l/ac;->b()V

    .line 441
    iget-object v0, p0, Lcom/kik/l/ac;->k:Lkik/android/util/bs;

    invoke-virtual {v0, p1}, Lkik/android/util/bs;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 445
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/ac;->e:Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 446
    if-nez v0, :cond_0

    .line 447
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/kik/l/ac;->h:Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 449
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 450
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_6

    .line 452
    iget-object v2, p0, Lcom/kik/l/ac;->l:Lcom/kik/l/p;

    invoke-virtual {v2, v0}, Lcom/kik/l/p;->a(Ljava/io/File;)V

    .line 454
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 459
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    .line 460
    if-nez v2, :cond_2

    .line 464
    :try_start_1
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 465
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileInputStream;->available()I

    move-result v2

    new-array v5, v2, [B

    .line 466
    invoke-virtual {v4, v5}, Ljava/io/FileInputStream;->read([B)I

    .line 467
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 468
    :try_start_3
    invoke-virtual {v2, v5}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 475
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 478
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 486
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 493
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/kik/l/ac;->k:Lkik/android/util/bs;

    invoke-virtual {v0, p1}, Lkik/android/util/bs;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    return-void

    .line 456
    :catch_0
    move-exception v2

    .line 457
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "cannot make file:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 482
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 470
    :catch_2
    move-exception v1

    move-object v2, v3

    .line 471
    :goto_3
    :try_start_5
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "image transfer to cache failed:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 475
    if-eqz v3, :cond_3

    .line 476
    :try_start_6
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    .line 478
    :cond_3
    if-eqz v2, :cond_1

    .line 479
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_1

    .line 482
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 474
    :catchall_0
    move-exception v0

    move-object v4, v3

    .line 475
    :goto_4
    if-eqz v4, :cond_4

    .line 476
    :try_start_7
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 478
    :cond_4
    if-eqz v3, :cond_5

    .line 479
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 484
    :cond_5
    :goto_5
    throw v0

    .line 482
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_5

    .line 490
    :cond_6
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_2

    .line 474
    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v3, v2

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v4, v3

    move-object v3, v2

    goto :goto_4

    .line 470
    :catch_5
    move-exception v1

    move-object v2, v3

    move-object v3, v4

    goto :goto_3

    :catch_6
    move-exception v1

    move-object v3, v4

    goto :goto_3
.end method

.method public final a(Ljava/lang/String;Ljava/io/File;)V
    .locals 6

    .prologue
    .line 310
    invoke-static {}, Lcom/kik/l/ac;->a()V

    .line 313
    sget-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    if-nez v0, :cond_0

    .line 348
    :goto_0
    return-void

    .line 317
    :cond_0
    new-instance v3, Ljava/io/File;

    sget-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".jpg"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 319
    const/4 v2, 0x0

    .line 321
    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 325
    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 326
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    :goto_1
    :try_start_1
    invoke-virtual {v4, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_2

    .line 328
    const/4 v5, 0x0

    invoke-virtual {v1, v0, v5, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 331
    :catch_0
    move-exception v0

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 339
    if-eqz v1, :cond_1

    .line 340
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 347
    :cond_1
    :goto_3
    iget-object v0, p0, Lcom/kik/l/ac;->b:Landroid/content/Context;

    invoke-static {v0, v3}, Lkik/android/widget/cr;->a(Landroid/content/Context;Ljava/io/File;)V

    goto :goto_0

    .line 339
    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_3

    .line 343
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 334
    :catch_3
    move-exception v0

    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 339
    if-eqz v2, :cond_1

    .line 340
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_3

    .line 343
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 338
    :catchall_0
    move-exception v0

    .line 339
    :goto_5
    if-eqz v2, :cond_3

    .line 340
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 345
    :cond_3
    :goto_6
    throw v0

    .line 343
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_6

    .line 338
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_5

    .line 334
    :catch_6
    move-exception v0

    move-object v2, v1

    goto :goto_4

    .line 331
    :catch_7
    move-exception v0

    move-object v1, v2

    goto :goto_2
.end method

.method final a(Ljava/lang/String;[B)V
    .locals 4

    .prologue
    .line 276
    invoke-static {}, Lcom/kik/l/ac;->a()V

    .line 277
    sget-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    if-nez v0, :cond_0

    .line 306
    :goto_0
    return-void

    .line 281
    :cond_0
    new-instance v3, Ljava/io/File;

    sget-object v0, Lcom/kik/l/ac;->g:Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".jpg"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 283
    const/4 v2, 0x0

    .line 285
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    :try_start_1
    invoke-virtual {v1, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 296
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 305
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/kik/l/ac;->b:Landroid/content/Context;

    invoke-static {v0, v3}, Lkik/android/widget/cr;->a(Landroid/content/Context;Ljava/io/File;)V

    goto :goto_0

    .line 300
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 288
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 296
    if-eqz v1, :cond_1

    .line 297
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    .line 300
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 291
    :catch_3
    move-exception v0

    :goto_3
    :try_start_5
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 296
    if-eqz v2, :cond_1

    .line 297
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_1

    .line 300
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 295
    :catchall_0
    move-exception v0

    .line 296
    :goto_4
    if-eqz v2, :cond_2

    .line 297
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 302
    :cond_2
    :goto_5
    throw v0

    .line 300
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_5

    .line 295
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_4

    .line 291
    :catch_6
    move-exception v0

    move-object v2, v1

    goto :goto_3

    .line 288
    :catch_7
    move-exception v0

    goto :goto_2
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 6

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/kik/l/ac;->b()V

    .line 67
    const/4 v0, 0x0

    .line 68
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/ac;->d:Ljava/io/File;

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 70
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 72
    :cond_0
    const/4 v3, 0x0

    .line 74
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :try_start_1
    check-cast p2, [B

    .line 76
    invoke-virtual {v2, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 77
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/io/File;->setLastModified(J)Z
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    const/4 v0, 0x1

    .line 88
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 96
    :cond_1
    :goto_0
    return v0

    .line 92
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 80
    :catch_1
    move-exception v1

    move-object v2, v3

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    if-eqz v2, :cond_1

    .line 89
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 92
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 83
    :catch_3
    move-exception v1

    move-object v2, v3

    :goto_2
    :try_start_5
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 88
    if-eqz v2, :cond_1

    .line 89
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_0

    .line 92
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    move-object v2, v3

    .line 88
    :goto_3
    if-eqz v2, :cond_2

    .line 89
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 94
    :cond_2
    :goto_4
    throw v0

    .line 92
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 87
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 83
    :catch_6
    move-exception v1

    goto :goto_2

    .line 80
    :catch_7
    move-exception v1

    goto :goto_1
.end method

.method public final b(Ljava/lang/String;Z)Ljava/io/File;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 618
    if-nez p1, :cond_1

    move-object v0, v1

    .line 648
    :cond_0
    :goto_0
    return-object v0

    .line 622
    :cond_1
    if-eqz p2, :cond_6

    .line 624
    iget-object v0, p0, Lcom/kik/l/ac;->j:Lkik/android/util/bs;

    invoke-virtual {v0, p1}, Lkik/android/util/bs;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 625
    if-nez v0, :cond_2

    .line 626
    iget-object v0, p0, Lcom/kik/l/ac;->k:Lkik/android/util/bs;

    invoke-virtual {v0, p1}, Lkik/android/util/bs;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 628
    :cond_2
    if-nez v0, :cond_3

    .line 629
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/ac;->e:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".jpg"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 631
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_4

    .line 632
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/kik/l/ac;->h:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".jpg"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 634
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_5

    .line 635
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/ac;->f:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".mp4"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 638
    :cond_5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 639
    goto :goto_0

    .line 643
    :cond_6
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/kik/l/ac;->i:Ljava/io/File;

    invoke-direct {v0, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 644
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 645
    goto/16 :goto_0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 558
    iget-object v0, p0, Lcom/kik/l/ac;->j:Lkik/android/util/bs;

    invoke-virtual {v0, p1}, Lkik/android/util/bs;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 562
    if-nez v0, :cond_0

    .line 563
    iget-object v0, p0, Lcom/kik/l/ac;->k:Lkik/android/util/bs;

    invoke-virtual {v0, p1}, Lkik/android/util/bs;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 565
    :cond_0
    if-nez v0, :cond_1

    .line 566
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/kik/l/ac;->e:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 568
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    .line 569
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/kik/l/ac;->h:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 572
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method final c(Ljava/io/File;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 524
    const/4 v0, 0x1

    .line 525
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 553
    :goto_0
    return v1

    .line 529
    :cond_0
    const/4 v3, 0x0

    .line 531
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 532
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v4

    long-to-int v3, v4

    new-array v3, v3, [B

    .line 533
    invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I

    .line 534
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    .line 537
    invoke-virtual {p0, v4, v3}, Lcom/kik/l/ac;->a(Ljava/lang/String;[B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 545
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_1
    move v1, v0

    .line 553
    goto :goto_0

    .line 549
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 539
    :catch_1
    move-exception v0

    move-object v2, v3

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 545
    if-eqz v2, :cond_1

    .line 546
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_1
    move v0, v1

    .line 551
    goto :goto_1

    .line 549
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v1

    .line 552
    goto :goto_1

    .line 544
    :catchall_0
    move-exception v0

    move-object v2, v3

    .line 545
    :goto_3
    if-eqz v2, :cond_2

    .line 546
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 551
    :cond_2
    :goto_4
    throw v0

    .line 549
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 544
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 539
    :catch_4
    move-exception v0

    goto :goto_2
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 598
    invoke-virtual {p0, p1, v0}, Lcom/kik/l/ac;->b(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v1

    .line 599
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final d(Ljava/lang/String;)[I
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 604
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 605
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 606
    iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 607
    invoke-virtual {p0, p1, v3}, Lcom/kik/l/ac;->b(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v2

    .line 608
    if-eqz v2, :cond_0

    .line 609
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 610
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    aput v2, v0, v3

    .line 611
    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    aput v1, v0, v4

    .line 613
    :cond_0
    return-object v0

    .line 604
    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
    .end array-data
.end method

.method public final e(Ljava/lang/String;)[B
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 653
    if-nez p1, :cond_1

    .line 681
    :cond_0
    :goto_0
    return-object v0

    .line 656
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lcom/kik/l/ac;->b(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v3

    .line 657
    if-eqz v3, :cond_0

    .line 661
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    long-to-int v1, v4

    new-array v1, v1, [B

    .line 665
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 666
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/io/FileInputStream;->read([B)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 673
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    :goto_1
    move-object v0, v1

    .line 681
    goto :goto_0

    .line 677
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 668
    :catch_1
    move-exception v2

    move-object v6, v2

    move-object v2, v0

    move-object v0, v6

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 673
    if-eqz v2, :cond_2

    .line 674
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    .line 677
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 672
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    .line 673
    :goto_3
    if-eqz v2, :cond_3

    .line 674
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 679
    :cond_3
    :goto_4
    throw v0

    .line 677
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 672
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 668
    :catch_4
    move-exception v0

    goto :goto_2
.end method
