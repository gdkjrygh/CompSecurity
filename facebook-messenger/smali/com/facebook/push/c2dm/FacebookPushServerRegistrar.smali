.class public Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;
.super Ljava/lang/Object;
.source "FacebookPushServerRegistrar.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/fbservice/ops/k;

.field private final d:Lcom/facebook/http/protocol/aq;

.field private final e:Lcom/facebook/push/c2dm/ae;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/device_id/l;

.field private final h:Lcom/facebook/common/hardware/k;

.field private final i:Lcom/facebook/push/c2dm/y;

.field private final j:Lcom/facebook/analytics/av;

.field private final k:Landroid/app/AlarmManager;

.field private final l:Lcom/facebook/common/l/h;

.field private final m:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    const-class v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    sput-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/fbservice/ops/k;Lcom/facebook/http/protocol/aq;Lcom/facebook/push/c2dm/ae;Ljavax/inject/a;Lcom/facebook/device_id/l;Lcom/facebook/common/hardware/k;Lcom/facebook/push/c2dm/y;Lcom/facebook/analytics/av;Landroid/app/AlarmManager;Lcom/facebook/common/l/h;Lcom/facebook/common/e/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/http/protocol/aq;",
            "Lcom/facebook/push/c2dm/ae;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/device_id/l;",
            "Lcom/facebook/common/hardware/k;",
            "Lcom/facebook/push/c2dm/y;",
            "Lcom/facebook/analytics/av;",
            "Landroid/app/AlarmManager;",
            "Lcom/facebook/common/l/h;",
            "Lcom/facebook/common/e/h;",
            ")V"
        }
    .end annotation

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b:Landroid/content/Context;

    .line 82
    iput-object p2, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->c:Lcom/facebook/fbservice/ops/k;

    .line 83
    iput-object p3, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->d:Lcom/facebook/http/protocol/aq;

    .line 84
    iput-object p4, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->e:Lcom/facebook/push/c2dm/ae;

    .line 85
    iput-object p5, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->f:Ljavax/inject/a;

    .line 86
    iput-object p6, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->g:Lcom/facebook/device_id/l;

    .line 87
    iput-object p7, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->h:Lcom/facebook/common/hardware/k;

    .line 88
    iput-object p8, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    .line 89
    iput-object p9, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->j:Lcom/facebook/analytics/av;

    .line 90
    iput-object p10, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->k:Landroid/app/AlarmManager;

    .line 91
    iput-object p11, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->l:Lcom/facebook/common/l/h;

    .line 92
    iput-object p12, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->m:Lcom/facebook/common/e/h;

    .line 93
    return-void
.end method

.method static synthetic a(Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->d()V

    return-void
.end method

.method private c()V
    .locals 5

    .prologue
    .line 210
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xa4cb80

    add-long/2addr v0, v2

    .line 211
    iget-object v2, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->k:Landroid/app/AlarmManager;

    const/4 v3, 0x1

    invoke-direct {p0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->e()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 212
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->k:Landroid/app/AlarmManager;

    invoke-direct {p0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->e()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 216
    return-void
.end method

.method private e()Landroid/app/PendingIntent;
    .locals 4

    .prologue
    .line 219
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar$LocalBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 220
    const-string v1, "com.facebook.orca.push.ACTION_ALARM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 221
    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b:Landroid/content/Context;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private f()Lcom/facebook/push/c2dm/x;
    .locals 4

    .prologue
    .line 261
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->k()Z

    move-result v0

    .line 262
    if-nez v0, :cond_0

    .line 263
    sget-object v0, Lcom/facebook/push/c2dm/x;->NONE:Lcom/facebook/push/c2dm/x;

    .line 277
    :goto_0
    return-object v0

    .line 265
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->i()Ljava/lang/String;

    move-result-object v0

    .line 266
    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->f:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 267
    sget-object v0, Lcom/facebook/push/c2dm/x;->WRONG_USER:Lcom/facebook/push/c2dm/x;

    goto :goto_0

    .line 269
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->o()J

    move-result-wide v0

    .line 271
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 272
    sget-object v0, Lcom/facebook/push/c2dm/x;->EXPIRED:Lcom/facebook/push/c2dm/x;

    goto :goto_0

    .line 274
    :cond_2
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 275
    sget-object v0, Lcom/facebook/push/c2dm/x;->EXPIRED:Lcom/facebook/push/c2dm/x;

    goto :goto_0

    .line 277
    :cond_3
    sget-object v0, Lcom/facebook/push/c2dm/x;->CURRENT:Lcom/facebook/push/c2dm/x;

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 205
    :goto_0
    return-void

    .line 193
    :cond_0
    const-string v0, "attempt"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->n()V

    .line 198
    :try_start_0
    new-instance v0, Lcom/facebook/push/c2dm/UnregisterPushTokenParams;

    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/push/c2dm/UnregisterPushTokenParams;-><init>(Ljava/lang/String;)V

    .line 200
    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->d:Lcom/facebook/http/protocol/aq;

    iget-object v2, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->e:Lcom/facebook/push/c2dm/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    const-string v0, "success"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 202
    :catch_0
    move-exception v0

    .line 203
    const-string v0, "failed"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method a(Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/push/c2dm/v;)V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 168
    invoke-direct {p0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->d()V

    .line 169
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/RegisterPushTokenResult;

    .line 171
    invoke-virtual {v0}, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 173
    const-string v0, "server_failed"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    .line 186
    :goto_0
    return-void

    .line 175
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/push/c2dm/RegisterPushTokenResult;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    invoke-interface {p2}, Lcom/facebook/push/c2dm/v;->a()V

    .line 179
    const-string v0, "invalid_token"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->m()V

    .line 185
    const-string v0, "success"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/push/c2dm/v;)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 103
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 104
    if-nez v4, :cond_0

    .line 105
    sget-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    const-string v1, "no user, cancel push token registration"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 106
    const-string v0, "auth_no_user"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    .line 164
    :goto_0
    return-void

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    sget-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    const-string v1, "registration id is empty, should not register with facebook"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 112
    const-string v0, "no_token"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->m:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Trying to register token when registration id is empty"

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 119
    :cond_1
    const-string v0, "true"

    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->l:Lcom/facebook/common/l/h;

    const-string v2, "com.facebook.vi"

    invoke-virtual {v1, v2}, Lcom/facebook/common/l/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 120
    const/4 v6, 0x2

    .line 123
    :goto_1
    new-instance v0, Lcom/facebook/push/c2dm/RegisterPushTokenParams;

    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/y;->f()Lcom/facebook/push/c2dm/z;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->g:Lcom/facebook/device_id/l;

    invoke-virtual {v3}, Lcom/facebook/device_id/l;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v7, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v7}, Lcom/facebook/push/c2dm/y;->k()Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v7}, Lcom/facebook/push/c2dm/y;->i()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    const/4 v4, 0x1

    :goto_2
    iget-object v5, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v5}, Lcom/facebook/push/c2dm/y;->e()I

    move-result v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/push/c2dm/RegisterPushTokenParams;-><init>(Lcom/facebook/push/c2dm/z;Ljava/lang/String;Ljava/lang/String;ZII)V

    .line 132
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 133
    const-string v2, "registerPushTokenParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 134
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/push/c2dm/r;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 138
    new-instance v1, Lcom/facebook/push/c2dm/t;

    invoke-direct {v1, p0, p1}, Lcom/facebook/push/c2dm/t;-><init>(Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;Lcom/facebook/push/c2dm/v;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 161
    invoke-direct {p0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->c()V

    .line 163
    const-string v0, "attempt"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    move v4, v5

    .line 123
    goto :goto_2

    :cond_4
    move v6, v5

    goto :goto_1
.end method

.method public a(Lcom/facebook/push/c2dm/x;)V
    .locals 2

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/facebook/push/a/f;->a(Lcom/facebook/push/c2dm/x;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 285
    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->j:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 286
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 289
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b()Ljava/util/Map;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/facebook/push/a/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 293
    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->j:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 294
    return-void
.end method

.method public b()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 305
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 306
    const-string v1, "service_type"

    iget-object v2, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/y;->b()Lcom/facebook/push/c2dm/z;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/z;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    return-object v0
.end method

.method public b(Lcom/facebook/push/c2dm/v;)V
    .locals 4

    .prologue
    .line 227
    invoke-direct {p0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->f()Lcom/facebook/push/c2dm/x;

    move-result-object v0

    .line 229
    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/x;)V

    .line 231
    sget-object v1, Lcom/facebook/push/c2dm/u;->a:[I

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/x;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 255
    sget-object v1, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unexpected facebook registration status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 258
    :goto_0
    return-void

    .line 233
    :pswitch_0
    sget-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    const-string v1, "facebook registration is up to date"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 236
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->h:Lcom/facebook/common/hardware/k;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/k;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    sget-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    const-string v1, "facebook registration has expired and network is connected -- trying to register"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 239
    invoke-virtual {p0, p1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/v;)V

    goto :goto_0

    .line 241
    :cond_0
    sget-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    const-string v1, "facebook registration has expired but network is not connected -- skipping registration"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 246
    :pswitch_2
    sget-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    const-string v1, "push token registered with different user. claiming token with facebook"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 247
    const-string v0, "wrong_user"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    .line 248
    invoke-virtual {p0, p1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/v;)V

    goto :goto_0

    .line 251
    :pswitch_3
    sget-object v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a:Ljava/lang/Class;

    const-string v1, "Not registered with facebook server. registering"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 252
    invoke-virtual {p0, p1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/v;)V

    goto :goto_0

    .line 231
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/facebook/push/a/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 301
    iget-object v1, p0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->j:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 302
    return-void
.end method
