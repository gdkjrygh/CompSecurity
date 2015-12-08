.class public Lcom/splunk/mint/network/http/MonitorableURLStreamHandlerFactory;
.super Ljava/lang/Object;
.source "MonitorableURLStreamHandlerFactory.java"

# interfaces
.implements Ljava/net/URLStreamHandlerFactory;


# instance fields
.field private handlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/net/URLStreamHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/splunk/mint/network/MonitorRegistry;)V
    .locals 3
    .param p1, "registry"    # Lcom/splunk/mint/network/MonitorRegistry;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableURLStreamHandlerFactory;->handlers:Ljava/util/Map;

    .line 17
    new-instance v0, Lcom/splunk/mint/network/http/HTTPURLStreamHandler;

    invoke-direct {v0, p1}, Lcom/splunk/mint/network/http/HTTPURLStreamHandler;-><init>(Lcom/splunk/mint/network/MonitorRegistry;)V

    .line 18
    .local v0, "h":Lcom/splunk/mint/network/http/URLStreamHandlerBase;
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableURLStreamHandlerFactory;->handlers:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/splunk/mint/network/http/URLStreamHandlerBase;->getProtocol()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    new-instance v0, Lcom/splunk/mint/network/http/HTTPSURLStreamHandler;

    .end local v0    # "h":Lcom/splunk/mint/network/http/URLStreamHandlerBase;
    invoke-direct {v0, p1}, Lcom/splunk/mint/network/http/HTTPSURLStreamHandler;-><init>(Lcom/splunk/mint/network/MonitorRegistry;)V

    .line 20
    .restart local v0    # "h":Lcom/splunk/mint/network/http/URLStreamHandlerBase;
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableURLStreamHandlerFactory;->handlers:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/splunk/mint/network/http/URLStreamHandlerBase;->getProtocol()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    return-void
.end method


# virtual methods
.method public createURLStreamHandler(Ljava/lang/String;)Ljava/net/URLStreamHandler;
    .locals 1
    .param p1, "protocol"    # Ljava/lang/String;

    .prologue
    .line 25
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableURLStreamHandlerFactory;->handlers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URLStreamHandler;

    return-object v0
.end method
