.class public Lcom/facebook/orca/a/k;
.super Ljava/lang/Object;
.source "SendMessageParametersExperimentInitializer.java"


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
.field private final b:Lcom/facebook/abtest/qe/c;

.field private c:Lcom/facebook/orca/a/j;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "self"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/orca/a/k;

    sput-object v0, Lcom/facebook/orca/a/k;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/c;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    sget-object v0, Lcom/facebook/orca/a/j;->a:Lcom/facebook/orca/a/j;

    iput-object v0, p0, Lcom/facebook/orca/a/k;->c:Lcom/facebook/orca/a/j;

    .line 45
    iput-object p1, p0, Lcom/facebook/orca/a/k;->b:Lcom/facebook/abtest/qe/c;

    .line 46
    invoke-virtual {p0}, Lcom/facebook/orca/a/k;->b()V

    .line 47
    return-void
.end method

.method private a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 11

    .prologue
    .line 85
    const-string v0, "local_default_group"

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    sget-object v0, Lcom/facebook/orca/a/k;->a:Ljava/lang/Class;

    const-string v1, "Using local default group"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 128
    :goto_0
    return-void

    .line 90
    :cond_0
    const-string v0, "mqtt_pub_ack_timeout_ms"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 92
    const-string v1, "mqtt_publish_timeout_ms"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v3

    .line 94
    const-string v1, "mqtt_attempt_count"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v5

    .line 96
    const-string v1, "mqtt_connect_timeout_ms"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v6

    .line 98
    const-string v1, "mqtt_connect_attempt_count"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v8

    .line 100
    const-string v1, "mqtt_sleep_time_between_connection_attempts"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v9

    .line 105
    :try_start_0
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 106
    invoke-virtual {v3}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 107
    invoke-virtual {v5}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 108
    invoke-virtual {v6}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 109
    invoke-virtual {v8}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 110
    invoke-virtual {v9}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 113
    new-instance v0, Lcom/facebook/orca/a/j;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/a/j;-><init>(JJIJIJ)V

    .line 122
    iget-object v1, p0, Lcom/facebook/orca/a/k;->c:Lcom/facebook/orca/a/j;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :try_start_1
    iput-object v0, p0, Lcom/facebook/orca/a/k;->c:Lcom/facebook/orca/a/j;

    .line 124
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 125
    :catch_0
    move-exception v0

    .line 126
    sget-object v1, Lcom/facebook/orca/a/k;->a:Ljava/lang/Class;

    const-string v2, "error parsing experiment parameters - missing or invalid: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/a/k;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/orca/a/k;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    return-void
.end method

.method static synthetic c()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/orca/a/k;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/a/j;
    .locals 2

    .prologue
    .line 50
    iget-object v1, p0, Lcom/facebook/orca/a/k;->c:Lcom/facebook/orca/a/j;

    monitor-enter v1

    .line 51
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/a/k;->c:Lcom/facebook/orca/a/j;

    monitor-exit v1

    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 56
    sget-object v0, Lcom/facebook/orca/a/k;->a:Ljava/lang/Class;

    const-string v1, "Init"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/facebook/orca/a/k;->b:Lcom/facebook/abtest/qe/c;

    const-string v1, "android_messenger_send_message_parameters"

    new-instance v2, Lcom/facebook/orca/a/l;

    invoke-direct {v2, p0}, Lcom/facebook/orca/a/l;-><init>(Lcom/facebook/orca/a/k;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/abtest/qe/c;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 68
    new-instance v1, Lcom/facebook/orca/a/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/a/m;-><init>(Lcom/facebook/orca/a/k;)V

    .line 81
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 82
    return-void
.end method
