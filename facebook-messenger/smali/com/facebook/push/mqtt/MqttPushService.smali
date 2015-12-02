.class public Lcom/facebook/push/mqtt/MqttPushService;
.super Landroid/app/Service;
.source "MqttPushService.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# static fields
.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/push/mqtt/bv;

.field private c:Lcom/facebook/push/mqtt/v;

.field private d:Lcom/facebook/prefs/shared/d;

.field private e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/mqtt/t;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/facebook/common/hardware/k;

.field private g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/credentials/UserTokenCredentials;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/prefs/shared/f;

.field private i:Lcom/facebook/push/mqtt/ci;

.field private j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/facebook/analytics/cn;

.field private l:Landroid/app/AlarmManager;

.field private m:Lcom/facebook/common/time/a;

.field private n:Lcom/facebook/push/mqtt/o;

.field private o:Lcom/facebook/push/mqtt/ar;

.field private p:Landroid/content/BroadcastReceiver;

.field private q:Z

.field private r:Lcom/facebook/push/mqtt/bu;

.field private s:J

.field private t:J

.field private u:Lcom/facebook/mqtt/t;

.field private v:J

.field private w:I

.field private final x:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/facebook/push/mqtt/MqttPushService;

    sput-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 316
    new-instance v0, Lcom/facebook/push/mqtt/bs;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/bs;-><init>(Lcom/facebook/push/mqtt/MqttPushService;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->x:Ljava/lang/Runnable;

    .line 482
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 309
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 310
    const-class v1, Lcom/facebook/push/mqtt/MqttPushService;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 311
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 312
    invoke-static {p0, v2, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 313
    return-object v0
.end method

.method private a(Landroid/content/Intent;)V
    .locals 6

    .prologue
    .line 229
    const-string v0, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->f:Lcom/facebook/common/hardware/k;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/k;->b()Z

    move-result v0

    .line 231
    sget-object v1, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v2, "Network Connectivity Changed. isConnected:%b"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->m:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->t:J

    .line 236
    if-eqz v0, :cond_0

    .line 237
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->g()V

    .line 243
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    const-string v0, "com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Config changed, reset connection."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 241
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->g()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/MqttPushService;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/MqttPushService;->a(Landroid/content/Intent;)V

    return-void
.end method

.method private a(Lcom/facebook/push/mqtt/bu;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 449
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    if-ne p1, v0, :cond_0

    .line 476
    :goto_0
    return-void

    .line 453
    :cond_0
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "MQTT state transition from %s to %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    aput-object v5, v2, v4

    const/4 v4, 0x1

    aput-object p1, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    iput-object p1, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    .line 458
    sget-object v0, Lcom/facebook/push/mqtt/bt;->a:[I

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/bu;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    move-object v0, v3

    move-object v2, v3

    .line 473
    :goto_1
    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->i:Lcom/facebook/push/mqtt/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/push/mqtt/ci;->a(Lcom/facebook/push/mqtt/cj;)V

    .line 475
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->k:Lcom/facebook/analytics/cn;

    const-string v1, "mqtt_connection"

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 460
    :pswitch_0
    const-string v2, "connecting"

    .line 461
    sget-object v0, Lcom/facebook/push/mqtt/cj;->CHANNEL_CONNECTING:Lcom/facebook/push/mqtt/cj;

    goto :goto_1

    .line 464
    :pswitch_1
    const-string v2, "connected"

    .line 465
    sget-object v0, Lcom/facebook/push/mqtt/cj;->CHANNEL_CONNECTED:Lcom/facebook/push/mqtt/cj;

    goto :goto_1

    .line 468
    :pswitch_2
    const-string v2, "disconnected"

    .line 469
    sget-object v0, Lcom/facebook/push/mqtt/cj;->CHANNEL_DISCONNECTED:Lcom/facebook/push/mqtt/cj;

    goto :goto_1

    .line 458
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/MqttPushService;)Z
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->j()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/bu;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    return-object v0
.end method

.method private e()V
    .locals 3

    .prologue
    .line 164
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Starting service..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 166
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->q:Z

    if-eqz v0, :cond_0

    .line 167
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Attempt to start service that is already started"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 168
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->g()V

    .line 197
    :goto_0
    return-void

    .line 172
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->q:Z

    .line 173
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->i:Lcom/facebook/push/mqtt/ci;

    sget-object v1, Lcom/facebook/push/mqtt/cj;->SERVICE_STARTED:Lcom/facebook/push/mqtt/cj;

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/ci;->a(Lcom/facebook/push/mqtt/cj;)V

    .line 176
    new-instance v0, Lcom/facebook/push/mqtt/bq;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/bq;-><init>(Lcom/facebook/push/mqtt/MqttPushService;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->p:Landroid/content/BroadcastReceiver;

    .line 182
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 183
    const-string v1, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 184
    const-string v1, "com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 185
    invoke-static {p0}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v1

    .line 186
    iget-object v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 188
    new-instance v0, Lcom/facebook/push/mqtt/br;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/br;-><init>(Lcom/facebook/push/mqtt/MqttPushService;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->h:Lcom/facebook/prefs/shared/f;

    .line 194
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->d:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->h:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 196
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->g()V

    goto :goto_0
.end method

.method private f()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 201
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->q:Z

    if-nez v0, :cond_0

    .line 202
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Attempt to stop connection not active."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 205
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->q:Z

    .line 206
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->i:Lcom/facebook/push/mqtt/ci;

    sget-object v1, Lcom/facebook/push/mqtt/cj;->SERVICE_STOPPED:Lcom/facebook/push/mqtt/cj;

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/ci;->a(Lcom/facebook/push/mqtt/cj;)V

    .line 209
    invoke-static {p0}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v0

    .line 210
    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->p:Landroid/content/BroadcastReceiver;

    if-eqz v1, :cond_1

    .line 211
    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;)V

    .line 212
    iput-object v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->p:Landroid/content/BroadcastReceiver;

    .line 215
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->h:Lcom/facebook/prefs/shared/f;

    if-eqz v0, :cond_2

    .line 216
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->d:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->h:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->b(Lcom/facebook/prefs/shared/f;)V

    .line 218
    iput-object v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->h:Lcom/facebook/prefs/shared/f;

    .line 221
    :cond_2
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->h()V

    .line 222
    return-void
.end method

.method private g()V
    .locals 5

    .prologue
    .line 246
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "In kickConnection"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 247
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 248
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Shouldn\'t be connected"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 249
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->h()V

    .line 277
    :cond_0
    :goto_0
    return-void

    .line 253
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->u:Lcom/facebook/mqtt/t;

    if-eq v0, v1, :cond_2

    .line 254
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Mqtt config changed -- disconnecting"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 255
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->h()V

    .line 258
    :cond_2
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/t;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->u:Lcom/facebook/mqtt/t;

    .line 259
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    sget-object v1, Lcom/facebook/push/mqtt/bu;->CONNECTED:Lcom/facebook/push/mqtt/bu;

    if-ne v0, v1, :cond_5

    .line 260
    iget-wide v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->t:J

    iget-wide v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->s:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 261
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Will reconnect because network changed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 275
    :cond_3
    sget-object v0, Lcom/facebook/push/mqtt/bu;->CONNECTING:Lcom/facebook/push/mqtt/bu;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/MqttPushService;->a(Lcom/facebook/push/mqtt/bu;)V

    .line 276
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->a()V

    goto :goto_0

    .line 263
    :cond_4
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Already connected"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 264
    iget-wide v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->v:J

    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    .line 265
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Endpoint capability changed."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 266
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->m()V

    goto :goto_0

    .line 270
    :cond_5
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    sget-object v1, Lcom/facebook/push/mqtt/bu;->CONNECTING:Lcom/facebook/push/mqtt/bu;

    if-ne v0, v1, :cond_3

    .line 271
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Already connecting"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private h()V
    .locals 1

    .prologue
    .line 283
    sget-object v0, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/MqttPushService;->a(Lcom/facebook/push/mqtt/bu;)V

    .line 284
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->b()V

    .line 285
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->l()V

    .line 286
    return-void
.end method

.method private i()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 289
    iget-boolean v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->q:Z

    if-nez v1, :cond_0

    .line 290
    sget-object v1, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v2, "Service not started"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 305
    :goto_0
    return v0

    .line 295
    :cond_0
    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->f:Lcom/facebook/common/hardware/k;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/k;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 296
    sget-object v1, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v2, "Not connected to network"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 300
    :cond_1
    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->g:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    .line 301
    sget-object v1, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v2, "Not logged in"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 305
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private j()Z
    .locals 2

    .prologue
    .line 329
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "trySendKeepAliveOrDisconnect"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 330
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->c()V

    .line 332
    const/4 v0, 0x1

    .line 335
    :goto_0
    return v0

    .line 334
    :cond_0
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->h()V

    .line 335
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private k()V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 357
    iget v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->w:I

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    .line 358
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/MqttPushService;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->n:Lcom/facebook/push/mqtt/o;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/push/mqtt/o;->a(J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 359
    sget-object v2, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v3, "Scheduling inexact repeating keepalive with %d seconds"

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lcom/facebook/push/mqtt/MqttPushService;->w:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    iget-object v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->n:Lcom/facebook/push/mqtt/o;

    iget-object v3, p0, Lcom/facebook/push/mqtt/MqttPushService;->x:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Lcom/facebook/push/mqtt/o;->a(Ljava/lang/Runnable;J)V

    .line 377
    :goto_0
    return-void

    .line 369
    :cond_0
    sget-object v2, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v3, "Scheduling exact repeating keepalive with %d seconds"

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lcom/facebook/push/mqtt/MqttPushService;->w:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    iget-object v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->l:Landroid/app/AlarmManager;

    iget-object v3, p0, Lcom/facebook/push/mqtt/MqttPushService;->m:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    add-long/2addr v0, v3

    const-string v3, "Orca.KEEP_ALIVE"

    invoke-direct {p0, v3}, Lcom/facebook/push/mqtt/MqttPushService;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v2, v6, v0, v1, v3}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    goto :goto_0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 383
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->n:Lcom/facebook/push/mqtt/o;

    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttPushService;->x:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/o;->a(Ljava/lang/Runnable;)Z

    .line 384
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->l:Landroid/app/AlarmManager;

    const-string v1, "Orca.KEEP_ALIVE"

    invoke-direct {p0, v1}, Lcom/facebook/push/mqtt/MqttPushService;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 385
    return-void
.end method

.method private m()V
    .locals 6

    .prologue
    .line 436
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    sget-object v1, Lcom/facebook/push/mqtt/bu;->CONNECTED:Lcom/facebook/push/mqtt/bu;

    if-ne v0, v1, :cond_0

    .line 437
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 438
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->v:J

    .line 439
    const-string v0, "endpoint_capabilities"

    iget-wide v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->v:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 440
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    const-string v2, "/send_endpoint_capabilities"

    sget-object v3, Lcom/facebook/mqtt/x;->FIRE_AND_FORGET:Lcom/facebook/mqtt/x;

    invoke-virtual {v0, v2, v1, v3}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I

    .line 443
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "updateEndpointCapability: capability = %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p0, Lcom/facebook/push/mqtt/MqttPushService;->v:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/bu;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    return-object v0
.end method

.method a(I)V
    .locals 5

    .prologue
    .line 344
    iput p1, p0, Lcom/facebook/push/mqtt/MqttPushService;->w:I

    .line 346
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Reset keepalive interval to %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->n:Lcom/facebook/push/mqtt/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->l:Landroid/app/AlarmManager;

    if-nez v0, :cond_1

    .line 353
    :cond_0
    :goto_0
    return-void

    .line 351
    :cond_1
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->l()V

    .line 352
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->k()V

    goto :goto_0
.end method

.method a(Ljava/lang/String;[B)V
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->i:Lcom/facebook/push/mqtt/ci;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/push/mqtt/ci;->a(Ljava/lang/String;[B)V

    .line 414
    return-void
.end method

.method b()V
    .locals 2

    .prologue
    .line 391
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Connection established"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 392
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->k()V

    .line 393
    sget-object v0, Lcom/facebook/push/mqtt/bu;->CONNECTED:Lcom/facebook/push/mqtt/bu;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/MqttPushService;->a(Lcom/facebook/push/mqtt/bu;)V

    .line 394
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->m:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->s:J

    .line 395
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->m()V

    .line 396
    return-void
.end method

.method b(I)V
    .locals 1

    .prologue
    .line 420
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/MqttPushService;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 429
    :goto_0
    return-void

    .line 426
    :cond_0
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->l()V

    .line 427
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->k()V

    goto :goto_0
.end method

.method c()V
    .locals 5

    .prologue
    .line 404
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Connection lost, Changing from %s to DISCONNECTED."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/push/mqtt/MqttPushService;->r:Lcom/facebook/push/mqtt/bu;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    sget-object v0, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/MqttPushService;->a(Lcom/facebook/push/mqtt/bu;)V

    .line 406
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->l()V

    .line 407
    return-void
.end method

.method d()Z
    .locals 2

    .prologue
    .line 479
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->o:Lcom/facebook/push/mqtt/ar;

    sget-object v1, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->b:Lcom/facebook/push/mqtt/bv;

    return-object v0
.end method

.method public onCreate()V
    .locals 3

    .prologue
    .line 91
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 93
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    const-string v1, "Creating service"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 94
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 96
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 98
    new-instance v0, Lcom/facebook/push/mqtt/bv;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/push/mqtt/bv;-><init>(Lcom/facebook/push/mqtt/MqttPushService;Lcom/facebook/push/mqtt/bq;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->b:Lcom/facebook/push/mqtt/bv;

    .line 99
    const-class v0, Lcom/facebook/push/mqtt/v;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/v;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    .line 100
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->d:Lcom/facebook/prefs/shared/d;

    .line 101
    const-class v0, Lcom/facebook/mqtt/t;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->e:Ljavax/inject/a;

    .line 102
    const-class v0, Lcom/facebook/common/hardware/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/k;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->f:Lcom/facebook/common/hardware/k;

    .line 103
    const-class v0, Lcom/facebook/auth/credentials/UserTokenCredentials;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->g:Ljavax/inject/a;

    .line 104
    const-class v0, Lcom/facebook/push/mqtt/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ci;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->i:Lcom/facebook/push/mqtt/ci;

    .line 105
    const-class v0, Ljava/lang/Long;

    const-class v2, Lcom/facebook/push/annotations/MqttEndpointCapability;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->j:Ljavax/inject/a;

    .line 106
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->m:Lcom/facebook/common/time/a;

    .line 107
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/t;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->u:Lcom/facebook/mqtt/t;

    .line 108
    const-class v0, Lcom/facebook/analytics/cn;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cn;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->k:Lcom/facebook/analytics/cn;

    .line 109
    invoke-virtual {v1}, Lcom/facebook/inject/t;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/app/AlarmManager;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->l:Landroid/app/AlarmManager;

    .line 110
    const-class v0, Lcom/facebook/push/mqtt/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/o;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->n:Lcom/facebook/push/mqtt/o;

    .line 111
    const-class v0, Lcom/facebook/push/mqtt/ar;

    const-class v2, Lcom/facebook/push/annotations/HighestMqttPersistence;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ar;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->o:Lcom/facebook/push/mqtt/ar;

    .line 112
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0, p0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/MqttPushService;)V

    .line 115
    const/16 v0, 0x12c

    iput v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->w:I

    .line 116
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 120
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Service destroyed (started="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/facebook/push/mqtt/MqttPushService;->q:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 123
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->q:Z

    if-eqz v0, :cond_0

    .line 124
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->f()V

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttPushService;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->b()V

    .line 127
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 3

    .prologue
    .line 131
    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    .line 132
    sget-object v0, Lcom/facebook/push/mqtt/MqttPushService;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Service started with intent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    if-nez p1, :cond_1

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 139
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 140
    const-string v1, "Orca.STOP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 141
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->f()V

    .line 142
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/MqttPushService;->stopSelf()V

    goto :goto_0

    .line 143
    :cond_2
    const-string v1, "Orca.START"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 144
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->e()V

    goto :goto_0

    .line 145
    :cond_3
    const-string v1, "Orca.KEEP_ALIVE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 146
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->k()V

    goto :goto_0

    .line 149
    :cond_4
    const-string v1, "Orca.PERSISTENT_KICK"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/MqttPushService;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    invoke-direct {p0}, Lcom/facebook/push/mqtt/MqttPushService;->g()V

    goto :goto_0
.end method
