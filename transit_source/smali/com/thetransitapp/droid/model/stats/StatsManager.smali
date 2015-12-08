.class public Lcom/thetransitapp/droid/model/stats/StatsManager;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "StatsManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lroboguice/inject/ContextSingleton;
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final connectivityManager:Landroid/net/ConnectivityManager;

.field private currentSession:Lcom/thetransitapp/droid/model/stats/Session;

.field private sessionsToSend:Lorg/json/JSONArray;

.field private statURL:Ljava/lang/String;
    .annotation runtime Lroboguice/inject/InjectResource;
        value = 0x7f0a0067
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/net/ConnectivityManager;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "connectivityManager"    # Landroid/net/ConnectivityManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;)V

    .line 60
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->activity:Landroid/app/Activity;

    .line 61
    iput-object p2, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->connectivityManager:Landroid/net/ConnectivityManager;

    .line 62
    return-void
.end method

.method private decrypt([B[B)[B
    .locals 5
    .param p1, "key"    # [B
    .param p2, "data"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 248
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "AES"

    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 249
    .local v2, "skeySpec":Ljavax/crypto/spec/SecretKeySpec;
    const-string v3, "AES/CBC/PKCS5Padding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 250
    .local v0, "cipher":Ljavax/crypto/Cipher;
    const/16 v3, 0x10

    new-array v1, v3, [B

    .line 251
    .local v1, "iv":[B
    const/4 v3, 0x2

    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v4, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v3, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 253
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v3

    return-object v3
.end method

.method private decryptSessions(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 4
    .param p1, "data"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 224
    invoke-static {}, Lorg/OpenUDID/OpenUDID_manager;->getOpenUDID()Ljava/lang/String;

    move-result-object v1

    .line 226
    .local v1, "uuid":Ljava/lang/String;
    const/4 v2, 0x0

    const/16 v3, 0xa

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/thetransitapp/droid/model/stats/StatsManager;->getRawKey(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {p1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/thetransitapp/droid/model/stats/StatsManager;->decrypt([B[B)[B

    move-result-object v0

    .line 228
    .local v0, "decrypted":[B
    new-instance v2, Lorg/json/JSONArray;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    return-object v2
.end method

.method private encrypt([B[B)[B
    .locals 5
    .param p1, "key"    # [B
    .param p2, "data"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 239
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "AES"

    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 240
    .local v2, "skeySpec":Ljavax/crypto/spec/SecretKeySpec;
    const-string v3, "AES/CBC/PKCS5Padding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 241
    .local v0, "cipher":Ljavax/crypto/Cipher;
    const/16 v3, 0x10

    new-array v1, v3, [B

    .line 242
    .local v1, "iv":[B
    const/4 v3, 0x1

    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v4, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v3, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 244
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v3

    return-object v3
.end method

.method private getEncryptedSessions(Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 5
    .param p1, "sessions"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 215
    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    .line 216
    .local v0, "data":Ljava/lang/String;
    invoke-static {}, Lorg/OpenUDID/OpenUDID_manager;->getOpenUDID()Ljava/lang/String;

    move-result-object v2

    .line 218
    .local v2, "uuid":Ljava/lang/String;
    const/4 v3, 0x0

    const/16 v4, 0xa

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/thetransitapp/droid/model/stats/StatsManager;->getRawKey(Ljava/lang/String;)[B

    move-result-object v3

    const-string v4, "UTF-8"

    invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lcom/thetransitapp/droid/model/stats/StatsManager;->encrypt([B[B)[B

    move-result-object v1

    .line 220
    .local v1, "encrypted":[B
    const/4 v3, 0x2

    invoke-static {v1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method private static getRawKey(Ljava/lang/String;)[B
    .locals 2
    .param p0, "seed"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 232
    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 233
    .local v0, "digest":Ljava/security/MessageDigest;
    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 235
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    return-object v1
.end method

.method private readSessionsFromDisk()Lorg/json/JSONArray;
    .locals 6

    .prologue
    .line 134
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 137
    .local v3, "result":Lorg/json/JSONArray;
    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-direct {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->statsFilePath()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 138
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->statsFilePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 139
    .local v2, "fis":Ljava/io/FileInputStream;
    invoke-static {v2}, Lcom/thetransitapp/droid/util/ServiceUtility;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    .line 141
    .local v0, "data":Ljava/lang/String;
    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->decryptSessions(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 142
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    .end local v0    # "data":Ljava/lang/String;
    .end local v2    # "fis":Ljava/io/FileInputStream;
    :cond_0
    :goto_0
    return-object v3

    .line 144
    :catch_0
    move-exception v1

    .line 145
    .local v1, "e":Ljava/lang/Exception;
    const-class v4, Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 146
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private statsFilePath()Ljava/lang/String;
    .locals 2

    .prologue
    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/Sessions_Stats.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->call()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 163
    iget-object v7, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lez v7, :cond_2

    .line 164
    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    .line 165
    .local v1, "data":Lorg/json/JSONArray;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->clearSessions()V

    .line 167
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getOnlineSource()Lcom/thetransitapp/droid/data/BaseOnlineSource;

    move-result-object v7

    invoke-virtual {v7}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getUserAgent()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v0

    .line 169
    .local v0, "client":Landroid/net/http/AndroidHttpClient;
    new-instance v6, Lorg/apache/http/client/methods/HttpPost;

    iget-object v7, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->statURL:Ljava/lang/String;

    invoke-direct {v6, v7}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 170
    .local v6, "request":Lorg/apache/http/client/methods/HttpPost;
    const-string v7, "Authorization"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Basic "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getOnlineSource()Lcom/thetransitapp/droid/data/BaseOnlineSource;

    move-result-object v9

    invoke-virtual {v9}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getAuth()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    :try_start_0
    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->getEncryptedSessions(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v3

    .line 175
    .local v3, "encrypted":Ljava/lang/String;
    new-instance v5, Ljava/util/ArrayList;

    const/4 v7, 0x1

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    .local v5, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    new-instance v7, Lorg/apache/http/message/BasicNameValuePair;

    const-string v8, "encrypted_string"

    invoke-direct {v7, v8, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    new-instance v7, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v7, v5}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    invoke-virtual {v6, v7}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 179
    const-string v7, "Content-Type"

    const-string v8, "application/x-www-form-urlencoded"

    invoke-virtual {v6, v7, v8}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    invoke-static {v6}, Landroid/net/http/AndroidHttpClient;->modifyRequestToAcceptGzipResponse(Lorg/apache/http/HttpRequest;)V

    .line 182
    invoke-virtual {v0, v6}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v4

    .line 184
    .local v4, "httpResponse":Lorg/apache/http/HttpResponse;
    invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v7

    invoke-interface {v7}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v7

    const/16 v8, 0x12c

    if-lt v7, v8, :cond_3

    .line 185
    new-instance v7, Lorg/apache/http/HttpException;

    invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v8

    invoke-interface {v8}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/apache/http/HttpException;-><init>(Ljava/lang/String;)V

    throw v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    .end local v3    # "encrypted":Ljava/lang/String;
    .end local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v5    # "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :catch_0
    move-exception v2

    .line 192
    .local v2, "e":Ljava/lang/Exception;
    if-eqz v0, :cond_0

    .line 193
    :try_start_1
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 196
    :cond_0
    instance-of v7, v2, Lorg/apache/http/HttpException;

    if-nez v7, :cond_1

    instance-of v7, v2, Ljava/net/UnknownHostException;

    if-nez v7, :cond_1

    .line 197
    const-class v7, Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 198
    invoke-static {v2}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lez v7, :cond_2

    .line 202
    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->writeSessionsToDisk(Lorg/json/JSONArray;)V

    .line 207
    .end local v0    # "client":Landroid/net/http/AndroidHttpClient;
    .end local v1    # "data":Lorg/json/JSONArray;
    .end local v2    # "e":Ljava/lang/Exception;
    .end local v6    # "request":Lorg/apache/http/client/methods/HttpPost;
    :cond_2
    :goto_0
    const/4 v7, 0x0

    return-object v7

    .line 188
    .restart local v0    # "client":Landroid/net/http/AndroidHttpClient;
    .restart local v1    # "data":Lorg/json/JSONArray;
    .restart local v3    # "encrypted":Ljava/lang/String;
    .restart local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
    .restart local v5    # "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    .restart local v6    # "request":Lorg/apache/http/client/methods/HttpPost;
    :cond_3
    :try_start_2
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 189
    const/4 v1, 0x0

    .line 190
    const-string v7, "Stats"

    const-string v8, "Session sent to server"

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lez v7, :cond_2

    .line 202
    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->writeSessionsToDisk(Lorg/json/JSONArray;)V

    goto :goto_0

    .line 200
    .end local v3    # "encrypted":Ljava/lang/String;
    .end local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v5    # "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :catchall_0
    move-exception v7

    .line 201
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-lez v8, :cond_4

    .line 202
    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->writeSessionsToDisk(Lorg/json/JSONArray;)V

    .line 204
    :cond_4
    throw v7
.end method

.method public clearSessions()V
    .locals 2

    .prologue
    .line 153
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iput-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    .line 155
    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->statsFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 156
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 157
    return-void
.end method

.method public endSession()V
    .locals 3

    .prologue
    .line 78
    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    if-eqz v1, :cond_0

    .line 79
    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/stats/Session;->endSession()V

    .line 80
    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/stats/Session;->getJSONRepresentation()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 81
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    .line 83
    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 85
    .local v0, "netInfo":Landroid/net/NetworkInfo;
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 86
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->sendSessionsToServer()V

    .line 91
    .end local v0    # "netInfo":Landroid/net/NetworkInfo;
    :cond_0
    :goto_0
    return-void

    .line 88
    .restart local v0    # "netInfo":Landroid/net/NetworkInfo;
    :cond_1
    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->writeSessionsToDisk(Lorg/json/JSONArray;)V

    goto :goto_0
.end method

.method public recordLocationUpdate(Landroid/location/Location;)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 95
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/thetransitapp/droid/model/stats/Session;->addLocation(Landroid/location/Location;Z)V

    .line 97
    :cond_0
    return-void
.end method

.method public recordPlanRequest(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Date;Ljava/util/Date;)V
    .locals 1
    .param p1, "startCoor"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p2, "endCoor"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p3, "startTime"    # Ljava/util/Date;
    .param p4, "endTime"    # Ljava/util/Date;

    .prologue
    .line 100
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/thetransitapp/droid/model/stats/Session;->addPlanRequest(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Date;Ljava/util/Date;)V

    .line 103
    :cond_0
    return-void
.end method

.method public recordRouteHit(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V
    .locals 1
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .prologue
    .line 106
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/stats/Session;->hitRoute(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V

    .line 109
    :cond_0
    return-void
.end method

.method public sendSessionsToServer()V
    .locals 0

    .prologue
    .line 112
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->execute()V

    .line 113
    return-void
.end method

.method public startSessionWithLocation(Landroid/location/Location;Z)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "isSimulated"    # Z

    .prologue
    .line 65
    iget-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    if-nez v1, :cond_0

    .line 66
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->readSessionsFromDisk()Lorg/json/JSONArray;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->sessionsToSend:Lorg/json/JSONArray;

    .line 69
    :cond_0
    new-instance v0, Lcom/thetransitapp/droid/model/stats/Session;

    invoke-direct {v0}, Lcom/thetransitapp/droid/model/stats/Session;-><init>()V

    .line 70
    .local v0, "newSession":Lcom/thetransitapp/droid/model/stats/Session;
    if-eqz p1, :cond_1

    .line 71
    invoke-virtual {v0, p1, p2}, Lcom/thetransitapp/droid/model/stats/Session;->addLocation(Landroid/location/Location;Z)V

    .line 74
    :cond_1
    iput-object v0, p0, Lcom/thetransitapp/droid/model/stats/StatsManager;->currentSession:Lcom/thetransitapp/droid/model/stats/Session;

    .line 75
    return-void
.end method

.method public writeSessionsToDisk(Lorg/json/JSONArray;)V
    .locals 5
    .param p1, "sessions"    # Lorg/json/JSONArray;

    .prologue
    .line 116
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 118
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {p0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->statsFilePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 119
    .local v1, "fos":Ljava/io/FileOutputStream;
    new-instance v2, Ljava/io/OutputStreamWriter;

    const-string v3, "UTF-8"

    invoke-direct {v2, v1, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 120
    .local v2, "out":Ljava/io/Writer;
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/model/stats/StatsManager;->getEncryptedSessions(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v2}, Ljava/io/Writer;->flush()V

    .line 122
    invoke-virtual {v2}, Ljava/io/Writer;->close()V

    .line 123
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 125
    const-string v3, "Stats"

    const-string v4, "Saved session on disk"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .end local v1    # "fos":Ljava/io/FileOutputStream;
    .end local v2    # "out":Ljava/io/Writer;
    :cond_0
    :goto_0
    return-void

    .line 126
    :catch_0
    move-exception v0

    .line 127
    .local v0, "e":Ljava/lang/Exception;
    const-class v3, Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 128
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
