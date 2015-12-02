.class public Lcom/qihoo360/common/a/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 40
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 41
    const/4 v1, 0x0

    .line 43
    :try_start_0
    new-instance v0, Lcom/qihoo360/common/a/a;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v3}, Lcom/qihoo360/common/a/a;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    const/16 v1, 0x200

    :try_start_1
    new-array v1, v1, [B

    .line 46
    :goto_0
    const/4 v3, 0x0

    array-length v4, v1

    invoke-virtual {v0, v1, v3, v4}, Lcom/qihoo360/common/a/a;->read([BII)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v3

    if-gez v3, :cond_1

    .line 54
    if-eqz v0, :cond_0

    .line 56
    :try_start_2
    invoke-virtual {v0}, Lcom/qihoo360/common/a/a;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 62
    :cond_0
    :goto_1
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/b/a;->a([B)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0

    .line 47
    :cond_1
    const/4 v4, 0x0

    :try_start_3
    invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 49
    :catch_0
    move-exception v1

    .line 54
    :goto_2
    if-eqz v0, :cond_0

    .line 56
    :try_start_4
    invoke-virtual {v0}, Lcom/qihoo360/common/a/a;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 57
    :catch_1
    move-exception v0

    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    :goto_3
    if-eqz v1, :cond_2

    .line 56
    :try_start_5
    invoke-virtual {v1}, Lcom/qihoo360/common/a/a;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 60
    :cond_2
    :goto_4
    throw v0

    .line 57
    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_1

    .line 53
    :catchall_1
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_3

    .line 49
    :catch_4
    move-exception v0

    move-object v0, v1

    goto :goto_2
.end method
