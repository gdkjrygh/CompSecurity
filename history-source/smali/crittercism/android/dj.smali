.class public Lcrittercism/android/dj;
.super Lcrittercism/android/di;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcrittercism/android/cw;

.field private c:Lcrittercism/android/dc;

.field private d:Z

.field private e:Lcrittercism/android/cy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcrittercism/android/dj;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcrittercism/android/dj;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcrittercism/android/cw;Lcrittercism/android/dc;Lcrittercism/android/cy;)V
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcrittercism/android/dj;-><init>(Lcrittercism/android/cw;Lcrittercism/android/dc;ZLcrittercism/android/cy;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Lcrittercism/android/cw;Lcrittercism/android/dc;ZLcrittercism/android/cy;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcrittercism/android/di;-><init>()V

    .line 42
    iput-object p1, p0, Lcrittercism/android/dj;->b:Lcrittercism/android/cw;

    .line 45
    iput-object p2, p0, Lcrittercism/android/dj;->c:Lcrittercism/android/dc;

    .line 46
    iput-boolean p3, p0, Lcrittercism/android/dj;->d:Z

    .line 48
    iput-object p4, p0, Lcrittercism/android/dj;->e:Lcrittercism/android/cy;

    .line 49
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    const/4 v4, -0x1

    .line 66
    .line 68
    const/4 v1, 0x0

    .line 69
    const/4 v2, 0x0

    .line 72
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/dj;->c:Lcrittercism/android/dc;

    invoke-virtual {v0}, Lcrittercism/android/dc;->a()Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_8

    move-result-object v5

    .line 81
    if-nez v5, :cond_1

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 91
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcrittercism/android/dj;->b:Lcrittercism/android/cw;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    invoke-interface {v0, v3}, Lcrittercism/android/cw;->a(Ljava/io/OutputStream;)V

    .line 92
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3

    move-result v3

    .line 94
    :try_start_2
    iget-boolean v0, p0, Lcrittercism/android/dj;->d:Z

    if-eqz v0, :cond_3

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v6, Ljava/io/BufferedReader;

    new-instance v7, Ljava/io/InputStreamReader;

    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v6, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_1
    invoke-virtual {v6}, Ljava/io/BufferedReader;->read()I

    move-result v7

    if-eq v7, v4, :cond_2

    int-to-char v7, v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_1

    .line 97
    :catch_0
    move-exception v0

    move-object v9, v0

    move v0, v3

    move-object v3, v9

    .line 98
    :goto_2
    sget-object v4, Lcrittercism/android/dj;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "UnsupportedEncodingException in proceed(): "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    .line 99
    invoke-static {}, Lcrittercism/android/dx;->c()V

    move v9, v2

    move v2, v0

    move v0, v9

    .line 111
    :goto_3
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 123
    iget-object v3, p0, Lcrittercism/android/dj;->e:Lcrittercism/android/cy;

    if-eqz v3, :cond_0

    .line 124
    iget-object v3, p0, Lcrittercism/android/dj;->e:Lcrittercism/android/cy;

    invoke-interface {v3, v0, v2, v1}, Lcrittercism/android/cy;->a(ZILorg/json/JSONObject;)V

    goto :goto_0

    .line 95
    :cond_2
    :try_start_3
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4

    :goto_4
    move-object v1, v0

    move v0, v2

    move v2, v3

    .line 109
    goto :goto_3

    .line 100
    :catch_1
    move-exception v0

    move v2, v4

    .line 101
    :goto_5
    sget-object v3, Lcrittercism/android/dj;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SocketTimeoutException in proceed(): "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    .line 102
    const/4 v0, 0x1

    .line 109
    goto :goto_3

    .line 103
    :catch_2
    move-exception v0

    move-object v3, v0

    move v0, v4

    .line 104
    :goto_6
    sget-object v4, Lcrittercism/android/dj;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "IOException in proceed(): "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    .line 105
    invoke-static {}, Lcrittercism/android/dx;->c()V

    move v9, v2

    move v2, v0

    move v0, v9

    .line 109
    goto :goto_3

    .line 106
    :catch_3
    move-exception v0

    move-object v3, v0

    move v0, v4

    .line 107
    :goto_7
    sget-object v4, Lcrittercism/android/dj;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "JSONException in proceed(): "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    move v9, v2

    move v2, v0

    move v0, v9

    .line 108
    invoke-static {}, Lcrittercism/android/dx;->c()V

    goto :goto_3

    .line 106
    :catch_4
    move-exception v0

    move-object v9, v0

    move v0, v3

    move-object v3, v9

    goto :goto_7

    .line 103
    :catch_5
    move-exception v0

    move-object v9, v0

    move v0, v3

    move-object v3, v9

    goto :goto_6

    .line 100
    :catch_6
    move-exception v0

    move v2, v3

    goto :goto_5

    .line 97
    :catch_7
    move-exception v0

    move-object v3, v0

    move v0, v4

    goto/16 :goto_2

    .line 77
    :catch_8
    move-exception v0

    goto/16 :goto_0

    .line 74
    :catch_9
    move-exception v0

    goto/16 :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_4
.end method
