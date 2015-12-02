.class public Lcom/facebook/orca/push/a/b;
.super Ljava/lang/Object;
.source "PushDeserialization.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


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
.field private final b:Lcom/facebook/orca/k/a;

.field private final c:Lcom/facebook/orca/protocol/methods/bb;

.field private final d:Lcom/facebook/orca/sms/bn;

.field private final e:Lcom/facebook/orca/sms/bk;

.field private final f:Lcom/facebook/orca/threads/a;

.field private final g:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/facebook/orca/push/a/b;

    sput-object v0, Lcom/facebook/orca/push/a/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/k/a;Lcom/facebook/orca/protocol/methods/bb;Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/sms/bk;Lcom/facebook/orca/threads/a;Lcom/fasterxml/jackson/databind/ObjectMapper;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/k/a;",
            "Lcom/facebook/orca/protocol/methods/bb;",
            "Lcom/facebook/orca/sms/bn;",
            "Lcom/facebook/orca/sms/bk;",
            "Lcom/facebook/orca/threads/a;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/facebook/orca/push/a/b;->b:Lcom/facebook/orca/k/a;

    .line 62
    iput-object p2, p0, Lcom/facebook/orca/push/a/b;->c:Lcom/facebook/orca/protocol/methods/bb;

    .line 63
    iput-object p3, p0, Lcom/facebook/orca/push/a/b;->d:Lcom/facebook/orca/sms/bn;

    .line 64
    iput-object p4, p0, Lcom/facebook/orca/push/a/b;->e:Lcom/facebook/orca/sms/bk;

    .line 65
    iput-object p5, p0, Lcom/facebook/orca/push/a/b;->f:Lcom/facebook/orca/threads/a;

    .line 66
    iput-object p6, p0, Lcom/facebook/orca/push/a/b;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 67
    iput-object p7, p0, Lcom/facebook/orca/push/a/b;->h:Ljavax/inject/a;

    .line 68
    return-void
.end method

.method private a(JLcom/fasterxml/jackson/databind/JsonNode;)J
    .locals 2

    .prologue
    .line 361
    const-string v0, "action_id"

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 363
    const-string v0, "action_id"

    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v0

    .line 366
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/push/a/b;->f:Lcom/facebook/orca/threads/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/threads/a;->a(J)J

    move-result-wide v0

    goto :goto_0
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 348
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 349
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v2

    .line 350
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 351
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v3

    .line 352
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 353
    new-instance v6, Lcom/facebook/user/UserKey;

    sget-object v7, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v7, v3}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 354
    new-instance v3, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-direct {v3, v6, v5}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 350
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 357
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 281
    if-eqz p1, :cond_0

    const-string v1, "fbid:"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 288
    :cond_0
    :goto_0
    return-object v0

    .line 284
    :cond_1
    const-string v1, ":"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 285
    array-length v2, v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 288
    const/4 v0, 0x1

    aget-object v0, v1, v0

    goto :goto_0
.end method

.method private c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/Message;
    .locals 8

    .prologue
    const-wide/16 v5, 0x0

    const/4 v1, 0x0

    .line 234
    const-string v0, "log_message_data"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 235
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move-object v0, v1

    .line 268
    :goto_0
    return-object v0

    .line 239
    :cond_1
    const-string v2, "answered"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Z)Z

    move-result v2

    .line 240
    const-string v3, "caller"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/push/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 241
    if-nez v0, :cond_2

    move-object v0, v1

    .line 242
    goto :goto_0

    .line 244
    :cond_2
    iget-object v3, p0, Lcom/facebook/orca/push/a/b;->h:Ljavax/inject/a;

    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 246
    if-nez v2, :cond_3

    .line 247
    const/16 v0, 0x65

    .line 254
    :goto_1
    const-string v2, "author"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/orca/push/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 255
    if-nez v2, :cond_5

    move-object v0, v1

    .line 256
    goto :goto_0

    .line 248
    :cond_3
    if-eqz v0, :cond_4

    .line 249
    const/16 v0, 0x66

    goto :goto_1

    .line 251
    :cond_4
    const/16 v0, 0x64

    goto :goto_1

    .line 258
    :cond_5
    new-instance v3, Lcom/facebook/user/UserKey;

    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v3, v4, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 260
    new-instance v2, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-direct {v2, v3, v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    .line 262
    const-string v1, "log_message_body"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 263
    const-string v3, "timestamp"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3, v5, v6}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 264
    const-string v4, "action_id"

    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4, v5, v6}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 265
    const-string v5, "message_id"

    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 266
    const-string v6, "thread_id"

    invoke-virtual {p1, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v6

    .line 268
    new-instance v7, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v7}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v7, v0}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/messages/model/threads/e;->c(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/GroupMessageInfo;
    .locals 7
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 292
    const-string v1, "gpc"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 314
    :goto_0
    return-object v0

    .line 295
    :cond_0
    sget-object v1, Lcom/facebook/orca/push/a/b;->a:Ljava/lang/Class;

    const-string v2, "Deserializing GroupMessageInfo for C2DM."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 297
    const-string v1, "gpc"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    .line 298
    const-string v2, "gpi"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 299
    const-string v3, "gpn"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 300
    const-string v4, "gn"

    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 301
    const-string v5, "gp"

    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 307
    :try_start_0
    iget-object v6, p0, Lcom/facebook/orca/push/a/b;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v6, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 308
    iget-object v6, p0, Lcom/facebook/orca/push/a/b;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v6, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 314
    new-instance v0, Lcom/facebook/messages/model/threads/GroupMessageInfo;

    invoke-direct {p0, v2, v3}, Lcom/facebook/orca/push/a/b;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v0, v1, v2, v4, v5}, Lcom/facebook/messages/model/threads/GroupMessageInfo;-><init>(ILcom/google/common/a/es;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 309
    :catch_0
    move-exception v1

    .line 310
    sget-object v1, Lcom/facebook/orca/push/a/b;->a:Ljava/lang/Class;

    const-string v2, "Error deserializing ids and names. Return no group info."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/GroupMessageInfo;
    .locals 6
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 322
    const-string v1, "group_thread_info"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 339
    :cond_0
    :goto_0
    return-object v0

    .line 326
    :cond_1
    const-string v1, "group_thread_info"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 327
    const-string v2, "participant_total_count"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 331
    sget-object v0, Lcom/facebook/orca/push/a/b;->a:Ljava/lang/Class;

    const-string v2, "Deserializing GroupMessageInfo for MQTT."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 333
    const-string v0, "participant_total_count"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v2

    .line 334
    const-string v0, "participant_ids"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 335
    const-string v0, "participant_names"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    .line 336
    const-string v0, "name"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 337
    const-string v0, "pic_hash"

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 339
    new-instance v0, Lcom/facebook/messages/model/threads/GroupMessageInfo;

    invoke-direct {p0, v3, v4}, Lcom/facebook/orca/push/a/b;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v3

    invoke-direct {v0, v2, v3, v5, v1}, Lcom/facebook/messages/model/threads/GroupMessageInfo;-><init>(ILcom/google/common/a/es;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/telephony/SmsMessage;JLjava/lang/String;J)Lcom/facebook/messages/model/threads/Message;
    .locals 7

    .prologue
    .line 140
    invoke-virtual {p1}, Landroid/telephony/SmsMessage;->getOriginatingAddress()Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-virtual {p1}, Landroid/telephony/SmsMessage;->getPseudoSubject()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 142
    iget-object v2, p0, Lcom/facebook/orca/push/a/b;->d:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v2, p2, p3}, Lcom/facebook/orca/sms/bn;->a(J)J

    move-result-wide v2

    .line 143
    iget-object v4, p0, Lcom/facebook/orca/push/a/b;->e:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v0

    .line 144
    iget-object v4, p0, Lcom/facebook/orca/push/a/b;->e:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/sms/bk;->a(Lcom/facebook/user/User;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 146
    invoke-static {v2, v3}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v2

    .line 147
    invoke-static {p2, p3}, Lcom/facebook/orca/threads/m;->b(J)Ljava/lang/String;

    move-result-object v3

    .line 148
    invoke-virtual {p1}, Landroid/telephony/SmsMessage;->getTimestampMillis()J

    move-result-wide v4

    .line 149
    iget-object v6, p0, Lcom/facebook/orca/push/a/b;->f:Lcom/facebook/orca/threads/a;

    invoke-virtual {v6, v4, v5}, Lcom/facebook/orca/threads/a;->a(J)J

    move-result-wide v4

    .line 150
    new-instance v6, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v6}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v6, v3}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, p4}, Lcom/facebook/messages/model/threads/e;->d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, p5, p6}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, p5, p6}, Lcom/facebook/messages/model/threads/e;->d(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Lcom/facebook/messages/model/threads/e;->c(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/messages/model/threads/c;->SMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const-string v1, "sms"

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/Message;
    .locals 12

    .prologue
    const/4 v0, 0x0

    .line 166
    const-string v1, "sender_fbid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 167
    const-string v2, "0"

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 195
    :goto_0
    return-object v0

    .line 172
    :cond_0
    const-string v2, "body"

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 173
    const-string v3, "tid"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    .line 174
    const-string v4, "mid"

    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 175
    const-string v5, "offline_threading_id"

    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v5

    .line 177
    invoke-static {v5}, Lcom/facebook/common/w/n;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 178
    const-string v6, "sender_name"

    invoke-virtual {p1, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->path(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v6

    .line 179
    new-instance v7, Lcom/facebook/messages/model/threads/ParticipantInfo;

    new-instance v8, Lcom/facebook/user/UserKey;

    sget-object v9, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v8, v9, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v9, "@facebook.com"

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v8, v6, v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string v1, "coordinates"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "coordinates"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->isNull()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "coordinates"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/push/a/b;->b:Lcom/facebook/orca/k/a;

    const-string v1, "coordinates"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/k/a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/location/Coordinates;

    move-result-object v0

    .line 191
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/push/a/b;->c:Lcom/facebook/orca/protocol/methods/bb;

    const-string v6, "api_tags"

    invoke-virtual {p1, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/facebook/orca/protocol/methods/bb;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 192
    const-string v6, "timestamp"

    invoke-virtual {p1, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v8

    .line 193
    invoke-direct {p0, v8, v9, p1}, Lcom/facebook/orca/push/a/b;->a(JLcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v10

    .line 195
    new-instance v6, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v6}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v6, v4}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/facebook/messages/model/threads/e;->e(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/facebook/messages/model/threads/e;->d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Lcom/facebook/messages/model/threads/e;->c(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/location/Coordinates;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/messages/model/threads/c;->MQTT:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/facebook/orca/push/a/b;->e(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/GroupMessageInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/GroupMessageInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/Message;
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x2

    const/4 v9, 0x1

    .line 71
    const-string v0, "uid"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 72
    const-string v0, "0"

    invoke-static {v2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez v2, :cond_1

    .line 120
    :cond_0
    :goto_0
    return-object v1

    .line 79
    :cond_1
    if-eqz p1, :cond_4

    .line 80
    const-string v0, ":"

    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 81
    array-length v0, v3

    if-ne v0, v4, :cond_3

    .line 82
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 83
    aget-object v3, v3, v9

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 93
    :goto_1
    const-string v3, "unified_tid"

    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/orca/threads/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 95
    const-string v4, "n"

    invoke-virtual {p2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/orca/threads/m;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 97
    new-instance v5, Lcom/facebook/messages/model/threads/ParticipantInfo;

    new-instance v6, Lcom/facebook/user/UserKey;

    sget-object v7, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v6, v7, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v7, "@facebook.com"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v6, v0, v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v0, "o"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 104
    const-string v0, "o"

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_2
    move-object v0, v1

    .line 117
    :goto_2
    const-string v1, "s"

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v1

    .line 118
    invoke-direct {p0, v1, v2, p2}, Lcom/facebook/orca/push/a/b;->a(JLcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v6

    .line 120
    new-instance v8, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v8}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v8, v4}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/facebook/messages/model/threads/e;->d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Lcom/facebook/messages/model/threads/e;->c(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v9}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/messages/model/threads/c;->C2DM:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-direct {p0, p2}, Lcom/facebook/orca/push/a/b;->d(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/GroupMessageInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/GroupMessageInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    goto/16 :goto_0

    .line 85
    :cond_3
    const-string v0, ""

    goto/16 :goto_1

    .line 89
    :cond_4
    const-string v0, ""

    .line 90
    const-string p1, ""

    goto/16 :goto_1

    .line 106
    :pswitch_0
    const-string v0, "web"

    goto :goto_2

    .line 109
    :pswitch_1
    const-string v0, "mobile"

    goto :goto_2

    .line 112
    :pswitch_2
    const-string v0, "messenger"

    goto :goto_2

    .line 104
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 212
    const-string v0, "actions"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 213
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->isArray()Z

    move-result v0

    if-nez v0, :cond_1

    .line 214
    :cond_0
    const/4 v0, 0x0

    .line 230
    :goto_0
    return-object v0

    .line 217
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 218
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 219
    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    .line 220
    const-string v4, "log_message_type"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    .line 221
    const-string v5, "log:phone-call"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 222
    invoke-direct {p0, v3}, Lcom/facebook/orca/push/a/b;->c(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 223
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 230
    goto :goto_0
.end method
