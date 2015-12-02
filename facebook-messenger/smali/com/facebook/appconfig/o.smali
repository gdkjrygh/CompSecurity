.class public Lcom/facebook/appconfig/o;
.super Ljava/lang/Object;
.source "FetchAppConfigMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Ljava/lang/Void;",
        "Lcom/facebook/appconfig/AppConfig;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Lcom/facebook/config/a/a;Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string v0, "client_config"

    iput-object v0, p0, Lcom/facebook/appconfig/o;->a:Ljava/lang/String;

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT client_config FROM application WHERE app_id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/config/a/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/appconfig/o;->b:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/facebook/appconfig/o;->c:Lcom/facebook/common/time/a;

    .line 35
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Lcom/facebook/appconfig/AppConfig;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 55
    new-instance v2, Lcom/facebook/http/e/b;

    invoke-direct {v2, v1}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 56
    const-string v1, "info"

    invoke-virtual {v2, v1}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 57
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    .line 58
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing row"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 61
    const-string v2, "client_config"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "client_config"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 62
    const-string v2, "client_config"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 63
    iget-object v2, p0, Lcom/facebook/appconfig/o;->c:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 64
    if-eqz v1, :cond_2

    new-instance v0, Lcom/facebook/appconfig/AppConfig;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/appconfig/AppConfig;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;J)V

    .line 66
    :cond_2
    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 24
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/appconfig/o;->a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 39
    new-instance v0, Lcom/facebook/http/e/a;

    invoke-direct {v0}, Lcom/facebook/http/e/a;-><init>()V

    .line 40
    const-string v1, "info"

    iget-object v2, p0, Lcom/facebook/appconfig/o;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 42
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "format"

    const-string v3, "json"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "queries"

    invoke-virtual {v0}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchAppInfo"

    const-string v2, "GET"

    const-string v3, "method/fql.multiquery"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 24
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/appconfig/o;->a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Lcom/facebook/appconfig/AppConfig;

    move-result-object v0

    return-object v0
.end method
