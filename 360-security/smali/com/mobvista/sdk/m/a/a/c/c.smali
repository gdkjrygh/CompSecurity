.class final Lcom/mobvista/sdk/m/a/a/c/c;
.super Lcom/mobvista/sdk/m/a/e/c;
.source "360Security"


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/mobvista/sdk/m/a/a/c/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/a/c/a;I)V
    .locals 0

    .prologue
    .line 181
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iput p2, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/e/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    .line 186
    const/4 v1, 0x0

    .line 190
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-object v0, v0, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    const/16 v2, 0x65

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 191
    iget v2, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 192
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 194
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/c/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 195
    const/4 v0, 0x1

    const-string/jumbo v3, "fw.data.http.loader"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "REQUEST URL: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lcom/mobvista/sdk/m/a/b/a/a;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 198
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 201
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    :try_start_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    .line 206
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    .line 220
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-boolean v1, v1, Lcom/mobvista/sdk/m/a/a/c/a;->a:Z

    if-eqz v1, :cond_1

    .line 228
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-object v1, v1, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    const/16 v2, 0x72

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 229
    iget v2, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 230
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 301
    if-eqz v0, :cond_0

    .line 303
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 306
    :cond_0
    :goto_0
    return-void

    .line 235
    :cond_1
    const/16 v1, 0x4e20

    :try_start_2
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 236
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 239
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    .line 249
    iget-object v3, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    .line 251
    const/16 v3, 0xc8

    if-eq v1, v3, :cond_2

    .line 254
    iget-object v3, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-object v3, v3, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    const/16 v4, 0x6f

    invoke-virtual {v3, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 255
    iget v4, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    iput v4, v3, Landroid/os/Message;->arg1:I

    .line 256
    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "http respond status code is "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 257
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 258
    const-string/jumbo v3, "fw.data.http.loader"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "http respond status code is "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v4, " ! url="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 301
    if-eqz v0, :cond_0

    .line 303
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    .line 263
    :cond_2
    :try_start_3
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-boolean v1, v1, Lcom/mobvista/sdk/m/a/a/c/a;->a:Z

    if-eqz v1, :cond_3

    .line 264
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-object v1, v1, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    const/16 v2, 0x72

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 265
    iget v2, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 266
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
    :try_end_3
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 301
    if-eqz v0, :cond_0

    .line 303
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    .line 271
    :cond_3
    :try_start_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    .line 272
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 273
    const/16 v3, 0x400

    new-array v3, v3, [B

    .line 275
    :goto_1
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_4

    .line 276
    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_4
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 287
    :catch_0
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 288
    :goto_2
    :try_start_5
    invoke-virtual {v0}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V

    .line 289
    iget-object v2, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-object v2, v2, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    const/16 v3, 0x6e

    invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 290
    iget v3, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    iput v3, v2, Landroid/os/Message;->arg1:I

    .line 291
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 292
    const-string/jumbo v2, "fw.data.http.loader"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "http connect time out ! "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/apache/http/conn/ConnectTimeoutException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/mobvista/sdk/m/a/b/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 301
    if-eqz v1, :cond_0

    .line 303
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 280
    :cond_4
    :try_start_6
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/mobvista/sdk/m/a/a/c/a;->a(Ljava/util/Map;[B)Ljava/lang/Object;

    move-result-object v1

    .line 281
    iget-object v2, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-object v2, v2, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    const/16 v3, 0x64

    invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 282
    iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 283
    iget v1, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    iput v1, v2, Landroid/os/Message;->arg1:I

    .line 284
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V
    :try_end_6
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 301
    if-eqz v0, :cond_0

    .line 303
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 293
    :catch_1
    move-exception v0

    .line 294
    :goto_3
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 295
    iget-object v2, p0, Lcom/mobvista/sdk/m/a/a/c/c;->b:Lcom/mobvista/sdk/m/a/a/c/a;

    iget-object v2, v2, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    const/16 v3, 0x6f

    invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 296
    iget v3, p0, Lcom/mobvista/sdk/m/a/a/c/c;->a:I

    iput v3, v2, Landroid/os/Message;->arg1:I

    .line 297
    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 298
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 299
    const-string/jumbo v2, "fw.data.http.loader"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "http error ! "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/mobvista/sdk/m/a/b/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 301
    if-eqz v1, :cond_0

    .line 303
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    .line 301
    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v1, :cond_5

    .line 303
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    throw v0

    .line 301
    :catchall_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_4

    .line 293
    :catch_2
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    .line 287
    :catch_3
    move-exception v0

    goto/16 :goto_2
.end method
