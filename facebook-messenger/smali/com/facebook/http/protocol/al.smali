.class public Lcom/facebook/http/protocol/al;
.super Ljava/lang/Object;
.source "JsonResponseHandler.java"

# interfaces
.implements Lorg/apache/http/client/ResponseHandler;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/apache/http/client/ResponseHandler",
        "<",
        "Lcom/fasterxml/jackson/databind/JsonNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final b:Lcom/facebook/http/protocol/s;

.field private c:Lorg/apache/http/HttpResponse;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/http/protocol/s;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/http/protocol/al;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 30
    iput-object p2, p0, Lcom/facebook/http/protocol/al;->b:Lcom/facebook/http/protocol/s;

    .line 31
    return-void
.end method


# virtual methods
.method public a(Lorg/apache/http/HttpResponse;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 4

    .prologue
    .line 35
    iput-object p1, p0, Lcom/facebook/http/protocol/al;->c:Lorg/apache/http/HttpResponse;

    .line 36
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v2

    .line 38
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 39
    invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    .line 40
    const/16 v1, 0x12c

    if-lt v3, v1, :cond_3

    .line 41
    if-nez v0, :cond_2

    const/4 v0, 0x0

    move-object v1, v0

    .line 42
    :goto_0
    const/16 v0, 0x190

    if-ne v3, v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/facebook/http/protocol/al;->b:Lcom/facebook/http/protocol/s;

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/s;->a(Ljava/lang/String;)V

    .line 45
    :cond_0
    invoke-interface {v2}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v0

    .line 46
    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 48
    :cond_1
    new-instance v1, Lorg/apache/http/client/HttpResponseException;

    invoke-direct {v1, v3, v0}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V

    throw v1

    .line 41
    :cond_2
    invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 50
    :cond_3
    iget-object v1, p0, Lcom/facebook/http/protocol/al;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/io/InputStream;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    return-object v0
.end method

.method public a()Lorg/apache/http/HttpResponse;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/http/protocol/al;->c:Lorg/apache/http/HttpResponse;

    return-object v0
.end method

.method public synthetic handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lcom/facebook/http/protocol/al;->a(Lorg/apache/http/HttpResponse;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    return-object v0
.end method
