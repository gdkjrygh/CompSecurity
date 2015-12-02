.class public Lcom/facebook/orca/f/af;
.super Ljava/lang/Object;
.source "ThreadsCacheUpdateRateLimiter.java"


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
.field private final b:Lcom/facebook/orca/f/ad;

.field private final c:Lcom/facebook/push/mqtt/v;

.field private final d:Lcom/facebook/common/time/a;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/orca/f/af;

    sput-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/f/ad;Lcom/facebook/push/mqtt/v;Lcom/facebook/common/time/a;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/orca/f/af;->b:Lcom/facebook/orca/f/ad;

    .line 49
    iput-object p2, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    .line 50
    iput-object p3, p0, Lcom/facebook/orca/f/af;->d:Lcom/facebook/common/time/a;

    .line 51
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/af;->e:Ljava/util/Map;

    .line 52
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/af;->f:Ljava/util/Map;

    .line 53
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/af;->g:Ljava/util/Map;

    .line 54
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/af;->h:Ljava/util/Map;

    .line 55
    return-void
.end method

.method private c(Lcom/facebook/orca/threads/FolderName;)J
    .locals 2

    .prologue
    .line 361
    iget-object v0, p0, Lcom/facebook/orca/f/af;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 362
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 371
    iget-object v0, p0, Lcom/facebook/orca/f/af;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 372
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method private d(Lcom/facebook/orca/threads/FolderName;)J
    .locals 2

    .prologue
    .line 366
    iget-object v0, p0, Lcom/facebook/orca/f/af;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 367
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method private d(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 376
    iget-object v0, p0, Lcom/facebook/orca/f/af;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 377
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/orca/f/af;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;

    move-result-object v0

    iget-object v0, v0, Lcom/facebook/orca/f/ag;->a:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 271
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/orca/f/af;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;

    move-result-object v0

    iget-object v0, v0, Lcom/facebook/orca/f/ag;->a:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;
    .locals 12
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const-wide/32 v10, 0xea60

    .line 134
    monitor-enter p0

    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "upgradeDataFreshnessForThreadListRequest called for:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    const-string v1, " folder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    if-eqz p2, :cond_0

    .line 139
    const-string v1, " freshness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    :cond_0
    const-string v1, " updateTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 142
    sget-object v1, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 145
    :cond_1
    sget-object v0, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    if-eq p2, v0, :cond_2

    sget-object v0, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    if-eq p2, v0, :cond_2

    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-ne p2, v0, :cond_3

    .line 148
    :cond_2
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/orca/f/ah;->SPECIFIC_INTENTION:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, p2, v1}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    :goto_0
    monitor-exit p0

    return-object v0

    .line 151
    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/f/af;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 152
    iget-object v2, p0, Lcom/facebook/orca/f/af;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v2, p1}, Lcom/facebook/orca/f/ad;->f(Lcom/facebook/orca/threads/FolderName;)J

    move-result-wide v2

    .line 155
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/af;->c(Lcom/facebook/orca/threads/FolderName;)J

    move-result-wide v4

    .line 156
    iget-object v6, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/v;->g()J

    move-result-wide v6

    .line 158
    const/4 v8, 0x2

    invoke-static {v8}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 159
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    const-string v9, "upgradeDataFreshnessForThreadListRequest mqtt timestamps:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    const-string v9, "disconnectedMqttEarliestRetryMs="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 162
    const-string v9, "lastDisconnectionTimeStampMS="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 163
    const-string v9, "lastUpdatedTimeMs="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 164
    const-string v9, "now="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 165
    sget-object v9, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 168
    :cond_4
    const-wide/16 v8, 0x0

    cmp-long v8, v6, v8

    if-lez v8, :cond_6

    cmp-long v6, v2, v6

    if-gez v6, :cond_6

    cmp-long v6, v4, v0

    if-gez v6, :cond_6

    .line 170
    if-eqz p3, :cond_5

    .line 171
    sget-object v2, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Upgrading timestamp mDisconnectedMqttEarliestRetryMsForFolders:"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 173
    add-long/2addr v0, v10

    .line 174
    iget-object v2, p0, Lcom/facebook/orca/f/af;->e:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    :cond_5
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt disconnect"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 177
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->MQTT_RECENTLY_DISCONNECTED:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 134
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 184
    :cond_6
    :try_start_2
    iget-object v4, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v4}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v4

    if-nez v4, :cond_7

    sub-long v4, v0, v2

    const-wide/32 v6, 0x493e0

    cmp-long v4, v4, v6

    if-ltz v4, :cond_7

    .line 186
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c mqtt disconnected and 5 minutes since last refresh"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 188
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto/16 :goto_0

    .line 195
    :cond_7
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/af;->d(Lcom/facebook/orca/threads/FolderName;)J

    move-result-wide v4

    .line 196
    iget-object v6, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/v;->e()Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/v;->h()J

    move-result-wide v6

    cmp-long v6, v2, v6

    if-gez v6, :cond_9

    cmp-long v4, v4, v0

    if-gez v4, :cond_9

    .line 199
    if-eqz p3, :cond_8

    .line 200
    add-long/2addr v0, v10

    .line 201
    iget-object v2, p0, Lcom/facebook/orca/f/af;->f:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    :cond_8
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt connect"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 204
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->MQTT_CONNECTED:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto/16 :goto_0

    .line 211
    :cond_9
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1b7740

    cmp-long v0, v0, v2

    if-ltz v0, :cond_a

    .line 213
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c 30 minutes since last refresh"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 214
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->OLD_DATA:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto/16 :goto_0

    .line 221
    :cond_a
    iget-object v0, p0, Lcom/facebook/orca/f/af;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 223
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to PREFER_CACHE_IF_UP_TO_DATE b/c cache is stale"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 224
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->DATA_KNOWN_TO_BE_STALE:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto/16 :goto_0

    .line 231
    :cond_b
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/orca/f/ah;->DEFAULT:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, p2, v1}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method declared-synchronized a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const-wide/32 v8, 0xea60

    .line 287
    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    sget-object v0, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    if-eq p2, v0, :cond_0

    sget-object v0, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    if-eq p2, v0, :cond_0

    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-ne p2, v0, :cond_1

    .line 291
    :cond_0
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/orca/f/ah;->SPECIFIC_INTENTION:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, p2, v1}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    :goto_0
    monitor-exit p0

    return-object v0

    .line 294
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/f/af;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;)J

    move-result-wide v0

    .line 295
    iget-object v2, p0, Lcom/facebook/orca/f/af;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 298
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/af;->c(Ljava/lang/String;)J

    move-result-wide v4

    .line 299
    iget-object v6, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/v;->g()J

    move-result-wide v6

    cmp-long v6, v0, v6

    if-gez v6, :cond_3

    cmp-long v4, v4, v2

    if-gez v4, :cond_3

    .line 301
    if-eqz p3, :cond_2

    .line 302
    iget-object v0, p0, Lcom/facebook/orca/f/af;->g:Ljava/util/Map;

    add-long v1, v2, v8

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    :cond_2
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt disconnect"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 305
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->MQTT_RECENTLY_DISCONNECTED:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 287
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 311
    :cond_3
    :try_start_2
    iget-object v4, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v4}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v4

    if-nez v4, :cond_4

    sub-long v4, v2, v0

    const-wide/32 v6, 0x493e0

    cmp-long v4, v4, v6

    if-ltz v4, :cond_4

    .line 314
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c mqtt disconnected and 5 minutes since last refresh"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 316
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->MQTT_DISCONNECTED_AND_NOT_RECENTLY_UPDATED:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto :goto_0

    .line 323
    :cond_4
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/af;->d(Ljava/lang/String;)J

    move-result-wide v4

    .line 324
    iget-object v6, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/v;->e()Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/facebook/orca/f/af;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v6}, Lcom/facebook/push/mqtt/v;->h()J

    move-result-wide v6

    cmp-long v6, v0, v6

    if-gez v6, :cond_6

    cmp-long v4, v4, v2

    if-gez v4, :cond_6

    .line 327
    if-eqz p3, :cond_5

    .line 328
    add-long v0, v2, v8

    .line 329
    iget-object v2, p0, Lcom/facebook/orca/f/af;->h:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    :cond_5
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_DATA b/c of recent mqtt connect"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 332
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->MQTT_CONNECTED:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto/16 :goto_0

    .line 338
    :cond_6
    sub-long v0, v2, v0

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_7

    .line 340
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to CHECK_SERVER_FOR_NEW_THREAD_DATA_THRESHOLD_MS b/c it has been 10 minutes since last thread refresh"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 342
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->OLD_DATA:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto/16 :goto_0

    .line 348
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/f/af;->b:Lcom/facebook/orca/f/ad;

    const/16 v1, 0x14

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_8

    .line 350
    sget-object v0, Lcom/facebook/orca/f/af;->a:Ljava/lang/Class;

    const-string v1, "Upgrading to PREFER_CACHE_IF_UP_TO_DATE b/c the thread is not up to date"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 351
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/orca/f/ah;->DATA_KNOWN_TO_BE_STALE:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V

    goto/16 :goto_0

    .line 357
    :cond_8
    new-instance v0, Lcom/facebook/orca/f/ag;

    sget-object v1, Lcom/facebook/orca/f/ah;->DEFAULT:Lcom/facebook/orca/f/ah;

    invoke-direct {v0, p2, v1}, Lcom/facebook/orca/f/ag;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 63
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/facebook/orca/f/af;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;

    move-result-object v1

    .line 68
    iget-object v1, v1, Lcom/facebook/orca/f/ag;->a:Lcom/facebook/fbservice/service/s;

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 241
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/facebook/orca/f/af;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;

    move-result-object v1

    .line 243
    iget-object v1, v1, Lcom/facebook/orca/f/ag;->a:Lcom/facebook/fbservice/service/s;

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public b(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 78
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/facebook/orca/f/af;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;

    move-result-object v1

    .line 83
    iget-object v1, v1, Lcom/facebook/orca/f/ag;->a:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 253
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/facebook/orca/f/af;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;Z)Lcom/facebook/orca/f/ag;

    move-result-object v1

    .line 258
    iget-object v1, v1, Lcom/facebook/orca/f/ag;->a:Lcom/facebook/fbservice/service/s;

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
