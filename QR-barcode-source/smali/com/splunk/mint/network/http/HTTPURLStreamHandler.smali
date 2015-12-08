.class public final Lcom/splunk/mint/network/http/HTTPURLStreamHandler;
.super Lcom/splunk/mint/network/http/URLStreamHandlerBase;
.source "HTTPURLStreamHandler.java"


# static fields
.field private static final PORT:I = 0x50

.field private static final PROTOCOL:Ljava/lang/String; = "http"

.field private static final SYSTEM_CLASSES:[Ljava/lang/String;


# instance fields
.field private final registry:Lcom/splunk/mint/network/MonitorRegistry;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 12
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "libcore.net.http.HttpURLConnectionImpl"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnectionImpl"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "org.apache.harmony.luni.internal.net.www.protocol.http.HttpURLConnection"

    aput-object v2, v0, v1

    sput-object v0, Lcom/splunk/mint/network/http/HTTPURLStreamHandler;->SYSTEM_CLASSES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/splunk/mint/network/MonitorRegistry;)V
    .locals 1
    .param p1, "registry"    # Lcom/splunk/mint/network/MonitorRegistry;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 25
    sget-object v0, Lcom/splunk/mint/network/http/HTTPURLStreamHandler;->SYSTEM_CLASSES:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/splunk/mint/network/http/URLStreamHandlerBase;-><init>([Ljava/lang/String;)V

    .line 26
    iput-object p1, p0, Lcom/splunk/mint/network/http/HTTPURLStreamHandler;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    .line 27
    return-void
.end method


# virtual methods
.method public getDefaultPort()I
    .locals 1

    .prologue
    .line 45
    const/16 v0, 0x50

    return v0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    const-string v0, "http"

    return-object v0
.end method

.method protected openConnection(Ljava/net/URL;)Ljava/net/URLConnection;
    .locals 3
    .param p1, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 33
    invoke-super {p0, p1}, Lcom/splunk/mint/network/http/URLStreamHandlerBase;->openConnection(Ljava/net/URL;)Ljava/net/URLConnection;

    move-result-object v0

    .line 34
    .local v0, "openConnection":Ljava/net/URLConnection;
    new-instance v1, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;

    iget-object v2, p0, Lcom/splunk/mint/network/http/HTTPURLStreamHandler;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v1, v2, v0}, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;-><init>(Lcom/splunk/mint/network/MonitorRegistry;Ljava/net/URLConnection;)V

    return-object v1
.end method

.method protected openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;
    .locals 3
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "proxy"    # Ljava/net/Proxy;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 39
    invoke-super {p0, p1, p2}, Lcom/splunk/mint/network/http/URLStreamHandlerBase;->openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    .line 40
    .local v0, "openConnection":Ljava/net/URLConnection;
    new-instance v1, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;

    iget-object v2, p0, Lcom/splunk/mint/network/http/HTTPURLStreamHandler;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v1, v2, v0}, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;-><init>(Lcom/splunk/mint/network/MonitorRegistry;Ljava/net/URLConnection;)V

    return-object v1
.end method
