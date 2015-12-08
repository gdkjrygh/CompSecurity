.class public abstract Ltwitter4j/internal/http/HttpResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final logger:Ltwitter4j/internal/logging/Logger;


# instance fields
.field protected final CONF:Ltwitter4j/internal/http/HttpClientConfiguration;

.field protected is:Ljava/io/InputStream;

.field private json:Ltwitter4j/internal/org/json/JSONObject;

.field private jsonArray:Ltwitter4j/internal/org/json/JSONArray;

.field protected responseAsString:Ljava/lang/String;

.field protected statusCode:I

.field private streamConsumed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Ltwitter4j/internal/http/HttpResponseImpl;

    invoke-static {v0}, Ltwitter4j/internal/logging/Logger;->getLogger(Ljava/lang/Class;)Ltwitter4j/internal/logging/Logger;

    move-result-object v0

    sput-object v0, Ltwitter4j/internal/http/HttpResponse;->logger:Ltwitter4j/internal/logging/Logger;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Ltwitter4j/internal/http/HttpResponse;->streamConsumed:Z

    .line 126
    iput-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;

    .line 170
    iput-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;

    .line 41
    invoke-static {}, Ltwitter4j/conf/ConfigurationContext;->getInstance()Ltwitter4j/conf/Configuration;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->CONF:Ltwitter4j/internal/http/HttpClientConfiguration;

    .line 42
    return-void
.end method

.method public constructor <init>(Ltwitter4j/internal/http/HttpClientConfiguration;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Ltwitter4j/internal/http/HttpResponse;->streamConsumed:Z

    .line 126
    iput-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;

    .line 170
    iput-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;

    .line 45
    iput-object p1, p0, Ltwitter4j/internal/http/HttpResponse;->CONF:Ltwitter4j/internal/http/HttpClientConfiguration;

    .line 46
    return-void
.end method

.method private disconnectForcibly()V
    .locals 1

    .prologue
    .line 224
    :try_start_0
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public asJSONArray()Ltwitter4j/internal/org/json/JSONArray;
    .locals 5

    .prologue
    .line 180
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;

    if-nez v0, :cond_1

    .line 181
    const/4 v1, 0x0

    .line 183
    :try_start_0
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 184
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asReader()Ljava/io/Reader;

    move-result-object v1

    .line 185
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    new-instance v2, Ltwitter4j/internal/org/json/JSONTokener;

    invoke-direct {v2, v1}, Ltwitter4j/internal/org/json/JSONTokener;-><init>(Ljava/io/Reader;)V

    invoke-direct {v0, v2}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ltwitter4j/internal/org/json/JSONTokener;)V

    iput-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;

    .line 189
    :goto_0
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->CONF:Ltwitter4j/internal/http/HttpClientConfiguration;

    invoke-interface {v0}, Ltwitter4j/internal/http/HttpClientConfiguration;->isPrettyDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 190
    sget-object v0, Ltwitter4j/internal/http/HttpResponse;->logger:Ltwitter4j/internal/logging/Logger;

    iget-object v2, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ltwitter4j/internal/org/json/JSONArray;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :goto_1
    if-eqz v1, :cond_0

    .line 204
    :try_start_1
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 208
    :cond_0
    :goto_2
    invoke-direct {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnectForcibly()V

    .line 211
    :cond_1
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;

    return-object v0

    .line 187
    :cond_2
    :try_start_2
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    iget-object v2, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    invoke-direct {v0, v2}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;
    :try_end_2
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 195
    :catch_0
    move-exception v0

    .line 196
    :try_start_3
    sget-object v2, Ltwitter4j/internal/http/HttpResponse;->logger:Ltwitter4j/internal/logging/Logger;

    invoke-virtual {v2}, Ltwitter4j/internal/logging/Logger;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 197
    new-instance v2, Ltwitter4j/TwitterException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 202
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_3

    .line 204
    :try_start_4
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 208
    :cond_3
    :goto_3
    invoke-direct {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnectForcibly()V

    throw v0

    .line 192
    :cond_4
    :try_start_5
    sget-object v2, Ltwitter4j/internal/http/HttpResponse;->logger:Ltwitter4j/internal/logging/Logger;

    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    :goto_4
    invoke-virtual {v2, v0}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->jsonArray:Ltwitter4j/internal/org/json/JSONArray;

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_5
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v0

    goto :goto_4

    .line 199
    :cond_6
    :try_start_6
    new-instance v2, Ltwitter4j/TwitterException;

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_3
.end method

.method public asJSONObject()Ltwitter4j/internal/org/json/JSONObject;
    .locals 5

    .prologue
    .line 136
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;

    if-nez v0, :cond_1

    .line 137
    const/4 v1, 0x0

    .line 139
    :try_start_0
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 140
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asReader()Ljava/io/Reader;

    move-result-object v1

    .line 141
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    new-instance v2, Ltwitter4j/internal/org/json/JSONTokener;

    invoke-direct {v2, v1}, Ltwitter4j/internal/org/json/JSONTokener;-><init>(Ljava/io/Reader;)V

    invoke-direct {v0, v2}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ltwitter4j/internal/org/json/JSONTokener;)V

    iput-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;

    .line 145
    :goto_0
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->CONF:Ltwitter4j/internal/http/HttpClientConfiguration;

    invoke-interface {v0}, Ltwitter4j/internal/http/HttpClientConfiguration;->isPrettyDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 146
    sget-object v0, Ltwitter4j/internal/http/HttpResponse;->logger:Ltwitter4j/internal/logging/Logger;

    iget-object v2, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ltwitter4j/internal/org/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    :goto_1
    if-eqz v1, :cond_0

    .line 160
    :try_start_1
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 164
    :cond_0
    :goto_2
    invoke-direct {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnectForcibly()V

    .line 167
    :cond_1
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;

    return-object v0

    .line 143
    :cond_2
    :try_start_2
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    iget-object v2, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    invoke-direct {v0, v2}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;
    :try_end_2
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 151
    :catch_0
    move-exception v0

    .line 152
    :try_start_3
    iget-object v2, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    if-nez v2, :cond_6

    .line 153
    new-instance v2, Ltwitter4j/TwitterException;

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 158
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_3

    .line 160
    :try_start_4
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 164
    :cond_3
    :goto_3
    invoke-direct {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnectForcibly()V

    throw v0

    .line 148
    :cond_4
    :try_start_5
    sget-object v2, Ltwitter4j/internal/http/HttpResponse;->logger:Ltwitter4j/internal/logging/Logger;

    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    :goto_4
    invoke-virtual {v2, v0}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->json:Ltwitter4j/internal/org/json/JSONObject;

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_5
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v0

    goto :goto_4

    .line 155
    :cond_6
    :try_start_6
    new-instance v2, Ltwitter4j/TwitterException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_3
.end method

.method public asReader()Ljava/io/Reader;
    .locals 4

    .prologue
    .line 216
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    iget-object v2, p0, Ltwitter4j/internal/http/HttpResponse;->is:Ljava/io/InputStream;

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->is:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    goto :goto_0
.end method

.method public asStream()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 73
    iget-boolean v0, p0, Ltwitter4j/internal/http/HttpResponse;->streamConsumed:Z

    if-eqz v0, :cond_0

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stream has already been consumed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_0
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->is:Ljava/io/InputStream;

    return-object v0
.end method

.method public asString()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 87
    iget-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 91
    :try_start_0
    invoke-virtual {p0}, Ltwitter4j/internal/http/HttpResponse;->asStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v2

    .line 92
    if-nez v2, :cond_1

    .line 108
    if-eqz v2, :cond_0

    .line 110
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 120
    :cond_0
    :goto_0
    invoke-direct {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnectForcibly()V

    .line 123
    :goto_1
    return-object v0

    .line 95
    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    const-string v4, "UTF-8"

    invoke-direct {v3, v2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 96
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    :goto_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 99
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_2

    .line 105
    :catch_0
    move-exception v0

    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    .line 106
    :goto_3
    :try_start_4
    new-instance v3, Ltwitter4j/TwitterException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 108
    :catchall_0
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v2, v5

    :goto_4
    if-eqz v2, :cond_2

    .line 110
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 114
    :cond_2
    :goto_5
    if-eqz v1, :cond_3

    .line 116
    :try_start_6
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 120
    :cond_3
    :goto_6
    invoke-direct {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnectForcibly()V

    throw v0

    .line 101
    :cond_4
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    .line 102
    sget-object v0, Ltwitter4j/internal/http/HttpResponse;->logger:Ltwitter4j/internal/logging/Logger;

    iget-object v3, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltwitter4j/internal/http/HttpResponse;->streamConsumed:Z
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 108
    if-eqz v2, :cond_5

    .line 110
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 116
    :cond_5
    :goto_7
    :try_start_9
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 120
    :goto_8
    invoke-direct {p0}, Ltwitter4j/internal/http/HttpResponse;->disconnectForcibly()V

    .line 123
    :cond_6
    iget-object v0, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v0

    goto :goto_8

    :catch_4
    move-exception v2

    goto :goto_5

    :catch_5
    move-exception v1

    goto :goto_6

    .line 108
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_4

    :catchall_2
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_4

    .line 105
    :catch_6
    move-exception v1

    move-object v2, v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_3

    :catch_7
    move-exception v1

    move-object v5, v1

    move-object v1, v2

    move-object v2, v0

    move-object v0, v5

    goto :goto_3
.end method

.method public abstract disconnect()V
.end method

.method public abstract getResponseHeader(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getResponseHeaderFields()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public getStatusCode()I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Ltwitter4j/internal/http/HttpResponse;->statusCode:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpResponse{statusCode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ltwitter4j/internal/http/HttpResponse;->statusCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", responseAsString=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->responseAsString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", is="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/internal/http/HttpResponse;->is:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", streamConsumed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/internal/http/HttpResponse;->streamConsumed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
