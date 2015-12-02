.class public Lcom/qihoo/security/opti/trashclear/filemanager/e;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Z

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/qihoo/security/opti/trashclear/filemanager/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/e;->b:Ljava/lang/String;

    .line 30
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/util/zip/ZipEntry;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 121
    const-wide v0, 0x1000000000L

    .line 122
    if-nez p0, :cond_0

    .line 134
    :goto_0
    return-wide v0

    .line 125
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 128
    :try_start_0
    const-string/jumbo v1, "mLocalHeaderRelOffset"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 132
    :goto_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 133
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v0

    goto :goto_0

    .line 129
    :catch_0
    move-exception v1

    .line 130
    const-string/jumbo v1, "localHeaderRelOffset"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 98
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 101
    :try_start_0
    invoke-static {p1}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    const/4 v0, 0x1

    invoke-virtual {v2, p1, v0}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 108
    :goto_0
    if-eqz v0, :cond_0

    .line 109
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 110
    iput-object p1, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 111
    iput-object p1, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 113
    :try_start_1
    invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 117
    :cond_0
    :goto_1
    return-object v1

    .line 106
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 114
    :catch_1
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public static a(Ljava/io/File;Z)Lcom/qihoo/security/opti/trashclear/filemanager/d;
    .locals 4

    .prologue
    .line 67
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/d;-><init>()V

    .line 68
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 70
    invoke-virtual {p0}, Ljava/io/File;->canRead()Z

    move-result v2

    iput-boolean v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->h:Z

    .line 71
    invoke-virtual {p0}, Ljava/io/File;->canWrite()Z

    move-result v2

    iput-boolean v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->i:Z

    .line 72
    invoke-virtual {p0}, Ljava/io/File;->isHidden()Z

    move-result v2

    iput-boolean v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->j:Z

    .line 73
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->a:Ljava/lang/String;

    .line 74
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->f:J

    .line 75
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    iput-boolean v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    .line 76
    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    .line 77
    iget-boolean v1, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-eqz v1, :cond_0

    .line 94
    :goto_0
    return-object v0

    .line 92
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->c:J

    goto :goto_0
.end method

.method public static a(J)Ljava/lang/String;
    .locals 10

    .prologue
    const/high16 v7, 0x42c80000    # 100.0f

    const-wide/16 v8, 0x400

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 310
    .line 311
    mul-long v0, v8, v8

    .line 312
    mul-long v2, v0, v8

    .line 314
    cmp-long v4, p0, v2

    if-ltz v4, :cond_0

    .line 315
    const-string/jumbo v0, "%.1f GB"

    new-array v1, v6, [Ljava/lang/Object;

    long-to-float v4, p0

    long-to-float v2, v2

    div-float v2, v4, v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 323
    :goto_0
    return-object v0

    .line 316
    :cond_0
    cmp-long v2, p0, v0

    if-ltz v2, :cond_2

    .line 317
    long-to-float v2, p0

    long-to-float v0, v0

    div-float v1, v2, v0

    .line 318
    cmpl-float v0, v1, v7

    if-lez v0, :cond_1

    const-string/jumbo v0, "%.0f MB"

    :goto_1
    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v2, v5

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string/jumbo v0, "%.1f MB"

    goto :goto_1

    .line 319
    :cond_2
    cmp-long v0, p0, v8

    if-ltz v0, :cond_4

    .line 320
    long-to-float v0, p0

    long-to-float v1, v8

    div-float v1, v0, v1

    .line 321
    cmpl-float v0, v1, v7

    if-lez v0, :cond_3

    const-string/jumbo v0, "%.0f KB"

    :goto_2
    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v2, v5

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const-string/jumbo v0, "%.1f KB"

    goto :goto_2

    .line 323
    :cond_4
    const-string/jumbo v0, "%d B"

    new-array v1, v6, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;J)Ljava/lang/String;
    .locals 5

    .prologue
    .line 328
    invoke-static {p0}, Landroid/text/format/DateFormat;->getDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    .line 329
    invoke-static {p0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v1

    .line 330
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 331
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 252
    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 253
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 254
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 256
    :goto_0
    return-object v0

    :cond_0
    const-string/jumbo v0, ""

    goto :goto_0
.end method

.method public static a()Z
    .locals 2

    .prologue
    .line 33
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static a(Ljava/io/File;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 272
    sget-boolean v2, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a:Z

    .line 273
    if-eqz v2, :cond_1

    .line 285
    :cond_0
    :goto_0
    return v0

    .line 277
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isHidden()Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    .line 278
    goto :goto_0

    .line 281
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 282
    goto :goto_0
.end method

.method private static a(Ljava/lang/String;[Ljava/util/zip/ZipEntry;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/16 v10, 0x8

    const/4 v1, 0x0

    .line 141
    if-nez p1, :cond_0

    move v0, v1

    .line 191
    :goto_0
    return v0

    .line 144
    :cond_0
    const/4 v3, 0x0

    .line 148
    :try_start_0
    array-length v6, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v3

    move v3, v1

    :goto_1
    if-ge v3, v6, :cond_d

    :try_start_1
    aget-object v5, p1, v3

    .line 149
    if-nez v5, :cond_2

    .line 148
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 152
    :cond_2
    if-nez v0, :cond_3

    .line 153
    new-instance v4, Ljava/io/RandomAccessFile;

    const-string/jumbo v7, "r"

    invoke-direct {v4, p0, v7}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v4

    .line 155
    :cond_3
    invoke-static {v5}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Ljava/util/zip/ZipEntry;)J

    move-result-wide v4

    .line 156
    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 157
    const-wide/16 v8, 0x8

    add-long/2addr v4, v8

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v8

    cmp-long v4, v4, v8

    if-lez v4, :cond_5

    .line 187
    if-eqz v0, :cond_4

    .line 188
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_4
    move v0, v1

    goto :goto_0

    .line 160
    :cond_5
    const/16 v4, 0x8

    :try_start_2
    new-array v7, v4, [B

    .line 161
    invoke-virtual {v0, v7}, Ljava/io/RandomAccessFile;->read([B)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result v4

    if-eq v4, v10, :cond_7

    .line 187
    if-eqz v0, :cond_6

    .line 188
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_6
    move v0, v1

    goto :goto_0

    :cond_7
    move v4, v1

    move v5, v1

    .line 166
    :goto_2
    const/4 v8, 0x4

    if-ge v4, v8, :cond_8

    .line 167
    shl-int/lit8 v5, v5, 0x8

    .line 168
    :try_start_3
    aget-byte v8, v7, v4

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v5, v8

    .line 166
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 170
    :cond_8
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v4

    .line 171
    int-to-long v4, v4

    const-wide/32 v8, 0x4034b50

    cmp-long v4, v4, v8

    if-eqz v4, :cond_a

    .line 187
    if-eqz v0, :cond_9

    .line 188
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_9
    move v0, v2

    goto :goto_0

    .line 176
    :cond_a
    const/4 v4, 0x6

    move v5, v1

    :goto_3
    if-ge v4, v10, :cond_b

    .line 177
    shl-int/lit8 v5, v5, 0x8

    .line 178
    :try_start_4
    aget-byte v8, v7, v4

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v5, v8

    .line 176
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 180
    :cond_b
    int-to-short v4, v5

    .line 181
    invoke-static {v4}, Ljava/lang/Short;->reverseBytes(S)S
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result v4

    const v5, 0xffff

    and-int/2addr v4, v5

    .line 182
    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    .line 187
    if-eqz v0, :cond_c

    .line 188
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_c
    move v0, v2

    goto/16 :goto_0

    .line 187
    :cond_d
    if-eqz v0, :cond_e

    .line 188
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    :cond_e
    move v0, v1

    .line 191
    goto/16 :goto_0

    .line 187
    :catchall_0
    move-exception v0

    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_f

    .line 188
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    :cond_f
    throw v0

    .line 187
    :catchall_1
    move-exception v1

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_4
.end method

.method public static b(Ljava/io/File;)J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 376
    const-wide/16 v2, 0x0

    .line 377
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 378
    array-length v5, v4

    const/4 v0, 0x0

    move v8, v0

    move-wide v0, v2

    move v2, v8

    :goto_0
    if-ge v2, v5, :cond_1

    aget-object v3, v4, v2

    .line 379
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 380
    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->b(Ljava/io/File;)J

    move-result-wide v6

    add-long/2addr v0, v6

    .line 378
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 382
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    add-long/2addr v0, v6

    goto :goto_1

    .line 385
    :cond_1
    return-wide v0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 336
    :try_start_0
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->c(Ljava/lang/String;)Z

    .line 338
    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    .line 339
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 340
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    :goto_0
    return-void

    .line 341
    :catch_0
    move-exception v0

    .line 342
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 347
    .line 348
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 349
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    .line 372
    :cond_0
    return v1

    .line 352
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 355
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v3

    .line 357
    array-length v4, v3

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v5, v3, v2

    .line 358
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 359
    new-instance v0, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 363
    :goto_1
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 364
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move v0, v1

    .line 357
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 361
    :cond_2
    new-instance v0, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 365
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 366
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->c(Ljava/lang/String;)Z

    .line 367
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 369
    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_2
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 12

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x1

    .line 198
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 201
    const/4 v5, 0x0

    .line 203
    :try_start_0
    new-instance v2, Ljava/util/zip/ZipFile;

    invoke-direct {v2, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    const/4 v0, 0x3

    :try_start_1
    new-array v6, v0, [Ljava/util/zip/ZipEntry;

    .line 205
    const/4 v0, 0x0

    const-string/jumbo v7, "AndroidManifest.xml"

    invoke-virtual {v2, v7}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v7

    aput-object v7, v6, v0

    .line 206
    const/4 v0, 0x1

    const-string/jumbo v7, "resources.arsc"

    invoke-virtual {v2, v7}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v7

    aput-object v7, v6, v0

    .line 207
    const/4 v0, 0x2

    const/4 v7, 0x0

    aput-object v7, v6, v0

    .line 208
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Ljava/util/zip/ZipEntry;)J

    move-result-wide v8

    .line 209
    const/4 v0, 0x1

    aget-object v0, v6, v0

    if-eqz v0, :cond_1

    .line 210
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v7

    .line 211
    :cond_0
    invoke-interface {v7}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    invoke-interface {v7}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/zip/ZipEntry;

    .line 213
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Ljava/util/zip/ZipEntry;)J

    move-result-wide v10

    cmp-long v10, v10, v8

    if-lez v10, :cond_0

    .line 214
    const/4 v7, 0x2

    aput-object v0, v6, v7

    .line 219
    :cond_1
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 220
    const/4 v2, 0x0

    .line 221
    :try_start_2
    invoke-static {p0, v6}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Ljava/lang/String;[Ljava/util/zip/ZipEntry;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_8

    move v0, v4

    .line 231
    :goto_0
    if-eqz v3, :cond_2

    .line 232
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 234
    :cond_2
    if-eqz v3, :cond_3

    .line 235
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 248
    :cond_3
    :goto_1
    return v0

    .line 224
    :catch_0
    move-exception v0

    move-object v0, v3

    .line 231
    :goto_2
    if-eqz v0, :cond_4

    .line 232
    :try_start_4
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V

    .line 234
    :cond_4
    if-eqz v3, :cond_5

    .line 235
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :cond_5
    move v0, v1

    .line 241
    goto :goto_1

    .line 237
    :catch_1
    move-exception v0

    move v0, v1

    .line 243
    goto :goto_1

    .line 230
    :catchall_0
    move-exception v0

    move-object v2, v3

    .line 231
    :goto_3
    if-eqz v2, :cond_6

    .line 232
    :try_start_5
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 234
    :cond_6
    if-eqz v3, :cond_7

    .line 235
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 241
    :cond_7
    :goto_4
    throw v0

    .line 237
    :catch_2
    move-exception v1

    goto :goto_4

    .line 230
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 224
    :catch_3
    move-exception v0

    move-object v0, v2

    goto :goto_2

    .line 237
    :catch_4
    move-exception v1

    goto :goto_1

    :cond_8
    move v0, v1

    goto :goto_0
.end method
