.class public Lcom/facebook/orca/protocol/methods/j;
.super Ljava/lang/Object;
.source "FetchMessageMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Ljava/lang/String;",
        "Lcom/facebook/orca/server/FetchMessageResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/p;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/p;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/j;->a:Lcom/facebook/orca/protocol/methods/p;

    .line 31
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 62
    new-instance v0, Lcom/facebook/http/e/a;

    invoke-direct {v0}, Lcom/facebook/http/e/a;-><init>()V

    .line 64
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/j;->a:Lcom/facebook/orca/protocol/methods/p;

    const-string v2, "message_id=\'%1s\'"

    new-array v3, v5, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "timestamp DESC"

    invoke-virtual {v1, v0, v2, v3, v5}, Lcom/facebook/orca/protocol/methods/p;->b(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 70
    invoke-virtual {v0}, Lcom/facebook/http/e/a;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 25
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/j;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 35
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 36
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "q"

    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchMoreMessages"

    const-string v2, "GET"

    const-string v3, "fql"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchMessageResult;
    .locals 5

    .prologue
    .line 49
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 51
    new-instance v1, Lcom/facebook/http/e/b;

    invoke-direct {v1, v0}, Lcom/facebook/http/e/b;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 52
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/j;->a:Lcom/facebook/orca/protocol/methods/p;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/protocol/methods/p;->b(Lcom/facebook/http/e/b;I)Lcom/facebook/orca/protocol/methods/q;

    move-result-object v0

    .line 55
    new-instance v1, Lcom/facebook/orca/server/FetchMessageResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    iget-object v3, v0, Lcom/facebook/orca/protocol/methods/q;->a:Lcom/google/common/a/es;

    invoke-virtual {v3}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/orca/server/FetchMessageResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/messages/model/threads/Message;J)V

    return-object v1

    :cond_0
    iget-object v0, v0, Lcom/facebook/orca/protocol/methods/q;->a:Lcom/google/common/a/es;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/j;->a(Ljava/lang/String;Lcom/facebook/http/protocol/r;)Lcom/facebook/orca/server/FetchMessageResult;

    move-result-object v0

    return-object v0
.end method
