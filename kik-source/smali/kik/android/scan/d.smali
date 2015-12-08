.class public final Lkik/android/scan/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkik/a/j/n;

.field private final b:Lkik/a/f/k;

.field private final c:Lkik/a/e/f;

.field private final d:Lkik/a/e/r;

.field private final e:Lcom/kik/g/f;

.field private f:Lcom/kik/g/p;

.field private g:Ljava/security/SecureRandom;

.field private h:Lcom/kik/g/k;

.field private i:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lkik/a/j/n;Lkik/a/f/k;Lcom/kik/g/p;Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/r;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/scan/d;->e:Lcom/kik/g/f;

    .line 67
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lkik/android/scan/d;->g:Ljava/security/SecureRandom;

    .line 69
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/scan/d;->h:Lcom/kik/g/k;

    .line 70
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move v3, v2

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    iput-object v1, p0, Lkik/android/scan/d;->i:Ljava/util/concurrent/ExecutorService;

    .line 74
    iput-object p1, p0, Lkik/android/scan/d;->a:Lkik/a/j/n;

    .line 75
    iput-object p2, p0, Lkik/android/scan/d;->b:Lkik/a/f/k;

    .line 76
    iput-object p4, p0, Lkik/android/scan/d;->c:Lkik/a/e/f;

    .line 77
    iput-object p6, p0, Lkik/android/scan/d;->d:Lkik/a/e/r;

    .line 78
    new-instance v0, Lkik/android/scan/e;

    invoke-direct {v0, p0}, Lkik/android/scan/e;-><init>(Lkik/android/scan/d;)V

    invoke-virtual {p3, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 86
    if-eqz p5, :cond_0

    .line 87
    iget-object v0, p0, Lkik/android/scan/d;->e:Lcom/kik/g/f;

    new-instance v1, Lkik/android/scan/f;

    invoke-direct {v1, p0}, Lkik/android/scan/f;-><init>(Lkik/android/scan/d;)V

    invoke-virtual {v0, p5, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 96
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/scan/d;[B)I
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lkik/android/scan/d;->a([B)I

    move-result v0

    return v0
.end method

.method private a([B)I
    .locals 6

    .prologue
    const/16 v5, 0x80

    const/4 v0, 0x0

    .line 218
    if-eqz p1, :cond_0

    array-length v1, p1

    const/16 v2, 0x100

    if-ge v1, v2, :cond_1

    .line 219
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "incorrect seed format"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 247
    :goto_0
    return v0

    .line 223
    :cond_1
    const/4 v1, 0x1

    new-array v1, v1, [B

    .line 224
    new-array v2, v5, [B

    .line 225
    const/16 v3, 0x81

    new-array v3, v3, [B

    .line 227
    iget-object v4, p0, Lkik/android/scan/d;->g:Ljava/security/SecureRandom;

    invoke-virtual {v4, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 229
    invoke-static {p1, v0, v2, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 231
    invoke-static {p1, v5, v3, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 232
    aget-byte v4, v1, v0

    aput-byte v4, v3, v5

    .line 234
    :try_start_0
    invoke-static {v2, v3}, Lkik/a/h/h;->c([B[B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 243
    aget-byte v2, v2, v0

    and-int/lit16 v2, v2, 0xff

    .line 244
    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    .line 245
    shl-int/lit8 v1, v2, 0x8

    or-int/2addr v0, v1

    .line 247
    goto :goto_0

    .line 239
    :catch_0
    move-exception v0

    .line 240
    :goto_1
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 239
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method static synthetic a(Lcom/kik/scan/RemoteKikCode;Lorg/json/JSONObject;)Lkik/android/scan/a/b;
    .locals 1

    .prologue
    .line 58
    invoke-static {p0, p1}, Lkik/android/scan/d;->b(Lcom/kik/scan/RemoteKikCode;Lorg/json/JSONObject;)Lkik/android/scan/a/b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Ljava/net/HttpURLConnection;)Lorg/apache/http/HttpEntity;
    .locals 1

    .prologue
    .line 58
    invoke-static {p0}, Lkik/android/scan/d;->b(Ljava/net/HttpURLConnection;)Lorg/apache/http/HttpEntity;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/scan/d;)V
    .locals 3

    .prologue
    .line 58
    iget-object v0, p0, Lkik/android/scan/d;->a:Lkik/a/j/n;

    const-string v1, "scanning_nonce_secret"

    const-class v2, Lcom/kik/n/a/i/a;

    invoke-interface {v0, v1, v2}, Lkik/a/j/n;->d(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/scan/g;

    invoke-direct {v1, p0}, Lkik/android/scan/g;-><init>(Lkik/android/scan/d;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method static synthetic a(Lkik/android/scan/d;Lkik/a/d/s;)V
    .locals 3

    .prologue
    .line 58
    if-eqz p1, :cond_0

    const-class v0, Lkik/a/d/a/k;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/k;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/scan/d;->f:Lcom/kik/g/p;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/scan/d;->f:Lcom/kik/g/p;

    invoke-virtual {v1}, Lcom/kik/g/p;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/scan/d;->f:Lcom/kik/g/p;

    invoke-virtual {v1}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0}, Lkik/a/d/a/k;->a()I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/scan/d;->h:Lcom/kik/g/k;

    invoke-virtual {v0}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    iget-object v1, p0, Lkik/android/scan/d;->d:Lkik/a/e/r;

    invoke-interface {v1, v0}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    :cond_0
    return-void
.end method

.method private static b(Lcom/kik/scan/RemoteKikCode;Lorg/json/JSONObject;)Lkik/android/scan/a/b;
    .locals 6

    .prologue
    .line 375
    const/4 v1, 0x0

    .line 377
    :try_start_0
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 378
    const-string v2, "payload"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 379
    if-eqz v2, :cond_0

    .line 380
    const-string v3, "username"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 381
    const-string v4, "data"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 382
    const-string v5, "nonce"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 383
    const-string v5, "username"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 384
    new-instance v0, Lkik/android/scan/a/a;

    invoke-direct {v0, p0, v4, v2, v3}, Lkik/android/scan/a/a;-><init>(Lcom/kik/scan/RemoteKikCode;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    :goto_0
    return-object v0

    .line 388
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method private static b(Ljava/net/HttpURLConnection;)Lorg/apache/http/HttpEntity;
    .locals 4

    .prologue
    .line 414
    new-instance v1, Lorg/apache/http/entity/BasicHttpEntity;

    invoke-direct {v1}, Lorg/apache/http/entity/BasicHttpEntity;-><init>()V

    .line 417
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 422
    :goto_0
    invoke-virtual {v1, v0}, Lorg/apache/http/entity/BasicHttpEntity;->setContent(Ljava/io/InputStream;)V

    .line 423
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Lorg/apache/http/entity/BasicHttpEntity;->setContentLength(J)V

    .line 424
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/http/entity/BasicHttpEntity;->setContentEncoding(Ljava/lang/String;)V

    .line 425
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/http/entity/BasicHttpEntity;->setContentType(Ljava/lang/String;)V

    .line 426
    return-object v1

    .line 420
    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic b(Lkik/a/d/aa;I)Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 58
    invoke-static {p0, p1}, Lkik/android/scan/d;->c(Lkik/a/d/aa;I)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lkik/android/scan/d;)V
    .locals 4

    .prologue
    .line 58
    const/16 v0, 0x100

    new-array v0, v0, [B

    iget-object v1, p0, Lkik/android/scan/d;->g:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v1, Lcom/kik/n/a/i/a;

    invoke-direct {v1}, Lcom/kik/n/a/i/a;-><init>()V

    invoke-static {v0}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/n/a/i/a;->a(Lcom/b/a/b;)Lcom/kik/n/a/i/a;

    iget-object v0, p0, Lkik/android/scan/d;->a:Lkik/a/j/n;

    const-string v2, "scanning_nonce_secret"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, v1}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    return-void
.end method

.method private static c(Lkik/a/d/aa;I)Lorg/json/JSONObject;
    .locals 5

    .prologue
    .line 397
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 398
    if-eqz p0, :cond_0

    iget-object v1, p0, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 409
    :cond_0
    :goto_0
    return-object v0

    .line 403
    :cond_1
    :try_start_0
    const-string v1, "type"

    const-string v2, "username"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 404
    const-string v1, "payload"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "username"

    iget-object v4, p0, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "nonce"

    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 406
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->f(Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/kik/scan/RemoteKikCode;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 325
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 326
    iget-object v1, p0, Lkik/android/scan/d;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/android/scan/j;

    invoke-direct {v2, p0, p1, v0}, Lkik/android/scan/j;-><init>(Lkik/android/scan/d;Lcom/kik/scan/RemoteKikCode;Lcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 370
    return-object v0
.end method

.method public final a(Lkik/a/d/aa;I)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 252
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 253
    iget-object v1, p0, Lkik/android/scan/d;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lkik/android/scan/i;

    invoke-direct {v2, p0, p1, p2, v0}, Lkik/android/scan/i;-><init>(Lkik/android/scan/d;Lkik/a/d/aa;ILcom/kik/g/p;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 304
    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/scan/d;->f:Lcom/kik/g/p;

    .line 162
    return-void
.end method

.method public final a(Lkik/android/scan/a/c;Lkik/a/d/k;)V
    .locals 6

    .prologue
    .line 309
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 313
    :cond_0
    :goto_0
    return-void

    .line 312
    :cond_1
    iget-object v1, p0, Lkik/android/scan/d;->c:Lkik/a/e/f;

    if-eqz p2, :cond_2

    if-nez p1, :cond_3

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    goto :goto_0

    :cond_3
    new-instance v0, Lkik/a/f/f/al;

    invoke-virtual {p1}, Lkik/android/scan/a/c;->a()[B

    move-result-object v2

    invoke-virtual {p1}, Lkik/android/scan/a/c;->c()I

    move-result v3

    invoke-virtual {p1}, Lkik/android/scan/a/c;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v5

    invoke-direct {v0, v2, v3, v4, v5}, Lkik/a/f/f/al;-><init>([BILjava/lang/String;Lkik/a/d/j;)V

    goto :goto_1
.end method

.method public final b()Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 166
    iget-object v0, p0, Lkik/android/scan/d;->a:Lkik/a/j/n;

    const-string v1, "scanning_nonce_secret"

    const-class v2, Lcom/kik/n/a/i/a;

    invoke-interface {v0, v1, v2}, Lkik/a/j/n;->d(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/scan/h;

    invoke-direct {v1, p0}, Lkik/android/scan/h;-><init>(Lkik/android/scan/d;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    .line 179
    iput-object v0, p0, Lkik/android/scan/d;->f:Lcom/kik/g/p;

    .line 181
    return-object v0
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lkik/android/scan/d;->h:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method
