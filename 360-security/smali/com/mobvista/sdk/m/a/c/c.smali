.class final Lcom/mobvista/sdk/m/a/c/c;
.super Lcom/mobvista/sdk/m/a/e/c;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/c/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/c/a;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .prologue
    const-wide/16 v4, 0x0

    .line 134
    const/4 v3, 0x0

    .line 138
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 250
    :cond_0
    :goto_0
    return-void

    .line 143
    :cond_1
    new-instance v6, Ljava/net/URL;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 144
    const-string/jumbo v2, "loader"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string/jumbo v8, "REQUEST URL: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v8}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    new-instance v2, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v7}, Lcom/mobvista/sdk/m/a/c/a;->d(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_2

    .line 149
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 153
    :cond_2
    new-instance v7, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v8}, Lcom/mobvista/sdk/m/a/c/a;->d(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v8}, Lcom/mobvista/sdk/m/a/c/a;->e(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v8

    .line 155
    const-string/jumbo v2, "loader"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string/jumbo v11, "Start download........ local File: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string/jumbo v11, "   "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v2, v10}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    const/16 v3, 0x4e20

    :try_start_1
    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 164
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V

    .line 165
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v10, 0x190

    if-lt v3, v10, :cond_3

    .line 166
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v3

    const/16 v10, 0x70

    invoke-virtual {v3, v10}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 167
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 169
    const-string/jumbo v3, "loader"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string/jumbo v11, "[Status Code: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string/jumbo v11, "] in download: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v11}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Lcom/mobvista/sdk/m/a/b/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    :cond_3
    const-string/jumbo v3, "Content-Length"

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 174
    cmp-long v3, v10, v8

    if-nez v3, :cond_4

    .line 175
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v3

    const/16 v4, 0x64

    invoke-virtual {v3, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 176
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 246
    if-eqz v2, :cond_0

    .line 248
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 181
    :cond_4
    cmp-long v3, v10, v8

    if-lez v3, :cond_5

    cmp-long v3, v8, v4

    if-eqz v3, :cond_5

    .line 183
    :try_start_2
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 186
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v2, v0

    .line 187
    const/16 v3, 0x4e20

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 188
    const-string/jumbo v3, "RANGE"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string/jumbo v12, "bytes="

    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v8, "-"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v3, v6}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V
    :try_end_2
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_5
    move-object v3, v2

    .line 192
    :try_start_3
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 195
    const/16 v6, 0xc8

    if-eq v2, v6, :cond_6

    const/16 v6, 0xce

    if-eq v2, v6, :cond_6

    .line 196
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v4}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v4

    const/16 v5, 0x70

    invoke-virtual {v4, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 197
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 198
    const-string/jumbo v4, "loader"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string/jumbo v6, "Error: ["

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v5, "]  in download: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v5}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/mobvista/sdk/m/a/b/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 246
    if-eqz v3, :cond_0

    .line 248
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 203
    :cond_6
    :try_start_4
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 204
    new-instance v8, Ljava/io/FileOutputStream;

    const/4 v6, 0x1

    invoke-direct {v8, v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 208
    const/16 v6, 0x800

    new-array v9, v6, [B

    .line 210
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 212
    :cond_7
    :goto_1
    invoke-virtual {v2, v9}, Ljava/io/InputStream;->read([B)I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_8

    .line 213
    int-to-long v14, v12

    add-long/2addr v4, v14

    .line 214
    const/4 v13, 0x0

    invoke-virtual {v8, v9, v13, v12}, Ljava/io/FileOutputStream;->write([BII)V

    .line 216
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v6

    const-wide/16 v14, 0x7d0

    cmp-long v12, v12, v14

    if-lez v12, :cond_7

    .line 217
    const-wide/16 v6, 0x64

    mul-long/2addr v6, v4

    div-long/2addr v6, v10

    long-to-int v12, v6

    .line 218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 219
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v13}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v13

    const/16 v14, 0x65

    invoke-virtual {v13, v14}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v13

    .line 220
    iput v12, v13, Landroid/os/Message;->arg1:I

    .line 221
    invoke-virtual {v13}, Landroid/os/Message;->sendToTarget()V

    .line 222
    new-instance v13, Ljava/lang/StringBuilder;

    const-string/jumbo v14, "downloading........ "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string/jumbo v13, "%"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    .line 237
    :catch_0
    move-exception v2

    .line 238
    :goto_2
    :try_start_5
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v4}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v4

    const/16 v5, 0x6e

    invoke-virtual {v4, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 239
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 240
    invoke-virtual {v2}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 246
    if-eqz v3, :cond_0

    .line 248
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 225
    :cond_8
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 226
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->flush()V

    .line 227
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 229
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v2

    const/16 v4, 0x65

    invoke-virtual {v2, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 230
    const/16 v4, 0x64

    iput v4, v2, Landroid/os/Message;->arg1:I

    .line 231
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 234
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v2

    const/16 v4, 0x64

    invoke-virtual {v2, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 235
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V
    :try_end_6
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 246
    if-eqz v3, :cond_0

    .line 248
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 241
    :catch_1
    move-exception v2

    .line 242
    :goto_3
    :try_start_7
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/mobvista/sdk/m/a/c/c;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v4}, Lcom/mobvista/sdk/m/a/c/a;->f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;

    move-result-object v4

    const/16 v5, 0x6f

    invoke-virtual {v4, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 243
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 244
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 246
    if-eqz v3, :cond_0

    .line 248
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 246
    :catchall_0
    move-exception v2

    :goto_4
    if-eqz v3, :cond_9

    .line 248
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 250
    :cond_9
    throw v2

    .line 246
    :catchall_1
    move-exception v3

    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_4

    .line 241
    :catch_2
    move-exception v3

    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_3

    .line 237
    :catch_3
    move-exception v3

    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto/16 :goto_2
.end method
