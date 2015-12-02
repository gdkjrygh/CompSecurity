.class public Lcom/facebook/contacts/g/a/g;
.super Ljava/lang/Object;
.source "FetchVoipInfoMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/FetchVoipInfoParams;",
        "Lcom/facebook/contacts/server/FetchVoipInfoResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/FetchVoipInfoParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchVoipInfoResult;
    .locals 5

    .prologue
    .line 43
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 45
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 46
    const-string v1, "voip_info"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 47
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected response body to contain a voip_info field."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_0
    const-string v1, "voip_info"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 50
    const-string v0, "is_callable"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 51
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected voip_info to contain is_callable field."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_1
    const-string v0, "is_callable"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->g(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v2

    .line 54
    const/4 v0, 0x0

    .line 55
    if-nez v2, :cond_2

    const-string v3, "reason_description"

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 56
    const-string v0, "reason_description"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 59
    :cond_2
    new-instance v1, Lcom/facebook/contacts/server/FetchVoipInfoResult;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/contacts/server/FetchVoipInfoResult;-><init>(ZLjava/lang/String;J)V

    return-object v1
.end method

.method public a(Lcom/facebook/contacts/server/FetchVoipInfoParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 28
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 29
    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchVoipInfoParams;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    .line 30
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "fields"

    const-string v2, "voip_info"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "lookupUserVoipInfo"

    const-string v2, "GET"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 24
    check-cast p1, Lcom/facebook/contacts/server/FetchVoipInfoParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/a/g;->a(Lcom/facebook/contacts/server/FetchVoipInfoParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 24
    check-cast p1, Lcom/facebook/contacts/server/FetchVoipInfoParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/a/g;->a(Lcom/facebook/contacts/server/FetchVoipInfoParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchVoipInfoResult;

    move-result-object v0

    return-object v0
.end method
