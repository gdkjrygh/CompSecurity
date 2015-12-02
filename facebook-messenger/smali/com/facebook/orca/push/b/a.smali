.class public Lcom/facebook/orca/push/b/a;
.super Ljava/lang/Object;
.source "OrcaMqttPushHandler.java"

# interfaces
.implements Lcom/facebook/push/mqtt/av;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/push/b;

.field private final c:Lcom/facebook/orca/push/a/b;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/f/l;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/l/k;

.field private final f:Lcom/facebook/analytics/cn;

.field private final g:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final h:Lcom/facebook/orca/fbwebrtc/ag;

.field private final i:Lcom/facebook/auth/b/b;

.field private final j:Lcom/facebook/config/a/a;

.field private final k:Lcom/facebook/launcherbadges/a;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Lcom/facebook/orca/push/b/a;

    sput-object v0, Lcom/facebook/orca/push/b/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/push/b;Lcom/facebook/orca/push/a/b;Ljavax/inject/a;Lcom/facebook/l/k;Lcom/facebook/analytics/cn;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/orca/fbwebrtc/ag;Lcom/facebook/auth/b/b;Lcom/facebook/launcherbadges/a;Lcom/facebook/config/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/push/b;",
            "Lcom/facebook/orca/push/a/b;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/f/l;",
            ">;",
            "Lcom/facebook/l/k;",
            "Lcom/facebook/analytics/cn;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Lcom/facebook/orca/fbwebrtc/ag;",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/launcherbadges/a;",
            "Lcom/facebook/config/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/facebook/orca/push/b/a;->b:Lcom/facebook/orca/push/b;

    .line 69
    iput-object p2, p0, Lcom/facebook/orca/push/b/a;->c:Lcom/facebook/orca/push/a/b;

    .line 70
    iput-object p3, p0, Lcom/facebook/orca/push/b/a;->d:Ljavax/inject/a;

    .line 71
    iput-object p4, p0, Lcom/facebook/orca/push/b/a;->e:Lcom/facebook/l/k;

    .line 72
    iput-object p5, p0, Lcom/facebook/orca/push/b/a;->f:Lcom/facebook/analytics/cn;

    .line 73
    iput-object p6, p0, Lcom/facebook/orca/push/b/a;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 74
    iput-object p7, p0, Lcom/facebook/orca/push/b/a;->h:Lcom/facebook/orca/fbwebrtc/ag;

    .line 75
    iput-object p8, p0, Lcom/facebook/orca/push/b/a;->i:Lcom/facebook/auth/b/b;

    .line 76
    iput-object p9, p0, Lcom/facebook/orca/push/b/a;->k:Lcom/facebook/launcherbadges/a;

    .line 77
    iput-object p10, p0, Lcom/facebook/orca/push/b/a;->j:Lcom/facebook/config/a/a;

    .line 78
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v3, 0x78

    .line 229
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    .line 231
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 232
    :cond_0
    const/4 v0, 0x0

    .line 238
    :goto_0
    return-object v0

    .line 234
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v3, :cond_2

    .line 235
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 238
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/push/g;)V
    .locals 5

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->f:Lcom/facebook/analytics/cn;

    const-string v1, ""

    const-string v2, ""

    invoke-virtual {p1}, Lcom/facebook/push/g;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "invalid_payload"

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 5

    .prologue
    .line 124
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 125
    const-string v1, "message"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 127
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->c:Lcom/facebook/orca/push/a/b;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/push/a/b;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 128
    if-eqz v0, :cond_1

    .line 129
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    .line 130
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v2

    .line 131
    iget-object v3, p0, Lcom/facebook/orca/push/b/a;->e:Lcom/facebook/l/k;

    invoke-virtual {v3, v0}, Lcom/facebook/l/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 132
    iget-object v3, p0, Lcom/facebook/orca/push/b/a;->b:Lcom/facebook/orca/push/b;

    sget-object v4, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    invoke-virtual {v3, v2, v1, v0, v4}, Lcom/facebook/orca/push/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 134
    :cond_1
    sget-object v0, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->a(Lcom/facebook/push/g;)V

    goto :goto_0

    .line 136
    :cond_2
    const-string v1, "typ"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    const-string v0, "sender_fbid"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 138
    const-string v1, "state"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    .line 139
    iget-object v2, p0, Lcom/facebook/orca/push/b/a;->e:Lcom/facebook/l/k;

    new-instance v3, Lcom/facebook/user/UserKey;

    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v3, v4, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v1}, Lcom/facebook/l/k;->a(Lcom/facebook/user/UserKey;I)V

    goto :goto_0
.end method

.method private b(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 7

    .prologue
    .line 144
    const-string v0, "full"

    const-string v1, "list_type"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 146
    const-string v0, "list"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 147
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v2

    .line 148
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 149
    const-string v4, "u"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    .line 150
    const-string v5, "p"

    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    .line 151
    new-instance v5, Lcom/facebook/user/UserKey;

    sget-object v6, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v5, v6, v4}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->e:Lcom/facebook/l/k;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/l/k;->a(Ljava/util/Map;Z)V

    .line 154
    return-void
.end method

.method private c(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 8

    .prologue
    .line 157
    const-string v0, "event"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/l;

    .line 160
    const-string v2, "delivery_receipt"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 161
    const-string v1, "from_fbid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 162
    const-string v2, "mid"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 163
    const-string v3, "tid"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 164
    sget-object v4, Lcom/facebook/orca/push/b/a;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Received delivery_receipt from "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 165
    new-instance v4, Lcom/facebook/user/UserKey;

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v4, v5, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 166
    invoke-virtual {v0, v4, v3, v2}, Lcom/facebook/orca/f/l;->a(Lcom/facebook/user/UserKey;Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :cond_0
    :goto_0
    return-void

    .line 167
    :cond_1
    const-string v2, "read_receipt"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 168
    const-string v1, "reader_fbid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 169
    const-string v2, "timestamp"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v2

    .line 170
    const-string v4, "tid"

    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 171
    sget-object v5, Lcom/facebook/orca/push/b/a;->a:Ljava/lang/Class;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Received read_recept from "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 172
    new-instance v5, Lcom/facebook/user/UserKey;

    sget-object v6, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v5, v6, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 173
    invoke-virtual {v0, v5, v4, v2, v3}, Lcom/facebook/orca/f/l;->a(Lcom/facebook/user/UserKey;Ljava/lang/String;J)V

    goto :goto_0
.end method

.method private d(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 5

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->h:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    :goto_0
    return-void

    .line 185
    :cond_0
    const-string v0, "from"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 186
    const-string v1, "payload"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 187
    iget-object v2, p0, Lcom/facebook/orca/push/b/a;->h:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4, v1}, Lcom/facebook/orca/fbwebrtc/ag;->a(JLjava/lang/String;)V

    goto :goto_0
.end method

.method private e(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 6

    .prologue
    .line 194
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->h:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    :goto_0
    return-void

    .line 198
    :cond_0
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 199
    const-string v0, "errStr"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 200
    const-string v0, "errno"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v4

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->h:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v5, "MQTT"

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/fbwebrtc/ag;->a(JLjava/lang/String;ILjava/lang/String;)V

    goto :goto_0
.end method

.method private f(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 6

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->c:Lcom/facebook/orca/push/a/b;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/push/a/b;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;

    move-result-object v0

    .line 211
    if-nez v0, :cond_1

    .line 212
    sget-object v0, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->a(Lcom/facebook/push/g;)V

    .line 226
    :cond_0
    return-void

    .line 215
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 216
    if-nez v0, :cond_2

    .line 217
    sget-object v0, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->a(Lcom/facebook/push/g;)V

    goto :goto_0

    .line 220
    :cond_2
    iget-object v2, p0, Lcom/facebook/orca/push/b/a;->b:Lcom/facebook/orca/push/b;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    invoke-virtual {v2, v3, v4, v0, v5}, Lcom/facebook/orca/push/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    goto :goto_0
.end method

.method private g(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 2

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->j:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_0

    .line 243
    const-string v0, "unread"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    .line 244
    iget-object v1, p0, Lcom/facebook/orca/push/b/a;->k:Lcom/facebook/launcherbadges/a;

    invoke-interface {v1, v0}, Lcom/facebook/launcherbadges/a;->a(I)Lcom/facebook/common/w/q;

    .line 246
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[B)V
    .locals 4

    .prologue
    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/push/b/a;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-static {p2}, Lcom/facebook/common/w/n;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 85
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 86
    sget-object v1, Lcom/facebook/orca/push/b/a;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Publish:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 89
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/push/b/a;->i:Lcom/facebook/auth/b/b;

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-nez v1, :cond_2

    .line 90
    sget-object v0, Lcom/facebook/orca/push/b/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not logged in: throwing out Mqtt message. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 113
    :cond_1
    :goto_0
    return-void

    .line 94
    :cond_2
    const-string v1, "/orca_message_notifications"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "/orca_typing_notifications"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 96
    :cond_3
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 110
    :catch_0
    move-exception v0

    .line 111
    sget-object v1, Lcom/facebook/orca/push/b/a;->a:Ljava/lang/Class;

    const-string v2, "IOException"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 97
    :cond_4
    :try_start_1
    const-string v1, "/orca_presence"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 98
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->b(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_0

    .line 99
    :cond_5
    const-string v1, "/messaging_events"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 100
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->c(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_0

    .line 101
    :cond_6
    const-string v1, "/webrtc"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 102
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->d(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_0

    .line 103
    :cond_7
    const-string v1, "/webrtc_response"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 104
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->e(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_0

    .line 105
    :cond_8
    const-string v1, "/mercury"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 106
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->f(Lcom/fasterxml/jackson/databind/JsonNode;)V

    goto :goto_0

    .line 107
    :cond_9
    const-string v1, "/inbox"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 108
    invoke-direct {p0, v0}, Lcom/facebook/orca/push/b/a;->g(Lcom/fasterxml/jackson/databind/JsonNode;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
