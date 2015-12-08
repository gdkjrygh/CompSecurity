.class public Lcom/squareup/okhttp/internal/Platform;
.super Ljava/lang/Object;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;,
        Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;,
        Lcom/squareup/okhttp/internal/Platform$Android41;,
        Lcom/squareup/okhttp/internal/Platform$Android23;
    }
.end annotation


# static fields
.field private static final PLATFORM:Lcom/squareup/okhttp/internal/Platform;


# instance fields
.field private deflaterConstructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor",
            "<",
            "Ljava/util/zip/DeflaterOutputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->findPlatform()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/Platform;->PLATFORM:Lcom/squareup/okhttp/internal/Platform;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 332
    return-void
.end method

.method private static findPlatform()Lcom/squareup/okhttp/internal/Platform;
    .locals 17

    .prologue
    .line 145
    :try_start_0
    const-string v0, "com.android.org.conscrypt.OpenSSLSocketImpl"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_5

    move-result-object v1

    .line 152
    .local v1, "openSslSocketClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    :try_start_1
    const-string v0, "setUseSessionTickets"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v15, 0x0

    sget-object v16, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v16, v6, v15

    invoke-virtual {v1, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 153
    .local v2, "setUseSessionTickets":Ljava/lang/reflect/Method;
    const-string v0, "setHostname"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v15, 0x0

    const-class v16, Ljava/lang/String;

    aput-object v16, v6, v15

    invoke-virtual {v1, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5

    move-result-object v3

    .line 157
    .local v3, "setHostname":Ljava/lang/reflect/Method;
    :try_start_2
    const-string v0, "setNpnProtocols"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v15, 0x0

    const-class v16, [B

    aput-object v16, v6, v15

    invoke-virtual {v1, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 158
    .local v4, "setNpnProtocols":Ljava/lang/reflect/Method;
    const-string v0, "getNpnSelectedProtocol"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Class;

    invoke-virtual {v1, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 159
    .local v5, "getNpnSelectedProtocol":Ljava/lang/reflect/Method;
    new-instance v0, Lcom/squareup/okhttp/internal/Platform$Android41;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/squareup/okhttp/internal/Platform$Android41;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/squareup/okhttp/internal/Platform$1;)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 187
    .end local v1    # "openSslSocketClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v2    # "setUseSessionTickets":Ljava/lang/reflect/Method;
    .end local v3    # "setHostname":Ljava/lang/reflect/Method;
    .end local v4    # "setNpnProtocols":Ljava/lang/reflect/Method;
    .end local v5    # "getNpnSelectedProtocol":Ljava/lang/reflect/Method;
    .local v11, "npnClassName":Ljava/lang/String;
    :goto_1
    return-object v0

    .line 146
    .end local v11    # "npnClassName":Ljava/lang/String;
    :catch_0
    move-exception v9

    .line 148
    .local v9, "ignored":Ljava/lang/ClassNotFoundException;
    :try_start_3
    const-string v0, "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .restart local v1    # "openSslSocketClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    goto :goto_0

    .line 161
    .end local v9    # "ignored":Ljava/lang/ClassNotFoundException;
    .restart local v2    # "setUseSessionTickets":Ljava/lang/reflect/Method;
    .restart local v3    # "setHostname":Ljava/lang/reflect/Method;
    :catch_1
    move-exception v9

    .line 162
    .local v9, "ignored":Ljava/lang/NoSuchMethodException;
    new-instance v0, Lcom/squareup/okhttp/internal/Platform$Android23;

    const/4 v6, 0x0

    invoke-direct {v0, v1, v2, v3, v6}, Lcom/squareup/okhttp/internal/Platform$Android23;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/squareup/okhttp/internal/Platform$1;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_5

    goto :goto_1

    .line 164
    .end local v1    # "openSslSocketClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v2    # "setUseSessionTickets":Ljava/lang/reflect/Method;
    .end local v3    # "setHostname":Ljava/lang/reflect/Method;
    .local v9, "ignored":Ljava/lang/ClassNotFoundException;
    :catch_2
    move-exception v0

    .line 172
    :goto_2
    :try_start_4
    const-string v11, "org.eclipse.jetty.npn.NextProtoNego"

    .line 173
    .restart local v11    # "npnClassName":Ljava/lang/String;
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .end local v9    # "ignored":Ljava/lang/ClassNotFoundException;
    move-result-object v10

    .line 174
    .local v10, "nextProtoNegoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "$Provider"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    .line 175
    .local v12, "providerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "$ClientProvider"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    .line 176
    .local v7, "clientProviderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "$ServerProvider"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    .line 177
    .local v14, "serverProviderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "put"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v15, 0x0

    const-class v16, Ljavax/net/ssl/SSLSocket;

    aput-object v16, v6, v15

    const/4 v15, 0x1

    aput-object v12, v6, v15

    invoke-virtual {v10, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v13

    .line 178
    .local v13, "putMethod":Ljava/lang/reflect/Method;
    const-string v0, "get"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v15, 0x0

    const-class v16, Ljavax/net/ssl/SSLSocket;

    aput-object v16, v6, v15

    invoke-virtual {v10, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    .line 179
    .local v8, "getMethod":Ljava/lang/reflect/Method;
    new-instance v0, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;

    invoke-direct {v0, v13, v8, v7, v14}, Lcom/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_1

    .line 181
    .end local v7    # "clientProviderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v8    # "getMethod":Ljava/lang/reflect/Method;
    .end local v10    # "nextProtoNegoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v12    # "providerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v13    # "putMethod":Ljava/lang/reflect/Method;
    .end local v14    # "serverProviderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v9    # "ignored":Ljava/lang/ClassNotFoundException;
    :catch_3
    move-exception v0

    .line 187
    .end local v9    # "ignored":Ljava/lang/ClassNotFoundException;
    :goto_3
    new-instance v0, Lcom/squareup/okhttp/internal/Platform;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/Platform;-><init>()V

    goto/16 :goto_1

    .line 183
    .restart local v9    # "ignored":Ljava/lang/ClassNotFoundException;
    :catch_4
    move-exception v0

    goto :goto_3

    .line 166
    .end local v11    # "npnClassName":Ljava/lang/String;
    :catch_5
    move-exception v0

    goto :goto_2
.end method

.method public static get()Lcom/squareup/okhttp/internal/Platform;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/squareup/okhttp/internal/Platform;->PLATFORM:Lcom/squareup/okhttp/internal/Platform;

    return-object v0
.end method


# virtual methods
.method public connectSocket(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 0
    .param p1, "socket"    # Ljava/net/Socket;
    .param p2, "address"    # Ljava/net/InetSocketAddress;
    .param p3, "connectTimeout"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 108
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 109
    return-void
.end method

.method public enableTlsExtensions(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;)V
    .locals 0
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;
    .param p2, "uriHost"    # Ljava/lang/String;

    .prologue
    .line 84
    return-void
.end method

.method public getNpnSelectedProtocol(Ljavax/net/ssl/SSLSocket;)[B
    .locals 1
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;

    .prologue
    .line 96
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    const-string v0, "OkHttp"

    return-object v0
.end method

.method public logW(Ljava/lang/String;)V
    .locals 1
    .param p1, "warning"    # Ljava/lang/String;

    .prologue
    .line 65
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method public newDeflaterOutputStream(Ljava/io/OutputStream;Ljava/util/zip/Deflater;Z)Ljava/io/OutputStream;
    .locals 6
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "deflater"    # Ljava/util/zip/Deflater;
    .param p3, "syncFlush"    # Z

    .prologue
    .line 119
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/Platform;->deflaterConstructor:Ljava/lang/reflect/Constructor;

    .line 120
    .local v0, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Ljava/util/zip/DeflaterOutputStream;>;"
    if-nez v0, :cond_0

    .line 121
    const-class v2, Ljava/util/zip/DeflaterOutputStream;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/io/OutputStream;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Ljava/util/zip/Deflater;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .end local v0    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Ljava/util/zip/DeflaterOutputStream;>;"
    iput-object v0, p0, Lcom/squareup/okhttp/internal/Platform;->deflaterConstructor:Ljava/lang/reflect/Constructor;

    .line 124
    .restart local v0    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Ljava/util/zip/DeflaterOutputStream;>;"
    :cond_0
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    return-object v2

    .line 125
    .end local v0    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Ljava/util/zip/DeflaterOutputStream;>;"
    :catch_0
    move-exception v1

    .line 126
    .local v1, "e":Ljava/lang/NoSuchMethodException;
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    const-string v3, "Cannot SPDY; no SYNC_FLUSH available"

    invoke-direct {v2, v3}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 127
    .end local v1    # "e":Ljava/lang/NoSuchMethodException;
    :catch_1
    move-exception v1

    .line 128
    .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/RuntimeException;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    check-cast v2, Ljava/lang/RuntimeException;

    .line 129
    :goto_0
    throw v2

    .line 128
    :cond_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 129
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 130
    .end local v1    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_2
    move-exception v1

    .line 131
    .local v1, "e":Ljava/lang/InstantiationException;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 132
    .end local v1    # "e":Ljava/lang/InstantiationException;
    :catch_3
    move-exception v1

    .line 133
    .local v1, "e":Ljava/lang/IllegalAccessException;
    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2
.end method

.method public setNpnProtocols(Ljavax/net/ssl/SSLSocket;[B)V
    .locals 0
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;
    .param p2, "npnProtocols"    # [B

    .prologue
    .line 104
    return-void
.end method

.method public supportTlsIntolerantServer(Ljavax/net/ssl/SSLSocket;)V
    .locals 3
    .param p1, "socket"    # Ljavax/net/ssl/SSLSocket;

    .prologue
    .line 91
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "SSLv3"

    aput-object v2, v0, v1

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 92
    return-void
.end method

.method public tagSocket(Ljava/net/Socket;)V
    .locals 0
    .param p1, "socket"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    .prologue
    .line 69
    return-void
.end method

.method public toUriLenient(Ljava/net/URL;)Ljava/net/URI;
    .locals 1
    .param p1, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .prologue
    .line 75
    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method public untagSocket(Ljava/net/Socket;)V
    .locals 0
    .param p1, "socket"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    .prologue
    .line 72
    return-void
.end method
