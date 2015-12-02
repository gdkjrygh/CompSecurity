.class Lcom/facebook/orca/protocol/methods/ap;
.super Ljava/lang/Object;
.source "SendViaChatHandler.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/methods/ao;

.field private final b:J

.field private c:Z

.field private d:Z

.field private e:Landroid/content/BroadcastReceiver;

.field private f:I


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/ao;J)V
    .locals 1

    .prologue
    .line 179
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/ap;->a:Lcom/facebook/orca/protocol/methods/ao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/orca/protocol/methods/ap;->f:I

    .line 180
    iput-wide p2, p0, Lcom/facebook/orca/protocol/methods/ap;->b:J

    .line 181
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/protocol/methods/ap;)I
    .locals 1

    .prologue
    .line 170
    iget v0, p0, Lcom/facebook/orca/protocol/methods/ap;->f:I

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/protocol/methods/ap;)Z
    .locals 1

    .prologue
    .line 170
    iget-boolean v0, p0, Lcom/facebook/orca/protocol/methods/ap;->c:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 184
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 185
    const-string v1, "com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 187
    new-instance v0, Lcom/facebook/orca/protocol/methods/aq;

    invoke-direct {v0, p0}, Lcom/facebook/orca/protocol/methods/aq;-><init>(Lcom/facebook/orca/protocol/methods/ap;)V

    .line 195
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/ap;->a:Lcom/facebook/orca/protocol/methods/ao;

    invoke-static {v1}, Lcom/facebook/orca/protocol/methods/ao;->b(Lcom/facebook/orca/protocol/methods/ao;)Lcom/facebook/c/j;

    move-result-object v1

    const-string v2, "com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED"

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/orca/protocol/methods/ap;->a:Lcom/facebook/orca/protocol/methods/ao;

    invoke-static {v4}, Lcom/facebook/orca/protocol/methods/ao;->a(Lcom/facebook/orca/protocol/methods/ao;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/facebook/c/j;->a(Ljava/lang/String;Lcom/facebook/c/b;Landroid/os/Handler;Landroid/content/Context;)Lcom/facebook/c/q;

    .line 201
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 210
    monitor-enter p0

    :try_start_0
    const-string v0, "/send_message_response"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 227
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 214
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ap;->a:Lcom/facebook/orca/protocol/methods/ao;

    invoke-static {v0}, Lcom/facebook/orca/protocol/methods/ao;->c(Lcom/facebook/orca/protocol/methods/ao;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 215
    const-string v1, "msgid"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v1

    .line 216
    iget-wide v3, p0, Lcom/facebook/orca/protocol/methods/ap;->b:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 220
    const-string v1, "succeeded"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/orca/protocol/methods/ap;->c:Z

    .line 221
    const-string v1, "errno"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/protocol/methods/ap;->f:I

    .line 222
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/protocol/methods/ap;->d:Z

    .line 223
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 224
    :catch_0
    move-exception v0

    goto :goto_0

    .line 210
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(J)Z
    .locals 6

    .prologue
    .line 230
    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long v2, v0, p1

    .line 231
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v0, v2, v0

    .line 232
    :goto_0
    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-lez v4, :cond_0

    iget-boolean v4, p0, Lcom/facebook/orca/protocol/methods/ap;->d:Z

    if-nez v4, :cond_0

    .line 233
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 234
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v0, v2, v0

    goto :goto_0

    .line 236
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/protocol/methods/ap;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    .line 230
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ap;->e:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ap;->a:Lcom/facebook/orca/protocol/methods/ao;

    invoke-static {v0}, Lcom/facebook/orca/protocol/methods/ao;->a(Lcom/facebook/orca/protocol/methods/ao;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/ap;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 207
    :cond_0
    return-void
.end method
