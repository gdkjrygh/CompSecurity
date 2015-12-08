.class final Lkik/android/scan/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/scan/RemoteKikCode;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/android/scan/d;


# direct methods
.method constructor <init>(Lkik/android/scan/d;Lcom/kik/scan/RemoteKikCode;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 326
    iput-object p1, p0, Lkik/android/scan/j;->c:Lkik/android/scan/d;

    iput-object p2, p0, Lkik/android/scan/j;->a:Lcom/kik/scan/RemoteKikCode;

    iput-object p3, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "https://remote-scancode.kik.com/api/v1/codes/"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkik/android/scan/j;->a:Lcom/kik/scan/RemoteKikCode;

    invoke-virtual {v2}, Lcom/kik/scan/RemoteKikCode;->getPayloadId()[B

    move-result-object v2

    invoke-static {v2}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 333
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 341
    const/16 v1, 0x2710

    :try_start_2
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 342
    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 343
    const-string v1, "User-Agent"

    const-string v2, "Content"

    invoke-static {v2}, Lkik/android/util/DeviceUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    const-string v1, "Content-Type"

    const-string v2, "application/json"

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    invoke-static {v0}, Lkik/android/scan/d;->a(Ljava/net/HttpURLConnection;)Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 346
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 347
    const/16 v3, 0xc8

    if-eq v2, v3, :cond_0

    const/16 v3, 0xc9

    if-ne v2, v3, :cond_3

    .line 348
    :cond_0
    invoke-static {v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v1

    .line 349
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 350
    iget-object v1, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    iget-object v3, p0, Lkik/android/scan/j;->a:Lcom/kik/scan/RemoteKikCode;

    invoke-static {v3, v2}, Lkik/android/scan/d;->a(Lcom/kik/scan/RemoteKikCode;Lorg/json/JSONObject;)Lkik/android/scan/a/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 361
    :goto_1
    iget-object v1, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    invoke-virtual {v1}, Lcom/kik/g/p;->g()Z

    move-result v1

    if-nez v1, :cond_1

    .line 362
    iget-object v1, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "promise unresolved at connection termination"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 364
    :cond_1
    if-eqz v0, :cond_2

    .line 365
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 368
    :cond_2
    :goto_2
    return-void

    .line 335
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/MalformedURLException;->printStackTrace()V

    move-object v0, v1

    goto :goto_0

    .line 353
    :cond_3
    :try_start_3
    iget-object v1, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

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

    .line 356
    :catch_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 357
    :goto_3
    :try_start_4
    invoke-static {v0}, Lkik/android/util/bx;->f(Ljava/lang/Throwable;)V

    .line 358
    iget-object v2, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 361
    iget-object v0, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_4

    .line 362
    iget-object v0, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "promise unresolved at connection termination"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 364
    :cond_4
    if-eqz v1, :cond_2

    .line 365
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_2

    .line 361
    :catchall_0
    move-exception v0

    :goto_4
    iget-object v2, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    invoke-virtual {v2}, Lcom/kik/g/p;->g()Z

    move-result v2

    if-nez v2, :cond_5

    .line 362
    iget-object v2, p0, Lkik/android/scan/j;->b:Lcom/kik/g/p;

    new-instance v3, Ljava/io/IOException;

    const-string v4, "promise unresolved at connection termination"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 364
    :cond_5
    if-eqz v1, :cond_6

    .line 365
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    throw v0

    .line 361
    :catchall_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_4

    .line 356
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
