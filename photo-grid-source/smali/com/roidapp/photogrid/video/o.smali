.class public final Lcom/roidapp/photogrid/video/o;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Lcom/roidapp/photogrid/video/m;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/roidapp/photogrid/video/p;

.field private b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 32
    iput p1, p0, Lcom/roidapp/photogrid/video/o;->b:I

    .line 33
    return-void
.end method

.method private varargs a([Lcom/roidapp/photogrid/video/m;)Ljava/lang/Boolean;
    .locals 11

    .prologue
    const/4 v0, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 54
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 55
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/o;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 56
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 154
    :cond_0
    :goto_0
    return-object v3

    .line 58
    :cond_1
    if-eqz p1, :cond_2

    array-length v1, p1

    if-gtz v1, :cond_3

    .line 59
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_0

    :cond_3
    move v1, v2

    move-object v3, v0

    .line 61
    :goto_1
    array-length v0, p1

    if-ge v1, v0, :cond_0

    .line 62
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/o;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 63
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_0

    .line 65
    :cond_4
    aget-object v0, p1, v1

    if-eqz v0, :cond_c

    aget-object v0, p1, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    if-eqz v0, :cond_c

    aget-object v0, p1, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_c

    .line 68
    const/4 v7, 0x0

    .line 69
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6}, Ljava/lang/String;-><init>()V

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "doInBackground url["

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "]"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v5, p1, v1

    iget-object v5, v5, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    :try_start_0
    aget-object v0, p1, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "http"

    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 75
    new-instance v0, Ljava/net/URL;

    aget-object v5, p1, v1

    iget-object v5, v5, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 76
    new-instance v0, Ljava/net/URL;

    aget-object v5, p1, v1

    iget-object v5, v5, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    const/16 v5, 0x3a98

    :try_start_1
    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 78
    const/16 v5, 0x3a98

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 79
    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 80
    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 81
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 82
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    .line 84
    const/16 v8, 0x190

    if-ne v5, v8, :cond_5

    .line 85
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    .line 87
    :try_start_2
    new-instance v0, Ljava/net/URL;

    aget-object v5, p1, v1

    iget-object v5, v5, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 88
    const/16 v5, 0x3a98

    :try_start_3
    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 89
    const/16 v5, 0x3a98

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 90
    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 91
    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 92
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    :cond_5
    move-object v5, v0

    .line 94
    :try_start_4
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    move-result-object v0

    move-object v7, v5

    .line 116
    :goto_2
    if-nez v0, :cond_9

    .line 117
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto/16 :goto_0

    .line 98
    :cond_6
    :try_start_5
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v5, Ljava/io/File;

    aget-object v8, p1, v1

    iget-object v8, v8, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-direct {v5, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-object v7, v4

    .line 115
    goto :goto_2

    .line 101
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v4

    :goto_3
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 104
    if-eqz v0, :cond_7

    .line 105
    :try_start_6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 107
    :cond_7
    if-eqz v4, :cond_8

    .line 108
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    :cond_8
    move-object v0, v4

    :goto_4
    move-object v7, v0

    move-object v0, v4

    .line 114
    goto :goto_2

    .line 112
    :catch_1
    move-exception v5

    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 118
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/o;->isCancelled()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 119
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto/16 :goto_0

    .line 121
    :cond_a
    new-instance v8, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v8, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    :goto_5
    :try_start_7
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/o;->isCancelled()Z

    move-result v9

    if-nez v9, :cond_d

    .line 126
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v9, "\n"

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_5

    .line 133
    :catch_2
    move-exception v0

    :try_start_8
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 134
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-result-object v3

    .line 137
    if-eqz v7, :cond_b

    .line 138
    :try_start_9
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 142
    :cond_b
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    move-object v0, v6

    .line 149
    :goto_6
    if-eqz v0, :cond_c

    iget-object v5, p0, Lcom/roidapp/photogrid/video/o;->a:Lcom/roidapp/photogrid/video/p;

    if-eqz v5, :cond_c

    .line 151
    iget-object v5, p0, Lcom/roidapp/photogrid/video/o;->a:Lcom/roidapp/photogrid/video/p;

    aget-object v6, p1, v1

    iget v6, v6, Lcom/roidapp/photogrid/video/m;->a:I

    invoke-interface {v5, v6, v0}, Lcom/roidapp/photogrid/video/p;->a(ILjava/lang/String;)V

    .line 61
    :cond_c
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_1

    .line 128
    :cond_d
    :try_start_a
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/o;->isCancelled()Z

    move-result v5

    if-nez v5, :cond_10

    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result-object v5

    .line 137
    :goto_7
    if-eqz v7, :cond_e

    .line 138
    :try_start_b
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 142
    :cond_e
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    move-object v0, v5

    .line 147
    goto :goto_6

    .line 146
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v5

    .line 148
    goto :goto_6

    .line 146
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v6

    .line 148
    goto :goto_6

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    if-eqz v7, :cond_f

    .line 138
    :try_start_c
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 142
    :cond_f
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5

    .line 147
    :goto_8
    throw v0

    .line 146
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_8

    .line 101
    :catch_6
    move-exception v5

    goto/16 :goto_3

    :catch_7
    move-exception v0

    move-object v10, v0

    move-object v0, v5

    move-object v5, v10

    goto/16 :goto_3

    :cond_10
    move-object v5, v6

    goto :goto_7
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/video/p;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/roidapp/photogrid/video/o;->a:Lcom/roidapp/photogrid/video/p;

    .line 37
    return-void
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    check-cast p1, [Lcom/roidapp/photogrid/video/m;

    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/o;->a([Lcom/roidapp/photogrid/video/m;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 1159
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onPostExecute(Ljava/lang/Object;)V

    .line 1160
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/o;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/o;->a:Lcom/roidapp/photogrid/video/p;

    if-eqz v0, :cond_0

    .line 1161
    iget-object v0, p0, Lcom/roidapp/photogrid/video/o;->a:Lcom/roidapp/photogrid/video/p;

    iget v1, p0, Lcom/roidapp/photogrid/video/o;->b:I

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/video/p;->a(IZ)V

    .line 21
    :cond_0
    return-void
.end method

.method protected final onPreExecute()V
    .locals 2

    .prologue
    .line 41
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 42
    iget-object v0, p0, Lcom/roidapp/photogrid/video/o;->a:Lcom/roidapp/photogrid/video/p;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/roidapp/photogrid/video/o;->a:Lcom/roidapp/photogrid/video/p;

    iget v1, p0, Lcom/roidapp/photogrid/video/o;->b:I

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/video/p;->a(I)V

    .line 45
    :cond_0
    return-void
.end method
