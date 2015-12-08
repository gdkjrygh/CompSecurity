.class final Lkik/android/scan/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/d/aa;

.field final synthetic b:I

.field final synthetic c:Lcom/kik/g/p;

.field final synthetic d:Lkik/android/scan/d;


# direct methods
.method constructor <init>(Lkik/android/scan/d;Lkik/a/d/aa;ILcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lkik/android/scan/i;->d:Lkik/android/scan/d;

    iput-object p2, p0, Lkik/android/scan/i;->a:Lkik/a/d/aa;

    iput p3, p0, Lkik/android/scan/i;->b:I

    iput-object p4, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 257
    iget-object v0, p0, Lkik/android/scan/i;->a:Lkik/a/d/aa;

    iget v2, p0, Lkik/android/scan/i;->b:I

    invoke-static {v0, v2}, Lkik/android/scan/d;->b(Lkik/a/d/aa;I)Lorg/json/JSONObject;

    move-result-object v2

    .line 258
    const-string v3, "https://remote-scancode.kik.com/api/v1/codes"

    .line 261
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 270
    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 271
    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 272
    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 273
    const-string v1, "User-Agent"

    const-string v3, "Content"

    invoke-static {v3}, Lkik/android/util/DeviceUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    const-string v1, "Content-Type"

    const-string v3, "application/json"

    invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 276
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 277
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->flush()V

    .line 278
    invoke-static {v0}, Lkik/android/scan/d;->a(Ljava/net/HttpURLConnection;)Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 279
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 280
    const/16 v3, 0xc8

    if-eq v2, v3, :cond_0

    const/16 v3, 0xc9

    if-ne v2, v3, :cond_3

    .line 281
    :cond_0
    invoke-static {v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v1

    .line 282
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 283
    const-string v1, "id"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 284
    iget-object v2, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    invoke-static {v1}, Lkik/a/h/i;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 295
    :goto_1
    iget-object v1, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    invoke-virtual {v1}, Lcom/kik/g/p;->g()Z

    move-result v1

    if-nez v1, :cond_1

    .line 296
    iget-object v1, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "promise unresolved at connection termination"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 298
    :cond_1
    if-eqz v0, :cond_2

    .line 299
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 302
    :cond_2
    :goto_2
    return-void

    .line 263
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    move-object v0, v1

    goto/16 :goto_0

    .line 287
    :cond_3
    :try_start_3
    iget-object v1, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unexpected response code: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 290
    :catch_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 291
    :goto_3
    :try_start_4
    invoke-static {v0}, Lkik/android/util/bx;->f(Ljava/lang/Throwable;)V

    .line 292
    iget-object v2, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 295
    iget-object v0, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_4

    .line 296
    iget-object v0, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "promise unresolved at connection termination"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 298
    :cond_4
    if-eqz v1, :cond_2

    .line 299
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_2

    .line 295
    :catchall_0
    move-exception v0

    :goto_4
    iget-object v2, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    invoke-virtual {v2}, Lcom/kik/g/p;->g()Z

    move-result v2

    if-nez v2, :cond_5

    .line 296
    iget-object v2, p0, Lkik/android/scan/i;->c:Lcom/kik/g/p;

    new-instance v3, Ljava/io/IOException;

    const-string v4, "promise unresolved at connection termination"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 298
    :cond_5
    if-eqz v1, :cond_6

    .line 299
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    throw v0

    .line 295
    :catchall_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_4

    .line 290
    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_3
.end method
