.class public Lcom/facebook/f/a;
.super Ljava/lang/Object;
.source "FetchGatekeepersMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/f/b;",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/f/b;Lcom/facebook/http/protocol/r;)Landroid/os/Bundle;
    .locals 6

    .prologue
    .line 57
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 58
    new-instance v1, Lcom/facebook/http/e/b;

    invoke-direct {v1, v0}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 59
    const-string v0, "gk"

    invoke-virtual {v1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 60
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 61
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 62
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 63
    const-string v4, "project_name"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 64
    const-string v5, "result"

    invoke-virtual {v3, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v3

    .line 65
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 61
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 67
    :cond_0
    return-object v2
.end method

.method public a(Lcom/facebook/f/b;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 31
    iget-object v1, p1, Lcom/facebook/f/b;->a:Lcom/google/common/a/fi;

    .line 32
    iget-object v0, p1, Lcom/facebook/f/b;->b:Lcom/facebook/f/c;

    sget-object v2, Lcom/facebook/f/c;->IS_SESSIONLESS:Lcom/facebook/f/c;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    move v2, v0

    .line 35
    :goto_0
    new-instance v0, Lcom/facebook/http/e/a;

    invoke-direct {v0}, Lcom/facebook/http/e/a;-><init>()V

    .line 36
    const-string v3, "gk"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT project_name, result FROM project_gating WHERE project_name IN "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 43
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "format"

    const-string v5, "json"

    invoke-direct {v1, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "queries"

    invoke-virtual {v0}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v0, Lcom/facebook/http/protocol/n;

    if-eqz v2, :cond_1

    const-string v1, "fetchSessionlessAppInfo"

    :goto_1
    if-eqz v2, :cond_2

    const-string v2, "POST"

    :goto_2
    const-string v3, "method/fql.multiquery"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0

    .line 32
    :cond_0
    const/4 v0, 0x0

    move v2, v0

    goto :goto_0

    .line 45
    :cond_1
    const-string v1, "fetchAppInfo"

    goto :goto_1

    :cond_2
    const-string v2, "GET"

    goto :goto_2
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lcom/facebook/f/b;

    invoke-virtual {p0, p1}, Lcom/facebook/f/a;->a(Lcom/facebook/f/b;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lcom/facebook/f/b;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/f/a;->a(Lcom/facebook/f/b;Lcom/facebook/http/protocol/r;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
