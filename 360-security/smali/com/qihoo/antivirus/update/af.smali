.class public Lcom/qihoo/antivirus/update/af;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a()J
    .locals 10

    .prologue
    const/4 v8, 0x1

    .line 424
    const-wide/16 v2, -0x1

    .line 425
    const/4 v1, 0x0

    .line 427
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string/jumbo v4, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"

    const-string/jumbo v5, "r"

    invoke-direct {v0, v4, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 428
    :try_start_1
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 430
    invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long v2, v4, v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 436
    if-eqz v0, :cond_6

    .line 438
    :try_start_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v9, v0

    move-wide v0, v2

    move-object v3, v9

    .line 444
    :goto_0
    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-gez v2, :cond_2

    .line 446
    :try_start_3
    new-instance v2, Ljava/io/RandomAccessFile;

    const-string/jumbo v4, "/proc/cpuinfo"

    const-string/jumbo v5, "r"

    invoke-direct {v2, v4, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 448
    :cond_0
    :try_start_4
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result-object v3

    if-nez v3, :cond_4

    .line 462
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 464
    :try_start_5
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 470
    :cond_2
    :goto_2
    return-wide v0

    .line 431
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 436
    :goto_3
    if-eqz v0, :cond_6

    .line 438
    :try_start_6
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    move-object v9, v0

    move-wide v0, v2

    move-object v3, v9

    .line 439
    goto :goto_0

    :catch_1
    move-exception v1

    move-object v9, v0

    move-wide v0, v2

    move-object v3, v9

    goto :goto_0

    .line 435
    :catchall_0
    move-exception v0

    .line 436
    :goto_4
    if-eqz v1, :cond_3

    .line 438
    :try_start_7
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    .line 442
    :cond_3
    :goto_5
    throw v0

    .line 439
    :catch_2
    move-exception v1

    move-object v9, v0

    move-wide v0, v2

    move-object v3, v9

    goto :goto_0

    .line 449
    :cond_4
    :try_start_8
    const-string/jumbo v4, "BogoMIPS"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 450
    const-string/jumbo v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 451
    array-length v4, v3

    if-le v4, v8, :cond_1

    .line 452
    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-result v0

    int-to-long v0, v0

    .line 454
    goto :goto_1

    .line 457
    :catch_3
    move-exception v2

    move-object v2, v3

    .line 462
    :goto_6
    if-eqz v2, :cond_2

    .line 464
    :try_start_9
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_2

    .line 465
    :catch_4
    move-exception v2

    goto :goto_2

    .line 461
    :catchall_1
    move-exception v0

    move-object v2, v3

    .line 462
    :goto_7
    if-eqz v2, :cond_5

    .line 464
    :try_start_a
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    .line 468
    :cond_5
    :goto_8
    throw v0

    .line 439
    :catch_5
    move-exception v1

    goto :goto_5

    .line 465
    :catch_6
    move-exception v1

    goto :goto_8

    :catch_7
    move-exception v2

    goto :goto_2

    .line 461
    :catchall_2
    move-exception v0

    goto :goto_7

    .line 457
    :catch_8
    move-exception v3

    goto :goto_6

    .line 435
    :catchall_3
    move-exception v1

    move-object v9, v1

    move-object v1, v0

    move-object v0, v9

    goto :goto_4

    .line 431
    :catch_9
    move-exception v1

    goto :goto_3

    :cond_6
    move-object v9, v0

    move-wide v0, v2

    move-object v3, v9

    goto/16 :goto_0
.end method

.method public static a(Ljava/lang/String;J)J
    .locals 1

    .prologue
    .line 119
    .line 121
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide p1

    .line 125
    :cond_0
    :goto_0
    return-wide p1

    .line 123
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 167
    .line 170
    :try_start_0
    const-string/jumbo v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 171
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    const/16 v3, 0x400

    :try_start_1
    new-array v3, v3, [B

    .line 175
    :goto_0
    invoke-virtual {v1, v3}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    .line 178
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v2

    .line 181
    if-eqz v1, :cond_3

    .line 183
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, v2

    .line 187
    :goto_1
    if-nez v1, :cond_2

    .line 190
    :goto_2
    return-object v0

    .line 176
    :cond_0
    const/4 v5, 0x0

    :try_start_3
    invoke-virtual {v2, v3, v5, v4}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 179
    :catch_0
    move-exception v2

    .line 181
    :goto_3
    if-eqz v1, :cond_4

    .line 183
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move-object v1, v0

    .line 184
    goto :goto_1

    :catch_1
    move-exception v1

    move-object v1, v0

    goto :goto_1

    .line 180
    :catchall_0
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 181
    :goto_4
    if-eqz v1, :cond_1

    .line 183
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 186
    :cond_1
    :goto_5
    throw v0

    .line 184
    :catch_2
    move-exception v1

    move-object v1, v2

    goto :goto_1

    .line 190
    :cond_2
    invoke-static {v1}, Lcom/qihoo/antivirus/update/m;->a([B)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 184
    :catch_3
    move-exception v1

    goto :goto_5

    .line 180
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 179
    :catch_4
    move-exception v1

    move-object v1, v0

    goto :goto_3

    :cond_3
    move-object v1, v2

    goto :goto_1

    :cond_4
    move-object v1, v0

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 158
    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->b(Ljava/lang/String;)[B

    move-result-object v0

    .line 159
    if-nez v0, :cond_0

    .line 160
    const/4 v0, 0x0

    .line 162
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/qihoo/antivirus/update/m;->a([B)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 597
    .line 600
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, ".timestamp"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 601
    :try_start_1
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 602
    :try_start_2
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 608
    if-eqz v2, :cond_0

    .line 610
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    .line 616
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 618
    :try_start_4
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    .line 624
    :cond_1
    :goto_1
    return-void

    .line 603
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 608
    :goto_2
    if-eqz v1, :cond_2

    .line 610
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 616
    :cond_2
    :goto_3
    if-eqz v0, :cond_1

    .line 618
    :try_start_6
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    .line 619
    :catch_1
    move-exception v0

    goto :goto_1

    .line 607
    :catchall_0
    move-exception v0

    move-object v2, v1

    .line 608
    :goto_4
    if-eqz v2, :cond_3

    .line 610
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 616
    :cond_3
    :goto_5
    if-eqz v1, :cond_4

    .line 618
    :try_start_8
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 623
    :cond_4
    :goto_6
    throw v0

    .line 611
    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v2

    goto :goto_5

    .line 619
    :catch_4
    move-exception v1

    goto :goto_6

    .line 611
    :catch_5
    move-exception v1

    goto :goto_0

    .line 619
    :catch_6
    move-exception v0

    goto :goto_1

    .line 607
    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_4

    .line 603
    :catch_7
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    goto :goto_2

    :catch_8
    move-exception v1

    move-object v1, v2

    goto :goto_2
.end method

.method public static a(Landroid/database/Cursor;)V
    .locals 1

    .prologue
    .line 79
    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :cond_0
    :goto_0
    return-void

    .line 82
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 343
    .line 344
    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 346
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-gtz v1, :cond_0

    .line 349
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 350
    return-void

    .line 347
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 55
    const/4 v1, 0x0

    .line 56
    if-eqz p0, :cond_0

    .line 58
    :try_start_0
    const-string/jumbo v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 59
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 69
    :goto_0
    return v0

    .line 63
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public static a(Ljava/io/File;Ljava/io/File;)Z
    .locals 3

    .prologue
    .line 237
    const/4 v0, 0x0

    .line 238
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 239
    const/4 v2, 0x0

    .line 241
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    :try_start_1
    invoke-static {v1, p1}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/InputStream;Ljava/io/File;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 248
    if-eqz v1, :cond_0

    .line 250
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 256
    :cond_0
    :goto_0
    return v0

    .line 243
    :catch_0
    move-exception v1

    move-object v1, v2

    .line 248
    :goto_1
    if-eqz v1, :cond_0

    .line 250
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    .line 251
    :catch_1
    move-exception v1

    goto :goto_0

    .line 247
    :catchall_0
    move-exception v0

    .line 248
    :goto_2
    if-eqz v2, :cond_1

    .line 250
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 254
    :cond_1
    :goto_3
    throw v0

    .line 251
    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_0

    .line 247
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_2

    .line 243
    :catch_4
    move-exception v2

    goto :goto_1
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/File;)Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 264
    .line 265
    const/4 v0, 0x0

    .line 267
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_3

    .line 268
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 272
    :cond_0
    :goto_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    const/16 v0, 0x1000

    :try_start_1
    new-array v0, v0, [B

    .line 276
    :goto_1
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v3

    if-gez v3, :cond_4

    .line 280
    const/4 v0, 0x1

    .line 284
    if-eqz v1, :cond_1

    .line 286
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 291
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 297
    :cond_1
    :goto_3
    if-nez v0, :cond_2

    .line 298
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 300
    :cond_2
    return v0

    .line 269
    :cond_3
    :try_start_4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 270
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 281
    :catch_0
    move-exception v1

    .line 284
    :goto_4
    if-eqz v0, :cond_6

    .line 286
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 291
    :goto_5
    :try_start_6
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    move v0, v2

    .line 292
    goto :goto_3

    .line 277
    :cond_4
    const/4 v4, 0x0

    :try_start_7
    invoke-virtual {v1, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_1

    .line 281
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_4

    .line 292
    :catch_2
    move-exception v0

    move v0, v2

    .line 293
    goto :goto_3

    .line 283
    :catchall_0
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    .line 284
    :goto_6
    if-eqz v1, :cond_5

    .line 286
    :try_start_8
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 291
    :goto_7
    :try_start_9
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    .line 296
    :cond_5
    :goto_8
    throw v0

    .line 287
    :catch_3
    move-exception v0

    move v0, v2

    .line 288
    goto :goto_2

    .line 292
    :catch_4
    move-exception v0

    move v0, v2

    .line 293
    goto :goto_3

    .line 287
    :catch_5
    move-exception v1

    goto :goto_5

    :catch_6
    move-exception v2

    goto :goto_7

    .line 292
    :catch_7
    move-exception v1

    goto :goto_8

    .line 283
    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_6
    move v0, v2

    goto :goto_3
.end method

.method public static a(Ljava/io/File;)[B
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 200
    .line 202
    :try_start_0
    const-string/jumbo v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 203
    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    const/16 v3, 0x400

    :try_start_1
    new-array v3, v3, [B

    .line 207
    :goto_0
    invoke-virtual {v1, v3}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    .line 210
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    .line 212
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 215
    if-eqz v1, :cond_0

    .line 217
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 222
    :cond_0
    :goto_1
    return-object v0

    .line 208
    :cond_1
    const/4 v5, 0x0

    :try_start_3
    invoke-virtual {v2, v3, v5, v4}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 213
    :catch_0
    move-exception v2

    .line 215
    :goto_2
    if-eqz v1, :cond_0

    .line 217
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 218
    :catch_1
    move-exception v1

    goto :goto_1

    .line 214
    :catchall_0
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 215
    :goto_3
    if-eqz v1, :cond_2

    .line 217
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 220
    :cond_2
    :goto_4
    throw v0

    .line 218
    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_4

    .line 214
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 213
    :catch_4
    move-exception v1

    move-object v1, v0

    goto :goto_2
.end method

.method public static a([B)[B
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 130
    .line 132
    :try_start_0
    const-string/jumbo v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 138
    :goto_0
    if-eqz v1, :cond_0

    .line 139
    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 140
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    .line 142
    :cond_0
    return-object v0

    .line 133
    :catch_0
    move-exception v1

    move-object v1, v0

    goto :goto_0
.end method

.method public static b(Ljava/io/InputStream;)J
    .locals 3

    .prologue
    .line 546
    const/4 v0, 0x0

    .line 548
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, p0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 549
    :try_start_1
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 550
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v0

    .line 554
    if-eqz v2, :cond_0

    .line 555
    :try_start_2
    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V

    .line 556
    :cond_0
    if-eqz p0, :cond_1

    .line 557
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 562
    :cond_1
    :goto_0
    return-wide v0

    .line 551
    :catch_0
    move-exception v1

    .line 554
    :goto_1
    if-eqz v0, :cond_2

    .line 555
    :try_start_3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V

    .line 556
    :cond_2
    if-eqz p0, :cond_3

    .line 557
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 562
    :cond_3
    :goto_2
    const-wide/16 v0, 0x0

    goto :goto_0

    .line 552
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    .line 554
    :goto_3
    if-eqz v2, :cond_4

    .line 555
    :try_start_4
    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V

    .line 556
    :cond_4
    if-eqz p0, :cond_5

    .line 557
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 560
    :cond_5
    :goto_4
    throw v0

    .line 558
    :catch_1
    move-exception v1

    goto :goto_4

    .line 552
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 558
    :catch_2
    move-exception v0

    goto :goto_2

    .line 551
    :catch_3
    move-exception v0

    move-object v0, v2

    goto :goto_1

    .line 558
    :catch_4
    move-exception v2

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

    .prologue
    .line 521
    const/4 v0, 0x0

    .line 523
    invoke-static {p0, p1}, Lcom/qihoo/antivirus/update/af;->c(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    .line 524
    invoke-static {p0, p1}, Lcom/qihoo/antivirus/update/af;->d(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    .line 526
    cmp-long v1, v2, v4

    if-ltz v1, :cond_0

    .line 530
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 535
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 538
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 542
    :cond_1
    :goto_1
    return-object v0

    .line 531
    :catch_0
    move-exception v1

    goto :goto_0

    .line 539
    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method public static b([B)Ljava/lang/String;
    .locals 1

    .prologue
    .line 146
    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->a([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/antivirus/update/m;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 94
    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    :cond_0
    const/4 v0, 0x1

    .line 97
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 1

    .prologue
    .line 196
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/File;)[B

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)J
    .locals 3

    .prologue
    .line 568
    const/4 v0, 0x0

    .line 570
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, ".timestamp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 574
    :goto_0
    if-eqz v0, :cond_0

    .line 575
    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->b(Ljava/io/InputStream;)J

    move-result-wide v0

    .line 577
    :goto_1
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_1

    .line 571
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 384
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 385
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 386
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 388
    if-eqz v2, :cond_0

    .line 389
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v3, :cond_2

    .line 396
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 398
    :cond_1
    return-void

    .line 389
    :cond_2
    aget-object v4, v2, v0

    .line 390
    if-eqz v4, :cond_3

    .line 391
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/qihoo/antivirus/update/af;->c(Ljava/lang/String;)V

    .line 389
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 105
    const-string/jumbo v0, "phone"

    invoke-static {p0, v0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 107
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDataState()I

    move-result v0

    .line 108
    if-nez v0, :cond_0

    .line 112
    const/4 v0, 0x0

    .line 114
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)J
    .locals 4

    .prologue
    .line 583
    const/4 v0, 0x0

    .line 585
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v3, ".timestamp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 589
    :goto_0
    if-eqz v0, :cond_0

    .line 590
    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->b(Ljava/io/InputStream;)J

    move-result-wide v0

    .line 592
    :goto_1
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_1

    .line 586
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;)J
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    .line 401
    .line 402
    if-nez p0, :cond_0

    .line 419
    :goto_0
    return-wide v0

    .line 406
    :cond_0
    :try_start_0
    new-instance v2, Landroid/os/StatFs;

    invoke-direct {v2, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 407
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    int-to-long v4, v3

    .line 408
    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocks()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v0, v0

    .line 409
    mul-long/2addr v0, v4

    goto :goto_0

    .line 413
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 227
    :try_start_0
    const-string/jumbo v0, "phone"

    invoke-static {p0, v0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 228
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 231
    :goto_0
    return-object v0

    .line 229
    :catch_0
    move-exception v0

    .line 231
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 474
    .line 475
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v0, v3, :cond_3

    .line 477
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 478
    const-string/jumbo v3, "storage"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 479
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 480
    const-string/jumbo v3, "getVolumeList"

    const/4 v5, 0x0

    .line 479
    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 481
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    .line 482
    const-string/jumbo v5, "getVolumeState"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Ljava/lang/String;

    aput-object v8, v6, v7

    .line 481
    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 484
    const/4 v3, 0x0

    .line 483
    invoke-virtual {v0, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 485
    const/4 v3, 0x0

    aget-object v3, v0, v3

    .line 486
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string/jumbo v6, "getPath"

    .line 487
    const/4 v7, 0x0

    .line 486
    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    move v3, v1

    .line 488
    :goto_0
    array-length v1, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lt v3, v1, :cond_1

    move-object v0, v2

    .line 504
    :goto_1
    if-nez v0, :cond_0

    .line 505
    const-string/jumbo v1, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 506
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 513
    :cond_0
    return-object v0

    .line 489
    :cond_1
    :try_start_1
    aget-object v1, v0, v3

    .line 491
    const/4 v7, 0x0

    .line 490
    invoke-virtual {v6, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 492
    const-string/jumbo v7, "mounted"

    .line 493
    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    .line 492
    invoke-virtual {v5, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v7

    .line 493
    if-eqz v7, :cond_2

    move-object v0, v1

    .line 495
    goto :goto_1

    .line 488
    :cond_2
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    .line 498
    :catch_0
    move-exception v0

    move-object v0, v2

    goto :goto_1

    :cond_3
    move-object v0, v2

    goto :goto_1
.end method
