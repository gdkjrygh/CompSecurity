.class final Lkik/android/s$a;
.super Lkik/android/util/bf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lkik/android/s;

.field private c:Ljava/lang/String;

.field private d:Ljava/io/File;

.field private e:[B

.field private f:Ljava/lang/String;

.field private g:I


# direct methods
.method public constructor <init>(Lkik/android/s;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;[BI)V
    .locals 1

    .prologue
    .line 183
    iput-object p1, p0, Lkik/android/s$a;->b:Lkik/android/s;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/s$a;->a:Z

    .line 184
    iput-object p2, p0, Lkik/android/s$a;->c:Ljava/lang/String;

    .line 185
    iput-object p3, p0, Lkik/android/s$a;->f:Ljava/lang/String;

    .line 186
    iput-object p4, p0, Lkik/android/s$a;->d:Ljava/io/File;

    .line 187
    iput-object p5, p0, Lkik/android/s$a;->e:[B

    .line 188
    iput p6, p0, Lkik/android/s$a;->g:I

    .line 189
    return-void
.end method

.method private varargs a()Ljava/lang/String;
    .locals 19

    .prologue
    .line 213
    new-instance v13, Ljava/util/Timer;

    invoke-direct {v13}, Ljava/util/Timer;-><init>()V

    .line 214
    new-instance v2, Lkik/android/u;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lkik/android/u;-><init>(Lkik/android/s$a;)V

    .line 222
    const-wide/32 v4, 0xea60

    invoke-virtual {v13, v2, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 224
    const/4 v3, 0x0

    .line 225
    const/4 v6, 0x0

    .line 226
    const/4 v5, 0x0

    .line 228
    :try_start_0
    new-instance v4, Ljava/net/URL;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/s$a;->c:Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 229
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 233
    :try_start_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/s$a;->e:[B

    if-eqz v3, :cond_3

    .line 236
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/s$a;->d:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    .line 237
    new-instance v3, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/s$a;->d:Ljava/io/File;

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "_temp"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v3, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 243
    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v8

    .line 244
    const-wide/16 v10, 0x0

    cmp-long v7, v8, v10

    if-lez v7, :cond_0

    .line 245
    const-string v7, "Range"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "bytes="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "-"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v7, v10}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    :cond_0
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    .line 249
    const/16 v10, 0x1f4

    if-eq v7, v10, :cond_1

    const/16 v10, 0x1a0

    if-ne v7, v10, :cond_15

    .line 250
    :cond_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 251
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v2, v0
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v12, v2

    .line 254
    :goto_1
    const/16 v2, 0xce

    if-ne v7, v2, :cond_4

    const-wide/16 v10, 0x0

    cmp-long v2, v8, v10

    if-lez v2, :cond_4

    const/4 v2, 0x1

    .line 256
    :goto_2
    const-wide/16 v10, 0x0

    .line 257
    if-eqz v2, :cond_14

    .line 262
    :goto_3
    :try_start_2
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v4

    int-to-long v10, v4

    .line 263
    if-eqz v2, :cond_13

    .line 264
    add-long/2addr v10, v8

    move-wide v14, v10

    .line 266
    :goto_4
    move-object/from16 v0, p0

    iget v4, v0, Lkik/android/s$a;->g:I

    int-to-long v10, v4

    cmp-long v4, v14, v10

    if-ltz v4, :cond_5

    .line 267
    new-instance v2, Lkik/android/v;

    invoke-direct {v2}, Lkik/android/v;-><init>()V

    throw v2
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 343
    :catch_0
    move-exception v2

    move-object v2, v5

    move-object v3, v6

    move-object v4, v12

    :goto_5
    :try_start_3
    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/s$a;->b:Lkik/android/s;

    move-object/from16 v0, p0

    invoke-static {v5, v0}, Lkik/android/s;->a(Lkik/android/s;Lkik/android/s$a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 349
    invoke-virtual {v13}, Ljava/util/Timer;->cancel()V

    .line 350
    if-eqz v4, :cond_2

    .line 351
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 353
    :cond_2
    invoke-static {v3}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 354
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 357
    :goto_6
    const/4 v2, 0x0

    :goto_7
    return-object v2

    .line 240
    :cond_3
    :try_start_4
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/s$a;->d:Ljava/io/File;
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto/16 :goto_0

    .line 254
    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    .line 270
    :cond_5
    const/4 v4, 0x1

    :try_start_5
    new-array v4, v4, [Ljava/lang/Double;

    const/4 v7, 0x0

    long-to-double v10, v8

    long-to-double v0, v14

    move-wide/from16 v16, v0

    div-double v10, v10, v16

    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    mul-double v10, v10, v16

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v4, v7

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lkik/android/s$a;->publishProgress([Ljava/lang/Object;)V

    .line 272
    const v4, 0xea60

    invoke-virtual {v12, v4}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 273
    const v4, 0xea60

    invoke-virtual {v12, v4}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 275
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    .line 276
    new-instance v11, Ljava/io/BufferedInputStream;

    const v7, 0xc800

    invoke-direct {v11, v4, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 277
    :try_start_6
    new-instance v10, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v10, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_a
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 278
    if-eqz v2, :cond_6

    .line 279
    :try_start_7
    invoke-virtual {v10, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 281
    :cond_6
    const v2, 0xc800

    new-array v2, v2, [B

    move-wide v4, v8

    .line 284
    :cond_7
    invoke-virtual {v11, v2}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_a

    .line 285
    const/4 v7, 0x0

    invoke-virtual {v10, v2, v7, v6}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 286
    int-to-long v6, v6

    add-long/2addr v4, v6

    .line 287
    move-object/from16 v0, p0

    iget v6, v0, Lkik/android/s$a;->g:I

    int-to-long v6, v6

    cmp-long v6, v4, v6

    if-ltz v6, :cond_8

    .line 288
    new-instance v2, Lkik/android/v;

    invoke-direct {v2}, Lkik/android/v;-><init>()V

    throw v2

    .line 343
    :catch_1
    move-exception v2

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    goto/16 :goto_5

    .line 290
    :cond_8
    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Double;

    const/4 v7, 0x0

    long-to-double v8, v4

    long-to-double v0, v14

    move-wide/from16 v16, v0

    div-double v8, v8, v16

    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    mul-double v8, v8, v16

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v6, v7

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lkik/android/s$a;->publishProgress([Ljava/lang/Object;)V

    .line 292
    invoke-virtual/range {p0 .. p0}, Lkik/android/s$a;->isCancelled()Z
    :try_end_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-result v6

    if-eqz v6, :cond_7

    .line 294
    invoke-virtual {v13}, Ljava/util/Timer;->cancel()V

    .line 350
    if-eqz v12, :cond_9

    .line 351
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 353
    :cond_9
    invoke-static {v11}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 354
    invoke-static {v10}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    const/4 v2, 0x0

    goto/16 :goto_7

    .line 299
    :cond_a
    :try_start_8
    invoke-virtual {v13}, Ljava/util/Timer;->cancel()V

    .line 301
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 304
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/s$a;->e:[B
    :try_end_8
    .catch Ljava/net/SocketTimeoutException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    if-eqz v2, :cond_d

    .line 305
    const/4 v4, 0x0

    .line 306
    const/4 v8, 0x0

    .line 308
    :try_start_9
    new-instance v9, Ljava/io/FileOutputStream;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/s$a;->d:Ljava/io/File;

    invoke-direct {v9, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_9
    .catch Lkik/a/f/g; {:try_start_9 .. :try_end_9} :catch_b
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 309
    :try_start_a
    new-instance v2, Lkik/android/net/a/a;

    const-string v4, "r"

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/s$a;->e:[B

    const/16 v6, 0x10

    new-array v6, v6, [B

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lkik/android/net/a/a;-><init>(Ljava/io/File;Ljava/lang/String;[B[BZ)V
    :try_end_a
    .catch Lkik/a/f/g; {:try_start_a .. :try_end_a} :catch_c
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 310
    const v4, 0xc800

    :try_start_b
    new-array v4, v4, [B

    .line 311
    :goto_8
    const v5, 0xc800

    invoke-virtual {v2, v4, v5}, Lkik/android/net/a/a;->a([BI)I

    move-result v5

    if-lez v5, :cond_c

    .line 312
    const/4 v6, 0x0

    invoke-virtual {v9, v4, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_b
    .catch Lkik/a/f/g; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto :goto_8

    .line 316
    :catch_2
    move-exception v4

    move-object v5, v9

    move-object/from16 v18, v2

    move-object v2, v4

    move-object/from16 v4, v18

    .line 318
    :goto_9
    :try_start_c
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/s$a;->b:Lkik/android/s;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/s$a;->c:Ljava/lang/String;

    invoke-static {v6, v7, v2}, Lkik/android/s;->a(Lkik/android/s;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 319
    :try_start_d
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 323
    invoke-static {v5}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 324
    invoke-static {v4}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V
    :try_end_d
    .catch Ljava/net/SocketTimeoutException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 349
    invoke-virtual {v13}, Ljava/util/Timer;->cancel()V

    .line 350
    if-eqz v12, :cond_b

    .line 351
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 353
    :cond_b
    invoke-static {v11}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 354
    invoke-static {v10}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    const/4 v2, 0x0

    goto/16 :goto_7

    .line 314
    :cond_c
    :try_start_e
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->flush()V
    :try_end_e
    .catch Lkik/a/f/g; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 322
    :try_start_f
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 323
    invoke-static {v9}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 324
    invoke-static {v2}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 328
    :cond_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v14

    long-to-double v4, v4

    .line 330
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/s$a;->f:Ljava/lang/String;

    if-eqz v2, :cond_e

    .line 331
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/s$a;->b:Lkik/android/s;

    invoke-static {v2}, Lkik/android/s;->b(Lkik/android/s;)Lcom/kik/android/a;

    move-result-object v2

    const-string v6, "Content Downloaded"

    invoke-virtual {v2, v6}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v6

    const-string v7, "Is Encrypted"

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/s$a;->e:[B

    if-eqz v2, :cond_11

    const/4 v2, 0x1

    :goto_a
    invoke-virtual {v6, v7, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v6, "Decryption Time"

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v8

    invoke-virtual {v2, v6, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v4, "Content Size"

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    invoke-virtual {v2, v4, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "App ID"

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/s$a;->f:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    .line 339
    :cond_e
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lkik/android/s$a;->a:Z
    :try_end_f
    .catch Ljava/net/SocketTimeoutException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 349
    invoke-virtual {v13}, Ljava/util/Timer;->cancel()V

    .line 350
    if-eqz v12, :cond_f

    .line 351
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 353
    :cond_f
    invoke-static {v11}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 354
    invoke-static {v10}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    goto/16 :goto_6

    .line 322
    :catchall_0
    move-exception v2

    move-object v9, v4

    :goto_b
    :try_start_10
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 323
    invoke-static {v9}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 324
    invoke-static {v8}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    throw v2
    :try_end_10
    .catch Ljava/net/SocketTimeoutException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 345
    :catch_3
    move-exception v2

    move-object v5, v10

    .line 346
    :goto_c
    :try_start_11
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/s$a;->b:Lkik/android/s;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/s$a;->c:Ljava/lang/String;

    invoke-static {v3, v4, v2}, Lkik/android/s;->a(Lkik/android/s;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 349
    invoke-virtual {v13}, Ljava/util/Timer;->cancel()V

    .line 350
    if-eqz v12, :cond_10

    .line 351
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 353
    :cond_10
    invoke-static {v11}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 354
    invoke-static {v5}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    goto/16 :goto_6

    .line 331
    :cond_11
    const/4 v2, 0x0

    goto :goto_a

    .line 349
    :catchall_1
    move-exception v2

    move-object v11, v6

    move-object v12, v3

    :goto_d
    invoke-virtual {v13}, Ljava/util/Timer;->cancel()V

    .line 350
    if-eqz v12, :cond_12

    .line 351
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 353
    :cond_12
    invoke-static {v11}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 354
    invoke-static {v5}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    throw v2

    .line 349
    :catchall_2
    move-exception v3

    move-object v11, v6

    move-object v12, v2

    move-object v2, v3

    goto :goto_d

    :catchall_3
    move-exception v2

    move-object v11, v6

    goto :goto_d

    :catchall_4
    move-exception v2

    goto :goto_d

    :catchall_5
    move-exception v2

    move-object v5, v10

    goto :goto_d

    :catchall_6
    move-exception v5

    move-object v11, v3

    move-object v12, v4

    move-object/from16 v18, v5

    move-object v5, v2

    move-object/from16 v2, v18

    goto :goto_d

    .line 345
    :catch_4
    move-exception v2

    move-object v11, v6

    move-object v12, v3

    goto :goto_c

    :catch_5
    move-exception v3

    move-object v11, v6

    move-object v12, v2

    move-object v2, v3

    goto :goto_c

    :catch_6
    move-exception v2

    move-object v11, v6

    goto :goto_c

    :catch_7
    move-exception v2

    goto :goto_c

    .line 343
    :catch_8
    move-exception v2

    move-object v2, v5

    move-object v4, v3

    move-object v3, v6

    goto/16 :goto_5

    :catch_9
    move-exception v3

    move-object v3, v6

    move-object v4, v2

    move-object v2, v5

    goto/16 :goto_5

    :catch_a
    move-exception v2

    move-object v2, v5

    move-object v3, v11

    move-object v4, v12

    goto/16 :goto_5

    .line 322
    :catchall_7
    move-exception v2

    goto :goto_b

    :catchall_8
    move-exception v4

    move-object v8, v2

    move-object v2, v4

    goto :goto_b

    :catchall_9
    move-exception v2

    move-object v8, v4

    move-object v9, v5

    goto :goto_b

    .line 316
    :catch_b
    move-exception v2

    move-object v5, v4

    move-object v4, v8

    goto/16 :goto_9

    :catch_c
    move-exception v2

    move-object v4, v8

    move-object v5, v9

    goto/16 :goto_9

    :cond_13
    move-wide v14, v10

    goto/16 :goto_4

    :cond_14
    move-wide v8, v10

    goto/16 :goto_3

    :cond_15
    move-object v12, v2

    goto/16 :goto_1
.end method

.method static synthetic a(Lkik/android/s$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lkik/android/s$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lkik/android/s$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lkik/android/s$a;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lkik/android/s$a;)Ljava/io/File;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lkik/android/s$a;->d:Ljava/io/File;

    return-object v0
.end method

.method static synthetic d(Lkik/android/s$a;)[B
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lkik/android/s$a;->e:[B

    return-object v0
.end method

.method static synthetic e(Lkik/android/s$a;)I
    .locals 1

    .prologue
    .line 172
    iget v0, p0, Lkik/android/s$a;->g:I

    return v0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 172
    invoke-direct {p0}, Lkik/android/s$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 172
    iget-boolean v0, p0, Lkik/android/s$a;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/s$a;->b:Lkik/android/s;

    iget-object v1, p0, Lkik/android/s$a;->c:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/s$a;->d:Ljava/io/File;

    invoke-static {v0, v1, v2}, Lkik/android/s;->a(Lkik/android/s;Ljava/lang/String;Ljava/io/File;)V

    :cond_0
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 172
    check-cast p1, [Ljava/lang/Double;

    iget-object v0, p0, Lkik/android/s$a;->b:Lkik/android/s;

    invoke-static {v0}, Lkik/android/s;->a(Lkik/android/s;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lkik/android/s$a;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/s$a;->b:Lkik/android/s;

    invoke-static {v0}, Lkik/android/s;->a(Lkik/android/s;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lkik/android/s$a;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/s$a;->b:Lkik/android/s;

    invoke-static {v0}, Lkik/android/s;->a(Lkik/android/s;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lkik/android/s$a;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/s;

    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-virtual {v2}, Ljava/lang/Double;->intValue()I

    move-result v2

    invoke-interface {v0, v2}, Lkik/a/e/s;->a(I)V

    goto :goto_0

    :cond_0
    return-void
.end method
