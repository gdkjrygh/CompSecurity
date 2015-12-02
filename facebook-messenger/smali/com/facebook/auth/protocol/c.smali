.class public Lcom/facebook/auth/protocol/c;
.super Ljava/lang/Object;
.source "AuthenticateMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/auth/protocol/d;",
        "Lcom/facebook/auth/protocol/AuthenticationResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/auth/protocol/d;Lcom/facebook/http/protocol/r;)Lcom/facebook/auth/protocol/AuthenticationResult;
    .locals 10

    .prologue
    .line 70
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 71
    const-string v0, "uid"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 72
    const-string v0, "access_token"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 73
    const-string v0, "machine_id"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v9

    .line 74
    const-string v0, "secret"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v6

    .line 75
    const-string v0, "session_cookies"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 76
    const-string v0, "session_key"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v7

    .line 80
    invoke-static {p1}, Lcom/facebook/auth/protocol/d;->a(Lcom/facebook/auth/protocol/d;)Lcom/facebook/auth/credentials/PasswordCredentials;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/credentials/PasswordCredentials;->a()Ljava/lang/String;

    move-result-object v8

    .line 82
    new-instance v0, Lcom/facebook/auth/credentials/FacebookCredentials;

    const-wide/16 v3, 0x0

    if-nez v5, :cond_0

    const/4 v5, 0x0

    :goto_0
    invoke-direct/range {v0 .. v8}, Lcom/facebook/auth/credentials/FacebookCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    new-instance v2, Lcom/facebook/auth/protocol/AuthenticationResultImpl;

    invoke-direct {v2, v1, v0, v9}, Lcom/facebook/auth/protocol/AuthenticationResultImpl;-><init>(Ljava/lang/String;Lcom/facebook/auth/credentials/FacebookCredentials;Ljava/lang/String;)V

    return-object v2

    .line 82
    :cond_0
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0
.end method

.method public a(Lcom/facebook/auth/protocol/d;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 45
    invoke-static {p1}, Lcom/facebook/auth/protocol/d;->a(Lcom/facebook/auth/protocol/d;)Lcom/facebook/auth/credentials/PasswordCredentials;

    move-result-object v0

    .line 46
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 47
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "format"

    const-string v3, "json"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "email"

    invoke-virtual {v0}, Lcom/facebook/auth/credentials/PasswordCredentials;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "password"

    invoke-virtual {v0}, Lcom/facebook/auth/credentials/PasswordCredentials;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-static {p1}, Lcom/facebook/auth/protocol/d;->b(Lcom/facebook/auth/protocol/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "generate_session_cookies"

    const-string v2, "1"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    :cond_0
    invoke-static {p1}, Lcom/facebook/auth/protocol/d;->c(Lcom/facebook/auth/protocol/d;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 54
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "machine_id"

    invoke-static {p1}, Lcom/facebook/auth/protocol/d;->c(Lcom/facebook/auth/protocol/d;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    :goto_0
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "authenticate"

    const-string v2, "POST"

    const-string v3, "method/auth.login"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0

    .line 56
    :cond_1
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "generate_machine_id"

    const-string v2, "1"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 24
    check-cast p1, Lcom/facebook/auth/protocol/d;

    invoke-virtual {p0, p1}, Lcom/facebook/auth/protocol/c;->a(Lcom/facebook/auth/protocol/d;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 24
    check-cast p1, Lcom/facebook/auth/protocol/d;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/auth/protocol/c;->a(Lcom/facebook/auth/protocol/d;Lcom/facebook/http/protocol/r;)Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    return-object v0
.end method
