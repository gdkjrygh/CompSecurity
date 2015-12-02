.class public Lcom/facebook/push/c2dm/aa;
.super Ljava/lang/Object;
.source "RegisterPushTokenMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/push/c2dm/RegisterPushTokenParams;",
        "Lcom/facebook/push/c2dm/RegisterPushTokenResult;",
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
.method public a(Lcom/facebook/push/c2dm/RegisterPushTokenParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 30
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 31
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "return_structure"

    const-string v2, "1"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 34
    invoke-virtual {p1}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->a()Lcom/facebook/push/c2dm/z;

    move-result-object v1

    sget-object v2, Lcom/facebook/push/c2dm/z;->GCM:Lcom/facebook/push/c2dm/z;

    if-ne v1, v2, :cond_0

    .line 35
    const-string v1, "url"

    const-string v2, "https://android.googleapis.com/gcm/send"

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 37
    :cond_0
    const-string v1, "token"

    invoke-virtual {p1}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 38
    const-string v1, "device_id"

    invoke-virtual {p1}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 39
    const-string v1, "is_initial_reg"

    invoke-virtual {p1}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->d()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 40
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v2, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 41
    const-string v2, "android_build"

    invoke-virtual {p1}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->e()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 42
    const-string v2, "android_setting_mask"

    invoke-virtual {p1}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;->f()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 43
    const-string v2, "extra_data"

    invoke-virtual {v0, v2, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 44
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "protocol_params"

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "registerPush"

    const-string v2, "POST"

    const-string v3, "method/user.registerPushCallback"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 23
    check-cast p1, Lcom/facebook/push/c2dm/RegisterPushTokenParams;

    invoke-virtual {p0, p1}, Lcom/facebook/push/c2dm/aa;->a(Lcom/facebook/push/c2dm/RegisterPushTokenParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/push/c2dm/RegisterPushTokenParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/push/c2dm/RegisterPushTokenResult;
    .locals 5

    .prologue
    .line 58
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 59
    new-instance v1, Lcom/facebook/push/c2dm/RegisterPushTokenResult;

    const-string v2, "success"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v2

    const-string v3, "previously_disabled"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/push/c2dm/RegisterPushTokenResult;-><init>(ZZJ)V

    return-object v1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    check-cast p1, Lcom/facebook/push/c2dm/RegisterPushTokenParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/push/c2dm/aa;->a(Lcom/facebook/push/c2dm/RegisterPushTokenParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/push/c2dm/RegisterPushTokenResult;

    move-result-object v0

    return-object v0
.end method
