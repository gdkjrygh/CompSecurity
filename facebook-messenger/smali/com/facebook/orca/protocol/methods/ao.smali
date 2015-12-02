.class public Lcom/facebook/orca/protocol/methods/ao;
.super Ljava/lang/Object;
.source "SendViaChatHandler.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/push/mqtt/bx;

.field private final c:Lcom/facebook/orca/f/n;

.field private final d:Lcom/facebook/orca/protocol/methods/an;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/a/j;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final g:Lcom/facebook/c/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/push/mqtt/bx;Lcom/facebook/orca/f/n;Lcom/facebook/orca/protocol/methods/an;Ljavax/inject/a;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/c/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/push/mqtt/bx;",
            "Lcom/facebook/orca/f/n;",
            "Lcom/facebook/orca/protocol/methods/an;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/a/j;",
            ">;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Lcom/facebook/c/j;",
            ")V"
        }
    .end annotation

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/ao;->a:Landroid/content/Context;

    .line 57
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/ao;->b:Lcom/facebook/push/mqtt/bx;

    .line 58
    iput-object p3, p0, Lcom/facebook/orca/protocol/methods/ao;->c:Lcom/facebook/orca/f/n;

    .line 59
    iput-object p4, p0, Lcom/facebook/orca/protocol/methods/ao;->d:Lcom/facebook/orca/protocol/methods/an;

    .line 60
    iput-object p5, p0, Lcom/facebook/orca/protocol/methods/ao;->e:Ljavax/inject/a;

    .line 61
    iput-object p6, p0, Lcom/facebook/orca/protocol/methods/ao;->f:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 62
    iput-object p7, p0, Lcom/facebook/orca/protocol/methods/ao;->g:Lcom/facebook/c/j;

    .line 63
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/protocol/methods/ao;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ao;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/protocol/methods/ao;)Lcom/facebook/c/j;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ao;->g:Lcom/facebook/c/j;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/protocol/methods/ao;)Lcom/fasterxml/jackson/databind/ObjectMapper;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ao;->f:Lcom/fasterxml/jackson/databind/ObjectMapper;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/user/UserKey;)Lcom/facebook/orca/protocol/methods/ar;
    .locals 14

    .prologue
    .line 68
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ao;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/j;

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/ao;->b:Lcom/facebook/push/mqtt/bx;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/bx;->a()Lcom/facebook/push/mqtt/bw;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v11

    .line 74
    :try_start_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 75
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_ATTACHMENT:Lcom/facebook/orca/protocol/methods/at;

    invoke-static {v0}, Lcom/facebook/orca/protocol/methods/ar;->a(Lcom/facebook/orca/protocol/methods/at;)Lcom/facebook/orca/protocol/methods/ar;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 163
    :try_start_2
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 166
    :goto_0
    return-object v0

    .line 76
    :cond_0
    :try_start_3
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 77
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_SKIPPED_NOT_CONNECTED:Lcom/facebook/orca/protocol/methods/at;

    invoke-static {v0}, Lcom/facebook/orca/protocol/methods/ar;->a(Lcom/facebook/orca/protocol/methods/at;)Lcom/facebook/orca/protocol/methods/ar;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v0

    .line 163
    :try_start_4
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    .line 165
    :catch_0
    move-exception v0

    .line 166
    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/protocol/methods/ar;->a(Ljava/lang/Exception;I)Lcom/facebook/orca/protocol/methods/ar;

    move-result-object v0

    goto :goto_0

    .line 80
    :cond_1
    :try_start_5
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 83
    if-eqz p2, :cond_5

    .line 84
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    .line 88
    :goto_1
    const-string v3, "to"

    invoke-virtual {v2, v3, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 89
    const-string v1, "body"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 90
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 91
    const-string v1, "msgid"

    invoke-virtual {v2, v1, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 92
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 93
    const-string v1, "coordinates"

    iget-object v5, p0, Lcom/facebook/orca/protocol/methods/ao;->d:Lcom/facebook/orca/protocol/methods/an;

    invoke-virtual {v5, p1}, Lcom/facebook/orca/protocol/methods/an;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 97
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->I()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 98
    const-string v1, "client_tags"

    iget-object v5, p0, Lcom/facebook/orca/protocol/methods/ao;->d:Lcom/facebook/orca/protocol/methods/an;

    invoke-virtual {v5, p1}, Lcom/facebook/orca/protocol/methods/an;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 101
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 102
    const-string v1, "object_attachment"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 105
    :cond_4
    new-instance v1, Lcom/facebook/orca/protocol/methods/ap;

    invoke-direct {v1, p0, v3, v4}, Lcom/facebook/orca/protocol/methods/ap;-><init>(Lcom/facebook/orca/protocol/methods/ao;J)V

    .line 106
    invoke-virtual {v1}, Lcom/facebook/orca/protocol/methods/ap;->a()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 109
    :try_start_6
    iget-wide v5, v0, Lcom/facebook/orca/a/j;->b:J

    .line 110
    iget-wide v7, v0, Lcom/facebook/orca/a/j;->c:J

    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 113
    const-string v0, "/send_message2"

    invoke-virtual {v11, v0, v2, v5, v6}, Lcom/facebook/push/mqtt/bw;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;J)Z

    move-result v0

    .line 116
    if-nez v0, :cond_6

    .line 117
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_PUBLISH_FAILED:Lcom/facebook/orca/protocol/methods/at;

    invoke-static {v1}, Lcom/facebook/orca/protocol/methods/ap;->a(Lcom/facebook/orca/protocol/methods/ap;)I

    move-result v2

    invoke-static {v0, v2}, Lcom/facebook/orca/protocol/methods/ar;->a(Lcom/facebook/orca/protocol/methods/at;I)Lcom/facebook/orca/protocol/methods/ar;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v0

    .line 140
    :try_start_7
    invoke-virtual {v1}, Lcom/facebook/orca/protocol/methods/ap;->b()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 163
    :try_start_8
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto/16 :goto_0

    .line 86
    :cond_5
    :try_start_9
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    move-result-object v1

    goto :goto_1

    .line 122
    :cond_6
    :try_start_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long v9, v12, v9

    .line 123
    add-long/2addr v5, v7

    sub-long/2addr v5, v9

    .line 125
    invoke-static {v1}, Lcom/facebook/orca/protocol/methods/ap;->b(Lcom/facebook/orca/protocol/methods/ap;)Z

    move-result v0

    if-nez v0, :cond_7

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-gez v0, :cond_7

    .line 127
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_TIMED_OUT_AFTER_PUBLISH:Lcom/facebook/orca/protocol/methods/at;

    invoke-static {v1}, Lcom/facebook/orca/protocol/methods/ap;->a(Lcom/facebook/orca/protocol/methods/ap;)I

    move-result v2

    invoke-static {v0, v2}, Lcom/facebook/orca/protocol/methods/ar;->a(Lcom/facebook/orca/protocol/methods/at;I)Lcom/facebook/orca/protocol/methods/ar;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result-object v0

    .line 140
    :try_start_b
    invoke-virtual {v1}, Lcom/facebook/orca/protocol/methods/ap;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 163
    :try_start_c
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    goto/16 :goto_0

    .line 130
    :cond_7
    :try_start_d
    invoke-virtual {v1, v5, v6}, Lcom/facebook/orca/protocol/methods/ap;->a(J)Z

    move-result v0

    if-nez v0, :cond_8

    .line 131
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE:Lcom/facebook/orca/protocol/methods/at;

    invoke-static {v1}, Lcom/facebook/orca/protocol/methods/ap;->a(Lcom/facebook/orca/protocol/methods/ap;)I

    move-result v2

    invoke-static {v0, v2}, Lcom/facebook/orca/protocol/methods/ar;->a(Lcom/facebook/orca/protocol/methods/at;I)Lcom/facebook/orca/protocol/methods/ar;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-result-object v0

    .line 140
    :try_start_e
    invoke-virtual {v1}, Lcom/facebook/orca/protocol/methods/ap;->b()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 163
    :try_start_f
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    goto/16 :goto_0

    .line 134
    :cond_8
    :try_start_10
    invoke-static {v1}, Lcom/facebook/orca/protocol/methods/ap;->b(Lcom/facebook/orca/protocol/methods/ap;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 135
    sget-object v0, Lcom/facebook/orca/protocol/methods/at;->SEND_FAILED_SERVER_RETURNED_FAILURE:Lcom/facebook/orca/protocol/methods/at;

    invoke-static {v1}, Lcom/facebook/orca/protocol/methods/ap;->a(Lcom/facebook/orca/protocol/methods/ap;)I

    move-result v2

    invoke-static {v0, v2}, Lcom/facebook/orca/protocol/methods/ar;->a(Lcom/facebook/orca/protocol/methods/at;I)Lcom/facebook/orca/protocol/methods/ar;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    move-result-object v0

    .line 140
    :try_start_11
    invoke-virtual {v1}, Lcom/facebook/orca/protocol/methods/ap;->b()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 163
    :try_start_12
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    goto/16 :goto_0

    .line 140
    :cond_9
    :try_start_13
    invoke-virtual {v1}, Lcom/facebook/orca/protocol/methods/ap;->b()V

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ao;->c:Lcom/facebook/orca/f/n;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v4

    const-wide/16 v5, -0x1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v7

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lcom/facebook/orca/f/n;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 154
    new-instance v0, Lcom/facebook/orca/server/NewMessageResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/NewMessageResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;J)V

    .line 161
    invoke-static {v0}, Lcom/facebook/orca/protocol/methods/ar;->a(Lcom/facebook/orca/server/NewMessageResult;)Lcom/facebook/orca/protocol/methods/ar;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    move-result-object v0

    .line 163
    :try_start_14
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    goto/16 :goto_0

    .line 140
    :catchall_0
    move-exception v0

    :try_start_15
    invoke-virtual {v1}, Lcom/facebook/orca/protocol/methods/ap;->b()V

    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    .line 163
    :catchall_1
    move-exception v0

    :try_start_16
    invoke-virtual {v11}, Lcom/facebook/push/mqtt/bw;->c()V

    throw v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_0
.end method
