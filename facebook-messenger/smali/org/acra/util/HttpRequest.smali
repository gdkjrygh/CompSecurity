.class public Lorg/acra/util/HttpRequest;
.super Ljava/lang/Object;
.source "HttpRequest.java"


# static fields
.field public static final POST_CONTENT_TYPE_FORM_URLENCODED:Ljava/lang/String; = "application/x-www-form-urlencoded"

.field public static final POST_CONTENT_TYPE_JSON:Ljava/lang/String; = "application/json"


# instance fields
.field private mConnectionProvider:Lorg/acra/util/HttpConnectionProvider;


# direct methods
.method public constructor <init>(Lorg/acra/util/HttpConnectionProvider;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lorg/acra/util/HttpRequest;->mConnectionProvider:Lorg/acra/util/HttpConnectionProvider;

    .line 17
    return-void
.end method


# virtual methods
.method public sendPost(Ljava/net/URL;Ljava/lang/String;Lorg/acra/util/ACRAResponse;)V
    .locals 1

    .prologue
    .line 27
    const-string v0, "application/x-www-form-urlencoded"

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/acra/util/HttpRequest;->sendPost(Ljava/net/URL;Ljava/lang/String;Lorg/acra/util/ACRAResponse;Ljava/lang/String;)V

    .line 28
    return-void
.end method

.method public sendPost(Ljava/net/URL;Ljava/lang/String;Lorg/acra/util/ACRAResponse;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 39
    .line 40
    iget-object v0, p0, Lorg/acra/util/HttpRequest;->mConnectionProvider:Lorg/acra/util/HttpConnectionProvider;

    invoke-interface {v0, p1}, Lorg/acra/util/HttpConnectionProvider;->getConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v1

    .line 42
    const-string v0, "POST"

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 43
    const-string v0, "User-Agent"

    const-string v2, "Android"

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v0, "Content-Type"

    invoke-virtual {v1, v0, p4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 46
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 49
    :try_start_0
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    .line 50
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    .line 51
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 52
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 53
    invoke-virtual {p3, v0}, Lorg/acra/util/ACRAResponse;->setStatusCode(I)V

    .line 54
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 58
    return-void

    .line 56
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v0
.end method
