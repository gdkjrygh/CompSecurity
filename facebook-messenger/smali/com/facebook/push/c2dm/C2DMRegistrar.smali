.class public Lcom/facebook/push/c2dm/C2DMRegistrar;
.super Ljava/lang/Object;
.source "C2DMRegistrar.java"


# static fields
.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field final a:Lcom/facebook/push/c2dm/v;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/analytics/av;

.field private final f:Z

.field private final g:Lcom/facebook/common/hardware/k;

.field private final h:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

.field private final i:Lcom/facebook/push/c2dm/y;

.field private final j:Landroid/app/AlarmManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    sput-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/av;ZLcom/facebook/common/hardware/k;Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;Lcom/facebook/push/c2dm/y;Landroid/app/AlarmManager;)V
    .locals 1

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    .line 107
    iput-object p2, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->d:Lcom/facebook/prefs/shared/d;

    .line 108
    iput-object p3, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->e:Lcom/facebook/analytics/av;

    .line 109
    iput-boolean p4, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->f:Z

    .line 110
    iput-object p5, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->g:Lcom/facebook/common/hardware/k;

    .line 111
    iput-object p6, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->h:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    .line 112
    iput-object p7, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    .line 113
    iput-object p8, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->j:Landroid/app/AlarmManager;

    .line 115
    new-instance v0, Lcom/facebook/push/c2dm/n;

    invoke-direct {v0, p0}, Lcom/facebook/push/c2dm/n;-><init>(Lcom/facebook/push/c2dm/C2DMRegistrar;)V

    iput-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->a:Lcom/facebook/push/c2dm/v;

    .line 122
    return-void
.end method

.method private a(J)V
    .locals 3

    .prologue
    const-wide/32 v0, 0x1b7740

    .line 329
    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    move-wide p1, v0

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 334
    sget-object v1, Lcom/facebook/push/c2dm/c;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 335
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 336
    return-void
.end method

.method static synthetic a(Lcom/facebook/push/c2dm/C2DMRegistrar;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->h()V

    return-void
.end method

.method private d()Lcom/facebook/push/c2dm/q;
    .locals 8

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    .line 179
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    sget-object v0, Lcom/facebook/push/c2dm/q;->NONE:Lcom/facebook/push/c2dm/q;

    .line 196
    :goto_0
    return-object v0

    .line 185
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 186
    iget-object v2, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/y;->l()J

    move-result-wide v2

    .line 187
    iget-object v4, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->d:Lcom/facebook/prefs/shared/d;

    sget-object v5, Lcom/facebook/push/c2dm/c;->g:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v6, 0x0

    invoke-interface {v4, v5, v6, v7}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v4

    .line 188
    sub-long v2, v0, v2

    const-wide/32 v6, 0x240c8400

    cmp-long v2, v2, v6

    if-lez v2, :cond_1

    sub-long/2addr v0, v4

    const-wide/32 v2, 0xa4cb800

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 190
    sget-object v0, Lcom/facebook/push/c2dm/q;->EXPIRED:Lcom/facebook/push/c2dm/q;

    goto :goto_0

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->g()Z

    move-result v0

    iget-boolean v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->f:Z

    if-eq v0, v1, :cond_2

    .line 194
    sget-object v0, Lcom/facebook/push/c2dm/q;->WRONG_TYPE:Lcom/facebook/push/c2dm/q;

    goto :goto_0

    .line 196
    :cond_2
    sget-object v0, Lcom/facebook/push/c2dm/q;->CURRENT:Lcom/facebook/push/c2dm/q;

    goto :goto_0
.end method

.method private e()V
    .locals 5

    .prologue
    .line 254
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xa4cb80

    add-long/2addr v0, v2

    .line 255
    iget-object v2, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->j:Landroid/app/AlarmManager;

    const/4 v3, 0x1

    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->g()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 256
    return-void
.end method

.method private f()V
    .locals 2

    .prologue
    .line 259
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->j:Landroid/app/AlarmManager;

    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->g()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 260
    return-void
.end method

.method private g()Landroid/app/PendingIntent;
    .locals 4

    .prologue
    .line 263
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/c2dm/C2DMRegistrar$LocalBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 264
    const-string v1, "com.facebook.orca.push.ACTION_ALARM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 265
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private h()V
    .locals 4

    .prologue
    .line 272
    const-string v0, "invalid_token"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Ljava/lang/String;)V

    .line 274
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 275
    iget-object v2, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/y;->l()J

    move-result-wide v2

    .line 276
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 281
    :goto_0
    return-void

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->h()V

    .line 280
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a()V

    goto :goto_0
.end method

.method private i()J
    .locals 4

    .prologue
    .line 325
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->f:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x7530

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 131
    const-string v0, "attempt"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Ljava/lang/String;)V

    .line 132
    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->e()V

    .line 134
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.c2dm.intent.REGISTER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 135
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-static {v1, v3, v2, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 136
    const-string v2, "app"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 137
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/y;->b()Lcom/facebook/push/c2dm/z;

    move-result-object v1

    .line 138
    sget-object v2, Lcom/facebook/push/c2dm/z;->GCM:Lcom/facebook/push/c2dm/z;

    if-ne v1, v2, :cond_0

    .line 139
    const-string v2, "sender"

    const-string v3, "15057814354"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    :goto_0
    iget-object v2, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/push/c2dm/c;->h:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/z;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 147
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0

    .line 148
    sget-object v1, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startService="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 150
    return-void

    .line 141
    :cond_0
    const-string v2, "sender"

    const-string v3, "facebook.android@gmail.com"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public a(Lcom/facebook/push/c2dm/q;)V
    .locals 2

    .prologue
    .line 339
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/facebook/push/a/b;->a(Lcom/facebook/push/c2dm/q;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 342
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->e:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 343
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 350
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->c()Ljava/util/Map;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/facebook/push/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 355
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->e:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 356
    return-void
.end method

.method a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 207
    if-eqz p3, :cond_0

    .line 209
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->h()V

    .line 210
    const-string v0, "success"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->b(Ljava/lang/String;)V

    .line 249
    :goto_0
    return-void

    .line 215
    :cond_0
    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->f()V

    .line 217
    if-eqz p2, :cond_2

    .line 219
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->h()V

    .line 221
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registration error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 222
    const-string v0, "SERVICE_NOT_AVAILABLE"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->i()J

    move-result-wide v1

    .line 225
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Scheduling registration retry, backoff = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 226
    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.google.android.c2dm.intent.RETRY"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 227
    iget-object v3, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    invoke-static {v3, v5, v0, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 230
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    const-string v4, "alarm"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 231
    const/4 v4, 0x3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    add-long/2addr v5, v1

    invoke-virtual {v0, v4, v5, v6, v3}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 236
    const-wide/16 v3, 0x2

    mul-long v0, v3, v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(J)V

    .line 239
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 244
    :cond_2
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v1}, Lcom/facebook/push/c2dm/y;->c()Lcom/facebook/push/c2dm/z;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/push/c2dm/y;->a(Ljava/lang/String;Lcom/facebook/push/c2dm/z;)V

    .line 246
    const-string v0, "success"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Ljava/lang/String;)V

    .line 247
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->h:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->a:Lcom/facebook/push/c2dm/v;

    invoke-virtual {v0, v1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/v;)V

    goto/16 :goto_0
.end method

.method public a(Z)V
    .locals 4

    .prologue
    .line 284
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checking push registration status, forceFacebookServerRegistration="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 286
    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->d()Lcom/facebook/push/c2dm/q;

    move-result-object v0

    .line 287
    sget-object v1, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registrationStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/q;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 289
    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a(Lcom/facebook/push/c2dm/q;)V

    .line 291
    sget-object v1, Lcom/facebook/push/c2dm/o;->a:[I

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/q;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 322
    :goto_0
    return-void

    .line 293
    :pswitch_0
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    const-string v1, "GCM/C2DM registration is current, checking facebook server registration"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 294
    if-eqz p1, :cond_0

    .line 295
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->h:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->a:Lcom/facebook/push/c2dm/v;

    invoke-virtual {v0, v1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/v;)V

    goto :goto_0

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->h:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->a:Lcom/facebook/push/c2dm/v;

    invoke-virtual {v0, v1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->b(Lcom/facebook/push/c2dm/v;)V

    goto :goto_0

    .line 303
    :pswitch_1
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    const-string v1, "GCM/C2DM preference inconsistency. Reregistering with google server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 304
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->b()V

    .line 305
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a()V

    goto :goto_0

    .line 308
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->g:Lcom/facebook/common/hardware/k;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/k;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 309
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    const-string v1, "Regid has expired and network is connected  -- trying to register with google server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 311
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a()V

    goto :goto_0

    .line 313
    :cond_1
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    const-string v1, "Regid has expired but network is not connected  -- skipping registration with google server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 318
    :pswitch_3
    sget-object v0, Lcom/facebook/push/c2dm/C2DMRegistrar;->b:Ljava/lang/Class;

    const-string v1, "Has no regid -- trying to register with google server"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 319
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->a()V

    goto :goto_0

    .line 291
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public b()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 158
    const-string v0, "attempt"

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->b(Ljava/lang/String;)V

    .line 160
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.c2dm.intent.UNREGISTER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 161
    const-string v1, "app"

    iget-object v2, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    invoke-static {v2, v4, v3, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 163
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 165
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->h:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a()V

    .line 167
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->h()V

    .line 169
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 363
    iget-object v0, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/facebook/push/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 367
    iget-object v1, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->e:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 368
    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 4
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
    .line 371
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 372
    const-string v1, "backoff"

    invoke-direct {p0}, Lcom/facebook/push/c2dm/C2DMRegistrar;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    const-string v1, "service_type"

    iget-object v2, p0, Lcom/facebook/push/c2dm/C2DMRegistrar;->i:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/y;->b()Lcom/facebook/push/c2dm/z;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/push/c2dm/z;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    return-object v0
.end method
