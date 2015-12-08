.class public Lorg/apache/sanselan/common/byteSources/ByteSourceFile;
.super Lorg/apache/sanselan/common/byteSources/ByteSource;


# instance fields
.field private final c:Ljava/io/File;


# virtual methods
.method public final b()Ljava/io/InputStream;
    .locals 2

    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;->c:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v1
.end method

.method public final b(II)[B
    .locals 6

    const/4 v2, 0x0

    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;->c:Ljava/io/File;

    const-string v3, "r"

    invoke-direct {v1, v0, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v2, p1

    :try_start_1
    const-string v5, "Could not read value from file"

    move-object v0, p0

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;->a(Ljava/io/RandomAccessFile;JILjava/lang/String;)[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :goto_2
    throw v0

    :catch_1
    move-exception v1

    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceFile;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method
