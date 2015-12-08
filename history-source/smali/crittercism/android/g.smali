.class public final Lcrittercism/android/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcrittercism/android/f;
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/util/List;

.field private b:Ljava/net/URL;

.field private c:J

.field private d:Landroid/os/ConditionVariable;

.field private e:Lcrittercism/android/au;

.field private f:Landroid/os/ConditionVariable;

.field private volatile g:Z

.field private final h:Ljava/lang/Object;

.field private i:I

.field private volatile j:J


# direct methods
.method public constructor <init>(Lcrittercism/android/au;Ljava/net/URL;)V
    .locals 1

    .prologue
    .line 106
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcrittercism/android/g;-><init>(Lcrittercism/android/au;Ljava/net/URL;B)V

    .line 107
    return-void
.end method

.method private constructor <init>(Lcrittercism/android/au;Ljava/net/URL;B)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x2710

    const/16 v3, 0x32

    const/4 v2, 0x0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcrittercism/android/g;->a:Ljava/util/List;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/g;->b:Ljava/net/URL;

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/g;->c:J

    .line 73
    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0, v2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object v0, p0, Lcrittercism/android/g;->d:Landroid/os/ConditionVariable;

    .line 85
    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0, v2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object v0, p0, Lcrittercism/android/g;->f:Landroid/os/ConditionVariable;

    .line 92
    iput-boolean v2, p0, Lcrittercism/android/g;->g:Z

    .line 97
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcrittercism/android/g;->h:Ljava/lang/Object;

    .line 100
    iput v3, p0, Lcrittercism/android/g;->i:I

    .line 103
    iput-wide v4, p0, Lcrittercism/android/g;->j:J

    .line 121
    iput-object p1, p0, Lcrittercism/android/g;->e:Lcrittercism/android/au;

    .line 122
    iput-object p2, p0, Lcrittercism/android/g;->b:Ljava/net/URL;

    .line 123
    iput v3, p0, Lcrittercism/android/g;->i:I

    .line 124
    iput-wide v4, p0, Lcrittercism/android/g;->j:J

    .line 125
    return-void
.end method

.method private static a(Ljava/net/HttpURLConnection;Lorg/json/JSONObject;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 318
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 322
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF8"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 323
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    .line 324
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    const/16 v2, 0xca

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    .line 330
    :catch_0
    move-exception v1

    goto :goto_0

    .line 327
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method private b()J
    .locals 8

    .prologue
    const-wide/16 v0, 0x0

    .line 241
    iget-wide v2, p0, Lcrittercism/android/g;->j:J

    .line 242
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcrittercism/android/g;->c:J

    sub-long/2addr v4, v6

    .line 244
    cmp-long v6, v4, v0

    if-lez v6, :cond_0

    .line 247
    sub-long/2addr v2, v4

    .line 249
    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    .line 254
    :goto_0
    iget-wide v2, p0, Lcrittercism/android/g;->j:J

    .line 257
    return-wide v0

    :cond_0
    move-wide v0, v2

    goto :goto_0
.end method

.method private c()Ljava/net/HttpURLConnection;
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 271
    .line 274
    :try_start_0
    iget-object v1, p0, Lcrittercism/android/g;->b:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 275
    const/16 v2, 0x9c4

    :try_start_1
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 276
    const-string v2, "User-Agent"

    const-string v4, "5.0.4"

    invoke-virtual {v1, v2, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string v2, "Content-Type"

    const-string v4, "application/json"

    invoke-virtual {v1, v2, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 279
    const-string v2, "POST"

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 292
    instance-of v2, v1, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v2, :cond_0

    .line 293
    move-object v0, v1

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v2, v0

    .line 294
    const-string v4, "TLS"

    invoke-static {v4}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v4

    .line 295
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v6, v7}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 296
    invoke-virtual {v4}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 307
    :cond_0
    :goto_0
    return-object v1

    .line 298
    :catch_0
    move-exception v1

    move-object v2, v1

    move-object v1, v3

    .line 299
    :goto_1
    const-string v3, "Crittercism"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to instantiate URLConnection to APM server: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 301
    :catch_1
    move-exception v1

    .line 302
    const-string v2, "Crittercism"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to instantiate URLConnection to APM server: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v3

    .line 303
    goto :goto_0

    .line 298
    :catch_2
    move-exception v2

    goto :goto_1
.end method

.method private d()Z
    .locals 2

    .prologue
    .line 339
    iget-boolean v0, p0, Lcrittercism/android/g;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcrittercism/android/g;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcrittercism/android/g;->i:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcrittercism/android/g;->f:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 208
    return-void
.end method

.method public final a(ILjava/util/concurrent/TimeUnit;)V
    .locals 2

    .prologue
    .line 443
    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/g;->j:J

    .line 444
    return-void
.end method

.method public final a(Lcrittercism/android/c;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 347
    invoke-direct {p0}, Lcrittercism/android/g;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 364
    :goto_0
    return-void

    .line 352
    :cond_0
    iget-object v1, p0, Lcrittercism/android/g;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 353
    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/g;->d()Z

    move-result v2

    if-nez v2, :cond_1

    .line 356
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 364
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 359
    :cond_1
    :try_start_1
    iget-object v2, p0, Lcrittercism/android/g;->a:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 361
    iget-object v2, p0, Lcrittercism/android/g;->b:Ljava/net/URL;

    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcrittercism/android/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 362
    iget-object v0, p0, Lcrittercism/android/g;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 364
    :cond_3
    monitor-exit v1

    goto :goto_0

    .line 361
    :cond_4
    iget-object v2, p1, Lcrittercism/android/c;->f:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "connect"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-nez v2, :cond_2

    :cond_5
    const/4 v0, 0x1

    goto :goto_1
.end method

.method public final run()V
    .locals 4

    .prologue
    .line 139
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcrittercism/android/g;->g:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcrittercism/android/g;->f:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    iget-object v0, p0, Lcrittercism/android/g;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    iget-boolean v0, p0, Lcrittercism/android/g;->g:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    :try_start_1
    invoke-direct {p0}, Lcrittercism/android/g;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcrittercism/android/g;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :goto_1
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/g;->c:J

    invoke-direct {p0}, Lcrittercism/android/g;->c()Ljava/net/HttpURLConnection;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcrittercism/android/g;->g:Z

    const-string v0, "Crittercism"

    const-string v1, "Disabling APM due to failure instantiating connection"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    :cond_1
    :goto_2
    return-void

    .line 139
    :cond_2
    iget-object v1, p0, Lcrittercism/android/g;->h:Ljava/lang/Object;

    monitor-enter v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iget-object v2, p0, Lcrittercism/android/g;->a:Ljava/util/List;

    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    iput-object v3, p0, Lcrittercism/android/g;->a:Ljava/util/List;

    iget-object v3, p0, Lcrittercism/android/g;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v3}, Landroid/os/ConditionVariable;->close()V

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v1, p0, Lcrittercism/android/g;->e:Lcrittercism/android/au;

    invoke-static {v1, v2}, Lcrittercism/android/a;->a(Lcrittercism/android/au;Ljava/util/List;)Lcrittercism/android/a;

    move-result-object v1

    if-nez v1, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcrittercism/android/g;->g:Z

    const-string v0, "Crittercism"

    const-string v1, "Disabling APM due to failure building request"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    .line 140
    :catch_0
    move-exception v0

    .line 144
    const-string v1, "Crittercism"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exited APM send task due to: \n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 139
    :catchall_0
    move-exception v0

    :try_start_5
    monitor-exit v1

    throw v0

    :cond_3
    iget-object v1, v1, Lcrittercism/android/a;->a:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lcrittercism/android/g;->a(Ljava/net/HttpURLConnection;Lorg/json/JSONObject;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
