.class public Lcom/qihoo360/common/e/c;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a()Lorg/apache/http/HttpHost;
    .locals 3

    .prologue
    .line 29
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v2

    .line 32
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 33
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    .line 35
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Lorg/apache/http/HttpHost;
    .locals 1

    .prologue
    .line 18
    invoke-static {p0}, Lcom/qihoo360/common/e/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    const/4 v0, 0x0

    .line 22
    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/qihoo360/common/e/c;->a()Lorg/apache/http/HttpHost;

    move-result-object v0

    goto :goto_0
.end method
