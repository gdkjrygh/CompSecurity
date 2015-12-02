.class public Lcom/facebook/contacts/g/a/e;
.super Ljava/lang/Object;
.source "FetchMessagingFavoritesMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Ljava/lang/Void;",
        "Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    const-string v0, "SELECT favorite_id, ordering FROM messaging_favorite WHERE uid=me() ORDER BY ordering ASC"

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;
    .locals 7

    .prologue
    .line 57
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 58
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 61
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 62
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 63
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 64
    new-instance v4, Lcom/facebook/user/o;

    invoke-direct {v4}, Lcom/facebook/user/o;-><init>()V

    .line 65
    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    const-string v6, "favorite_id"

    invoke-virtual {v3, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v5, v3}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    .line 66
    invoke-virtual {v4}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 62
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 69
    :cond_0
    new-instance v0, Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;J)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 32
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/a/e;->a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 37
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 38
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "query"

    invoke-direct {p0}, Lcom/facebook/contacts/g/a/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "fetchMessagingFavorites"

    const-string v2, "GET"

    const-string v3, "method/fql.query"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 32
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/a/e;->a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;

    move-result-object v0

    return-object v0
.end method
