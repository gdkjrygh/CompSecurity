.class public Lcom/facebook/orca/protocol/methods/bc;
.super Ljava/lang/Object;
.source "ThreadSummaryDeserializer.java"


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/aa;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/aa;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/protocol/methods/aa;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/bc;->a:Lcom/facebook/orca/protocol/methods/aa;

    .line 49
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/bc;->b:Ljavax/inject/a;

    .line 50
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 166
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/orca/protocol/methods/bc;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Ljava/util/Map;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Ljava/util/Map;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 174
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 175
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 176
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 177
    invoke-direct {p0, v0, p2, p3, p4}, Lcom/facebook/orca/protocol/methods/bc;->b(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Ljava/util/Map;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    .line 183
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/user/UserKey;->d()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 185
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 186
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 189
    :cond_1
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Ljava/util/Map;)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/facebook/orca/threads/ThreadParticipant;"
        }
    .end annotation

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/bc;->a:Lcom/facebook/orca/protocol/methods/aa;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/protocol/methods/aa;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    .line 200
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v2

    .line 202
    invoke-static {v2, v3}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 207
    :goto_0
    new-instance v2, Lcom/facebook/orca/threads/p;

    invoke-direct {v2}, Lcom/facebook/orca/threads/p;-><init>()V

    .line 208
    invoke-virtual {v2, p3}, Lcom/facebook/orca/threads/p;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/p;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/facebook/orca/threads/p;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/p;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/p;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/threads/p;

    .line 213
    if-eqz p4, :cond_0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 216
    if-eqz v0, :cond_0

    .line 217
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/threads/p;->a(J)Lcom/facebook/orca/threads/p;

    .line 220
    :cond_0
    invoke-virtual {v2}, Lcom/facebook/orca/threads/p;->f()Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    return-object v0

    .line 204
    :cond_1
    sget-object v0, Lcom/facebook/orca/notify/NotificationSetting;->a:Lcom/facebook/orca/notify/NotificationSetting;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 53
    new-instance v4, Lcom/facebook/orca/threads/v;

    invoke-direct {v4}, Lcom/facebook/orca/threads/v;-><init>()V

    .line 54
    const-string v0, "thread_id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 55
    invoke-virtual {v4, v5}, Lcom/facebook/orca/threads/v;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 56
    const-string v0, "thread_fbid"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 58
    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v0

    .line 59
    const-string v2, "action_id"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v6

    .line 60
    invoke-virtual {v4, v6, v7}, Lcom/facebook/orca/threads/v;->c(J)Lcom/facebook/orca/threads/v;

    .line 61
    invoke-virtual {v4, v0, v1}, Lcom/facebook/orca/threads/v;->d(J)Lcom/facebook/orca/threads/v;

    .line 62
    const-string v0, "snippet"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const-string v0, "snippet"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->d(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 65
    :cond_0
    const-string v0, "refetch_action_id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 66
    const-string v0, "refetch_action_id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/facebook/orca/threads/v;->a(J)Lcom/facebook/orca/threads/v;

    .line 70
    :goto_0
    const-string v0, "last_visible_add_action_id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 71
    const-string v0, "last_visible_add_action_id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/facebook/orca/threads/v;->b(J)Lcom/facebook/orca/threads/v;

    .line 75
    :goto_1
    const-string v0, "unread"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->b(Z)Lcom/facebook/orca/threads/v;

    .line 78
    const-string v0, "mute"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "mute"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 79
    const-string v0, "mute"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    move-object v1, v0

    .line 83
    :goto_2
    const-string v0, "pic_hash"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    const-string v0, "pic_hash"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 87
    :cond_1
    const-string v0, "read_receipts"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    .line 88
    const/4 v0, 0x0

    .line 89
    if-eqz v6, :cond_6

    .line 90
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/ik;->a(I)Ljava/util/HashMap;

    move-result-object v2

    .line 91
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 92
    const-string v7, "uid"

    invoke-virtual {v0, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v7

    invoke-static {v7}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v7

    .line 93
    new-instance v8, Lcom/facebook/user/UserKey;

    sget-object v9, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v8, v9, v7}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 94
    const-string v7, "time"

    invoke-virtual {v0, v7}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v9

    .line 95
    invoke-virtual {v8}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v2, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 68
    :cond_2
    invoke-virtual {v4, v6, v7}, Lcom/facebook/orca/threads/v;->a(J)Lcom/facebook/orca/threads/v;

    goto/16 :goto_0

    .line 73
    :cond_3
    invoke-virtual {v4, v6, v7}, Lcom/facebook/orca/threads/v;->b(J)Lcom/facebook/orca/threads/v;

    goto/16 :goto_1

    .line 81
    :cond_4
    sget-object v0, Lcom/fasterxml/jackson/databind/node/NullNode;->instance:Lcom/fasterxml/jackson/databind/node/NullNode;

    move-object v1, v0

    goto :goto_2

    :cond_5
    move-object v0, v2

    .line 99
    :cond_6
    const-string v2, "participants"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-direct {p0, v2, v1, v5, v0}, Lcom/facebook/orca/protocol/methods/bc;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Ljava/util/Map;)Lcom/google/common/a/es;

    move-result-object v0

    .line 101
    const-string v2, "former_participants"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-direct {p0, v2, v1, v5}, Lcom/facebook/orca/protocol/methods/bc;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v1

    .line 103
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/bc;->a:Lcom/facebook/orca/protocol/methods/aa;

    const-string v5, "object_participants"

    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/facebook/orca/protocol/methods/aa;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v2

    .line 105
    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->a(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 106
    invoke-virtual {v4, v1}, Lcom/facebook/orca/threads/v;->b(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 107
    invoke-virtual {v4, v2}, Lcom/facebook/orca/threads/v;->c(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/bc;->a:Lcom/facebook/orca/protocol/methods/aa;

    const-string v1, "senders"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/protocol/methods/aa;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    .line 111
    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->d(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 113
    const-string v0, "single_recipient"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 114
    if-eqz v1, :cond_e

    const/4 v0, 0x1

    :goto_4
    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->a(Z)Lcom/facebook/orca/threads/v;

    .line 115
    if-eqz v1, :cond_7

    .line 116
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v0, v5, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/v;

    .line 119
    :cond_7
    const-string v0, "pic"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 120
    const-string v0, "pic"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->a(Landroid/net/Uri;)Lcom/facebook/orca/threads/v;

    .line 123
    :cond_8
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 124
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 125
    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 128
    :cond_9
    const-string v0, "is_subscribed"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v1

    .line 129
    invoke-virtual {v4, v1}, Lcom/facebook/orca/threads/v;->d(Z)Lcom/facebook/orca/threads/v;

    .line 131
    const-string v0, "snippet_sender"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 132
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/bc;->a:Lcom/facebook/orca/protocol/methods/aa;

    const-string v5, "snippet_sender"

    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/facebook/orca/protocol/methods/aa;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 134
    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/v;

    .line 137
    :cond_a
    const-string v0, "admin_snippet"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 138
    const-string v0, "admin_snippet"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->e(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 142
    :cond_b
    const-string v0, "can_reply"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v0

    .line 143
    if-nez v1, :cond_c

    move v0, v3

    .line 146
    :cond_c
    invoke-virtual {v2}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-lez v1, :cond_f

    .line 150
    :goto_5
    invoke-virtual {v4, v3}, Lcom/facebook/orca/threads/v;->c(Z)Lcom/facebook/orca/threads/v;

    .line 152
    const-string v0, "folder"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 153
    const-string v0, "folder"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/bc;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 155
    invoke-static {v1}, Lcom/facebook/orca/threads/FolderType;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderType;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;Lcom/facebook/auth/viewercontext/ViewerContext;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/v;

    .line 159
    :cond_d
    invoke-virtual {v4}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0

    :cond_e
    move v0, v3

    .line 114
    goto/16 :goto_4

    :cond_f
    move v3, v0

    goto :goto_5
.end method

.method public a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 6

    .prologue
    .line 234
    const/4 v1, 0x0

    .line 235
    const-string v0, "object_participants"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 236
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 237
    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 238
    const-string v4, "object_address_type"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v4

    .line 239
    const/4 v5, 0x2

    if-ne v4, v5, :cond_2

    .line 240
    const-string v0, "id"

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 245
    :cond_0
    if-nez v1, :cond_3

    .line 259
    :cond_1
    :goto_1
    return-void

    .line 236
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 251
    :cond_3
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 252
    const-string v3, "id"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 253
    invoke-static {v3, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 254
    const-string v1, "name"

    const-string v2, "name"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 255
    const-string v1, "pic"

    const-string v2, "pic_big"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_1
.end method
