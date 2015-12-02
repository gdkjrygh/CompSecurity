.class public Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;
.super Ljava/lang/Object;
.source "SendBroadcastMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/protocol/methods/aj;",
        "Lcom/google/common/a/ev",
        "<",
        "Ljava/lang/String;",
        "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/ad;

.field private final b:Lcom/facebook/orca/protocol/methods/an;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/ad;Lcom/facebook/orca/protocol/methods/an;)V
    .locals 0

    .prologue
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;->a:Lcom/facebook/orca/protocol/methods/ad;

    .line 96
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;->b:Lcom/facebook/orca/protocol/methods/an;

    .line 97
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/protocol/methods/aj;)Lcom/facebook/http/protocol/n;
    .locals 5

    .prologue
    .line 101
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 103
    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/aj;->a(Lcom/facebook/orca/protocol/methods/aj;)Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    move-result-object v1

    .line 105
    invoke-virtual {v1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 106
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "name"

    invoke-virtual {v1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_0
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "is_broadcast"

    const-string v4, "1"

    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    invoke-virtual {v1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 110
    iget-object v3, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;->b:Lcom/facebook/orca/protocol/methods/an;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v2, v4}, Lcom/facebook/orca/protocol/methods/an;->a(Ljava/util/List;Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)V

    .line 113
    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/aj;->b(Lcom/facebook/orca/protocol/methods/aj;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 114
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "media"

    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/aj;->b(Lcom/facebook/orca/protocol/methods/aj;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;->a:Lcom/facebook/orca/protocol/methods/ad;

    invoke-virtual {v1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/orca/protocol/methods/ad;->a(Ljava/util/List;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 119
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "to"

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    invoke-static {}, Lcom/facebook/http/protocol/n;->newBuilder()Lcom/facebook/http/protocol/p;

    move-result-object v1

    const-string v2, "sendBroadcast"

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/p;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v1

    const-string v2, "POST"

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/p;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v1

    const-string v2, "me/threads"

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/p;->c(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/p;->a(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    sget-object v1, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->a(Lcom/facebook/http/protocol/t;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/p;->k()Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 33
    check-cast p1, Lcom/facebook/orca/protocol/methods/aj;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;->a(Lcom/facebook/orca/protocol/methods/aj;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/protocol/methods/aj;Lcom/facebook/http/protocol/r;)Lcom/google/common/a/ev;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/protocol/methods/aj;",
            "Lcom/facebook/http/protocol/r;",
            ")",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 134
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 135
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v3

    .line 136
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object v4

    .line 137
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 139
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 140
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 141
    const-string v2, "error_code"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v5

    .line 142
    const/4 v2, 0x0

    .line 143
    if-nez v5, :cond_1

    .line 144
    const-string v2, "result"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v2, "tid"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 146
    :goto_1
    new-instance v2, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;

    invoke-direct {v2, v5, v0}, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;-><init>(ILjava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 148
    :cond_0
    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v0, v2

    goto :goto_1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    check-cast p1, Lcom/facebook/orca/protocol/methods/aj;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;->a(Lcom/facebook/orca/protocol/methods/aj;Lcom/facebook/http/protocol/r;)Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method
