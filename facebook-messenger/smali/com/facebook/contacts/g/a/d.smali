.class public Lcom/facebook/contacts/g/a/d;
.super Ljava/lang/Object;
.source "FetchLastActiveMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/FetchLastActiveParams;",
        "Lcom/facebook/contacts/server/FetchLastActiveResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/user/ac;

.field private final b:Lcom/facebook/contacts/server/w;


# direct methods
.method public constructor <init>(Lcom/facebook/user/ac;Lcom/facebook/contacts/server/w;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/contacts/g/a/d;->a:Lcom/facebook/user/ac;

    .line 38
    iput-object p2, p0, Lcom/facebook/contacts/g/a/d;->b:Lcom/facebook/contacts/server/w;

    .line 39
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/FetchLastActiveParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchLastActiveResult;
    .locals 5

    .prologue
    .line 60
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 61
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 63
    iget-object v1, p0, Lcom/facebook/contacts/g/a/d;->a:Lcom/facebook/user/ac;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    .line 65
    new-instance v1, Lcom/facebook/contacts/server/FetchLastActiveResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/contacts/server/FetchLastActiveResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;J)V

    return-object v1
.end method

.method public a(Lcom/facebook/contacts/server/FetchLastActiveParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 43
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 44
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "query"

    iget-object v2, p0, Lcom/facebook/contacts/g/a/d;->b:Lcom/facebook/contacts/server/w;

    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchLastActiveParams;->b()Ljava/util/EnumSet;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchLastActiveParams;->c()I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lcom/facebook/contacts/server/w;->a(Ljava/util/EnumSet;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchLastActiveMethod"

    const-string v2, "GET"

    const-string v3, "method/fql.query"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/contacts/server/FetchLastActiveParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/a/d;->a(Lcom/facebook/contacts/server/FetchLastActiveParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/contacts/server/FetchLastActiveParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/a/d;->a(Lcom/facebook/contacts/server/FetchLastActiveParams;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchLastActiveResult;

    move-result-object v0

    return-object v0
.end method
