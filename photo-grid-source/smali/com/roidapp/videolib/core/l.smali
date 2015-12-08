.class public final Lcom/roidapp/videolib/core/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static g:Lcom/roidapp/videolib/core/l;

.field private static h:J

.field private static final i:[C


# instance fields
.field a:Landroid/content/Context;

.field b:Ljava/lang/String;

.field c:Landroid/content/SharedPreferences;

.field d:Lcom/roidapp/videolib/core/a;

.field e:Z

.field f:Lcom/roidapp/baselib/e/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 66
    const-wide/32 v0, 0x240c8400

    sput-wide v0, Lcom/roidapp/videolib/core/l;->h:J

    .line 68
    const-string v0, "0123456789abcdef"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/roidapp/videolib/core/l;->i:[C

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object v1, p0, Lcom/roidapp/videolib/core/l;->a:Landroid/content/Context;

    .line 47
    iput-object v1, p0, Lcom/roidapp/videolib/core/l;->b:Ljava/lang/String;

    .line 49
    iput-object v1, p0, Lcom/roidapp/videolib/core/l;->c:Landroid/content/SharedPreferences;

    .line 50
    iput-object v1, p0, Lcom/roidapp/videolib/core/l;->d:Lcom/roidapp/videolib/core/a;

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/videolib/core/l;->e:Z

    .line 65
    iput-object v1, p0, Lcom/roidapp/videolib/core/l;->f:Lcom/roidapp/baselib/e/b;

    .line 26
    return-void
.end method

.method public static a()Lcom/roidapp/videolib/core/l;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/roidapp/videolib/core/l;->g:Lcom/roidapp/videolib/core/l;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Lcom/roidapp/videolib/core/l;

    invoke-direct {v0}, Lcom/roidapp/videolib/core/l;-><init>()V

    sput-object v0, Lcom/roidapp/videolib/core/l;->g:Lcom/roidapp/videolib/core/l;

    .line 35
    :cond_0
    sget-object v0, Lcom/roidapp/videolib/core/l;->g:Lcom/roidapp/videolib/core/l;

    return-object v0
.end method

.method public static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 328
    const/16 v1, 0x1000

    :try_start_0
    new-array v1, v1, [B

    .line 330
    const-string v2, "MD5"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 332
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    .line 333
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 347
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 348
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 336
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 338
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 340
    array-length v3, v1

    :goto_2
    if-ge v0, v3, :cond_1

    aget-byte v4, v1, v0

    .line 341
    sget-object v5, Lcom/roidapp/videolib/core/l;->i:[C

    shr-int/lit8 v6, v4, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v5, v5, v6

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 342
    sget-object v5, Lcom/roidapp/videolib/core/l;->i:[C

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v5, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 340
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 345
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 353
    .line 356
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 358
    const/16 v3, 0x1000

    :try_start_1
    new-array v3, v3, [B

    .line 360
    const-string v4, "MD5"

    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 362
    :goto_0
    invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    .line 363
    const/4 v6, 0x0

    invoke-virtual {v4, v3, v6, v5}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v2

    .line 381
    :goto_1
    if-eqz v1, :cond_0

    .line 382
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 387
    :cond_0
    :goto_2
    return-object v0

    .line 366
    :cond_1
    :try_start_3
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    .line 368
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 370
    array-length v5, v3

    :goto_3
    if-ge v2, v5, :cond_2

    aget-byte v6, v3, v2

    .line 371
    sget-object v7, Lcom/roidapp/videolib/core/l;->i:[C

    shr-int/lit8 v8, v6, 0x4

    and-int/lit8 v8, v8, 0xf

    aget-char v7, v7, v8

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 372
    sget-object v7, Lcom/roidapp/videolib/core/l;->i:[C

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v7, v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 370
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 375
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v0

    .line 382
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_2

    .line 380
    :catchall_0
    move-exception v1

    move-object v9, v1

    move-object v1, v0

    move-object v0, v9

    .line 381
    :goto_4
    if-eqz v1, :cond_3

    .line 382
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 387
    :cond_3
    :goto_5
    throw v0

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_5

    .line 380
    :catchall_1
    move-exception v0

    goto :goto_4

    :catch_4
    move-exception v1

    move-object v1, v0

    goto :goto_1
.end method

.method public static b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 87
    sget-object v0, Lcom/roidapp/videolib/core/l;->g:Lcom/roidapp/videolib/core/l;

    iput-object v1, v0, Lcom/roidapp/videolib/core/l;->a:Landroid/content/Context;

    .line 88
    sget-object v0, Lcom/roidapp/videolib/core/l;->g:Lcom/roidapp/videolib/core/l;

    iput-object v1, v0, Lcom/roidapp/videolib/core/l;->c:Landroid/content/SharedPreferences;

    .line 89
    return-void
.end method

.method public static c()V
    .locals 1

    .prologue
    .line 98
    :try_start_0
    const-string v0, "avutil-54"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 99
    const-string v0, "swresample-1"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 100
    const-string v0, "swscale-3"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 101
    const-string v0, "avcodec-56"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 102
    const-string v0, "avformat-56"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 103
    const-string v0, "amf"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :goto_0
    return-void

    .line 121
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/UnsatisfiedLinkError;->printStackTrace()V

    goto :goto_0
.end method

.method public static d()Z
    .locals 1

    .prologue
    .line 130
    :try_start_0
    invoke-static {}, Lcom/roidapp/videolib/core/l;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    const/4 v0, 0x1

    .line 154
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 71
    .line 1092
    iget-object v0, p0, Lcom/roidapp/videolib/core/l;->a:Landroid/content/Context;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 71
    :goto_0
    if-nez v0, :cond_0

    if-nez p1, :cond_2

    .line 84
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    .line 1092
    goto :goto_0

    .line 74
    :cond_2
    iput-object p1, p0, Lcom/roidapp/videolib/core/l;->a:Landroid/content/Context;

    .line 77
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/codec/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/core/l;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :goto_2
    const-string v0, "Video"

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/core/l;->c:Landroid/content/SharedPreferences;

    goto :goto_1

    .line 80
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/codec/"

    invoke-static {p1, v2}, Lcom/roidapp/baselib/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/core/l;->b:Ljava/lang/String;

    goto :goto_2
.end method
