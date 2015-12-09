.class public Lcom/worklight/wlclient/api/WLRequestOptions;
.super Ljava/lang/Object;
.source "WLRequestOptions.java"


# instance fields
.field private headers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/http/Header;",
            ">;"
        }
    .end annotation
.end field

.field private invocationContext:Ljava/lang/Object;

.field private parameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private responseListener:Lcom/worklight/wlclient/api/WLResponseListener;

.field private timeout:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->parameters:Ljava/util/Map;

    .line 31
    const/16 v0, 0x2710

    iput v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->timeout:I

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->headers:Ljava/util/ArrayList;

    .line 28
    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 97
    new-instance v0, Lorg/apache/http/message/BasicHeader;

    invoke-direct {v0, p1, p2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/worklight/wlclient/api/WLRequestOptions;->addHeader(Lorg/apache/http/Header;)V

    .line 98
    return-void
.end method

.method public addHeader(Lorg/apache/http/Header;)V
    .locals 1
    .param p1, "header"    # Lorg/apache/http/Header;

    .prologue
    .line 90
    if-nez p1, :cond_0

    .line 94
    :goto_0
    return-void

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->headers:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method protected addParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 82
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    return-void
.end method

.method protected addParameters(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 78
    .local p1, "parameters":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 79
    return-void
.end method

.method public getHeaders()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/http/Header;",
            ">;"
        }
    .end annotation

    .prologue
    .line 105
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->headers:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getInvocationContext()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->invocationContext:Ljava/lang/Object;

    return-object v0
.end method

.method protected getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 86
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->parameters:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 66
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getResponseListener()Lcom/worklight/wlclient/api/WLResponseListener;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->responseListener:Lcom/worklight/wlclient/api/WLResponseListener;

    return-object v0
.end method

.method public getTimeout()I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->timeout:I

    return v0
.end method

.method public setHeaders(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/http/Header;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 101
    .local p1, "extraHeaders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/Header;>;"
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->headers:Ljava/util/ArrayList;

    .line 102
    return-void
.end method

.method public setInvocationContext(Ljava/lang/Object;)V
    .locals 0
    .param p1, "invocationContext"    # Ljava/lang/Object;

    .prologue
    .line 62
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->invocationContext:Ljava/lang/Object;

    .line 63
    return-void
.end method

.method protected setResponseListener(Lcom/worklight/wlclient/api/WLResponseListener;)V
    .locals 0
    .param p1, "responseListener"    # Lcom/worklight/wlclient/api/WLResponseListener;

    .prologue
    .line 74
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->responseListener:Lcom/worklight/wlclient/api/WLResponseListener;

    .line 75
    return-void
.end method

.method public setTimeout(I)V
    .locals 0
    .param p1, "timeout"    # I

    .prologue
    .line 45
    iput p1, p0, Lcom/worklight/wlclient/api/WLRequestOptions;->timeout:I

    .line 46
    return-void
.end method
