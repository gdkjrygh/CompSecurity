.class public Lcom/facebook/http/b/w;
.super Lcom/facebook/inject/c;
.source "FbHttpModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 466
    return-void
.end method

.method static synthetic a(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;
    .locals 1

    .prologue
    .line 82
    invoke-static {p0, p1}, Lcom/facebook/http/b/w;->b(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;
    .locals 1

    .prologue
    .line 82
    invoke-static {p0}, Lcom/facebook/http/b/w;->b(Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;
    .locals 5

    .prologue
    .line 415
    :try_start_0
    const-class v0, Landroid/net/http/AndroidHttpClient;

    const-string v1, "newInstance"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/content/Context;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 416
    const/4 v1, 0x0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/http/AndroidHttpClient;

    .line 418
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->getSchemeRegistry()Lorg/apache/http/conn/scheme/SchemeRegistry;

    move-result-object v1

    const-string v2, "https"

    invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->get(Ljava/lang/String;)Lorg/apache/http/conn/scheme/Scheme;

    move-result-object v1

    .line 420
    invoke-virtual {v1}, Lorg/apache/http/conn/scheme/Scheme;->getSocketFactory()Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v1

    .line 421
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    .line 422
    return-object v1

    .line 423
    :catch_0
    move-exception v0

    .line 424
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 425
    :catch_1
    move-exception v0

    .line 426
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 427
    :catch_2
    move-exception v0

    .line 428
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static b(Ljava/lang/String;)Lorg/apache/http/conn/scheme/SocketFactory;
    .locals 3

    .prologue
    .line 436
    invoke-static {p0}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v0

    .line 437
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->getSchemeRegistry()Lorg/apache/http/conn/scheme/SchemeRegistry;

    move-result-object v1

    const-string v2, "https"

    invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->get(Ljava/lang/String;)Lorg/apache/http/conn/scheme/Scheme;

    move-result-object v1

    .line 439
    invoke-virtual {v1}, Lorg/apache/http/conn/scheme/Scheme;->getSocketFactory()Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v1

    .line 440
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 441
    return-object v1
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 90
    const-class v0, Lorg/apache/http/client/CookieStore;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/b/l;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 91
    const-class v0, Lorg/apache/http/client/HttpClient;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/b/m;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 92
    const-class v0, Lcom/facebook/http/b/m;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/af;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/af;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 95
    const-class v0, Lcom/facebook/http/b/ap;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ah;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/ah;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 98
    const-class v0, Lcom/facebook/http/b/l;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ae;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/ae;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 101
    const-class v0, Lorg/apache/http/conn/ClientConnectionManager;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ac;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/ac;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 104
    const-class v0, Lorg/apache/http/params/HttpParams;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/aj;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/aj;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 106
    const-class v0, Lorg/apache/http/conn/scheme/SocketFactory;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/SslSocketFactory;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ao;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/ao;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 109
    const-class v0, Lcom/facebook/http/c/e;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ad;

    invoke-direct {v1, v2}, Lcom/facebook/http/b/ad;-><init>(Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 112
    const-class v0, Lcom/facebook/http/c/g;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/am;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/am;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->c()V

    .line 115
    const-class v0, Lcom/facebook/http/protocol/q;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/z;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 118
    const-class v0, Lcom/facebook/http/b/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ai;

    invoke-direct {v1, v2}, Lcom/facebook/http/b/ai;-><init>(Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 122
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/http/c/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 126
    const-class v0, Lcom/facebook/http/b/v;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ag;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/ag;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 129
    const-class v0, Lcom/facebook/common/c/j;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/al;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/al;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 134
    const-class v0, Lcom/facebook/http/protocol/s;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/aa;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/aa;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 137
    const-class v0, Lcom/facebook/http/protocol/an;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ak;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/ak;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 140
    const-class v0, Lcom/facebook/http/protocol/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/an;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/an;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 143
    const-class v0, Lcom/facebook/http/protocol/w;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ab;

    invoke-direct {v1, v2}, Lcom/facebook/http/b/ab;-><init>(Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 147
    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/protocol/ar;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 149
    const-class v0, Lcom/facebook/http/protocol/am;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/protocol/an;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 151
    const-class v0, Lcom/facebook/http/protocol/i;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/y;

    invoke-direct {v1, p0, v2}, Lcom/facebook/http/b/y;-><init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 155
    const-class v0, Lcom/facebook/http/b/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/http/b/ar;

    invoke-direct {v1}, Lcom/facebook/http/b/ar;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 159
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/IsPhpProfilingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/http/protocol/ai;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 162
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/IsTeakProfilingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/http/protocol/aj;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 165
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/IsWirehogProfilingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/http/protocol/ak;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 168
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/IsSslPersistentCacheEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/f/o;

    const-string v2, "fbandroid_ssl_cache_enabled"

    invoke-direct {v1, v2}, Lcom/facebook/f/o;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 173
    const-class v0, Lcom/facebook/http/b/t;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 174
    const-class v0, Lcom/facebook/http/b/au;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 177
    const-class v0, Lcom/facebook/http/b/u;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/w;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 178
    return-void
.end method
