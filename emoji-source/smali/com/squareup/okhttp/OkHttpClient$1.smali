.class Lcom/squareup/okhttp/OkHttpClient$1;
.super Ljava/net/URLStreamHandler;
.source "OkHttpClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/OkHttpClient;->createURLStreamHandler(Ljava/lang/String;)Ljava/net/URLStreamHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/OkHttpClient;

.field final synthetic val$protocol:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/OkHttpClient;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lcom/squareup/okhttp/OkHttpClient;

    .prologue
    .line 392
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient$1;->this$0:Lcom/squareup/okhttp/OkHttpClient;

    iput-object p2, p0, Lcom/squareup/okhttp/OkHttpClient$1;->val$protocol:Ljava/lang/String;

    invoke-direct {p0}, Ljava/net/URLStreamHandler;-><init>()V

    return-void
.end method


# virtual methods
.method protected getDefaultPort()I
    .locals 2

    .prologue
    .line 402
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient$1;->val$protocol:Ljava/lang/String;

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x50

    .line 403
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient$1;->val$protocol:Ljava/lang/String;

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x1bb

    goto :goto_0

    .line 404
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method protected openConnection(Ljava/net/URL;)Ljava/net/URLConnection;
    .locals 1
    .param p1, "url"    # Ljava/net/URL;

    .prologue
    .line 394
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient$1;->this$0:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/OkHttpClient;->open(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method protected openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    .locals 1
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "proxy"    # Ljava/net/Proxy;

    .prologue
    .line 398
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient$1;->this$0:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/OkHttpClient;->open(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method
