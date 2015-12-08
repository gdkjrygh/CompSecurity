.class public Lcom/arist/util/StreamService;
.super Ljava/lang/Object;
.source "StreamService.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public readData(Ljava/io/InputStream;Ljava/io/OutputStream;Landroid/os/Handler;)V
    .locals 8
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "out"    # Ljava/io/OutputStream;
    .param p3, "handler"    # Landroid/os/Handler;

    .prologue
    .line 19
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 21
    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 22
    .local v0, "bis":Ljava/io/BufferedInputStream;
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-direct {v1, p2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 23
    .local v1, "bos":Ljava/io/BufferedOutputStream;
    const/4 v4, -0x1

    .line 24
    .local v4, "len":I
    const/4 v5, 0x0

    .line 25
    .local v5, "loadedLength":I
    const/16 v7, 0x400

    new-array v2, v7, [B

    .line 26
    .local v2, "buffer":[B
    :cond_0
    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v4

    const/4 v7, -0x1

    if-ne v4, v7, :cond_2

    .line 36
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V

    .line 37
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 38
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    .line 39
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 44
    .end local v0    # "bis":Ljava/io/BufferedInputStream;
    .end local v1    # "bos":Ljava/io/BufferedOutputStream;
    .end local v2    # "buffer":[B
    .end local v4    # "len":I
    .end local v5    # "loadedLength":I
    :cond_1
    :goto_1
    return-void

    .line 27
    .restart local v0    # "bis":Ljava/io/BufferedInputStream;
    .restart local v1    # "bos":Ljava/io/BufferedOutputStream;
    .restart local v2    # "buffer":[B
    .restart local v4    # "len":I
    .restart local v5    # "loadedLength":I
    :cond_2
    const/4 v7, 0x0

    invoke-virtual {v1, v2, v7, v4}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 28
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->flush()V

    .line 29
    add-int/lit8 v5, v5, 0x1

    rem-int/lit16 v7, v5, 0xc8

    if-nez v7, :cond_0

    if-eqz p3, :cond_0

    .line 30
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 31
    .local v6, "msg":Landroid/os/Message;
    const/4 v7, 0x6

    iput v7, v6, Landroid/os/Message;->what:I

    .line 32
    iput v5, v6, Landroid/os/Message;->arg1:I

    .line 33
    invoke-virtual {p3, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 40
    .end local v0    # "bis":Ljava/io/BufferedInputStream;
    .end local v1    # "bos":Ljava/io/BufferedOutputStream;
    .end local v2    # "buffer":[B
    .end local v4    # "len":I
    .end local v5    # "loadedLength":I
    .end local v6    # "msg":Landroid/os/Message;
    :catch_0
    move-exception v3

    .line 41
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method public save(Ljava/io/InputStream;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 4
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "savePath"    # Ljava/lang/String;
    .param p3, "handler"    # Landroid/os/Handler;

    .prologue
    .line 47
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 49
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .local v1, "file":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 51
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 53
    :cond_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 54
    .local v2, "out":Ljava/io/FileOutputStream;
    invoke-virtual {p0, p1, v2, p3}, Lcom/arist/util/StreamService;->readData(Ljava/io/InputStream;Ljava/io/OutputStream;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .end local v1    # "file":Ljava/io/File;
    .end local v2    # "out":Ljava/io/FileOutputStream;
    :cond_1
    :goto_0
    return-void

    .line 55
    :catch_0
    move-exception v0

    .line 56
    .local v0, "e":Ljava/io/FileNotFoundException;
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0
.end method
