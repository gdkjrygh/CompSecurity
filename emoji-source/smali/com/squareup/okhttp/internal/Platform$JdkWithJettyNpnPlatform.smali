.class Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;
.super Lcom/squareup/okhttp/internal/Platform;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "JdkWithJettyNpnPlatform"
.end annotation


# instance fields
.field private final clientProviderClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final getMethod:Ljava/lang/reflect/Method;

.field private final putMethod:Ljava/lang/reflect/Method;

.field private final serverProviderClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .param p1, "putMethod"    # Ljava/lang/reflect/Method;
    .param p2, "getMethod"    # Ljava/lang/reflect/Method;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 279
    .local p3, "clientProviderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p4, "serverProviderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/Platform;-><init>()V

    .line 280
    iput-object p1, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->putMethod:Ljava/lang/reflect/Method;

    .line 281
    iput-object p2, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->getMethod:Ljava/lang/reflect/Method;

    .line 282
    iput-object p3, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->clientProviderClass:Ljava/lang/Class;

    .line 283
    iput-object p4, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->serverProviderClass:Ljava/lang/Class;

    .line 284
    return-void
.end method


# virtual methods
.method public getNpnSelectedProtocol(Ljavax/net/ssl/SSLSocket;)[B
    .locals 8
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;

    .prologue
    const/4 v3, 0x0

    .line 309
    :try_start_0
    iget-object v4, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->getMethod:Ljava/lang/reflect/Method;

    const/4 v5, 0x0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    .line 310
    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v2

    check-cast v2, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;

    .line 311
    .local v2, "provider":Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;
    # getter for: Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->unsupported:Z
    invoke-static {v2}, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->access$200(Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;)Z

    move-result v4

    if-nez v4, :cond_1

    # getter for: Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->selected:Ljava/lang/String;
    invoke-static {v2}, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->access$300(Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    .line 312
    const-string v4, "com.squareup.okhttp.OkHttpClient"

    invoke-static {v4}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    .line 313
    .local v1, "logger":Ljava/util/logging/Logger;
    sget-object v4, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v5, "NPN callback dropped so SPDY is disabled. Is npn-boot on the boot class path?"

    invoke-virtual {v1, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 317
    .end local v1    # "logger":Ljava/util/logging/Logger;
    :cond_0
    :goto_0
    return-object v3

    :cond_1
    # getter for: Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->unsupported:Z
    invoke-static {v2}, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->access$200(Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;)Z

    move-result v4

    if-nez v4, :cond_0

    # getter for: Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->selected:Ljava/lang/String;
    invoke-static {v2}, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->access$300(Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "US-ASCII"

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v3

    goto :goto_0

    .line 318
    .end local v2    # "provider":Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;
    :catch_0
    move-exception v0

    .line 319
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 320
    .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v0

    .line 321
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 322
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_2
    move-exception v0

    .line 323
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3
.end method

.method public setNpnProtocols(Ljavax/net/ssl/SSLSocket;[B)V
    .locals 10
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;
    .param p2, "npnProtocols"    # [B

    .prologue
    .line 288
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .local v5, "strings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    move v2, v1

    .end local v1    # "i":I
    .local v2, "i":I
    :goto_0
    array-length v6, p2

    if-ge v2, v6, :cond_0

    .line 290
    add-int/lit8 v1, v2, 0x1

    .end local v2    # "i":I
    .restart local v1    # "i":I
    aget-byte v3, p2, v2

    .line 291
    .local v3, "length":I
    new-instance v6, Ljava/lang/String;

    const-string v7, "US-ASCII"

    invoke-direct {v6, p2, v1, v3, v7}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    add-int/2addr v1, v3

    move v2, v1

    .line 293
    .end local v1    # "i":I
    .restart local v2    # "i":I
    goto :goto_0

    .line 294
    .end local v3    # "length":I
    :cond_0
    const-class v6, Lcom/squareup/okhttp/internal/Platform;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->clientProviderClass:Ljava/lang/Class;

    aput-object v9, v7, v8

    const/4 v8, 0x1

    iget-object v9, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->serverProviderClass:Ljava/lang/Class;

    aput-object v9, v7, v8

    new-instance v8, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;

    invoke-direct {v8, v5}, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;-><init>(Ljava/util/List;)V

    invoke-static {v6, v7, v8}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v4

    .line 297
    .local v4, "provider":Ljava/lang/Object;
    iget-object v6, p0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;->putMethod:Ljava/lang/reflect/Method;

    const/4 v7, 0x0

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object p1, v8, v9

    const/4 v9, 0x1

    aput-object v4, v8, v9

    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 305
    return-void

    .line 298
    .end local v2    # "i":I
    .end local v4    # "provider":Ljava/lang/Object;
    .end local v5    # "strings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :catch_0
    move-exception v0

    .line 299
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v6

    .line 300
    .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v0

    .line 301
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v6

    .line 302
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_2
    move-exception v0

    .line 303
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v6
.end method
