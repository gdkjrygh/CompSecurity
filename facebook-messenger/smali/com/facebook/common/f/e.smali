.class public Lcom/facebook/common/f/e;
.super Ljava/lang/Object;
.source "FileUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method

.method public static a([BLjava/io/File;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 142
    .line 143
    if-nez p0, :cond_0

    .line 144
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No data given to write to file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    const/4 v0, 0x0

    :try_start_1
    array-length v3, p0

    invoke-virtual {v2, p0, v0, v3}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    const/4 v0, 0x0

    .line 155
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    if-eqz v1, :cond_1

    .line 161
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 167
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 168
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 171
    :cond_2
    return-void

    .line 159
    :catchall_0
    move-exception v0

    :goto_1
    if-eqz v1, :cond_3

    .line 161
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 167
    :cond_3
    :goto_2
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 168
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_4
    throw v0

    .line 162
    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_2

    .line 159
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_1
.end method
