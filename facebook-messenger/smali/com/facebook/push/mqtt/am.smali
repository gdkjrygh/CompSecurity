.class Lcom/facebook/push/mqtt/am;
.super Ljava/lang/Object;
.source "MqttForegroundStateSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/fasterxml/jackson/databind/node/ObjectNode;

.field final synthetic b:Z

.field final synthetic c:I

.field final synthetic d:Lcom/facebook/push/mqtt/ai;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ai;Lcom/fasterxml/jackson/databind/node/ObjectNode;ZI)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lcom/facebook/push/mqtt/am;->d:Lcom/facebook/push/mqtt/ai;

    iput-object p2, p0, Lcom/facebook/push/mqtt/am;->a:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    iput-boolean p3, p0, Lcom/facebook/push/mqtt/am;->b:Z

    iput p4, p0, Lcom/facebook/push/mqtt/am;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 187
    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/am;->d:Lcom/facebook/push/mqtt/ai;

    invoke-static {v0}, Lcom/facebook/push/mqtt/ai;->a(Lcom/facebook/push/mqtt/ai;)Lcom/facebook/push/mqtt/v;

    move-result-object v0

    const-string v1, "/foreground_state"

    iget-object v2, p0, Lcom/facebook/push/mqtt/am;->a:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    const-wide/16 v3, 0x7530

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;J)Z

    move-result v0

    .line 193
    invoke-static {}, Lcom/facebook/push/mqtt/ai;->c()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Publishing foreground state runnable complete. success:%b, hasChange:%b, interval:%d"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-boolean v5, p0, Lcom/facebook/push/mqtt/am;->b:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    iget v5, p0, Lcom/facebook/push/mqtt/am;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/push/mqtt/am;->b:Z

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/facebook/push/mqtt/am;->d:Lcom/facebook/push/mqtt/ai;

    invoke-static {v0}, Lcom/facebook/push/mqtt/ai;->a(Lcom/facebook/push/mqtt/ai;)Lcom/facebook/push/mqtt/v;

    move-result-object v0

    iget v1, p0, Lcom/facebook/push/mqtt/am;->c:I

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/v;->a(I)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    :cond_0
    :goto_0
    return-void

    .line 201
    :catch_0
    move-exception v0

    .line 202
    invoke-static {}, Lcom/facebook/push/mqtt/ai;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method
