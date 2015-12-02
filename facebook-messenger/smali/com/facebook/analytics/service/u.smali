.class public Lcom/facebook/analytics/service/u;
.super Ljava/lang/Object;
.source "HoneyAnalyticsUploadHandler.java"


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
.field private final b:Lcom/facebook/config/b/a;

.field private final c:Lcom/facebook/config/a/c;

.field private final d:Lcom/facebook/analytics/c/g;

.field private final e:Landroid/telephony/TelephonyManager;

.field private final f:Lcom/facebook/http/protocol/aq;

.field private final g:Lcom/facebook/analytics/service/v;

.field private final h:Lcom/facebook/device_id/l;

.field private final i:Lcom/facebook/common/hardware/k;

.field private final j:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/analytics/service/u;

    sput-object v0, Lcom/facebook/analytics/service/u;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/config/b/a;Lcom/facebook/config/a/c;Lcom/facebook/analytics/c/g;Landroid/telephony/TelephonyManager;Lcom/facebook/device_id/l;Lcom/facebook/common/hardware/k;Lcom/facebook/http/protocol/aq;Lcom/facebook/analytics/service/v;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/facebook/analytics/service/u;->b:Lcom/facebook/config/b/a;

    .line 57
    iput-object p2, p0, Lcom/facebook/analytics/service/u;->c:Lcom/facebook/config/a/c;

    .line 58
    iput-object p3, p0, Lcom/facebook/analytics/service/u;->d:Lcom/facebook/analytics/c/g;

    .line 59
    iput-object p4, p0, Lcom/facebook/analytics/service/u;->e:Landroid/telephony/TelephonyManager;

    .line 60
    iput-object p7, p0, Lcom/facebook/analytics/service/u;->f:Lcom/facebook/http/protocol/aq;

    .line 61
    iput-object p8, p0, Lcom/facebook/analytics/service/u;->g:Lcom/facebook/analytics/service/v;

    .line 62
    iput-object p6, p0, Lcom/facebook/analytics/service/u;->i:Lcom/facebook/common/hardware/k;

    .line 63
    iput-object p5, p0, Lcom/facebook/analytics/service/u;->h:Lcom/facebook/device_id/l;

    .line 64
    iput-object p9, p0, Lcom/facebook/analytics/service/u;->j:Lcom/facebook/common/time/a;

    .line 65
    return-void
.end method

.method private a(Lcom/facebook/analytics/c/h;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/analytics/service/u;->d:Lcom/facebook/analytics/c/g;

    iget-object v1, p1, Lcom/facebook/analytics/c/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/c/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    const/4 v0, 0x0

    .line 111
    :goto_0
    return-object v0

    .line 73
    :cond_0
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 76
    const-string v0, "time"

    iget-wide v3, p1, Lcom/facebook/analytics/c/h;->c:J

    invoke-virtual {v2, v0, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 77
    const-string v0, "app_id"

    iget-object v3, p0, Lcom/facebook/analytics/service/u;->c:Lcom/facebook/config/a/c;

    invoke-interface {v3}, Lcom/facebook/config/a/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 78
    const-string v0, "app_ver"

    iget-object v3, p0, Lcom/facebook/analytics/service/u;->b:Lcom/facebook/config/b/a;

    invoke-interface {v3}, Lcom/facebook/config/b/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 79
    const-string v0, "device_id"

    iget-object v3, p0, Lcom/facebook/analytics/service/u;->h:Lcom/facebook/device_id/l;

    invoke-virtual {v3}, Lcom/facebook/device_id/l;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 80
    const-string v0, "session_id"

    iget-object v3, p1, Lcom/facebook/analytics/c/h;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 81
    const-string v0, "seq"

    iget-wide v3, p1, Lcom/facebook/analytics/c/h;->d:J

    invoke-virtual {v2, v0, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 82
    iget-object v0, p1, Lcom/facebook/analytics/c/h;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 83
    const-string v0, "uid"

    iget-object v3, p1, Lcom/facebook/analytics/c/h;->e:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/facebook/analytics/service/u;->e:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 89
    const-string v0, "n/a"

    .line 92
    :cond_2
    const-string v3, "carrier"

    invoke-virtual {v2, v3, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 93
    const-string v0, "device"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 94
    const-string v0, "os_ver"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 95
    const-string v0, "build_num"

    iget-object v3, p0, Lcom/facebook/analytics/service/u;->b:Lcom/facebook/config/b/a;

    invoke-interface {v3}, Lcom/facebook/config/b/a;->b()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 97
    iget-object v0, p0, Lcom/facebook/analytics/service/u;->i:Lcom/facebook/common/hardware/k;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/k;->c()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 98
    const-string v3, "conn"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v2, v3, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 104
    const-string v0, "sent_time"

    iget-object v3, p0, Lcom/facebook/analytics/service/u;->j:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/facebook/analytics/i/b;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 109
    new-instance v0, Lcom/facebook/analytics/cl;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "]"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cl;-><init>(Ljava/lang/String;)V

    .line 110
    const-string v1, "data"

    invoke-virtual {v2, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 111
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 98
    :cond_3
    const-string v0, "none"

    goto :goto_1
.end method


# virtual methods
.method public a()V
    .locals 9

    .prologue
    .line 115
    sget-object v0, Lcom/facebook/analytics/service/u;->a:Ljava/lang/Class;

    const-string v1, "Trying to upload analytics logs."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/facebook/analytics/service/u;->i:Lcom/facebook/common/hardware/k;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/k;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    sget-object v0, Lcom/facebook/analytics/service/u;->a:Ljava/lang/Class;

    const-string v1, "No network connection to upload analytics right now. Bailing."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 161
    :goto_0
    return-void

    .line 123
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    .line 124
    iget-object v0, p0, Lcom/facebook/analytics/service/u;->d:Lcom/facebook/analytics/c/g;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/g;->b()Ljava/util/List;

    move-result-object v1

    .line 125
    sget-object v0, Lcom/facebook/analytics/service/u;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Uploading!  Number of batches to upload: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 126
    const/4 v0, 0x0

    .line 127
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v2, v0

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/c/h;

    .line 128
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/u;->a(Lcom/facebook/analytics/c/h;)Ljava/lang/String;

    move-result-object v1

    .line 130
    if-nez v1, :cond_1

    .line 131
    iget-object v1, p0, Lcom/facebook/analytics/service/u;->d:Lcom/facebook/analytics/c/g;

    iget-object v0, v0, Lcom/facebook/analytics/c/h;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/c/g;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 136
    :cond_1
    new-instance v6, Lcom/facebook/http/protocol/l;

    invoke-direct {v6}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 137
    sget-object v7, Lcom/facebook/http/protocol/m;->BOOTSTRAP:Lcom/facebook/http/protocol/m;

    invoke-virtual {v6, v7}, Lcom/facebook/http/protocol/l;->a(Lcom/facebook/http/protocol/m;)V

    .line 140
    :try_start_0
    iget-object v7, p0, Lcom/facebook/analytics/service/u;->f:Lcom/facebook/http/protocol/aq;

    iget-object v8, p0, Lcom/facebook/analytics/service/u;->g:Lcom/facebook/analytics/service/v;

    invoke-static {v1}, Lcom/facebook/analytics/service/v;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v8, v1, v6}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 144
    if-eqz v1, :cond_2

    .line 145
    add-int/lit8 v2, v2, 0x1

    .line 146
    iget-object v1, p0, Lcom/facebook/analytics/service/u;->d:Lcom/facebook/analytics/c/g;

    iget-object v0, v0, Lcom/facebook/analytics/c/h;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/c/g;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    move v0, v2

    .line 155
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    sub-long/2addr v1, v3

    const-wide/32 v6, 0x1d4c0

    cmp-long v1, v1, v6

    if-lez v1, :cond_3

    .line 156
    sget-object v1, Lcom/facebook/analytics/service/u;->a:Ljava/lang/Class;

    const-string v2, "Analytics upload taking too long. Will resume later."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 160
    :goto_3
    sget-object v1, Lcom/facebook/analytics/service/u;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Finished uploading. Total batches uploaded: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 148
    :catch_0
    move-exception v0

    move-object v1, v0

    move v0, v2

    .line 151
    sget-object v2, Lcom/facebook/analytics/service/u;->a:Ljava/lang/Class;

    const-string v6, "error upload analytic logs"

    invoke-static {v2, v6, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    move v2, v0

    .line 159
    goto :goto_1

    :cond_4
    move v0, v2

    goto :goto_3
.end method
