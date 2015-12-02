.class public Lcom/facebook/http/protocol/ac;
.super Ljava/lang/Object;
.source "CustomResponseHandlerForBatch.java"


# instance fields
.field private final a:Lcom/facebook/http/protocol/s;

.field private b:I

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/s;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/http/protocol/ac;->a:Lcom/facebook/http/protocol/s;

    .line 28
    return-void
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 55
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 56
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 57
    const-string v3, "name"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 58
    const-string v4, "value"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 59
    new-instance v4, Lorg/apache/http/message/BasicHeader;

    invoke-direct {v4, v3, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 61
    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 31
    const-string v0, "headers"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/http/protocol/ac;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/ac;->c:Ljava/util/List;

    .line 33
    const-string v0, "code"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    iput v0, p0, Lcom/facebook/http/protocol/ac;->b:I

    .line 34
    const-string v0, "body"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 35
    iget v1, p0, Lcom/facebook/http/protocol/ac;->b:I

    const/16 v2, 0x12c

    if-lt v1, v2, :cond_1

    .line 36
    iget v1, p0, Lcom/facebook/http/protocol/ac;->b:I

    const/16 v2, 0x190

    if-ne v1, v2, :cond_0

    .line 37
    iget-object v1, p0, Lcom/facebook/http/protocol/ac;->a:Lcom/facebook/http/protocol/s;

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/s;->a(Ljava/lang/String;)V

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    new-instance v1, Lorg/apache/http/client/HttpResponseException;

    iget v2, p0, Lcom/facebook/http/protocol/ac;->b:I

    invoke-direct {v1, v2, v0}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V

    throw v1

    .line 42
    :cond_1
    return-object v0
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/Header;",
            ">;"
        }
    .end annotation

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/http/protocol/ac;->c:Ljava/util/List;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/facebook/http/protocol/ac;->b:I

    return v0
.end method
