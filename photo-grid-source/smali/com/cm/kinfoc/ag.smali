.class public final Lcom/cm/kinfoc/ag;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field private static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/cm/kinfoc/ag;->a:Z

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/cm/kinfoc/ag;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(J)J
    .locals 4

    .prologue
    .line 270
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 271
    sub-long/2addr v0, p0

    const-wide/32 v2, 0x5265c00

    div-long/2addr v0, v2

    long-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-long v0, v0

    return-wide v0
.end method

.method public static a(Landroid/content/Context;I)Ljava/io/File;
    .locals 1

    .prologue
    .line 221
    invoke-static {p0, p1}, Lcom/cm/kinfoc/ag;->e(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v0

    .line 222
    invoke-static {v0}, Lcom/cm/kinfoc/ag;->a(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/io/File;)Ljava/io/File;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 254
    if-nez p0, :cond_1

    move-object p0, v0

    .line 260
    :cond_0
    :goto_0
    return-object p0

    .line 257
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    move-object p0, v0

    .line 260
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .prologue
    .line 397
    const-string v0, ""

    .line 398
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3

    .line 400
    :try_start_0
    const-string v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 401
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 402
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    .line 405
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    array-length v5, v3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v5, :cond_2

    aget-byte v2, v3, v1

    .line 408
    if-gez v2, :cond_0

    .line 409
    add-int/lit16 v2, v2, 0x100

    .line 411
    :cond_0
    const/16 v6, 0x10

    if-ge v2, v6, :cond_1

    .line 412
    const-string v6, "0"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 416
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 422
    :cond_3
    :goto_1
    return-object v0

    .line 419
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_1
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 57
    :try_start_0
    const-string v0, "kcmutil"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 59
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 70
    if-nez p0, :cond_0

    .line 107
    :goto_0
    return v0

    .line 76
    :cond_0
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    .line 77
    sget-object v1, Lcom/cm/kinfoc/ag;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 80
    :try_start_0
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/cm/kinfoc/a/e;->c()Ljava/io/File;

    move-result-object v2

    .line 82
    if-nez v2, :cond_1

    .line 83
    monitor-exit v1

    goto :goto_0

    .line 98
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 86
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 88
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-char v4, Ljava/io/File;->separatorChar:C

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "kfmt.dat"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 91
    const-string v4, "kfmt.dat"

    invoke-static {p0, v4, v3}, Lcom/cm/kinfoc/ag;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    .line 93
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-char v4, Ljava/io/File;->separatorChar:C

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "kctrl.dat"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 94
    const-string v4, "kctrl.dat"

    invoke-static {p0, v4, v2}, Lcom/cm/kinfoc/ag;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    .line 96
    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    .line 97
    const/4 v0, 0x1

    .line 98
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 118
    if-nez p0, :cond_1

    move v0, v1

    .line 193
    :cond_0
    :goto_0
    return v0

    .line 128
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    .line 130
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 131
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 132
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 135
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/cm/kinfoc/a/e;->a(Ljava/io/File;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 137
    :try_start_1
    invoke-virtual {v5, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    .line 141
    :goto_1
    :try_start_2
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcom/cm/kinfoc/a/e;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v7

    .line 142
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result v6

    if-eqz v6, :cond_2

    .line 183
    if-eqz v2, :cond_0

    .line 185
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    .line 189
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v2

    move-object v2, v3

    goto :goto_1

    .line 145
    :cond_2
    :try_start_4
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v4, v2

    .line 152
    :goto_2
    :try_start_5
    invoke-virtual {v5, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-result-object v2

    .line 153
    :try_start_6
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_9
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v3, v5

    .line 159
    :goto_3
    const/16 v5, 0x1000

    :try_start_7
    new-array v5, v5, [B

    .line 163
    :goto_4
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    .line 164
    if-lez v6, :cond_5

    .line 165
    const/4 v7, 0x0

    invoke-virtual {v3, v5, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_4

    .line 183
    :catch_2
    move-exception v0

    move-object v3, v4

    :goto_5
    if-eqz v3, :cond_7

    .line 185
    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    move v0, v1

    .line 190
    goto :goto_0

    .line 147
    :cond_3
    :try_start_9
    invoke-static {p2}, Lcom/cm/kinfoc/h;->a(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :cond_4
    move-object v4, v3

    goto :goto_2

    .line 172
    :cond_5
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 175
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V

    .line 176
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 183
    if-eqz v4, :cond_0

    .line 185
    :try_start_b
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    goto :goto_0

    .line 189
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v1

    .line 190
    goto/16 :goto_0

    .line 183
    :catchall_0
    move-exception v0

    :goto_6
    if-eqz v3, :cond_6

    .line 185
    :try_start_c
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5

    .line 190
    :cond_6
    :goto_7
    throw v0

    .line 189
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_7

    .line 183
    :catchall_1
    move-exception v0

    move-object v3, v2

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v3, v4

    goto :goto_6

    :catch_6
    move-exception v0

    goto :goto_5

    :catch_7
    move-exception v0

    move-object v3, v2

    goto :goto_5

    :catch_8
    move-exception v2

    move-object v2, v3

    goto :goto_3

    :catch_9
    move-exception v5

    goto :goto_3

    :cond_7
    move v0, v1

    goto/16 :goto_0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 332
    const/4 v1, 0x1

    invoke-static {p0, v1}, Lcom/cm/kinfoc/ag;->b(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v1

    .line 333
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 1120
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_1

    .line 1126
    :cond_0
    :goto_0
    return v0

    .line 1124
    :cond_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1125
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1129
    invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    .line 1130
    if-eqz v1, :cond_0

    .line 1134
    array-length v0, v1

    goto :goto_0
.end method

.method public static b()Ljava/io/File;
    .locals 1

    .prologue
    .line 217
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->c()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/cm/kinfoc/ag;->a(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;I)Ljava/io/File;
    .locals 1

    .prologue
    .line 226
    invoke-static {p0, p1}, Lcom/cm/kinfoc/ag;->f(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v0

    .line 227
    invoke-static {v0}, Lcom/cm/kinfoc/ag;->a(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;I)Ljava/io/File;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 342
    invoke-static {p0, p1}, Lcom/cm/kinfoc/ag;->f(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v1

    .line 343
    if-nez v1, :cond_1

    .line 355
    :cond_0
    :goto_0
    return-object v0

    .line 347
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 348
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 349
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 350
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 355
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 353
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    goto :goto_1
.end method

.method public static d(Landroid/content/Context;I)Ljava/io/File;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 359
    invoke-static {p0, p1}, Lcom/cm/kinfoc/ag;->e(Landroid/content/Context;I)Ljava/io/File;

    move-result-object v1

    .line 360
    if-nez v1, :cond_1

    .line 372
    :cond_0
    :goto_0
    return-object v0

    .line 364
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 365
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 366
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 367
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 372
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 370
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    goto :goto_1
.end method

.method private static e(Landroid/content/Context;I)Ljava/io/File;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 231
    if-nez p0, :cond_1

    .line 236
    :cond_0
    :goto_0
    return-object v0

    .line 235
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    .line 236
    if-eqz v1, :cond_0

    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "infoc_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static f(Landroid/content/Context;I)Ljava/io/File;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 240
    if-nez p0, :cond_1

    .line 245
    :cond_0
    :goto_0
    return-object v0

    .line 244
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    .line 245
    if-eqz v1, :cond_0

    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "infoc_force_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0
.end method
