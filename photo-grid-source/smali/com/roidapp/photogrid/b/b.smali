.class final Lcom/roidapp/photogrid/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Ljava/io/File;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 15
    if-nez p0, :cond_1

    .line 34
    :cond_0
    return-object v0

    .line 20
    :cond_1
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_0

    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 27
    const-wide/16 v2, 0xa6

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1
.end method
