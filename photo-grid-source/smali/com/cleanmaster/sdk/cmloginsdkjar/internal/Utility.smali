.class public final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEFAULT_STREAM_BUFFER_SIZE:I = 0x2000

.field private static final HASH_ALGORITHM_MD5:Ljava/lang/String; = "MD5"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static closeQuietly(Ljava/io/Closeable;)V
    .locals 1

    .prologue
    .line 64
    if-eqz p0, :cond_0

    .line 65
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static disconnectQuietly(Ljava/net/URLConnection;)V
    .locals 1

    .prologue
    .line 73
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 74
    check-cast p0, Ljava/net/HttpURLConnection;

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 76
    :cond_0
    return-void
.end method

.method public static getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 81
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 83
    new-instance v1, Lorg/json/JSONTokener;

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v1}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    .line 87
    :goto_0
    if-eqz v1, :cond_1

    instance-of v0, v1, Lorg/json/JSONObject;

    if-nez v0, :cond_1

    instance-of v0, v1, Lorg/json/JSONArray;

    if-nez v0, :cond_1

    .line 88
    if-eqz p2, :cond_0

    .line 94
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 95
    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    :goto_1
    return-object v0

    .line 98
    :cond_0
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;

    const-string v1, "Got an unexpected non-JSON object."

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, v1

    .line 102
    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method

.method private static hashBytes(Ljava/security/MessageDigest;[B)Ljava/lang/String;
    .locals 6

    .prologue
    .line 52
    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 53
    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    array-length v3, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-byte v4, v1, v0

    .line 56
    shr-int/lit8 v5, v4, 0x4

    and-int/lit8 v5, v5, 0xf

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    shr-int/lit8 v4, v4, 0x0

    and-int/lit8 v4, v4, 0xf

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static hashWithAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static hashWithAlgorithm(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    :try_start_0
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 48
    invoke-static {v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->hashBytes(Ljava/security/MessageDigest;[B)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 46
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isNullOrEmpty(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 30
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static md5hash(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    const-string v0, "MD5"

    invoke-static {v0, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static readStreamToFile(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/Request;Ljava/io/InputStream;Ljava/io/File;)V
    .locals 10

    .prologue
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 129
    const-wide/16 v2, 0x0

    .line 131
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    const-string v1, "X-CM-Content-Length"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 132
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 133
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    move-wide v2, v0

    .line 137
    :cond_0
    invoke-virtual {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getCallback()Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    move-result-object v0

    instance-of v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnSaveProgressCallback;

    if-eqz v0, :cond_4

    .line 138
    invoke-virtual {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getCallback()Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnSaveProgressCallback;

    .line 142
    :goto_0
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-virtual {p3}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    invoke-direct {v6, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 144
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 147
    const/16 v4, 0x800

    :try_start_1
    new-array v7, v4, [B

    move v4, v5

    .line 150
    :cond_1
    :goto_1
    const/4 v5, 0x0

    const/16 v8, 0x800

    invoke-virtual {v1, v7, v5, v8}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v5

    const/4 v8, -0x1

    if-eq v5, v8, :cond_2

    .line 151
    invoke-virtual {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isCanceled()Z

    move-result v8

    if-nez v8, :cond_2

    .line 154
    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8, v5}, Ljava/io/FileOutputStream;->write([BII)V

    .line 155
    add-int/2addr v4, v5

    .line 156
    if-eqz v0, :cond_1

    .line 157
    int-to-long v8, v4

    invoke-interface {v0, v8, v9, v2, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$OnSaveProgressCallback;->onProgress(JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 165
    :catchall_0
    move-exception v0

    move-object v4, v1

    :goto_2
    invoke-static {v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 166
    invoke-static {v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    throw v0

    .line 161
    :cond_2
    :try_start_2
    invoke-virtual {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    invoke-virtual {p3}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    :cond_3
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 166
    invoke-static {v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 167
    return-void

    .line 165
    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_4
    move-object v0, v4

    goto :goto_0
.end method

.method public static readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 107
    .line 110
    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 111
    :try_start_1
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 112
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    const/16 v2, 0x800

    new-array v2, v2, [C

    .line 117
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStreamReader;->read([C)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    .line 118
    const/4 v5, 0x0

    invoke-virtual {v0, v2, v5, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_1
    invoke-static {v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 124
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    throw v0

    .line 121
    :cond_0
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 123
    invoke-static {v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 124
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    return-object v0

    .line 123
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_1
.end method
