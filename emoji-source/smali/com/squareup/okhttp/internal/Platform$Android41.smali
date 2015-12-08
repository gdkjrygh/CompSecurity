.class Lcom/squareup/okhttp/internal/Platform$Android41;
.super Lcom/squareup/okhttp/internal/Platform$Android23;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Android41"
.end annotation


# instance fields
.field private final getNpnSelectedProtocol:Ljava/lang/reflect/Method;

.field private final setNpnProtocols:Ljava/lang/reflect/Method;


# direct methods
.method private constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 1
    .param p2, "setUseSessionTickets"    # Ljava/lang/reflect/Method;
    .param p3, "setHostname"    # Ljava/lang/reflect/Method;
    .param p4, "setNpnProtocols"    # Ljava/lang/reflect/Method;
    .param p5, "getNpnSelectedProtocol"    # Ljava/lang/reflect/Method;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            ")V"
        }
    .end annotation

    .prologue
    .line 239
    .local p1, "openSslSocketClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/squareup/okhttp/internal/Platform$Android23;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/squareup/okhttp/internal/Platform$1;)V

    .line 240
    iput-object p4, p0, Lcom/squareup/okhttp/internal/Platform$Android41;->setNpnProtocols:Ljava/lang/reflect/Method;

    .line 241
    iput-object p5, p0, Lcom/squareup/okhttp/internal/Platform$Android41;->getNpnSelectedProtocol:Ljava/lang/reflect/Method;

    .line 242
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/squareup/okhttp/internal/Platform$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Class;
    .param p2, "x1"    # Ljava/lang/reflect/Method;
    .param p3, "x2"    # Ljava/lang/reflect/Method;
    .param p4, "x3"    # Ljava/lang/reflect/Method;
    .param p5, "x4"    # Ljava/lang/reflect/Method;
    .param p6, "x5"    # Lcom/squareup/okhttp/internal/Platform$1;

    .prologue
    .line 233
    invoke-direct/range {p0 .. p5}, Lcom/squareup/okhttp/internal/Platform$Android41;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    return-void
.end method


# virtual methods
.method public getNpnSelectedProtocol(Ljavax/net/ssl/SSLSocket;)[B
    .locals 3
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;

    .prologue
    .line 258
    iget-object v1, p0, Lcom/squareup/okhttp/internal/Platform$Android41;->openSslSocketClass:Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 259
    const/4 v1, 0x0

    .line 262
    :goto_0
    return-object v1

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/Platform$Android41;->getNpnSelectedProtocol:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    check-cast v1, [B
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 263
    :catch_0
    move-exception v0

    .line 264
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 265
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_1
    move-exception v0

    .line 266
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public setNpnProtocols(Ljavax/net/ssl/SSLSocket;[B)V
    .locals 4
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;
    .param p2, "npnProtocols"    # [B

    .prologue
    .line 245
    iget-object v1, p0, Lcom/squareup/okhttp/internal/Platform$Android41;->openSslSocketClass:Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 255
    :goto_0
    return-void

    .line 249
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/Platform$Android41;->setNpnProtocols:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 250
    :catch_0
    move-exception v0

    .line 251
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 252
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v0

    .line 253
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
