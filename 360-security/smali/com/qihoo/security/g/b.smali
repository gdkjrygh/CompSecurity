.class public Lcom/qihoo/security/g/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/g/b$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/io/File;

.field private e:Z

.field private f:[B

.field private g:I

.field private h:Lcom/qihoo/security/g/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    const-class v0, Lcom/qihoo/security/g/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/g/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[B)V
    .locals 1

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/g/b;->g:I

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/g/b;->h:Lcom/qihoo/security/g/b$a;

    .line 104
    iput-object p1, p0, Lcom/qihoo/security/g/b;->b:Landroid/content/Context;

    .line 105
    iput-object p2, p0, Lcom/qihoo/security/g/b;->c:Ljava/lang/String;

    .line 106
    iput-object p3, p0, Lcom/qihoo/security/g/b;->f:[B

    .line 107
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/g/b;->g:I

    .line 108
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/g/b;Ljava/lang/String;Ljava/io/File;)I
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/g/b;->a(Ljava/lang/String;Ljava/io/File;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/g/b;Ljava/lang/String;[B)I
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/g/b;->a(Ljava/lang/String;[B)I

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;Ljava/io/File;)I
    .locals 7

    .prologue
    const/16 v6, 0x4e20

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 208
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 213
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    .line 218
    :goto_0
    if-eqz v0, :cond_3

    .line 219
    new-instance v1, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 220
    invoke-static {p2}, Lcom/qihoo/security/g/b;->a(Ljava/io/File;)[B

    move-result-object v0

    .line 221
    if-nez v0, :cond_1

    .line 222
    const/4 v0, 0x3

    .line 265
    :goto_1
    return v0

    :cond_0
    move v0, v2

    .line 216
    goto :goto_0

    .line 225
    :cond_1
    new-instance v5, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v5, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 226
    const-string/jumbo v0, "application/x-www-form-urlencoded"

    invoke-virtual {v5, v0}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V

    move-object v0, v1

    .line 227
    check-cast v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-virtual {v0, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 232
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/g/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/g/b;->a(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v0

    .line 233
    if-eqz v0, :cond_2

    .line 234
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v5

    .line 235
    invoke-static {v5, v0}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 236
    invoke-virtual {v1, v5}, Lorg/apache/http/client/methods/HttpRequestBase;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 239
    :cond_2
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 240
    invoke-static {v0, v6}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 241
    invoke-static {v0, v6}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 242
    invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpRequestBase;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 246
    :try_start_0
    invoke-interface {v4, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 247
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 251
    const/16 v3, 0xc8

    if-ne v0, v3, :cond_4

    move v0, v2

    .line 262
    :goto_3
    invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpRequestBase;->abort()V

    .line 263
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    goto :goto_1

    .line 229
    :cond_3
    new-instance v1, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 254
    :cond_4
    const/4 v0, 0x2

    goto :goto_3

    .line 256
    :catch_0
    move-exception v0

    .line 262
    invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpRequestBase;->abort()V

    .line 263
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    move v0, v3

    .line 264
    goto :goto_1

    .line 262
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpRequestBase;->abort()V

    .line 263
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    throw v0
.end method

.method private a(Ljava/lang/String;[B)I
    .locals 7

    .prologue
    const/16 v6, 0x4e20

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 152
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 157
    if-eqz p2, :cond_1

    array-length v0, p2

    if-lez v0, :cond_1

    move v0, v3

    .line 162
    :goto_0
    if-eqz v0, :cond_2

    .line 163
    new-instance v1, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 164
    new-instance v5, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v5, p2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 165
    const-string/jumbo v0, "application/x-www-form-urlencoded"

    invoke-virtual {v5, v0}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V

    move-object v0, v1

    .line 166
    check-cast v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-virtual {v0, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 171
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/g/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/g/b;->a(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v0

    .line 172
    if-eqz v0, :cond_0

    .line 173
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v5

    .line 174
    invoke-static {v5, v0}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 175
    invoke-virtual {v1, v5}, Lorg/apache/http/client/methods/HttpRequestBase;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 178
    :cond_0
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 179
    invoke-static {v0, v6}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 180
    invoke-static {v0, v6}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 181
    invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpRequestBase;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 185
    :try_start_0
    invoke-interface {v4, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 186
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 190
    const/16 v3, 0xc8

    if-ne v0, v3, :cond_3

    move v0, v2

    .line 201
    :goto_2
    invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpRequestBase;->abort()V

    .line 202
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 204
    :goto_3
    return v0

    :cond_1
    move v0, v2

    .line 160
    goto :goto_0

    .line 168
    :cond_2
    new-instance v1, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 193
    :cond_3
    const/4 v0, 0x2

    goto :goto_2

    .line 195
    :catch_0
    move-exception v0

    .line 201
    invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpRequestBase;->abort()V

    .line 202
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    move v0, v3

    .line 203
    goto :goto_3

    .line 201
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpRequestBase;->abort()V

    .line 202
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/g/b;)Lcom/qihoo/security/g/b$a;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/g/b;->h:Lcom/qihoo/security/g/b$a;

    return-object v0
.end method

.method private static a(Landroid/content/Context;)Lorg/apache/http/HttpHost;
    .locals 3

    .prologue
    .line 300
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v1

    .line 301
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v2

    .line 302
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 303
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    .line 305
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/g/b;Z)Z
    .locals 0

    .prologue
    .line 42
    iput-boolean p1, p0, Lcom/qihoo/security/g/b;->e:Z

    return p1
.end method

.method private static a(Ljava/io/File;)[B
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 269
    if-nez p0, :cond_1

    .line 296
    :cond_0
    :goto_0
    return-object v0

    .line 272
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v4

    .line 273
    const-wide/16 v2, 0x0

    cmp-long v1, v4, v2

    if-lez v1, :cond_0

    const-wide/32 v2, 0x200000

    cmp-long v1, v4, v2

    if-gtz v1, :cond_0

    .line 276
    long-to-int v1, v4

    new-array v1, v1, [B

    .line 279
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/io/FileInputStream;->read([B)I
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v3

    .line 281
    int-to-long v6, v3

    cmp-long v3, v6, v4

    if-eqz v3, :cond_2

    .line 289
    if-eqz v2, :cond_0

    .line 291
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 292
    :catch_0
    move-exception v1

    goto :goto_0

    .line 289
    :cond_2
    if-eqz v2, :cond_3

    .line 291
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    :cond_3
    :goto_1
    move-object v0, v1

    .line 296
    goto :goto_0

    .line 284
    :catch_1
    move-exception v1

    move-object v1, v0

    .line 289
    :goto_2
    if-eqz v1, :cond_0

    .line 291
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 292
    :catch_2
    move-exception v1

    goto :goto_0

    .line 286
    :catch_3
    move-exception v1

    move-object v2, v0

    .line 289
    :goto_3
    if-eqz v2, :cond_0

    .line 291
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_0

    .line 292
    :catch_4
    move-exception v1

    goto :goto_0

    .line 289
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_4
    if-eqz v2, :cond_4

    .line 291
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 293
    :cond_4
    :goto_5
    throw v0

    .line 292
    :catch_5
    move-exception v0

    goto :goto_1

    :catch_6
    move-exception v1

    goto :goto_5

    .line 289
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 286
    :catch_7
    move-exception v1

    goto :goto_3

    .line 284
    :catch_8
    move-exception v1

    move-object v1, v2

    goto :goto_2
.end method

.method static synthetic b(Lcom/qihoo/security/g/b;)I
    .locals 1

    .prologue
    .line 42
    iget v0, p0, Lcom/qihoo/security/g/b;->g:I

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/g/b;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/g/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/g/b;)Ljava/io/File;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/g/b;->d:Ljava/io/File;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/g/b;)[B
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/g/b;->f:[B

    return-object v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/g/b$a;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/qihoo/security/g/b;->h:Lcom/qihoo/security/g/b$a;

    .line 112
    return-void
.end method

.method public a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 120
    monitor-enter p0

    .line 121
    :try_start_0
    iget-boolean v1, p0, Lcom/qihoo/security/g/b;->e:Z

    if-eqz v1, :cond_0

    .line 122
    const/4 v0, 0x0

    monitor-exit p0

    .line 148
    :goto_0
    return v0

    .line 124
    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/qihoo/security/g/b;->e:Z

    .line 126
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    new-instance v1, Lcom/qihoo/security/g/b$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/g/b$1;-><init>(Lcom/qihoo/security/g/b;)V

    invoke-virtual {v1}, Lcom/qihoo/security/g/b$1;->start()V

    goto :goto_0

    .line 126
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
