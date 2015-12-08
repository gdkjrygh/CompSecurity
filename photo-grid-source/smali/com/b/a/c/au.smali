.class final Lcom/b/a/c/au;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Throwable;Ljava/io/OutputStream;)V
    .locals 5

    .prologue
    .line 25
    if-eqz p1, :cond_0

    .line 1047
    const/4 v2, 0x0

    .line 1049
    :try_start_0
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1050
    :try_start_1
    invoke-static {p0, v1}, Lcom/b/a/c/au;->a(Ljava/lang/Throwable;Ljava/io/Writer;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1054
    const-string v0, "Failed to close stack trace writer."

    invoke-static {v1, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 1055
    :cond_0
    :goto_0
    return-void

    .line 1051
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 1052
    :goto_1
    :try_start_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "CrashlyticsCore"

    const-string v4, "Failed to create PrintWriter"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1054
    const-string v0, "Failed to close stack trace writer."

    invoke-static {v1, v0}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    const-string v2, "Failed to close stack trace writer."

    invoke-static {v1, v2}, La/a/a/a/a/b/l;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 1051
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private static a(Ljava/lang/Throwable;Ljava/io/Writer;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 60
    const/4 v0, 0x1

    move v3, v0

    .line 62
    :goto_0
    if-eqz p0, :cond_4

    .line 1088
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    .line 1089
    if-nez v0, :cond_0

    .line 1090
    const/4 v0, 0x0

    .line 64
    :goto_1
    if-eqz v0, :cond_1

    move-object v2, v0

    .line 66
    :goto_2
    if-eqz v3, :cond_2

    const-string v0, ""

    .line 67
    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    array-length v3, v2

    move v0, v1

    :goto_4
    if-ge v0, v3, :cond_3

    aget-object v4, v2, v0

    .line 72
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "\tat "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 71
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 1093
    :cond_0
    const-string v2, "(\r\n|\n|\u000c)"

    const-string v4, " "

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 64
    :cond_1
    const-string v0, ""

    move-object v2, v0

    goto :goto_2

    .line 66
    :cond_2
    const-string v0, "Caused by: "

    goto :goto_3

    .line 75
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    move v3, v1

    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Could not write stack trace"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    :cond_4
    return-void
.end method
