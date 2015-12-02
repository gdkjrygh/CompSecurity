.class Lcom/qihoo/a/a/a/e;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ldalvik/system/DexClassLoader;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 34
    .line 44
    :try_start_0
    new-instance v1, Lcom/qihoo/a/a/a/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v3, ".lock"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/qihoo/a/a/a/g;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    const/16 v2, 0x5dc

    :try_start_1
    invoke-virtual {v1, v2}, Lcom/qihoo/a/a/a/g;->a(I)Z

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 48
    invoke-virtual {p0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    .line 51
    invoke-static {p0, p1, v4, p1, v4}, Lcom/qihoo/a/a/a/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v2

    if-nez v2, :cond_1

    .line 89
    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {v1}, Lcom/qihoo/a/a/a/g;->b()V

    .line 93
    :cond_0
    :goto_0
    return-object v0

    .line 55
    :cond_1
    :try_start_2
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 65
    const/4 v2, 0x0

    move v3, v2

    .line 68
    :cond_2
    new-instance v2, Ldalvik/system/DexClassLoader;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-direct {v2, v6, v4, v7, v8}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 70
    if-eqz v2, :cond_4

    .line 72
    invoke-static {v2}, Lcom/qihoo/a/a/a/e;->a(Ldalvik/system/DexClassLoader;)Z

    move-result v6

    if-nez v6, :cond_3

    move-object v2, v0

    .line 76
    :cond_3
    if-nez v2, :cond_4

    .line 78
    invoke-static {p0, p1, v4, p1, v4}, Lcom/qihoo/a/a/a/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    :cond_4
    if-nez v2, :cond_7

    add-int/lit8 v3, v3, 0x1

    const/4 v6, 0x3

    .line 67
    if-lt v3, v6, :cond_2

    move-object v0, v2

    .line 89
    :cond_5
    :goto_1
    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {v1}, Lcom/qihoo/a/a/a/g;->b()V

    goto :goto_0

    .line 88
    :catchall_0
    move-exception v1

    move-object v9, v1

    move-object v1, v0

    move-object v0, v9

    .line 89
    :goto_2
    if-eqz v1, :cond_6

    .line 90
    invoke-virtual {v1}, Lcom/qihoo/a/a/a/g;->b()V

    .line 92
    :cond_6
    throw v0

    .line 88
    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_7
    move-object v0, v2

    goto :goto_1
.end method

.method public static final a(Ldalvik/system/DexClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 126
    :try_start_0
    invoke-virtual {p0, p1}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 127
    invoke-virtual {v1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 128
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 135
    :goto_0
    return-object v0

    .line 129
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static final varargs a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 300
    :try_start_0
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 307
    :goto_0
    return-object v0

    .line 301
    :catch_0
    move-exception v0

    .line 307
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs a(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor",
            "<*>;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .line 393
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 400
    :goto_0
    return-object v0

    .line 394
    :catch_0
    move-exception v0

    .line 400
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs a(Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Constructor",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 414
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 416
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 423
    :goto_0
    return-object v0

    .line 417
    :catch_0
    move-exception v0

    .line 423
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static final varargs a(Ldalvik/system/DexClassLoader;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldalvik/system/DexClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .prologue
    .line 249
    :try_start_0
    invoke-virtual {p0, p1}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    move-object v1, v0

    .line 250
    :goto_0
    const-class v0, Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-ne v1, v0, :cond_0

    .line 268
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return-object v0

    .line 252
    :cond_0
    :try_start_1
    invoke-virtual {v1, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 253
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 256
    :catch_0
    move-exception v0

    .line 250
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 262
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private static a(Ldalvik/system/DexClassLoader;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 99
    :try_start_0
    const-string/jumbo v0, "com.qihoo360.plugin.clear.Entry"

    const-string/jumbo v2, "SDK_VERSION_CODE"

    invoke-static {p0, v0, v2}, Lcom/qihoo/a/a/a/e;->a(Ldalvik/system/DexClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 103
    if-lez v0, :cond_0

    const/4 v0, 0x1

    .line 109
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 103
    goto :goto_0

    .line 104
    :catch_0
    move-exception v0

    move v0, v1

    .line 109
    goto :goto_0
.end method
