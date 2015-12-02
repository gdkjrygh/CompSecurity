.class public Lcom/facebook/orca/g/r;
.super Ljava/lang/Object;
.source "DbParticipantsSerialization.java"


# instance fields
.field private final a:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/facebook/orca/g/r;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 34
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 4

    .prologue
    .line 98
    const-string v0, "user_key"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 99
    new-instance v1, Lcom/facebook/messages/model/threads/ParticipantInfo;

    const-string v2, "name"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "email"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private a(Lcom/facebook/orca/threads/ThreadParticipant;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 4

    .prologue
    .line 123
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 124
    const-string v1, "email"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 125
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 126
    const-string v1, "user_key"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 128
    :cond_0
    const-string v1, "name"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 129
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->h()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 130
    const-string v1, "mute"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->h()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 132
    :cond_1
    const-string v1, "lastReadReceiptTimestampMs"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 133
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 134
    const-string v1, "lastDeliveredReceiptMsgId"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 136
    :cond_2
    return-object v0
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 4

    .prologue
    .line 140
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/r;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    .line 141
    const/4 v0, 0x0

    .line 142
    const-string v2, "mute"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 143
    const-string v0, "mute"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 145
    :cond_0
    new-instance v2, Lcom/facebook/orca/threads/p;

    invoke-direct {v2}, Lcom/facebook/orca/threads/p;-><init>()V

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/p;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/p;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/threads/p;

    move-result-object v0

    const-string v1, "lastReadReceiptTimestampMs"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/threads/p;->a(J)Lcom/facebook/orca/threads/p;

    move-result-object v0

    const-string v1, "lastDeliveredReceiptMsgId"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threads/p;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/p;->f()Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 3

    .prologue
    .line 54
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 55
    const-string v1, "email"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 57
    const-string v1, "user_key"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 59
    :cond_0
    const-string v1, "name"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 60
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 81
    if-nez p1, :cond_0

    .line 82
    const/4 v0, 0x0

    .line 85
    :goto_0
    return-object v0

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/g/r;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 85
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/r;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    goto :goto_0
.end method

.method a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    if-nez p1, :cond_0

    .line 39
    const/4 v0, 0x0

    .line 42
    :goto_0
    return-object v0

    .line 41
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/r;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method a(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 46
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 47
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 48
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/r;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method b(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/g/r;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 90
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 91
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 92
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/r;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method b(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 72
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 73
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 74
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/r;->a(Lcom/facebook/orca/threads/ThreadParticipant;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method c(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/g/r;->a:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 107
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 108
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 109
    invoke-direct {p0, v0}, Lcom/facebook/orca/g/r;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
