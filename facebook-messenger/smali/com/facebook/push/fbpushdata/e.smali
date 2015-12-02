.class public Lcom/facebook/push/fbpushdata/e;
.super Ljava/lang/Object;
.source "FbPushDataOverMqttHandler.java"

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
.field private final b:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final c:Lcom/facebook/push/mqtt/v;

.field private final d:Lcom/facebook/push/c2dm/y;

.field private final e:Lcom/facebook/analytics/cn;

.field private final f:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/push/fbpushdata/e;

    sput-object v0, Lcom/facebook/push/fbpushdata/e;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/push/mqtt/v;Lcom/facebook/push/c2dm/y;Lcom/facebook/analytics/cn;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/facebook/push/fbpushdata/e;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 52
    iput-object p2, p0, Lcom/facebook/push/fbpushdata/e;->c:Lcom/facebook/push/mqtt/v;

    .line 53
    iput-object p3, p0, Lcom/facebook/push/fbpushdata/e;->d:Lcom/facebook/push/c2dm/y;

    .line 54
    iput-object p4, p0, Lcom/facebook/push/fbpushdata/e;->e:Lcom/facebook/analytics/cn;

    .line 55
    iput-object p5, p0, Lcom/facebook/push/fbpushdata/e;->f:Landroid/content/Context;

    .line 56
    return-void
.end method

.method private a(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 4

    .prologue
    .line 71
    const-string v0, "token"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/facebook/push/fbpushdata/e;->d:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 74
    sget-object v1, Lcom/facebook/push/fbpushdata/e;->a:Ljava/lang/Class;

    const-string v2, "Ignoring MQTT push for other token"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 75
    invoke-direct {p0, v0}, Lcom/facebook/push/fbpushdata/e;->a(Ljava/lang/String;)V

    .line 105
    :goto_0
    return-void

    .line 77
    :cond_0
    sget-object v0, Lcom/facebook/push/fbpushdata/e;->a:Ljava/lang/Class;

    const-string v1, "Received MQTT push"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 80
    const-string v0, "async_job"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v2, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 82
    const-string v2, "async_job"

    invoke-virtual {v1, v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 83
    iget-object v0, p0, Lcom/facebook/push/fbpushdata/e;->c:Lcom/facebook/push/mqtt/v;

    const-string v2, "/send_push_notification_ack"

    sget-object v3, Lcom/facebook/mqtt/x;->FIRE_AND_FORGET:Lcom/facebook/mqtt/x;

    invoke-virtual {v0, v2, v1, v3}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I

    move-result v0

    .line 87
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 88
    sget-object v0, Lcom/facebook/push/fbpushdata/e;->a:Ljava/lang/Class;

    const-string v1, "Failed to send push notification ack"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 93
    :cond_1
    const-string v0, "fbpushnotif"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->textValue()Ljava/lang/String;

    move-result-object v1

    .line 95
    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/fbpushdata/e;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 102
    iget-object v1, p0, Lcom/facebook/push/fbpushdata/e;->f:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/facebook/push/g;->C2DM_OVER_MQTT:Lcom/facebook/push/g;

    invoke-static {v1, v0, v2}, Lcom/facebook/push/fbpushdata/FbPushDataHandlerService;->a(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/push/g;)V

    goto :goto_0

    .line 96
    :catch_0
    move-exception v0

    .line 97
    sget-object v2, Lcom/facebook/push/fbpushdata/e;->a:Ljava/lang/Class;

    const-string v3, "IOException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    invoke-direct {p0, v1, v0}, Lcom/facebook/push/fbpushdata/e;->a(Ljava/lang/String;Ljava/io/IOException;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 121
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v3

    .line 122
    const-string v0, "registration_id"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    sget-object v0, Lcom/facebook/push/g;->C2DM_OVER_MQTT:Lcom/facebook/push/g;

    invoke-virtual {v0}, Lcom/facebook/push/g;->toString()Ljava/lang/String;

    move-result-object v1

    .line 125
    iget-object v0, p0, Lcom/facebook/push/fbpushdata/e;->e:Lcom/facebook/analytics/cn;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "messaging_push_notif_"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mqtt_other_token"

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/io/IOException;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 108
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v3

    .line 109
    const-string v0, "fbpushnotif"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const-string v0, "exception"

    invoke-virtual {p2}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object v0, p0, Lcom/facebook/push/fbpushdata/e;->e:Lcom/facebook/analytics/cn;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "messaging_push_notif_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/facebook/push/g;->MQTT:Lcom/facebook/push/g;

    invoke-virtual {v2}, Lcom/facebook/push/g;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MqttParseException"

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[B)V
    .locals 3

    .prologue
    .line 61
    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/fbpushdata/e;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-static {p2}, Lcom/facebook/common/w/n;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 62
    const-string v1, "/push_notification"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 63
    invoke-direct {p0, v0}, Lcom/facebook/push/fbpushdata/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 65
    :catch_0
    move-exception v0

    .line 66
    sget-object v1, Lcom/facebook/push/fbpushdata/e;->a:Ljava/lang/Class;

    const-string v2, "IOException"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
