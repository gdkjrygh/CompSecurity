.class Lcom/google/ads/h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/ads/h$a;

.field final synthetic c:Lcom/google/ads/h;


# direct methods
.method constructor <init>(Lcom/google/ads/h;Ljava/lang/String;Lcom/google/ads/h$a;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/google/ads/h$2;->c:Lcom/google/ads/h;

    iput-object p2, p0, Lcom/google/ads/h$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/ads/h$2;->b:Lcom/google/ads/h$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 54
    const/4 v1, 0x0

    .line 56
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v2, p0, Lcom/google/ads/h$2;->a:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :try_start_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 58
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    .line 59
    const/16 v2, 0xc8

    if-lt v1, v2, :cond_1

    const/16 v2, 0x12b

    if-gt v1, v2, :cond_1

    .line 60
    iget-object v1, p0, Lcom/google/ads/h$2;->b:Lcom/google/ads/h$a;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/ads/h$a;->b(Ljava/io/InputStream;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v1

    .line 67
    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    move-object v0, v1

    .line 71
    :goto_0
    return-object v0

    .line 67
    :cond_1
    if-eqz v0, :cond_2

    .line 68
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 71
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/google/ads/h$2;->b:Lcom/google/ads/h$a;

    invoke-interface {v0}, Lcom/google/ads/h$a;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 62
    :catch_0
    move-exception v0

    .line 63
    :goto_2
    :try_start_2
    const-string v2, "Ads"

    const-string v3, "Error making request."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    if-eqz v1, :cond_2

    .line 68
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_1

    .line 64
    :catch_1
    move-exception v0

    .line 65
    :goto_3
    :try_start_3
    const-string v2, "Ads"

    const-string v3, "Error making request."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    if-eqz v1, :cond_2

    .line 68
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_1

    .line 67
    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v1, :cond_3

    .line 68
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_3
    throw v0

    .line 67
    :catchall_1
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_4

    .line 64
    :catch_2
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_3

    .line 62
    :catch_3
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_2
.end method
