.class public Lcom/facebook/http/protocol/aw;
.super Ljava/lang/Object;
.source "StringResponseHandler.java"

# interfaces
.implements Lorg/apache/http/client/ResponseHandler;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/apache/http/client/ResponseHandler",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/http/protocol/s;

.field private b:Lorg/apache/http/HttpResponse;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/s;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/http/protocol/aw;->a:Lcom/facebook/http/protocol/s;

    .line 25
    return-void
.end method


# virtual methods
.method public a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/http/protocol/aw;->b:Lorg/apache/http/HttpResponse;

    .line 30
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    .line 32
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 34
    :goto_0
    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    .line 35
    const/16 v3, 0x12c

    if-lt v2, v3, :cond_3

    .line 36
    const/16 v3, 0x190

    if-ne v2, v3, :cond_0

    .line 37
    iget-object v3, p0, Lcom/facebook/http/protocol/aw;->a:Lcom/facebook/http/protocol/s;

    invoke-virtual {v3, v0}, Lcom/facebook/http/protocol/s;->a(Ljava/lang/String;)V

    .line 39
    :cond_0
    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v1

    .line 40
    if-eqz v0, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 42
    :goto_1
    new-instance v1, Lorg/apache/http/client/HttpResponseException;

    invoke-direct {v1, v2, v0}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V

    throw v1

    .line 33
    :cond_1
    invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 40
    goto :goto_1

    .line 44
    :cond_3
    return-object v0
.end method

.method public a()Lorg/apache/http/HttpResponse;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/http/protocol/aw;->b:Lorg/apache/http/HttpResponse;

    return-object v0
.end method

.method public synthetic handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p0, p1}, Lcom/facebook/http/protocol/aw;->a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
