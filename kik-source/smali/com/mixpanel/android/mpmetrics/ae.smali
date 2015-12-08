.class final Lcom/mixpanel/android/mpmetrics/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 27
    :try_start_0
    const-string v0, "connectivity"

    .line 28
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 29
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    .line 31
    :goto_0
    sget-boolean v2, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v2, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v2, "ConnectivityManager says we "

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_2

    const-string v2, "are"

    :goto_1
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " online"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    :cond_0
    :goto_2
    return v0

    .line 30
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 31
    :cond_2
    const-string v2, "are not"
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 33
    :catch_0
    move-exception v0

    .line 34
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    move v0, v1

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;[Ljava/lang/String;)[B
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 40
    invoke-static {p0}, Lcom/mixpanel/android/mpmetrics/ae;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 60
    :cond_0
    :goto_0
    return-object v0

    .line 45
    :cond_1
    array-length v2, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_0

    aget-object v3, p1, v1

    .line 47
    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    invoke-static {v3, v4, v5}, Lcom/mixpanel/android/mpmetrics/ae;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    goto :goto_0

    .line 49
    :catch_0
    move-exception v4

    .line 50
    const-string v5, "MixpanelAPI"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Cannot interpret "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " as a URL."

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 52
    :catch_1
    move-exception v4

    sget-boolean v4, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v4, :cond_2

    .line 53
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Cannot get "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 54
    :catch_2
    move-exception v1

    .line 55
    const-string v2, "MixpanelAPI"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Out of memory when getting to "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private static a(Ljava/io/InputStream;)[B
    .locals 6

    .prologue
    const/16 v5, 0x2000

    const/4 v4, 0x0

    .line 127
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 130
    new-array v1, v5, [B

    .line 132
    :goto_0
    invoke-virtual {p0, v1, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 133
    invoke-virtual {v0, v1, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 137
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)[B
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 64
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    move v3, v2

    move-object v7, v6

    .line 73
    :goto_0
    const/4 v0, 0x3

    if-ge v3, v0, :cond_a

    if-nez v2, :cond_a

    .line 80
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    const/16 v4, 0x7d0

    :try_start_1
    invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 83
    const/16 v4, 0x2710

    invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 84
    if-eqz p1, :cond_1

    .line 85
    if-eqz p2, :cond_0

    .line 86
    const-string v4, "http.agent"

    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 87
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "Kik/"

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v8, " "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 88
    const-string v5, "User-Agent"

    invoke-virtual {v0, v5, v4}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_0
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 91
    new-instance v8, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v4, "UTF-8"

    invoke-direct {v8, p1, v4}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 92
    const-string v4, "POST"

    invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v8}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;->getContentLength()J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 94
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v5

    .line 95
    :try_start_2
    new-instance v4, Ljava/io/BufferedOutputStream;

    invoke-direct {v4, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 96
    :try_start_3
    invoke-virtual {v8, v4}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 97
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 99
    :try_start_4
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 102
    :cond_1
    :try_start_5
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_5
    .catch Ljava/io/EOFException; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v5

    .line 103
    :try_start_6
    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/ae;->a(Ljava/io/InputStream;)[B
    :try_end_6
    .catch Ljava/io/EOFException; {:try_start_6 .. :try_end_6} :catch_a
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    move-result-object v4

    .line 104
    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/EOFException; {:try_start_7 .. :try_end_7} :catch_b
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 111
    if-eqz v0, :cond_b

    .line 118
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    move v2, v1

    move-object v7, v4

    goto :goto_0

    .line 108
    :catch_0
    move-exception v0

    move-object v5, v6

    move-object v8, v6

    move-object v9, v6

    move-object v4, v7

    move-object v7, v6

    :goto_1
    :try_start_8
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 109
    add-int/lit8 v0, v3, 0x1

    .line 111
    if-eqz v7, :cond_2

    .line 112
    :try_start_9
    invoke-virtual {v7}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    .line 113
    :cond_2
    :goto_2
    if-eqz v8, :cond_3

    .line 114
    :try_start_a
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    .line 115
    :cond_3
    :goto_3
    if-eqz v9, :cond_4

    .line 116
    :try_start_b
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    .line 117
    :cond_4
    :goto_4
    if-eqz v5, :cond_9

    .line 118
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    move v3, v0

    move-object v7, v4

    goto/16 :goto_0

    .line 111
    :catchall_0
    move-exception v0

    move-object v4, v6

    move-object v5, v6

    move-object v9, v6

    :goto_5
    if-eqz v4, :cond_5

    .line 112
    :try_start_c
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4

    .line 113
    :cond_5
    :goto_6
    if-eqz v5, :cond_6

    .line 114
    :try_start_d
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5

    .line 115
    :cond_6
    :goto_7
    if-eqz v9, :cond_7

    .line 116
    :try_start_e
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    .line 117
    :cond_7
    :goto_8
    if-eqz v6, :cond_8

    .line 118
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    throw v0

    :cond_9
    move-object v3, v4

    move v10, v0

    move v0, v2

    move v2, v10

    :goto_9
    move-object v7, v3

    move v3, v2

    move v2, v0

    .line 120
    goto/16 :goto_0

    :catch_1
    move-exception v3

    goto :goto_2

    :catch_2
    move-exception v3

    goto :goto_3

    :catch_3
    move-exception v3

    goto :goto_4

    :catch_4
    move-exception v1

    goto :goto_6

    :catch_5
    move-exception v1

    goto :goto_7

    :catch_6
    move-exception v1

    goto :goto_8

    .line 121
    :cond_a
    return-object v7

    .line 111
    :catchall_1
    move-exception v1

    move-object v4, v6

    move-object v5, v6

    move-object v9, v6

    move-object v6, v0

    move-object v0, v1

    goto :goto_5

    :catchall_2
    move-exception v1

    move-object v4, v6

    move-object v9, v6

    move-object v6, v0

    move-object v0, v1

    goto :goto_5

    :catchall_3
    move-exception v1

    move-object v9, v6

    move-object v6, v0

    move-object v0, v1

    goto :goto_5

    :catchall_4
    move-exception v1

    move-object v4, v6

    move-object v9, v5

    move-object v5, v6

    move-object v6, v0

    move-object v0, v1

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v6, v5

    move-object v4, v7

    move-object v5, v8

    goto :goto_5

    .line 108
    :catch_7
    move-exception v4

    move-object v5, v0

    move-object v8, v6

    move-object v9, v6

    move-object v4, v7

    move-object v7, v6

    goto :goto_1

    :catch_8
    move-exception v4

    move-object v8, v5

    move-object v9, v6

    move-object v4, v7

    move-object v7, v6

    move-object v5, v0

    goto :goto_1

    :catch_9
    move-exception v8

    move-object v8, v5

    move-object v9, v6

    move-object v5, v0

    move-object v10, v4

    move-object v4, v7

    move-object v7, v10

    goto :goto_1

    :catch_a
    move-exception v4

    move-object v8, v6

    move-object v9, v5

    move-object v4, v7

    move-object v7, v6

    move-object v5, v0

    goto/16 :goto_1

    :catch_b
    move-exception v7

    move-object v7, v6

    move-object v8, v6

    move-object v9, v5

    move-object v5, v0

    goto/16 :goto_1

    :cond_b
    move v0, v1

    move v2, v3

    move-object v3, v4

    goto :goto_9
.end method
