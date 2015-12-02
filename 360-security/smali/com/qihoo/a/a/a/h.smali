.class public Lcom/qihoo/a/a/a/h;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/qihoo/a/a/a/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/a/a/a/h;->a:Ljava/lang/String;

    .line 16
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/qihoo/a/a/a/h;->b:[C

    .line 18
    return-void

    .line 16
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 28
    .line 30
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 31
    :try_start_1
    invoke-static {v1}, Lcom/qihoo/a/a/a/h;->a(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 37
    invoke-static {v1}, Lcom/qihoo/a/a/a/f;->a(Ljava/io/InputStream;)V

    .line 40
    :goto_0
    return-object v0

    .line 32
    :catch_0
    move-exception v1

    move-object v1, v0

    .line 37
    :goto_1
    invoke-static {v1}, Lcom/qihoo/a/a/a/f;->a(Ljava/io/InputStream;)V

    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    .line 37
    :goto_2
    invoke-static {v1}, Lcom/qihoo/a/a/a/f;->a(Ljava/io/InputStream;)V

    .line 38
    throw v0

    .line 36
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 32
    :catch_1
    move-exception v2

    goto :goto_1
.end method

.method public static final a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 63
    :try_start_0
    invoke-static {p0}, Lcom/qihoo/a/a/a/f;->b(Ljava/io/InputStream;)[B

    move-result-object v1

    .line 64
    if-eqz v1, :cond_0

    array-length v2, v1

    if-gtz v2, :cond_1

    .line 75
    :cond_0
    :goto_0
    return-object v0

    .line 67
    :cond_1
    invoke-static {v1}, Lcom/qihoo/a/a/a/h;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 68
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 45
    .line 47
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    :try_start_1
    invoke-static {v1}, Lcom/qihoo/a/a/a/h;->a(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 54
    invoke-static {v1}, Lcom/qihoo/a/a/a/f;->a(Ljava/io/InputStream;)V

    .line 57
    :goto_0
    return-object v0

    .line 49
    :catch_0
    move-exception v1

    move-object v1, v0

    .line 54
    :goto_1
    invoke-static {v1}, Lcom/qihoo/a/a/a/f;->a(Ljava/io/InputStream;)V

    goto :goto_0

    .line 53
    :catchall_0
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    .line 54
    :goto_2
    invoke-static {v1}, Lcom/qihoo/a/a/a/f;->a(Ljava/io/InputStream;)V

    .line 55
    throw v0

    .line 53
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 49
    :catch_1
    move-exception v2

    goto :goto_1
.end method

.method public static final a([B)Ljava/lang/String;
    .locals 6

    .prologue
    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 80
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_0

    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 80
    :cond_0
    aget-byte v3, p0, v0

    .line 81
    sget-object v4, Lcom/qihoo/a/a/a/h;->b:[C

    and-int/lit16 v5, v3, 0xf0

    shr-int/lit8 v5, v5, 0x4

    aget-char v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    sget-object v4, Lcom/qihoo/a/a/a/h;->b:[C

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v4, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
