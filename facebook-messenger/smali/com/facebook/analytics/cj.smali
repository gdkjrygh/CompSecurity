.class public Lcom/facebook/analytics/cj;
.super Lcom/facebook/analytics/cn;
.source "MqttAnalyticsLogger.java"


# static fields
.field private static final b:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/analytics/cj;

    sput-object v0, Lcom/facebook/analytics/cj;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;Ljavax/inject/a;Lcom/facebook/common/hardware/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/common/time/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/common/hardware/k;",
            ")V"
        }
    .end annotation

    .prologue
    .line 108
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/analytics/cn;-><init>(Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;Ljavax/inject/a;Lcom/facebook/common/hardware/k;)V

    .line 113
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 308
    new-instance v2, Lcom/facebook/analytics/cb;

    invoke-static {p1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 310
    const-string v0, "mqtt_client"

    invoke-virtual {v2, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 312
    if-eqz p2, :cond_1

    .line 313
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 314
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto :goto_0

    .line 316
    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/analytics/cj;->a(Ljava/util/Map;)V

    .line 319
    :cond_1
    sget-object v0, Lcom/facebook/analytics/cj;->b:Ljava/lang/Class;

    const-string v1, "Event name: %s, Event parameters:\n %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-static {v0, v1, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v0, p0, Lcom/facebook/analytics/cj;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 325
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 286
    const-string v0, "mqtt_publish_acknowledged_no_listener"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 289
    return-void
.end method

.method public a(II)V
    .locals 3

    .prologue
    .line 190
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "retry_count"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "retry_duration_s"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cj;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 194
    const-string v1, "mqtt_connection_retries"

    invoke-direct {p0, v1, v0}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 197
    return-void
.end method

.method public a(JILcom/google/common/base/Optional;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 134
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "timespan_ms"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "port"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cj;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 139
    invoke-virtual {p4}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const-string v2, "error_message"

    invoke-virtual {p4}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    :cond_0
    const-string v0, "mqtt_socket_connect"

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 144
    return-void
.end method

.method public a(Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 216
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 217
    invoke-virtual {p1}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 218
    const-string v2, "connected_duration_s"

    invoke-virtual {p1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    :cond_0
    invoke-virtual {p2}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    const-string v2, "last_ping_s_ago"

    invoke-virtual {p2}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    :cond_1
    invoke-virtual {p3}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 226
    const-string v2, "last_sent_s_ago"

    invoke-virtual {p3}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    :cond_2
    invoke-virtual {p4}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 230
    const-string v2, "last_received_s_ago"

    invoke-virtual {p4}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    :cond_3
    invoke-virtual {p5}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 234
    const-string v0, "operation"

    invoke-virtual {p5}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    :cond_4
    invoke-virtual {p6}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 238
    const-string v2, "error_message"

    invoke-virtual {p6}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    :cond_5
    const-string v0, "mqtt_disconnection_on_failure"

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 244
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 297
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "msg_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cj;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 298
    invoke-direct {p0, p1, v0}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 299
    return-void
.end method

.method public a(Ljava/lang/String;IJ)V
    .locals 3

    .prologue
    .line 272
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "operation"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    const-string v2, "msg_id"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "timespan_ms"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cj;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 278
    const-string v1, "mqtt_operation_timeout"

    invoke-direct {p0, v1, v0}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 279
    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 3

    .prologue
    .line 123
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "timespan_ms"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cj;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 126
    invoke-direct {p0, p1, v0}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 127
    return-void
.end method

.method public a(ZJLcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZJ",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Exception;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Byte;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 160
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "connect_result"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "connect_duration_ms"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cj;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 164
    invoke-virtual {p4}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    const-string v0, "failure_reason"

    invoke-virtual {p4}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    :cond_0
    invoke-virtual {p5}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    const-string v2, "error_message"

    invoke-virtual {p5}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    :cond_1
    invoke-virtual {p6}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    const-string v2, "conack_rc"

    invoke-virtual {p6}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    :cond_2
    const-string v0, "mqtt_connect_attempt"

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 179
    return-void
.end method

.method public b(Ljava/lang/String;J)V
    .locals 3

    .prologue
    .line 255
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "operation"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    const-string v2, "timespan_ms"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cj;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 259
    const-string v1, "mqtt_response_time"

    invoke-direct {p0, v1, v0}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 262
    return-void
.end method
