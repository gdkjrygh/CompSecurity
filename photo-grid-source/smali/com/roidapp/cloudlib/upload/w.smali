.class public final Lcom/roidapp/cloudlib/upload/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/Locale;

.field private static b:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 249
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method static a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x1

    .line 140
    if-lez p1, :cond_0

    if-eqz p0, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_1

    .line 245
    :cond_0
    :goto_0
    return-object p0

    .line 145
    :cond_1
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 146
    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 147
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 149
    :try_start_0
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_9

    .line 155
    :goto_1
    iget v6, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 156
    iget v7, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 157
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 159
    if-lez v1, :cond_0

    .line 165
    if-le v1, p1, :cond_7

    .line 170
    :cond_2
    shr-int/lit8 v1, v1, 0x1

    if-lt v1, p1, :cond_3

    .line 171
    add-int/lit8 v0, v0, 0x1

    .line 172
    const/16 v4, 0x64

    if-le v0, v4, :cond_2

    .line 176
    :cond_3
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 177
    iput-boolean v5, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 178
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 181
    :try_start_1
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 183
    if-eqz v1, :cond_b

    .line 185
    if-le v6, v7, :cond_6

    int-to-double v4, p1

    int-to-double v8, v6

    div-double/2addr v4, v8

    .line 186
    :goto_2
    int-to-double v8, v6

    mul-double/2addr v8, v4

    :try_start_2
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v0, v8

    .line 187
    int-to-double v6, v7

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v3, v4

    .line 189
    const/4 v4, 0x1

    invoke-static {v1, v0, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_11
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_f

    move-result-object v0

    .line 190
    if-eq v0, v1, :cond_4

    .line 191
    :try_start_3
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_12
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_10

    :cond_4
    :goto_3
    move-object v3, v0

    .line 216
    :goto_4
    if-eqz v3, :cond_0

    .line 217
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ".cache"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ".share"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 222
    :cond_5
    :try_start_4
    new-instance v1, Ljava/io/File;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 223
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 224
    :try_start_5
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x50

    invoke-virtual {v3, v2, v4, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_e
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_d
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result v2

    if-eqz v2, :cond_8

    .line 235
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_a

    :goto_5
    move-object p0, v0

    .line 238
    goto/16 :goto_0

    .line 185
    :cond_6
    int-to-double v4, p1

    int-to-double v8, v7

    div-double/2addr v4, v8

    goto/16 :goto_2

    .line 198
    :catch_0
    move-exception v0

    move-object v1, v2

    :goto_6
    move-object v3, v1

    goto :goto_4

    .line 200
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_7
    move-object v3, v1

    goto :goto_4

    .line 202
    :cond_7
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 203
    iput-boolean v5, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 204
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 207
    :try_start_7
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_3

    move-result-object v1

    move-object v3, v1

    .line 212
    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object v3, v2

    goto/16 :goto_4

    :catch_3
    move-exception v0

    move-object v3, v2

    goto/16 :goto_4

    .line 235
    :cond_8
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_b

    .line 242
    :cond_9
    :goto_8
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    goto/16 :goto_0

    .line 233
    :catch_4
    move-exception v0

    :goto_9
    if-eqz v2, :cond_9

    .line 235
    :try_start_9
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    goto :goto_8

    .line 238
    :catch_5
    move-exception v0

    goto :goto_8

    .line 233
    :catch_6
    move-exception v0

    :goto_a
    if-eqz v2, :cond_9

    .line 235
    :try_start_a
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_8

    .line 238
    :catch_7
    move-exception v0

    goto :goto_8

    .line 233
    :catchall_0
    move-exception v0

    :goto_b
    if-eqz v2, :cond_a

    .line 235
    :try_start_b
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_c

    .line 238
    :cond_a
    :goto_c
    throw v0

    .line 154
    :catch_8
    move-exception v1

    goto/16 :goto_1

    :catch_9
    move-exception v1

    goto/16 :goto_1

    :catch_a
    move-exception v1

    goto :goto_5

    .line 238
    :catch_b
    move-exception v0

    goto :goto_8

    :catch_c
    move-exception v1

    goto :goto_c

    .line 233
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_b

    :catch_d
    move-exception v0

    move-object v2, v1

    goto :goto_a

    :catch_e
    move-exception v0

    move-object v2, v1

    goto :goto_9

    .line 200
    :catch_f
    move-exception v0

    goto :goto_7

    :catch_10
    move-exception v1

    move-object v1, v0

    goto :goto_7

    .line 198
    :catch_11
    move-exception v0

    goto :goto_6

    :catch_12
    move-exception v1

    move-object v1, v0

    goto :goto_6

    :cond_b
    move-object v0, v1

    goto/16 :goto_3
.end method

.method static a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 252
    sget-object v0, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 254
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/upload/w;->a:Ljava/util/Locale;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    if-nez p0, :cond_1

    .line 263
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 264
    :goto_0
    return-void

    .line 256
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 257
    sget-object v1, Lcom/roidapp/cloudlib/upload/w;->a:Ljava/util/Locale;

    iget-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 258
    sget-object v1, Lcom/roidapp/cloudlib/upload/w;->a:Ljava/util/Locale;

    iput-object v1, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 259
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    :cond_2
    sget-object v0, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 62
    if-nez p0, :cond_0

    .line 79
    :goto_0
    return-void

    .line 65
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 67
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/cloudlib/upload/UploadPhotoService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 68
    const-string v2, "fromMainProcess"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 69
    const-string v2, "filePath"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 70
    const-string v2, "size"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 71
    const-string v2, "apps"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 72
    const-string v2, "contentType"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    const-string v2, "msg"

    invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    const-string v2, "taskExsitToast"

    invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    const-string v2, "language"

    invoke-virtual {v1, v2, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 76
    const-string v2, "thumbPath"

    invoke-virtual {v1, v2, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    const-string v2, "gaMode"

    invoke-virtual {v1, v2, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method

.method static a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 12

    .prologue
    const/4 v8, 0x0

    .line 90
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "fromMainProcess"

    invoke-virtual {p1, v0, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move v0, v8

    .line 126
    :goto_0
    return v0

    .line 93
    :cond_1
    const-string v0, "apps"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 94
    const-string v0, "filePath"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 95
    const-string v0, "msg"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 96
    const-string v0, "contentType"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 97
    const-string v0, "size"

    invoke-virtual {p1, v0, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 98
    const-string v0, "taskExsitToast"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 99
    const-string v0, "language"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/Locale;

    .line 100
    const-string v6, "gaMode"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 101
    const-string v6, "thumbPath"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 102
    if-nez v6, :cond_2

    move-object v6, v1

    .line 104
    :cond_2
    sget-object v10, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 106
    :try_start_0
    sput-object v0, Lcom/roidapp/cloudlib/upload/w;->a:Ljava/util/Locale;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    sget-object v0, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 111
    if-eqz v1, :cond_3

    if-eqz v3, :cond_3

    if-nez v4, :cond_4

    :cond_3
    move v0, v8

    .line 112
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    sget-object v1, Lcom/roidapp/cloudlib/upload/w;->b:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    .line 115
    :cond_4
    invoke-static {p0}, Lcom/roidapp/cloudlib/upload/c;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/upload/c;

    move-result-object v0

    .line 116
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 117
    invoke-virtual/range {v0 .. v7}, Lcom/roidapp/cloudlib/upload/c;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 118
    const/4 v11, -0x1

    if-eq v3, v11, :cond_6

    .line 119
    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/upload/c;->a(I)V

    goto :goto_1

    .line 121
    :cond_6
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 122
    invoke-static {p0, v9, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    move v0, v8

    .line 123
    goto/16 :goto_0

    .line 126
    :cond_7
    const/4 v0, 0x1

    goto/16 :goto_0
.end method
