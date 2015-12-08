.class public Lcom/squareup/okhttp/Route;
.super Ljava/lang/Object;
.source "Route.java"


# instance fields
.field final address:Lcom/squareup/okhttp/Address;

.field final inetSocketAddress:Ljava/net/InetSocketAddress;

.field final modernTls:Z

.field final proxy:Ljava/net/Proxy;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;Z)V
    .locals 2
    .param p1, "address"    # Lcom/squareup/okhttp/Address;
    .param p2, "proxy"    # Ljava/net/Proxy;
    .param p3, "inetSocketAddress"    # Ljava/net/InetSocketAddress;
    .param p4, "modernTls"    # Z

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "address == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "proxy == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_1
    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "inetSocketAddress == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_2
    iput-object p1, p0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    .line 34
    iput-object p2, p0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    .line 35
    iput-object p3, p0, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    .line 36
    iput-boolean p4, p0, Lcom/squareup/okhttp/Route;->modernTls:Z

    .line 37
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 73
    instance-of v2, p1, Lcom/squareup/okhttp/Route;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 74
    check-cast v0, Lcom/squareup/okhttp/Route;

    .line 75
    .local v0, "other":Lcom/squareup/okhttp/Route;
    iget-object v2, p0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v3, v0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/Address;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    iget-object v3, v0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    .line 76
    invoke-virtual {v2, v3}, Ljava/net/Proxy;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    iget-object v3, v0, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    .line 77
    invoke-virtual {v2, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/squareup/okhttp/Route;->modernTls:Z

    iget-boolean v3, v0, Lcom/squareup/okhttp/Route;->modernTls:Z

    if-ne v2, v3, :cond_0

    const/4 v1, 0x1

    .line 80
    .end local v0    # "other":Lcom/squareup/okhttp/Route;
    :cond_0
    return v1
.end method

.method flipTlsMode()Lcom/squareup/okhttp/Route;
    .locals 5

    .prologue
    .line 69
    new-instance v1, Lcom/squareup/okhttp/Route;

    iget-object v2, p0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v3, p0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    iget-object v4, p0, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    iget-boolean v0, p0, Lcom/squareup/okhttp/Route;->modernTls:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/squareup/okhttp/Route;-><init>(Lcom/squareup/okhttp/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;Z)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAddress()Lcom/squareup/okhttp/Address;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    return-object v0
.end method

.method public getProxy()Ljava/net/Proxy;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    return-object v0
.end method

.method public getSocketAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 84
    const/16 v0, 0x11

    .line 85
    .local v0, "result":I
    iget-object v1, p0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Address;->hashCode()I

    move-result v1

    add-int/lit16 v0, v1, 0x20f

    .line 86
    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    invoke-virtual {v2}, Ljava/net/Proxy;->hashCode()I

    move-result v2

    add-int v0, v1, v2

    .line 87
    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->hashCode()I

    move-result v2

    add-int v0, v1, v2

    .line 88
    iget-boolean v1, p0, Lcom/squareup/okhttp/Route;->modernTls:Z

    if-eqz v1, :cond_0

    mul-int/lit8 v1, v0, 0x1f

    :goto_0
    add-int/2addr v0, v1

    .line 89
    return v0

    .line 88
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public isModernTls()Z
    .locals 1

    .prologue
    .line 64
    iget-boolean v0, p0, Lcom/squareup/okhttp/Route;->modernTls:Z

    return v0
.end method
