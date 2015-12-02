.class public Lcom/qihoo360/mobilesafe/support/a/h;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 41
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "360s"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string/jumbo v2, "su"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/h;->a:[Ljava/lang/String;

    .line 149
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/h;->b:Ljava/lang/String;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 8

    .prologue
    .line 46
    const-string/jumbo v0, "com.qihoo.socket%x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/32 v6, 0xffff

    and-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 47
    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    const-string/jumbo v0, "360s"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 59
    const-string/jumbo v0, "su"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    const-string/jumbo v0, "su"

    .line 64
    :goto_0
    return-object v0

    .line 62
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 64
    :cond_1
    const-string/jumbo v0, "360s"

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Z)Ljava/lang/String;
    .locals 4

    .prologue
    .line 307
    if-eqz p1, :cond_0

    const-string/jumbo v0, "librootjniex.so"

    :goto_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 308
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 309
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 311
    const/4 v0, -0x1

    .line 313
    const/4 v3, 0x1

    :try_start_0
    invoke-static {v1, v3}, Lcom/qihoo360/mobilesafe/support/NativeManager;->access(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 316
    :goto_1
    if-nez v0, :cond_2

    .line 318
    if-eqz p1, :cond_1

    const-string/jumbo v0, "librootjniex.so"

    :goto_2
    invoke-static {p0, v2, v0}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 331
    :goto_3
    return-object v0

    .line 307
    :cond_0
    const-string/jumbo v0, "librootjni.so"

    goto :goto_0

    .line 318
    :cond_1
    const-string/jumbo v0, "librootjni.so"

    goto :goto_2

    .line 329
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 330
    if-eqz p1, :cond_3

    const-string/jumbo v0, "librootjniex.so"

    :goto_4
    invoke-static {p0, v1, v0}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    .line 331
    goto :goto_3

    .line 330
    :cond_3
    const-string/jumbo v0, "librootjni.so"

    goto :goto_4

    .line 314
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 391
    if-eqz p0, :cond_0

    const-string/jumbo v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 397
    :goto_0
    return-object p0

    .line 393
    :cond_0
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 394
    if-nez v0, :cond_1

    .line 395
    const/4 p0, 0x0

    goto :goto_0

    .line 397
    :cond_1
    invoke-static {v0, p0}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 340
    .line 344
    :try_start_0
    new-instance v3, Ljava/util/zip/ZipFile;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    :try_start_1
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v1

    .line 347
    :cond_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-nez v0, :cond_4

    move-object v1, v2

    .line 372
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 374
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 377
    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    .line 379
    :try_start_3
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    .line 385
    :cond_3
    :goto_2
    const/16 v0, 0x1ed

    :try_start_4
    invoke-static {p1, v0}, Lcom/qihoo360/mobilesafe/support/NativeManager;->chmod(Ljava/lang/String;I)I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_7

    .line 388
    :goto_3
    return-void

    .line 348
    :cond_4
    :try_start_5
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/zip/ZipEntry;

    .line 349
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v4

    if-nez v4, :cond_0

    .line 353
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v4

    .line 355
    invoke-virtual {v4, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 359
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_9
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 360
    :try_start_6
    invoke-virtual {v3, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0

    .line 361
    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->CopyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 362
    if-eqz v0, :cond_1

    .line 363
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_0

    .line 368
    :catch_0
    move-exception v0

    move-object v0, v1

    move-object v2, v3

    .line 372
    :goto_4
    if-eqz v0, :cond_5

    .line 374
    :try_start_7
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 377
    :cond_5
    :goto_5
    if-eqz v2, :cond_3

    .line 379
    :try_start_8
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_2

    .line 380
    :catch_1
    move-exception v0

    goto :goto_2

    .line 371
    :catchall_0
    move-exception v0

    move-object v3, v2

    .line 372
    :goto_6
    if-eqz v2, :cond_6

    .line 374
    :try_start_9
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 377
    :cond_6
    :goto_7
    if-eqz v3, :cond_7

    .line 379
    :try_start_a
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    .line 382
    :cond_7
    :goto_8
    throw v0

    .line 375
    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v1

    goto :goto_7

    .line 380
    :catch_4
    move-exception v1

    goto :goto_8

    .line 375
    :catch_5
    move-exception v0

    goto :goto_1

    .line 380
    :catch_6
    move-exception v0

    goto :goto_2

    .line 386
    :catch_7
    move-exception v0

    goto :goto_3

    .line 371
    :catchall_1
    move-exception v0

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v2, v1

    goto :goto_6

    .line 368
    :catch_8
    move-exception v0

    move-object v0, v2

    goto :goto_4

    :catch_9
    move-exception v0

    move-object v0, v2

    move-object v2, v3

    goto :goto_4
.end method

.method private static a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v5, 0x0

    .line 74
    :try_start_0
    new-instance v4, Ljava/util/zip/ZipFile;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :try_start_1
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v6

    .line 77
    :cond_0
    invoke-interface {v6}, Ljava/util/Enumeration;->hasMoreElements()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_10
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-nez v0, :cond_4

    .line 119
    if-eqz v2, :cond_1

    .line 121
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    .line 124
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 126
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    .line 129
    :cond_2
    :goto_1
    if-eqz v4, :cond_3

    .line 131
    :try_start_4
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9

    :cond_3
    :goto_2
    move v0, v1

    .line 135
    :goto_3
    return v0

    .line 78
    :cond_4
    :try_start_5
    invoke-interface {v6}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/zip/ZipEntry;

    .line 79
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v7

    if-nez v7, :cond_0

    .line 83
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v7

    .line 84
    invoke-virtual {v7, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 85
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getSize()J

    move-result-wide v6

    .line 86
    invoke-virtual {p1}, Ljava/io/File;->length()J
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_10
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-wide v8

    .line 87
    cmp-long v3, v6, v8

    if-eqz v3, :cond_9

    move-object v0, v2

    move-object v3, v2

    .line 119
    :cond_5
    if-eqz v3, :cond_6

    .line 121
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 124
    :cond_6
    :goto_4
    if-eqz v0, :cond_7

    .line 126
    :try_start_7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 129
    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    .line 131
    :try_start_8
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    :cond_8
    :goto_6
    move v0, v1

    .line 92
    goto :goto_3

    .line 94
    :cond_9
    :try_start_9
    invoke-virtual {v4, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_10
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    move-result-object v3

    .line 95
    :try_start_a
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_11
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 96
    :try_start_b
    invoke-static {v3, v0}, Lcom/qihoo360/common/utils/Utils;->diffStream(Ljava/io/InputStream;Ljava/io/InputStream;)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_12
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    move-result v2

    if-eqz v2, :cond_5

    .line 119
    if-eqz v3, :cond_a

    .line 121
    :try_start_c
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    .line 124
    :cond_a
    :goto_7
    if-eqz v0, :cond_b

    .line 126
    :try_start_d
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    .line 129
    :cond_b
    :goto_8
    if-eqz v4, :cond_c

    .line 131
    :try_start_e
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6

    .line 100
    :cond_c
    :goto_9
    const/4 v0, 0x1

    goto :goto_3

    .line 115
    :catch_0
    move-exception v0

    move-object v0, v2

    move-object v3, v2

    .line 119
    :goto_a
    if-eqz v2, :cond_d

    .line 121
    :try_start_f
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_a

    .line 124
    :cond_d
    :goto_b
    if-eqz v0, :cond_e

    .line 126
    :try_start_10
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_b

    .line 129
    :cond_e
    :goto_c
    if-eqz v3, :cond_f

    .line 131
    :try_start_11
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_c

    :cond_f
    :goto_d
    move v0, v1

    .line 135
    goto :goto_3

    .line 118
    :catchall_0
    move-exception v0

    move-object v3, v2

    move-object v4, v2

    .line 119
    :goto_e
    if-eqz v3, :cond_10

    .line 121
    :try_start_12
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_d

    .line 124
    :cond_10
    :goto_f
    if-eqz v2, :cond_11

    .line 126
    :try_start_13
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_e

    .line 129
    :cond_11
    :goto_10
    if-eqz v4, :cond_12

    .line 131
    :try_start_14
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_f

    .line 134
    :cond_12
    :goto_11
    throw v0

    .line 122
    :catch_1
    move-exception v2

    goto :goto_4

    .line 127
    :catch_2
    move-exception v0

    goto :goto_5

    .line 132
    :catch_3
    move-exception v0

    goto :goto_6

    .line 122
    :catch_4
    move-exception v1

    goto :goto_7

    .line 127
    :catch_5
    move-exception v0

    goto :goto_8

    .line 132
    :catch_6
    move-exception v0

    goto :goto_9

    .line 122
    :catch_7
    move-exception v0

    goto/16 :goto_0

    .line 127
    :catch_8
    move-exception v0

    goto/16 :goto_1

    .line 132
    :catch_9
    move-exception v0

    goto/16 :goto_2

    .line 122
    :catch_a
    move-exception v2

    goto :goto_b

    .line 127
    :catch_b
    move-exception v0

    goto :goto_c

    .line 132
    :catch_c
    move-exception v0

    goto :goto_d

    .line 122
    :catch_d
    move-exception v1

    goto :goto_f

    .line 127
    :catch_e
    move-exception v1

    goto :goto_10

    .line 132
    :catch_f
    move-exception v1

    goto :goto_11

    .line 118
    :catchall_1
    move-exception v0

    move-object v3, v2

    goto :goto_e

    :catchall_2
    move-exception v0

    goto :goto_e

    :catchall_3
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_e

    .line 115
    :catch_10
    move-exception v0

    move-object v0, v2

    move-object v3, v4

    goto :goto_a

    :catch_11
    move-exception v0

    move-object v0, v2

    move-object v2, v3

    move-object v3, v4

    goto :goto_a

    :catch_12
    move-exception v2

    move-object v2, v3

    move-object v3, v4

    goto :goto_a
.end method

.method public static a(Ljava/io/InputStream;)[B
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 558
    if-nez p0, :cond_0

    .line 575
    :goto_0
    return-object v0

    .line 560
    :cond_0
    const/16 v1, 0x2000

    new-array v1, v1, [B

    .line 561
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 564
    :goto_1
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-gtz v3, :cond_1

    .line 567
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 568
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    move-object v0, v1

    .line 569
    goto :goto_0

    .line 565
    :cond_1
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 570
    :catch_0
    move-exception v1

    .line 572
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 573
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/util/ArrayList;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .prologue
    .line 532
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 534
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 535
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 537
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 538
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 539
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 540
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 545
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 546
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 553
    :goto_1
    return-object v0

    .line 540
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 541
    if-eqz v0, :cond_1

    .line 542
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 543
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 548
    :catch_0
    move-exception v0

    .line 550
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 553
    :goto_2
    const/4 v0, 0x0

    goto :goto_1

    .line 551
    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public static a(Ljava/lang/String;Ljava/util/List;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .prologue
    .line 521
    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-static {p0, p1, v0, v1}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)[B

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .prologue
    .line 505
    const/16 v0, 0x20

    invoke-static {p0, p1, p2, v0}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)[B

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I)[B"
        }
    .end annotation

    .prologue
    .line 463
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x100

    invoke-direct {v1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 465
    int-to-byte v0, p3

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 466
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 467
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 468
    if-eqz p1, :cond_2

    .line 469
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 470
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 478
    :goto_1
    if-eqz p2, :cond_5

    .line 479
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 480
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_3

    .line 494
    :goto_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 497
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 500
    :goto_4
    return-object v0

    .line 470
    :cond_0
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 471
    if-eqz v0, :cond_1

    .line 472
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 473
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0

    .line 489
    :catch_0
    move-exception v0

    goto :goto_3

    .line 476
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    .line 480
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 481
    if-eqz v0, :cond_4

    .line 482
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 483
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_2

    .line 486
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    .line 498
    :catch_1
    move-exception v1

    goto :goto_4
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 140
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/h;->c()Ljava/lang/String;

    move-result-object v0

    .line 141
    const-string/jumbo v1, "armeabi-v7a"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "armeabi"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 142
    :cond_0
    const-string/jumbo v0, "armeabi"

    .line 146
    :goto_0
    return-object v0

    .line 143
    :cond_1
    const-string/jumbo v1, "x86"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    const-string/jumbo v0, "x86"

    goto :goto_0

    .line 146
    :cond_2
    const-string/jumbo v0, "armeabi"

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 212
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 213
    if-eqz v0, :cond_1

    .line 214
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 215
    if-eqz v0, :cond_1

    .line 216
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    const-string/jumbo v0, "/lib/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    const-string/jumbo v0, "libsu.so"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 220
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 221
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 225
    const/4 v2, 0x1

    :try_start_0
    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/support/NativeManager;->access(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 228
    :goto_0
    if-nez v2, :cond_1

    .line 230
    const-string/jumbo v2, "libsu.so"

    invoke-static {p0, v3, v2}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 267
    :cond_0
    :goto_1
    return-object v0

    .line 226
    :catch_0
    move-exception v2

    move v2, v1

    goto :goto_0

    .line 243
    :cond_1
    const-string/jumbo v0, "libsu.so"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 244
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 245
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 249
    const/4 v3, 0x1

    :try_start_1
    invoke-static {v0, v3}, Lcom/qihoo360/mobilesafe/support/NativeManager;->access(Ljava/lang/String;I)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v1

    .line 252
    :goto_2
    if-nez v1, :cond_2

    .line 254
    const-string/jumbo v1, "libsu.so"

    invoke-static {p0, v2, v1}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 265
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 266
    const-string/jumbo v1, "libsu.so"

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 250
    :catch_1
    move-exception v3

    goto :goto_2
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 402
    if-nez p0, :cond_0

    .line 451
    :goto_0
    return-object p0

    .line 406
    :cond_0
    new-instance v1, Ljava/io/File;

    const-string/jumbo v2, "/system/bin/"

    invoke-direct {v1, v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 407
    const-string/jumbo p0, "/system/bin/"

    goto :goto_0

    .line 411
    :cond_1
    new-instance v1, Ljava/io/File;

    const-string/jumbo v2, "/system/xbin/"

    invoke-direct {v1, v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 412
    const-string/jumbo p0, "/system/xbin/"

    goto :goto_0

    .line 420
    :cond_2
    const-string/jumbo v1, "PATH"

    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 421
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object p0, v0

    .line 425
    goto :goto_0

    .line 428
    :cond_3
    const-string/jumbo v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 429
    const-string/jumbo v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 430
    array-length v4, v3

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    if-lt v2, v4, :cond_4

    move-object p0, v0

    .line 442
    goto :goto_0

    .line 430
    :cond_4
    aget-object v1, v3, v2

    .line 431
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_5

    move-object p0, v1

    .line 435
    goto :goto_0

    .line 430
    :cond_5
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 445
    :cond_6
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_7

    move-object p0, v1

    .line 446
    goto :goto_0

    :cond_7
    move-object p0, v0

    .line 451
    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .prologue
    .line 513
    const/16 v0, 0x40

    invoke-static {p0, p1, p2, v0}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)[B

    move-result-object v0

    return-object v0
.end method

.method private static c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 157
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/h;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 158
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/h;->b:Ljava/lang/String;

    .line 168
    :goto_0
    return-object v0

    .line 159
    :cond_0
    const-string/jumbo v0, "ro.product.cpu.abi"

    invoke-static {v0}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 160
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 162
    const-string/jumbo v0, "armeabi-v7a"

    .line 167
    :cond_1
    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/h;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 271
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 596
    const/4 v0, 0x1

    return v0
.end method
