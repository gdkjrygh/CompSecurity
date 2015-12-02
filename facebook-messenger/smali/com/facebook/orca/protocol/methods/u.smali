.class public Lcom/facebook/orca/protocol/methods/u;
.super Ljava/lang/Object;
.source "LookupUserMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Ljava/lang/String;",
        "Lcom/facebook/user/User;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 23
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/u;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 28
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 29
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "fields"

    const-string v2, "name,picture"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "lookupUser"

    const-string v2, "GET"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/facebook/http/protocol/r;)Lcom/facebook/user/User;
    .locals 3

    .prologue
    .line 41
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 42
    const-string v1, "name"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 43
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected response body to contain a name field."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    new-instance v1, Lcom/facebook/user/o;

    invoke-direct {v1}, Lcom/facebook/user/o;-><init>()V

    .line 47
    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v1, v2, p1}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    .line 48
    const-string v2, "name"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/o;->a(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 49
    const-string v2, "picture"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v2, "data"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v2, "url"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/o;->b(Ljava/lang/String;)Lcom/facebook/user/o;

    .line 50
    invoke-virtual {v1}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/u;->a(Ljava/lang/String;Lcom/facebook/http/protocol/r;)Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method
