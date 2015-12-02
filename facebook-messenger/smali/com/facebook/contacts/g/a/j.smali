.class public Lcom/facebook/contacts/g/a/j;
.super Ljava/lang/Object;
.source "UpdateMessagingFavoritesMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 31
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p1}, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;->a()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 34
    add-int/lit8 v2, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move v1, v2

    goto :goto_0

    .line 37
    :cond_0
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

    const-string v1, "favorites"

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "updateMessagingFavorites"

    const-string v2, "POST"

    const-string v3, "/me/messagingfavorites"

    sget-object v5, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 25
    check-cast p1, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/a/j;->a(Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    check-cast p1, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/a/j;->a(Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 52
    const/4 v0, 0x0

    return-object v0
.end method
