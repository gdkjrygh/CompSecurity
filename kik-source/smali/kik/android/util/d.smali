.class public final Lkik/android/util/d;
.super Lkik/a/h/c;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/File;Ljava/io/File;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 49
    if-nez p0, :cond_2

    :cond_0
    :goto_0
    if-eqz v0, :cond_4

    .line 57
    :cond_1
    :goto_1
    return-void

    .line 49
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-eqz v1, :cond_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 53
    :cond_4
    invoke-static {p0, p1}, Lkik/android/util/d;->b(Ljava/io/File;Ljava/io/File;)Z

    move-result v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File migration failed for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private static b(Ljava/io/File;Ljava/io/File;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 21
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez p1, :cond_1

    .line 33
    :cond_0
    :goto_0
    return v0

    .line 25
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 26
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lkik/a/h/c;->a(Ljava/io/File;ZLorg/c/b;)Z

    .line 29
    :cond_2
    invoke-static {p0, p1}, Lcom/c/a/d/h;->a(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    const/4 v0, 0x1

    goto :goto_0

    .line 33
    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0
.end method
