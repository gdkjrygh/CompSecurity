.class public Lcom/facebook/orca/protocol/methods/an;
.super Ljava/lang/Object;
.source "SendMessageParameterHelper.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/ui/media/attachments/d;

.field private final c:Lcom/facebook/ui/media/b/a;


# direct methods
.method public constructor <init>(Lcom/facebook/ui/media/attachments/d;Lcom/facebook/ui/media/b/a;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-class v0, Lcom/facebook/orca/protocol/methods/an;

    iput-object v0, p0, Lcom/facebook/orca/protocol/methods/an;->a:Ljava/lang/Class;

    .line 34
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/an;->b:Lcom/facebook/ui/media/attachments/d;

    .line 35
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/an;->c:Lcom/facebook/ui/media/b/a;

    .line 36
    return-void
.end method


# virtual methods
.method a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/http/protocol/ab;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 102
    if-nez p1, :cond_0

    .line 103
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/an;->a:Ljava/lang/Class;

    const-string v2, "No attachment found! Returning null..."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 113
    :goto_0
    return-object v0

    .line 107
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/an;->b:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, p1}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v1

    .line 108
    if-nez v1, :cond_1

    .line 109
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/an;->a:Ljava/lang/Class;

    const-string v2, "Unable to create an attachment from given resource"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 113
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/an;->c:Lcom/facebook/ui/media/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/b/a;->a(Lcom/facebook/ui/media/attachments/a;)Lcom/facebook/http/protocol/ab;

    move-result-object v0

    goto :goto_0
.end method

.method a(Lcom/facebook/messages/model/threads/Message;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 4

    .prologue
    .line 65
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 66
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 67
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    goto :goto_0

    .line 70
    :cond_0
    return-object v2
.end method

.method a(Ljava/util/List;Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;",
            "Lcom/facebook/messages/model/threads/Message;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 41
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "message"

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    invoke-virtual {p0, p2}, Lcom/facebook/orca/protocol/methods/an;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    .line 46
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "coordinates"

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->I()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 50
    invoke-virtual {p0, p2}, Lcom/facebook/orca/protocol/methods/an;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    .line 51
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "client_tags"

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_2
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 55
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "offline_threading_id"

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    :cond_3
    if-eqz p3, :cond_4

    .line 60
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "object_attachment"

    invoke-direct {v0, v1, p3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    :cond_4
    return-void
.end method

.method b(Lcom/facebook/messages/model/threads/Message;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 5

    .prologue
    .line 74
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    .line 76
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v2, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 77
    const-string v2, "latitude"

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;D)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 78
    const-string v2, "longitude"

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;D)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 79
    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 80
    const-string v2, "altitude"

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->d()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Double;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 82
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 83
    const-string v2, "accuracy"

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->f()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 85
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->k()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 86
    const-string v2, "heading"

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->j()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 88
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->m()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 89
    const-string v2, "speed"

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->l()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 91
    :cond_3
    return-object v1
.end method
