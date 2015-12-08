.class public Lcom/worklight/wlclient/WLCookieManager;
.super Ljava/lang/Object;
.source "WLCookieManager.java"


# static fields
.field private static cookies:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lorg/apache/http/cookie/Cookie;",
            ">;"
        }
    .end annotation
.end field

.field private static instanceAuthId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    sput-object v0, Lcom/worklight/wlclient/WLCookieManager;->instanceAuthId:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addCookies(Lcom/worklight/wlclient/WLRequest;)V
    .locals 5
    .param p0, "request"    # Lcom/worklight/wlclient/WLRequest;

    .prologue
    .line 104
    sget-object v3, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    if-eqz v3, :cond_0

    sget-object v3, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 105
    new-instance v1, Lorg/apache/http/impl/cookie/BrowserCompatSpec;

    invoke-direct {v1}, Lorg/apache/http/impl/cookie/BrowserCompatSpec;-><init>()V

    .line 106
    .local v1, "cookieSpecBase":Lorg/apache/http/impl/cookie/CookieSpecBase;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .local v2, "cookies":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/cookie/Cookie;>;"
    invoke-static {}, Lcom/worklight/wlclient/WLCookieManager;->getCookies()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 108
    invoke-virtual {v1, v2}, Lorg/apache/http/impl/cookie/CookieSpecBase;->formatCookies(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 109
    .local v0, "cookieHeader":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/Header;>;"
    invoke-virtual {p0}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v4

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/http/Header;

    invoke-virtual {v4, v3}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Lorg/apache/http/Header;)V

    .line 111
    .end local v0    # "cookieHeader":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/Header;>;"
    .end local v1    # "cookieSpecBase":Lorg/apache/http/impl/cookie/CookieSpecBase;
    .end local v2    # "cookies":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/cookie/Cookie;>;"
    :cond_0
    return-void
.end method

.method public static clearCookies()V
    .locals 1

    .prologue
    .line 114
    const/4 v0, 0x0

    sput-object v0, Lcom/worklight/wlclient/WLCookieManager;->instanceAuthId:Ljava/lang/String;

    .line 115
    sget-object v0, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 116
    sget-object v0, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 118
    :cond_0
    return-void
.end method

.method public static getCookies()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lorg/apache/http/cookie/Cookie;",
            ">;"
        }
    .end annotation

    .prologue
    .line 79
    sget-object v0, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    return-object v0
.end method

.method public static getInstanceAuthId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/worklight/wlclient/WLCookieManager;->instanceAuthId:Ljava/lang/String;

    return-object v0
.end method

.method public static handleResponseHeaders([Lorg/apache/http/Header;Ljava/net/URI;)V
    .locals 9
    .param p0, "headers"    # [Lorg/apache/http/Header;
    .param p1, "uri"    # Ljava/net/URI;

    .prologue
    .line 83
    sget-object v5, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    if-nez v5, :cond_0

    .line 84
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    sput-object v5, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    .line 87
    :cond_0
    new-instance v3, Lorg/apache/http/cookie/CookieOrigin;

    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/net/URI;->getPort()I

    move-result v6

    const-string v7, "/apps/services"

    const/4 v8, 0x0

    invoke-direct {v3, v5, v6, v7, v8}, Lorg/apache/http/cookie/CookieOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 88
    .local v3, "origin":Lorg/apache/http/cookie/CookieOrigin;
    new-instance v0, Lorg/apache/http/impl/cookie/BrowserCompatSpec;

    invoke-direct {v0}, Lorg/apache/http/impl/cookie/BrowserCompatSpec;-><init>()V

    .line 89
    .local v0, "cookieSpecBase":Lorg/apache/http/impl/cookie/CookieSpecBase;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v5, p0

    if-lt v2, v5, :cond_1

    .line 101
    return-void

    .line 90
    :cond_1
    aget-object v5, p0, v2

    invoke-interface {v5}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    const-string v6, "set-cookie"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 93
    :try_start_0
    aget-object v5, p0, v2

    invoke-virtual {v0, v5, v3}, Lorg/apache/http/impl/cookie/CookieSpecBase;->parse(Lorg/apache/http/Header;Lorg/apache/http/cookie/CookieOrigin;)Ljava/util/List;
    :try_end_0
    .catch Lorg/apache/http/cookie/MalformedCookieException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 98
    .local v4, "theCookies":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/cookie/Cookie;>;"
    sget-object v5, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 89
    .end local v4    # "theCookies":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/cookie/Cookie;>;"
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 94
    :catch_0
    move-exception v1

    .line 95
    .local v1, "e":Lorg/apache/http/cookie/MalformedCookieException;
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "handleResponseHeaders Cannot parse cookies for header "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, p0, v2

    invoke-interface {v6}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5
.end method

.method public static setCookies(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p0, "cookiesString"    # Ljava/lang/String;
    .param p1, "domain"    # Ljava/lang/String;

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 52
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    .line 53
    :cond_0
    const-string v5, "setCookies() can\'t parse cookieString which is null or empty."

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 76
    :goto_0
    return-void

    .line 56
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_3

    .line 57
    :cond_2
    const-string v5, "setCookies() can\'t create cookies with a null or empty domain."

    new-array v6, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto :goto_0

    .line 61
    :cond_3
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 63
    .local v1, "cookieSet":Ljava/util/HashSet;, "Ljava/util/HashSet<Lorg/apache/http/cookie/Cookie;>;"
    const-string v5, ";"

    invoke-virtual {p0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 64
    .local v2, "cookies":[Ljava/lang/String;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    array-length v5, v2

    if-lt v3, v5, :cond_4

    .line 75
    sput-object v1, Lcom/worklight/wlclient/WLCookieManager;->cookies:Ljava/util/Set;

    goto :goto_0

    .line 65
    :cond_4
    aget-object v5, v2, v3

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "="

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 66
    .local v4, "keyValue":[Ljava/lang/String;
    array-length v5, v4

    const/4 v6, 0x2

    if-ne v5, v6, :cond_5

    .line 67
    new-instance v0, Lorg/apache/http/impl/cookie/BasicClientCookie;

    aget-object v5, v4, v8

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    aget-object v6, v4, v9

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v5, v6}, Lorg/apache/http/impl/cookie/BasicClientCookie;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .local v0, "cookie":Lorg/apache/http/impl/cookie/BasicClientCookie;
    invoke-virtual {v0, p1}, Lorg/apache/http/impl/cookie/BasicClientCookie;->setDomain(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 64
    .end local v0    # "cookie":Lorg/apache/http/impl/cookie/BasicClientCookie;
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 71
    :cond_5
    const-string v5, "setCookies() can\'t parse cookie %s."

    new-array v6, v9, [Ljava/lang/Object;

    aget-object v7, v2, v3

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto :goto_2
.end method

.method public static setInstanceAuthId(Ljava/lang/String;)V
    .locals 0
    .param p0, "instanceAuthId"    # Ljava/lang/String;

    .prologue
    .line 43
    sput-object p0, Lcom/worklight/wlclient/WLCookieManager;->instanceAuthId:Ljava/lang/String;

    .line 44
    return-void
.end method
