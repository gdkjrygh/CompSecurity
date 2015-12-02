.class public Lcom/facebook/orca/protocol/methods/e;
.super Ljava/lang/Object;
.source "CreateThreadMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/protocol/methods/f;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/ad;

.field private final b:Lcom/facebook/orca/protocol/methods/an;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/ad;Lcom/facebook/orca/protocol/methods/an;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/e;->a:Lcom/facebook/orca/protocol/methods/ad;

    .line 52
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/e;->b:Lcom/facebook/orca/protocol/methods/an;

    .line 53
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/protocol/methods/f;)Lcom/facebook/http/protocol/n;
    .locals 11

    .prologue
    .line 57
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 59
    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/f;->a(Lcom/facebook/orca/protocol/methods/f;)Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    move-result-object v3

    .line 60
    invoke-virtual {v3}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "name"

    invoke-virtual {v3}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_0
    invoke-virtual {v3}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/e;->b:Lcom/facebook/orca/protocol/methods/an;

    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/f;->b(Lcom/facebook/orca/protocol/methods/f;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v1, v4}, Lcom/facebook/orca/protocol/methods/an;->a(Ljava/util/List;Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)V

    .line 67
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 68
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/f;->b(Lcom/facebook/orca/protocol/methods/f;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v0

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 72
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v6

    sget-object v7, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    if-ne v6, v7, :cond_1

    .line 75
    iget-object v6, p0, Lcom/facebook/orca/protocol/methods/e;->b:Lcom/facebook/orca/protocol/methods/an;

    invoke-virtual {v6, v0}, Lcom/facebook/orca/protocol/methods/an;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/http/protocol/ab;

    move-result-object v6

    .line 77
    new-instance v7, Lcom/facebook/orca/d/q;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "audio"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->g()J

    move-result-wide v9

    invoke-direct {v7, v8, v6, v9, v10}, Lcom/facebook/orca/d/q;-><init>(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;J)V

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_2
    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/f;->c(Lcom/facebook/orca/protocol/methods/f;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 82
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "media"

    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/f;->c(Lcom/facebook/orca/protocol/methods/f;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v1, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/e;->a:Lcom/facebook/orca/protocol/methods/ad;

    invoke-virtual {v3}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/methods/ad;->a(Ljava/util/List;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 87
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "to"

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-static {}, Lcom/facebook/http/protocol/n;->newBuilder()Lcom/facebook/http/protocol/p;

    move-result-object v0

    const-string v1, "createThread"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    const-string v1, "me/threads"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->c(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/p;->a(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    sget-object v1, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->a(Lcom/facebook/http/protocol/t;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/facebook/http/protocol/p;->b(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/p;->k()Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/orca/protocol/methods/f;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/e;->a(Lcom/facebook/orca/protocol/methods/f;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 28
    check-cast p1, Lcom/facebook/orca/protocol/methods/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/e;->a(Lcom/facebook/orca/protocol/methods/f;Lcom/facebook/http/protocol/r;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/protocol/methods/f;Lcom/facebook/http/protocol/r;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 101
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 102
    const-string v1, "tid"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
