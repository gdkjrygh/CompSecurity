.class public Lcom/qihoo360/common/b/a;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a([B)[B
    .locals 7

    .prologue
    .line 44
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 45
    const/4 v1, 0x0

    .line 47
    :try_start_0
    new-instance v0, Ljava/util/zip/InflaterInputStream;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v4, Ljava/util/zip/Inflater;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    const/16 v5, 0x200

    invoke-direct {v0, v3, v4, v5}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    const/16 v1, 0x200

    :try_start_1
    new-array v1, v1, [B

    .line 50
    :goto_0
    const/4 v3, 0x0

    array-length v4, v1

    invoke-virtual {v0, v1, v3, v4}, Ljava/util/zip/InflaterInputStream;->read([BII)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v3

    if-gez v3, :cond_1

    .line 58
    if-eqz v0, :cond_0

    .line 60
    :try_start_2
    invoke-virtual {v0}, Ljava/util/zip/InflaterInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 66
    :cond_0
    :goto_1
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    .line 51
    :cond_1
    const/4 v4, 0x0

    :try_start_3
    invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 53
    :catch_0
    move-exception v1

    .line 58
    :goto_2
    if-eqz v0, :cond_0

    .line 60
    :try_start_4
    invoke-virtual {v0}, Ljava/util/zip/InflaterInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 61
    :catch_1
    move-exception v0

    goto :goto_1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    :goto_3
    if-eqz v1, :cond_2

    .line 60
    :try_start_5
    invoke-virtual {v1}, Ljava/util/zip/InflaterInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 64
    :cond_2
    :goto_4
    throw v0

    .line 61
    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_1

    .line 57
    :catchall_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    .line 53
    :catch_4
    move-exception v0

    move-object v0, v1

    goto :goto_2
.end method
