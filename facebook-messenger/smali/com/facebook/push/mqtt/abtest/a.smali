.class public Lcom/facebook/push/mqtt/abtest/a;
.super Ljava/lang/Object;
.source "MqttPushServiceExperiment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field static final a:I

.field public static final b:Lcom/facebook/push/mqtt/abtest/e;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field static final c:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:Lcom/facebook/abtest/qe/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/a",
            "<",
            "Lcom/facebook/push/mqtt/abtest/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .prologue
    const/4 v7, 0x2

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/16 v8, 0x384

    const/16 v1, 0x1e

    .line 66
    sget-object v0, Lcom/facebook/mqtt/messages/k;->PINGRESP:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toInt()I

    move-result v0

    shl-int v0, v3, v0

    sget-object v2, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/k;->toInt()I

    move-result v2

    shl-int v2, v3, v2

    or-int/2addr v0, v2

    sput v0, Lcom/facebook/push/mqtt/abtest/a;->a:I

    .line 72
    new-instance v0, Lcom/facebook/push/mqtt/abtest/e;

    const/16 v3, 0x78

    const/16 v4, 0xf

    const/4 v5, 0x3

    const/16 v9, 0x3c

    const/16 v11, 0x12c

    sget v12, Lcom/facebook/push/mqtt/abtest/a;->a:I

    move v2, v1

    move v10, v8

    invoke-direct/range {v0 .. v12}, Lcom/facebook/push/mqtt/abtest/e;-><init>(IIIIIIIIIIII)V

    sput-object v0, Lcom/facebook/push/mqtt/abtest/a;->b:Lcom/facebook/push/mqtt/abtest/e;

    .line 88
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const-string v2, "dns_timeout_sec"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v2, "tcp_connect_timeout_sec"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "mqtt_connect_timeout_sec"

    const/16 v2, 0x78

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "mqtt_response_timeout_sec"

    const/16 v2, 0xf

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "back_to_back_retry_attempts"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "back_to_back_retry_interval_sec"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "back_off_initial_retry_interval_sec"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "back_off_max_retry_interval_sec"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "foreground_keepalive_interval_sec"

    const/16 v2, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "background_keepalive_interval_persistent_sec"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "background_keepalive_interval_transient_sec"

    const/16 v2, 0x12c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "mqtt_reconnect_for_operations"

    sget v2, Lcom/facebook/push/mqtt/abtest/a;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/push/mqtt/abtest/a;->c:Lcom/google/common/a/ev;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/d/e;)V
    .locals 3

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    const-string v0, "android_mqtt_push_service_parameters"

    new-instance v1, Lcom/facebook/push/mqtt/abtest/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/push/mqtt/abtest/c;-><init>(Lcom/facebook/push/mqtt/abtest/b;)V

    invoke-virtual {p1, v0, v1}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/abtest/a;->d:Lcom/facebook/abtest/qe/d/a;

    .line 120
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/abtest/e;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/push/mqtt/abtest/a;->d:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/abtest/e;

    return-object v0
.end method
